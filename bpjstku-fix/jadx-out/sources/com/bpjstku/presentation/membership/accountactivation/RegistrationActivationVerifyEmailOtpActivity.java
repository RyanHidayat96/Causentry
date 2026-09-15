package com.bpjstku.presentation.membership.accountactivation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
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
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.databinding.ActivityRegistrationActivationVerifyEmailOtpBinding;
import com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity;
import com.bpjstku.presentation.membership.registration.PhoneVerificationActivity;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.internal.zzbrl;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CaptureSession1;
import defpackage.IntegerRes;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.getCameraCharacteristic;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isSticky;
import defpackage.mapPoint;
import defpackage.notifyStateAttached;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
import defpackage.setSurfaceOccupancyPriority;
import defpackage.suspendUseCases;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0015\u0010\u001f\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0015\u0010\t\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0015\u0010\f\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0017\u0010\u000b\u001a\u0004\u0018\u00010#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0019\u001a\u0004\u0018\u00010$8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0017\u0010\n\u001a\u0004\u0018\u00010%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00020&8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010(R\u0014\u0010\u0016\u001a\u00020)8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010*"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/RegistrationActivationVerifyEmailOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationActivationVerifyEmailOtpBinding;", "<init>", "()V", "", "onBackPressed", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "a", "asBinder", "onResume", "onStop", "onDestroy", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LIntegerRes;", "cancelAll", "Lkotlin/Lazy;", "", "g", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "LgetCameraCharacteristic;", "LgetCameraCharacteristic;", "LsetSplitTrack;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LisSticky;", "Lcom/bpjstku/data/lib/PreferenceManager;", "d", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegistrationActivationVerifyEmailOtpActivity extends BindingBaseActivity<ActivityRegistrationActivationVerifyEmailOtpBinding> {
    private static char[] INotificationSideChannel;
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancel;
    private static int getInterfaceDescriptor;
    private static boolean notify;
    private static boolean onTransact;
    private getCameraCharacteristic TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {5, -91, 77, 46};
    private static final int $$f = 179;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {81, 125, 2, 46, -9, 18, -29, -22, -14, 6, -24, -11, 26, -31, -23, -5, -6, -20, -10, 0, -16, -9, -15, 23, -29, -24, -12, -1, -18, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$k = 106;
    private static final byte[] $$a = {60, 80, 13, 34, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 147;
    private static int INotificationSideChannelStub = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int INotificationSideChannelDefault = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: setOverflowReserved
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: setPopupTheme
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: ActionMenuViewActionMenuPresenterCallback
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationActivationVerifyEmailOtpActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c5, code lost:
    
        if (r12 == ((191234143 + (((~((-1053822028) | r1)) | (~(r6 | (-1883809571)))) * 333)) + (((~(r6 | (-1053822028))) | (~(r1 | (-1883809571)))) * 333))) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0100, code lost:
    
        if (r6 == ((((-1392196702) + ((438522045 | r1) * (-757))) + ((~(1539046333 | r12)) * 1514)) + (((~(r12 | (-1100524289))) | ((~(r1 | 1268509588)) | 270536745)) * 757))) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0102, code lost:
    
        r6 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r12 = android.os.Process.myTid();
        r2 = ~r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0137, code lost:
    
        if (r6 == ((((-279003240) + ((r12 | (-2139986883)) * 140)) + (((~((-2139986883) | r2)) | 419725570) * (-280))) + (((~(r12 | (-419725571))) | ((~(424075551 | r2)) | (-2144336864))) * 140))) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0139, code lost:
    
        r6 = com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity.RemoteActionCompatParcelizer + 109;
        com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity.INotificationSideChannelDefault = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0149, code lost:
    
        if ((r6 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x014b, code lost:
    
        r6 = new int[299752448];
        r6[299752447(0x11dddbff, float:3.5003235E-28)] = 0;
        android.widget.Toast.makeText((android.content.Context) null, r6[-1], 0).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0159, code lost:
    
        r6 = new int[299752448];
        r6[299752447(0x11dddbff, float:3.5003235E-28)] = 1;
        r10 = (-2093865984) % 2;
        android.widget.Toast.makeText((android.content.Context) null, r6[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x016a, code lost:
    
        super.onCreate(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0175, code lost:
    
        throw new java.lang.RuntimeException("2047775324");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int r6, java.lang.Object[] r7, int r8, int r9, int r10, int r11, int r12) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(int, java.lang.Object[], int, int, int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity.$$a
            int r5 = 197 - r5
            int r1 = r6 + 1
            int r7 = r7 + 84
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r6
            r3 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L1e
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L1e:
            r4 = r0[r5]
            int r3 = r3 + 1
        L22:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r5 = r5 + 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 27
            int r0 = 53 - r7
            int r8 = r8 * 25
            int r8 = 29 - r8
            byte[] r1 = com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity.$$j
            int r6 = r6 * 27
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-10)
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity.f(short, short, int, java.lang.Object[]):void");
    }

    public static final /* synthetic */ int d() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 21;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i6 = i2 + 97;
        RemoteActionCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public RegistrationActivationVerifyEmailOtpActivity() {
        final RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity = this;
        this.b = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = registrationActivationVerifyEmailOtpActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = registrationActivationVerifyEmailOtpActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setSplitTrack.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<isSticky>() { // from class: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, isSticky] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ isSticky invoke() {
                LifecycleOwner lifecycleOwner = registrationActivationVerifyEmailOtpActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(isSticky.class);
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
        this.asBinder = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = registrationActivationVerifyEmailOtpActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000b8\u0007X\u0087D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000e"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/RegistrationActivationVerifyEmailOtpActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return RegistrationActivationVerifyEmailOtpActivity.d();
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, RegistrationForUnregistered p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, RegistrationActivationVerifyEmailOtpActivity.class, new Pair[]{TuplesKt.to("unregistered_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        getInterfaceDescriptor = 0;
        g();
        INSTANCE = new Companion(null);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 100;
        int i = INotificationSideChannelStub + 15;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegistrationActivationVerifyEmailOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        RegistrationActivationVerifyEmailOtpActivity$bindingInflater$1 registrationActivationVerifyEmailOtpActivity$bindingInflater$1 = RegistrationActivationVerifyEmailOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return registrationActivationVerifyEmailOtpActivity$bindingInflater$1;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 109;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        d_();
        int i4 = RemoteActionCompatParcelizer + 15;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = INotificationSideChannel;
        long j = 0;
        char c = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (31338 - TextUtils.indexOf("", c, 0));
                        int mode = View.MeasureSpec.getMode(0) + 2994;
                        int i4 = 16 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1));
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, mode, i4, 1182129903, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = $11 + 67;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(cancel)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43373 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getEdgeSlop() >> 16) + 253, 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        if (notify) {
            int i7 = $11 + 33;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char modifierMetaStateMask = (char) (33601 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iGreen = Color.green(0) + 3085;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26;
                    byte b3 = (byte) ($$f & 5);
                    byte b4 = (byte) (-b3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, iGreen, keyRepeatTimeout, -2146875848, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onTransact) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                int i9 = $10 + 35;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i11 = $11 + 61;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i13 = $10 + 67;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            try {
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMakeMeasureSpec = (char) (33602 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 3085;
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 26;
                    byte b5 = (byte) ($$f & 5);
                    byte b6 = (byte) (-b5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, absoluteGravity, edgeSlop, -2146875848, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
        int i15 = $11 + 65;
        $10 = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 49 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityRegistrationActivationVerifyEmailOtpBinding activityRegistrationActivationVerifyEmailOtpBinding = (ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityRegistrationActivationVerifyEmailOtpBinding.btnChangeEmail.setOnClickListener(new View.OnClickListener() { // from class: ActionMenuViewLayoutParams
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        activityRegistrationActivationVerifyEmailOtpBinding.btnVerification.setOnClickListener(new View.OnClickListener() { // from class: setPresenter
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, activityRegistrationActivationVerifyEmailOtpBinding, view);
            }
        });
        activityRegistrationActivationVerifyEmailOtpBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: ActionMenuViewMenuBuilderCallback
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityRegistrationActivationVerifyEmailOtpBinding, this);
            }
        });
        OtpView otpView = activityRegistrationActivationVerifyEmailOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: ActionMenuViewActionMenuChildView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityRegistrationActivationVerifyEmailOtpBinding, (String) obj);
            }
        }));
        activityRegistrationActivationVerifyEmailOtpBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: loadActivitiesIfNeeded
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, activityRegistrationActivationVerifyEmailOtpBinding, view);
            }
        });
        int i2 = INotificationSideChannelDefault + 97;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getCameraCharacteristic(((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, null);
        int i2 = RemoteActionCompatParcelizer + 5;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity = (RegistrationActivationVerifyEmailOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 11;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        ((IntegerRes) registrationActivationVerifyEmailOtpActivity.b.getValue()).b();
        getCameraCharacteristic getcameracharacteristic = registrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i4 = INotificationSideChannelDefault + 89;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity = this;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).onTransact.observe(registrationActivationVerifyEmailOtpActivity, new Observer() { // from class: ActionMenuView
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((isSticky) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(registrationActivationVerifyEmailOtpActivity, new Observer() { // from class: hasSupportDividerBeforeChildAt
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws IllegalAccessException {
                RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1775832932, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj}, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1775832933, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        });
        ((isSticky) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(registrationActivationVerifyEmailOtpActivity, new Observer() { // from class: setMenuCallbacks
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((IntegerRes) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(registrationActivationVerifyEmailOtpActivity, new Observer() { // from class: peekMenu
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws IllegalAccessException {
                RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(721269119, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj}, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -721269114, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        });
        int i2 = INotificationSideChannelDefault + 93;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0084  */
    /* JADX WARN: Code duplicated, block: B:15:0x0090  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        RegistrationForUnregistered registrationForUnregistered;
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity = this;
        Intrinsics.checkNotNullParameter(registrationActivationVerifyEmailOtpActivity, "");
        registrationActivationVerifyEmailOtpActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_email_verification));
        TextView textView = ((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvEmail;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.a.getValue();
        if (registeredMemberRegistration != null) {
            int i4 = RemoteActionCompatParcelizer + 59;
            INotificationSideChannelDefault = i4 % 128;
            if (i4 % 2 == 0) {
                str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                int i5 = 8 / 0;
                if (str == null) {
                    registrationForUnregistered = (RegistrationForUnregistered) this.g.getValue();
                    if (registrationForUnregistered != null) {
                        int i6 = RemoteActionCompatParcelizer + 37;
                        INotificationSideChannelDefault = i6 % 128;
                        int i7 = i6 % 2;
                        str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        str = null;
                    }
                }
            } else {
                str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                if (str == null) {
                    registrationForUnregistered = (RegistrationForUnregistered) this.g.getValue();
                    if (registrationForUnregistered != null) {
                        int i8 = RemoteActionCompatParcelizer + 37;
                        INotificationSideChannelDefault = i8 % 128;
                        int i9 = i8 % 2;
                        str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        str = null;
                    }
                }
            }
        } else {
            registrationForUnregistered = (RegistrationForUnregistered) this.g.getValue();
            if (registrationForUnregistered != null) {
                int i10 = RemoteActionCompatParcelizer + 37;
                INotificationSideChannelDefault = i10 % 128;
                int i11 = i10 % 2;
                str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                str = null;
            }
        }
        int i12 = RemoteActionCompatParcelizer + 87;
        INotificationSideChannelDefault = i12 % 128;
        int i13 = i12 % 2;
        textView.setText(str);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        getCameraCharacteristic getcameracharacteristic = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        if (i4 != (((~(i5 | 425488783)) | (-1255476327)) * 56) + 346984296 + (((~((~i5) | (-1255476327))) | 425488783) * 56)) {
            int i6 = (-1574157748) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i8 = ~iNextInt;
        if (i7 != (-441373181) + (((~(i8 | (-1874875361))) | 1719681728 | (~((-3770398) | iNextInt))) * 717) + (((~(iNextInt | (-1874875361))) | (~(i8 | (-3770398))) | 1719681728) * 717)) {
            throw null;
        }
        super.onResume();
        getCameraCharacteristic getcameracharacteristic2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (getcameracharacteristic2 == null) {
            int i9 = INotificationSideChannelDefault + 25;
            RemoteActionCompatParcelizer = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            getcameracharacteristic = getcameracharacteristic2;
        }
        getcameracharacteristic.b();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj = null;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i2 = RemoteActionCompatParcelizer + 21;
            INotificationSideChannelDefault = i2 % 128;
            if (i2 % 2 == 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                obj.hashCode();
                throw null;
            }
            tuitionPaymentFragmentbindingInflater1.cancel();
            int i3 = RemoteActionCompatParcelizer + 13;
            INotificationSideChannelDefault = i3 % 128;
            int i4 = i3 % 2;
        }
        getcameracharacteristic.b = null;
        super.onStop();
        int i5 = INotificationSideChannelDefault + 35;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        getCameraCharacteristic getcameracharacteristic;
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 35;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = 21 / 0;
            if (getcameracharacteristic == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = RemoteActionCompatParcelizer + 41;
                INotificationSideChannelDefault = i4 % 128;
                int i5 = i4 % 2;
                getcameracharacteristic = null;
            }
        } else {
            getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (getcameracharacteristic == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = RemoteActionCompatParcelizer + 41;
                INotificationSideChannelDefault = i6 % 128;
                int i7 = i6 % 2;
                getcameracharacteristic = null;
            }
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        INotificationSideChannelDefault = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = RemoteActionCompatParcelizer + 33;
                INotificationSideChannelDefault = i3 % 128;
                int i4 = i3 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArr2;
        RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity = (RegistrationActivationVerifyEmailOtpActivity) objArr[0];
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int gidForName = Process.getGidForName("") + 877;
            int offsetBefore = 10 - TextUtils.getOffsetBefore("", 0);
            byte b = $$a[7];
            Object[] objArr3 = new Object[1];
            c((short) 89, b, (byte) (b | 14), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, gidForName, offsetBefore, 252381699, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0'), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
            int deadChar = KeyEvent.getDeadChar(0, 0) + 876;
            int iIndexOf = 10 - TextUtils.indexOf("", "", 0);
            short s = (short) 52;
            Object[] objArr6 = new Object[1];
            c(s, (byte) s, $$a[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, deadChar, iIndexOf, 2009631821, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) Color.green(0);
                int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 10;
                byte[] bArr = $$a;
                short s2 = bArr[7];
                Object[] objArr7 = new Object[1];
                c(s2, (byte) s2, bArr[54], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, edgeSlop, iIndexOf2, 256017550, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i2 = ~(459383425 | iUptimeMillis);
            int i3 = ~iUptimeMillis;
            int i4 = 1497039684 + ((i2 | (~((-35717762) | i3))) * (-406)) + ((~(535411415 | i3)) * (-406)) + (((~(iUptimeMillis | (-499693655))) | (~((-459383426) | i3))) * 406) + 8051527;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr2[1])[0] = i6 ^ (i6 << 5);
        } else {
            Context baseContext = registrationActivationVerifyEmailOtpActivity.getBaseContext();
            if (baseContext == null) {
                Object[] objArr9 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_dompetku).substring(0, 16).length() + 111, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                e(null, null, 127 - ExpandableListView.getPackedPositionGroup(0L), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr10);
                baseContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.card_detail_title).substring(8, 9).length() + 126, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step5).substring(28, 30).codePointAt(1) + 30, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, registrationActivationVerifyEmailOtpActivity)).intValue();
            int i7 = RemoteActionCompatParcelizer + 17;
            INotificationSideChannelDefault = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr13 = {baseContext, Integer.valueOf(iIntValue), 8051527};
                byte[] bArr2 = $$j;
                byte b2 = bArr2[32];
                byte b3 = b2;
                Object[] objArr14 = new Object[1];
                f(b2, b3, b3, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b4 = bArr2[19];
                byte b5 = b4;
                Object[] objArr15 = new Object[1];
                f(b4, b5, b5, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (baseContext != null) {
                    int i9 = RemoteActionCompatParcelizer + 117;
                    INotificationSideChannelDefault = i9 % 128;
                    int i10 = i9 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int iCombineMeasuredStates = 876 - View.combineMeasuredStates(0, 0);
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0);
                        byte[] bArr3 = $$a;
                        short s3 = bArr3[7];
                        Object[] objArr17 = new Object[1];
                        c(s3, (byte) s3, bArr3[54], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates, iCombineMeasuredStates, iLastIndexOf, 256017550, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step7).substring(16, 17).length() + 126, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char gidForName2 = (char) (Process.getGidForName("") + 1);
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                            int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0');
                            short s4 = (short) 52;
                            Object[] objArr20 = new Object[1];
                            c(s4, (byte) s4, $$a[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName2, scrollDefaultDelay, iLastIndexOf2, 2009631821, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cRgb2 = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                            int packedPositionType = 876 - ExpandableListView.getPackedPositionType(0L);
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                            byte b6 = $$a[7];
                            Object[] objArr21 = new Object[1];
                            c((short) 89, b6, (byte) (b6 | 14), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb2, packedPositionType, scrollBarFadeDuration, 252381699, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr2 = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i11 = ((int[]) objArr2[2])[0];
        int i12 = ((int[]) objArr2[0])[0];
        if (i12 != i11) {
            throw new RuntimeException(String.valueOf(i12));
        }
        int i13 = RemoteActionCompatParcelizer + 115;
        INotificationSideChannelDefault = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArr2[1])[0];
        Object[] objArr22 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
        int iMyPid = Process.myPid();
        int i16 = i15 + ((((~(1072508671 | iMyPid)) | 21234856) * 449) - 1328664700) + (((~((~iMyPid) | 1072508671)) | 21234856) * 449);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr22[1])[0] = i18 ^ (i18 << 5);
        int i19 = INotificationSideChannelDefault + 67;
        RemoteActionCompatParcelizer = i19 % 128;
        if (i19 % 2 == 0) {
            return Integer.valueOf(R.layout.activity_registration_activation_verify_email_otp);
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 67;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int i4 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 16;
            Object[] objArr2 = new Object[1];
            c((short) 193, (byte) 52, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, i4, iLastIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 81, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_instruction_text).substring(0, 53).length() + 74, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
            int i5 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14;
            Object[] objArr5 = new Object[1];
            c((short) 141, (byte) 52, $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iResolveSizeAndState, i5, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = INotificationSideChannelDefault + 19;
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int iMyTid = (Process.myTid() >> 22) + 1031;
                int doubleTapTimeout = 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b = $$a[7];
                Object[] objArr6 = new Object[1];
                c((short) 89, b, (byte) (b | 14), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, iMyTid, doubleTapTimeout, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[3])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_expiration_message).substring(3, 4).codePointAt(0) + 1670729357;
            int i10 = ~iCodePointAt;
            int i11 = (((1581789188 + (((~((-912189309) | i10)) | (~(667909138 | i10))) * (-867))) + ((((~((-912189309) | iCodePointAt)) | 269517676) | (~(667909138 | iCodePointAt))) * (-1734))) + (((~(iCodePointAt | 937426814)) | ((~(i10 | (-269517677))) | (~((-642671633) | iCodePointAt)))) * 867)) - 1103726855;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-141430668};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 46038), Color.argb(0, 0, 0, 0) + 1134, 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1103726855, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int modifierMetaStateMask = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int iCombineMeasuredStates = 15 - View.combineMeasuredStates(0, 0);
                    Object[] objArr12 = new Object[1];
                    c((short) 193, (byte) 52, $$a[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, modifierMetaStateMask, iCombineMeasuredStates, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 45994), 1116 - MotionEvent.axisFromString(""), (-16777199) - Color.rgb(0, 0, 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                    int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b2 = $$a[7];
                    Object[] objArr13 = new Object[1];
                    c((short) 89, b2, (byte) (b2 | 14), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, windowTouchSlop, jumpTapTimeout, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 12, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_instruction_step2).substring(5, 8).codePointAt(1) + 75, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int i14 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
                        Object[] objArr16 = new Object[1];
                        c((short) 141, (byte) 52, $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSizeAndState, i14, iIndexOf, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i15 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
                        int iNormalizeMetaState = 15 - KeyEvent.normalizeMetaState(0);
                        Object[] objArr17 = new Object[1];
                        c((short) 193, (byte) 52, $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i15, iNormalizeMetaState, 1357589585, false, (String) objArr17[0], null);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 == i16) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = i18 + (((1739565539 + (((~iIdentityHashCode) | 9448448) * 1324)) + (((~(iIdentityHashCode | 234045225)) | (~(10234944 | iIdentityHashCode))) * (-1324))) - 1120128634);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i24 = 0;
                while (i24 < strArr3.length) {
                    arrayList.add(strArr3[i24]);
                    i24++;
                    int i25 = INotificationSideChannelDefault + 87;
                    RemoteActionCompatParcelizer = i25 % 128;
                    int i26 = i25 % 2;
                }
            }
            int[] iArr = new int[i17];
            int i27 = i17 - 1;
            iArr[i27] = 1;
            Toast.makeText((Context) null, iArr[((i17 * i27) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i31 = ~startUptimeMillis;
            int i32 = (~(75888125 | i31)) | (-395703808) | (~(320168295 | i31));
            int i33 = i28 + (-1500774237) + (((~(startUptimeMillis | (-352614))) | i32) * 590) + (i32 * (-1180)) + (((~((-320168296) | i31)) | (~(i31 | (-75888126)))) * 590);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr19[2])[0] = i35 ^ (i35 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char maximumDrawingCacheSize = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
            Object[] objArr20 = new Object[1];
            c((short) 89, (byte) 37, $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumDrawingCacheSize, tapTimeout, iMakeMeasureSpec, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 23;
                Object[] objArr21 = new Object[1];
                c((short) 141, (byte) 52, $$a[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(touchSlop, packedPositionGroup, deadChar, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret).substring(0, 9).length() - 1017885983;
            int i36 = ~((-288686147) | length);
            int i37 = ~length;
            int i38 = (-628493902) + ((i36 | (~(1040183915 | i37))) * 497) + (((~(length | 1040183915)) | (~((-964100196) | i37)) | 675414049) * 497) + 1616811080;
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i40 ^ (i40 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardCriticalTitle).substring(0, 17).length() + 110, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-141430668};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - View.resolveSizeAndState(0, 0, 0)), 1726 - (Process.myTid() >> 22), 28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 1616811080);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cCombineMeasuredStates2 = (char) (View.combineMeasuredStates(0, 0) + 29944);
                int iBlue = 1755 - Color.blue(0);
                int edgeSlop = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
                Object[] objArr26 = new Object[1];
                c((short) 141, (byte) 52, $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cCombineMeasuredStates2, iBlue, edgeSlop, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step6).substring(20, 21).codePointAt(0) + 12, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                    int i41 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                    int size = 23 - View.MeasureSpec.getSize(0);
                    short s = (short) 52;
                    Object[] objArr29 = new Object[1];
                    c(s, (byte) s, $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(keyRepeatDelay, i41, size, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char mode = (char) (View.MeasureSpec.getMode(0) + 29944);
                    int i42 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                    int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                    Object[] objArr30 = new Object[1];
                    c((short) 89, (byte) 37, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(mode, i42, threadPriority, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i43 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i44 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i44 != i43) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr5 != null) {
                for (String str : strArr5) {
                    arrayList2.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i44));
        }
        int i45 = RemoteActionCompatParcelizer + 7;
        INotificationSideChannelDefault = i45 % 128;
        int i46 = i45 % 2;
        int i47 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_yes).substring(0, 1).codePointAt(0) + 1990397219;
        int i48 = ~iCodePointAt2;
        int i49 = i47 + (((~((-127896504) | i48)) | (~(iCodePointAt2 | 84705922))) * 959) + 1742509165 + (((~(iCodePointAt2 | (-127896504))) | (~(i48 | 84705922))) * 959);
        int i50 = (i49 << 13) ^ i49;
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr31[3])[0] = i51 ^ (i51 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -592423508
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity.onStart():void");
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 81;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.getIntent().getParcelableExtra("registration_data");
        int i4 = RemoteActionCompatParcelizer + 97;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
        return registeredMemberRegistration;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity = (RegistrationActivationVerifyEmailOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        registrationActivationVerifyEmailOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = RemoteActionCompatParcelizer + 41;
        INotificationSideChannelDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 25;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.getIntent().getParcelableExtra("unregistered_data");
        int i4 = RemoteActionCompatParcelizer + 105;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return registrationForUnregistered;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01f7 A[PHI: r4
  0x01f7: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:112:0x020f, B:104:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6 A[PHI: r3
  0x00c6: PHI (r3v42 java.lang.String) = (r3v31 java.lang.String), (r3v40 java.lang.String), (r3v53 java.lang.String) binds: [B:37:0x00c2, B:31:0x00b1, B:22:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0107 A[PHI: r1
  0x0107: PHI (r1v25 java.lang.String) = (r1v23 java.lang.String), (r1v34 java.lang.String) binds: [B:58:0x0122, B:49:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ab  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity, ActivityRegistrationActivationVerifyEmailOtpBinding activityRegistrationActivationVerifyEmailOtpBinding, View view) {
        String str;
        String str2;
        RegistrationForUnregistered registrationForUnregistered;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
            String str8 = null;
            if (registeredMemberRegistration != null) {
                int i4 = INotificationSideChannelDefault + 85;
                RemoteActionCompatParcelizer = i4 % 128;
                if (i4 % 2 != 0) {
                    String str9 = registeredMemberRegistration.asInterface;
                    throw null;
                }
                str = registeredMemberRegistration.asInterface;
                int i5 = RemoteActionCompatParcelizer + 43;
                INotificationSideChannelDefault = i5 % 128;
                int i6 = i5 % 2;
            } else {
                str = null;
            }
            String str10 = "";
            if (Intrinsics.areEqual(StringsKt.split$default((CharSequence) String.valueOf(str), new String[]{"#"}, false, 0, 6, (Object) null).get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
                isSticky issticky = (isSticky) registrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                String string = ((PreferenceManager) registrationActivationVerifyEmailOtpActivity.asBinder.getValue()).getString("OCR_TRANSACTION_ID", "");
                if (((RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                    str3 = registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1 : null;
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                } else if (((RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue()) != null) {
                    int i7 = RemoteActionCompatParcelizer + 29;
                    INotificationSideChannelDefault = i7 % 128;
                    int i8 = i7 % 2;
                    RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue();
                    str3 = registrationForUnregistered2 != null ? registrationForUnregistered2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                } else {
                    MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) registrationActivationVerifyEmailOtpActivity.asInterface.getValue();
                    str3 = migrantWorkerRegistration != null ? migrantWorkerRegistration.getItem : null;
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                }
                String string2 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationActivationVerifyEmailOtpBinding.otpVerify.getText())).toString();
                if (((RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                    if (registeredMemberRegistration3 != null) {
                        int i9 = RemoteActionCompatParcelizer + 71;
                        INotificationSideChannelDefault = i9 % 128;
                        if (i9 % 2 == 0) {
                            str5 = registeredMemberRegistration3.INotificationSideChannel;
                            int i10 = 43 / 0;
                        } else {
                            str5 = registeredMemberRegistration3.INotificationSideChannel;
                        }
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                } else {
                    if (((RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue()) != null) {
                        RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue();
                        str5 = registrationForUnregistered3 != null ? registrationForUnregistered3.connect : null;
                        if (str5 != null) {
                            str6 = str5;
                        }
                    }
                    str6 = "";
                }
                RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                if (registeredMemberRegistration4 != null) {
                    int i11 = INotificationSideChannelDefault + 27;
                    RemoteActionCompatParcelizer = i11 % 128;
                    if (i11 % 2 != 0) {
                        str8 = registeredMemberRegistration4.TuitionPaymentFragmentbindingInflater1;
                        int i12 = 90 / 0;
                    } else {
                        str8 = registeredMemberRegistration4.TuitionPaymentFragmentbindingInflater1;
                    }
                }
                if (str8 == null) {
                    int i13 = RemoteActionCompatParcelizer + 33;
                    INotificationSideChannelDefault = i13 % 128;
                    int i14 = i13 % 2;
                    str7 = "";
                } else {
                    str7 = str8;
                }
                issticky.b(string, str4, string2, str6, str7);
            } else {
                isSticky issticky2 = (isSticky) registrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (((RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                    str2 = registeredMemberRegistration5 != null ? registeredMemberRegistration5.TuitionPaymentFragmentbindingInflater1 : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                } else if (((RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue()) != null) {
                    int i15 = INotificationSideChannelDefault + 79;
                    RemoteActionCompatParcelizer = i15 % 128;
                    if (i15 % 2 != 0) {
                        registrationForUnregistered = (RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue();
                        int i16 = 36 / 0;
                        if (registrationForUnregistered != null) {
                            str2 = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        } else {
                            str2 = null;
                        }
                    } else {
                        registrationForUnregistered = (RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue();
                        if (registrationForUnregistered != null) {
                            str2 = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        } else {
                            str2 = null;
                        }
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                } else {
                    MigrantWorkerRegistration migrantWorkerRegistration2 = (MigrantWorkerRegistration) registrationActivationVerifyEmailOtpActivity.asInterface.getValue();
                    str2 = migrantWorkerRegistration2 != null ? migrantWorkerRegistration2.getItem : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                }
                String string3 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationActivationVerifyEmailOtpBinding.otpVerify.getText())).toString();
                if (((RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue()) != null) {
                    int i17 = RemoteActionCompatParcelizer + 95;
                    INotificationSideChannelDefault = i17 % 128;
                    int i18 = i17 % 2;
                    RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                    str8 = registeredMemberRegistration6 != null ? registeredMemberRegistration6.INotificationSideChannel : null;
                    if (str8 != null) {
                        str10 = str8;
                    }
                } else if (((RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue()) != null) {
                    RegistrationForUnregistered registrationForUnregistered4 = (RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue();
                    str8 = registrationForUnregistered4 != null ? registrationForUnregistered4.connect : null;
                    if (str8 != null) {
                        str10 = str8;
                    }
                }
                issticky2.b(str2, string3, str10);
                int i19 = RemoteActionCompatParcelizer + 69;
                INotificationSideChannelDefault = i19 % 128;
                int i20 = i19 % 2;
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        int i3 = i2 % 128;
        INotificationSideChannelDefault = i3;
        getCameraCharacteristic getcameracharacteristic = null;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getcameracharacteristic.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registrationActivationVerifyEmailOtpActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                registrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            return;
        }
        int i4 = i3 + 75;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        registrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
        getCameraCharacteristic getcameracharacteristic2 = registrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (getcameracharacteristic2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            getcameracharacteristic = getcameracharacteristic2;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 17;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            registrationActivationVerifyEmailOtpActivity.d_();
            return Unit.INSTANCE;
        }
        registrationActivationVerifyEmailOtpActivity.d_();
        int i3 = 14 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityRegistrationActivationVerifyEmailOtpBinding activityRegistrationActivationVerifyEmailOtpBinding, RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 53;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        OtpView otpView = activityRegistrationActivationVerifyEmailOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, registrationActivationVerifyEmailOtpActivity);
        int i4 = INotificationSideChannelDefault + 49;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity, ActivityRegistrationActivationVerifyEmailOtpBinding activityRegistrationActivationVerifyEmailOtpBinding, View view) {
        String str;
        RegisteredMemberRegistration registeredMemberRegistration;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (((RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue()) != null) {
                int i2 = INotificationSideChannelDefault + 101;
                RemoteActionCompatParcelizer = i2 % 128;
                if (i2 % 2 != 0) {
                    registeredMemberRegistration = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                    int i3 = 61 / 0;
                    if (registeredMemberRegistration != null) {
                        str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                    } else {
                        str = null;
                    }
                } else {
                    registeredMemberRegistration = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                    if (registeredMemberRegistration != null) {
                        str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                    } else {
                        str = null;
                    }
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue();
                if (registrationForUnregistered != null) {
                    str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    str = null;
                }
            }
            activityRegistrationActivationVerifyEmailOtpBinding.otpVerify.getEditableText().clear();
            if (str != null) {
                setSplitTrack setsplittrack = (setSplitTrack) registrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                String string = Settings.Secure.getString(registrationActivationVerifyEmailOtpActivity.getContentResolver(), "android_id");
                Intrinsics.checkExpressionValueIsNotNull(string, "");
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new EmailVerificationRequest(string, str, String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.INotificationSideChannel : null)));
                int i4 = INotificationSideChannelDefault + 37;
                RemoteActionCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 25;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                registrationActivationVerifyEmailOtpActivity.onBackPressed();
                ViewPortBuilder.b();
            } else {
                registrationActivationVerifyEmailOtpActivity.onBackPressed();
                ViewPortBuilder.b();
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ MigrantWorkerRegistration b(RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) registrationActivationVerifyEmailOtpActivity.getIntent().getParcelableExtra("migration_worker_data");
        int i4 = INotificationSideChannelDefault + 103;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return migrantWorkerRegistration;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityRegistrationActivationVerifyEmailOtpBinding activityRegistrationActivationVerifyEmailOtpBinding, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 6) {
            MaterialButton materialButton = activityRegistrationActivationVerifyEmailOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
            int i2 = RemoteActionCompatParcelizer + 83;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
        } else {
            MaterialButton materialButton3 = activityRegistrationActivationVerifyEmailOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannelDefault + 3;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        MembershipType membershipType;
        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        final RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity = (RegistrationActivationVerifyEmailOtpActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 73;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registrationActivationVerifyEmailOtpActivity.MediaBrowserCompat();
            return null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
                registrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) registrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
            return null;
        }
        int i5 = i3 + 77;
        INotificationSideChannelDefault = i5 % 128;
        int i6 = i5 % 2;
        registrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
        VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
        Object obj2 = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
        String str = registrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1;
        if (str == null) {
            int i7 = RemoteActionCompatParcelizer + 123;
            INotificationSideChannelDefault = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        if (!Intrinsics.areEqual(obj2, str)) {
            String string = registrationActivationVerifyEmailOtpActivity.getString(R.string.error_signature_checking);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(registrationActivationVerifyEmailOtpActivity, string, "Coba Kembali", new Function0() { // from class: getPopupTheme
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
                }
            });
            return null;
        }
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
        if (registeredMemberRegistration != null) {
            int i9 = INotificationSideChannelDefault + 1;
            RemoteActionCompatParcelizer = i9 % 128;
            int i10 = i9 % 2;
            RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, null, null, null, ((OtpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum(), null, null, null, null, null, null, null, null, null, 8380415);
            int i11 = RemoteActionCompatParcelizer + 67;
            INotificationSideChannelDefault = i11 % 128;
            int i12 = i11 % 2;
        }
        String checkSum = ((OtpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum();
        if (((RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue()) != null) {
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
            if (registeredMemberRegistration2 != null) {
                membershipType = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else {
                int i13 = INotificationSideChannelDefault + 67;
                RemoteActionCompatParcelizer = i13 % 128;
                int i14 = i13 % 2;
                membershipType = null;
            }
            if (membershipType == MembershipType.PU) {
                RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                if (registeredMemberRegistration3 != null) {
                    int i15 = INotificationSideChannelDefault + 43;
                    RemoteActionCompatParcelizer = i15 % 128;
                    if (i15 % 2 != 0) {
                        RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration3, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415);
                        obj.hashCode();
                        throw null;
                    }
                    registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault5 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration3, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415);
                } else {
                    registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault5 = null;
                }
                Intent intent = new Intent();
                intent.putExtra("registration_data", registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                registrationActivationVerifyEmailOtpActivity.setResult(-1, intent);
                registrationActivationVerifyEmailOtpActivity.finish();
            } else {
                RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                if ((registeredMemberRegistration4 != null ? registeredMemberRegistration4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null) == MembershipType.BPU) {
                    RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                    if (registeredMemberRegistration5 != null) {
                        int i16 = RemoteActionCompatParcelizer + 29;
                        INotificationSideChannelDefault = i16 % 128;
                        int i17 = i16 % 2;
                        registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault4 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration5, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415);
                    } else {
                        registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault4 = null;
                    }
                    Intent intent2 = new Intent();
                    intent2.putExtra("registration_data", registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    registrationActivationVerifyEmailOtpActivity.setResult(-1, intent2);
                    registrationActivationVerifyEmailOtpActivity.finish();
                } else {
                    RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue();
                    if (registeredMemberRegistration6 != null) {
                        int i18 = RemoteActionCompatParcelizer + 31;
                        INotificationSideChannelDefault = i18 % 128;
                        if (i18 % 2 == 0) {
                            registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration6, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415);
                            int i19 = 58 / 0;
                        } else {
                            registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration6, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415);
                        }
                    } else {
                        registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    }
                    PhoneActivationVerificationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = PhoneActivationVerificationActivity.INSTANCE;
                    PhoneActivationVerificationActivity.Companion.b(registrationActivationVerifyEmailOtpActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    registrationActivationVerifyEmailOtpActivity.d_();
                }
            }
        }
        if (((RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue()) != null) {
            PhoneActivationVerificationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault4 = PhoneActivationVerificationActivity.INSTANCE;
            PhoneActivationVerificationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationVerifyEmailOtpActivity, (RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue());
            registrationActivationVerifyEmailOtpActivity.d_();
        }
        if (((MigrantWorkerRegistration) registrationActivationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
            int i20 = INotificationSideChannelDefault + 119;
            RemoteActionCompatParcelizer = i20 % 128;
            if (i20 % 2 != 0) {
                IndonesianMigrantWorkerRegistrationSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault5 = IndonesianMigrantWorkerRegistrationSuccessActivity.INSTANCE;
                IndonesianMigrantWorkerRegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationActivationVerifyEmailOtpActivity, (MigrantWorkerRegistration) registrationActivationVerifyEmailOtpActivity.asInterface.getValue());
                throw null;
            }
            IndonesianMigrantWorkerRegistrationSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault6 = IndonesianMigrantWorkerRegistrationSuccessActivity.INSTANCE;
            IndonesianMigrantWorkerRegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationActivationVerifyEmailOtpActivity, (MigrantWorkerRegistration) registrationActivationVerifyEmailOtpActivity.asInterface.getValue());
        }
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = INotificationSideChannelDefault + 49;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            registrationActivationVerifyEmailOtpActivity.MediaBrowserCompat();
            int i4 = INotificationSideChannelDefault + 13;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i5 = INotificationSideChannelDefault + 71;
                RemoteActionCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                registrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) registrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            return;
        }
        int i7 = INotificationSideChannelDefault + 85;
        RemoteActionCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        registrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
        Object obj = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
        String str = registrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        if (!Intrinsics.areEqual(obj, str)) {
            String string = registrationActivationVerifyEmailOtpActivity.getString(R.string.error_signature_checking);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(registrationActivationVerifyEmailOtpActivity, string, "Coba Kembali", new Function0() { // from class: onMeasureExactFormat
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            });
            return;
        }
        if (((RegisteredMemberRegistration) registrationActivationVerifyEmailOtpActivity.a.getValue()) != null) {
            int i9 = INotificationSideChannelDefault + 25;
            RemoteActionCompatParcelizer = i9 % 128;
            if (i9 % 2 != 0) {
                registrationActivationVerifyEmailOtpActivity.setResult(-1);
                registrationActivationVerifyEmailOtpActivity.finish();
                int i10 = 86 / 0;
            } else {
                registrationActivationVerifyEmailOtpActivity.setResult(-1);
                registrationActivationVerifyEmailOtpActivity.finish();
            }
        }
        if (((RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue()) != null) {
            PhoneVerificationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = PhoneVerificationActivity.INSTANCE;
            PhoneVerificationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationActivationVerifyEmailOtpActivity, (RegistrationForUnregistered) registrationActivationVerifyEmailOtpActivity.g.getValue());
            registrationActivationVerifyEmailOtpActivity.d_();
        }
        if (((MigrantWorkerRegistration) registrationActivationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
            int i11 = RemoteActionCompatParcelizer + 59;
            INotificationSideChannelDefault = i11 % 128;
            if (i11 % 2 != 0) {
                IndonesianMigrantWorkerRegistrationSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = IndonesianMigrantWorkerRegistrationSuccessActivity.INSTANCE;
                IndonesianMigrantWorkerRegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationActivationVerifyEmailOtpActivity, (MigrantWorkerRegistration) registrationActivationVerifyEmailOtpActivity.asInterface.getValue());
            } else {
                IndonesianMigrantWorkerRegistrationSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault4 = IndonesianMigrantWorkerRegistrationSuccessActivity.INSTANCE;
                IndonesianMigrantWorkerRegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationActivationVerifyEmailOtpActivity, (MigrantWorkerRegistration) registrationActivationVerifyEmailOtpActivity.asInterface.getValue());
                throw null;
            }
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity = (RegistrationActivationVerifyEmailOtpActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = INotificationSideChannelDefault + 1;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                registrationActivationVerifyEmailOtpActivity.MediaBrowserCompat();
                return null;
            }
            registrationActivationVerifyEmailOtpActivity.MediaBrowserCompat();
            obj.hashCode();
            throw null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                registrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
            return null;
        }
        int i3 = INotificationSideChannelDefault + 115;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            registrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
            registrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1 = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString();
            return null;
        }
        registrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
        registrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1 = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString();
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(RegistrationActivationVerifyEmailOtpActivity registrationActivationVerifyEmailOtpActivity) {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(665835068, new Object[]{registrationActivationVerifyEmailOtpActivity}, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -665835064, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(1302436471, new Object[]{this}, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1302436468, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        INotificationSideChannelDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(1061514124, new Object[]{this}, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1061514122, setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 950438313, (-317353510) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1063).substring(0, 53).codePointAt(24));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1549269514, new Object[]{this, bundle}, zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1549269514, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_shopeepay_deeplink).substring(1, 3).codePointAt(1) - 736514838, zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), zzbrl.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = INotificationSideChannelDefault + 47;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        INotificationSideChannel = new char[]{47320, 47307, 47317, 47303, 47306, 47312, 47243, 47302, 47270, 47296, 47301, 47316, 47308, 47286, 47309, 47318, 47310, 47305, 47271, 47288, 47299, 47269, 47313, 47300, 47311, 47314, 47281};
        cancel = 2047719545;
        onTransact = true;
        notify = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, short r7, short r8) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity.$$c
            int r6 = 68 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L27:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyEmailOtpActivity.$$i(short, short, short):java.lang.String");
    }
}
