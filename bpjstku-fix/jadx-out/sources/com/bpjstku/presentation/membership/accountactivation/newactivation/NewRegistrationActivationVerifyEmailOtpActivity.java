package com.bpjstku.presentation.membership.accountactivation.newactivation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyEmailOtpActivity;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerRegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.tasks.zzu;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.mukesh.OtpView;
import defpackage.IntegerRes;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getCameraCharacteristic;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isSticky;
import defpackage.mapPoint;
import defpackage.notifyStateAttached;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setCompoundDrawables;
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
import kotlin.io.ReadAfterEOFException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u0015\u0010\u0018\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0007\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0015\u0010\u0006\u001a\u00020!8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0015\u0010\u001a\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u0017\u0010\n\u001a\u0004\u0018\u00010$8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0017\u0010\t\u001a\u0004\u0018\u00010%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0017\u0010\b\u001a\u0004\u0018\u00010&8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0017R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00020'8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010)R\u001a\u0010\u0016\u001a\u00020*8\u0015X\u0095D¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b\u0018\u0010,"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/newactivation/NewRegistrationActivationVerifyEmailOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationActivationVerifyEmailOtpBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "onResume", "onStop", "onDestroy", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "LIntegerRes;", "notify", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/data/lib/PreferenceManager;", "g", "", "cancelAll", "Ljava/lang/String;", "LgetCameraCharacteristic;", "LgetCameraCharacteristic;", "TuitionPaymentFragmentbindingInflater1", "LsetSplitTrack;", "LisSticky;", "d", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewRegistrationActivationVerifyEmailOtpActivity extends BindingBaseActivity<ActivityRegistrationActivationVerifyEmailOtpBinding> {
    private static char[] INotificationSideChannel;
    private static int IconCompatParcelizer;
    private static boolean RemoteActionCompatParcelizer;
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static boolean cancel;
    private static int onTransact;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private getCameraCharacteristic TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {1, 115, -83, 116};
    private static final int $$f = 165;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {14, 116, 92, -78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 148;
    private static int INotificationSideChannelDefault = 0;
    private static int INotificationSideChannelStub = 0;
    private static int getInterfaceDescriptor = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy asBinder = LazyKt.lazy(new Function0() { // from class: setCompoundDrawablesRelative
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: setCustomSelectionActionModeCallback
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: setSupportBackgroundTintList
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int notify = R.layout.activity_registration_activation_verify_email_otp;

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        b(Function1 function1) {
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

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws IllegalAccessException {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = (~((~i5) | i8)) | i7;
        int i10 = i3 | i8;
        int i11 = (~(i5 | i7 | i8)) | (~(i | i3));
        int i12 = i + i3 + i4 + (2049387148 * i2) + ((-609071723) * i6);
        int i13 = i12 * i12;
        int i14 = ((335895516 * i) - 1139737737) + (i3 * 335898315) + (i9 * 933) + (i10 * (-1866)) + (i11 * 933) + (i4 * 335896449) + (i2 * (-616405876)) + (i6 * 126640917) + (i13 * 2020605952);
        int i15 = ((1483459036 * i) - 1284505600) + (2005429323 * i3) + (i9 * 1605645861) + (1083675574 * i10) + (1605645861 * i11) + ((-1205862400) * i4) + ((-243269632) * i2) + ((-895483904) * i6) + ((-1334837248) * i13) + (i14 * i14 * (-544210944));
        if (i15 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i15 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i15 == 4) {
            return b(objArr);
        }
        if (i15 == 5) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity = (NewRegistrationActivationVerifyEmailOtpActivity) objArr[0];
        int i16 = 2 % 2;
        if (((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null) != ((((~(i | (-86147))) | (-934936044)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 621623910) + ((~((-86147) | i8)) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) {
            int i17 = getInterfaceDescriptor + 17;
            INotificationSideChannelStub = i17 % 128;
            if (i17 % 2 != 0) {
                int[] iArr = new int[1924512703];
                iArr[1924512702] = 0;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            } else {
                int[] iArr2 = new int[1924512703];
                iArr2[1924512702] = 1;
                int i18 = (-1357849406) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
            int i19 = getInterfaceDescriptor + 73;
            INotificationSideChannelStub = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iNextInt = new Random().nextInt(818455512);
        int i22 = ~iNextInt;
        int i23 = (~((-2002894596) | i22)) | 574719489;
        int i24 = ~(iNextInt | 2004336475);
        if (i21 != ((i23 | i24) * (-252)) + 1379479128 + ((i24 | (~(i22 | (-1428175107)))) * 252)) {
            throw new RuntimeException("-1394948490");
        }
        super.onStart();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r9 = r9 + 1
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyEmailOtpActivity.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r8 = r9
            r4 = r2
            goto L29
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
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r3 + 1
            int r8 = r8 + (-11)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyEmailOtpActivity.c(short, short, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        throw null;
    }

    public NewRegistrationActivationVerifyEmailOtpActivity() {
        final NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyEmailOtpActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = newRegistrationActivationVerifyEmailOtpActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyEmailOtpActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = newRegistrationActivationVerifyEmailOtpActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyEmailOtpActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = newRegistrationActivationVerifyEmailOtpActivity2;
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
        this.g = LazyKt.lazy(new Function0<isSticky>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyEmailOtpActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, isSticky] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ isSticky invoke() {
                LifecycleOwner lifecycleOwner = newRegistrationActivationVerifyEmailOtpActivity2;
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyEmailOtpActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/newactivation/NewRegistrationActivationVerifyEmailOtpActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()I", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return NewRegistrationActivationVerifyEmailOtpActivity.d();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        IconCompatParcelizer = 1;
        g();
        INSTANCE = new Companion(null);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 100;
        int i = INotificationSideChannelDefault + 43;
        IconCompatParcelizer = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegistrationActivationVerifyEmailOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        NewRegistrationActivationVerifyEmailOtpActivity$bindingInflater$1 newRegistrationActivationVerifyEmailOtpActivity$bindingInflater$1 = NewRegistrationActivationVerifyEmailOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return newRegistrationActivationVerifyEmailOtpActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.notify;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = INotificationSideChannel;
        char c = '0';
        int i3 = 0;
        if (cArr2 != null) {
            int i4 = $10 + 15;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char jumpTapTimeout = (char) (31339 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int iArgb = 2994 - Color.argb(i3, i3, i3, i3);
                        int iLastIndexOf = TextUtils.lastIndexOf("", c) + 18;
                        byte b2 = $$c[i3];
                        byte b3 = (byte) (b2 - 1);
                        byte b4 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iArgb, iLastIndexOf, 1182129903, false, $$i(b3, b4, (byte) (-b4)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
                    i3 = 0;
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
        Object[] objArr3 = {Integer.valueOf(onTransact)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - TextUtils.getCapsMode("", 0, 0)), KeyEvent.keyCodeFromString("") + 253, MotionEvent.axisFromString("") + 23, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i7 = 33602;
        int i8 = 1687675375;
        if (RemoteActionCompatParcelizer) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i9 = $11 + 121;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char fadingEdgeLength = (char) (i7 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int iIndexOf = 3084 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iResolveOpacity = 26 - Drawable.resolveOpacity(0, 0);
                    byte b5 = $$c[0];
                    byte b6 = (byte) (b5 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, iIndexOf, iResolveOpacity, -2146875848, false, $$i(b6, b6, (byte) (-b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i7 = 33602;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!(!cancel)) {
            int i11 = $10 + 43;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i13 = $11 + 19;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i15 = $10 + 49;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 % getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] / iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cGreen = (char) (33602 - Color.green(0));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3085;
                        int i16 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
                        byte b7 = $$c[0];
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, keyRepeatTimeout, i16, -2146875848, false, $$i(b8, b8, (byte) (-b7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } else {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char longPressTimeout = (char) (33602 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int absoluteGravity = 3085 - Gravity.getAbsoluteGravity(0, 0);
                        int offsetAfter = 26 - TextUtils.getOffsetAfter("", 0);
                        byte b9 = $$c[0];
                        byte b10 = (byte) (b9 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, absoluteGravity, offsetAfter, -2146875848, false, $$i(b10, b10, (byte) (-b9)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    i8 = 1687675375;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i17 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i17 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityRegistrationActivationVerifyEmailOtpBinding activityRegistrationActivationVerifyEmailOtpBinding = (ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityRegistrationActivationVerifyEmailOtpBinding.btnChangeEmail.setOnClickListener(new View.OnClickListener() { // from class: initEmojiKeyListener
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationActivationVerifyEmailOtpActivity.b(this.b, view);
            }
        });
        activityRegistrationActivationVerifyEmailOtpBinding.btnVerification.setOnClickListener(new View.OnClickListener() { // from class: onCreateInputConnection
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, activityRegistrationActivationVerifyEmailOtpBinding, view);
            }
        });
        activityRegistrationActivationVerifyEmailOtpBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: setEmojiCompatEnabled
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) throws IllegalAccessException {
                NewRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityRegistrationActivationVerifyEmailOtpBinding, this);
            }
        });
        OtpView otpView = activityRegistrationActivationVerifyEmailOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: setKeyListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityRegistrationActivationVerifyEmailOtpBinding, (String) obj);
            }
        }));
        activityRegistrationActivationVerifyEmailOtpBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: setDropDownBackgroundResource
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, activityRegistrationActivationVerifyEmailOtpBinding, view);
            }
        });
        int i2 = getInterfaceDescriptor + 105;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity = this;
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).onTransact.observe(newRegistrationActivationVerifyEmailOtpActivity, new b(new Function1() { // from class: setSupportCompoundDrawablesTintList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationActivationVerifyEmailOtpActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((isSticky) this.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(newRegistrationActivationVerifyEmailOtpActivity, new b(new Function1() { // from class: setSupportCompoundDrawablesTintMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((isSticky) this.g.getValue()).TuitionPaymentFragmentbindingInflater1.observe(newRegistrationActivationVerifyEmailOtpActivity, new b(new setCompoundDrawables(this)));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(newRegistrationActivationVerifyEmailOtpActivity, new b(new Function1() { // from class: isEmojiCompatEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = INotificationSideChannelStub + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b();
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i4 = INotificationSideChannelStub + 89;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity = this;
        Intrinsics.checkNotNullParameter(newRegistrationActivationVerifyEmailOtpActivity, "");
        newRegistrationActivationVerifyEmailOtpActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_string_null));
        TextView textView = ((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvEmail;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.asBinder.getValue();
        if (registeredMemberRegistration == null || (str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1) == null) {
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) this.asInterface.getValue();
            str = registrationForUnregistered != null ? registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
        }
        int i4 = INotificationSideChannelStub + 101;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        textView.setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        Object obj = null;
        this.TuitionPaymentFragmentbindingInflater1 = new getCameraCharacteristic(((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        int i2 = getInterfaceDescriptor + 5;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IllegalAccessException {
        NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity = (NewRegistrationActivationVerifyEmailOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i5 = ~iFreeMemory;
        if (i4 != (-1273806040) + ((201329158 | i5) * (-192)) + (((~(1577732638 | i5)) | 546415937) * (-384)) + (((~(iFreeMemory | (-1376403481))) | (~(i5 | 2124148575)) | (~((-546415938) | iFreeMemory))) * DerHeader.TAG_CLASS_PRIVATE)) {
            throw new RuntimeException("-902165968");
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        if (i6 != (((~((~iMaxMemory) | 2077752749)) * 130) - 750250056) + (((~(iMaxMemory | 2077752749)) | 286261248) * 130)) {
            throw null;
        }
        super.onResume();
        getCameraCharacteristic getcameracharacteristic = newRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            int i7 = getInterfaceDescriptor + 123;
            INotificationSideChannelStub = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i8 != 0) {
                throw null;
            }
            getcameracharacteristic = null;
        }
        getcameracharacteristic.b();
        int i9 = getInterfaceDescriptor + 113;
        INotificationSideChannelStub = i9 % 128;
        if (i9 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        INotificationSideChannelStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = INotificationSideChannelStub + 41;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onStop();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 109;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            int i5 = i2 + 81;
            INotificationSideChannelStub = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
        int i7 = getInterfaceDescriptor + 61;
        INotificationSideChannelStub = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        INotificationSideChannelStub = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
                int i3 = getInterfaceDescriptor + 43;
                INotificationSideChannelStub = i3 % 128;
                int i4 = i3 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        d_();
        int i4 = getInterfaceDescriptor + 7;
        INotificationSideChannelStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:17:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:19:0x0193  */
    /* JADX WARN: Code duplicated, block: B:22:0x01ec A[Catch: all -> 0x0a48, TryCatch #1 {all -> 0x0a48, blocks: (B:20:0x01d8, B:22:0x01ec, B:23:0x021f, B:62:0x06fa, B:64:0x070e, B:65:0x073a, B:67:0x076c, B:68:0x07da), top: B:104:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0239  */
    /* JADX WARN: Code duplicated, block: B:31:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x0317  */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 103;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            super.attachBaseContext(context);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte b2 = $$a[7];
                short s = b2;
                Object[] objArr2 = new Object[1];
                c(b2, s, (byte) (s | 37), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, iLastIndexOf, threadPriority, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            int i3 = 28 / 0;
            if (j != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int iGreen = 1755 - Color.green(0);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                    byte b3 = $$a[7];
                    Object[] objArr3 = new Object[1];
                    c(b3, (short) (b3 | 37), (byte) 52, objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iGreen, scrollBarFadeDuration, 1599039318, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
                int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
                int i5 = ~i4;
                int i6 = (-565407836) + ((111461004 | i5) * (-757)) + ((~((-198946) | i4)) * 1514) + (((~(i4 | 111659949)) | (~(i5 | (-101141422))) | 100942476) * 757) + 688515026;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr5 = new Object[1];
                e(null, null, View.resolveSize(0, 0) + 127, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                e(null, null, TextUtils.indexOf("", "", 0, 0) + 127, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr7 = {-757941005};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42049), 1726 - ((Process.getThreadPriority(0) + 20) >> 6), 29 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr7), 688515026, false, true);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 23;
                        byte b4 = $$a[7];
                        Object[] objArr8 = new Object[1];
                        c(b4, (short) (b4 | 37), (byte) 52, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, edgeSlop, tapTimeout, 1599039318, false, (String) objArr8[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                    try {
                        Object[] objArr9 = new Object[1];
                        e(null, null, 126 - TextUtils.lastIndexOf("", '0', 0), new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        e(null, null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr10);
                        long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                            int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                            byte b5 = $$a[7];
                            Object[] objArr11 = new Object[1];
                            c(b5, (short) (b5 | 89), (byte) 52, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, i9, jumpTapTimeout, 1596667560, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1756;
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
                            byte b6 = $$a[7];
                            short s2 = b6;
                            Object[] objArr12 = new Object[1];
                            c(b6, s2, (byte) (s2 | 37), objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, modifierMetaStateMask, maximumFlingVelocity, 986134021, false, (String) objArr12[0], null);
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
                char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                int i10 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
                byte b7 = $$a[7];
                short s3 = b7;
                Object[] objArr13 = new Object[1];
                c(b7, s3, (byte) (s3 | 37), objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMyTid, iIndexOf, i10, 986134021, false, (String) objArr13[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c2 = (char) (29945 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int iGreen2 = 1755 - Color.green(0);
                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                    byte b8 = $$a[7];
                    Object[] objArr14 = new Object[1];
                    c(b8, (short) (b8 | 37), (byte) 52, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iGreen2, scrollBarFadeDuration2, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int i11 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
                int i12 = ~i11;
                int i13 = (-565407836) + ((111461004 | i12) * (-757)) + ((~((-198946) | i11)) * 1514) + (((~(i11 | 111659949)) | (~(i12 | (-101141422))) | 100942476) * 757) + 688515026;
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i15 ^ (i15 << 5);
            } else {
                Object[] objArr16 = new Object[1];
                e(null, null, View.resolveSize(0, 0) + 127, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr16);
                Class<?> cls3 = Class.forName((String) objArr16[0]);
                Object[] objArr17 = new Object[1];
                e(null, null, TextUtils.indexOf("", "", 0, 0) + 127, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr17);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr18 = {-757941005};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42049), 1726 - ((Process.getThreadPriority(0) + 20) >> 6), 29 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr18), 688515026, false, true);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char windowTouchSlop2 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 23;
                    byte b9 = $$a[7];
                    Object[] objArr19 = new Object[1];
                    c(b9, (short) (b9 | 37), (byte) 52, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop2, edgeSlop2, tapTimeout2, 1599039318, false, (String) objArr19[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                Object[] objArr20 = new Object[1];
                e(null, null, 126 - TextUtils.lastIndexOf("", '0', 0), new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr20);
                Class<?> cls4 = Class.forName((String) objArr20[0]);
                Object[] objArr110 = new Object[1];
                e(null, null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr110);
                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr110[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cNormalizeMetaState2 = (char) (29944 - KeyEvent.normalizeMetaState(0));
                    int i16 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                    byte b10 = $$a[7];
                    Object[] objArr111 = new Object[1];
                    c(b10, (short) (b10 | 89), (byte) 52, objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState2, i16, jumpTapTimeout2, 1596667560, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char keyRepeatTimeout2 = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1756;
                    int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
                    byte b11 = $$a[7];
                    short s4 = b11;
                    Object[] objArr112 = new Object[1];
                    c(b11, s4, (byte) (s4 | 37), objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout2, modifierMetaStateMask2, maximumFlingVelocity2, 986134021, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
            }
        }
        int i17 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i18 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr21 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = ~iIdentityHashCode;
            int i21 = (~(214185848 | i20)) | 288374914;
            int i22 = ~(iIdentityHashCode | (-75772489));
            int i23 = i19 + (((i21 | i22) * (-252)) - 131363279) + ((i22 | (~(i20 | 502560762))) * 252);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr21[3])[0] = i25 ^ (i25 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                int i26 = 0;
                while (i26 < strArr.length) {
                    int i27 = INotificationSideChannelStub + 31;
                    getInterfaceDescriptor = i27 % 128;
                    if (i27 % 2 == 0) {
                        arrayList.add(strArr[i26]);
                        i26 += 59;
                    } else {
                        arrayList.add(strArr[i26]);
                        i26++;
                    }
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i28 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr22 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minutes).substring(0, 1).codePointAt(0) + 1314536822;
            int i29 = i28 + 1010136612 + (((~((~iCodePointAt) | 733156388)) | 335806922) * 529) + (((~(iCodePointAt | 733156388)) | 520553962) * 529);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr22[3])[0] = i31 ^ (i31 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
            int iArgb = 15 - Color.argb(0, 0, 0, 0);
            byte b12 = $$a[7];
            Object[] objArr23 = new Object[1];
            c(b12, (short) (b12 | 141), (byte) 52, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, packedPositionGroup, iArgb, 1357589585, false, (String) objArr23[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr24 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 11, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr24);
        Class<?> cls5 = Class.forName((String) objArr24[0]);
        Object[] objArr25 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr25);
        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
            int size = 15 - View.MeasureSpec.getSize(0);
            byte b13 = $$a[7];
            Object[] objArr26 = new Object[1];
            c(b13, (short) (b13 | 37), (byte) 52, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMakeMeasureSpec2, longPressTimeout, size, 1344079056, false, (String) objArr26[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int i32 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
                int iIndexOf2 = TextUtils.indexOf("", "") + 15;
                byte[] bArr = $$a;
                byte b14 = bArr[5];
                Object[] objArr27 = new Object[1];
                c(b14, (short) (b14 | 192), bArr[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cAxisFromString, i32, iIndexOf2, 632103528, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr28[3])[0];
            int i34 = ((int[]) objArr28[1])[0];
            String[] strArr2 = (String[]) objArr28[0];
            int i35 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation | (-170483100));
            int i36 = (((((-448388512) | i35) * (-196)) - 375408167) + ((i35 | 277905412) * 196)) - 328035430;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr[2])[0] = i38 ^ (i38 << 5);
            int i39 = INotificationSideChannelStub + 39;
            getInterfaceDescriptor = i39 % 128;
            int i40 = i39 % 2;
        } else {
            Object[] objArr29 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contact_detail_title).substring(10, 12).length() + 125, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr29);
            Class<?> cls6 = Class.forName((String) objArr29[0]);
            Object[] objArr30 = new Object[1];
            e(null, null, Color.red(0) + 127, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr30);
            int iIntValue3 = ((Integer) cls6.getMethod((String) objArr30[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr31 = {-757941005};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46038 - Drawable.resolveOpacity(0, 0)), View.MeasureSpec.getSize(0) + 1134, TextUtils.getOffsetAfter("", 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr32 = {Integer.valueOf(iIntValue3), 0, -328035430, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr31), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cGreen = (char) Color.green(0);
                int tapTimeout3 = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                int iBlue = Color.blue(0) + 15;
                byte b15 = $$a[7];
                Object[] objArr33 = new Object[1];
                c(b15, (short) (b15 | 141), (byte) 52, objArr33);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cGreen, tapTimeout3, iBlue, 1298546779, false, (String) objArr33[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - ImageFormat.getBitsPerPixel(0)), 1117 - View.getDefaultSize(0, 0), 17 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int modifierMetaStateMask3 = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
                int mirror = '?' - AndroidCharacter.getMirror('0');
                byte[] bArr2 = $$a;
                byte b16 = bArr2[5];
                Object[] objArr34 = new Object[1];
                c(b16, (short) (b16 | 192), bArr2[7], objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(jumpTapTimeout3, modifierMetaStateMask3, mirror, 632103528, false, (String) objArr34[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr);
            try {
                Object[] objArr35 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr35);
                Class<?> cls7 = Class.forName((String) objArr35[0]);
                Object[] objArr36 = new Object[1];
                e(null, null, 127 - TextUtils.indexOf("", "", 0, 0), new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr36);
                long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr36[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char keyRepeatTimeout3 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iIndexOf3 = 1031 - TextUtils.indexOf("", "", 0);
                    int jumpTapTimeout4 = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b17 = $$a[7];
                    Object[] objArr37 = new Object[1];
                    c(b17, (short) (b17 | 37), (byte) 52, objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(keyRepeatTimeout3, iIndexOf3, jumpTapTimeout4, 1344079056, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cMakeMeasureSpec3 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i41 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int capsMode = 15 - TextUtils.getCapsMode("", 0, 0);
                    byte b18 = $$a[7];
                    Object[] objArr38 = new Object[1];
                    c(b18, (short) (b18 | 141), (byte) 52, objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cMakeMeasureSpec3, i41, capsMode, 1357589585, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i42 = ((int[]) objArr[1])[0];
        int i43 = ((int[]) objArr[3])[0];
        if (i43 == i42) {
            int i44 = getInterfaceDescriptor + 75;
            INotificationSideChannelStub = i44 % 128;
            int i45 = i44 % 2;
            Object[] objArr39 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i46 = ((int[]) objArr[2])[0];
            int i47 = ((int[]) objArr[3])[0];
            int i48 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i49 = 1691262335 + (((~((-108859015) | iIdentityHashCode2)) | 107807236 | (~(135421155 | iIdentityHashCode2))) * (-754));
            int i50 = ~((-107807237) | iIdentityHashCode2);
            int i51 = ~iIdentityHashCode2;
            int i52 = i46 + i49 + ((i50 | (~(243228391 | i51))) * (-754)) + ((i51 | (-108859015)) * 754);
            int i53 = i52 ^ (i52 << 13);
            int i54 = i53 ^ (i53 >>> 17);
            ((int[]) objArr39[2])[0] = i54 ^ (i54 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i43 / (((i43 - 1) * i43) % 2), 0).show();
        Object[] objArr40 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i55 = ((int[]) objArr[2])[0];
        int i56 = ((int[]) objArr[3])[0];
        int i57 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i58 = i55 + (-1170082785) + (((~(iMaxMemory | 229822401)) | (-14457769)) * (-465)) + ((229822401 | (~((-14457769) | iMaxMemory))) * 930) + ((iMaxMemory | (-4984873)) * 465);
        int i59 = (i58 << 13) ^ i58;
        int i60 = i59 ^ (i59 >>> 17);
        ((int[]) objArr40[2])[0] = i60 ^ (i60 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        INotificationSideChannelStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i5 = ~(321388934 | i4);
            if (i3 != (-906366046) + (((-1470668256) | i5) * (-814)) + ((i5 | (~((~i4) | 1151376477)) | 2097156) * 407) + (((~(i4 | (-1151376478))) | (~((-321388935) | i4)) | 2097156) * 407)) {
                throw null;
            }
        } else {
            int i6 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step3).substring(97, 99).codePointAt(1) - 1767221227;
            int i7 = (~((-604781373) | iCodePointAt)) | 537405740;
            if (i6 != (-1473026136) + (i7 * 992) + ((i7 | (~((~iCodePointAt) | (-1367393284)))) * (-496)) + ((iCodePointAt | (-1434768916)) * 496)) {
                throw null;
            }
        }
        int i8 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 977184045;
        if (i8 != ((529211726 + (((-405803521) | length) * (-381))) + (((~((~length) | 1636297179)) | (-1505145435)) * 381)) - 7681536) {
            int[] iArr = new int[1925638075];
            iArr[1925638074] = 1;
            int i9 = 1614813918 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i10 = INotificationSideChannelStub + 45;
            getInterfaceDescriptor = i10 % 128;
            int i11 = i10 % 2;
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 109;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            newRegistrationActivationVerifyEmailOtpActivity.d_();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        newRegistrationActivationVerifyEmailOtpActivity.d_();
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 111;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ void b(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            newRegistrationActivationVerifyEmailOtpActivity.onBackPressed();
            ViewPortBuilder.b();
            int i4 = INotificationSideChannelStub + 103;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 59;
        INotificationSideChannelStub = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newRegistrationActivationVerifyEmailOtpActivity.MediaBrowserCompat();
            int i4 = getInterfaceDescriptor + 53;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            newRegistrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
            newRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString();
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            int i6 = i2 + 13;
            INotificationSideChannelStub = i6 % 128;
            int i7 = i6 % 2;
            newRegistrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ActivityRegistrationActivationVerifyEmailOtpBinding activityRegistrationActivationVerifyEmailOtpBinding = (ActivityRegistrationActivationVerifyEmailOtpBinding) objArr[0];
        NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity = (NewRegistrationActivationVerifyEmailOtpActivity) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        OtpView otpView = activityRegistrationActivationVerifyEmailOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, newRegistrationActivationVerifyEmailOtpActivity);
        int i4 = INotificationSideChannelStub + 5;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityRegistrationActivationVerifyEmailOtpBinding activityRegistrationActivationVerifyEmailOtpBinding, String str) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 119;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0 ? str.length() >= 6 : str.length() >= 6) {
            MaterialButton materialButton = activityRegistrationActivationVerifyEmailOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
            int i4 = getInterfaceDescriptor + 99;
            INotificationSideChannelStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = getInterfaceDescriptor + 59;
            INotificationSideChannelStub = i6 % 128;
            if (i6 % 2 != 0) {
                MaterialButton materialButton3 = activityRegistrationActivationVerifyEmailOtpBinding.btnVerification;
                Intrinsics.checkNotNullExpressionValue(materialButton3, "");
                MaterialButton materialButton4 = materialButton3;
                Intrinsics.checkNotNullParameter(materialButton4, "");
                materialButton4.setEnabled(false);
            } else {
                MaterialButton materialButton5 = activityRegistrationActivationVerifyEmailOtpBinding.btnVerification;
                Intrinsics.checkNotNullExpressionValue(materialButton5, "");
                MaterialButton materialButton6 = materialButton5;
                Intrinsics.checkNotNullParameter(materialButton6, "");
                materialButton6.setEnabled(false);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ MigrantWorkerRegistration TuitionPaymentFragmentbindingInflater1(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) newRegistrationActivationVerifyEmailOtpActivity.getIntent().getParcelableExtra("migration_worker_data");
        int i4 = INotificationSideChannelStub + 95;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return migrantWorkerRegistration;
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 101;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.getIntent().getParcelableExtra("unregistered_data");
        int i3 = getInterfaceDescriptor + 121;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
        return registrationForUnregistered;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity, ActivityRegistrationActivationVerifyEmailOtpBinding activityRegistrationActivationVerifyEmailOtpBinding, View view) {
        String str;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (((RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                if (registeredMemberRegistration != null) {
                    str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1;
                } else {
                    int i4 = getInterfaceDescriptor + 23;
                    INotificationSideChannelStub = i4 % 128;
                    int i5 = i4 % 2;
                    str = null;
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue();
                if (registrationForUnregistered != null) {
                    int i6 = getInterfaceDescriptor + 59;
                    INotificationSideChannelStub = i6 % 128;
                    int i7 = i6 % 2;
                    str = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    int i8 = getInterfaceDescriptor + 23;
                    INotificationSideChannelStub = i8 % 128;
                    int i9 = i8 % 2;
                    str = null;
                }
            }
            activityRegistrationActivationVerifyEmailOtpBinding.otpVerify.getEditableText().clear();
            if (str != null) {
                setSplitTrack setsplittrack = (setSplitTrack) newRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                String string = Settings.Secure.getString(newRegistrationActivationVerifyEmailOtpActivity.getContentResolver(), "android_id");
                Intrinsics.checkExpressionValueIsNotNull(string, "");
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new EmailVerificationRequest(string, str, String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.INotificationSideChannel : null)));
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
    private static /* synthetic */ Object b(Object[] objArr) {
        final NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity = (NewRegistrationActivationVerifyEmailOtpActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 41;
        int i4 = i3 % 128;
        INotificationSideChannelStub = i4;
        int i5 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newRegistrationActivationVerifyEmailOtpActivity.MediaBrowserCompat();
        } else {
            if (!(true ^ (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
                int i6 = i4 + 31;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                newRegistrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
                Object obj = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
                String str = newRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                }
                if (Intrinsics.areEqual(obj, str)) {
                    if (((RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue()) != null) {
                        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                        if ((registeredMemberRegistration != null ? registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null) == MembershipType.PU) {
                            Intent intent = new Intent();
                            intent.putExtra("registration_data", (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue());
                            newRegistrationActivationVerifyEmailOtpActivity.setResult(-1, intent);
                            newRegistrationActivationVerifyEmailOtpActivity.finish();
                        } else {
                            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                            if ((registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null) != MembershipType.BPU) {
                                NewPhoneVerificationResetActivity.Companion companion = NewPhoneVerificationResetActivity.INSTANCE;
                                NewPhoneVerificationResetActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newRegistrationActivationVerifyEmailOtpActivity, (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue());
                                newRegistrationActivationVerifyEmailOtpActivity.d_();
                            } else {
                                Intent intent2 = new Intent();
                                intent2.putExtra("registration_data", (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue());
                                newRegistrationActivationVerifyEmailOtpActivity.setResult(-1, intent2);
                                newRegistrationActivationVerifyEmailOtpActivity.finish();
                            }
                        }
                    }
                    if (((RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                        int i8 = INotificationSideChannelStub + 73;
                        getInterfaceDescriptor = i8 % 128;
                        if (i8 % 2 == 0) {
                            NewPhoneVerificationResetActivity.Companion companion2 = NewPhoneVerificationResetActivity.INSTANCE;
                            NewPhoneVerificationResetActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyEmailOtpActivity, (RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue());
                            newRegistrationActivationVerifyEmailOtpActivity.d_();
                            int i9 = 58 / 0;
                        } else {
                            NewPhoneVerificationResetActivity.Companion companion3 = NewPhoneVerificationResetActivity.INSTANCE;
                            NewPhoneVerificationResetActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyEmailOtpActivity, (RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue());
                            newRegistrationActivationVerifyEmailOtpActivity.d_();
                        }
                    }
                    if (((MigrantWorkerRegistration) newRegistrationActivationVerifyEmailOtpActivity.a.getValue()) != null) {
                        IndonesianMigrantWorkerRegistrationSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = IndonesianMigrantWorkerRegistrationSuccessActivity.INSTANCE;
                        IndonesianMigrantWorkerRegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(newRegistrationActivationVerifyEmailOtpActivity, (MigrantWorkerRegistration) newRegistrationActivationVerifyEmailOtpActivity.a.getValue());
                    }
                    int i10 = getInterfaceDescriptor + 75;
                    INotificationSideChannelStub = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 2 / 4;
                    }
                } else {
                    String string = newRegistrationActivationVerifyEmailOtpActivity.getString(R.string.error_signature_checking);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(newRegistrationActivationVerifyEmailOtpActivity, string, "Coba Kembali", new Function0() { // from class: getSupportCompoundDrawablesTintMode
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                    });
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i12 = i2 + 47;
                INotificationSideChannelStub = i12 % 128;
                int i13 = i12 % 2;
                newRegistrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) newRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        String str;
        final NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity = (NewRegistrationActivationVerifyEmailOtpActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newRegistrationActivationVerifyEmailOtpActivity.MediaBrowserCompat();
        } else {
            RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                newRegistrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                Object obj = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
                String str2 = newRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str2 = null;
                }
                if (Intrinsics.areEqual(obj, str2)) {
                    RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                    if (registeredMemberRegistration != null) {
                        RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, null, null, null, ((OtpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum(), null, null, null, null, null, null, null, null, null, 8380415);
                    }
                    String checkSum = ((OtpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum();
                    if (((RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue()) != null) {
                        int i2 = getInterfaceDescriptor + 57;
                        INotificationSideChannelStub = i2 % 128;
                        if (i2 % 2 != 0) {
                            registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
                            throw null;
                        }
                        RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                        if ((registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null) == MembershipType.PU) {
                            int i3 = INotificationSideChannelStub + 25;
                            getInterfaceDescriptor = i3 % 128;
                            if (i3 % 2 == 0) {
                                registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
                                throw null;
                            }
                            RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                            if (registeredMemberRegistration3 != null) {
                                registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration3, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415);
                                str = "registration_data";
                            } else {
                                str = "registration_data";
                            }
                            Intent intent = new Intent();
                            intent.putExtra(str, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            newRegistrationActivationVerifyEmailOtpActivity.setResult(-1, intent);
                            newRegistrationActivationVerifyEmailOtpActivity.finish();
                        } else {
                            RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                            if ((registeredMemberRegistration4 != null ? registeredMemberRegistration4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null) == MembershipType.BPU) {
                                RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                                if (registeredMemberRegistration5 != null) {
                                    int i4 = INotificationSideChannelStub + 21;
                                    getInterfaceDescriptor = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration5, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415);
                                        registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
                                        throw null;
                                    }
                                    registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration5, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415);
                                }
                                Intent intent2 = new Intent();
                                intent2.putExtra("registration_data", registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                newRegistrationActivationVerifyEmailOtpActivity.setResult(-1, intent2);
                                newRegistrationActivationVerifyEmailOtpActivity.finish();
                            } else {
                                RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                                registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = registeredMemberRegistration6 != null ? RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration6, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415) : null;
                                NewPhoneVerificationResetActivity.Companion companion = NewPhoneVerificationResetActivity.INSTANCE;
                                NewPhoneVerificationResetActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newRegistrationActivationVerifyEmailOtpActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                newRegistrationActivationVerifyEmailOtpActivity.d_();
                            }
                        }
                    }
                    if (((RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                        NewPhoneVerificationResetActivity.Companion companion2 = NewPhoneVerificationResetActivity.INSTANCE;
                        NewPhoneVerificationResetActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyEmailOtpActivity, (RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue());
                        newRegistrationActivationVerifyEmailOtpActivity.d_();
                    }
                    if (((MigrantWorkerRegistration) newRegistrationActivationVerifyEmailOtpActivity.a.getValue()) != null) {
                        int i5 = INotificationSideChannelStub + 13;
                        getInterfaceDescriptor = i5 % 128;
                        int i6 = i5 % 2;
                        IndonesianMigrantWorkerRegistrationSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = IndonesianMigrantWorkerRegistrationSuccessActivity.INSTANCE;
                        IndonesianMigrantWorkerRegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(newRegistrationActivationVerifyEmailOtpActivity, (MigrantWorkerRegistration) newRegistrationActivationVerifyEmailOtpActivity.a.getValue());
                    }
                } else {
                    String string = newRegistrationActivationVerifyEmailOtpActivity.getString(R.string.error_signature_checking);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(newRegistrationActivationVerifyEmailOtpActivity, string, "Coba Kembali", new Function0() { // from class: getSupportBackgroundTintMode
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewRegistrationActivationVerifyEmailOtpActivity.b(this.b);
                        }
                    });
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newRegistrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationActivationVerifyEmailOtpBinding) ((ViewBinding) newRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01dd A[PHI: r1
  0x01dd: PHI (r1v4 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:108:0x01fe, B:99:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7 A[PHI: r11
  0x00c7: PHI (r11v42 java.lang.String) = (r11v31 java.lang.String), (r11v40 java.lang.String), (r11v50 java.lang.String) binds: [B:39:0x00c3, B:31:0x00a6, B:17:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100 A[PHI: r10
  0x0100: PHI (r10v24 java.lang.String) = (r10v22 java.lang.String), (r10v30 java.lang.String) binds: [B:58:0x011a, B:49:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity, ActivityRegistrationActivationVerifyEmailOtpBinding activityRegistrationActivationVerifyEmailOtpBinding, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
            String str6 = null;
            String str7 = "";
            if (Intrinsics.areEqual(StringsKt.split$default((CharSequence) String.valueOf(registeredMemberRegistration != null ? registeredMemberRegistration.asInterface : null), new String[]{"#"}, false, 0, 6, (Object) null).get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
                int i2 = getInterfaceDescriptor + 107;
                INotificationSideChannelStub = i2 % 128;
                int i3 = i2 % 2;
                isSticky issticky = (isSticky) newRegistrationActivationVerifyEmailOtpActivity.g.getValue();
                String string = ((PreferenceManager) newRegistrationActivationVerifyEmailOtpActivity.b.getValue()).getString("OCR_TRANSACTION_ID", "");
                if (((RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                    str2 = registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1 : null;
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                } else if (((RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                    int i4 = INotificationSideChannelStub + 63;
                    getInterfaceDescriptor = i4 % 128;
                    if (i4 % 2 == 0) {
                        str6.hashCode();
                        throw null;
                    }
                    RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue();
                    if (registrationForUnregistered != null) {
                        int i5 = getInterfaceDescriptor + 45;
                        INotificationSideChannelStub = i5 % 128;
                        if (i5 % 2 != 0) {
                            String str8 = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            throw null;
                        }
                        str2 = registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                } else {
                    MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) newRegistrationActivationVerifyEmailOtpActivity.a.getValue();
                    str2 = migrantWorkerRegistration != null ? migrantWorkerRegistration.getItem : null;
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                }
                String string2 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationActivationVerifyEmailOtpBinding.otpVerify.getText())).toString();
                if (((RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                    if (registeredMemberRegistration3 != null) {
                        int i6 = getInterfaceDescriptor + 115;
                        INotificationSideChannelStub = i6 % 128;
                        int i7 = i6 % 2;
                        str4 = registeredMemberRegistration3.INotificationSideChannel;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                } else {
                    if (((RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                        RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue();
                        str4 = registrationForUnregistered2 != null ? registrationForUnregistered2.connect : null;
                        if (str4 != null) {
                            str5 = str4;
                        }
                    }
                    str5 = "";
                }
                RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                str6 = registeredMemberRegistration4 != null ? registeredMemberRegistration4.TuitionPaymentFragmentbindingInflater1 : null;
                issticky.b(string, str3, string2, str5, str6 == null ? "" : str6);
                int i8 = INotificationSideChannelStub + 29;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
            } else {
                isSticky issticky2 = (isSticky) newRegistrationActivationVerifyEmailOtpActivity.g.getValue();
                if (((RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                    str = registeredMemberRegistration5 != null ? registeredMemberRegistration5.TuitionPaymentFragmentbindingInflater1 : null;
                    if (str == null) {
                        str = "";
                    }
                } else if (((RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                    RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue();
                    if (registrationForUnregistered3 != null) {
                        int i10 = INotificationSideChannelStub + 55;
                        getInterfaceDescriptor = i10 % 128;
                        int i11 = i10 % 2;
                        str = registrationForUnregistered3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                } else {
                    MigrantWorkerRegistration migrantWorkerRegistration2 = (MigrantWorkerRegistration) newRegistrationActivationVerifyEmailOtpActivity.a.getValue();
                    if (migrantWorkerRegistration2 != null) {
                        int i12 = getInterfaceDescriptor + 125;
                        INotificationSideChannelStub = i12 % 128;
                        int i13 = i12 % 2;
                        str = migrantWorkerRegistration2.getItem;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                }
                String string3 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationActivationVerifyEmailOtpBinding.otpVerify.getText())).toString();
                if (((RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.asBinder.getValue();
                    if (registeredMemberRegistration6 != null) {
                        int i14 = INotificationSideChannelStub + 81;
                        getInterfaceDescriptor = i14 % 128;
                        int i15 = i14 % 2;
                        str6 = registeredMemberRegistration6.INotificationSideChannel;
                    }
                    if (str6 == null) {
                        int i16 = INotificationSideChannelStub + 19;
                        getInterfaceDescriptor = i16 % 128;
                        int i17 = i16 % 2;
                    } else {
                        str7 = str6;
                    }
                } else if (((RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue()) != null) {
                    int i18 = INotificationSideChannelStub + 65;
                    getInterfaceDescriptor = i18 % 128;
                    int i19 = i18 % 2;
                    RegistrationForUnregistered registrationForUnregistered4 = (RegistrationForUnregistered) newRegistrationActivationVerifyEmailOtpActivity.asInterface.getValue();
                    str6 = registrationForUnregistered4 != null ? registrationForUnregistered4.connect : null;
                    if (str6 != null) {
                        str7 = str6;
                    }
                }
                issticky2.b(str, string3, str7);
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 87;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationActivationVerifyEmailOtpActivity.getIntent().getParcelableExtra("registration_data");
        int i3 = getInterfaceDescriptor + 1;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
        return registeredMemberRegistration;
    }

    public static /* synthetic */ Unit b(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        newRegistrationActivationVerifyEmailOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 61;
        INotificationSideChannelStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit b(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 71;
        int i4 = i3 % 128;
        INotificationSideChannelStub = i4;
        int i5 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i6 = i2 + 117;
            INotificationSideChannelStub = i6 % 128;
            int i7 = i6 % 2;
            newRegistrationActivationVerifyEmailOtpActivity.MediaBrowserCompat();
            int i8 = INotificationSideChannelStub + 119;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
        } else {
            getCameraCharacteristic getcameracharacteristic = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                newRegistrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
                getCameraCharacteristic getcameracharacteristic2 = newRegistrationActivationVerifyEmailOtpActivity.TuitionPaymentFragmentbindingInflater1;
                if (getcameracharacteristic2 == null) {
                    int i10 = INotificationSideChannelStub + 101;
                    getInterfaceDescriptor = i10 % 128;
                    int i11 = i10 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i12 = getInterfaceDescriptor + 75;
                    INotificationSideChannelStub = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 3 % 3;
                    }
                } else {
                    getcameracharacteristic = getcameracharacteristic2;
                }
                getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i14 = i4 + 7;
                getInterfaceDescriptor = i14 % 128;
                if (i14 % 2 == 0) {
                    newRegistrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                    getcameracharacteristic.hashCode();
                    throw null;
                }
                newRegistrationActivationVerifyEmailOtpActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyEmailOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityRegistrationActivationVerifyEmailOtpBinding activityRegistrationActivationVerifyEmailOtpBinding, NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-9778463, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 9778464, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{activityRegistrationActivationVerifyEmailOtpBinding, newRegistrationActivationVerifyEmailOtpActivity});
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(1723167950, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1723167946, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{newRegistrationActivationVerifyEmailOtpActivity, virtualCameraAdapter1});
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewRegistrationActivationVerifyEmailOtpActivity newRegistrationActivationVerifyEmailOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(-889825982, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 889825985, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{newRegistrationActivationVerifyEmailOtpActivity, virtualCameraAdapter1});
    }

    public static final /* synthetic */ int d() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(577128695, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -577128690, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0])).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 77;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1581898385;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2133010845, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2133010847, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, length, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2107344787, ReadAfterEOFException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2107344787, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        INotificationSideChannel = new char[]{47394, 47403, 47446, 47390, 47392, 47454, 47397, 47417, 47443, 47449, 47448, 47399, 47455, 47395, 47400, 47364, 47396, 47369, 47453, 47450, 47401, 47393, 47452, 47418};
        onTransact = 2047719628;
        cancel = true;
        RemoteActionCompatParcelizer = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyEmailOtpActivity.$$c
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r7 = r7 + 67
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r8 = r8 + 1
            r3 = r0[r8]
        L25:
            int r7 = r7 + r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyEmailOtpActivity.$$i(byte, byte, int):java.lang.String");
    }
}
