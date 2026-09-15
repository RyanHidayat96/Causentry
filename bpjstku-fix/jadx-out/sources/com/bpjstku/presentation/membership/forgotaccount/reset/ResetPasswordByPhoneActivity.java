package com.bpjstku.presentation.membership.forgotaccount.reset;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.R;
import com.bpjstku.data.user.model.request.ResetPasswordByPhoneRequest;
import com.bpjstku.databinding.ActivityResetPasswordByPhoneBinding;
import com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.util.viewbinding.BindingPassiveFormActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.utils.exts.ViewExtKt$onTextChange$2;
import defpackage.ActivityResultRegistryExternalSyntheticLambda0;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.accessconfigureInstanceInternal;
import defpackage.accessgetMCameraInfoMapp;
import defpackage.cacheInteropConfig;
import defpackage.deriveCodec;
import defpackage.ensureLogoView;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getFirstBaselineToTopHeight;
import defpackage.getIncrementalScaleFactor;
import defpackage.getRequiredMaxBitDepth;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.r8lambda_rcqWHl69wN3lvwkykRzEOONbC0;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setCompoundDrawablesRelativeWithIntrinsicBounds;
import defpackage.setInactive;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.suspendUseCases;
import defpackage.unregisterLifecycle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004R\u0015\u0010\u0006\u001a\u00020\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00108\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/membership/forgotaccount/reset/ResetPasswordByPhoneActivity;", "Lcom/bpjstku/util/viewbinding/BindingPassiveFormActivity;", "Lcom/bpjstku/databinding/ActivityResetPasswordByPhoneBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "LsetCompoundDrawablesRelativeWithIntrinsicBounds;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "()I", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResetPasswordByPhoneActivity extends BindingPassiveFormActivity<ActivityResetPasswordByPhoneBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f519a;
    private static int asBinder;
    private static long d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {8, -36, 87, -65};
    private static final int $$f = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {108, -26, -110, 50, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 60;
    private static int INotificationSideChannel = 1;
    private static int asInterface = 0;
    private static int g = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i4)) | i9 | (~(i8 | i4));
        int i11 = ~i4;
        int i12 = (~(i11 | i8 | i)) | (~(i7 | i11 | i3));
        int i13 = i + i3 + i6 + ((-195996979) * i2) + ((-904719387) * i5);
        int i14 = i13 * i13;
        int i15 = (i * 1886715248) + 940376064 + (1886715248 * i3) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i6) + ((-1389494272) * i2) + (1623064576 * i5) + (1510801408 * i14);
        int i16 = (i * 1590984816) + 1398186415 + (i3 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i6 * 1590985553) + (i2 * (-1025631779)) + (i5 * 1121679989) + (i14 * 622657536);
        int i17 = i15 + (i16 * i16 * (-1928134656));
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i17 != 2) {
            return b(objArr);
        }
        int i18 = 2 % 2;
        int i19 = asInterface + 65;
        int i20 = i19 % 128;
        g = i20;
        int i21 = i19 % 2;
        int i22 = i20 + 77;
        asInterface = i22 % 128;
        int i23 = i22 % 2;
        return Integer.valueOf(R.layout.activity_reset_password_by_phone);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            byte[] r0 = com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity.$$a
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-11)
            int r9 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity.c(byte, int, int, java.lang.Object[]):void");
    }

    public ResetPasswordByPhoneActivity() {
        final ResetPasswordByPhoneActivity resetPasswordByPhoneActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<setCompoundDrawablesRelativeWithIntrinsicBounds>() { // from class: com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setCompoundDrawablesRelativeWithIntrinsicBounds] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setCompoundDrawablesRelativeWithIntrinsicBounds invoke() {
                LifecycleOwner lifecycleOwner = resetPasswordByPhoneActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setCompoundDrawablesRelativeWithIntrinsicBounds.class);
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

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/membership/forgotaccount/reset/ResetPasswordByPhoneActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, String p1, String p2, String p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ResetPasswordByPhoneActivity.class, new Pair[]{TuplesKt.to("phone_number", p1), TuplesKt.to("otp", p2), TuplesKt.to("check_sum", p3)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity
    public final Function1<LayoutInflater, ActivityResetPasswordByPhoneBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            ResetPasswordByPhoneActivity$bindingInflater$1 resetPasswordByPhoneActivity$bindingInflater$1 = ResetPasswordByPhoneActivity$bindingInflater$1.b;
            throw null;
        }
        ResetPasswordByPhoneActivity$bindingInflater$1 resetPasswordByPhoneActivity$bindingInflater$2 = ResetPasswordByPhoneActivity$bindingInflater$1.b;
        int i3 = asInterface + 95;
        g = i3 % 128;
        int i4 = i3 % 2;
        return resetPasswordByPhoneActivity$bindingInflater$2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityResetPasswordByPhoneBinding activityResetPasswordByPhoneBindingOnTransact = onTransact();
        activityResetPasswordByPhoneBindingOnTransact.btnResetPassword.setOnClickListener(new View.OnClickListener() { // from class: access701
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResetPasswordByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, activityResetPasswordByPhoneBindingOnTransact, view);
            }
        });
        TextInputLayout textInputLayout = activityResetPasswordByPhoneBindingOnTransact.tilNewPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        Function1 function1 = new Function1() { // from class: access501
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResetPasswordByPhoneActivity.b(activityResetPasswordByPhoneBindingOnTransact, (String) obj);
            }
        };
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new ViewExtKt$onTextChange$2(function1)));
        }
        TextInputLayout textInputLayout2 = activityResetPasswordByPhoneBindingOnTransact.tilConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        Function1 function2 = new Function1() { // from class: access601
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResetPasswordByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityResetPasswordByPhoneBindingOnTransact, (String) obj);
            }
        };
        EditText editText2 = textInputLayout2.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new ViewExtKt$onTextChange$2(function2)));
        }
        int i2 = asInterface + 109;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        String stringExtra = getIntent().getStringExtra("phone_number");
        String str = "";
        if (stringExtra == null) {
            int i2 = asInterface + 45;
            g = i2 % 128;
            int i3 = i2 % 2;
            stringExtra = "";
        }
        this.b = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("otp");
        Object obj = null;
        if (stringExtra2 == null) {
            int i4 = asInterface + 45;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            stringExtra2 = "";
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("check_sum");
        if (stringExtra3 == null) {
            int i5 = asInterface + 35;
            g = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str = stringExtra3;
        }
        this.TuitionPaymentFragmentbindingInflater1 = str;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        ResetPasswordByPhoneActivity resetPasswordByPhoneActivity = (ResetPasswordByPhoneActivity) objArr[0];
        int i = 2 % 2;
        ((setCompoundDrawablesRelativeWithIntrinsicBounds) resetPasswordByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(resetPasswordByPhoneActivity, new getFirstBaselineToTopHeight(resetPasswordByPhoneActivity));
        int i2 = asInterface + 111;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $11 + 85;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(f519a[i - i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2187, (ViewConfiguration.getEdgeSlop() >> 16) + 40, 841711447, false, $$i(b, b2, (byte) (b2 - 2)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(d), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33018 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 3010 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, 321985076, false, $$i(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), View.resolveSizeAndState(0, 0, 0) + 3376, 17 - KeyEvent.getDeadChar(0, 0), -968507904, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(f519a[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2187 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 40, 841711447, false, $$i(b7, b8, (byte) (b8 - 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(d), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - Drawable.resolveOpacity(0, 0)), View.combineMeasuredStates(0, 0) + 3011, TextUtils.getOffsetBefore("", 0) + 26, 321985076, false, $$i(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (b11 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36504 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3376, (-16777199) - Color.rgb(0, 0, 0), -968507904, false, $$i(b11, b12, (byte) (b12 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $10 + 63;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 3376 - TextUtils.getTrimmedLength(""), 16 - ((byte) KeyEvent.getModifierMetaStateMask()), -968507904, false, $$i(b13, b14, (byte) (b14 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                int i8 = 76 / 0;
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 36505), 3376 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 17 - Color.argb(0, 0, 0, 0), -968507904, false, $$i(b15, b16, (byte) (b16 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        TextInputLayout textInputLayout = onTransact().tilNewPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Minimal harus 8 karakter", 8, null), new accessconfigureInstanceInternal("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[\\\\\\/%§\"&“|`´}{°><:.;#')(@_$\"!?*=^-]).{8,}$", "Harus terdiri dari 1 huruf besar, huruf kecil, angka, dan karakter khusus")})));
        TextInputLayout textInputLayout2 = onTransact().tilConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.error_unmatch_password);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string2), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: access901
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
                return Boolean.valueOf(((Boolean) ResetPasswordByPhoneActivity.TuitionPaymentFragmentbindingInflater1(1342695523, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1342695523, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), objArr)).booleanValue());
            }
        }, string3)})));
        ((setCompoundDrawablesRelativeWithIntrinsicBounds) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new getFirstBaselineToTopHeight(this));
        int i2 = asInterface + 33;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = g + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ResetPasswordByPhoneActivity resetPasswordByPhoneActivity = this;
        Intrinsics.checkNotNullParameter(resetPasswordByPhoneActivity, "");
        resetPasswordByPhoneActivity.getWindow().addFlags(8192);
        TextInputEditText textInputEditText = onTransact().edtNewPassword;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        ResetPasswordByPhoneActivity resetPasswordByPhoneActivity2 = this;
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputEditText, resetPasswordByPhoneActivity2);
        TextInputEditText textInputEditText2 = onTransact().edtConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textInputEditText2, resetPasswordByPhoneActivity2);
        int i4 = g + 35;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 29944);
            int iBlue = 1755 - Color.blue(0);
            int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b = (byte) ($$b >>> 2);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(b, bArr[5], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iBlue, iMakeMeasureSpec, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = g + 39;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 23;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[7];
                byte b3 = bArr2[5];
                Object[] objArr3 = new Object[1];
                c(b2, b3, (short) (b3 | 36), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, maximumDrawingCacheSize, scrollBarSize, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iNextInt = new Random().nextInt(47517015);
            int i4 = 1329514755 + (((~((-776613595) | iNextInt)) | 564011168) * (-318));
            int i5 = ~(564011168 | iNextInt);
            int i6 = ~iNextInt;
            int i7 = i4 + ((i5 | (~((-26476577) | i6))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iNextInt | (-26476577))) | (~(803090170 | i6))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 1092978470;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_retake_selfie).substring(8, 13).length() - 5, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step2).substring(28, 29).codePointAt(0) - 81, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 50199), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, (char) (10838 - TextUtils.indexOf("", "")), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1226064443};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 42049), 1726 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1092978470);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int iAlpha = Color.alpha(0) + 1755;
                    int i10 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[7];
                    byte b5 = bArr3[5];
                    Object[] objArr8 = new Object[1];
                    c(b4, b5, (short) (b5 | 36), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout, iAlpha, i10, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(ExpandableListView.getPackedPositionGroup(0L) + 32, 21 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_cimb_clicks).substring(0, 11).codePointAt(2) - 77), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(54 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_card_register_error).substring(1, 2).length() - 1), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cGreen = (char) (Color.green(0) + 29944);
                        int i11 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iAlpha2 = 23 - Color.alpha(0);
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[7];
                        byte b7 = bArr4[5];
                        Object[] objArr11 = new Object[1];
                        c(b6, b7, (short) (b7 | 88), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, i11, iAlpha2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                        int iIndexOf = TextUtils.indexOf("", "") + 1755;
                        int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                        byte b8 = (byte) ($$b >>> 2);
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        c(b8, bArr5[5], bArr5[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, iIndexOf, i12, 986134021, false, (String) objArr12[0], null);
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
        int i13 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i14 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i16 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i17 = i15 + 631833220 + (((~(i16 | 155233281)) | (-191622714)) * 305) + (((~((~i16) | 155233281)) | (-57369145)) * 305);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr13[3])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i20 = asInterface + 39;
                g = i20 % 128;
                int i21 = i20 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i22 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i23 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1722816429;
            int i24 = ~i23;
            int i25 = i22 + 1353485922 + (((-408187399) | i24) * (-369)) + (((~((-656443746) | i24)) | (-443841320)) * (-369)) + (((~(i23 | 656443745)) | (-1064631144) | (~(i24 | (-35653922)))) * 369);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr14[3])[0] = i27 ^ (i27 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cBlue = (char) Color.blue(0);
            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
            int i28 = 15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr6 = $$a;
            byte b9 = bArr6[7];
            byte b10 = bArr6[5];
            Object[] objArr15 = new Object[1];
            c(b9, b10, (short) (b10 | 140), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cBlue, doubleTapTimeout2, i28, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_error_shopeepay_transaction).substring(0, 6).length() + 26, Color.alpha(0) + 22, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_notification_shopee_app_tablet).substring(29, 36).length() - 7), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        e(55 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 107), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int i29 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
            byte[] bArr7 = $$a;
            byte b11 = bArr7[7];
            byte b12 = bArr7[5];
            Object[] objArr18 = new Object[1];
            c(b11, b12, (short) (b12 | 36), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSize, i29, maximumFlingVelocity, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i30 = g + 49;
            asInterface = i30 % 128;
            int i31 = i30 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int jumpTapTimeout = 1031 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i32 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte b13 = (byte) ($$b & 247);
                byte b14 = $$a[7];
                Object[] objArr19 = new Object[1];
                c(b13, b14, (short) (b14 | 193), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(fadingEdgeLength, jumpTapTimeout, i32, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr20[3])[0];
            int i34 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i35 = ~(809366868 | iIdentityHashCode);
            int i36 = ~iIdentityHashCode;
            int i37 = i35 | (~(1053647038 | i36));
            int i38 = ~((-809366869) | i36);
            int i39 = 1001778461 + ((i37 | i38) * (-516)) + (((~(iIdentityHashCode | (-247464107))) | (~((-806182933) | i36))) * 516) + ((806182932 | i38) * 516) + 2015456557;
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr[2])[0] = i41 ^ (i41 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 117, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 82, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step7).substring(16, 17).codePointAt(0) + 50134), objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, 16 - (Process.myPid() >> 22), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step6).substring(39, 40).length() + 10837), objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-1226064443};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (Color.rgb(0, 0, 0) + 16823254), 1134 - TextUtils.indexOf("", "", 0, 0), 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 2015456557, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                int doubleTapTimeout3 = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iIndexOf2 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr8 = $$a;
                byte b15 = bArr8[7];
                byte b16 = bArr8[5];
                Object[] objArr25 = new Object[1];
                c(b15, b16, (short) (b16 | 140), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cNormalizeMetaState2, doubleTapTimeout3, iIndexOf2, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "") + 45993), View.combineMeasuredStates(0, 0) + 1117, 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                int i42 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                int i43 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14;
                byte b17 = (byte) ($$b & 247);
                byte b18 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b17, b18, (short) (b18 | 193), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf2, i42, i43, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                e(TextUtils.getOffsetBefore("", 0) + 32, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.expand_link_atm_bersama).substring(1, 2).length() - 1), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 63, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step5).substring(15, 16).length() - 1), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                    int iRed = Color.red(0) + 15;
                    byte[] bArr9 = $$a;
                    byte b19 = bArr9[7];
                    byte b20 = bArr9[5];
                    Object[] objArr29 = new Object[1];
                    c(b19, b20, (short) (b20 | 36), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c, maximumFlingVelocity2, iRed, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int iRed2 = 1031 - Color.red(0);
                    int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte[] bArr10 = $$a;
                    byte b21 = bArr10[7];
                    byte b22 = bArr10[5];
                    Object[] objArr30 = new Object[1];
                    c(b21, b22, (short) (b22 | 140), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(mode, iRed2, modifierMetaStateMask, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i44 = ((int[]) objArr[1])[0];
        int i45 = ((int[]) objArr[3])[0];
        if (i45 == i44) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i46 = ((int[]) objArr[2])[0];
            int i47 = ((int[]) objArr[3])[0];
            int i48 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i49 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i50 = ~i49;
            int i51 = i46 + 106353603 + (((~((-136618437) | i50)) | (~((-107661734) | i49))) * 1900) + (((~(i50 | 107661733)) | (~(i49 | 136618436))) * (-950)) + (((~(i49 | 107661733)) | (~(i50 | 136618436))) * 950);
            int i52 = (i51 << 13) ^ i51;
            int i53 = i52 ^ (i52 >>> 17);
            ((int[]) objArr31[2])[0] = i53 ^ (i53 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i54 = g + 97;
            asInterface = i54 % 128;
            int i55 = i54 % 2;
            int i56 = 0;
            while (i56 < strArr4.length) {
                arrayList2.add(strArr4[i56]);
                i56++;
                int i57 = g + 65;
                asInterface = i57 % 128;
                int i58 = i57 % 2;
            }
        }
        int[] iArr = new int[i45];
        int i59 = i45 - 1;
        iArr[i59] = 1;
        Toast.makeText((Context) null, iArr[((i45 * i59) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i60 = ((int[]) objArr[2])[0];
        int i61 = ((int[]) objArr[3])[0];
        int i62 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i63 = ~new Random().nextInt();
        int i64 = i60 + 644797189 + (((~((-33625369) | i63)) | 277905538) * (-828)) + ((i63 | (-33625369)) * (-828)) + 2072000928;
        int i65 = (i64 << 13) ^ i64;
        int i66 = i65 ^ (i65 >>> 17);
        ((int[]) objArr32[2])[0] = i66 ^ (i66 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2004098279
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity.g
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity.asInterface = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            java.lang.String r4 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r4)
            java.lang.String r5 = "currentApplication"
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)
            r5 = r3
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r4 = r4.invoke(r3, r3)
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.densityDpi
            int r4 = ~r4
            r5 = 571399120(0x220edbd0, float:1.9360956E-18)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = 33968768(0x2065280, float:9.868442E-38)
            r5 = r5 | r4
            int r5 = r5 * (-374)
            r6 = -146058936(0xfffffffff74b5148, float:-4.123769E33)
            int r5 = r5 + r6
            r6 = 537430352(0x20088950, float:1.1565081E-19)
            r4 = r4 | r6
            int r4 = r4 * 374
            int r5 = r5 + r4
            if (r1 == r5) goto L74
            r1 = -2004098279(0xffffffff888be319, float:-8.419149E-34)
            int[] r1 = new int[r1]
            r4 = -2004098280(0xffffffff888be318, float:-8.419148E-34)
            r5 = 1
            r1[r4] = r5
            r4 = 1846506840(0x6e0f7558, float:1.1099554E28)
            int r4 = r4 % r0
            r4 = -1
            r1 = r1[r4]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r5)
            r1.show()
            int r1 = com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity.asInterface
            int r1 = r1 + 95
            int r4 = r1 % 128
            com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity.g = r4
            int r1 = r1 % r0
        L74:
            java.lang.reflect.Member[] r1 = defpackage.checkUnsupportedFeatureCombinationAndThrow.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = java.lang.System.identityHashCode(r8)
            r3 = -673813279(0xffffffffd7d66ce1, float:-4.7152624E14)
            r3 = r3 | r2
            int r3 = ~r3
            int r4 = ~r2
            r5 = 1905242686(0x718fb23e, float:1.4230988E30)
            r5 = r5 | r4
            int r5 = ~r5
            r3 = r3 | r5
            int r3 = r3 * (-1808)
            r5 = 1763400796(0x691b5c5c, float:1.1738729E25)
            int r5 = r5 + r3
            r3 = -537498143(0xffffffffdff66de1, float:-3.5514193E19)
            r3 = r3 | r2
            int r3 = ~r3
            r6 = 673813278(0x2829931e, float:9.4132855E-15)
            r6 = r6 | r4
            r7 = 2041557822(0x79afb33e, float:1.1403593E35)
            r4 = r4 | r7
            int r4 = ~r4
            r3 = r3 | r4
            int r3 = r3 * 904
            int r5 = r5 + r3
            r3 = -1905242687(0xffffffff8e704dc1, float:-2.9619721E-30)
            r2 = r2 | r3
            int r2 = ~r2
            r3 = 136315136(0x8200100, float:4.8149424E-34)
            r2 = r2 | r3
            int r3 = ~r6
            r2 = r2 | r3
            int r2 = r2 * 904
            int r5 = r5 + r2
            if (r1 != r5) goto Lba
            super.onResume()
            return
        Lba:
            r1 = -766184720(0xffffffffd254f2f0, float:-2.2865222E11)
            int r1 = r1 % r0
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity.onResume():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -818283648
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i3 = ~((-243806517) | iMyUid);
        int i4 = ~iMyUid;
        if (i2 != 269715572 + ((i3 | (~(i4 | 1325333951))) * 497) + (((~(iMyUid | 1325333951)) | (~((-251539893) | i4)) | 7733376) * 497)) {
            throw new RuntimeException("-1273980890");
        }
        int i5 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i6 = ~iIdentityHashCode;
        int i7 = 176424844 + (((~((-910430644) | i6)) | 574886305 | (~((-1668625322) | i6)) | (~(2004169659 | iIdentityHashCode))) * (-84));
        int i8 = (~(iIdentityHashCode | (-1668625322))) | 910430643;
        int i9 = ~(i6 | 1668625321);
        if (i5 != i7 + ((i8 | i9) * (-84)) + (((-2004169660) | i9) * 84)) {
            int i10 = asInterface + 1;
            g = i10 % 128;
            if (i10 % 2 == 0) {
                int[] iArr = new int[1536782955];
                iArr[1536782954] = 0;
                int i11 = (-1385167282) / 3;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1536782955];
                iArr2[1536782954] = 1;
                int i12 = (-1385167282) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
            int i13 = g + 99;
            asInterface = i13 % 128;
            int i14 = i13 % 2;
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ Unit b(ActivityResetPasswordByPhoneBinding activityResetPasswordByPhoneBinding, String str) {
        int i = 2 % 2;
        int i2 = g + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        activityResetPasswordByPhoneBinding.tilNewPassword.setError(null);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 23;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityResetPasswordByPhoneBinding activityResetPasswordByPhoneBinding, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        activityResetPasswordByPhoneBinding.tilConfirmedPassword.setError(null);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 71;
        g = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void b(ResetPasswordByPhoneActivity resetPasswordByPhoneActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = asInterface + 87;
            g = i2 % 128;
            str = "loading_reset_password_by_phone";
            if (i2 % 2 == 0) {
                resetPasswordByPhoneActivity.MediaBrowserCompat();
                int i3 = 92 / 0;
            } else {
                resetPasswordByPhoneActivity.MediaBrowserCompat();
            }
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            int i4 = asInterface + 103;
            g = i4 % 128;
            int i5 = i4 % 2;
            resetPasswordByPhoneActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Akun berhasil direset, silakan login menggunakan kata sandi baru Anda.", 0).show();
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(resetPasswordByPhoneActivity, null, false, 6);
            resetPasswordByPhoneActivity.d_();
            str = "success_reset_password_by_phone";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = asInterface + 83;
            g = i6 % 128;
            int i7 = i6 % 2;
            resetPasswordByPhoneActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(resetPasswordByPhoneActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            str = "failure_reset_password_by_phone";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_reset_password_by_phone_result", str));
        Intrinsics.checkNotNullParameter(resetPasswordByPhoneActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ResetPasswordByPhoneActivity resetPasswordByPhoneActivity, ActivityResetPasswordByPhoneBinding activityResetPasswordByPhoneBinding, View view) {
        String str;
        Editable text;
        Editable text2;
        String str2;
        String str3;
        int i = 2 % 2;
        int i2 = g + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (resetPasswordByPhoneActivity.INotificationSideChannel()) {
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_reset_password_by_phone", "reset_password_by_phone"));
                Intrinsics.checkNotNullParameter(resetPasswordByPhoneActivity, "");
                Intrinsics.checkNotNullParameter("reset_password_by_phone", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("reset_password_by_phone", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("reset_password_by_phone", mapMutableMapOf);
                final setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds = (setCompoundDrawablesRelativeWithIntrinsicBounds) resetPasswordByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                String str4 = resetPasswordByPhoneActivity.b;
                Object obj = null;
                if (str4 == null) {
                    int i4 = g + 39;
                    asInterface = i4 % 128;
                    if (i4 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i5 = 5 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    str = null;
                } else {
                    str = str4;
                }
                EditText editText = activityResetPasswordByPhoneBinding.tilNewPassword.getEditText();
                if (editText != null) {
                    int i6 = asInterface + 119;
                    g = i6 % 128;
                    int i7 = i6 % 2;
                    text = editText.getText();
                } else {
                    int i8 = asInterface + 11;
                    g = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 4 % 3;
                    }
                    text = null;
                }
                String strValueOf = String.valueOf(text);
                EditText editText2 = activityResetPasswordByPhoneBinding.tilConfirmedPassword.getEditText();
                if (editText2 != null) {
                    int i10 = asInterface + 111;
                    g = i10 % 128;
                    if (i10 % 2 == 0) {
                        editText2.getText();
                        obj.hashCode();
                        throw null;
                    }
                    text2 = editText2.getText();
                } else {
                    int i11 = g + 33;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    text2 = null;
                }
                String strValueOf2 = String.valueOf(text2);
                String str5 = resetPasswordByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str2 = null;
                } else {
                    str2 = str5;
                }
                String str6 = resetPasswordByPhoneActivity.TuitionPaymentFragmentbindingInflater1;
                if (str6 == null) {
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
                MutableLiveData<VirtualCameraAdapter1<ActivityResultRegistryExternalSyntheticLambda0>> mutableLiveData = setcompounddrawablesrelativewithintrinsicbounds.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setcompounddrawablesrelativewithintrinsicbounds.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ResetPasswordByPhoneRequest(str, strValueOf, strValueOf2, str2, str3))));
                final Function1 function1 = new Function1() { // from class: consumeTextFutureAndSetBlocking
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return setCompoundDrawablesRelativeWithIntrinsicBounds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setcompounddrawablesrelativewithintrinsicbounds, (ActivityResultRegistryExternalSyntheticLambda0) obj2);
                    }
                };
                logToString logtostring = new logToString() { // from class: getTextMetricsParamsCompat
                    @Override // defpackage.logToString
                    public final void accept(Object obj2) {
                        function1.invoke(obj2);
                    }
                };
                final Function1 function2 = new Function1() { // from class: getLastBaselineToBottomHeight
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return setCompoundDrawablesRelativeWithIntrinsicBounds.b(setcompounddrawablesrelativewithintrinsicbounds, (Throwable) obj2);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setPrecomputedText
                    @Override // defpackage.logToString
                    public final void accept(Object obj2) {
                        function2.invoke(obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                setcompounddrawablesrelativewithintrinsicbounds.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r2
  0x0034: PHI (r2v8 android.widget.EditText) = (r2v7 android.widget.EditText), (r2v19 android.widget.EditText) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object b(Object[] objArr) {
        EditText editText;
        Editable text;
        ResetPasswordByPhoneActivity resetPasswordByPhoneActivity = (ResetPasswordByPhoneActivity) objArr[0];
        int i = 2 % 2;
        int i2 = g + 23;
        asInterface = i2 % 128;
        Editable text2 = null;
        if (i2 % 2 != 0) {
            editText = resetPasswordByPhoneActivity.onTransact().tilNewPassword.getEditText();
            int i3 = 44 / 0;
            if (editText != null) {
                text = editText.getText();
            } else {
                text = null;
            }
        } else {
            editText = resetPasswordByPhoneActivity.onTransact().tilNewPassword.getEditText();
            if (editText != null) {
                text = editText.getText();
            } else {
                text = null;
            }
        }
        String strValueOf = String.valueOf(text);
        EditText editText2 = resetPasswordByPhoneActivity.onTransact().tilConfirmedPassword.getEditText();
        if (editText2 != null) {
            text2 = editText2.getText();
            int i4 = g + 31;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        boolean zAreEqual = Intrinsics.areEqual(String.valueOf(text2), strValueOf);
        int i6 = asInterface + 27;
        g = i6 % 128;
        if (i6 % 2 != 0) {
            return Boolean.valueOf(zAreEqual);
        }
        int i7 = 15 / 0;
        return Boolean.valueOf(zAreEqual);
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(ResetPasswordByPhoneActivity resetPasswordByPhoneActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Boolean) TuitionPaymentFragmentbindingInflater1(1342695523, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1342695523, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{resetPasswordByPhoneActivity})).booleanValue();
    }

    static {
        asBinder = 0;
        d();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 67;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(-1195650082, 1284144806 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_5).substring(3, 4).codePointAt(0), 1195650084, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, ensureLogoView.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{this})).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentbindingInflater1 = ensureLogoView.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(-1067239922, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1067239923, iTuitionPaymentFragmentbindingInflater1, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this});
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = g + 103;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingPassiveFormActivity, com.nbs.validacion.PassiveFormActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = g + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = asInterface + 37;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    static void d() {
        f519a = new char[]{30157, 30134, 30001, 29846, 29769, 30715, 30566, 30425, 30272, 30329, 29076, 28942, 28820, 28771, 29666, 29530, 39843, 39902, 39759, 39668, 39550, 39315, 39198, 39075, 38914, 39003, 40921, 40818, 40649, 40469, 40334, 40255, 45565, 45442, 45336, 45246, 45107, 46021, 45912, 45730, 45683, 45599, 46546, 46367, 46245, 46175, 47048, 46953, 46833, 46767, 46608, 47523, 47423, 47303, 45561, 45440, 45341, 45244, 45103, 46025, 45912, 45790, 45689, 45581, 46480, 46392, 46261, 46145, 47065};
        d = 1005133795375362540L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 2
            int r0 = 1 - r5
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity.$$c
            int r6 = r6 * 3
            int r6 = 115 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity.$$i(byte, byte, byte):java.lang.String");
    }
}
