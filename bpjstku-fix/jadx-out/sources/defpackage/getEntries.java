package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.request.GetListSertakanAutodebetRequest;
import com.bpjstku.data.payment.model.response.GetListSertakanAutodebetResponse;
import com.bpjstku.data.payment.model.response.GetListSertakanItemResponse;
import com.bpjstku.databinding.FragmentListTuitionRateBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.model.ItemAutodebitParticipant;
import com.bpjstku.presentation.account.setting.NonactiveAutodebitBottomSheetDialogFragment$chooseItemAutodebitParticipantAdapter$2$1;
import com.bpjstku.presentation.account.setting.NonactiveAutodebitBottomSheetDialogFragment$handleItemClicked$1;
import com.google.android.gms.internal.mlkit_vision_common.zzir;
import com.kennyc.view.MultiStateView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ListPopupWindow2;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0015\u0010\u0016\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0015\u0010\u001e\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001f8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0014\u001a\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\"R\u0015\u0010$\u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a"}, d2 = {"LgetEntries;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/presentation/account/model/ItemAutodebitParticipant;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "d", "b", "(Lcom/bpjstku/presentation/account/model/ItemAutodebitParticipant;)V", "Lkotlin/jvm/functions/Function1;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/account/model/ItemAutodebitParticipant;", "LinvalidateOptionsMenu;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/databinding/FragmentListTuitionRateBinding;", "Lcom/bpjstku/databinding/FragmentListTuitionRateBinding;", "", "()I", "LListPopupWindow2;", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getEntries extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f933a;
    private static char asInterface;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentListTuitionRateBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<ItemAutodebitParticipant, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ItemAutodebitParticipant TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {56, 94, 119, -19};
    private static final int $$f = 229;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, -4, 11, 11, 19, 10, -6, 22, -38, 39, 21, 1, 22, -8, -52, 57, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, 8, 6, -2, 7, 15, 1, 20, 6, 14, 7, 6, 14, 0, 8, 27, -4, 5, 27, -33, 43, -2, 10, 16, 1, 10, 10, 4, 29, 0, 17, -57};
    private static final int $$e = 82;
    private static final byte[] $$a = {33, -59, 107, -108, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 153;
    private static int INotificationSideChannel = 1;
    private static int cancelAll = 0;
    private static int cancel = 1;

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~((~i5) | i7);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i5)) | (~(i2 | i5));
        int i11 = i7 | i5;
        int i12 = i9 | i11;
        int i13 = i2 + i5 + i4 + ((-1542968645) * i6) + (1789173782 * i3);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i2) + 752877568 + ((-368479342) * i5) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i4) + (1802502144 * i6) + (148897792 * i3) + (289275904 * i14);
        int i16 = (i2 * (-930071408)) + 1959937684 + (i5 * (-930070194)) + (i10 * TypedValues.MotionType.TYPE_PATHMOTION_ARC) + (i11 * (-1214)) + (i12 * TypedValues.MotionType.TYPE_PATHMOTION_ARC) + (i4 * (-930070801)) + (i6 * 1059663509) + (i3 * (-1428764534)) + (i14 * 484573184);
        if (i15 + (i16 * i16 * 411172864) != 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        getEntries getentries = (getEntries) objArr[0];
        ItemAutodebitParticipant itemAutodebitParticipant = (ItemAutodebitParticipant) objArr[1];
        int i17 = 2 % 2;
        getentries.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemAutodebitParticipant;
        kotlinx.coroutines.b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new NonactiveAutodebitBottomSheetDialogFragment$handleItemClicked$1(getentries, itemAutodebitParticipant, null), 3, null);
        int i18 = cancelAll + 77;
        cancel = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    private static void c(short s, int i, byte b2, Object[] objArr) {
        int i2 = 98 - (i * 14);
        byte[] bArr = $$a;
        int i3 = 56 - (s * 52);
        byte[] bArr2 = new byte[53 - b2];
        int i4 = 52 - b2;
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i2 = (i3 + (-i4)) - 10;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i3];
                i3++;
                i2 = (i2 + (-b3)) - 10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 30
            int r5 = 114 - r5
            int r7 = r7 * 2
            int r0 = r7 + 53
            int r6 = r6 * 52
            int r6 = 56 - r6
            byte[] r1 = defpackage.getEntries.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 52
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r1[r6]
        L2a:
            int r5 = r5 + r3
            int r5 = r5 + (-9)
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getEntries.f(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getEntries(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = cancel + 75;
            int i3 = i2 % 128;
            cancelAll = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 29;
            cancel = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            function1 = null;
        }
        this(function1);
    }

    public static final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(getEntries getentries) {
        int i = 2 % 2;
        int i2 = cancel + 61;
        int i3 = i2 % 128;
        cancelAll = i3;
        int i4 = i2 % 2;
        Function1<ItemAutodebitParticipant, Unit> function1 = getentries.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i3 + 81;
        cancel = i5 % 128;
        if (i5 % 2 != 0) {
            return function1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getEntries(Function1<? super ItemAutodebitParticipant, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        final getEntries getentries = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.account.setting.NonactiveAutodebitBottomSheetDialogFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = getentries;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: Keep
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getEntries.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        final getEntries getentries2 = this;
        this.a = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.account.setting.NonactiveAutodebitBottomSheetDialogFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = getentries2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListPopupWindow2.class);
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
    }

    /* JADX INFO: renamed from: getEntries$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LgetEntries$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/bpjstku/presentation/account/model/ItemAutodebitParticipant;", "p0", "Lkotlin/Function1;", "", "p1", "LgetEntries;", "b", "(Lcom/bpjstku/presentation/account/model/ItemAutodebitParticipant;Lkotlin/jvm/functions/Function1;)LgetEntries;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getEntries b(ItemAutodebitParticipant p0, Function1<? super ItemAutodebitParticipant, Unit> p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            getEntries getentries = new getEntries(p1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("selected_sertakan_autodebet", p0);
            getentries.setArguments(bundle);
            return getentries;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = f933a;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 9;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), (KeyEvent.getMaxKeyCode() >> 16) + 2267, 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1927765101, false, $$g(b3, b4, (byte) (b4 - 4)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = (byte) (b5 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), KeyEvent.getDeadChar(0, 0) + 2267, 33 - TextUtils.getOffsetAfter("", 0), -1927765101, false, $$g(b5, b6, (byte) (b6 - 4)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49267), (Process.myTid() >> 22) + 3261, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, -127612708, false, $$g(b7, b8, (byte) (b8 - 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i7 = $11 + 119;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        try {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 22878), (Process.myTid() >> 22) + 594, 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1570859318, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i9];
                            int i10 = $11 + 81;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i12 = $11 + 103;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } else {
                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArr2;
        FragmentListTuitionRateBinding fragmentListTuitionRateBinding;
        Object[] objArr3;
        getEntries getentries = (getEntries) objArr[0];
        LayoutInflater layoutInflater = (LayoutInflater) objArr[1];
        ViewGroup viewGroup = (ViewGroup) objArr[2];
        int i = 2 % 2;
        int i2 = cancel + 71;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 31533);
            int iArgb = 921 - Color.argb(0, 0, 0, 0);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 29;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[80];
            Object[] objArr4 = new Object[1];
            c(b2, b3, (byte) (b3 | 52), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iArgb, iLastIndexOf, -1048449946, false, (String) objArr4[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr5 = new Object[1];
        e(new char[]{'\f', 25, 26, 24, '\t', 2, 28, 1, '\t', 26, 5, 0, '\t', 24, '\r', 11, 7, '!', ' ', 6, 3, ' '}, (byte) (90 - View.combineMeasuredStates(0, 0)), TextUtils.getCapsMode("", 0, 0) + 22, objArr5);
        Class<?> cls = Class.forName((String) objArr5[0]);
        Object[] objArr6 = new Object[1];
        e(new char[]{6, 31, 14, 17, 25, '\t', 26, 31, '\r', 19, '#', '\f', '\t', 15, 13879}, (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 56), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, objArr6);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr6[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
            int gidForName = Process.getGidForName("") + 922;
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[7];
            Object[] objArr7 = new Object[1];
            c(b4, b4, bArr2[80], objArr7);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, gidForName, maximumFlingVelocity, -778300370, false, (String) objArr7[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31533);
                int keyRepeatDelay = 921 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iResolveOpacity = 28 - Drawable.resolveOpacity(0, 0);
                byte[] bArr3 = $$a;
                Object[] objArr8 = new Object[1];
                c(bArr3[80], bArr3[7], (byte) (-bArr3[33]), objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, keyRepeatDelay, iResolveOpacity, -1142834547, false, (String) objArr8[0], null);
            }
            Object[] objArr9 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr9[1])[0]}, (Object[]) objArr9[2], new int[]{((int[]) objArr9[3])[0]}, (String[]) objArr9[4]};
            int iNextInt = new Random().nextInt(1818262968);
            int i4 = (((~(iNextInt | 1410842685)) * TypedValues.CycleType.TYPE_EASING) - 2046065053) + (((~((~iNextInt) | 1410842685)) | 335970332) * TypedValues.CycleType.TYPE_EASING) + 1698841992;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr2[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr10 = new Object[1];
            e(new char[]{'\f', 25, 26, 24, '\t', 2, 28, 1, 14, 17, 22, '\n', ' ', 4, 15, 5, '\t', 4, '\f', 11, 24, 20, 25, 11, 19, 31}, (byte) (68 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, objArr10);
            Class<?> cls2 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{3, 20, 13915, 13915, 6, 25, 16, '#', 13917, 13917, '!', 0, 1, 14, 15, 5, 6, 26}, (byte) (115 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf("", "") + 18, objArr11);
            Context applicationContext = (Context) cls2.getMethod((String) objArr11[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = cancel + 27;
                cancelAll = i7 % 128;
                int i8 = i7 % 2;
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i9 = cancel + 29;
                    cancelAll = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 2 % 3;
                    }
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr12 = new Object[1];
            e(new char[]{'\r', 14, 7, 16, 0, Typography.quote, '\f', 25, 16, 3, 0, 11, 29, 15, '\b', '\n'}, (byte) (87 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr12);
            Class<?> cls3 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            e(new char[]{1, 27, 6, 25, 15, 5, '\f', 11, 7, 17, 24, 21, ' ', 7, 31, '\r'}, (byte) (KeyEvent.keyCodeFromString("") + 60), TextUtils.getCapsMode("", 0, 0) + 16, objArr13);
            try {
                Object[] objArr14 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr13[0], Object.class).invoke(null, getentries)).intValue()), 0, 1698841992};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[89];
                Object[] objArr15 = new Object[1];
                f(b5, bArr4[14], b5, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b6 = bArr4[14];
                byte b7 = bArr4[89];
                Object[] objArr16 = new Object[1];
                f(b6, b7, b7, objArr16);
                objArr2 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int iBlue = Color.blue(0) + 921;
                    int iRed = 28 - Color.red(0);
                    byte[] bArr5 = $$a;
                    Object[] objArr17 = new Object[1];
                    c(bArr5[80], bArr5[7], (byte) (-bArr5[33]), objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, iBlue, iRed, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr2);
                try {
                    Object[] objArr18 = new Object[1];
                    e(new char[]{'\f', 25, 26, 24, '\t', 2, 28, 1, '\t', 26, 5, 0, '\t', 24, '\r', 11, 7, '!', ' ', 6, 3, ' '}, (byte) (90 - View.resolveSize(0, 0)), ExpandableListView.getPackedPositionChild(0L) + 23, objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    e(new char[]{6, 31, 14, 17, 25, '\t', 26, 31, '\r', 19, '#', '\f', '\t', 15, 13879}, (byte) (View.MeasureSpec.getSize(0) + 56), 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 31533);
                        int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int maximumFlingVelocity2 = 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[7];
                        Object[] objArr20 = new Object[1];
                        c(b8, b8, bArr6[80], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, scrollBarSize, maximumFlingVelocity2, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                        int iGreen = 921 - Color.green(0);
                        int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28;
                        byte[] bArr7 = $$a;
                        byte b9 = bArr7[7];
                        byte b10 = bArr7[80];
                        Object[] objArr21 = new Object[1];
                        c(b9, b10, (byte) (b10 | 52), objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout, iGreen, maximumFlingVelocity3, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr2[1])[0];
        int i12 = ((int[]) objArr2[3])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr2[0])[0];
            objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
            int i14 = ~((~Process.myUid()) | 1527124912);
            int i15 = i13 + (((1359347984 | i14) * (-970)) - 2043165957) + ((i14 | 167776928) * 970);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr3[0])[0] = i17 ^ (i17 << 5);
            fragmentListTuitionRateBinding = null;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr2[4];
            if (strArr != null) {
                int i18 = cancelAll + 45;
                cancel = i18 % 128;
                int i19 = i18 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i12];
            int i20 = i12 - 1;
            iArr[i20] = 1;
            int i21 = iArr[((i12 * i20) % 2) - 1];
            fragmentListTuitionRateBinding = null;
            Toast.makeText((Context) null, i21, 1).show();
            int i22 = ((int[]) objArr2[0])[0];
            objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i23 = i22 + (-916116257) + (((~(968355483 | elapsedCpuTime)) | 805724160) * (-756)) + (((~elapsedCpuTime) | 968355483) * 756);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr3[0])[0] = i25 ^ (i25 << 5);
        }
        FragmentListTuitionRateBinding fragmentListTuitionRateBindingInflate = FragmentListTuitionRateBinding.inflate(layoutInflater, viewGroup, false);
        getentries.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = fragmentListTuitionRateBindingInflate;
        if (fragmentListTuitionRateBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentListTuitionRateBindingInflate = fragmentListTuitionRateBinding;
        }
        FrameLayout root = fragmentListTuitionRateBindingInflate.getRoot();
        int i26 = ((int[]) objArr3[0])[0];
        int i27 = i26 * i26;
        int i28 = -(1768165824 * i26);
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        int i30 = -(i26 * (-835136380));
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        int i32 = (i31 & (-1434480508)) + ((-1434480508) | i31);
        int i33 = i32 >> 21;
        int i34 = (i32 - (~(((((i33 | (-4095)) << 1) - (i33 ^ (-4095))) / 2048) + 1))) - 1;
        int i35 = i32 >> 17;
        int i36 = ((((-65535) | i35) << 1) - (i35 ^ (-65535))) / 32768;
        int i37 = -(i34 ^ ((i36 & 1) + (i36 | 1)));
        int i38 = ((i37 | 6) << 1) - (i37 ^ 6);
        int i39 = i38 >> 25;
        int i40 = ((i39 ^ (-255)) + ((i39 & (-255)) << 1)) / 128;
        int i41 = (i40 & 1) + (i40 | 1);
        Intrinsics.checkNotNullExpressionValue(root, "29;getRoot(...)".substring(28260 / (((-((i41 ^ 1) + ((i41 & 1) << 1))) & i38) * 1570)));
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        ItemAutodebitParticipant itemAutodebitParticipant;
        int i = 2 % 2;
        int i2 = cancel + 53;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                return;
            }
        } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i4 = cancel + 121;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            itemAutodebitParticipant = (ItemAutodebitParticipant) arguments.getParcelable("selected_sertakan_autodebet");
            int i6 = cancelAll + 17;
            cancel = i6 % 128;
            int i7 = i6 % 2;
        } else {
            itemAutodebitParticipant = null;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemAutodebitParticipant;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        int i = 2 % 2;
        FragmentListTuitionRateBinding fragmentListTuitionRateBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj = null;
        if (fragmentListTuitionRateBinding == null) {
            int i2 = cancel + 53;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentListTuitionRateBinding = null;
        }
        fragmentListTuitionRateBinding.tvChooseTuitionRates.setText("List Autodebit Aktif");
        RecyclerView recyclerView = fragmentListTuitionRateBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((invalidateOptionsMenu) this.TuitionPaymentFragmentbindingInflater1.getValue());
        ItemAutodebitParticipant itemAutodebitParticipant = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (itemAutodebitParticipant != null) {
            int i4 = cancelAll + 29;
            cancel = i4 % 128;
            if (i4 % 2 == 0) {
                b(itemAutodebitParticipant);
                obj.hashCode();
                throw null;
            }
            b(itemAutodebitParticipant);
        }
        TuitionPaymentFragmentbindingInflater1();
    }

    private final void asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = cancelAll + 3;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) this.a.getValue();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder == null) {
            int i4 = cancel + 87;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        } else {
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        listPopupWindow2.b(new GetListSertakanAutodebetRequest(String.valueOf(str)));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        int i = 2 % 2;
        int i2 = cancel + 51;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        asBinder();
        if (i3 != 0) {
            throw null;
        }
        int i4 = cancelAll + 75;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        int i = 2 % 2;
        ((ListPopupWindow2) this.a.getValue()).INotificationSideChannelStub.observe(getViewLifecycleOwner(), new b(new Function1() { // from class: open
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getEntries.b(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = cancelAll + 7;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void b(ItemAutodebitParticipant p0) {
        int i = 2 % 2;
        Iterable iterable = ((invalidateOptionsMenu) this.TuitionPaymentFragmentbindingInflater1.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i2 = 0;
        for (Object obj : iterable) {
            int i3 = cancelAll + 65;
            cancel = i3 % 128;
            int i4 = i3 % 2;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ItemAutodebitParticipant itemAutodebitParticipant = (ItemAutodebitParticipant) obj;
            itemAutodebitParticipant.onTransact = Intrinsics.areEqual(p0.TuitionPaymentFragmentbindingInflater1, itemAutodebitParticipant.TuitionPaymentFragmentbindingInflater1);
            ((invalidateOptionsMenu) this.TuitionPaymentFragmentbindingInflater1.getValue()).d.set(i2, (Data) itemAutodebitParticipant);
            if (!(!Intrinsics.areEqual(p0.TuitionPaymentFragmentbindingInflater1, itemAutodebitParticipant.TuitionPaymentFragmentbindingInflater1))) {
                FragmentListTuitionRateBinding fragmentListTuitionRateBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (fragmentListTuitionRateBinding == null) {
                    int i5 = cancel + 121;
                    cancelAll = i5 % 128;
                    int i6 = i5 % 2;
                    Object obj2 = null;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    if (i6 != 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    fragmentListTuitionRateBinding = null;
                }
                fragmentListTuitionRateBinding.rvItem.scrollToPosition(i2);
            }
            i2++;
        }
    }

    public static /* synthetic */ Unit b(getEntries getentries) {
        int i = 2 % 2;
        int i2 = cancel + 63;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        getentries.asBinder();
        Unit unit = Unit.INSTANCE;
        int i4 = cancelAll + 99;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ invalidateOptionsMenu TuitionPaymentFragmentspecialinlinedviewModeldefault2(getEntries getentries) {
        int i = 2 % 2;
        NonactiveAutodebitBottomSheetDialogFragment$chooseItemAutodebitParticipantAdapter$2$1 nonactiveAutodebitBottomSheetDialogFragment$chooseItemAutodebitParticipantAdapter$2$1 = new NonactiveAutodebitBottomSheetDialogFragment$chooseItemAutodebitParticipantAdapter$2$1(getentries);
        Context contextRequireContext = getentries.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        invalidateOptionsMenu invalidateoptionsmenu = new invalidateOptionsMenu(contextRequireContext, null, nonactiveAutodebitBottomSheetDialogFragment$chooseItemAutodebitParticipantAdapter$2$1, 2, null);
        int i2 = cancel + 73;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
        return invalidateoptionsmenu;
    }

    public static /* synthetic */ Unit b(final getEntries getentries, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 5;
        int i4 = i3 % 128;
        cancel = i4;
        FragmentListTuitionRateBinding fragmentListTuitionRateBinding = null;
        if (i3 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentListTuitionRateBinding fragmentListTuitionRateBinding2 = getentries.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (fragmentListTuitionRateBinding2 == null) {
                int i5 = i4 + 81;
                cancelAll = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentListTuitionRateBinding = fragmentListTuitionRateBinding2;
            }
            MultiStateView multiStateView = fragmentListTuitionRateBinding.msvListTuitionRates;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i7 = i2 + 99;
            int i8 = i7 % 128;
            cancel = i8;
            if (i7 % 2 == 0) {
                FragmentListTuitionRateBinding fragmentListTuitionRateBinding3 = getentries.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                fragmentListTuitionRateBinding.hashCode();
                throw null;
            }
            FragmentListTuitionRateBinding fragmentListTuitionRateBinding4 = getentries.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (fragmentListTuitionRateBinding4 == null) {
                int i9 = i8 + 23;
                cancelAll = i9 % 128;
                int i10 = i9 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentListTuitionRateBinding = fragmentListTuitionRateBinding4;
            }
            MultiStateView multiStateView2 = fragmentListTuitionRateBinding.msvListTuitionRates;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            List<GetListSertakanItemResponse> data = ((GetListSertakanAutodebetResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
            for (GetListSertakanItemResponse getListSertakanItemResponse : data) {
                arrayList.add(new ItemAutodebitParticipant(getListSertakanItemResponse.getNamaLengkap().toString(), getListSertakanItemResponse.getEmail().toString(), getListSertakanItemResponse.getHandPhone().toString(), getListSertakanItemResponse.getTipeRekening().toString(), getListSertakanItemResponse.getNik().toString(), getListSertakanItemResponse.getNominal().toString(), getListSertakanItemResponse.getKodePlanRecurring().toString(), getListSertakanItemResponse.getTglAktifRecurring(), getListSertakanItemResponse.getTglRekamRecurring(), getListSertakanItemResponse.getAllowed_nonaktif(), false));
            }
            invalidateOptionsMenu invalidateoptionsmenu = (invalidateOptionsMenu) getentries.TuitionPaymentFragmentbindingInflater1.getValue();
            invalidateoptionsmenu.d.clear();
            invalidateoptionsmenu.notifyDataSetChanged();
            ((invalidateOptionsMenu) getentries.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList);
            ItemAutodebitParticipant itemAutodebitParticipant = getentries.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (itemAutodebitParticipant != null) {
                int i11 = cancel + 77;
                cancelAll = i11 % 128;
                int i12 = i11 % 2;
                getentries.b(itemAutodebitParticipant);
                int i13 = cancel + 123;
                cancelAll = i13 % 128;
                int i14 = i13 % 2;
            }
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            FragmentListTuitionRateBinding fragmentListTuitionRateBinding5 = getentries.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (fragmentListTuitionRateBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentListTuitionRateBinding = fragmentListTuitionRateBinding5;
            }
            MultiStateView multiStateView3 = fragmentListTuitionRateBinding.msvListTuitionRates;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, getentries.getString(R.string.error_error_occured), null, new Pair(getentries.getString(R.string.action_retry), new Function0() { // from class: InterpolatorRes
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return getEntries.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    static {
        notify = 0;
        a();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 123;
        notify = i % 128;
        if (i % 2 != 0) {
            int i2 = 6 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getEntries() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getD() {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 103;
        cancel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 18 / 0;
        }
        int i5 = i2 + 121;
        cancel = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.fragment_list_tuition_rate;
        }
        throw null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 103;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        return (View) b(zzir.TuitionPaymentFragmentbindingInflater1(), -665662170, new Object[]{this, p0, p1, p2}, zzir.TuitionPaymentFragmentbindingInflater1(), zzir.TuitionPaymentFragmentbindingInflater1(), 665662170, zzir.TuitionPaymentFragmentbindingInflater1());
    }

    static void a() {
        f933a = new char[]{57191, 57189, 60056, 60050, 60117, 60072, 60034, 60062, 60052, 60054, 60045, 60083, 60049, 60058, 57188, 60060, 60043, 60047, 60051, 57192, 57187, 60046, 57186, 57190, 60053, 60063, 60079, 60040, 57193, 60041, 60055, 60088, 60073, 60048, 60090, 57184};
        asInterface = (char) 57191;
    }

    private static String $$g(short s, byte b2, int i) {
        int i2 = i + 4;
        byte[] bArr = $$c;
        int i3 = 116 - b2;
        int i4 = s * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 = (-i3) + i2;
            i2 = i2;
            i6 = -1;
        }
        while (true) {
            int i7 = i2 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i5) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i7]) + i3;
            i2 = i7;
            i6 = i8;
        }
    }
}
