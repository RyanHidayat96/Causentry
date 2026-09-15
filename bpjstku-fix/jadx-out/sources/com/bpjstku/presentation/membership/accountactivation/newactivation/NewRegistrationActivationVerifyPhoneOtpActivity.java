package com.bpjstku.presentation.membership.accountactivation.newactivation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
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
import android.view.KeyEvent;
import android.view.LayoutInflater;
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
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import com.bpjstku.databinding.ActivityRegistrationActivationVerifyPhoneOtpBinding;
import com.bpjstku.presentation.membership.accountactivation.RegistrationActivationPasswordActivity;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyPhoneOtpActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity;
import com.bpjstku.util.constant.MembershipType;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.mlkit_vision_common.zzhe;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.IntegerRes;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.getCameraCharacteristic;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.isSticky;
import defpackage.mapPoint;
import defpackage.notifyStateAttached;
import defpackage.retrieveConcurrentCameraIds;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004R\u0017\u0010\u0006\u001a\u0004\u0018\u00010\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00128\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0016\u0010\u000e\u001a\u00020\u00168\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0015\u0010\u0013\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0015\u0010\b\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0015\u0010\u0019\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001eR\u001a\u0010\n\u001a\u00020\u001f8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0011\u0010!"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/newactivation/NewRegistrationActivationVerifyPhoneOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationActivationVerifyPhoneOtpBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "onBackPressed", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "d", "Ljava/lang/String;", "Lcom/bpjstku/data/lib/PreferenceManager;", "LgetCameraCharacteristic;", "LgetCameraCharacteristic;", "LsetSplitTrack;", "g", "LisSticky;", "LIntegerRes;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewRegistrationActivationVerifyPhoneOtpActivity extends BindingBaseActivity<ActivityRegistrationActivationVerifyPhoneOtpBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int[] cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private getCameraCharacteristic TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy d;
    private static final byte[] $$c = {57, -50, -56, -93};
    private static final int $$f = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {48, -119, -71, 110, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 2;
    private static int cancelAll = 0;
    private static int notify = 0;
    private static int onTransact = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: onSetBackgroundDrawable
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewRegistrationActivationVerifyPhoneOtpActivity.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: shouldApplyFrameworkTintUsingColorFilter
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int asBinder = R.layout.activity_registration_activation_verify_phone_otp;

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i4);
        int i9 = ~i3;
        int i10 = ~(i9 | i4);
        int i11 = i8 | i10;
        int i12 = ~i4;
        int i13 = ~(i12 | i5);
        int i14 = (~(i3 | i7)) | i13 | i10;
        int i15 = (~(i9 | i5)) | (~(i12 | i9)) | i13;
        int i16 = i4 + i5 + i + ((-954185507) * i2) + (2055044340 * i6);
        int i17 = i16 * i16;
        int i18 = ((1110557339 * i4) - 760807424) + ((-878567756) * i5) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i) + (1313472512 * i2) + (606601216 * i6) + ((-1232666624) * i17);
        int i19 = (i4 * 1290134917) + 267690129 + (i5 * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (i * 1290136159) + (i2 * 826674179) + (i6 * 1594648204) + (i17 * 572063744);
        int i20 = i18 + (i19 * i19 * 607715328);
        if (i20 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i20 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i20 != 3) {
            return i20 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyPhoneOtpActivity.$$a
            int r8 = 144 - r8
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyPhoneOtpActivity.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyPhoneOtpActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/newactivation/NewRegistrationActivationVerifyPhoneOtpActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/nbs/nucleosnucleo/presentation/BaseActivity;", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/nbs/nucleosnucleo/presentation/BaseActivity;Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;)V", "Landroid/content/Context;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "b", "(Landroid/content/Context;Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseActivity p0, RegisteredMemberRegistration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) NewRegistrationActivationVerifyPhoneOtpActivity.class);
            intent.putExtra("registration_data", p1);
            p0.startActivityForResult(intent, 101);
        }

        public static void b(Context p0, RegistrationForUnregistered p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intent intent = new Intent(p0, (Class<?>) NewRegistrationActivationVerifyPhoneOtpActivity.class);
            intent.putExtra("unregistered_data", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NewRegistrationActivationVerifyPhoneOtpActivity() {
        final NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity = this;
        this.b = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyPhoneOtpActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = newRegistrationActivationVerifyPhoneOtpActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity2 = this;
        this.d = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = newRegistrationActivationVerifyPhoneOtpActivity2;
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
        this.a = LazyKt.lazy(new Function0<isSticky>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, isSticky] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ isSticky invoke() {
                LifecycleOwner lifecycleOwner = newRegistrationActivationVerifyPhoneOtpActivity2;
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
        this.g = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyPhoneOtpActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = newRegistrationActivationVerifyPhoneOtpActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = notify + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        NewRegistrationActivationVerifyPhoneOtpActivity$bindingInflater$1 newRegistrationActivationVerifyPhoneOtpActivity$bindingInflater$1 = NewRegistrationActivationVerifyPhoneOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = notify + 51;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return newRegistrationActivationVerifyPhoneOtpActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 9;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.asBinder;
        int i6 = i2 + 109;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityRegistrationActivationVerifyPhoneOtpBinding activityRegistrationActivationVerifyPhoneOtpBinding = (ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: applySupportBackgroundTint
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityRegistrationActivationVerifyPhoneOtpBinding, this);
            }
        });
        OtpView otpView = activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: getAutoSizeMinTextSize
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (String) obj);
            }
        }));
        activityRegistrationActivationVerifyPhoneOtpBinding.btnVerification.setOnClickListener(new View.OnClickListener() { // from class: applyFrameworkTintUsingColorFilter
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, activityRegistrationActivationVerifyPhoneOtpBinding, view);
            }
        });
        activityRegistrationActivationVerifyPhoneOtpBinding.btnChangePhone.setOnClickListener(new View.OnClickListener() { // from class: readProperties
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view}, ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), 641770879, -641770878, ClaimOldDaySecurityTermsConditionActivity.b.b());
            }
        });
        activityRegistrationActivationVerifyPhoneOtpBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: AppCompatBackgroundHelper
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityRegistrationActivationVerifyPhoneOtpBinding, this, view);
            }
        });
        int i2 = onTransact + 55;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = cancel;
        int i3 = -1870535734;
        long j = 0;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 73;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 3290, 31 - (ViewConfiguration.getTouchSlop() >> 8), 1948206109, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = -1870535734;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = cancel;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $11 + 123;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    Object[] objArr3 = new Object[i4];
                    objArr3[i5] = Integer.valueOf(iArr5[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iResolveSizeAndState = View.resolveSizeAndState(i5, i5, i5) + 3291;
                        int offsetBefore = 31 - TextUtils.getOffsetBefore("", i5);
                        byte b4 = (byte) i5;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, iResolveSizeAndState, offsetBefore, 1948206109, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                } else {
                    length3 = length3;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), (Process.myTid() >> 22) + 3291, View.resolveSizeAndState(0, 0, 0) + 31, 1948206109, false, $$i(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i9++;
                }
                length3 = length3;
                i4 = 1;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i11 = i5;
        System.arraycopy(iArr5, i11, iArr4, i11, length2);
        sessionConfigValidatingBuilder.b = 2;
        int i12 = $11 + 99;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i14 = $11 + 77;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = 17;
            while (i16 > 1) {
                int i17 = $11 + 67;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2559 - Color.alpha(0), 29 - View.MeasureSpec.makeMeasureSpec(0, 0), 683220507, false, $$i(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i16 += 13;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                    try {
                        Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2560 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 28 - Process.getGidForName(""), 683220507, false, $$i(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                        i16--;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr7 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (28880 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 348 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity = this;
        ((setSplitTrack) this.d.getValue()).IconCompatParcelizer.observe(newRegistrationActivationVerifyPhoneOtpActivity, new b(new Function1() { // from class: setSupportBackgroundTintMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationActivationVerifyPhoneOtpActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((isSticky) this.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(newRegistrationActivationVerifyPhoneOtpActivity, new b(new Function1() { // from class: mapProperties
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((isSticky) this.a.getValue()).TuitionPaymentFragmentbindingInflater1.observe(newRegistrationActivationVerifyPhoneOtpActivity, new b(new Function1() { // from class: loadFromAttributes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(newRegistrationActivationVerifyPhoneOtpActivity, new b(new Function1() { // from class: onSetBackgroundResource
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = onTransact + 103;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity = (NewRegistrationActivationVerifyPhoneOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 65;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((IntegerRes) newRegistrationActivationVerifyPhoneOtpActivity.g.getValue()).b();
            getCameraCharacteristic getcameracharacteristic = newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1;
            obj.hashCode();
            throw null;
        }
        ((IntegerRes) newRegistrationActivationVerifyPhoneOtpActivity.g.getValue()).b();
        getCameraCharacteristic getcameracharacteristic2 = newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = notify + 13;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            getcameracharacteristic2 = null;
        }
        getcameracharacteristic2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        String str;
        int i = 2 % 2;
        NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity = this;
        Intrinsics.checkNotNullParameter(newRegistrationActivationVerifyPhoneOtpActivity, "");
        newRegistrationActivationVerifyPhoneOtpActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.label_string_null));
        TextView textView = ((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvPhoneNumber;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (registeredMemberRegistration == null || (str = registeredMemberRegistration.g) == null) {
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            str = registrationForUnregistered != null ? registrationForUnregistered.TuitionPaymentFragmentbindingInflater1 : null;
        }
        int i2 = onTransact;
        int i3 = i2 + 113;
        notify = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        notify = i5 % 128;
        int i6 = i5 % 2;
        textView.setText(str);
        int i7 = notify + 111;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 65 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentbindingInflater1 = new getCameraCharacteristic(((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, null);
        int i2 = onTransact + 57;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        d_();
        int i4 = onTransact + 1;
        notify = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrB$5f1425da;
        int i = 2 % 2;
        int i2 = onTransact + 123;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
            int i4 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte b2 = $$a[132];
            Object[] objArr2 = new Object[1];
            c(b2, (short) (b2 | 140), (byte) 52, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, scrollDefaultDelay, i4, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{-700999751, -83374113, -1486224240, -1717806111, -1358272720, 402193873, 1181063140, 486310759, 199284805, -1425314668, -1300628520, 1391923005, 1149088163, -832285465}, ExpandableListView.getPackedPositionGroup(0L) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{972697918, -1857270581, -2083685240, -1331621699, -1505147290, -375565122, 217865805, 85166001, -1662828580, -347897985}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int iCombineMeasuredStates = 1031 - View.combineMeasuredStates(0, 0);
            int mode = View.MeasureSpec.getMode(0) + 15;
            byte b3 = $$a[132];
            Object[] objArr5 = new Object[1];
            c(b3, (short) (b3 | 88), (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iCombineMeasuredStates, mode, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = onTransact + 97;
            notify = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
                int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b5, (short) (b5 | 37), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, i7, packedPositionChild, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[3])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i10 = 619471748 + (((~((~iUptimeMillis) | 673029834)) | 293740832) * 529) + (((~(iUptimeMillis | 673029834)) | 428749664) * 529) + 1315956909;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{-861445545, 1007604124, -1944181909, 2114686528, 1601437465, 2146458862, 1501923544, -2124575048, -614363427, 1664181290}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step1).substring(0, 4).codePointAt(3) - 49, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{-117392714, -1003640569, -1693691308, -1787767945, 965897821, 691257743, -1369755269, -2130609989, -1472503317, 291014515}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.orderId).substring(0, 8).length() + 8, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-655930641};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 46037), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1134, 18 - TextUtils.indexOf("", "", 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1315956909, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int iKeyCodeFromString = 1031 - KeyEvent.keyCodeFromString("");
                    int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte b6 = $$a[132];
                    Object[] objArr12 = new Object[1];
                    c(b6, (short) (b6 | 140), (byte) 52, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, iKeyCodeFromString, keyRepeatDelay, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getTrimmedLength("") + 45993), 1116 - TextUtils.lastIndexOf("", '0', 0, 0), Color.alpha(0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int i13 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
                    int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr13 = new Object[1];
                    c(b8, (short) (b8 | 37), b7, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, i13, iIndexOf, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new int[]{-700999751, -83374113, -1486224240, -1717806111, -1358272720, 402193873, 1181063140, 486310759, 199284805, -1425314668, -1300628520, 1391923005, 1149088163, -832285465}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new int[]{972697918, -1857270581, -2083685240, -1331621699, -1505147290, -375565122, 217865805, 85166001, -1662828580, -347897985}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
                        int i14 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte b9 = $$a[132];
                        Object[] objArr16 = new Object[1];
                        c(b9, (short) (b9 | 88), (byte) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop, scrollDefaultDelay2, i14, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1031;
                        int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 15;
                        byte b10 = $$a[132];
                        Object[] objArr17 = new Object[1];
                        c(b10, (short) (b10 | 140), (byte) 52, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cArgb, packedPositionType, windowTouchSlop2, 1357589585, false, (String) objArr17[0], null);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    int i17 = notify + 53;
                    onTransact = i17 % 128;
                    int i18 = i17 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[3])[0];
        int i21 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i22 = ~((-176570727) | (~iMaxMemory));
        int i23 = i19 + ((67709441 | i22 | (~(176570726 | iMaxMemory))) * (-338)) + 1655234747 + (((~(iMaxMemory | 244280167)) | i22) * 338);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
        int i26 = onTransact + 67;
        notify = i26 % 128;
        int i27 = i26 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
            int iResolveSizeAndState = 1755 - View.resolveSizeAndState(0, 0, 0);
            int mirror = 'G' - AndroidCharacter.getMirror('0');
            byte b11 = $$a[132];
            short s = (short) (b11 | 36);
            Object[] objArr19 = new Object[1];
            c(b11, s, (byte) s, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveOpacity, iResolveSizeAndState, mirror, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                int i28 = 1756 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
                byte b12 = $$a[132];
                Object[] objArr20 = new Object[1];
                c(b12, (short) (b12 | 88), (byte) 52, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c2, i28, minimumFlingVelocity, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int i29 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i30 = 1203717843 + (((~i29) | 640684108) * 1324) + (((~(i29 | (-428845747))) | (~(641448172 | i29))) * (-1324)) + 1117431118;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArrB$5f1425da[3])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(new int[]{-861445545, 1007604124, -1944181909, 2114686528, 1601437465, 2146458862, 1501923544, -2124575048, -614363427, 1664181290}, (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new int[]{-117392714, -1003640569, -1693691308, -1787767945, 965897821, 691257743, -1369755269, -2130609989, -1472503317, 291014515}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_atm_bersama).substring(1, 3).codePointAt(0) - 81, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-655930641};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42049), View.MeasureSpec.getSize(0) + 1726, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -29219080);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollDefaultDelay3 = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1755;
                int touchSlop = 23 - (ViewConfiguration.getTouchSlop() >> 8);
                byte b13 = $$a[132];
                Object[] objArr25 = new Object[1];
                c(b13, (short) (b13 | 88), (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollDefaultDelay3, packedPositionGroup, touchSlop, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrB$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                e(new int[]{-700999751, -83374113, -1486224240, -1717806111, -1358272720, 402193873, 1181063140, 486310759, 199284805, -1425314668, -1300628520, 1391923005, 1149088163, -832285465}, 21 - ExpandableListView.getPackedPositionChild(0L), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new int[]{972697918, -1857270581, -2083685240, -1331621699, -1505147290, -375565122, 217865805, 85166001, -1662828580, -347897985}, 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char deadChar = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                    int gidForName = Process.getGidForName("") + 1756;
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 23;
                    byte[] bArr = $$a;
                    byte b14 = bArr[132];
                    short s2 = bArr[7];
                    Object[] objArr28 = new Object[1];
                    c(b14, s2, (byte) (s2 | 52), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(deadChar, gidForName, iIndexOf2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char mode2 = (char) (View.MeasureSpec.getMode(0) + 29944);
                    int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i33 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte b15 = $$a[132];
                    short s3 = (short) (b15 | 36);
                    Object[] objArr29 = new Object[1];
                    c(b15, s3, (byte) s3, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(mode2, fadingEdgeLength, i33, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i34 = notify + 15;
                onTransact = i34 % 128;
                int i35 = i34 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArrB$5f1425da[1])[0];
        int i37 = ((int[]) objArrB$5f1425da[0])[0];
        if (i37 == i36) {
            int i38 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int i39 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
            int i40 = i38 + (-1778517389) + ((~((-33687586) | i39)) * (-783)) + (((~(i39 | (-42662380))) | (-255264806)) * 783);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr30[3])[0] = i42 ^ (i42 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrB$5f1425da[4];
        if (strArr4 != null) {
            int i43 = onTransact + 89;
            notify = i43 % 128;
            int i44 = i43 % 2;
            int i45 = 0;
            while (i45 < strArr4.length) {
                arrayList2.add(strArr4[i45]);
                i45++;
                int i46 = onTransact + 27;
                notify = i46 % 128;
                int i47 = i46 % 2;
            }
        }
        int[] iArr = new int[i37];
        int i48 = i37 - 1;
        iArr[i48] = 1;
        Toast.makeText((Context) null, iArr[((i37 * i48) % 2) - 1], 1).show();
        int i49 = ((int[]) objArrB$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i50 = i49 + (((561277709 + (((~(305795502 | startElapsedRealtime)) | (-518397929)) * (-948))) + ((~((~startElapsedRealtime) | (-214175297))) * (-948))) - 988922536);
        int i51 = (i50 << 13) ^ i50;
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr31[3])[0] = i52 ^ (i52 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        if (i4 != (-254542356) + (((~(1537446090 | iNextInt)) | (-707458548)) * (-964)) + (((~((~iNextInt) | 1537446090)) | (-2074867196)) * (-964))) {
            throw null;
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iMyTid = Process.myTid();
        if (i5 != (-417156721) + (((~((~iMyTid) | (-1058659040))) | 1520396925) * (-235)) + (((~((-1058659040) | iMyTid)) | 1520396925) * (-470)) + (((~(iMyTid | (-620793987))) | 1082531872) * 235)) {
            throw new RuntimeException("-1102341239");
        }
        super.onResume();
        int i6 = onTransact + 49;
        notify = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b7, code lost:
    
        if (r0 != (((645208060 + (((~((-1703900776) | r2)) | 604587621) * 104)) + ((~((~r2) | 1974468343)) * (-104))) + ((r2 | 875155189) * 104))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b9, code lost:
    
        super.onStart();
        r11 = com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyPhoneOtpActivity.onTransact + 33;
        com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyPhoneOtpActivity.notify = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c5, code lost:
    
        if ((r11 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ca, code lost:
    
        r11 = 1230215116 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d3, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004b, code lost:
    
        if (r2 == ((((-1530675584) + (((~(1592679040 | r5)) | 762691497) * 226)) + (((~(r5 | 2147483561)) | ((~((-762691498) | r4)) | 207886976)) * (-113))) + ((~(r4 | 1592679040)) * 113))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0088, code lost:
    
        if (r2 == (((475278640 + (((~(1727929001 | r5)) | 897941458) * (-90))) + (((~(1727929001 | r4)) | 1115291689) * (-45))) + ((((~(r4 | (-897941459))) | 1727929001) | (~(r5 | 897941458))) * 45))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008a, code lost:
    
        r0 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = android.os.Process.myUid();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Object[] r11) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.accountactivation.newactivation.NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Object[]):java.lang.Object");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int i5 = ~Process.myUid();
        if (i4 != (-2055150196) + ((~((-88408083) | i5)) * (-783)) + (((~(i5 | (-1464714291))) | (-634726748)) * 783)) {
            int[] iArr = new int[803465973];
            iArr[803465972] = 1;
            int i6 = 1279189892 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i7 = notify + 73;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i9 != (-1193462180) + (((~(1955898903 | iIdentityHashCode)) | 172575072) * 576) + (((~((~iIdentityHashCode) | 2128473975)) | 67412500) * 576) + 618993664) {
            throw new RuntimeException("974206663");
        }
        super.onCreate(bundle);
        int i10 = onTransact + 87;
        notify = i10 % 128;
        int i11 = i10 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        MembershipType membershipType;
        int i = 2 % 2;
        int i2 = notify + 55;
        onTransact = i2 % 128;
        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        if (i2 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newRegistrationActivationVerifyPhoneOtpActivity.MediaBrowserCompat();
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            newRegistrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            Object obj = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
            String str = newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str = null;
            }
            if (Intrinsics.areEqual(obj, str)) {
                String checkSum = ((OtpVerificationResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum();
                if (((RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                    int i3 = onTransact + 113;
                    notify = i3 % 128;
                    int i4 = i3 % 2;
                    RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    if ((registeredMemberRegistration != null ? registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null) == MembershipType.PU) {
                        int i5 = notify + 97;
                        onTransact = i5 % 128;
                        if (i5 % 2 == 0) {
                            registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
                            throw null;
                        }
                        RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                        if (registeredMemberRegistration2 != null) {
                            registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration2, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415);
                        }
                        Intent intent = new Intent();
                        intent.putExtra("registration_data", registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        newRegistrationActivationVerifyPhoneOtpActivity.setResult(-1, intent);
                        newRegistrationActivationVerifyPhoneOtpActivity.finish();
                    } else {
                        RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                        if (registeredMemberRegistration3 != null) {
                            int i6 = notify + 43;
                            onTransact = i6 % 128;
                            int i7 = i6 % 2;
                            membershipType = registeredMemberRegistration3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        } else {
                            membershipType = null;
                        }
                        if (membershipType == MembershipType.BPU) {
                            RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                            if (registeredMemberRegistration4 != null) {
                                int i8 = notify + 93;
                                onTransact = i8 % 128;
                                int i9 = i8 % 2;
                                registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration4, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415);
                            }
                            Intent intent2 = new Intent();
                            intent2.putExtra("registration_data", registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            newRegistrationActivationVerifyPhoneOtpActivity.setResult(-1, intent2);
                            newRegistrationActivationVerifyPhoneOtpActivity.finish();
                        } else {
                            RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                            registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = registeredMemberRegistration5 != null ? RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration5, null, null, null, null, null, null, null, null, null, null, null, null, null, checkSum, null, null, null, null, null, null, null, null, null, 8380415) : null;
                            RegistrationActivationPasswordActivity.Companion companion = RegistrationActivationPasswordActivity.INSTANCE;
                            RegistrationActivationPasswordActivity.Companion.TuitionPaymentFragmentbindingInflater1(newRegistrationActivationVerifyPhoneOtpActivity, registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            newRegistrationActivationVerifyPhoneOtpActivity.d_();
                        }
                    }
                }
            } else {
                String string = newRegistrationActivationVerifyPhoneOtpActivity.getString(R.string.error_signature_checking);
                Intrinsics.checkNotNullExpressionValue(string, "");
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(newRegistrationActivationVerifyPhoneOtpActivity, string, "Coba Kembali", new Function0() { // from class: setTextAppearance
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return (Unit) NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3}, ClaimOldDaySecurityTermsConditionActivity.b.b(), ClaimOldDaySecurityTermsConditionActivity.b.b(), -1750479724, 1750479728, ClaimOldDaySecurityTermsConditionActivity.b.b());
                    }
                });
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            newRegistrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
            ((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = notify + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newRegistrationActivationVerifyPhoneOtpActivity.getIntent().getParcelableExtra("unregistered_data");
        int i4 = notify + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return registrationForUnregistered;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity = (NewRegistrationActivationVerifyPhoneOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 45;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            newRegistrationActivationVerifyPhoneOtpActivity.d_();
            return Unit.INSTANCE;
        }
        newRegistrationActivationVerifyPhoneOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ Unit b(NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newRegistrationActivationVerifyPhoneOtpActivity.MediaBrowserCompat();
            int i2 = onTransact + 37;
            notify = i2 % 128;
            int i3 = i2 % 2;
        } else {
            getCameraCharacteristic getcameracharacteristic = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                newRegistrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
                getCameraCharacteristic getcameracharacteristic2 = newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1;
                if (getcameracharacteristic2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i4 = notify + 37;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    getcameracharacteristic = getcameracharacteristic2;
                }
                getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newRegistrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityRegistrationActivationVerifyPhoneOtpBinding activityRegistrationActivationVerifyPhoneOtpBinding, NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = notify + 121;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            OtpView otpView = activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, newRegistrationActivationVerifyPhoneOtpActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        OtpView otpView2 = activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView2, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView2, newRegistrationActivationVerifyPhoneOtpActivity);
        int i3 = onTransact + 51;
        notify = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b6 A[PHI: r3
  0x00b6: PHI (r3v33 java.lang.String) = (r3v31 java.lang.String), (r3v45 java.lang.String) binds: [B:29:0x00b2, B:22:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0113 A[PHI: r1
  0x0113: PHI (r1v21 java.lang.String) = (r1v19 java.lang.String), (r1v29 java.lang.String) binds: [B:48:0x010e, B:42:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba A[PHI: r4
  0x01ba: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:86:0x01b7, B:81:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity, ActivityRegistrationActivationVerifyPhoneOtpBinding activityRegistrationActivationVerifyPhoneOtpBinding, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        RegisteredMemberRegistration registeredMemberRegistration;
        int i = 2 % 2;
        int i2 = onTransact + 103;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            String str7 = "";
            if (Intrinsics.areEqual(StringsKt.split$default((CharSequence) String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.asInterface : null), new String[]{"#"}, false, 0, 6, (Object) null).get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
                int i4 = notify + 87;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                isSticky issticky = (isSticky) newRegistrationActivationVerifyPhoneOtpActivity.a.getValue();
                String string = ((PreferenceManager) newRegistrationActivationVerifyPhoneOtpActivity.b.getValue()).getString("OCR_TRANSACTION_ID", "");
                if (((RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                    int i6 = notify + 33;
                    onTransact = i6 % 128;
                    if (i6 % 2 == 0) {
                        registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                        int i7 = 11 / 0;
                        if (registeredMemberRegistration != null) {
                            str3 = registeredMemberRegistration.g;
                        } else {
                            str3 = null;
                        }
                    } else {
                        registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                        if (registeredMemberRegistration != null) {
                            str3 = registeredMemberRegistration.g;
                        } else {
                            str3 = null;
                        }
                    }
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                } else {
                    RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    if (registrationForUnregistered != null) {
                        int i8 = onTransact + 99;
                        notify = i8 % 128;
                        int i9 = i8 % 2;
                        str3 = registrationForUnregistered.TuitionPaymentFragmentbindingInflater1;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                }
                String string2 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify.getText())).toString();
                if (((RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                    int i10 = notify + 121;
                    onTransact = i10 % 128;
                    int i11 = i10 % 2;
                    RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    if (registeredMemberRegistration3 != null) {
                        int i12 = onTransact + 81;
                        notify = i12 % 128;
                        if (i12 % 2 != 0) {
                            str5 = registeredMemberRegistration3.INotificationSideChannel;
                            int i13 = 39 / 0;
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
                    RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    str5 = registrationForUnregistered2 != null ? registrationForUnregistered2.connect : null;
                    if (str5 == null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                }
                RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                str2 = registeredMemberRegistration4 != null ? registeredMemberRegistration4.TuitionPaymentFragmentbindingInflater1 : null;
                issticky.b(string, str4, string2, str6, str2 == null ? "" : str2);
            } else {
                isSticky issticky2 = (isSticky) newRegistrationActivationVerifyPhoneOtpActivity.a.getValue();
                if (((RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                    int i14 = notify + 57;
                    onTransact = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    RegisteredMemberRegistration registeredMemberRegistration5 = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    str = registeredMemberRegistration5 != null ? registeredMemberRegistration5.g : null;
                    if (str == null) {
                        str = "";
                    }
                } else {
                    RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    str = registrationForUnregistered3 != null ? registrationForUnregistered3.TuitionPaymentFragmentbindingInflater1 : null;
                    if (str == null) {
                        str = "";
                    }
                }
                String string3 = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify.getText())).toString();
                if (((RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                    RegisteredMemberRegistration registeredMemberRegistration6 = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    str2 = registeredMemberRegistration6 != null ? registeredMemberRegistration6.INotificationSideChannel : null;
                    if (str2 == null) {
                        int i15 = notify + 65;
                        onTransact = i15 % 128;
                        int i16 = i15 % 2;
                    } else {
                        str7 = str2;
                    }
                } else {
                    RegistrationForUnregistered registrationForUnregistered4 = (RegistrationForUnregistered) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    str2 = registrationForUnregistered4 != null ? registrationForUnregistered4.connect : null;
                    if (str2 != null) {
                        str7 = str2;
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity, String str) {
        int i = 2 % 2;
        int i2 = notify + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        MaterialButton materialButton = ((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnVerification;
        int length = str.length();
        Intrinsics.checkNotNull(materialButton);
        MaterialButton materialButton2 = materialButton;
        if (length < 6) {
            int i4 = onTransact + 55;
            notify = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullParameter(materialButton2, "");
                materialButton2.setEnabled(false);
            } else {
                Intrinsics.checkNotNullParameter(materialButton2, "");
                materialButton2.setEnabled(false);
            }
        } else {
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
            int i5 = onTransact + 121;
            notify = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[PHI: r2
  0x0096: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:35:0x0093, B:30:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityRegistrationActivationVerifyPhoneOtpBinding activityRegistrationActivationVerifyPhoneOtpBinding, NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity, View view) {
        String str;
        int i;
        int i2 = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            activityRegistrationActivationVerifyPhoneOtpBinding.otpVerify.getEditableText().clear();
            setSplitTrack setsplittrack = (setSplitTrack) newRegistrationActivationVerifyPhoneOtpActivity.d.getValue();
            String str2 = "";
            String str3 = null;
            if (((RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                int i3 = onTransact + 57;
                notify = i3 % 128;
                int i4 = i3 % 2;
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                str = registeredMemberRegistration != null ? registeredMemberRegistration.g : null;
                if (str == null) {
                    i = onTransact + 121;
                    notify = i % 128;
                    if (i % 2 != 0) {
                        int i5 = 4 / 2;
                    }
                    str = "";
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                str = registrationForUnregistered != null ? registrationForUnregistered.TuitionPaymentFragmentbindingInflater1 : null;
                if (str == null) {
                    i = onTransact + 121;
                    notify = i % 128;
                    if (i % 2 != 0) {
                        int i6 = 4 / 2;
                    }
                    str = "";
                }
            }
            if (((RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (registeredMemberRegistration2 != null) {
                    int i7 = notify + 73;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                    str3 = registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1;
                    int i9 = onTransact + 33;
                    notify = i9 % 128;
                    int i10 = i9 % 2;
                }
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                str3 = registrationForUnregistered2 != null ? registrationForUnregistered2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
                if (str3 != null) {
                    str2 = str3;
                }
            }
            setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new PhoneVerificationRequest(str, str2));
        } finally {
            ViewPortBuilder.b();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity = (NewRegistrationActivationVerifyPhoneOtpActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 103;
        notify = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            newRegistrationActivationVerifyPhoneOtpActivity.onBackPressed();
            ViewPortBuilder.b();
            int i4 = onTransact + 13;
            notify = i4 % 128;
            int i5 = i4 % 2;
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ RegisteredMemberRegistration b(NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = notify + 37;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.getIntent().getParcelableExtra("registration_data");
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(final NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newRegistrationActivationVerifyPhoneOtpActivity.MediaBrowserCompat();
        } else {
            MembershipType membershipType = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                newRegistrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
                Object obj = StringsKt.split$default((CharSequence) ((OtpVerificationResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature(), new String[]{"#"}, false, 0, 6, (Object) null).get(2);
                String str = newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                }
                if (Intrinsics.areEqual(obj, str)) {
                    int i2 = onTransact + 25;
                    notify = i2 % 128;
                    int i3 = i2 % 2;
                    RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    if (registeredMemberRegistration != null) {
                        membershipType = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    } else {
                        int i4 = notify + 83;
                        onTransact = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    if (((RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != null) {
                        if (membershipType == MembershipType.PU || membershipType == MembershipType.BPU) {
                            newRegistrationActivationVerifyPhoneOtpActivity.setResult(-1);
                            newRegistrationActivationVerifyPhoneOtpActivity.finish();
                        } else {
                            NewActivationPasswordActivity.Companion companion = NewActivationPasswordActivity.INSTANCE;
                            NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newRegistrationActivationVerifyPhoneOtpActivity, (RegisteredMemberRegistration) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
                            newRegistrationActivationVerifyPhoneOtpActivity.d_();
                        }
                    }
                    if (((RegistrationForUnregistered) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()) != null) {
                        NonSalariedWorkerConfirmationActivity.Companion companion2 = NonSalariedWorkerConfirmationActivity.INSTANCE;
                        NonSalariedWorkerConfirmationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(newRegistrationActivationVerifyPhoneOtpActivity, (RegistrationForUnregistered) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
                        newRegistrationActivationVerifyPhoneOtpActivity.d_();
                    }
                    int i6 = notify + 9;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    String string = newRegistrationActivationVerifyPhoneOtpActivity.getString(R.string.error_signature_checking);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(newRegistrationActivationVerifyPhoneOtpActivity, string, "Coba Kembali", new Function0() { // from class: AppCompatAutoCompleteTextViewInspectionCompanion
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                    });
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newRegistrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
                ((ActivityRegistrationActivationVerifyPhoneOtpBinding) ((ViewBinding) newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = notify + 9;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            newRegistrationActivationVerifyPhoneOtpActivity.MediaBrowserCompat();
        } else {
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i5 = i3 + 11;
                notify = i5 % 128;
                if (i5 % 2 != 0) {
                    newRegistrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
                    newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
                    obj.hashCode();
                    throw null;
                }
                newRegistrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
                newRegistrationActivationVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newRegistrationActivationVerifyPhoneOtpActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newRegistrationActivationVerifyPhoneOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = notify + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        newRegistrationActivationVerifyPhoneOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 125;
        notify = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity) {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{newRegistrationActivationVerifyPhoneOtpActivity}, ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, -1750479724, 1750479728, ClaimOldDaySecurityTermsConditionActivity.b.b());
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewRegistrationActivationVerifyPhoneOtpActivity newRegistrationActivationVerifyPhoneOtpActivity, View view) {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{newRegistrationActivationVerifyPhoneOtpActivity, view}, ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, 641770879, -641770878, ClaimOldDaySecurityTermsConditionActivity.b.b());
    }

    static {
        INotificationSideChannel = 1;
        g();
        INSTANCE = new Companion(null);
        int i = cancelAll + 67;
        INotificationSideChannel = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegistrationActivationVerifyPhoneOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int iB = ClaimOldDaySecurityTermsConditionActivity.b.b();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this}, ClaimOldDaySecurityTermsConditionActivity.b.b(), iB, 849774527, -849774525, zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = notify + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1788327347, -1788327344, ClaimOldDaySecurityTermsConditionActivity.b.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimOldDaySecurityTermsConditionActivity.b.b(), new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.akulaku).substring(0, 7).length() - 1984666889, zzhe.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1236584716, -1236584716, ClaimOldDaySecurityTermsConditionActivity.b.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        int i5 = notify + 27;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        cancel = new int[]{-1822014652, 60719332, 1692019020, 45273621, -1662993970, -117368133, -655268219, 1472251362, -406976982, 1633861704, -1470547408, -1500375307, 1052288442, -1070067798, -466837148, -613533532, -1362147120, -1184496620};
    }

    private static String $$i(int i, byte b2, byte b3) {
        int i2 = 3 - (b2 * 2);
        int i3 = i * 2;
        int i4 = (b3 * 56) + 66;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i4 = (-i2) + i5;
            i2 = i2;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i2 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i4 = (-bArr[i8]) + i4;
            i2 = i8;
        }
    }
}
