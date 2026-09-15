package com.bpjstku.presentation.membership.forgotpassword.reset;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.R;
import com.bpjstku.data.user.model.request.ResetPasswordRequest;
import com.bpjstku.databinding.ActivityResetPasswordBinding;
import com.bpjstku.presentation.membership.forgotpassword.reset.ResetPasswordActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.util.viewbinding.BindingPassiveFormActivity;
import com.google.android.gms.common.api.internal.zaaq;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.utils.exts.ViewExtKt$onTextChange$2;
import defpackage.ActivityResultRegistryExternalSyntheticLambda0;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraUseCaseAdapter;
import defpackage.CaptureSession1;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createStaticLayoutForMeasuring;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.r8lambda_rcqWHl69wN3lvwkykRzEOONbC0;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setInactive;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.supportsAutoSizeText;
import defpackage.suspendUseCases;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004R\u0015\u0010\u0006\u001a\u00020\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\b\u0010\u0011R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/membership/forgotpassword/reset/ResetPasswordActivity;", "Lcom/bpjstku/util/viewbinding/BindingPassiveFormActivity;", "Lcom/bpjstku/databinding/ActivityResetPasswordBinding;", "<init>", "()V", "", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "LcreateStaticLayoutForMeasuring;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResetPasswordActivity extends BindingPassiveFormActivity<ActivityResetPasswordBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int asBinder;
    private static long d;
    private String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {14, 70, 6, -35};
    private static final int $$f = 137;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {77, -106, 83, 4, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 104;
    private static int asInterface = 0;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f521a = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~((~i6) | i7 | i3);
        int i9 = (~i3) | i7;
        int i10 = i8 | (~(i9 | i6)) | (~(i4 | i6 | i3));
        int i11 = ~i9;
        int i12 = (~(i3 | i4)) | i6 | i11;
        int i13 = (~(i7 | i6)) | i11;
        int i14 = i4 + i6 + i2 + (933655473 * i) + ((-1037598838) * i5);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i4) - 925892608) + (470833381 * i6) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i2) + ((-1691877376) * i) + ((-393216000) * i5) + ((-1633878016) * i15);
        int i17 = ((i4 * (-727610197)) - 1081761860) + (i6 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i2 * (-727609241)) + (i * 1532828727) + (i5 * (-747900794)) + (i15 * 556466176);
        int i18 = i16 + (i17 * i17 * (-1911357440));
        if (i18 != 1) {
            return i18 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r0 = 53 - r7
            byte[] r1 = com.bpjstku.presentation.membership.forgotpassword.reset.ResetPasswordActivity.$$a
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r6 = r7
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r5]
        L27:
            int r5 = r5 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotpassword.reset.ResetPasswordActivity.c(short, int, int, java.lang.Object[]):void");
    }

    public ResetPasswordActivity() {
        final ResetPasswordActivity resetPasswordActivity = this;
        this.b = LazyKt.lazy(new Function0<createStaticLayoutForMeasuring>() { // from class: com.bpjstku.presentation.membership.forgotpassword.reset.ResetPasswordActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, createStaticLayoutForMeasuring] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ createStaticLayoutForMeasuring invoke() {
                LifecycleOwner lifecycleOwner = resetPasswordActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(createStaticLayoutForMeasuring.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.forgotpassword.reset.ResetPasswordActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/membership/forgotpassword/reset/ResetPasswordActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, String p1, String p2, String p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ResetPasswordActivity.class, new Pair[]{TuplesKt.to("email", p1), TuplesKt.to("otp", p2), TuplesKt.to("check_sum", p3)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity
    public final Function1<LayoutInflater, ActivityResetPasswordBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f521a + 5;
        g = i2 % 128;
        int i3 = i2 % 2;
        ResetPasswordActivity$bindingInflater$1 resetPasswordActivity$bindingInflater$1 = ResetPasswordActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = g + 39;
        f521a = i4 % 128;
        if (i4 % 2 != 0) {
            return resetPasswordActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        String stringExtra = getIntent().getStringExtra("email");
        if (stringExtra == null) {
            int i2 = f521a + 15;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            stringExtra = "";
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("otp");
        if (stringExtra2 == null) {
            int i3 = f521a + 51;
            g = i3 % 128;
            int i4 = i3 % 2;
            stringExtra2 = "";
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("check_sum");
        this.TuitionPaymentFragmentbindingInflater1 = stringExtra3 != null ? stringExtra3 : "";
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = g + 55;
        f521a = i2 % 128;
        int i3 = i2 % 2;
        ResetPasswordActivity resetPasswordActivity = this;
        Intrinsics.checkNotNullParameter(resetPasswordActivity, "");
        resetPasswordActivity.getWindow().addFlags(8192);
        TextInputEditText textInputEditText = onTransact().edtNewPassword;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        ResetPasswordActivity resetPasswordActivity2 = this;
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputEditText, resetPasswordActivity2);
        TextInputEditText textInputEditText2 = onTransact().edtConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputEditText2, resetPasswordActivity2);
        int i4 = f521a + 101;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(d ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 5;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 3;
        }
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 13;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(d)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - TextUtils.lastIndexOf("", '0', 0, 0)), 1356 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myPid() >> 22) + 38, 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - Gravity.getAbsoluteGravity(0, 0)), Gravity.getAbsoluteGravity(0, 0) + 468, 13 - (ViewConfiguration.getJumpTapTimeout() >> 16), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i8 = $11 + 61;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityResetPasswordBinding activityResetPasswordBindingOnTransact = onTransact();
        activityResetPasswordBindingOnTransact.btnResetPassword.setOnClickListener(new View.OnClickListener() { // from class: AppCompatTextViewAutoSizeHelperApi23Impl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResetPasswordActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, activityResetPasswordBindingOnTransact, view);
            }
        });
        TextInputLayout textInputLayout = activityResetPasswordBindingOnTransact.tilNewPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        Function1 function1 = new Function1() { // from class: createLayout
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {activityResetPasswordBindingOnTransact, (String) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return (Unit) ResetPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), objArr, zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 631637479, zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -631637479);
            }
        };
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new ViewExtKt$onTextChange$2(function1)));
        }
        TextInputLayout textInputLayout2 = activityResetPasswordBindingOnTransact.tilConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        Function1 function2 = new Function1() { // from class: validateAndSetAutoSizeTextTypeUniformConfiguration
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResetPasswordActivity.b(activityResetPasswordBindingOnTransact, (String) obj);
            }
        };
        EditText editText2 = textInputLayout2.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new ViewExtKt$onTextChange$2(function2)));
            int i2 = g + 83;
            f521a = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 3;
            }
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final ResetPasswordActivity resetPasswordActivity = (ResetPasswordActivity) objArr[0];
        int i = 2 % 2;
        TextInputLayout textInputLayout = resetPasswordActivity.onTransact().tilNewPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = resetPasswordActivity.getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        resetPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Minimal harus 8 karakter", 8, null), new accessconfigureInstanceInternal("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[\\\\\\/%§\"&“|`´}{°><:.;#')(@_$\"!?*=^-]).{8,}$", "Harus terdiri dari 1 huruf besar, huruf kecil, angka, dan karakter khusus")})));
        TextInputLayout textInputLayout2 = resetPasswordActivity.onTransact().tilConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = resetPasswordActivity.getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = resetPasswordActivity.getString(R.string.error_unmatch_password);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        resetPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string2), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: AppCompatTextViewAutoSizeHelperImpl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ResetPasswordActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            }
        }, string3)})));
        ((createStaticLayoutForMeasuring) resetPasswordActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(resetPasswordActivity, new supportsAutoSizeText(resetPasswordActivity));
        int i2 = g + 105;
        f521a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((createStaticLayoutForMeasuring) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(this, new supportsAutoSizeText(this));
        int i2 = g + 73;
        f521a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int i2 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int defaultSize = 23 - View.getDefaultSize(0, 0);
            short s = $$a[7];
            byte b = (byte) s;
            Object[] objArr2 = new Object[1];
            c(s, b, (byte) (b | 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, i2, defaultSize, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = f521a + 73;
            g = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                int iMyTid = 23 - (Process.myTid() >> 22);
                byte b2 = $$a[7];
                Object[] objArr3 = new Object[1];
                c((short) 37, b2, b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, scrollDefaultDelay, iMyTid, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i6 = (((-118798613) + (((~((~i5) | 355450724)) | 550518938) * 446)) + (((~(i5 | 905969662)) | 17534212) * 446)) - 1931519301;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{35019, 7695, 61629, 27024, 34977, 51761, 22645, 5356, 55705, 15288, 2790, 42855, 10836, 26998, 47960, 18940, 31948, 54952, 28138, 6252}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_bni_details).substring(34, 36).codePointAt(0) - 109, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{49673, 44131, 19158, 19247, 49760, 30808, 57869, 13916, 37633, 35281, 45208, 34255, 24761, 56149, 275, 27474, 13886, 25823, 55168, 15067}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 114, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1481547926};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.getTrimmedLength("")), 1726 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionType(0L) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1645137519);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char trimmedLength = (char) (29944 - TextUtils.getTrimmedLength(""));
                    int i9 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 23;
                    byte b3 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c((short) 37, b3, b3, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, i9, tapTimeout, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{29167, 55233, 13331, 44222, 29070, 1008, 40137, 53713, 8444, 62067, 52813, 25097, 54136, 41189, 32651, 36088, 34274, 8033, 43349, 56650, 13426, 52685, 56017, 28636, 59104, 48225}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{22310, 30371, 55994, 10021, 22339, 41616, 29285, 23112, 1577, 21277, 8420, 59886, 62907, 405, 37216, 1860, 41787, 48669, 18413}, 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                        int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i10 = 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte b4 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        c((short) 89, b4, b4, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, fadingEdgeLength, i10, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                        int i11 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int maximumDrawingCacheSize = 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        short s2 = $$a[7];
                        byte b5 = (byte) s2;
                        Object[] objArr12 = new Object[1];
                        c(s2, b5, (byte) (b5 | 15), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, i11, maximumDrawingCacheSize, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i12 = f521a + 117;
                    g = i12 % 128;
                    int i13 = i12 % 2;
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i14 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int i15 = ~((int) Process.getElapsedCpuTime());
        int i16 = i14 + (((153751189 + (((~((-55837715) | i15)) | 268440140) * (-828))) + ((i15 | (-55837715)) * (-828))) - 1011013064);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr13[3])[0] = i18 ^ (i18 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0');
            int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
            byte b6 = $$a[7];
            Object[] objArr14 = new Object[1];
            c((short) 141, b6, b6, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(fadingEdgeLength2, iIndexOf, absoluteGravity, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{29167, 55233, 13331, 44222, 29070, 1008, 40137, 53713, 8444, 62067, 52813, 25097, 54136, 41189, 32651, 36088, 34274, 8033, 43349, 56650, 13426, 52685, 56017, 28636, 59104, 48225}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{22310, 30371, 55994, 10021, 22339, 41616, 29285, 23112, 1577, 21277, 8420, 59886, 62907, 405, 37216, 1860, 41787, 48669, 18413}, 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iResolveSize = 15 - View.resolveSize(0, 0);
            byte b7 = $$a[7];
            Object[] objArr17 = new Object[1];
            c((short) 37, b7, b7, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, minimumFlingVelocity, iResolveSize, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int gidForName = 1030 - Process.getGidForName("");
                int iRed = Color.red(0) + 15;
                Object[] objArr18 = new Object[1];
                c((short) 193, $$a[28], (byte) ($$b >>> 1), objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cKeyCodeFromString, gidForName, iRed, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i19 = ((int[]) objArr19[3])[0];
            int i20 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i21 = ~((int) Runtime.getRuntime().totalMemory());
            int i22 = ((((~((-480458868) | i21)) | 278933618) * (-241)) - 1664178057) + (((~(i21 | (-201525250))) | (-515112316)) * 241) + 1953902177;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[2])[0] = i24 ^ (i24 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{35019, 7695, 61629, 27024, 34977, 51761, 22645, 5356, 55705, 15288, 2790, 42855, 10836, 26998, 47960, 18940, 31948, 54952, 28138, 6252}, -Process.getGidForName(""), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{49673, 44131, 19158, 19247, 49760, 30808, 57869, 13916, 37633, 35281, 45208, 34255, 24761, 56149, 275, 27474, 13886, 25823, 55168, 15067}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step1).substring(2, 4).length() - 1, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {1481547926};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - Drawable.resolveOpacity(0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1135, MotionEvent.axisFromString("") + 19, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 1953902177, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int gidForName2 = Process.getGidForName("") + 1032;
                int iIndexOf2 = 15 - TextUtils.indexOf("", "");
                byte b8 = $$a[7];
                Object[] objArr24 = new Object[1];
                c((short) 141, b8, b8, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf, gidForName2, iIndexOf2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1117 - TextUtils.indexOf("", "", 0), (Process.myPid() >> 22) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int i25 = 1031 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 15;
                Object[] objArr25 = new Object[1];
                c((short) 193, $$a[28], (byte) ($$b >>> 1), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, i25, maxKeyCode, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{29167, 55233, 13331, 44222, 29070, 1008, 40137, 53713, 8444, 62067, 52813, 25097, 54136, 41189, 32651, 36088, 34274, 8033, 43349, 56650, 13426, 52685, 56017, 28636, 59104, 48225}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{22310, 30371, 55994, 10021, 22339, 41616, 29285, 23112, 1577, 21277, 8420, 59886, 62907, 405, 37216, 1860, 41787, 48669, 18413}, ((Process.getThreadPriority(0) + 20) >> 6) + 1, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int packedPositionChild2 = 14 - ExpandableListView.getPackedPositionChild(0L);
                    byte b9 = $$a[7];
                    Object[] objArr28 = new Object[1];
                    c((short) 37, b9, b9, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(deadChar, keyRepeatTimeout, packedPositionChild2, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionChild3 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int i26 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b10 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 141, b10, b10, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionChild3, iLastIndexOf, i26, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i27 = ((int[]) objArr[1])[0];
        int i28 = ((int[]) objArr[3])[0];
        if (i28 == i27) {
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[3])[0];
            int i31 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i32 = ~iElapsedRealtime;
            int i33 = i29 + 433629483 + (((~(554230517 | i32)) | (~((-798510688) | iElapsedRealtime))) * (-370)) + (((~(iElapsedRealtime | 554230517)) | (~(i32 | (-798510688))) | 41120) * (-370)) + 15214400;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr30[2])[0] = i35 ^ (i35 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i36 = f521a + 15;
            g = i36 % 128;
            int i37 = i36 % 2;
            int i38 = 0;
            while (i38 < strArr4.length) {
                arrayList2.add(strArr4[i38]);
                i38++;
                int i39 = f521a + 33;
                g = i39 % 128;
                int i40 = i39 % 2;
            }
        }
        Toast.makeText((Context) null, i28 / (((i28 - 1) * i28) % 2), 0).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i41 = ((int[]) objArr[2])[0];
        int i42 = ((int[]) objArr[3])[0];
        int i43 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_instruction_text).substring(0, 32).codePointAt(4) + 84054871;
        int i44 = ~iCodePointAt;
        int i45 = i41 + (-98567639) + ((274745473 | i44) * (-192)) + (((~(283663745 | i44)) | 253198442) * (-384)) + (((~(iCodePointAt | (-8918273))) | (~(i44 | 536862187)) | (~((-253198443) | iCodePointAt))) * DerHeader.TAG_CLASS_PRIVATE);
        int i46 = (i45 << 13) ^ i45;
        int i47 = i46 ^ (i46 >>> 17);
        ((int[]) objArr31[2])[0] = i47 ^ (i47 << 5);
        int i48 = f521a + 111;
        g = i48 % 128;
        if (i48 % 2 != 0) {
            int i49 = 52 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x007f  */
    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = g + 21;
        f521a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int i4 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            if (i3 != (-864906616) + (((~(i4 | (-847815426))) | 17827882) * (-828)) + ((i4 | (-847815426)) * (-828)) + 1911502652) {
                int[] iArr = new int[1450024788];
                iArr[1450024787] = 1;
                int i5 = 709088316 % 2;
                Toast.makeText((Context) null, iArr[-1], 1).show();
            }
        } else {
            int i6 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
            int i7 = ~((~((int) SystemClock.elapsedRealtime())) | (-1402274071));
            if (i6 != (((-1939695424) | i7) * (-970)) + 1548424526 + ((i7 | 537421353) * 970)) {
                int[] iArr2 = new int[1450024788];
                iArr2[1450024787] = 1;
                int i8 = 709088316 % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
        }
        int i9 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i10 = ~iIdentityHashCode;
        if (i9 != 3780700 + ((~(471181798 | i10)) * (-560)) + ((~(iIdentityHashCode | (-1638011409))) * (-560)) + (((~(2107874166 | i10)) | 1319040) * 560)) {
            throw null;
        }
        super.onResume();
        int i11 = f521a + 51;
        g = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = f521a + 79;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 1676334528;
        int i5 = ~iCodePointAt;
        if (i4 != (-670233240) + ((~(923206078 | i5)) * (-560)) + ((~(iCodePointAt | 2139069887)) * (-560)) + (((~((-1753193622) | i5)) | 537329812) * 560)) {
            throw null;
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i6 != 188331181 + (((~((~iUptimeMillis) | (-1001253126))) | 1577802839) * (-235)) + (((~((-1001253126) | iUptimeMillis)) | 1577802839) * (-470)) + (((~(iUptimeMillis | (-564437249))) | 1140986962) * 235)) {
            throw new RuntimeException("118524121");
        }
        super.onStart();
        int i7 = g + 115;
        f521a = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b5, code lost:
    
        if (r1 != (((956328160 + ((r3 | (~(1970257723 | r4))) * (-406))) + ((~((-1361059857) | r4)) * (-406))) + (((~(r2 | (-609197868))) | (~(1969858097 | r4))) * 406))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b7, code lost:
    
        super.onCreate(r11);
        r11 = com.bpjstku.presentation.membership.forgotpassword.reset.ResetPasswordActivity.g + 3;
        com.bpjstku.presentation.membership.forgotpassword.reset.ResetPasswordActivity.f521a = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cb, code lost:
    
        throw new java.lang.RuntimeException("817667163");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cc, code lost:
    
        r11 = (-2133436026) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d5, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0047, code lost:
    
        if (r1 == ((r7 + ((r5 | r4) * (-880))) + (r4 * 880))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        if (r1 == ((1754782485 + (((~((-754824965) | r5)) | (~(r4 | (-1584812508)))) * 333)) + (((~(r4 | (-754824965))) | (~(r5 | (-1584812508)))) * 333))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = new java.util.Random().nextInt(366412508);
        r3 = ~((-1969858098) | r2);
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotpassword.reset.ResetPasswordActivity.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ActivityResetPasswordBinding activityResetPasswordBinding = (ActivityResetPasswordBinding) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = f521a + 39;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        activityResetPasswordBinding.tilNewPassword.setError(null);
        Unit unit = Unit.INSTANCE;
        int i4 = f521a + 19;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ResetPasswordActivity resetPasswordActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i2 = f521a + 77;
            g = i2 % 128;
            int i3 = i2 % 2;
            resetPasswordActivity.MediaBrowserCompat();
            str = "loading_reset_password_by_email";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = f521a + 45;
            g = i4 % 128;
            int i5 = i4 % 2;
            resetPasswordActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((ActivityResultRegistryExternalSyntheticLambda0) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, 0).show();
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(resetPasswordActivity, null, false, 6);
            resetPasswordActivity.d_();
            str = "success_reset_password_by_email";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            resetPasswordActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(resetPasswordActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            str = "failure_reset_password_by_email";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_reset_password_by_email_result", str));
        Intrinsics.checkNotNullParameter(resetPasswordActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit b(ActivityResetPasswordBinding activityResetPasswordBinding, String str) {
        int i = 2 % 2;
        int i2 = f521a + 31;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        activityResetPasswordBinding.tilConfirmedPassword.setError(null);
        Unit unit = Unit.INSTANCE;
        int i4 = g + 59;
        f521a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ResetPasswordActivity resetPasswordActivity, ActivityResetPasswordBinding activityResetPasswordBinding, View view) {
        String str;
        Editable text;
        String str2;
        String str3;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (resetPasswordActivity.INotificationSideChannel()) {
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_reset_password_by_email", "reset_password_by_email"));
                Intrinsics.checkNotNullParameter(resetPasswordActivity, "");
                Intrinsics.checkNotNullParameter("reset_password_by_email", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("reset_password_by_email", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("reset_password_by_email", mapMutableMapOf);
                final createStaticLayoutForMeasuring createstaticlayoutformeasuring = (createStaticLayoutForMeasuring) resetPasswordActivity.b.getValue();
                String str4 = resetPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str4 == null) {
                    int i2 = f521a + 119;
                    g = i2 % 128;
                    if (i2 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i3 = 26 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    str = null;
                } else {
                    str = str4;
                }
                EditText editText = activityResetPasswordBinding.tilNewPassword.getEditText();
                if (editText != null) {
                    text = editText.getText();
                    int i4 = g + 95;
                    f521a = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    text = null;
                }
                String strValueOf = String.valueOf(text);
                EditText editText2 = activityResetPasswordBinding.tilConfirmedPassword.getEditText();
                String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
                String str5 = resetPasswordActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str5 == null) {
                    int i6 = g + 103;
                    f521a = i6 % 128;
                    int i7 = i6 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str2 = null;
                } else {
                    str2 = str5;
                }
                String str6 = resetPasswordActivity.TuitionPaymentFragmentbindingInflater1;
                if (str6 == null) {
                    int i8 = f521a + 111;
                    g = i8 % 128;
                    int i9 = i8 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str3 = null;
                } else {
                    str3 = str6;
                }
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                Intrinsics.checkNotNullParameter(strValueOf2, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                MutableLiveData<VirtualCameraAdapter1<ActivityResultRegistryExternalSyntheticLambda0>> mutableLiveData = createstaticlayoutformeasuring.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(createstaticlayoutformeasuring.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(new ResetPasswordRequest(str, strValueOf, strValueOf2, str2, str3))));
                final Function1 function1 = new Function1() { // from class: computeAndSetTextDirection
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return createStaticLayoutForMeasuring.TuitionPaymentFragmentspecialinlinedviewModeldefault2(createstaticlayoutformeasuring, (ActivityResultRegistryExternalSyntheticLambda0) obj);
                    }
                };
                logToString logtostring = new logToString() { // from class: isHorizontallyScrollable
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function1.invoke(obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: AppCompatTextViewAutoSizeHelperImpl23
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return createStaticLayoutForMeasuring.TuitionPaymentFragmentbindingInflater1(createstaticlayoutformeasuring, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ButtonBarLayout
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                createstaticlayoutformeasuring.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(ResetPasswordActivity resetPasswordActivity) {
        Editable text;
        int i = 2 % 2;
        int i2 = g + 9;
        f521a = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = resetPasswordActivity.onTransact().tilNewPassword.getEditText();
        if (editText != null) {
            int i4 = f521a + 105;
            g = i4 % 128;
            int i5 = i4 % 2;
            text = editText.getText();
        } else {
            text = null;
        }
        String strValueOf = String.valueOf(text);
        EditText editText2 = resetPasswordActivity.onTransact().tilConfirmedPassword.getEditText();
        return Intrinsics.areEqual(String.valueOf(editText2 != null ? editText2.getText() : null), strValueOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityResetPasswordBinding activityResetPasswordBinding, String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{activityResetPasswordBinding, str}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 631637479, zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -631637479);
    }

    static {
        asBinder = 1;
        d();
        INSTANCE = new Companion(null);
        int i = asInterface + 99;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f521a + 25;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        f521a = i5 % 128;
        if (i5 % 2 != 0) {
            return R.layout.activity_reset_password;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(StreetViewPanoramaOrientation.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1005216407, zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1005216405);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = f521a + 31;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int iCodePointAt = (-1089233256) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_3).substring(2, 3).codePointAt(0);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1047327375, new Object[]{this}, zaaq.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iCodePointAt, -1877777377, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_continue_next_step).substring(2, 3).length() + 953857879, 1877777378);
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f521a + 101;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = g + 63;
        f521a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void d() {
        d = -7283011151052390855L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 7;
        f521a = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static String $$i(byte b, byte b2, int i) {
        int i2 = b2 * 4;
        int i3 = 107 - (i * 4);
        byte[] bArr = $$c;
        int i4 = 4 - (b * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 += i5;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i4];
            i4++;
        }
    }
}
