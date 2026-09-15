package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.data.user.model.response.FiturList;
import com.bpjstku.databinding.FragmentOtherBottomSheetBinding;
import com.bpjstku.domain.jht.model.ClaimSegmenItem;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimChooseMembershipActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity;
import com.bpjstku.util.enums.BpjsServiceEnum;
import com.google.gson.Gson;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u001d\b\u0016\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0002\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u0003R\u0016\u0010\u001b\u001a\u00020\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0015\u0010\u001d\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b#\u0010$R\u0015\u0010\u0014\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0015\u0010%\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0015\u0010#\u001a\u00020&8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0015\u0010\u0017\u001a\u00020'8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010$R\u0015\u0010 \u001a\u00020)8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020*0\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b,\u0010$R\u0018\u0010/\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u0010(\u001a\u0002018UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u00102"}, d2 = {"LActionBarContainer;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Lkotlin/Function1;", "Lr8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4;", "", "p0", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/bpjstku/domain/user/model/User;", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/domain/user/model/User;Ljava/lang/String;)Z", "", "asBinder", "()Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lcom/bpjstku/databinding/FragmentOtherBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentOtherBottomSheetBinding;", "a", "Lkotlin/jvm/functions/Function1;", "LsetActionBarHideOffset;", "asInterface", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "LgetStreamUseCaseSupportedCombinationList;", "notify", "LCamera2CameraControlImplExternalSyntheticLambda4;", "Lcom/bpjstku/domain/jht/model/ClaimSegmenItem;", "Ljava/util/List;", "cancel", "INotificationSideChannel", "Ljava/lang/String;", "onTransact", "cancelAll", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActionBarContainer extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private String onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private FragmentOtherBottomSheetBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Function1<? super r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private List<ClaimSegmenItem> g;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private String cancelAll;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return R.layout.fragment_other_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    public ActionBarContainer() {
        this.b = LazyKt.lazy(new Function0() { // from class: setTabContainer
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActionBarContainer.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: setSplitBackground
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActionBarContainer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: setTransitioning
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActionBarContainer.TuitionPaymentFragmentbindingInflater1(this.b);
            }
        });
        final ActionBarContainer actionBarContainer = this;
        this.asInterface = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.main.home.OtherBottomSheetFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = actionBarContainer;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asBinder = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.main.home.OtherBottomSheetFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getStreamUseCaseSupportedCombinationList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getStreamUseCaseSupportedCombinationList invoke() {
                ComponentCallbacks componentCallbacks = actionBarContainer;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final ActionBarContainer actionBarContainer2 = this;
        this.a = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.main.home.OtherBottomSheetFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = actionBarContainer2;
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
        this.g = CollectionsKt.emptyList();
        this.d = LazyKt.lazy(new Function0() { // from class: invalidateOutline
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionBarContainer(Function1<? super r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4, Unit> function1) {
        this();
        Intrinsics.checkNotNullParameter(function1, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    /* JADX INFO: renamed from: ActionBarContainer$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LActionBarContainer$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lkotlin/Function1;", "Lr8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4;", "", "p0", "", "p1", "p2", "LActionBarContainer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;)LActionBarContainer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static ActionBarContainer TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1<? super r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4, Unit> p0, String p1, String p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            ActionBarContainer actionBarContainer = new ActionBarContainer(p0);
            Bundle bundle = new Bundle();
            bundle.putString("status_pengkinian", p1);
            bundle.putString("status_streaming", p2);
            actionBarContainer.setArguments(bundle);
            return actionBarContainer;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentOtherBottomSheetBinding fragmentOtherBottomSheetBindingInflate = FragmentOtherBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fragmentOtherBottomSheetBindingInflate;
        if (fragmentOtherBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentOtherBottomSheetBindingInflate = null;
        }
        RelativeLayout root = fragmentOtherBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    private final List<r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4> asBinder() throws Throwable {
        ArrayList arrayListEmptyList;
        List<SubscribedProgram> list;
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        boolean zBooleanValue = ((Boolean) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], 14833137, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -14833136)).booleanValue();
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        boolean zBooleanValue2 = ((Boolean) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], -1089637936, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1089637938)).booleanValue();
        boolean zAsInterface = getMaxImages.INSTANCE.asInterface();
        getMaxImages getmaximages3 = getMaxImages.INSTANCE;
        boolean zOnConnected = getMaxImages.onConnected();
        User user = (User) this.d.getValue();
        FragmentOtherBottomSheetBinding fragmentOtherBottomSheetBinding = null;
        if (user == null || (list = user.INotificationSideChannel) == null) {
            arrayListEmptyList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((SubscribedProgram) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1, "PMI")) {
                    arrayList.add(obj);
                }
            }
            arrayListEmptyList = arrayList;
        }
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        getMaxImages getmaximages4 = getMaxImages.INSTANCE;
        boolean zA = getMaxImages.a();
        ArrayList arrayList2 = new ArrayList();
        if (zAsInterface) {
            String type = BpjsServiceEnum.TOPUP.getType();
            String string = getString(R.string.label_topup);
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList2.add(new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type, string, R.drawable.ic_topup_tagihan));
        }
        if (zBooleanValue2) {
            String type2 = BpjsServiceEnum.ADDITIONAL_SERVICES.getType();
            String string2 = getString(R.string.label_additional_services);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arrayList2.add(new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type2, string2, R.drawable.ic_mlt_jmo));
        }
        if (zBooleanValue) {
            String type3 = BpjsServiceEnum.DANASIAGA.getType();
            String string3 = getString(R.string.menu_danasiaga);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            arrayList2.add(new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type3, string3, R.drawable.ic_dana_siaga));
        }
        if (zOnConnected) {
            String type4 = BpjsServiceEnum.INVESTASI.getType();
            String string4 = getString(R.string.menu_investasi);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            arrayList2.add(new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type4, string4, R.drawable.ic_investasi));
        }
        if (!arrayListEmptyList.isEmpty() && zA) {
            String type5 = BpjsServiceEnum.OPEN_BANKING.getType();
            String string5 = getString(R.string.menu_open_banking);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            arrayList2.add(new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type5, string5, R.drawable.ic_bukarekeningbank));
        }
        FragmentOtherBottomSheetBinding fragmentOtherBottomSheetBinding2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentOtherBottomSheetBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentOtherBottomSheetBinding = fragmentOtherBottomSheetBinding2;
        }
        fragmentOtherBottomSheetBinding.tvOtherFinance.setVisibility(arrayList2.isEmpty() ? 8 : 0);
        return arrayList2;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.onTransact = arguments != null ? arguments.getString("status_pengkinian") : null;
        Bundle arguments2 = getArguments();
        this.cancelAll = arguments2 != null ? arguments2.getString("status_streaming") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentOtherBottomSheetBinding fragmentOtherBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentOtherBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentOtherBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentOtherBottomSheetBinding.rvServices;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 4));
        recyclerView.addItemDecoration(new refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        recyclerView.setAdapter((setActionBarHideOffset) this.b.getValue());
        RecyclerView recyclerView2 = fragmentOtherBottomSheetBinding.rvEntertainment;
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setLayoutManager(new GridLayoutManager(requireContext(), 4));
        recyclerView2.addItemDecoration(new refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        recyclerView2.setAdapter((setActionBarHideOffset) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        RecyclerView recyclerView3 = fragmentOtherBottomSheetBinding.rvFinance;
        recyclerView3.setNestedScrollingEnabled(false);
        recyclerView3.setLayoutManager(new GridLayoutManager(requireContext(), 4));
        recyclerView3.addItemDecoration(new refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        recyclerView3.setAdapter((setActionBarHideOffset) this.TuitionPaymentFragmentbindingInflater1.getValue());
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        TuitionPaymentFragmentbindingInflater1();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActionBarContainer actionBarContainer, VirtualCameraAdapter1 virtualCameraAdapter1) {
        BaseActivity baseActivity;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentActivity activity = actionBarContainer.getActivity();
            baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
            if (baseActivity != null) {
                baseActivity.MediaBrowserCompat();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentActivity activity2 = actionBarContainer.getActivity();
            BaseActivity baseActivity2 = activity2 instanceof BaseActivity ? (BaseActivity) activity2 : null;
            if (baseActivity2 != null) {
                baseActivity2.IconCompatParcelizer();
            }
            String str = ((ComponentActivityExternalSyntheticLambda10) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str.length() == 0) {
                FragmentActivity activity3 = actionBarContainer.getActivity();
                BaseActivity baseActivity3 = activity3 instanceof BaseActivity ? (BaseActivity) activity3 : null;
                if (baseActivity3 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity3, "Kode pengajuan tidak ditemukan", null);
                }
            } else {
                List<ClaimSegmenItem> list = actionBarContainer.g;
                if (list.isEmpty()) {
                    FragmentActivity activity4 = actionBarContainer.getActivity();
                    BaseActivity baseActivity4 = activity4 instanceof BaseActivity ? (BaseActivity) activity4 : null;
                    if (baseActivity4 != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity4, "Data Segmen ".concat(String.valueOf(list.size())), null);
                    }
                } else if (list.size() == 1) {
                    ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1;
                    Context contextRequireContext = actionBarContainer.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, list.get(0).b, str);
                } else {
                    ClaimChooseMembershipActivity.Companion companion = ClaimChooseMembershipActivity.INSTANCE;
                    Context contextRequireContext2 = actionBarContainer.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    ClaimChooseMembershipActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext2, list, str);
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentActivity activity5 = actionBarContainer.getActivity();
            BaseActivity baseActivity5 = activity5 instanceof BaseActivity ? (BaseActivity) activity5 : null;
            if (baseActivity5 != null) {
                baseActivity5.IconCompatParcelizer();
            }
            FragmentActivity activity6 = actionBarContainer.getActivity();
            BaseActivity baseActivity6 = activity6 instanceof BaseActivity ? (BaseActivity) activity6 : null;
            if (baseActivity6 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(baseActivity6, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        } else {
            FragmentActivity activity7 = actionBarContainer.getActivity();
            baseActivity = activity7 instanceof BaseActivity ? (BaseActivity) activity7 : null;
            if (baseActivity != null) {
                baseActivity.IconCompatParcelizer();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ActionBarContainer actionBarContainer, r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        if (Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.CLAIM_OLD_DAY_SECURITY.getType())) {
            ((Camera2CameraControlImplExternalSyntheticLambda4) actionBarContainer.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } else {
            Function1<? super r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4, Unit> function1 = actionBarContainer.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                function1.invoke(r8lambdai2xi7mochmmaz9qzzewheaxs4);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.JP_PERIODICALLY.getType());
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.SCHOLARSHIP.getType());
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.JP_PERIODICALLY.getType());
    }

    public static /* synthetic */ setActionBarHideOffset b(final ActionBarContainer actionBarContainer) {
        String str;
        Context contextRequireContext = actionBarContainer.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        boolean zOnConnectionFailed = getMaxImages.onConnectionFailed();
        User user = (User) actionBarContainer.d.getValue();
        boolean zAreEqual = Intrinsics.areEqual(String.valueOf(user != null ? user.RemoteActionCompatParcelizer : null), "Y");
        User user2 = (User) actionBarContainer.d.getValue();
        boolean zAreEqual2 = Intrinsics.areEqual(String.valueOf(user2 != null ? user2.INotificationSideChannelStubProxy : null), "Y");
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2((User) actionBarContainer.d.getValue(), "F001");
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2((User) actionBarContainer.d.getValue(), "F002");
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        AntreanMenuConfig antreanMenuConfig = (AntreanMenuConfig) new Gson().fromJson(getMaxImages.b(), AntreanMenuConfig.class);
        getMaxImages getmaximages3 = getMaxImages.INSTANCE;
        boolean zOnConnectionSuspended = getMaxImages.onConnectionSuspended();
        String type = BpjsServiceEnum.PROGRAM_INFO.getType();
        String string = actionBarContainer.getString(R.string.label_program_info);
        Intrinsics.checkNotNullExpressionValue(string, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type, string, R.drawable.ic_program_info);
        String type2 = BpjsServiceEnum.TUITION.getType();
        String string2 = actionBarContainer.getString(R.string.label_payment_autodebit);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs5 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type2, string2, R.drawable.ic_tuition);
        String type3 = BpjsServiceEnum.REGISTRATION.getType();
        String string3 = actionBarContainer.getString(R.string.label_registration_nonsalaried_worker_dashboard_menu);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs6 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type3, string3, R.drawable.ic_informal_participant);
        String type4 = BpjsServiceEnum.HEREGISTRATION.getType();
        String string4 = actionBarContainer.getString(R.string.label_asik_program);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs7 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type4, string4, R.drawable.ic_pengkinian);
        String type5 = BpjsServiceEnum.BALANCE_CHECK.getType();
        String string5 = actionBarContainer.getString(R.string.label_please_check_your_balance_menu);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs8 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type5, string5, R.drawable.ic_cek_saldo);
        String type6 = BpjsServiceEnum.JP_PERIODICALLY.getType();
        String string6 = actionBarContainer.getString(R.string.label_jp_periodically);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs9 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type6, string6, R.drawable.ic_vocation);
        String type7 = BpjsServiceEnum.SCHOLARSHIP.getType();
        String string7 = actionBarContainer.getString(R.string.label_scholarship);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs10 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type7, string7, R.drawable.ic_scholarship);
        String type8 = BpjsServiceEnum.CLAIM_OLD_DAY_SECURITY.getType();
        String string8 = actionBarContainer.getString(R.string.label_jht_claim_request);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs11 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type8, string8, R.drawable.ic_klaim_jht);
        String type9 = BpjsServiceEnum.BRANCH_OFFICE.getType();
        String string9 = actionBarContainer.getString(R.string.label_branch_office);
        Intrinsics.checkNotNullExpressionValue(string9, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs12 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type9, string9, R.drawable.ic_branch_office);
        String type10 = BpjsServiceEnum.PARTNER.getType();
        String string10 = actionBarContainer.getString(R.string.label_partner);
        Intrinsics.checkNotNullExpressionValue(string10, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs13 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type10, string10, R.drawable.ic_partner);
        String type11 = BpjsServiceEnum.COMPLAINT.getType();
        String string11 = actionBarContainer.getString(R.string.label_complaint);
        Intrinsics.checkNotNullExpressionValue(string11, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs14 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type11, string11, R.drawable.ic_complaint);
        String type12 = BpjsServiceEnum.SUPPORT.getType();
        String string12 = actionBarContainer.getString(R.string.menu_help);
        Intrinsics.checkNotNullExpressionValue(string12, "");
        List listMutableListOf = CollectionsKt.mutableListOf(r8lambdai2xi7mochmmaz9qzzewheaxs4, r8lambdai2xi7mochmmaz9qzzewheaxs5, r8lambdai2xi7mochmmaz9qzzewheaxs6, r8lambdai2xi7mochmmaz9qzzewheaxs7, r8lambdai2xi7mochmmaz9qzzewheaxs8, r8lambdai2xi7mochmmaz9qzzewheaxs9, r8lambdai2xi7mochmmaz9qzzewheaxs10, r8lambdai2xi7mochmmaz9qzzewheaxs11, r8lambdai2xi7mochmmaz9qzzewheaxs12, r8lambdai2xi7mochmmaz9qzzewheaxs13, r8lambdai2xi7mochmmaz9qzzewheaxs14, new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type12, string12, R.drawable.ic_support));
        if (antreanMenuConfig.getHideMenu()) {
            str = "";
        } else {
            String type13 = BpjsServiceEnum.QUEUEING.getType();
            String string13 = actionBarContainer.getString(R.string.label_queueing_menu);
            str = "";
            Intrinsics.checkNotNullExpressionValue(string13, str);
            listMutableListOf.add(8, new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type13, string13, R.drawable.ic_antrian_online));
        }
        if (zOnConnectionSuspended) {
            String type14 = BpjsServiceEnum.IJC.getType();
            String string14 = actionBarContainer.getString(R.string.menu_ijc);
            Intrinsics.checkNotNullExpressionValue(string14, str);
            listMutableListOf.add(7, new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type14, string14, R.drawable.ic_difable));
        }
        if (!zAreEqual || !zAreEqual2 || !zOnConnectionFailed || !zTuitionPaymentFragmentspecialinlinedviewModeldefault2 || !zTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (zAreEqual && zAreEqual2 && zOnConnectionFailed && !zTuitionPaymentFragmentspecialinlinedviewModeldefault2 && zTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                final Function1 function1 = new Function1() { // from class: ActionBarContainerApi21Impl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ActionBarContainer.TuitionPaymentFragmentspecialinlinedviewModeldefault3((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                };
                listMutableListOf.removeIf(new Predicate() { // from class: isCollapsed
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) function1.invoke(obj)).booleanValue();
                    }
                });
            } else if (zAreEqual && zAreEqual2 && zOnConnectionFailed && zTuitionPaymentFragmentspecialinlinedviewModeldefault2 && !zTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                final Function1 function2 = new Function1() { // from class: jumpDrawablesToCurrentState
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ActionBarContainer.TuitionPaymentFragmentspecialinlinedviewModeldefault2((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                };
                listMutableListOf.removeIf(new Predicate() { // from class: getMeasuredHeightWithMargins
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) function2.invoke(obj)).booleanValue();
                    }
                });
            } else {
                final Function1 function3 = new Function1() { // from class: drawableStateChanged
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ActionBarContainer.TuitionPaymentFragmentspecialinlinedviewModeldefault1((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                };
                listMutableListOf.removeIf(new Predicate() { // from class: getTabContainer
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) function3.invoke(obj)).booleanValue();
                    }
                });
                final Function1 function4 = new Function1() { // from class: setPrimaryBackground
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ActionBarContainer.b((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                };
                listMutableListOf.removeIf(new Predicate() { // from class: onLayout
                    private static final byte[] $$c = {107, 48, 57, 107};
                    private static final int $$d = 60;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {70, -114, 113, 8, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
                    private static final int $$b = 33;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722247;

                    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
                        /*
                            byte[] r0 = defpackage.onLayout.$$a
                            int r6 = 92 - r6
                            int r8 = r8 * 3
                            int r8 = r8 + 84
                            int r7 = r7 * 15
                            int r7 = r7 + 38
                            byte[] r1 = new byte[r7]
                            r2 = 0
                            if (r0 != 0) goto L15
                            r8 = r6
                            r4 = r7
                            r3 = r2
                            goto L2c
                        L15:
                            r3 = r2
                            r5 = r8
                            r8 = r6
                            r6 = r5
                        L19:
                            byte r4 = (byte) r6
                            r1[r3] = r4
                            int r8 = r8 + 1
                            int r3 = r3 + 1
                            if (r3 != r7) goto L2a
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            r9[r2] = r6
                            return
                        L2a:
                            r4 = r0[r8]
                        L2c:
                            int r4 = -r4
                            int r6 = r6 + r4
                            int r6 = r6 + (-11)
                            goto L19
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.onLayout.a(short, int, byte, java.lang.Object[]):void");
                    }

                    /* JADX WARN: Code duplicated, block: B:32:0x0167  */
                    /* JADX WARN: Code duplicated, block: B:33:0x0168  */
                    private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                        int i4;
                        long j;
                        Throwable cause;
                        int i5 = 2 % 2;
                        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                        char[] cArr2 = new char[i2];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        while (true) {
                            i4 = 29209604;
                            j = 0;
                            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                                break;
                            }
                            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b = (byte) 0;
                                    byte b2 = b;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3291, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, 1199271174, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Drawable.resolveOpacity(0, 0), ImageFormat.getBitsPerPixel(0) + 652, 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -450685997, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                            } catch (Throwable th) {
                                cause = th.getCause();
                                if (cause != null) {
                                    throw th;
                                }
                                throw cause;
                            }
                            cause = th.getCause();
                            if (cause != null) {
                                throw th;
                            }
                            throw cause;
                        }
                        if (i3 > 0) {
                            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                            char[] cArr3 = new char[i2];
                            System.arraycopy(cArr2, 0, cArr3, 0, i2);
                            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                        }
                        if (z) {
                            int i7 = $10 + 1;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                            char[] cArr4 = new char[i2];
                            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                                int i9 = $11 + 77;
                                $10 = i9 % 128;
                                int i10 = i9 % 2;
                                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0) + 652, ExpandableListView.getPackedPositionType(j) + 44, -450685997, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                i4 = 29209604;
                                j = 0;
                            }
                            cArr2 = cArr4;
                        }
                        objArr[0] = new String(cArr2);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) throws Throwable {
                        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
                        int i;
                        int i2 = 2 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                            int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                            byte b = $$a[7];
                            Object[] objArr = new Object[1];
                            a((byte) 89, b, b, objArr);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, keyRepeatDelay, maxKeyCode, 986134021, false, (String) objArr[0], null);
                        }
                        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                        Object[] objArr2 = new Object[1];
                        b(false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 254, 22 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 23, new char[]{65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b'}, objArr2);
                        Class<?> cls = Class.forName((String) objArr2[0]);
                        Object[] objArr3 = new Object[1];
                        b(false, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 259, 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr3);
                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cAlpha = (char) (29944 - Color.alpha(0));
                            int size = View.MeasureSpec.getSize(0) + 1755;
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 23;
                            byte[] bArr = $$a;
                            Object[] objArr4 = new Object[1];
                            a((byte) 52, bArr[5], bArr[7], objArr4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, size, scrollBarSize, 1596667560, false, (String) objArr4[0], null);
                        }
                        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char offsetBefore = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                                int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
                                int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 23;
                                byte[] bArr2 = $$a;
                                byte b2 = bArr2[7];
                                Object[] objArr5 = new Object[1];
                                a(b2, bArr2[5], b2, objArr5);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, iIndexOf, scrollBarSize2, 1599039318, false, (String) objArr5[0], null);
                            }
                            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
                            int iIdentityHashCode = System.identityHashCode(this);
                            int i3 = ~iIdentityHashCode;
                            int i4 = ((((-144688828) + (((~((-801265923) | i3)) | (~(588663496 | i3))) * (-867))) + ((((~((-801265923) | iIdentityHashCode)) | 213913858) | (~(588663496 | iIdentityHashCode))) * (-1734))) + (((~(iIdentityHashCode | 802577354)) | ((~(i3 | (-213913859))) | (~((-587352065) | iIdentityHashCode)))) * 867)) - 815114883;
                            int i5 = (i4 << 13) ^ i4;
                            int i6 = i5 ^ (i5 >>> 17);
                            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i6 ^ (i6 << 5);
                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                        } else {
                            Object[] objArr7 = new Object[1];
                            b(true, ExpandableListView.getPackedPositionChild(0L) + 254, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, 2 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20}, objArr7);
                            Class<?> cls2 = Class.forName((String) objArr7[0]);
                            Object[] objArr8 = new Object[1];
                            b(true, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 257, 16 - KeyEvent.normalizeMetaState(0), 11 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{'\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2}, objArr8);
                            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
                            try {
                                Object[] objArr9 = {23540775};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42050 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1725 - ExpandableListView.getPackedPositionChild(0L), Drawable.resolveOpacity(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                                }
                                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), -815114883, false, true);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char longPressTimeout = (char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                    int i7 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int i8 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    byte[] bArr3 = $$a;
                                    byte b3 = bArr3[7];
                                    Object[] objArr10 = new Object[1];
                                    a(b3, bArr3[5], b3, objArr10);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, i7, i8, 1599039318, false, (String) objArr10[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                                try {
                                    Object[] objArr11 = new Object[1];
                                    b(false, 254 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 22, new char[]{65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b'}, objArr11);
                                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                                    Object[] objArr12 = new Object[1];
                                    b(false, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 258, Gravity.getAbsoluteGravity(0, 0) + 15, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr12);
                                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                                        int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                                        byte[] bArr4 = $$a;
                                        Object[] objArr13 = new Object[1];
                                        a((byte) 52, bArr4[5], bArr4[7], objArr13);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, doubleTapTimeout, iResolveSizeAndState, 1596667560, false, (String) objArr13[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                        char longPressTimeout2 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 24;
                                        byte b4 = $$a[7];
                                        Object[] objArr14 = new Object[1];
                                        a((byte) 89, b4, b4, objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(longPressTimeout2, scrollBarFadeDuration, iLastIndexOf, 986134021, false, (String) objArr14[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                                } catch (Exception unused) {
                                    throw new RuntimeException();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                        int i9 = i % 2;
                        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
                            if (strArr == null) {
                                throw null;
                            }
                            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                            int i11 = i10 % 2;
                            for (String str2 : strArr) {
                                arrayList.add(str2);
                            }
                            throw null;
                        }
                        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
                        Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
                        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        int i13 = ~iFreeMemory;
                        int i14 = i12 + (-654998836) + (((~(i13 | (-274658468))) | 5567522 | (~((-218169949) | iFreeMemory))) * 717) + (((~(iFreeMemory | (-274658468))) | (~(i13 | (-218169949))) | 5567522) * 717);
                        int i15 = (i14 << 13) ^ i14;
                        int i16 = i15 ^ (i15 >>> 17);
                        ((int[]) objArr15[3])[0] = i16 ^ (i16 << 5);
                        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                        int i18 = i17 % 2;
                        return ((Boolean) function4.invoke(obj)).booleanValue();
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$e(short r6, byte r7, byte r8) {
                        /*
                            byte[] r0 = defpackage.onLayout.$$c
                            int r8 = 120 - r8
                            int r6 = r6 * 4
                            int r1 = 1 - r6
                            int r7 = r7 * 2
                            int r7 = 3 - r7
                            byte[] r1 = new byte[r1]
                            r2 = 0
                            int r6 = 0 - r6
                            if (r0 != 0) goto L17
                            r4 = r6
                            r8 = r7
                            r3 = r2
                            goto L2c
                        L17:
                            r3 = r2
                        L18:
                            int r7 = r7 + 1
                            byte r4 = (byte) r8
                            r1[r3] = r4
                            if (r3 != r6) goto L25
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L25:
                            int r3 = r3 + 1
                            r4 = r0[r7]
                            r5 = r8
                            r8 = r7
                            r7 = r5
                        L2c:
                            int r7 = r7 + r4
                            r5 = r8
                            r8 = r7
                            r7 = r5
                            goto L18
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.onLayout.$$e(short, byte, byte):java.lang.String");
                    }
                });
            }
        }
        return new setActionBarHideOffset(contextRequireContext, listMutableListOf, new Function1() { // from class: ActionBarBackgroundDrawableApi21Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActionBarContainer.b(this.TuitionPaymentFragmentbindingInflater1, (r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj);
            }
        });
    }

    public static /* synthetic */ Unit b(ActionBarContainer actionBarContainer, VirtualCameraAdapter1 virtualCameraAdapter1) {
        BaseActivity baseActivity;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentActivity activity = actionBarContainer.getActivity();
            baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
            if (baseActivity != null) {
                baseActivity.MediaBrowserCompat();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentActivity activity2 = actionBarContainer.getActivity();
            baseActivity = activity2 instanceof BaseActivity ? (BaseActivity) activity2 : null;
            if (baseActivity != null) {
                baseActivity.IconCompatParcelizer();
            }
            actionBarContainer.g = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ((Camera2CameraControlImplExternalSyntheticLambda4) actionBarContainer.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentActivity activity3 = actionBarContainer.getActivity();
            BaseActivity baseActivity2 = activity3 instanceof BaseActivity ? (BaseActivity) activity3 : null;
            if (baseActivity2 != null) {
                baseActivity2.IconCompatParcelizer();
            }
            FragmentActivity activity4 = actionBarContainer.getActivity();
            BaseActivity baseActivity3 = activity4 instanceof BaseActivity ? (BaseActivity) activity4 : null;
            if (baseActivity3 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(baseActivity3, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        } else {
            FragmentActivity activity5 = actionBarContainer.getActivity();
            baseActivity = activity5 instanceof BaseActivity ? (BaseActivity) activity5 : null;
            if (baseActivity != null) {
                baseActivity.IconCompatParcelizer();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ setActionBarHideOffset TuitionPaymentFragmentbindingInflater1(final ActionBarContainer actionBarContainer) {
        Context contextRequireContext = actionBarContainer.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new setActionBarHideOffset(contextRequireContext, actionBarContainer.asBinder(), new Function1() { // from class: verifyDrawable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActionBarContainer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActionBarContainer actionBarContainer, r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        Function1<? super r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4, Unit> function1 = actionBarContainer.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (function1 != null) {
            function1.invoke(r8lambdai2xi7mochmmaz9qzzewheaxs4);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ setActionBarHideOffset TuitionPaymentFragmentspecialinlinedviewModeldefault3(final ActionBarContainer actionBarContainer) {
        Context contextRequireContext = actionBarContainer.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        boolean zUnsubscribe = getMaxImages.unsubscribe();
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        boolean zMediaBrowserCompatItemCallback = getMaxImages.MediaBrowserCompatItemCallback();
        ArrayList arrayList = new ArrayList();
        if (zUnsubscribe) {
            String type = BpjsServiceEnum.PROMO.getType();
            String string = actionBarContainer.getString(R.string.label_promo);
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type, string, R.drawable.ic_loyalti_program));
        }
        if (!Intrinsics.areEqual(actionBarContainer.cancelAll, "true")) {
            String type2 = BpjsServiceEnum.STREAMING.getType();
            String string2 = actionBarContainer.getString(R.string.menu_loyalti);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arrayList.add(new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type2, string2, R.drawable.ic_icon_streaming));
        }
        if (zMediaBrowserCompatItemCallback) {
            String type3 = BpjsServiceEnum.PODCAST.getType();
            String string3 = actionBarContainer.getString(R.string.label_edu_video);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            arrayList.add(new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type3, string3, R.drawable.ic_video_edu));
        }
        FragmentOtherBottomSheetBinding fragmentOtherBottomSheetBinding = actionBarContainer.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentOtherBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentOtherBottomSheetBinding = null;
        }
        fragmentOtherBottomSheetBinding.tvOtherEntertainment.setVisibility(!arrayList.isEmpty() ? 0 : 8);
        return new setActionBarHideOffset(contextRequireContext, arrayList, new Function1() { // from class: startActionModeForChild
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActionBarContainer.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj);
            }
        });
    }

    public static /* synthetic */ boolean b(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.SCHOLARSHIP.getType());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActionBarContainer actionBarContainer, r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        Function1<? super r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4, Unit> function1 = actionBarContainer.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (function1 != null) {
            function1.invoke(r8lambdai2xi7mochmmaz9qzzewheaxs4);
        }
        return Unit.INSTANCE;
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(User p0, String p1) {
        List<FiturList> list;
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 != null && (list = p0.getInterfaceDescriptor) != null) {
            List<FiturList> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((FiturList) it.next()).getKodeFitur(), p1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ActionBarContainer actionBarContainer = this;
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.a.getValue()).onTransact.observe(actionBarContainer, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: setStackedBackground
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActionBarContainer.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.a.getValue()).INotificationSideChannelStub.observe(actionBarContainer, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: ActionBarBackgroundDrawable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActionBarContainer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
    }
}
