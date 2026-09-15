package com.bpjstku.presentation.membership.forgotaccount.verifyotp;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
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
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.user.model.request.ValidationOtpRequest;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.databinding.ActivityVerifyOtpByPhoneBinding;
import com.bpjstku.domain.user.model.ValidationOtp;
import com.bpjstku.presentation.membership.forgotaccount.reset.ResetPasswordByPhoneActivity;
import com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import com.google.android.material.button.MaterialButton;
import com.midtrans.sdk.corekit.core.Constants;
import com.mukesh.OtpView;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.IntegerRes;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.forLanguageTags;
import defpackage.getCameraCharacteristic;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isBound;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdagetPreviewBitmap1;
import defpackage.mapPoint;
import defpackage.notifyStateAttached;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setQuickZoomEnabled;
import defpackage.setTypeface;
import defpackage.suspendUseCases;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010-\u001a\u00020.H\u0014J\b\u0010/\u001a\u00020.H\u0014J\b\u00100\u001a\u00020.H\u0014J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001aJ\u0010\u00104\u001a\u0002022\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020.H\u0014J\b\u00108\u001a\u00020.H\u0014J\b\u00109\u001a\u00020.H\u0014J\b\u0010:\u001a\u00020.H\u0014J\b\u0010;\u001a\u00020.H\u0014J\b\u0010<\u001a\u00020.H\u0014J\u0006\u0010=\u001a\u00020.R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b&\u0010'R\u000e\u0010)\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?²\u0006\n\u0010@\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"Lcom/bpjstku/presentation/membership/forgotaccount/verifyotp/VerifyOtpByPhoneActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVerifyOtpByPhoneBinding;", "<init>", "()V", "successDialog", "Lcom/bpjstku/presentation/membership/registration/ProcessResultDialogFragment;", "getSuccessDialog", "()Lcom/bpjstku/presentation/membership/registration/ProcessResultDialogFragment;", "successDialog$delegate", "Lkotlin/Lazy;", "failedDialog", "getFailedDialog", "failedDialog$delegate", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "getBindingInflater", "()Lkotlin/jvm/functions/Function1;", "layoutResource", "", "getLayoutResource", "()I", "countDownTimerUtil", "Lcom/bpjstku/util/utils/CountDownTimerUtil;", "response", "", "siganature", "checkSum", "resendCheckSum", "responseChecksum", "settingViewModel", "Lcom/bpjstku/presentation/account/setting/SettingViewModel;", "getSettingViewModel", "()Lcom/bpjstku/presentation/account/setting/SettingViewModel;", "settingViewModel$delegate", "forgotPasswordByPhoneViewModel", "Lcom/bpjstku/presentation/membership/forgotaccount/inputnik/ForgotPasswordByPhoneViewModel;", "getForgotPasswordByPhoneViewModel", "()Lcom/bpjstku/presentation/membership/forgotaccount/inputnik/ForgotPasswordByPhoneViewModel;", "forgotPasswordByPhoneViewModel$delegate", "otp", "nohp", "serverSignature", "countVerificationOtp", "initAction", "", "initIntent", "initObservers", "checkDate", "", "date", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "onStop", "onDestroy", "initProcess", "initUI", "initLib", "getTimeServer", "Companion", "app_release", "exceptionDialog"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyOtpByPhoneActivity extends BindingBaseActivity<ActivityVerifyOtpByPhoneBinding> {
    private static int INotificationSideChannelStub;
    private static int IconCompatParcelizer;
    public static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private String INotificationSideChannel;
    private String TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy asBinder;
    private String asInterface;
    private getCameraCharacteristic b;
    private String d;
    private String g;
    private final Lazy notify;
    private static final byte[] $$c = {104, 27, -72, 120};
    private static final int $$f = 84;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {117, 50, 102, 124, -15, -1, 60, -60, -11, -3, 5, -8, 4, 52, -54, -16, 7, -17, 0, 3, 2, 51, -60, -9, -9, 66, -66, 9, -18, -6, 66, -66, -5, 8, -4, -10, 59, -37, -34, 0, -16, 15, -11, -2, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, 15, -10, -8, 7, -8, -8, 4, 27, -40, 5, -9, 8, -22, 12, -16, 62};
    private static final int $$k = 66;
    private static final byte[] $$a = {107, 48, 57, 107, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 179;
    private static int INotificationSideChannelDefault = 0;
    private static int getInterfaceDescriptor = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private final Lazy onTransact = LazyKt.lazy(new Function0() { // from class: setLastBaselineToBottomHeight
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VerifyOtpByPhoneActivity.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: AppCompatTextViewInspectionCompanion1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VerifyOtpByPhoneActivity.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f520a = "";
    private String cancel = "";
    private String cancelAll = "";

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 1
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r0 = com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity.$$a
            int r7 = 145 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r7
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r7 = r7 + r3
            int r9 = r9 + 1
            int r7 = r7 + (-11)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity.c(short, short, int, java.lang.Object[]):void");
    }

    private static void f(byte b2, int i, short s, Object[] objArr) {
        int i2 = 43 - (b2 * 40);
        int i3 = s * 3;
        byte[] bArr = $$j;
        int i4 = (i * 15) + 84;
        byte[] bArr2 = new byte[41 - i3];
        int i5 = 40 - i3;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i4 = (i5 + (-i2)) - 3;
            i2 = i2;
        }
        while (true) {
            int i7 = i2 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = i8;
            i4 = (i4 + (-bArr[i7])) - 3;
            i2 = i7;
        }
    }

    public VerifyOtpByPhoneActivity() {
        final VerifyOtpByPhoneActivity verifyOtpByPhoneActivity = this;
        this.notify = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = verifyOtpByPhoneActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final VerifyOtpByPhoneActivity verifyOtpByPhoneActivity2 = this;
        this.asBinder = LazyKt.lazy(new Function0<forLanguageTags>() { // from class: com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, forLanguageTags] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ forLanguageTags invoke() {
                LifecycleOwner lifecycleOwner = verifyOtpByPhoneActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(forLanguageTags.class);
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/membership/forgotaccount/verifyotp/VerifyOtpByPhoneActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "p4", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1 {
        private TuitionPaymentFragmentbindingInflater1() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, String p1, String p2, String p3, String p4) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p4, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, VerifyOtpByPhoneActivity.class, new Pair[]{TuplesKt.to("otp", p1), TuplesKt.to("phone_number", p2), TuplesKt.to("check_sum", p4), TuplesKt.to("resend_check_sum", p3)});
        }

        public /* synthetic */ TuitionPaymentFragmentbindingInflater1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVerifyOtpByPhoneBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        VerifyOtpByPhoneActivity$bindingInflater$1 verifyOtpByPhoneActivity$bindingInflater$1 = VerifyOtpByPhoneActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = getInterfaceDescriptor + 67;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return verifyOtpByPhoneActivity$bindingInflater$1;
    }

    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i5 = $11 + 71;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i7 = $10 + 117;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i9 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i9]), Integer.valueOf(INotificationSideChannelStub)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3291, 32 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1199271174, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651, 43 - TextUtils.indexOf((CharSequence) "", '0'), -450685997, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i10 = $11 + 65;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i11 = $10 + 51;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSize(0, 0), Color.argb(0, 0, 0, 0) + 651, TextUtils.getTrimmedLength("") + 44, -450685997, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    public static final class b implements getStringOrNull.b {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -652290027;

        b() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            VerifyOtpByPhoneActivity.this.d_();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getStringOrNull.b {
        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getStringOrNull.b {
        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x03e4  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        final ActivityVerifyOtpByPhoneBinding activityVerifyOtpByPhoneBinding = (ActivityVerifyOtpByPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityVerifyOtpByPhoneBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: setFirstBaselineToTopHeight
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                VerifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityVerifyOtpByPhoneBinding, this);
            }
        });
        OtpView otpView = activityVerifyOtpByPhoneBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: AppCompatTextViewInspectionCompanion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, activityVerifyOtpByPhoneBinding, (String) obj);
            }
        }));
        MaterialButton materialButton = activityVerifyOtpByPhoneBinding.btnVerification;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: setTextFuture
            private static final byte[] $$a = {1, -81, 2, 79};
            private static final int $$b = 7;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int d = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f1395a = 1;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 53072;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 45701;
            private static char TuitionPaymentFragmentbindingInflater1 = 19733;
            private static char asInterface = '.';
            private static int asBinder = -83722421;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = f1395a + 11;
                d = i3 % 128;
                int i4 = i3 % 2;
                Unit unitB = VerifyOtpByPhoneActivity.b(this.b, activityVerifyOtpByPhoneBinding, (View) obj);
                int i5 = f1395a + 121;
                d = i5 % 128;
                int i6 = i5 % 2;
                return unitB;
            }

            private static void c(char[] cArr, int i2, Object[] objArr2) throws Throwable {
                int i3 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                int i4 = $10 + 97;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                while (true) {
                    char c = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        objArr2[0] = new String(cArr2, 0, i2);
                        int i6 = $11 + 15;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        return;
                    }
                    int i8 = $10 + 43;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    char c2 = 1;
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    int i10 = $11 + 123;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = 58224;
                    int i13 = 0;
                    while (i13 < 16) {
                        int i14 = $10 + 3;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        char c3 = cArr3[c2];
                        char c4 = cArr3[c];
                        int i16 = i13;
                        int i17 = (c4 + i12) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                        int i18 = c4 >>> 5;
                        try {
                            Object[] objArr3 = new Object[4];
                            objArr3[3] = Integer.valueOf(asInterface);
                            objArr3[2] = Integer.valueOf(i18);
                            objArr3[c2] = Integer.valueOf(i17);
                            objArr3[0] = Integer.valueOf(c3);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 47773);
                                int keyRepeatDelay = 468 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int i19 = 13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                Class[] clsArr = new Class[4];
                                clsArr[0] = Integer.TYPE;
                                clsArr[c2] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, keyRepeatDelay, i19, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).charValue();
                            cArr3[c2] = cCharValue;
                            Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i12) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - TextUtils.getCapsMode("", 0, 0)), (-16776748) - Color.rgb(0, 0, 0), Color.rgb(0, 0, 0) + 16777229, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).charValue();
                            i12 -= 40503;
                            i13 = i16 + 1;
                            c2 = 1;
                            c = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                    Object[] objArr5 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int minimumFlingVelocity = 2323 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iKeyCodeFromString = 44 - KeyEvent.keyCodeFromString("");
                        byte b2 = (byte) ($$a[0] - 1);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, minimumFlingVelocity, iKeyCodeFromString, -1312321721, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5);
                }
            }

            private static void e(char[] cArr, boolean z, int i2, int i3, int i4, Object[] objArr2) throws Throwable {
                char[] cArr2;
                int i5 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr3 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i6 = $10 + 93;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i3 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(asBinder)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3291;
                            int scrollBarSize = 31 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b2 = (byte) ($$a[0] - 1);
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, keyRepeatTimeout, scrollBarSize, 1199271174, false, $$c(b2, b3, (byte) (b3 | 12)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).charValue();
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char mode = (char) View.MeasureSpec.getMode(0);
                            int iMyPid = (Process.myPid() >> 22) + 651;
                            int gidForName = 43 - Process.getGidForName("");
                            byte b4 = (byte) ($$a[0] - 1);
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, iMyPid, gidForName, -450685997, false, $$c(b4, b5, (byte) (b5 | 11)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                if (i4 > 0) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i4;
                    char[] cArr4 = new char[i2];
                    System.arraycopy(cArr3, 0, cArr4, 0, i2);
                    System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (z) {
                    int i9 = $10 + 101;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr2 = new char[i2];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    } else {
                        cArr2 = new char[i2];
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    }
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i10 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
                            int iAxisFromString = 43 - MotionEvent.axisFromString("");
                            byte b6 = (byte) ($$a[0] - 1);
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, i10, iAxisFromString, -450685997, false, $$c(b6, b7, (byte) (b7 | 11)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5);
                    }
                    int i11 = $11 + 65;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr2;
                }
                objArr2[0] = new String(cArr3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Class] */
            /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Class[]] */
            /* JADX WARN: Type inference failed for: r8v0 */
            /* JADX WARN: Type inference failed for: r8v1 */
            /* JADX WARN: Type inference failed for: r8v143 */
            /* JADX WARN: Type inference failed for: r8v144 */
            /* JADX WARN: Type inference failed for: r8v145 */
            /* JADX WARN: Type inference failed for: r8v146 */
            /* JADX WARN: Type inference failed for: r8v2 */
            /* JADX WARN: Type inference failed for: r8v4 */
            /* JADX WARN: Type inference failed for: r8v43 */
            /* JADX WARN: Type inference failed for: r8v65 */
            /* JADX WARN: Type inference failed for: r8v67, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r8v68, types: [java.io.ByteArrayInputStream, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Class<java.lang.String>] */
            /* JADX WARN: Type inference failed for: r8v83 */
            /* JADX WARN: Type inference failed for: r8v9 */
            /* JADX WARN: Type inference failed for: r8v91 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] b(android.content.Context r39, int r40, int r41) {
                /*
                    Method dump skipped, instruction units count: 3969
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setTextFuture.b(android.content.Context, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(short r6, int r7, short r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = 4 - r7
                    int r8 = r8 + 108
                    int r6 = r6 * 4
                    int r6 = 1 - r6
                    byte[] r0 = defpackage.setTextFuture.$$a
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r8
                    r5 = r2
                    r8 = r6
                    goto L25
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    r3 = r0[r7]
                L25:
                    int r7 = r7 + 1
                    int r8 = r8 + r3
                    r3 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setTextFuture.$$c(short, int, short):java.lang.String");
            }
        }));
        MaterialButton materialButton2 = activityVerifyOtpByPhoneBinding.btnChangeMethod;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new isBound(new Function1() { // from class: AppCompatTextViewAutoSizeHelper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.TuitionPaymentFragmentbindingInflater1, (View) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return (Unit) VerifyOtpByPhoneActivity.TuitionPaymentFragmentbindingInflater1(AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1850986307, objArr2, -1850986306, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) (31533 - KeyEvent.normalizeMetaState(0));
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 921;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((short) 141, bArr[7], bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, packedPositionType, scrollBarFadeDuration, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(false, 259 - TextUtils.getOffsetAfter("", 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, new char[]{6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_bill_transfer).substring(0, 12).length() + 251, 15 - View.MeasureSpec.makeMeasureSpec(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 27, new char[]{65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionGroup = (char) (31533 - ExpandableListView.getPackedPositionGroup(0L));
            int packedPositionGroup2 = 921 - ExpandableListView.getPackedPositionGroup(0L);
            int i2 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28;
            Object[] objArr5 = new Object[1];
            c((short) 141, (byte) 52, $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, packedPositionGroup2, i2, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = RemoteActionCompatParcelizer + 43;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 31533);
                int gidForName = 920 - Process.getGidForName("");
                int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29;
                Object[] objArr6 = new Object[1];
                c((short) ($$b >>> 1), (byte) 37, $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType2, gidForName, i5, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i6}, (String[]) objArr7[4]};
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i8 = 1953390499 + (((~((-1450736935) | i7)) | 306204964) * 104) + ((~((~i7) | 1467874679)) * (-104)) + ((i7 | 323342709) * 104) + 688855920;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr8 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 148, 26 - (ViewConfiguration.getLongPressTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_credit_card_3).substring(1, 3).codePointAt(0) - 72, new char[]{11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step3).substring(35, 41).codePointAt(3) + 161, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gopay_qris).substring(0, 5).codePointAt(3) - 105, new char[]{65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4}, objArr9);
                baseContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i11 = RemoteActionCompatParcelizer + 73;
                int i12 = i11 % 128;
                getInterfaceDescriptor = i12;
                int i13 = i11 % 2;
                if (baseContext instanceof ContextWrapper) {
                    int i14 = i12 + 111;
                    RemoteActionCompatParcelizer = i14 % 128;
                    int i15 = i14 % 2;
                    if (((ContextWrapper) baseContext).getBaseContext() != null) {
                        baseContext = baseContext.getApplicationContext();
                    } else {
                        baseContext = null;
                    }
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingaddress_empty).substring(18, 19).length() + 257, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_6).substring(3, 4).codePointAt(0) - 101, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, new char[]{65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(false, 263 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_detection_timeout_error).substring(0, 19).length() - 3, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 108, new char[]{19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14}, objArr11);
            try {
                Object[] objArr12 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 688855920};
                byte[] bArr2 = $$j;
                byte b2 = (byte) (-bArr2[5]);
                Object[] objArr13 = new Object[1];
                f(b2, b2, bArr2[18], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b3 = bArr2[18];
                Object[] objArr14 = new Object[1];
                f(b3, b3, (byte) (-bArr2[5]), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 31533);
                    int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 921;
                    int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
                    Object[] objArr16 = new Object[1];
                    c((short) ($$b >>> 1), (byte) 37, $$a[7], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString, packedPositionType3, iLastIndexOf, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellDetailsTitle).substring(0, 7).codePointAt(0) + 191, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_email).substring(0, 5).length() + 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, new char[]{6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f'}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(true, 263 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step5).substring(3, 4).length() + 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2, new char[]{65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
                        int iArgb = Color.argb(0, 0, 0, 0) + 921;
                        int threadPriority = 28 - ((Process.getThreadPriority(0) + 20) >> 6);
                        Object[] objArr19 = new Object[1];
                        c((short) 141, (byte) 52, $$a[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, iArgb, threadPriority, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionChild = (char) (31532 - ExpandableListView.getPackedPositionChild(0L));
                        int scrollBarFadeDuration2 = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iMyPid = (Process.myPid() >> 22) + 28;
                        byte[] bArr3 = $$a;
                        Object[] objArr20 = new Object[1];
                        c((short) 141, bArr3[7], bArr3[80], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, scrollBarFadeDuration2, iMyPid, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[0])[0];
            int i19 = ((int[]) objArr[3])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i19}, (String[]) objArr[4]};
            int i20 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i21 = i18 + 976727173 + (((~(1659693642 | i20)) | 68224017) * (-140)) + ((~(1727917659 | i20)) * 70) + (((~(i20 | 114386001)) | 1681755675) * 70);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr21[0])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i24 = getInterfaceDescriptor + 25;
                RemoteActionCompatParcelizer = i24 % 128;
                int i25 = 2;
                int i26 = i24 % 2;
                int i27 = 0;
                while (i27 < strArr.length) {
                    int i28 = RemoteActionCompatParcelizer + 7;
                    getInterfaceDescriptor = i28 % 128;
                    int i29 = i28 % i25;
                    arrayList.add(strArr[i27]);
                    i27++;
                    i25 = 2;
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            int i30 = ((int[]) objArr[0])[0];
            int i31 = ((int[]) objArr[3])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i31}, (String[]) objArr[4]};
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i33 = ~((-1427415059) | i32);
            int i34 = i30 + (-2084546081) + ((2691337 | i33) * (-476)) + (i33 * 952) + ((~((~i32) | (-1427415059))) * 476);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr22[0])[0] = i36 ^ (i36 << 5);
        }
        activityVerifyOtpByPhoneBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: AppCompatTextViewSuperCallerApi26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, activityVerifyOtpByPhoneBinding, view);
            }
        });
        ((getStringOrNull) this.onTransact.getValue()).INotificationSideChannel = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        ((getStringOrNull) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannel = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("otp");
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.d = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("phone_number");
        if (stringExtra2 == null) {
            int i4 = RemoteActionCompatParcelizer + 81;
            int i5 = i4 % 128;
            getInterfaceDescriptor = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 123;
            RemoteActionCompatParcelizer = i7 % 128;
            int i8 = i7 % 2;
            stringExtra2 = "";
        }
        this.asInterface = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("check_sum");
        Object obj = null;
        if (stringExtra3 == null) {
            int i9 = RemoteActionCompatParcelizer + 89;
            getInterfaceDescriptor = i9 % 128;
            if (i9 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            stringExtra3 = "";
        }
        this.TuitionPaymentFragmentbindingInflater1 = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("resend_check_sum");
        if (stringExtra4 == null) {
            int i10 = RemoteActionCompatParcelizer + 81;
            getInterfaceDescriptor = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } else {
            str = stringExtra4;
        }
        this.g = str;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        VerifyOtpByPhoneActivity verifyOtpByPhoneActivity = this;
        ((forLanguageTags) this.asBinder.getValue()).b.observe(verifyOtpByPhoneActivity, new Observer() { // from class: AppCompatTextViewSuperCaller
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                VerifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((forLanguageTags) this.asBinder.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(verifyOtpByPhoneActivity, new Observer() { // from class: AppCompatTextViewSuperCallerApi28
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                VerifyOtpByPhoneActivity.b(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((IntegerRes) this.notify.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(verifyOtpByPhoneActivity, new Observer() { // from class: setLineHeight
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                VerifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = getInterfaceDescriptor + 17;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, blocks: (B:5:0x0016, B:17:0x0048, B:15:0x003d, B:16:0x0045, B:11:0x0029), top: B:21:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:5:0x0016, B:17:0x0048, B:15:0x003d, B:16:0x0045, B:11:0x0029), top: B:21:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        int i;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 7;
        RemoteActionCompatParcelizer = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(item);
                Intrinsics.checkNotNullParameter(item, "");
                int i4 = 59 / 0;
                if (item.getItemId() == 16908332) {
                    i = RemoteActionCompatParcelizer + 17;
                    getInterfaceDescriptor = i % 128;
                    if (i % 2 != 0) {
                        onBackPressed();
                        int i5 = 42 / 0;
                    } else {
                        onBackPressed();
                    }
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(item);
                Intrinsics.checkNotNullParameter(item, "");
                if (item.getItemId() == 16908332) {
                    i = RemoteActionCompatParcelizer + 17;
                    getInterfaceDescriptor = i % 128;
                    if (i % 2 != 0) {
                        onBackPressed();
                        int i6 = 42 / 0;
                    } else {
                        onBackPressed();
                    }
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i5 = ~iElapsedRealtime;
        if (i4 != 1837252896 + (((~((-1614717139) | i5)) | 784729595) * (-328)) + ((iElapsedRealtime | 784729595) * 164) + (((~(iElapsedRealtime | 1614717138)) | 247465257 | (~(i5 | (-1077452801)))) * 164)) {
            int i6 = (-448448816) % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i8 = (~((-587892767) | iIdentityHashCode)) | 571115550;
        if (i7 != (-1027415268) + (i8 * 992) + ((i8 | (~((~iIdentityHashCode) | 2007940414))) * (-496)) + ((iIdentityHashCode | 1991163198) * 496)) {
            throw new RuntimeException("-1208131518");
        }
        super.onResume();
        getCameraCharacteristic getcameracharacteristic = this.b;
        if (getcameracharacteristic == null) {
            int i9 = getInterfaceDescriptor + 11;
            RemoteActionCompatParcelizer = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getcameracharacteristic.b();
        int i11 = RemoteActionCompatParcelizer + 25;
        getInterfaceDescriptor = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        super.onStop();
        getCameraCharacteristic getcameracharacteristic = this.b;
        if (getcameracharacteristic == null) {
            int i2 = RemoteActionCompatParcelizer + 53;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                int i4 = 16 / 0;
            }
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i5 = getInterfaceDescriptor + 71;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.b;
        if (getcameracharacteristic == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i4 = RemoteActionCompatParcelizer + 63;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                int i5 = 34 / 0;
            } else {
                tuitionPaymentFragmentbindingInflater1.cancel();
            }
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String strD;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 115;
        RemoteActionCompatParcelizer = i2 % 128;
        getCameraCharacteristic getcameracharacteristic = null;
        if (i2 % 2 == 0) {
            ((IntegerRes) this.notify.getValue()).b();
            TextView textView = ((ActivityVerifyOtpByPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvPhone;
            getcameracharacteristic.hashCode();
            throw null;
        }
        ((IntegerRes) this.notify.getValue()).b();
        TextView textView2 = ((ActivityVerifyOtpByPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvPhone;
        try {
            String str = this.asInterface;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str = null;
            }
            strD = Camera2CameraControlExternalSyntheticLambda5.d(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str));
        } catch (Exception unused) {
        }
        textView2.setText(strD);
        ((ActivityVerifyOtpByPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.setCursorVisible(true);
        getCameraCharacteristic getcameracharacteristic2 = this.b;
        if (getcameracharacteristic2 == null) {
            int i3 = getInterfaceDescriptor + 5;
            RemoteActionCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = RemoteActionCompatParcelizer + 1;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
        } else {
            getcameracharacteristic = getcameracharacteristic2;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        VerifyOtpByPhoneActivity verifyOtpByPhoneActivity = this;
        Intrinsics.checkNotNullParameter(verifyOtpByPhoneActivity, "");
        verifyOtpByPhoneActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityVerifyOtpByPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityVerifyOtpByPhoneBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_phone_number));
        int i4 = RemoteActionCompatParcelizer + 5;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        VerifyOtpByPhoneActivity verifyOtpByPhoneActivity = (VerifyOtpByPhoneActivity) objArr[0];
        int i = 2 % 2;
        verifyOtpByPhoneActivity.b = new getCameraCharacteristic(((ActivityVerifyOtpByPhoneBinding) ((ViewBinding) verifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, 0 == true ? 1 : 0);
        int i2 = getInterfaceDescriptor + 23;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int mirror = AndroidCharacter.getMirror('0') + 983;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
            short s = (short) 52;
            Object[] objArr2 = new Object[1];
            c(s, (byte) s, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, mirror, scrollBarFadeDuration, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_cannot_proccessed).substring(0, 6).length() + 253, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, new char[]{6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_payment).substring(6, 7).codePointAt(0) + 148, ExpandableListView.getPackedPositionType(0L) + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_alfamart).substring(0, 8).length() + 1, new char[]{65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int touchSlop = 1031 - (ViewConfiguration.getTouchSlop() >> 8);
            int maximumDrawingCacheSize = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            Object[] objArr5 = new Object[1];
            c((short) 141, (byte) 52, $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, touchSlop, maximumDrawingCacheSize, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = RemoteActionCompatParcelizer + 87;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1031;
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                c((short) 141, bArr[7], bArr[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iKeyCodeFromString, fadingEdgeLength, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i6 = (((1267539021 + (((~(startElapsedRealtime | 139963512)) | (-104316658)) * (-668))) + ((139963512 | (~((-104316658) | startElapsedRealtime))) * 1336)) + ((startElapsedRealtime | (-102765186)) * 668)) - 801020942;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
            int i9 = RemoteActionCompatParcelizer + 21;
            getInterfaceDescriptor = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 142, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 100, new char[]{65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indosat_instruction_step4).substring(60, 62).length() + 260, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_5).substring(16, 17).length() + 15, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8, new char[]{19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-948326100};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - Color.argb(0, 0, 0, 0)), 1135 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -801020942, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                    int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
                    int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
                    short s2 = (short) 52;
                    Object[] objArr12 = new Object[1];
                    c(s2, (byte) s2, $$a[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i11, absoluteGravity, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.getOffsetAfter("", 0)), 1117 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int windowTouchSlop2 = 1031 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iResolveSize = 15 - View.resolveSize(0, 0);
                    byte[] bArr2 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((short) 141, bArr2[7], bArr2[80], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, windowTouchSlop2, iResolveSize, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 223, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_confirm_shopeepay_qr_scan_tablet).substring(12, 17).codePointAt(1) - 15, new char[]{6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f'}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(true, 262 - TextUtils.lastIndexOf("", '0'), 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 10 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                        int iCombineMeasuredStates = 15 - View.combineMeasuredStates(0, 0);
                        Object[] objArr16 = new Object[1];
                        c((short) 141, (byte) 52, $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel2, edgeSlop, iCombineMeasuredStates, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
                        short s3 = (short) 52;
                        Object[] objArr17 = new Object[1];
                        c(s3, (byte) s3, $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMakeMeasureSpec, packedPositionGroup, iIndexOf, 1357589585, false, (String) objArr17[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                int i14 = getInterfaceDescriptor + 67;
                RemoteActionCompatParcelizer = i14 % 128;
                int i15 = i14 % 2 != 0 ? 0 : 1;
                while (i15 < strArr2.length) {
                    int i16 = RemoteActionCompatParcelizer + 31;
                    getInterfaceDescriptor = i16 % 128;
                    if (i16 % 2 != 0) {
                        arrayList.add(strArr2[i15]);
                        i15 += 79;
                    } else {
                        arrayList.add(strArr2[i15]);
                        i15++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode;
        int i21 = i17 + (-1123505559) + ((iIdentityHashCode | 205856865) * 988) + (((~(207955043 | i20)) | 34226948) * (-1976)) + (((~(iIdentityHashCode | (-36325127))) | 205856865 | (~(36325126 | i20))) * 988);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        int i24 = RemoteActionCompatParcelizer + 79;
        getInterfaceDescriptor = i24 % 128;
        int i25 = i24 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
            int i26 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int iRgb = (-16777193) - Color.rgb(0, 0, 0);
            Object[] objArr19 = new Object[1];
            c((short) ($$b >>> 1), (byte) 37, $$a[7], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(tapTimeout, i26, iRgb, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i27 = RemoteActionCompatParcelizer + 63;
            getInterfaceDescriptor = i27 % 128;
            int i28 = i27 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                int i29 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                int minimumFlingVelocity = 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr20 = new Object[1];
                c((short) 141, (byte) 52, $$a[7], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetBefore, i29, minimumFlingVelocity, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i30 = ~iIdentityHashCode2;
            int i31 = (-1963303222) + (((~(i30 | (-192505608))) | 405108033) * (-1042)) + (((-192505608) | iIdentityHashCode2) * 521) + (((~(iIdentityHashCode2 | (-405108034))) | 268701760 | (~(i30 | (-56099335)))) * 521) + 1596279365;
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i33 ^ (i33 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 222, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, 7 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_1).substring(30, 31).length() + 261, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 91, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2, new char[]{19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {-948326100};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 42049), 1725 - TextUtils.indexOf((CharSequence) "", '0'), 29 - (ViewConfiguration.getPressedStateDuration() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1596279365);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char windowTouchSlop3 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                int minimumFlingVelocity2 = 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iResolveOpacity = 23 - Drawable.resolveOpacity(0, 0);
                Object[] objArr25 = new Object[1];
                c((short) 141, (byte) 52, $$a[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(windowTouchSlop3, minimumFlingVelocity2, iResolveOpacity, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                e(false, Color.alpha(0) + 259, 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_title_text).substring(0, 20).length() - 3, new char[]{6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f'}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 227, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.offer_not_applied).substring(8, 9).codePointAt(0) - 85, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_6).substring(0, 1).codePointAt(0) - 71, new char[]{65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29945);
                    int iNormalizeMetaState = 1755 - KeyEvent.normalizeMetaState(0);
                    int offsetAfter = 23 - TextUtils.getOffsetAfter("", 0);
                    byte b2 = $$a[7];
                    short s4 = b2;
                    Object[] objArr28 = new Object[1];
                    c(s4, (byte) (s4 | 52), b2, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, iNormalizeMetaState, offsetAfter, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cBlue = (char) (29944 - Color.blue(0));
                    int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 23;
                    Object[] objArr29 = new Object[1];
                    c((short) ($$b >>> 1), (byte) 37, $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cBlue, iLastIndexOf, trimmedLength, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i34 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i35 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i35 != i34) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr4 != null) {
                int i36 = RemoteActionCompatParcelizer + 3;
                getInterfaceDescriptor = i36 % 128;
                int i37 = i36 % 2;
                for (String str : strArr4) {
                    arrayList2.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i35));
        }
        int i38 = RemoteActionCompatParcelizer + 71;
        getInterfaceDescriptor = i38 % 128;
        int i39 = i38 % 2;
        int i40 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingcity_empty).substring(15, 16).length() - 1531248206;
        int i41 = i40 + 370336724 + (((-537013249) | length) * (-627)) + (((~(673852938 | length)) | 886455364) * (-627)) + (((~(length | 886455364)) | (~((~length) | (-673852939)))) * 627);
        int i42 = (i41 << 13) ^ i41;
        int i43 = i42 ^ (i42 >>> 17);
        ((int[]) objArr30[3])[0] = i43 ^ (i43 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i4 = (-91803812) + (((-1319069050) | iElapsedRealtime) * 614);
            int i5 = ~iElapsedRealtime;
            if (i3 != i4 + (((~((-246640596) | i5)) | 2099842 | (~((-1076628139) | i5))) * (-1228)) + (((~(i5 | (-1074528297))) | (~((-244540754) | i5))) * 614)) {
                throw null;
            }
        } else {
            int i6 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = 1861282852 + ((iIdentityHashCode | 642711083) * (-50));
            int i8 = ~((-537421354) | iIdentityHashCode);
            int i9 = ~iIdentityHashCode;
            if (i6 != i7 + ((i8 | (~(2010119979 | i9))) * 50) + (((~(i9 | 642711083)) | (~(1472698626 | i9)) | (-2010119980)) * 50)) {
                throw null;
            }
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i11 = ~(((int) Process.getStartUptimeMillis()) | 1990347261);
        if (i10 != ((2140474688 + (((-588708704) | i11) * (-220))) + ((i11 | (-2008480768)) * 220)) - 744177252) {
            int i12 = (-1055252686) % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i13 = RemoteActionCompatParcelizer + 111;
        getInterfaceDescriptor = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d6, code lost:
    
        if (r1 != (((((1476534866 | r3) | (~(560848265 | r2))) * (-338)) - 863332960) + (((~(r2 | 2037383131)) | r3) * 338))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d8, code lost:
    
        super.onCreate(r12);
        r12 = com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity.RemoteActionCompatParcelizer + 71;
        com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity.getInterfaceDescriptor = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e5, code lost:
    
        r12 = 2100981450 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ee, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ef, code lost:
    
        r12 = (-708416118) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f8, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006a, code lost:
    
        if (r1 == (((1326546986 + ((((~((-244319531) | r5)) | (~((-807422469) | r4))) | (~(2126049071 | r4))) * 765)) + (((~((-1051741999) | r5)) | 244319530) * 1530)) + (((~(r4 | (-1051741999))) | (~(r5 | 2126049071))) * 765))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a7, code lost:
    
        if (r1 == (((1986002720 + ((~((-831259352) | r4)) * (-301))) + (((~(902596351 | r4)) | (~((~r4) | 72608808))) * (-301))) + (((~(r4 | (-72608809))) | 902596351) * 301))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a9, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = android.os.Process.myUid();
        r3 = ~((-560848266) | (~r2));
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        VerifyOtpByPhoneActivity verifyOtpByPhoneActivity = (VerifyOtpByPhoneActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = verifyOtpByPhoneActivity.getString(R.string.label_information);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = verifyOtpByPhoneActivity.getString(R.string.label_exception_otp_verification);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = verifyOtpByPhoneActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, string, string2, string3, null, 112);
        int i4 = getInterfaceDescriptor + 57;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return getstringornullB;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityVerifyOtpByPhoneBinding activityVerifyOtpByPhoneBinding, VerifyOtpByPhoneActivity verifyOtpByPhoneActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            OtpView otpView = activityVerifyOtpByPhoneBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, verifyOtpByPhoneActivity);
        } else {
            OtpView otpView2 = activityVerifyOtpByPhoneBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView2, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView2, verifyOtpByPhoneActivity);
            int i3 = 96 / 0;
        }
    }

    public static /* synthetic */ getStringOrNull b(VerifyOtpByPhoneActivity verifyOtpByPhoneActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = verifyOtpByPhoneActivity.getString(R.string.label_code_doesnt_match);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = verifyOtpByPhoneActivity.getString(R.string.label_code_doesnt_match_message);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = verifyOtpByPhoneActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, string, string2, string3, null, 112);
        int i4 = getInterfaceDescriptor + 39;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return getstringornullB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerifyOtpByPhoneActivity verifyOtpByPhoneActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        verifyOtpByPhoneActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 37;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerifyOtpByPhoneActivity verifyOtpByPhoneActivity, ActivityVerifyOtpByPhoneBinding activityVerifyOtpByPhoneBinding, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        String str2 = null;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            str.length();
            String str3 = verifyOtpByPhoneActivity.d;
            throw null;
        }
        int length = str.length();
        String str4 = verifyOtpByPhoneActivity.d;
        if (str4 == null) {
            int i4 = RemoteActionCompatParcelizer + 35;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str2 = str4;
        }
        if (length < str2.length()) {
            MaterialButton materialButton = activityVerifyOtpByPhoneBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(false);
        } else {
            MaterialButton materialButton3 = activityVerifyOtpByPhoneBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(true);
            int i5 = getInterfaceDescriptor + 115;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(VerifyOtpByPhoneActivity verifyOtpByPhoneActivity, ActivityVerifyOtpByPhoneBinding activityVerifyOtpByPhoneBinding, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_validation_otp_forgot_account_by_phone", "validation_otp_forgot_account_by_phone"));
        Intrinsics.checkNotNullParameter(verifyOtpByPhoneActivity, "");
        Intrinsics.checkNotNullParameter("validation_otp_forgot_account_by_phone", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("validation_otp_forgot_account_by_phone", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("validation_otp_forgot_account_by_phone", mapMutableMapOf);
        int i2 = verifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = null;
        if (i2 < 3) {
            verifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 + 1;
            forLanguageTags forlanguagetags = (forLanguageTags) verifyOtpByPhoneActivity.asBinder.getValue();
            String str2 = verifyOtpByPhoneActivity.asInterface;
            if (str2 == null) {
                int i3 = getInterfaceDescriptor + 105;
                RemoteActionCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            }
            String strValueOf = String.valueOf(activityVerifyOtpByPhoneBinding.otpVerify.getText());
            String str3 = verifyOtpByPhoneActivity.TuitionPaymentFragmentbindingInflater1;
            if (str3 == null) {
                int i5 = getInterfaceDescriptor + 111;
                RemoteActionCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str = str3;
            }
            forlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ValidationOtpRequest(str2, strValueOf, str));
        } else {
            Lazy lazy = LazyKt.lazy(new setTypeface(verifyOtpByPhoneActivity));
            getStringOrNull getstringornull = (getStringOrNull) lazy.getValue();
            FragmentManager supportFragmentManager = verifyOtpByPhoneActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i7 = getInterfaceDescriptor + 69;
                RemoteActionCompatParcelizer = i7 % 128;
                if (i7 % 2 == 0) {
                    getstringornull.show(supportFragmentManager, getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    str.hashCode();
                    throw null;
                }
                getstringornull.show(supportFragmentManager, getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ((getStringOrNull) lazy.getValue()).INotificationSideChannel = verifyOtpByPhoneActivity.new b();
            int i8 = RemoteActionCompatParcelizer + 105;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063 A[PHI: r1
  0x0063: PHI (r1v18 java.lang.Object) = (r1v17 java.lang.Object), (r1v25 java.lang.Object) binds: [B:14:0x0061, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void b(final VerifyOtpByPhoneActivity verifyOtpByPhoneActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        Object obj;
        String str2;
        int i = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            String str3 = null;
            if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
                int i2 = RemoteActionCompatParcelizer + 25;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                verifyOtpByPhoneActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                List listSplit$default = StringsKt.split$default((CharSequence) String.valueOf(((ValidationOtp) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3), new String[]{"#"}, false, 0, 6, (Object) null);
                if (Intrinsics.areEqual(listSplit$default.get(0), Constants.STATUS_CODE_200)) {
                    int i4 = getInterfaceDescriptor + 81;
                    RemoteActionCompatParcelizer = i4 % 128;
                    if (i4 % 2 == 0) {
                        obj = listSplit$default.get(5);
                        str2 = verifyOtpByPhoneActivity.INotificationSideChannel;
                        if (str2 == null) {
                            int i5 = getInterfaceDescriptor + 101;
                            RemoteActionCompatParcelizer = i5 % 128;
                            int i6 = i5 % 2;
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str2 = null;
                        }
                    } else {
                        obj = listSplit$default.get(2);
                        str2 = verifyOtpByPhoneActivity.INotificationSideChannel;
                        if (str2 == null) {
                            int i7 = getInterfaceDescriptor + 101;
                            RemoteActionCompatParcelizer = i7 % 128;
                            int i8 = i7 % 2;
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str2 = null;
                        }
                    }
                    if (Intrinsics.areEqual(obj, str2)) {
                        ResetPasswordByPhoneActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = ResetPasswordByPhoneActivity.INSTANCE;
                        VerifyOtpByPhoneActivity verifyOtpByPhoneActivity2 = verifyOtpByPhoneActivity;
                        String str4 = verifyOtpByPhoneActivity.asInterface;
                        if (str4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            int i9 = getInterfaceDescriptor + 105;
                            RemoteActionCompatParcelizer = i9 % 128;
                            int i10 = i9 % 2;
                        } else {
                            str3 = str4;
                        }
                        ResetPasswordByPhoneActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(verifyOtpByPhoneActivity2, str3, StringsKt.trim((CharSequence) String.valueOf(((ActivityVerifyOtpByPhoneBinding) ((ViewBinding) verifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getText())).toString(), String.valueOf(((ValidationOtp) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1));
                    } else {
                        String string = verifyOtpByPhoneActivity.getString(R.string.error_signature_checking);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(verifyOtpByPhoneActivity, string, "OK, Coba Kembali", new Function0() { // from class: setCompoundDrawablesWithIntrinsicBounds
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return VerifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
                            }
                        });
                    }
                    verifyOtpByPhoneActivity.d_();
                } else {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(verifyOtpByPhoneActivity, "Error", new Function0() { // from class: setTextMetricsParamsCompat
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return VerifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        }
                    });
                }
                str = "success_validation_otp_forgot_account_by_phone";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                verifyOtpByPhoneActivity.IconCompatParcelizer();
                ((ActivityVerifyOtpByPhoneBinding) ((ViewBinding) verifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(verifyOtpByPhoneActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                str = "failure_validation_otp_forgot_account_by_phone";
            } else {
                str = "";
            }
        } else {
            int i11 = getInterfaceDescriptor + 107;
            RemoteActionCompatParcelizer = i11 % 128;
            int i12 = i11 % 2;
            verifyOtpByPhoneActivity.MediaBrowserCompat();
            str = "loading_validation_otp_forgot_account_by_phone";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_validation_otp_phone_forgot_account", str));
        Intrinsics.checkNotNullParameter(verifyOtpByPhoneActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(VerifyOtpByPhoneActivity verifyOtpByPhoneActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        int i3 = i2 % 128;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i5 = i3 + 121;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            verifyOtpByPhoneActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            verifyOtpByPhoneActivity.IconCompatParcelizer();
            verifyOtpByPhoneActivity.INotificationSideChannel = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            verifyOtpByPhoneActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(verifyOtpByPhoneActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
    }

    public static /* synthetic */ getStringOrNull TuitionPaymentFragmentbindingInflater1(VerifyOtpByPhoneActivity verifyOtpByPhoneActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = verifyOtpByPhoneActivity.getString(R.string.label_code_sent_successfully);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = verifyOtpByPhoneActivity.getString(R.string.label_check_email_for_verification);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = verifyOtpByPhoneActivity.getString(R.string.action_ok_thanks);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, string, string2, string3, null, 112);
        int i4 = RemoteActionCompatParcelizer + 125;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return getstringornullB;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerifyOtpByPhoneActivity verifyOtpByPhoneActivity, ActivityVerifyOtpByPhoneBinding activityVerifyOtpByPhoneBinding, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_resend_otp_forgot_account_by_phone", "resend_otp_forgot_account_by_phone"));
            Intrinsics.checkNotNullParameter(verifyOtpByPhoneActivity, "");
            Intrinsics.checkNotNullParameter("resend_otp_forgot_account_by_phone", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("resend_otp_forgot_account_by_phone", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("resend_otp_forgot_account_by_phone", mapMutableMapOf);
            activityVerifyOtpByPhoneBinding.otpVerify.getEditableText().clear();
            forLanguageTags forlanguagetags = (forLanguageTags) verifyOtpByPhoneActivity.asBinder.getValue();
            String str = verifyOtpByPhoneActivity.asInterface;
            String str2 = null;
            if (str == null) {
                int i2 = getInterfaceDescriptor + 115;
                RemoteActionCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = getInterfaceDescriptor + 107;
                RemoteActionCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
                str = null;
            }
            String str3 = verifyOtpByPhoneActivity.g;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str2 = str3;
            }
            forlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, str2);
            ViewPortBuilder.b();
            int i6 = getInterfaceDescriptor + 75;
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(VerifyOtpByPhoneActivity verifyOtpByPhoneActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            verifyOtpByPhoneActivity.finish();
            unit = Unit.INSTANCE;
            int i3 = 36 / 0;
        } else {
            verifyOtpByPhoneActivity.finish();
            unit = Unit.INSTANCE;
        }
        int i4 = RemoteActionCompatParcelizer + 87;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerifyOtpByPhoneActivity verifyOtpByPhoneActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = RemoteActionCompatParcelizer + 47;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            verifyOtpByPhoneActivity.MediaBrowserCompat();
            str = "loading_resend_code_forgot_account_by_phone";
        } else {
            getCameraCharacteristic getcameracharacteristic = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i4 = getInterfaceDescriptor + 101;
                RemoteActionCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
                verifyOtpByPhoneActivity.IconCompatParcelizer();
                getCameraCharacteristic getcameracharacteristic2 = verifyOtpByPhoneActivity.b;
                if (getcameracharacteristic2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    getcameracharacteristic = getcameracharacteristic2;
                }
                getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                verifyOtpByPhoneActivity.TuitionPaymentFragmentbindingInflater1 = String.valueOf(((ForgotPasswordItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum());
                verifyOtpByPhoneActivity.d = String.valueOf(((ForgotPasswordItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getOtp());
                str = "success_resend_code_forgot_account_by_phone";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i6 = RemoteActionCompatParcelizer + 107;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                verifyOtpByPhoneActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(verifyOtpByPhoneActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                ((ActivityVerifyOtpByPhoneBinding) ((ViewBinding) verifyOtpByPhoneActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                str = "failure_resend_code_forgot_account_by_phone";
            } else {
                str = "";
            }
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_resend_otp_result", str));
        Intrinsics.checkNotNullParameter(verifyOtpByPhoneActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = i5 | i6;
        int i8 = ~i4;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = (~(i6 | i8)) | (~(i9 | i5));
        int i12 = i5 + i4 + i3 + (1389894630 * i2) + ((-1243605516) * i);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i5) + 1335230464 + (862422157 * i4) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i3) + (1607991296 * i2) + ((-548405248) * i) + ((-1553596416) * i13);
        int i15 = ((i5 * (-88671125)) - 261777699) + (i4 * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i3 * (-88671137)) + (i2 * (-349388198)) + (i * (-147040884)) + (i13 * 182059008);
        int i16 = i14 + (i15 * i15 * (-132513792));
        if (i16 != 1) {
            if (i16 == 2) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            }
            if (i16 == 3) {
                return TuitionPaymentFragmentbindingInflater1(objArr);
            }
            if (i16 == 4) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            }
            int i17 = 2 % 2;
            int i18 = RemoteActionCompatParcelizer;
            int i19 = i18 + 37;
            getInterfaceDescriptor = i19 % 128;
            int i20 = i19 % 2;
            int i21 = i18 + 79;
            getInterfaceDescriptor = i21 % 128;
            int i22 = i21 % 2;
            return Integer.valueOf(R.layout.activity_verify_otp_by_phone);
        }
        VerifyOtpByPhoneActivity verifyOtpByPhoneActivity = (VerifyOtpByPhoneActivity) objArr[0];
        int i23 = 2 % 2;
        Intrinsics.checkNotNullParameter((View) objArr[1], "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_change_method_otp_forgot_account_by_phone", "change_method_otp_forgot_account_by_phone"));
        Intrinsics.checkNotNullParameter(verifyOtpByPhoneActivity, "");
        Intrinsics.checkNotNullParameter("change_method_otp_forgot_account_by_phone", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("change_method_otp_forgot_account_by_phone", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("change_method_otp_forgot_account_by_phone", mapMutableMapOf);
        verifyOtpByPhoneActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i24 = RemoteActionCompatParcelizer + 19;
        getInterfaceDescriptor = i24 % 128;
        int i25 = i24 % 2;
        return unit;
    }

    public static /* synthetic */ getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault1(VerifyOtpByPhoneActivity verifyOtpByPhoneActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (getStringOrNull) TuitionPaymentFragmentbindingInflater1(AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1204916290, new Object[]{verifyOtpByPhoneActivity}, 1204916292, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public static /* synthetic */ Unit b(VerifyOtpByPhoneActivity verifyOtpByPhoneActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentbindingInflater1(AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1850986307, new Object[]{verifyOtpByPhoneActivity, view}, -1850986306, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static {
        IconCompatParcelizer = 1;
        d();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentbindingInflater1(null);
        int i = INotificationSideChannelDefault + 25;
        IconCompatParcelizer = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 428727482, new Object[]{this}, -428727482, iTuitionPaymentFragmentspecialinlinedviewModeldefault2)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 459556778, new Object[]{this}, -459556774, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AutocompleteUiCustomization.Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(lambdagetPreviewBitmap1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1906102896, new Object[]{this}, -1906102893, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static void d() {
        INotificationSideChannelStub = -83722302;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        VerifyOtpByPhoneActivity verifyOtpByPhoneActivity = (VerifyOtpByPhoneActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return null;
        }
        int i4 = 4 / 0;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, int r8) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity.$$c
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 + 119
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L29:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity.$$i(short, int, int):java.lang.String");
    }
}
