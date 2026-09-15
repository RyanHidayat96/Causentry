package com.bpjstku.presentation.tuition;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.databinding.ActivityTuitionPaymentDetailBinding;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.tuition.model.BpuCheckPaymentItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.payment.PaymentActivity;
import com.bpjstku.presentation.tuition.TuitionPaymentDetailActivity;
import com.bpjstku.presentation.tuition.model.SelectedProgram;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_common.zzin;
import com.google.android.material.button.MaterialButton;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_MediaSpec1;
import defpackage.CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getCameraOperatingMode;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isSurfaceSharingEnabled;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.mapPoint;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u001f\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\r\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0015\u0010\u001c\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0015\u0010\u000f\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0017\u0010\u0014\u001a\u0004\u0018\u00010 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001a\u0010\f\u001a\u00020\u001f8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001c\u0010\"R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020\u00038UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010$R\u0015\u0010\u001e\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/tuition/TuitionPaymentDetailActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityTuitionPaymentDetailBinding;", "Lkotlin/Function1;", "Lcom/bpjstku/presentation/tuition/model/SelectedProgram;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "g", "Lkotlin/jvm/functions/Function1;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "", "Ljava/lang/String;", "LisSurfaceSharingEnabled;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/tuition/model/BpuCheckPaymentItem;", "d", "", "Lcom/bpjstku/domain/user/model/User;", "I", "()I", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "LCameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TuitionPaymentDetailActivity extends BindingBaseActivity<ActivityTuitionPaymentDetailBinding> {
    private static int INotificationSideChannelDefault;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char cancel;
    private static int notify;
    private static long onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int asBinder;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy d;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1<SelectedProgram, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {0, -94, -62, -97};
    private static final int $$f = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {5, -91, 77, 46, -13, -10, 25, -53, -10, 14, -23, -16, -22, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$k = 52;
    private static final byte[] $$a = {115, 25, -47, -94, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 237;
    private static int getInterfaceDescriptor = 1;
    private static int cancelAll = 0;
    private static int INotificationSideChannel = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i);
        int i10 = ~i;
        int i11 = (~(i7 | i10)) | (~(i8 | i3 | i));
        int i12 = (~(i | i7)) | (~(i8 | i10));
        int i13 = i3 + i4 + i6 + ((-1255669517) * i5) + (533247121 * i2);
        int i14 = i13 * i13;
        int i15 = ((i3 * (-1895547823)) - 858849280) + ((-1895547823) * i4) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i6) + (760610816 * i5) + ((-1057882112) * i2) + (1344208896 * i14);
        int i16 = ((i3 * (-122328301)) - 2132886715) + (i4 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i6 * (-122328029)) + (i5 * (-1196579527)) + (i2 * 656595923) + (i14 * 138215424);
        int i17 = i15 + (i16 * i16 * (-833028096));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i17 != 2) {
            return i17 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
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
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r6
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = r7 + 4
            byte[] r1 = com.bpjstku.presentation.tuition.TuitionPaymentDetailActivity.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.tuition.TuitionPaymentDetailActivity.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 9
            int r6 = 12 - r6
            int r5 = r5 * 13
            int r5 = r5 + 84
            byte[] r0 = com.bpjstku.presentation.tuition.TuitionPaymentDetailActivity.$$j
            int r7 = r7 * 28
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2c:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.tuition.TuitionPaymentDetailActivity.f(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TuitionPaymentDetailActivity(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = INotificationSideChannel;
            int i3 = i2 + 77;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            cancelAll = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            function1 = null;
        }
        this(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TuitionPaymentDetailActivity(Function1<? super SelectedProgram, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        final TuitionPaymentDetailActivity tuitionPaymentDetailActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.tuition.TuitionPaymentDetailActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = tuitionPaymentDetailActivity;
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
        this.b = "";
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: CameraManagerCompatBaseImpl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TuitionPaymentDetailActivity.b(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: CameraManagerCompatApi30Impl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TuitionPaymentDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
            }
        });
        this.a = LazyKt.lazy(new Function0() { // from class: StreamConfigurationMapCompatApi23Impl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return Integer.valueOf(((Integer) TuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -639991184, 639991186, objArr, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4)).intValue());
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: getOutputFormats
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return (User) TuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -256294805, 256294805, objArr, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            }
        });
        this.asBinder = R.layout.activity_tuition_payment_detail;
        this.d = LazyKt.lazy(new Function0() { // from class: StreamConfigurationMapCompatStreamConfigurationMapCompatImpl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return (CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2) TuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2093529965, -2093529964, new Object[0], iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.tuition.TuitionPaymentDetailActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/tuition/TuitionPaymentDetailActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/tuition/model/BpuCheckPaymentItem;", "p1", "", "p2", "", "b", "(Landroid/content/Context;Lcom/bpjstku/domain/tuition/model/BpuCheckPaymentItem;I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, BpuCheckPaymentItem p1, int p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, TuitionPaymentDetailActivity.class, new Pair[]{TuplesKt.to("tuition_payment", p1), TuplesKt.to("payment_period", Integer.valueOf(p2))});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 13;
        int i3 = i2 % 128;
        cancelAll = i3;
        int i4 = i2 % 2;
        int i5 = this.asBinder;
        int i6 = i3 + 77;
        INotificationSideChannel = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityTuitionPaymentDetailBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancelAll + 67;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentDetailActivity$bindingInflater$1 tuitionPaymentDetailActivity$bindingInflater$1 = TuitionPaymentDetailActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = INotificationSideChannel + 71;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return tuitionPaymentDetailActivity$bindingInflater$1;
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
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i3 = $11 + 51;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 8328);
                    int scrollBarFadeDuration = 1235 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i5 = 36 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b = $$c[0];
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, scrollBarFadeDuration, i5, -653973969, false, $$i(b2, (byte) (b2 + 2), b), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2764;
                    int iGreen = Color.green(0) + 14;
                    byte b3 = $$c[0];
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, tapTimeout, iGreen, 1504416861, false, $$i(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - ExpandableListView.getPackedPositionType(0L)), View.getDefaultSize(0, 0) + 253, 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 65200);
                    int iIndexOf = TextUtils.indexOf("", "") + 2891;
                    int minimumFlingVelocity = 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b5 = $$c[0];
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, iIndexOf, minimumFlingVelocity, 2012627446, false, $$i(b6, (byte) (b6 + 1), b5), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (onTransact ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) notify) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) cancel) ^ (-6377398940819159759L)))));
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
        int i6 = $10 + 79;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        TuitionPaymentDetailActivity tuitionPaymentDetailActivity = this;
        Intrinsics.checkNotNullParameter(tuitionPaymentDetailActivity, "");
        tuitionPaymentDetailActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityTuitionPaymentDetailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityTuitionPaymentDetailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_tuition_payment));
        RecyclerView recyclerView = ((ActivityTuitionPaymentDetailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvMembershipChoosen;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter((isSurfaceSharingEnabled) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        ActivityTuitionPaymentDetailBinding activityTuitionPaymentDetailBinding = (ActivityTuitionPaymentDetailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        BpuCheckPaymentItem bpuCheckPaymentItem = (BpuCheckPaymentItem) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (bpuCheckPaymentItem != null) {
            int i2 = cancelAll + 35;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            activityTuitionPaymentDetailBinding.tvUserName.setText(bpuCheckPaymentItem.INotificationSideChannelStubProxy.toString());
            activityTuitionPaymentDetailBinding.tvPeriod.setText(getString(R.string.label_period_month, StringsKt.split$default((CharSequence) bpuCheckPaymentItem.asInterface, new String[]{"#"}, false, 0, 6, (Object) null).get(0)));
            activityTuitionPaymentDetailBinding.tvTotalPay.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            AppCompatTextView appCompatTextView = activityTuitionPaymentDetailBinding.tvIdCard;
            String str = bpuCheckPaymentItem.IconCompatParcelizer;
            if (str == null) {
                int i4 = cancelAll + 79;
                INotificationSideChannel = i4 % 128;
                int i5 = i4 % 2;
                str = "";
            }
            appCompatTextView.setText(str);
            activityTuitionPaymentDetailBinding.tvFinalPaymentValue.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            AppCompatTextView appCompatTextView2 = activityTuitionPaymentDetailBinding.tvMembershipPeriod;
            String strSubstring = StringsKt.replace$default(bpuCheckPaymentItem.INotificationSideChannelDefault, "-", "/", false, 4, (Object) null).substring(0, 11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strSubstring2 = StringsKt.replace$default(bpuCheckPaymentItem.INotificationSideChannelStub, "-", "/", false, 4, (Object) null).substring(0, 11);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            StringBuilder sb = new StringBuilder();
            sb.append(strSubstring);
            sb.append(" - ");
            sb.append(strSubstring2);
            appCompatTextView2.setText(sb.toString());
            if (bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > 0.0d) {
                AppCompatTextView appCompatTextView3 = activityTuitionPaymentDetailBinding.tvJKKTuituionLabel;
                appCompatTextView3.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                Intrinsics.checkNotNull(appCompatTextView3);
                appCompatTextView3.setVisibility(0);
                AppCompatTextView appCompatTextView4 = activityTuitionPaymentDetailBinding.tvJKKLabel;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                appCompatTextView4.setVisibility(0);
                View view = activityTuitionPaymentDetailBinding.viewLineJKK;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setVisibility(0);
            }
            if (bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0.0d) {
                int i6 = cancelAll + 25;
                INotificationSideChannel = i6 % 128;
                int i7 = i6 % 2;
                AppCompatTextView appCompatTextView5 = activityTuitionPaymentDetailBinding.tvJKMTuituionLabel;
                appCompatTextView5.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                Intrinsics.checkNotNull(appCompatTextView5);
                appCompatTextView5.setVisibility(0);
                AppCompatTextView appCompatTextView6 = activityTuitionPaymentDetailBinding.tvJKMLabel;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
                appCompatTextView6.setVisibility(0);
                View view2 = activityTuitionPaymentDetailBinding.viewLineJKM;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                view2.setVisibility(0);
            }
            if (bpuCheckPaymentItem.TuitionPaymentFragmentbindingInflater1 > 0.0d) {
                AppCompatTextView appCompatTextView7 = activityTuitionPaymentDetailBinding.tvJHTTuituionLabel;
                appCompatTextView7.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(bpuCheckPaymentItem.TuitionPaymentFragmentbindingInflater1));
                Intrinsics.checkNotNull(appCompatTextView7);
                appCompatTextView7.setVisibility(0);
                AppCompatTextView appCompatTextView8 = activityTuitionPaymentDetailBinding.tvJHTLabel;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView8, "");
                appCompatTextView8.setVisibility(0);
                View view3 = activityTuitionPaymentDetailBinding.viewLineJHT;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                view3.setVisibility(0);
            }
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityTuitionPaymentDetailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnPayment;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: toStreamConfigurationMap
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TuitionPaymentDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
            }
        });
        ((ActivityTuitionPaymentDetailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnAddProgram.setOnClickListener(new View.OnClickListener() { // from class: getOutputSizes
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TuitionPaymentDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
        ((ActivityTuitionPaymentDetailBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvBillDetail.setOnClickListener(new View.OnClickListener() { // from class: StreamConfigurationMapCompatBaseImplApi23Impl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TuitionPaymentDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        int i2 = INotificationSideChannel + 125;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 119;
        cancelAll = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
                int trimmedLength = 921 - TextUtils.getTrimmedLength("");
                int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c((byte) 52, bArr[5], bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, trimmedLength, iIndexOf, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{53118, 19120, 54827, 15350}, (char) TextUtils.indexOf("", "", 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 117, new char[]{27174, 9739, 62661, 11785, 30164, 34587, 62267, 25993, 44136, 25801, 16828, 13620, 31250, 50009, 54464, 22840, 12247, 17298, 42517, 20261, 64992, 8355}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{29661, 28372, 63087, 50655}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step5).substring(17, 18).length() + 57333), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1869534287, new char[]{32986, 32359, 42386, 52514, 41830, 21944, 39870, 33653, 30837, 48514, 7914, 5828, 56007, 50546, 58842}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
                int i3 = 922 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 29;
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                c(bArr2[7], bArr2[5], bArr2[80], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, i3, iLastIndexOf, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (31533 - TextUtils.indexOf("", ""));
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 922;
                    int i4 = 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    c((byte) (bArr3[33] - 1), (short) 51, bArr3[80], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, modifierMetaStateMask, i4, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
                int i6 = (-1144705825) + (((~(1065086619 | i5)) | 708993024) * (-756)) + (((~i5) | 1065086619) * 756) + 292945921;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            } else {
                Context baseContext = getBaseContext();
                if (baseContext == null) {
                    Object[] objArr8 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{1986, 37825, 23443, 31068}, (char) (23643 - Color.alpha(0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{17156, 41083, 29285, 51350, 25825, 50927, 19408, 26545, 26996, 10565, 49411, 53668, 23947, 17306, 42169, 30463, 51318, 64053, 43827, 9554, 41124, 1441, 52856, 59858, 4163, 49527}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{1026, 50987, 50045, 31025}, (char) (KeyEvent.keyCodeFromString("") + 12739), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.done).substring(4, 5).length() - 1, new char[]{37370, 45890, 17611, 43323, 52103, 48460, 41933, 51219, 23140, 47257, 8273, 45424, 60668, 64151, 6679, 8108, 28157, 42279}, objArr9);
                    baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                }
                if (baseContext != null) {
                    baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{26677, 1331, 46024, 37178}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 14912), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{33232, 19966, 61231, 60007, 21012, 56070, 42483, 24138, 22525, 18154, 2035, 24220, 59992, 12283, 56368, 5007}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{4103, 39781, 1488, 47075}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik).substring(0, 11).codePointAt(6) + 58012), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_debit_card).substring(1, 2).length() - 1, new char[]{34874, 17790, 54081, 13917, 53565, 42139, 30936, 60991, 25383, 21939, 39500, 51268, 62646, 51527, 39599, 6113}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i9 = cancelAll + 91;
                INotificationSideChannel = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr12 = {baseContext, Integer.valueOf(iIntValue), 0, 292945921};
                    byte[] bArr4 = $$j;
                    byte b = bArr4[16];
                    Object[] objArr13 = new Object[1];
                    f(b, b, bArr4[37], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b2 = bArr4[37];
                    Object[] objArr14 = new Object[1];
                    f(b2, b2, bArr4[16], objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                        int iResolveSize = 921 - View.resolveSize(0, 0);
                        int offsetBefore = 28 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr5 = $$a;
                        Object[] objArr15 = new Object[1];
                        c((byte) (bArr5[33] - 1), (short) 51, bArr5[80], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, iResolveSize, offsetBefore, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{53118, 19120, 54827, 15350}, (char) Color.argb(0, 0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46, new char[]{27174, 9739, 62661, 11785, 30164, 34587, 62267, 25993, 44136, 25801, 16828, 13620, 31250, 50009, 54464, 22840, 12247, 17298, 42517, 20261, 64992, 8355}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{29661, 28372, 63087, 50655}, (char) (Color.blue(0) + 57334), 1869534324 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{32986, 32359, 42386, 52514, 41830, 21944, 39870, 33653, 30837, 48514, 7914, 5828, 56007, 50546, 58842}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char minimumFlingVelocity = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            int offsetBefore2 = 921 - TextUtils.getOffsetBefore("", 0);
                            int threadPriority = 28 - ((Process.getThreadPriority(0) + 20) >> 6);
                            byte[] bArr6 = $$a;
                            Object[] objArr18 = new Object[1];
                            c(bArr6[7], bArr6[5], bArr6[80], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, offsetBefore2, threadPriority, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cArgb = (char) (31533 - Color.argb(0, 0, 0, 0));
                            int iResolveSize2 = View.resolveSize(0, 0) + 921;
                            int i11 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte[] bArr7 = $$a;
                            Object[] objArr19 = new Object[1];
                            c((byte) 52, bArr7[5], bArr7[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, iResolveSize2, i11, -1048449946, false, (String) objArr19[0], null);
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
            int i12 = ((int[]) objArr[1])[0];
            int i13 = ((int[]) objArr[3])[0];
            if (i13 == i12) {
                int i14 = ((int[]) objArr[0])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int i15 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
                int i16 = i14 + (-1618041473) + (((~(1769865207 | i15)) | 4214436) * (-756)) + (((~i15) | 1769865207) * 756);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr20[0])[0] = i18 ^ (i18 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i19 = cancelAll + 69;
                    INotificationSideChannel = i19 % 128;
                    int i20 = i19 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
                int i21 = ((int[]) objArr[0])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int i22 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
                int i23 = ~i22;
                int i24 = i21 + 1904582382 + (((~((-815118696) | i23)) | (-958960949)) * (-865)) + ((~(i22 | 815118695)) * 865) + (((~((-958960949) | i23)) | (~(i23 | 815118695))) * 865);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr21[0])[0] = i26 ^ (i26 << 5);
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i27 = cancelAll + 89;
            INotificationSideChannel = i27 % 128;
            if (i27 % 2 != 0) {
                return zOnOptionsItemSelected;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th2) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th2;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
            int iArgb = 1755 - Color.argb(0, 0, 0, 0);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) (bArr[33] - 1), (short) 51, bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iArgb, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 24;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                c(bArr2[7], bArr2[5], bArr2[80], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, touchSlop, iIndexOf2, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = (-1675824599) + (((~((-397048785) | iIdentityHashCode)) | 352326208 | (~(184446358 | iIdentityHashCode))) * (-880));
            int i3 = (~((-397048785) | (~iIdentityHashCode))) | (-184446359);
            int i4 = ~(iIdentityHashCode | 397048784);
            int i5 = ((i2 + ((i3 | i4) * (-880))) + (i4 * 880)) - 1266987041;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{26677, 1331, 46024, 37178}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellTargetedBrandTitle).substring(0, 14).codePointAt(1) + 14962), ExpandableListView.getPackedPositionGroup(0L), new char[]{33232, 19966, 61231, 60007, 21012, 56070, 42483, 24138, 22525, 18154, 2035, 24220, 59992, 12283, 56368, 5007}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{4103, 39781, 1488, 47075}, (char) (View.MeasureSpec.getMode(0) + 58117), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unable_to_parse_information).substring(0, 31).codePointAt(0) - 85, new char[]{34874, 17790, 54081, 13917, 53565, 42139, 30936, 60991, 25383, 21939, 39500, 51268, 62646, 51527, 39599, 6113}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1188904594};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 42049), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1726, ExpandableListView.getPackedPositionType(0L) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1266987041, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
                    int i8 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iRed = 23 - Color.red(0);
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    c(bArr3[7], bArr3[5], bArr3[80], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i8, iRed, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{53118, 19120, 54827, 15350}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{27174, 9739, 62661, 11785, 30164, 34587, 62267, 25993, 44136, 25801, 16828, 13620, 31250, 50009, 54464, 22840, 12247, 17298, 42517, 20261, 64992, 8355}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{29661, 28372, 63087, 50655}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_3).substring(1, 3).length() + 57332), TextUtils.indexOf("", "") + 1869534323, new char[]{32986, 32359, 42386, 52514, 41830, 21944, 39870, 33653, 30837, 48514, 7914, 5828, 56007, 50546, 58842}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
                        int longPressTimeout2 = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr4 = $$a;
                        byte b = bArr4[7];
                        Object[] objArr11 = new Object[1];
                        c(b, (short) (b | 88), bArr4[80], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, longPressTimeout2, offsetBefore, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char size = (char) (View.MeasureSpec.getSize(0) + 29944);
                        int iAxisFromString = MotionEvent.axisFromString("") + 1756;
                        int i9 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((byte) (bArr5[33] - 1), (short) 51, bArr5[80], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size, iAxisFromString, i9, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i11 == i10) {
            int i12 = cancelAll + 47;
            INotificationSideChannel = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i15 = ~((~System.identityHashCode(this)) | 861689580);
            int i16 = i14 + (((571490464 | i15) * (-374)) - 1958615823) + ((i15 | 290199116) * 374);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr13[3])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i19 = 0;
                while (i19 < strArr.length) {
                    int i20 = cancelAll + 11;
                    INotificationSideChannel = i20 % 128;
                    if (i20 % 2 == 0) {
                        arrayList.add(strArr[i19]);
                        i19 += 43;
                    } else {
                        arrayList.add(strArr[i19]);
                        i19++;
                    }
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i21 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i22 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i23 = i21 + (-750631223) + (((~((-153746262) | i22)) | 16781892) * 1504) + ((~(i22 | (-136964370))) * (-1504)) + 1493071856;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr14[3])[0] = i25 ^ (i25 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int gidForName = Process.getGidForName("") + 1032;
            int i26 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
            byte[] bArr6 = $$a;
            byte b2 = bArr6[7];
            Object[] objArr15 = new Object[1];
            c(b2, (short) (b2 | 140), bArr6[80], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, gidForName, i26, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{53118, 19120, 54827, 15350}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step1).substring(3, 4).length() - 1, new char[]{27174, 9739, 62661, 11785, 30164, 34587, 62267, 25993, 44136, 25801, 16828, 13620, 31250, 50009, 54464, 22840, 12247, 17298, 42517, 20261, 64992, 8355}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{29661, 28372, 63087, 50655}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 57298), 1869534225 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_mandiri_debit_card_no).substring(22, 23).codePointAt(0), new char[]{32986, 32359, 42386, 52514, 41830, 21944, 39870, 33653, 30837, 48514, 7914, 5828, 56007, 50546, 58842}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
            int i27 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
            byte[] bArr7 = $$a;
            Object[] objArr18 = new Object[1];
            c(bArr7[7], bArr7[5], bArr7[80], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAxisFromString, i27, maximumDrawingCacheSize, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int iIndexOf3 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                int iRgb = Color.rgb(0, 0, 0) + 16777231;
                byte[] bArr8 = $$a;
                Object[] objArr19 = new Object[1];
                c((byte) 52, bArr8[5], bArr8[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(bitsPerPixel, iIndexOf3, iRgb, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr20[3])[0];
            int i29 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i30 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i31 = 1215363738 + (((~((~i30) | 261548644)) | (-532086767)) * (-245));
            int i32 = ~(i30 | 261548644);
            int i33 = i31 + (i32 * (-245)) + ((i32 | 505828814) * 245) + 64982135;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[2])[0] = i35 ^ (i35 << 5);
            int i36 = INotificationSideChannel + 73;
            cancelAll = i36 % 128;
            int i37 = i36 % 2;
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{26677, 1331, 46024, 37178}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 15016), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 115, new char[]{33232, 19966, 61231, 60007, 21012, 56070, 42483, 24138, 22525, 18154, 2035, 24220, 59992, 12283, 56368, 5007}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{4103, 39781, 1488, 47075}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 58081), View.getDefaultSize(0, 0), new char[]{34874, 17790, 54081, 13917, 53565, 42139, 30936, 60991, 25383, 21939, 39500, 51268, 62646, 51527, 39599, 6113}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {1188904594};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46037 - ((byte) KeyEvent.getModifierMetaStateMask())), 1134 - View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0') + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 64982135, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int i38 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int pressedStateDuration = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte[] bArr9 = $$a;
                byte b3 = bArr9[7];
                Object[] objArr25 = new Object[1];
                c(b3, (short) (b3 | 140), bArr9[80], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(deadChar, i38, pressedStateDuration, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.getTrimmedLength("")), Color.alpha(0) + 1117, TextUtils.indexOf("", "") + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1031;
                int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 15;
                byte[] bArr10 = $$a;
                Object[] objArr26 = new Object[1];
                c((byte) 52, bArr10[5], bArr10[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(modifierMetaStateMask, keyRepeatDelay2, touchSlop2, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{53118, 19120, 54827, 15350}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (Process.getThreadPriority(0) + 20) >> 6, new char[]{27174, 9739, 62661, 11785, 30164, 34587, 62267, 25993, 44136, 25801, 16828, 13620, 31250, 50009, 54464, 22840, 12247, 17298, 42517, 20261, 64992, 8355}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{29661, 28372, 63087, 50655}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1063).substring(0, 53).length() + 57281), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_name_on_card).substring(0, 3).length() + 1869534320, new char[]{32986, 32359, 42386, 52514, 41830, 21944, 39870, 33653, 30837, 48514, 7914, 5828, 56007, 50546, 58842}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0);
                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
                    byte[] bArr11 = $$a;
                    Object[] objArr29 = new Object[1];
                    c(bArr11[7], bArr11[5], bArr11[80], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, iLastIndexOf, iIndexOf4, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c4 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                    int i39 = 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr12 = $$a;
                    byte b4 = bArr12[7];
                    Object[] objArr30 = new Object[1];
                    c(b4, (short) (b4 | 140), bArr12[80], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c4, maximumDrawingCacheSize2, i39, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 == null) {
                throw null;
            }
            for (String str : strArr3) {
                arrayList2.add(str);
            }
            throw null;
        }
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i40 = ((int[]) objArr[2])[0];
        int i41 = ((int[]) objArr[3])[0];
        int i42 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i43 = ~System.identityHashCode(this);
        int i44 = i40 + (-1332388596) + ((~((-42207233) | i43)) * (-783)) + (((~(i43 | (-66366659))) | (-310646829)) * 783);
        int i45 = (i44 << 13) ^ i44;
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr31[2])[0] = i46 ^ (i46 << 5);
    }

    private static /* synthetic */ Object b(Object[] objArr) throws IllegalAccessException {
        TuitionPaymentDetailActivity tuitionPaymentDetailActivity = (TuitionPaymentDetailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 47;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        if (i4 != (-1881429240) + ((~((-1417748508) | iFreeMemory)) * (-301)) + (((~(1558259899 | iFreeMemory)) | (~((~iFreeMemory) | 728272356))) * (-301)) + (((~(iFreeMemory | (-728272357))) | 1558259899) * 301)) {
            throw null;
        }
        int i5 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyTid = Process.myTid();
        if (i5 != (-1082856870) + (((~(iMyTid | 208002114)) | 1921516197) * 305) + (((~((~iMyTid) | 208002114)) | 1923913445) * 305)) {
            int[] iArr = new int[142008497];
            iArr[142008496] = 1;
            int i6 = (-269788752) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onResume();
        int i7 = INotificationSideChannel + 113;
        cancelAll = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 35 / 0;
        }
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancelAll + 95;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        int i6 = ~i5;
        if (i4 != 1679164088 + (((~(1558449877 | i6)) | (~((-728462335) | i5))) * 1900) + (((~(i6 | 728462334)) | (~(i5 | (-1558449878)))) * (-950)) + (((~(i5 | 728462334)) | (~(i6 | (-1558449878)))) * 950)) {
            throw new RuntimeException("102564075");
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i7 != ((~(iIdentityHashCode | 2086392091)) * TypedValues.CycleType.TYPE_EASING) + 500503976 + (((~((~iIdentityHashCode) | 2086392091)) | 475615233) * TypedValues.CycleType.TYPE_EASING)) {
            int i8 = 2122043210 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i9 = cancelAll + 105;
        INotificationSideChannel = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancelAll + 115;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        if (i4 != 297639688 + (((~(i5 | 1011895454)) | 1099473761) * (-160)) + (((~(i5 | 1841882997)) | 1011895454) * 160)) {
            throw new RuntimeException("569738211");
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyTid = Process.myTid();
        if (i6 != ((~(iMyTid | 2040310773)) * TypedValues.CycleType.TYPE_EASING) + 1878129472 + (((~((~iMyTid) | 2040310773)) | 538741093) * TypedValues.CycleType.TYPE_EASING)) {
            throw null;
        }
        super.onCreate(bundle);
        int i7 = INotificationSideChannel + 105;
        cancelAll = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        TuitionPaymentDetailActivity tuitionPaymentDetailActivity = (TuitionPaymentDetailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 25;
        INotificationSideChannel = i2 % 128;
        return Integer.valueOf(i2 % 2 == 0 ? tuitionPaymentDetailActivity.getIntent().getIntExtra("payment_period", 1) : tuitionPaymentDetailActivity.getIntent().getIntExtra("payment_period", 1));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(TuitionPaymentDetailActivity tuitionPaymentDetailActivity, SelectedProgram selectedProgram) {
        int i = 2 % 2;
        int i2 = cancelAll + 15;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(selectedProgram, "");
        if (i3 == 0) {
            Function1<SelectedProgram, Unit> function1 = tuitionPaymentDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Function1<SelectedProgram, Unit> function2 = tuitionPaymentDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Unit unit2 = Unit.INSTANCE;
        int i4 = INotificationSideChannel + 115;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        TuitionPaymentDetailActivity tuitionPaymentDetailActivity = (TuitionPaymentDetailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 99;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) tuitionPaymentDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = cancelAll + 107;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return userAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentDetailActivity tuitionPaymentDetailActivity, View view) {
        int i = 2 % 2;
        int i2 = cancelAll + 73;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2 cameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2 = (CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2) tuitionPaymentDetailActivity.d.getValue();
            FragmentManager supportFragmentManager = tuitionPaymentDetailActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(cameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i4 = INotificationSideChannel + 13;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
                cameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.show(supportFragmentManager, cameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i6 = INotificationSideChannel + 33;
            cancelAll = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 83;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.Companion companion = CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.INSTANCE;
            CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            throw null;
        }
        CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.Companion companion2 = CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.INSTANCE;
        CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2 cameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault2 = CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i3 = INotificationSideChannel + 83;
        cancelAll = i3 % 128;
        if (i3 % 2 == 0) {
            return cameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:103:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:106:0x0302  */
    /* JADX WARN: Code duplicated, block: B:107:0x0305  */
    /* JADX WARN: Code duplicated, block: B:110:0x0337  */
    /* JADX WARN: Code duplicated, block: B:111:0x033c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0374  */
    /* JADX WARN: Code duplicated, block: B:115:0x0377  */
    /* JADX WARN: Code duplicated, block: B:156:0x0506  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c1 A[PHI: r1
  0x02c1: PHI (r1v13 com.bpjstku.domain.tuition.model.BpuCheckPaymentItem) = 
  (r1v12 com.bpjstku.domain.tuition.model.BpuCheckPaymentItem)
  (r1v18 com.bpjstku.domain.tuition.model.BpuCheckPaymentItem)
 binds: [B:95:0x02bf, B:92:0x02b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x02de  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e1  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(final TuitionPaymentDetailActivity tuitionPaymentDetailActivity) {
        String str;
        double dDoubleValue;
        String str2;
        double dDoubleValue2;
        BpuCheckPaymentItem bpuCheckPaymentItem;
        User user;
        String str3;
        User user2;
        String str4;
        User user3;
        String str5;
        User user4;
        String str6;
        String str7;
        String str8;
        int i = 2 % 2;
        BpuCheckPaymentItem bpuCheckPaymentItem2 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        String str9 = bpuCheckPaymentItem2 != null ? bpuCheckPaymentItem2.notify : null;
        Intrinsics.checkNotNull(str9);
        Double doubleOrNull = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str9, new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue3 = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        BpuCheckPaymentItem bpuCheckPaymentItem3 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        String str10 = bpuCheckPaymentItem3 != null ? bpuCheckPaymentItem3.notify : null;
        Intrinsics.checkNotNull(str10);
        Double doubleOrNull2 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str10, new String[]{"#"}, false, 0, 6, (Object) null).get(1));
        double dDoubleValue4 = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d;
        BpuCheckPaymentItem bpuCheckPaymentItem4 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        if (bpuCheckPaymentItem4 != null) {
            int i2 = cancelAll + 9;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 == 0) {
                String str11 = bpuCheckPaymentItem4.notify;
                throw null;
            }
            str = bpuCheckPaymentItem4.notify;
            int i3 = INotificationSideChannel + 59;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str = null;
        }
        Intrinsics.checkNotNull(str);
        Double doubleOrNull3 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str, new String[]{"#"}, false, 0, 6, (Object) null).get(2));
        double dDoubleValue5 = doubleOrNull3 != null ? doubleOrNull3.doubleValue() : 0.0d;
        BpuCheckPaymentItem bpuCheckPaymentItem5 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        String str12 = bpuCheckPaymentItem5 != null ? bpuCheckPaymentItem5.notify : null;
        Intrinsics.checkNotNull(str12);
        Double doubleOrNull4 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str12, new String[]{"#"}, false, 0, 6, (Object) null).get(3));
        if (doubleOrNull4 != null) {
            int i5 = INotificationSideChannel + 71;
            cancelAll = i5 % 128;
            int i6 = i5 % 2;
            dDoubleValue = doubleOrNull4.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        BpuCheckPaymentItem bpuCheckPaymentItem6 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        if (bpuCheckPaymentItem6 != null) {
            int i7 = cancelAll + 3;
            INotificationSideChannel = i7 % 128;
            if (i7 % 2 == 0) {
                str2 = bpuCheckPaymentItem6.notify;
                int i8 = 13 / 0;
            } else {
                str2 = bpuCheckPaymentItem6.notify;
            }
        } else {
            str2 = null;
        }
        Intrinsics.checkNotNull(str2);
        Double doubleOrNull5 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str2, new String[]{"#"}, false, 0, 6, (Object) null).get(5));
        double dDoubleValue6 = doubleOrNull5 != null ? doubleOrNull5.doubleValue() : 0.0d;
        BpuCheckPaymentItem bpuCheckPaymentItem7 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        String str13 = bpuCheckPaymentItem7 != null ? bpuCheckPaymentItem7.notify : null;
        Intrinsics.checkNotNull(str13);
        String str14 = (String) StringsKt.split$default((CharSequence) str13, new String[]{"#"}, false, 0, 6, (Object) null).get(7);
        BpuCheckPaymentItem bpuCheckPaymentItem8 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        String str15 = bpuCheckPaymentItem8 != null ? bpuCheckPaymentItem8.notify : null;
        Intrinsics.checkNotNull(str15);
        Double doubleOrNull6 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str15, new String[]{"#"}, false, 0, 6, (Object) null).get(4));
        if (doubleOrNull6 != null) {
            int i9 = INotificationSideChannel + 35;
            cancelAll = i9 % 128;
            int i10 = i9 % 2;
            dDoubleValue2 = doubleOrNull6.doubleValue();
        } else {
            dDoubleValue2 = 0.0d;
        }
        BpuCheckPaymentItem bpuCheckPaymentItem9 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        Intrinsics.checkNotNull(bpuCheckPaymentItem9);
        if (dDoubleValue6 == bpuCheckPaymentItem9.g) {
            int i11 = cancelAll + 99;
            INotificationSideChannel = i11 % 128;
            if (i11 % 2 == 0) {
                BpuCheckPaymentItem bpuCheckPaymentItem10 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                Intrinsics.checkNotNull(bpuCheckPaymentItem10);
                double d = bpuCheckPaymentItem10.asBinder;
                throw null;
            }
            BpuCheckPaymentItem bpuCheckPaymentItem11 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            Intrinsics.checkNotNull(bpuCheckPaymentItem11);
            if (dDoubleValue2 == bpuCheckPaymentItem11.asBinder) {
                BpuCheckPaymentItem bpuCheckPaymentItem12 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                Intrinsics.checkNotNull(bpuCheckPaymentItem12);
                if (dDoubleValue == bpuCheckPaymentItem12.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    BpuCheckPaymentItem bpuCheckPaymentItem13 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                    Intrinsics.checkNotNull(bpuCheckPaymentItem13);
                    if (dDoubleValue3 == bpuCheckPaymentItem13.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        BpuCheckPaymentItem bpuCheckPaymentItem14 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                        Intrinsics.checkNotNull(bpuCheckPaymentItem14);
                        if (dDoubleValue4 == bpuCheckPaymentItem14.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            int i12 = cancelAll + 63;
                            INotificationSideChannel = i12 % 128;
                            if (i12 % 2 == 0) {
                                BpuCheckPaymentItem bpuCheckPaymentItem15 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                Intrinsics.checkNotNull(bpuCheckPaymentItem15);
                                double d2 = bpuCheckPaymentItem15.TuitionPaymentFragmentbindingInflater1;
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            BpuCheckPaymentItem bpuCheckPaymentItem16 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                            Intrinsics.checkNotNull(bpuCheckPaymentItem16);
                            if (dDoubleValue5 == bpuCheckPaymentItem16.TuitionPaymentFragmentbindingInflater1) {
                                int i13 = cancelAll + 21;
                                INotificationSideChannel = i13 % 128;
                                int i14 = i13 % 2;
                                BpuCheckPaymentItem bpuCheckPaymentItem17 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                Intrinsics.checkNotNull(bpuCheckPaymentItem17);
                                if (Intrinsics.areEqual(StringsKt.split$default((CharSequence) bpuCheckPaymentItem17.asInterface, new String[]{"#"}, false, 0, 6, (Object) null).get(0), str14)) {
                                    int i15 = INotificationSideChannel + 27;
                                    cancelAll = i15 % 128;
                                    int i16 = i15 % 2;
                                    User user5 = (User) tuitionPaymentDetailActivity.g.getValue();
                                    String strValueOf = String.valueOf(user5 != null ? user5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
                                    BpuCheckPaymentItem bpuCheckPaymentItem18 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                    if (Intrinsics.areEqual(strValueOf, String.valueOf(bpuCheckPaymentItem18 != null ? bpuCheckPaymentItem18.INotificationSideChannelStubProxy : null))) {
                                        BpuCheckPaymentItem bpuCheckPaymentItem19 = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                        if (bpuCheckPaymentItem19 != null) {
                                            PaymentActivity.Companion companion = PaymentActivity.INSTANCE;
                                            TuitionPaymentDetailActivity tuitionPaymentDetailActivity2 = tuitionPaymentDetailActivity;
                                            double d3 = bpuCheckPaymentItem19.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            double d4 = bpuCheckPaymentItem19.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            double d5 = bpuCheckPaymentItem19.TuitionPaymentFragmentbindingInflater1;
                                            double d6 = bpuCheckPaymentItem19.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                            String string = bpuCheckPaymentItem19.b.toString();
                                            User user6 = (User) tuitionPaymentDetailActivity.g.getValue();
                                            String strValueOf2 = String.valueOf(user6 != null ? user6.asBinder : null);
                                            User user7 = (User) tuitionPaymentDetailActivity.g.getValue();
                                            String strValueOf3 = String.valueOf(user7 != null ? user7.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
                                            User user8 = (User) tuitionPaymentDetailActivity.g.getValue();
                                            String strValueOf4 = String.valueOf(user8 != null ? user8.g : null);
                                            User user9 = (User) tuitionPaymentDetailActivity.g.getValue();
                                            String strValueOf5 = String.valueOf(user9 != null ? user9.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
                                            String str16 = (String) StringsKt.split$default((CharSequence) bpuCheckPaymentItem19.asInterface, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                                            User user10 = (User) tuitionPaymentDetailActivity.g.getValue();
                                            String strValueOf6 = String.valueOf(user10 != null ? user10.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
                                            User user11 = (User) tuitionPaymentDetailActivity.g.getValue();
                                            String str17 = user11 != null ? user11.b : null;
                                            double d7 = bpuCheckPaymentItem19.g;
                                            double d8 = bpuCheckPaymentItem19.asBinder;
                                            String str18 = bpuCheckPaymentItem19.INotificationSideChannel;
                                            String str19 = bpuCheckPaymentItem19.INotificationSideChannelDefault;
                                            String str20 = bpuCheckPaymentItem19.INotificationSideChannelStub;
                                            String str21 = bpuCheckPaymentItem19.notify;
                                            String str22 = bpuCheckPaymentItem19.onTransact;
                                            User user12 = (User) tuitionPaymentDetailActivity.g.getValue();
                                            String strValueOf7 = String.valueOf(user12 != null ? user12.asInterface : null);
                                            String strValueOf8 = String.valueOf(bpuCheckPaymentItem19.RemoteActionCompatParcelizer);
                                            Double d9 = bpuCheckPaymentItem19.a;
                                            String str23 = bpuCheckPaymentItem19.cancelAll;
                                            PaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentDetailActivity2, new Registration(true, "", String.valueOf(d5), String.valueOf(d3), String.valueOf(d4), string, String.valueOf(d6), strValueOf5, strValueOf7, strValueOf3, strValueOf6, strValueOf2, strValueOf4, str16, str19, str20, "registered_member", str17, Double.valueOf(d7), Double.valueOf(d8), d9, str18, str21, str23 == null ? "" : str23, str22, "", strValueOf8, "", "", false, false, 1610612736, null));
                                            tuitionPaymentDetailActivity.d_();
                                        }
                                    } else {
                                        int i17 = cancelAll + 55;
                                        INotificationSideChannel = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            bpuCheckPaymentItem = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            int i18 = 43 / 0;
                                            if (bpuCheckPaymentItem != null) {
                                                PaymentActivity.Companion companion2 = PaymentActivity.INSTANCE;
                                                TuitionPaymentDetailActivity tuitionPaymentDetailActivity3 = tuitionPaymentDetailActivity;
                                                double d10 = bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                double d11 = bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                double d12 = bpuCheckPaymentItem.TuitionPaymentFragmentbindingInflater1;
                                                double d13 = bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                String string2 = bpuCheckPaymentItem.b.toString();
                                                user = (User) tuitionPaymentDetailActivity.g.getValue();
                                                if (user != null) {
                                                    str3 = user.asBinder;
                                                } else {
                                                    str3 = null;
                                                }
                                                String strValueOf9 = String.valueOf(str3);
                                                user2 = (User) tuitionPaymentDetailActivity.g.getValue();
                                                if (user2 != null) {
                                                    str4 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                } else {
                                                    str4 = null;
                                                }
                                                String strValueOf10 = String.valueOf(str4);
                                                user3 = (User) tuitionPaymentDetailActivity.g.getValue();
                                                if (user3 != null) {
                                                    str5 = user3.g;
                                                } else {
                                                    str5 = null;
                                                }
                                                String strValueOf11 = String.valueOf(str5);
                                                String str24 = bpuCheckPaymentItem.INotificationSideChannelStubProxy;
                                                String str25 = (String) StringsKt.split$default((CharSequence) bpuCheckPaymentItem.asInterface, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                                                user4 = (User) tuitionPaymentDetailActivity.g.getValue();
                                                if (user4 != null) {
                                                    str6 = user4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                } else {
                                                    str6 = null;
                                                }
                                                String strValueOf12 = String.valueOf(str6);
                                                String str26 = bpuCheckPaymentItem.IconCompatParcelizer;
                                                double d14 = bpuCheckPaymentItem.g;
                                                double d15 = bpuCheckPaymentItem.asBinder;
                                                String str27 = bpuCheckPaymentItem.INotificationSideChannel;
                                                String str28 = bpuCheckPaymentItem.INotificationSideChannelDefault;
                                                String str29 = bpuCheckPaymentItem.INotificationSideChannelStub;
                                                String str30 = bpuCheckPaymentItem.notify;
                                                String str31 = bpuCheckPaymentItem.onTransact;
                                                String strValueOf13 = String.valueOf(bpuCheckPaymentItem.getInterfaceDescriptor);
                                                String strValueOf14 = String.valueOf(bpuCheckPaymentItem.RemoteActionCompatParcelizer);
                                                Double d16 = bpuCheckPaymentItem.a;
                                                str7 = bpuCheckPaymentItem.cancelAll;
                                                if (str7 == null) {
                                                    str8 = "";
                                                } else {
                                                    str8 = str7;
                                                }
                                                PaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentDetailActivity3, new Registration(true, "", String.valueOf(d12), String.valueOf(d10), String.valueOf(d11), string2, String.valueOf(d13), str24, strValueOf13, strValueOf10, strValueOf12, strValueOf9, strValueOf11, str25, str28, str29, "registered_member", str26, Double.valueOf(d14), Double.valueOf(d15), d16, str27, str30, str8, str31, "", strValueOf14, "", "", false, false, 1610612736, null));
                                                tuitionPaymentDetailActivity.d_();
                                            }
                                        } else {
                                            bpuCheckPaymentItem = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                                            if (bpuCheckPaymentItem != null) {
                                                PaymentActivity.Companion companion3 = PaymentActivity.INSTANCE;
                                                TuitionPaymentDetailActivity tuitionPaymentDetailActivity4 = tuitionPaymentDetailActivity;
                                                double d17 = bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                double d18 = bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                double d19 = bpuCheckPaymentItem.TuitionPaymentFragmentbindingInflater1;
                                                double d110 = bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                String string3 = bpuCheckPaymentItem.b.toString();
                                                user = (User) tuitionPaymentDetailActivity.g.getValue();
                                                if (user != null) {
                                                    str3 = user.asBinder;
                                                } else {
                                                    str3 = null;
                                                }
                                                String strValueOf15 = String.valueOf(str3);
                                                user2 = (User) tuitionPaymentDetailActivity.g.getValue();
                                                if (user2 != null) {
                                                    str4 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                } else {
                                                    str4 = null;
                                                }
                                                String strValueOf16 = String.valueOf(str4);
                                                user3 = (User) tuitionPaymentDetailActivity.g.getValue();
                                                if (user3 != null) {
                                                    str5 = user3.g;
                                                } else {
                                                    str5 = null;
                                                }
                                                String strValueOf17 = String.valueOf(str5);
                                                String str210 = bpuCheckPaymentItem.INotificationSideChannelStubProxy;
                                                String str211 = (String) StringsKt.split$default((CharSequence) bpuCheckPaymentItem.asInterface, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
                                                user4 = (User) tuitionPaymentDetailActivity.g.getValue();
                                                if (user4 != null) {
                                                    str6 = user4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                } else {
                                                    str6 = null;
                                                }
                                                String strValueOf18 = String.valueOf(str6);
                                                String str212 = bpuCheckPaymentItem.IconCompatParcelizer;
                                                double d111 = bpuCheckPaymentItem.g;
                                                double d112 = bpuCheckPaymentItem.asBinder;
                                                String str213 = bpuCheckPaymentItem.INotificationSideChannel;
                                                String str214 = bpuCheckPaymentItem.INotificationSideChannelDefault;
                                                String str215 = bpuCheckPaymentItem.INotificationSideChannelStub;
                                                String str32 = bpuCheckPaymentItem.notify;
                                                String str33 = bpuCheckPaymentItem.onTransact;
                                                String strValueOf19 = String.valueOf(bpuCheckPaymentItem.getInterfaceDescriptor);
                                                String strValueOf110 = String.valueOf(bpuCheckPaymentItem.RemoteActionCompatParcelizer);
                                                Double d113 = bpuCheckPaymentItem.a;
                                                str7 = bpuCheckPaymentItem.cancelAll;
                                                if (str7 == null) {
                                                    str8 = "";
                                                } else {
                                                    str8 = str7;
                                                }
                                                PaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentDetailActivity4, new Registration(true, "", String.valueOf(d19), String.valueOf(d17), String.valueOf(d18), string3, String.valueOf(d110), str210, strValueOf19, strValueOf16, strValueOf18, strValueOf15, strValueOf17, str211, str214, str215, "registered_member", str212, Double.valueOf(d111), Double.valueOf(d112), d113, str213, str32, str8, str33, "", strValueOf110, "", "", false, false, 1610612736, null));
                                                tuitionPaymentDetailActivity.d_();
                                            }
                                        }
                                    }
                                } else {
                                    retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(tuitionPaymentDetailActivity, "Oops Terjadi Kesalahan", "Coba Lagi", new Function0() { // from class: CaptureRequestParameterCompat
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return TuitionPaymentDetailActivity.asBinder(this.TuitionPaymentFragmentbindingInflater1);
                                        }
                                    });
                                }
                            } else {
                                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(tuitionPaymentDetailActivity, "Oops Terjadi Kesalahan", "Coba Lagi", new Function0() { // from class: CaptureRequestParameterCompat
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return TuitionPaymentDetailActivity.asBinder(this.TuitionPaymentFragmentbindingInflater1);
                                    }
                                });
                            }
                        } else {
                            retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(tuitionPaymentDetailActivity, "Oops Terjadi Kesalahan", "Coba Lagi", new Function0() { // from class: CaptureRequestParameterCompat
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TuitionPaymentDetailActivity.asBinder(this.TuitionPaymentFragmentbindingInflater1);
                                }
                            });
                        }
                    } else {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(tuitionPaymentDetailActivity, "Oops Terjadi Kesalahan", "Coba Lagi", new Function0() { // from class: CaptureRequestParameterCompat
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TuitionPaymentDetailActivity.asBinder(this.TuitionPaymentFragmentbindingInflater1);
                            }
                        });
                    }
                } else {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(tuitionPaymentDetailActivity, "Oops Terjadi Kesalahan", "Coba Lagi", new Function0() { // from class: CaptureRequestParameterCompat
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TuitionPaymentDetailActivity.asBinder(this.TuitionPaymentFragmentbindingInflater1);
                        }
                    });
                }
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(tuitionPaymentDetailActivity, "Oops Terjadi Kesalahan", "Coba Lagi", new Function0() { // from class: CaptureRequestParameterCompat
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TuitionPaymentDetailActivity.asBinder(this.TuitionPaymentFragmentbindingInflater1);
                    }
                });
            }
        } else {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(tuitionPaymentDetailActivity, "Oops Terjadi Kesalahan", "Coba Lagi", new Function0() { // from class: CaptureRequestParameterCompat
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TuitionPaymentDetailActivity.asBinder(this.TuitionPaymentFragmentbindingInflater1);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentDetailActivity tuitionPaymentDetailActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (((ActivityTuitionPaymentDetailBinding) ((ViewBinding) tuitionPaymentDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).billDetailContainer.getVisibility() == 8) {
                int i2 = INotificationSideChannel + 61;
                cancelAll = i2 % 128;
                int i3 = i2 % 2;
                ActivityTuitionPaymentDetailBinding activityTuitionPaymentDetailBinding = (ActivityTuitionPaymentDetailBinding) ((ViewBinding) tuitionPaymentDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                ConstraintLayout constraintLayout = activityTuitionPaymentDetailBinding.billDetailContainer;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                activityTuitionPaymentDetailBinding.tvBillDetail.setText(tuitionPaymentDetailActivity.getString(R.string.label_close));
                activityTuitionPaymentDetailBinding.tvBillDetail.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_up_green, 0);
            } else if (((ActivityTuitionPaymentDetailBinding) ((ViewBinding) tuitionPaymentDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).billDetailContainer.getVisibility() == 0) {
                int i4 = INotificationSideChannel + 5;
                cancelAll = i4 % 128;
                int i5 = i4 % 2;
                ActivityTuitionPaymentDetailBinding activityTuitionPaymentDetailBinding2 = (ActivityTuitionPaymentDetailBinding) ((ViewBinding) tuitionPaymentDetailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                ConstraintLayout constraintLayout2 = activityTuitionPaymentDetailBinding2.billDetailContainer;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.setVisibility(8);
                activityTuitionPaymentDetailBinding2.tvBillDetail.setText(tuitionPaymentDetailActivity.getString(R.string.label_bill_detail));
                activityTuitionPaymentDetailBinding2.tvBillDetail.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
                int i6 = cancelAll + 115;
                INotificationSideChannel = i6 % 128;
                int i7 = i6 % 2;
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ isSurfaceSharingEnabled b(final TuitionPaymentDetailActivity tuitionPaymentDetailActivity) {
        int i = 2 % 2;
        TuitionPaymentDetailActivity tuitionPaymentDetailActivity2 = tuitionPaymentDetailActivity;
        ArrayList arrayList = new ArrayList();
        BpuCheckPaymentItem bpuCheckPaymentItem = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        if (bpuCheckPaymentItem != null) {
            int i2 = INotificationSideChannel + 31;
            cancelAll = i2 % 128;
            if (i2 % 2 == 0 ? bpuCheckPaymentItem.TuitionPaymentFragmentbindingInflater1 > 0.0d : bpuCheckPaymentItem.TuitionPaymentFragmentbindingInflater1 > 0.0d) {
                arrayList.add(new SelectedProgram(1, tuitionPaymentDetailActivity.getString(R.string.old_day_security), R.drawable.ic_people_jht));
                int i3 = INotificationSideChannel + 53;
                cancelAll = i3 % 128;
                int i4 = i3 % 2;
            }
            if (bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > 0.0d) {
                arrayList.add(new SelectedProgram(1, tuitionPaymentDetailActivity.getString(R.string.label_work_accident_security), R.drawable.ic_people_jkk));
            }
            if (bpuCheckPaymentItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0.0d) {
                arrayList.add(new SelectedProgram(1, tuitionPaymentDetailActivity.getString(R.string.label_death_security), R.drawable.ic_people_jkm));
            }
        }
        return new isSurfaceSharingEnabled(tuitionPaymentDetailActivity2, arrayList, new Function1() { // from class: StreamConfigurationMapCompatBaseImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (SelectedProgram) obj);
            }
        });
    }

    public static /* synthetic */ BpuCheckPaymentItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentDetailActivity tuitionPaymentDetailActivity) {
        BpuCheckPaymentItem bpuCheckPaymentItem;
        int i = 2 % 2;
        int i2 = cancelAll + 111;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            bpuCheckPaymentItem = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.getIntent().getParcelableExtra("tuition_payment");
            int i3 = 62 / 0;
        } else {
            bpuCheckPaymentItem = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.getIntent().getParcelableExtra("tuition_payment");
        }
        int i4 = INotificationSideChannel + 37;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return bpuCheckPaymentItem;
    }

    public static /* synthetic */ Unit asBinder(TuitionPaymentDetailActivity tuitionPaymentDetailActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 99;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        BpuCheckPaymentItem bpuCheckPaymentItem = (BpuCheckPaymentItem) tuitionPaymentDetailActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        Intrinsics.checkNotNull(bpuCheckPaymentItem);
        Companion.b(tuitionPaymentDetailActivity, bpuCheckPaymentItem, ((Number) tuitionPaymentDetailActivity.a.getValue()).intValue());
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannel + 9;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ int TuitionPaymentFragmentbindingInflater1(TuitionPaymentDetailActivity tuitionPaymentDetailActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -639991184, 639991186, new Object[]{tuitionPaymentDetailActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault4)).intValue();
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentDetailActivity tuitionPaymentDetailActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (User) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -256294805, 256294805, new Object[]{tuitionPaymentDetailActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    public static /* synthetic */ CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2 g() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 2093529965, -2093529964, new Object[0], iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    static {
        INotificationSideChannelDefault = 0;
        cancelAll();
        INSTANCE = new Companion(null);
        int i = getInterfaceDescriptor + 27;
        INotificationSideChannelDefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TuitionPaymentDetailActivity() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 121;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 25;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 33;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = cancelAll + 43;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentbindingInflater1 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = ForgotPasswordItem.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentbindingInflater1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1653402237, 412646721, -412646718, new Object[]{this}, (-1583930019) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, iTuitionPaymentFragmentbindingInflater2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 1;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void cancelAll() {
        onTransact = -6377398940819159759L;
        notify = -981105359;
        cancel = (char) 3980;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            int r7 = 104 - r7
            byte[] r0 = com.bpjstku.presentation.tuition.TuitionPaymentDetailActivity.$$c
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.tuition.TuitionPaymentDetailActivity.$$i(byte, byte, int):java.lang.String");
    }
}
