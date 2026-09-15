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
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.data.registration.general.model.request.EmailActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.databinding.ActivityEmailActivationVerificationBinding;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerActivationActivity;
import com.bpjstku.presentation.membership.registration.RegistrationVerifyEmailOtpActivity;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingReactiveFormActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Constants;
import defpackage.BufferProviderState;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.UseTorchAsFlash;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.collapseItemActionView;
import defpackage.createEditText;
import defpackage.createExtraImageCapture;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isBound;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setSplitTrack;
import defpackage.share;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0017\u0010\t\u001a\u0004\u0018\u00010\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010!R\u001a\u0010\u000b\u001a\u00020#8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\"\u0010%"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/EmailActivationVerificationActivity;", "Lcom/bpjstku/util/viewbinding/BindingReactiveFormActivity;", "Lcom/bpjstku/databinding/ActivityEmailActivationVerificationBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "asInterface", "onBackPressed", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "d", "onDestroy", "LUseTorchAsFlash;", "onClosePageEvent", "(LUseTorchAsFlash;)V", "LsetSplitTrack;", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmailActivationVerificationActivity extends BindingReactiveFormActivity<ActivityEmailActivationVerificationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f499a;
    private static long asBinder;
    private static int notify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy b;
    private static final byte[] $$c = {89, 92, -72, 43};
    private static final int $$f = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {2, -84, 82, -15, 48, 1, -44, 45, -1, 4, -14, 20, -47, 34, 8, -6, 3, -5, 20, -14, -27, 37, 4, -3, -31, 30, 11, 2, -38, 25, 10, 8, -48, 34, -1, 13, 4, -27, 20, -3, 19};
    private static final int $$n = 239;
    private static final byte[] $$a = {94, 6, -99, -107, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 220;
    private static int onTransact = 0;
    private static int g = 0;
    private static int asInterface = 1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: access400
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmailActivationVerificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: findViewForItem
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentbindingInflater1};
            return (RegistrationForUnregistered) EmailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1826655014, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, -1826655014);
        }
    });
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: hideSubMenus
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int asInterface = R.layout.activity_email_activation_verification;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i6 | i2 | i);
        int i8 = ~i2;
        int i9 = (~(i8 | i)) | (~((~i) | i6));
        int i10 = (~(i | (~i6))) | i8;
        int i11 = i6 + i2 + i4 + ((-2044576983) * i3) + (1743660113 * i5);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i6) - 713031680) + (164951516 * i2) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i4) + (689963008 * i3) + ((-299892736) * i5) + ((-1081737216) * i12);
        int i14 = ((i6 * 2048727874) - 782056376) + (i2 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i4 * 2048728315) + (i3 * 2142076211) + (i5 * (-1448904853)) + (i12 * 1885470720);
        int i15 = i13 + (i14 * i14 * (-1618345984));
        if (i15 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i15 != 3) {
            return i15 != 4 ? TuitionPaymentFragmentbindingInflater1(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 1
            int r7 = 100 - r7
            int r8 = 214 - r8
            byte[] r1 = com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L26
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L26:
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 37
            int r8 = r8 + 1
            int r7 = r7 * 33
            int r7 = 98 - r7
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity.$$m
            int r6 = r6 * 37
            int r6 = 40 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r0[r6]
        L2b:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity.f(short, byte, int, java.lang.Object[]):void");
    }

    public EmailActivationVerificationActivity() {
        final EmailActivationVerificationActivity emailActivationVerificationActivity = this;
        this.b = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final setSplitTrack invoke() {
                ComponentCallbacks componentCallbacks = emailActivationVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(setSplitTrack.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/EmailActivationVerificationActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "b", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, EmailActivationVerificationActivity.class, new Pair[]{TuplesKt.to("registration_data", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        EmailActivationVerificationActivity$bindingInflater$1 emailActivationVerificationActivity$bindingInflater$1 = EmailActivationVerificationActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = g + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return emailActivationVerificationActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 11;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.asInterface;
        int i6 = i3 + 81;
        g = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
            int i3 = 25 / 0;
        } else {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        }
        int i4 = g + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        g = i2 % 128;
        int i3 = i2 % 2;
        EmailActivationVerificationActivity emailActivationVerificationActivity = this;
        Intrinsics.checkNotNullParameter(emailActivationVerificationActivity, "");
        emailActivationVerificationActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) INotificationSideChannelStub().layoutToolbar.toolbar, true);
        INotificationSideChannelStub().layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_email_verification));
        MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (migrantWorkerRegistration != null) {
            int i4 = asInterface + 85;
            g = i4 % 128;
            int i5 = i4 % 2;
            EditText editText = INotificationSideChannelStub().tilEmail.getEditText();
            if (editText != null) {
                editText.setText(migrantWorkerRegistration.getItem);
                int i6 = g + 27;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (((RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
            INotificationSideChannelStub().tvEnterEmailInstruction.setText(getString(R.string.label_edit_email_instruction_registration_unregistered));
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0351  */
    /* JADX WARN: Code duplicated, block: B:72:0x0352  */
    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        long j2;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 121;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            j = 0;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i6 = $11 + 71;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(f499a[i * i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2186, 40 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 841711447, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(asBinder), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3012, Color.red(0) + 26, 321985076, false, $$i(b3, b4, (byte) (b4 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (MotionEvent.axisFromString("") + 36506), 3375 - TextUtils.lastIndexOf("", '0'), 'A' - AndroidCharacter.getMirror('0'), -968507904, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } else {
                int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(f499a[i + i8])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.getMode(0), 2187 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 40 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 841711447, false, $$i(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(asBinder), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - Color.blue(0)), Color.alpha(0) + 3011, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 321985076, false, $$i(b9, b10, (byte) (b10 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 3376 - TextUtils.getOffsetBefore("", 0), 17 - TextUtils.getOffsetBefore("", 0), -968507904, false, $$i(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i9 = $10 + 1;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i11 = $11 + 21;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 36505), View.MeasureSpec.getMode(0) + 3376, (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 18, -968507904, false, $$i(b13, b14, (byte) (b14 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                int i12 = 57 / 0;
                j = 0;
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    j2 = 0;
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (36505 - View.MeasureSpec.makeMeasureSpec(0, 0)), 3375 - MotionEvent.axisFromString(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, -968507904, false, $$i(b15, b16, (byte) (b16 + 1)), new Class[]{Object.class, Object.class});
                } else {
                    j2 = 0;
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
                j = j2;
            }
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: setMenuView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj};
                return (Unit) EmailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1767596582, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, -1767596578);
            }
        }));
        int i2 = g + 85;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final EmailActivationVerificationActivity emailActivationVerificationActivity = (EmailActivationVerificationActivity) objArr[0];
        int i = 2 % 2;
        EmailActivationVerificationActivity emailActivationVerificationActivity2 = emailActivationVerificationActivity;
        ((setSplitTrack) emailActivationVerificationActivity.b.getValue()).f1390a.observe(emailActivationVerificationActivity2, new Observer() { // from class: access500
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                EmailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((setSplitTrack) emailActivationVerificationActivity.b.getValue()).g.observe(emailActivationVerificationActivity2, new Observer() { // from class: getOverflowIcon
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                EmailActivationVerificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((setSplitTrack) emailActivationVerificationActivity.b.getValue()).onTransact.observe(emailActivationVerificationActivity2, new Observer() { // from class: access600
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                EmailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = asInterface + 85;
        g = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String strName;
        MembershipType membershipType;
        int i = 2 % 2;
        int i2 = g + 111;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
            if (((RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
                d_();
            }
        } else if (((RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
            d_();
        }
        Object obj = null;
        if (((RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
            int i4 = asInterface + 37;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (registeredMemberRegistration == null || (membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
                strName = null;
            } else {
                int i5 = asInterface + 67;
                g = i5 % 128;
                if (i5 % 2 != 0) {
                    membershipType.name();
                    obj.hashCode();
                    throw null;
                }
                strName = membershipType.name();
            }
            if (Intrinsics.areEqual(strName, "PU")) {
                int i6 = g + 25;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                SalariedWorkerActivationActivity.Companion companion = SalariedWorkerActivationActivity.INSTANCE;
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                Intrinsics.checkNotNull(registeredMemberRegistration2);
                SalariedWorkerActivationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, registeredMemberRegistration2);
                d_();
                return;
            }
        }
        d_();
        int i8 = asInterface + 39;
        g = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = g + 107;
        asInterface = i2 % 128;
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
                int i3 = g + 101;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    onBackPressed();
                    throw null;
                }
                onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = g + 35;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            MaterialButton materialButton = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = INotificationSideChannelStub().btnNext;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(false);
        }
        int i3 = asInterface + 81;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = g + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
            int iMyTid = 10 - (Process.myTid() >> 22);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[26], bArr[31], (short) 210, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSizeAndState, iMyTid, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e((-1) - MotionEvent.axisFromString(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.thank_you).substring(0, 1).codePointAt(0) - 62, (char) (3216 - TextUtils.getTrimmedLength("")), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_5).substring(1, 2).length() + 14, (char) (TextUtils.indexOf((CharSequence) "", '0') + 53342), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iBlue = Color.blue(0) + 876;
            int iGreen = Color.green(0) + 10;
            byte b = $$a[24];
            byte b2 = b;
            Object[] objArr6 = new Object[1];
            c(b, b2, (short) (b2 | 200), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, iBlue, iGreen, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
                int scrollBarFadeDuration = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr2 = $$a;
                Object[] objArr7 = new Object[1];
                c(bArr2[95], bArr2[31], (short) ($$b & 1002), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, iLastIndexOf, scrollBarFadeDuration, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i4 = ~iFreeMemory;
            int i5 = (~((-274568850) | i4)) | 5537936;
            int i6 = ~(iFreeMemory | 503289533);
            int i7 = (((2057043474 + ((i5 | i6) * (-713))) + (i6 * 1426)) + ((~(234258620 | i4)) * 713)) - 1594789068;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_indomaret).substring(1, 3).codePointAt(0) - 97), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(53 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step0).substring(40, 43).length() + 13, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 116), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i10 = asInterface + 75;
            g = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 / 5;
            }
            try {
                Object[] objArr11 = {Integer.valueOf(iIntValue), -1594789068};
                byte[] bArr3 = $$m;
                byte b3 = bArr3[5];
                byte b4 = b3;
                Object[] objArr12 = new Object[1];
                f(b3, b4, b4, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b5 = (byte) (bArr3[5] - 1);
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                f(b5, b6, b6, objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
                    int mode2 = View.MeasureSpec.getMode(0) + 10;
                    byte[] bArr4 = $$a;
                    Object[] objArr14 = new Object[1];
                    c(bArr4[95], bArr4[31], (short) ($$b & 1002), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, offsetBefore, mode2, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.akulaku_instruction_step4).substring(0, 1).length() - 1, ExpandableListView.getPackedPositionType(0L) + 22, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_otp_message).substring(8, 9).length() + 3215), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(22 - View.resolveSizeAndState(0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 94, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 53305), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                        byte b7 = $$a[24];
                        byte b8 = b7;
                        Object[] objArr17 = new Object[1];
                        c(b7, b8, (short) (b8 | 200), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, keyRepeatTimeout, maximumFlingVelocity, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int gidForName = 875 - Process.getGidForName("");
                        int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
                        byte[] bArr5 = $$a;
                        Object[] objArr18 = new Object[1];
                        c(bArr5[26], bArr5[31], (short) 210, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority, gidForName, fadingEdgeLength2, -1199417970, false, (String) objArr18[0], null);
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
        int i12 = ((int[]) objArr[2])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step1).substring(22, 23).codePointAt(0) - 1932067874;
            int i15 = i14 + 1166558448 + (((~(1021815033 | iCodePointAt)) | (-1062125263)) * (-964)) + (((~((~iCodePointAt) | 1021815033)) | (-1072676608)) * (-964));
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr2[1])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    int i18 = g + 29;
                    asInterface = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            int i20 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 13590762;
            int i22 = ~i21;
            int i23 = i20 + 400299292 + (((~(905597064 | i22)) | (~((-945907294) | i21))) * 1900) + (((~(i22 | 945907293)) | (~(i21 | (-905597065)))) * (-950)) + (((~(i21 | 945907293)) | (~(i22 | (-905597065)))) * 950);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[1])[0] = i25 ^ (i25 << 5);
            int i26 = asInterface + 51;
            g = i26 % 128;
            int i27 = i26 % 2;
        }
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        int i28 = ((int[]) objArr2[1])[0];
        int i29 = i28 * i28;
        int i30 = -(884297120 * i28);
        int i31 = (((i29 & i30) + (i29 | i30)) - (~(-(i28 * (-1780297526))))) - 1;
        int i32 = ((i31 | (-631291655)) << 1) - ((-631291655) ^ i31);
        int i33 = i32 >> 25;
        int i34 = ((i33 ^ (-255)) + ((i33 & (-255)) << 1)) / 128;
        int i35 = (i34 ^ 1) + ((i34 & 1) << 1);
        int i36 = (i32 & i35) + (i35 | i32);
        int i37 = i32 >> 27;
        int i38 = (((i37 | (-63)) << 1) - (i37 ^ (-63))) / 32;
        int i39 = -(((i38 & 1) + (i38 | 1)) ^ i36);
        int i40 = ((i39 | 7) << 1) - (i39 ^ 7);
        int i41 = i40 >> 25;
        int i42 = (((i41 | (-255)) << 1) - (i41 ^ (-255))) / 128;
        Intrinsics.checkNotNullExpressionValue(materialButton, "25;12;btnNext".substring(29526 / (((-((((i42 | 1) << 1) - (i42 ^ 1)) + 1)) & i40) * 703)));
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
    }

    @Override // com.nbs.validacion.ReactiveFormActivity
    public final void d() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string);
        String string2 = getString(R.string.error_email_invalid);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string2)})));
        int i2 = g + 27;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = g + 105;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
        } else {
            super.onDestroy();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(this);
            int i3 = 31 / 0;
        }
    }

    @Subscribe(TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ThreadMode.MAIN)
    public final void onClosePageEvent(UseTorchAsFlash p0) {
        int i = 2 % 2;
        int i2 = g + 95;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            d_();
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            d_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = g + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int iIndexOf = 1755 - TextUtils.indexOf("", "", 0, 0);
            int defaultSize = 23 - View.getDefaultSize(0, 0);
            Object[] objArr2 = new Object[1];
            c((byte) 37, $$a[17], (short) 193, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, iIndexOf, defaultSize, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i4 = asInterface + 89;
            g = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                int gidForName = 1754 - Process.getGidForName("");
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                byte b = $$a[17];
                Object[] objArr3 = new Object[1];
                c((byte) 52, b, (short) (b | 140), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, gidForName, scrollBarFadeDuration, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (((1878469249 + (((-186902842) | iIdentityHashCode) * 376)) + (((~((~iIdentityHashCode) | 197540496)) | (-199752634)) * (-376))) + (((~(iIdentityHashCode | (-197540497))) | 15061929) * 376)) - 2043273484;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(TextUtils.getOffsetAfter("", 0) + 37, 15 - MotionEvent.axisFromString(""), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tesla_ev_connector_type).substring(1, 5).codePointAt(0) - 101), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step5).substring(17, 18).length() + 52, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {29267192};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 42049), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1726, 29 - TextUtils.indexOf("", "", 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -2043273484, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
                    int i9 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                    byte b2 = $$a[17];
                    Object[] objArr8 = new Object[1];
                    c((byte) 52, b2, (short) (b2 | 140), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, i9, iIndexOf2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_name_on_card).substring(0, 3).codePointAt(1) - 97, 22 - KeyEvent.getDeadChar(0, 0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step4).substring(4, 6).length() + 3214), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, View.MeasureSpec.getMode(0) + 15, (char) (53341 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionChild = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
                        int i10 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                        Object[] objArr11 = new Object[1];
                        c((byte) 52, $$a[17], (short) 104, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, i10, i11, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                        int i12 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                        Object[] objArr12 = new Object[1];
                        c((byte) 37, $$a[17], (short) 193, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(touchSlop, i12, keyRepeatDelay, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i13 = g + 21;
        asInterface = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i16 = ~iIdentityHashCode2;
        int i17 = 891336941 + (((~((-426846309) | i16)) | 288366660 | (~(214243882 | i16)) | (~((-75764235) | iIdentityHashCode2))) * (-84));
        int i18 = (~(iIdentityHashCode2 | 214243882)) | 426846308;
        int i19 = ~(i16 | (-214243883));
        int i20 = i15 + i17 + ((i18 | i19) * (-84)) + ((75764234 | i19) * 84);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr13[3])[0] = i22 ^ (i22 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1031;
            int scrollBarSize2 = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b3 = $$a[17];
            Object[] objArr14 = new Object[1];
            c((byte) 52, b3, (short) (b3 | 36), objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, scrollBarSize, scrollBarSize2, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_permata_alto).substring(0, 12).codePointAt(1) - 101, KeyEvent.keyCodeFromString("") + 22, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 3180), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23, TextUtils.indexOf("", "", 0) + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bni).substring(1, 3).length() + 53339), objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i23 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int offsetAfter = 15 - TextUtils.getOffsetAfter("", 0);
            byte b4 = $$a[17];
            Object[] objArr17 = new Object[1];
            c((byte) 52, b4, (short) (b4 | 140), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i23, offsetAfter, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int i24 = 1032 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                byte[] bArr = $$a;
                byte b5 = bArr[24];
                Object[] objArr18 = new Object[1];
                c(b5, bArr[91], b5, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyPid, i24, absoluteGravity, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr19[3])[0];
            int i26 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i27 = 142997869 + (((~(iIdentityHashCode3 | 701021440)) | 456741270) * (-668)) + ((701021440 | (~(456741270 | iIdentityHashCode3))) * 1336) + ((iIdentityHashCode3 | 1006239126) * 668) + 1019978780;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[2])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(37 - (ViewConfiguration.getWindowTouchSlop() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_step2).substring(15, 16).length() - 1), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(AndroidCharacter.getMirror('0') + 5, TextUtils.getCapsMode("", 0, 0) + 16, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_detected).substring(0, 43).length() - 43), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {29267192};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1133 - MotionEvent.axisFromString(""), 18 - (ViewConfiguration.getTapTimeout() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 1019978780, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
                byte b6 = $$a[17];
                Object[] objArr24 = new Object[1];
                c((byte) 52, b6, (short) (b6 | 36), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cArgb, modifierMetaStateMask, packedPositionGroup, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.rgb(0, 0, 0) + 16823209), KeyEvent.keyCodeFromString("") + 1117, Color.blue(0) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                int i30 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
                byte[] bArr2 = $$a;
                byte b7 = bArr2[24];
                Object[] objArr25 = new Object[1];
                c(b7, bArr2[91], b7, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, iAxisFromString, i30, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima6).substring(8, 9).length() - 1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 3180), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.klikbca_instruction_1).substring(21, 22).codePointAt(0) - 17, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 53305), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iResolveSizeAndState = 1031 - View.resolveSizeAndState(0, 0, 0);
                    int i31 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b8 = $$a[17];
                    Object[] objArr28 = new Object[1];
                    c((byte) 52, b8, (short) (b8 | 140), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(modifierMetaStateMask2, iResolveSizeAndState, i31, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iRed = 1031 - Color.red(0);
                    int scrollDefaultDelay = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte b9 = $$a[17];
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, b9, (short) (b9 | 36), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(doubleTapTimeout, iRed, scrollDefaultDelay, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i32 = ((int[]) objArr[1])[0];
        int i33 = ((int[]) objArr[3])[0];
        if (i33 == i32) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i34 = ((int[]) objArr[2])[0];
            int i35 = ((int[]) objArr[3])[0];
            int i36 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i37 = (~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unknown_error_while_generating_key_hash).substring(0, 35).length() + 1313325307)) | 268252666;
            int i38 = i34 + (-440916638) + (i37 * 495) + (((~i37) | 244331882) * 495);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr30[2])[0] = i40 ^ (i40 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i41 = asInterface + 117;
            g = i41 % 128;
            int i42 = i41 % 2;
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        int[] iArr = new int[i33];
        int i43 = i33 - 1;
        iArr[i43] = 1;
        Toast.makeText((Context) null, iArr[((i33 * i43) % 2) - 1], 1).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i44 = ((int[]) objArr[2])[0];
        int i45 = ((int[]) objArr[3])[0];
        int i46 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i47 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        int i48 = ~i47;
        int i49 = i44 + (-732104915) + ((i47 | 152044036) * 988) + (((~(161453574 | i48)) | 73417057) * (-1976)) + (((~(i47 | (-82826596))) | 152044036 | (~(82826595 | i48))) * 988);
        int i50 = i49 ^ (i49 << 13);
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr31[2])[0] = i51 ^ (i51 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -921634726
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00cf, code lost:
    
        if (r1 != ((((-2051433060) + ((~(300451160 | r4)) * (-560))) + ((~(r2 | 2045755387)) * (-560))) + (((~((-2016362492) | r4)) | 271058264) * 560))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d1, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity.g + 21;
        com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity.asInterface = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00dd, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00df, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e0, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e5, code lost:
    
        r1 = (-1891801278) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ee, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005f, code lost:
    
        if (r1 == ((r7 + ((1409286139 | r4) * (-216))) + (((~(r4 | 300282874)) | (-1130270418)) * 216))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009e, code lost:
    
        if (r1 == ((r7 + ((r5 | r4) * (-880))) + (r4 * 880))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a0, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = (int) android.os.SystemClock.elapsedRealtime();
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = g + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i5 = 1659363464 + (((~(608999637 | startUptimeMillis)) | (-1438987181)) * 672);
        int i6 = ~startUptimeMillis;
        if (i4 != i5 + (((~(startUptimeMillis | (-1438987181))) | (~((-608999638) | i6))) * (-672)) + (((~(1438987180 | i6)) | (-1976417278)) * 672)) {
            throw new RuntimeException("-1172518767");
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i7 != (-1082856870) + (((~(iIdentityHashCode | 444900381)) | (-2142545216)) * 305) + (((~((~iIdentityHashCode) | 444900381)) | (-2134155584)) * 305)) {
            int i8 = (-997405008) % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i9 = g + 29;
        asInterface = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        RegistrationForUnregistered registrationForUnregistered;
        EmailActivationVerificationActivity emailActivationVerificationActivity = (EmailActivationVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 111;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            registrationForUnregistered = (RegistrationForUnregistered) emailActivationVerificationActivity.getIntent().getParcelableExtra("unregistered_data");
            int i3 = 49 / 0;
        } else {
            registrationForUnregistered = (RegistrationForUnregistered) emailActivationVerificationActivity.getIntent().getParcelableExtra("unregistered_data");
        }
        int i4 = asInterface + 27;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return registrationForUnregistered;
        }
        throw null;
    }

    public static /* synthetic */ RegisteredMemberRegistration TuitionPaymentFragmentbindingInflater1(EmailActivationVerificationActivity emailActivationVerificationActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return (RegisteredMemberRegistration) emailActivationVerificationActivity.getIntent().getParcelableExtra("registration_data");
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(EmailActivationVerificationActivity emailActivationVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 73;
        g = i3 % 128;
        int i4 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            emailActivationVerificationActivity.MediaBrowserCompat();
            return;
        }
        Editable text = null;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                emailActivationVerificationActivity.IconCompatParcelizer();
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (registrationForUnregistered != null) {
                    String str = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                    EditText editText = emailActivationVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
                    if (editText != null) {
                        int i5 = asInterface + 45;
                        g = i5 % 128;
                        int i6 = i5 % 2;
                        text = editText.getText();
                    }
                    RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, null, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, false, false, 15728635);
                    RegistrationActivationVerifyEmailOtpActivity.Companion companion = RegistrationActivationVerifyEmailOtpActivity.INSTANCE;
                    RegistrationActivationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(emailActivationVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    emailActivationVerificationActivity.d_();
                    return;
                }
                return;
            }
            return;
        }
        int i7 = i2 + 9;
        g = i7 % 128;
        int i8 = i7 % 2;
        emailActivationVerificationActivity.IconCompatParcelizer();
        VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
        String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
        String string2 = emailActivationVerificationActivity.getString(R.string.error_email_not_match);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        if (!StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailActivationVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            return;
        }
        getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
        String string3 = emailActivationVerificationActivity.getString(R.string.title_email_not_match);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = emailActivationVerificationActivity.getString(R.string.message_email_not_match);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        String string5 = emailActivationVerificationActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, string3, string4, string5, new Function0() { // from class: access200
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailActivationVerificationActivity.cancelAll();
            }
        }, 96);
        FragmentManager supportFragmentManager = emailActivationVerificationActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i9 = g + 65;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(EmailActivationVerificationActivity emailActivationVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        MigrantWorkerRegistration migrantWorkerRegistration;
        RegistrationForUnregistered registrationForUnregistered;
        Editable text;
        RegisteredMemberRegistration registeredMemberRegistration;
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i2 = g + 125;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                emailActivationVerificationActivity.MediaBrowserCompat();
                return;
            } else {
                emailActivationVerificationActivity.MediaBrowserCompat();
                throw null;
            }
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                emailActivationVerificationActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                if (!StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "|", false, 2, (Object) null)) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailActivationVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                    return;
                }
                List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString(), new String[]{"|"}, false, 0, 6, (Object) null);
                String str = (String) listSplit$default.get(0);
                String str2 = (String) listSplit$default.get(1);
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = emailActivationVerificationActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, str, str2, string, new Function0() { // from class: setExpandedActionViewsExclusive
                    private static final byte[] $$c = {14, 70, 6, -35};
                    private static final int $$f = 9;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$d = {25, 31, 20, 1, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -68, -5, 15, -17, 15, -5, -6, 6, 56, -69, 12, -9, -3, -6, 14, 54, -36, -37, 15, -17, 15, -5, -6, 6, 37, -48, 6};
                    private static final int $$e = 69;
                    private static final byte[] $$a = {46, 126, -84, 108, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
                    private static final int $$b = 75;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                    private static int TuitionPaymentFragmentbindingInflater1 = 1;
                    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722402;

                    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void a(short r5, short r6, int r7, java.lang.Object[] r8) {
                        /*
                            int r6 = r6 * 52
                            int r6 = 107 - r6
                            byte[] r0 = defpackage.setExpandedActionViewsExclusive.$$a
                            int r7 = r7 * 4
                            int r7 = r7 + 84
                            int r5 = r5 * 15
                            int r1 = r5 + 38
                            byte[] r1 = new byte[r1]
                            int r5 = r5 + 37
                            r2 = 0
                            if (r0 != 0) goto L18
                            r4 = r5
                            r3 = r2
                            goto L2c
                        L18:
                            r3 = r2
                        L19:
                            int r6 = r6 + 1
                            byte r4 = (byte) r7
                            r1[r3] = r4
                            if (r3 != r5) goto L28
                            java.lang.String r5 = new java.lang.String
                            r5.<init>(r1, r2)
                            r8[r2] = r5
                            return
                        L28:
                            int r3 = r3 + 1
                            r4 = r0[r6]
                        L2c:
                            int r7 = r7 + r4
                            int r7 = r7 + (-11)
                            goto L19
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.setExpandedActionViewsExclusive.a(short, short, int, java.lang.Object[]):void");
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void d(int r5, byte r6, short r7, java.lang.Object[] r8) {
                        /*
                            int r5 = 99 - r5
                            byte[] r0 = defpackage.setExpandedActionViewsExclusive.$$d
                            int r6 = r6 * 43
                            int r6 = 46 - r6
                            int r7 = r7 * 43
                            int r7 = r7 + 1
                            byte[] r1 = new byte[r7]
                            r2 = 0
                            if (r0 != 0) goto L14
                            r4 = r7
                            r3 = r2
                            goto L28
                        L14:
                            r3 = r2
                        L15:
                            byte r4 = (byte) r5
                            r1[r3] = r4
                            int r3 = r3 + 1
                            if (r3 != r7) goto L24
                            java.lang.String r5 = new java.lang.String
                            r5.<init>(r1, r2)
                            r8[r2] = r5
                            return
                        L24:
                            int r6 = r6 + 1
                            r4 = r0[r6]
                        L28:
                            int r4 = -r4
                            int r5 = r5 + r4
                            int r5 = r5 + (-1)
                            goto L15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.setExpandedActionViewsExclusive.d(int, byte, short, java.lang.Object[]):void");
                    }

                    /* JADX WARN: Code duplicated, block: B:36:0x0191  */
                    /* JADX WARN: Code duplicated, block: B:37:0x0192  */
                    private static void c(boolean z, int i3, int i4, int i5, char[] cArr, Object[] objArr) throws Throwable {
                        int i6;
                        Throwable cause;
                        int i7 = 2 % 2;
                        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                        char[] cArr2 = new char[i4];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        int i8 = $11 + 23;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        while (true) {
                            i6 = 29209604;
                            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i4) {
                                break;
                            }
                            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i3 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            int i10 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 3291;
                                    int i11 = 30 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    byte b = (byte) ($$f & 7);
                                    byte b2 = (byte) (-b);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, offsetBefore, i11, 1199271174, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = (byte) (b3 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 650, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, -450685997, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                                int i12 = $11 + 95;
                                $10 = i12 % 128;
                                int i13 = i12 % 2;
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
                        if (i5 > 0) {
                            int i14 = $10 + 119;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i5;
                            char[] cArr3 = new char[i4];
                            System.arraycopy(cArr2, 0, cArr3, 0, i4);
                            System.arraycopy(cArr3, 0, cArr2, i4 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i4 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                        }
                        if (!(!z)) {
                            char[] cArr4 = new char[i4];
                            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                            int i16 = $10 + 49;
                            $11 = i16 % 128;
                            if (i16 % 2 == 0) {
                                int i17 = 5 % 2;
                            }
                            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i4) {
                                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i4 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = (byte) (b5 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ImageFormat.getBitsPerPixel(0) + 652, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, -450685997, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                i6 = 29209604;
                            }
                            cArr2 = cArr4;
                        }
                        objArr[0] = new String(cArr2);
                        int i18 = $11 + 103;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() throws Throwable {
                        Object[] objArr;
                        int i3 = 2 % 2;
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                        int i5 = i4 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43042);
                            int absoluteGravity = 3111 - Gravity.getAbsoluteGravity(0, 0);
                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 22;
                            byte[] bArr = $$a;
                            Object[] objArr2 = new Object[1];
                            a(bArr[132], bArr[37], bArr[7], objArr2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, absoluteGravity, capsMode, -1272852037, false, (String) objArr2[0], null);
                        }
                        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                        Object[] objArr3 = new Object[1];
                        c(false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 159, 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), 'B' - AndroidCharacter.getMirror('0'), new char[]{'\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15}, objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        c(false, ExpandableListView.getPackedPositionType(0L) + 163, 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, objArr4);
                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cResolveSize = (char) (View.resolveSize(0, 0) + 43042);
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 3111;
                            int iResolveOpacity = 22 - Drawable.resolveOpacity(0, 0);
                            byte[] bArr2 = $$a;
                            byte b = bArr2[132];
                            Object[] objArr5 = new Object[1];
                            a(b, b, bArr2[7], objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, packedPositionGroup, iResolveOpacity, -1269618118, false, (String) objArr5[0], null);
                        }
                        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char fadingEdgeLength = (char) (43042 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 3112;
                                int iArgb = Color.argb(0, 0, 0, 0) + 22;
                                byte b2 = $$a[7];
                                byte b3 = b2;
                                Object[] objArr6 = new Object[1];
                                a(b2, b3, b3, objArr6);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, iLastIndexOf, iArgb, 154975793, false, (String) objArr6[0], null);
                            }
                            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                            int i6 = ((int[]) objArr7[2])[0];
                            int i7 = ((int[]) objArr7[1])[0];
                            String[] strArr = (String[]) objArr7[3];
                            int[] iArr = {i6};
                            int iIdentityHashCode = System.identityHashCode(this);
                            int i8 = ~iIdentityHashCode;
                            int i9 = ~(907497461 | i8);
                            int i10 = 720456418 + ((159916040 | i9) * (-712)) + (((~(iIdentityHashCode | 1067413501)) | (~(i8 | (-159916041)))) * (-712)) + (((-797533998) | i9) * 712) + 1416566327;
                            int i11 = (i10 << 13) ^ i10;
                            int i12 = i11 ^ (i11 >>> 17);
                            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
                            objArr = new Object[]{new int[1], new int[]{i7}, iArr, strArr};
                        } else {
                            Object[] objArr8 = new Object[1];
                            c(true, (KeyEvent.getMaxKeyCode() >> 16) + 158, Color.red(0) + 16, Color.red(0) + 6, new char[]{'\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535}, objArr8);
                            Class<?> cls2 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            c(false, ((byte) KeyEvent.getModifierMetaStateMask()) + 163, KeyEvent.keyCodeFromString("") + 16, 4 - (Process.myPid() >> 22), new char[]{65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2}, objArr9);
                            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                            int i14 = i13 % 2;
                            try {
                                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 1416566327};
                                byte[] bArr3 = $$d;
                                byte b4 = bArr3[3];
                                byte b5 = (byte) (b4 - 1);
                                byte b6 = b4;
                                Object[] objArr11 = new Object[1];
                                d(b5, b6, b6, objArr11);
                                Class<?> cls3 = Class.forName((String) objArr11[0]);
                                byte b7 = bArr3[3];
                                byte b8 = (byte) (b7 - 1);
                                Object[] objArr12 = new Object[1];
                                d(b7, b8, b8, objArr12);
                                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char packedPositionChild = (char) (43041 - ExpandableListView.getPackedPositionChild(0L));
                                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 3111;
                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 23;
                                    byte b9 = $$a[7];
                                    byte b10 = b9;
                                    Object[] objArr14 = new Object[1];
                                    a(b9, b10, b10, objArr14);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, iNormalizeMetaState, iLastIndexOf2, 154975793, false, (String) objArr14[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                                try {
                                    Object[] objArr15 = new Object[1];
                                    c(false, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 158, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, 18 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{'\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15}, objArr15);
                                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                                    Object[] objArr16 = new Object[1];
                                    c(false, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 163, Drawable.resolveOpacity(0, 0) + 15, 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, objArr16);
                                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cGreen = (char) (Color.green(0) + 43042);
                                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 3111;
                                        int i15 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                                        byte[] bArr4 = $$a;
                                        byte b11 = bArr4[132];
                                        Object[] objArr17 = new Object[1];
                                        a(b11, b11, bArr4[7], objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, edgeSlop, i15, -1269618118, false, (String) objArr17[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char cRgb = (char) ((-16734174) - Color.rgb(0, 0, 0));
                                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 3111;
                                        int iRed = 22 - Color.red(0);
                                        byte[] bArr5 = $$a;
                                        Object[] objArr18 = new Object[1];
                                        a(bArr5[132], bArr5[37], bArr5[7], objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, maxKeyCode, iRed, -1272852037, false, (String) objArr18[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                    objArr = objArr13;
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
                        int i16 = ((int[]) objArr[1])[0];
                        int i17 = ((int[]) objArr[2])[0];
                        if (i17 != i16) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr2 = (String[]) objArr[3];
                            if (strArr2 != null) {
                                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
                                TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                                int i19 = i18 % 2 != 0 ? 0 : 1;
                                while (i19 < strArr2.length) {
                                    int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
                                    TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                                    if (i20 % 2 == 0) {
                                        arrayList.add(strArr2[i19]);
                                        i19 += 21;
                                    } else {
                                        arrayList.add(strArr2[i19]);
                                        i19++;
                                    }
                                }
                            }
                            throw new RuntimeException(String.valueOf(i17));
                        }
                        int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
                        TuitionPaymentFragmentbindingInflater1 = i21 % 128;
                        int i22 = i21 % 2;
                        int i23 = ((int[]) objArr[0])[0];
                        int i24 = ((int[]) objArr[2])[0];
                        int i25 = ((int[]) objArr[1])[0];
                        String[] strArr3 = (String[]) objArr[3];
                        int[] iArr2 = {i24};
                        int iNextInt = new Random().nextInt(2118112886);
                        int i26 = ~iNextInt;
                        int i27 = i23 + 1127816950 + (((~((-640682397) | i26)) | (~((-1064349063) | iNextInt))) * 1900) + (((~(i26 | 1064349062)) | (~(iNextInt | 640682396))) * (-950)) + (((~(iNextInt | 1064349062)) | (~(i26 | 640682396))) * 950);
                        int i28 = (i27 << 13) ^ i27;
                        int i29 = i28 ^ (i28 >>> 17);
                        ((int[]) objArr[0])[0] = i29 ^ (i29 << 5);
                        Object[] objArr19 = {new int[1], new int[]{i25}, iArr2, strArr3};
                        return EmailActivationVerificationActivity.onTransact();
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$g(int r6, int r7, int r8) {
                        /*
                            int r6 = r6 + 119
                            byte[] r0 = defpackage.setExpandedActionViewsExclusive.$$c
                            int r7 = r7 + 4
                            int r8 = r8 * 2
                            int r1 = 1 - r8
                            byte[] r1 = new byte[r1]
                            r2 = 0
                            int r8 = 0 - r8
                            if (r0 != 0) goto L14
                            r3 = r7
                            r4 = r2
                            goto L2a
                        L14:
                            r3 = r2
                        L15:
                            int r7 = r7 + 1
                            byte r4 = (byte) r6
                            r1[r3] = r4
                            if (r3 != r8) goto L22
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L22:
                            r4 = r0[r7]
                            int r3 = r3 + 1
                            r5 = r3
                            r3 = r7
                            r7 = r4
                            r4 = r5
                        L2a:
                            int r6 = r6 + r7
                            r7 = r3
                            r3 = r4
                            goto L15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.setExpandedActionViewsExclusive.$$g(int, int, int):java.lang.String");
                    }
                }, 96);
                FragmentManager supportFragmentManager = emailActivationVerificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = g + 51;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        emailActivationVerificationActivity.IconCompatParcelizer();
        if (((RegisteredMemberRegistration) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null && (registeredMemberRegistration = (RegisteredMemberRegistration) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
            String str3 = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
            EditText editText = emailActivationVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
            RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, null, str3, null, null, null, null, null, null, null, null, null, 8380413);
            RegistrationActivationVerifyEmailOtpActivity.Companion companion2 = RegistrationActivationVerifyEmailOtpActivity.INSTANCE;
            EmailActivationVerificationActivity emailActivationVerificationActivity2 = emailActivationVerificationActivity;
            Intrinsics.checkNotNullParameter(emailActivationVerificationActivity2, "");
            Intent intent = new Intent(emailActivationVerificationActivity2, (Class<?>) RegistrationActivationVerifyEmailOtpActivity.class);
            intent.putExtra("registration_data", registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            emailActivationVerificationActivity2.startActivityForResult(intent, RegistrationActivationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            emailActivationVerificationActivity.d_();
        }
        if (((RegistrationForUnregistered) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null && (registrationForUnregistered = (RegistrationForUnregistered) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
            String str4 = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
            EditText editText2 = emailActivationVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
            if (editText2 != null) {
                int i5 = asInterface + 83;
                g = i5 % 128;
                int i6 = i5 % 2;
                text = editText2.getText();
            } else {
                text = null;
            }
            String strValueOf = String.valueOf(text);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = strValueOf.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, null, StringsKt.trim((CharSequence) lowerCase).toString(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str4, null, false, false, 15728635);
            RegistrationVerifyEmailOtpActivity.Companion companion3 = RegistrationVerifyEmailOtpActivity.INSTANCE;
            RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailActivationVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            emailActivationVerificationActivity.d_();
        }
        if (((MigrantWorkerRegistration) emailActivationVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()) == null || (migrantWorkerRegistration = (MigrantWorkerRegistration) emailActivationVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()) == null) {
            return;
        }
        EditText editText3 = emailActivationVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
        String strValueOf2 = String.valueOf(editText3 != null ? editText3.getText() : null);
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        String lowerCase2 = strValueOf2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        MigrantWorkerRegistration migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1 = MigrantWorkerRegistration.TuitionPaymentFragmentbindingInflater1(migrantWorkerRegistration, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) lowerCase2).toString(), null, null, null, null, null, null, null, -268435457, 15);
        RegistrationVerifyEmailOtpActivity.Companion companion4 = RegistrationVerifyEmailOtpActivity.INSTANCE;
        RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailActivationVerificationActivity, migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1);
        emailActivationVerificationActivity.d_();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(EmailActivationVerificationActivity emailActivationVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        RegisteredMemberRegistration registeredMemberRegistration;
        Editable text;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            emailActivationVerificationActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            emailActivationVerificationActivity.IconCompatParcelizer();
            if (((RegisteredMemberRegistration) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null && (registeredMemberRegistration = (RegisteredMemberRegistration) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                String str = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                EditText editText = emailActivationVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
                if (editText != null) {
                    int i2 = g + 25;
                    asInterface = i2 % 128;
                    int i3 = i2 % 2;
                    text = editText.getText();
                } else {
                    text = null;
                }
                RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, StringsKt.trim((CharSequence) String.valueOf(text)).toString(), null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, 8380413);
                RegistrationVerifyEmailOtpActivity.Companion companion = RegistrationVerifyEmailOtpActivity.INSTANCE;
                RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailActivationVerificationActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                emailActivationVerificationActivity.d_();
            }
            if (((RegistrationForUnregistered) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
                int i4 = g + 41;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (registrationForUnregistered != null) {
                    String str2 = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                    EditText editText2 = emailActivationVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
                    String strValueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = strValueOf.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, null, StringsKt.trim((CharSequence) lowerCase).toString(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str2, null, false, false, 15728635);
                    RegistrationVerifyEmailOtpActivity.Companion companion2 = RegistrationVerifyEmailOtpActivity.INSTANCE;
                    RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailActivationVerificationActivity, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    emailActivationVerificationActivity.d_();
                }
            }
            if (((MigrantWorkerRegistration) emailActivationVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()) != null) {
                int i6 = g + 85;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) emailActivationVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                if (migrantWorkerRegistration != null) {
                    EditText editText3 = emailActivationVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
                    String strValueOf2 = String.valueOf(editText3 != null ? editText3.getText() : null);
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "");
                    String lowerCase2 = strValueOf2.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    MigrantWorkerRegistration migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1 = MigrantWorkerRegistration.TuitionPaymentFragmentbindingInflater1(migrantWorkerRegistration, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) lowerCase2).toString(), null, null, null, null, null, null, null, -268435457, 15);
                    RegistrationVerifyEmailOtpActivity.Companion companion3 = RegistrationVerifyEmailOtpActivity.INSTANCE;
                    RegistrationVerifyEmailOtpActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailActivationVerificationActivity, migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1);
                    emailActivationVerificationActivity.d_();
                    return;
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            emailActivationVerificationActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
            String string2 = emailActivationVerificationActivity.getString(R.string.error_email_not_match);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                getStringOrNull.Companion companion4 = getStringOrNull.INSTANCE;
                String string3 = emailActivationVerificationActivity.getString(R.string.title_email_not_match);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                String string4 = emailActivationVerificationActivity.getString(R.string.message_email_not_match);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = emailActivationVerificationActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, string3, string4, string5, new Function0() { // from class: onSubUiVisibilityChanged
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        return (Unit) EmailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 484677179, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[0], -484677177);
                    }
                }, 96);
                FragmentManager supportFragmentManager = emailActivationVerificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                int i8 = g + 125;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailActivationVerificationActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        int i10 = g + 29;
        asInterface = i10 % 128;
        int i11 = i10 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        String str;
        Editable text;
        EmailActivationVerificationActivity emailActivationVerificationActivity = (EmailActivationVerificationActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, emailActivationVerificationActivity);
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        String str2 = null;
        List listSplit$default = StringsKt.split$default((CharSequence) String.valueOf(registeredMemberRegistration != null ? registeredMemberRegistration.asInterface : null), new String[]{"#"}, false, 0, 6, (Object) null);
        if (!Intrinsics.areEqual(listSplit$default.get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
            EditText editText = emailActivationVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
            if (editText != null) {
                int i2 = g + 83;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                text = editText.getText();
            } else {
                text = null;
            }
            String strValueOf = String.valueOf(text);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = strValueOf.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String string = StringsKt.trim((CharSequence) lowerCase).toString();
            String string2 = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string2, "");
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            EmailVerificationRequest emailVerificationRequest = new EmailVerificationRequest(string2, string, String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.INotificationSideChannel : null));
            if (((RegistrationForUnregistered) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()) != null) {
                ((setSplitTrack) emailActivationVerificationActivity.b.getValue()).TuitionPaymentFragmentbindingInflater1(emailVerificationRequest);
            } else {
                ((setSplitTrack) emailActivationVerificationActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(emailVerificationRequest);
            }
        } else {
            int i4 = asInterface + 99;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                emailActivationVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
                str2.hashCode();
                throw null;
            }
            EditText editText2 = emailActivationVerificationActivity.INotificationSideChannelStub().tilEmail.getEditText();
            String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = strValueOf2.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            String string3 = StringsKt.trim((CharSequence) lowerCase2).toString();
            String string4 = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string4, "");
            RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) emailActivationVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (registeredMemberRegistration3 != null) {
                str = registeredMemberRegistration3.INotificationSideChannel;
                int i5 = g + 1;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            } else {
                str = null;
            }
            EmailActivationVerificationRequest emailActivationVerificationRequest = new EmailActivationVerificationRequest(string4, string3, String.valueOf(str), (String) listSplit$default.get(0));
            final setSplitTrack setsplittrack = (setSplitTrack) emailActivationVerificationActivity.b.getValue();
            Intrinsics.checkNotNullParameter(emailActivationVerificationRequest, "");
            MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.g;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack.MediaBrowserCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(emailActivationVerificationRequest)));
            final Function1 function1 = new Function1() { // from class: getDropDownViewTheme
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setSplitTrack.b(setsplittrack, (Verification) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: ThemedSpinnerAdapterHelper
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: getDropDownViewInflater
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setSplitTrack.notify(setsplittrack, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: TintContextWrapper
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            setsplittrack.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ MigrantWorkerRegistration TuitionPaymentFragmentspecialinlinedviewModeldefault3(EmailActivationVerificationActivity emailActivationVerificationActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return (MigrantWorkerRegistration) emailActivationVerificationActivity.getIntent().getParcelableExtra("migration_worker_data");
        }
        int i3 = 82 / 0;
        return (MigrantWorkerRegistration) emailActivationVerificationActivity.getIntent().getParcelableExtra("migration_worker_data");
    }

    public static /* synthetic */ Unit cancelAll() {
        int i = 2 % 2;
        int i2 = g + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = g + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onTransact() {
        int i = 2 % 2;
        int i2 = g + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = g + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        g = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 29;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault1(EmailActivationVerificationActivity emailActivationVerificationActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (RegistrationForUnregistered) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1826655014, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{emailActivationVerificationActivity}, -1826655014);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(EmailActivationVerificationActivity emailActivationVerificationActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1767596582, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{emailActivationVerificationActivity, view}, -1767596578);
    }

    public static /* synthetic */ Unit g() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 484677179, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[0], -484677177);
    }

    static {
        notify = 1;
        INotificationSideChannel();
        INSTANCE = new Companion(null);
        int i = onTransact + 81;
        notify = i % 128;
        if (i % 2 == 0) {
            int i2 = 5 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity
    public final Function1<LayoutInflater, ActivityEmailActivationVerificationBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = collapseItemActionView.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1542326600, collapseItemActionView.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, collapseItemActionView.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, -1542326599);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = g + 67;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1052).substring(0, 25).length() + 816737566;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(length, 570198434, createEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, collapseItemActionView.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, -570198431);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = g + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingReactiveFormActivity, com.nbs.validacion.ReactiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 7;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void INotificationSideChannel() {
        f499a = new char[]{48493, 8874, 33528, 25126, 49731, 41869, 984, 58202, 17187, 9079, 33010, 24775, 49173, 41047, 392, 57809, 16865, 8455, 33136, 26299, 50895, 42511, 24996, 65125, 24112, 48873, 7826, 32588, 57109, 16363, 40932, 65448, 23677, 48173, 7368, 31876, 56660, 45558, 11829, 36474, 28325, 52882, 44824, 3917, 61322, 20411, 12218, 35871, 27773, 52367, 44224, 3337, 60745, 45557, 11824, 36457, 28330, 52936, 44829, 3928, 61341, 20372, 12277, 35903, 27756, 52415, 44251, 3336, 60737};
        asBinder = -7145199196402602412L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, int r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 3
            int r8 = r8 + 109
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L30
        L18:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1c:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L2b:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L30:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.EmailActivationVerificationActivity.$$i(byte, int, int):java.lang.String");
    }
}
