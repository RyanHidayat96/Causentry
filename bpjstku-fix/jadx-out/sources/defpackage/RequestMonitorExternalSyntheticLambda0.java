package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.vocation.model.request.TrainingFieldRequest;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.vocation.model.TrainingField;
import com.bpjstku.presentation.vocational.bottomsheets.TrainingFieldBottomSheetFragment$adapter$2$1;
import com.bpjstku.presentation.vocational.bottomsheets.TrainingFieldBottomSheetFragment$handleItemClicked$1;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0010\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001d0\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0015\u0010\u001e\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001a\u0010\u0014\u001a\u00020&8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b\u0016\u0010(R\u0016\u0010\u0012\u001a\u00020)8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010*"}, d2 = {"LRequestMonitorExternalSyntheticLambda0;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/vocation/model/TrainingField;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/domain/vocation/model/TrainingField;)V", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "Lkotlin/Lazy;", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "a", "Ljava/util/List;", "asInterface", "Lcom/bpjstku/domain/vocation/model/TrainingField;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "asBinder", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "LexcludeProblematicOutputSizesByClass;", "", "I", "()I", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestMonitorExternalSyntheticLambda0 extends unregisterMediaButtonEventReceiver {
    private static int INotificationSideChannelDefault;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] cancel;
    private static int cancelAll;
    private static boolean notify;
    private static boolean onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<TrainingField, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<TrainingField>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private CodeNamePair b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private TrainingField TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {Base64.padSymbol, -108, 49, -100};
    private static final int $$f = 193;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, -56, 58, -24, 12, -2, -63, 52, 14, -6, 9, 1, -9, 10, -71, 54, -3, 19, -19, -51, 71, -2, -14, 13, -68, 63, 2, -11, 1, 7, -62, 68, -13, 12, 4, -16, 14, 1, -70, 39, 27, -12, -3, 19, -15, -33, 33, 17, -13, -6, 2, -17, 27, -4, -6, 9};
    private static final int $$e = 55;
    private static final byte[] $$a = {43, 23, 22, -14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 51;
    private static int RemoteActionCompatParcelizer = 1;
    private static int INotificationSideChannel = 0;
    private static int INotificationSideChannelStubProxy = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = ~i2;
        int i10 = i8 | (~(i9 | i4));
        int i11 = (~(i2 | i4)) | (~((~i4) | i7 | i9));
        int i12 = i7 | i4 | i9;
        int i13 = i4 + i6 + i3 + (1362283521 * i5) + ((-853422242) * i);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i4) - 1228931072) + ((-782767794) * i6) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i3 * 465567744) + (465567744 * i5) + (1887436800 * i) + ((-1154482176) * i14);
        int i16 = ((i4 * 722868660) - 41817558) + (i6 * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i3 * 722869185) + (i5 * 1172694977) + (i * (-747618338)) + (i14 * 791674880);
        return i15 + ((i16 * i16) * 751828992) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : b(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r0 = defpackage.RequestMonitorExternalSyntheticLambda0.$$a
            int r8 = r8 * 52
            int r8 = 53 - r8
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r6 = r6 + r3
            int r7 = r7 + 1
            int r6 = r6 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RequestMonitorExternalSyntheticLambda0.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.RequestMonitorExternalSyntheticLambda0.$$d
            int r8 = r8 * 52
            int r1 = 53 - r8
            int r6 = r6 + 98
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RequestMonitorExternalSyntheticLambda0.f(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RequestMonitorExternalSyntheticLambda0(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = INotificationSideChannel + 93;
            INotificationSideChannelStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 77 / 0;
            }
            int i4 = 2 % 2;
            function1 = null;
        }
        this(function1);
    }

    public static final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(RequestMonitorExternalSyntheticLambda0 requestMonitorExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy;
        int i3 = i2 + 95;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        Function1<TrainingField, Unit> function1 = requestMonitorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i5 = i2 + 41;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return function1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RequestMonitorExternalSyntheticLambda0 requestMonitorExternalSyntheticLambda0, TrainingField trainingField) {
        int i = 2 % 2;
        requestMonitorExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1 = trainingField;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new TrainingFieldBottomSheetFragment$handleItemClicked$1(requestMonitorExternalSyntheticLambda0, trainingField, null), 3, null);
        int i2 = INotificationSideChannelStubProxy + 3;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestMonitorExternalSyntheticLambda0(Function1<? super TrainingField, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        final RequestMonitorExternalSyntheticLambda0 requestMonitorExternalSyntheticLambda0 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.bottomsheets.TrainingFieldBottomSheetFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() {
                LifecycleOwner lifecycleOwner = requestMonitorExternalSyntheticLambda0;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreviewDelayWhenVideoCaptureIsBoundQuirk.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CollectionsKt.emptyList();
        this.a = LazyKt.lazy(new Function0() { // from class: lambdacreateMonitorListener1androidxcameracamera2internalcompatworkaroundRequestMonitor
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RequestMonitorExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        this.d = R.layout.fragment_general_list_bottom_sheet;
    }

    /* JADX INFO: renamed from: RequestMonitorExternalSyntheticLambda0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LRequestMonitorExternalSyntheticLambda0$b;", "", "<init>", "()V", "Lcom/bpjstku/domain/vocation/model/TrainingField;", "p0", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p1", "Lkotlin/Function1;", "", "p2", "LRequestMonitorExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/domain/vocation/model/TrainingField;Lcom/bpjstku/domain/general/model/CodeNamePair;Lkotlin/jvm/functions/Function1;)LRequestMonitorExternalSyntheticLambda0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static RequestMonitorExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3(TrainingField p0, CodeNamePair p1, Function1<? super TrainingField, Unit> p2) {
            Intrinsics.checkNotNullParameter(p1, "");
            RequestMonitorExternalSyntheticLambda0 requestMonitorExternalSyntheticLambda0 = new RequestMonitorExternalSyntheticLambda0(p2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("training_field", p0);
            bundle.putParcelable("city", p1);
            requestMonitorExternalSyntheticLambda0.setArguments(bundle);
            return requestMonitorExternalSyntheticLambda0;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        RequestMonitorExternalSyntheticLambda0 requestMonitorExternalSyntheticLambda0 = (RequestMonitorExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 27;
        int i3 = i2 % 128;
        INotificationSideChannelStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = requestMonitorExternalSyntheticLambda0.d;
        int i6 = i3 + 63;
        INotificationSideChannel = i6 % 128;
        if (i6 % 2 == 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBindingInflate = FragmentGeneralListBottomSheetBinding.inflate(p0, p1, false);
        this.g = fragmentGeneralListBottomSheetBindingInflate;
        if (fragmentGeneralListBottomSheetBindingInflate == null) {
            int i2 = INotificationSideChannel + 95;
            INotificationSideChannelStubProxy = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = INotificationSideChannelStubProxy + 105;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            fragmentGeneralListBottomSheetBindingInflate = null;
        }
        LinearLayout root = fragmentGeneralListBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        LinearLayout linearLayout = root;
        int i6 = INotificationSideChannel + 95;
        INotificationSideChannelStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return linearLayout;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        CodeNamePair codeNamePair = null;
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentbindingInflater1 = arguments != null ? (TrainingField) arguments.getParcelable("training_field") : null;
            int i2 = INotificationSideChannelStubProxy + 97;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            int i4 = INotificationSideChannelStubProxy + 63;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            Parcelable parcelable = arguments2.getParcelable("city");
            if (i5 != 0) {
                throw null;
            }
            codeNamePair = (CodeNamePair) parcelable;
        }
        this.b = codeNamePair;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 83;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        excludeProblematicOutputSizesByClass excludeproblematicoutputsizesbyclass = (excludeProblematicOutputSizesByClass) this.a.getValue();
        excludeproblematicoutputsizesbyclass.d.clear();
        excludeproblematicoutputsizesbyclass.notifyDataSetChanged();
        ((excludeProblematicOutputSizesByClass) this.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.g;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = null;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((excludeProblematicOutputSizesByClass) this.a.getValue());
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = this.g;
        if (fragmentGeneralListBottomSheetBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentGeneralListBottomSheetBinding2 = fragmentGeneralListBottomSheetBinding3;
        }
        fragmentGeneralListBottomSheetBinding2.tvTitle.setText(getString(R.string.label_training_field));
        TrainingField trainingField = this.TuitionPaymentFragmentbindingInflater1;
        if (trainingField != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(trainingField);
            int i4 = INotificationSideChannelStubProxy + 67;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[PHI: r2
  0x0020: PHI (r2v5 com.bpjstku.domain.general.model.CodeNamePair) = (r2v4 com.bpjstku.domain.general.model.CodeNamePair), (r2v7 com.bpjstku.domain.general.model.CodeNamePair) binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        CodeNamePair codeNamePair;
        String str;
        RequestMonitorExternalSyntheticLambda0 requestMonitorExternalSyntheticLambda0 = (RequestMonitorExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 75;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            codeNamePair = requestMonitorExternalSyntheticLambda0.b;
            int i3 = 94 / 0;
            if (codeNamePair != null) {
                str = codeNamePair.b;
            } else {
                str = null;
            }
        } else {
            codeNamePair = requestMonitorExternalSyntheticLambda0.b;
            if (codeNamePair != null) {
                str = codeNamePair.b;
            } else {
                str = null;
            }
        }
        if (str == null) {
            int i4 = INotificationSideChannel + 63;
            INotificationSideChannelStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str = "";
        }
        final PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) requestMonitorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<VirtualCameraAdapter1<List<TrainingField>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TrainingFieldRequest(str))));
        final Function1 function1 = new Function1() { // from class: PreviewStretchWhenVideoCaptureIsBoundQuirk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(previewDelayWhenVideoCaptureIsBoundQuirk, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: isSamsungJ5
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: isSamsungJ1AceNeo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentbindingInflater1(previewDelayWhenVideoCaptureIsBoundQuirk, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: RepeatingStreamConstraintForVideoRecordingQuirk
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        int i = 2 % 2;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d.observe(this, new Observer() { // from class: getRequestsProcessedFuture
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RequestMonitorExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = INotificationSideChannel + 43;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TrainingField p0) {
        int i = 2 % 2;
        Iterable iterable = ((excludeProblematicOutputSizesByClass) this.a.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
            lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((TrainingField) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            ((excludeProblematicOutputSizesByClass) this.a.getValue()).d.set(i2, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
            if (Intrinsics.areEqual(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((TrainingField) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                int i3 = INotificationSideChannelStubProxy + 29;
                INotificationSideChannel = i3 % 128;
                int i4 = i3 % 2;
                FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.g;
                if (fragmentGeneralListBottomSheetBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentGeneralListBottomSheetBinding = null;
                }
                RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
                int i5 = i2 + 4;
                if (((excludeProblematicOutputSizesByClass) this.a.getValue()).d.size() > i5) {
                    int i6 = INotificationSideChannel;
                    int i7 = i6 + 93;
                    INotificationSideChannelStubProxy = i7 % 128;
                    int i8 = i7 % 2;
                    if (i2 > 4) {
                        int i9 = i6 + 37;
                        INotificationSideChannelStubProxy = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 59 / 0;
                        }
                    } else {
                        i5 = i2;
                    }
                } else {
                    i5 = i2;
                }
                recyclerView.scrollToPosition(i5);
            }
            i2++;
        }
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = cancel;
        char c = '0';
        int i4 = 0;
        if (cArr3 != null) {
            int i5 = $11 + 123;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr3[i2]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", i4, i4) + 31339);
                        int pressedStateDuration = 2994 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int mirror = AndroidCharacter.getMirror(c) - 31;
                        byte b = (byte) i4;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, pressedStateDuration, mirror, 1182129903, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i2++;
                    c = '0';
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(cancelAll)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43324 - ((byte) KeyEvent.getModifierMetaStateMask())), (Process.myTid() >> 22) + 253, TextUtils.indexOf((CharSequence) "", '0') + 23, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i6 = 1687675375;
        if (!onTransact) {
            if (!notify) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i7 = $10 + 41;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33601 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3086, Gravity.getAbsoluteGravity(0, 0) + 26, -2146875848, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $11 + 11;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i11 = $10 + 75;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 % 1) % getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >> i] % iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 33602), 3084 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), -2146875848, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33601), 3085 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 25 - TextUtils.indexOf((CharSequence) "", '0', 0), -2146875848, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                i6 = 1687675375;
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char gidForName = (char) (Process.getGidForName("") + 37568);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 625;
            int mirror = AndroidCharacter.getMirror('0') - '\"';
            byte[] bArr = $$a;
            byte b = bArr[7];
            byte b2 = (byte) (-bArr[5]);
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, windowTouchSlop, mirror, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 37567);
            int capsMode = 625 - TextUtils.getCapsMode("", 0, 0);
            int iBlue = Color.blue(0) + 14;
            byte[] bArr2 = $$a;
            byte b3 = (byte) (-bArr2[5]);
            Object[] objArr5 = new Object[1];
            c(b3, b3, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, capsMode, iBlue, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = INotificationSideChannelStubProxy + 87;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37567);
                int iResolveSizeAndState = 625 - View.resolveSizeAndState(0, 0, 0);
                int i4 = 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr3 = $$a;
                byte b4 = (byte) (-bArr3[5]);
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iResolveSizeAndState, i4, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iMyPid = Process.myPid();
            int i7 = ((((-1001994936) + (((-1781266121) | iMyPid) * 376)) + (((~((~iMyPid) | 189591392)) | (-1802502121)) * (-376))) + (((~(iMyPid | (-189591393))) | 1634146728) * 376)) - 1836165803;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[]{i6}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(null, null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(null, null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(null, null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), new byte[]{-98, -100, -99, -98, -98, -91, -90, -96, -98, -100, -90, -91, -127, -90, -89, -127, -95, -92, -116, -99, -90, -91, -95, -99, -127, -90, -93, -93, -96, -100, -127, -96, -96, -91, -125, -92, -93, -98, -94, -116, -98, -94, -94, -95, -116, -97, -93, -94, -95, -127, -116, -116, -95, -99, -99, -96, -97, -99, -98, -127, -127, -99, -116, -100}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(null, null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), new byte[]{-99, -97, -89, -127, -91, -100, -99, -112, -100, -92, -91, -98, -96, -96, -112, -96, -92, -92, -91, -94, -97, -99, -116, -100, -100, -127, -116, -91, -93, -95, -98, -96, -90, -96, -96, -92, -96, -98, -91, -98, -97, -99, -94, -95, -92, -97, -92, -100, -91, -99, -100, -116, -98, -89, -99, -116, -94, -98, -95, -89, -97, -125, -127, -112}, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i10 = INotificationSideChannel + 89;
            INotificationSideChannelStubProxy = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -1836165803};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[11];
                byte b7 = (byte) (b6 - 1);
                Object[] objArr15 = new Object[1];
                f(b6, b7, b7, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b8 = bArr4[11];
                byte b9 = (byte) (b8 - 1);
                byte b10 = b8;
                Object[] objArr16 = new Object[1];
                f(b9, b10, b10, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i12 = ((int[]) objArr[0])[0];
                int i13 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i14 = INotificationSideChannel + 95;
                    INotificationSideChannelStubProxy = i14 % 128;
                    int i15 = i14 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char minimumFlingVelocity = (char) (37567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int i16 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 624;
                        int iLastIndexOf = 13 - TextUtils.lastIndexOf("", '0');
                        byte[] bArr5 = $$a;
                        byte b11 = (byte) (-bArr5[5]);
                        byte b12 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(b11, b12, b12, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, i16, iLastIndexOf, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(null, null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(null, null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 37567);
                            int jumpTapTimeout = 625 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i17 = 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte[] bArr6 = $$a;
                            byte b13 = (byte) (-bArr6[5]);
                            Object[] objArr20 = new Object[1];
                            c(b13, b13, bArr6[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, jumpTapTimeout, i17, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 37567);
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 625;
                            int i18 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
                            byte[] bArr7 = $$a;
                            byte b14 = bArr7[7];
                            byte b15 = (byte) (-bArr7[5]);
                            Object[] objArr21 = new Object[1];
                            c(b14, b15, b15, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, iKeyCodeFromString, i18, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[2])[0];
        if (i20 != i19) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i20));
        }
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[2])[0];
        int i23 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr2 = {i22};
        int[] iArr3 = {i23};
        int iIdentityHashCode = System.identityHashCode(this);
        int i24 = ~((-848481405) | iIdentityHashCode);
        int i25 = 1255063624 + ((9617520 | i24) * (-280)) + ((i24 | (~((-975256717) | iIdentityHashCode))) * 140);
        int i26 = ~((-838863885) | iIdentityHashCode);
        int i27 = ~iIdentityHashCode;
        int i28 = i21 + i25 + (((~(i27 | (-136392833))) | i26 | (~((-9617521) | i27))) * 140);
        int i29 = (i28 << 13) ^ i28;
        int i30 = i29 ^ (i29 >>> 17);
        ((int[]) objArr[1])[0] = i30 ^ (i30 << 5);
        Object[] objArr22 = {iArr3, new int[1], iArr2, strArr4};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r11 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r2 = r2 + 107;
        defpackage.RequestMonitorExternalSyntheticLambda0.INotificationSideChannel = r2 % 128;
        r2 = r2 % 2;
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r11 = r3.msvGeneralList;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "");
        r11.setViewState(com.kennyc.view.MultiStateView.ViewState.LOADING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if ((r12 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r1 = r11.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r5 = r3.msvGeneralList;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        defpackage.Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r12).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, null, null);
        r12 = r11.requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, "");
        r1 = r11.getString(com.bpjstku.R.string.message_no_trainings_available);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        defpackage.AutoValue_LifecycleCameraRepository_Key.b(r12, r1);
        r11.dismiss();
        r11 = defpackage.RequestMonitorExternalSyntheticLambda0.INotificationSideChannel + 103;
        defpackage.RequestMonitorExternalSyntheticLambda0.INotificationSideChannelStubProxy = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if ((r11 % 2) != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        r11 = 49 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if ((!(r12 instanceof VirtualCameraAdapter1.asBinder)) == true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        r2 = r2 + 25;
        defpackage.RequestMonitorExternalSyntheticLambda0.INotificationSideChannel = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        if ((r2 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        r1 = r11.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r1 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        r1 = r3.msvGeneralList;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r1.setViewState(com.kennyc.view.MultiStateView.ViewState.CONTENT);
        r12 = (java.util.List) ((VirtualCameraAdapter1.asBinder) r12).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        r1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r12, 10));
        r12 = r12.iterator();
        r2 = defpackage.RequestMonitorExternalSyntheticLambda0.INotificationSideChannelStubProxy + 47;
        defpackage.RequestMonitorExternalSyntheticLambda0.INotificationSideChannel = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if ((r2 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        r0 = 2 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (r12.hasNext() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        r1.add(new defpackage.lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((com.bpjstku.domain.vocation.model.TrainingField) r12.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00da, code lost:
    
        r11.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1;
        r12 = (defpackage.excludeProblematicOutputSizesByClass) r11.a.getValue();
        r12.d.clear();
        r12.notifyDataSetChanged();
        ((defpackage.excludeProblematicOutputSizesByClass) r11.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(r11.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        r12 = r11.TuitionPaymentFragmentbindingInflater1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fd, code lost:
    
        if (r12 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ff, code lost:
    
        r11.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0103, code lost:
    
        r11 = r11.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0105, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if ((r12 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((r12 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r11 = r11.g;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(defpackage.RequestMonitorExternalSyntheticLambda0 r11, defpackage.VirtualCameraAdapter1 r12) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RequestMonitorExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(RequestMonitorExternalSyntheticLambda0, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ excludeProblematicOutputSizesByClass TuitionPaymentFragmentbindingInflater1(RequestMonitorExternalSyntheticLambda0 requestMonitorExternalSyntheticLambda0) {
        int i = 2 % 2;
        Context contextRequireContext = requestMonitorExternalSyntheticLambda0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        excludeProblematicOutputSizesByClass excludeproblematicoutputsizesbyclass = new excludeProblematicOutputSizesByClass(contextRequireContext, null, new TrainingFieldBottomSheetFragment$adapter$2$1(requestMonitorExternalSyntheticLambda0), 2, null);
        int i2 = INotificationSideChannel + 51;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return excludeproblematicoutputsizesbyclass;
        }
        throw null;
    }

    static {
        INotificationSideChannelDefault = 0;
        a();
        INSTANCE = new Companion(null);
        int i = RemoteActionCompatParcelizer + 123;
        INotificationSideChannelDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestMonitorExternalSyntheticLambda0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentbindingInflater1 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(applyAppLocales.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, new Object[]{this}, 548350417, iTuitionPaymentFragmentbindingInflater3, -548350416)).intValue();
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        int iTuitionPaymentFragmentbindingInflater1 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(applyAppLocales.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, new Object[]{this}, -227803738, iTuitionPaymentFragmentbindingInflater3, 227803738);
    }

    static void a() {
        cancel = new char[]{47377, 47364, 47374, 47360, 47363, 47369, 47300, 47423, 47391, 47417, 47422, 47373, 47365, 47343, 47366, 47375, 47367, 47362, 47328, 47345, 47420, 47390, 47370, 47421, 47368, 47371, 47338, 47296, 47372, 47376, 47356, 47353, 47357, 47355, 47297, 47359, 47358, 47354, 47298};
        cancelAll = 2047719602;
        notify = true;
        onTransact = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, int r8) {
        /*
            int r8 = r8 + 67
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = defpackage.RequestMonitorExternalSyntheticLambda0.$$c
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RequestMonitorExternalSyntheticLambda0.$$g(byte, byte, int):java.lang.String");
    }
}
