package com.bpjstku.presentation.membership.registration.newregistration;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.office.OfficeDataStore$$ExternalSyntheticLambda10;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.databinding.ActivityRegistrationVerifyEmailOtpBinding;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.IntegerRes;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.addTask;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getCameraCharacteristic;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isSticky;
import defpackage.mapPoint;
import defpackage.notifyStateAttached;
import defpackage.obtainRequest;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
import defpackage.suspendUseCases;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u0015\u0010\u0012\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0015\u0010\u0007\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0015\u0010\u0006\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0015\u0010\u000b\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0017\u0010\t\u001a\u0004\u0018\u00010\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\"R\u0014\u0010%\u001a\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010$"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/newregistration/NewRegistrationVerifyEmailOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationVerifyEmailOtpBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "a", "asInterface", "asBinder", "onResume", "onStop", "onDestroy", "onBackPressed", "LIntegerRes;", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/lib/PreferenceManager;", "d", "", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetCameraCharacteristic;", "LgetCameraCharacteristic;", "LsetSplitTrack;", "LisSticky;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "g", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "onTransact"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewRegistrationVerifyEmailOtpActivity extends BindingBaseActivity<ActivityRegistrationVerifyEmailOtpBinding> {
    private static int INotificationSideChannel;
    private static int INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char cancel;
    private static long cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private getCameraCharacteristic b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {64, 73, -26, 82};
    private static final int $$f = 173;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {118, 35, -100, -35, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 233;
    private static int INotificationSideChannelDefault = 0;
    private static int notify = 0;
    private static int onTransact = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy g = LazyKt.lazy(new Function0() { // from class: AsyncLayoutInflater
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
            return (RegisteredMemberRegistration) NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1452124353, addTask.TuitionPaymentFragmentbindingInflater1(), addTask.TuitionPaymentFragmentbindingInflater1(), addTask.TuitionPaymentFragmentbindingInflater1(), 1452124357, addTask.TuitionPaymentFragmentbindingInflater1(), objArr);
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new obtainRequest(this));

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: runInner
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = ~((~i2) | i8);
        int i10 = i2 | i8;
        int i11 = i5 + i + i4 + ((-189913888) * i6) + ((-1809372279) * i3);
        int i12 = i11 * i11;
        int i13 = (((-554582804) * i5) - 1671495680) + (10634006 * i) + (i7 * 282608405) + (282608405 * i9) + ((-282608405) * i10) + ((-271974400) * i4) + (952107008 * i6) + (1092222976 * i3) + ((-70844416) * i12);
        int i14 = (i5 * 986545540) + 223666697 + (i * 986543778) + (i7 * (-881)) + (i9 * (-881)) + (i10 * 881) + (i4 * 986544659) + (i6 * 1843362976) + (i3 * (-1872984789)) + (i12 * (-2050686976));
        int i15 = i13 + (i14 * i14 * 1179713536);
        if (i15 == 1) {
            return b(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i15 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i15 != 4) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity = (NewRegistrationVerifyEmailOtpActivity) objArr[0];
        int i16 = 2 % 2;
        int i17 = notify + 13;
        onTransact = i17 % 128;
        int i18 = i17 % 2;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationVerifyEmailOtpActivity.getIntent().getParcelableExtra("registration_data");
        int i19 = notify + 91;
        onTransact = i19 % 128;
        int i20 = i19 % 2;
        return registeredMemberRegistration;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 53 - r6
            byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.$$a
            int r7 = r7 + 4
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r7]
        L25:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            int r7 = r7 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.c(byte, short, byte, java.lang.Object[]):void");
    }

    public NewRegistrationVerifyEmailOtpActivity() {
        final NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = newRegistrationVerifyEmailOtpActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = newRegistrationVerifyEmailOtpActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = newRegistrationVerifyEmailOtpActivity2;
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
        this.asBinder = LazyKt.lazy(new Function0<isSticky>() { // from class: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, isSticky] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ isSticky invoke() {
                LifecycleOwner lifecycleOwner = newRegistrationVerifyEmailOtpActivity2;
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
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/newregistration/NewRegistrationVerifyEmailOtpActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "b", "(Lcom/nbs/nucleosnucleo/presentation/BaseActivity;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(BaseActivity p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) NewRegistrationVerifyEmailOtpActivity.class);
            intent.putExtra("registration_data", p1);
            p0.startActivityForResult(intent, 100);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegistrationVerifyEmailOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        notify = i2 % 128;
        int i3 = i2 % 2;
        NewRegistrationVerifyEmailOtpActivity$bindingInflater$1 newRegistrationVerifyEmailOtpActivity$bindingInflater$1 = NewRegistrationVerifyEmailOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            return newRegistrationVerifyEmailOtpActivity$bindingInflater$1;
        }
        throw null;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        int i5 = $10 + 21;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $10 + 35;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), View.MeasureSpec.getSize(0) + 1235, 34 - ImageFormat.getBitsPerPixel(0), -653973969, false, $$i(b, b2, (byte) (b2 + 3)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2764 - (ViewConfiguration.getLongPressTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, 1504416861, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Drawable.resolveOpacity(0, 0)), 253 - View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollBarSize() >> 8) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 65200);
                    int iAlpha = Color.alpha(0) + 2891;
                    int i9 = 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    String str$$i = $$i(b5, b6, (byte) (-b6));
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, iAlpha, i9, 2012627446, false, str$$i, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (cancelAll ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) INotificationSideChannel) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) cancel) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$c = {67, -127, -109, 9};
        private static final int $$f = 65;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {56, 94, 119, -19, 13, -15, 2, 3, 9, -3, -11, 66, 4, -51, -3, 3, -15, -4, 15, -13, 68, -68, -6, 14, 9, -21, 21, 47, 4, -20, -45, 11, -21, 42, -19, -17, 14, -13, -4, 21, -1, -10, 7, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 18, -7, -5, 10, -5, -5, 7, 30, -37, 8, -6, 11, -19, 15, -13, 65};
        private static final int $$e = 0;
        private static final byte[] $$a = {92, 126, -38, -95, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 123;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static int TuitionPaymentFragmentbindingInflater1 = -83722417;

        private static void a(short s, byte b, byte b2, Object[] objArr) {
            int i = 108 - (b * 52);
            int i2 = 84 - (b2 * 2);
            int i3 = s * 15;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[53 - i3];
            int i4 = 52 - i3;
            int i5 = -1;
            if (bArr == null) {
                i5 = -1;
                i2 = (i4 + (-i)) - 11;
                i++;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i2;
                if (i6 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i7 = i2;
                int i8 = i + 1;
                i5 = i6;
                i2 = (i7 + (-bArr[i])) - 11;
                i = i8;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002b  */
        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1.$$d
                int r8 = r8 * 39
                int r8 = 42 - r8
                int r6 = r6 * 30
                int r6 = r6 + 84
                int r7 = r7 * 2
                int r1 = r7 + 38
                byte[] r1 = new byte[r1]
                int r7 = r7 + 37
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r8
                r4 = r2
                r8 = r7
                goto L31
            L19:
                r3 = r2
            L1a:
                int r8 = r8 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L2b
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2b:
                r3 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r5
            L31:
                int r6 = -r6
                int r6 = r6 + r8
                r8 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1.c(byte, byte, int, java.lang.Object[]):void");
        }

        private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i5 = $10 + 121;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 3291 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 31, 1199271174, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 652, 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            if (i3 > 0) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (z) {
                int i8 = $11 + 61;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i10 = $10 + 5;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 651, TextUtils.indexOf("", "", 0) + 44, -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
        public final boolean equals(Object obj) throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            boolean z = obj instanceof Observer;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iResolveOpacity = 2267 - Drawable.resolveOpacity(0, 0);
                int scrollDefaultDelay = 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b, bArr[40], b, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iResolveOpacity, scrollDefaultDelay, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            b(false, 145 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 23, TextUtils.indexOf("", "", 0) + 6, new char[]{'\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(false, 148 - Drawable.resolveOpacity(0, 0), 15 - (ViewConfiguration.getPressedStateDuration() >> 16), 14 - TextUtils.indexOf("", ""), new char[]{5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int gidForName = 2266 - Process.getGidForName("");
                int iNormalizeMetaState = 33 - KeyEvent.normalizeMetaState(0);
                byte[] bArr2 = $$a;
                byte b2 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b2, bArr2[5], b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, gidForName, iNormalizeMetaState, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iNormalizeMetaState2 = 2267 - KeyEvent.normalizeMetaState(0);
                    int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[5];
                    byte b4 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    a(b3, b4, b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay2, iNormalizeMetaState2, iIndexOf, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i2 = ((int[]) objArr7[0])[0];
                int i3 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int iNextInt = new Random().nextInt(585708073);
                int i4 = (-1951596322) + ((~((-69223252) | iNextInt)) * 623) + (((~iNextInt) | 705935368) * (-623)) + (((~(iNextInt | 722712716)) | (~((-86000600) | iNextInt)) | 69223251) * 623) + 1407858219;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
                c = 3;
            } else {
                Object[] objArr8 = new Object[1];
                b(true, 144 - ExpandableListView.getPackedPositionGroup(0L), 26 - (ViewConfiguration.getEdgeSlop() >> 16), 1 - KeyEvent.normalizeMetaState(0), new char[]{65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(false, KeyEvent.keyCodeFromString("") + 151, 19 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                    int i8 = i7 % 2;
                    applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                b(false, Color.argb(0, 0, 0, 0) + 143, 16 - TextUtils.getCapsMode("", 0, 0), TextUtils.lastIndexOf("", '0', 0) + 5, new char[]{17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b(true, 147 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 16 - Color.blue(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, new char[]{'\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1407858219};
                    byte b5 = $$d[48];
                    byte b6 = b5;
                    Object[] objArr13 = new Object[1];
                    c(b5, b6, b6, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = (byte) $$e;
                    byte b8 = b7;
                    Object[] objArr14 = new Object[1];
                    c(b7, b8, b8, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int trimmedLength = 2267 - TextUtils.getTrimmedLength("");
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 33;
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[5];
                            byte b10 = bArr4[7];
                            Object[] objArr16 = new Object[1];
                            a(b9, b10, b10, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, trimmedLength, edgeSlop, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            b(false, 144 - Color.red(0), 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 6 - KeyEvent.keyCodeFromString(""), new char[]{'\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2}, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            b(false, Color.argb(0, 0, 0, 0) + 148, 15 - KeyEvent.getDeadChar(0, 0), 14 - (Process.myPid() >> 22), new char[]{5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534}, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                                int minimumFlingVelocity = 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int touchSlop = 33 - (ViewConfiguration.getTouchSlop() >> 8);
                                byte[] bArr5 = $$a;
                                byte b11 = bArr5[7];
                                Object[] objArr19 = new Object[1];
                                a(b11, bArr5[5], b11, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, minimumFlingVelocity, touchSlop, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2268;
                                int deadChar = 33 - KeyEvent.getDeadChar(0, 0);
                                byte[] bArr6 = $$a;
                                byte b12 = bArr6[7];
                                Object[] objArr20 = new Object[1];
                                a(b12, bArr6[40], b12, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, iIndexOf2, deadChar, -887667012, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                    c = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i11 = ((int[]) objArr[c])[0];
            int i12 = ((int[]) objArr[0])[0];
            if (i12 != i11) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[1];
                if (strArr2 != null) {
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                    int i14 = i13 % 2 != 0 ? 0 : 1;
                    while (i14 < strArr2.length) {
                        arrayList.add(strArr2[i14]);
                        i14++;
                        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 5 / 5;
                        }
                    }
                }
                throw new RuntimeException(String.valueOf(i12));
            }
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
            int i18 = i17 % 2;
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i19 = ((int[]) objArr[2])[0];
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[3])[0];
            String[] strArr3 = (String[]) objArr[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i22 = (-488140621) + (((~((-237819243) | iElapsedRealtime)) | 33817704 | (~((-570894074) | iElapsedRealtime))) * (-880));
            int i23 = (~((-237819243) | (~iElapsedRealtime))) | 570894073;
            int i24 = ~(iElapsedRealtime | 237819242);
            int i25 = i19 + i22 + ((i23 | i24) * (-880)) + (i24 * 880);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            Object obj2 = objArr21[2];
            ((int[]) obj2)[0] = i27 ^ (i27 << 5);
            if (z) {
                int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i28 % 128;
                if (i28 % 2 != 0) {
                    boolean z2 = obj instanceof FunctionAdapter;
                    throw null;
                }
                if (obj instanceof FunctionAdapter) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i29 = ((int[]) obj2)[0];
            int i30 = i29 * i29;
            int i31 = -(636727753 * i29);
            int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
            int i33 = -(i29 * (-865249757));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            int i35 = (i34 & 1279635556) + (1279635556 | i34);
            int i36 = ((i35 >> 21) - 4095) / 2048;
            int i37 = (i36 & 1) + (i36 | 1);
            int i38 = -(((i35 & i37) + (i37 | i35)) ^ ((((i35 >> 17) - 65535) / 32768) + 1));
            int i39 = (i38 & 4) + (i38 | 4);
            int i40 = i39 >> 21;
            int i41 = ((i40 ^ (-4095)) + ((i40 & (-4095)) << 1)) / 2048;
            return 0 / (((-(((i41 ^ 1) + ((i41 & 1) << 1)) + 1)) & i39) * 346);
        }

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            Function1 function1;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = i2 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                function1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i4 = 82 / 0;
            } else {
                function1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            int i5 = i2 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r7, short r8, short r9) {
            /*
                byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1.$$c
                int r9 = r9 + 119
                int r8 = r8 * 2
                int r8 = 1 - r8
                int r7 = r7 * 3
                int r7 = 3 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2a
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                int r7 = r7 + 1
                if (r4 != r8) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r6
            L2a:
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1.$$g(int, short, short):java.lang.String");
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding = (ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityRegistrationVerifyEmailOtpBinding.btnChangeEmail.setOnClickListener(new View.OnClickListener() { // from class: SafeIterableMapSupportRemove
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
        activityRegistrationVerifyEmailOtpBinding.btnVerification.setOnClickListener(new View.OnClickListener() { // from class: AsyncLayoutInflaterBasicInflater
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, activityRegistrationVerifyEmailOtpBinding, view);
            }
        });
        activityRegistrationVerifyEmailOtpBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: cloneInContext
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                Object[] objArr = {activityRegistrationVerifyEmailOtpBinding, this};
                NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1494785354, addTask.TuitionPaymentFragmentbindingInflater1(), addTask.TuitionPaymentFragmentbindingInflater1(), addTask.TuitionPaymentFragmentbindingInflater1(), 1494785354, addTask.TuitionPaymentFragmentbindingInflater1(), objArr);
            }
        });
        OtpView otpView = activityRegistrationVerifyEmailOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: AsyncLayoutInflater1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1(activityRegistrationVerifyEmailOtpBinding, (String) obj);
            }
        }));
        activityRegistrationVerifyEmailOtpBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: AsyncLayoutInflaterInflateRequest
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, activityRegistrationVerifyEmailOtpBinding, view);
            }
        });
        int i2 = onTransact + 59;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.b = new getCameraCharacteristic(((ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, 0 == true ? 1 : 0);
        int i2 = notify + 9;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity = this;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).onTransact.observe(newRegistrationVerifyEmailOtpActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: SafeIterableMapListIterator
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationVerifyEmailOtpActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((isSticky) this.asBinder.getValue()).TuitionPaymentFragmentbindingInflater1.observe(newRegistrationVerifyEmailOtpActivity, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: nextNode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(newRegistrationVerifyEmailOtpActivity, new Observer() { // from class: supportRemove
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj};
                NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(-882343546, addTask.TuitionPaymentFragmentbindingInflater1(), addTask.TuitionPaymentFragmentbindingInflater1(), addTask.TuitionPaymentFragmentbindingInflater1(), 882343547, addTask.TuitionPaymentFragmentbindingInflater1(), objArr);
            }
        });
        int i2 = onTransact + 57;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity = (NewRegistrationVerifyEmailOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ((IntegerRes) newRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue()).b();
        getCameraCharacteristic getcameracharacteristic = newRegistrationVerifyEmailOtpActivity.b;
        if (getcameracharacteristic == null) {
            int i4 = notify + 111;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = onTransact + 63;
            notify = i6 % 128;
            int i7 = i6 % 2;
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 123;
        notify = i2 % 128;
        int i3 = i2 % 2;
        NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity = this;
        Intrinsics.checkNotNullParameter(newRegistrationVerifyEmailOtpActivity, "");
        newRegistrationVerifyEmailOtpActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_string_null));
        TextView textView = ((ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvEmail;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.g.getValue();
        if (registeredMemberRegistration == null || (str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1) == null) {
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) this.a.getValue();
            if (registrationForUnregistered != null) {
                int i4 = notify + 115;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                str = null;
            }
        }
        textView.setText(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0099, code lost:
    
        if (r1 != (((1660738196 + ((r4 | 2083739406) * 764)) + (((~(r2 | 2083739406)) | 25471040) * (-1528))) + ((1639364928 | r4) * 764))) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009b, code lost:
    
        super.onResume();
        r1 = r11.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a0, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        r1 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.onTransact + 45;
        com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.notify = r1 % 128;
        r1 = r1 % 2;
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b0, code lost:
    
        if (r1 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b3, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:
    
        r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bd, code lost:
    
        r1 = 285979650 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r1 == ((119430533 + ((((~(r5 | (-1333388551))) | 1098425600) | (~((-268438058) | r4))) * 717)) + (((~(r4 | (-1333388551))) | ((~(r5 | (-268438058))) | 1098425600)) * 717))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0068, code lost:
    
        if (r1 == (((-1737087080) + (((-33853959) | r4) * 494)) + (((~(r4 | (-1401787951))) | 1905880441) * 494))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = ~java.lang.System.identityHashCode(r11);
        r4 = ~(495316558 | r2);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.onTransact
            int r1 = r1 + 101
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.notify = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L42
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r11)
            int r5 = ~r4
            r6 = -1333388551(0xffffffffb0861af9, float:-9.757449E-10)
            r7 = r5 | r6
            int r7 = ~r7
            r8 = 1098425600(0x4178a500, float:15.540283)
            r7 = r7 | r8
            r9 = -268438058(0xffffffffeffff5d6, float:-1.5843175E29)
            r10 = r9 | r4
            int r10 = ~r10
            r7 = r7 | r10
            int r7 = r7 * 717
            r10 = 119430533(0x71e5d85, float:1.1914082E-34)
            int r10 = r10 + r7
            r5 = r5 | r9
            int r5 = ~r5
            r5 = r5 | r8
            r4 = r4 | r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 717
            int r10 = r10 + r4
            if (r1 != r10) goto Lbd
            goto L6a
        L42:
            java.lang.reflect.Member[] r1 = defpackage.CameraUseCaseAdapter.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            long r4 = android.os.SystemClock.uptimeMillis()
            int r4 = (int) r4
            int r4 = ~r4
            r5 = -33853959(0xfffffffffdfb6df9, float:-4.1775905E37)
            r5 = r5 | r4
            int r5 = r5 * 494
            r6 = -1737087080(0xffffffff98762798, float:-3.1814745E-24)
            int r6 = r6 + r5
            r5 = -1401787951(0xffffffffac7269d1, float:-3.4449008E-12)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = 1905880441(0x71996d79, float:1.5194736E30)
            r4 = r4 | r5
            int r4 = r4 * 494
            int r6 = r6 + r4
            if (r1 != r6) goto Lbd
        L6a:
            java.lang.reflect.Member[] r1 = defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r11)
            int r2 = ~r2
            r4 = 495316558(0x1d85ee4e, float:3.545121E-21)
            r4 = r4 | r2
            int r4 = ~r4
            r5 = 2083739406(0x7c33570e, float:3.7247473E36)
            r6 = r4 | r5
            int r6 = r6 * 764
            r7 = 1660738196(0x62fcda94, float:2.3321649E21)
            int r7 = r7 + r6
            r2 = r2 | r5
            int r2 = ~r2
            r5 = 25471040(0x184a840, float:4.873057E-38)
            r2 = r2 | r5
            int r2 = r2 * (-1528)
            int r7 = r7 + r2
            r2 = 1639364928(0x61b6b940, float:4.21332E20)
            r2 = r2 | r4
            int r2 = r2 * 764
            int r7 = r7 + r2
            if (r1 != r7) goto Lbc
            super.onResume()
            getCameraCharacteristic r1 = r11.b
            if (r1 != 0) goto Lb7
            int r1 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.onTransact
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.notify = r2
            int r1 = r1 % r0
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            if (r1 != 0) goto Lb3
            goto Lb8
        Lb3:
            r3.hashCode()
            throw r3
        Lb7:
            r3 = r1
        Lb8:
            r3.b()
            return
        Lbc:
            throw r3
        Lbd:
            r1 = 285979650(0x110bb402, float:1.1020636E-28)
            int r1 = r1 % r0
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.onResume():void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 57;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        getCameraCharacteristic getcameracharacteristic = this.b;
        if (getcameracharacteristic == null) {
            int i5 = i2 + 39;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = onTransact + 105;
            notify = i7 % 128;
            int i8 = i7 % 2;
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i9 = notify + 67;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onStop();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.b;
        if (getcameracharacteristic == null) {
            int i2 = notify + 59;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
            int i4 = notify + 51;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity = (NewRegistrationVerifyEmailOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 45;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        newRegistrationVerifyEmailOtpActivity.d_();
        int i4 = onTransact + 7;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:19:0x0178  */
    /* JADX WARN: Code duplicated, block: B:22:0x0256 A[Catch: all -> 0x0c8d, TryCatch #1 {all -> 0x0c8d, blocks: (B:20:0x0242, B:22:0x0256, B:23:0x0286, B:59:0x0866, B:61:0x087a, B:62:0x08ab, B:64:0x08dd, B:65:0x0957), top: B:107:0x0242 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x029c  */
    /* JADX WARN: Code duplicated, block: B:31:0x039c  */
    /* JADX WARN: Code duplicated, block: B:34:0x03ee  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        int i;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i2 = 2 % 2;
        int i3 = onTransact + 1;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0');
                byte[] bArr = $$a;
                byte b = (byte) (bArr[27] - 1);
                short s = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b, s, (byte) s, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, packedPositionType, iLastIndexOf, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            int i4 = 50 / 0;
            if (j != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cResolveOpacity = (char) (29944 - Drawable.resolveOpacity(0, 0));
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr3 = new Object[1];
                    c(b3, (short) (b3 | 37), b2, objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, scrollDefaultDelay, keyRepeatDelay, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i5 = ((631833220 + (((~(iElapsedRealtime | 885508681)) | 135803910) * 305)) + (((~((~iElapsedRealtime) | 885508681)) | 672906255) * 305)) - 1006863180;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{57175, 4170, 7231, 7962}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_list_header_prima).substring(0, 4).length() + 6680), ViewConfiguration.getPressedStateDuration() >> 16, new char[]{41543, 4774, 38857, 54030, 36170, 18397, 57849, 45752, 55130, 58512, 49786, 8135, 60458, 40340, 4274, 62322}, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{32115, 64252, 57036, 20314}, (char) (23262 - TextUtils.indexOf("", "", 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step2).substring(28, 29).codePointAt(0) - 97, new char[]{12185, 25634, 1185, 34244, 30129, 60029, 7156, 31580, 12799, 7158, 23534, 10350, 42679, 6934, 36610, 44818}, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {2028577840};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - TextUtils.getOffsetBefore("", 0)), 1726 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), -1006863180);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cGreen = (char) (Color.green(0) + 29944);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                        int iRgb = Color.rgb(0, 0, 0) + 16777239;
                        byte b4 = $$a[7];
                        byte b5 = b4;
                        Object[] objArr8 = new Object[1];
                        c(b5, (short) (b5 | 37), b4, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, iIndexOf, iRgb, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{Typography.dollar, 23705, 53174, 11855}, (char) Color.argb(0, 0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 116, new char[]{668, 21740, 11688, 32074, 33243, 60362, 48285, 15520, 25069, 1137, 36400, 48686, 7902, 31680, 30270, 39092, 12154, 61842, 28616, 26414, 16578, 18220}, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{12250, 51110, 50131, 42878}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 32415), TextUtils.lastIndexOf("", '0', 0, 0) - 741890512, new char[]{35931, 17223, 12447, 49538, 55557, 678, 57223, 17042, 38708, 27989, 22305, 27528, 52644, 43983, 35338}, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                            int i8 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                            byte b6 = $$a[7];
                            byte b7 = b6;
                            Object[] objArr11 = new Object[1];
                            c(b7, (short) (b7 | 89), b6, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, scrollDefaultDelay2, i8, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 29944);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
                            int pressedStateDuration = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            byte[] bArr2 = $$a;
                            byte b8 = (byte) (bArr2[27] - 1);
                            short s2 = bArr2[7];
                            Object[] objArr12 = new Object[1];
                            c(b8, s2, (byte) s2, objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength, longPressTimeout, pressedStateDuration, 986134021, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
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
        } else {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                byte[] bArr3 = $$a;
                byte b9 = (byte) (bArr3[27] - 1);
                short s3 = bArr3[7];
                Object[] objArr13 = new Object[1];
                c(b9, s3, (byte) s3, objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(edgeSlop, maxKeyCode, keyRepeatDelay2, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cResolveOpacity2 = (char) (29944 - Drawable.resolveOpacity(0, 0));
                    int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                    int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                    byte b10 = $$a[7];
                    byte b11 = b10;
                    Object[] objArr14 = new Object[1];
                    c(b11, (short) (b11 | 37), b10, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity2, scrollDefaultDelay3, keyRepeatDelay3, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                int i9 = ((631833220 + (((~(iElapsedRealtime2 | 885508681)) | 135803910) * 305)) + (((~((~iElapsedRealtime2) | 885508681)) | 672906255) * 305)) - 1006863180;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i11 ^ (i11 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{57175, 4170, 7231, 7962}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_list_header_prima).substring(0, 4).length() + 6680), ViewConfiguration.getPressedStateDuration() >> 16, new char[]{41543, 4774, 38857, 54030, 36170, 18397, 57849, 45752, 55130, 58512, 49786, 8135, 60458, 40340, 4274, 62322}, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{32115, 64252, 57036, 20314}, (char) (23262 - TextUtils.indexOf("", "", 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step2).substring(28, 29).codePointAt(0) - 97, new char[]{12185, 25634, 1185, 34244, 30129, 60029, 7156, 31580, 12799, 7158, 23534, 10350, 42679, 6934, 36610, 44818}, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {2028577840};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - TextUtils.getOffsetBefore("", 0)), 1726 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), -1006863180);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cGreen2 = (char) (Color.green(0) + 29944);
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                    int iRgb2 = Color.rgb(0, 0, 0) + 16777239;
                    byte b12 = $$a[7];
                    byte b13 = b12;
                    Object[] objArr19 = new Object[1];
                    c(b13, (short) (b13 | 37), b12, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen2, iIndexOf2, iRgb2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                Object[] objArr20 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{Typography.dollar, 23705, 53174, 11855}, (char) Color.argb(0, 0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 116, new char[]{668, 21740, 11688, 32074, 33243, 60362, 48285, 15520, 25069, 1137, 36400, 48686, 7902, 31680, 30270, 39092, 12154, 61842, 28616, 26414, 16578, 18220}, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{12250, 51110, 50131, 42878}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 32415), TextUtils.lastIndexOf("", '0', 0, 0) - 741890512, new char[]{35931, 17223, 12447, 49538, 55557, 678, 57223, 17042, 38708, 27989, 22305, 27528, 52644, 43983, 35338}, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
                    int scrollDefaultDelay4 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                    int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                    byte b14 = $$a[7];
                    byte b15 = b14;
                    Object[] objArr111 = new Object[1];
                    c(b15, (short) (b15 | 89), b14, objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, scrollDefaultDelay4, i12, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 29944);
                    int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
                    int pressedStateDuration2 = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr4 = $$a;
                    byte b16 = (byte) (bArr4[27] - 1);
                    short s4 = bArr4[7];
                    Object[] objArr112 = new Object[1];
                    c(b16, s4, (byte) s4, objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(trimmedLength2, longPressTimeout2, pressedStateDuration2, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i14 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr21 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i16 = ~iFreeMemory;
            int i17 = i15 + (-1144866607) + (((~(592752813 | i16)) | 268439106) * 168) + ((~((-268439107) | iFreeMemory)) * 168) + (((~(iFreeMemory | 861191919)) | (~(i16 | (-805355240))) | 536916133) * 168);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr21[3])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i20 = notify + 37;
                    onTransact = i20 % 128;
                    int i21 = i20 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i22 = i14 - 1;
            iArr[i22] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i22) % 2) - 1], 1).show();
            int i23 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr22 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i24 = (-448005876) + (((~((~elapsedCpuTime) | 456022287)) | (-1073643344)) * (-245));
            int i25 = ~(elapsedCpuTime | 456022287);
            int i26 = i23 + i24 + (i25 * (-245)) + ((i25 | 668624713) * 245);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr22[3])[0] = i28 ^ (i28 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cRed = (char) Color.red(0);
            int iResolveSize = View.resolveSize(0, 0) + 1031;
            int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
            byte b17 = $$a[7];
            byte b18 = b17;
            Object[] objArr23 = new Object[1];
            c(b18, (short) (b18 | 141), b17, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cRed, iResolveSize, iResolveOpacity, 1357589585, false, (String) objArr23[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr24 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{Typography.dollar, 23705, 53174, 11855}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111, new char[]{668, 21740, 11688, 32074, 33243, 60362, 48285, 15520, 25069, 1137, 36400, 48686, 7902, 31680, 30270, 39092, 12154, 61842, 28616, 26414, 16578, 18220}, objArr24);
        Class<?> cls5 = Class.forName((String) objArr24[0]);
        Object[] objArr25 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{12250, 51110, 50131, 42878}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 32335), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 741890549, new char[]{35931, 17223, 12447, 49538, 55557, 678, 57223, 17042, 38708, 27989, 22305, 27528, 52644, 43983, 35338}, objArr25);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int i29 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
            int iArgb = Color.argb(0, 0, 0, 0) + 15;
            byte b19 = $$a[7];
            byte b20 = b19;
            Object[] objArr26 = new Object[1];
            c(b20, (short) (b20 | 37), b19, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c, i29, iArgb, 1344079056, false, (String) objArr26[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char gidForName = (char) (Process.getGidForName("") + 1);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
                int scrollDefaultDelay5 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                Object[] objArr27 = new Object[1];
                c((byte) 52, (short) ($$b & 983), $$a[28], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(gidForName, offsetAfter, scrollDefaultDelay5, 632103528, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr28[3])[0];
            int i31 = ((int[]) objArr28[1])[0];
            String[] strArr2 = (String[]) objArr28[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step6).substring(3, 4).codePointAt(0) + 1916632863;
            int i32 = ((((~(iCodePointAt | 438273958)) | (-193993789)) * 56) - 1960138959) + (((~((~iCodePointAt) | (-193993789))) | 438273958) * 56) + 665585869;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr[2])[0] = i34 ^ (i34 << 5);
        } else {
            Object[] objArr29 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{57175, 4170, 7231, 7962}, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 6684), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98, new char[]{41543, 4774, 38857, 54030, 36170, 18397, 57849, 45752, 55130, 58512, 49786, 8135, 60458, 40340, 4274, 62322}, objArr29);
            Class<?> cls6 = Class.forName((String) objArr29[0]);
            Object[] objArr30 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{32115, 64252, 57036, 20314}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 23251), ViewConfiguration.getScrollBarSize() >> 8, new char[]{12185, 25634, 1185, 34244, 30129, 60029, 7156, 31580, 12799, 7158, 23534, 10350, 42679, 6934, 36610, 44818}, objArr30);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr30[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr31 = {2028577840};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 46038), 1133 - ImageFormat.getBitsPerPixel(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr32 = {Integer.valueOf(iIntValue3), 0, 665585869, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr31), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                int i35 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte b21 = $$a[7];
                byte b22 = b21;
                Object[] objArr33 = new Object[1];
                c(b22, (short) (b22 | 141), b21, objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, windowTouchSlop, i35, 1298546779, false, (String) objArr33[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1118 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Color.alpha(0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iRed = Color.red(0) + 1031;
                int i36 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                Object[] objArr34 = new Object[1];
                c((byte) 52, (short) ($$b & 983), $$a[28], objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(doubleTapTimeout, iRed, i36, 632103528, false, (String) objArr34[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr35 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{Typography.dollar, 23705, 53174, 11855}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 107), KeyEvent.normalizeMetaState(0), new char[]{668, 21740, 11688, 32074, 33243, 60362, 48285, 15520, 25069, 1137, 36400, 48686, 7902, 31680, 30270, 39092, 12154, 61842, 28616, 26414, 16578, 18220}, objArr35);
                Class<?> cls7 = Class.forName((String) objArr35[0]);
                Object[] objArr36 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{12250, 51110, 50131, 42878}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.thank_you).substring(0, 1).codePointAt(0) + 32367), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 741890624, new char[]{35931, 17223, 12447, 49538, 55557, 678, 57223, 17042, 38708, 27989, 22305, 27528, 52644, 43983, 35338}, objArr36);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr36[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i37 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
                    byte b23 = $$a[7];
                    byte b24 = b23;
                    Object[] objArr37 = new Object[1];
                    c(b24, (short) (b24 | 37), b23, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, i37, deadChar, 1344079056, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int i38 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i39 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b25 = $$a[7];
                    byte b26 = b25;
                    Object[] objArr38 = new Object[1];
                    c(b26, (short) (b26 | 141), b25, objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cKeyCodeFromString, i38, i39, 1357589585, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i40 = ((int[]) objArr[1])[0];
        int i41 = ((int[]) objArr[3])[0];
        if (i41 == i40) {
            int i42 = onTransact + 87;
            notify = i42 % 128;
            int i43 = i42 % 2;
            Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i44 = ((int[]) objArr[2])[0];
            int i45 = ((int[]) objArr[3])[0];
            int i46 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i47 = ~iIdentityHashCode;
            int i48 = i44 + (-1648014114) + (((~(138284669 | i47)) | 382564839) * (-90)) + (((~(138284669 | iIdentityHashCode)) | 137496088) * (-45)) + (((~(iIdentityHashCode | (-382564840))) | 138284669 | (~(i47 | 382564839))) * 45);
            int i49 = i48 ^ (i48 << 13);
            int i50 = i49 ^ (i49 >>> 17);
            ((int[]) objArr39[2])[0] = i50 ^ (i50 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i51 = onTransact + 27;
            notify = i51 % 128;
            int i52 = 2;
            int i53 = i51 % 2;
            int i54 = 0;
            while (i54 < strArr4.length) {
                int i55 = onTransact + 1;
                notify = i55 % 128;
                if (i55 % i52 != 0) {
                    arrayList2.add(strArr4[i54]);
                    i54 += 16;
                } else {
                    arrayList2.add(strArr4[i54]);
                    i54++;
                }
                int i56 = onTransact + 43;
                notify = i56 % 128;
                int i57 = i56 % 2;
                i52 = 2;
            }
            i = i52;
        } else {
            i = 2;
        }
        int[] iArr2 = new int[i41];
        int i58 = i41 - 1;
        iArr2[i58] = 1;
        Toast.makeText((Context) null, iArr2[((i41 * i58) % i) - 1], 1).show();
        Object[] objArr40 = new Object[4];
        objArr40[1] = new int[]{i};
        objArr40[i] = new int[1];
        objArr40[3] = new int[]{i};
        int i59 = ((int[]) objArr[i])[0];
        int i60 = ((int[]) objArr[3])[0];
        int i61 = ((int[]) objArr[1])[0];
        objArr40[0] = (String[]) objArr[0];
        int i62 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i63 = i59 + ((((-1330492805) + (((~((~i62) | (-99823597))) | 9448300) * 446)) + (((~(i62 | (-90375297))) | 135008273) * 446)) - 81025496);
        int i64 = (i63 << 13) ^ i63;
        int i65 = i64 ^ (i64 >>> 17);
        ((int[]) objArr40[2])[0] = i65 ^ (i65 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1216473583
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
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = notify + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_mandiri_clickpay).substring(1, 3).length() - 1068448676;
        int i5 = ~length;
        if (i4 != 183490024 + (((~((-170508337) | i5)) | 622640 | (~(1000495879 | i5))) * (-1136)) + (((~((-170508337) | length)) | (~(1000495879 | length)) | (~((-830610184) | i5))) * (-568)) + (((~(length | (-622641))) | (~(i5 | (-1000495880))) | (~(170508336 | i5))) * 568)) {
            throw new RuntimeException("-908359682");
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyTid = Process.myTid();
        int i7 = ~iMyTid;
        if (i6 != 1980786376 + (((~((-165951517) | i7)) | (-1881862848)) * (-602)) + (((~(iMyTid | (-165951517))) | 163842048 | (~((-1879753380) | i7))) * (-301)) + ((~(i7 | (-1881862848))) * 301)) {
            int[] iArr = new int[1402775775];
            iArr[1402775774] = 1;
            int i8 = (-2054108830) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i9 = notify + 53;
            onTransact = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 / 3;
            }
        }
        super.onCreate(bundle);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding = (ActivityRegistrationVerifyEmailOtpBinding) objArr[0];
        NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity = (NewRegistrationVerifyEmailOtpActivity) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 93;
        notify = i2 % 128;
        int i3 = i2 % 2;
        OtpView otpView = activityRegistrationVerifyEmailOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, newRegistrationVerifyEmailOtpActivity);
        int i4 = notify + 117;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 6) {
            int i2 = onTransact + 121;
            notify = i2 % 128;
            int i3 = i2 % 2;
            MaterialButton materialButton = activityRegistrationVerifyEmailOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = activityRegistrationVerifyEmailOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
            int i4 = onTransact + 15;
            notify = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = notify + 59;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentbindingInflater1(NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        notify = i2 % 128;
        int i3 = i2 % 2;
        RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newRegistrationVerifyEmailOtpActivity.getIntent().getParcelableExtra("unregistered_data");
        int i4 = notify + 43;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return registrationForUnregistered;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            newRegistrationVerifyEmailOtpActivity.onBackPressed();
            ViewPortBuilder.b();
            int i4 = notify + 89;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 38 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = notify + 99;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            newRegistrationVerifyEmailOtpActivity.d_();
            unit = Unit.INSTANCE;
            int i3 = 70 / 0;
        } else {
            newRegistrationVerifyEmailOtpActivity.d_();
            unit = Unit.INSTANCE;
        }
        int i4 = notify + 95;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity, ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding, View view) {
        String str;
        String str2 = "";
        int i = 2 % 2;
        int i2 = notify + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            isSticky issticky = (isSticky) newRegistrationVerifyEmailOtpActivity.asBinder.getValue();
            String string = ((PreferenceManager) newRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", "");
            if (((RegisteredMemberRegistration) newRegistrationVerifyEmailOtpActivity.g.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationVerifyEmailOtpActivity.g.getValue();
                if (registeredMemberRegistration != null) {
                    int i4 = notify + 43;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                } else {
                    int i6 = onTransact + 49;
                    notify = i6 % 128;
                    int i7 = i6 % 2;
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            } else if (((RegistrationForUnregistered) newRegistrationVerifyEmailOtpActivity.a.getValue()) != null) {
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newRegistrationVerifyEmailOtpActivity.a.getValue();
                if (registrationForUnregistered != null) {
                    int i8 = onTransact + 37;
                    notify = i8 % 128;
                    if (i8 % 2 != 0) {
                        String str3 = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        throw null;
                    }
                    str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    str = null;
                }
                if (str == null) {
                    int i9 = notify + 55;
                    onTransact = i9 % 128;
                    int i10 = i9 % 2;
                    str = "";
                }
            } else {
                MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) newRegistrationVerifyEmailOtpActivity.d.getValue();
                if (migrantWorkerRegistration != null) {
                    int i11 = onTransact + 41;
                    notify = i11 % 128;
                    if (i11 % 2 != 0) {
                        str = migrantWorkerRegistration.getItem;
                        int i12 = 58 / 0;
                    } else {
                        str = migrantWorkerRegistration.getItem;
                    }
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            }
            String string2 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationVerifyEmailOtpBinding.otpVerify.getText())).toString();
            if (((RegisteredMemberRegistration) newRegistrationVerifyEmailOtpActivity.g.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newRegistrationVerifyEmailOtpActivity.g.getValue();
                String str4 = registeredMemberRegistration2 != null ? registeredMemberRegistration2.INotificationSideChannel : null;
                if (str4 == null) {
                    int i13 = onTransact + 105;
                    notify = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                } else {
                    str2 = str4;
                }
            } else if (((RegistrationForUnregistered) newRegistrationVerifyEmailOtpActivity.a.getValue()) != null) {
                RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) newRegistrationVerifyEmailOtpActivity.a.getValue();
                String str5 = registrationForUnregistered2 != null ? registrationForUnregistered2.connect : null;
                if (str5 != null) {
                    str2 = str5;
                }
            }
            issticky.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string, str, string2, str2);
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x003a A[PHI: r3
  0x003a: PHI (r3v11 getCameraCharacteristic) = (r3v6 getCameraCharacteristic), (r3v12 getCameraCharacteristic) binds: [B:12:0x0029, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Unit b(NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        getCameraCharacteristic getcameracharacteristic;
        int i = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            getCameraCharacteristic getcameracharacteristic2 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i2 = notify + 65;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    newRegistrationVerifyEmailOtpActivity.IconCompatParcelizer();
                    getcameracharacteristic = newRegistrationVerifyEmailOtpActivity.b;
                    int i3 = 98 / 0;
                    if (getcameracharacteristic == null) {
                        int i4 = notify + 79;
                        onTransact = i4 % 128;
                        int i5 = i4 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        getcameracharacteristic2 = getcameracharacteristic;
                    }
                } else {
                    newRegistrationVerifyEmailOtpActivity.IconCompatParcelizer();
                    getcameracharacteristic = newRegistrationVerifyEmailOtpActivity.b;
                    if (getcameracharacteristic == null) {
                        int i6 = notify + 79;
                        onTransact = i6 % 128;
                        int i7 = i6 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        getcameracharacteristic2 = getcameracharacteristic;
                    }
                }
                getcameracharacteristic2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newRegistrationVerifyEmailOtpActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        } else {
            newRegistrationVerifyEmailOtpActivity.MediaBrowserCompat();
            int i8 = notify + 65;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i10 = notify + 119;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity, ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding, View view) {
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 29;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (((RegisteredMemberRegistration) newRegistrationVerifyEmailOtpActivity.g.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationVerifyEmailOtpActivity.g.getValue();
                if (registeredMemberRegistration != null) {
                    int i4 = onTransact + 39;
                    notify = i4 % 128;
                    if (i4 % 2 != 0) {
                        String str2 = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                        throw null;
                    }
                    str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                } else {
                    str = null;
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newRegistrationVerifyEmailOtpActivity.a.getValue();
                if (registrationForUnregistered != null) {
                    str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    str = null;
                }
            }
            activityRegistrationVerifyEmailOtpBinding.otpVerify.getEditableText().clear();
            if (str != null) {
                int i5 = onTransact + 29;
                notify = i5 % 128;
                int i6 = i5 % 2;
                setSplitTrack setsplittrack = (setSplitTrack) newRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                String string = ((PreferenceManager) newRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).getString("OCR_TRANSACTION_ID", "");
                String string2 = Settings.Secure.getString(newRegistrationVerifyEmailOtpActivity.getContentResolver(), "android_id");
                Intrinsics.checkExpressionValueIsNotNull(string2, "");
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newRegistrationVerifyEmailOtpActivity.g.getValue();
                setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string, new EmailVerificationRequest(string2, str, String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.INotificationSideChannel : null)));
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            String str = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                newRegistrationVerifyEmailOtpActivity.IconCompatParcelizer();
                Object obj = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
                String str2 = newRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str2 == null) {
                    int i2 = onTransact + 85;
                    notify = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str = str2;
                }
                if (Intrinsics.areEqual(obj, str)) {
                    RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationVerifyEmailOtpActivity.g.getValue();
                    if (registeredMemberRegistration != null) {
                        MembershipType membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                    if (((RegisteredMemberRegistration) newRegistrationVerifyEmailOtpActivity.g.getValue()) != null) {
                        Intent intent = new Intent();
                        intent.putExtra("registration_data_verify", (RegisteredMemberRegistration) newRegistrationVerifyEmailOtpActivity.g.getValue());
                        newRegistrationVerifyEmailOtpActivity.setResult(-1, intent);
                        newRegistrationVerifyEmailOtpActivity.finish();
                    }
                    if (((RegistrationForUnregistered) newRegistrationVerifyEmailOtpActivity.a.getValue()) != null) {
                        NewPhoneVerificationActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewPhoneVerificationActivity.INSTANCE;
                        NewPhoneVerificationActivity.Companion.b(newRegistrationVerifyEmailOtpActivity, (RegistrationForUnregistered) newRegistrationVerifyEmailOtpActivity.a.getValue());
                        newRegistrationVerifyEmailOtpActivity.d_();
                    }
                    if (((MigrantWorkerRegistration) newRegistrationVerifyEmailOtpActivity.d.getValue()) != null) {
                        IndonesianMigrantWorkerRegistrationSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = IndonesianMigrantWorkerRegistrationSuccessActivity.INSTANCE;
                        IndonesianMigrantWorkerRegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(newRegistrationVerifyEmailOtpActivity, (MigrantWorkerRegistration) newRegistrationVerifyEmailOtpActivity.d.getValue());
                    }
                    int i4 = notify + 73;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    String string = newRegistrationVerifyEmailOtpActivity.getString(R.string.error_signature_checking);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(newRegistrationVerifyEmailOtpActivity, string, "Coba Kembali", new Function0() { // from class: Function
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        }
                    });
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i6 = onTransact + 19;
                notify = i6 % 128;
                int i7 = i6 % 2;
                newRegistrationVerifyEmailOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationVerifyEmailOtpBinding) ((ViewBinding) newRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        } else {
            newRegistrationVerifyEmailOtpActivity.MediaBrowserCompat();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ MigrantWorkerRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = notify + 11;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) newRegistrationVerifyEmailOtpActivity.getIntent().getParcelableExtra("migration_worker_data");
        int i3 = onTransact + 55;
        notify = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 34 / 0;
        }
        return migrantWorkerRegistration;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity = (NewRegistrationVerifyEmailOtpActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 55;
        notify = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newRegistrationVerifyEmailOtpActivity.MediaBrowserCompat();
            return null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newRegistrationVerifyEmailOtpActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
            return null;
        }
        int i4 = i2 + 97;
        notify = i4 % 128;
        int i5 = i4 % 2;
        newRegistrationVerifyEmailOtpActivity.IconCompatParcelizer();
        newRegistrationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
        int i6 = notify + 85;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void b(ActivityRegistrationVerifyEmailOtpBinding activityRegistrationVerifyEmailOtpBinding, NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1494785354, iTuitionPaymentFragmentbindingInflater1, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, 1494785354, iTuitionPaymentFragmentbindingInflater3, new Object[]{activityRegistrationVerifyEmailOtpBinding, newRegistrationVerifyEmailOtpActivity});
    }

    public static /* synthetic */ RegisteredMemberRegistration b(NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
        return (RegisteredMemberRegistration) TuitionPaymentFragmentspecialinlinedviewModeldefault1(-1452124353, iTuitionPaymentFragmentbindingInflater1, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, 1452124357, iTuitionPaymentFragmentbindingInflater3, new Object[]{newRegistrationVerifyEmailOtpActivity});
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationVerifyEmailOtpActivity newRegistrationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(-882343546, iTuitionPaymentFragmentbindingInflater1, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, 882343547, iTuitionPaymentFragmentbindingInflater3, new Object[]{newRegistrationVerifyEmailOtpActivity, virtualCameraAdapter1});
    }

    static {
        INotificationSideChannelStub = 1;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannelDefault + 77;
        INotificationSideChannelStub = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        int i3 = i2 % 128;
        notify = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_registration_verify_email_otp;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = notify + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(730182625, iTuitionPaymentFragmentbindingInflater1, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -730182623, iTuitionPaymentFragmentbindingInflater2, new Object[]{this});
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int iCodePointAt = (-763022151) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = OfficeDataStore$$ExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(1490610710, iCodePointAt, addTask.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1490610707, iTuitionPaymentFragmentbindingInflater1, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    static void g() {
        cancelAll = -6377398940819159759L;
        INotificationSideChannel = -981105359;
        cancel = (char) 32453;
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
    private static java.lang.String $$i(short r6, short r7, int r8) {
        /*
            int r8 = 104 - r8
            int r7 = r7 + 4
            byte[] r0 = com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.$$c
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
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
            int r3 = r3 + 1
            int r7 = r7 + 1
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
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationVerifyEmailOtpActivity.$$i(short, short, int):java.lang.String");
    }
}
