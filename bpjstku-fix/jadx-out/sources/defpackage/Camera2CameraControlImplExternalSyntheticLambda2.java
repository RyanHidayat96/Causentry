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
import com.bpjstku.databinding.FragmentChooseKpjBottomSheetBinding;
import com.bpjstku.domain.jht.model.Kpj;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.ChoosePuKpjBottomSheetFragment$chooseKpjAdapter$2$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.ChoosePuKpjBottomSheetFragment$handleItemClicked$1;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.mapPoint;
import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\tJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0015\u0010\u0019\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\b\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0016\u0010\f\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010\""}, d2 = {"LCamera2CameraControlImplExternalSyntheticLambda2;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/jht/model/Kpj;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asBinder", "Lcom/bpjstku/domain/jht/model/Kpj;", "TuitionPaymentFragmentbindingInflater1", "LisZslDisabledByByUserCaseConfig;", "", "I", "()I", "Lcom/bpjstku/databinding/FragmentChooseKpjBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChooseKpjBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraControlImplExternalSyntheticLambda2 extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private FragmentChooseKpjBottomSheetBinding d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private Kpj TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<Kpj, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    public /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda2(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2CameraControlImplExternalSyntheticLambda2(Function1<? super Kpj, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        final Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.ChoosePuKpjBottomSheetFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = camera2CameraControlImplExternalSyntheticLambda2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0() { // from class: Camera2CameraControlImplExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Camera2CameraControlImplExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.fragment_choose_kpj_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentbindingInflater1 = arguments != null ? (Kpj) arguments.getParcelable("key_kpj_klaim") : null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBinding = this.d;
        if (fragmentChooseKpjBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseKpjBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentChooseKpjBottomSheetBinding.rvChooseKpj;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((isZslDisabledByByUserCaseConfig) this.b.getValue());
        Kpj kpj = this.TuitionPaymentFragmentbindingInflater1;
        if (kpj != null) {
            Iterable iterable = ((isZslDisabledByByUserCaseConfig) this.b.getValue()).d;
            Intrinsics.checkNotNullExpressionValue(iterable, "");
            int i = 0;
            for (Object obj : iterable) {
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Kpj kpj2 = (Kpj) obj;
                kpj2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Intrinsics.areEqual(kpj.TuitionPaymentFragmentspecialinlinedviewModeldefault3, kpj2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ((isZslDisabledByByUserCaseConfig) this.b.getValue()).d.set(i, (Data) kpj2);
                FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBinding2 = this.d;
                if (fragmentChooseKpjBottomSheetBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentChooseKpjBottomSheetBinding2 = null;
                }
                fragmentChooseKpjBottomSheetBinding2.rvChooseKpj.scrollToPosition(i);
                i++;
            }
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBindingInflate = FragmentChooseKpjBottomSheetBinding.inflate(p0, p1, false);
        this.d = fragmentChooseKpjBottomSheetBindingInflate;
        if (fragmentChooseKpjBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseKpjBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentChooseKpjBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static /* synthetic */ isZslDisabledByByUserCaseConfig TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2) {
        ArrayList arrayListEmptyList;
        List<SubscribedProgram> list;
        Kpj kpj;
        ChoosePuKpjBottomSheetFragment$chooseKpjAdapter$2$1 choosePuKpjBottomSheetFragment$chooseKpjAdapter$2$1 = new ChoosePuKpjBottomSheetFragment$chooseKpjAdapter$2$1(camera2CameraControlImplExternalSyntheticLambda2);
        Context contextRequireContext = camera2CameraControlImplExternalSyntheticLambda2.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) camera2CameraControlImplExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder == null || (list = userAsBinder.INotificationSideChannel) == null) {
            arrayListEmptyList = null;
        } else {
            List<SubscribedProgram> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (SubscribedProgram subscribedProgram : list2) {
                if (!Intrinsics.areEqual(subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "PU")) {
                    kpj = new Kpj("", "", false, "", "");
                } else {
                    String str = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String str2 = str == null ? "" : str;
                    String str3 = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    String str4 = str3 == null ? "" : str3;
                    String str5 = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = subscribedProgram.g;
                    kpj = new Kpj(str2, str4, false, str6, str7 == null ? "" : str7);
                }
                arrayList.add(kpj);
            }
            arrayListEmptyList = arrayList;
        }
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        return new isZslDisabledByByUserCaseConfig(contextRequireContext, arrayListEmptyList, choosePuKpjBottomSheetFragment$chooseKpjAdapter$2$1);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2, Kpj kpj) {
        camera2CameraControlImplExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1 = kpj;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ChoosePuKpjBottomSheetFragment$handleItemClicked$1(camera2CameraControlImplExternalSyntheticLambda2, kpj, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Camera2CameraControlImplExternalSyntheticLambda2() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
