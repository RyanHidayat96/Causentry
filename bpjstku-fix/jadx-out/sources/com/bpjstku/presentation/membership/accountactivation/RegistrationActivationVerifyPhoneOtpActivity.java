package com.bpjstku.presentation.membership.accountactivation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.databinding.ActivityRegistrationActivationVerifyPhoneOtpBinding;
import com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity;
import com.bpjstku.presentation.membership.registration.RegistrationPasswordActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationActivity;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.C0170absent;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CoordinateTransform;
import defpackage.IntegerRes;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.getCameraCharacteristic;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getSelectedTab;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isSticky;
import defpackage.mapPoint;
import defpackage.notifyStateAttached;
import defpackage.registerAvailabilityCallback;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
import defpackage.suspendUseCases;
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
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0015\u0010\u0006\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010\b\u001a\u00020\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0015\u0010\n\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0015\u0010\u0019\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0015\u0010\t\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0017R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010%R\u0014\u0010(\u001a\u00020&8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010'"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/RegistrationActivationVerifyPhoneOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationActivationVerifyPhoneOtpBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a", "asInterface", "asBinder", "onBackPressed", "onResume", "onStop", "onDestroy", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "g", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/lib/PreferenceManager;", "", "Ljava/lang/String;", "LgetCameraCharacteristic;", "LgetCameraCharacteristic;", "LsetSplitTrack;", "LisSticky;", "LIntegerRes;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegistrationActivationVerifyPhoneOtpActivity extends BindingBaseActivity<ActivityRegistrationActivationVerifyPhoneOtpBinding> {
    private static int INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static boolean cancel;
    private static int cancelAll;
    private static char[] d;
    private static boolean onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private getCameraCharacteristic TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy g;
    private static final byte[] $$c = {108, -26, -110, 50};
    private static final int $$f = 13;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {23, -73, 107, 5, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 240;
    private static int INotificationSideChannelDefault = 1;
    private static int notify = 0;
    private static int INotificationSideChannel = 1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: readHistoricalDataIfNeeded
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: sortActivitiesIfNeeded
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = (~((~i) | i8)) | i7;
        int i10 = i5 | i8;
        int i11 = (~(i | i7 | i8)) | (~(i3 | i5));
        int i12 = i3 + i5 + i2 + (2049387148 * i6) + ((-609071723) * i4);
        int i13 = i12 * i12;
        int i14 = ((1483459036 * i3) - 1284505600) + (2005429323 * i5) + (i9 * 1605645861) + (1083675574 * i10) + (1605645861 * i11) + ((-1205862400) * i2) + ((-243269632) * i6) + ((-895483904) * i4) + ((-1334837248) * i13);
        int i15 = ((i3 * 335895516) - 1139737737) + (i5 * 335898315) + (i9 * 933) + (i10 * (-1866)) + (i11 * 933) + (i2 * 335896449) + (i6 * (-616405876)) + (i4 * 126640917) + (i13 * 2020605952);
        int i16 = i14 + (i15 * i15 * (-544210944));
        if (i16 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i16 == 2) {
            return b(objArr);
        }
        if (i16 != 3) {
            if (i16 == 4) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            }
            final RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity = (RegistrationActivationVerifyPhoneOtpActivity) objArr[0];
            int i17 = 2 % 2;
            final ActivityRegistrationActivationVerifyPhoneOtpBinding activityRegistrationActivationVerifyPhoneOtpBinding = (ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: getActivityCount
                @Override // defpackage.notifyStateAttached
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                    RegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityRegistrationActivationVerifyPhoneOtpBinding, registrationActivationVerifyPhoneOtpActivity);
                }
            });
            OtpView otpView = activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: ensureConsistentState
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityRegistrationActivationVerifyPhoneOtpBinding, (String) obj);
                }
            }));
            activityRegistrationActivationVerifyPhoneOtpBinding.btnVerification.setOnClickListener(new View.OnClickListener() { // from class: ActivityChooserModel
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, activityRegistrationActivationVerifyPhoneOtpBinding, view);
                }
            });
            activityRegistrationActivationVerifyPhoneOtpBinding.btnChangePhone.setOnClickListener(new View.OnClickListener() { // from class: pruneExcessiveHistoricalRecordsIfNeeded
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RegistrationActivationVerifyPhoneOtpActivity.b(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
            activityRegistrationActivationVerifyPhoneOtpBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: ActionMenuViewOnMenuItemClickListener
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityRegistrationActivationVerifyPhoneOtpBinding, registrationActivationVerifyPhoneOtpActivity, view);
                }
            });
            int i18 = notify + 101;
            INotificationSideChannel = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }
        RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity2 = (RegistrationActivationVerifyPhoneOtpActivity) objArr[0];
        int i20 = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = registrationActivationVerifyPhoneOtpActivity2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i21 = INotificationSideChannel + 103;
            notify = i21 % 128;
            int i22 = i21 % 2;
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
            int i23 = INotificationSideChannel + 85;
            notify = i23 % 128;
            int i24 = i23 % 2;
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
        return null;
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
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity.$$a
            int r6 = 144 - r6
            int r1 = 53 - r8
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity.c(short, byte, short, java.lang.Object[]):void");
    }

    public RegistrationActivationVerifyPhoneOtpActivity() {
        final RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = registrationActivationVerifyPhoneOtpActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity2 = this;
        this.asInterface = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = registrationActivationVerifyPhoneOtpActivity2;
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
        this.g = LazyKt.lazy(new RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2(registrationActivationVerifyPhoneOtpActivity2));
        this.a = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$inject$default$2
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {83, ByteCompanionObject.MIN_VALUE, -37, -48, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 59;
            private static int $b = 0;
            private static int $TuitionPaymentFragmentbindingInflater1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 6939738673476474842L;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    int r0 = 53 - r8
                    int r7 = r7 * 52
                    int r7 = 55 - r7
                    int r6 = r6 * 14
                    int r6 = 98 - r6
                    byte[] r1 = com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$inject$default$2.$$a
                    byte[] r0 = new byte[r0]
                    int r8 = 52 - r8
                    r2 = 0
                    if (r1 != 0) goto L16
                    r3 = r7
                    r4 = r2
                    goto L2e
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r8) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L24:
                    int r7 = r7 + 1
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2e:
                    int r7 = -r7
                    int r6 = r6 + r7
                    int r6 = r6 + (-11)
                    r7 = r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$inject$default$2.a(int, short, short, java.lang.Object[]):void");
            }

            private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                int i3 = $11 + 113;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i5 = $10 + 9;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = getrealtimecapturelatency.b;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 19472), TextUtils.indexOf((CharSequence) "", '0') + 2625, 13 - TextUtils.getOffsetAfter("", 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (TuitionPaymentFragmentspecialinlinedviewModeldefault1 | 9053247990562531611L);
                            Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 480, 37 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i7 = getrealtimecapturelatency.b;
                        Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 19472), 2624 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39470 - AndroidCharacter.getMirror('0')), ExpandableListView.getPackedPositionType(0L) + 481, AndroidCharacter.getMirror('0') - 11, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i8 = $11 + 83;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        try {
                            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - View.MeasureSpec.getMode(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 480, 37 - (ViewConfiguration.getTouchSlop() >> 8), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                            int i9 = 57 / 0;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (Color.alpha(0) + 39422), 481 - (ViewConfiguration.getFadingEdgeLength() >> 16), 37 - View.resolveSizeAndState(0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    }
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Type inference failed for: r0v66, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                ComponentCallbacks componentCallbacks = registrationActivationVerifyPhoneOtpActivity;
                mapPoint mappoint = this.$qualifier;
                Function0<CoordinateTransform> function0 = this.$parameters;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 652;
                    int i2 = 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr = $$a;
                    byte b = bArr[5];
                    Object[] objArr2 = new Object[1];
                    a(b, b, bArr[7], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, iIndexOf, i2, -459846511, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                b(new char[]{48800, 31482, 13839, 62028, 45050, 27393, 10075, 57532, 39942, 22607, 5565, 53557, 36164, 18147, 531, 15967, 64508, 46887, 29527, 11489, 59398, 42067}, Drawable.resolveOpacity(0, 0) + 50261, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(new char[]{48804, 60904, 6186, 18302, 62374, 7933, 19771, 63600, 9356, 21453, 65055, 11586, 22932, 33837, 13154}, 21317 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    int iIndexOf2 = 650 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int threadPriority = 44 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr5 = new Object[1];
                    a(b2, b3, (byte) (b3 | 52), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, iIndexOf2, threadPriority, -873460649, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 651;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 44;
                        byte[] bArr2 = $$a;
                        byte b4 = bArr2[5];
                        byte b5 = bArr2[7];
                        Object[] objArr6 = new Object[1];
                        a(b4, b5, (byte) (b5 | 15), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, iCombineMeasuredStates, windowTouchSlop, -1595579076, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i3 = ((int[]) objArr7[2])[0];
                    int i4 = ((int[]) objArr7[0])[0];
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i5 = ~iElapsedRealtime;
                    int i6 = 688480536 + (((~(529430961 | i5)) | (-533658620)) * 98) + (((~(i5 | (-532861772))) | 529430961 | (~(532861771 | iElapsedRealtime))) * (-49)) + (((~(iElapsedRealtime | 529430961)) | 796848) * 49) + 1794229297;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
                } else {
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1610, 26 - TextUtils.getCapsMode("", 0, 0), 2145681644, false, null, new Class[0]);
                        }
                        Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1794229297, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int iRgb = Color.rgb(0, 0, 0) + 16777867;
                            int i9 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte b6 = $$a[7];
                            byte b7 = b6;
                            Object[] objArr9 = new Object[1];
                            a(b6, b7, (byte) (b7 | 52), objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iRgb, i9, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 695 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 793 - (ViewConfiguration.getPressedStateDuration() >> 16), 83 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), Integer.TYPE, Integer.TYPE});
                        }
                        objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int iNormalizeMetaState = 651 - KeyEvent.normalizeMetaState(0);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 44;
                            byte[] bArr3 = $$a;
                            byte b8 = bArr3[5];
                            byte b9 = bArr3[7];
                            Object[] objArr10 = new Object[1];
                            a(b8, b9, (byte) (b9 | 15), objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iNormalizeMetaState, longPressTimeout, -1595579076, false, (String) objArr10[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                        try {
                            Object[] objArr11 = new Object[1];
                            b(new char[]{48800, 31482, 13839, 62028, 45050, 27393, 10075, 57532, 39942, 22607, 5565, 53557, 36164, 18147, 531, 15967, 64508, 46887, 29527, 11489, 59398, 42067}, 50261 - View.getDefaultSize(0, 0), objArr11);
                            Class<?> cls2 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            b(new char[]{48804, 60904, 6186, 18302, 62374, 7933, 19771, 63600, 9356, 21453, 65055, 11586, 22932, 33837, 13154}, 21317 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr12);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 651;
                                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 44;
                                byte b10 = $$a[7];
                                byte b11 = b10;
                                Object[] objArr13 = new Object[1];
                                a(b10, b11, (byte) (b11 | 52), objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, offsetBefore, iNormalizeMetaState2, -873460649, false, (String) objArr13[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                                int modifierMetaStateMask2 = 650 - ((byte) KeyEvent.getModifierMetaStateMask());
                                int iAxisFromString = MotionEvent.axisFromString("") + 45;
                                byte[] bArr4 = $$a;
                                byte b12 = bArr4[5];
                                Object[] objArr14 = new Object[1];
                                a(b12, b12, bArr4[7], objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, modifierMetaStateMask2, iAxisFromString, -459846511, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
                int i10 = ((int[]) objArr[0])[0];
                int i11 = ((int[]) objArr[2])[0];
                if (i11 == i10) {
                    int i12 = $TuitionPaymentFragmentbindingInflater1 + 51;
                    $b = i12 % 128;
                    int i13 = i12 % 2;
                    Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i14 = ((int[]) objArr[3])[0];
                    int i15 = ((int[]) objArr[2])[0];
                    int i16 = ((int[]) objArr[0])[0];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i17 = ~iIdentityHashCode;
                    int i18 = i14 + 157817214 + (((~(289743161 | i17)) | 293173971) * (-90)) + (((~(289743161 | iIdentityHashCode)) | 262440) * (-45)) + (((~(iIdentityHashCode | (-293173972))) | 289743161 | (~(i17 | 293173971))) * 45);
                    int i19 = (i18 << 13) ^ i18;
                    int i20 = i19 ^ (i19 >>> 17);
                    ((int[]) objArr15[3])[0] = i20 ^ (i20 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[1];
                    if (strArr != null) {
                        int i21 = $TuitionPaymentFragmentbindingInflater1 + 93;
                        $b = i21 % 128;
                        int i22 = i21 % 2 != 0 ? 1 : 0;
                        while (i22 < strArr.length) {
                            int i23 = $TuitionPaymentFragmentbindingInflater1 + 83;
                            $b = i23 % 128;
                            if (i23 % 2 != 0) {
                                arrayList.add(strArr[i22]);
                                i22 += 52;
                            } else {
                                arrayList.add(strArr[i22]);
                                i22++;
                            }
                        }
                    }
                    Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
                    Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i24 = ((int[]) objArr[3])[0];
                    int i25 = ((int[]) objArr[2])[0];
                    int i26 = ((int[]) objArr[0])[0];
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i27 = i24 + (-1322707678) + (((~((-4227105) | (~iIdentityHashCode2))) | 796294) * (-591)) + ((iIdentityHashCode2 | (-4227105)) * 591);
                    int i28 = (i27 << 13) ^ i27;
                    int i29 = i28 ^ (i28 >>> 17);
                    ((int[]) objArr16[3])[0] = i29 ^ (i29 << 5);
                }
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), mappoint, function0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\t\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/RegistrationActivationVerifyPhoneOtpActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/nbs/nucleosnucleo/presentation/BaseActivity;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V", "Landroid/content/Context;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseActivity p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) RegistrationActivationVerifyPhoneOtpActivity.class);
            intent.putExtra("registration_data", p1);
            p0.startActivityForResult(intent, 101);
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, RegistrationForUnregistered p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, RegistrationActivationVerifyPhoneOtpActivity.class, new Pair[]{TuplesKt.to("unregistered_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
            C0170absent.TuitionPaymentFragmentbindingInflater1[0] = Class.forName("ViewPropertyAnimatorCompatSet").getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault2");
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegistrationActivationVerifyPhoneOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = notify + 57;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        RegistrationActivationVerifyPhoneOtpActivity$bindingInflater$1 registrationActivationVerifyPhoneOtpActivity$bindingInflater$1 = RegistrationActivationVerifyPhoneOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i3 != 0) {
            return registrationActivationVerifyPhoneOtpActivity$bindingInflater$1;
        }
        throw null;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr4 = d;
        if (cArr4 != null) {
            int i4 = $11 + 109;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 1;
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i5 = $11 + 117;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i2])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2995, Color.rgb(0, 0, 0) + 16777233, 1182129903, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(cancelAll)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            char c = '0';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43324 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 253 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 22 - KeyEvent.normalizeMetaState(0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i7 = 33602;
            if (cancel) {
                int i8 = $11 + 103;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
                } else {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                }
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    try {
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i7 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.lastIndexOf("", c) + 3086, 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -2146875848, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        c = '0';
                        i7 = 33602;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr2);
                int i9 = $10 + 111;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                return;
            }
            if (onTransact) {
                int i11 = $11 + 113;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i13 = $11 + 37;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), AndroidCharacter.getMirror('0') + 3037, TextUtils.indexOf((CharSequence) "", '0') + 27, -2146875848, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i15 = $11 + 55;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i17 = $11 + 7;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 % 0) >> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >>> i] >> iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr4[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
            }
            objArr[0] = new String(cArr6);
            int i18 = $10 + 59;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 82 / 0;
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getCameraCharacteristic(((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, 0 == true ? 1 : 0);
        int i2 = INotificationSideChannel + 119;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity = this;
        ((setSplitTrack) this.asInterface.getValue()).IconCompatParcelizer.observe(registrationActivationVerifyPhoneOtpActivity, new Observer() { // from class: addHistoricalRecord
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((isSticky) this.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(registrationActivationVerifyPhoneOtpActivity, new Observer() { // from class: persistHistoricalDataIfNeeded
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationActivationVerifyPhoneOtpActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((isSticky) this.g.getValue()).TuitionPaymentFragmentbindingInflater1.observe(registrationActivationVerifyPhoneOtpActivity, new Observer() { // from class: readHistoricalDataImpl
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((IntegerRes) this.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(registrationActivationVerifyPhoneOtpActivity, new Observer() { // from class: chooseActivity
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = INotificationSideChannel + 71;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 55;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ((IntegerRes) this.a.getValue()).b();
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object obj = null;
        if (getcameracharacteristic == null) {
            int i4 = notify + 47;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i6 = notify + 65;
        INotificationSideChannel = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = notify + 35;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity = this;
        Intrinsics.checkNotNullParameter(registrationActivationVerifyPhoneOtpActivity, "");
        registrationActivationVerifyPhoneOtpActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_phone_number_verification));
        TextView textView = ((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvPhoneNumber;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (registeredMemberRegistration == null || (str = registeredMemberRegistration.g) == null) {
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (registrationForUnregistered != null) {
                int i4 = notify + 27;
                INotificationSideChannel = i4 % 128;
                int i5 = i4 % 2;
                str = registrationForUnregistered.TuitionPaymentFragmentbindingInflater1;
            } else {
                str = null;
            }
        }
        int i6 = INotificationSideChannel + 65;
        notify = i6 % 128;
        int i7 = i6 % 2;
        textView.setText(str);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = notify + 87;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            super.onBackPressed();
            d_();
        } else {
            super.onBackPressed();
            d_();
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1911967657
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
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity.onResume():void");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        getCameraCharacteristic getcameracharacteristic;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 15;
        int i3 = i2 % 128;
        notify = i3;
        if (i2 % 2 != 0) {
            getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i4 = 0 / 0;
            if (getcameracharacteristic == null) {
                int i5 = i3 + 61;
                INotificationSideChannel = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = INotificationSideChannel + 107;
                notify = i7 % 128;
                int i8 = i7 % 2;
                getcameracharacteristic = null;
            }
        } else {
            getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (getcameracharacteristic == null) {
                int i9 = i3 + 61;
                INotificationSideChannel = i9 % 128;
                int i10 = i9 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i11 = INotificationSideChannel + 107;
                notify = i11 % 128;
                int i12 = i11 % 2;
                getcameracharacteristic = null;
            }
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
            int i13 = notify + 37;
            INotificationSideChannel = i13 % 128;
            int i14 = i13 % 2;
        }
        getcameracharacteristic.b = null;
        super.onStop();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = INotificationSideChannel + 123;
                notify = i2 % 128;
                if (i2 % 2 != 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getOnBackPressedDispatcher().onBackPressed();
                int i3 = notify + 53;
                INotificationSideChannel = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 5 / 2;
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        int i;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        int i2 = 2 % 2;
        int i3 = notify + 19;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i5 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
            int i6 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iArgb = Color.argb(0, 0, 0, 0) + 15;
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            c((short) 141, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, i6, iArgb, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, ExpandableListView.getPackedPositionChild(0L) + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int jumpTapTimeout = 1031 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iGreen = Color.green(0) + 15;
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 89, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, jumpTapTimeout, iGreen, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
                int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
                Object[] objArr6 = new Object[1];
                c((short) 37, $$a[5], (byte) 52, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, packedPositionType, threadPriority, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1103289131;
            int i10 = (~(714414882 | i9)) | 287343756;
            int i11 = ~((~i9) | (-43063587));
            int i12 = (((-2143107983) + ((i10 | i11) * (-470))) + (((~(i9 | 1001758638)) | i11) * 470)) - 159783414;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[2])[0] = i14 ^ (i14 << 5);
            i = 1;
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_glass_text).substring(0, 8).length() + 119, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1009337348};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1134 - View.resolveSizeAndState(0, 0, 0), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -159783414, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1032;
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                    byte b3 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c((short) 141, b3, b3, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, iLastIndexOf, maximumFlingVelocity, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Gravity.getAbsoluteGravity(0, 0)), (-16776099) - Color.rgb(0, 0, 0), 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 15;
                    Object[] objArr13 = new Object[1];
                    c((short) 37, $$a[5], (byte) 52, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode, maximumDrawingCacheSize, iNormalizeMetaState, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bri).substring(1, 3).length() + 125, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_bank_transfer).substring(0, 7).length() + 120, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
                        int longPressTimeout2 = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b4 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 89, b4, b4, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(longPressTimeout, offsetAfter, longPressTimeout2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 15;
                        byte b5 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((short) 141, b5, b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(scrollBarFadeDuration, packedPositionGroup, offsetAfter2, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    i = 1;
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[i])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            int i15 = INotificationSideChannel + 43;
            notify = i15 % 128;
            int i16 = i15 % 2;
            while (i5 < strArr2.length) {
                int i17 = INotificationSideChannel + 29;
                notify = i17 % 128;
                if (i17 % 2 != 0) {
                    arrayList.add(strArr2[i5]);
                    i5 += 103;
                } else {
                    arrayList.add(strArr2[i5]);
                    i5++;
                }
            }
            throw null;
        }
        Object[] objArr18 = new Object[4];
        int[] iArr = new int[i];
        objArr18[i] = iArr;
        objArr18[2] = new int[i];
        int[] iArr2 = new int[i];
        objArr18[3] = iArr2;
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[i])[0];
        String[] strArr3 = (String[]) objArr[0];
        iArr2[0] = i19;
        iArr[0] = i20;
        objArr18[0] = strArr3;
        int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i22 = i18 + (-1829224794) + (((-208487233) | i21) * (-381)) + (((~((~i21) | 17963029)) | (-208620354)) * 381) + 2124224064;
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
            int keyRepeatDelay = 1755 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
            byte b6 = $$a[7];
            Object[] objArr19 = new Object[1];
            c((short) 37, b6, (byte) (b6 | 15), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(defaultSize, keyRepeatDelay, jumpTapTimeout2, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char bitsPerPixel = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                int iResolveSize = 1755 - View.resolveSize(0, 0);
                int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                byte b7 = $$a[7];
                Object[] objArr20 = new Object[1];
                c((short) 89, b7, b7, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(bitsPerPixel, iResolveSize, deadChar, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = ((((-423213295) + (((~(421282421 | iIdentityHashCode)) | 616566922) * 104)) + ((~((~iIdentityHashCode) | (-403964497))) * (-104))) + ((iIdentityHashCode | 633884847) * 104)) - 2062616369;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.akulaku_instruction_step1).substring(5, 7).length() + 125, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_guideline_message_link).substring(0, 22).codePointAt(6) + 80, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-1009337348};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42050 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1726 - Color.red(0), 29 - ((Process.getThreadPriority(0) + 20) >> 6), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -2062616369, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char absoluteGravity = (char) (29944 - Gravity.getAbsoluteGravity(0, 0));
                int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                int i28 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24;
                byte b8 = $$a[7];
                Object[] objArr25 = new Object[1];
                c((short) 89, b8, b8, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(absoluteGravity, maximumFlingVelocity2, i28, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(null, null, 127 - Drawable.resolveOpacity(0, 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char maximumDrawingCacheSize2 = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                    int gidForName = 22 - Process.getGidForName("");
                    short s = $$a[7];
                    byte b9 = (byte) s;
                    Object[] objArr28 = new Object[1];
                    c(s, b9, b9, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(maximumDrawingCacheSize2, jumpTapTimeout3, gidForName, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 29944);
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                    int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b10 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 37, b10, (byte) (b10 | 15), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(defaultSize2, tapTimeout2, iMakeMeasureSpec, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0];
        int i30 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        if (i30 == i29) {
            int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i33 = ~i32;
            int i34 = i31 + (-656491240) + ((698625566 | i33) * (-757)) + ((~(1039941630 | i32)) * 1514) + (((~(i32 | (-341316065))) | (~(i33 | 486023140)) | 553918490) * 757);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr30[3])[0] = i36 ^ (i36 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
        if (strArr4 != null) {
            int i37 = INotificationSideChannel + 99;
            notify = i37 % 128;
            int i38 = 2;
            int i39 = i37 % 2 != 0 ? 1 : 0;
            while (i39 < strArr4.length) {
                int i40 = INotificationSideChannel + 1;
                notify = i40 % 128;
                if (i40 % i38 != 0) {
                    arrayList2.add(strArr4[i39]);
                    i39 += 36;
                } else {
                    arrayList2.add(strArr4[i39]);
                    i39++;
                }
                i38 = 2;
            }
        }
        Toast.makeText((Context) null, i30 / (((i30 - 1) * i30) % 2), 0).show();
        int i41 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int i42 = (int) Runtime.getRuntime().totalMemory();
        int i43 = ~i42;
        int i44 = i41 + (((((~((-117343862) | i43)) | (~((-95258565) | i42))) | (~(i43 | 95258564))) * 959) - 1973348036) + (((~(i42 | 95258564)) | (~(i43 | (-95258565))) | (~((-117343862) | i42))) * 959);
        int i45 = (i44 << 13) ^ i44;
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr31[3])[0] = i46 ^ (i46 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = notify + 21;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        int i6 = ~i5;
        if (i4 != (-2033663440) + (((~(1756334342 | i6)) | (-926346800) | (~((-1756334343) | i5))) * (-564)) + ((~(i5 | (-539396103))) * 1128) + (((~((-926346800) | i6)) | 1216938240) * 564)) {
            int[] iArr = new int[1920291775];
            iArr[1920291774] = 1;
            int i7 = 1367741634 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i8 = INotificationSideChannel + 49;
            notify = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_paid_orderid).substring(0, 9).length() - 1787603031;
        if (i10 != ((159221532 + (((~((-999435845) | length)) | 436340224) * 1504)) + ((~(length | (-563095621))) * (-1504))) - 1000833472) {
            throw null;
        }
        super.onStart();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0086  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 41;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iMyTid = Process.myTid();
            int i4 = ~iMyTid;
            if (i3 != (-1273806040) + ((22347924 | i4) * (-192)) + (((~(1129693589 | i4)) | 277358122) * (-384)) + (((~(iMyTid | (-1107345666))) | (~(i4 | 1407051711)) | (~((-277358123) | iMyTid))) * DerHeader.TAG_CLASS_PRIVATE)) {
                int[] iArr = new int[1360940351];
                iArr[1360940350] = 1;
                int i5 = (-1091262398) % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i6 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i6 != 1518514600 + (((~((-646449713) | (~iIdentityHashCode))) | (~((-1476437256) | iIdentityHashCode))) * (-272)) + (((~((-670960313) | iIdentityHashCode)) | 24510600) * (-272)) + (((~(iIdentityHashCode | 670960312)) | (-1500947856)) * 272)) {
                int[] iArr2 = new int[1360940351];
                iArr2[1360940350] = 1;
                int i7 = (-1091262398) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i8 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 1599505748;
        int i9 = ~((-572147230) | iCodePointAt);
        int i10 = ~iCodePointAt;
        if (i8 != 669516476 + ((i9 | (~(i10 | (-1426338049)))) * 920) + (((~((-580570688) | i10)) | 572147229) * 920) + (((~(iCodePointAt | (-1426338049))) | (~((-572147230) | i10)) | (~((-8423459) | iCodePointAt))) * 920)) {
            throw new RuntimeException("-542489671");
        }
        super.onCreate(bundle);
        int i11 = INotificationSideChannel + 121;
        notify = i11 % 128;
        int i12 = i11 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ActivityRegistrationActivationVerifyPhoneOtpBinding activityRegistrationActivationVerifyPhoneOtpBinding = (ActivityRegistrationActivationVerifyPhoneOtpBinding) objArr[0];
        RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity = (RegistrationActivationVerifyPhoneOtpActivity) objArr[1];
        int i = 2 % 2;
        int i2 = notify + 39;
        INotificationSideChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            OtpView otpView = activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, registrationActivationVerifyPhoneOtpActivity);
            obj.hashCode();
            throw null;
        }
        OtpView otpView2 = activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView2, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView2, registrationActivationVerifyPhoneOtpActivity);
        int i3 = INotificationSideChannel + 69;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d A[PHI: r10
  0x008d: PHI (r10v37 com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration) = 
  (r10v36 com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration)
  (r10v45 com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration)
 binds: [B:27:0x008b, B:24:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        RegisteredMemberRegistration registeredMemberRegistration;
        int i = 2 % 2;
        MembershipType membershipType = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = INotificationSideChannel + 21;
            notify = i2 % 128;
            if (i2 % 2 == 0) {
                registrationActivationVerifyPhoneOtpActivity.MediaBrowserCompat();
                return;
            } else {
                registrationActivationVerifyPhoneOtpActivity.MediaBrowserCompat();
                membershipType.hashCode();
                throw null;
            }
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i3 = notify + 45;
                INotificationSideChannel = i3 % 128;
                int i4 = i3 % 2;
                registrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            return;
        }
        registrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
        Object obj = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
        String str = registrationActivationVerifyPhoneOtpActivity.b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        if (!Intrinsics.areEqual(obj, str)) {
            String string = registrationActivationVerifyPhoneOtpActivity.getString(R.string.error_signature_checking);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(registrationActivationVerifyPhoneOtpActivity, string, "Coba Kembali", new Function0() { // from class: getDefaultActivity
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            });
            return;
        }
        int i5 = INotificationSideChannel + 53;
        notify = i5 % 128;
        if (i5 % 2 != 0) {
            membershipType.hashCode();
            throw null;
        }
        if (((RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
            int i6 = notify + 37;
            INotificationSideChannel = i6 % 128;
            if (i6 % 2 == 0) {
                registeredMemberRegistration = (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                int i7 = 25 / 0;
                if (registeredMemberRegistration != null) {
                    membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
            } else {
                registeredMemberRegistration = (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                if (registeredMemberRegistration != null) {
                    membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
            }
            if (membershipType == MembershipType.PU) {
                Intent intent = new Intent();
                intent.putExtra("registration_data", (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
                registrationActivationVerifyPhoneOtpActivity.setResult(-1, intent);
                registrationActivationVerifyPhoneOtpActivity.finish();
            } else {
                RegistrationPasswordActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationPasswordActivity.INSTANCE;
                RegistrationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(registrationActivationVerifyPhoneOtpActivity, (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
                registrationActivationVerifyPhoneOtpActivity.d_();
            }
        }
        if (((RegistrationForUnregistered) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue()) != null) {
            int i8 = notify + 115;
            INotificationSideChannel = i8 % 128;
            int i9 = i8 % 2;
            NonSalariedWorkerConfirmationActivity.Companion tuitionPaymentFragmentbindingInflater1 = NonSalariedWorkerConfirmationActivity.INSTANCE;
            NonSalariedWorkerConfirmationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationActivationVerifyPhoneOtpActivity, (RegistrationForUnregistered) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue());
            registrationActivationVerifyPhoneOtpActivity.d_();
            int i10 = INotificationSideChannel + 35;
            notify = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = notify + 59;
        INotificationSideChannel = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ab A[PHI: r3
  0x00ab: PHI (r3v30 java.lang.String) = (r3v28 java.lang.String), (r3v44 java.lang.String) binds: [B:28:0x00a7, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0108 A[PHI: r1
  0x0108: PHI (r1v21 java.lang.String) = (r1v19 java.lang.String), (r1v30 java.lang.String) binds: [B:47:0x0103, B:41:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity, ActivityRegistrationActivationVerifyPhoneOtpBinding activityRegistrationActivationVerifyPhoneOtpBinding, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i = 2 % 2;
        int i2 = notify + 77;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            String str9 = null;
            if (registeredMemberRegistration != null) {
                int i4 = INotificationSideChannel + 37;
                notify = i4 % 128;
                int i5 = i4 % 2;
                str = registeredMemberRegistration.asInterface;
            } else {
                str = null;
            }
            String str10 = "";
            if (Intrinsics.areEqual(StringsKt.split$default((CharSequence) String.valueOf(str), new String[]{"#"}, false, 0, 6, (Object) null).get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
                isSticky issticky = (isSticky) registrationActivationVerifyPhoneOtpActivity.g.getValue();
                String string = ((PreferenceManager) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
                if (((RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
                    int i6 = INotificationSideChannel + 61;
                    notify = i6 % 128;
                    if (i6 % 2 != 0) {
                        str9.hashCode();
                        throw null;
                    }
                    RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    str4 = registeredMemberRegistration2 != null ? registeredMemberRegistration2.g : null;
                    if (str4 == null) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                } else {
                    RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                    str4 = registrationForUnregistered != null ? registrationForUnregistered.TuitionPaymentFragmentbindingInflater1 : null;
                    if (str4 == null) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                }
                String string2 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify.getText())).toString();
                if (((RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
                    int i7 = INotificationSideChannel + 11;
                    notify = i7 % 128;
                    int i8 = i7 % 2;
                    RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    if (registeredMemberRegistration3 != null) {
                        int i9 = INotificationSideChannel + 17;
                        notify = i9 % 128;
                        if (i9 % 2 != 0) {
                            str6 = registeredMemberRegistration3.INotificationSideChannel;
                            int i10 = 8 / 0;
                        } else {
                            str6 = registeredMemberRegistration3.INotificationSideChannel;
                        }
                    } else {
                        str6 = null;
                    }
                    if (str6 == null) {
                        str7 = "";
                    } else {
                        str7 = str6;
                    }
                } else {
                    RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                    str6 = registrationForUnregistered2 != null ? registrationForUnregistered2.connect : null;
                    if (str6 == null) {
                        str7 = "";
                    } else {
                        str7 = str6;
                    }
                }
                RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                str9 = registeredMemberRegistration4 != null ? registeredMemberRegistration4.TuitionPaymentFragmentbindingInflater1 : null;
                if (str9 == null) {
                    int i11 = INotificationSideChannel + 31;
                    notify = i11 % 128;
                    int i12 = i11 % 2;
                    str8 = "";
                } else {
                    str8 = str9;
                }
                issticky.b(string, str5, string2, str7, str8);
            } else {
                isSticky issticky2 = (isSticky) registrationActivationVerifyPhoneOtpActivity.g.getValue();
                if (((RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    str2 = registeredMemberRegistration5 != null ? registeredMemberRegistration5.g : null;
                    if (str2 == null) {
                        int i13 = notify + 99;
                        INotificationSideChannel = i13 % 128;
                        int i14 = i13 % 2;
                        str2 = "";
                    }
                } else {
                    RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                    str2 = registrationForUnregistered3 != null ? registrationForUnregistered3.TuitionPaymentFragmentbindingInflater1 : null;
                    if (str2 == null) {
                        int i15 = notify + 99;
                        INotificationSideChannel = i15 % 128;
                        int i16 = i15 % 2;
                        str2 = "";
                    }
                }
                String string3 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify.getText())).toString();
                if (((RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    if (registeredMemberRegistration6 != null) {
                        int i17 = notify + 75;
                        INotificationSideChannel = i17 % 128;
                        if (i17 % 2 == 0) {
                            String str11 = registeredMemberRegistration6.INotificationSideChannel;
                            throw null;
                        }
                        str3 = registeredMemberRegistration6.INotificationSideChannel;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        int i18 = INotificationSideChannel + 55;
                        notify = i18 % 128;
                        if (i18 % 2 != 0) {
                            str9.hashCode();
                            throw null;
                        }
                    } else {
                        str10 = str3;
                    }
                } else {
                    RegistrationForUnregistered registrationForUnregistered4 = (RegistrationForUnregistered) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                    str9 = registrationForUnregistered4 != null ? registrationForUnregistered4.connect : null;
                    if (str9 != null) {
                        str10 = str9;
                    }
                }
                issticky2.b(str2, string3, str10);
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6 A[PHI: r2
  0x00a6: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:34:0x009a, B:27:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityRegistrationActivationVerifyPhoneOtpBinding activityRegistrationActivationVerifyPhoneOtpBinding, RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity, View view) {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = notify + 81;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify.getEditableText().clear();
            setSplitTrack setsplittrack = (setSplitTrack) registrationActivationVerifyPhoneOtpActivity.asInterface.getValue();
            String str3 = "";
            if (((RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
                int i4 = notify + 61;
                INotificationSideChannel = i4 % 128;
                int i5 = i4 % 2;
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                if (registeredMemberRegistration != null) {
                    str = registeredMemberRegistration.g;
                    int i6 = notify + 115;
                    INotificationSideChannel = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                str = registrationForUnregistered != null ? registrationForUnregistered.TuitionPaymentFragmentbindingInflater1 : null;
                if (str == null) {
                    str = "";
                }
            }
            if (((RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
                int i8 = notify + 71;
                INotificationSideChannel = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                str2 = registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1 : null;
                if (str2 != null) {
                    str3 = str2;
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                str2 = registrationForUnregistered2 != null ? registrationForUnregistered2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
                if (str2 == null) {
                    int i9 = notify + 7;
                    INotificationSideChannel = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    str3 = str2;
                }
            }
            setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new PhoneVerificationRequest(str, str3));
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void b(RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity, View view) {
        int i = 2 % 2;
        int i2 = notify + 23;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            registrationActivationVerifyPhoneOtpActivity.onBackPressed();
            ViewPortBuilder.b();
            int i4 = INotificationSideChannel + 25;
            notify = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 117;
        notify = i2 % 128;
        int i3 = i2 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.getIntent().getParcelableExtra("registration_data");
        int i4 = notify + 93;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return registeredMemberRegistration;
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentbindingInflater1(RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 117;
        notify = i2 % 128;
        int i3 = i2 % 2;
        RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) registrationActivationVerifyPhoneOtpActivity.getIntent().getParcelableExtra("unregistered_data");
        int i4 = INotificationSideChannel + 91;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return registrationForUnregistered;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ActivityRegistrationActivationVerifyPhoneOtpBinding activityRegistrationActivationVerifyPhoneOtpBinding = (ActivityRegistrationActivationVerifyPhoneOtpBinding) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 105;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 6) {
            int i4 = notify + 117;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            MaterialButton materialButton = activityRegistrationActivationVerifyPhoneOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
            int i6 = INotificationSideChannel + 91;
            notify = i6 % 128;
            int i7 = i6 % 2;
        } else {
            MaterialButton materialButton3 = activityRegistrationActivationVerifyPhoneOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = notify + 85;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                registrationActivationVerifyPhoneOtpActivity.MediaBrowserCompat();
                return;
            } else {
                registrationActivationVerifyPhoneOtpActivity.MediaBrowserCompat();
                throw null;
            }
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            registrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
            getCameraCharacteristic getcameracharacteristic2 = registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (getcameracharacteristic2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                getcameracharacteristic = getcameracharacteristic2;
            }
            getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            registrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            int i3 = INotificationSideChannel + 17;
            notify = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = INotificationSideChannel + 45;
        notify = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void b(final RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = notify + 55;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            registrationActivationVerifyPhoneOtpActivity.MediaBrowserCompat();
            return;
        }
        String str = null;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i4 = INotificationSideChannel + 123;
                notify = i4 % 128;
                int i5 = i4 % 2;
                registrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            return;
        }
        int i6 = notify + 3;
        INotificationSideChannel = i6 % 128;
        int i7 = i6 % 2;
        registrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
        VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
        Object obj = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
        String str2 = registrationActivationVerifyPhoneOtpActivity.b;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str = str2;
        }
        if (!Intrinsics.areEqual(obj, str)) {
            String string = registrationActivationVerifyPhoneOtpActivity.getString(R.string.error_signature_checking);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(registrationActivationVerifyPhoneOtpActivity, string, "Coba Kembali", new Function0() { // from class: getActivity
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            });
            return;
        }
        ((OtpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum();
        if (((RegisteredMemberRegistration) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
            registrationActivationVerifyPhoneOtpActivity.setResult(-1);
            registrationActivationVerifyPhoneOtpActivity.finish();
            int i8 = INotificationSideChannel + 85;
            notify = i8 % 128;
            int i9 = i8 % 2;
        }
        if (((RegistrationForUnregistered) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue()) != null) {
            NonSalariedWorkerConfirmationActivity.Companion tuitionPaymentFragmentbindingInflater1 = NonSalariedWorkerConfirmationActivity.INSTANCE;
            NonSalariedWorkerConfirmationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationActivationVerifyPhoneOtpActivity, (RegistrationForUnregistered) registrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue());
            registrationActivationVerifyPhoneOtpActivity.d_();
        }
        int i10 = notify + 11;
        INotificationSideChannel = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 2 / 0;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = notify + 83;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        registrationActivationVerifyPhoneOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 29;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = notify + 83;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        registrationActivationVerifyPhoneOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 27;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity = (RegistrationActivationVerifyPhoneOtpActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = notify + 83;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                registrationActivationVerifyPhoneOtpActivity.MediaBrowserCompat();
                return null;
            }
            registrationActivationVerifyPhoneOtpActivity.MediaBrowserCompat();
            throw null;
        }
        if (!(true ^ (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            registrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
            registrationActivationVerifyPhoneOtpActivity.b = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString();
            int i3 = notify + 85;
            INotificationSideChannel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 46 / 0;
            }
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i5 = INotificationSideChannel + 105;
            notify = i5 % 128;
            if (i5 % 2 != 0) {
                registrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                obj.hashCode();
                throw null;
            }
            registrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationActivationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityRegistrationActivationVerifyPhoneOtpBinding activityRegistrationActivationVerifyPhoneOtpBinding, RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1150344985, getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{activityRegistrationActivationVerifyPhoneOtpBinding, registrationActivationVerifyPhoneOtpActivity}, 1150344989, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationActivationVerifyPhoneOtpActivity registrationActivationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -521510171, getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{registrationActivationVerifyPhoneOtpActivity, virtualCameraAdapter1}, 521510172, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityRegistrationActivationVerifyPhoneOtpBinding activityRegistrationActivationVerifyPhoneOtpBinding, String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 233438549, getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{activityRegistrationActivationVerifyPhoneOtpBinding, str}, -233438547, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static {
        INotificationSideChannelStub = 0;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelDefault + 67;
        INotificationSideChannelStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify + 85;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_registration_activation_verify_phone_otp;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 570821918, -631883249, registerAvailabilityCallback.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 631883249, registerAvailabilityCallback.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 45;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart).substring(0, 8).codePointAt(3) + 1455369415, getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1576404312, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 934158736, new Object[]{this}, -1576404309, getSelectedTab.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = notify + 13;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannel + 91;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        d = new char[]{47291, 47278, 47288, 47274, 47277, 47283, 47214, 47273, 47241, 47267, 47272, 47287, 47279, 47257, 47280, 47289, 47281, 47276, 47242, 47282, 47270, 47285, 47252, 47284};
        cancelAll = 2047719516;
        onTransact = true;
        cancel = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, short r6, byte r7) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity.$$c
            int r6 = r6 + 67
            int r5 = r5 * 2
            int r5 = 4 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r6 = r5
            r4 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r5]
        L27:
            int r4 = -r4
            int r5 = r5 + 1
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.RegistrationActivationVerifyPhoneOtpActivity.$$i(short, short, byte):java.lang.String");
    }
}
