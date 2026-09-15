package com.bpjstku.presentation.membership.registration;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.databinding.ActivityRegistrationVerifyPhoneOtpBinding;
import com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationActivity;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import com.mukesh.OtpView;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.IntegerRes;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getCameraCharacteristic;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getTextOn;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isSticky;
import defpackage.mapPoint;
import defpackage.notifyStateAttached;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setOrVerifyExpectFrameRateRange;
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
import kotlin.io.FileTreeWalk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\b\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0006\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0015\u0010\u001b\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0015\u0010\u0010\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0017R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010%R\u0014\u0010\t\u001a\u00020'8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010("}, d2 = {"Lcom/bpjstku/presentation/membership/registration/RegistrationVerifyPhoneOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationVerifyPhoneOtpBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "a", "onBackPressed", "cancelAll", "onResume", "onStop", "onDestroy", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentbindingInflater1", "", "g", "Ljava/lang/String;", "LgetCameraCharacteristic;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetCameraCharacteristic;", "LsetSplitTrack;", "LisSticky;", "LIntegerRes;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "d", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegistrationVerifyPhoneOtpActivity extends BindingBaseActivity<ActivityRegistrationVerifyPhoneOtpBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f550a;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy g;
    private getCameraCharacteristic TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = 182;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {57, -50, -56, -93, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 85;
    private static int INotificationSideChannel = 0;
    private static int d = 0;
    private static int cancelAll = 1;
    private final Lazy b = LazyKt.lazy(new getTextOn(this));

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: getThumbTextPadding
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~((~i6) | i7);
        int i9 = (~i3) | (~(i7 | i6));
        int i10 = i6 | i3 | i7;
        int i11 = i3 + i + i5 + (1635157569 * i4) + ((-1141649966) * i2);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i3) - 711983104) + (488484398 * i) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i5) + (1462763520 * i4) + (1566572544 * i2) + (1631846400 * i12);
        int i14 = (i3 * 1521345644) + 2088555610 + (1521346098 * i) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i5 * 1521345871) + (i4 * (-1382509809)) + (i2 * 37969358) + (i12 * (-671350784));
        int i15 = i13 + (i14 * i14 * (-1069809664));
        if (i15 == 1) {
            return b(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i15 != 3) {
            if (i15 != 4) {
                return i15 != 5 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity = (RegistrationVerifyPhoneOtpActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i16 = 2 % 2;
        int i17 = cancelAll + 77;
        d = i17 % 128;
        int i18 = i17 % 2;
        if (((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null) != (((~((-832671147) | i7)) | 279020842) * (-241)) + 1782857886 + (((~((-553650305) | i7)) | (-1941679532)) * 241)) {
            int i19 = (-1026717070) % 2;
            throw new ArithmeticException();
        }
        if (((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null) != ((221489124 + (((-1706605201) | i7) * 1444)) + (((~(i | 1602279414)) | ((~(976776550 | i)) | (-2142830583))) * (-1444))) - 486659552) {
            int i20 = (-1502499976) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i21 = cancelAll + 33;
        d = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity.$$a
            int r8 = 145 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity.c(byte, int, int, java.lang.Object[]):void");
    }

    public RegistrationVerifyPhoneOtpActivity() {
        final RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = registrationVerifyPhoneOtpActivity;
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
        this.g = LazyKt.lazy(new Function0<isSticky>() { // from class: com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, isSticky] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ isSticky invoke() {
                LifecycleOwner lifecycleOwner = registrationVerifyPhoneOtpActivity;
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
        final RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity2 = this;
        this.asBinder = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = registrationVerifyPhoneOtpActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/RegistrationVerifyPhoneOtpActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/nbs/nucleosnucleo/presentation/BaseActivity;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V", "Landroid/content/Context;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseActivity p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) RegistrationVerifyPhoneOtpActivity.class);
            intent.putExtra("registration_data", p1);
            p0.startActivityForResult(intent, 101);
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, RegistrationForUnregistered p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, RegistrationVerifyPhoneOtpActivity.class, new Pair[]{TuplesKt.to("unregistered_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegistrationVerifyPhoneOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 97;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        RegistrationVerifyPhoneOtpActivity$bindingInflater$1 registrationVerifyPhoneOtpActivity$bindingInflater$1 = RegistrationVerifyPhoneOtpActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = d + 109;
        cancelAll = i4 % 128;
        if (i4 % 2 != 0) {
            return registrationVerifyPhoneOtpActivity$bindingInflater$1;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0159  */
    /* JADX WARN: Code duplicated, block: B:33:0x015a  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(f550a)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 3291 - KeyEvent.getDeadChar(0, 0), 31 - ExpandableListView.getPackedPositionGroup(0L), 1199271174, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSize(0, 0), 651 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, -450685997, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 35;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 1;
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionChild(j) + 1), 651 - ExpandableListView.getPackedPositionGroup(j), 44 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -450685997, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
                j = 0;
            }
            int i9 = $11 + 49;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding = (ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityRegistrationVerifyPhoneOtpBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: setShowText
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                RegistrationVerifyPhoneOtpActivity.b(activityRegistrationVerifyPhoneOtpBinding, this);
            }
        });
        OtpView otpView = activityRegistrationVerifyPhoneOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: getThumbTintList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegistrationVerifyPhoneOtpActivity.b(activityRegistrationVerifyPhoneOtpBinding, (String) obj);
            }
        }));
        activityRegistrationVerifyPhoneOtpBinding.btnVerification.setOnClickListener(new View.OnClickListener() { // from class: getThumbDrawable
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, activityRegistrationVerifyPhoneOtpBinding, view);
            }
        });
        activityRegistrationVerifyPhoneOtpBinding.btnChangePhone.setOnClickListener(new View.OnClickListener() { // from class: getThumbPosition
            public static int b = -1861526406;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        activityRegistrationVerifyPhoneOtpBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: getSwitchMinWidth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityRegistrationVerifyPhoneOtpBinding, this, view);
            }
        });
        int i2 = cancelAll + 125;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getCameraCharacteristic(((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, 0 == true ? 1 : 0);
        int i2 = cancelAll + 31;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ((IntegerRes) this.asBinder.getValue()).b();
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getcameracharacteristic == null) {
            int i2 = d + 93;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = d + 1;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity = this;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).IconCompatParcelizer.observe(registrationVerifyPhoneOtpActivity, new Observer() { // from class: getSwitchPadding
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((isSticky) this.g.getValue()).TuitionPaymentFragmentbindingInflater1.observe(registrationVerifyPhoneOtpActivity, new Observer() { // from class: onCreateDrawableState
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationVerifyPhoneOtpActivity.b(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((isSticky) this.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(registrationVerifyPhoneOtpActivity, new Observer() { // from class: getTrackTintMode
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((IntegerRes) this.asBinder.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(registrationVerifyPhoneOtpActivity, new Observer() { // from class: getTrackDrawable
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                RegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = cancelAll + 57;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = d + 1;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        d_();
        int i4 = cancelAll + 57;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void cancelAll() {
        int i = 2 % 2;
        int i2 = d + 3;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (((RegisteredMemberRegistration) this.b.getValue()) != null) {
            int i3 = cancelAll + 111;
            d = i3 % 128;
            if (i3 % 2 != 0) {
                setResult(-1);
                finish();
                obj.hashCode();
                throw null;
            }
            setResult(-1);
            finish();
        }
        if (((RegistrationForUnregistered) this.TuitionPaymentFragmentbindingInflater1.getValue()) != null) {
            NonSalariedWorkerConfirmationActivity.Companion tuitionPaymentFragmentbindingInflater1 = NonSalariedWorkerConfirmationActivity.INSTANCE;
            NonSalariedWorkerConfirmationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, (RegistrationForUnregistered) this.TuitionPaymentFragmentbindingInflater1.getValue());
            d_();
        }
        int i4 = cancelAll + 81;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2026131915
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
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity.onResume():void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        getCameraCharacteristic getcameracharacteristic;
        int i;
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 + 61;
        cancelAll = i4 % 128;
        if (i4 % 2 == 0) {
            getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i5 = 51 / 0;
            if (getcameracharacteristic == null) {
                i = i3 + 125;
                cancelAll = i % 128;
                if (i % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                getcameracharacteristic = null;
            }
        } else {
            getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (getcameracharacteristic == null) {
                i = i3 + 125;
                cancelAll = i % 128;
                if (i % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                getcameracharacteristic = null;
            }
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i6 = d + 29;
            cancelAll = i6 % 128;
            int i7 = i6 % 2;
            tuitionPaymentFragmentbindingInflater1.cancel();
            int i8 = cancelAll + 33;
            d = i8 % 128;
            int i9 = i8 % 2;
        }
        getcameracharacteristic.b = null;
        super.onStop();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        getCameraCharacteristic getcameracharacteristic;
        int i = 2 % 2;
        int i2 = d + 21;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = 17 / 0;
            if (getcameracharacteristic == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                getcameracharacteristic = null;
            }
        } else {
            getcameracharacteristic = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (getcameracharacteristic == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                getcameracharacteristic = null;
            }
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i4 = cancelAll + 121;
            d = i4 % 128;
            int i5 = i4 % 2;
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
        int i6 = cancelAll + 17;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0076  */
    /* JADX WARN: Code duplicated, block: B:14:0x0079  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        RegistrationForUnregistered registrationForUnregistered;
        String str;
        int i = 2 % 2;
        RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity = this;
        Intrinsics.checkNotNullParameter(registrationVerifyPhoneOtpActivity, "");
        registrationVerifyPhoneOtpActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_phone_number_verification));
        TextView textView = ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvPhoneNumber;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.b.getValue();
        if (registeredMemberRegistration != null) {
            int i2 = cancelAll + 125;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                String str2 = registeredMemberRegistration.g;
                throw null;
            }
            str = registeredMemberRegistration.g;
            if (str == null) {
                registrationForUnregistered = (RegistrationForUnregistered) this.TuitionPaymentFragmentbindingInflater1.getValue();
                if (registrationForUnregistered != null) {
                    str = registrationForUnregistered.TuitionPaymentFragmentbindingInflater1;
                } else {
                    str = null;
                }
            }
        } else {
            registrationForUnregistered = (RegistrationForUnregistered) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (registrationForUnregistered != null) {
                str = registrationForUnregistered.TuitionPaymentFragmentbindingInflater1;
            } else {
                str = null;
            }
        }
        int i3 = cancelAll + 17;
        d = i3 % 128;
        int i4 = i3 % 2;
        textView.setText(str);
        if (i4 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {all -> 0x0057, blocks: (B:5:0x0016, B:16:0x004f, B:13:0x003b, B:14:0x0043, B:15:0x004e, B:9:0x0027), top: B:21:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:5:0x0016, B:16:0x004f, B:13:0x003b, B:14:0x0043, B:15:0x004e, B:9:0x0027), top: B:21:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i;
        int i2 = 2 % 2;
        int i3 = cancelAll + 45;
        d = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i4 = 22 / 0;
                if (p0.getItemId() == 16908332) {
                    i = d + 111;
                    cancelAll = i % 128;
                    if (i % 2 != 0) {
                        getOnBackPressedDispatcher().onBackPressed();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    i = d + 111;
                    cancelAll = i % 128;
                    if (i % 2 != 0) {
                        getOnBackPressedDispatcher().onBackPressed();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    getOnBackPressedDispatcher().onBackPressed();
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
        Object[] objArr2;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
            int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
            byte b = $$a[7];
            Object[] objArr3 = new Object[1];
            c(b, (byte) (b | 52), (short) 141, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iLastIndexOf, iKeyCodeFromString, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_transaction_empty).substring(0, 1).length() + 251, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.copied_company_code).substring(1, 2).length() + 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step6).substring(3, 4).length() + 8, new char[]{16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step2).substring(4, 5).codePointAt(0) + 149, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_now).substring(1, 3).length() + 5, new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1031;
            int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16;
            byte b2 = $$a[7];
            Object[] objArr6 = new Object[1];
            c(b2, (byte) (b2 | 52), (short) ($$b + 4), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, iIndexOf, i3, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                int edgeSlop = 15 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte[] bArr = $$a;
                byte b3 = bArr[5];
                byte b4 = bArr[7];
                Object[] objArr7 = new Object[1];
                c(b3, b4, (short) (b4 | 37), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, trimmedLength, edgeSlop, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr8[3])[0];
            int i5 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i7 = ~(357417439 | i6);
            int i8 = (-1732934979) + (((-402642944) | i7) * (-814)) + ((i7 | (~((~i6) | 113137269)) | 67911765) * 407) + (((~(i6 | (-113137270))) | (~((-357417440) | i6)) | 67911765) * 407) + 1745496684;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_failed).substring(0, 1).length() + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 30, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 98, new char[]{'\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 219, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_all_bank).substring(13, 15).codePointAt(1) - 96, new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {-231440240};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (Process.myTid() >> 22) + 1134, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 1745496684, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0);
                    int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
                    byte b5 = $$a[7];
                    Object[] objArr13 = new Object[1];
                    c(b5, (byte) (b5 | 52), (short) 141, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf2, offsetBefore, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 45992), Color.rgb(0, 0, 0) + 16778333, TextUtils.indexOf("", "") + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iMyTid = (Process.myTid() >> 22) + 1031;
                    int iArgb = Color.argb(0, 0, 0, 0) + 15;
                    byte[] bArr2 = $$a;
                    byte b6 = bArr2[5];
                    byte b7 = bArr2[7];
                    Object[] objArr14 = new Object[1];
                    c(b6, b7, (short) (b7 | 37), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, iMyTid, iArgb, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step0).substring(40, 43).length() + 249, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_card_registration).substring(0, 3).codePointAt(0) - 58, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, new char[]{16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22}, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_title_text).substring(0, 20).length() + 236, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.virtual_account_number).substring(14, 15).codePointAt(0) - 101, TextUtils.lastIndexOf("", '0', 0) + 8, new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1031;
                        int size = View.MeasureSpec.getSize(0) + 15;
                        byte b8 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c(b8, (byte) (b8 | 52), (short) ($$b + 4), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollDefaultDelay2, keyRepeatDelay, size, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                        int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                        int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                        byte b9 = $$a[7];
                        Object[] objArr18 = new Object[1];
                        c(b9, (byte) (b9 | 52), (short) 141, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iAxisFromString, packedPositionChild, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i11 = d + 5;
                    cancelAll = i11 % 128;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    int i15 = cancelAll + 29;
                    d = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
        int i21 = ~((-287345541) | i20);
        int i22 = ~i20;
        int i23 = i17 + 172933076 + ((i21 | (~(1069395870 | i22))) * 497) + (((~(i20 | 1069395870)) | (~((-1026330501) | i22)) | 738984960) * 497);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr19[2])[0] = i25 ^ (i25 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
            int iResolveSize = 1755 - View.resolveSize(0, 0);
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
            byte b10 = $$a[7];
            byte b11 = (byte) (b10 | 37);
            Object[] objArr20 = new Object[1];
            c(b10, b11, b11, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(windowTouchSlop, iResolveSize, iLastIndexOf2, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                int doubleTapTimeout = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iAlpha = 23 - Color.alpha(0);
                byte b12 = $$a[7];
                Object[] objArr21 = new Object[1];
                c(b12, (byte) (b12 | 52), (short) ($$b + 4), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(pressedStateDuration, doubleTapTimeout, iAlpha, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i26 = ((int[]) objArr22[0])[0];
            objArr2 = new Object[]{new int[]{i26}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i27 = ~iMaxMemory;
            int i28 = 1013383106 + (((~(489711839 | i27)) | (-1039957984)) * 98) + (((~(i27 | (-702314266))) | 489711839 | (~(702314265 | iMaxMemory))) * (-49)) + (((~(iMaxMemory | 489711839)) | 337643718) * 49) + 86577641;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[3])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(false, Color.blue(0) + 251, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 83, 11 - TextUtils.indexOf("", ""), new char[]{'\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484}, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_danamon_online).substring(1, 3).codePointAt(1) + 134, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, 14 - Color.argb(0, 0, 0, 0), new char[]{65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534}, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-231440240};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 42049), TextUtils.getCapsMode("", 0, 0) + 1726, Gravity.getAbsoluteGravity(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), 86577641);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cGreen = (char) (Color.green(0) + 29944);
                int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int doubleTapTimeout2 = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b13 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b13, (byte) (b13 | 52), (short) ($$b + 4), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cGreen, longPressTimeout, doubleTapTimeout2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_gopay).substring(0, 5).length() + 247, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellCategoryTitle).substring(0, 8).codePointAt(6) - 60, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.epay_bri).substring(0, 9).length(), new char[]{16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(false, TextUtils.indexOf((CharSequence) "", '0', 0) + 257, TextUtils.getCapsMode("", 0, 0) + 15, TextUtils.lastIndexOf("", '0') + 8, new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char scrollDefaultDelay3 = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int i31 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                    int packedPositionChild2 = 22 - ExpandableListView.getPackedPositionChild(0L);
                    byte b14 = $$a[7];
                    byte b15 = b14;
                    Object[] objArr29 = new Object[1];
                    c(b15, (byte) (b15 | 52), b14, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollDefaultDelay3, i31, packedPositionChild2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
                    int iIndexOf3 = 1755 - TextUtils.indexOf("", "", 0);
                    int keyRepeatDelay2 = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte b16 = $$a[7];
                    byte b17 = (byte) (b16 | 37);
                    Object[] objArr30 = new Object[1];
                    c(b16, b17, b17, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, iIndexOf3, keyRepeatDelay2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr2 = objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr2[1])[0];
        int i33 = ((int[]) objArr2[0])[0];
        if (i33 != i32) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr2[4];
            if (strArr4 != null) {
                while (i2 < strArr4.length) {
                    int i34 = cancelAll + 61;
                    d = i34 % 128;
                    if (i34 % 2 != 0) {
                        arrayList2.add(strArr4[i2]);
                        i2 += 74;
                    } else {
                        arrayList2.add(strArr4[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i33));
        }
        int i35 = ((int[]) objArr2[3])[0];
        int i36 = ((int[]) objArr2[0])[0];
        Object[] objArr31 = {new int[]{i36}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int i37 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i38 = i35 + (((1909252358 + (((~((-285229185) | i37)) | (~((-72626759) | i37))) * 69)) + (((~(i37 | (-777435992))) | ((~((-990038418) | i37)) | 704809233)) * (-69))) - 309453112);
        int i39 = (i38 << 13) ^ i38;
        int i40 = i39 ^ (i39 >>> 17);
        ((int[]) objArr31[3])[0] = i40 ^ (i40 << 5);
        int i41 = cancelAll + 7;
        d = i41 % 128;
        if (i41 % 2 != 0) {
            int i42 = 78 / 0;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1036092240
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
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity.onStart():void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = cancelAll + 95;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            registrationVerifyPhoneOtpActivity.d_();
            unit = Unit.INSTANCE;
            int i3 = 20 / 0;
        } else {
            registrationVerifyPhoneOtpActivity.d_();
            unit = Unit.INSTANCE;
        }
        int i4 = cancelAll + 69;
        d = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[PHI: r2
  0x008b: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:38:0x00a6, B:28:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding, RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity, View view) {
        String str;
        int i;
        RegisteredMemberRegistration registeredMemberRegistration;
        int i2 = 2 % 2;
        int i3 = cancelAll + 51;
        d = i3 % 128;
        int i4 = i3 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            activityRegistrationVerifyPhoneOtpBinding.otpVerify.getEditableText().clear();
            setSplitTrack setsplittrack = (setSplitTrack) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            String str2 = "";
            String str3 = null;
            if (((RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue()) != null) {
                int i5 = cancelAll + 91;
                d = i5 % 128;
                if (i5 % 2 != 0) {
                    registeredMemberRegistration = (RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue();
                    int i6 = 62 / 0;
                    if (registeredMemberRegistration != null) {
                        str = registeredMemberRegistration.g;
                    } else {
                        str = null;
                    }
                } else {
                    registeredMemberRegistration = (RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue();
                    if (registeredMemberRegistration != null) {
                        str = registeredMemberRegistration.g;
                    } else {
                        str = null;
                    }
                }
                if (str == null) {
                    str = "";
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                str = registrationForUnregistered != null ? registrationForUnregistered.TuitionPaymentFragmentbindingInflater1 : null;
                if (str == null) {
                    str = "";
                }
            }
            if (((RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue();
                str3 = registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1 : null;
                if (str3 == null) {
                    i = cancelAll + 29;
                    d = i % 128;
                    int i7 = i % 2;
                } else {
                    str2 = str3;
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                if (registrationForUnregistered2 != null) {
                    str3 = registrationForUnregistered2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i8 = d + 63;
                    cancelAll = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 3 % 3;
                    }
                }
                if (str3 == null) {
                    i = d + 27;
                    cancelAll = i % 128;
                    int i10 = i % 2;
                } else {
                    str2 = str3;
                }
            }
            setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new PhoneVerificationRequest(str, str2));
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registrationVerifyPhoneOtpActivity.MediaBrowserCompat();
            return;
        }
        String str = null;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i2 = d + 37;
                cancelAll = i2 % 128;
                int i3 = i2 % 2;
                registrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                int i4 = cancelAll + 27;
                d = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        registrationVerifyPhoneOtpActivity.IconCompatParcelizer();
        Object obj = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
        String str2 = registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str = str2;
        }
        if (!Intrinsics.areEqual(obj, str)) {
            String string = registrationVerifyPhoneOtpActivity.getString(R.string.error_signature_checking);
            Intrinsics.checkNotNullExpressionValue(string, "");
            retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(registrationVerifyPhoneOtpActivity, string, "Coba Kembali", new Function0() { // from class: getThumbTintMode
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            });
        } else {
            int i6 = cancelAll + 29;
            d = i6 % 128;
            int i7 = i6 % 2;
            registrationVerifyPhoneOtpActivity.cancelAll();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 19;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                registrationVerifyPhoneOtpActivity.onBackPressed();
                ViewPortBuilder.b();
            } else {
                registrationVerifyPhoneOtpActivity.onBackPressed();
                ViewPortBuilder.b();
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registrationVerifyPhoneOtpActivity.MediaBrowserCompat();
            return;
        }
        getCameraCharacteristic getcameracharacteristic = null;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return;
            }
            int i2 = d + 83;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            registrationVerifyPhoneOtpActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            return;
        }
        int i4 = d + 71;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        registrationVerifyPhoneOtpActivity.IconCompatParcelizer();
        getCameraCharacteristic getcameracharacteristic2 = registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getcameracharacteristic2 == null) {
            int i6 = d + 85;
            cancelAll = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = 99 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            getcameracharacteristic = getcameracharacteristic2;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding = (ActivityRegistrationVerifyPhoneOtpBinding) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = d + 57;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0 ? str.length() >= 6 : str.length() >= 22) {
            MaterialButton materialButton = activityRegistrationVerifyPhoneOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
            int i4 = d + 11;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
        } else {
            MaterialButton materialButton3 = activityRegistrationVerifyPhoneOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(false);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding, RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = d + 19;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        OtpView otpView = activityRegistrationVerifyPhoneOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, registrationVerifyPhoneOtpActivity);
        int i4 = d + 121;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void b(final RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = d + 115;
            cancelAll = i2 % 128;
            if (i2 % 2 != 0) {
                registrationVerifyPhoneOtpActivity.MediaBrowserCompat();
                return;
            } else {
                registrationVerifyPhoneOtpActivity.MediaBrowserCompat();
                int i3 = 56 / 0;
                return;
            }
        }
        String str = null;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i4 = cancelAll + 97;
                d = i4 % 128;
                int i5 = i4 % 2;
                registrationVerifyPhoneOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            return;
        }
        registrationVerifyPhoneOtpActivity.IconCompatParcelizer();
        Object obj = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
        String str2 = registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str = str2;
        }
        if (Intrinsics.areEqual(obj, str)) {
            registrationVerifyPhoneOtpActivity.cancelAll();
            return;
        }
        String string = registrationVerifyPhoneOtpActivity.getString(R.string.error_signature_checking);
        Intrinsics.checkNotNullExpressionValue(string, "");
        retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(registrationVerifyPhoneOtpActivity, string, "Coba Kembali", new Function0() { // from class: getTrackTintList
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RegistrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[PHI: r5
  0x00a0: PHI (r5v36 java.lang.String) = (r5v34 java.lang.String), (r5v41 java.lang.String) binds: [B:36:0x009e, B:30:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x0177 A[PHI: r0
  0x0177: PHI (r0v22 java.lang.String) = (r0v20 java.lang.String), (r0v27 java.lang.String) binds: [B:83:0x0175, B:77:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object b(Object[] objArr) {
        String strName;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity = (RegistrationVerifyPhoneOtpActivity) objArr[0];
        ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding = (ActivityRegistrationVerifyPhoneOtpBinding) objArr[1];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) objArr[2]);
        try {
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
            Object obj = null;
            String str7 = "";
            if (Intrinsics.areEqual(registrationForUnregistered != null ? registrationForUnregistered.IconCompatParcelizer : null, "cross_selling")) {
                isSticky issticky = (isSticky) registrationVerifyPhoneOtpActivity.g.getValue();
                if (((RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue();
                    str5 = registeredMemberRegistration != null ? registeredMemberRegistration.g : null;
                    if (str5 == null) {
                        str5 = "";
                    }
                } else {
                    RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                    str5 = registrationForUnregistered2 != null ? registrationForUnregistered2.TuitionPaymentFragmentbindingInflater1 : null;
                    if (str5 == null) {
                        str5 = "";
                    }
                }
                String string = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationVerifyPhoneOtpBinding.otpVerify.getText())).toString();
                if (((RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue();
                    str6 = registeredMemberRegistration2 != null ? registeredMemberRegistration2.INotificationSideChannel : null;
                    if (str6 != null) {
                        str7 = str6;
                    }
                } else {
                    RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                    str6 = registrationForUnregistered3 != null ? registrationForUnregistered3.connect : null;
                    if (str6 != null) {
                        str7 = str6;
                    }
                }
                RegistrationForUnregistered registrationForUnregistered4 = (RegistrationForUnregistered) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                Intrinsics.checkNotNull(registrationForUnregistered4);
                issticky.TuitionPaymentFragmentbindingInflater1(str5, string, str7, String.valueOf(registrationForUnregistered4.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            } else {
                RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue();
                if (registeredMemberRegistration3 != null) {
                    int i2 = cancelAll + 71;
                    d = i2 % 128;
                    if (i2 % 2 != 0) {
                        Citizenship citizenship = registeredMemberRegistration3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        throw null;
                    }
                    Citizenship citizenship2 = registeredMemberRegistration3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (citizenship2 != null) {
                        strName = citizenship2.name();
                    } else {
                        strName = null;
                    }
                } else {
                    strName = null;
                }
                if (Intrinsics.areEqual(strName, "WNA")) {
                    isSticky issticky2 = (isSticky) registrationVerifyPhoneOtpActivity.g.getValue();
                    if (((RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue()) != null) {
                        int i3 = cancelAll + 53;
                        d = i3 % 128;
                        int i4 = i3 % 2;
                        RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue();
                        str3 = registeredMemberRegistration4 != null ? registeredMemberRegistration4.g : null;
                        if (str3 == null) {
                            str3 = "";
                        }
                    } else {
                        RegistrationForUnregistered registrationForUnregistered5 = (RegistrationForUnregistered) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                        if (registrationForUnregistered5 != null) {
                            int i5 = d + 43;
                            cancelAll = i5 % 128;
                            if (i5 % 2 == 0) {
                                String str8 = registrationForUnregistered5.TuitionPaymentFragmentbindingInflater1;
                                obj.hashCode();
                                throw null;
                            }
                            str3 = registrationForUnregistered5.TuitionPaymentFragmentbindingInflater1;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                    }
                    String string2 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationVerifyPhoneOtpBinding.otpVerify.getText())).toString();
                    if (((RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue()) != null) {
                        RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue();
                        if (registeredMemberRegistration5 != null) {
                            int i6 = cancelAll + 41;
                            d = i6 % 128;
                            int i7 = i6 % 2;
                            str4 = registeredMemberRegistration5.INotificationSideChannel;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                            str7 = str4;
                        }
                    } else {
                        RegistrationForUnregistered registrationForUnregistered6 = (RegistrationForUnregistered) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                        str4 = registrationForUnregistered6 != null ? registrationForUnregistered6.connect : null;
                        if (str4 != null) {
                            str7 = str4;
                        }
                    }
                    issticky2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, string2, str7);
                } else {
                    isSticky issticky3 = (isSticky) registrationVerifyPhoneOtpActivity.g.getValue();
                    if (((RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue()) != null) {
                        RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue();
                        str = registeredMemberRegistration6 != null ? registeredMemberRegistration6.g : null;
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        RegistrationForUnregistered registrationForUnregistered7 = (RegistrationForUnregistered) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                        str = registrationForUnregistered7 != null ? registrationForUnregistered7.TuitionPaymentFragmentbindingInflater1 : null;
                        if (str == null) {
                            str = "";
                        }
                    }
                    String string3 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationVerifyPhoneOtpBinding.otpVerify.getText())).toString();
                    if (((RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue()) != null) {
                        RegisteredMemberRegistration registeredMemberRegistration7 = (RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.b.getValue();
                        str2 = registeredMemberRegistration7 != null ? registeredMemberRegistration7.INotificationSideChannel : null;
                        if (str2 != null) {
                            str7 = str2;
                        }
                    } else {
                        RegistrationForUnregistered registrationForUnregistered8 = (RegistrationForUnregistered) registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                        str2 = registrationForUnregistered8 != null ? registrationForUnregistered8.connect : null;
                        if (str2 != null) {
                            str7 = str2;
                        }
                    }
                    issticky3.b(str, string3, str7);
                }
            }
            ViewPortBuilder.b();
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity = (RegistrationVerifyPhoneOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 99;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) registrationVerifyPhoneOtpActivity.getIntent().getParcelableExtra("registration_data");
        int i3 = cancelAll + 93;
        d = i3 % 128;
        int i4 = i3 % 2;
        return registeredMemberRegistration;
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentbindingInflater1(RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 107;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) registrationVerifyPhoneOtpActivity.getIntent().getParcelableExtra("unregistered_data");
        int i3 = d + 23;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        return registrationForUnregistered;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = d + 107;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            registrationVerifyPhoneOtpActivity.d_();
            return Unit.INSTANCE;
        }
        registrationVerifyPhoneOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = cancelAll + 69;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            registrationVerifyPhoneOtpActivity.MediaBrowserCompat();
            return;
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            registrationVerifyPhoneOtpActivity.IconCompatParcelizer();
            registrationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            registrationVerifyPhoneOtpActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registrationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            int i3 = d + 111;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static /* synthetic */ Unit b(ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding, String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{activityRegistrationVerifyPhoneOtpBinding, str}, 1510192762, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1510192760, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity, ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{registrationVerifyPhoneOtpActivity, activityRegistrationVerifyPhoneOtpBinding, view}, 1739953876, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1739953875, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public static /* synthetic */ RegisteredMemberRegistration b(RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (RegisteredMemberRegistration) TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{registrationVerifyPhoneOtpActivity}, -1984717863, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1984717863, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static {
        notify = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 77;
        notify = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancelAll + 25;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_registration_verify_phone_otp;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this}, -293750349, (-1813353576) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_continue_next_step).substring(2, 3).length(), 293750354, 2038515692 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_format_valid_until).substring(3, 4).length(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this, bundle}, -454639790, CameraSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 454639793, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_gopay).substring(0, 5).length() + 1021544378;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Object[]{this}, 287486944, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -287486940, CameraSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, length);
    }

    static void g() {
        f550a = -83722245;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        RegistrationVerifyPhoneOtpActivity registrationVerifyPhoneOtpActivity = (RegistrationVerifyPhoneOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancelAll + 105;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = cancelAll + 93;
        d = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancelAll + 37;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity.$$c
            int r6 = 120 - r6
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r8 = r8 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.RegistrationVerifyPhoneOtpActivity.$$i(int, byte, short):java.lang.String");
    }
}
