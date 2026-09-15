package com.bpjstku.presentation.vocational;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipPhotoPersonForInsert;
import com.bpjstku.data.vocation.model.request.VocationPhoneVerificationRequest;
import com.bpjstku.databinding.ActivityRegistrationVerifyPhoneOtpBinding;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.vocational.VocationalVerifyPhoneOtpActivity;
import com.bpjstku.presentation.vocational.model.VocationalRegistration;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.tasks.zzu;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.AutoValue_MediaSpec1;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.captureSingleRequest;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.getCameraCharacteristic;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001d\u001a\u00020\u001f8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010\b\u001a\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\"R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010%"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalVerifyPhoneOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityRegistrationVerifyPhoneOtpBinding;", "<init>", "()V", "", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "onResume", "onStop", "onDestroy", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "g", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/registration/general/model/Verification;", "d", "Lcom/bpjstku/domain/registration/general/model/Verification;", "LgetCameraCharacteristic;", "LgetCameraCharacteristic;", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VocationalVerifyPhoneOtpActivity extends BindingBaseActivity<ActivityRegistrationVerifyPhoneOtpBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f660a;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private getCameraCharacteristic d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Verification b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$a = {5, -91, 77, 46, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 75;
    private static int cancelAll = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: Nexus4AndroidLTargetAspectRatioQuirk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VocationalVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: isLegacyDevice
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VocationalVerifyPhoneOtpActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1971175799
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int r6, int r7, int r8, int r9, int r10, java.lang.Object[] r11, int r12) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(int, int, int, int, int, java.lang.Object[], int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r0 = 53 - r8
            byte[] r1 = com.bpjstku.presentation.vocational.VocationalVerifyPhoneOtpActivity.$$a
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.vocational.VocationalVerifyPhoneOtpActivity.c(int, short, short, java.lang.Object[]):void");
    }

    public VocationalVerifyPhoneOtpActivity() {
        final VocationalVerifyPhoneOtpActivity vocationalVerifyPhoneOtpActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.VocationalVerifyPhoneOtpActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() {
                LifecycleOwner lifecycleOwner = vocationalVerifyPhoneOtpActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreviewDelayWhenVideoCaptureIsBoundQuirk.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.vocational.VocationalVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = vocationalVerifyPhoneOtpActivity;
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
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.vocational.VocationalVerifyPhoneOtpActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/vocational/VocationalVerifyPhoneOtpActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/registration/general/model/Verification;", "p1", "Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Lcom/bpjstku/domain/registration/general/model/Verification;Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, Verification p1, VocationalRegistration p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, VocationalVerifyPhoneOtpActivity.class, new Pair[]{TuplesKt.to("verification", p1), TuplesKt.to("vocation_registration_data", p2)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityRegistrationVerifyPhoneOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        VocationalVerifyPhoneOtpActivity$bindingInflater$1 vocationalVerifyPhoneOtpActivity$bindingInflater$1;
        int i = 2 % 2;
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            vocationalVerifyPhoneOtpActivity$bindingInflater$1 = VocationalVerifyPhoneOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = 74 / 0;
        } else {
            vocationalVerifyPhoneOtpActivity$bindingInflater$1 = VocationalVerifyPhoneOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i4 = asBinder + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return vocationalVerifyPhoneOtpActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        Verification verification;
        int i = 2 % 2;
        Intent intent = getIntent();
        Object obj = null;
        if (intent != null) {
            int i2 = asInterface + 19;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            verification = (Verification) intent.getParcelableExtra("verification");
        } else {
            verification = null;
        }
        this.b = verification;
        int i3 = asInterface + 57;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.d = new getCameraCharacteristic(((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, null);
        int i2 = asBinder + 115;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 41;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 19472), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2624, 13 - (ViewConfiguration.getTapTimeout() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (f660a % 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39421), Color.red(0) + 481, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19473 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 2624 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (f660a ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39423 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 482 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 29;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 39423), (ViewConfiguration.getTouchSlop() >> 8) + 481, 36 - TextUtils.indexOf((CharSequence) "", '0', 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39421 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 481 - (ViewConfiguration.getDoubleTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        VocationalVerifyPhoneOtpActivity vocationalVerifyPhoneOtpActivity = this;
        Intrinsics.checkNotNullParameter(vocationalVerifyPhoneOtpActivity, "");
        vocationalVerifyPhoneOtpActivity.getWindow().addFlags(8192);
        MaterialToolbar materialToolbar = ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.action_verify_with_phone_number);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        MaterialButton materialButton = ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnChangePhone;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setVisibility(4);
        TextView textView = ((ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvPhoneNumber;
        User user = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (user != null) {
            int i4 = asBinder + 83;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i5 = 71 / 0;
            } else {
                str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            int i6 = asInterface + 59;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str = null;
        }
        textView.setText(str);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding = (ActivityRegistrationVerifyPhoneOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        OtpView otpView = activityRegistrationVerifyPhoneOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: JpegHalCorruptImageQuirk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VocationalVerifyPhoneOtpActivity.b(activityRegistrationVerifyPhoneOtpBinding, (String) obj);
            }
        }));
        activityRegistrationVerifyPhoneOtpBinding.btnVerification.setOnClickListener(new View.OnClickListener() { // from class: LegacyCameraOutputConfigNullPointerQuirk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException {
                VocationalVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityRegistrationVerifyPhoneOtpBinding, this, view);
            }
        });
        TextView textView = activityRegistrationVerifyPhoneOtpBinding.tvResendCode;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textView, new Function0() { // from class: LegacyCameraSurfaceCleanupQuirk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VocationalVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityRegistrationVerifyPhoneOtpBinding, this);
            }
        });
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        VocationalVerifyPhoneOtpActivity vocationalVerifyPhoneOtpActivity = (VocationalVerifyPhoneOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 77;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        getCameraCharacteristic getcameracharacteristic = vocationalVerifyPhoneOtpActivity.d;
        if (getcameracharacteristic == null) {
            int i5 = i2 + 99;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 == 0) {
                throw null;
            }
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannel.observe(this, new Observer() { // from class: Preview3AThreadCrashQuirk
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                VocationalVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = asBinder + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.d;
        if (getcameracharacteristic == null) {
            int i2 = asInterface + 3;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i4 = asInterface + 113;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                int i5 = 26 / 0;
            } else {
                tuitionPaymentFragmentbindingInflater1.cancel();
            }
        }
        getcameracharacteristic.b = null;
        super.onStop();
        int i6 = asInterface + 101;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.d;
        if (getcameracharacteristic == null) {
            int i2 = asInterface + 63;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i4 = asBinder + 17;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                int i5 = 78 / 0;
            } else {
                tuitionPaymentFragmentbindingInflater1.cancel();
            }
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = asBinder + 123;
                asInterface = i2 % 128;
                if (i2 % 2 != 0) {
                    getOnBackPressedDispatcher().onBackPressed();
                    int i3 = 26 / 0;
                } else {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = asInterface + 57;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr2;
        int i = 0;
        VocationalVerifyPhoneOtpActivity vocationalVerifyPhoneOtpActivity = (VocationalVerifyPhoneOtpActivity) objArr[0];
        int i2 = 2 % 2;
        super.attachBaseContext((Context) objArr[1]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29944);
            int defaultSize = View.getDefaultSize(0, 0) + 1755;
            int windowTouchSlop = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte[] bArr = $$a;
            short s = bArr[28];
            byte b = bArr[5];
            Object[] objArr3 = new Object[1];
            c(s, b, (byte) (b | 14), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, defaultSize, windowTouchSlop, 986134021, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = asBinder + 91;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cBlue = (char) (Color.blue(0) + 29944);
                int iIndexOf = 1754 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                byte[] bArr2 = $$a;
                Object[] objArr4 = new Object[1];
                c((short) (bArr2[17] + 1), bArr2[5], bArr2[7], objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, iIndexOf, iIndexOf2, 1599039318, false, (String) objArr4[0], null);
            }
            Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
            int iMyTid = Process.myTid();
            int i5 = ~iMyTid;
            int i6 = (-144688828) + (((~((-175830653) | i5)) | (~((-36771774) | i5))) * (-867)) + (((~((-175830653) | iMyTid)) | 36705852 | (~((-36771774) | iMyTid))) * (-1734)) + (((~(iMyTid | (-65922))) | (~(i5 | (-36705853))) | (~((-139124801) | iMyTid))) * 867) + 1761648917;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr6 = new Object[1];
            e(new char[]{51071, 11425, 4297, 1035, 26735, 23632, 16778, 46504, 39386, 36166, 61716, 58699, 51866, 16048, 8918, 5635}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_6).substring(12, 13).length() + 60372, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new char[]{51068, 10552, 7138, 3488, 32325, 24593, 21207, 17555, 46357, 42981, 35260, 64094, 60474, 57039, 49295, 12599}, TextUtils.indexOf("", "", 0) + 61001, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, vocationalVerifyPhoneOtpActivity)).intValue();
            try {
                Object[] objArr8 = {-112763473};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 1726 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - Drawable.resolveOpacity(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 1761648917, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
                    int i9 = 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iGreen = 23 - Color.green(0);
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    c((short) (bArr3[17] + 1), bArr3[5], bArr3[7], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, i9, iGreen, 1599039318, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr10 = new Object[1];
                    e(new char[]{51060, 532, 19887, 38698, 53958, 7255, 26603, 41266, 60418, 14209, 29037, 48259, 34392, 49605, 2931, 22257, 37256, 56073, 9911, 24647, 43994, 62821}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 50507, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(new char[]{51056, 60278, 40810, 17224, 30554, 6971, 53035, 62254, 42760, 19443, 32751, 9156, 55240, 64443, 44962}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_blink_smile_and_your_eyes).substring(0, 25).codePointAt(3) + 11169, objArr11);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int mirror = 1803 - AndroidCharacter.getMirror('0');
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((short) 88, bArr4[5], bArr4[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, mirror, absoluteGravity, 1596667560, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char edgeSlop = (char) (29944 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                        int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                        byte[] bArr5 = $$a;
                        short s2 = bArr5[28];
                        byte b2 = bArr5[5];
                        Object[] objArr13 = new Object[1];
                        c(s2, b2, (byte) (b2 | 14), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, i10, i11, 986134021, false, (String) objArr13[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr != null) {
                while (i < strArr.length) {
                    int i12 = asInterface + 119;
                    asBinder = i12 % 128;
                    if (i12 % 2 == 0) {
                        arrayList.add(strArr[i]);
                        i += 54;
                    } else {
                        arrayList.add(strArr[i]);
                        i++;
                    }
                }
            }
            throw null;
        }
        int i13 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i14 = 1620541935 + (((~((-229704087) | iFreeMemory)) | 16777492 | (~((-17101661) | iFreeMemory))) * (-754));
        int i15 = ~((-16777493) | iFreeMemory);
        int i16 = ~iFreeMemory;
        int i17 = i13 + i14 + ((i15 | (~((-324169) | i16))) * (-754)) + ((i16 | (-229704087)) * 754);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        ((int[]) objArr14[3])[0] = i19 ^ (i19 << 5);
        int i20 = asBinder + 39;
        asInterface = i20 % 128;
        int i21 = i20 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char gidForName = (char) ((-1) - Process.getGidForName(""));
            int iAxisFromString = MotionEvent.axisFromString("") + 1032;
            int i22 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            byte[] bArr6 = $$a;
            Object[] objArr15 = new Object[1];
            c((short) 140, bArr6[5], bArr6[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(gidForName, iAxisFromString, i22, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(new char[]{51060, 532, 19887, 38698, 53958, 7255, 26603, 41266, 60418, 14209, 29037, 48259, 34392, 49605, 2931, 22257, 37256, 56073, 9911, 24647, 43994, 62821}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_gojek_app).substring(4, 5).length() + 50542, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(new char[]{51056, 60278, 40810, 17224, 30554, 6971, 53035, 62254, 42760, 19443, 32751, 9156, 55240, 64443, 44962}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step2).substring(35, 36).length() + 11278, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1031;
            int size = View.MeasureSpec.getSize(0) + 15;
            byte[] bArr7 = $$a;
            Object[] objArr18 = new Object[1];
            c((short) (bArr7[17] + 1), bArr7[5], bArr7[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cCombineMeasuredStates, offsetAfter, size, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i23 = asBinder + 21;
            asInterface = i23 % 128;
            int i24 = i23 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iRed = Color.red(0) + 1031;
                int windowTouchSlop2 = 15 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                short s3 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte b3 = $$a[7];
                Object[] objArr19 = new Object[1];
                c(s3, b3, (byte) (b3 | 52), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, iRed, windowTouchSlop2, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr20[3])[0];
            int i26 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int i27 = (int) Runtime.getRuntime().totalMemory();
            int i28 = ((((~(i27 | (-261439038))) * TypedValues.CycleType.TYPE_EASING) + 140563981) + (((~((~i27) | (-261439038))) | 270565762) * TypedValues.CycleType.TYPE_EASING)) - 527006530;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[2])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(new char[]{51071, 11425, 4297, 1035, 26735, 23632, 16778, 46504, 39386, 36166, 61716, 58699, 51866, 16048, 8918, 5635}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5).substring(8, 9).codePointAt(0) + 60341, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(new char[]{51068, 10552, 7138, 3488, 32325, 24593, 21207, 17555, 46357, 42981, 35260, 64094, 60474, 57039, 49295, 12599}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 60890, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, vocationalVerifyPhoneOtpActivity)).intValue();
            Object[] objArr23 = {-112763473};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (TextUtils.getTrimmedLength("") + 46038), 1134 - ExpandableListView.getPackedPositionType(0L), 17 - TextUtils.lastIndexOf("", '0', 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -527006530, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int iIndexOf3 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                int scrollDefaultDelay = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr8 = $$a;
                Object[] objArr25 = new Object[1];
                c((short) 140, bArr8[5], bArr8[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf, iIndexOf3, scrollDefaultDelay, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.indexOf("", "", 0)), 1116 - TextUtils.lastIndexOf("", '0', 0), KeyEvent.keyCodeFromString("") + 17), Boolean.TYPE});
            }
            objArr2 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int bitsPerPixel = 14 - ImageFormat.getBitsPerPixel(0);
                short s4 = (short) DerHeader.TAG_CLASS_PRIVATE;
                byte b4 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(s4, b4, (byte) (b4 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, doubleTapTimeout, bitsPerPixel, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr2);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{51060, 532, 19887, 38698, 53958, 7255, 26603, 41266, 60418, 14209, 29037, 48259, 34392, 49605, 2931, 22257, 37256, 56073, 9911, 24647, 43994, 62821}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_2).substring(5, 15).length() + 50533, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{51056, 60278, 40810, 17224, 30554, 6971, 53035, 62254, 42760, 19443, 32751, 9156, 55240, 64443, 44962}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step4).substring(16, 17).length() + 11278, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                    int iIndexOf4 = 15 - TextUtils.indexOf("", "", 0);
                    byte[] bArr9 = $$a;
                    Object[] objArr29 = new Object[1];
                    c((short) (bArr9[17] + 1), bArr9[5], bArr9[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(maxKeyCode, modifierMetaStateMask, iIndexOf4, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
                    byte[] bArr10 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((short) 140, bArr10[5], bArr10[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(trimmedLength, scrollBarFadeDuration, iLastIndexOf, 1357589585, false, (String) objArr30[0], null);
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
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i36 = ~iUptimeMillis;
            int i37 = i33 + (-1983075958) + (((~((-429799934) | i36)) | (-185519764)) * 519) + (((~(i36 | (-151914642))) | (~((-33605123) | iUptimeMillis))) * (-519)) + (((~(iUptimeMillis | (-185519764))) | 429799933) * 519);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr31[2])[0] = i39 ^ (i39 << 5);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr2[0];
        if (strArr4 != null) {
            int i40 = asBinder + 91;
            asInterface = i40 % 128;
            int i41 = i40 % 2;
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i32 / (((i32 - 1) * i32) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i42 = ((int[]) objArr2[2])[0];
        int i43 = ((int[]) objArr2[3])[0];
        int i44 = ((int[]) objArr2[1])[0];
        String[] strArr5 = (String[]) objArr2[0];
        int iMyTid2 = Process.myTid();
        int i45 = ~iMyTid2;
        int i46 = i42 + (-98567639) + ((138559745 | i45) * (-192)) + (((~((-87857727) | i45)) | 17862698) * (-384)) + (((~(iMyTid2 | 226417471)) | (~(i45 | (-69995029))) | (~((-17862699) | iMyTid2))) * DerHeader.TAG_CLASS_PRIVATE);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr32[2])[0] = i48 ^ (i48 << 5);
        int i49 = asBinder + 53;
        asInterface = i49 % 128;
        int i50 = i49 % 2;
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        int i6 = ~i5;
        int i7 = (~((-370940660) | i6)) | 268962353;
        int i8 = ~(i5 | (-1098949897));
        if (i4 != 1045127486 + ((i7 | i8) * (-502)) + ((i8 | (~(i6 | (-101978307)))) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            int i9 = 1086856706 % 2;
            throw new ArithmeticException();
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        if (i10 != (-1082856870) + (((~(startElapsedRealtime | 395026605)) | 1750096720) * 305) + (((~((~startElapsedRealtime) | 395026605)) | 2110937936) * 305)) {
            int i11 = (-494731582) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i12 = asBinder + 99;
        asInterface = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i4 = ~(Process.myTid() | 493375252);
            if (i3 != ((((-1401464576) | i4) * (-658)) - 1643968728) + ((i4 | (-1609101312)) * 658)) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i6 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
            if (i5 != 2071714973 + (((~(1222697651 | i6)) | (-392710109)) * (-983)) + (((~(i6 | (-392710109))) | 6308496) * 983)) {
                throw null;
            }
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i8 = ~(((int) SystemClock.elapsedRealtime()) | 1805724195);
        if (i7 != (((1101078530 | i8) * (-196)) - 1324481120) + ((i8 | 704645665) * 196)) {
            throw null;
        }
        super.onCreate(bundle);
        int i9 = asBinder + 107;
        asInterface = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault1(VocationalVerifyPhoneOtpActivity vocationalVerifyPhoneOtpActivity) {
        User userAsBinder;
        int i = 2 % 2;
        int i2 = asInterface + 37;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) vocationalVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            int i3 = 85 / 0;
        } else {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) vocationalVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        int i4 = asInterface + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return userAsBinder;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding = (ActivityRegistrationVerifyPhoneOtpBinding) objArr[0];
        VocationalVerifyPhoneOtpActivity vocationalVerifyPhoneOtpActivity = (VocationalVerifyPhoneOtpActivity) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            String string = StringsKt.trim((CharSequence) String.valueOf(activityRegistrationVerifyPhoneOtpBinding.otpVerify.getText())).toString();
            Verification verification = vocationalVerifyPhoneOtpActivity.b;
            Object obj = null;
            String str = verification != null ? verification.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if (str == null) {
                int i4 = asInterface + 55;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 32 / 0;
                }
                str = "";
            }
            if (!StringsKt.equals(string, str, false)) {
                String string2 = vocationalVerifyPhoneOtpActivity.getString(R.string.error_otp_code_invalid);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
            } else {
                VocationalRegistrationResultActivity.Companion companion = VocationalRegistrationResultActivity.INSTANCE;
                VocationalVerifyPhoneOtpActivity vocationalVerifyPhoneOtpActivity2 = vocationalVerifyPhoneOtpActivity;
                VocationalRegistration vocationalRegistration = (VocationalRegistration) vocationalVerifyPhoneOtpActivity.TuitionPaymentFragmentbindingInflater1.getValue();
                if (vocationalRegistration == null) {
                    vocationalRegistration = new VocationalRegistration(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
                }
                VocationalRegistrationResultActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(vocationalVerifyPhoneOtpActivity2, vocationalRegistration);
            }
            ViewPortBuilder.b();
            int i6 = asInterface + 93;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ VocationalRegistration b(VocationalVerifyPhoneOtpActivity vocationalVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return (VocationalRegistration) vocationalVerifyPhoneOtpActivity.getIntent().getParcelableExtra("vocation_registration_data");
        }
        throw null;
    }

    public static /* synthetic */ Unit b(ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 6) {
            int i4 = asInterface + 15;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            MaterialButton materialButton = activityRegistrationVerifyPhoneOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = activityRegistrationVerifyPhoneOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = asInterface + 23;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(VocationalVerifyPhoneOtpActivity vocationalVerifyPhoneOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            vocationalVerifyPhoneOtpActivity.MediaBrowserCompat();
            return;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                vocationalVerifyPhoneOtpActivity.IconCompatParcelizer();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            }
            int i2 = asInterface + 29;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = asBinder + 65;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        vocationalVerifyPhoneOtpActivity.IconCompatParcelizer();
        getCameraCharacteristic getcameracharacteristic = vocationalVerifyPhoneOtpActivity.d;
        if (getcameracharacteristic == null) {
            int i6 = asInterface + 5;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = 25 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        vocationalVerifyPhoneOtpActivity.b = (Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding, VocationalVerifyPhoneOtpActivity vocationalVerifyPhoneOtpActivity) {
        int i = 2 % 2;
        activityRegistrationVerifyPhoneOtpBinding.otpVerify.getEditableText().clear();
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) vocationalVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        User user = (User) vocationalVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        String str = null;
        String str2 = user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str2 == null) {
            int i2 = asInterface + 21;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            str2 = "";
        }
        User user2 = (User) vocationalVerifyPhoneOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (user2 != null) {
            int i4 = asInterface + 33;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            str = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        previewDelayWhenVideoCaptureIsBoundQuirk.b(new VocationPhoneVerificationRequest(str2, str != null ? str : ""));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityRegistrationVerifyPhoneOtpBinding activityRegistrationVerifyPhoneOtpBinding, VocationalVerifyPhoneOtpActivity vocationalVerifyPhoneOtpActivity, View view) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -679577411, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{activityRegistrationVerifyPhoneOtpBinding, vocationalVerifyPhoneOtpActivity, view}, 679577413);
    }

    static {
        onTransact = 0;
        g();
        INSTANCE = new Companion(null);
        int i = cancelAll + 21;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_registration_verify_phone_otp;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1674106729;
        int iB = captureSingleRequest.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(length, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, captureSingleRequest.b(), -430312552, iB, new Object[]{this}, 430312553);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_bni_details).substring(34, 36).length() - 59869090;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), length, 575217293 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cancel_transaction).substring(1, 7).length(), 1036643961, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, -1036643961);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = asBinder + 101;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iB = captureSingleRequest.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iB, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 899237061 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8), -394475532, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this, context}, 394475535);
    }

    static void g() {
        f660a = 4172314472084303374L;
    }
}
