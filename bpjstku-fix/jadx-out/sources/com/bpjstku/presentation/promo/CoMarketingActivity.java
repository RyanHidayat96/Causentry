package com.bpjstku.presentation.promo;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda10;
import com.bpjstku.data.promo.model.request.FlagDeeplinkRequest;
import com.bpjstku.data.promo.model.request.OrderMerchant;
import com.bpjstku.data.promo.model.request.SearchMerchant;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import com.bpjstku.databinding.ActivityCoMarketingBinding;
import com.bpjstku.domain.ict.model.IctTokenModel;
import com.bpjstku.domain.promo.model.ListMerchant;
import com.bpjstku.domain.promo.model.VoucherItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.ict.WebViewIctActivity;
import com.bpjstku.presentation.promo.CoMarketingActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.kennyc.view.MultiStateView;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControl;
import defpackage.Camera2CameraControlExternalSyntheticLambda0;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.addCaptureRequestOptionsInternal;
import defpackage.addTask;
import defpackage.cacheInteropConfig;
import defpackage.clearCaptureRequestOptionsInternal;
import defpackage.deriveCodec;
import defpackage.generateCameraId;
import defpackage.getConcurrentCameraSelectors;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl;
import defpackage.lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.performItemAction;
import defpackage.refresh;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setActiveInternal;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\tB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0002¢\u0006\u0004\b\b\u0010\u0017J;\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0002¢\u0006\u0004\b\t\u0010\u0017J#\u0010\b\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\b\u0010\u0018J#\u0010\u0019\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0006R\u0015\u0010\u001c\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0015\u0010\u001f\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0016\u0010\b\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010!R\u0016\u0010\t\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0016\u0010\u0019\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010 \u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010&R\u0016\u0010\u000b\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00150\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0015\u0010*\u001a\u00020)8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0015\u0010'\u001a\u00020+8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u000f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010,R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00020-8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010/"}, d2 = {"Lcom/bpjstku/presentation/promo/CoMarketingActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityCoMarketingBinding;", "LaddCaptureRequestOptionsInternal$TuitionPaymentFragmentbindingInflater1;", "LclearCaptureRequestOptionsInternal$TuitionPaymentFragmentbindingInflater1;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "cancelAll", "INotificationSideChannel", "", "p0", "p1", "", "Lcom/bpjstku/data/promo/model/request/SearchMerchant;", "p2", "Lcom/bpjstku/data/promo/model/request/OrderMerchant;", "p3", "(IILjava/util/List;Ljava/util/List;)V", "(Ljava/lang/Integer;)V", "g", "Lrefresh;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LperformItemAction;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "I", "", "onTransact", "Ljava/lang/String;", "", "Z", "cancel", "Ljava/util/List;", "LlambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl;", "notify", "LlambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl;", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CoMarketingActivity extends BindingBaseActivity<ActivityCoMarketingBinding> implements addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1, clearCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 {
    private static long INotificationSideChannel;
    private static int MediaBrowserCompat;
    private static char RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private boolean d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {21, ByteCompanionObject.MAX_VALUE, 49, -115};
    private static final int $$f = 77;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {23, -73, 107, 5, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 174;
    private static int getInterfaceDescriptor = 0;
    private static int INotificationSideChannelDefault = 0;
    private static int INotificationSideChannelStub = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private int TuitionPaymentFragmentbindingInflater1 = 10;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private int b = 5;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private String g = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String asInterface = "";

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private List<SearchMerchant> asBinder = CollectionsKt.listOf(new SearchMerchant("=", "AKTIF", "STATUS_PROMO"));

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List<OrderMerchant> a = CollectionsKt.listOf(new OrderMerchant("desc", "KODE_PKS"));

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy notify = LazyKt.lazy(new Function0() { // from class: onCaptureSessionClosing
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy cancel = LazyKt.lazy(new Function0() { // from class: getClosingCaptureSession
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = i2 | i6;
        int i8 = ~i4;
        int i9 = i7 | i8;
        int i10 = ~(i8 | i2);
        int i11 = (~i7) | i10;
        int i12 = i10 | (~((~i2) | (~i6)));
        int i13 = i2 + i6 + i5 + (1699743442 * i3) + (2071835342 * i);
        int i14 = i13 * i13;
        int i15 = ((i2 * (-557635572)) - 1375207424) + ((-557635572) * i6) + (i9 * (-2106796043)) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i5) + ((-648019968) * i3) + ((-1801453568) * i) + (1296564224 * i14);
        int i16 = ((i2 * (-355764420)) - 259725689) + (i6 * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + (i5 * (-355763899)) + (i3 * 2119243930) + (i * (-943812730)) + (i14 * (-597164032));
        switch (i15 + (i16 * i16 * 58195968)) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 2:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 4:
                return b(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return g(objArr);
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = 196 - r6
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.presentation.promo.CoMarketingActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.CoMarketingActivity.c(short, byte, byte, java.lang.Object[]):void");
    }

    public CoMarketingActivity() {
        final CoMarketingActivity coMarketingActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<refresh>() { // from class: com.bpjstku.presentation.promo.CoMarketingActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, refresh] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ refresh invoke() {
                LifecycleOwner lifecycleOwner = coMarketingActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(refresh.class);
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
        final CoMarketingActivity coMarketingActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<performItemAction>() { // from class: com.bpjstku.presentation.promo.CoMarketingActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, performItemAction] */
            @Override // kotlin.jvm.functions.Function0
            public final performItemAction invoke() {
                ComponentCallbacks componentCallbacks = coMarketingActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(performItemAction.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // clearCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Integer num) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 27;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        b(num.intValue(), this.b, CollectionsKt.emptyList(), this.a);
        int i4 = INotificationSideChannelDefault + 47;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Integer num, RecyclerView recyclerView) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 117;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(recyclerView, "");
        if (i3 != 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(iIntValue, this.TuitionPaymentFragmentbindingInflater1, this.asBinder, this.a);
            throw null;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iIntValue, this.TuitionPaymentFragmentbindingInflater1, this.asBinder, this.a);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityCoMarketingBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 3;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        CoMarketingActivity$bindingInflater$1 coMarketingActivity$bindingInflater$1 = CoMarketingActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = INotificationSideChannelStub + 121;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return coMarketingActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityCoMarketingBinding activityCoMarketingBinding = (ActivityCoMarketingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityCoMarketingBinding.tvSearchMerchant.setOnClickListener(new View.OnClickListener() { // from class: forceOnClosed
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        activityCoMarketingBinding.toolbarComar.setNavigationOnClickListener(new View.OnClickListener() { // from class: CaptureSessionRepository
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
        activityCoMarketingBinding.cvPromos.setOnClickListener(new View.OnClickListener() { // from class: getSessionsInOrder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoMarketingActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        activityCoMarketingBinding.btnUsePromo.setOnClickListener(new View.OnClickListener() { // from class: getCreatingCaptureSessions
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, view);
            }
        });
        int i2 = INotificationSideChannelStub + 49;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        this.d = getIntent().getBooleanExtra("isDeeplink", false);
        String stringExtra = getIntent().getStringExtra("deeplinkParams");
        if (stringExtra == null) {
            int i2 = INotificationSideChannelStub + 113;
            int i3 = i2 % 128;
            INotificationSideChannelDefault = i3;
            if (i2 % 2 != 0) {
                int i4 = 41 / 0;
            }
            int i5 = i3 + 37;
            INotificationSideChannelStub = i5 % 128;
            int i6 = i5 % 2;
            stringExtra = "";
        }
        this.asInterface = stringExtra;
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
        int i3 = $11 + 23;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 % 2;
        }
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8329 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1235, 35 - Color.blue(0), -653973969, false, $$i(b, b2, (byte) (b2 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.argb(0, 0, 0, 0), 2764 - TextUtils.getCapsMode("", 0, 0), 14 - Color.argb(0, 0, 0, 0), 1504416861, false, $$i(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 43325), 252 - TextUtils.lastIndexOf("", '0', 0), 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - View.resolveSize(0, 0)), 2890 - MotionEvent.axisFromString(""), View.MeasureSpec.makeMeasureSpec(0, 0) + 17, 2012627446, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (INotificationSideChannel ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) notify) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) RemoteActionCompatParcelizer) ^ (-6377398940819159759L)))));
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
        int i5 = $10 + 53;
        $11 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final CoMarketingActivity coMarketingActivity = (CoMarketingActivity) objArr[0];
        int i = 2 % 2;
        CoMarketingActivity coMarketingActivity2 = coMarketingActivity;
        ((refresh) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).g.observe(coMarketingActivity2, new Observer() { // from class: onCreateCaptureSession
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Object[] objArr2 = {this.b, (VirtualCameraAdapter1) obj};
                int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
                int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
                CoMarketingActivity.TuitionPaymentFragmentbindingInflater1(addTask.TuitionPaymentFragmentbindingInflater1(), 1296485673, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, -1296485668, objArr2);
            }
        });
        ((refresh) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).asBinder.observe(coMarketingActivity2, new Observer() { // from class: onCaptureSessionConfigureFail
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                CoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((performItemAction) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.observe(coMarketingActivity2, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: cameraClosed
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((refresh) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(coMarketingActivity2, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: onCaptureSessionCreated
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = INotificationSideChannelDefault + 63;
        INotificationSideChannelStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 35;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.d && this.asInterface.length() > 0) {
            int i3 = INotificationSideChannelDefault + 27;
            INotificationSideChannelStub = i3 % 128;
            int i4 = i3 % 2;
            final refresh refreshVar = (refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String str = this.asInterface;
            Intrinsics.checkNotNullParameter(str, "");
            MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = refreshVar.TuitionPaymentFragmentbindingInflater1;
            VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            User userAsBinder = refreshVar.asInterface.asBinder();
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(refreshVar.d.TuitionPaymentFragmentbindingInflater1(new FlagDeeplinkRequest(str, String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null)))));
            final Function1 function1 = new Function1() { // from class: getExposureCompensationIndex
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return refresh.b(refreshVar, (BaseItem) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: failActionFuture
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: completeCancelFuture
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return refresh.TuitionPaymentFragmentspecialinlinedviewModeldefault1(refreshVar, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: executeMeteringAction
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        cancelAll();
        INotificationSideChannel();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ActivityCoMarketingBinding activityCoMarketingBinding = (ActivityCoMarketingBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        CoMarketingActivity coMarketingActivity = this;
        Intrinsics.checkNotNullParameter(coMarketingActivity, "");
        coMarketingActivity.getWindow().addFlags(8192);
        RecyclerView recyclerView = activityCoMarketingBinding.rvMerchant;
        CoMarketingActivity coMarketingActivity2 = this;
        recyclerView.setLayoutManager(new GridLayoutManager(coMarketingActivity2, 2));
        recyclerView.addItemDecoration(new getConcurrentCameraSelectors(2));
        recyclerView.setAdapter((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) this.notify.getValue());
        lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol = (lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) this.notify.getValue();
        lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityCoMarketingBinding.rvMerchant);
        lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.g = this;
        RecyclerView recyclerView2 = activityCoMarketingBinding.rvVoucher;
        recyclerView2.setLayoutManager(new LinearLayoutManager(coMarketingActivity2, 0, false));
        recyclerView2.setAdapter((lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) this.cancel.getValue());
        final lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol = (lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) this.cancel.getValue();
        RecyclerView recyclerView3 = activityCoMarketingBinding.rvVoucher;
        lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.f357a = recyclerView3;
        setActiveInternal setactiveinternal = new setActiveInternal() { // from class: clearCaptureRequestOptionsInternal.2
            public AnonymousClass2() {
            }

            @Override // defpackage.setActiveInternal
            public final int b() {
                return clearCaptureRequestOptionsInternal.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.intValue();
            }

            @Override // defpackage.setActiveInternal
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i2, int i3, int i4, RecyclerView recyclerView4) {
                clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3(clearCaptureRequestOptionsInternal.this);
                clearCaptureRequestOptionsInternal.this.d.TuitionPaymentFragmentbindingInflater1(Integer.valueOf(i2));
                clearCaptureRequestOptionsInternal.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Integer.valueOf(i2);
                clearCaptureRequestOptionsInternal.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Integer.valueOf(i3);
            }
        };
        lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.b = setactiveinternal;
        RecyclerView.LayoutManager layoutManager = (RecyclerView.LayoutManager) Objects.requireNonNull(recyclerView3.getLayoutManager());
        Intrinsics.checkNotNullParameter(layoutManager, "");
        if (!(!(layoutManager instanceof GridLayoutManager))) {
            setactiveinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = layoutManager;
            setactiveinternal.d *= ((GridLayoutManager) layoutManager).getSpanCount();
        } else if (layoutManager instanceof LinearLayoutManager) {
            setactiveinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = layoutManager;
            int i2 = INotificationSideChannelStub + 51;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            int i4 = INotificationSideChannelDefault + 105;
            INotificationSideChannelStub = i4 % 128;
            if (i4 % 2 == 0) {
                setactiveinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = layoutManager;
                setactiveinternal.d += ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
            } else {
                setactiveinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = layoutManager;
                setactiveinternal.d *= ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
            }
        }
        lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.d = this;
    }

    private final void cancelAll() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 3;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol = (lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) this.notify.getValue();
        Camera2CameraControl camera2CameraControl = lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.f253a;
        camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera2CameraControl.b;
        camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        camera2CameraControl.TuitionPaymentFragmentbindingInflater1 = true;
        lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.asInterface.addOnScrollListener(lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.f253a);
        ((refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, this.asBinder, this.a);
        int i4 = INotificationSideChannelStub + 83;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 89;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol = (lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) this.cancel.getValue();
        setActiveInternal setactiveinternal = lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.b;
        setactiveinternal.b = setactiveinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        setactiveinternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        setactiveinternal.TuitionPaymentFragmentbindingInflater1 = true;
        lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.f357a.addOnScrollListener(lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.b);
        ((refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, CollectionsKt.emptyList(), this.a);
        int i4 = INotificationSideChannelStub + 31;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int p0, int p1, List<SearchMerchant> p2, List<OrderMerchant> p3) {
        int i = 2 % 2;
        ((refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, p1, p2, p3).observe(this, new Observer() { // from class: forceFinishCloseStaleSessions
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                CoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = INotificationSideChannelStub + 15;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void b(int p0, int p1, List<SearchMerchant> p2, List<OrderMerchant> p3) {
        int i = 2 % 2;
        refresh refreshVar = (refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        final MutableLiveData mutableLiveData = new MutableLiveData();
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(refreshVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new VoucherRequest(String.valueOf(p0), String.valueOf(p1), "JMO", p2, p3))));
        final Function1 function1 = new Function1() { // from class: getDefaultExposureState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refresh.TuitionPaymentFragmentbindingInflater1(mutableLiveData, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: lambdasetExposureCompensationIndex1androidxcameracamera2internalExposureControl
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: lambdasetExposureCompensationIndex2androidxcameracamera2internalExposureControl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refresh.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableLiveData, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ExposureControlExternalSyntheticLambda2
            private static final byte[] $$c = {119, -102, -34, -3};
            private static final int $$f = 170;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {7, 15, 25, 25, -9, -26, 23, -40, -11, -16, 28, -35, -20, -18, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
            private static final int $$e = 101;
            private static final byte[] $$a = {93, -122, -23, -24, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 99;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static int[] TuitionPaymentFragmentbindingInflater1 = {1958568200, -2064477524, 1590243842, 1009375189, 1904479258, 1570574402, 1195456206, -1574451617, 837798305, 1968894548, -1738890680, 97373060, -1917686532, 2129083514, 73048751, 404392332, 1487728137, -1017108552};

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.ExposureControlExternalSyntheticLambda2.$$a
                    int r8 = r8 * 14
                    int r8 = r8 + 84
                    int r1 = 53 - r7
                    int r6 = r6 + 4
                    byte[] r1 = new byte[r1]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r0 != 0) goto L15
                    r8 = r6
                    r3 = r7
                    r4 = r2
                    goto L2e
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r8
                    int r6 = r6 + 1
                    r1[r3] = r4
                    if (r3 != r7) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2e:
                    int r3 = r3 + r6
                    int r6 = r3 + (-10)
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ExposureControlExternalSyntheticLambda2.a(int, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 + 4
                    byte[] r0 = defpackage.ExposureControlExternalSyntheticLambda2.$$d
                    int r8 = r8 * 42
                    int r8 = r8 + 11
                    int r6 = r6 * 19
                    int r6 = r6 + 84
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r7 = r8
                    r4 = r2
                    goto L2e
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r7 = r7 + 1
                    int r3 = r3 + 1
                    if (r3 != r8) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    r4 = r0[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2e:
                    int r6 = -r6
                    int r7 = r7 + r6
                    int r6 = r7 + (-11)
                    r7 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ExposureControlExternalSyntheticLambda2.d(byte, byte, byte, java.lang.Object[]):void");
            }

            private static void c(int[] iArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
                int i4 = -1870535734;
                int i5 = 1;
                int i6 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $10 + 61;
                        $11 = i8 % 128;
                        if (i8 % 2 == 0) {
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[i6] = Integer.valueOf(iArr2[i7]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b = (byte) i6;
                                    byte b2 = (byte) (b - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", i6, i6), (ViewConfiguration.getTapTimeout() >> 16) + 3291, 31 - ((Process.getThreadPriority(i6) + 20) >> 6), 1948206109, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                                }
                                iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = (byte) (b3 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 3292 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 31, 1948206109, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i7++;
                        }
                        i4 = -1870535734;
                        i6 = 0;
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i9 = 0;
                    while (i9 < length3) {
                        int i10 = $10 + 59;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            Object[] objArr4 = new Object[i5];
                            objArr4[0] = Integer.valueOf(iArr5[i9]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.normalizeMetaState(0), 3291 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getOffsetBefore("", 0) + 31, 1948206109, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        } else {
                            length3 = length3;
                            Object[] objArr5 = {Integer.valueOf(iArr5[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getOffsetAfter("", 0), 3291 - Color.blue(0), Color.alpha(0) + 31, 1948206109, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            i9++;
                        }
                        length3 = length3;
                        i5 = 1;
                    }
                    iArr5 = iArr6;
                }
                char c = 0;
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    for (int i11 = 17; i11 > 1; i11--) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                        Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 2607 - AndroidCharacter.getMirror('0'), 29 - (ViewConfiguration.getScrollBarSize() >> 8), 683220507, false, $$g(b9, b10, (byte) (-b10)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    }
                    int i12 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i13 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr7 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 28879), 349 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    c = 0;
                }
                objArr[0] = new String(cArr2, 0, i2);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x020d  */
            @Override // defpackage.logToString
            public final void accept(Object obj) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                int i5 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 921;
                    int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                    byte[] bArr = $$a;
                    byte b = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b, (byte) (b & 52), bArr[37], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, iIndexOf, i6, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new int[]{1565453294, -1730912356, -2121862593, -1332032294, -1392055551, 1990655613, -1217022107, 439449699, 67491038, -900914510, 259585448, -884767680, -322681786, 1394984231}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new int[]{1464542991, -1105931432, 487996524, 963366774, -212975176, -663426673, 763662536, 157688295, 1371088632, -403744730}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 921;
                    int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[7];
                    byte b3 = bArr2[80];
                    Object[] objArr5 = new Object[1];
                    a(b2, b3, b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, jumpTapTimeout, fadingEdgeLength, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                    int i8 = i7 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 31534);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 921;
                        int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
                        byte[] bArr3 = $$a;
                        Object[] objArr6 = new Object[1];
                        a((byte) 51, bArr3[33], bArr3[80], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iNormalizeMetaState, bitsPerPixel, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i9 = ((int[]) objArr7[3])[0];
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i9}, (String[]) objArr7[4]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i10 = ~startElapsedRealtime;
                    int i11 = (-1876061013) + ((~(157853560 | i10)) * (-560)) + ((~(startElapsedRealtime | (-1611988996))) * (-560)) + (((~(1616226083 | i10)) | 153616472) * 560) + 1580931670;
                    int i12 = (i11 << 13) ^ i11;
                    int i13 = i12 ^ (i12 >>> 17);
                    ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new int[]{2112279826, 25632769, 133618151, 2041348431, -395500559, 868492704, 1348994653, 1556239351, -141222868, -1237106573, 2113600697, 745647399, -44467852, -1424042031, -1551928489, -329601234}, View.resolveSize(0, 0) + 26, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new int[]{2137238666, 995817646, -1412527305, -1496252829, -946364057, -491724362, -991606784, -552205878, -1451016198, 1137571667, -1929809186, 267852233}, 18 - KeyEvent.normalizeMetaState(0), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                            int i15 = i14 % 2;
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
                    c(new int[]{1188858601, -804125823, 637898433, -1472772546, -1071723507, -1777193234, -404055357, -1084275192, 2054254377, 222452860}, View.MeasureSpec.getSize(0) + 16, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new int[]{-1829301725, -1700142942, -745376699, 835637869, 799643948, 1904439014, -658379155, -941521846, -114548553, 622489445}, (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i17 = 4 % 4;
                    }
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1580931670};
                        byte[] bArr4 = $$d;
                        byte b4 = bArr4[15];
                        Object[] objArr13 = new Object[1];
                        d(b4, (byte) (-b4), bArr4[17], objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        Object[] objArr14 = new Object[1];
                        d(bArr4[17], (byte) (-bArr4[4]), bArr4[15], objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 31534);
                            int i18 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 920;
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 29;
                            byte[] bArr5 = $$a;
                            Object[] objArr16 = new Object[1];
                            a((byte) 51, bArr5[33], bArr5[80], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, i18, iLastIndexOf, -1142834547, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new int[]{1565453294, -1730912356, -2121862593, -1332032294, -1392055551, 1990655613, -1217022107, 439449699, 67491038, -900914510, 259585448, -884767680, -322681786, 1394984231}, TextUtils.indexOf("", "") + 22, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new int[]{1464542991, -1105931432, 487996524, 963366774, -212975176, -663426673, 763662536, 157688295, 1371088632, -403744730}, 14 - TextUtils.lastIndexOf("", '0'), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 922;
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                                byte[] bArr6 = $$a;
                                byte b5 = bArr6[7];
                                byte b6 = bArr6[80];
                                Object[] objArr19 = new Object[1];
                                a(b5, b6, b6, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, packedPositionChild, longPressTimeout, -778300370, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
                                int threadPriority = 921 - ((Process.getThreadPriority(0) + 20) >> 6);
                                int i19 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27;
                                byte[] bArr7 = $$a;
                                byte b7 = bArr7[7];
                                Object[] objArr20 = new Object[1];
                                a(b7, (byte) (b7 & 52), bArr7[37], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, threadPriority, i19, -1048449946, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr = objArr15;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
                    int i20 = ((int[]) objArr[0])[0];
                    int i21 = ((int[]) objArr[3])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i21}, (String[]) objArr[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i22 = i20 + 2106421723 + (((~((-1717940275) | iIdentityHashCode)) | 37785632) * 576) + (((~((~iIdentityHashCode) | (-1680154643))) | 18353737) * 576) + 289687552;
                    int i23 = (i22 << 13) ^ i22;
                    int i24 = i23 ^ (i23 >>> 17);
                    ((int[]) objArr21[0])[0] = i24 ^ (i24 << 5);
                    function2.invoke(obj);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr == null) {
                    throw null;
                }
                int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i26 = i25 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
                int i27 = i26 % 2;
                int i28 = i25 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
                int i29 = i28 % 2;
                while (i5 < strArr.length) {
                    arrayList.add(strArr[i5]);
                    i5++;
                    int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i30 % 128;
                    int i31 = i30 % 2;
                }
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r7, int r8, byte r9) {
                /*
                    int r9 = r9 * 56
                    int r9 = r9 + 66
                    int r8 = r8 + 4
                    int r7 = r7 * 3
                    int r7 = 1 - r7
                    byte[] r0 = defpackage.ExposureControlExternalSyntheticLambda2.$$c
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r9 = r8
                    r5 = r2
                    goto L2b
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r9
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L23:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                    r6 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r6
                L2b:
                    int r8 = -r8
                    int r8 = r8 + r3
                    r3 = r5
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ExposureControlExternalSyntheticLambda2.$$g(byte, int, byte):java.lang.String");
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        mutableLiveData.observe(this, new Observer() { // from class: CaptureSessionRepository1
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                CoMarketingActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = INotificationSideChannelStub + 15;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        CoMarketingActivity coMarketingActivity = (CoMarketingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 71;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2, coMarketingActivity.TuitionPaymentFragmentbindingInflater1, coMarketingActivity.asBinder, coMarketingActivity.a);
            throw null;
        }
        coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2, coMarketingActivity.TuitionPaymentFragmentbindingInflater1, coMarketingActivity.asBinder, coMarketingActivity.a);
        int i3 = INotificationSideChannelDefault + 71;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.promo.CoMarketingActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/bpjstku/presentation/promo/CoMarketingActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "isDeeplink", "", "deeplinkParams", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context context, boolean z, String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) CoMarketingActivity.class);
            intent.putExtra("isDeeplink", z);
            intent.putExtra("deeplinkParams", str);
            context.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        CoMarketingActivity coMarketingActivity = (CoMarketingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 81;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        coMarketingActivity.b(coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2, coMarketingActivity.b, CollectionsKt.emptyList(), coMarketingActivity.a);
        int i4 = INotificationSideChannelStub + 81;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 107;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 29944);
                int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                int i3 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                Object[] objArr2 = new Object[1];
                c((short) 193, (byte) 37, $$a[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, offsetBefore, i3, 986134021, false, (String) objArr2[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            throw null;
        }
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
            int i4 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
            int maximumDrawingCacheSize = 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            Object[] objArr3 = new Object[1];
            c((short) 193, (byte) 37, $$a[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, i4, maximumDrawingCacheSize, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                int iIndexOf = TextUtils.indexOf("", "", 0) + 1755;
                int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                Object[] objArr4 = new Object[1];
                c((short) 156, (byte) 52, $$a[7], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iIndexOf, i5, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 110401661;
            int i6 = (-1936367475) + (((~(iCodePointAt | 134405746)) | 78196679) * 191) + (((~((~iCodePointAt) | 134405746)) | 78193029) * 191) + 207616181;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{45614, 29652, 53259, 51279}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_instruction_text).substring(0, 32).codePointAt(20) + 20328), View.combineMeasuredStates(0, 0), new char[]{20814, 19487, 30438, 31194, 1984, 17399, 44748, 907, 761, 32635, 41672, 55615, 6827, 38602, 38823, 22023}, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{7778, 40728, 37930, 29959}, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1940), Drawable.resolveOpacity(0, 0), new char[]{18581, 50520, 54474, 63828, 3346, 4677, 33721, 7179, 6201, 3634, 42135, 37910, 23861, 55049, 49719, 62417}, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr8 = {169312738};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42050 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1726 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr8), 207616181);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", ""));
                    int iResolveSize = View.resolveSize(0, 0) + 1755;
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                    Object[] objArr9 = new Object[1];
                    c((short) 156, (byte) 52, $$a[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, iResolveSize, threadPriority, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{37619, 9593, 45073, 2801}, (char) Color.alpha(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_done_step3).substring(1, 7).length() - 6, new char[]{42899, 62706, 3968, 58593, 34337, 25292, 55885, 3339, 25467, 16402, 49785, 63606, 53178, 281, 37588, 20833, 23983, 55706, 17374, 33385, 11043, 36794}, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{24467, 34572, 27477, 40753}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step1).substring(0, 1).length() + 12650), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step6).substring(38, 43).length() + 1434913882, new char[]{9509, 33012, 17429, 12858, 23854, 38380, 29876, 33825, 9493, 14915, 15739, 12150, 62999, 5870, 53632}, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
                        int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                        short s = (short) 104;
                        Object[] objArr12 = new Object[1];
                        c(s, (byte) (s >>> 1), $$a[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, absoluteGravity, i9, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int gidForName = Process.getGidForName("") + 1756;
                        int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                        Object[] objArr13 = new Object[1];
                        c((short) 193, (byte) 37, $$a[7], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, gidForName, i10, 986134021, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    int i11 = INotificationSideChannelStub + 25;
                    INotificationSideChannelDefault = i11 % 128;
                    int i12 = i11 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i14 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int i16 = ~((int) SystemClock.elapsedRealtime());
            int i17 = i15 + 751559090 + ((~((-142672053) | i16)) * (-783)) + (((~(i16 | (-468259517))) | (-680861943)) * 783);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr14[3])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i20 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iMyUid = Process.myUid();
            int i21 = ~iMyUid;
            int i22 = i20 + 1299435422 + (((~(i21 | 175329630)) | 37272795) * (-1042)) + ((175329630 | iMyUid) * 521) + (((~(iMyUid | (-37272796))) | 36704346 | (~(i21 | 175898079))) * 521);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr15[3])[0] = i24 ^ (i24 << 5);
            int i25 = INotificationSideChannelDefault + 113;
            INotificationSideChannelStub = i25 % 128;
            int i26 = i25 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int i27 = 1032 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int trimmedLength = 15 - TextUtils.getTrimmedLength("");
            short s2 = (short) 52;
            Object[] objArr16 = new Object[1];
            c(s2, (byte) s2, $$a[7], objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cArgb, i27, trimmedLength, 1357589585, false, (String) objArr16[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr17 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{37619, 9593, 45073, 2801}, (char) Gravity.getAbsoluteGravity(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_5).substring(6, 7).length() - 1, new char[]{42899, 62706, 3968, 58593, 34337, 25292, 55885, 3339, 25467, 16402, 49785, 63606, 53178, 281, 37588, 20833, 23983, 55706, 17374, 33385, 11043, 36794}, objArr17);
        Class<?> cls3 = Class.forName((String) objArr17[0]);
        Object[] objArr18 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{24467, 34572, 27477, 40753}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_save_card).substring(0, 1).codePointAt(0) + 12568), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1434913887, new char[]{9509, 33012, 17429, 12858, 23854, 38380, 29876, 33825, 9493, 14915, 15739, 12150, 62999, 5870, 53632}, objArr18);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cArgb2 = (char) Color.argb(0, 0, 0, 0);
            int mode = View.MeasureSpec.getMode(0) + 1031;
            int absoluteGravity2 = 15 - Gravity.getAbsoluteGravity(0, 0);
            Object[] objArr19 = new Object[1];
            c((short) 156, (byte) 52, $$a[7], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cArgb2, mode, absoluteGravity2, 1344079056, false, (String) objArr19[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char gidForName2 = (char) (Process.getGidForName("") + 1);
                int touchSlop = 1031 - (ViewConfiguration.getTouchSlop() >> 8);
                int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 15;
                byte[] bArr = $$a;
                short s3 = bArr[7];
                Object[] objArr20 = new Object[1];
                c(s3, (byte) s3, bArr[5], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(gidForName2, touchSlop, offsetBefore2, 632103528, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr21[3])[0];
            int i29 = ((int[]) objArr21[1])[0];
            String[] strArr2 = (String[]) objArr21[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i30 = ~(935329786 | iIdentityHashCode);
            int i31 = 471570717 + ((102797376 | i30) * (-476)) + (i30 * 952) + ((~((~iIdentityHashCode) | 935329786)) * 476) + 1904233866;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr[2])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{45614, 29652, 53259, 51279}, (char) (20432 - TextUtils.indexOf("", "")), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{20814, 19487, 30438, 31194, 1984, 17399, 44748, 907, 761, 32635, 41672, 55615, 6827, 38602, 38823, 22023}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{7778, 40728, 37930, 29959}, (char) (1940 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), KeyEvent.keyCodeFromString(""), new char[]{18581, 50520, 54474, 63828, 3346, 4677, 33721, 7179, 6201, 3634, 42135, 37910, 23861, 55049, 49719, 62417}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {169312738};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46037 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.getCapsMode("", 0, 0) + 1134, 18 - (ViewConfiguration.getScrollBarSize() >> 8), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr25 = {Integer.valueOf(iIntValue2), 0, 1904233866, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char absoluteGravity3 = (char) Gravity.getAbsoluteGravity(0, 0);
                int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                int maximumDrawingCacheSize2 = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                short s4 = (short) 52;
                Object[] objArr26 = new Object[1];
                c(s4, (byte) s4, $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(absoluteGravity3, iAxisFromString, maximumDrawingCacheSize2, 1298546779, false, (String) objArr26[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), View.combineMeasuredStates(0, 0) + 1117, 17 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr25);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cRed = (char) Color.red(0);
                int maximumFlingVelocity = 1031 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int defaultSize = 15 - View.getDefaultSize(0, 0);
                byte[] bArr2 = $$a;
                short s5 = bArr2[7];
                Object[] objArr27 = new Object[1];
                c(s5, (byte) s5, bArr2[5], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRed, maximumFlingVelocity, defaultSize, 632103528, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr28 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{37619, 9593, 45073, 2801}, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step5).substring(10, 11).length() - 1, new char[]{42899, 62706, 3968, 58593, 34337, 25292, 55885, 3339, 25467, 16402, 49785, 63606, 53178, 281, 37588, 20833, 23983, 55706, 17374, 33385, 11043, 36794}, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{24467, 34572, 27477, 40753}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minute).substring(0, 1).codePointAt(0) + 12542), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step7).substring(15, 16).codePointAt(0) + 1434913786, new char[]{9509, 33012, 17429, 12858, 23854, 38380, 29876, 33825, 9493, 14915, 15739, 12150, 62999, 5870, 53632}, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iMyTid = 1031 - (Process.myTid() >> 22);
                    int defaultSize2 = 15 - View.getDefaultSize(0, 0);
                    Object[] objArr30 = new Object[1];
                    c((short) 156, (byte) 52, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollDefaultDelay, iMyTid, defaultSize2, 1344079056, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int iRgb = Color.rgb(0, 0, 0) + 16777231;
                    short s6 = (short) 52;
                    Object[] objArr31 = new Object[1];
                    c(s6, (byte) s6, $$a[7], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(keyRepeatDelay, iLastIndexOf, iRgb, 1357589585, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i34 = ((int[]) objArr[1])[0];
        int i35 = ((int[]) objArr[3])[0];
        if (i35 == i34) {
            int i36 = INotificationSideChannelDefault + 63;
            INotificationSideChannelStub = i36 % 128;
            int i37 = i36 % 2;
            Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i38 = ((int[]) objArr[2])[0];
            int i39 = ((int[]) objArr[3])[0];
            int i40 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i41 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i42 = ~i41;
            int i43 = (~((-228569186) | i42)) | 9416704;
            int i44 = ~(i41 | 234863465);
            int i45 = i38 + (((i43 | i44) * (-252)) - 1677677719) + ((i44 | (~(i42 | (-219152482)))) * 252);
            int i46 = i45 ^ (i45 << 13);
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr32[2])[0] = i47 ^ (i47 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i48 = 0;
            while (i48 < strArr4.length) {
                int i49 = INotificationSideChannelDefault + 39;
                INotificationSideChannelStub = i49 % 128;
                if (i49 % 2 == 0) {
                    arrayList2.add(strArr4[i48]);
                    i48 += 38;
                } else {
                    arrayList2.add(strArr4[i48]);
                    i48++;
                }
            }
        }
        Toast.makeText((Context) null, i35 / (((i35 - 1) * i35) % 2), 0).show();
        Object[] objArr33 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i50 = ((int[]) objArr[2])[0];
        int i51 = ((int[]) objArr[3])[0];
        int i52 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i53 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i54 = ~i53;
        int i55 = i50 + (-1414244419) + ((i53 | 35913728) * 988) + (((~(37065906 | i54)) | 206062085) * (-1976)) + (((~(i53 | (-207214264))) | 35913728 | (~(207214263 | i54))) * 988);
        int i56 = (i55 << 13) ^ i55;
        int i57 = i56 ^ (i56 >>> 17);
        ((int[]) objArr33[2])[0] = i57 ^ (i57 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1467191213
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.CoMarketingActivity.onResume():void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        CoMarketingActivity coMarketingActivity = (CoMarketingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 71;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            if (i3 != (-1666274896) + (((-23233537) | startElapsedRealtime) * (-381)) + (((~((~startElapsedRealtime) | (-962825944))) | 1049197271) * 381) + 262042624) {
                throw null;
            }
        } else {
            int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            if (i4 != 550387624 + (((~((-700691443) | elapsedCpuTime)) | 549695794) * 1504) + ((~(elapsedCpuTime | (-150995649))) * (-1504)) + 805838784) {
                throw null;
            }
        }
        int i5 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
        if (i5 != (-1082856870) + (((~(startElapsedRealtime2 | 653654806)) | (-1995963223)) * 305) + (((~((~startElapsedRealtime2) | 653654806)) | (-1925401159)) * 305)) {
            throw new RuntimeException("1050804498");
        }
        super.onStart();
        int i6 = INotificationSideChannelStub + 13;
        INotificationSideChannelDefault = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -725927966
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.promo.CoMarketingActivity.INotificationSideChannelStub
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.bpjstku.presentation.promo.CoMarketingActivity.INotificationSideChannelDefault = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.cacheInteropConfig.b
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            long r4 = r4.totalMemory()
            int r4 = (int) r4
            int r4 = ~r4
            r5 = -838867969(0xffffffffcdffe3ff, float:-5.366415E8)
            r6 = r4 | r5
            int r6 = ~r6
            r7 = 8880425(0x878129, float:1.2444126E-38)
            r6 = r6 | r7
            int r6 = r6 * (-828)
            r7 = -864906616(0xffffffffcc729288, float:-6.3588896E7)
            int r7 = r7 + r6
            r4 = r4 | r5
            int r4 = r4 * (-828)
            int r7 = r7 + r4
            r4 = -1202024448(0xffffffffb85a9000, float:-5.210936E-5)
            int r7 = r7 + r4
            if (r1 != r7) goto Lb6
            java.lang.reflect.Member[] r1 = defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            java.lang.String r4 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r4)
            java.lang.String r5 = "currentApplication"
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r2 = r4.getMethod(r5, r2)
            r4 = r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r2 = r2.invoke(r3, r3)
            android.content.Context r2 = (android.content.Context) r2
            android.content.Context r2 = r2.getApplicationContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            r4 = -1535067558(0xffffffffa480ba5a, float:-5.582684E-17)
            int r2 = r2 + r4
            r4 = 2130698239(0x7effdfff, float:1.700581E38)
            r5 = r4 | r2
            int r5 = ~r5
            r6 = 77861016(0x4a41098, float:3.8571454E-36)
            r5 = r5 | r6
            int r5 = r5 * 449
            r7 = 285143084(0x10fef02c, float:1.0055538E-28)
            int r5 = r5 + r7
            int r2 = ~r2
            r2 = r2 | r4
            int r2 = ~r2
            r2 = r2 | r6
            int r2 = r2 * 449
            int r5 = r5 + r2
            if (r1 == r5) goto La6
            int r1 = com.bpjstku.presentation.promo.CoMarketingActivity.INotificationSideChannelStub
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.bpjstku.presentation.promo.CoMarketingActivity.INotificationSideChannelDefault = r2
            int r1 = r1 % r0
            r1 = -725927966(0xffffffffd4bb37e2, float:-6.4327715E12)
            int[] r1 = new int[r1]
            r2 = -725927967(0xffffffffd4bb37e1, float:-6.432771E12)
            r4 = 1
            r1[r2] = r4
            r2 = 732146594(0x2ba3aba2, float:1.1629484E-12)
            int r2 = r2 % r0
            r2 = -1
            r1 = r1[r2]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r4)
            r1.show()
        La6:
            super.onCreate(r9)
            int r9 = com.bpjstku.presentation.promo.CoMarketingActivity.INotificationSideChannelDefault
            int r9 = r9 + 103
            int r1 = r9 % 128
            com.bpjstku.presentation.promo.CoMarketingActivity.INotificationSideChannelStub = r1
            int r9 = r9 % r0
            if (r9 == 0) goto Lb5
            return
        Lb5:
            throw r3
        Lb6:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.CoMarketingActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoMarketingActivity coMarketingActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 19;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                SearchCoMarketingActivity.Companion companion = SearchCoMarketingActivity.INSTANCE;
                SearchCoMarketingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coMarketingActivity);
                ViewPortBuilder.b();
                obj.hashCode();
                throw null;
            }
            SearchCoMarketingActivity.Companion companion2 = SearchCoMarketingActivity.INSTANCE;
            SearchCoMarketingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coMarketingActivity);
            ViewPortBuilder.b();
            int i4 = INotificationSideChannelStub + 51;
            INotificationSideChannelDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl TuitionPaymentFragmentspecialinlinedviewModeldefault3(final CoMarketingActivity coMarketingActivity) {
        int i = 2 % 2;
        lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol = new lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl(coMarketingActivity, null, new Function1() { // from class: getCaptureSessions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.b, (ListMerchant) obj};
                int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
                int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
                return (Unit) CoMarketingActivity.TuitionPaymentFragmentbindingInflater1(addTask.TuitionPaymentFragmentbindingInflater1(), 1866370251, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, -1866370250, objArr);
            }
        }, 2, null);
        int i2 = INotificationSideChannelDefault + 99;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            return lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoMarketingActivity coMarketingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub;
        int i3 = i2 + 109;
        INotificationSideChannelDefault = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            ((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.notify.getValue()).g();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.notify.getValue()).TuitionPaymentFragmentbindingInflater1();
            ((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.notify.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            int i4 = i2 + 89;
            INotificationSideChannelDefault = i4 % 128;
            if (i4 % 2 == 0) {
                ((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.notify.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return;
            } else {
                ((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.notify.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i5 = 86 / 0;
                return;
            }
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || ((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.notify.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() == 0) {
            return;
        }
        int i6 = INotificationSideChannelStub + 115;
        INotificationSideChannelDefault = i6 % 128;
        int i7 = i6 % 2;
        ((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.notify.getValue()).TuitionPaymentFragmentbindingInflater1();
        ((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.notify.getValue()).b();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(CoMarketingActivity coMarketingActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 1;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                coMarketingActivity.finish();
                ViewPortBuilder.b();
                int i4 = 24 / 0;
            } else {
                coMarketingActivity.finish();
                ViewPortBuilder.b();
            }
            int i5 = INotificationSideChannelDefault + 33;
            INotificationSideChannelStub = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        CoMarketingActivity coMarketingActivity = (CoMarketingActivity) objArr[0];
        ListMerchant listMerchant = (ListMerchant) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 23;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(listMerchant, "");
        DetailPromoActivity.Companion companion = DetailPromoActivity.INSTANCE;
        DetailPromoActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coMarketingActivity, listMerchant.g, false, null);
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannelStub + 35;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void b(CoMarketingActivity coMarketingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 13;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol = (lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.cancel.getValue();
            lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Boolean.TRUE;
            List<Data> list = lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentbindingInflater1;
            if (list.get(list.size() - 1) == null) {
                lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.notifyItemChanged(lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentbindingInflater1.size() - 1);
                return;
            } else {
                lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentbindingInflater1.add(null);
                lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.notifyDataSetChanged();
                return;
            }
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            ((lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.cancel.getValue()).TuitionPaymentFragmentbindingInflater1();
            ((lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.cancel.getValue()).TuitionPaymentFragmentbindingInflater1((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            int i5 = i3 + 31;
            INotificationSideChannelStub = i5 % 128;
            int i6 = i5 % 2;
            lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol2 = (lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.cancel.getValue();
            List<Data> list2 = lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol2.TuitionPaymentFragmentbindingInflater1;
            if (list2.get(list2.size() - 1) == null) {
                lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol2.TuitionPaymentFragmentbindingInflater1.remove((Object) null);
                lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol2.notifyItemRemoved(lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol2.TuitionPaymentFragmentbindingInflater1.size() - 1);
                lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol2.f357a.removeOnScrollListener(lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol2.b);
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i7 = i3 + 17;
            INotificationSideChannelStub = i7 % 128;
            if (i7 % 2 == 0) {
                ((lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.cancel.getValue()).TuitionPaymentFragmentbindingInflater1.size();
                throw null;
            }
            if (((lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.cancel.getValue()).TuitionPaymentFragmentbindingInflater1.size() != 0) {
                ((lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.cancel.getValue()).TuitionPaymentFragmentbindingInflater1();
                lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol3 = (lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.cancel.getValue();
                lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Boolean.FALSE;
                lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol3.f357a.removeOnScrollListener(lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol3.b);
                List<Data> list3 = lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol3.TuitionPaymentFragmentbindingInflater1;
                if (list3.get(list3.size() - 1) == null) {
                    lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol3.notifyItemChanged(lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol3.TuitionPaymentFragmentbindingInflater1.size() - 1);
                }
            }
        }
    }

    public static /* synthetic */ lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl TuitionPaymentFragmentspecialinlinedviewModeldefault2(final CoMarketingActivity coMarketingActivity) {
        int i = 2 % 2;
        lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol = new lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl(coMarketingActivity, null, new Function1() { // from class: onCaptureSessionClosed
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VoucherItem) obj);
            }
        }, 2, null);
        int i2 = INotificationSideChannelDefault + 91;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoMarketingActivity coMarketingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        int i2 = INotificationSideChannelStub + 49;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            coMarketingActivity.IconCompatParcelizer();
            List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (list.isEmpty()) {
                ((ActivityCoMarketingBinding) ((ViewBinding) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvNewVoucher.setVisibility(8);
                ((ActivityCoMarketingBinding) ((ViewBinding) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvVoucher.setVisibility(8);
                return;
            } else {
                ((ActivityCoMarketingBinding) ((ViewBinding) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvNewVoucher.setVisibility(0);
                ((ActivityCoMarketingBinding) ((ViewBinding) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvVoucher.setVisibility(0);
                ((lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.cancel.getValue()).TuitionPaymentFragmentbindingInflater1(list);
                return;
            }
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            coMarketingActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (Intrinsics.areEqual(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), "DATA NOT FOUND")) {
                return;
            }
            int i4 = INotificationSideChannelDefault + 85;
            INotificationSideChannelStub = i4 % 128;
            if (i4 % 2 != 0) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coMarketingActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coMarketingActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                int i5 = 9 / 0;
            }
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoMarketingActivity coMarketingActivity, VoucherItem voucherItem) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 35;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(voucherItem, "");
        if (Intrinsics.areEqual(voucherItem.getInterfaceDescriptor, "Y")) {
            coMarketingActivity.g = voucherItem.INotificationSideChannelStub;
            ((performItemAction) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1("PROMO");
            int i4 = INotificationSideChannelDefault + 47;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            DetailPromoActivity.Companion companion = DetailPromoActivity.INSTANCE;
            DetailPromoActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coMarketingActivity, voucherItem.asBinder, true, voucherItem);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = INotificationSideChannelDefault + 11;
        INotificationSideChannelStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 89 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(CoMarketingActivity coMarketingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i;
        Object obj;
        int i2;
        int i3 = 2 % 2;
        int i4 = INotificationSideChannelDefault;
        int i5 = i4 + 45;
        int i6 = i5 % 128;
        INotificationSideChannelStub = i6;
        if (i5 % 2 == 0) {
            int i7 = 17 / 0;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                coMarketingActivity.MediaBrowserCompat();
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                i2 = i6 + 87;
                INotificationSideChannelDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    coMarketingActivity.IconCompatParcelizer();
                    IctTokenModel ictTokenModel = (IctTokenModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    WebViewIctActivity.Companion bVar = WebViewIctActivity.INSTANCE;
                    WebViewIctActivity.Companion.b(coMarketingActivity, coMarketingActivity.g, ictTokenModel.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "PROMO");
                    int i8 = 52 / 0;
                } else {
                    coMarketingActivity.IconCompatParcelizer();
                    IctTokenModel ictTokenModel2 = (IctTokenModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    WebViewIctActivity.Companion bVar2 = WebViewIctActivity.INSTANCE;
                    WebViewIctActivity.Companion.b(coMarketingActivity, coMarketingActivity.g, ictTokenModel2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "PROMO");
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                i = i4 + 85;
                INotificationSideChannelStub = i % 128;
                obj = null;
                if (i % 2 != 0) {
                    coMarketingActivity.IconCompatParcelizer();
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coMarketingActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                    obj.hashCode();
                    throw null;
                }
                coMarketingActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coMarketingActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            coMarketingActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            i2 = i6 + 87;
            INotificationSideChannelDefault = i2 % 128;
            if (i2 % 2 != 0) {
                coMarketingActivity.IconCompatParcelizer();
                IctTokenModel ictTokenModel3 = (IctTokenModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                WebViewIctActivity.Companion bVar3 = WebViewIctActivity.INSTANCE;
                WebViewIctActivity.Companion.b(coMarketingActivity, coMarketingActivity.g, ictTokenModel3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "PROMO");
                int i9 = 52 / 0;
            } else {
                coMarketingActivity.IconCompatParcelizer();
                IctTokenModel ictTokenModel4 = (IctTokenModel) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                WebViewIctActivity.Companion bVar4 = WebViewIctActivity.INSTANCE;
                WebViewIctActivity.Companion.b(coMarketingActivity, coMarketingActivity.g, ictTokenModel4.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "PROMO");
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            i = i4 + 85;
            INotificationSideChannelStub = i % 128;
            obj = null;
            if (i % 2 != 0) {
                coMarketingActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coMarketingActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                obj.hashCode();
                throw null;
            }
            coMarketingActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coMarketingActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        Unit unit = Unit.INSTANCE;
        int i10 = INotificationSideChannelDefault + 43;
        INotificationSideChannelStub = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoMarketingActivity coMarketingActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 29;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                DetailVoucherActivity.Companion tuitionPaymentFragmentbindingInflater1 = DetailVoucherActivity.INSTANCE;
                DetailVoucherActivity.Companion.b(coMarketingActivity);
                ViewPortBuilder.b();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            DetailVoucherActivity.Companion tuitionPaymentFragmentbindingInflater2 = DetailVoucherActivity.INSTANCE;
            DetailVoucherActivity.Companion.b(coMarketingActivity);
            ViewPortBuilder.b();
            int i4 = INotificationSideChannelStub + 87;
            INotificationSideChannelDefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(CoMarketingActivity coMarketingActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 53;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            DetailVoucherActivity.Companion tuitionPaymentFragmentbindingInflater1 = DetailVoucherActivity.INSTANCE;
            DetailVoucherActivity.Companion.b(coMarketingActivity);
            ViewPortBuilder.b();
            int i4 = INotificationSideChannelDefault + 71;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        final CoMarketingActivity coMarketingActivity = (CoMarketingActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 89;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            coMarketingActivity.MediaBrowserCompat();
            return null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                MultiStateView multiStateView = ((ActivityCoMarketingBinding) ((ViewBinding) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvContent;
                Intrinsics.checkNotNullExpressionValue(multiStateView, "");
                Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, coMarketingActivity.getString(R.string.error_error_occured), null, new Pair(coMarketingActivity.getString(R.string.action_retry), new Function0() { // from class: getCameraStateCallback
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
                        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
                        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
                        return (Unit) CoMarketingActivity.TuitionPaymentFragmentbindingInflater1(addTask.TuitionPaymentFragmentbindingInflater1(), 492778104, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, -492778102, objArr2);
                    }
                }));
            }
            return null;
        }
        int i5 = i2 + 35;
        INotificationSideChannelStub = i5 % 128;
        if (i5 % 2 == 0) {
            ((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).isEmpty();
            throw null;
        }
        VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
        if (((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isEmpty()) {
            ((ActivityCoMarketingBinding) ((ViewBinding) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvNewMerchant.setVisibility(8);
            ((ActivityCoMarketingBinding) ((ViewBinding) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvMerchant.setVisibility(8);
            return null;
        }
        ((ActivityCoMarketingBinding) ((ViewBinding) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvNewMerchant.setVisibility(0);
        ((ActivityCoMarketingBinding) ((ViewBinding) coMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvMerchant.setVisibility(0);
        ((lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl) coMarketingActivity.notify.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        Unit unit;
        CoMarketingActivity coMarketingActivity = (CoMarketingActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 25;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 != 0) {
            coMarketingActivity.cancelAll();
            coMarketingActivity.INotificationSideChannel();
            unit = Unit.INSTANCE;
            int i3 = 87 / 0;
        } else {
            coMarketingActivity.cancelAll();
            coMarketingActivity.INotificationSideChannel();
            unit = Unit.INSTANCE;
        }
        int i4 = INotificationSideChannelStub + 71;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 53;
        INotificationSideChannelDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = INotificationSideChannelDefault + 73;
        INotificationSideChannelStub = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(CoMarketingActivity coMarketingActivity, ListMerchant listMerchant) {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
        return (Unit) TuitionPaymentFragmentbindingInflater1(addTask.TuitionPaymentFragmentbindingInflater1(), 1866370251, iTuitionPaymentFragmentbindingInflater3, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, -1866370250, new Object[]{coMarketingActivity, listMerchant});
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoMarketingActivity coMarketingActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
        return (Unit) TuitionPaymentFragmentbindingInflater1(addTask.TuitionPaymentFragmentbindingInflater1(), 492778104, iTuitionPaymentFragmentbindingInflater3, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, -492778102, new Object[]{coMarketingActivity});
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(CoMarketingActivity coMarketingActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(addTask.TuitionPaymentFragmentbindingInflater1(), 1296485673, iTuitionPaymentFragmentbindingInflater3, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater2, -1296485668, new Object[]{coMarketingActivity, virtualCameraAdapter1});
    }

    static {
        MediaBrowserCompat = 1;
        onTransact();
        INSTANCE = new Companion(null);
        int i = getInterfaceDescriptor + 57;
        MediaBrowserCompat = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 89;
        INotificationSideChannelStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 27;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_co_marketing;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(addTask.TuitionPaymentFragmentbindingInflater1(), 684738149, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -684738145, new Object[]{this});
    }

    @Override // addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer num) {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 1976716702;
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(addTask.TuitionPaymentFragmentbindingInflater1(), 1058214568, OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iCodePointAt, iTuitionPaymentFragmentbindingInflater1, -1058214562, new Object[]{this, num});
    }

    @Override // clearCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final void g() {
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1995546139;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1203823181, addTask.TuitionPaymentFragmentbindingInflater1(), i, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1203823181, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int length = 1198725761 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_mask_text).substring(0, 6).length();
        TuitionPaymentFragmentbindingInflater1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_invalid_gesture_combination).substring(0, 99).codePointAt(58) - 1482056178, 654493641, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, length, -654493638, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 21;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    static void onTransact() {
        INotificationSideChannel = -6377398940819159759L;
        notify = -981105359;
        RemoteActionCompatParcelizer = (char) 14116;
    }

    private static String $$i(short s, int i, int i2) {
        int i3 = 104 - i2;
        byte[] bArr = $$c;
        int i4 = i * 4;
        int i5 = (s * 2) + 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 += -i4;
            i5++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i5];
            i5++;
        }
    }
}
