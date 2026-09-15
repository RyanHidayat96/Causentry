package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.compose.runtime.ComposerKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentChooseKpjBottomSheetBinding;
import com.bpjstku.domain.user.model.SubscribedProgram;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.syariah.SyariahChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1;
import com.bpjstku.presentation.syariah.SyariahChooseKpjBottomSheetFragment$handleItemClicked$1;
import com.bpjstku.presentation.syariah.model.SyariahChooseKpjModel;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.mapPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\tJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0015\u0010\r\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0015\u0010\b\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u001cR\u001a\u0010 \u001a\u00020!8\u0015X\u0095D¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b \u0010#R\u0016\u0010\n\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001e\u0010%"}, d2 = {"LCameraCharacteristicsApi28Impl;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/presentation/syariah/model/SyariahChooseKpjModel;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "asBinder", "()Ljava/util/List;", "asInterface", "Lkotlin/jvm/functions/Function1;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/syariah/model/SyariahChooseKpjModel;", "TuitionPaymentFragmentbindingInflater1", "LcreateBaseCaptureSession;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "I", "()I", "Lcom/bpjstku/databinding/FragmentChooseKpjBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChooseKpjBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraCharacteristicsApi28Impl extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f106a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char cancel;
    private static int g;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentChooseKpjBottomSheetBinding g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private SyariahChooseKpjModel TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Function1<SyariahChooseKpjModel, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {83, -44, 103, 46};
    private static final int $$f = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {104, 27, -72, 120, 9, -20, 28, -27, -10, 2, -10, 2, 14, -24, -16, 6, -1, -24, 6, -10, 2, 16, -24, -17, -9, 11, -19, -6};
    private static final int $$e = 61;
    private static final byte[] $$a = {113, 29, -123, -97, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    private static int notify = 0;
    private static int cancelAll = 0;
    private static int INotificationSideChannel = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = (~(i8 | i5)) | i7;
        int i10 = (~(i7 | (~i5) | i4)) | (~(i8 | i7 | i5));
        int i11 = (~(i5 | i4)) | (~(i3 | i4));
        int i12 = i3 + i4 + i2 + ((-1520811122) * i6) + (1880343047 * i);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i3) - 1254686720) + (875799021 * i4) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i2) + ((-206831616) * i6) + (408289280 * i) + ((-683737088) * i13);
        int i15 = ((i3 * (-660833811)) - 1995073173) + (i4 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i2 * (-660833671)) + (i6 * 644061726) + (i * (-2012083377)) + (i13 * (-1027145728));
        return i14 + ((i15 * i15) * 814809088) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.CameraCharacteristicsApi28Impl.$$a
            int r1 = r8 + 1
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r6 = r6 + 1
            int r7 = r7 + (-10)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CameraCharacteristicsApi28Impl.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 24
            int r9 = 25 - r9
            byte[] r0 = defpackage.CameraCharacteristicsApi28Impl.$$d
            int r8 = r8 + 4
            int r7 = r7 * 17
            int r7 = 115 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-5)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CameraCharacteristicsApi28Impl.f(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CameraCharacteristicsApi28Impl(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = INotificationSideChannel;
            int i3 = i2 + 105;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 39;
            cancelAll = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            function1 = null;
        }
        this(function1);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        CameraCharacteristicsApi28Impl cameraCharacteristicsApi28Impl = (CameraCharacteristicsApi28Impl) objArr[0];
        SyariahChooseKpjModel syariahChooseKpjModel = (SyariahChooseKpjModel) objArr[1];
        int i = 2 % 2;
        cameraCharacteristicsApi28Impl.TuitionPaymentFragmentbindingInflater1 = syariahChooseKpjModel;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new SyariahChooseKpjBottomSheetFragment$handleItemClicked$1(cameraCharacteristicsApi28Impl, syariahChooseKpjModel, null), 3, null);
        int i2 = cancelAll + 103;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return null;
    }

    public static final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1(CameraCharacteristicsApi28Impl cameraCharacteristicsApi28Impl) {
        int i = 2 % 2;
        int i2 = cancelAll + 59;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        Function1<SyariahChooseKpjModel, Unit> function1 = cameraCharacteristicsApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i3 + 95;
        cancelAll = i5 % 128;
        if (i5 % 2 == 0) {
            return function1;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CameraCharacteristicsApi28Impl(Function1<? super SyariahChooseKpjModel, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        final CameraCharacteristicsApi28Impl cameraCharacteristicsApi28Impl = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.syariah.SyariahChooseKpjBottomSheetFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = cameraCharacteristicsApi28Impl;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: CameraCharacteristicsBaseImpl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraCharacteristicsApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.fragment_choose_kpj_bottom_sheet;
    }

    /* JADX INFO: renamed from: CameraCharacteristicsApi28Impl$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LCameraCharacteristicsApi28Impl$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/bpjstku/presentation/syariah/model/SyariahChooseKpjModel;", "", "p0", "p1", "LCameraCharacteristicsApi28Impl;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lkotlin/jvm/functions/Function1;Lcom/bpjstku/presentation/syariah/model/SyariahChooseKpjModel;)LCameraCharacteristicsApi28Impl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static CameraCharacteristicsApi28Impl TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1<? super SyariahChooseKpjModel, Unit> p0, SyariahChooseKpjModel p1) {
            CameraCharacteristicsApi28Impl cameraCharacteristicsApi28Impl = new CameraCharacteristicsApi28Impl(p0);
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_kpj_syariah", p1);
            cameraCharacteristicsApi28Impl.setArguments(bundle);
            return cameraCharacteristicsApi28Impl;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        SyariahChooseKpjModel syariahChooseKpjModel;
        int i = 2 % 2;
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            int i2 = cancelAll + 33;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            Bundle arguments = getArguments();
            if (arguments != null) {
                int i4 = INotificationSideChannel + 51;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
                syariahChooseKpjModel = (SyariahChooseKpjModel) arguments.getParcelable("key_kpj_syariah");
            } else {
                syariahChooseKpjModel = null;
            }
            this.TuitionPaymentFragmentbindingInflater1 = syariahChooseKpjModel;
        }
        int i6 = cancelAll + 95;
        INotificationSideChannel = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080 A[PHI: r7
  0x0080: PHI (r7v5 java.lang.Object) = (r7v4 java.lang.Object), (r7v12 java.lang.Object) binds: [B:18:0x007e, B:15:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        Object next;
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 125;
        cancelAll = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBinding = this.g;
        if (fragmentChooseKpjBottomSheetBinding == null) {
            int i4 = i2 + 93;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = cancelAll + 67;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
            fragmentChooseKpjBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentChooseKpjBottomSheetBinding.rvChooseKpj;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((createBaseCaptureSession) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        SyariahChooseKpjModel syariahChooseKpjModel = this.TuitionPaymentFragmentbindingInflater1;
        if (syariahChooseKpjModel != null) {
            Iterable iterable = ((createBaseCaptureSession) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d;
            Intrinsics.checkNotNullExpressionValue(iterable, "");
            Iterator it = iterable.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int i9 = INotificationSideChannel + 107;
                cancelAll = i9 % 128;
                if (i9 % 2 != 0) {
                    next = it.next();
                    int i10 = 87 / 0;
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                } else {
                    next = it.next();
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                }
                SyariahChooseKpjModel syariahChooseKpjModel2 = (SyariahChooseKpjModel) next;
                syariahChooseKpjModel2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Intrinsics.areEqual(syariahChooseKpjModel.TuitionPaymentFragmentbindingInflater1, syariahChooseKpjModel2.TuitionPaymentFragmentbindingInflater1);
                ((createBaseCaptureSession) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d.set(i8, (Data) syariahChooseKpjModel2);
                FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBinding2 = this.g;
                if (fragmentChooseKpjBottomSheetBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentChooseKpjBottomSheetBinding2 = null;
                }
                fragmentChooseKpjBottomSheetBinding2.rvChooseKpj.scrollToPosition(i8);
                i8++;
            }
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getA() {
        int i = 2 % 2;
        int i2 = cancelAll + 125;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 0) {
            int i5 = 30 / 0;
        }
        return i4;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        FragmentChooseKpjBottomSheetBinding fragmentChooseKpjBottomSheetBindingInflate;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 73;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            fragmentChooseKpjBottomSheetBindingInflate = FragmentChooseKpjBottomSheetBinding.inflate(p0, p1, true);
            this.g = fragmentChooseKpjBottomSheetBindingInflate;
            if (fragmentChooseKpjBottomSheetBindingInflate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentChooseKpjBottomSheetBindingInflate = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            fragmentChooseKpjBottomSheetBindingInflate = FragmentChooseKpjBottomSheetBinding.inflate(p0, p1, false);
            this.g = fragmentChooseKpjBottomSheetBindingInflate;
            if (fragmentChooseKpjBottomSheetBindingInflate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentChooseKpjBottomSheetBindingInflate = null;
            }
        }
        FrameLayout root = fragmentChooseKpjBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        FrameLayout frameLayout = root;
        int i3 = INotificationSideChannel + 11;
        cancelAll = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
        return frameLayout;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i3 = $10 + 31;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8327 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1235 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 35 - View.getDefaultSize(0, 0), -653973969, false, $$g(b, b2, (byte) (b2 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2764, 14 - Color.alpha(0), 1504416861, false, $$g(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 43325), 253 - TextUtils.indexOf("", "", 0, 0), 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 65200), TextUtils.indexOf((CharSequence) "", '0') + 2892, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, 2012627446, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (f106a ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) g) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) cancel) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i5 = $10 + 77;
        $11 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0244  */
    private final List<SyariahChooseKpjModel> asBinder() throws Throwable {
        Object[] objArr;
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = cancelAll + 55;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 921;
            int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0');
            byte b = $$a[80];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, windowTouchSlop, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{11138, 43900, 6486, 1281}, new char[]{32609, 21756, 27489, 49085}, (char) Color.alpha(0), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{56344, 56066, 55207, 40132, 46218, 7904, 8305, 203, 45601, 47633, 7588, 25448, 52037, 61888, 37622, 36343, 22597, 33102, 31576, 54539, 62401, 46484}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{11138, 43900, 6486, 1281}, new char[]{24339, 18282, 6699, 22117}, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25883), ((Process.getThreadPriority(0) + 20) >> 6) + 726100575, new char[]{57611, 30715, 42560, 52527, 38175, 43465, 8695, 28764, 27811, 50917, 42676, 5796, 29494, 58750, 45321}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
            int iBlue = Color.blue(0) + 921;
            int i4 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            byte b4 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b3, b4, (byte) (b4 | 52), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, iBlue, i4, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int defaultSize = View.getDefaultSize(0, 0) + 921;
                int packedPositionType2 = 28 - ExpandableListView.getPackedPositionType(0L);
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                c(b5, b6, (byte) (b6 | 36), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, defaultSize, packedPositionType2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i5 = ~Process.myPid();
            int i6 = (-256650303) + (((-269549634) | i5) * 494) + (((~(i5 | 1324017454)) | (-1413054532)) * 494) + 122747133;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{11138, 43900, 6486, 1281}, new char[]{7571, 53448, 1322, 8056}, (char) (Color.alpha(0) + 30725), View.getDefaultSize(0, 0), new char[]{24354, 39693, 6385, 32547, 25885, 62119, 23191, 64933, 3614, 39946, 41575, 19331, 62336, 54125, 26969, 55418, 2871, 11519, 51371, 24683, 12524, 45657, 19665, 1569, 50845, 46919}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{11138, 43900, 6486, 1281}, new char[]{35465, 7949, 10742, 59610}, (char) (55849 - (ViewConfiguration.getScrollBarSize() >> 8)), (-1) - TextUtils.indexOf((CharSequence) "", '0'), new char[]{43447, 55489, 8407, 61493, 9781, 45800, 20828, 29360, 64678, 25885, 43896, 45502, 17027, 42373, 58412, 62529, 61402, 10273}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = INotificationSideChannel + 75;
                    cancelAll = i9 % 128;
                    int i10 = i9 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{11138, 43900, 6486, 1281}, new char[]{64505, 32289, 56120, 64095}, (char) ((Process.myPid() >> 22) + 24539), TextUtils.getCapsMode("", 0, 0), new char[]{30539, 45670, 50566, 65154, 5552, 14569, 41434, 24441, 5964, 53069, 54601, 8627, 21367, 51268, 24241, 6900}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{11138, 43900, 6486, 1281}, new char[]{26599, 9883, 22205, 17676}, (char) (Color.blue(0) + 3158), View.MeasureSpec.getSize(0), new char[]{60780, 158, 56257, 7145, 59494, 55422, 26436, 35997, 21936, 42699, 12467, 39536, 9210, 53814, 50408, 56790}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i11 = INotificationSideChannel + 9;
            cancelAll = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 122747133};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[16];
                byte b8 = (byte) (b7 + 1);
                byte b9 = b7;
                Object[] objArr13 = new Object[1];
                f(b8, b9, (byte) (b9 + 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b10 = bArr2[16];
                byte b11 = (byte) (-b10);
                Object[] objArr14 = new Object[1];
                f(b11, (byte) (b11 | 22), (byte) (-b10), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (31533 - TextUtils.indexOf("", ""));
                    int iAxisFromString = 920 - MotionEvent.axisFromString("");
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                    byte b12 = $$a[7];
                    byte b13 = b12;
                    Object[] objArr16 = new Object[1];
                    c(b12, b13, (byte) (b13 | 36), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iAxisFromString, maxKeyCode, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new char[]{11138, 43900, 6486, 1281}, new char[]{32609, 21756, 27489, 49085}, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ViewConfiguration.getTouchSlop() >> 8, new char[]{56344, 56066, 55207, 40132, 46218, 7904, 8305, 203, 45601, 47633, 7588, 25448, 52037, 61888, 37622, 36343, 22597, 33102, 31576, 54539, 62401, 46484}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{11138, 43900, 6486, 1281}, new char[]{24339, 18282, 6699, 22117}, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25882), 726100575 - View.MeasureSpec.getSize(0), new char[]{57611, 30715, 42560, 52527, 38175, 43465, 8695, 28764, 27811, 50917, 42676, 5796, 29494, 58750, 45321}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 31533);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
                        byte[] bArr3 = $$a;
                        byte b14 = bArr3[7];
                        byte b15 = bArr3[80];
                        Object[] objArr19 = new Object[1];
                        c(b14, b15, (byte) (b15 | 52), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, scrollBarFadeDuration, tapTimeout, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31532);
                        int gidForName = 920 - Process.getGidForName("");
                        int iMyTid = 28 - (Process.myTid() >> 22);
                        byte b16 = $$a[80];
                        byte b17 = b16;
                        Object[] objArr20 = new Object[1];
                        c(b16, b17, b17, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, gidForName, iMyTid, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr == null) {
                throw null;
            }
            for (String str3 : strArr) {
                arrayList.add(str3);
            }
            throw null;
        }
        int i13 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i14 = ~iMaxMemory;
        int i15 = i13 + 2102834215 + (((~(1031536251 | i14)) | 742543392) * 220) + (((~(i14 | 759395891)) | 1014683752) * (-440)) + ((iMaxMemory | 1031536251) * 220);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr21[0])[0] = i17 ^ (i17 << 5);
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            int i18 = INotificationSideChannel + 123;
            cancelAll = i18 % 128;
            int i19 = i18 % 2;
            List<SubscribedProgram> list = userAsBinder.INotificationSideChannel;
            if (list != null) {
                List<SubscribedProgram> list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (SubscribedProgram subscribedProgram : list2) {
                    String str4 = subscribedProgram.b;
                    String str5 = str4 == null ? "" : str4;
                    String strSubstring = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (strSubstring == null) {
                        int i20 = ((int[]) objArr21[0])[0];
                        int i21 = i20 * i20;
                        int i22 = -(332390066 * i20);
                        int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                        int i24 = -(i20 * 1564353982);
                        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                        int i26 = ((i25 | (-686494656)) << 1) - ((-686494656) ^ i25);
                        int i27 = i26 >> 17;
                        int i28 = (((((-65535) | i27) << 1) - (i27 ^ (-65535))) / 32768) + 1;
                        int i29 = (i26 & i28) + (i28 | i26);
                        int i30 = ((i26 >> 23) - 1023) / 512;
                        int i31 = -(i29 ^ ((i30 & 1) + (i30 | 1)));
                        int i32 = (i31 & 1) + (i31 | 1);
                        int i33 = i32 >> 26;
                        int i34 = ((i33 & ComposerKt.defaultsKey) + (i33 | ComposerKt.defaultsKey)) / 64;
                        strSubstring = "28,".substring(1701 / (((-((((i34 | 1) << 1) - (i34 ^ 1)) + 1)) & i32) * 567));
                    }
                    String str6 = strSubstring;
                    String str7 = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    String str8 = str7 == null ? "" : str7;
                    String str9 = subscribedProgram.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (str9 == null) {
                        int i35 = INotificationSideChannel + 41;
                        cancelAll = i35 % 128;
                        int i36 = i35 % 2;
                        str = "";
                    } else {
                        str = str9;
                    }
                    String str10 = subscribedProgram.g;
                    if (str10 == null) {
                        int i37 = INotificationSideChannel + 107;
                        cancelAll = i37 % 128;
                        if (i37 % 2 != 0) {
                            int i38 = 3 / 2;
                        }
                        str2 = "";
                    } else {
                        str2 = str10;
                    }
                    arrayList2.add(new SyariahChooseKpjModel(str6, str8, false, str, str2, str5));
                }
                return arrayList2;
            }
        }
        return null;
    }

    public static /* synthetic */ createBaseCaptureSession TuitionPaymentFragmentspecialinlinedviewModeldefault3(CameraCharacteristicsApi28Impl cameraCharacteristicsApi28Impl) throws Throwable {
        int i = 2 % 2;
        SyariahChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1 syariahChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1 = new SyariahChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1(cameraCharacteristicsApi28Impl);
        Context contextRequireContext = cameraCharacteristicsApi28Impl.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        List<SyariahChooseKpjModel> listAsBinder = cameraCharacteristicsApi28Impl.asBinder();
        if (listAsBinder == null) {
            int i2 = cancelAll + 51;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listAsBinder = CollectionsKt.emptyList();
            int i3 = INotificationSideChannel + 41;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
        }
        return new createBaseCaptureSession(contextRequireContext, listAsBinder, syariahChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1);
    }

    static {
        onTransact = 1;
        a();
        INSTANCE = new Companion(null);
        int i = notify + 77;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 99 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CameraCharacteristicsApi28Impl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CameraCharacteristicsApi28Impl cameraCharacteristicsApi28Impl, SyariahChooseKpjModel syariahChooseKpjModel) {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, 1696957250, new Object[]{cameraCharacteristicsApi28Impl, syariahChooseKpjModel}, -1696957249, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater3);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 11;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        int i = 2 % 2;
        int i2 = cancelAll + 63;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, 847209192, new Object[]{this}, -847209192, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater3);
    }

    static void a() {
        f106a = -6737398075910148429L;
        g = -981105359;
        cancel = (char) 34097;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancelAll + 13;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static String $$g(byte b, int i, byte b2) {
        int i2 = (i * 2) + 4;
        int i3 = 104 - b2;
        int i4 = b * 3;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2++;
            i3 = i4 + i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i2];
            i2++;
            i3 += b3;
        }
    }
}
