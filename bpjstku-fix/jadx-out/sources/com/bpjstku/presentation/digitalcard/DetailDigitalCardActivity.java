package com.bpjstku.presentation.digitalcard;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import com.bpjstku.data.payment.model.request.CheckRecurringStatusRequest;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import com.bpjstku.databinding.ActivityDetailDigitalCardBinding;
import com.bpjstku.domain.digitalcard.model.BPUMembershipInformation;
import com.bpjstku.domain.digitalcard.model.DigitalCard;
import com.bpjstku.domain.digitalcard.model.PMIMembershipInformation;
import com.bpjstku.domain.digitalcard.model.PUMembershipInformation;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.google.android.gms.common.internal.zaq;
import com.google.android.libraries.places.internal.zzbrl;
import com.kennyc.view.MultiStateView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ListPopupWindow2;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.deInitSession;
import defpackage.generateCameraId;
import defpackage.getAdapter;
import defpackage.getCameraOperatingMode;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.setSessionStateCallback;
import defpackage.setSurfaceOccupancyPriority;
import defpackage.setVideoStabilizationMode;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0015\u0010\b\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0015\u0010\u001d\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010!R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020\"8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010$R\u0014\u0010\u0010\u001a\u00020%8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010&"}, d2 = {"Lcom/bpjstku/presentation/digitalcard/DetailDigitalCardActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDetailDigitalCardBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "cancelAll", "b", "asInterface", "a", "", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)V", "onTransact", "asBinder", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LListPopupWindow2;", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "LgetStringOrNull;", "d", "LgetStringOrNull;", "TuitionPaymentFragmentbindingInflater1", "LgetAdapter;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/digitalcard/model/DigitalCard;", "Lcom/bpjstku/domain/digitalcard/model/DigitalCard;", "Lcom/bpjstku/domain/digitalcard/model/BPUMembershipInformation;", "Lcom/bpjstku/domain/digitalcard/model/BPUMembershipInformation;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DetailDigitalCardActivity extends BindingBaseActivity<ActivityDetailDigitalCardBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f485a;
    private static char asBinder;
    private static char g;
    private static char onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private DigitalCard TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private BPUMembershipInformation d;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private getStringOrNull TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {55, -64, 35, -71};
    private static final int $$f = 55;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {8, -36, 87, -65, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 188;
    private static int cancelAll = 0;
    private static int cancel = 0;
    private static int notify = 1;

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        b(Function1 function1) {
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

    public static /* synthetic */ Object b(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = ~i5;
        int i10 = ~i2;
        int i11 = i8 | (~(i9 | i10 | i6));
        int i12 = (~(i2 | i9 | i6)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i5 + i6 + i3 + (762713021 * i4) + (1579510587 * i);
        int i15 = i14 * i14;
        int i16 = ((i5 * (-1846875272)) - 1480523776) + ((-1846875272) * i6) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i3) + ((-750387200) * i4) + ((-523632640) * i) + ((-1971257344) * i15);
        int i17 = ((i5 * (-1364308824)) - 1074288667) + (i6 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + (i3 * (-1364308165)) + (i4 * (-893132913)) + (i * 986770329) + (i15 * (-1162149888));
        int i18 = i16 + (i17 * i17 * (-1529413632));
        if (i18 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i18 == 3) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i18 != 4) {
            return i18 != 5 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : asBinder(objArr);
        }
        return b(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity.$$a
            int r8 = 53 - r8
            int r6 = r6 + 4
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity.c(int, byte, byte, java.lang.Object[]):void");
    }

    public DetailDigitalCardActivity() {
        final DetailDigitalCardActivity detailDigitalCardActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = detailDigitalCardActivity;
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
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = detailDigitalCardActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getAdapter>() { // from class: com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity$special$$inlined$viewModel$default$3
            private static final byte[] $$c = {23, -73, 107, 5};
            private static final int $$f = 125;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {27, -8, 5, 78, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
            private static final int $$e = 0;
            private static final byte[] $$a = {57, -56, 23, -36, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
            private static final int $$b = 54;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static char[] b = {59750, 59861, 59881, 59862, 59856, 59858, 59863, 59875, 59883, 59861, 59880, 59883, 59840, 59809, 59848, 59880, 59856, 59861, 59880, 59883, 59856, 59825, 59824, 59731, 59826, 59848, 59843, 59852, 59854, 59852, 59825, 59827, 59843, 59841, 59852, 59852, 59846, 59676, 59685, 59726, 59727, 59878, 59798, 59898, 59899, 59885, 59874, 59798, 59873, 59878, 59899, 59881, 59887, 59861, 59875, 59883, 59861, 59719, 59804, 59787, 59764, 59793, 59796, 59765, 59760, 59799, 59819, 59799, 59793, 59794, 59761, 59787, 59794, 59800, 59795, 59804, 59800, 59413, 59411, 59414, 59415, 59409, 59415, 59406, 59670, 59777, 59423, 59398, 59393, 59402, 59894, 59399, 59422, 59419, 59404, 59406, 59404, 59404, 59398, 59407, 59404, 59698, 59771, 59744, 59744, 59747, 59737, 59736, 59750, 59748, 59749, 59744, 59737, 59729, 59751, 59757, 59755, 59853, 59843, 59849, 59853, 59843, 59841, 59844, 59840, 59854, 59811, 59820, 59843, 59846, 59867, 59840, 59843, 59867, 59835, 59804, 59827, 59846, 59846, 59845, 59846, 59843, 59843, 59867, 59851, 59711, 59750, 59739, 59717, 59756, 59745, 59749, 59749, 59738, 59738, 59749, 59744, 59744, 59719, 59714, 59744, 59751, 59713};
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60072, 60054, 60074, 60048, 60057, 60076, 60145, 60043, 60081, 60090, 60095, 60086, 60045, 60040, 60068, 60058, 60099, 60079, 60087, 60044, 60055, 60034, 60083, 60060, 60051, 60093, 60056, 60047, 60035, 60046, 60050, 60052, 60082, 60061, 60117, 60062, 60075, 60078, 60118, 60063, 60041, 60053, 60116, 60123, 60084, 60097, 60077, 60080, 60085};
            private static char TuitionPaymentFragmentbindingInflater1 = 57190;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 3
                    int r8 = 115 - r8
                    int r0 = 34 - r6
                    int r7 = 66 - r7
                    byte[] r1 = com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity$special$$inlined$viewModel$default$3.$$a
                    byte[] r0 = new byte[r0]
                    int r6 = 33 - r6
                    r2 = 0
                    if (r1 != 0) goto L15
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L2a
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L25:
                    r3 = r1[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L2a:
                    int r7 = r7 + r3
                    int r7 = r7 + (-2)
                    int r8 = r8 + 1
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity$special$$inlined$viewModel$default$3.d(short, short, int, java.lang.Object[]):void");
            }

            private static void e(int i, int i2, byte b2, Object[] objArr) {
                int i3 = b2 + 84;
                int i4 = i * 52;
                byte[] bArr = $$d;
                int i5 = 55 - (i2 * 52);
                byte[] bArr2 = new byte[i4 + 1];
                int i6 = -1;
                if (bArr == null) {
                    i3 = (i3 + (-i4)) - 10;
                }
                while (true) {
                    i5++;
                    i6++;
                    bArr2[i6] = (byte) i3;
                    if (i6 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i3 = (i3 + (-bArr[i5])) - 10;
                }
            }

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i;
                int i2 = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i3 = 0;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = iArr[2];
                int i7 = iArr[3];
                char[] cArr = b;
                if (cArr != null) {
                    int i8 = $10 + 109;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i10 = 0;
                    while (i10 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i3] = Integer.valueOf(cArr[i10]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i3;
                                byte b3 = (byte) (b2 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.green(i3), TextUtils.lastIndexOf("", '0', i3, i3) + 1271, (ViewConfiguration.getEdgeSlop() >> 16) + 18, 407021364, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i10++;
                            i3 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i5];
                System.arraycopy(cArr, i4, cArr3, 0, i5);
                if (bArr != null) {
                    char[] cArr4 = new char[i5];
                    setvideostabilizationmode.b = 0;
                    char c = 0;
                    while (setvideostabilizationmode.b < i5) {
                        if (bArr[setvideostabilizationmode.b] == 1) {
                            int i11 = setvideostabilizationmode.b;
                            Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 3225 - Color.red(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, 2133916302, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            int i12 = $11 + 11;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                        } else {
                            int i14 = setvideostabilizationmode.b;
                            Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755, 23 - ((Process.getThreadPriority(0) + 20) >> 6), 387247676, false, $$g(b6, b7, (byte) (b7 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        }
                        c = cArr4[setvideostabilizationmode.b];
                        Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.blue(0) + 41241), Gravity.getAbsoluteGravity(0, 0) + 1705, View.MeasureSpec.makeMeasureSpec(0, 0) + 21, -1434471773, false, $$g(b8, (byte) (b8 | 6), b8), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    cArr3 = cArr4;
                }
                if (i7 > 0) {
                    char[] cArr5 = new char[i5];
                    i = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i5);
                    int i15 = i5 - i7;
                    System.arraycopy(cArr5, 0, cArr3, i15, i7);
                    System.arraycopy(cArr5, i7, cArr3, 0, i15);
                } else {
                    i = 0;
                }
                if (z) {
                    char[] cArr6 = new char[i5];
                    loop2: while (true) {
                        setvideostabilizationmode.b = i;
                        while (true) {
                            if (setvideostabilizationmode.b >= i5) {
                                break loop2;
                            }
                            int i16 = $10 + 61;
                            $11 = i16 % 128;
                            if (i16 % 2 == 0) {
                                cArr6[setvideostabilizationmode.b] = cArr3[(setvideostabilizationmode.b + i5) << 1];
                                setvideostabilizationmode.b++;
                            } else {
                                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                                i = setvideostabilizationmode.b + 1;
                            }
                        }
                    }
                    cArr3 = cArr6;
                }
                if (i6 > 0) {
                    int i17 = 0;
                    while (true) {
                        setvideostabilizationmode.b = i17;
                        if (setvideostabilizationmode.b >= i5) {
                            break;
                        }
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        i17 = setvideostabilizationmode.b + 1;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Code duplicated, block: B:33:0x0107  */
            /* JADX WARN: Code duplicated, block: B:34:0x011f  */
            /* JADX WARN: Code duplicated, block: B:37:0x016b A[Catch: all -> 0x0314, TryCatch #0 {all -> 0x0314, blocks: (B:35:0x0121, B:37:0x016b, B:39:0x01e0), top: B:68:0x0121 }] */
            /* JADX WARN: Code duplicated, block: B:38:0x01de  */
            /* JADX WARN: Code duplicated, block: B:42:0x01f3  */
            /* JADX WARN: Code duplicated, block: B:45:0x0239 A[Catch: all -> 0x033c, TryCatch #1 {all -> 0x033c, blocks: (B:7:0x001f, B:9:0x002d, B:10:0x005f, B:14:0x0075, B:16:0x0083, B:17:0x00b0, B:43:0x01ff, B:45:0x0239, B:46:0x0299), top: B:70:0x001f }] */
            /* JADX WARN: Code duplicated, block: B:48:0x02ba  */
            /* JADX WARN: Code duplicated, block: B:50:0x02c1  */
            /* JADX WARN: Code duplicated, block: B:51:0x02e9  */
            private static void c(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i3 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                float f = 0.0f;
                Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i4 = 0;
                    while (i4 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b3 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 2268 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 33, -1927765101, false, $$g(b3, (byte) (b3 | 14), b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                            i4++;
                            f = 0.0f;
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
                Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b4 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2267 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33, -1927765101, false, $$g(b4, (byte) (b4 | 14), b4), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
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
                        int i5 = $10 + 69;
                        $11 = i5 % 128;
                        if (i5 % 2 == 0) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                obj = obj2;
                            } else {
                                try {
                                    objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b5 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Color.blue(0) + 3261, 31 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -127612708, false, $$g(b5, (byte) (b5 | 15), b5), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                        int i6 = $11 + 49;
                                        $10 = i6 % 128;
                                        int i7 = i6 % 2;
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b6 = (byte) 0;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 22878), (ViewConfiguration.getTouchSlop() >> 8) + 594, 17 - View.resolveSize(0, 0), 1570859318, false, $$g(b6, (byte) (b6 | 17), b6), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                        int i8 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i8];
                                    } else {
                                        obj = null;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i9 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i9];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                                        } else {
                                            int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                                        }
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            }
                        } else {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                obj = obj2;
                            } else {
                                objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b7 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (49267 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Color.blue(0) + 3261, 31 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -127612708, false, $$g(b7, (byte) (b7 | 15), b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    int i13 = $11 + 49;
                                    $10 = i13 % 128;
                                    int i14 = i13 % 2;
                                    Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b8 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 22878), (ViewConfiguration.getTouchSlop() >> 8) + 594, 17 - View.resolveSize(0, 0), 1570859318, false, $$g(b8, (byte) (b8 | 17), b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                    int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                    } else {
                                        int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                                    }
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        int i20 = $11 + 95;
                        $10 = i20 % 128;
                        int i21 = i20 % 2;
                        obj2 = obj;
                    }
                }
                for (int i22 = 0; i22 < i; i22++) {
                    int i23 = $10 + 61;
                    $11 = i23 % 128;
                    int i24 = i23 % 2;
                    cArr4[i22] = (char) (cArr4[i22] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.ViewModel, getAdapter] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getAdapter invoke() {
                ZoomGestureDetectorZoomEvent koin;
                int i;
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                if (i3 % 2 == 0) {
                    Reflection.getOrCreateKotlinClass(getAdapter.class);
                    throw null;
                }
                LifecycleOwner lifecycleOwner = detailDigitalCardActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getAdapter.class);
                if (lifecycleOwner == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
                }
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                if (componentCallbacks instanceof getEventTime) {
                    koin = ((getEventTime) componentCallbacks).getKoin();
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                } else {
                    koin = ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
                    i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                }
                int i4 = i % 2;
                return isQuickZoomEnabled.b(koin, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
            }

            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:106:0x0b19 A[Catch: IOException -> 0x0cd2, Exception -> 0x0d72, all -> 0x0e2a, TryCatch #3 {, blocks: (B:43:0x0535, B:44:0x0545, B:46:0x059f, B:48:0x05a5, B:50:0x0600, B:55:0x065e, B:60:0x06ad, B:68:0x0734, B:103:0x0b08, B:104:0x0b0b, B:106:0x0b19, B:107:0x0b4e, B:109:0x0b64, B:110:0x0b99, B:111:0x0baa, B:113:0x0c14, B:115:0x0c3a, B:117:0x0c68, B:119:0x0c87, B:121:0x0ca2, B:123:0x0cac, B:188:0x0d72, B:190:0x0dc2, B:191:0x0e29, B:149:0x0cfa, B:150:0x0cfd, B:154:0x0d06, B:156:0x0d0f, B:157:0x0d10, B:165:0x0d20, B:167:0x0d27, B:168:0x0d28, B:170:0x0d2a, B:172:0x0d37, B:173:0x0d38, B:175:0x0d3a, B:177:0x0d47, B:178:0x0d48), top: B:292:0x0535 }] */
            /* JADX WARN: Code duplicated, block: B:109:0x0b64 A[Catch: IOException -> 0x0cd2, Exception -> 0x0d72, all -> 0x0e2a, TryCatch #3 {, blocks: (B:43:0x0535, B:44:0x0545, B:46:0x059f, B:48:0x05a5, B:50:0x0600, B:55:0x065e, B:60:0x06ad, B:68:0x0734, B:103:0x0b08, B:104:0x0b0b, B:106:0x0b19, B:107:0x0b4e, B:109:0x0b64, B:110:0x0b99, B:111:0x0baa, B:113:0x0c14, B:115:0x0c3a, B:117:0x0c68, B:119:0x0c87, B:121:0x0ca2, B:123:0x0cac, B:188:0x0d72, B:190:0x0dc2, B:191:0x0e29, B:149:0x0cfa, B:150:0x0cfd, B:154:0x0d06, B:156:0x0d0f, B:157:0x0d10, B:165:0x0d20, B:167:0x0d27, B:168:0x0d28, B:170:0x0d2a, B:172:0x0d37, B:173:0x0d38, B:175:0x0d3a, B:177:0x0d47, B:178:0x0d48), top: B:292:0x0535 }] */
            /* JADX WARN: Code duplicated, block: B:113:0x0c14 A[Catch: IOException -> 0x0cd2, all -> 0x0e2a, TryCatch #3 {, blocks: (B:43:0x0535, B:44:0x0545, B:46:0x059f, B:48:0x05a5, B:50:0x0600, B:55:0x065e, B:60:0x06ad, B:68:0x0734, B:103:0x0b08, B:104:0x0b0b, B:106:0x0b19, B:107:0x0b4e, B:109:0x0b64, B:110:0x0b99, B:111:0x0baa, B:113:0x0c14, B:115:0x0c3a, B:117:0x0c68, B:119:0x0c87, B:121:0x0ca2, B:123:0x0cac, B:188:0x0d72, B:190:0x0dc2, B:191:0x0e29, B:149:0x0cfa, B:150:0x0cfd, B:154:0x0d06, B:156:0x0d0f, B:157:0x0d10, B:165:0x0d20, B:167:0x0d27, B:168:0x0d28, B:170:0x0d2a, B:172:0x0d37, B:173:0x0d38, B:175:0x0d3a, B:177:0x0d47, B:178:0x0d48), top: B:292:0x0535 }] */
            /* JADX WARN: Code duplicated, block: B:115:0x0c3a A[Catch: IOException -> 0x0cd2, all -> 0x0e2a, TryCatch #3 {, blocks: (B:43:0x0535, B:44:0x0545, B:46:0x059f, B:48:0x05a5, B:50:0x0600, B:55:0x065e, B:60:0x06ad, B:68:0x0734, B:103:0x0b08, B:104:0x0b0b, B:106:0x0b19, B:107:0x0b4e, B:109:0x0b64, B:110:0x0b99, B:111:0x0baa, B:113:0x0c14, B:115:0x0c3a, B:117:0x0c68, B:119:0x0c87, B:121:0x0ca2, B:123:0x0cac, B:188:0x0d72, B:190:0x0dc2, B:191:0x0e29, B:149:0x0cfa, B:150:0x0cfd, B:154:0x0d06, B:156:0x0d0f, B:157:0x0d10, B:165:0x0d20, B:167:0x0d27, B:168:0x0d28, B:170:0x0d2a, B:172:0x0d37, B:173:0x0d38, B:175:0x0d3a, B:177:0x0d47, B:178:0x0d48), top: B:292:0x0535 }] */
            /* JADX WARN: Code duplicated, block: B:117:0x0c68 A[Catch: IOException -> 0x0cd2, all -> 0x0e2a, TryCatch #3 {, blocks: (B:43:0x0535, B:44:0x0545, B:46:0x059f, B:48:0x05a5, B:50:0x0600, B:55:0x065e, B:60:0x06ad, B:68:0x0734, B:103:0x0b08, B:104:0x0b0b, B:106:0x0b19, B:107:0x0b4e, B:109:0x0b64, B:110:0x0b99, B:111:0x0baa, B:113:0x0c14, B:115:0x0c3a, B:117:0x0c68, B:119:0x0c87, B:121:0x0ca2, B:123:0x0cac, B:188:0x0d72, B:190:0x0dc2, B:191:0x0e29, B:149:0x0cfa, B:150:0x0cfd, B:154:0x0d06, B:156:0x0d0f, B:157:0x0d10, B:165:0x0d20, B:167:0x0d27, B:168:0x0d28, B:170:0x0d2a, B:172:0x0d37, B:173:0x0d38, B:175:0x0d3a, B:177:0x0d47, B:178:0x0d48), top: B:292:0x0535 }] */
            /* JADX WARN: Code duplicated, block: B:119:0x0c87 A[Catch: IOException -> 0x0cd2, all -> 0x0e2a, TryCatch #3 {, blocks: (B:43:0x0535, B:44:0x0545, B:46:0x059f, B:48:0x05a5, B:50:0x0600, B:55:0x065e, B:60:0x06ad, B:68:0x0734, B:103:0x0b08, B:104:0x0b0b, B:106:0x0b19, B:107:0x0b4e, B:109:0x0b64, B:110:0x0b99, B:111:0x0baa, B:113:0x0c14, B:115:0x0c3a, B:117:0x0c68, B:119:0x0c87, B:121:0x0ca2, B:123:0x0cac, B:188:0x0d72, B:190:0x0dc2, B:191:0x0e29, B:149:0x0cfa, B:150:0x0cfd, B:154:0x0d06, B:156:0x0d0f, B:157:0x0d10, B:165:0x0d20, B:167:0x0d27, B:168:0x0d28, B:170:0x0d2a, B:172:0x0d37, B:173:0x0d38, B:175:0x0d3a, B:177:0x0d47, B:178:0x0d48), top: B:292:0x0535 }] */
            /* JADX WARN: Code duplicated, block: B:121:0x0ca2 A[Catch: IOException -> 0x0cd2, all -> 0x0e2a, TRY_LEAVE, TryCatch #3 {, blocks: (B:43:0x0535, B:44:0x0545, B:46:0x059f, B:48:0x05a5, B:50:0x0600, B:55:0x065e, B:60:0x06ad, B:68:0x0734, B:103:0x0b08, B:104:0x0b0b, B:106:0x0b19, B:107:0x0b4e, B:109:0x0b64, B:110:0x0b99, B:111:0x0baa, B:113:0x0c14, B:115:0x0c3a, B:117:0x0c68, B:119:0x0c87, B:121:0x0ca2, B:123:0x0cac, B:188:0x0d72, B:190:0x0dc2, B:191:0x0e29, B:149:0x0cfa, B:150:0x0cfd, B:154:0x0d06, B:156:0x0d0f, B:157:0x0d10, B:165:0x0d20, B:167:0x0d27, B:168:0x0d28, B:170:0x0d2a, B:172:0x0d37, B:173:0x0d38, B:175:0x0d3a, B:177:0x0d47, B:178:0x0d48), top: B:292:0x0535 }] */
            /* JADX WARN: Code duplicated, block: B:125:0x0cc0  */
            /* JADX WARN: Code duplicated, block: B:200:0x0e3e  */
            /* JADX WARN: Code duplicated, block: B:233:0x11ee A[EDGE_INSN: B:233:0x11ee->B:234:0x11f1 BREAK  A[LOOP:5: B:213:0x0fc5->B:232:0x11de], PHI: r3
  0x11ee: PHI (r3v203 java.lang.String[]) = (r3v201 java.lang.String[]), (r3v201 java.lang.String[]), (r3v207 java.lang.String[]) binds: [B:209:0x0f36, B:211:0x0fbf, B:350:0x11ee] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:24:0x034f  */
            /* JADX WARN: Code duplicated, block: B:26:0x0352  */
            /* JADX WARN: Code duplicated, block: B:29:0x0371 A[Catch: all -> 0x19b0, TryCatch #8 {all -> 0x19b0, blocks: (B:13:0x01cc, B:15:0x01e2, B:16:0x022d, B:27:0x0359, B:29:0x0371, B:30:0x03bc, B:223:0x109b, B:225:0x10b3, B:227:0x1107, B:249:0x124a, B:251:0x1257, B:252:0x12a1, B:254:0x13c1, B:256:0x13ce, B:257:0x1416, B:259:0x1553, B:261:0x1560, B:262:0x15a9, B:264:0x170a, B:266:0x1717, B:267:0x175b, B:269:0x185c, B:271:0x1869, B:272:0x18ac), top: B:295:0x01cc }] */
            /* JADX WARN: Code duplicated, block: B:338:0x0449 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:339:0x0457 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:345:0x0cd2 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:346:0x0cac A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:348:0x0cc2 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:34:0x044b A[LOOP:1: B:25:0x0350->B:34:0x044b, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:35:0x0457 A[EDGE_INSN: B:35:0x0457->B:36:0x045c BREAK  A[LOOP:1: B:25:0x0350->B:34:0x044b], PHI: r3 r5
  0x0457: PHI (r3v243 int) = (r3v242 int), (r3v354 int) binds: [B:23:0x034d, B:339:0x0457] A[DONT_GENERATE, DONT_INLINE]
  0x0457: PHI (r5v80 java.lang.Object) = (r5v79 java.lang.Object), (r5v161 java.lang.Object) binds: [B:23:0x034d, B:339:0x0457] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:38:0x04ee  */
            /* JADX WARN: Code duplicated, block: B:40:0x050d  */
            /* JADX WARN: Code duplicated, block: B:42:0x052d  */
            /* JADX WARN: Code duplicated, block: B:53:0x0620 A[Catch: all -> 0x0d39, TryCatch #10 {all -> 0x0d39, blocks: (B:51:0x0613, B:53:0x0620, B:54:0x0658), top: B:297:0x0613 }] */
            /* JADX WARN: Code duplicated, block: B:58:0x066f A[Catch: all -> 0x0d29, TryCatch #1 {all -> 0x0d29, blocks: (B:56:0x0662, B:58:0x066f, B:59:0x06a7), top: B:288:0x0662 }] */
            /* JADX WARN: Multi-variable type inference failed */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
                int i4;
                int i5;
                String[] strArr;
                Object obj;
                int i6;
                int i7;
                int i8;
                Object obj2;
                int i9;
                int i10;
                Object obj3;
                String str;
                int length;
                int i11;
                Object obj4;
                int i12;
                int i13;
                Object obj5;
                int i14;
                String[] strArrSplit;
                int length2;
                int i15;
                String str2;
                Object[] objArr;
                String[] strArr2;
                Object obj6;
                int i16;
                int i17;
                Process processExec;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                String str3;
                byte b2;
                Throwable th;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                String[] strArrSplit2;
                int length3;
                int i18;
                String str4;
                Object[] objArr2;
                String str5;
                Object[] objArr3;
                Object[] objArr4;
                String[] strArrSplit3;
                int i19;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                String str6;
                int i20;
                long j;
                int i21;
                int i22;
                int i23 = i;
                int i24 = 1;
                char c = 0;
                if (context != null) {
                    try {
                        Object[] objArr5 = new Object[1];
                        a(new int[]{0, 23, 114, 6}, true, new byte[]{1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0}, objArr5);
                        Class<?> cls = Class.forName((String) objArr5[0]);
                        Object[] objArr6 = new Object[1];
                        a(new int[]{23, 14, 97, 11}, false, new byte[]{1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1}, objArr6);
                        String str7 = (String) cls.getMethod((String) objArr6[0], null).invoke(context, null);
                        Object[] objArr7 = new Object[1];
                        a(new int[]{0, 23, 114, 6}, true, new byte[]{1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0}, objArr7);
                        Class<?> cls2 = Class.forName((String) objArr7[0]);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                        int i25 = (iLastIndexOf * 659) - 12483;
                        int i26 = ~iLastIndexOf;
                        int i27 = ~((i26 ^ 19) | (i26 & 19));
                        int i28 = ((-20) ^ iLastIndexOf) | ((-20) & iLastIndexOf);
                        int i29 = ~i28;
                        int i30 = (i27 ^ i29) | (i29 & i27);
                        int i31 = ~((iLastIndexOf ^ i23) | (iLastIndexOf & i23));
                        int i32 = (i30 | i31) * (-658);
                        int i33 = ((((i25 ^ i32) + ((i32 & i25) << 1)) + ((~i28) * 658)) - (~(((~((iLastIndexOf & (-20)) | ((-20) ^ iLastIndexOf))) | i31) * 658))) - 1;
                        char[] cArr = {21, '%', 23, '\r', 13830, 13830, 16, Typography.quote, 22, 19, 23, Typography.quote, Typography.quote, Typography.amp, Typography.quote, '\'', Typography.quote, ' '};
                        int i34 = -Color.alpha(0);
                        int iTuitionPaymentFragmentbindingInflater1 = zaq.TuitionPaymentFragmentbindingInflater1();
                        int i35 = i34 * (-589);
                        int i36 = (i35 ^ 16548) + ((i35 & 16548) << 1);
                        int i37 = ~iTuitionPaymentFragmentbindingInflater1;
                        int i38 = ~(((-29) ^ i37) | ((-29) & i37));
                        int i39 = ~((-29) | i34);
                        int i40 = (i38 ^ i39) | (i39 & i38);
                        int i41 = ~iTuitionPaymentFragmentbindingInflater1;
                        int i42 = ~(i41 | i34);
                        int i43 = (i40 ^ i42) | (i40 & i42);
                        int i44 = ~i34;
                        int i45 = (i44 ^ 28) | (i44 & 28);
                        int i46 = ~((i45 ^ iTuitionPaymentFragmentbindingInflater1) | (i45 & iTuitionPaymentFragmentbindingInflater1));
                        int i47 = ((i43 & i46) | (i43 ^ i46)) * 590;
                        int i48 = (i36 ^ i47) + ((i47 & i36) << 1);
                        int i49 = ~(((-29) ^ i41) | ((-29) & i41));
                        int i50 = ~(((-29) ^ i34) | ((-29) & i34));
                        int i51 = ((~((i41 & i34) | (i41 ^ i34))) | (i49 ^ i50) | (i49 & i50)) * (-1180);
                        int i52 = (i48 ^ i51) + ((i51 & i48) << 1);
                        int i53 = ~i34;
                        int i54 = ~((i53 & i37) | (i53 ^ i37));
                        int i55 = ~((i37 ^ 28) | (i37 & 28));
                        byte b3 = (byte) (i52 + (((i54 & i55) | (i54 ^ i55)) * 590));
                        Object[] objArr8 = new Object[1];
                        c(i33, cArr, b3, objArr8);
                        Object objInvoke = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                        byte[] bArr = $$a;
                        byte b4 = bArr[28];
                        Object[] objArr9 = new Object[1];
                        d(b4, (byte) (b4 | 62), (byte) (-bArr[35]), objArr9);
                        Class<?> cls3 = Class.forName((String) objArr9[0]);
                        byte b5 = (byte) (-bArr[40]);
                        Object[] objArr10 = new Object[1];
                        d(b5, (byte) (b5 + 2), bArr[57], objArr10);
                        int iIndexOf = ((String) cls3.getField((String) objArr10[0]).get(objInvoke)).indexOf(str7);
                        char c2 = 7;
                        if (iIndexOf > 0) {
                            byte b6 = bArr[28];
                            Object[] objArr11 = new Object[1];
                            d(b6, (byte) (b6 | 62), (byte) (-bArr[35]), objArr11);
                            Class<?> cls4 = Class.forName((String) objArr11[0]);
                            byte b7 = (byte) (-bArr[40]);
                            Object[] objArr12 = new Object[1];
                            d(b7, (byte) (b7 + 2), bArr[57], objArr12);
                            String str8 = (String) cls4.getField((String) objArr12[0]).get(objInvoke);
                            int length4 = str8.length();
                            int i56 = (length4 ^ (-16)) + ((length4 & (-16)) << 1);
                            if (i56 >= 0) {
                                int i57 = 0;
                                while (true) {
                                    if (i57 > i56) {
                                        i8 = iIndexOf;
                                        obj2 = objInvoke;
                                        i9 = 0;
                                        break;
                                    }
                                    String strSubstring = str8.substring(i57, i57 + 16);
                                    try {
                                        Object[] objArr13 = new Object[2];
                                        objArr13[i24] = 931995;
                                        objArr13[c] = strSubstring;
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                            int i58 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3392;
                                            int iMyTid = (Process.myTid() >> 22) + 9;
                                            int i59 = $$e;
                                            Object[] objArr14 = new Object[i24];
                                            e((byte) i59, $$d[c2], (byte) (i59 | 14), objArr14);
                                            String str9 = (String) objArr14[0];
                                            Class[] clsArr = new Class[2];
                                            clsArr[0] = String.class;
                                            clsArr[i24] = Integer.TYPE;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, i58, iMyTid, 1203525406, false, str9, clsArr);
                                        }
                                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr13)).longValue();
                                        long j2 = 633368431;
                                        i8 = iIndexOf;
                                        obj2 = objInvoke;
                                        long j3 = (((long) (-464)) * j2) + (((long) (-929)) * jLongValue);
                                        long j4 = -1;
                                        long j5 = j2 ^ j4;
                                        long jMyPid = Process.myPid();
                                        long j6 = jLongValue | jMyPid;
                                        long j7 = j3 + (((long) (-465)) * (j5 | (j6 ^ j4))) + (((long) 930) * ((j4 ^ (jMyPid | j5)) | jLongValue)) + (((long) 465) * (j6 | j5)) + ((long) (-635438308));
                                        int iMyUid = Process.myUid();
                                        int i60 = ~iMyUid;
                                        int i61 = ((int) (j7 >> 32)) & ((-2055567968) + (((~((-109315248) | i60)) | 1327911163) * 226) + (((~(i60 | (-8389637))) | (~((-1327911164) | iMyUid)) | 1226985552) * (-113)) + ((~(iMyUid | (-109315248))) * 113));
                                        int i62 = ~Process.myPid();
                                        int i63 = ((int) j7) & (((((~(899350004 | i62)) | (-899678198)) * (-241)) - 511225985) + (((~(i62 | (-328194))) | 361801792) * 241));
                                        if (((i61 & i63) | (i61 ^ i63)) == -725904754) {
                                            i9 = 1;
                                            break;
                                        }
                                        int i64 = ((i57 | (-58)) << 1) - (i57 ^ (-58));
                                        i57 = (i64 & 59) + (i64 | 59);
                                        objInvoke = obj2;
                                        iIndexOf = i8;
                                        c2 = 7;
                                        i24 = 1;
                                        c = 0;
                                    } catch (Throwable th2) {
                                        Throwable cause = th2.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th2;
                                    }
                                }
                                i23 = i;
                                i10 = (~(i23 & 20)) & (i23 | 20);
                                int i65 = (i9 | (-i9)) >> 31;
                                int i66 = (i65 & i10) | ((~i65) & i23);
                                byte[] bArr2 = $$a;
                                byte b8 = bArr2[28];
                                Object[] objArr15 = new Object[1];
                                d(b8, (byte) (b8 | 62), (byte) (-bArr2[35]), objArr15);
                                Class<?> cls5 = Class.forName((String) objArr15[0]);
                                byte b9 = (byte) (-bArr2[40]);
                                Object[] objArr16 = new Object[1];
                                d(b9, (byte) (b9 + 2), bArr2[57], objArr16);
                                Field field = cls5.getField((String) objArr16[0]);
                                obj3 = obj2;
                                str = (String) field.get(obj3);
                                length = str.length() - 6;
                                if (length >= 0) {
                                    i11 = i10;
                                    obj4 = obj3;
                                    i12 = 0;
                                    break;
                                }
                                i19 = 0;
                                while (true) {
                                    if (i19 <= length) {
                                        i11 = i10;
                                        obj4 = obj3;
                                        i12 = 0;
                                        break;
                                    }
                                    Object[] objArr17 = {str.substring(i19, i19 + 6), 931995};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                        int iNormalizeMetaState = 3393 - KeyEvent.normalizeMetaState(0);
                                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 10;
                                        int i67 = $$e;
                                        Object[] objArr18 = new Object[1];
                                        e((byte) i67, $$d[7], (byte) (i67 | 14), objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, iNormalizeMetaState, iLastIndexOf2, 1203525406, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr17)).longValue();
                                    long j8 = 1530926206;
                                    long j9 = (((long) 491) * j8) + (((long) (-489)) * jLongValue2);
                                    str6 = str;
                                    i11 = i10;
                                    long j10 = -1;
                                    long j11 = j8 ^ j10;
                                    long j12 = jLongValue2 ^ j10;
                                    obj4 = obj3;
                                    i20 = length;
                                    long j13 = i23;
                                    long j14 = 490;
                                    j = j9 + (((long) (-490)) * (j11 | j12 | (j13 ^ j10))) + (((j10 ^ (j13 | j12)) | ((j8 | j12) ^ j10)) * j14) + (j14 * j11) + ((long) (-1532996083));
                                    i21 = (-13503906) + (((~(1362792491 | i23)) | 1494948393) * (-964));
                                    i22 = ~i23;
                                    if (((((int) (j >> 32)) & (i21 + (((~(1362792491 | i22)) | 134285824) * (-964)))) | (((int) j) & (399892391 + (((~(685772865 | i22)) | (~(751453544 | i23))) * 210) + (((~(i22 | (-2101250))) | (~((-67781929) | i23))) * 210)))) == -2096167706) {
                                        i12 = 1;
                                        break;
                                    }
                                    i19++;
                                    str = str6;
                                    i10 = i11;
                                    obj3 = obj4;
                                    length = i20;
                                }
                                int i68 = -i12;
                                int i69 = ((i12 & i68) | (i12 ^ i68)) >> 31;
                                int i70 = (~i69) & i23;
                                int i71 = i69 & (i23 ^ 20);
                                int i72 = (i71 & i70) | (i70 ^ i71);
                                int i73 = (~i66) & i23;
                                i13 = ~i23;
                                int i74 = i73 | (i66 & i13);
                                int i75 = -i74;
                                int i76 = ((i74 & i75) | (i74 ^ i75)) >> 31;
                                int i77 = i72 & (~i76);
                                int i78 = i66 & i76;
                                i6 = (i78 & i77) | (i77 ^ i78);
                                byte[] bArr3 = $$a;
                                byte b10 = bArr3[28];
                                Object[] objArr19 = new Object[1];
                                d(b10, (byte) (b10 | 62), (byte) (-bArr3[35]), objArr19);
                                Class<?> cls6 = Class.forName((String) objArr19[0]);
                                byte b11 = (byte) (-bArr3[40]);
                                Object[] objArr20 = new Object[1];
                                d(b11, (byte) (b11 + 2), bArr3[57], objArr20);
                                Field field2 = cls6.getField((String) objArr20[0]);
                                obj5 = obj4;
                                int i79 = i8 ^ (-1);
                                int i80 = -i79;
                                int i81 = i8 & (((i79 & i80) | (i79 ^ i80)) >> 31);
                                i14 = 0;
                                String strSubstring2 = ((String) field2.get(obj5)).substring(0, i81);
                                Object[] objArr21 = new Object[1];
                                a(new int[]{37, 1, 0, 1}, true, new byte[]{1}, objArr21);
                                strArrSplit = strSubstring2.split((String) objArr21[0]);
                                length2 = strArrSplit.length;
                                i15 = 0;
                                while (i15 < length2) {
                                    str2 = strArrSplit[i15];
                                    objArr = new Object[1];
                                    a(new int[]{38, 3, i14, i14}, true, new byte[]{1, 1, 1}, objArr);
                                    if (str2.split((String) objArr[i14]).length > 1) {
                                        synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(i14, i14, i14)), (ViewConfiguration.getEdgeSlop() >> 16) + 2267, 33 - ExpandableListView.getPackedPositionType(0)))) {
                                            try {
                                                Object[] objArr22 = new Object[1];
                                                a(new int[]{41, 16, 125, 9}, true, null, objArr22);
                                                String str10 = (String) objArr22[0];
                                                try {
                                                    Runtime runtime = Runtime.getRuntime();
                                                    int i82 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                    int iTuitionPaymentFragmentbindingInflater2 = zaq.TuitionPaymentFragmentbindingInflater1();
                                                    int i83 = i82 * 55;
                                                    int i84 = ((i83 | (-107)) << 1) - (i83 ^ (-107));
                                                    int i85 = ~i82;
                                                    strArr2 = strArrSplit;
                                                    int i86 = ~(i85 | 1);
                                                    i16 = length2;
                                                    int i87 = ~iTuitionPaymentFragmentbindingInflater2;
                                                    int i88 = i84 + ((i86 | (~((i87 ^ 1) | (i87 & 1)))) * (-108));
                                                    int i89 = ~(i85 | iTuitionPaymentFragmentbindingInflater2);
                                                    int i90 = ~(((-2) ^ i82) | ((-2) & i82));
                                                    int i91 = (i89 ^ i90) | (i89 & i90);
                                                    int i92 = ~iTuitionPaymentFragmentbindingInflater2;
                                                    int i93 = ~((i92 ^ i82) | (i92 & i82));
                                                    int i94 = i88 + (((i91 ^ i93) | (i91 & i93)) * 54);
                                                    int i95 = ~((-2) | i82);
                                                    int i96 = i94 + (((i95 & iTuitionPaymentFragmentbindingInflater2) | (iTuitionPaymentFragmentbindingInflater2 ^ i95)) * 54);
                                                    try {
                                                        try {
                                                            char[] cArr2 = {'\n', 27};
                                                            try {
                                                                int defaultSize = View.getDefaultSize(0, 0);
                                                                int i97 = ~((~defaultSize) | (-15));
                                                                int i98 = ~i23;
                                                                obj6 = obj5;
                                                                int i99 = ~(((-15) ^ i98) | ((-15) & i98));
                                                                int i100 = (i97 ^ i99) | (i99 & i97);
                                                                int i101 = (defaultSize ^ 14) | (defaultSize & 14);
                                                                int i102 = ~((i101 ^ i23) | (i101 & i23));
                                                                int i103 = (((defaultSize * 253) + 3542) - (~(-(-(((i100 ^ i102) | (i100 & i102)) * (-252)))))) - 1;
                                                                int i104 = defaultSize | 14;
                                                                int i105 = (i103 - (~(i104 * (-252)))) - 1;
                                                                int i106 = ((-15) ^ i13) | ((-15) & i13);
                                                                int i107 = ~((i106 ^ defaultSize) | (i106 & defaultSize));
                                                                int i108 = ~((i104 ^ i23) | (i104 & i23));
                                                                int i109 = ((i107 & i108) | (i107 ^ i108)) * 252;
                                                                try {
                                                                    Object[] objArr23 = new Object[1];
                                                                    c(i96, cArr2, (byte) ((i105 & i109) + (i105 | i109)), objArr23);
                                                                    processExec = runtime.exec((String) objArr23[0], (String[]) null, (File) null);
                                                                    try {
                                                                        Object[] objArr24 = {processExec.getInputStream()};
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2142, 45 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1020714777, false, null, new Class[]{InputStream.class});
                                                                        }
                                                                        Object objNewInstance = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr24);
                                                                        try {
                                                                            Object[] objArr25 = {processExec.getErrorStream()};
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 2142, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 44, -1020714777, false, null, new Class[]{InputStream.class});
                                                                            }
                                                                            Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr25);
                                                                            DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                                            try {
                                                                                int i110 = $$b;
                                                                                byte b12 = (byte) (i110 & 91);
                                                                                byte[] bArr4 = $$a;
                                                                                i17 = i15;
                                                                                try {
                                                                                    i6 = i6;
                                                                                    try {
                                                                                        str3 = str2;
                                                                                        Object[] objArr26 = new Object[1];
                                                                                        d(b12, bArr4[2], bArr4[58], objArr26);
                                                                                        Class<?> cls7 = Class.forName((String) objArr26[0]);
                                                                                        b2 = (byte) 29;
                                                                                        Object[] objArr27 = new Object[1];
                                                                                        d(b2, bArr4[14], bArr4[28], objArr27);
                                                                                        cls7.getMethod((String) objArr27[0], null).invoke(objNewInstance, null);
                                                                                        byte b13 = (byte) (i110 & 91);
                                                                                        try {
                                                                                            Object[] objArr28 = new Object[1];
                                                                                            d(b13, bArr4[2], bArr4[58], objArr28);
                                                                                            Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                                            Object[] objArr29 = new Object[1];
                                                                                            d(b2, bArr4[14], bArr4[28], objArr29);
                                                                                            cls8.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null);
                                                                                            try {
                                                                                                StringBuilder sb = new StringBuilder();
                                                                                                sb.append(str10);
                                                                                                int offsetBefore = TextUtils.getOffsetBefore("", 0);
                                                                                                int i111 = offsetBefore * (-1939);
                                                                                                int i112 = ((i111 | 971) << 1) - (i111 ^ 971);
                                                                                                int i113 = ~(((-2) & offsetBefore) | ((-2) ^ offsetBefore));
                                                                                                int i114 = ~(i13 | 1);
                                                                                                int i115 = -(-(((i113 & i114) | (i113 ^ i114)) * (-970)));
                                                                                                int i116 = ~offsetBefore;
                                                                                                int i117 = (((i112 | i115) << 1) - (i115 ^ i112)) + ((~((i116 ^ 1) | (i116 & 1))) * 1940);
                                                                                                int i118 = ~((i116 & (-2)) | (i116 ^ (-2)));
                                                                                                int i119 = ~((i98 ^ 1) | (i98 & 1));
                                                                                                int i120 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                                int iTuitionPaymentFragmentbindingInflater3 = zaq.TuitionPaymentFragmentbindingInflater1();
                                                                                                int i121 = (i120 * 50) - 7081;
                                                                                                int i122 = ~iTuitionPaymentFragmentbindingInflater3;
                                                                                                int i123 = ~((-74) | i122);
                                                                                                int i124 = ~(((-74) ^ i120) | ((-74) & i120));
                                                                                                int i125 = ((i123 ^ i124) | (i124 & i123)) * 98;
                                                                                                int i126 = (i121 ^ i125) + ((i125 & i121) << 1);
                                                                                                int i127 = ~i120;
                                                                                                int i128 = ~((i127 & i122) | (i127 ^ i122));
                                                                                                int i129 = ((-74) & i128) | ((-74) ^ i128);
                                                                                                int i130 = ~((i120 ^ iTuitionPaymentFragmentbindingInflater3) | (i120 & iTuitionPaymentFragmentbindingInflater3));
                                                                                                int i131 = -(-(((i129 & i130) | (i129 ^ i130)) * (-49)));
                                                                                                int i132 = (i126 ^ i131) + ((i131 & i126) << 1);
                                                                                                int i133 = ~(((-74) & iTuitionPaymentFragmentbindingInflater3) | ((-74) ^ iTuitionPaymentFragmentbindingInflater3));
                                                                                                int i134 = ~((i120 & 73) | (i120 ^ 73));
                                                                                                Object[] objArr30 = new Object[1];
                                                                                                c((i117 - (~(-(-(((i118 & i119) | (i118 ^ i119)) * 970))))) - 1, new char[]{13784}, (byte) (i132 + (((i134 & i133) | (i133 ^ i134)) * 49)), objArr30);
                                                                                                sb.append((String) objArr30[0]);
                                                                                                String string = sb.toString();
                                                                                                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                                                                int iTuitionPaymentFragmentbindingInflater4 = zaq.TuitionPaymentFragmentbindingInflater1();
                                                                                                int i135 = keyRepeatTimeout * (-433);
                                                                                                int i136 = (i135 & (-1080)) + (i135 | (-1080));
                                                                                                int i137 = ~keyRepeatTimeout;
                                                                                                int i138 = ~iTuitionPaymentFragmentbindingInflater4;
                                                                                                int i139 = ~((i137 ^ i138) | (i137 & i138));
                                                                                                int i140 = ~(((-6) ^ iTuitionPaymentFragmentbindingInflater4) | ((-6) & iTuitionPaymentFragmentbindingInflater4));
                                                                                                int i141 = -(-(((i139 ^ i140) | (i139 & i140)) * 217));
                                                                                                int i142 = (((i136 & i141) + (i136 | i141)) - (~(((~((iTuitionPaymentFragmentbindingInflater4 & i137) | (i137 ^ iTuitionPaymentFragmentbindingInflater4))) | (~((i137 ^ (-6)) | (i137 & (-6))))) * 217))) - 1;
                                                                                                int i143 = (keyRepeatTimeout | (~(((-6) ^ i138) | ((-6) & i138)))) * 217;
                                                                                                int i144 = (i142 & i143) + (i143 | i142);
                                                                                                char[] cArr3 = {Typography.amp, 16, 24, '\'', 13788};
                                                                                                int i145 = -ImageFormat.getBitsPerPixel(0);
                                                                                                int i146 = i145 * (-1335);
                                                                                                int i147 = (i146 ^ (-38019)) + ((i146 & (-38019)) << 1);
                                                                                                int i148 = (i145 ^ i23) | (i145 & i23);
                                                                                                int i149 = ~i148;
                                                                                                byte b14 = (byte) ((((((i147 - (~((((-58) ^ i149) | (i149 & (-58))) * (-668)))) - 1) - (~(-(-((i145 | (~(((-58) ^ i23) | ((-58) & i23)))) * 1336))))) - 1) - (~(-(-(((i148 & (-58)) | (i148 ^ (-58))) * 668))))) - 1);
                                                                                                Object[] objArr31 = new Object[1];
                                                                                                c(i144, cArr3, b14, objArr31);
                                                                                                dataOutputStream.write(string.getBytes((String) objArr31[0]));
                                                                                                dataOutputStream.flush();
                                                                                                int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                                                                                                int i150 = iResolveOpacity * (-1965);
                                                                                                int i151 = (((i150 & 4920) + (i150 | 4920)) - (~(-(-(((iResolveOpacity ^ (-6)) | (iResolveOpacity & (-6))) * 983))))) - 1;
                                                                                                int i152 = ~iResolveOpacity;
                                                                                                int i153 = ~(((-6) ^ i98) | ((-6) & i98));
                                                                                                int i154 = -(-(((i153 & i152) | (i152 ^ i153)) * (-983)));
                                                                                                int i155 = (i151 & i154) + (i151 | i154);
                                                                                                int i156 = ~((~iResolveOpacity) | i13);
                                                                                                int i157 = ~((i152 & 5) | (i152 ^ 5));
                                                                                                int i158 = ((i156 & i157) | (i156 ^ i157)) * 983;
                                                                                                int i159 = (i155 & i158) + (i158 | i155);
                                                                                                char[] cArr4 = {'*', '#', Typography.quote, 23, 13761};
                                                                                                byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                                                                                                int iTuitionPaymentFragmentbindingInflater5 = zaq.TuitionPaymentFragmentbindingInflater1();
                                                                                                int i160 = modifierMetaStateMask * 273;
                                                                                                int i161 = (i160 ^ (-13550)) + ((i160 & (-13550)) << 1);
                                                                                                int i162 = ~modifierMetaStateMask;
                                                                                                int i163 = (i162 & (-51)) | (i162 ^ (-51));
                                                                                                int i164 = ~iTuitionPaymentFragmentbindingInflater5;
                                                                                                int i165 = ~((i163 & i164) | (i163 ^ i164));
                                                                                                int i166 = ~(modifierMetaStateMask | 50 | iTuitionPaymentFragmentbindingInflater5);
                                                                                                int i167 = i161 + (((i165 & i166) | (i165 ^ i166)) * (-272));
                                                                                                int i168 = ~modifierMetaStateMask;
                                                                                                int i169 = ~((i168 ^ 50) | (i168 & 50));
                                                                                                int i170 = ~((i168 & iTuitionPaymentFragmentbindingInflater5) | (i168 ^ iTuitionPaymentFragmentbindingInflater5));
                                                                                                int i171 = -(-(((i170 & i169) | (i169 ^ i170)) * (-272)));
                                                                                                int i172 = ((i167 | i171) << 1) - (i171 ^ i167);
                                                                                                int i173 = ~((modifierMetaStateMask & iTuitionPaymentFragmentbindingInflater5) | (modifierMetaStateMask ^ iTuitionPaymentFragmentbindingInflater5));
                                                                                                int i174 = -(-(((i173 & 50) | (i173 ^ 50)) * 272));
                                                                                                Object[] objArr32 = new Object[1];
                                                                                                c(i159, cArr4, (byte) ((i172 ^ i174) + ((i174 & i172) << 1)), objArr32);
                                                                                                String str11 = (String) objArr32[0];
                                                                                                int i175 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                                int iTuitionPaymentFragmentbindingInflater6 = zaq.TuitionPaymentFragmentbindingInflater1();
                                                                                                int i176 = i175 * (-419);
                                                                                                int i177 = (i176 & 2526) + (i176 | 2526);
                                                                                                int i178 = -(-((~((iTuitionPaymentFragmentbindingInflater6 ^ 6) | (iTuitionPaymentFragmentbindingInflater6 & 6))) * TypedValues.CycleType.TYPE_EASING));
                                                                                                int i179 = ((i177 | i178) << 1) - (i178 ^ i177);
                                                                                                int i180 = ~i175;
                                                                                                int i181 = -(-(((i180 & 6) | (i180 ^ 6)) * (-420)));
                                                                                                int i182 = (i179 ^ i181) + ((i181 & i179) << 1);
                                                                                                int i183 = ~((~i175) | (-7));
                                                                                                int i184 = ~iTuitionPaymentFragmentbindingInflater6;
                                                                                                int i185 = ~((i184 & 6) | (i184 ^ 6));
                                                                                                int i186 = -(-(((i183 & i185) | (i183 ^ i185)) * TypedValues.CycleType.TYPE_EASING));
                                                                                                int i187 = (i182 & i186) + (i186 | i182);
                                                                                                char[] cArr5 = {Typography.amp, 16, 24, '\'', 13788};
                                                                                                int i188 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                                                Object[] objArr33 = new Object[1];
                                                                                                c(i187, cArr5, (byte) ((i188 & 59) + (i188 | 59)), objArr33);
                                                                                                dataOutputStream.write(str11.getBytes((String) objArr33[0]));
                                                                                                dataOutputStream.flush();
                                                                                                try {
                                                                                                    long jNanoTime = System.nanoTime();
                                                                                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                    while (true) {
                                                                                                        try {
                                                                                                            processExec.exitValue();
                                                                                                            i13 = i13;
                                                                                                            break;
                                                                                                        } catch (IllegalThreadStateException unused) {
                                                                                                            if (nanos > 0) {
                                                                                                                try {
                                                                                                                    Object[] objArr34 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                    byte b15 = (byte) ($$b & 91);
                                                                                                                    byte[] bArr5 = $$a;
                                                                                                                    try {
                                                                                                                        Object[] objArr35 = new Object[1];
                                                                                                                        d(b15, bArr5[2], bArr5[58], objArr35);
                                                                                                                        Class<?> cls9 = Class.forName((String) objArr35[0]);
                                                                                                                        Object[] objArr36 = new Object[1];
                                                                                                                        d(b2, bArr5[61], bArr5[28], objArr36);
                                                                                                                        cls9.getMethod((String) objArr36[0], Long.TYPE).invoke(null, objArr34);
                                                                                                                    } catch (Throwable th3) {
                                                                                                                        th = th3;
                                                                                                                        Throwable th4 = th;
                                                                                                                        Throwable cause2 = th4.getCause();
                                                                                                                        if (cause2 != null) {
                                                                                                                            throw cause2;
                                                                                                                        }
                                                                                                                        throw th4;
                                                                                                                    }
                                                                                                                } catch (Throwable th5) {
                                                                                                                    th = th5;
                                                                                                                }
                                                                                                            }
                                                                                                            nanos = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                                            if (nanos <= 0) {
                                                                                                                break;
                                                                                                            }
                                                                                                            i13 = i13;
                                                                                                        } catch (InterruptedException e2) {
                                                                                                            throw e2;
                                                                                                        } catch (Throwable th6) {
                                                                                                            th = th6;
                                                                                                            try {
                                                                                                                processExec.destroy();
                                                                                                                throw th;
                                                                                                            } catch (Exception unused2) {
                                                                                                                throw th;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                dataOutputStream.close();
                                                                                                            } catch (IOException unused3) {
                                                                                                            }
                                                                                                            try {
                                                                                                                int i189 = $$b;
                                                                                                                byte[] bArr6 = $$a;
                                                                                                                Object[] objArr37 = new Object[1];
                                                                                                                d((byte) (i189 & 91), bArr6[2], bArr6[58], objArr37);
                                                                                                                Class<?> cls10 = Class.forName((String) objArr37[0]);
                                                                                                                byte b16 = (byte) 30;
                                                                                                                Object[] objArr38 = new Object[1];
                                                                                                                d(b16, bArr6[28], bArr6[58], objArr38);
                                                                                                                cls10.getMethod((String) objArr38[0], Long.TYPE).invoke(objNewInstance, 100L);
                                                                                                                try {
                                                                                                                    Object[] objArr39 = new Object[1];
                                                                                                                    d((byte) (i189 & 91), bArr6[2], bArr6[58], objArr39);
                                                                                                                    Class<?> cls11 = Class.forName((String) objArr39[0]);
                                                                                                                    Object[] objArr40 = new Object[1];
                                                                                                                    d(b16, bArr6[28], bArr6[58], objArr40);
                                                                                                                    cls11.getMethod((String) objArr40[0], Long.TYPE).invoke(objNewInstance2, 10L);
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                processExec.destroy();
                                                                                                                                while (true) {
                                                                                                                                    if (i18 < length3) {
                                                                                                                                        str4 = strArrSplit2[i18];
                                                                                                                                        objArr2 = new Object[1];
                                                                                                                                        a(new int[]{57, 19, 49, 14}, false, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0}, objArr2);
                                                                                                                                        if (str4.startsWith((String) objArr2[0])) {
                                                                                                                                            str5 = str3;
                                                                                                                                        } else {
                                                                                                                                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21;
                                                                                                                                            char[] cArr6 = {'\b', 14, 24, 5, 16, 22, Typography.amp, '*', 24, '!', 6, 29, 20, Typography.dollar, '(', ')', ' ', 31, ')', ' '};
                                                                                                                                            int i190 = -View.resolveSizeAndState(0, 0, 0);
                                                                                                                                            objArr3 = new Object[1];
                                                                                                                                            c(iIndexOf2, cArr6, (byte) (((i190 | 110) << 1) - (i190 ^ 110)), objArr3);
                                                                                                                                            if (str4.startsWith((String) objArr3[0])) {
                                                                                                                                                str5 = str3;
                                                                                                                                            } else {
                                                                                                                                                objArr4 = new Object[1];
                                                                                                                                                a(new int[]{76, 8, 182, 0}, false, new byte[]{0, 1, 0, 0, 0, 0, 0, 1}, objArr4);
                                                                                                                                                if (str4.startsWith((String) objArr4[0])) {
                                                                                                                                                    Object[] objArr41 = new Object[1];
                                                                                                                                                    a(new int[]{84, 1, 0, 1}, true, new byte[]{0}, objArr41);
                                                                                                                                                    strArrSplit3 = str4.split((String) objArr41[0]);
                                                                                                                                                    if (strArrSplit3.length > 1) {
                                                                                                                                                        str5 = str3;
                                                                                                                                                        if (strArrSplit3[1].equalsIgnoreCase(str5)) {
                                                                                                                                                            int i191 = i23 ^ i6;
                                                                                                                                                            int i192 = -i191;
                                                                                                                                                            int i193 = ((i191 & i192) | (i191 ^ i192)) >> 31;
                                                                                                                                                            i6 = (i6 & i193) | (i11 & (~i193));
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        str5 = str3;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    str5 = str3;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        int i194 = (i18 & 122) + (i18 | 122);
                                                                                                                                        i18 = ((i194 | (-121)) << 1) - (i194 ^ (-121));
                                                                                                                                        str3 = str5;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } catch (Exception unused4) {
                                                                                                                            }
                                                                                                                            StringBuilder sb2 = new StringBuilder();
                                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                                                                char mode = (char) View.MeasureSpec.getMode(0);
                                                                                                                                int scrollDefaultDelay = 2142 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                                                                                int iNormalizeMetaState2 = 45 - KeyEvent.normalizeMetaState(0);
                                                                                                                                byte b17 = $$d[7];
                                                                                                                                Object[] objArr42 = new Object[1];
                                                                                                                                e(b17, b17, (byte) $$e, objArr42);
                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, scrollDefaultDelay, iNormalizeMetaState2, 399405187, false, (String) objArr42[0], null);
                                                                                                                            }
                                                                                                                            sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance).toString());
                                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                                                                                char size = (char) View.MeasureSpec.getSize(0);
                                                                                                                                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2142;
                                                                                                                                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46;
                                                                                                                                byte b18 = $$d[7];
                                                                                                                                Object[] objArr43 = new Object[1];
                                                                                                                                e(b18, b18, (byte) $$e, objArr43);
                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, iCombineMeasuredStates, iIndexOf3, 399405187, false, (String) objArr43[0], null);
                                                                                                                            }
                                                                                                                            sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance2).toString());
                                                                                                                            String string2 = sb2.toString();
                                                                                                                            int i195 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                                                                            int i196 = ~i195;
                                                                                                                            int i197 = (((i195 * (-167)) - 12024) - (~(-(-(((~((i196 & (-73)) | (i196 ^ (-73)))) | (~(((-73) & i23) | ((-73) ^ i23)))) * 336))))) - 1;
                                                                                                                            int i198 = -(-(((~(i195 | 72)) | (~((i195 ^ i23) | (i195 & i23)))) * (-168)));
                                                                                                                            int i199 = ~((i195 & i98) | (i98 ^ i195));
                                                                                                                            Object[] objArr44 = new Object[1];
                                                                                                                            c(0 - (~(-TextUtils.indexOf("", ""))), new char[]{13784}, (byte) ((i197 & i198) + (i197 | i198) + (((i199 & (-73)) | ((-73) ^ i199)) * 168)), objArr44);
                                                                                                                            strArrSplit2 = string2.split((String) objArr44[0]);
                                                                                                                            length3 = strArrSplit2.length;
                                                                                                                            i18 = 0;
                                                                                                                        } catch (Exception unused5) {
                                                                                                                            int i200 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                                                                            int i201 = i200 * 758;
                                                                                                                            int i202 = ((i201 | (-21168)) << 1) - (i201 ^ (-21168));
                                                                                                                            int i203 = -(-(((i200 ^ i13) | (i200 & i13)) * (-757)));
                                                                                                                            int i204 = (i202 & i203) + (i203 | i202);
                                                                                                                            int i205 = (-29) | i200;
                                                                                                                            int i206 = (i204 - (~(-(-((~((i205 & i23) | (i205 ^ i23))) * 1514))))) - 1;
                                                                                                                            int i207 = ~((~i200) | (-29));
                                                                                                                            int i208 = ~((-29) | i13);
                                                                                                                            int i209 = (i207 & i208) | (i207 ^ i208);
                                                                                                                            int i210 = (i200 & 28) | (i200 ^ 28);
                                                                                                                            int i211 = ~((i210 & i23) | (i210 ^ i23));
                                                                                                                            int i212 = i206 + (((i211 & i209) | (i209 ^ i211)) * 757);
                                                                                                                            try {
                                                                                                                                char[] cArr7 = {22, 18, Typography.quote, 16, Typography.dollar, '(', '0', 22, 29, '-', '!', '/', Typography.dollar, 14, 21, ')', 1, 22, '*', '\b', Typography.amp, '!', 21, '(', 13832, 13832, 13779};
                                                                                                                                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0);
                                                                                                                                int i213 = iLastIndexOf3 * 69;
                                                                                                                                int i214 = ((i213 | (-2144)) << 1) - (i213 ^ (-2144));
                                                                                                                                int i215 = ~iLastIndexOf3;
                                                                                                                                int i216 = (i215 ^ (-33)) | (i215 & (-33));
                                                                                                                                int i217 = (~((i216 & i13) | (i216 ^ i13))) | (~((iLastIndexOf3 ^ 32) | (iLastIndexOf3 & 32)));
                                                                                                                                int i218 = ~((i23 ^ 32) | (i23 & 32));
                                                                                                                                int i219 = i214 + (((i217 & i218) | (i217 ^ i218)) * (-68));
                                                                                                                                int i220 = (~iLastIndexOf3) | (~i23);
                                                                                                                                int i221 = -(-((~((i220 & 32) | (i220 ^ 32))) * (-68)));
                                                                                                                                int i222 = (i219 & i221) + (i221 | i219);
                                                                                                                                int i223 = ~(((-33) & i13) | ((-33) ^ i13));
                                                                                                                                Object[] objArr45 = new Object[1];
                                                                                                                                c(i212, cArr7, (byte) (i222 + (((i223 & i215) | (i215 ^ i223)) * 68)), objArr45);
                                                                                                                                throw new IOException((String) objArr45[0]);
                                                                                                                            } catch (IOException unused6) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (IOException unused7) {
                                                                                                                    }
                                                                                                                } catch (Throwable th7) {
                                                                                                                    Throwable cause3 = th7.getCause();
                                                                                                                    if (cause3 != null) {
                                                                                                                        throw cause3;
                                                                                                                    }
                                                                                                                    throw th7;
                                                                                                                }
                                                                                                            } catch (Throwable th8) {
                                                                                                                Throwable cause4 = th8.getCause();
                                                                                                                if (cause4 != null) {
                                                                                                                    throw cause4;
                                                                                                                }
                                                                                                                throw th8;
                                                                                                            }
                                                                                                        } catch (Throwable th9) {
                                                                                                            th = th9;
                                                                                                            th = th;
                                                                                                            processExec.destroy();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (InterruptedException e3) {
                                                                                                        e = e3;
                                                                                                        throw e;
                                                                                                    }
                                                                                                } catch (InterruptedException e4) {
                                                                                                    e = e4;
                                                                                                } catch (Throwable th10) {
                                                                                                    th = th10;
                                                                                                }
                                                                                            } catch (IOException unused8) {
                                                                                                i13 = i13;
                                                                                            } catch (Exception unused9) {
                                                                                                i13 = i13;
                                                                                            }
                                                                                        } catch (Throwable th11) {
                                                                                            Throwable cause5 = th11.getCause();
                                                                                            if (cause5 != null) {
                                                                                                throw cause5;
                                                                                            }
                                                                                            throw th11;
                                                                                        }
                                                                                    } catch (Throwable th12) {
                                                                                        th = th12;
                                                                                        Throwable th13 = th;
                                                                                        Throwable cause6 = th13.getCause();
                                                                                        if (cause6 != null) {
                                                                                            throw cause6;
                                                                                        }
                                                                                        throw th13;
                                                                                    }
                                                                                } catch (Throwable th14) {
                                                                                    th = th14;
                                                                                }
                                                                            } catch (Throwable th15) {
                                                                                th = th15;
                                                                            }
                                                                        } catch (Throwable th16) {
                                                                            Throwable cause7 = th16.getCause();
                                                                            if (cause7 != null) {
                                                                                throw cause7;
                                                                            }
                                                                            throw th16;
                                                                        }
                                                                    } catch (Throwable th17) {
                                                                        Throwable cause8 = th17.getCause();
                                                                        if (cause8 != null) {
                                                                            throw cause8;
                                                                        }
                                                                        throw th17;
                                                                    }
                                                                } catch (IOException unused10) {
                                                                    i17 = i15;
                                                                } catch (Exception unused11) {
                                                                    i17 = i15;
                                                                    int i2010 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                    int i2011 = i2010 * 758;
                                                                    int i2012 = ((i2011 | (-21168)) << 1) - (i2011 ^ (-21168));
                                                                    int i2013 = -(-(((i2010 ^ i13) | (i2010 & i13)) * (-757)));
                                                                    int i2014 = (i2012 & i2013) + (i2013 | i2012);
                                                                    int i2015 = (-29) | i2010;
                                                                    int i2016 = (i2014 - (~(-(-((~((i2015 & i23) | (i2015 ^ i23))) * 1514))))) - 1;
                                                                    int i2017 = ~((~i2010) | (-29));
                                                                    int i2018 = ~((-29) | i13);
                                                                    int i2019 = (i2017 & i2018) | (i2017 ^ i2018);
                                                                    int i2110 = (i2010 & 28) | (i2010 ^ 28);
                                                                    int i2111 = ~((i2110 & i23) | (i2110 ^ i23));
                                                                    int i2112 = i2016 + (((i2111 & i2019) | (i2019 ^ i2111)) * 757);
                                                                    char[] cArr8 = {22, 18, Typography.quote, 16, Typography.dollar, '(', '0', 22, 29, '-', '!', '/', Typography.dollar, 14, 21, ')', 1, 22, '*', '\b', Typography.amp, '!', 21, '(', 13832, 13832, 13779};
                                                                    int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0);
                                                                    int i2113 = iLastIndexOf4 * 69;
                                                                    int i2114 = ((i2113 | (-2144)) << 1) - (i2113 ^ (-2144));
                                                                    int i2115 = ~iLastIndexOf4;
                                                                    int i2116 = (i2115 ^ (-33)) | (i2115 & (-33));
                                                                    int i2117 = (~((i2116 & i13) | (i2116 ^ i13))) | (~((iLastIndexOf4 ^ 32) | (iLastIndexOf4 & 32)));
                                                                    int i2118 = ~((i23 ^ 32) | (i23 & 32));
                                                                    int i2119 = i2114 + (((i2117 & i2118) | (i2117 ^ i2118)) * (-68));
                                                                    int i224 = (~iLastIndexOf4) | (~i23);
                                                                    int i225 = -(-((~((i224 & 32) | (i224 ^ 32))) * (-68)));
                                                                    int i226 = (i2119 & i225) + (i225 | i2119);
                                                                    int i227 = ~(((-33) & i13) | ((-33) ^ i13));
                                                                    Object[] objArr46 = new Object[1];
                                                                    c(i2112, cArr8, (byte) (i226 + (((i227 & i2115) | (i2115 ^ i227)) * 68)), objArr46);
                                                                    throw new IOException((String) objArr46[0]);
                                                                }
                                                            } catch (IOException unused12) {
                                                                obj6 = obj5;
                                                            }
                                                        } catch (Exception unused13) {
                                                            obj6 = obj5;
                                                        }
                                                    } catch (IOException unused14) {
                                                        i6 = i6;
                                                        obj6 = obj5;
                                                    }
                                                } catch (Exception unused15) {
                                                    i6 = i6;
                                                    strArr2 = strArrSplit;
                                                    obj6 = obj5;
                                                    i16 = length2;
                                                }
                                            } catch (IOException unused16) {
                                                i6 = i6;
                                                strArr2 = strArrSplit;
                                                obj6 = obj5;
                                                i16 = length2;
                                            }
                                        }
                                        i15 = (i17 & 1) + (i17 | 1);
                                        strArrSplit = strArr2;
                                        length2 = i16;
                                        i13 = i13;
                                        obj5 = obj6;
                                        i14 = 0;
                                    } else {
                                        i6 = i6;
                                        strArr2 = strArrSplit;
                                        obj6 = obj5;
                                        i13 = i13;
                                        i16 = length2;
                                        i17 = i15;
                                    }
                                    i6 = i6;
                                    i15 = (i17 & 1) + (i17 | 1);
                                    strArrSplit = strArr2;
                                    length2 = i16;
                                    i13 = i13;
                                    obj5 = obj6;
                                    i14 = 0;
                                }
                                obj = obj5;
                            } else {
                                i8 = iIndexOf;
                                obj2 = objInvoke;
                                i9 = 0;
                                i23 = i;
                                i10 = (~(i23 & 20)) & (i23 | 20);
                                int i610 = (i9 | (-i9)) >> 31;
                                int i611 = (i610 & i10) | ((~i610) & i23);
                                byte[] bArr7 = $$a;
                                byte b19 = bArr7[28];
                                Object[] objArr110 = new Object[1];
                                d(b19, (byte) (b19 | 62), (byte) (-bArr7[35]), objArr110);
                                Class<?> cls12 = Class.forName((String) objArr110[0]);
                                byte b20 = (byte) (-bArr7[40]);
                                Object[] objArr111 = new Object[1];
                                d(b20, (byte) (b20 + 2), bArr7[57], objArr111);
                                Field field3 = cls12.getField((String) objArr111[0]);
                                obj3 = obj2;
                                str = (String) field3.get(obj3);
                                length = str.length() - 6;
                                if (length >= 0) {
                                    i11 = i10;
                                    obj4 = obj3;
                                    i12 = 0;
                                    break;
                                }
                                i19 = 0;
                                while (true) {
                                    if (i19 <= length) {
                                        i11 = i10;
                                        obj4 = obj3;
                                        i12 = 0;
                                        break;
                                    }
                                    Object[] objArr112 = {str.substring(i19, i19 + 6), 931995};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                                        int iNormalizeMetaState3 = 3393 - KeyEvent.normalizeMetaState(0);
                                        int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0, 0) + 10;
                                        int i612 = $$e;
                                        Object[] objArr113 = new Object[1];
                                        e((byte) i612, $$d[7], (byte) (i612 | 14), objArr113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString2, iNormalizeMetaState3, iLastIndexOf5, 1203525406, false, (String) objArr113[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr112)).longValue();
                                    long j15 = 1530926206;
                                    long j16 = (((long) 491) * j15) + (((long) (-489)) * jLongValue3);
                                    str6 = str;
                                    i11 = i10;
                                    long j17 = -1;
                                    long j18 = j15 ^ j17;
                                    long j19 = jLongValue3 ^ j17;
                                    obj4 = obj3;
                                    i20 = length;
                                    long j110 = i23;
                                    long j111 = 490;
                                    j = j16 + (((long) (-490)) * (j18 | j19 | (j110 ^ j17))) + (((j17 ^ (j110 | j19)) | ((j15 | j19) ^ j17)) * j111) + (j111 * j18) + ((long) (-1532996083));
                                    i21 = (-13503906) + (((~(1362792491 | i23)) | 1494948393) * (-964));
                                    i22 = ~i23;
                                    if (((((int) (j >> 32)) & (i21 + (((~(1362792491 | i22)) | 134285824) * (-964)))) | (((int) j) & (399892391 + (((~(685772865 | i22)) | (~(751453544 | i23))) * 210) + (((~(i22 | (-2101250))) | (~((-67781929) | i23))) * 210)))) == -2096167706) {
                                        i12 = 1;
                                        break;
                                    }
                                    i19++;
                                    str = str6;
                                    i10 = i11;
                                    obj3 = obj4;
                                    length = i20;
                                }
                                int i613 = -i12;
                                int i614 = ((i12 & i613) | (i12 ^ i613)) >> 31;
                                int i710 = (~i614) & i23;
                                int i711 = i614 & (i23 ^ 20);
                                int i712 = (i711 & i710) | (i710 ^ i711);
                                int i713 = (~i611) & i23;
                                i13 = ~i23;
                                int i714 = i713 | (i611 & i13);
                                int i715 = -i714;
                                int i716 = ((i714 & i715) | (i714 ^ i715)) >> 31;
                                int i717 = i712 & (~i716);
                                int i718 = i611 & i716;
                                i6 = (i718 & i717) | (i717 ^ i718);
                                byte[] bArr8 = $$a;
                                byte b110 = bArr8[28];
                                Object[] objArr114 = new Object[1];
                                d(b110, (byte) (b110 | 62), (byte) (-bArr8[35]), objArr114);
                                Class<?> cls13 = Class.forName((String) objArr114[0]);
                                byte b111 = (byte) (-bArr8[40]);
                                Object[] objArr210 = new Object[1];
                                d(b111, (byte) (b111 + 2), bArr8[57], objArr210);
                                Field field4 = cls13.getField((String) objArr210[0]);
                                obj5 = obj4;
                                int i719 = i8 ^ (-1);
                                int i810 = -i719;
                                int i811 = i8 & (((i719 & i810) | (i719 ^ i810)) >> 31);
                                i14 = 0;
                                String strSubstring3 = ((String) field4.get(obj5)).substring(0, i811);
                                Object[] objArr211 = new Object[1];
                                a(new int[]{37, 1, 0, 1}, true, new byte[]{1}, objArr211);
                                strArrSplit = strSubstring3.split((String) objArr211[0]);
                                length2 = strArrSplit.length;
                                i15 = 0;
                                while (i15 < length2) {
                                    str2 = strArrSplit[i15];
                                    objArr = new Object[1];
                                    a(new int[]{38, 3, i14, i14}, true, new byte[]{1, 1, 1}, objArr);
                                    if (str2.split((String) objArr[i14]).length > 1) {
                                        synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(i14, i14, i14)), (ViewConfiguration.getEdgeSlop() >> 16) + 2267, 33 - ExpandableListView.getPackedPositionType(0)))) {
                                            Object[] objArr212 = new Object[1];
                                            a(new int[]{41, 16, 125, 9}, true, null, objArr212);
                                            String str12 = (String) objArr212[0];
                                            Runtime runtime2 = Runtime.getRuntime();
                                            int i812 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                            int iTuitionPaymentFragmentbindingInflater7 = zaq.TuitionPaymentFragmentbindingInflater1();
                                            int i813 = i812 * 55;
                                            int i814 = ((i813 | (-107)) << 1) - (i813 ^ (-107));
                                            int i815 = ~i812;
                                            strArr2 = strArrSplit;
                                            int i816 = ~(i815 | 1);
                                            i16 = length2;
                                            int i817 = ~iTuitionPaymentFragmentbindingInflater7;
                                            int i818 = i814 + ((i816 | (~((i817 ^ 1) | (i817 & 1)))) * (-108));
                                            int i819 = ~(i815 | iTuitionPaymentFragmentbindingInflater7);
                                            int i910 = ~(((-2) ^ i812) | ((-2) & i812));
                                            int i911 = (i819 ^ i910) | (i819 & i910);
                                            int i912 = ~iTuitionPaymentFragmentbindingInflater7;
                                            int i913 = ~((i912 ^ i812) | (i912 & i812));
                                            int i914 = i818 + (((i911 ^ i913) | (i911 & i913)) * 54);
                                            int i915 = ~((-2) | i812);
                                            int i916 = i914 + (((i915 & iTuitionPaymentFragmentbindingInflater7) | (iTuitionPaymentFragmentbindingInflater7 ^ i915)) * 54);
                                            char[] cArr9 = {'\n', 27};
                                            int defaultSize2 = View.getDefaultSize(0, 0);
                                            int i917 = ~((~defaultSize2) | (-15));
                                            int i918 = ~i23;
                                            obj6 = obj5;
                                            int i919 = ~(((-15) ^ i918) | ((-15) & i918));
                                            int i1010 = (i917 ^ i919) | (i919 & i917);
                                            int i1011 = (defaultSize2 ^ 14) | (defaultSize2 & 14);
                                            int i1012 = ~((i1011 ^ i23) | (i1011 & i23));
                                            int i1013 = (((defaultSize2 * 253) + 3542) - (~(-(-(((i1010 ^ i1012) | (i1010 & i1012)) * (-252)))))) - 1;
                                            int i1014 = defaultSize2 | 14;
                                            int i1015 = (i1013 - (~(i1014 * (-252)))) - 1;
                                            int i1016 = ((-15) ^ i13) | ((-15) & i13);
                                            int i1017 = ~((i1016 ^ defaultSize2) | (i1016 & defaultSize2));
                                            int i1018 = ~((i1014 ^ i23) | (i1014 & i23));
                                            int i1019 = ((i1017 & i1018) | (i1017 ^ i1018)) * 252;
                                            Object[] objArr213 = new Object[1];
                                            c(i916, cArr9, (byte) ((i1015 & i1019) + (i1015 | i1019)), objArr213);
                                            processExec = runtime2.exec((String) objArr213[0], (String[]) null, (File) null);
                                            Object[] objArr214 = {processExec.getInputStream()};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2142, 45 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1020714777, false, null, new Class[]{InputStream.class});
                                            }
                                            Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr214);
                                            Object[] objArr215 = {processExec.getErrorStream()};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 2142, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 44, -1020714777, false, null, new Class[]{InputStream.class});
                                            }
                                            Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr215);
                                            DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                            int i1110 = $$b;
                                            byte b112 = (byte) (i1110 & 91);
                                            byte[] bArr9 = $$a;
                                            i17 = i15;
                                            i6 = i6;
                                            str3 = str2;
                                            Object[] objArr216 = new Object[1];
                                            d(b112, bArr9[2], bArr9[58], objArr216);
                                            Class<?> cls14 = Class.forName((String) objArr216[0]);
                                            b2 = (byte) 29;
                                            Object[] objArr217 = new Object[1];
                                            d(b2, bArr9[14], bArr9[28], objArr217);
                                            cls14.getMethod((String) objArr217[0], null).invoke(objNewInstance3, null);
                                            byte b113 = (byte) (i1110 & 91);
                                            Object[] objArr218 = new Object[1];
                                            d(b113, bArr9[2], bArr9[58], objArr218);
                                            Class<?> cls15 = Class.forName((String) objArr218[0]);
                                            Object[] objArr219 = new Object[1];
                                            d(b2, bArr9[14], bArr9[28], objArr219);
                                            cls15.getMethod((String) objArr219[0], null).invoke(objNewInstance4, null);
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(str12);
                                            int offsetBefore2 = TextUtils.getOffsetBefore("", 0);
                                            int i1111 = offsetBefore2 * (-1939);
                                            int i1112 = ((i1111 | 971) << 1) - (i1111 ^ 971);
                                            int i1113 = ~(((-2) & offsetBefore2) | ((-2) ^ offsetBefore2));
                                            int i1114 = ~(i13 | 1);
                                            int i1115 = -(-(((i1113 & i1114) | (i1113 ^ i1114)) * (-970)));
                                            int i1116 = ~offsetBefore2;
                                            int i1117 = (((i1112 | i1115) << 1) - (i1115 ^ i1112)) + ((~((i1116 ^ 1) | (i1116 & 1))) * 1940);
                                            int i1118 = ~((i1116 & (-2)) | (i1116 ^ (-2)));
                                            int i1119 = ~((i918 ^ 1) | (i918 & 1));
                                            int i1210 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            int iTuitionPaymentFragmentbindingInflater8 = zaq.TuitionPaymentFragmentbindingInflater1();
                                            int i1211 = (i1210 * 50) - 7081;
                                            int i1212 = ~iTuitionPaymentFragmentbindingInflater8;
                                            int i1213 = ~((-74) | i1212);
                                            int i1214 = ~(((-74) ^ i1210) | ((-74) & i1210));
                                            int i1215 = ((i1213 ^ i1214) | (i1214 & i1213)) * 98;
                                            int i1216 = (i1211 ^ i1215) + ((i1215 & i1211) << 1);
                                            int i1217 = ~i1210;
                                            int i1218 = ~((i1217 & i1212) | (i1217 ^ i1212));
                                            int i1219 = ((-74) & i1218) | ((-74) ^ i1218);
                                            int i1310 = ~((i1210 ^ iTuitionPaymentFragmentbindingInflater8) | (i1210 & iTuitionPaymentFragmentbindingInflater8));
                                            int i1311 = -(-(((i1219 & i1310) | (i1219 ^ i1310)) * (-49)));
                                            int i1312 = (i1216 ^ i1311) + ((i1311 & i1216) << 1);
                                            int i1313 = ~(((-74) & iTuitionPaymentFragmentbindingInflater8) | ((-74) ^ iTuitionPaymentFragmentbindingInflater8));
                                            int i1314 = ~((i1210 & 73) | (i1210 ^ 73));
                                            Object[] objArr310 = new Object[1];
                                            c((i1117 - (~(-(-(((i1118 & i1119) | (i1118 ^ i1119)) * 970))))) - 1, new char[]{13784}, (byte) (i1312 + (((i1314 & i1313) | (i1313 ^ i1314)) * 49)), objArr310);
                                            sb3.append((String) objArr310[0]);
                                            String string3 = sb3.toString();
                                            int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                            int iTuitionPaymentFragmentbindingInflater9 = zaq.TuitionPaymentFragmentbindingInflater1();
                                            int i1315 = keyRepeatTimeout2 * (-433);
                                            int i1316 = (i1315 & (-1080)) + (i1315 | (-1080));
                                            int i1317 = ~keyRepeatTimeout2;
                                            int i1318 = ~iTuitionPaymentFragmentbindingInflater9;
                                            int i1319 = ~((i1317 ^ i1318) | (i1317 & i1318));
                                            int i1410 = ~(((-6) ^ iTuitionPaymentFragmentbindingInflater9) | ((-6) & iTuitionPaymentFragmentbindingInflater9));
                                            int i1411 = -(-(((i1319 ^ i1410) | (i1319 & i1410)) * 217));
                                            int i1412 = (((i1316 & i1411) + (i1316 | i1411)) - (~(((~((iTuitionPaymentFragmentbindingInflater9 & i1317) | (i1317 ^ iTuitionPaymentFragmentbindingInflater9))) | (~((i1317 ^ (-6)) | (i1317 & (-6))))) * 217))) - 1;
                                            int i1413 = (keyRepeatTimeout2 | (~(((-6) ^ i1318) | ((-6) & i1318)))) * 217;
                                            int i1414 = (i1412 & i1413) + (i1413 | i1412);
                                            char[] cArr10 = {Typography.amp, 16, 24, '\'', 13788};
                                            int i1415 = -ImageFormat.getBitsPerPixel(0);
                                            int i1416 = i1415 * (-1335);
                                            int i1417 = (i1416 ^ (-38019)) + ((i1416 & (-38019)) << 1);
                                            int i1418 = (i1415 ^ i23) | (i1415 & i23);
                                            int i1419 = ~i1418;
                                            byte b114 = (byte) ((((((i1417 - (~((((-58) ^ i1419) | (i1419 & (-58))) * (-668)))) - 1) - (~(-(-((i1415 | (~(((-58) ^ i23) | ((-58) & i23)))) * 1336))))) - 1) - (~(-(-(((i1418 & (-58)) | (i1418 ^ (-58))) * 668))))) - 1);
                                            Object[] objArr311 = new Object[1];
                                            c(i1414, cArr10, b114, objArr311);
                                            dataOutputStream2.write(string3.getBytes((String) objArr311[0]));
                                            dataOutputStream2.flush();
                                            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0);
                                            int i1510 = iResolveOpacity2 * (-1965);
                                            int i1511 = (((i1510 & 4920) + (i1510 | 4920)) - (~(-(-(((iResolveOpacity2 ^ (-6)) | (iResolveOpacity2 & (-6))) * 983))))) - 1;
                                            int i1512 = ~iResolveOpacity2;
                                            int i1513 = ~(((-6) ^ i918) | ((-6) & i918));
                                            int i1514 = -(-(((i1513 & i1512) | (i1512 ^ i1513)) * (-983)));
                                            int i1515 = (i1511 & i1514) + (i1511 | i1514);
                                            int i1516 = ~((~iResolveOpacity2) | i13);
                                            int i1517 = ~((i1512 & 5) | (i1512 ^ 5));
                                            int i1518 = ((i1516 & i1517) | (i1516 ^ i1517)) * 983;
                                            int i1519 = (i1515 & i1518) + (i1518 | i1515);
                                            char[] cArr11 = {'*', '#', Typography.quote, 23, 13761};
                                            byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
                                            int iTuitionPaymentFragmentbindingInflater10 = zaq.TuitionPaymentFragmentbindingInflater1();
                                            int i1610 = modifierMetaStateMask2 * 273;
                                            int i1611 = (i1610 ^ (-13550)) + ((i1610 & (-13550)) << 1);
                                            int i1612 = ~modifierMetaStateMask2;
                                            int i1613 = (i1612 & (-51)) | (i1612 ^ (-51));
                                            int i1614 = ~iTuitionPaymentFragmentbindingInflater10;
                                            int i1615 = ~((i1613 & i1614) | (i1613 ^ i1614));
                                            int i1616 = ~(modifierMetaStateMask2 | 50 | iTuitionPaymentFragmentbindingInflater10);
                                            int i1617 = i1611 + (((i1615 & i1616) | (i1615 ^ i1616)) * (-272));
                                            int i1618 = ~modifierMetaStateMask2;
                                            int i1619 = ~((i1618 ^ 50) | (i1618 & 50));
                                            int i1710 = ~((i1618 & iTuitionPaymentFragmentbindingInflater10) | (i1618 ^ iTuitionPaymentFragmentbindingInflater10));
                                            int i1711 = -(-(((i1710 & i1619) | (i1619 ^ i1710)) * (-272)));
                                            int i1712 = ((i1617 | i1711) << 1) - (i1711 ^ i1617);
                                            int i1713 = ~((modifierMetaStateMask2 & iTuitionPaymentFragmentbindingInflater10) | (modifierMetaStateMask2 ^ iTuitionPaymentFragmentbindingInflater10));
                                            int i1714 = -(-(((i1713 & 50) | (i1713 ^ 50)) * 272));
                                            Object[] objArr312 = new Object[1];
                                            c(i1519, cArr11, (byte) ((i1712 ^ i1714) + ((i1714 & i1712) << 1)), objArr312);
                                            String str13 = (String) objArr312[0];
                                            int i1715 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            int iTuitionPaymentFragmentbindingInflater11 = zaq.TuitionPaymentFragmentbindingInflater1();
                                            int i1716 = i1715 * (-419);
                                            int i1717 = (i1716 & 2526) + (i1716 | 2526);
                                            int i1718 = -(-((~((iTuitionPaymentFragmentbindingInflater11 ^ 6) | (iTuitionPaymentFragmentbindingInflater11 & 6))) * TypedValues.CycleType.TYPE_EASING));
                                            int i1719 = ((i1717 | i1718) << 1) - (i1718 ^ i1717);
                                            int i1810 = ~i1715;
                                            int i1811 = -(-(((i1810 & 6) | (i1810 ^ 6)) * (-420)));
                                            int i1812 = (i1719 ^ i1811) + ((i1811 & i1719) << 1);
                                            int i1813 = ~((~i1715) | (-7));
                                            int i1814 = ~iTuitionPaymentFragmentbindingInflater11;
                                            int i1815 = ~((i1814 & 6) | (i1814 ^ 6));
                                            int i1816 = -(-(((i1813 & i1815) | (i1813 ^ i1815)) * TypedValues.CycleType.TYPE_EASING));
                                            int i1817 = (i1812 & i1816) + (i1816 | i1812);
                                            char[] cArr12 = {Typography.amp, 16, 24, '\'', 13788};
                                            int i1818 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            Object[] objArr313 = new Object[1];
                                            c(i1817, cArr12, (byte) ((i1818 & 59) + (i1818 | 59)), objArr313);
                                            dataOutputStream2.write(str13.getBytes((String) objArr313[0]));
                                            dataOutputStream2.flush();
                                            long jNanoTime2 = System.nanoTime();
                                            long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                            while (true) {
                                                processExec.exitValue();
                                                i13 = i13;
                                                break;
                                            }
                                            dataOutputStream2.close();
                                            int i1819 = $$b;
                                            byte[] bArr10 = $$a;
                                            Object[] objArr314 = new Object[1];
                                            d((byte) (i1819 & 91), bArr10[2], bArr10[58], objArr314);
                                            Class<?> cls16 = Class.forName((String) objArr314[0]);
                                            byte b115 = (byte) 30;
                                            Object[] objArr315 = new Object[1];
                                            d(b115, bArr10[28], bArr10[58], objArr315);
                                            cls16.getMethod((String) objArr315[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                            Object[] objArr316 = new Object[1];
                                            d((byte) (i1819 & 91), bArr10[2], bArr10[58], objArr316);
                                            Class<?> cls17 = Class.forName((String) objArr316[0]);
                                            Object[] objArr47 = new Object[1];
                                            d(b115, bArr10[28], bArr10[58], objArr47);
                                            cls17.getMethod((String) objArr47[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                            processExec.destroy();
                                            StringBuilder sb4 = new StringBuilder();
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char mode2 = (char) View.MeasureSpec.getMode(0);
                                                int scrollDefaultDelay2 = 2142 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                int iNormalizeMetaState4 = 45 - KeyEvent.normalizeMetaState(0);
                                                byte b116 = $$d[7];
                                                Object[] objArr48 = new Object[1];
                                                e(b116, b116, (byte) $$e, objArr48);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode2, scrollDefaultDelay2, iNormalizeMetaState4, 399405187, false, (String) objArr48[0], null);
                                            }
                                            sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance3).toString());
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char size2 = (char) View.MeasureSpec.getSize(0);
                                                int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 2142;
                                                int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46;
                                                byte b117 = $$d[7];
                                                Object[] objArr49 = new Object[1];
                                                e(b117, b117, (byte) $$e, objArr49);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size2, iCombineMeasuredStates2, iIndexOf4, 399405187, false, (String) objArr49[0], null);
                                            }
                                            sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance4).toString());
                                            String string4 = sb4.toString();
                                            int i1910 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int i1911 = ~i1910;
                                            int i1912 = (((i1910 * (-167)) - 12024) - (~(-(-(((~((i1911 & (-73)) | (i1911 ^ (-73)))) | (~(((-73) & i23) | ((-73) ^ i23)))) * 336))))) - 1;
                                            int i1913 = -(-(((~(i1910 | 72)) | (~((i1910 ^ i23) | (i1910 & i23)))) * (-168)));
                                            int i1914 = ~((i1910 & i918) | (i918 ^ i1910));
                                            Object[] objArr410 = new Object[1];
                                            c(0 - (~(-TextUtils.indexOf("", ""))), new char[]{13784}, (byte) ((i1912 & i1913) + (i1912 | i1913) + (((i1914 & (-73)) | ((-73) ^ i1914)) * 168)), objArr410);
                                            strArrSplit2 = string4.split((String) objArr410[0]);
                                            length3 = strArrSplit2.length;
                                            i18 = 0;
                                            while (true) {
                                                if (i18 < length3) {
                                                    str4 = strArrSplit2[i18];
                                                    objArr2 = new Object[1];
                                                    a(new int[]{57, 19, 49, 14}, false, new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0}, objArr2);
                                                    if (str4.startsWith((String) objArr2[0])) {
                                                        int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21;
                                                        char[] cArr13 = {'\b', 14, 24, 5, 16, 22, Typography.amp, '*', 24, '!', 6, 29, 20, Typography.dollar, '(', ')', ' ', 31, ')', ' '};
                                                        int i1915 = -View.resolveSizeAndState(0, 0, 0);
                                                        objArr3 = new Object[1];
                                                        c(iIndexOf5, cArr13, (byte) (((i1915 | 110) << 1) - (i1915 ^ 110)), objArr3);
                                                        if (str4.startsWith((String) objArr3[0])) {
                                                            objArr4 = new Object[1];
                                                            a(new int[]{76, 8, 182, 0}, false, new byte[]{0, 1, 0, 0, 0, 0, 0, 1}, objArr4);
                                                            if (str4.startsWith((String) objArr4[0])) {
                                                                Object[] objArr411 = new Object[1];
                                                                a(new int[]{84, 1, 0, 1}, true, new byte[]{0}, objArr411);
                                                                strArrSplit3 = str4.split((String) objArr411[0]);
                                                                if (strArrSplit3.length > 1) {
                                                                    str5 = str3;
                                                                    if (strArrSplit3[1].equalsIgnoreCase(str5)) {
                                                                        int i1916 = i23 ^ i6;
                                                                        int i1917 = -i1916;
                                                                        int i1918 = ((i1916 & i1917) | (i1916 ^ i1917)) >> 31;
                                                                        i6 = (i6 & i1918) | (i11 & (~i1918));
                                                                    }
                                                                } else {
                                                                    str5 = str3;
                                                                }
                                                            } else {
                                                                str5 = str3;
                                                            }
                                                        } else {
                                                            str5 = str3;
                                                        }
                                                    } else {
                                                        str5 = str3;
                                                    }
                                                    int i1919 = (i18 & 122) + (i18 | 122);
                                                    i18 = ((i1919 | (-121)) << 1) - (i1919 ^ (-121));
                                                    str3 = str5;
                                                }
                                                i15 = (i17 & 1) + (i17 | 1);
                                                strArrSplit = strArr2;
                                                length2 = i16;
                                                i13 = i13;
                                                obj5 = obj6;
                                                i14 = 0;
                                            }
                                        }
                                    } else {
                                        i6 = i6;
                                        strArr2 = strArrSplit;
                                        obj6 = obj5;
                                        i13 = i13;
                                        i16 = length2;
                                        i17 = i15;
                                    }
                                    i6 = i6;
                                    i15 = (i17 & 1) + (i17 | 1);
                                    strArrSplit = strArr2;
                                    length2 = i16;
                                    i13 = i13;
                                    obj5 = obj6;
                                    i14 = 0;
                                }
                                obj = obj5;
                            }
                        } else {
                            obj = objInvoke;
                            i6 = i23;
                        }
                        byte[] bArr11 = $$a;
                        byte b21 = bArr11[28];
                        Object[] objArr50 = new Object[1];
                        d(b21, (byte) (b21 | 62), (byte) (-bArr11[35]), objArr50);
                        Class<?> cls18 = Class.forName((String) objArr50[0]);
                        byte b22 = (byte) (-bArr11[40]);
                        Object[] objArr51 = new Object[1];
                        d(b22, (byte) (b22 + 2), bArr11[57], objArr51);
                        String[] strArr3 = {cls18.getField((String) objArr51[0]).get(obj)};
                        Object obj7 = new Object[]{new int[1], strArr3}[0];
                        ((int[]) obj7)[0] = i6;
                        i4 = ((int[]) obj7)[0];
                        String[] strArr4 = strArr3;
                        if ((i2 & 1) == 0) {
                            Object[] objArr52 = new Object[1];
                            c((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, new char[]{'(', Typography.dollar, '\t', '!', 21, '(', 21, 14, Typography.quote, 17, '!', 23, 13865}, (byte) (View.MeasureSpec.getSize(0) + 70), objArr52);
                            try {
                                Object[] objArr53 = {(String) objArr52[0]};
                                Object[] objArr54 = new Object[1];
                                a(new int[]{0, 23, 114, 6}, true, new byte[]{1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0}, objArr54);
                                Class<?> cls19 = Class.forName((String) objArr54[0]);
                                Object[] objArr55 = new Object[1];
                                a(new int[]{85, 16, 161, 11}, false, new byte[]{0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0}, objArr55);
                                Object objInvoke2 = cls19.getMethod((String) objArr55[0], String.class).invoke(context, objArr53);
                                if (objInvoke2 == null) {
                                    strArr4 = strArr4;
                                    i7 = i23;
                                    break;
                                }
                                int fadingEdgeLength = 37 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                char[] cArr14 = {20, Typography.dollar, '(', ')', ' ', 31, ')', ' ', 14, '\b', '\r', 28, 18, Typography.dollar, 2, 29, '0', ')', 7, Typography.amp, '\t', '!', 21, '(', Typography.amp, 29, 16, Typography.quote, 27, 22, '\b', 18, Typography.dollar, 20, 21, '%', 13894};
                                int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                int iTuitionPaymentFragmentbindingInflater12 = zaq.TuitionPaymentFragmentbindingInflater1();
                                int i228 = scrollBarSize * (-55);
                                int i229 = (i228 ^ (-5170)) + ((i228 & (-5170)) << 1);
                                int i230 = -(-(((~((scrollBarSize ^ iTuitionPaymentFragmentbindingInflater12) | (scrollBarSize & iTuitionPaymentFragmentbindingInflater12))) | 94) * 56));
                                int i231 = (((i229 | i230) << 1) - (i230 ^ i229)) + ((~((scrollBarSize ^ 94) | (scrollBarSize & 94))) * (-56));
                                int i232 = ~iTuitionPaymentFragmentbindingInflater12;
                                int i233 = ~((i232 & 94) | (i232 ^ 94));
                                int i234 = -(-(((scrollBarSize & i233) | (scrollBarSize ^ i233)) * 56));
                                Object[] objArr56 = new Object[1];
                                c(fadingEdgeLength, cArr14, (byte) (((i231 | i234) << 1) - (i234 ^ i231)), objArr56);
                                Class<?> cls20 = Class.forName((String) objArr56[0]);
                                Object[] objArr57 = new Object[1];
                                a(new int[]{101, 15, 0, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0}, objArr57);
                                List list = (List) cls20.getMethod((String) objArr57[0], null).invoke(objInvoke2, null);
                                if (list == null) {
                                    strArr4 = strArr4;
                                    i7 = i23;
                                    break;
                                }
                                Iterator it = list.iterator();
                                loop5: while (true) {
                                    if (!it.hasNext()) {
                                        strArr4 = strArr4;
                                        i7 = i23;
                                        break;
                                    }
                                    Object next = it.next();
                                    Object[] objArr58 = new Object[1];
                                    a(new int[]{116, 29, 95, 3}, false, new byte[]{0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0}, objArr58);
                                    Class<?> cls21 = Class.forName((String) objArr58[0]);
                                    Object[] objArr59 = new Object[1];
                                    a(new int[]{23, 14, 97, 11}, false, new byte[]{1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1}, objArr59);
                                    String str14 = (String) cls21.getMethod((String) objArr59[0], null).invoke(next, null);
                                    int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                    Object[] objArr60 = new Object[1];
                                    c(((jumpTapTimeout | 37) << 1) - (jumpTapTimeout ^ 37), new char[]{20, Typography.dollar, '(', ')', ' ', 31, ')', ' ', 14, '\b', '\r', 28, 18, Typography.dollar, 2, 29, '0', ')', 7, Typography.amp, '\t', '!', 21, '(', Typography.amp, 29, 16, Typography.quote, 27, 22, '\b', 18, Typography.dollar, 20, 21, '%', 13894}, (byte) (Color.alpha(0) + 94), objArr60);
                                    Class<?> cls22 = Class.forName((String) objArr60[0]);
                                    int i235 = -View.MeasureSpec.getMode(0);
                                    int i236 = (i235 ^ 17) + ((i235 & 17) << 1);
                                    char[] cArr15 = {Typography.quote, '\t', '%', ')', ' ', Typography.quote, Typography.quote, 16, '%', '*', 20, '(', Typography.dollar, ')', '\n', '\b', 13853};
                                    int i237 = -(-View.getDefaultSize(0, 0));
                                    Object[] objArr61 = new Object[1];
                                    c(i236, cArr15, (byte) (((i237 | 51) << 1) - (i237 ^ 51)), objArr61);
                                    if (((Boolean) cls22.getMethod((String) objArr61[0], String.class).invoke(objInvoke2, str14)).booleanValue()) {
                                        int length5 = str14.length();
                                        int i238 = (length5 & (-20)) + (length5 | (-20));
                                        if (i238 >= 0) {
                                            int i239 = 0;
                                            while (i239 <= i238) {
                                                Object[] objArr62 = {str14.substring(i239, i239 + 20), 931995};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                    char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int mode3 = View.MeasureSpec.getMode(0) + 3393;
                                                    int doubleTapTimeout = 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                    int i240 = $$e;
                                                    Object[] objArr63 = new Object[1];
                                                    e((byte) i240, $$d[7], (byte) (i240 | 14), objArr63);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, mode3, doubleTapTimeout, 1203525406, false, (String) objArr63[0], new Class[]{String.class, Integer.TYPE});
                                                }
                                                long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr62)).longValue();
                                                long j20 = 1480173984;
                                                Object obj8 = objInvoke2;
                                                Iterator it2 = it;
                                                String str15 = str14;
                                                long j21 = i23;
                                                int i241 = i238;
                                                int i242 = i239;
                                                long j22 = -1;
                                                long j23 = j21 ^ j22;
                                                long j24 = 521;
                                                long j25 = j20 ^ j22;
                                                long j26 = (((long) 522) * j20) + (((long) (-520)) * jLongValue4) + (((long) (-1042)) * (j20 | ((j23 | jLongValue4) ^ j22))) + ((jLongValue4 | j21) * j24) + (j24 * (((j25 | (jLongValue4 ^ j22)) ^ j22) | ((j25 | j21) ^ j22) | (j22 ^ (jLongValue4 | (j23 | j20))))) + ((long) (-1482243861));
                                                int i243 = (-818885110) + (((~(1859303578 | i23)) | (-2144532923) | (~(998437306 | i23))) * (-880));
                                                int i244 = ~i23;
                                                int i245 = (~(1859303578 | i244)) | (-998437307);
                                                int i246 = ~((-1859303579) | i23);
                                                int i247 = ((int) (j26 >> 32)) & (i243 + ((i245 | i246) * (-880)) + (i246 * 880));
                                                int i248 = ((int) j26) & ((-2038855459) + (((~(854191013 | i23)) | (~((-271122434) | i244))) * 920) + (((~(854157829 | i244)) | (-854191014)) * 920) + (((~(i244 | 854191013)) | (~((-33185) | i23)) | (~((-271122434) | i23))) * 920));
                                                if (((i247 & i248) | (i247 ^ i248)) == 1245577864) {
                                                    i7 = (~(i23 & 70)) & (i23 | 70);
                                                    break loop5;
                                                }
                                                i239 = i242 + 1;
                                                objInvoke2 = obj8;
                                                it = it2;
                                                str14 = str15;
                                                strArr4 = strArr4;
                                                i238 = i241;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    objInvoke2 = objInvoke2;
                                    it = it;
                                    strArr4 = strArr4;
                                }
                                int i249 = (~(i23 & i4)) & (i23 | i4);
                                int i250 = -i249;
                                int i251 = ((i249 & i250) | (i249 ^ i250)) >> 31;
                                int i252 = i7 & (~i251);
                                int i253 = i4 & i251;
                                i4 = (i253 & i252) | (i252 ^ i253);
                            } catch (Throwable th18) {
                                Throwable cause9 = th18.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th18;
                            }
                        } else {
                            strArr4 = strArr4;
                        }
                        strArr = strArr4;
                        i5 = 0;
                    } catch (Throwable th19) {
                        Throwable cause10 = th19.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th19;
                    }
                } else {
                    i4 = i23;
                    i5 = 0;
                    strArr = null;
                }
                int i254 = -Color.argb(i5, i5, i5, i5);
                Object[] objArr64 = new Object[1];
                c((i254 ^ 12) + ((i254 & 12) << 1), new char[]{',', 21, 28, Typography.dollar, 20, Typography.quote, '*', 2, Typography.quote, '\'', Typography.quote, ' '}, (byte) (74 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr64);
                Object[] objArr65 = {(String) objArr64[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char c4 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int i255 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 992;
                    int iAxisFromString = MotionEvent.axisFromString("") + 9;
                    byte b23 = (byte) $$e;
                    Object[] objArr66 = new Object[1];
                    e(b23, b23, (byte) (-$$d[15]), objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, i255, iAxisFromString, -545305915, false, (String) objArr66[0], new Class[]{String.class});
                }
                long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr65)).longValue();
                long j27 = -935147799;
                long j28 = (((long) 960) * j27) + (((long) (-1917)) * jLongValue5);
                long j29 = 959;
                long j30 = -1;
                long j31 = jLongValue5 ^ j30;
                long j32 = i23;
                long j33 = j32 ^ j30;
                String[] strArr5 = strArr;
                int i256 = i4;
                long j34 = j28 + ((((j31 | j33) ^ j30) | ((j27 | j32) ^ j30)) * j29) + (((long) (-959)) * j31) + (j29 * (((j31 | j32) ^ j30) | ((j33 | j27) ^ j30))) + ((long) 1555607083);
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i257 = ((int) (j34 >> 32)) & ((-2072279902) + ((~((~startElapsedRealtime) | (-1348481030))) * (-116)) + (((-1349874192) | startElapsedRealtime) * 116) + (((~(startElapsedRealtime | 1507866693)) | (-1509259856)) * 116));
                int i258 = ~(Process.myUid() | 1879308664);
                int i259 = i257 | (((int) j34) & ((((1073891616 | i258) * (-196)) - 355818635) + ((i258 | 805417048) * 196)));
                int i260 = (~(i & 50)) & (i | 50);
                int i261 = (i259 | (-i259)) >> 31;
                int i262 = (~i261) & i;
                int i263 = i261 & i260;
                int i264 = (i263 & i262) | (i262 ^ i263);
                int i265 = (~i256) & i;
                int i266 = ~i;
                int i267 = i265 | (i256 & i266);
                int i268 = -i267;
                int i269 = ((i267 & i268) | (i267 ^ i268)) >> 31;
                int i270 = i264 & (~i269);
                int i271 = i256 & i269;
                int i272 = (i270 & i271) | (i270 ^ i271);
                int i273 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                int iTuitionPaymentFragmentbindingInflater13 = zaq.TuitionPaymentFragmentbindingInflater1();
                int i274 = i273 * 495;
                int i275 = (i274 ^ (-9860)) + ((i274 & (-9860)) << 1) + (((i273 ^ (-21)) | (i273 & (-21))) * (-988));
                int i276 = ~i273;
                int i277 = (i276 ^ 20) | (i276 & 20);
                int i278 = ~iTuitionPaymentFragmentbindingInflater13;
                int i279 = ((i277 & i278) | (i277 ^ i278)) * 494;
                int i280 = ((i275 | i279) << 1) - (i275 ^ i279);
                int i281 = ~((i276 & (-21)) | (i276 ^ (-21)));
                int i282 = ~((i278 & 20) | (i278 ^ 20));
                int i283 = (i282 & i281) | (i281 ^ i282);
                int i284 = ~(i273 | 20);
                int i285 = ((i284 & i283) | (i283 ^ i284)) * 494;
                int i286 = (i280 & i285) + (i285 | i280);
                char[] cArr16 = {'0', 7, 27, 7, 21, ')', 0, '+', '\r', '\b', 31, Typography.amp, '#', Typography.dollar, 20, 7, '\b', 14, 21, '('};
                int i287 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr67 = new Object[1];
                c(i286, cArr16, (byte) ((i287 & 11) + (i287 | 11)), objArr67);
                Object[] objArr68 = {(String) objArr67[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i288 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 994;
                    int iRed = 8 - Color.red(0);
                    byte b24 = (byte) $$e;
                    Object[] objArr69 = new Object[1];
                    e(b24, b24, (byte) (-$$d[15]), objArr69);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumDrawingCacheSize, i288, iRed, -545305915, false, (String) objArr69[0], new Class[]{String.class});
                }
                long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr68)).longValue();
                long j35 = 302522040;
                long j36 = (((long) (-244)) * j35) + (((long) 246) * jLongValue6);
                long j37 = -245;
                long j38 = jLongValue6 ^ j30;
                long j39 = j36 + ((((j38 | j33) ^ j30) | ((j38 | j35) ^ j30)) * j37);
                long j40 = (j38 | j32) ^ j30;
                long j41 = j39 + (j37 * j40) + (((long) 245) * (j40 | j35)) + ((long) 317937244);
                int i289 = ~((int) Runtime.getRuntime().freeMemory());
                int i290 = ((int) (j41 >> 32)) & (1718046307 + (((~((-1483976867) | i289)) | 46750455) * (-983)) + (((~(i289 | 46750455)) | (-1526463224)) * 983));
                int i291 = ((int) j41) & ((-955608591) + (((~(353649411 | i)) | 1083576998) * (-948)) + ((~(1435915175 | i266)) * (-948)) + 509238524);
                int i292 = (i290 & i291) | (i290 ^ i291);
                int i293 = (~(i & 60)) & (i | 60);
                int i294 = (i292 | (-i292)) >> 31;
                int i295 = (~i294) & i;
                int i296 = i294 & i293;
                int i297 = ((~i272) & i) | (i272 & i266);
                int i298 = (i297 | (-i297)) >> 31;
                int i299 = ((i296 & i295) | (i295 ^ i296)) & (~i298);
                int i300 = i272 & i298;
                int i301 = (i300 & i299) | (i299 ^ i300);
                int i302 = -MotionEvent.axisFromString("");
                int iTuitionPaymentFragmentbindingInflater14 = zaq.TuitionPaymentFragmentbindingInflater1();
                int i303 = (i302 * (-300)) + 10570;
                int i304 = i302 | 35;
                int i305 = (~((i304 & iTuitionPaymentFragmentbindingInflater14) | (i304 ^ iTuitionPaymentFragmentbindingInflater14))) * (-301);
                int i306 = (i303 ^ i305) + ((i303 & i305) << 1);
                int i307 = ~(((-36) & iTuitionPaymentFragmentbindingInflater14) | ((-36) ^ iTuitionPaymentFragmentbindingInflater14));
                int i308 = ~iTuitionPaymentFragmentbindingInflater14;
                int i309 = ~((i308 & i302) | (i308 ^ i302));
                int i310 = -(-(((i307 & i309) | (i307 ^ i309)) * (-301)));
                int i311 = (i306 & i310) + (i310 | i306);
                int i312 = ~i302;
                int i313 = ((~((i312 & iTuitionPaymentFragmentbindingInflater14) | (i312 ^ iTuitionPaymentFragmentbindingInflater14))) | (-36)) * 301;
                int i314 = ((i311 | i313) << 1) - (i313 ^ i311);
                char[] cArr17 = {'.', '#', 20, 22, 14, '+', Typography.dollar, 18, 22, 20, '/', 21, 29, 3, 30, 27, 3, ' ', 29, 28, 20, Typography.dollar, '(', ')', ' ', 31, '#', '.', 19, '(', 7, 20, Typography.dollar, 18, 22, 20};
                int i315 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iTuitionPaymentFragmentbindingInflater15 = zaq.TuitionPaymentFragmentbindingInflater1();
                int i316 = i315 * 306;
                int i317 = ((i316 | TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) << 1) - (i316 ^ TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
                int i318 = ((i317 | 30294) << 1) - (i317 ^ 30294);
                int i319 = ~((i315 ^ 99) | (i315 & 99));
                int i320 = ~((i315 ^ iTuitionPaymentFragmentbindingInflater15) | (i315 & iTuitionPaymentFragmentbindingInflater15));
                int i321 = ~iTuitionPaymentFragmentbindingInflater15;
                int i322 = ~((i315 & i321) | (i321 ^ i315));
                byte b25 = (byte) (i318 + (((i319 & i320) | (i319 ^ i320)) * 305) + (((i322 & (-100)) | ((-100) ^ i322)) * 305));
                Object[] objArr70 = new Object[1];
                c(i314, cArr17, b25, objArr70);
                Object[] objArr71 = {(String) objArr70[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c5 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int offsetBefore3 = 993 - TextUtils.getOffsetBefore("", 0);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 8;
                    byte b26 = (byte) $$e;
                    byte b27 = b26;
                    Object[] objArr72 = new Object[1];
                    e(b26, b27, (byte) (b27 | 13), objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c5, offsetBefore3, maxKeyCode, 349342683, false, (String) objArr72[0], new Class[]{String.class});
                }
                long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr71)).longValue();
                long j42 = -292754138;
                long j43 = -103;
                long j44 = (j43 * j42) + (j43 * jLongValue7);
                long j45 = 104;
                long j46 = jLongValue7 ^ j30;
                long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
                long j47 = j44 + (((((j42 ^ j30) | j46) ^ j30) | ((j46 | jMaxMemory) ^ j30)) * j45) + (((long) (-104)) * ((((jMaxMemory ^ j30) | j42) | jLongValue7) ^ j30)) + (j45 * (j42 | jMaxMemory)) + ((long) (-554324467));
                int i323 = ((int) (j47 >> 32)) & (1942838314 + (((~(1184120814 | i266)) | 557924352 | (~(i266 | (-1673620071)))) * 464) + ((i | 1742045166) * (-464)) + (((~((-1673620071) | i)) | 557924352) * 464));
                int i324 = ~(1663298839 | i266);
                int i325 = ((int) j47) & ((-255813939) + ((68161576 | i324) * (-712)) + (((~((-68161577) | i266)) | (~(1731460415 | i))) * (-712)) + ((i324 | (-1194442047)) * 712));
                int i326 = (i325 & i323) | (i323 ^ i325);
                int i327 = -i326;
                int i328 = ((i326 & i327) | (i326 ^ i327)) >> 31;
                int i329 = i & (~i328);
                int i330 = i328 & ((i & (-81)) | (i266 & 80));
                int i331 = (i330 & i329) | (i329 ^ i330);
                int i332 = (~(i & i301)) & (i | i301);
                int i333 = -i332;
                int i334 = ((i332 & i333) | (i332 ^ i333)) >> 31;
                int i335 = i331 & (~i334);
                int i336 = i301 & i334;
                int i337 = (i335 & i336) | (i335 ^ i336);
                int i338 = 40 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                char[] cArr18 = {'.', '#', 20, 22, 14, '+', Typography.dollar, 18, 22, 20, '/', 21, 29, 3, '!', 27, 17, Typography.quote, '#', Typography.dollar, 29, 20, '#', '(', Typography.amp, '!', ' ', '%', ' ', ')', Typography.dollar, 22, 27, ')', 7, '\b', 19, 22, '*', 0, '\b', 5};
                int i339 = -(Process.myTid() >> 22);
                int iTuitionPaymentFragmentbindingInflater16 = zaq.TuitionPaymentFragmentbindingInflater1();
                int i340 = i339 * 615;
                int i341 = (i340 ^ (-59461)) + ((i340 & (-59461)) << 1);
                int i342 = ~i339;
                int i343 = i342 | 97;
                int i344 = ~i343;
                int i345 = (i344 & iTuitionPaymentFragmentbindingInflater16) | (iTuitionPaymentFragmentbindingInflater16 ^ i344);
                int i346 = ~(((-98) ^ i339) | ((-98) & i339));
                int i347 = ((i345 & i346) | (i345 ^ i346)) * 614;
                int i348 = (i341 ^ i347) + ((i341 & i347) << 1);
                int i349 = ~i339;
                int i350 = ~iTuitionPaymentFragmentbindingInflater16;
                int i351 = ~(i349 | i350);
                int i352 = ~i343;
                int i353 = (i352 & i351) | (i351 ^ i352);
                int i354 = ~((i350 ^ 97) | (i350 & 97));
                int i355 = (i348 - (~(-(-(((i353 & i354) | (i353 ^ i354)) * (-1228)))))) - 1;
                int i356 = (i342 & (-98)) | (i342 ^ (-98));
                int i357 = ~iTuitionPaymentFragmentbindingInflater16;
                int i358 = ~((i356 & i357) | (i356 ^ i357));
                int i359 = (i339 & i357) | (i357 ^ i339);
                int i360 = ~((i359 & 97) | (i359 ^ 97));
                int i361 = ((i360 & i358) | (i358 ^ i360)) * 614;
                Object[] objArr73 = new Object[1];
                c(i338, cArr18, (byte) ((i355 ^ i361) + ((i361 & i355) << 1)), objArr73);
                Object[] objArr74 = {(String) objArr73[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int iIndexOf6 = 993 - TextUtils.indexOf("", "", 0);
                    int iIndexOf7 = TextUtils.indexOf((CharSequence) "", '0') + 9;
                    byte b28 = (byte) $$e;
                    byte b29 = b28;
                    Object[] objArr75 = new Object[1];
                    e(b28, b29, (byte) (b29 | 13), objArr75);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(capsMode, iIndexOf6, iIndexOf7, 349342683, false, (String) objArr75[0], new Class[]{String.class});
                }
                long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr74)).longValue();
                long j48 = -256595316;
                long j49 = j48 ^ j30;
                long j50 = (j49 | j32) ^ j30;
                long j51 = 140;
                long j52 = jLongValue8 ^ j30;
                long j53 = (((long) 141) * j48) + (((long) (-139)) * jLongValue8) + (((long) (-280)) * (((j49 | jLongValue8) ^ j30) | j50)) + ((j50 | ((j52 | j32) ^ j30)) * j51) + (j51 * ((((j49 | j52) | j32) ^ j30) | ((jLongValue8 | (j49 | j33)) ^ j30) | ((j48 | (j52 | j33)) ^ j30))) + ((long) (-590483289));
                int i362 = ((int) (j53 >> 32)) & (1738041050 + (((~(1158363935 | i266)) | (-1699446592) | (~(1699376949 | i266))) * (-1136)) + (((~(1158363935 | i)) | (~(1699376949 | i)) | (~((-1158294294) | i266))) * (-568)) + (((~((-1158363936) | i266)) | (~((-1699376950) | i266)) | (~(1699446591 | i))) * 568));
                int i363 = (~(1062226490 | i266)) | 655685 | (~((-374999920) | i266));
                int i364 = ((int) j53) & (1120989819 + (((~((-687882257) | i)) | i363) * 590) + (i363 * (-1180)) + (((~(374999919 | i266)) | (~((-1062226491) | i266))) * 590));
                int i365 = (i362 & i364) | (i362 ^ i364);
                int i366 = -i365;
                int i367 = ((i365 & i366) | (i365 ^ i366)) >> 31;
                int i368 = i & (~i367);
                int i369 = i367 & (i ^ 90);
                int i370 = (i369 & i368) | (i368 ^ i369);
                int i371 = i ^ i337;
                int i372 = -i371;
                int i373 = ((i371 & i372) | (i371 ^ i372)) >> 31;
                int i374 = i370 & (~i373);
                int i375 = i337 & i373;
                int i376 = (i375 & i374) | (i374 ^ i375);
                Object[] objArr76 = new Object[1];
                a(new int[]{145, 18, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0}, objArr76);
                Object[] objArr77 = {(String) objArr76[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int gidForName = Process.getGidForName("") + 994;
                    int fadingEdgeLength2 = 8 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte b30 = (byte) $$e;
                    byte b31 = b30;
                    Object[] objArr78 = new Object[1];
                    e(b30, b31, (byte) (b31 | 13), objArr78);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(offsetAfter, gidForName, fadingEdgeLength2, 349342683, false, (String) objArr78[0], new Class[]{String.class});
                }
                long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr77)).longValue();
                long j54 = 805683683;
                long j55 = -964;
                long j56 = (((long) (-963)) * j54) + j55 + (((long) 965) * jLongValue9);
                long j57 = jLongValue9 ^ j30;
                long j58 = j56 + (((j54 ^ j30) | ((j57 | j32) ^ j30)) * j55) + (j55 * (((j57 | j54) ^ j30) | ((j57 | j33) ^ j30))) + ((long) (-1652762288));
                int i377 = (~((-640217294) | i266)) | 637558989;
                int i378 = ~(799667421 | i);
                int i379 = (((int) (j58 >> 32)) & ((((i377 | i378) * (-252)) - 1106665610) + ((i378 | (~((-2658305) | i266))) * 252))) | (((int) j58) & (((((~(1495398684 | i)) | 1362342201) * 56) - 352916147) + ((1495398684 | (~(1362342201 | i266))) * 56)));
                int i380 = (i379 | (-i379)) >> 31;
                int i381 = (i380 & (i ^ 100)) | (i & (~i380));
                int i382 = (~(i & i376)) & (i | i376);
                int i383 = -i382;
                int i384 = ((i382 & i383) | (i382 ^ i383)) >> 31;
                int i385 = (i376 & i384) | (i381 & (~i384));
                int[] iArr = new int[1];
                Object[] objArr79 = {new int[]{i}, strArr5, iArr, new int[]{i385}};
                int i386 = (~(i & i385)) & (i | i385);
                int i387 = -i386;
                int i388 = (((i386 & i387) | (i386 ^ i387)) >> 31) & 16;
                int i389 = 2038065895 + (((~((-343401907) | i266)) | 465311409) * (-602)) + (((~((-343401907) | i)) | 271844528 | (~(536868787 | i266))) * (-301)) + ((~(i266 | 465311409)) * 301);
                int i390 = (i389 ^ i388) + ((i388 & i389) << 1);
                int i391 = ((i3 | i390) << 1) - (i3 ^ i390);
                int i392 = (i391 << 13) ^ i391;
                int i393 = i392 ^ (i392 >>> 17);
                int i394 = i393 << 5;
                iArr[0] = ((~i393) & i394) | ((~i394) & i393);
                return objArr79;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, byte r7, short r8) {
                /*
                    byte[] r0 = com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity$special$$inlined$viewModel$default$3.$$c
                    int r6 = r6 * 3
                    int r6 = 3 - r6
                    int r8 = r8 * 2
                    int r8 = 1 - r8
                    int r7 = r7 + 99
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r8
                    r4 = r2
                    goto L26
                L14:
                    r3 = r2
                L15:
                    int r6 = r6 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r8) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L24:
                    r3 = r0[r6]
                L26:
                    int r7 = r7 + r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity$special$$inlined$viewModel$default$3.$$g(byte, byte, short):java.lang.String");
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/digitalcard/DetailDigitalCardActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/digitalcard/model/DigitalCard;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/domain/digitalcard/model/DigitalCard;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, DigitalCard p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, DetailDigitalCardActivity.class, new Pair[]{TuplesKt.to("digital_card_info", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDetailDigitalCardBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 107;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        DetailDigitalCardActivity$bindingInflater$1 detailDigitalCardActivity$bindingInflater$1 = DetailDigitalCardActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return detailDigitalCardActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityDetailDigitalCardBinding activityDetailDigitalCardBinding = (ActivityDetailDigitalCardBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        Button button = activityDetailDigitalCardBinding.btnChangeTuitionBpu;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CascadingMenuPopupCascadingMenuInfo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DetailDigitalCardActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        activityDetailDigitalCardBinding.btnImageZoom.setOnClickListener(new View.OnClickListener() { // from class: getInflater
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityDetailDigitalCardBinding, this, view);
            }
        });
        activityDetailDigitalCardBinding.imgDigitalCard.setOnClickListener(new View.OnClickListener() { // from class: insertCheckBox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityDetailDigitalCardBinding, this, view);
            }
        });
        int i2 = notify + 59;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i3 = $10 + 121;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 4 / 2;
                }
                int i5 = 58224;
                int i6 = 0;
                while (i6 < 16) {
                    int i7 = $10 + 59;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[c];
                    int i9 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) asBinder) ^ 8611973335120459638L)));
                    int i10 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onTransact);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[1] = Integer.valueOf(i9);
                        objArr2[c] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cMyTid = (char) (47773 - (Process.myTid() >> 22));
                            int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 467;
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 13;
                            Class[] clsArr = new Class[4];
                            clsArr[c] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, i11, fadingEdgeLength, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i12 = i6;
                        Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) g) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f485a)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 47773), Gravity.getAbsoluteGravity(0, 0) + 468, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6 = i12 + 1;
                        c = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 2323, 44 - Gravity.getAbsoluteGravity(0, 0), -1312321721, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } else {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
        }
    }

    private final void cancelAll() {
        int i = 2 % 2;
        int i2 = cancel + 67;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        DigitalCard digitalCard = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (digitalCard != null) {
            int i5 = i3 + 9;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            ImageDigitalCardActivity.Companion companion = ImageDigitalCardActivity.INSTANCE;
            if (i6 == 0) {
                ImageDigitalCardActivity.Companion.TuitionPaymentFragmentbindingInflater1(this, digitalCard, ((getAdapter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            } else {
                ImageDigitalCardActivity.Companion.TuitionPaymentFragmentbindingInflater1(this, digitalCard, ((getAdapter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                throw null;
            }
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = notify + 61;
        cancel = i2 % 128;
        DigitalCard digitalCard = null;
        if (i2 % 2 != 0) {
            getIntent();
            digitalCard.hashCode();
            throw null;
        }
        Intent intent = getIntent();
        if (intent != null) {
            digitalCard = (DigitalCard) intent.getParcelableExtra("digital_card_info");
            int i3 = notify + 125;
            cancel = i3 % 128;
            int i4 = i3 % 2;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = digitalCard;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        DetailDigitalCardActivity detailDigitalCardActivity = (DetailDigitalCardActivity) objArr[0];
        int i = 2 % 2;
        DigitalCard digitalCard = detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (digitalCard != null) {
            int i2 = cancel + 33;
            notify = i2 % 128;
            int i3 = i2 % 2;
            ((getAdapter) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(digitalCard);
        }
        int i4 = notify + 121;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final DetailDigitalCardActivity detailDigitalCardActivity = (DetailDigitalCardActivity) objArr[0];
        int i = 2 % 2;
        DetailDigitalCardActivity detailDigitalCardActivity2 = detailDigitalCardActivity;
        ((ListPopupWindow2) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.observe(detailDigitalCardActivity2, new b(new Function1() { // from class: adjustListItemSelectionBounds
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DetailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getAdapter) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).asInterface.observe(detailDigitalCardActivity2, new b(new Function1() { // from class: setSubMenuArrowVisible
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.b, (VirtualCameraAdapter1) obj};
                return (Unit) DetailDigitalCardActivity.b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr2, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -478004463, 478004467);
            }
        }));
        ((getAdapter) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(detailDigitalCardActivity2, new b(new Function1() { // from class: insertRadioButton
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DetailDigitalCardActivity.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getAdapter) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.observe(detailDigitalCardActivity2, new b(new Function1() { // from class: insertIconView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DetailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = cancel + 87;
        notify = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        int i = 2 % 2;
        int i2 = cancel + 13;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        if (p0 != null) {
            int i5 = i3 + 45;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            ((ActivityDetailDigitalCardBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvInfoSegmentLabel.setText(getString(R.string.label_membership_segment));
            ((ActivityDetailDigitalCardBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvInfoSegmentName.setText(p0);
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        DetailDigitalCardActivity detailDigitalCardActivity = (DetailDigitalCardActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerFollowedProgram.removeAllViews();
        int i2 = cancel + 91;
        notify = i2 % 128;
        int i3 = i2 % 2;
        for (String str2 : StringsKt.splitToSequence$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) {
            View viewInflate = detailDigitalCardActivity.getLayoutInflater().inflate(R.layout.item_digital_card_following_program, (ViewGroup) null);
            String str3 = str2;
            ((TextView) viewInflate.findViewById(R.id.tvProgramItem)).setText(str3);
            String strReplace = new Regex("\\s").replace(str3, "");
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.imgProgram);
            if (Intrinsics.areEqual(strReplace, "JHT")) {
                int i4 = notify + 13;
                cancel = i4 % 128;
                if (i4 % 2 != 0) {
                    appCompatImageView.setImageResource(R.drawable.ic_jaminan_jht);
                    throw null;
                }
                appCompatImageView.setImageResource(R.drawable.ic_jaminan_jht);
            }
            if (Intrinsics.areEqual(strReplace, "JKK")) {
                int i5 = cancel + 101;
                notify = i5 % 128;
                int i6 = i5 % 2;
                appCompatImageView.setImageResource(R.drawable.ic_jaminan_kecelakaan);
            }
            if (!(!Intrinsics.areEqual(strReplace, "JKM"))) {
                int i7 = notify + 91;
                cancel = i7 % 128;
                int i8 = i7 % 2;
                appCompatImageView.setImageResource(R.drawable.ic_jaminan_kematian);
            }
            if (Intrinsics.areEqual(strReplace, "JP")) {
                int i9 = cancel + 107;
                notify = i9 % 128;
                int i10 = i9 % 2;
                appCompatImageView.setImageResource(R.drawable.ic_jaminan_pensiun);
            }
            if (Intrinsics.areEqual(strReplace, "JKP")) {
                appCompatImageView.setImageResource(R.drawable.ic_jaminan_kehilangan_pekerjaan);
            }
            ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerFollowedProgram.addView(viewInflate);
            int i11 = notify + 81;
            cancel = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 3 % 3;
            }
        }
        return null;
    }

    private final void onTransact() {
        String str;
        int i = 2 % 2;
        RequestManager requestManagerWith = Glide.with(this);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((getAdapter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        DigitalCard digitalCard = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (digitalCard != null) {
            int i2 = notify + 35;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            str = digitalCard.TuitionPaymentFragmentbindingInflater1;
        } else {
            str = null;
        }
        if (str == null) {
            int i4 = notify + 125;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        requestManagerWith.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new DigitalCardImageRequest(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, str)).into(((ActivityDetailDigitalCardBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgDigitalCard);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = cancel + 59;
        notify = i2 % 128;
        int i3 = i2 % 2;
        DetailDigitalCardActivity detailDigitalCardActivity = this;
        Intrinsics.checkNotNullParameter(detailDigitalCardActivity, "");
        detailDigitalCardActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityDetailDigitalCardBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityDetailDigitalCardBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_chosen_digital_card));
        int i4 = cancel + 37;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = cancel + 81;
                notify = i2 % 128;
                if (i2 % 2 == 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i3 = 21 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = cancel + 37;
            notify = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr2;
        DetailDigitalCardActivity detailDigitalCardActivity = (DetailDigitalCardActivity) objArr[0];
        int i = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
            int keyRepeatTimeout = 1755 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iIndexOf = 23 - TextUtils.indexOf("", "", 0, 0);
            byte[] bArr = $$a;
            short s = bArr[28];
            byte b2 = bArr[5];
            Object[] objArr3 = new Object[1];
            c(s, b2, (byte) (b2 | 14), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, keyRepeatTimeout, iIndexOf, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = cancel + 63;
            notify = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 29944);
                int iAxisFromString = MotionEvent.axisFromString("") + 1756;
                int i4 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                byte[] bArr2 = $$a;
                Object[] objArr4 = new Object[1];
                c((short) (-bArr2[1]), bArr2[5], bArr2[7], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, iAxisFromString, i4, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = (-614888001) + (((~((~elapsedCpuTime) | (-575799478))) | (~((-134279689) | elapsedCpuTime))) * (-302)) + ((~((-575799478) | elapsedCpuTime)) * (-604)) + (((~(elapsedCpuTime | (-710079166))) | (-1056961280)) * 302) + 2058979452;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{36204, 38574, 20935, 57026, 20308, 31778, 37878, 43494, 39939, 8443, 9680, 'j', 3092, 27340, 49481, 37887, 39688, 15164}, 16 - View.resolveSizeAndState(0, 0, 0), objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{1656, 6469, 60653, 6984, 59756, 60812, 5443, 11050, 2711, 49204, 57751, 13990, 41184, 15089, 1370, 34263, 13332, 51689}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 93, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, detailDigitalCardActivity)).intValue();
            try {
                Object[] objArr8 = {-523322588};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42049), Color.rgb(0, 0, 0) + 16778942, 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 2058979452, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0'));
                    int iRgb = (-16775461) - Color.rgb(0, 0, 0);
                    int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0);
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    c((short) (-bArr3[1]), bArr3[5], bArr3[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iRgb, iLastIndexOf, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{56964, 58199, 61475, 54716, 37702, 61055, 8383, 4451, 1269, 51434, 3150, 6213, 60067, 30649, 45368, 9285, 59913, 46353, 64919, 24659, 19181, 59901, 33155, 41442}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{62250, 13278, 6771, 4677, 10463, 38613, 63881, 55912, 56667, 27695, 58446, 8085, 39870, 11018, 54976, 1408, 40289, 676}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_klik_bca).substring(1, 3).codePointAt(1) - 106, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                        int keyRepeatDelay = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte[] bArr4 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((short) (bArr4[2] + 1), bArr4[5], bArr4[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, maxKeyCode, keyRepeatDelay, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                        int iIndexOf2 = TextUtils.indexOf("", "") + 23;
                        byte[] bArr5 = $$a;
                        short s2 = bArr5[28];
                        byte b3 = bArr5[5];
                        Object[] objArr13 = new Object[1];
                        c(s2, b3, (byte) (b3 | 14), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, fadingEdgeLength, iIndexOf2, 986134021, false, (String) objArr13[0], null);
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
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i9 != i8) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                int i10 = cancel + 53;
                notify = i10 % 128;
                for (int i11 = i10 % 2 != 0 ? 0 : 1; i11 < strArr.length; i11++) {
                    int i12 = notify + 125;
                    cancel = i12 % 128;
                    int i13 = i12 % 2;
                    arrayList.add(strArr[i11]);
                }
            }
            throw new RuntimeException(String.valueOf(i9));
        }
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i15 = i14 + ((((~(739770395 | startElapsedRealtime)) | (-349965903)) * 398) - 669360603) + (((~((~startElapsedRealtime) | 739770395)) | (-349965903)) * 398);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr14[3])[0] = i17 ^ (i17 << 5);
        int i18 = cancel + 3;
        notify = i18 % 128;
        int i19 = i18 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
            int iAxisFromString2 = MotionEvent.axisFromString("") + 1032;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
            short s3 = (short) ($$b & 975);
            byte[] bArr6 = $$a;
            Object[] objArr15 = new Object[1];
            c(s3, bArr6[5], bArr6[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iAxisFromString2, iMakeMeasureSpec, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{56964, 58199, 61475, 54716, 37702, 61055, 8383, 4451, 1269, 51434, 3150, 6213, 60067, 30649, 45368, 9285, 59913, 46353, 64919, 24659, 19181, 59901, 33155, 41442}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{62250, 13278, 6771, 4677, 10463, 38613, 63881, 55912, 56667, 27695, 58446, 8085, 39870, 11018, 54976, 1408, 40289, 676}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_instruction_step5).substring(10, 11).codePointAt(0) - 82, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int i20 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
            byte[] bArr7 = $$a;
            Object[] objArr18 = new Object[1];
            c((short) (-bArr7[1]), bArr7[5], bArr7[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(offsetAfter, i20, iLastIndexOf2, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int i21 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                int i22 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                short s4 = (short) ($$b + 4);
                byte b4 = $$a[7];
                Object[] objArr19 = new Object[1];
                c(s4, b4, (byte) (b4 | 52), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cNormalizeMetaState, i21, i22, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i23 = ((int[]) objArr20[3])[0];
            int i24 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i25 = (((((~((-147238073) | iElapsedRealtime)) | 134610952) * (-283)) - 315526079) + ((~(iElapsedRealtime | (-12627121))) * 283)) - 516629250;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[2])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{36204, 38574, 20935, 57026, 20308, 31778, 37878, 43494, 39939, 8443, 9680, 'j', 3092, 27340, 49481, 37887, 39688, 15164}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{1656, 6469, 60653, 6984, 59756, 60812, 5443, 11050, 2711, 49204, 57751, 13990, 41184, 15089, 1370, 34263, 13332, 51689}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, detailDigitalCardActivity)).intValue();
            Object[] objArr23 = {-523322588};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (Process.myPid() >> 22)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1134, Drawable.resolveOpacity(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -516629250, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i28 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 15;
                short s5 = (short) ($$b & 975);
                byte[] bArr8 = $$a;
                Object[] objArr25 = new Object[1];
                c(s5, bArr8[5], bArr8[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c, i28, iNormalizeMetaState, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Color.argb(0, 0, 0, 0) + 1117, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int iRed = Color.red(0) + 1031;
                int iIndexOf3 = TextUtils.indexOf("", "") + 15;
                short s6 = (short) ($$b + 4);
                byte b5 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(s6, b5, (byte) (b5 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, iRed, iIndexOf3, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{56964, 58199, 61475, 54716, 37702, 61055, 8383, 4451, 1269, 51434, 3150, 6213, 60067, 30649, 45368, 9285, 59913, 46353, 64919, 24659, 19181, 59901, 33155, 41442}, 22 - ((Process.getThreadPriority(0) + 20) >> 6), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{62250, 13278, 6771, 4677, 10463, 38613, 63881, 55912, 56667, 27695, 58446, 8085, 39870, 11018, 54976, 1408, 40289, 676}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_content_desc_image).substring(0, 5).codePointAt(2) - 82, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i29 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i30 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                    byte[] bArr9 = $$a;
                    Object[] objArr29 = new Object[1];
                    c((short) (-bArr9[1]), bArr9[5], bArr9[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cMakeMeasureSpec, i29, i30, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                    int iMyTid = 15 - (Process.myTid() >> 22);
                    short s7 = (short) ($$b & 975);
                    byte[] bArr10 = $$a;
                    Object[] objArr30 = new Object[1];
                    c(s7, bArr10[5], bArr10[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, keyRepeatTimeout2, iMyTid, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArr2[1])[0];
        int i32 = ((int[]) objArr2[3])[0];
        if (i32 == i31) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr2[2])[0];
            int i34 = ((int[]) objArr2[3])[0];
            int i35 = ((int[]) objArr2[1])[0];
            String[] strArr3 = (String[]) objArr2[0];
            int i36 = ~Process.myUid();
            int i37 = i33 + (((644797189 + (((~((-134225991) | i36)) | 378506160) * (-828))) + ((i36 | (-134225991)) * (-828))) - 530029976);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr31[2])[0] = i39 ^ (i39 << 5);
            return null;
        }
        int i40 = 0;
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            while (i40 < strArr4.length) {
                int i41 = notify + 115;
                cancel = i41 % 128;
                if (i41 % 2 != 0) {
                    arrayList2.add(strArr4[i40]);
                    i40 += 14;
                } else {
                    arrayList2.add(strArr4[i40]);
                    i40++;
                }
            }
        }
        throw new RuntimeException(String.valueOf(i32));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancel + 53;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i4 = ~((-68066855) | (~iMaxMemory));
            if (i3 != (((-898612992) | i4 | (~(68066854 | iMaxMemory))) * (-338)) + 381499176 + (((~(iMaxMemory | (-830546138))) | i4) * 338)) {
                throw null;
            }
        } else {
            int i5 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int iMyTid = Process.myTid();
            if (i5 != (-703243932) + (((-174198805) | iMyTid) * (-381)) + (((~((~iMyTid) | (-1542115446))) | 1905845739) * 381) + 1945234884) {
                throw null;
            }
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i6 != 118927544 + (((~((-1887497939) | iIdentityHashCode)) | (-691558027)) * (-964)) + (((~((~iIdentityHashCode) | (-1887497939))) | 1350608976) * (-964))) {
            int i7 = (-888412250) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i8 = notify + 51;
        cancel = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = notify + 25;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != 959287048 + ((~((~iIdentityHashCode) | (-1099056417))) * (-116)) + ((269073117 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | 1099060660)) | 269068873) * 116)) {
            int i5 = notify + 89;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            int[] iArr = new int[267301444];
            iArr[267301443] = 1;
            int i7 = (-626790452) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 987258556;
        int i9 = ~length;
        int i10 = (~(2019909743 | i9)) | (-2055202288) | (~(303998412 | i9));
        if (i8 != 1567811348 + (((~(length | (-268705869))) | i10) * 590) + (i10 * (-1180)) + (((~((-303998413) | i9)) | (~(i9 | (-2019909744)))) * 590)) {
            throw null;
        }
        super.onStart();
        int i11 = cancel + 53;
        notify = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cf, code lost:
    
        if (r1 != ((r5 + (((~(r2 | (-38028641))) | (~(124022640 | r4))) * 859)) + (((~(1839933971 | r4)) | (-1877962612)) * 859))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d1, code lost:
    
        super.onCreate(r9);
        r9 = com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity.cancel + 9;
        com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity.notify = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e5, code lost:
    
        throw new java.lang.RuntimeException("-297544744");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ed, code lost:
    
        throw new java.lang.RuntimeException("2011282886");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005b, code lost:
    
        if (r1 == ((((r6 | r2) * (-252)) - 509609864) + ((r2 | (~(r3 | 901773247))) * 252))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009b, code lost:
    
        if (r1 == (((((-1317627866) | r2) * (-658)) - 1052022196) + ((r2 | (-1591437276)) * 658))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009d, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = (int) android.os.SystemClock.elapsedRealtime();
        r5 = 1695638344 + ((r2 | 124022640) * (-859));
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit d() {
        int i = 2 % 2;
        int i2 = cancel + 121;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = cancel + 5;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x016d  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final DetailDigitalCardActivity detailDigitalCardActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws NoSuchMethodException {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = notify + 61;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            MultiStateView multiStateView = ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDetailDigitalCard;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnChangeTuitionBpu.setVisibility(8);
            MultiStateView multiStateView2 = ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDetailDigitalCard;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            PMIMembershipInformation pMIMembershipInformation = (PMIMembershipInformation) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ActivityDetailDigitalCardBinding activityDetailDigitalCardBinding = (ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            detailDigitalCardActivity.onTransact();
            TextView textView = activityDetailDigitalCardBinding.tvMembershipStatusLabel;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            TextView textView2 = activityDetailDigitalCardBinding.tvMembershipStatus;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            TextView textView3 = activityDetailDigitalCardBinding.tvInfoCompanyNameLabel;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
            TextView textView4 = activityDetailDigitalCardBinding.tvInfoCompanyName;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(8);
            View view = activityDetailDigitalCardBinding.infoCompanyNameDivider;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
            TextView textView5 = activityDetailDigitalCardBinding.tvInfoLastWagesLabel;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
            TextView textView6 = activityDetailDigitalCardBinding.tvInfoLastWages;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            textView6.setVisibility(8);
            TextView textView7 = activityDetailDigitalCardBinding.tvPeriodPaymentPension;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            textView7.setVisibility(8);
            TextView textView8 = activityDetailDigitalCardBinding.tvPeriodPaymentPensionLabel;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            textView8.setVisibility(8);
            View view2 = activityDetailDigitalCardBinding.infoPensionDivider;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(8);
            DigitalCard digitalCard = detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (digitalCard != null) {
                str = digitalCard.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i4 = notify + 29;
                cancel = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str = null;
            }
            detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
            View view3 = activityDetailDigitalCardBinding.infoSegmentDivider;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            view3.setVisibility(8);
            TextView textView9 = activityDetailDigitalCardBinding.tvInfoLastPaymentLabel;
            Intrinsics.checkNotNullExpressionValue(textView9, "");
            textView9.setVisibility(8);
            TextView textView10 = activityDetailDigitalCardBinding.tvInfoLastPayment;
            Intrinsics.checkNotNullExpressionValue(textView10, "");
            textView10.setVisibility(8);
            View view4 = activityDetailDigitalCardBinding.divtvInfoLastPaymentValue;
            Intrinsics.checkNotNullExpressionValue(view4, "");
            view4.setVisibility(8);
            TextView textView11 = activityDetailDigitalCardBinding.tvBeginingLossJobMemberLabel;
            Intrinsics.checkNotNullExpressionValue(textView11, "");
            textView11.setVisibility(8);
            TextView textView12 = activityDetailDigitalCardBinding.tvBeginingLossJobMember;
            Intrinsics.checkNotNullExpressionValue(textView12, "");
            textView12.setVisibility(8);
            View view5 = activityDetailDigitalCardBinding.infoLossJobDivider;
            Intrinsics.checkNotNullExpressionValue(view5, "");
            view5.setVisibility(8);
            TextView textView13 = activityDetailDigitalCardBinding.tvPeriodPaymentLossJobLabel;
            Intrinsics.checkNotNullExpressionValue(textView13, "");
            textView13.setVisibility(8);
            TextView textView14 = activityDetailDigitalCardBinding.tvPeriodPaymentlossJob;
            Intrinsics.checkNotNullExpressionValue(textView14, "");
            textView14.setVisibility(8);
            View view6 = activityDetailDigitalCardBinding.periodPaymentPensionDivider;
            Intrinsics.checkNotNullExpressionValue(view6, "");
            view6.setVisibility(8);
            if (Intrinsics.areEqual(pMIMembershipInformation.a, "-")) {
                activityDetailDigitalCardBinding.tvInfoLastPayment.setText("-");
            } else {
                int i6 = notify + 103;
                cancel = i6 % 128;
                int i7 = i6 % 2;
                if (pMIMembershipInformation.a.length() != 0) {
                    int i8 = cancel + 117;
                    notify = i8 % 128;
                    int i9 = i8 % 2;
                    activityDetailDigitalCardBinding.tvInfoLastPayment.setText(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pMIMembershipInformation.a, "dd-MM-yyyy", "dd MMMM yyyy"));
                } else {
                    activityDetailDigitalCardBinding.tvInfoLastPayment.setText("-");
                }
            }
            activityDetailDigitalCardBinding.tvInfoPensionLabel.setText(detailDigitalCardActivity.getString(R.string.label_protection_duration));
            try {
                activityDetailDigitalCardBinding.tvInfoPension.setText(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pMIMembershipInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "dd-MM-yyyy", "dd MMMM yyyy"));
            } catch (Exception unused) {
                activityDetailDigitalCardBinding.tvInfoPension.setText(pMIMembershipInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            Object[] objArr = {detailDigitalCardActivity, pMIMembershipInformation.asBinder};
            b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_prima).substring(1, 3).length() - 372808673, objArr, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 100961039, -100961034);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            String string = detailDigitalCardActivity.getString(R.string.error_error_occured);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(detailDigitalCardActivity, string, new Function0() { // from class: invokeItem
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DetailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(DetailDigitalCardActivity detailDigitalCardActivity) {
        int i = 2 % 2;
        int i2 = notify + 63;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        detailDigitalCardActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 107;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(DetailDigitalCardActivity detailDigitalCardActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i;
        int i2 = 2 % 2;
        int i3 = cancel + 73;
        int i4 = i3 % 128;
        notify = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            int i5 = 61 / 0;
            if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
                i = i4 + 105;
                cancel = i % 128;
                if (i % 2 == 0) {
                    detailDigitalCardActivity.MediaBrowserCompat();
                    throw null;
                }
                detailDigitalCardActivity.MediaBrowserCompat();
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                detailDigitalCardActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(detailDigitalCardActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: ListMenuItemView
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DetailDigitalCardActivity.g();
                    }
                });
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                detailDigitalCardActivity.IconCompatParcelizer();
                ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnChangeTuitionBpu.setVisibility(8);
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            i = i4 + 105;
            cancel = i % 128;
            if (i % 2 == 0) {
                detailDigitalCardActivity.MediaBrowserCompat();
                throw null;
            }
            detailDigitalCardActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            detailDigitalCardActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(detailDigitalCardActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: ListMenuItemView
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DetailDigitalCardActivity.g();
                }
            });
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            detailDigitalCardActivity.IconCompatParcelizer();
            ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnChangeTuitionBpu.setVisibility(8);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = notify + 19;
        cancel = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(DetailDigitalCardActivity detailDigitalCardActivity) {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 67;
        notify = i3 % 128;
        int i4 = i3 % 2;
        DigitalCard digitalCard = detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (digitalCard != null) {
            int i5 = i2 + 119;
            notify = i5 % 128;
            if (i5 % 2 == 0) {
                ((getAdapter) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(digitalCard);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((getAdapter) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(digitalCard);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = cancel + 33;
        notify = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityDetailDigitalCardBinding activityDetailDigitalCardBinding, final DetailDigitalCardActivity detailDigitalCardActivity, View view) {
        int i = 2 % 2;
        int i2 = cancel + 53;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                activityDetailDigitalCardBinding.imgDigitalCard.getDrawable();
                throw null;
            }
            if (activityDetailDigitalCardBinding.imgDigitalCard.getDrawable() != null) {
                detailDigitalCardActivity.cancelAll();
            } else {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = detailDigitalCardActivity.getString(R.string.error_load_digital_card);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = detailDigitalCardActivity.getString(R.string.action_retry);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_warning_2, "Error", string, string2, new Function0() { // from class: CascadingMenuPopup31
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DetailDigitalCardActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
                    }
                }, detailDigitalCardActivity.getString(R.string.action_return), new Function0() { // from class: ExpandedMenuView
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DetailDigitalCardActivity.d();
                    }
                });
                detailDigitalCardActivity.TuitionPaymentFragmentbindingInflater1 = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                FragmentManager supportFragmentManager = detailDigitalCardActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i4 = cancel + 109;
                    notify = i4 % 128;
                    int i5 = i4 % 2;
                    getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        final DetailDigitalCardActivity detailDigitalCardActivity = (DetailDigitalCardActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            MultiStateView multiStateView = ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDetailDigitalCard;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnChangeTuitionBpu.setVisibility(8);
            MultiStateView multiStateView2 = ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDetailDigitalCard;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            PUMembershipInformation pUMembershipInformation = (PUMembershipInformation) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ActivityDetailDigitalCardBinding activityDetailDigitalCardBinding = (ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            detailDigitalCardActivity.onTransact();
            String str = pUMembershipInformation.d;
            ActivityDetailDigitalCardBinding activityDetailDigitalCardBinding2 = (ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            Object obj = null;
            if (StringsKt.equals(str, "Y", false)) {
                int i2 = cancel + 113;
                notify = i2 % 128;
                if (i2 % 2 == 0) {
                    activityDetailDigitalCardBinding2.tvMembershipStatus.setText(detailDigitalCardActivity.getString(R.string.label_status_active));
                    throw null;
                }
                activityDetailDigitalCardBinding2.tvMembershipStatus.setText(detailDigitalCardActivity.getString(R.string.label_status_active));
            } else {
                activityDetailDigitalCardBinding2.tvMembershipStatus.setText(detailDigitalCardActivity.getString(R.string.label_status_inactive));
                TextView textView = activityDetailDigitalCardBinding2.tvMembershipStatus;
                Resources resources = detailDigitalCardActivity.getResources();
                int i3 = R.color.colorReddish;
                textView.setTextColor(resources.getColor(R.color.colorReddish));
                DetailDigitalCardActivity detailDigitalCardActivity2 = detailDigitalCardActivity;
                activityDetailDigitalCardBinding2.tvMembershipStatus.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(detailDigitalCardActivity2, R.drawable.ic_non_active), (Drawable) null, (Drawable) null, (Drawable) null);
                Drawable[] compoundDrawables = activityDetailDigitalCardBinding2.tvMembershipStatus.getCompoundDrawables();
                Intrinsics.checkNotNullExpressionValue(compoundDrawables, "");
                Drawable[] drawableArr = compoundDrawables;
                int length = drawableArr.length;
                int i4 = 0;
                while (i4 < length) {
                    Drawable drawable = drawableArr[i4];
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(detailDigitalCardActivity2, i3), PorterDuff.Mode.SRC_IN));
                    }
                    i4++;
                    i3 = R.color.colorReddish;
                }
            }
            DigitalCard digitalCard = detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(digitalCard != null ? digitalCard.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
            activityDetailDigitalCardBinding.tvInfoCompanyName.setText(pUMembershipInformation.a);
            if (pUMembershipInformation.asBinder.length() == 0) {
                activityDetailDigitalCardBinding.tvInfoLastWages.setText("-");
            } else {
                activityDetailDigitalCardBinding.tvInfoLastWages.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(Double.parseDouble(pUMembershipInformation.asBinder)));
                int i5 = notify + 63;
                cancel = i5 % 128;
                int i6 = i5 % 2;
            }
            TextView textView2 = activityDetailDigitalCardBinding.tvInfoLastPayment;
            try {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pUMembershipInformation.cancel, "dd-MM-yyyy", "dd MMMM yyyy");
            } catch (Exception unused) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = pUMembershipInformation.cancel;
            }
            textView2.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            TextView textView3 = activityDetailDigitalCardBinding.tvInfoPension;
            try {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pUMembershipInformation.INotificationSideChannel, "dd-MM-yyyy", "dd MMMM yyyy");
            } catch (Exception unused2) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = pUMembershipInformation.INotificationSideChannel;
            }
            textView3.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            TextView textView4 = activityDetailDigitalCardBinding.tvPeriodPaymentPension;
            String str2 = pUMembershipInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" Bulan");
            textView4.setText(sb.toString());
            if (pUMembershipInformation.notify.length() == 0) {
                int i7 = notify + 113;
                cancel = i7 % 128;
                if (i7 % 2 != 0) {
                    activityDetailDigitalCardBinding.tvBeginingLossJobMember.setText("-");
                    obj.hashCode();
                    throw null;
                }
                activityDetailDigitalCardBinding.tvBeginingLossJobMember.setText("-");
            } else {
                String strTuitionPaymentFragmentbindingInflater1 = setSessionStateCallback.TuitionPaymentFragmentbindingInflater1(pUMembershipInformation.notify);
                if (Intrinsics.areEqual(strTuitionPaymentFragmentbindingInflater1, pUMembershipInformation.notify)) {
                    int i8 = notify + 3;
                    cancel = i8 % 128;
                    if (i8 % 2 != 0) {
                        activityDetailDigitalCardBinding.tvBeginingLossJobMember.setText(String.valueOf(pUMembershipInformation.notify));
                        obj.hashCode();
                        throw null;
                    }
                    activityDetailDigitalCardBinding.tvBeginingLossJobMember.setText(String.valueOf(pUMembershipInformation.notify));
                } else {
                    TextView textView5 = activityDetailDigitalCardBinding.tvBeginingLossJobMember;
                    try {
                        strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strTuitionPaymentFragmentbindingInflater1, "dd-MM-yyyy", "dd MMMM yyyy");
                    } catch (Exception unused3) {
                        strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = strTuitionPaymentFragmentbindingInflater1;
                    }
                    textView5.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                }
            }
            if (pUMembershipInformation.cancelAll.length() == 0) {
                activityDetailDigitalCardBinding.tvPeriodPaymentlossJob.setText("-");
            } else {
                TextView textView6 = activityDetailDigitalCardBinding.tvPeriodPaymentlossJob;
                String str3 = pUMembershipInformation.cancelAll;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(" Bulan");
                textView6.setText(sb2.toString());
            }
            b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_prima).substring(1, 3).length() - 372808673, new Object[]{detailDigitalCardActivity, pUMembershipInformation.asInterface}, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 100961039, -100961034);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            String string = detailDigitalCardActivity.getString(R.string.error_error_occured);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(detailDigitalCardActivity, string, new Function0() { // from class: CascadingMenuPopup1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DetailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityDetailDigitalCardBinding activityDetailDigitalCardBinding, final DetailDigitalCardActivity detailDigitalCardActivity, View view) {
        int i = 2 % 2;
        int i2 = cancel + 1;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Object obj = null;
            if (activityDetailDigitalCardBinding.imgDigitalCard.getDrawable() != null) {
                detailDigitalCardActivity.cancelAll();
            } else {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = detailDigitalCardActivity.getString(R.string.error_load_digital_card);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = detailDigitalCardActivity.getString(R.string.action_retry_again);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_warning_2, "Error", string, string2, new Function0() { // from class: onItemHoverExit
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DetailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
                    }
                }, detailDigitalCardActivity.getString(R.string.action_return), new Function0() { // from class: getWindowAnimations
                    private static short[] b;
                    private static final byte[] $$c = {38, 31, -70, -1};
                    private static final int $$d = 140;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {14, 116, 92, -78, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
                    private static final int $$b = 86;

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f1001a = 0;
                    private static int asBinder = 1;
                    private static int TuitionPaymentFragmentbindingInflater1 = -888575802;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795631;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 956129281;
                    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45, -62, 32, -41, 46, -3, -60, 107, -41, -40, 32, -41, 46, -35, -28, 27, 42, 43, 44, -33, 39, -36, -21, 26, -57, 57, 29, -28, 23, -15, 28, 24, 31, 30, -30, -51, 47, -19, 28, 97, -112, 77, -77, -105, 110, -99, 123, -106, -110, -107, -108, 104, 71, 123, -87, -107, 42, -46, 110, 97, -103, 110, -105, 100, 93, -94, -109, -110, -107, 102, -98, 101, -121, -115, 126, -115, -20, 89, -44, -28, 23, 28, -25, 29, -17, 14, -32, 28, 42, -44, -28, -30, 29, 32, -90, 22, -26, 24, 39, -47, -14, 18, 43, -25, 20, 31, -28, 30, -20, 13, -29, 31, 40, -95, -29, -26, -26, -26, -26, -26, -26, -26};

                    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void d(int r7, int r8, short r9, java.lang.Object[] r10) {
                        /*
                            int r7 = r7 * 14
                            int r7 = 98 - r7
                            int r9 = r9 + 1
                            byte[] r0 = defpackage.getWindowAnimations.$$a
                            int r8 = r8 + 4
                            byte[] r1 = new byte[r9]
                            r2 = 0
                            if (r0 != 0) goto L13
                            r7 = r8
                            r3 = r9
                            r4 = r2
                            goto L2a
                        L13:
                            r3 = r2
                        L14:
                            int r4 = r3 + 1
                            byte r5 = (byte) r7
                            r1[r3] = r5
                            if (r4 != r9) goto L23
                            java.lang.String r7 = new java.lang.String
                            r7.<init>(r1, r2)
                            r10[r2] = r7
                            return
                        L23:
                            int r8 = r8 + 1
                            r3 = r0[r8]
                            r6 = r8
                            r8 = r7
                            r7 = r6
                        L2a:
                            int r8 = r8 + r3
                            int r8 = r8 + (-11)
                            r3 = r4
                            r6 = r8
                            r8 = r7
                            r7 = r6
                            goto L14
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.getWindowAnimations.d(int, int, short, java.lang.Object[]):void");
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = f1001a + 123;
                        asBinder = i5 % 128;
                        if (i5 % 2 != 0) {
                            return DetailDigitalCardActivity.INotificationSideChannel();
                        }
                        DetailDigitalCardActivity.INotificationSideChannel();
                        throw null;
                    }

                    private static void c(int i4, int i5, short s, byte b2, int i6, Object[] objArr) throws Throwable {
                        boolean z;
                        int length;
                        byte[] bArr;
                        int i7 = 2 % 2;
                        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                        StringBuilder sb = new StringBuilder();
                        try {
                            Object[] objArr2 = {Integer.valueOf(i5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            char c = 3;
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "");
                                int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0', 0);
                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 33;
                                byte[] bArr2 = $$c;
                                byte b3 = (byte) (bArr2[3] + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iLastIndexOf, iResolveSizeAndState, 1387473586, false, $$e(b3, b3, (byte) bArr2.length), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            int i8 = iIntValue == -1 ? 1 : 0;
                            if (i8 != 0) {
                                byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                if (bArr3 != null) {
                                    int i9 = $11 + 13;
                                    $10 = i9 % 128;
                                    int i10 = i9 % 2;
                                    int length2 = bArr3.length;
                                    byte[] bArr4 = new byte[length2];
                                    int i11 = 0;
                                    while (i11 < length2) {
                                        Object[] objArr3 = {Integer.valueOf(bArr3[i11])};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 3358;
                                            int iAxisFromString = MotionEvent.axisFromString("") + 19;
                                            byte b4 = (byte) ($$c[c] + 1);
                                            byte b5 = b4;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, maxKeyCode, iAxisFromString, -1054011043, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                                        }
                                        bArr4[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                        i11++;
                                        c = 3;
                                    }
                                    bArr3 = bArr4;
                                }
                                if (bArr3 != null) {
                                    byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    Object[] objArr4 = {Integer.valueOf(i6), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                        int absoluteGravity = 2267 - Gravity.getAbsoluteGravity(0, 0);
                                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33;
                                        byte[] bArr6 = $$c;
                                        byte b6 = (byte) (bArr6[3] + 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, absoluteGravity, doubleTapTimeout, 1387473586, false, $$e(b6, b6, (byte) bArr6.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    iIntValue = (byte) (((byte) (((long) bArr5[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                                } else {
                                    iIntValue = (short) (((short) (((long) b[i6 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                                }
                            }
                            if (iIntValue > 0) {
                                int i12 = $10 + 111;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i6 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)) + i8;
                                try {
                                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i4), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 55904);
                                        int iNormalizeMetaState = 2855 - KeyEvent.normalizeMetaState(0);
                                        int longPressTimeout = 13 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                        byte b7 = (byte) ($$c[3] + 1);
                                        byte b8 = b7;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, iNormalizeMetaState, longPressTimeout, -1529949196, false, $$e(b7, b8, (byte) (b8 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                                    }
                                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    if (bArr7 != null) {
                                        int i14 = $11 + 43;
                                        $10 = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            length = bArr7.length;
                                            bArr = new byte[length];
                                        } else {
                                            length = bArr7.length;
                                            bArr = new byte[length];
                                        }
                                        for (int i15 = 0; i15 < length; i15++) {
                                            bArr[i15] = (byte) (((long) bArr7[i15]) ^ 3046761265686732006L);
                                        }
                                        bArr7 = bArr;
                                    }
                                    if (bArr7 != null) {
                                        int i16 = $11 + 33;
                                        $10 = i16 % 128;
                                        int i17 = i16 % 2;
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                                        int i18 = $11;
                                        int i19 = i18 + 99;
                                        $10 = i19 % 128;
                                        int i20 = i19 % 2;
                                        if (z) {
                                            int i21 = i18 + 109;
                                            $10 = i21 % 128;
                                            int i22 = i21 % 2;
                                            byte[] bArr8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr8[i23]) ^ 3046761265686732006L)) + s)) ^ b2));
                                        } else {
                                            short[] sArr = b;
                                            int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
                                        }
                                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                    }
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            objArr[0] = sb.toString();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v8 */
                    /* JADX WARN: Type inference failed for: r11v3 */
                    /* JADX WARN: Type inference failed for: r16v0 */
                    /* JADX WARN: Type inference failed for: r18v1 */
                    /* JADX WARN: Type inference failed for: r18v3 */
                    /* JADX WARN: Type inference failed for: r3v149 */
                    /* JADX WARN: Type inference failed for: r3v150 */
                    /* JADX WARN: Type inference failed for: r3v151 */
                    /* JADX WARN: Type inference failed for: r3v152 */
                    /* JADX WARN: Type inference failed for: r3v34 */
                    /* JADX WARN: Type inference failed for: r3v35 */
                    /* JADX WARN: Type inference failed for: r3v36 */
                    /* JADX WARN: Type inference failed for: r3v37 */
                    /* JADX WARN: Type inference failed for: r3v38 */
                    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
                    /* JADX WARN: Type inference failed for: r3v4 */
                    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
                    /* JADX WARN: Type inference failed for: r3v65, types: [byte] */
                    /* JADX WARN: Type inference failed for: r3v71, types: [long] */
                    /* JADX WARN: Type inference failed for: r5v60 */
                    /* JADX WARN: Type inference failed for: r6v5, types: [int[]] */
                    /* JADX WARN: Type inference failed for: r8v10 */
                    /* JADX WARN: Type inference failed for: r8v26 */
                    /* JADX WARN: Type inference failed for: r8v30 */
                    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                        java.util.NoSuchElementException
                        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                        */
                    public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r32, int r33, int r34, int r35) {
                        /*
                            Method dump skipped, instruction units count: 2708
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.getWindowAnimations.TuitionPaymentFragmentbindingInflater1(android.content.Context, int, int, int):java.lang.Object[]");
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$e(byte r6, byte r7, int r8) {
                        /*
                            int r7 = r7 * 3
                            int r7 = 3 - r7
                            byte[] r0 = defpackage.getWindowAnimations.$$c
                            int r6 = r6 * 3
                            int r1 = r6 + 1
                            int r8 = 121 - r8
                            byte[] r1 = new byte[r1]
                            r2 = 0
                            if (r0 != 0) goto L15
                            r3 = r8
                            r4 = r2
                            r8 = r7
                            goto L2c
                        L15:
                            r3 = r2
                        L16:
                            byte r4 = (byte) r8
                            r1[r3] = r4
                            if (r3 != r6) goto L21
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L21:
                            int r7 = r7 + 1
                            int r3 = r3 + 1
                            r4 = r0[r7]
                            r5 = r8
                            r8 = r7
                            r7 = r4
                            r4 = r3
                            r3 = r5
                        L2c:
                            int r7 = -r7
                            int r7 = r7 + r3
                            r3 = r4
                            r5 = r8
                            r8 = r7
                            r7 = r5
                            goto L16
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.getWindowAnimations.$$e(byte, byte, int):java.lang.String");
                    }
                });
                detailDigitalCardActivity.TuitionPaymentFragmentbindingInflater1 = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                FragmentManager supportFragmentManager = detailDigitalCardActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i4 = notify + 39;
                    cancel = i4 % 128;
                    if (i4 % 2 != 0) {
                        getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        obj.hashCode();
                        throw null;
                    }
                    getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            ViewPortBuilder.b();
            int i5 = cancel + 119;
            notify = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(DetailDigitalCardActivity detailDigitalCardActivity, View view) {
        int i = 2 % 2;
        int i2 = notify + 59;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (detailDigitalCardActivity.d != null) {
            int i4 = notify + 11;
            cancel = i4 % 128;
            if (i4 % 2 != 0) {
                ChangeTuitionBpuMembership.Companion companion = ChangeTuitionBpuMembership.INSTANCE;
                DetailDigitalCardActivity detailDigitalCardActivity2 = detailDigitalCardActivity;
                BPUMembershipInformation bPUMembershipInformation = detailDigitalCardActivity.d;
                Intrinsics.checkNotNull(bPUMembershipInformation);
                ChangeTuitionBpuMembership.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(detailDigitalCardActivity2, bPUMembershipInformation);
                int i5 = 5 / 0;
            } else {
                ChangeTuitionBpuMembership.Companion companion2 = ChangeTuitionBpuMembership.INSTANCE;
                DetailDigitalCardActivity detailDigitalCardActivity3 = detailDigitalCardActivity;
                BPUMembershipInformation bPUMembershipInformation2 = detailDigitalCardActivity.d;
                Intrinsics.checkNotNull(bPUMembershipInformation2);
                ChangeTuitionBpuMembership.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(detailDigitalCardActivity3, bPUMembershipInformation2);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(DetailDigitalCardActivity detailDigitalCardActivity) {
        int i = 2 % 2;
        DigitalCard digitalCard = detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (digitalCard != null) {
            ((getAdapter) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(digitalCard);
            int i2 = cancel + 3;
            notify = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = cancel + 105;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = cancel + 119;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = cancel + 107;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01f9 A[PHI: r13 r14
  0x01f9: PHI (r13v6 com.bpjstku.domain.user.model.User) = (r13v5 com.bpjstku.domain.user.model.User), (r13v12 com.bpjstku.domain.user.model.User) binds: [B:27:0x01f7, B:24:0x01de] A[DONT_GENERATE, DONT_INLINE]
  0x01f9: PHI (r14v25 ListPopupWindow2) = (r14v24 ListPopupWindow2), (r14v29 ListPopupWindow2) binds: [B:27:0x01f7, B:24:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final DetailDigitalCardActivity detailDigitalCardActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        ListPopupWindow2 listPopupWindow2;
        User userAsBinder;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = cancel + 107;
            notify = i2 % 128;
            int i3 = i2 % 2;
            MultiStateView multiStateView = ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDetailDigitalCard;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            detailDigitalCardActivity.d = (BPUMembershipInformation) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            MultiStateView multiStateView2 = ((ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).msvDetailDigitalCard;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            BPUMembershipInformation bPUMembershipInformation = (BPUMembershipInformation) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ActivityDetailDigitalCardBinding activityDetailDigitalCardBinding = (ActivityDetailDigitalCardBinding) ((ViewBinding) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            detailDigitalCardActivity.onTransact();
            TextView textView = activityDetailDigitalCardBinding.tvMembershipStatusLabel;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            TextView textView2 = activityDetailDigitalCardBinding.tvMembershipStatus;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            TextView textView3 = activityDetailDigitalCardBinding.tvInfoCompanyNameLabel;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
            TextView textView4 = activityDetailDigitalCardBinding.tvInfoCompanyName;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(8);
            View view = activityDetailDigitalCardBinding.infoCompanyNameDivider;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
            TextView textView5 = activityDetailDigitalCardBinding.tvInfoLastWagesLabel;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(8);
            TextView textView6 = activityDetailDigitalCardBinding.tvInfoLastWages;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            textView6.setVisibility(8);
            TextView textView7 = activityDetailDigitalCardBinding.tvPeriodPaymentPension;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            textView7.setVisibility(8);
            TextView textView8 = activityDetailDigitalCardBinding.tvPeriodPaymentPensionLabel;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            textView8.setVisibility(8);
            View view2 = activityDetailDigitalCardBinding.infoPensionDivider;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(8);
            DigitalCard digitalCard = detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            String str2 = null;
            if (digitalCard != null) {
                int i4 = notify + 105;
                cancel = i4 % 128;
                if (i4 % 2 != 0) {
                    String str3 = digitalCard.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    throw null;
                }
                str = digitalCard.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                str = null;
            }
            detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
            View view3 = activityDetailDigitalCardBinding.infoSegmentDivider;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            view3.setVisibility(8);
            TextView textView9 = activityDetailDigitalCardBinding.tvInfoLastPaymentLabel;
            Intrinsics.checkNotNullExpressionValue(textView9, "");
            textView9.setVisibility(8);
            TextView textView10 = activityDetailDigitalCardBinding.tvInfoLastPayment;
            Intrinsics.checkNotNullExpressionValue(textView10, "");
            textView10.setVisibility(8);
            View view4 = activityDetailDigitalCardBinding.divtvInfoLastPaymentValue;
            Intrinsics.checkNotNullExpressionValue(view4, "");
            view4.setVisibility(8);
            TextView textView11 = activityDetailDigitalCardBinding.tvBeginingLossJobMemberLabel;
            Intrinsics.checkNotNullExpressionValue(textView11, "");
            textView11.setVisibility(8);
            TextView textView12 = activityDetailDigitalCardBinding.tvBeginingLossJobMember;
            Intrinsics.checkNotNullExpressionValue(textView12, "");
            textView12.setVisibility(8);
            View view5 = activityDetailDigitalCardBinding.infoLossJobDivider;
            Intrinsics.checkNotNullExpressionValue(view5, "");
            view5.setVisibility(8);
            TextView textView13 = activityDetailDigitalCardBinding.tvPeriodPaymentLossJobLabel;
            Intrinsics.checkNotNullExpressionValue(textView13, "");
            textView13.setVisibility(8);
            TextView textView14 = activityDetailDigitalCardBinding.tvPeriodPaymentlossJob;
            Intrinsics.checkNotNullExpressionValue(textView14, "");
            textView14.setVisibility(8);
            View view6 = activityDetailDigitalCardBinding.periodPaymentPensionDivider;
            Intrinsics.checkNotNullExpressionValue(view6, "");
            view6.setVisibility(8);
            try {
                activityDetailDigitalCardBinding.tvInfoPensionLabel.setText(detailDigitalCardActivity.getString(R.string.label_protection_duration));
                activityDetailDigitalCardBinding.tvInfoPension.setText(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bPUMembershipInformation.asInterface, "dd-MM-yyyy", "dd MMMM yyyy"));
            } catch (Exception unused) {
                activityDetailDigitalCardBinding.tvInfoPensionLabel.setText(detailDigitalCardActivity.getString(R.string.label_protection_duration));
                activityDetailDigitalCardBinding.tvInfoPension.setText(bPUMembershipInformation.asInterface);
            }
            b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_prima).substring(1, 3).length() - 372808673, new Object[]{detailDigitalCardActivity, bPUMembershipInformation.d}, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 100961039, -100961034);
            if (detailDigitalCardActivity.d != null) {
                int i5 = notify + 47;
                cancel = i5 % 128;
                if (i5 % 2 != 0) {
                    listPopupWindow2 = (ListPopupWindow2) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) detailDigitalCardActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    int i6 = 79 / 0;
                    if (userAsBinder != null) {
                        str2 = userAsBinder.b;
                    }
                } else {
                    listPopupWindow2 = (ListPopupWindow2) detailDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) detailDigitalCardActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder != null) {
                        str2 = userAsBinder.b;
                    }
                }
                listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new CheckRecurringStatusRequest("JMO", "BPJSTK-PTI12345", String.valueOf(str2)));
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            String string = detailDigitalCardActivity.getString(R.string.error_error_occured);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(detailDigitalCardActivity, string, new Function0() { // from class: CascadingMenuPopupHorizPosition
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DetailDigitalCardActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = cancel + 99;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(DetailDigitalCardActivity detailDigitalCardActivity) {
        int i = 2 % 2;
        int i2 = notify + 111;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        detailDigitalCardActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 61;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(DetailDigitalCardActivity detailDigitalCardActivity) {
        int i = 2 % 2;
        int i2 = notify + 23;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        detailDigitalCardActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 75;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit b(DetailDigitalCardActivity detailDigitalCardActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{detailDigitalCardActivity, virtualCameraAdapter1}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -478004463, 478004467);
    }

    static {
        INotificationSideChannel = 1;
        cancel();
        INSTANCE = new Companion(null);
        int i = cancelAll + 53;
        INotificationSideChannel = i % 128;
        int i2 = i % 2;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_prima).substring(1, 3).length() - 372808673, new Object[]{this, p0}, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 100961039, -100961034);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ((Integer) b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bri_epay).substring(0, 9).codePointAt(5) - 901260984, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1740325045, 1866771740, -1866771738)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iCodePointAt = 595997197 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_gopay_qr_scan_tablet).substring(12, 17).codePointAt(1);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iCodePointAt, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 2125957129, -2125957126);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 55992788, -55992787);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 125;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = cancel + 19;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        b(zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, context}, (-1251787251) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 513691, 553233626, -553233626);
    }

    static void cancel() {
        g = (char) 6833;
        f485a = (char) 62597;
        asBinder = (char) 43010;
        onTransact = (char) 59440;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = notify + 59;
        int i3 = i2 % 128;
        cancel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 3;
        notify = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(R.layout.activity_detail_digital_card);
        }
        int i6 = 9 / 0;
        return Integer.valueOf(R.layout.activity_detail_digital_card);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, byte r6, int r7) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 108
            byte[] r0 = com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity.$$c
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r0[r5]
        L29:
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.DetailDigitalCardActivity.$$i(short, byte, int):java.lang.String");
    }
}
