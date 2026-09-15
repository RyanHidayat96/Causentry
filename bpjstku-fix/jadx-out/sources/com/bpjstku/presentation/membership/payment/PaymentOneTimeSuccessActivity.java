package com.bpjstku.presentation.membership.payment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.InputDeviceCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.payment.model.request.CheckRecurringStatusRequest;
import com.bpjstku.data.payment.model.response.GetStatusRecurringPlanResponse;
import com.bpjstku.data.registration.bpu.model.request.InsertJmoPairRequest;
import com.bpjstku.data.tuition.model.request.BpuOneMonthTuitionRequest;
import com.bpjstku.databinding.ActivityPaymentOneTimeSuccessBinding;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.tuition.model.BpuTuitionOneMonth;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.main.MainActivity;
import com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.util.enums.AppsFlyerEventEnum;
import com.bpjstku.util.managers.AppsFlyerManager;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_CameraUseCaseAdapter_CameraId;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2InteropExtender;
import defpackage.CameraUseCaseAdapter;
import defpackage.InputConfigurationCompat;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ListPopupWindow2;
import defpackage.TargetAspectRatio;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.getCameraIdString;
import defpackage.getCameraOperatingMode;
import defpackage.getEventTime;
import defpackage.getImeOptions;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0015\u0010\u0013\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0015\u0010\t\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0015\u0010\n\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0016\u0010\u001d\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0016\u0010\r\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010!R\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR \u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010%R\u0014\u0010(\u001a\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010'R\u0015\u0010*\u001a\u00020)8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010\u0011"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentOneTimeSuccessActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityPaymentOneTimeSuccessBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "onBackPressed", "", "cancelAll", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "LgetImeOptions;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/user/model/User;", "INotificationSideChannelDefault", "", "D", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LListPopupWindow2;", "cancel", "Lcom/bpjstku/domain/registration/general/model/Registration;", "notify", "d", "g", "INotificationSideChannel", "", "I", "onTransact", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "INotificationSideChannelStub", "()I", "RemoteActionCompatParcelizer", "LInputConfigurationCompat;", "INotificationSideChannelStubProxy"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentOneTimeSuccessActivity extends BindingBaseActivity<ActivityPaymentOneTimeSuccessBinding> {
    private static int IconCompatParcelizer;
    private static char[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long getInterfaceDescriptor;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final Lazy INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private double TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private double d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private double notify;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private double g;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private double a;
    private static final byte[] $$c = {48, -119, -71, 110};
    private static final int $$f = 138;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {109, 84, -87, -114, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 37;
    private static int write = 1;
    private static int MediaBrowserCompat = 0;
    private static int connect = 1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: setModal
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentOneTimeSuccessActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy asBinder = LazyKt.lazy(new Function0() { // from class: setListSelector
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
            int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
            return (Registration) PaymentOneTimeSuccessActivity.b(563146669, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), objArr, -563146666);
        }
    });
    private String INotificationSideChannel = ExifInterface.GPS_DIRECTION_TRUE;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private int cancelAll = 2;
    private String onTransact = "JKK-JKM";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String cancel = "";

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~i4;
        int i10 = (~(i7 | i8 | i9)) | (~(i6 | i));
        int i11 = ~(i4 | i);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i6 + i + i3 + (1349231875 * i5) + (1735201104 * i2);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i6) + 1558183936 + (237349861 * i) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i3) + ((-1337982976) * i5) + (469762048 * i2) + (1272971264 * i16);
        int i18 = ((i6 * 236314795) - 374860141) + (i * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i3 * 236313959) + (i5 * (-66979019)) + (i2 * (-1872492752)) + (i16 * (-417333248));
        int i19 = i17 + (i18 * i18 * 639631360);
        if (i19 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? TuitionPaymentFragmentbindingInflater1(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity.$$a
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r1 = 53 - r7
            int r6 = 144 - r6
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
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
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity.c(int, byte, int, java.lang.Object[]):void");
    }

    public PaymentOneTimeSuccessActivity() {
        final PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity$special$$inlined$viewModel$default$1
            private static final byte[] $$c = {8, -36, 87, -65};
            private static final int $$f = 188;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {17, 104, 102, -28, -20, -6, 55, -60, -22, -2, -17, -9, 1, -18, 63, -62, -5, -27, 11, -9, -15, -13, 2, -13, -13, -1, 49, -27, -42, -25, 3, -21, 5, -19, -13, 27, -27, -3, -9, -18, 23, -36, 3, -32, 12, -21, 40, -47, -13, 2, -13, -13, -1, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, 10, -15, -13, 2, -13, -13, -1, 22, -45, 0, -14, 3, -27, 7, -21, 57};
            private static final int $$e = 94;
            private static final byte[] $$a = {19, 78, 114, 113, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 64;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static char[] b = {60052, 60047, 60054, 60088, 60045, 60117, 60049, 60057, 60048, 60063, 60058, 60072, 60083, 60040, 60050, 60060, 60053, 60051, 60041, 60056, 60062, 60073, 60034, 60043, 60055};
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57188;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 3
                    int r6 = 84 - r6
                    int r8 = r8 * 15
                    int r0 = r8 + 38
                    int r7 = r7 * 52
                    int r7 = 108 - r7
                    byte[] r1 = com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity$special$$inlined$viewModel$default$1.$$a
                    byte[] r0 = new byte[r0]
                    int r8 = r8 + 37
                    r2 = 0
                    if (r1 != 0) goto L19
                    r3 = r7
                    r7 = r8
                    r4 = r2
                    goto L2f
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L29:
                    r3 = r1[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r3
                    r3 = r5
                L2f:
                    int r6 = -r6
                    int r7 = r7 + r6
                    int r6 = r7 + (-11)
                    int r7 = r3 + 1
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity$special$$inlined$viewModel$default$1.a(byte, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 12
                    int r0 = r7 + 38
                    byte[] r1 = com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity$special$$inlined$viewModel$default$1.$$d
                    int r8 = r8 * 49
                    int r8 = 53 - r8
                    int r6 = r6 * 15
                    int r6 = 99 - r6
                    byte[] r0 = new byte[r0]
                    int r7 = r7 + 37
                    r2 = 0
                    if (r1 != 0) goto L18
                    r3 = r8
                    r4 = r2
                    goto L2e
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r7) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2e:
                    int r8 = -r8
                    int r3 = r3 + 1
                    int r6 = r6 + r8
                    int r6 = r6 + (-8)
                    r8 = r3
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity$special$$inlined$viewModel$default$1.d(short, byte, int, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int i3 = 2;
                int i4 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = b;
                int i5 = 1770390596;
                Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = $11 + 75;
                        $10 = i7 % 128;
                        int i8 = i7 % i3;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2267 - Color.argb(0, 0, 0, 0), 33 - TextUtils.indexOf("", ""), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i6++;
                            int i9 = $10 + 71;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                            i3 = 2;
                            i5 = 1770390596;
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
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Color.alpha(0) + 2267, 32 - TextUtils.lastIndexOf("", '0'), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
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
                            int i11 = $11 + 31;
                            $10 = i11 % 128;
                            if (i11 % 2 != 0) {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b << b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 0] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % b2);
                            } else {
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                            }
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 49267), TextUtils.getOffsetBefore("", 0) + 3261, 30 - View.combineMeasuredStates(0, 0), -127612708, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b9 = (byte) 0;
                                    byte b10 = b9;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - View.resolveSizeAndState(0, 0, 0)), 594 - TextUtils.indexOf("", "", 0, 0), 17 - Color.red(0), 1570859318, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                                } else {
                                    int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                int i17 = $11 + 25;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                for (int i19 = 0; i19 < i; i19++) {
                    cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            /* JADX WARN: Type inference failed for: r0v34, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            private ActivityResultContractsPickVisualMediaMediaCapabilities TuitionPaymentFragmentbindingInflater1() throws Throwable {
                Object[] objArr;
                ZoomGestureDetectorZoomEvent koin;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                LifecycleOwner lifecycleOwner = paymentOneTimeSuccessActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char modifierMetaStateMask = (char) (43041 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 3112;
                    int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[7], bArr[40], bArr[5], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, iLastIndexOf, maxKeyCode, -1272852037, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{11, 15, '\b', 19, 4, '\n', 5, 6, 3, '\n', 6, '\n', 23, '\f', 0, 21, 3, 4, 20, 4, 18, '\t'}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 82), TextUtils.getTrimmedLength("") + 22, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{21, 20, '\r', 20, '\n', 23, 6, 24, 0, 15, 21, 4, '\f', 4, 13945}, (byte) (122 - Color.red(0)), 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 43042);
                    int iLastIndexOf2 = 3110 - TextUtils.lastIndexOf("", '0', 0);
                    int longPressTimeout = 22 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[7];
                    byte b3 = bArr2[5];
                    Object[] objArr5 = new Object[1];
                    a(b2, b3, b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, iLastIndexOf2, longPressTimeout, -1269618118, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43042);
                        int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3110;
                        int iMyPid = 22 - (Process.myPid() >> 22);
                        byte b4 = $$a[7];
                        byte b5 = b4;
                        Object[] objArr6 = new Object[1];
                        a(b4, b5, b5, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, i4, iMyPid, 154975793, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i5 = ((int[]) objArr7[2])[0];
                    int i6 = ((int[]) objArr7[1])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int i7 = ~((~System.identityHashCode(this)) | 1182281075);
                    int i8 = (((1078994000 | i7) * (-970)) - 1047023708) + ((i7 | 103287075) * 970) + 190509678;
                    int i9 = (i8 << 13) ^ i8;
                    int i10 = i9 ^ (i9 >>> 17);
                    ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                    objArr = new Object[]{new int[1], new int[]{i6}, new int[]{i5}, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{5, 11, 0, 14, '\t', 20, 11, 15, 20, '\n', '\f', 21, 11, 3, 22, 0}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 25), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{19, 14, 21, 15, 4, 11, 2, 21, '\r', 11, '\f', 18, 4, 1, 5, 24}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 83), View.MeasureSpec.makeMeasureSpec(0, 0) + 16, objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
                    TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                    int i12 = i11 % 2;
                    try {
                        Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 190509678};
                        byte[] bArr3 = $$d;
                        byte b6 = bArr3[63];
                        byte b7 = bArr3[12];
                        Object[] objArr11 = new Object[1];
                        d(b6, b7, b7, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b8 = bArr3[12];
                        byte b9 = bArr3[63];
                        Object[] objArr12 = new Object[1];
                        d(b8, b9, b9, objArr12);
                        objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char mode = (char) (View.MeasureSpec.getMode(0) + 43042);
                            int capsMode = 3111 - TextUtils.getCapsMode("", 0, 0);
                            int i13 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                            byte b10 = $$a[7];
                            byte b11 = b10;
                            Object[] objArr13 = new Object[1];
                            a(b10, b11, b11, objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mode, capsMode, i13, 154975793, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr14 = new Object[1];
                            c(new char[]{11, 15, '\b', 19, 4, '\n', 5, 6, 3, '\n', 6, '\n', 23, '\f', 0, 21, 3, 4, 20, 4, 18, '\t'}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 82), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, objArr14);
                            Class<?> cls4 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            c(new char[]{21, 20, '\r', 20, '\n', 23, 6, 24, 0, 15, 21, 4, '\f', 4, 13945}, (byte) (121 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, objArr15);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cMakeMeasureSpec2 = (char) (43042 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                int trimmedLength = 3111 - TextUtils.getTrimmedLength("");
                                int i14 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                byte[] bArr4 = $$a;
                                byte b12 = bArr4[7];
                                byte b13 = bArr4[5];
                                Object[] objArr16 = new Object[1];
                                a(b12, b13, b13, objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec2, trimmedLength, i14, -1269618118, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 43042);
                                int gidForName = 3110 - Process.getGidForName("");
                                int i15 = 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                byte[] bArr5 = $$a;
                                Object[] objArr17 = new Object[1];
                                a(bArr5[7], bArr5[40], bArr5[5], objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength2, gidForName, i15, -1272852037, false, (String) objArr17[0], null);
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
                if (((int[]) objArr[2])[0] == ((int[]) objArr[1])[0]) {
                    int i16 = ((int[]) objArr[0])[0];
                    int i17 = ((int[]) objArr[2])[0];
                    int i18 = ((int[]) objArr[1])[0];
                    String[] strArr2 = (String[]) objArr[3];
                    int[] iArr = {i17};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i19 = i16 + 2048583942 + (((~(iIdentityHashCode | 735179893)) | (-1004533502)) * 305) + (((~((~iIdentityHashCode) | 735179893)) | (-969851566)) * 305);
                    int i20 = (i19 << 13) ^ i19;
                    int i21 = i20 ^ (i20 >>> 17);
                    ((int[]) objArr[0])[0] = i21 ^ (i21 << 5);
                    Object[] objArr18 = {new int[1], new int[]{i18}, iArr, strArr2};
                    int i22 = TuitionPaymentFragmentbindingInflater1 + 31;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                    int i23 = i22 % 2;
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
                    if (lifecycleOwner != null) {
                        int i24 = TuitionPaymentFragmentbindingInflater1 + 61;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                        int i25 = i24 % 2;
                        ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                        if (!(!(componentCallbacks instanceof getEventTime))) {
                            koin = ((getEventTime) componentCallbacks).getKoin();
                        } else {
                            koin = ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
                        }
                        return isQuickZoomEnabled.b(koin, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
                }
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[3];
                if (strArr3 != null) {
                    for (String str : strArr3) {
                        arrayList.add(str);
                    }
                }
                throw null;
            }

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                ?? TuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                return TuitionPaymentFragmentbindingInflater2;
            }

            private static String $$g(int i, byte b2, short s) {
                int i2 = 4 - (b2 * 3);
                int i3 = i * 2;
                byte[] bArr = $$c;
                int i4 = s + 113;
                byte[] bArr2 = new byte[1 - i3];
                int i5 = 0 - i3;
                int i6 = -1;
                if (bArr == null) {
                    i6 = -1;
                    i4 = (-i2) + i5;
                    i2++;
                }
                while (true) {
                    int i7 = i6 + 1;
                    bArr2[i7] = (byte) i4;
                    if (i7 == i5) {
                        return new String(bArr2, 0);
                    }
                    int i8 = i4;
                    i6 = i7;
                    i4 = (-bArr[i2]) + i8;
                    i2++;
                }
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getImeOptions>() { // from class: com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getImeOptions] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getImeOptions invoke() {
                LifecycleOwner lifecycleOwner = paymentOneTimeSuccessActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getImeOptions.class);
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
        this.asInterface = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity$special$$inlined$viewModel$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = paymentOneTimeSuccessActivity;
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
        this.INotificationSideChannelStubProxy = LazyKt.lazy(new Function0<InputConfigurationCompat>() { // from class: com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity$special$$inlined$viewModel$default$4
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [InputConfigurationCompat, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ InputConfigurationCompat invoke() {
                LifecycleOwner lifecycleOwner = paymentOneTimeSuccessActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputConfigurationCompat.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentOneTimeSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/registration/general/model/Registration;", "p1", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Lcom/bpjstku/domain/registration/general/model/Registration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, Registration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) PaymentOneTimeSuccessActivity.class);
            intent.putExtra("successful_unregistered_registration_data", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            getCameraIdString.b[0] = AutoValue_CameraUseCaseAdapter_CameraId.TuitionPaymentFragmentbindingInflater1[0];
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityPaymentOneTimeSuccessBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = connect + 121;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        PaymentOneTimeSuccessActivity$bindingInflater$1 paymentOneTimeSuccessActivity$bindingInflater$1 = PaymentOneTimeSuccessActivity$bindingInflater$1.b;
        int i4 = MediaBrowserCompat + 97;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            return paymentOneTimeSuccessActivity$bindingInflater$1;
        }
        throw null;
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 119;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(RemoteActionCompatParcelizer[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 2187 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40, 841711447, false, $$i(b, b2, (byte) (b2 - 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(getInterfaceDescriptor), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 33017), KeyEvent.normalizeMetaState(0) + 3011, 26 - View.resolveSize(0, 0), 321985076, false, $$i(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (-b5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 36505), 3376 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 17, -968507904, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 117;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (-b7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 36505), 3376 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 17 - KeyEvent.getDeadChar(0, 0), -968507904, false, $$i(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                int i8 = 14 / 0;
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) (-1);
                    byte b10 = (byte) (-b9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - Color.green(0)), 3377 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, -968507904, false, $$i(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity = (PaymentOneTimeSuccessActivity) objArr[0];
        int i = 2 % 2;
        Button button = ((ActivityPaymentOneTimeSuccessBinding) ((ViewBinding) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnback;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setWidth
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj};
                int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
                return (Unit) PaymentOneTimeSuccessActivity.b(-1059211569, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), objArr2, 1059211570);
            }
        }));
        if (Double.parseDouble(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2) > 0.0d) {
            int i2 = connect + 83;
            MediaBrowserCompat = i2 % 128;
            int i3 = i2 % 2;
            paymentOneTimeSuccessActivity.INotificationSideChannel = "L";
        }
        Button button2 = ((ActivityPaymentOneTimeSuccessBinding) ((ViewBinding) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnRegisterAutoDebit;
        Intrinsics.checkNotNullExpressionValue(button2, "");
        button2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setPromptView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentOneTimeSuccessActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        int i4 = MediaBrowserCompat + 71;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity = this;
        ((InputConfigurationCompat) this.INotificationSideChannelStubProxy.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(paymentOneTimeSuccessActivity, new Observer() { // from class: setPromptPosition
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.asInterface.getValue()).b.observe(paymentOneTimeSuccessActivity, new Observer() { // from class: setOnItemClickListener
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = MediaBrowserCompat + 5;
        connect = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws Throwable {
        int i = 2 % 2;
        ((ListPopupWindow2) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new CheckRecurringStatusRequest("JMO", "BPJSTK-PTI12345", String.valueOf(((Registration) this.asBinder.getValue()).RemoteActionCompatParcelizer)));
        if (!Intrinsics.areEqual(StringsKt.toDoubleOrNull(((Registration) this.asBinder.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0.0d)) {
            int i2 = connect;
            int i3 = i2 + 43;
            MediaBrowserCompat = i3 % 128;
            int i4 = i3 % 2;
            this.cancelAll = 3;
            this.INotificationSideChannel = "L";
            this.onTransact = "JKK-JKM-JHT";
            int i5 = i2 + 61;
            MediaBrowserCompat = i5 % 128;
            int i6 = i5 % 2;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        InputConfigurationCompat inputConfigurationCompat = (InputConfigurationCompat) this.INotificationSideChannelStubProxy.getValue();
        String str = this.INotificationSideChannel;
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String str2 = ((Registration) this.asBinder.getValue()).connect;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("#");
        sb.append(string);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion, sb.toString(), this.TuitionPaymentFragmentbindingInflater1);
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        String str3 = ((Registration) this.asBinder.getValue()).connect;
        String str4 = this.INotificationSideChannel;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append("#");
        sb2.append(str4);
        sb2.append("#");
        sb2.append(string);
        inputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new BpuOneMonthTuitionRequest("JMO", "1", str, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion2, sb2.toString(), this.TuitionPaymentFragmentbindingInflater1)));
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity = (PaymentOneTimeSuccessActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 81;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Registration registration = (Registration) paymentOneTimeSuccessActivity.asBinder.getValue();
        if (registration.getExtras) {
            String strValueOf = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).g);
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("user_id", strValueOf));
            Intrinsics.checkNotNullParameter("success_payment_sertakan_deeplink", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_payment_sertakan_deeplink", mapMutableMapOf);
        }
        if (!registration.com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String) {
            return null;
        }
        String str = ((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).g;
        AppsFlyerManager.INSTANCE.b().TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentOneTimeSuccessActivity, AppsFlyerEventEnum.SUCCESS_BPU.getType(), new LinkedHashMap());
        int i4 = MediaBrowserCompat + 71;
        connect = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = connect + 43;
        MediaBrowserCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onBackPressed();
            MainActivity.Companion companion = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, null, null, 39);
        } else {
            super.onBackPressed();
            MainActivity.Companion companion2 = MainActivity.INSTANCE;
            MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, null, null, 6);
        }
        d_();
        int i3 = connect + 25;
        MediaBrowserCompat = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c((short) 141, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, minimumFlingVelocity, iNormalizeMetaState, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(KeyEvent.normalizeMetaState(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 34458), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(View.resolveSizeAndState(0, 0, 0) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 89, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, absoluteGravity, longPressTimeout, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int i2 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int touchSlop = 15 - (ViewConfiguration.getTouchSlop() >> 8);
                Object[] objArr6 = new Object[1];
                c((short) $$b, (byte) 52, $$a[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, i2, touchSlop, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_save_card).substring(0, 1).codePointAt(0) + 1862588893;
            int i5 = ~iCodePointAt;
            int i6 = (~((-1039600005) | i5)) | 761726976;
            int i7 = ~(iCodePointAt | 1073192862);
            int i8 = (-1422899904) + ((i6 | i7) * (-713)) + (i7 * 1426) + ((~(795319834 | i5)) * 713) + 308211742;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_gopay_deeplink).substring(1, 2).codePointAt(0) - 60, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 64, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (54838 - TextUtils.getOffsetAfter("", 0)), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-207916948};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 46037), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1134, Color.green(0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 308211742, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                    int iIndexOf = 15 - TextUtils.indexOf("", "", 0);
                    byte b3 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c((short) 141, b3, b3, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, windowTouchSlop, iIndexOf, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getTouchSlop() >> 8) + 45993), 1117 - View.resolveSizeAndState(0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                    int i11 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
                    Object[] objArr13 = new Object[1];
                    c((short) $$b, (byte) 52, $$a[5], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode, iIndexOf2, i11, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, View.MeasureSpec.makeMeasureSpec(0, 0) + 22, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step4).substring(29, 32).codePointAt(1) + 34426), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 85, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, (char) TextUtils.getTrimmedLength(""), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                        int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                        int i12 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte b4 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 89, b4, b4, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, tapTimeout, i12, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int i13 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int iAlpha = Color.alpha(0) + 15;
                        byte b5 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((short) 141, b5, b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(scrollBarSize, i13, iAlpha, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i14 = connect + 77;
                MediaBrowserCompat = i14 % 128;
                int i15 = i14 % 2 == 0 ? 0 : 1;
                while (i15 < strArr2.length) {
                    arrayList.add(strArr2[i15]);
                    i15++;
                    int i16 = MediaBrowserCompat + 27;
                    connect = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = 4 / 3;
                    }
                }
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 699738023;
        int i22 = ~i21;
        int i23 = i18 + 1581789188 + (((~((-634562466) | i22)) | (~(390282295 | i22))) * (-867)) + (((~((-634562466) | i21)) | 546341760 | (~(390282295 | i21))) * (-1734)) + (((~(i21 | 936624055)) | (~(i22 | (-546341761))) | (~((-88220706) | i21))) * 867);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
        int i26 = MediaBrowserCompat + 123;
        connect = i26 % 128;
        if (i26 % 2 == 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c2 = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int touchSlop2 = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                Object[] objArr19 = new Object[1];
                c((short) $$b, (byte) 15, $$a[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, touchSlop2, iResolveOpacity, 986134021, false, (String) objArr19[0], null);
            }
            Object obj = null;
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
            obj.hashCode();
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char doubleTapTimeout2 = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int iBlue = 23 - Color.blue(0);
            Object[] objArr20 = new Object[1];
            c((short) $$b, (byte) 15, $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(doubleTapTimeout2, iMakeMeasureSpec, iBlue, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int iIndexOf3 = 1755 - TextUtils.indexOf("", "");
                int iCombineMeasuredStates = 23 - View.combineMeasuredStates(0, 0);
                byte b6 = $$a[7];
                Object[] objArr21 = new Object[1];
                c((short) 89, b6, b6, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(keyRepeatTimeout, iIndexOf3, iCombineMeasuredStates, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i27 = ~iIdentityHashCode;
            int i28 = ~(321204500 | i27);
            int i29 = ((((-867000959) + (((-394081247) | i28) * (-712))) + (((~(iIdentityHashCode | (-72876747))) | (~(i27 | 394081246))) * (-712))) + ((108602074 | i28) * 712)) - 775900293;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26, Color.rgb(0, 0, 0) + InputDeviceCompat.SOURCE_JOYSTICK, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 56, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step1).substring(24, 34).length() + 6, (char) (54838 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-207916948};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 42049), 1726 - Color.green(0), 28 - TextUtils.indexOf((CharSequence) "", '0', 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr25), -775900293);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cAlpha = (char) (29944 - Color.alpha(0));
                int i32 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                int i33 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                byte b7 = $$a[7];
                Object[] objArr26 = new Object[1];
                c((short) 89, b7, b7, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha, i32, i33, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(ViewConfiguration.getScrollDefaultDelay() >> 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unknown_error_while_generating_key_hash).substring(0, 35).length() + 34423), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_telkomsel_cash).substring(1, 3).length() + 13, (char) TextUtils.indexOf("", ""), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                    int i34 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int longPressTimeout2 = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    short s = $$a[7];
                    byte b8 = (byte) s;
                    Object[] objArr29 = new Object[1];
                    c(s, b8, b8, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cNormalizeMetaState, i34, longPressTimeout2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                    int iRgb = Color.rgb(0, 0, 0) + 16778971;
                    int i35 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                    Object[] objArr30 = new Object[1];
                    c((short) $$b, (byte) 15, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(pressedStateDuration, iRgb, i35, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
                int i36 = MediaBrowserCompat + 125;
                connect = i36 % 128;
                int i37 = i36 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i39 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i39 == i38) {
            int i40 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
            int i41 = ~((~System.identityHashCode(this)) | 218131490);
            int i42 = i40 + ((19488 | i41) * (-374)) + 250380813 + ((i41 | 218112002) * 374);
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr31[3])[0] = i44 ^ (i44 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
        if (strArr4 != null) {
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i39 / (((i39 - 1) * i39) % 2), 0).show();
        int i45 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int i46 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i47 = ~i46;
        int i48 = i45 + 445073722 + (((~((-186155897) | i47)) | 168296760) * 98) + (((~(i47 | (-26446530))) | (-186155897) | (~(26446529 | i46))) * (-49)) + (((~(i46 | (-186155897))) | (-194743290)) * 49);
        int i49 = (i48 << 13) ^ i48;
        int i50 = i49 ^ (i49 >>> 17);
        ((int[]) objArr32[3])[0] = i50 ^ (i50 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -789201215
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
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 93;
        connect = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i4 = ~layoutDirection;
            if (i3 != 1770575141 + (((~((-277440850) | i4)) | (~((-605290631) | layoutDirection)) | (~(1990159871 | layoutDirection))) * 765) + (((~((-882731480) | i4)) | 277440849) * 1530) + (((~(layoutDirection | (-882731480))) | (~(i4 | 1990159871))) * 765)) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i5 != 550387624 + (((~((-646788069) | iIdentityHashCode)) | 646459716) * 1504) + ((~(iIdentityHashCode | (-328353))) * (-1504)) + 1301788160) {
                throw null;
            }
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        int i8 = ~i7;
        if (i6 != 306314846 + (((~((-157245551) | i8)) | (-1873156882)) * (-602)) + (((~(i7 | (-157245551))) | 5857390 | (~((-1721768722) | i8))) * (-301)) + ((~(i8 | (-1873156882))) * 301)) {
            throw new RuntimeException("-1429458320");
        }
        super.onStart();
        int i9 = connect + 67;
        MediaBrowserCompat = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d6, code lost:
    
        if (r1 != (((444474800 + (((-402690073) | r2) * (-627))) + (((~(2124451899 | r2)) | 408540568) * (-627))) + (((~(r2 | 408540568)) | (~((~r2) | (-2124451900)))) * 627))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d8, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity.MediaBrowserCompat + 7;
        com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity.connect = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e4, code lost:
    
        if ((r10 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ef, code lost:
    
        throw new java.lang.RuntimeException("73625767");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f7, code lost:
    
        throw new java.lang.RuntimeException("-2002030942");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0044, code lost:
    
        if (r1 == ((((-1419356568) + (((-2140908920) | r6) * (-712))) + (((~(r4 | (-1140924440))) | (~(r5 | 2140908919))) * (-712))) + ((1829972023 | r6) * 712))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a4, code lost:
    
        if (r1 == ((((-1339288271) + (((~(r4 | (-1080870369))) | (-250882826)) * (-465))) + (((-1080870369) | (~((-250882826) | r4))) * 930)) + ((r4 | (-6553857)) * 465))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a6, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity = (PaymentOneTimeSuccessActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 115;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        MainActivity.Companion companion = MainActivity.INSTANCE;
        MainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentOneTimeSuccessActivity, null, null, 6);
        paymentOneTimeSuccessActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = connect + 41;
        MediaBrowserCompat = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ User TuitionPaymentFragmentbindingInflater1(PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity) {
        int i = 2 % 2;
        int i2 = connect + 101;
        MediaBrowserCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((ActivityResultContractsPickVisualMediaMediaCapabilities) paymentOneTimeSuccessActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            throw null;
        }
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) paymentOneTimeSuccessActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i3 = connect + 117;
        MediaBrowserCompat = i3 % 128;
        if (i3 % 2 == 0) {
            return userAsBinder;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            paymentOneTimeSuccessActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            paymentOneTimeSuccessActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentOneTimeSuccessActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: setWindowLayoutType
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentOneTimeSuccessActivity.g();
                }
            });
            return;
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            int i2 = MediaBrowserCompat + 47;
            connect = i2 % 128;
            if (i2 % 2 == 0) {
                paymentOneTimeSuccessActivity.IconCompatParcelizer();
                ((GetStatusRecurringPlanResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatusCode();
                throw null;
            }
            paymentOneTimeSuccessActivity.IconCompatParcelizer();
            Integer statusCode = ((GetStatusRecurringPlanResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatusCode();
            if (statusCode != null && statusCode.intValue() == 100) {
                int i3 = connect + 89;
                MediaBrowserCompat = i3 % 128;
                int i4 = i3 % 2;
                if (Intrinsics.areEqual(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).getInterfaceDescriptor, "cross_selling")) {
                    ((ActivityPaymentOneTimeSuccessBinding) ((ViewBinding) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnRegisterAutoDebit.setVisibility(0);
                    return;
                }
            }
            ((ActivityPaymentOneTimeSuccessBinding) ((ViewBinding) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnRegisterAutoDebit.setVisibility(8);
        }
        int i5 = connect + 13;
        MediaBrowserCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:29:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:33:0x0227  */
    /* JADX WARN: Code duplicated, block: B:34:0x022a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0257  */
    /* JADX WARN: Code duplicated, block: B:38:0x0263  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        User user;
        String str2;
        User user2;
        String str3;
        int i = 2 % 2;
        int i2 = connect;
        int i3 = i2 + 87;
        MediaBrowserCompat = i3 % 128;
        int i4 = i3 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            paymentOneTimeSuccessActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i5 = i2 + 5;
            MediaBrowserCompat = i5 % 128;
            int i6 = i5 % 2;
            paymentOneTimeSuccessActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentOneTimeSuccessActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            paymentOneTimeSuccessActivity.IconCompatParcelizer();
            ActivityPaymentOneTimeSuccessBinding activityPaymentOneTimeSuccessBinding = (ActivityPaymentOneTimeSuccessBinding) ((ViewBinding) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            paymentOneTimeSuccessActivity.d = ((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
            paymentOneTimeSuccessActivity.g = ((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b;
            paymentOneTimeSuccessActivity.a = ((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            paymentOneTimeSuccessActivity.notify = ((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            paymentOneTimeSuccessActivity.cancel = String.valueOf(((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            activityPaymentOneTimeSuccessBinding.tvInfoNameValue.setText(String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).asBinder));
            activityPaymentOneTimeSuccessBinding.tvDatePayment.setText(String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).getItem));
            activityPaymentOneTimeSuccessBinding.tvInfoValueNikPaid.setText(String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).RemoteActionCompatParcelizer));
            TextView textView = activityPaymentOneTimeSuccessBinding.tvValueInfoPeriods;
            String str4 = ((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).cancel;
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(" Bulan");
            textView.setText(sb.toString());
            activityPaymentOneTimeSuccessBinding.tvValueAmount.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).a.toString()));
            TextView textView2 = activityPaymentOneTimeSuccessBinding.tvValueFeeMitra;
            Double d = ((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).write;
            Intrinsics.checkNotNull(d);
            textView2.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(MathKt.roundToInt(d.doubleValue() + ((double) (paymentOneTimeSuccessActivity.cancelAll * 200))))));
            TextView textView3 = activityPaymentOneTimeSuccessBinding.tvValueTotalPaid;
            Double d2 = ((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).write;
            Intrinsics.checkNotNull(d2);
            textView3.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(MathKt.roundToInt(d2.doubleValue() + Double.parseDouble(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).a) + ((double) (paymentOneTimeSuccessActivity.cancelAll * 200))))));
            if (Double.parseDouble(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2) == 0.0d) {
                activityPaymentOneTimeSuccessBinding.tvInfoValueProgramPaid.setText("JKK-JKM");
                int i7 = MediaBrowserCompat + 115;
                connect = i7 % 128;
                int i8 = i7 % 2;
            } else {
                activityPaymentOneTimeSuccessBinding.tvInfoValueProgramPaid.setText("JKK-JKM-JHT");
            }
            if (!Intrinsics.areEqual(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).getInterfaceDescriptor, "cross_selling")) {
                return;
            }
            int i9 = connect + 95;
            MediaBrowserCompat = i9 % 128;
            if (i9 % 2 == 0) {
                if (!Intrinsics.areEqual(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).disconnect, "GOPAY")) {
                    if (Intrinsics.areEqual(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).disconnect, "SHOPEEPAY")) {
                        str = "XENDIT";
                    }
                }
                String str5 = str;
                final getImeOptions getimeoptions = (getImeOptions) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                String strValueOf = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).getNotifyChildrenChangedOptions);
                String strValueOf2 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).RemoteActionCompatParcelizer);
                String strValueOf3 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).g);
                user = (User) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (user != null) {
                    str2 = user.b;
                } else {
                    str2 = null;
                }
                String strValueOf4 = String.valueOf(str2);
                String strValueOf5 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).disconnect);
                String strValueOf6 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).cancel);
                String str6 = paymentOneTimeSuccessActivity.INotificationSideChannel;
                user2 = (User) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (user2 != null) {
                    str3 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i10 = connect + 67;
                    MediaBrowserCompat = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    str3 = null;
                }
                InsertJmoPairRequest insertJmoPairRequest = new InsertJmoPairRequest(strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, str5, strValueOf6, str6, String.valueOf(str3));
                Intrinsics.checkNotNullParameter(insertJmoPairRequest, "");
                MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = getimeoptions.asBinder;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getimeoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(insertJmoPairRequest)));
                final Function1 function1 = new Function1() { // from class: onQueryRefine
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return getImeOptions.b(getimeoptions, (BaseItem) obj);
                    }
                };
                logToString logtostring = new logToString() { // from class: onSearchClicked
                    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    private static final byte[] $$c = {39, 27, 2, 54};
                    private static final int $$d = 113;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {58, -103, 118, 14};
                    private static final int $$b = 137;
                    private static int b = 0;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

                    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
                        /*
                            int r8 = r8 + 4
                            byte[] r0 = defpackage.onSearchClicked.$$a
                            int r6 = r6 + 97
                            int r7 = r7 * 3
                            int r1 = 1 - r7
                            byte[] r1 = new byte[r1]
                            r2 = 0
                            int r7 = 0 - r7
                            if (r0 != 0) goto L15
                            r6 = r7
                            r3 = r8
                            r4 = r2
                            goto L2c
                        L15:
                            r3 = r2
                        L16:
                            int r8 = r8 + 1
                            byte r4 = (byte) r6
                            r1[r3] = r4
                            int r4 = r3 + 1
                            if (r3 != r7) goto L27
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            r9[r2] = r6
                            return
                        L27:
                            r3 = r0[r8]
                            r5 = r3
                            r3 = r8
                            r8 = r5
                        L2c:
                            int r6 = r6 + r8
                            r8 = r3
                            r3 = r4
                            goto L16
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.onSearchClicked.c(byte, byte, byte, java.lang.Object[]):void");
                    }

                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        int i12 = 2 % 2;
                        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                        b = i13 % 128;
                        int i14 = i13 % 2;
                        function1.invoke(obj);
                        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                        b = i15 % 128;
                        int i16 = i15 % 2;
                    }

                    private static void a(int i12, int i13, char c, Object[] objArr) throws Throwable {
                        int i14 = 2 % 2;
                        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                        long[] jArr = new long[i13];
                        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i13) {
                            int i15 = $10 + 37;
                            $11 = i15 % 128;
                            if (i15 % 2 == 0) {
                                int i16 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                try {
                                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i12 % i16])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2187, 40 - ExpandableListView.getPackedPositionType(0L), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                                    }
                                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i16), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b4 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 33017), 3011 - Color.alpha(0), 26 - (ViewConfiguration.getWindowTouchSlop() >> 8), 321985076, false, $$e(b4, b4, $$c[2]), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                    }
                                    jArr[i16] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        byte b5 = (byte) 0;
                                        byte b6 = b5;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36505), View.resolveSize(0, 0) + 3376, 'A' - AndroidCharacter.getMirror('0'), -968507904, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } else {
                                int i17 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i12 + i17])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2187, 41 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 841711447, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE});
                                }
                                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i17), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    byte b9 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33017), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3012, 26 - TextUtils.getOffsetAfter("", 0), 321985076, false, $$e(b9, b9, $$c[2]), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i17] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    byte b10 = (byte) 0;
                                    byte b11 = b10;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - KeyEvent.keyCodeFromString("")), KeyEvent.keyCodeFromString("") + 3376, 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -968507904, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                            }
                        }
                        char[] cArr = new char[i13];
                        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        int i18 = $10 + 99;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i13) {
                            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 36505), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3376, View.getDefaultSize(0, 0) + 17, -968507904, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                        }
                        objArr[0] = new String(cArr);
                    }

                    /* JADX WARN: Code duplicated, block: B:100:0x0a2b  */
                    /* JADX WARN: Code duplicated, block: B:106:0x0a48 A[LOOP:22: B:99:0x0a29->B:106:0x0a48, LOOP_END] */
                    /* JADX WARN: Code duplicated, block: B:117:0x0aa3  */
                    /* JADX WARN: Code duplicated, block: B:118:0x0aa5  */
                    /* JADX WARN: Code duplicated, block: B:136:0x0ae3  */
                    /* JADX WARN: Code duplicated, block: B:137:0x0aee  */
                    /* JADX WARN: Code duplicated, block: B:140:0x0b10  */
                    /* JADX WARN: Code duplicated, block: B:141:0x0b28  */
                    /* JADX WARN: Code duplicated, block: B:144:0x0b4c  */
                    /* JADX WARN: Code duplicated, block: B:145:0x0b74  */
                    /* JADX WARN: Code duplicated, block: B:149:0x0c21  */
                    /* JADX WARN: Code duplicated, block: B:152:0x0c30 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                    /* JADX WARN: Code duplicated, block: B:157:0x0d2d A[LOOP:2: B:147:0x0c1e->B:157:0x0d2d, LOOP_END] */
                    /* JADX WARN: Code duplicated, block: B:162:0x0dc9 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                    /* JADX WARN: Code duplicated, block: B:165:0x0e17  */
                    /* JADX WARN: Code duplicated, block: B:167:0x0e45  */
                    /* JADX WARN: Code duplicated, block: B:168:0x0e4b  */
                    /* JADX WARN: Code duplicated, block: B:172:0x0f0f A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                    /* JADX WARN: Code duplicated, block: B:176:0x0ff6  */
                    /* JADX WARN: Code duplicated, block: B:177:0x0ff9  */
                    /* JADX WARN: Code duplicated, block: B:181:0x1046 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                    /* JADX WARN: Code duplicated, block: B:185:0x10d2  */
                    /* JADX WARN: Code duplicated, block: B:186:0x10d8  */
                    /* JADX WARN: Code duplicated, block: B:190:0x1242  */
                    /* JADX WARN: Code duplicated, block: B:193:0x1251 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                    /* JADX WARN: Code duplicated, block: B:194:0x129f  */
                    /* JADX WARN: Code duplicated, block: B:205:0x1332 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                    /* JADX WARN: Code duplicated, block: B:209:0x1405  */
                    /* JADX WARN: Code duplicated, block: B:210:0x1410  */
                    /* JADX WARN: Code duplicated, block: B:212:0x146c  */
                    /* JADX WARN: Code duplicated, block: B:219:0x1488  */
                    /* JADX WARN: Code duplicated, block: B:359:0x293a  */
                    /* JADX WARN: Code duplicated, block: B:361:0x2a0e  */
                    /* JADX WARN: Code duplicated, block: B:362:0x2a1e  */
                    /* JADX WARN: Code duplicated, block: B:364:0x2a5a  */
                    /* JADX WARN: Code duplicated, block: B:375:0x2b8c A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                    /* JADX WARN: Code duplicated, block: B:378:0x2be2  */
                    /* JADX WARN: Code duplicated, block: B:379:0x2bf3  */
                    /* JADX WARN: Code duplicated, block: B:382:0x2c0b A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                    /* JADX WARN: Code duplicated, block: B:413:0x338c  */
                    /* JADX WARN: Code duplicated, block: B:417:0x35f5  */
                    /* JADX WARN: Code duplicated, block: B:419:0x3605  */
                    /* JADX WARN: Code duplicated, block: B:425:0x362f  */
                    /* JADX WARN: Code duplicated, block: B:427:0x3634 A[Catch: all -> 0x3705, IOException -> 0x3707, TRY_LEAVE, TryCatch #10 {IOException -> 0x3707, blocks: (B:426:0x3631, B:427:0x3634), top: B:554:0x3631 }] */
                    /* JADX WARN: Code duplicated, block: B:433:0x3645  */
                    /* JADX WARN: Code duplicated, block: B:440:0x3654  */
                    /* JADX WARN: Code duplicated, block: B:442:0x365d A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:443:0x365f  */
                    /* JADX WARN: Code duplicated, block: B:445:0x3666  */
                    /* JADX WARN: Code duplicated, block: B:447:0x3669  */
                    /* JADX WARN: Code duplicated, block: B:453:0x3695 A[LOOP:12: B:446:0x3667->B:453:0x3695, LOOP_END] */
                    /* JADX WARN: Code duplicated, block: B:457:0x36b0 A[LOOP:11: B:444:0x3664->B:457:0x36b0, LOOP_END] */
                    /* JADX WARN: Code duplicated, block: B:460:0x36c2  */
                    /* JADX WARN: Code duplicated, block: B:466:0x36f4  */
                    /* JADX WARN: Code duplicated, block: B:467:0x36f6  */
                    /* JADX WARN: Code duplicated, block: B:493:0x37cb A[Catch: all -> 0x38b1, TryCatch #8 {all -> 0x38b1, blocks: (B:491:0x37be, B:493:0x37cb, B:494:0x3814), top: B:552:0x37be, outer: #28 }] */
                    /* JADX WARN: Code duplicated, block: B:498:0x38a8 A[Catch: Exception -> 0x38ba, TryCatch #28 {Exception -> 0x38ba, blocks: (B:489:0x375f, B:496:0x3857, B:498:0x38a8, B:501:0x38b2, B:503:0x38b8, B:504:0x38b9, B:491:0x37be, B:493:0x37cb, B:494:0x3814), top: B:578:0x375f, inners: #8 }] */
                    /* JADX WARN: Code duplicated, block: B:499:0x38af  */
                    /* JADX WARN: Code duplicated, block: B:509:0x3908 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                    /* JADX WARN: Code duplicated, block: B:582:0x091d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:584:0x1472 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:586:0x3616 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:592:0x0d31 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:593:0x0d25 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:595:0x12bf A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:608:0x3748 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:609:0x36fc A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:610:0x36fc A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:611:0x3737 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:613:0x3726 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:615:0x36ee A[EDGE_INSN: B:615:0x36ee->B:464:0x36ee BREAK  A[LOOP:9: B:550:0x363b->B:463:0x36da], SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:621:0x36b9 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:622:0x36bb A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:623:0x3691 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:624:0x36a3 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:642:0x0a9d A[EDGE_INSN: B:642:0x0a9d->B:115:0x0a9d BREAK  A[LOOP:19: B:77:0x092c->B:114:0x0a8d], SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:649:0x0a5a A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:650:0x0a6d A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:651:0x0a5c A[EDGE_INSN: B:651:0x0a5c->B:110:0x0a5c BREAK  A[LOOP:22: B:99:0x0a29->B:106:0x0a48], SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:652:0x0a5c A[EDGE_INSN: B:652:0x0a5c->B:110:0x0a5c BREAK  A[LOOP:22: B:99:0x0a29->B:106:0x0a48], SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:653:0x0a54 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:69:0x0757 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                    /* JADX WARN: Code duplicated, block: B:73:0x0916  */
                    /* JADX WARN: Code duplicated, block: B:79:0x0933  */
                    /* JADX WARN: Code duplicated, block: B:81:0x0945  */
                    /* JADX WARN: Code duplicated, block: B:82:0x0947  */
                    /* JADX WARN: Code duplicated, block: B:87:0x0954  */
                    /* JADX WARN: Code duplicated, block: B:89:0x09f9  */
                    /* JADX WARN: Code duplicated, block: B:90:0x09fd  */
                    /* JADX WARN: Code duplicated, block: B:91:0x0a06  */
                    /* JADX WARN: Code duplicated, block: B:93:0x0a0a  */
                    /* JADX WARN: Code duplicated, block: B:95:0x0a10  */
                    /* JADX WARN: Code duplicated, block: B:97:0x0a26  */
                    /* JADX WARN: Code duplicated, block: B:98:0x0a28  */
                    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:220:0x1489
                        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
                        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
                        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
                        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
                        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
                        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
                        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                        */
                    public static java.lang.Object[] b(android.content.Context r52, int r53, int r54, int r55) {
                        /*
                            Method dump skipped, instruction units count: 15058
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.onSearchClicked.b(android.content.Context, int, int, int):java.lang.Object[]");
                    }

                    static {
                        char[] cArr = new char[2154];
                        ByteBuffer.wrap(",è¾<\t\u009c\u009blf\u0094ñ»C\u0012.ò¸[\u000b6\u0096\u0098`aóÛ^\u008b(\u0014»ò\u0005S\u0090:c\u008cÍyXØ+\u0093µ\u001e\u0000þ\u0092N}#È\u0084/å½1\n\u0091\u0098ae\u0099ò¶@\u001f-ÿ»V\b;\u0095\u0095clðÖ]\u0086+\b¸ò\u0006J\u0093 `»Îc[Ö(³¶\u0003\u0003÷\u0091F±³#g\u0094Ç\u00067ûÏlàÞI³©%\u0000\u0096m\u000bÃý:n\u0080ÃÐµ]&´\u0098\u0002\rp±³#p\u0094Û\u00062ûÏlêÞI³¡%\u0011\u0096g\u000bÏýfn\u008fÃàµB&©\u0098\n\rzþÁP9Å¯¶õ(W\u009d¡\u000f\u0000à~UÈÇ '!µô\u0002D\u0090°m]úqHÓ%y³\u0086\u0000ë\u009dWk«±³#f\u0094Ö\u0006\"ûÏlôÞO³¨%J\u0096{\u000bØý&n\u0098\u0014\u008b\u0086H1þ£\u001a^¹ÉÍ{z\u0016Ò\u0080\u000e3u®ßX\u001eË¦fÒ\u0010R\u0083\u0094= ¨Jw~åªR\u000eÀø=Lªe\u0018ÅukãÙP³Í\u000e;ê¨C\u0005-\u0097\u0014\u0005\u0096²v ÙÝuJ\u0012ø¨\u0095\u0011\u0003ì°\u0094-4ÛÁH}å\u001c\u0093°\u0000h¾ø+\u008cØ<vôãn\u0090\u0003\u000e¿»\u001e±î#l\u0094\u008c\u0006#û\u008flèÞR³ë%\u0016\u0096n\u000bÎý;n\u0087ÃæµJ&\u0092\u0098\u0002\rvþÆP\u000eÅ\u0094¶ù(E\u009dç±³#p\u0094Û\u00062û\u0094lâÞK³ê%\b\u0096b\u000bÈýfn\u0084ÃæµL&£\u0098\u000e\r=þÁP>±þ#j\u0094Å\u0006/û\u008flÿ9\u0016«Õ\u001c~\u008e\u0097s1äGVî;O\u00ad£\u001eÇ\u0083auÃæ#KO=æ®\u001d\u0010\u009f\u0085ûv:Ø\u009aM0>_ æ\u0015]\u0087²hÑÝqO\u00880/¥U\u0017÷¯:=ù\u008aR\u0018»å\u001drkÀÂ\u00adc;\u008f\u0088ë\u0015Mãïp\u000fÝc«Ê81\u0086³\u0013×à\u0016N¨Û\u000b¨q6ÏeO÷\u008c@'ÒÎ/h¸\u001e\n·g\u0016ñôB\u009eß4)\u009aºx\u0017\u001aa°ò_LõÙ\u0082*;\u0084û\u0011Ab\u001bü¸IFÛø4É\u00815\u0013Ê±³#g\u0094Ç\u00067ûÏléÞC³¨%\u0011\u0096l\u000bßý,n\u009bÃû¦\u00834\u0001\u0083á\u0011Nìø{\u0083É'¤Ì2'\u0081\u000e\u001c¨êWyñ±ò#f\u0094Ã\u00062û\u0085l©ÞH³ %\u0010ß~M¾ú\u001dhã\u0095N\u0002e°\u008dÝaKÅø£e\u0014\u0093ý\u0000V\u00ad6Û\u0086HmöÒ\u009b\u0096\t\u0002¾«,PÑ÷F\u0085Æ\u0007T\u0085ãeqØ\u008c{\u001b\u0001©«ÄYRîá\u0096|m\u008aÍ\u0019`´\bÂ²QBïäz\u0099\u0089/'Í²kÁ\u001b_\u00ad\u0089y\u001bä¬N>ºøwjýÝKO©²\u0012%o\u0097Éúpl\u008cßéBB´ü'\u0011\u008apü\u009bo2Ñ\u0092Dê·\\\u0019\u00ad\u008cEÿkaÝÔ;FÁ©æ\u001c@\u008e©ñ\u0006d[ÖÂ96«\u0092\u001e'\u0081kóßf5È\u0098;ø®L\u0010º\u0083\u0002¸\u0082*\b\u009d¾\u000f\\òçe\u009a×<º\u0085,y\u009f\u001c\u0002·ô\tgäÊ\u0085¼n/Ç\u0091g\u0004\u001f÷©YXÌ°¿\u009e!(\u0094Î\u00064é\u0013\\µÎ\\±ó$®\u00967yÃëg^ÒÁ\u009a³*&À\u0088m{\u0007î¹±ì#f\u0094Ð\u00062û\u0089lôÞR³ë%\u0017\u0096r\u000bÙýgn\u008aÃëµ\u0000&©\u0098\t\rqþÇP6ÅÞ¶å(Y\u009dû\u000f\u0017àjUÓ\u0091\u001f\u0003\u0095´#&ÁÛzL\u0007þ¡\u0093\u0018\u0005ä¶\u0081+*Ý\u0094Nyã\u0018\u0095ó\u0006Z¸ú-\u0082Þ4pÅå-\u0096\u0016\bª½\b/ëÀ\u0089u*âepïÇYU»¨\u0000?}\u008dÛàbv\u009eÅûXP®î=\u0003\u0090bæ\u0089u Ë\u0080^ø\u00adN\u0003¿\u0096Wål{ÐÎr\\\u0090³ñ\u0006P£p1ú\u0086L\u0014®é\u0015~hÌÎ¡w7\u008b\u0084î\u0019Eïû|\u0016Ñw§\u009c45\u008a\u0095\u001fíì[Bª×B¤y:Å\u008fg\u001d\u0085òéGE\"\u0098°\u0013\u0007¿\u0095Kháÿ\u0093±³#s\u0094Ð\u0006.û\u0083l¨ÞK³ª%\u0000\u0096~\u000bÆý,n\u009b±ê#a\u0094Í\u00069û\u0087lòÞC³¶%\u0010\u0018Ñ\u008a\u0012=¹¯PRöÅ\u0080w)\u001a\u0088\u008c`?\u001b¢©TFÇïj\u009a\u001c#\u008fÝ1e¤^W§ùZlü\u001f\u0091\u0081;4À¦eITü«nB\u0011é\u0084\u008969ÙÒKAþòa\u0085\u00131\u0086Ô(`Û\u0016NéðLcè\u0016\u009a±³#u\u0094Ç\u0006/û\u0084lèÞT³ê%\b\u0096b\u000bÈý\u007fnÜÃ µF&º\u0098C\rrþÇP5Å\u0099¶ø(\u0018\u009d¥\u000f\u0006àrU×Ç8¸\u008a-æ\u009f\u0010pªâ\u0015W\u008dÈæºN/·\u0081\u0014r(çÖY+§\u00895O\u0082ý\u0010\u0015í¾zÒÈn¥Ð32\u0080X\u001dòëExæÕ\u009a£|0\u0080\u008ey\u001bAèÿF\bÓ¥ À>|\u008b\u0080\u0019=öDCòÑM®µ;Ì\u0089jf\u0083ô)A®ÞË¬59\u0089\u00972±³#p\u0094Û\u00062û\u0094lâÞK³ê%\b\u0096b\u000bÈý\u007fnÜÃ µM&¡\u0098\u0003\rfþÖP\u000eÅ\u0091¶þ(R\u009d¹\u000f+àrUÔÇ-¸\u009d-í\u009fXp¼â\u001fW\u0086È¯ºB/°\u0081\u0017r(çÖY+±³#f\u0094Ö\u0006\"ûÏlîÞH³¬%\u0010\u0096$\u000bÃý'n\u0081Ãûµ\u0000&®\u0098\u0000\r|þÇP5Å\u0083¶ò(D\u009d£\u000f\u001dàxUßÇw¸\u008a-ü±Û#f\u0094Ì\u00068û\u008dlèÞR³¬%\u000b\u0096eTtÆðqTã²\u001e\u0012\u0089m;Õ±ÿ#k\u0094Ð\u0006.û\u008dlîÞS³¨\u0010\u000e\u0082\u008c5l§ÑZrÍ\b\u007f¢\u0012P\u0084ç7\u009fªd\\ÍÏmb\u0019\u0014§\u0087N9éeé÷b@ÎÒ:/Û¸²\nUÉÑ[Lìæ~\u000e\u0083¸\u0014Ä¦oñ\tc\u0094Ô>FÖ»`,\u001c\u009e·óheîÖÁKn±û#f\u0094Ì\u0006$û\u0092lîÞE³\u009a%\u001c\u00963\u000b\u009cý\u0016nÞÃ»ãîqlÆ\u008cT1©\u0092>è\u008cBá°w\u0007Ä\u007fY\u0084¯$<\u0087\u0091ëçKt¡Ã§Q/æ\u0081±ù#n\u0094×\u0006-û\u0081lóÞI³·±Ý#s\u0094Ò\u0006aû²lòÞH³±%\r\u0096f\u000bÏýin\u008eÃàµ\\&í\u0098/\r{þÀP>Å\u009d¶ò±Ý#m\u0094Æ\u00063û\u008flîÞB³å%7\u0096O\u000báýin\u008aÃúµG&¡\u0098\u0018\r3þÔP>Å\u0082¶·(N\u009dí\u000fB÷HeøÒS@¦½\u001a*{\u0098×õpc¢ÐÚMt»ü(\u001f\u0085oóÒ`4Þ\u008dK¦¸A\u0016«\u0083\u0017ð\"nÛÛxI×¦Ñ\u0013\u0019\u0081ø±î#l\u0094\u008c\u0006)û\u0081lõÞB³²%\u0005\u0096y\u000bÏ\u009dG\u000fÐ¸r*\u0099×:@Ròé\u009f\u0011ø8j³Ý\u001fOë²\n%c\u0003±\u0091=&\u0093´}I×Þ\u00ad±î#l\u0094\u008c\u00061û\u0092lèÞB³°%\u0007\u0096\u007f\u000b\u0084ý+n\u009aÃîµ@&©\u008ab\u0018à¯\u0000=¦À\tWyåÄ\u0088,\u001e\u0084\u00ad©0WÆ U\tøvôÓ±î#l\u0094\u008c\u00062û\u0085läÞS³·%\u0001{'±î#l\u0094\u008c\u0006#û\u0095lîÞJ³¡%J\u0096{\u000bØý&n\u008cÃúµM&¹ü\u0089n\u0005Ù½K^¶Ì!\u008c\u0093mþ\u0080±î#l\u0094\u008c\u0006#û\u0095lîÞJ³¡%J\u0096m\u000bÃý'n\u008fÃêµ\\&½\u0098\u001e\rzþÜP%n\u007füâKHÙ $\u0016³j\u0001Álnú\u0093IëÔE\"â±\u000b\u001cnjÄù,G\u009aÒþ!U±û#f\u0094Ì\u0006$û\u0092lîÞE³\u009a%\u001c\u00963\u000b\u009cýfn\u009bÃëµE&\u0092\u0098\u0014\r+þ\u0084P~Å\u0097¶ò(X\u009d°\u000f\u0006àrUÙÇ\u0006¸\u0080-§\u009f\b\u0002f\u0090û'Qµ¹H\u000fßsmØ\u0000w\u0096\u009e%ù¸XN³Ý\u0019pw\u0006ì\u0095#+\u0095¾åM\u0000ã«v\b\u0005d\u009bÎ.:¼\u0080Så±û#f\u0094Ì\u0006$û\u0092lîÞE³ê%\u0012\u0096i\u000bÅý1nÐÃ¹µ^&â\u0098\u001a\rqþÝP)ÅÈ¶¡(FK¤Ù3n\u0092üy\u0001Ó\u0096½$VIéß_l?ñª\u0007q\u0094Ç9¸O\u001eÜübV÷\u0013\u0004\u0095ª6?\u0099LçÒ\u000egïõE\u001a!¯\u0097=oBÄ×\u009fe\u0019\u008aº\u0018\u0015±î#l\u0094\u008c\u0006#û\u008flèÞR³©%\u000b\u0096j\u000bÎý,n\u009a±î#l\u0094\u008c\u0006#û\u008flèÞR³¬%\t\u0096j\u000bÍý,nÆÃíµ[&¤\u0098\u0000\rwþ\u009cP7Å\u0099¶ù(Q\u009d°\u000f\u0006àkUÈÇ0¸\u0096-ë\u008ef\u001cÖ«}9\u0088Ä4SUáù\u008cS\u001a§©\u00884'±î#l\u0094\u008c\u0006#û\u0095lîÞJ³¡%J\u0096o\u000bÃý:n\u0098ÃãµO&´\u0098B\rzþÖ±è#f\u0094Ñ\u00065ûÍ\u008d|\u001fä¨B:¼ÇGP}âÙ\u008f/\u0019Ãªó7FÁ\u00adR\u0014ÿ+\u0089×\u001a6¤\u008a1êÂHx·ê<]\u0095Ïn2\u0094¥µ\u0017\u000bz±ìS_0Â\u00994}§Ù\n°|\rïä\u0001\u0089\u0093\u0002$«¶PKªÜ\u0090n$\u0003\u008f\u0095f&\u000e»¥MHÞÓs\u0088\u0005+\u0096Ä(m½\u0005N·dîöeAÌÓ7.Í¹÷\u000bCfèð\u000bCkÞÍ(\u0015»\u008f\u0016é`Có½M\u0006Ød+È\u0087f\u0015ä¢\u00040¢Í\rZ}èÀ\u0085(\u0013\u0080 \u00ad=CË¯X\u0004õu\u0083É\u0010,®\u0080;µÈKf¼ó\u0015\u0080j\u001eÚ±î#l\u0094\u008c\u0006#û\u008flèÞR³ë%\u0015\u0096n\u000bÇý<nÆÃîµX&©\u00983\r}þÓP<Å\u0095±î#l\u0094\u008c\u0006.û\u0084lêÞ\b³§%\u0011\u0096b\u000bÆý-nÆÃéµG&£\u0098\u000b\rvþÀP!Å\u0082¶þ(X\u009d¡%&·¤\u0000D\u0092ùoZø J\u008a'x±Ï\u0002·\u009fLiãúUW.!\u008a²a\f\u008a\u0099½j\u0013Ä÷Q_\":¼\u008c\tm\u009bÎtºÁ\u001cSå=þ¯|\u0018\u009c\u008a\"w\u0089àäRB?°©\u0019\u001a5\u0087Øq,â\u0091Oó9Zªó\u0014\u001a\u0081jrÌÜ&I\u0085:õ¤V\u0011·\u0083\rleÙÞ±î#l\u0094\u008c\u00062û\u0099lôÞR³ %\t\u0096T\u000bÏý1n\u009cÃ¡µL&¸\u0098\u0005\r\u007fþÖP\u007fÅ\u0096¶þ(X\u009d²\u000f\u0011àiUÊÇ+¸\u0091-ñ\u009fJ±î#l\u0094\u008c\u00067û\u0085léÞB³ª%\u0016\u0096%\u000bÈý<n\u0081ÃãµJ&ã\u0098\n\rzþÜP6Å\u0095¶å(F\u009d§\u000f\u001dàuUÎ±î#l\u0094\u008c\u00067û\u0085léÞB³ª%\u0016\u0096T\u000bÎý%n\u0083Ãâµ\u0000&¯\u0098\u0019\rzþÞP5ÅÞ¶ñ(_\u009d»\u000f\u0013à~UÈÇ)¸\u008a-ö\u009fPp©±´ÃìQ\u007f±¦±µ±³#g\u0094Ç\u00067ûÏlöÞC³¨%\u0011\u0096T\u000bÚý n\u0098Ãê±³#g\u0094Ç\u00067ûÏlôÞI³¦%\u000f\u0096n\u000bÞýfn\u008aÃîµ]&¨\u0098\u000e\rrþÜP5Å¯¶ð(S\u009d»\u000f\rà\u007f\u0099\u0011\u000bÅ¼e.\u0095ÓmDVöë\u009b\u0004\r\u00ad¾Ì#|ÕÄF-ëH\u009dâ\u000e\u0016°ª½:/î\u0098N\n¾÷F`}ÒÀ¿/)\u0086\u009aç\u0007Wñïb\u0010Ïc¹Ê*1\u0094\u0081±³#p\u0094Û\u00062ûÏlöÞC³¨%\u0011\u0096T\u000bÞý;n\u0089ÃìµKù\u008bkHÜãN\n³¬$Ú\u0096sûÒm0ÞZCðµ^&¼\u008bÞýtn\u0096Ð\u000bEF¶ë\u0018\u0005\u008d¤þÀ`mÕ²G(¨F\u001dà\u008f\u0014ð§eø×w8\u0080ª)\u001f®\u0080\u0094òjg\u0097NTÜ\u0080k ùÐ\u0004(\u0093\u0002!²LVÚÜi\u008bô=\u0002Ý}@ï\u0094X4ÊÄ7< \u0016\u0012¦\u007fBéÈZ\u008cÇ01×¢~\u00865\u0014á£A1±ÌI[réÏ\u0084 \u0012\u0089¡è<XÊàY\fôz\u0082Ü\u0011-¯\u0085:ùÉPg²ò\u0004\u0081u±³#p\u0094Û\u00062û\u0094lâÞK³ê%\b\u0096b\u000bÈýfn\u0084ÃæµL&¯\u0098\u001f\rgþÔP>Å\u009c¶ó(S\u009d§\u000f+àqUÔÇ0¸Ö-ì\u009fQ±³#g\u0094Ç\u00067ûÏlåÞU³±%\u0005\u0096h\u000bÉý,àEr\u0091Å1WÁª9=\u0013\u008f£âGtõÇ\u0084Z.¬Ð±³#g\u0094Ç\u00067ûÏlåÞU³±%\t\u0096n\u000bÍý'ø¢jvÝÖO&²Þ%ô\u0097Dú l\u001aßhBÒ´=:Û¨\u000f\u001f¯\u008d_p§ç\u008dU=8Ù®z\u001d\u000e\u0080±vFã,qøÆXT¨©P>z\u008cÊá.w\u008bÄóYT¯¿<\u0007\u0091s±³#g\u0094Ç\u00067ûÏlåÞU³±%;\u0096b\u000bÇý,±³#g\u0094Ã\u00065û\u0081l¨ÞB³ª%\u0013\u0096e\u000bÆý&n\u0089Ãëµ]&â\u0098B\rkþÐP~Å\u0092¶ä(B\u009d¾±³#n\u0094Ì\u00065ûÏlðÞO³«%\u0000\u0096d\u000bÝý:nÇÃÍµ]&¹\u0098?\r{þÓP#Å\u0095¶ó(p\u009dº\u000f\u0018à\u007fUßÇ+±³#s\u0094Ð\u0006.û\u0083l¨ÞO³ª%\u0014\u0096d\u000bØý=n\u009bGBÕ\u008bb*ð\u008f\r4±³#s\u0094Ð\u0006.û\u0083l¨ÞU³ %\b\u0096m\u000b\u0085ý$n\u0089Ãÿµ]±û#q\u0094Ã\u0006-û\u008clèÞE³ë%\u0003\u0096d\u000bÆý-n\u008eÃæµ]&¥\u0098B\r`þÝGWÕÍbgð¡\r\u000b\u009ae(ÒE=Ó¡`ßýy\u000bÀ\u0098<5G±³#f\u0094Ö\u0006\"ûÏlêÞC³¡%\r\u0096j\u000bõý*n\u0087ÃëµK&®\u0098\u001f\r=þÊP<Å\u009c±þ#o\u0094×\u0006$û\u0093lóÞG³¦%\u000f\u0096x\fè\u009e=)\u008d»yF\u0094Ñ±c\u0012\u000eë\u0098Q+$¶\u0082±³#g\u0094Ã\u00065û\u0081l¨ÞB³ª%\u0013\u0096e\u000bÆý&n\u0089Ãëµ]&â\u0098B\rwþÂP~Å\u0091¶ç(F\u009d¦\u000fZàcU×Ç5±³#s\u0094Ð\u0006.û\u0083l¨ÞE³µ%\u0011\u0096b\u000bÄý/n\u0087r\u008fà8W\u009aÅq8Ò¯º\u001d\u0001pù±³#g\u0094Ã\u00065û\u0081l¨ÞK³¬%\u0017\u0096h\u000b\u0085ý9n\u009aÃàµH&¤\u0098\u0000\rvþÁP~Å\u0093¶â(D\u009dú\u000fDà4UÙÇ6¸\u0095-±\u009fSp´â\u001fW\u0091ÈíºW/©\u0081\u0015rrç\u008bY)Ê\u008e¿ç\u0011\\\u0082¡t\u0002ék".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -3987624065654840573L;
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$e(short r6, int r7, int r8) {
                        /*
                            int r8 = r8 * 3
                            int r8 = r8 + 109
                            int r7 = r7 * 2
                            int r7 = r7 + 4
                            byte[] r0 = defpackage.onSearchClicked.$$c
                            int r6 = r6 * 3
                            int r1 = r6 + 1
                            byte[] r1 = new byte[r1]
                            r2 = 0
                            if (r0 != 0) goto L16
                            r3 = r6
                            r4 = r2
                            goto L29
                        L16:
                            r3 = r2
                        L17:
                            byte r4 = (byte) r8
                            r1[r3] = r4
                            int r4 = r3 + 1
                            if (r3 != r6) goto L24
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L24:
                            r3 = r0[r7]
                            r5 = r3
                            r3 = r8
                            r8 = r5
                        L29:
                            int r8 = -r8
                            int r7 = r7 + 1
                            int r8 = r8 + r3
                            r3 = r4
                            goto L17
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.onSearchClicked.$$e(short, int, int):java.lang.String");
                    }
                };
                final Function1 function2 = new Function1() { // from class: onVoiceClicked
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return getImeOptions.TuitionPaymentFragmentbindingInflater1(getimeoptions, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onTextFocusChanged
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                getimeoptions.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            int i12 = 91 / 0;
            if (!Intrinsics.areEqual(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).disconnect, "GOPAY")) {
                if (Intrinsics.areEqual(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).disconnect, "SHOPEEPAY")) {
                    str = "XENDIT";
                }
            }
            String str7 = str;
            final getImeOptions getimeoptions2 = (getImeOptions) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String strValueOf7 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).getNotifyChildrenChangedOptions);
            String strValueOf8 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).RemoteActionCompatParcelizer);
            String strValueOf9 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).g);
            user = (User) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (user != null) {
                str2 = user.b;
            } else {
                str2 = null;
            }
            String strValueOf10 = String.valueOf(str2);
            String strValueOf11 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).disconnect);
            String strValueOf12 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).cancel);
            String str8 = paymentOneTimeSuccessActivity.INotificationSideChannel;
            user2 = (User) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (user2 != null) {
                str3 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i13 = connect + 67;
                MediaBrowserCompat = i13 % 128;
                int i14 = i13 % 2;
            } else {
                str3 = null;
            }
            InsertJmoPairRequest insertJmoPairRequest2 = new InsertJmoPairRequest(strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, str7, strValueOf12, str8, String.valueOf(str3));
            Intrinsics.checkNotNullParameter(insertJmoPairRequest2, "");
            MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData2 = getimeoptions2.asBinder;
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getimeoptions2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(insertJmoPairRequest2)));
            final Function1 function3 = new Function1() { // from class: onQueryRefine
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getImeOptions.b(getimeoptions2, (BaseItem) obj);
                }
            };
            logToString logtostring2 = new logToString() { // from class: onSearchClicked
                private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                private static final byte[] $$c = {39, 27, 2, 54};
                private static final int $$d = 113;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {58, -103, 118, 14};
                private static final int $$b = 137;
                private static int b = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    */
                private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
                    /*
                        int r8 = r8 + 4
                        byte[] r0 = defpackage.onSearchClicked.$$a
                        int r6 = r6 + 97
                        int r7 = r7 * 3
                        int r1 = 1 - r7
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        int r7 = 0 - r7
                        if (r0 != 0) goto L15
                        r6 = r7
                        r3 = r8
                        r4 = r2
                        goto L2c
                    L15:
                        r3 = r2
                    L16:
                        int r8 = r8 + 1
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r7) goto L27
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L27:
                        r3 = r0[r8]
                        r5 = r3
                        r3 = r8
                        r8 = r5
                    L2c:
                        int r6 = r6 + r8
                        r8 = r3
                        r3 = r4
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.onSearchClicked.c(byte, byte, byte, java.lang.Object[]):void");
                }

                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    int i15 = 2 % 2;
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                    b = i16 % 128;
                    int i17 = i16 % 2;
                    function3.invoke(obj);
                    int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                    b = i18 % 128;
                    int i19 = i18 % 2;
                }

                private static void a(int i15, int i16, char c, Object[] objArr) throws Throwable {
                    int i17 = 2 % 2;
                    lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                    long[] jArr = new long[i16];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i16) {
                        int i18 = $10 + 37;
                        $11 = i18 % 128;
                        if (i18 % 2 == 0) {
                            int i19 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            try {
                                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i15 % i19])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2187, 40 - ExpandableListView.getPackedPositionType(0L), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i19), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 33017), 3011 - Color.alpha(0), 26 - (ViewConfiguration.getWindowTouchSlop() >> 8), 321985076, false, $$e(b4, b4, $$c[2]), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i19] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36505), View.resolveSize(0, 0) + 3376, 'A' - AndroidCharacter.getMirror('0'), -968507904, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            int i110 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i15 + i110])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2187, 41 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 841711447, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i110), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b9 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33017), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3012, 26 - TextUtils.getOffsetAfter("", 0), 321985076, false, $$e(b9, b9, $$c[2]), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i110] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                            Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - KeyEvent.keyCodeFromString("")), KeyEvent.keyCodeFromString("") + 3376, 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -968507904, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                        }
                    }
                    char[] cArr = new char[i16];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    int i111 = $10 + 99;
                    $11 = i111 % 128;
                    int i112 = i111 % 2;
                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i16) {
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 36505), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3376, View.getDefaultSize(0, 0) + 17, -968507904, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                    }
                    objArr[0] = new String(cArr);
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0a2b  */
                /* JADX WARN: Code duplicated, block: B:106:0x0a48 A[LOOP:22: B:99:0x0a29->B:106:0x0a48, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:117:0x0aa3  */
                /* JADX WARN: Code duplicated, block: B:118:0x0aa5  */
                /* JADX WARN: Code duplicated, block: B:136:0x0ae3  */
                /* JADX WARN: Code duplicated, block: B:137:0x0aee  */
                /* JADX WARN: Code duplicated, block: B:140:0x0b10  */
                /* JADX WARN: Code duplicated, block: B:141:0x0b28  */
                /* JADX WARN: Code duplicated, block: B:144:0x0b4c  */
                /* JADX WARN: Code duplicated, block: B:145:0x0b74  */
                /* JADX WARN: Code duplicated, block: B:149:0x0c21  */
                /* JADX WARN: Code duplicated, block: B:152:0x0c30 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:157:0x0d2d A[LOOP:2: B:147:0x0c1e->B:157:0x0d2d, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:162:0x0dc9 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:165:0x0e17  */
                /* JADX WARN: Code duplicated, block: B:167:0x0e45  */
                /* JADX WARN: Code duplicated, block: B:168:0x0e4b  */
                /* JADX WARN: Code duplicated, block: B:172:0x0f0f A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:176:0x0ff6  */
                /* JADX WARN: Code duplicated, block: B:177:0x0ff9  */
                /* JADX WARN: Code duplicated, block: B:181:0x1046 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:185:0x10d2  */
                /* JADX WARN: Code duplicated, block: B:186:0x10d8  */
                /* JADX WARN: Code duplicated, block: B:190:0x1242  */
                /* JADX WARN: Code duplicated, block: B:193:0x1251 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:194:0x129f  */
                /* JADX WARN: Code duplicated, block: B:205:0x1332 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:209:0x1405  */
                /* JADX WARN: Code duplicated, block: B:210:0x1410  */
                /* JADX WARN: Code duplicated, block: B:212:0x146c  */
                /* JADX WARN: Code duplicated, block: B:219:0x1488  */
                /* JADX WARN: Code duplicated, block: B:359:0x293a  */
                /* JADX WARN: Code duplicated, block: B:361:0x2a0e  */
                /* JADX WARN: Code duplicated, block: B:362:0x2a1e  */
                /* JADX WARN: Code duplicated, block: B:364:0x2a5a  */
                /* JADX WARN: Code duplicated, block: B:375:0x2b8c A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:378:0x2be2  */
                /* JADX WARN: Code duplicated, block: B:379:0x2bf3  */
                /* JADX WARN: Code duplicated, block: B:382:0x2c0b A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:413:0x338c  */
                /* JADX WARN: Code duplicated, block: B:417:0x35f5  */
                /* JADX WARN: Code duplicated, block: B:419:0x3605  */
                /* JADX WARN: Code duplicated, block: B:425:0x362f  */
                /* JADX WARN: Code duplicated, block: B:427:0x3634 A[Catch: all -> 0x3705, IOException -> 0x3707, TRY_LEAVE, TryCatch #10 {IOException -> 0x3707, blocks: (B:426:0x3631, B:427:0x3634), top: B:554:0x3631 }] */
                /* JADX WARN: Code duplicated, block: B:433:0x3645  */
                /* JADX WARN: Code duplicated, block: B:440:0x3654  */
                /* JADX WARN: Code duplicated, block: B:442:0x365d A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:443:0x365f  */
                /* JADX WARN: Code duplicated, block: B:445:0x3666  */
                /* JADX WARN: Code duplicated, block: B:447:0x3669  */
                /* JADX WARN: Code duplicated, block: B:453:0x3695 A[LOOP:12: B:446:0x3667->B:453:0x3695, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:457:0x36b0 A[LOOP:11: B:444:0x3664->B:457:0x36b0, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:460:0x36c2  */
                /* JADX WARN: Code duplicated, block: B:466:0x36f4  */
                /* JADX WARN: Code duplicated, block: B:467:0x36f6  */
                /* JADX WARN: Code duplicated, block: B:493:0x37cb A[Catch: all -> 0x38b1, TryCatch #8 {all -> 0x38b1, blocks: (B:491:0x37be, B:493:0x37cb, B:494:0x3814), top: B:552:0x37be, outer: #28 }] */
                /* JADX WARN: Code duplicated, block: B:498:0x38a8 A[Catch: Exception -> 0x38ba, TryCatch #28 {Exception -> 0x38ba, blocks: (B:489:0x375f, B:496:0x3857, B:498:0x38a8, B:501:0x38b2, B:503:0x38b8, B:504:0x38b9, B:491:0x37be, B:493:0x37cb, B:494:0x3814), top: B:578:0x375f, inners: #8 }] */
                /* JADX WARN: Code duplicated, block: B:499:0x38af  */
                /* JADX WARN: Code duplicated, block: B:509:0x3908 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:582:0x091d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:584:0x1472 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:586:0x3616 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:592:0x0d31 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:593:0x0d25 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:595:0x12bf A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:608:0x3748 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:609:0x36fc A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:610:0x36fc A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:611:0x3737 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:613:0x3726 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:615:0x36ee A[EDGE_INSN: B:615:0x36ee->B:464:0x36ee BREAK  A[LOOP:9: B:550:0x363b->B:463:0x36da], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:621:0x36b9 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:622:0x36bb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:623:0x3691 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:624:0x36a3 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:642:0x0a9d A[EDGE_INSN: B:642:0x0a9d->B:115:0x0a9d BREAK  A[LOOP:19: B:77:0x092c->B:114:0x0a8d], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:649:0x0a5a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:650:0x0a6d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:651:0x0a5c A[EDGE_INSN: B:651:0x0a5c->B:110:0x0a5c BREAK  A[LOOP:22: B:99:0x0a29->B:106:0x0a48], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:652:0x0a5c A[EDGE_INSN: B:652:0x0a5c->B:110:0x0a5c BREAK  A[LOOP:22: B:99:0x0a29->B:106:0x0a48], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:653:0x0a54 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:69:0x0757 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:73:0x0916  */
                /* JADX WARN: Code duplicated, block: B:79:0x0933  */
                /* JADX WARN: Code duplicated, block: B:81:0x0945  */
                /* JADX WARN: Code duplicated, block: B:82:0x0947  */
                /* JADX WARN: Code duplicated, block: B:87:0x0954  */
                /* JADX WARN: Code duplicated, block: B:89:0x09f9  */
                /* JADX WARN: Code duplicated, block: B:90:0x09fd  */
                /* JADX WARN: Code duplicated, block: B:91:0x0a06  */
                /* JADX WARN: Code duplicated, block: B:93:0x0a0a  */
                /* JADX WARN: Code duplicated, block: B:95:0x0a10  */
                /* JADX WARN: Code duplicated, block: B:97:0x0a26  */
                /* JADX WARN: Code duplicated, block: B:98:0x0a28  */
                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:220:0x1489
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
                    */
                public static java.lang.Object[] b(android.content.Context r52, int r53, int r54, int r55) {
                    /*
                        Method dump skipped, instruction units count: 15058
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.onSearchClicked.b(android.content.Context, int, int, int):java.lang.Object[]");
                }

                static {
                    char[] cArr = new char[2154];
                    ByteBuffer.wrap(",è¾<\t\u009c\u009blf\u0094ñ»C\u0012.ò¸[\u000b6\u0096\u0098`aóÛ^\u008b(\u0014»ò\u0005S\u0090:c\u008cÍyXØ+\u0093µ\u001e\u0000þ\u0092N}#È\u0084/å½1\n\u0091\u0098ae\u0099ò¶@\u001f-ÿ»V\b;\u0095\u0095clðÖ]\u0086+\b¸ò\u0006J\u0093 `»Îc[Ö(³¶\u0003\u0003÷\u0091F±³#g\u0094Ç\u00067ûÏlàÞI³©%\u0000\u0096m\u000bÃý:n\u0080ÃÐµ]&´\u0098\u0002\rp±³#p\u0094Û\u00062ûÏlêÞI³¡%\u0011\u0096g\u000bÏýfn\u008fÃàµB&©\u0098\n\rzþÁP9Å¯¶õ(W\u009d¡\u000f\u0000à~UÈÇ '!µô\u0002D\u0090°m]úqHÓ%y³\u0086\u0000ë\u009dWk«±³#f\u0094Ö\u0006\"ûÏlôÞO³¨%J\u0096{\u000bØý&n\u0098\u0014\u008b\u0086H1þ£\u001a^¹ÉÍ{z\u0016Ò\u0080\u000e3u®ßX\u001eË¦fÒ\u0010R\u0083\u0094= ¨Jw~åªR\u000eÀø=Lªe\u0018ÅukãÙP³Í\u000e;ê¨C\u0005-\u0097\u0014\u0005\u0096²v ÙÝuJ\u0012ø¨\u0095\u0011\u0003ì°\u0094-4ÛÁH}å\u001c\u0093°\u0000h¾ø+\u008cØ<vôãn\u0090\u0003\u000e¿»\u001e±î#l\u0094\u008c\u0006#û\u008flèÞR³ë%\u0016\u0096n\u000bÎý;n\u0087ÃæµJ&\u0092\u0098\u0002\rvþÆP\u000eÅ\u0094¶ù(E\u009dç±³#p\u0094Û\u00062û\u0094lâÞK³ê%\b\u0096b\u000bÈýfn\u0084ÃæµL&£\u0098\u000e\r=þÁP>±þ#j\u0094Å\u0006/û\u008flÿ9\u0016«Õ\u001c~\u008e\u0097s1äGVî;O\u00ad£\u001eÇ\u0083auÃæ#KO=æ®\u001d\u0010\u009f\u0085ûv:Ø\u009aM0>_ æ\u0015]\u0087²hÑÝqO\u00880/¥U\u0017÷¯:=ù\u008aR\u0018»å\u001drkÀÂ\u00adc;\u008f\u0088ë\u0015Mãïp\u000fÝc«Ê81\u0086³\u0013×à\u0016N¨Û\u000b¨q6ÏeO÷\u008c@'ÒÎ/h¸\u001e\n·g\u0016ñôB\u009eß4)\u009aºx\u0017\u001aa°ò_LõÙ\u0082*;\u0084û\u0011Ab\u001bü¸IFÛø4É\u00815\u0013Ê±³#g\u0094Ç\u00067ûÏléÞC³¨%\u0011\u0096l\u000bßý,n\u009bÃû¦\u00834\u0001\u0083á\u0011Nìø{\u0083É'¤Ì2'\u0081\u000e\u001c¨êWyñ±ò#f\u0094Ã\u00062û\u0085l©ÞH³ %\u0010ß~M¾ú\u001dhã\u0095N\u0002e°\u008dÝaKÅø£e\u0014\u0093ý\u0000V\u00ad6Û\u0086HmöÒ\u009b\u0096\t\u0002¾«,PÑ÷F\u0085Æ\u0007T\u0085ãeqØ\u008c{\u001b\u0001©«ÄYRîá\u0096|m\u008aÍ\u0019`´\bÂ²QBïäz\u0099\u0089/'Í²kÁ\u001b_\u00ad\u0089y\u001bä¬N>ºøwjýÝKO©²\u0012%o\u0097Éúpl\u008cßéBB´ü'\u0011\u008apü\u009bo2Ñ\u0092Dê·\\\u0019\u00ad\u008cEÿkaÝÔ;FÁ©æ\u001c@\u008e©ñ\u0006d[ÖÂ96«\u0092\u001e'\u0081kóßf5È\u0098;ø®L\u0010º\u0083\u0002¸\u0082*\b\u009d¾\u000f\\òçe\u009a×<º\u0085,y\u009f\u001c\u0002·ô\tgäÊ\u0085¼n/Ç\u0091g\u0004\u001f÷©YXÌ°¿\u009e!(\u0094Î\u00064é\u0013\\µÎ\\±ó$®\u00967yÃëg^ÒÁ\u009a³*&À\u0088m{\u0007î¹±ì#f\u0094Ð\u00062û\u0089lôÞR³ë%\u0017\u0096r\u000bÙýgn\u008aÃëµ\u0000&©\u0098\t\rqþÇP6ÅÞ¶å(Y\u009dû\u000f\u0017àjUÓ\u0091\u001f\u0003\u0095´#&ÁÛzL\u0007þ¡\u0093\u0018\u0005ä¶\u0081+*Ý\u0094Nyã\u0018\u0095ó\u0006Z¸ú-\u0082Þ4pÅå-\u0096\u0016\bª½\b/ëÀ\u0089u*âepïÇYU»¨\u0000?}\u008dÛàbv\u009eÅûXP®î=\u0003\u0090bæ\u0089u Ë\u0080^ø\u00adN\u0003¿\u0096Wål{ÐÎr\\\u0090³ñ\u0006P£p1ú\u0086L\u0014®é\u0015~hÌÎ¡w7\u008b\u0084î\u0019Eïû|\u0016Ñw§\u009c45\u008a\u0095\u001fíì[Bª×B¤y:Å\u008fg\u001d\u0085òéGE\"\u0098°\u0013\u0007¿\u0095Kháÿ\u0093±³#s\u0094Ð\u0006.û\u0083l¨ÞK³ª%\u0000\u0096~\u000bÆý,n\u009b±ê#a\u0094Í\u00069û\u0087lòÞC³¶%\u0010\u0018Ñ\u008a\u0012=¹¯PRöÅ\u0080w)\u001a\u0088\u008c`?\u001b¢©TFÇïj\u009a\u001c#\u008fÝ1e¤^W§ùZlü\u001f\u0091\u0081;4À¦eITü«nB\u0011é\u0084\u008969ÙÒKAþòa\u0085\u00131\u0086Ô(`Û\u0016NéðLcè\u0016\u009a±³#u\u0094Ç\u0006/û\u0084lèÞT³ê%\b\u0096b\u000bÈý\u007fnÜÃ µF&º\u0098C\rrþÇP5Å\u0099¶ø(\u0018\u009d¥\u000f\u0006àrU×Ç8¸\u008a-æ\u009f\u0010pªâ\u0015W\u008dÈæºN/·\u0081\u0014r(çÖY+§\u00895O\u0082ý\u0010\u0015í¾zÒÈn¥Ð32\u0080X\u001dòëExæÕ\u009a£|0\u0080\u008ey\u001bAèÿF\bÓ¥ À>|\u008b\u0080\u0019=öDCòÑM®µ;Ì\u0089jf\u0083ô)A®ÞË¬59\u0089\u00972±³#p\u0094Û\u00062û\u0094lâÞK³ê%\b\u0096b\u000bÈý\u007fnÜÃ µM&¡\u0098\u0003\rfþÖP\u000eÅ\u0091¶þ(R\u009d¹\u000f+àrUÔÇ-¸\u009d-í\u009fXp¼â\u001fW\u0086È¯ºB/°\u0081\u0017r(çÖY+±³#f\u0094Ö\u0006\"ûÏlîÞH³¬%\u0010\u0096$\u000bÃý'n\u0081Ãûµ\u0000&®\u0098\u0000\r|þÇP5Å\u0083¶ò(D\u009d£\u000f\u001dàxUßÇw¸\u008a-ü±Û#f\u0094Ì\u00068û\u008dlèÞR³¬%\u000b\u0096eTtÆðqTã²\u001e\u0012\u0089m;Õ±ÿ#k\u0094Ð\u0006.û\u008dlîÞS³¨\u0010\u000e\u0082\u008c5l§ÑZrÍ\b\u007f¢\u0012P\u0084ç7\u009fªd\\ÍÏmb\u0019\u0014§\u0087N9éeé÷b@ÎÒ:/Û¸²\nUÉÑ[Lìæ~\u000e\u0083¸\u0014Ä¦oñ\tc\u0094Ô>FÖ»`,\u001c\u009e·óheîÖÁKn±û#f\u0094Ì\u0006$û\u0092lîÞE³\u009a%\u001c\u00963\u000b\u009cý\u0016nÞÃ»ãîqlÆ\u008cT1©\u0092>è\u008cBá°w\u0007Ä\u007fY\u0084¯$<\u0087\u0091ëçKt¡Ã§Q/æ\u0081±ù#n\u0094×\u0006-û\u0081lóÞI³·±Ý#s\u0094Ò\u0006aû²lòÞH³±%\r\u0096f\u000bÏýin\u008eÃàµ\\&í\u0098/\r{þÀP>Å\u009d¶ò±Ý#m\u0094Æ\u00063û\u008flîÞB³å%7\u0096O\u000báýin\u008aÃúµG&¡\u0098\u0018\r3þÔP>Å\u0082¶·(N\u009dí\u000fB÷HeøÒS@¦½\u001a*{\u0098×õpc¢ÐÚMt»ü(\u001f\u0085oóÒ`4Þ\u008dK¦¸A\u0016«\u0083\u0017ð\"nÛÛxI×¦Ñ\u0013\u0019\u0081ø±î#l\u0094\u008c\u0006)û\u0081lõÞB³²%\u0005\u0096y\u000bÏ\u009dG\u000fÐ¸r*\u0099×:@Ròé\u009f\u0011ø8j³Ý\u001fOë²\n%c\u0003±\u0091=&\u0093´}I×Þ\u00ad±î#l\u0094\u008c\u00061û\u0092lèÞB³°%\u0007\u0096\u007f\u000b\u0084ý+n\u009aÃîµ@&©\u008ab\u0018à¯\u0000=¦À\tWyåÄ\u0088,\u001e\u0084\u00ad©0WÆ U\tøvôÓ±î#l\u0094\u008c\u00062û\u0085läÞS³·%\u0001{'±î#l\u0094\u008c\u0006#û\u0095lîÞJ³¡%J\u0096{\u000bØý&n\u008cÃúµM&¹ü\u0089n\u0005Ù½K^¶Ì!\u008c\u0093mþ\u0080±î#l\u0094\u008c\u0006#û\u0095lîÞJ³¡%J\u0096m\u000bÃý'n\u008fÃêµ\\&½\u0098\u001e\rzþÜP%n\u007füâKHÙ $\u0016³j\u0001Álnú\u0093IëÔE\"â±\u000b\u001cnjÄù,G\u009aÒþ!U±û#f\u0094Ì\u0006$û\u0092lîÞE³\u009a%\u001c\u00963\u000b\u009cýfn\u009bÃëµE&\u0092\u0098\u0014\r+þ\u0084P~Å\u0097¶ò(X\u009d°\u000f\u0006àrUÙÇ\u0006¸\u0080-§\u009f\b\u0002f\u0090û'Qµ¹H\u000fßsmØ\u0000w\u0096\u009e%ù¸XN³Ý\u0019pw\u0006ì\u0095#+\u0095¾åM\u0000ã«v\b\u0005d\u009bÎ.:¼\u0080Så±û#f\u0094Ì\u0006$û\u0092lîÞE³ê%\u0012\u0096i\u000bÅý1nÐÃ¹µ^&â\u0098\u001a\rqþÝP)ÅÈ¶¡(FK¤Ù3n\u0092üy\u0001Ó\u0096½$VIéß_l?ñª\u0007q\u0094Ç9¸O\u001eÜübV÷\u0013\u0004\u0095ª6?\u0099LçÒ\u000egïõE\u001a!¯\u0097=oBÄ×\u009fe\u0019\u008aº\u0018\u0015±î#l\u0094\u008c\u0006#û\u008flèÞR³©%\u000b\u0096j\u000bÎý,n\u009a±î#l\u0094\u008c\u0006#û\u008flèÞR³¬%\t\u0096j\u000bÍý,nÆÃíµ[&¤\u0098\u0000\rwþ\u009cP7Å\u0099¶ù(Q\u009d°\u000f\u0006àkUÈÇ0¸\u0096-ë\u008ef\u001cÖ«}9\u0088Ä4SUáù\u008cS\u001a§©\u00884'±î#l\u0094\u008c\u0006#û\u0095lîÞJ³¡%J\u0096o\u000bÃý:n\u0098ÃãµO&´\u0098B\rzþÖ±è#f\u0094Ñ\u00065ûÍ\u008d|\u001fä¨B:¼ÇGP}âÙ\u008f/\u0019Ãªó7FÁ\u00adR\u0014ÿ+\u0089×\u001a6¤\u008a1êÂHx·ê<]\u0095Ïn2\u0094¥µ\u0017\u000bz±ìS_0Â\u00994}§Ù\n°|\rïä\u0001\u0089\u0093\u0002$«¶PKªÜ\u0090n$\u0003\u008f\u0095f&\u000e»¥MHÞÓs\u0088\u0005+\u0096Ä(m½\u0005N·dîöeAÌÓ7.Í¹÷\u000bCfèð\u000bCkÞÍ(\u0015»\u008f\u0016é`Có½M\u0006Ød+È\u0087f\u0015ä¢\u00040¢Í\rZ}èÀ\u0085(\u0013\u0080 \u00ad=CË¯X\u0004õu\u0083É\u0010,®\u0080;µÈKf¼ó\u0015\u0080j\u001eÚ±î#l\u0094\u008c\u0006#û\u008flèÞR³ë%\u0015\u0096n\u000bÇý<nÆÃîµX&©\u00983\r}þÓP<Å\u0095±î#l\u0094\u008c\u0006.û\u0084lêÞ\b³§%\u0011\u0096b\u000bÆý-nÆÃéµG&£\u0098\u000b\rvþÀP!Å\u0082¶þ(X\u009d¡%&·¤\u0000D\u0092ùoZø J\u008a'x±Ï\u0002·\u009fLiãúUW.!\u008a²a\f\u008a\u0099½j\u0013Ä÷Q_\":¼\u008c\tm\u009bÎtºÁ\u001cSå=þ¯|\u0018\u009c\u008a\"w\u0089àäRB?°©\u0019\u001a5\u0087Øq,â\u0091Oó9Zªó\u0014\u001a\u0081jrÌÜ&I\u0085:õ¤V\u0011·\u0083\rleÙÞ±î#l\u0094\u008c\u00062û\u0099lôÞR³ %\t\u0096T\u000bÏý1n\u009cÃ¡µL&¸\u0098\u0005\r\u007fþÖP\u007fÅ\u0096¶þ(X\u009d²\u000f\u0011àiUÊÇ+¸\u0091-ñ\u009fJ±î#l\u0094\u008c\u00067û\u0085léÞB³ª%\u0016\u0096%\u000bÈý<n\u0081ÃãµJ&ã\u0098\n\rzþÜP6Å\u0095¶å(F\u009d§\u000f\u001dàuUÎ±î#l\u0094\u008c\u00067û\u0085léÞB³ª%\u0016\u0096T\u000bÎý%n\u0083Ãâµ\u0000&¯\u0098\u0019\rzþÞP5ÅÞ¶ñ(_\u009d»\u000f\u0013à~UÈÇ)¸\u008a-ö\u009fPp©±´ÃìQ\u007f±¦±µ±³#g\u0094Ç\u00067ûÏlöÞC³¨%\u0011\u0096T\u000bÚý n\u0098Ãê±³#g\u0094Ç\u00067ûÏlôÞI³¦%\u000f\u0096n\u000bÞýfn\u008aÃîµ]&¨\u0098\u000e\rrþÜP5Å¯¶ð(S\u009d»\u000f\rà\u007f\u0099\u0011\u000bÅ¼e.\u0095ÓmDVöë\u009b\u0004\r\u00ad¾Ì#|ÕÄF-ëH\u009dâ\u000e\u0016°ª½:/î\u0098N\n¾÷F`}ÒÀ¿/)\u0086\u009aç\u0007Wñïb\u0010Ïc¹Ê*1\u0094\u0081±³#p\u0094Û\u00062ûÏlöÞC³¨%\u0011\u0096T\u000bÞý;n\u0089ÃìµKù\u008bkHÜãN\n³¬$Ú\u0096sûÒm0ÞZCðµ^&¼\u008bÞýtn\u0096Ð\u000bEF¶ë\u0018\u0005\u008d¤þÀ`mÕ²G(¨F\u001dà\u008f\u0014ð§eø×w8\u0080ª)\u001f®\u0080\u0094òjg\u0097NTÜ\u0080k ùÐ\u0004(\u0093\u0002!²LVÚÜi\u008bô=\u0002Ý}@ï\u0094X4ÊÄ7< \u0016\u0012¦\u007fBéÈZ\u008cÇ01×¢~\u00865\u0014á£A1±ÌI[réÏ\u0084 \u0012\u0089¡è<XÊàY\fôz\u0082Ü\u0011-¯\u0085:ùÉPg²ò\u0004\u0081u±³#p\u0094Û\u00062û\u0094lâÞK³ê%\b\u0096b\u000bÈýfn\u0084ÃæµL&¯\u0098\u001f\rgþÔP>Å\u009c¶ó(S\u009d§\u000f+àqUÔÇ0¸Ö-ì\u009fQ±³#g\u0094Ç\u00067ûÏlåÞU³±%\u0005\u0096h\u000bÉý,àEr\u0091Å1WÁª9=\u0013\u008f£âGtõÇ\u0084Z.¬Ð±³#g\u0094Ç\u00067ûÏlåÞU³±%\t\u0096n\u000bÍý'ø¢jvÝÖO&²Þ%ô\u0097Dú l\u001aßhBÒ´=:Û¨\u000f\u001f¯\u008d_p§ç\u008dU=8Ù®z\u001d\u000e\u0080±vFã,qøÆXT¨©P>z\u008cÊá.w\u008bÄóYT¯¿<\u0007\u0091s±³#g\u0094Ç\u00067ûÏlåÞU³±%;\u0096b\u000bÇý,±³#g\u0094Ã\u00065û\u0081l¨ÞB³ª%\u0013\u0096e\u000bÆý&n\u0089Ãëµ]&â\u0098B\rkþÐP~Å\u0092¶ä(B\u009d¾±³#n\u0094Ì\u00065ûÏlðÞO³«%\u0000\u0096d\u000bÝý:nÇÃÍµ]&¹\u0098?\r{þÓP#Å\u0095¶ó(p\u009dº\u000f\u0018à\u007fUßÇ+±³#s\u0094Ð\u0006.û\u0083l¨ÞO³ª%\u0014\u0096d\u000bØý=n\u009bGBÕ\u008bb*ð\u008f\r4±³#s\u0094Ð\u0006.û\u0083l¨ÞU³ %\b\u0096m\u000b\u0085ý$n\u0089Ãÿµ]±û#q\u0094Ã\u0006-û\u008clèÞE³ë%\u0003\u0096d\u000bÆý-n\u008eÃæµ]&¥\u0098B\r`þÝGWÕÍbgð¡\r\u000b\u009ae(ÒE=Ó¡`ßýy\u000bÀ\u0098<5G±³#f\u0094Ö\u0006\"ûÏlêÞC³¡%\r\u0096j\u000bõý*n\u0087ÃëµK&®\u0098\u001f\r=þÊP<Å\u009c±þ#o\u0094×\u0006$û\u0093lóÞG³¦%\u000f\u0096x\fè\u009e=)\u008d»yF\u0094Ñ±c\u0012\u000eë\u0098Q+$¶\u0082±³#g\u0094Ã\u00065û\u0081l¨ÞB³ª%\u0013\u0096e\u000bÆý&n\u0089Ãëµ]&â\u0098B\rwþÂP~Å\u0091¶ç(F\u009d¦\u000fZàcU×Ç5±³#s\u0094Ð\u0006.û\u0083l¨ÞE³µ%\u0011\u0096b\u000bÄý/n\u0087r\u008fà8W\u009aÅq8Ò¯º\u001d\u0001pù±³#g\u0094Ã\u00065û\u0081l¨ÞK³¬%\u0017\u0096h\u000b\u0085ý9n\u009aÃàµH&¤\u0098\u0000\rvþÁP~Å\u0093¶â(D\u009dú\u000fDà4UÙÇ6¸\u0095-±\u009fSp´â\u001fW\u0091ÈíºW/©\u0081\u0015rrç\u008bY)Ê\u008e¿ç\u0011\\\u0082¡t\u0002ék".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -3987624065654840573L;
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    */
                private static java.lang.String $$e(short r6, int r7, int r8) {
                    /*
                        int r8 = r8 * 3
                        int r8 = r8 + 109
                        int r7 = r7 * 2
                        int r7 = r7 + 4
                        byte[] r0 = defpackage.onSearchClicked.$$c
                        int r6 = r6 * 3
                        int r1 = r6 + 1
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        if (r0 != 0) goto L16
                        r3 = r6
                        r4 = r2
                        goto L29
                    L16:
                        r3 = r2
                    L17:
                        byte r4 = (byte) r8
                        r1[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r6) goto L24
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        return r6
                    L24:
                        r3 = r0[r7]
                        r5 = r3
                        r3 = r8
                        r8 = r5
                    L29:
                        int r8 = -r8
                        int r7 = r7 + 1
                        int r8 = r8 + r3
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.onSearchClicked.$$e(short, int, int):java.lang.String");
                }
            };
            final Function1 function4 = new Function1() { // from class: onVoiceClicked
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getImeOptions.TuitionPaymentFragmentbindingInflater1(getimeoptions2, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: onTextFocusChanged
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function4.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
            getimeoptions2.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            str = "MIDTRANS";
            String str9 = str;
            final getImeOptions getimeoptions3 = (getImeOptions) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String strValueOf13 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).getNotifyChildrenChangedOptions);
            String strValueOf14 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).RemoteActionCompatParcelizer);
            String strValueOf15 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).g);
            user = (User) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (user != null) {
                str2 = user.b;
            } else {
                str2 = null;
            }
            String strValueOf16 = String.valueOf(str2);
            String strValueOf17 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).disconnect);
            String strValueOf18 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).cancel);
            String str10 = paymentOneTimeSuccessActivity.INotificationSideChannel;
            user2 = (User) paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (user2 != null) {
                str3 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i15 = connect + 67;
                MediaBrowserCompat = i15 % 128;
                int i16 = i15 % 2;
            } else {
                str3 = null;
            }
            InsertJmoPairRequest insertJmoPairRequest3 = new InsertJmoPairRequest(strValueOf13, strValueOf14, strValueOf15, strValueOf16, strValueOf17, str9, strValueOf18, str10, String.valueOf(str3));
            Intrinsics.checkNotNullParameter(insertJmoPairRequest3, "");
            MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData3 = getimeoptions3.asBinder;
            VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB3 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getimeoptions3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(insertJmoPairRequest3)));
            final Function1 function5 = new Function1() { // from class: onQueryRefine
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getImeOptions.b(getimeoptions3, (BaseItem) obj);
                }
            };
            logToString logtostring3 = new logToString() { // from class: onSearchClicked
                private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                private static final byte[] $$c = {39, 27, 2, 54};
                private static final int $$d = 113;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {58, -103, 118, 14};
                private static final int $$b = 137;
                private static int b = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    */
                private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
                    /*
                        int r8 = r8 + 4
                        byte[] r0 = defpackage.onSearchClicked.$$a
                        int r6 = r6 + 97
                        int r7 = r7 * 3
                        int r1 = 1 - r7
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        int r7 = 0 - r7
                        if (r0 != 0) goto L15
                        r6 = r7
                        r3 = r8
                        r4 = r2
                        goto L2c
                    L15:
                        r3 = r2
                    L16:
                        int r8 = r8 + 1
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r7) goto L27
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L27:
                        r3 = r0[r8]
                        r5 = r3
                        r3 = r8
                        r8 = r5
                    L2c:
                        int r6 = r6 + r8
                        r8 = r3
                        r3 = r4
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.onSearchClicked.c(byte, byte, byte, java.lang.Object[]):void");
                }

                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    int i17 = 2 % 2;
                    int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                    b = i18 % 128;
                    int i19 = i18 % 2;
                    function5.invoke(obj);
                    int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                    b = i110 % 128;
                    int i111 = i110 % 2;
                }

                private static void a(int i17, int i18, char c, Object[] objArr) throws Throwable {
                    int i19 = 2 % 2;
                    lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                    long[] jArr = new long[i18];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i18) {
                        int i110 = $10 + 37;
                        $11 = i110 % 128;
                        if (i110 % 2 == 0) {
                            int i111 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            try {
                                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i17 % i111])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2187, 40 - ExpandableListView.getPackedPositionType(0L), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i111), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 33017), 3011 - Color.alpha(0), 26 - (ViewConfiguration.getWindowTouchSlop() >> 8), 321985076, false, $$e(b4, b4, $$c[2]), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i111] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36505), View.resolveSize(0, 0) + 3376, 'A' - AndroidCharacter.getMirror('0'), -968507904, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            int i112 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i17 + i112])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2187, 41 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 841711447, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i112), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b9 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33017), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3012, 26 - TextUtils.getOffsetAfter("", 0), 321985076, false, $$e(b9, b9, $$c[2]), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i112] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                            Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - KeyEvent.keyCodeFromString("")), KeyEvent.keyCodeFromString("") + 3376, 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -968507904, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                        }
                    }
                    char[] cArr = new char[i18];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    int i113 = $10 + 99;
                    $11 = i113 % 128;
                    int i114 = i113 % 2;
                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i18) {
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 36505), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3376, View.getDefaultSize(0, 0) + 17, -968507904, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                    }
                    objArr[0] = new String(cArr);
                }

                /* JADX WARN: Code duplicated, block: B:100:0x0a2b  */
                /* JADX WARN: Code duplicated, block: B:106:0x0a48 A[LOOP:22: B:99:0x0a29->B:106:0x0a48, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:117:0x0aa3  */
                /* JADX WARN: Code duplicated, block: B:118:0x0aa5  */
                /* JADX WARN: Code duplicated, block: B:136:0x0ae3  */
                /* JADX WARN: Code duplicated, block: B:137:0x0aee  */
                /* JADX WARN: Code duplicated, block: B:140:0x0b10  */
                /* JADX WARN: Code duplicated, block: B:141:0x0b28  */
                /* JADX WARN: Code duplicated, block: B:144:0x0b4c  */
                /* JADX WARN: Code duplicated, block: B:145:0x0b74  */
                /* JADX WARN: Code duplicated, block: B:149:0x0c21  */
                /* JADX WARN: Code duplicated, block: B:152:0x0c30 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:157:0x0d2d A[LOOP:2: B:147:0x0c1e->B:157:0x0d2d, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:162:0x0dc9 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:165:0x0e17  */
                /* JADX WARN: Code duplicated, block: B:167:0x0e45  */
                /* JADX WARN: Code duplicated, block: B:168:0x0e4b  */
                /* JADX WARN: Code duplicated, block: B:172:0x0f0f A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:176:0x0ff6  */
                /* JADX WARN: Code duplicated, block: B:177:0x0ff9  */
                /* JADX WARN: Code duplicated, block: B:181:0x1046 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:185:0x10d2  */
                /* JADX WARN: Code duplicated, block: B:186:0x10d8  */
                /* JADX WARN: Code duplicated, block: B:190:0x1242  */
                /* JADX WARN: Code duplicated, block: B:193:0x1251 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:194:0x129f  */
                /* JADX WARN: Code duplicated, block: B:205:0x1332 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:209:0x1405  */
                /* JADX WARN: Code duplicated, block: B:210:0x1410  */
                /* JADX WARN: Code duplicated, block: B:212:0x146c  */
                /* JADX WARN: Code duplicated, block: B:219:0x1488  */
                /* JADX WARN: Code duplicated, block: B:359:0x293a  */
                /* JADX WARN: Code duplicated, block: B:361:0x2a0e  */
                /* JADX WARN: Code duplicated, block: B:362:0x2a1e  */
                /* JADX WARN: Code duplicated, block: B:364:0x2a5a  */
                /* JADX WARN: Code duplicated, block: B:375:0x2b8c A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:378:0x2be2  */
                /* JADX WARN: Code duplicated, block: B:379:0x2bf3  */
                /* JADX WARN: Code duplicated, block: B:382:0x2c0b A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:413:0x338c  */
                /* JADX WARN: Code duplicated, block: B:417:0x35f5  */
                /* JADX WARN: Code duplicated, block: B:419:0x3605  */
                /* JADX WARN: Code duplicated, block: B:425:0x362f  */
                /* JADX WARN: Code duplicated, block: B:427:0x3634 A[Catch: all -> 0x3705, IOException -> 0x3707, TRY_LEAVE, TryCatch #10 {IOException -> 0x3707, blocks: (B:426:0x3631, B:427:0x3634), top: B:554:0x3631 }] */
                /* JADX WARN: Code duplicated, block: B:433:0x3645  */
                /* JADX WARN: Code duplicated, block: B:440:0x3654  */
                /* JADX WARN: Code duplicated, block: B:442:0x365d A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:443:0x365f  */
                /* JADX WARN: Code duplicated, block: B:445:0x3666  */
                /* JADX WARN: Code duplicated, block: B:447:0x3669  */
                /* JADX WARN: Code duplicated, block: B:453:0x3695 A[LOOP:12: B:446:0x3667->B:453:0x3695, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:457:0x36b0 A[LOOP:11: B:444:0x3664->B:457:0x36b0, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:460:0x36c2  */
                /* JADX WARN: Code duplicated, block: B:466:0x36f4  */
                /* JADX WARN: Code duplicated, block: B:467:0x36f6  */
                /* JADX WARN: Code duplicated, block: B:493:0x37cb A[Catch: all -> 0x38b1, TryCatch #8 {all -> 0x38b1, blocks: (B:491:0x37be, B:493:0x37cb, B:494:0x3814), top: B:552:0x37be, outer: #28 }] */
                /* JADX WARN: Code duplicated, block: B:498:0x38a8 A[Catch: Exception -> 0x38ba, TryCatch #28 {Exception -> 0x38ba, blocks: (B:489:0x375f, B:496:0x3857, B:498:0x38a8, B:501:0x38b2, B:503:0x38b8, B:504:0x38b9, B:491:0x37be, B:493:0x37cb, B:494:0x3814), top: B:578:0x375f, inners: #8 }] */
                /* JADX WARN: Code duplicated, block: B:499:0x38af  */
                /* JADX WARN: Code duplicated, block: B:509:0x3908 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:582:0x091d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:584:0x1472 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:586:0x3616 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:592:0x0d31 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:593:0x0d25 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:595:0x12bf A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:608:0x3748 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:609:0x36fc A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:610:0x36fc A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:611:0x3737 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:613:0x3726 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:615:0x36ee A[EDGE_INSN: B:615:0x36ee->B:464:0x36ee BREAK  A[LOOP:9: B:550:0x363b->B:463:0x36da], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:621:0x36b9 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:622:0x36bb A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:623:0x3691 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:624:0x36a3 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:642:0x0a9d A[EDGE_INSN: B:642:0x0a9d->B:115:0x0a9d BREAK  A[LOOP:19: B:77:0x092c->B:114:0x0a8d], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:649:0x0a5a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:650:0x0a6d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:651:0x0a5c A[EDGE_INSN: B:651:0x0a5c->B:110:0x0a5c BREAK  A[LOOP:22: B:99:0x0a29->B:106:0x0a48], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:652:0x0a5c A[EDGE_INSN: B:652:0x0a5c->B:110:0x0a5c BREAK  A[LOOP:22: B:99:0x0a29->B:106:0x0a48], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:653:0x0a54 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:69:0x0757 A[Catch: all -> 0x0272, TryCatch #11 {all -> 0x0272, blocks: (B:10:0x0182, B:12:0x018f, B:13:0x01c8, B:25:0x0362, B:27:0x036f, B:28:0x03a9, B:38:0x04d1, B:40:0x04de, B:41:0x0515, B:67:0x0751, B:69:0x0757, B:70:0x07a0, B:150:0x0c23, B:152:0x0c30, B:153:0x0c79, B:160:0x0dbc, B:162:0x0dc9, B:163:0x0e0c, B:170:0x0f02, B:172:0x0f0f, B:173:0x0f58, B:179:0x1039, B:181:0x1046, B:182:0x1091, B:191:0x1244, B:193:0x1251, B:195:0x12a1, B:203:0x1325, B:205:0x1332, B:206:0x137b, B:279:0x1614, B:281:0x1621, B:282:0x165c, B:298:0x17a5, B:300:0x17b2, B:302:0x17f8, B:309:0x18ce, B:311:0x18d4, B:312:0x1914, B:315:0x19ac, B:317:0x19be, B:318:0x1a00, B:324:0x1af2, B:326:0x1aff, B:327:0x1b48, B:329:0x1b51, B:331:0x1b69, B:332:0x1bb2, B:373:0x2b7f, B:375:0x2b8c, B:376:0x2bd9, B:393:0x3122, B:395:0x312f, B:396:0x316b, B:507:0x38fb, B:509:0x3908, B:510:0x3945, B:402:0x3259, B:404:0x3266, B:405:0x32a6, B:380:0x2bf4, B:382:0x2c0b, B:383:0x2c56, B:340:0x2889, B:342:0x2896, B:344:0x28f1, B:47:0x05f9, B:49:0x0606, B:50:0x064c, B:56:0x06c7, B:58:0x06d4, B:60:0x071e), top: B:556:0x0182 }] */
                /* JADX WARN: Code duplicated, block: B:73:0x0916  */
                /* JADX WARN: Code duplicated, block: B:79:0x0933  */
                /* JADX WARN: Code duplicated, block: B:81:0x0945  */
                /* JADX WARN: Code duplicated, block: B:82:0x0947  */
                /* JADX WARN: Code duplicated, block: B:87:0x0954  */
                /* JADX WARN: Code duplicated, block: B:89:0x09f9  */
                /* JADX WARN: Code duplicated, block: B:90:0x09fd  */
                /* JADX WARN: Code duplicated, block: B:91:0x0a06  */
                /* JADX WARN: Code duplicated, block: B:93:0x0a0a  */
                /* JADX WARN: Code duplicated, block: B:95:0x0a10  */
                /* JADX WARN: Code duplicated, block: B:97:0x0a26  */
                /* JADX WARN: Code duplicated, block: B:98:0x0a28  */
                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:220:0x1489
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
                    	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                    	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                    */
                public static java.lang.Object[] b(android.content.Context r52, int r53, int r54, int r55) {
                    /*
                        Method dump skipped, instruction units count: 15058
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.onSearchClicked.b(android.content.Context, int, int, int):java.lang.Object[]");
                }

                static {
                    char[] cArr = new char[2154];
                    ByteBuffer.wrap(",è¾<\t\u009c\u009blf\u0094ñ»C\u0012.ò¸[\u000b6\u0096\u0098`aóÛ^\u008b(\u0014»ò\u0005S\u0090:c\u008cÍyXØ+\u0093µ\u001e\u0000þ\u0092N}#È\u0084/å½1\n\u0091\u0098ae\u0099ò¶@\u001f-ÿ»V\b;\u0095\u0095clðÖ]\u0086+\b¸ò\u0006J\u0093 `»Îc[Ö(³¶\u0003\u0003÷\u0091F±³#g\u0094Ç\u00067ûÏlàÞI³©%\u0000\u0096m\u000bÃý:n\u0080ÃÐµ]&´\u0098\u0002\rp±³#p\u0094Û\u00062ûÏlêÞI³¡%\u0011\u0096g\u000bÏýfn\u008fÃàµB&©\u0098\n\rzþÁP9Å¯¶õ(W\u009d¡\u000f\u0000à~UÈÇ '!µô\u0002D\u0090°m]úqHÓ%y³\u0086\u0000ë\u009dWk«±³#f\u0094Ö\u0006\"ûÏlôÞO³¨%J\u0096{\u000bØý&n\u0098\u0014\u008b\u0086H1þ£\u001a^¹ÉÍ{z\u0016Ò\u0080\u000e3u®ßX\u001eË¦fÒ\u0010R\u0083\u0094= ¨Jw~åªR\u000eÀø=Lªe\u0018ÅukãÙP³Í\u000e;ê¨C\u0005-\u0097\u0014\u0005\u0096²v ÙÝuJ\u0012ø¨\u0095\u0011\u0003ì°\u0094-4ÛÁH}å\u001c\u0093°\u0000h¾ø+\u008cØ<vôãn\u0090\u0003\u000e¿»\u001e±î#l\u0094\u008c\u0006#û\u008flèÞR³ë%\u0016\u0096n\u000bÎý;n\u0087ÃæµJ&\u0092\u0098\u0002\rvþÆP\u000eÅ\u0094¶ù(E\u009dç±³#p\u0094Û\u00062û\u0094lâÞK³ê%\b\u0096b\u000bÈýfn\u0084ÃæµL&£\u0098\u000e\r=þÁP>±þ#j\u0094Å\u0006/û\u008flÿ9\u0016«Õ\u001c~\u008e\u0097s1äGVî;O\u00ad£\u001eÇ\u0083auÃæ#KO=æ®\u001d\u0010\u009f\u0085ûv:Ø\u009aM0>_ æ\u0015]\u0087²hÑÝqO\u00880/¥U\u0017÷¯:=ù\u008aR\u0018»å\u001drkÀÂ\u00adc;\u008f\u0088ë\u0015Mãïp\u000fÝc«Ê81\u0086³\u0013×à\u0016N¨Û\u000b¨q6ÏeO÷\u008c@'ÒÎ/h¸\u001e\n·g\u0016ñôB\u009eß4)\u009aºx\u0017\u001aa°ò_LõÙ\u0082*;\u0084û\u0011Ab\u001bü¸IFÛø4É\u00815\u0013Ê±³#g\u0094Ç\u00067ûÏléÞC³¨%\u0011\u0096l\u000bßý,n\u009bÃû¦\u00834\u0001\u0083á\u0011Nìø{\u0083É'¤Ì2'\u0081\u000e\u001c¨êWyñ±ò#f\u0094Ã\u00062û\u0085l©ÞH³ %\u0010ß~M¾ú\u001dhã\u0095N\u0002e°\u008dÝaKÅø£e\u0014\u0093ý\u0000V\u00ad6Û\u0086HmöÒ\u009b\u0096\t\u0002¾«,PÑ÷F\u0085Æ\u0007T\u0085ãeqØ\u008c{\u001b\u0001©«ÄYRîá\u0096|m\u008aÍ\u0019`´\bÂ²QBïäz\u0099\u0089/'Í²kÁ\u001b_\u00ad\u0089y\u001bä¬N>ºøwjýÝKO©²\u0012%o\u0097Éúpl\u008cßéBB´ü'\u0011\u008apü\u009bo2Ñ\u0092Dê·\\\u0019\u00ad\u008cEÿkaÝÔ;FÁ©æ\u001c@\u008e©ñ\u0006d[ÖÂ96«\u0092\u001e'\u0081kóßf5È\u0098;ø®L\u0010º\u0083\u0002¸\u0082*\b\u009d¾\u000f\\òçe\u009a×<º\u0085,y\u009f\u001c\u0002·ô\tgäÊ\u0085¼n/Ç\u0091g\u0004\u001f÷©YXÌ°¿\u009e!(\u0094Î\u00064é\u0013\\µÎ\\±ó$®\u00967yÃëg^ÒÁ\u009a³*&À\u0088m{\u0007î¹±ì#f\u0094Ð\u00062û\u0089lôÞR³ë%\u0017\u0096r\u000bÙýgn\u008aÃëµ\u0000&©\u0098\t\rqþÇP6ÅÞ¶å(Y\u009dû\u000f\u0017àjUÓ\u0091\u001f\u0003\u0095´#&ÁÛzL\u0007þ¡\u0093\u0018\u0005ä¶\u0081+*Ý\u0094Nyã\u0018\u0095ó\u0006Z¸ú-\u0082Þ4pÅå-\u0096\u0016\bª½\b/ëÀ\u0089u*âepïÇYU»¨\u0000?}\u008dÛàbv\u009eÅûXP®î=\u0003\u0090bæ\u0089u Ë\u0080^ø\u00adN\u0003¿\u0096Wål{ÐÎr\\\u0090³ñ\u0006P£p1ú\u0086L\u0014®é\u0015~hÌÎ¡w7\u008b\u0084î\u0019Eïû|\u0016Ñw§\u009c45\u008a\u0095\u001fíì[Bª×B¤y:Å\u008fg\u001d\u0085òéGE\"\u0098°\u0013\u0007¿\u0095Kháÿ\u0093±³#s\u0094Ð\u0006.û\u0083l¨ÞK³ª%\u0000\u0096~\u000bÆý,n\u009b±ê#a\u0094Í\u00069û\u0087lòÞC³¶%\u0010\u0018Ñ\u008a\u0012=¹¯PRöÅ\u0080w)\u001a\u0088\u008c`?\u001b¢©TFÇïj\u009a\u001c#\u008fÝ1e¤^W§ùZlü\u001f\u0091\u0081;4À¦eITü«nB\u0011é\u0084\u008969ÙÒKAþòa\u0085\u00131\u0086Ô(`Û\u0016NéðLcè\u0016\u009a±³#u\u0094Ç\u0006/û\u0084lèÞT³ê%\b\u0096b\u000bÈý\u007fnÜÃ µF&º\u0098C\rrþÇP5Å\u0099¶ø(\u0018\u009d¥\u000f\u0006àrU×Ç8¸\u008a-æ\u009f\u0010pªâ\u0015W\u008dÈæºN/·\u0081\u0014r(çÖY+§\u00895O\u0082ý\u0010\u0015í¾zÒÈn¥Ð32\u0080X\u001dòëExæÕ\u009a£|0\u0080\u008ey\u001bAèÿF\bÓ¥ À>|\u008b\u0080\u0019=öDCòÑM®µ;Ì\u0089jf\u0083ô)A®ÞË¬59\u0089\u00972±³#p\u0094Û\u00062û\u0094lâÞK³ê%\b\u0096b\u000bÈý\u007fnÜÃ µM&¡\u0098\u0003\rfþÖP\u000eÅ\u0091¶þ(R\u009d¹\u000f+àrUÔÇ-¸\u009d-í\u009fXp¼â\u001fW\u0086È¯ºB/°\u0081\u0017r(çÖY+±³#f\u0094Ö\u0006\"ûÏlîÞH³¬%\u0010\u0096$\u000bÃý'n\u0081Ãûµ\u0000&®\u0098\u0000\r|þÇP5Å\u0083¶ò(D\u009d£\u000f\u001dàxUßÇw¸\u008a-ü±Û#f\u0094Ì\u00068û\u008dlèÞR³¬%\u000b\u0096eTtÆðqTã²\u001e\u0012\u0089m;Õ±ÿ#k\u0094Ð\u0006.û\u008dlîÞS³¨\u0010\u000e\u0082\u008c5l§ÑZrÍ\b\u007f¢\u0012P\u0084ç7\u009fªd\\ÍÏmb\u0019\u0014§\u0087N9éeé÷b@ÎÒ:/Û¸²\nUÉÑ[Lìæ~\u000e\u0083¸\u0014Ä¦oñ\tc\u0094Ô>FÖ»`,\u001c\u009e·óheîÖÁKn±û#f\u0094Ì\u0006$û\u0092lîÞE³\u009a%\u001c\u00963\u000b\u009cý\u0016nÞÃ»ãîqlÆ\u008cT1©\u0092>è\u008cBá°w\u0007Ä\u007fY\u0084¯$<\u0087\u0091ëçKt¡Ã§Q/æ\u0081±ù#n\u0094×\u0006-û\u0081lóÞI³·±Ý#s\u0094Ò\u0006aû²lòÞH³±%\r\u0096f\u000bÏýin\u008eÃàµ\\&í\u0098/\r{þÀP>Å\u009d¶ò±Ý#m\u0094Æ\u00063û\u008flîÞB³å%7\u0096O\u000báýin\u008aÃúµG&¡\u0098\u0018\r3þÔP>Å\u0082¶·(N\u009dí\u000fB÷HeøÒS@¦½\u001a*{\u0098×õpc¢ÐÚMt»ü(\u001f\u0085oóÒ`4Þ\u008dK¦¸A\u0016«\u0083\u0017ð\"nÛÛxI×¦Ñ\u0013\u0019\u0081ø±î#l\u0094\u008c\u0006)û\u0081lõÞB³²%\u0005\u0096y\u000bÏ\u009dG\u000fÐ¸r*\u0099×:@Ròé\u009f\u0011ø8j³Ý\u001fOë²\n%c\u0003±\u0091=&\u0093´}I×Þ\u00ad±î#l\u0094\u008c\u00061û\u0092lèÞB³°%\u0007\u0096\u007f\u000b\u0084ý+n\u009aÃîµ@&©\u008ab\u0018à¯\u0000=¦À\tWyåÄ\u0088,\u001e\u0084\u00ad©0WÆ U\tøvôÓ±î#l\u0094\u008c\u00062û\u0085läÞS³·%\u0001{'±î#l\u0094\u008c\u0006#û\u0095lîÞJ³¡%J\u0096{\u000bØý&n\u008cÃúµM&¹ü\u0089n\u0005Ù½K^¶Ì!\u008c\u0093mþ\u0080±î#l\u0094\u008c\u0006#û\u0095lîÞJ³¡%J\u0096m\u000bÃý'n\u008fÃêµ\\&½\u0098\u001e\rzþÜP%n\u007füâKHÙ $\u0016³j\u0001Álnú\u0093IëÔE\"â±\u000b\u001cnjÄù,G\u009aÒþ!U±û#f\u0094Ì\u0006$û\u0092lîÞE³\u009a%\u001c\u00963\u000b\u009cýfn\u009bÃëµE&\u0092\u0098\u0014\r+þ\u0084P~Å\u0097¶ò(X\u009d°\u000f\u0006àrUÙÇ\u0006¸\u0080-§\u009f\b\u0002f\u0090û'Qµ¹H\u000fßsmØ\u0000w\u0096\u009e%ù¸XN³Ý\u0019pw\u0006ì\u0095#+\u0095¾åM\u0000ã«v\b\u0005d\u009bÎ.:¼\u0080Så±û#f\u0094Ì\u0006$û\u0092lîÞE³ê%\u0012\u0096i\u000bÅý1nÐÃ¹µ^&â\u0098\u001a\rqþÝP)ÅÈ¶¡(FK¤Ù3n\u0092üy\u0001Ó\u0096½$VIéß_l?ñª\u0007q\u0094Ç9¸O\u001eÜübV÷\u0013\u0004\u0095ª6?\u0099LçÒ\u000egïõE\u001a!¯\u0097=oBÄ×\u009fe\u0019\u008aº\u0018\u0015±î#l\u0094\u008c\u0006#û\u008flèÞR³©%\u000b\u0096j\u000bÎý,n\u009a±î#l\u0094\u008c\u0006#û\u008flèÞR³¬%\t\u0096j\u000bÍý,nÆÃíµ[&¤\u0098\u0000\rwþ\u009cP7Å\u0099¶ù(Q\u009d°\u000f\u0006àkUÈÇ0¸\u0096-ë\u008ef\u001cÖ«}9\u0088Ä4SUáù\u008cS\u001a§©\u00884'±î#l\u0094\u008c\u0006#û\u0095lîÞJ³¡%J\u0096o\u000bÃý:n\u0098ÃãµO&´\u0098B\rzþÖ±è#f\u0094Ñ\u00065ûÍ\u008d|\u001fä¨B:¼ÇGP}âÙ\u008f/\u0019Ãªó7FÁ\u00adR\u0014ÿ+\u0089×\u001a6¤\u008a1êÂHx·ê<]\u0095Ïn2\u0094¥µ\u0017\u000bz±ìS_0Â\u00994}§Ù\n°|\rïä\u0001\u0089\u0093\u0002$«¶PKªÜ\u0090n$\u0003\u008f\u0095f&\u000e»¥MHÞÓs\u0088\u0005+\u0096Ä(m½\u0005N·dîöeAÌÓ7.Í¹÷\u000bCfèð\u000bCkÞÍ(\u0015»\u008f\u0016é`Có½M\u0006Ød+È\u0087f\u0015ä¢\u00040¢Í\rZ}èÀ\u0085(\u0013\u0080 \u00ad=CË¯X\u0004õu\u0083É\u0010,®\u0080;µÈKf¼ó\u0015\u0080j\u001eÚ±î#l\u0094\u008c\u0006#û\u008flèÞR³ë%\u0015\u0096n\u000bÇý<nÆÃîµX&©\u00983\r}þÓP<Å\u0095±î#l\u0094\u008c\u0006.û\u0084lêÞ\b³§%\u0011\u0096b\u000bÆý-nÆÃéµG&£\u0098\u000b\rvþÀP!Å\u0082¶þ(X\u009d¡%&·¤\u0000D\u0092ùoZø J\u008a'x±Ï\u0002·\u009fLiãúUW.!\u008a²a\f\u008a\u0099½j\u0013Ä÷Q_\":¼\u008c\tm\u009bÎtºÁ\u001cSå=þ¯|\u0018\u009c\u008a\"w\u0089àäRB?°©\u0019\u001a5\u0087Øq,â\u0091Oó9Zªó\u0014\u001a\u0081jrÌÜ&I\u0085:õ¤V\u0011·\u0083\rleÙÞ±î#l\u0094\u008c\u00062û\u0099lôÞR³ %\t\u0096T\u000bÏý1n\u009cÃ¡µL&¸\u0098\u0005\r\u007fþÖP\u007fÅ\u0096¶þ(X\u009d²\u000f\u0011àiUÊÇ+¸\u0091-ñ\u009fJ±î#l\u0094\u008c\u00067û\u0085léÞB³ª%\u0016\u0096%\u000bÈý<n\u0081ÃãµJ&ã\u0098\n\rzþÜP6Å\u0095¶å(F\u009d§\u000f\u001dàuUÎ±î#l\u0094\u008c\u00067û\u0085léÞB³ª%\u0016\u0096T\u000bÎý%n\u0083Ãâµ\u0000&¯\u0098\u0019\rzþÞP5ÅÞ¶ñ(_\u009d»\u000f\u0013à~UÈÇ)¸\u008a-ö\u009fPp©±´ÃìQ\u007f±¦±µ±³#g\u0094Ç\u00067ûÏlöÞC³¨%\u0011\u0096T\u000bÚý n\u0098Ãê±³#g\u0094Ç\u00067ûÏlôÞI³¦%\u000f\u0096n\u000bÞýfn\u008aÃîµ]&¨\u0098\u000e\rrþÜP5Å¯¶ð(S\u009d»\u000f\rà\u007f\u0099\u0011\u000bÅ¼e.\u0095ÓmDVöë\u009b\u0004\r\u00ad¾Ì#|ÕÄF-ëH\u009dâ\u000e\u0016°ª½:/î\u0098N\n¾÷F`}ÒÀ¿/)\u0086\u009aç\u0007Wñïb\u0010Ïc¹Ê*1\u0094\u0081±³#p\u0094Û\u00062ûÏlöÞC³¨%\u0011\u0096T\u000bÞý;n\u0089ÃìµKù\u008bkHÜãN\n³¬$Ú\u0096sûÒm0ÞZCðµ^&¼\u008bÞýtn\u0096Ð\u000bEF¶ë\u0018\u0005\u008d¤þÀ`mÕ²G(¨F\u001dà\u008f\u0014ð§eø×w8\u0080ª)\u001f®\u0080\u0094òjg\u0097NTÜ\u0080k ùÐ\u0004(\u0093\u0002!²LVÚÜi\u008bô=\u0002Ý}@ï\u0094X4ÊÄ7< \u0016\u0012¦\u007fBéÈZ\u008cÇ01×¢~\u00865\u0014á£A1±ÌI[réÏ\u0084 \u0012\u0089¡è<XÊàY\fôz\u0082Ü\u0011-¯\u0085:ùÉPg²ò\u0004\u0081u±³#p\u0094Û\u00062û\u0094lâÞK³ê%\b\u0096b\u000bÈýfn\u0084ÃæµL&¯\u0098\u001f\rgþÔP>Å\u009c¶ó(S\u009d§\u000f+àqUÔÇ0¸Ö-ì\u009fQ±³#g\u0094Ç\u00067ûÏlåÞU³±%\u0005\u0096h\u000bÉý,àEr\u0091Å1WÁª9=\u0013\u008f£âGtõÇ\u0084Z.¬Ð±³#g\u0094Ç\u00067ûÏlåÞU³±%\t\u0096n\u000bÍý'ø¢jvÝÖO&²Þ%ô\u0097Dú l\u001aßhBÒ´=:Û¨\u000f\u001f¯\u008d_p§ç\u008dU=8Ù®z\u001d\u000e\u0080±vFã,qøÆXT¨©P>z\u008cÊá.w\u008bÄóYT¯¿<\u0007\u0091s±³#g\u0094Ç\u00067ûÏlåÞU³±%;\u0096b\u000bÇý,±³#g\u0094Ã\u00065û\u0081l¨ÞB³ª%\u0013\u0096e\u000bÆý&n\u0089Ãëµ]&â\u0098B\rkþÐP~Å\u0092¶ä(B\u009d¾±³#n\u0094Ì\u00065ûÏlðÞO³«%\u0000\u0096d\u000bÝý:nÇÃÍµ]&¹\u0098?\r{þÓP#Å\u0095¶ó(p\u009dº\u000f\u0018à\u007fUßÇ+±³#s\u0094Ð\u0006.û\u0083l¨ÞO³ª%\u0014\u0096d\u000bØý=n\u009bGBÕ\u008bb*ð\u008f\r4±³#s\u0094Ð\u0006.û\u0083l¨ÞU³ %\b\u0096m\u000b\u0085ý$n\u0089Ãÿµ]±û#q\u0094Ã\u0006-û\u008clèÞE³ë%\u0003\u0096d\u000bÆý-n\u008eÃæµ]&¥\u0098B\r`þÝGWÕÍbgð¡\r\u000b\u009ae(ÒE=Ó¡`ßýy\u000bÀ\u0098<5G±³#f\u0094Ö\u0006\"ûÏlêÞC³¡%\r\u0096j\u000bõý*n\u0087ÃëµK&®\u0098\u001f\r=þÊP<Å\u009c±þ#o\u0094×\u0006$û\u0093lóÞG³¦%\u000f\u0096x\fè\u009e=)\u008d»yF\u0094Ñ±c\u0012\u000eë\u0098Q+$¶\u0082±³#g\u0094Ã\u00065û\u0081l¨ÞB³ª%\u0013\u0096e\u000bÆý&n\u0089Ãëµ]&â\u0098B\rwþÂP~Å\u0091¶ç(F\u009d¦\u000fZàcU×Ç5±³#s\u0094Ð\u0006.û\u0083l¨ÞE³µ%\u0011\u0096b\u000bÄý/n\u0087r\u008fà8W\u009aÅq8Ò¯º\u001d\u0001pù±³#g\u0094Ã\u00065û\u0081l¨ÞK³¬%\u0017\u0096h\u000b\u0085ý9n\u009aÃàµH&¤\u0098\u0000\rvþÁP~Å\u0093¶â(D\u009dú\u000fDà4UÙÇ6¸\u0095-±\u009fSp´â\u001fW\u0091ÈíºW/©\u0081\u0015rrç\u008bY)Ê\u008e¿ç\u0011\\\u0082¡t\u0002ék".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -3987624065654840573L;
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    */
                private static java.lang.String $$e(short r6, int r7, int r8) {
                    /*
                        int r8 = r8 * 3
                        int r8 = r8 + 109
                        int r7 = r7 * 2
                        int r7 = r7 + 4
                        byte[] r0 = defpackage.onSearchClicked.$$c
                        int r6 = r6 * 3
                        int r1 = r6 + 1
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        if (r0 != 0) goto L16
                        r3 = r6
                        r4 = r2
                        goto L29
                    L16:
                        r3 = r2
                    L17:
                        byte r4 = (byte) r8
                        r1[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r6) goto L24
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        return r6
                    L24:
                        r3 = r0[r7]
                        r5 = r3
                        r3 = r8
                        r8 = r5
                    L29:
                        int r8 = -r8
                        int r7 = r7 + 1
                        int r8 = r8 + r3
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.onSearchClicked.$$e(short, int, int):java.lang.String");
                }
            };
            final Function1 function6 = new Function1() { // from class: onVoiceClicked
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getImeOptions.TuitionPaymentFragmentbindingInflater1(getimeoptions3, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5 = derivecodecB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring3, new logToString() { // from class: onTextFocusChanged
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function6.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5, "");
            getimeoptions3.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5);
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity = (PaymentOneTimeSuccessActivity) objArr[0];
        int i = 2 % 2;
        int i2 = connect + 55;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            Parcelable parcelableExtra = paymentOneTimeSuccessActivity.getIntent().getParcelableExtra("successful_unregistered_registration_data");
            Intrinsics.checkNotNull(parcelableExtra);
            return (Registration) parcelableExtra;
        }
        Parcelable parcelableExtra2 = paymentOneTimeSuccessActivity.getIntent().getParcelableExtra("successful_unregistered_registration_data");
        Intrinsics.checkNotNull(parcelableExtra2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        RegisterAutoDebetActivity.Companion companion = RegisterAutoDebetActivity.INSTANCE;
        String strValueOf = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).RemoteActionCompatParcelizer);
        String strValueOf2 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).asBinder);
        String strValueOf3 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).asInterface);
        String str = paymentOneTimeSuccessActivity.onTransact;
        String strValueOf4 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).RemoteActionCompatParcelizer);
        String strValueOf5 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).onTransact);
        String strValueOf6 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).g);
        String str2 = paymentOneTimeSuccessActivity.cancel;
        String str3 = paymentOneTimeSuccessActivity.INotificationSideChannel;
        String strValueOf7 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).RemoteActionCompatParcelizer);
        double d = paymentOneTimeSuccessActivity.d;
        double d2 = paymentOneTimeSuccessActivity.g;
        double d3 = paymentOneTimeSuccessActivity.a;
        int i2 = (int) paymentOneTimeSuccessActivity.notify;
        String strValueOf8 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).getInterfaceDescriptor);
        String strValueOf9 = String.valueOf(((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).connect);
        double d4 = paymentOneTimeSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + ((double) (paymentOneTimeSuccessActivity.cancelAll * 200));
        double dCeil = Math.ceil(d4 / 0.9834d) - d4;
        boolean z = ((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).getExtras;
        boolean z2 = ((Registration) paymentOneTimeSuccessActivity.asBinder.getValue()).com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String;
        Boolean bool = Boolean.FALSE;
        RegisterAutoDebetActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentOneTimeSuccessActivity, new CustomerObject(strValueOf, strValueOf2, strValueOf3, str, strValueOf4, "", strValueOf5, strValueOf6, "", "", "", "", "", "", str2, "", "", str3, strValueOf7, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(dCeil), i2, strValueOf8, "", "", "", strValueOf9, bool, null, null, null, bool, null, bool, null, bool, null, bool, null, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.MIN_VALUE, 0, null));
        Unit unit = Unit.INSTANCE;
        int i3 = MediaBrowserCompat + 107;
        connect = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 65;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ Unit b(PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity, View view) {
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        int iB2 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        int iB3 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        return (Unit) b(-1059211569, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), iB2, iB, iB3, new Object[]{paymentOneTimeSuccessActivity, view}, 1059211570);
    }

    public static /* synthetic */ Registration TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentOneTimeSuccessActivity paymentOneTimeSuccessActivity) {
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        int iB2 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        int iB3 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        return (Registration) b(563146669, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), iB2, iB, iB3, new Object[]{paymentOneTimeSuccessActivity}, -563146666);
    }

    static {
        IconCompatParcelizer = 0;
        d();
        INSTANCE = new Companion(null);
        int i = write + 11;
        IconCompatParcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = connect + 77;
        int i3 = i2 % 128;
        MediaBrowserCompat = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 39;
        connect = i4 % 128;
        int i5 = i4 % 2;
        return R.layout.activity_payment_one_time_success;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        int iB2 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CrashlyticsWorkers.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(-761224414, CrashlyticsWorkers.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iB2, iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, 761224414);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = connect + 21;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        int iB2 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CrashlyticsWorkers.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(140831722, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), iB2, iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, -140831720);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 29;
        connect = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
    }

    static void d() {
        RemoteActionCompatParcelizer = new char[]{14183, 4509, 31368, 17323, 44221, 62886, 57052, 10139, 193, 27112, 45754, 39890, 58371, 52484, 5652, 32568, 22587, 41216, 35408, 54086, 15425, 1396, 45561, 38661, 64535, 50483, 10811, 29488, 22598, 41341, 34385, 61280, 13410, 7535, 25225, 19328, 37023, 45558, 38664, 64512, 50466, 10854, 29497, 22595, 41281, 34387, 61231, 13405, 7522, 25235, 19353, 37023, 63914, 26563, 16699, 10789, 4891, 64522, 42250, 36448, 30560, 20554, 14678, 57931, 52037, 46229, 40372, 18088, 12180};
        getInterfaceDescriptor = 4870048795855722345L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity.$$c
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r7 = 115 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentOneTimeSuccessActivity.$$i(byte, byte, byte):java.lang.String");
    }
}
