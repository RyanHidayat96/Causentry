package com.bpjstku.presentation.asik.active.verifyotp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityAsikVerifyOtpBinding;
import com.bpjstku.domain.user.model.Otp;
import com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpActivity;
import com.bpjstku.presentation.membership.forgotpassword.reset.ResetPasswordActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.libraries.places.internal.zzbla;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraManagerCompatAvailabilityCallbackExecutorWrapper;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.getCameraCharacteristic;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.suspendUseCases;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0013\u0010\u0004R\u0015\u0010\u0017\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u001d8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\t\u0010\u001eR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010!R\u0014\u0010$\u001a\u00020\"8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010#"}, d2 = {"Lcom/bpjstku/presentation/asik/active/verifyotp/AsikVerifyOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityAsikVerifyOtpBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onResume", "onStop", "onDestroy", "LgetStringOrNull;", "g", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetCameraCharacteristic;", "LgetCameraCharacteristic;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/user/model/Otp;", "Lcom/bpjstku/domain/user/model/Otp;", "", "Ljava/lang/String;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikVerifyOtpActivity extends BindingBaseActivity<ActivityAsikVerifyOtpBinding> {
    private static char asBinder;
    private static int asInterface;
    private static long d;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private Otp TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private getCameraCharacteristic TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {104, 27, -72, 120};
    private static final int $$f = 114;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {30, 17, -35, 104, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 141;
    private static int cancel = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f466a = 0;
    private static int cancelAll = 1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: applyFrozenState
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AsikVerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: AppCompatDelegateImplPanelFeatureState
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AsikVerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = ~(i5 | i);
        int i10 = i7 | (~i5);
        int i11 = i9 | (~(i10 | i6));
        int i12 = (~i6) | i10;
        int i13 = i5 + i + i2 + (1134938392 * i3) + ((-1730424158) * i4);
        int i14 = i13 * i13;
        int i15 = (1345404558 * i5) + 1061748736 + ((-382549644) * i) + (1727954202 * i8) + ((-1283506547) * i11) + (1283506547 * i12) + ((-1666056192) * i2) + (1924136960 * i3) + (748945408 * i4) + (912850944 * i14);
        int i16 = (i5 * 1914917686) + 639827133 + (i * 1914918628) + (i8 * (-942)) + (i11 * (-471)) + (i12 * 471) + (i2 * 1914918157) + (i3 * (-1451741640)) + (i4 * (-1338016710)) + (i14 * (-1605042176));
        int i17 = i15 + (i16 * i16 * (-230752256));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 != 2) {
            return i17 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
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
    private static void c(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = r8 + 1
            byte[] r0 = com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpActivity.$$a
            int r9 = 145 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L29
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-11)
            int r9 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpActivity.c(short, int, short, java.lang.Object[]):void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityAsikVerifyOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f466a + 59;
        cancelAll = i2 % 128;
        if (i2 % 2 == 0) {
            AsikVerifyOtpActivity$bindingInflater$1 asikVerifyOtpActivity$bindingInflater$1 = AsikVerifyOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        AsikVerifyOtpActivity$bindingInflater$1 asikVerifyOtpActivity$bindingInflater$2 = AsikVerifyOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = f466a + 55;
        cancelAll = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 47 / 0;
        }
        return asikVerifyOtpActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentbindingInflater1 = new getCameraCharacteristic(((ActivityAsikVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, null);
        int i2 = cancelAll + 7;
        f466a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        Otp otp = (Otp) getIntent().getParcelableExtra("otp");
        String str = "";
        if (otp == null) {
            otp = new Otp("");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = otp;
        String stringExtra = getIntent().getStringExtra("email");
        if (stringExtra == null) {
            int i2 = f466a + 13;
            int i3 = i2 % 128;
            cancelAll = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 33;
            f466a = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = stringExtra;
        }
        this.b = str;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        AsikVerifyOtpActivity asikVerifyOtpActivity = (AsikVerifyOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = f466a + 115;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        AsikVerifyOtpActivity asikVerifyOtpActivity2 = asikVerifyOtpActivity;
        Intrinsics.checkNotNullParameter(asikVerifyOtpActivity2, "");
        asikVerifyOtpActivity2.getWindow().addFlags(8192);
        asikVerifyOtpActivity.TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityAsikVerifyOtpBinding) ((ViewBinding) asikVerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityAsikVerifyOtpBinding) ((ViewBinding) asikVerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(asikVerifyOtpActivity.getString(R.string.title_email_verification));
        int i4 = cancelAll + 39;
        f466a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return null;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getStringOrNull.b {
        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        TuitionPaymentFragmentbindingInflater1() {
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getStringOrNull.b {
        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final AsikVerifyOtpActivity asikVerifyOtpActivity = (AsikVerifyOtpActivity) objArr[0];
        int i = 2 % 2;
        final ActivityAsikVerifyOtpBinding activityAsikVerifyOtpBinding = (ActivityAsikVerifyOtpBinding) ((ViewBinding) asikVerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        OtpView otpView = activityAsikVerifyOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: clearMenuPresenters
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikVerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, activityAsikVerifyOtpBinding, (String) obj);
            }
        }));
        MaterialButton materialButton = activityAsikVerifyOtpBinding.btnVerification;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setBackgroundResource
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikVerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, activityAsikVerifyOtpBinding, (View) obj);
            }
        }));
        MaterialButton materialButton2 = activityAsikVerifyOtpBinding.btnChangeEmail;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AppCompatDelegateImplPanelFeatureStateSavedState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AsikVerifyOtpActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        activityAsikVerifyOtpBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: getListMenuView
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AsikVerifyOtpActivity.$r8$lambda$4418n4h89d5kW1japSIftJPhio8(view);
            }
        });
        ((getStringOrNull) asikVerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).INotificationSideChannel = new TuitionPaymentFragmentbindingInflater1();
        ((getStringOrNull) asikVerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannel = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i2 = f466a + 77;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = f466a + 27;
        cancelAll = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            TextView textView = ((ActivityAsikVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvEmail;
            throw null;
        }
        ActivityAsikVerifyOtpBinding activityAsikVerifyOtpBinding = (ActivityAsikVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextView textView2 = activityAsikVerifyOtpBinding.tvEmail;
        String str = this.b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        textView2.setText(Camera2CameraControlExternalSyntheticLambda5.a(str));
        activityAsikVerifyOtpBinding.otpVerify.setCursorVisible(true);
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = cancelAll + 59;
            f466a = i3 % 128;
            int i4 = i3 % 2;
            getcameracharacteristic = null;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i5 = f466a + 85;
        cancelAll = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 27;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1235, 35 - (ViewConfiguration.getEdgeSlop() >> 16), -653973969, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2764 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 15, 1504416861, false, $$i(b3, b4, (byte) (b4 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43325), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 253, 22 - (ViewConfiguration.getTapTimeout() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65199 - MotionEvent.axisFromString("")), TextUtils.getOffsetAfter("", 0) + 2891, ExpandableListView.getPackedPositionChild(0L) + 18, 2012627446, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (d ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) asInterface) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) asBinder) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 89;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
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

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = cancelAll + 111;
        f466a = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = f466a + 25;
            cancelAll = i3 % 128;
            if (i3 % 2 != 0) {
                return zOnOptionsItemSelected;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int i = 2 % 2;
        int i2 = f466a + 11;
        cancelAll = i2 % 128;
        getCameraCharacteristic getcameracharacteristic = null;
        if (i2 % 2 == 0) {
            super.onResume();
            getcameracharacteristic.hashCode();
            throw null;
        }
        super.onResume();
        getCameraCharacteristic getcameracharacteristic2 = this.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic2 == null) {
            int i3 = f466a + 103;
            cancelAll = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i4 == 0) {
                throw null;
            }
        } else {
            getcameracharacteristic = getcameracharacteristic2;
        }
        getcameracharacteristic.b();
        int i5 = f466a + 61;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        int i2 = f466a + 91;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        if (getcameracharacteristic == null) {
            int i4 = f466a + 25;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        AsikVerifyOtpActivity asikVerifyOtpActivity = (AsikVerifyOtpActivity) objArr[0];
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = asikVerifyOtpActivity.TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        if (getcameracharacteristic == null) {
            int i2 = cancelAll + 93;
            f466a = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i3 = f466a + 75;
            cancelAll = i3 % 128;
            if (i3 % 2 == 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                obj.hashCode();
                throw null;
            }
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
            Object[] objArr2 = new Object[1];
            c($$a[5], (byte) 52, (short) $$b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, iNormalizeMetaState, absoluteGravity, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{64833, 25283, 39746, 45274}, (char) Color.argb(0, 0, 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{60249, 54121, 5615, 7903, 10577, 47003, 8235, 11282, 9659, 9540, 1300, 5576, 36010, 24289, 54676, 48926, 24595, 31250, 30677, 14057, 37685, 44725}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{65115, 9724, 55209, 20265}, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 10711), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1457128205, new char[]{9123, 41901, 21665, 21382, 15146, 43727, 52816, 29226, 8592, 23136, 34838, 13555, 59403, 13254, 31267}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int gidForName = 1030 - Process.getGidForName("");
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
            Object[] objArr5 = new Object[1];
            c($$a[5], (byte) 52, (short) 89, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, gidForName, pressedStateDuration, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int iLastIndexOf = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
                int tapTimeout = 15 - (ViewConfiguration.getTapTimeout() >> 16);
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr6 = new Object[1];
                c(b, b2, (short) (b2 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, iLastIndexOf, tapTimeout, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_epay_bri).substring(1, 3).length() - 947666479;
            int i5 = ~length;
            int i6 = (((74012121 + (((~(i5 | 658827518)) | ((~(414547348 | i5)) | (-1073085951))) * 464)) + (((-658538603) | length) * (-464))) + (((~(length | 658827518)) | (-1073085951)) * 464)) - 2109671655;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{28095, 11253, 15710, 53499}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_network_msg).substring(33, 36).length() + 64314), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{35152, 1161, 408, 17843, 464, 42628, 55587, 59305, 7306, 64545, 7015, 62066, 15949, 65468, 62325, 53344}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{3807, 1643, 32667, 5127}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1908), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{20322, Typography.euro, 46300, 20435, 37424, 11536, 14925, 50573, 9091, 54560, 45440, 47429, 1483, 14833, 24696, 62104}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-853079411};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 46038), 1182 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -2109671655, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int iGreen = 1031 - Color.green(0);
                    int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
                    Object[] objArr12 = new Object[1];
                    c($$a[5], (byte) 52, (short) $$b, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, iGreen, threadPriority, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 45992), 1117 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                    int iRgb = (-16777201) - Color.rgb(0, 0, 0);
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr13 = new Object[1];
                    c(b3, b4, (short) (b4 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, threadPriority2, iRgb, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{64833, 25283, 39746, 45274}, (char) TextUtils.getOffsetAfter("", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bca_klikpay).substring(0, 11).length() - 11, new char[]{60249, 54121, 5615, 7903, 10577, 47003, 8235, 11282, 9659, 9540, 1300, 5576, 36010, 24289, 54676, 48926, 24595, 31250, 30677, 14057, 37685, 44725}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{65115, 9724, 55209, 20265}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 10675), View.getDefaultSize(0, 0) - 1457128194, new char[]{9123, 41901, 21665, 21382, 15146, 43727, 52816, 29226, 8592, 23136, 34838, 13555, 59403, 13254, 31267}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0');
                        Object[] objArr16 = new Object[1];
                        c($$a[5], (byte) 52, (short) 89, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(capsMode, keyRepeatTimeout, iIndexOf, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0');
                        int i9 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        Object[] objArr17 = new Object[1];
                        c($$a[5], (byte) 52, (short) $$b, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(longPressTimeout, iLastIndexOf2, i9, 1357589585, false, (String) objArr17[0], null);
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i12 = f466a + 107;
                cancelAll = i12 % 128;
                int i13 = i12 % 2;
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iMyUid = Process.myUid();
        int i17 = 1420228631 + (((~((-151001434) | iMyUid)) | (-93278737)) * (-318));
        int i18 = ~((-93278737) | iMyUid);
        int i19 = ~iMyUid;
        int i20 = i14 + i17 + ((i18 | (~(227498841 | i19))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMyUid | 227498841)) | (~((-76497409) | i19))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29943);
            int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
            int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 23;
            byte b5 = $$a[5];
            byte b6 = (byte) (b5 | 36);
            Object[] objArr19 = new Object[1];
            c(b5, b6, b6, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, touchSlop, touchSlop2, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1755;
                int i23 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr20 = new Object[1];
                c($$a[5], (byte) 52, (short) 89, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cRgb, maximumFlingVelocity, i23, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i24 = ((int[]) objArr21[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = new Object[]{new int[]{i24}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int i25 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1296810368);
            int i26 = (((~((-872064279) | i25)) | 279978242) * (-241)) + 2034645514 + (((~(i25 | (-592086037))) | (-939440095)) * 241) + 1976371023;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0] = i28 ^ (i28 << 5);
            int i29 = f466a + 41;
            cancelAll = i29 % 128;
            int i30 = i29 % 2;
        } else {
            Object[] objArr22 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{28095, 11253, 15710, 53499}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step6).substring(38, 43).length() + 64312), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 115, new char[]{35152, 1161, 408, 17843, 464, 42628, 55587, 59305, 7306, 64545, 7015, 62066, 15949, 65468, 62325, 53344}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{3807, 1643, 32667, 5127}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 1810), ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{20322, Typography.euro, 46300, 20435, 37424, 11536, 14925, 50573, 9091, 54560, 45440, 47429, 1483, 14833, 24696, 62104}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-853079411};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 42049), 1726 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - (ViewConfiguration.getLongPressTimeout() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1976371023, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iRed = Color.red(0) + 23;
                Object[] objArr25 = new Object[1];
                c($$a[5], (byte) 52, (short) 89, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf, fadingEdgeLength, iRed, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{64833, 25283, 39746, 45274}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{60249, 54121, 5615, 7903, 10577, 47003, 8235, 11282, 9659, 9540, 1300, 5576, 36010, 24289, 54676, 48926, 24595, 31250, 30677, 14057, 37685, 44725}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{65115, 9724, 55209, 20265}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 10675), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_step0).substring(40, 43).length() - 1457128197, new char[]{9123, 41901, 21665, 21382, 15146, 43727, 52816, 29226, 8592, 23136, 34838, 13555, 59403, 13254, 31267}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char pressedStateDuration2 = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int iNormalizeMetaState2 = 1755 - KeyEvent.normalizeMetaState(0);
                    int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
                    byte[] bArr = $$a;
                    Object[] objArr28 = new Object[1];
                    c(bArr[5], (byte) 52, bArr[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration2, iNormalizeMetaState2, deadChar, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                    int iIndexOf2 = TextUtils.indexOf("", "", 0) + 1755;
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                    byte b7 = $$a[5];
                    byte b8 = (byte) (b7 | 36);
                    Object[] objArr29 = new Object[1];
                    c(b7, b8, b8, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(bitsPerPixel, iIndexOf2, doubleTapTimeout, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0];
        int i32 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0];
        if (i32 != i31) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4];
            if (strArr4 != null) {
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i32));
        }
        int i33 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
        int i34 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0];
        Object[] objArr30 = {new int[]{i34}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
        int i35 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1845291139;
        int i36 = ~i35;
        int i37 = i33 + 40789401 + ((i35 | 204801) * 988) + (((~(214380827 | i36)) | (-215954428)) * (-1976)) + (((~(i35 | 1778401)) | 204801 | (~((-1778402) | i36))) * 988);
        int i38 = (i37 << 13) ^ i37;
        int i39 = i38 ^ (i38 >>> 17);
        ((int[]) objArr30[3])[0] = i39 ^ (i39 << 5);
    }

    public static /* synthetic */ getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault2(AsikVerifyOtpActivity asikVerifyOtpActivity) {
        int i = 2 % 2;
        int i2 = cancelAll + 97;
        f466a = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = asikVerifyOtpActivity.getString(R.string.label_code_sent_successfully);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = asikVerifyOtpActivity.getString(R.string.label_check_email_for_verification);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = asikVerifyOtpActivity.getString(R.string.action_ok_thanks);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, string, string2, string3, null, 112);
        int i4 = cancelAll + 93;
        f466a = i4 % 128;
        int i5 = i4 % 2;
        return getstringornullB;
    }

    public static /* synthetic */ void $r8$lambda$4418n4h89d5kW1japSIftJPhio8(View view) {
        int i = 2 % 2;
        int i2 = f466a + 101;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                ViewPortBuilder.b();
                int i4 = 51 / 0;
            } else {
                ViewPortBuilder.b();
            }
            int i5 = f466a + 49;
            cancelAll = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 50 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikVerifyOtpActivity asikVerifyOtpActivity, ActivityAsikVerifyOtpBinding activityAsikVerifyOtpBinding, String str) {
        int i = 2 % 2;
        int i2 = f466a + 43;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        Otp otp = asikVerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (otp == null) {
            int i4 = cancelAll + 95;
            f466a = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            otp = null;
        }
        if (length < otp.b.length()) {
            int i6 = cancelAll + 125;
            f466a = i6 % 128;
            int i7 = i6 % 2;
            MaterialButton materialButton = activityAsikVerifyOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = activityAsikVerifyOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
        }
        Unit unit = Unit.INSTANCE;
        int i8 = f466a + 29;
        cancelAll = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 73 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AsikVerifyOtpActivity asikVerifyOtpActivity, View view) {
        int i = 2 % 2;
        int i2 = f466a + 5;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            asikVerifyOtpActivity.d_();
            return Unit.INSTANCE;
        }
        asikVerifyOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikVerifyOtpActivity asikVerifyOtpActivity, ActivityAsikVerifyOtpBinding activityAsikVerifyOtpBinding, View view) {
        int i = 2 % 2;
        int i2 = cancelAll + 21;
        f466a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ResetPasswordActivity.Companion companion = ResetPasswordActivity.INSTANCE;
        AsikVerifyOtpActivity asikVerifyOtpActivity2 = asikVerifyOtpActivity;
        String str = asikVerifyOtpActivity.b;
        if (str == null) {
            int i4 = cancelAll + 67;
            f466a = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        ResetPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(asikVerifyOtpActivity2, str, StringsKt.trim((CharSequence) String.valueOf(activityAsikVerifyOtpBinding.otpVerify.getText())).toString(), "");
        asikVerifyOtpActivity.d_();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikVerifyOtpActivity asikVerifyOtpActivity) {
        int i = 2 % 2;
        int i2 = f466a + 115;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = asikVerifyOtpActivity.getString(R.string.label_code_doesnt_match);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = asikVerifyOtpActivity.getString(R.string.label_code_doesnt_match_message);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = asikVerifyOtpActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, string, string2, string3, null, 112);
        int i4 = f466a + 25;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return getstringornullB;
    }

    static {
        onTransact = 0;
        d();
        INSTANCE = new Companion(null);
        int i = cancel + 9;
        onTransact = i % 128;
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
        int i2 = f466a + 53;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_asik_verify_otp;
        }
        int i3 = 26 / 0;
        return R.layout.activity_asik_verify_otp;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentbindingInflater1 = CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(-539843150, (-667595083) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_token_message).substring(1, 2).length(), CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1(), CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1(), 539843152, iTuitionPaymentFragmentbindingInflater1, new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = cancelAll + 55;
        f466a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int iTuitionPaymentFragmentbindingInflater1 = CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(47625461, SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1(), CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1(), -47625461, iTuitionPaymentFragmentbindingInflater1, new Object[]{this});
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int iTuitionPaymentFragmentbindingInflater1 = SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1(892274767, CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1(), SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1(), -892274764, iTuitionPaymentFragmentbindingInflater1, new Object[]{this});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TuitionPaymentFragmentbindingInflater1(-1534280081, SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_indosat_phone_number).substring(0, 20).length() - 1552727932, 1534280082, CameraManagerCompatAvailabilityCallbackExecutorWrapper.TuitionPaymentFragmentbindingInflater1(), new Object[]{this, bundle});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = cancelAll + 17;
        f466a = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancelAll + 95;
        f466a = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = f466a + 113;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
    }

    static void d() {
        d = -6377398940819159759L;
        asInterface = -981105359;
        asBinder = (char) 59828;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        AsikVerifyOtpActivity asikVerifyOtpActivity = (AsikVerifyOtpActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = f466a + 87;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        if (i3 != 0) {
            return null;
        }
        throw null;
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
    private static java.lang.String $$i(short r6, short r7, short r8) {
        /*
            int r8 = r8 + 102
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.asik.active.verifyotp.AsikVerifyOtpActivity.$$i(short, short, short):java.lang.String");
    }
}
