package com.bpjstku.presentation.membership.forgotpassword.verifyotp;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
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
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.user.model.request.ValidationOtpRequest;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.databinding.ActivityVerifyOtpBinding;
import com.bpjstku.domain.user.model.ValidationOtp;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.membership.forgotpassword.reset.ResetPasswordActivity;
import com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import com.midtrans.sdk.corekit.core.Constants;
import com.mukesh.OtpView;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.IntegerRes;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.cleanupAutoSizePresetSizes;
import defpackage.forLanguageTags;
import defpackage.getCameraCharacteristic;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getStringOrNull;
import defpackage.hasCameraTransform;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.notifyStateAttached;
import defpackage.onBackCompletedFallback;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001DB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u00102\u001a\u000203H\u0014J\b\u00104\u001a\u000203H\u0014J\b\u00105\u001a\u000203H\u0014J\b\u00106\u001a\u000203H\u0014J\b\u00107\u001a\u000203H\u0014J\b\u00108\u001a\u000203H\u0014J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u000203H\u0014J\b\u0010>\u001a\u000203H\u0014J\b\u0010?\u001a\u000203H\u0014J\u0006\u0010@\u001a\u000203J\u0012\u0010A\u001a\u0002032\b\u0010B\u001a\u0004\u0018\u00010CH\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00020+8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020)8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006E²\u0006\n\u0010F\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"Lcom/bpjstku/presentation/membership/forgotpassword/verifyotp/VerifyOtpActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVerifyOtpBinding;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "successDialog", "Lcom/bpjstku/presentation/membership/registration/ProcessResultDialogFragment;", "getSuccessDialog", "()Lcom/bpjstku/presentation/membership/registration/ProcessResultDialogFragment;", "successDialog$delegate", "Lkotlin/Lazy;", "failedDialog", "getFailedDialog", "failedDialog$delegate", "serverSignature", "", "settingViewModel", "Lcom/bpjstku/presentation/account/setting/SettingViewModel;", "getSettingViewModel", "()Lcom/bpjstku/presentation/account/setting/SettingViewModel;", "settingViewModel$delegate", "countDownTimerUtil", "Lcom/bpjstku/util/utils/CountDownTimerUtil;", "forgotPasswordViewModel", "Lcom/bpjstku/presentation/membership/forgotpassword/inputemail/ForgotPasswordViewModel;", "getForgotPasswordViewModel", "()Lcom/bpjstku/presentation/membership/forgotpassword/inputemail/ForgotPasswordViewModel;", "forgotPasswordViewModel$delegate", "forgotPasswordByPhoneViewModel", "Lcom/bpjstku/presentation/membership/forgotaccount/inputnik/ForgotPasswordByPhoneViewModel;", "getForgotPasswordByPhoneViewModel", "()Lcom/bpjstku/presentation/membership/forgotaccount/inputnik/ForgotPasswordByPhoneViewModel;", "forgotPasswordByPhoneViewModel$delegate", "otp", "email", "checkSum", "resendCheckSum", "responseChecksum", "myContext", "countVerificationOtp", "", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "getBindingInflater", "()Lkotlin/jvm/functions/Function1;", "layoutResource", "getLayoutResource", "()I", "initLib", "", "initIntent", "initUI", "initAction", "initProcess", "initObservers", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "onStop", "onDestroy", "getTimeServer", "onClick", "v", "Landroid/view/View;", "Companion", "app_release", "exceptionDialog"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyOtpActivity extends BindingBaseActivity<ActivityVerifyOtpBinding> implements View.OnClickListener {
    private static int INotificationSideChannelDefault;
    private static int[] INotificationSideChannelStub;
    public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private getCameraCharacteristic TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f522a;
    private String asBinder;
    private final Lazy asInterface;
    private String b;
    private final Lazy cancel;
    private String cancelAll;
    private final Lazy g;
    private String onTransact;
    private static final byte[] $$c = {90, 46, 113, 8};
    private static final int $$f = 123;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {39, 27, 2, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 40;
    private static int IconCompatParcelizer = 1;
    private static int getInterfaceDescriptor = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private final Lazy INotificationSideChannel = LazyKt.lazy(new Function0() { // from class: AppCompatToggleButton
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VerifyOtpActivity.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: setAllowStacking
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VerifyOtpActivity.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });
    private String notify = "";

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i3)) | (~(i5 | i3));
        int i9 = i5 | i2;
        int i10 = (~(i2 | (~i3))) | (~(i7 | (~i5))) | (~i9);
        int i11 = i5 + i3 + i4 + (1350191703 * i) + ((-44904237) * i6);
        int i12 = i11 * i11;
        int i13 = ((i5 * (-560584373)) - 948043776) + ((-560584373) * i3) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i4) + ((-71041024) * i) + ((-766246912) * i6) + (1339949056 * i12);
        int i14 = (i5 * 1657715387) + 2046152777 + (i3 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i4 * 1657716305) + (i * 1507858311) + (i6 * 1845144771) + (i12 * 155058176);
        int i15 = i13 + (i14 * i14 * 417464320);
        if (i15 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i15 == 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i15 != 3) {
            return i15 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = 53 - r7
            byte[] r0 = com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity.$$a
            int r8 = 196 - r8
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity.c(byte, short, byte, java.lang.Object[]):void");
    }

    public VerifyOtpActivity() {
        final VerifyOtpActivity verifyOtpActivity = this;
        this.cancel = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = verifyOtpActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final VerifyOtpActivity verifyOtpActivity2 = this;
        this.g = LazyKt.lazy(new Function0<cleanupAutoSizePresetSizes>() { // from class: com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, cleanupAutoSizePresetSizes] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ cleanupAutoSizePresetSizes invoke() {
                LifecycleOwner lifecycleOwner = verifyOtpActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cleanupAutoSizePresetSizes.class);
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
        this.asInterface = LazyKt.lazy(new Function0<forLanguageTags>() { // from class: com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, forLanguageTags] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ forLanguageTags invoke() {
                LifecycleOwner lifecycleOwner = verifyOtpActivity2;
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lcom/bpjstku/presentation/membership/forgotpassword/verifyotp/VerifyOtpActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "otp", "", "email", "resendCheckSum", "checkSum", "myContext", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context context, String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, VerifyOtpActivity.class, new Pair[]{TuplesKt.to("otp", str), TuplesKt.to("email", str2), TuplesKt.to("check_sum", str4), TuplesKt.to("mycontext", str5), TuplesKt.to("resend_check_sum", str3)});
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVerifyOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        VerifyOtpActivity$bindingInflater$1 verifyOtpActivity$bindingInflater$1 = VerifyOtpActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return verifyOtpActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.TuitionPaymentFragmentbindingInflater1 = new getCameraCharacteristic(((ActivityVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, null);
        int i2 = RemoteActionCompatParcelizer + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        String stringExtra = getIntent().getStringExtra("otp");
        if (stringExtra == null) {
            int i2 = getInterfaceDescriptor + 121;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            stringExtra = "";
        }
        this.f522a = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("email");
        if (stringExtra2 == null) {
            int i4 = getInterfaceDescriptor + 31;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            stringExtra2 = "";
        }
        this.b = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("check_sum");
        if (stringExtra3 == null) {
            int i6 = RemoteActionCompatParcelizer + 95;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            stringExtra3 = "";
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("mycontext");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.asBinder = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("resend_check_sum");
        this.onTransact = stringExtra5 != null ? stringExtra5 : "";
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        VerifyOtpActivity verifyOtpActivity = this;
        Intrinsics.checkNotNullParameter(verifyOtpActivity, "");
        verifyOtpActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_email_verification));
        int i4 = RemoteActionCompatParcelizer + 5;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getStringOrNull.b {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            VerifyOtpActivity.this.d_();
        }
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = INotificationSideChannelStub;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 83;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr2[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i6;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 3290 - TextUtils.lastIndexOf("", '0', i6), 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1948206109, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    i4 = -1870535734;
                    i6 = 0;
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
        int[] iArr5 = INotificationSideChannelStub;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = $11 + 27;
            $10 = i10 % 128;
            int i11 = 2;
            int i12 = i10 % 2;
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $11 + 19;
                $10 = i14 % 128;
                int i15 = i14 % i11;
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr5[i13]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 3291 - TextUtils.getOffsetBefore("", 0), 31 - ExpandableListView.getPackedPositionType(0L), 1948206109, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i13++;
                iArr5 = iArr5;
                i5 = 1;
                i11 = 2;
            }
            iArr5 = iArr6;
        }
        char c = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i16 = $11 + 31;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 17;
            while (i18 > 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i18];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2559 - Color.blue(0), View.MeasureSpec.getSize(0) + 29, 683220507, false, $$i(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i18--;
                int i19 = $11 + 59;
                $10 = i19 % 128;
                int i20 = i19 % 2;
            }
            int i21 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i22 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - Drawable.resolveOpacity(0, 0)), 348 - ExpandableListView.getPackedPositionGroup(0L), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            c = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
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

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityVerifyOtpBinding activityVerifyOtpBinding = (ActivityVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityVerifyOtpBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: isStacked
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                VerifyOtpActivity.b(activityVerifyOtpBinding, this);
            }
        });
        OtpView otpView = activityVerifyOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: dispatchFitSystemWindows
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, activityVerifyOtpBinding, (String) obj);
            }
        }));
        MaterialButton materialButton = activityVerifyOtpBinding.btnVerification;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setStacked
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyOtpActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, activityVerifyOtpBinding, (View) obj);
            }
        }));
        MaterialButton materialButton2 = activityVerifyOtpBinding.btnChangeEmail;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: ContentFrameLayout
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        activityVerifyOtpBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: getFixedWidthMajor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {activityVerifyOtpBinding, this, view};
                VerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onBackCompletedFallback.b(), onBackCompletedFallback.b(), -382912810, onBackCompletedFallback.b(), 382912813, objArr, onBackCompletedFallback.b());
            }
        });
        ((getStringOrNull) this.INotificationSideChannel.getValue()).INotificationSideChannel = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        ((getStringOrNull) this.d.getValue()).INotificationSideChannel = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i2 = getInterfaceDescriptor + 77;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ((IntegerRes) this.cancel.getValue()).b();
        TextView textView = ((ActivityVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvEmail;
        String str = this.b;
        getCameraCharacteristic getcameracharacteristic = null;
        if (str == null) {
            int i4 = getInterfaceDescriptor + 89;
            RemoteActionCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 57 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            str = null;
        }
        textView.setText(Camera2CameraControlExternalSyntheticLambda5.a(str));
        ((ActivityVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.setCursorVisible(true);
        getCameraCharacteristic getcameracharacteristic2 = this.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic2 == null) {
            int i6 = RemoteActionCompatParcelizer + 31;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i7 != 0) {
                throw null;
            }
        } else {
            getcameracharacteristic = getcameracharacteristic2;
        }
        getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        VerifyOtpActivity verifyOtpActivity = this;
        ((cleanupAutoSizePresetSizes) this.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(verifyOtpActivity, new Observer() { // from class: getMinWidthMajor
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                VerifyOtpActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, objectRef, (VirtualCameraAdapter1) obj);
            }
        });
        ((forLanguageTags) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(verifyOtpActivity, new Observer() { // from class: getNextVisibleChildIndex
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj};
                VerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onBackCompletedFallback.b(), onBackCompletedFallback.b(), 2123636369, onBackCompletedFallback.b(), -2123636365, objArr, onBackCompletedFallback.b());
            }
        });
        ((IntegerRes) this.cancel.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(verifyOtpActivity, new Observer() { // from class: AppCompatTextViewAutoSizeHelperImpl29
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                VerifyOtpActivity.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = getInterfaceDescriptor + 21;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(item);
        try {
            Intrinsics.checkNotNullParameter(item, "");
            if (item.getItemId() == 16908332) {
                int i2 = getInterfaceDescriptor + 103;
                RemoteActionCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
                onBackPressed();
                int i4 = RemoteActionCompatParcelizer + 85;
                getInterfaceDescriptor = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 3;
                }
            }
            return super.onOptionsItemSelected(item);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        VerifyOtpActivity verifyOtpActivity = (VerifyOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            if (i3 != (((-22730376) + (((~((~iFreeMemory) | 1654375790)) | 287320721) * 446)) + (((~(iFreeMemory | 1941696511)) | 537067526) * 446)) - 703977314) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i5 = (~(949402382 | iFreeMemory2)) | 117964849;
            int i6 = ~iFreeMemory2;
            if (i4 != (-323369018) + ((i5 | (~((-947952393) | i6))) * 886) + (((~(i6 | (-949402383))) | 119414839) * (-1772)) + ((~(i6 | 119414839)) * 886)) {
                throw null;
            }
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i7 != ((346024308 + (((~iElapsedRealtime) | 541345281) * 1324)) + (((~(iElapsedRealtime | 1750386187)) | (~(828669777 | iElapsedRealtime))) * (-1324))) - 1543549252) {
            throw new RuntimeException("1913707");
        }
        super.onResume();
        getCameraCharacteristic getcameracharacteristic = verifyOtpActivity.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            int i8 = getInterfaceDescriptor + 75;
            RemoteActionCompatParcelizer = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i10 = RemoteActionCompatParcelizer + 53;
            getInterfaceDescriptor = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 / 4;
            }
            getcameracharacteristic = null;
        }
        getcameracharacteristic.b();
        int i12 = RemoteActionCompatParcelizer + 31;
        getInterfaceDescriptor = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        RemoteActionCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onStop();
            throw null;
        }
        super.onStop();
        getCameraCharacteristic getcameracharacteristic = this.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic == null) {
            int i3 = RemoteActionCompatParcelizer + 43;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i4 != 0) {
                int i5 = 79 / 0;
            }
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i6 = RemoteActionCompatParcelizer + 121;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                obj.hashCode();
                throw null;
            }
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        VerifyOtpActivity verifyOtpActivity = (VerifyOtpActivity) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getCameraCharacteristic getcameracharacteristic = verifyOtpActivity.TuitionPaymentFragmentbindingInflater1;
            obj.hashCode();
            throw null;
        }
        getCameraCharacteristic getcameracharacteristic2 = verifyOtpActivity.TuitionPaymentFragmentbindingInflater1;
        if (getcameracharacteristic2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic2 = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic2.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.cancel();
            int i3 = getInterfaceDescriptor + 109;
            RemoteActionCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
        }
        getcameracharacteristic2.b = null;
        super.onDestroy();
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        Integer numValueOf;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        getInterfaceDescriptor = i2 % 128;
        String str = null;
        if (i2 % 2 != 0) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(v);
            str.hashCode();
            throw null;
        }
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(v);
        if (v != null) {
            try {
                numValueOf = Integer.valueOf(v.getId());
                int i3 = getInterfaceDescriptor + 33;
                RemoteActionCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
            } finally {
                ViewPortBuilder.b();
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.btnVerification) {
            int i5 = getInterfaceDescriptor + 35;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            String str2 = this.asBinder;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str = str2;
            }
            if (Intrinsics.areEqual(str, "forgot-password")) {
                Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_validation_otp_forgot-password_by_email", "validation_otp_forgot-password_by_email"));
                Intrinsics.checkNotNullParameter(this, "");
                Intrinsics.checkNotNullParameter("validation_otp_forgot-password_by_email", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("validation_otp_forgot-password_by_email", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("validation_otp_forgot-password_by_email", mapMutableMapOf);
            } else {
                Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_event_validation_otp_forgot_account_by_email", "validation_otp_forgot_account_by_email"));
                Intrinsics.checkNotNullParameter(this, "");
                Intrinsics.checkNotNullParameter("validation_otp_forgot_account_by_email", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("validation_otp_forgot_account_by_email", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("validation_otp_forgot_account_by_email", mapMutableMapOf2);
            }
        } else if (numValueOf != null && numValueOf.intValue() == R.id.btnChangeMethod) {
            String str3 = this.asBinder;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str = str3;
            }
            if (Intrinsics.areEqual(str, "forgot-password")) {
                Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_event_change_method_otp_forgot_password_by_email", "change_method_otp_forgot_password_by_email"));
                Intrinsics.checkNotNullParameter(this, "");
                Intrinsics.checkNotNullParameter("change_method_otp_forgot_password_by_email", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("change_method_otp_forgot_password_by_email", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("change_method_otp_forgot_password_by_email", mapMutableMapOf3);
            } else {
                Map<String, Object> mapMutableMapOf4 = MapsKt.mutableMapOf(new Pair("params_event_change_method_otp_forgot_account_by_email", "change_method_otp_forgot_account_by_email"));
                Intrinsics.checkNotNullParameter(this, "");
                Intrinsics.checkNotNullParameter("change_method_otp_forgot_account_by_email", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf4, "");
                TargetAspectRatio targetAspectRatio4 = TargetAspectRatio.INSTANCE;
                Intrinsics.checkNotNullParameter("change_method_otp_forgot_account_by_email", "");
                Intrinsics.checkNotNullParameter(mapMutableMapOf4, "");
                TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("change_method_otp_forgot_account_by_email", mapMutableMapOf4);
            }
        } else if (numValueOf != null) {
            int i7 = RemoteActionCompatParcelizer + 51;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            if (numValueOf.intValue() == R.id.tvResendCode) {
                String str4 = this.asBinder;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str = str4;
                }
                if (Intrinsics.areEqual(str, "forgot-password")) {
                    Map<String, Object> mapMutableMapOf5 = MapsKt.mutableMapOf(new Pair("params_event_resend_otp_forgot_password_by_email", "resend_otp_forgot_password_by_email"));
                    Intrinsics.checkNotNullParameter(this, "");
                    Intrinsics.checkNotNullParameter("resend_otp_forgot_password_by_email", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf5, "");
                    TargetAspectRatio targetAspectRatio5 = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter("resend_otp_forgot_password_by_email", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf5, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("resend_otp_forgot_password_by_email", mapMutableMapOf5);
                } else {
                    Map<String, Object> mapMutableMapOf6 = MapsKt.mutableMapOf(new Pair("params_event_resend_otp_forgot_account_by_email", "resend_otp_forgot_account_by_email"));
                    Intrinsics.checkNotNullParameter(this, "");
                    Intrinsics.checkNotNullParameter("resend_otp_forgot_account_by_email", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf6, "");
                    TargetAspectRatio targetAspectRatio6 = TargetAspectRatio.INSTANCE;
                    Intrinsics.checkNotNullParameter("resend_otp_forgot_account_by_email", "");
                    Intrinsics.checkNotNullParameter(mapMutableMapOf6, "");
                    TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("resend_otp_forgot_account_by_email", mapMutableMapOf6);
                }
            }
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
            int i3 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int size = View.MeasureSpec.getSize(0) + 23;
            Object[] objArr2 = new Object[1];
            c((byte) 15, (short) 193, $$a[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, i3, size, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i4 = getInterfaceDescriptor + 51;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                int i6 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iAlpha = Color.alpha(0) + 23;
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr3 = new Object[1];
                c(b2, (short) (b2 | 156), b, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyTid, i6, iAlpha, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i7 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{i7}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_copied_to_clipboard).substring(13, 14).length() - 1241131978;
            int i8 = (~(483896907 | length)) | 553652356;
            int i9 = ~((~length) | (-341049931));
            int i10 = (-1563795311) + ((i8 | i9) * (-470)) + (((~(length | 1037549263)) | i9) * 470) + 1263093891;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new int[]{1220266574, 1697260030, 785331869, 2025942990, 1375494932, -2107437482, 1835520932, 2076769753, -483534097, -226981431}, MotionEvent.axisFromString("") + 17, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new int[]{-1032542855, 480354723, -723509006, 674654361, 329747317, 929546830, 54762826, 625560411, -798212324, 232311738}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.input_1).substring(3, 4).codePointAt(0) - 101, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1506809799};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1726, (ViewConfiguration.getTouchSlop() >> 8) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 1263093891);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int i13 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i14 = 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr8 = new Object[1];
                    c(b4, (short) (b4 | 156), b3, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, i13, i14, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new int[]{-1647024938, 1107657191, -1616356250, 1842080234, -1899199067, -736023364, -1681155346, -1281876099, -1476933462, -819600789, -1412733168, 678781802, 287433600, 86408561}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_klik_bca).substring(1, 3).codePointAt(1) - 99, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new int[]{279819714, -735127564, -1678700461, 2071944508, 1165511155, 2083913658, 1367658349, -1152160408, 159207011, 1582166189}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 84, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (29945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int i15 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int modifierMetaStateMask = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr11 = new Object[1];
                        c(b6, (short) (b6 | 104), b5, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i15, modifierMetaStateMask, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                        int iRed = Color.red(0) + 1755;
                        int iGreen = Color.green(0) + 23;
                        Object[] objArr12 = new Object[1];
                        c((byte) 15, (short) 193, $$a[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, iRed, iGreen, 986134021, false, (String) objArr12[0], null);
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
        int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i17 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i17 != i16) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                int i18 = RemoteActionCompatParcelizer + 91;
                getInterfaceDescriptor = i18 % 128;
                int i19 = i18 % 2;
                while (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i17));
        }
        int i20 = RemoteActionCompatParcelizer + 7;
        getInterfaceDescriptor = i20 % 128;
        int i21 = i20 % 2;
        int i22 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        int i23 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i23}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i24 = 1150917307 + (((~((-790472610) | iIdentityHashCode)) | 571572513 | (~((-577870184) | iIdentityHashCode))) * (-754));
        int i25 = ~((-571572514) | iIdentityHashCode);
        int i26 = ~iIdentityHashCode;
        int i27 = i22 + i24 + ((i25 | (~((-6297671) | i26))) * (-754)) + ((i26 | (-790472610)) * 754);
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        ((int[]) objArr13[3])[0] = i29 ^ (i29 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iResolveOpacity = 1031 - Drawable.resolveOpacity(0, 0);
            int iArgb = 15 - Color.argb(0, 0, 0, 0);
            byte b7 = $$a[7];
            byte b8 = b7;
            Object[] objArr14 = new Object[1];
            c(b8, (short) (b8 | 52), b7, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollDefaultDelay, iResolveOpacity, iArgb, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new int[]{-1647024938, 1107657191, -1616356250, 1842080234, -1899199067, -736023364, -1681155346, -1281876099, -1476933462, -819600789, -1412733168, 678781802, 287433600, 86408561}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction).substring(0, 6).codePointAt(4) - 92, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new int[]{279819714, -735127564, -1678700461, 2071944508, 1165511155, 2083913658, 1367658349, -1152160408, 159207011, 1582166189}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_phone_number).substring(0, 2).codePointAt(0) - 63, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 15;
            byte b9 = $$a[7];
            byte b10 = b9;
            Object[] objArr17 = new Object[1];
            c(b10, (short) (b10 | 156), b9, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(doubleTapTimeout, iIndexOf, threadPriority, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int iIndexOf2 = 1031 - TextUtils.indexOf("", "");
                int packedPositionChild = 14 - ExpandableListView.getPackedPositionChild(0L);
                byte[] bArr = $$a;
                Object[] objArr18 = new Object[1];
                c((byte) 52, bArr[7], bArr[5], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveSize, iIndexOf2, packedPositionChild, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr19[3])[0];
            int i31 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i32 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i33 = 1866967784 + (((~((-1006747639) | i32)) | 268544882) * 345) + (((~((-1006747639) | (~i32))) | (-1031012351)) * 345) + ((~(i32 | (-268544883))) * 345) + 1616170109;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[2])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new int[]{1220266574, 1697260030, 785331869, 2025942990, 1375494932, -2107437482, 1835520932, 2076769753, -483534097, -226981431}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 99, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new int[]{-1032542855, 480354723, -723509006, 674654361, 329747317, 929546830, 54762826, 625560411, -798212324, 232311738}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-1506809799};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1134, 18 - Color.red(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 1616170109, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int iResolveOpacity2 = 1031 - Drawable.resolveOpacity(0, 0);
                int iIndexOf3 = 15 - TextUtils.indexOf("", "", 0, 0);
                byte b11 = $$a[7];
                byte b12 = b11;
                Object[] objArr24 = new Object[1];
                c(b12, (short) (b12 | 52), b11, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(threadPriority2, iResolveOpacity2, iIndexOf3, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 45994), 1117 - TextUtils.getTrimmedLength(""), 17 - TextUtils.getCapsMode("", 0, 0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
                int i36 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                byte[] bArr2 = $$a;
                Object[] objArr25 = new Object[1];
                c((byte) 52, bArr2[7], bArr2[5], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(pressedStateDuration, iIndexOf4, i36, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new int[]{-1647024938, 1107657191, -1616356250, 1842080234, -1899199067, -736023364, -1681155346, -1281876099, -1476933462, -819600789, -1412733168, 678781802, 287433600, 86408561}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_gopay_qris).substring(0, 5).length() + 17, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new int[]{279819714, -735127564, -1678700461, 2071944508, 1165511155, 2083913658, 1367658349, -1152160408, 159207011, 1582166189}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_delete).substring(1, 2).length() + 14, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                    int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b13 = $$a[7];
                    byte b14 = b13;
                    Object[] objArr28 = new Object[1];
                    c(b14, (short) (b14 | 156), b13, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(pressedStateDuration2, tapTimeout, maxKeyCode, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int threadPriority3 = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int i37 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte b15 = $$a[7];
                    byte b16 = b15;
                    Object[] objArr29 = new Object[1];
                    c(b16, (short) (b16 | 52), b15, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(capsMode, threadPriority3, i37, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i38 = getInterfaceDescriptor + 61;
        RemoteActionCompatParcelizer = i38 % 128;
        int i39 = i38 % 2;
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i40 = ((int[]) objArr[2])[0];
        int i41 = ((int[]) objArr[3])[0];
        int i42 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i43 = ~System.identityHashCode(this);
        int i44 = i40 + 644797189 + (((~((-7391273) | i43)) | 251671442) * (-828)) + ((i43 | (-7391273)) * (-828)) + 1825005920;
        int i45 = i44 ^ (i44 << 13);
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr30[2])[0] = i46 ^ (i46 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        if (i4 != 959287048 + ((~((~i5) | (-838935266))) * (-116)) + ((211732490 | i5) * 116) + (((~(i5 | 1041720033)) | 8947722) * 116)) {
            throw new RuntimeException("451288248");
        }
        int i6 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i6 != (-764659584) + (((~(1920065700 | iIdentityHashCode)) | (-204154370)) * (-964)) + (((~((~iIdentityHashCode) | 1920065700)) | (-2122049190)) * (-964))) {
            throw null;
        }
        super.onStart();
        int i7 = RemoteActionCompatParcelizer + 17;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        if (i4 != (((-2145582140) + (((-89326725) | iFreeMemory) * (-381))) + (((~((~iFreeMemory) | (-1465098118))) | 1921555243) * 381)) - 326256524) {
            throw new RuntimeException("1711025989");
        }
        int i5 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        if (i5 != ((~((~i6) | (-1359224841))) * 130) + 1142674344 + (((~(i6 | (-1359224841))) | 138543698) * 130)) {
            throw null;
        }
        super.onCreate(bundle);
        int i7 = getInterfaceDescriptor + 107;
        RemoteActionCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ void b(ActivityVerifyOtpBinding activityVerifyOtpBinding, VerifyOtpActivity verifyOtpActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            OtpView otpView = activityVerifyOtpBinding.otpVerify;
            Intrinsics.checkNotNullExpressionValue(otpView, "");
            VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, verifyOtpActivity);
            throw null;
        }
        OtpView otpView2 = activityVerifyOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView2, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView2, verifyOtpActivity);
        int i3 = getInterfaceDescriptor + 103;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ getStringOrNull TuitionPaymentFragmentbindingInflater1(VerifyOtpActivity verifyOtpActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = verifyOtpActivity.getString(R.string.label_code_sent_successfully);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = verifyOtpActivity.getString(R.string.label_check_email_for_verification);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = verifyOtpActivity.getString(R.string.action_ok_thanks);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, string, string2, string3, null, 112);
        int i4 = RemoteActionCompatParcelizer + 15;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return getstringornullB;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(VerifyOtpActivity verifyOtpActivity, ActivityVerifyOtpBinding activityVerifyOtpBinding, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        String str2 = verifyOtpActivity.f522a;
        if (str2 == null) {
            int i2 = RemoteActionCompatParcelizer + 85;
            getInterfaceDescriptor = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        if (length < str2.length()) {
            int i3 = RemoteActionCompatParcelizer + 79;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                MaterialButton materialButton = activityVerifyOtpBinding.btnVerification;
                Intrinsics.checkNotNullExpressionValue(materialButton, "");
                MaterialButton materialButton2 = materialButton;
                Intrinsics.checkNotNullParameter(materialButton2, "");
                materialButton2.setEnabled(false);
            } else {
                MaterialButton materialButton3 = activityVerifyOtpBinding.btnVerification;
                Intrinsics.checkNotNullExpressionValue(materialButton3, "");
                MaterialButton materialButton4 = materialButton3;
                Intrinsics.checkNotNullParameter(materialButton4, "");
                materialButton4.setEnabled(false);
            }
        } else {
            MaterialButton materialButton5 = activityVerifyOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton5, "");
            MaterialButton materialButton6 = materialButton5;
            Intrinsics.checkNotNullParameter(materialButton6, "");
            materialButton6.setEnabled(true);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 37;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerifyOtpActivity verifyOtpActivity, View view) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        verifyOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 75;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return unit;
    }

    public static /* synthetic */ getStringOrNull b(VerifyOtpActivity verifyOtpActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = verifyOtpActivity.getString(R.string.label_code_doesnt_match);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = verifyOtpActivity.getString(R.string.label_code_doesnt_match_message);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = verifyOtpActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, string, string2, string3, null, 112);
        int i4 = RemoteActionCompatParcelizer + 107;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return getstringornullB;
    }

    public static /* synthetic */ void b(VerifyOtpActivity verifyOtpActivity, Ref.ObjectRef objectRef, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 57;
        int i4 = i3 % 128;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        String str = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            String str2 = verifyOtpActivity.asBinder;
            if (str2 == null) {
                int i6 = i4 + 47;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            }
            if (Intrinsics.areEqual(str2, "forgot-password")) {
                objectRef.element = "loading_resend_otp_forgot_password_by_email";
            } else {
                objectRef.element = "loading_resend_otp_forgot_account_by_email";
            }
            verifyOtpActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i8 = i2 + 27;
            RemoteActionCompatParcelizer = i8 % 128;
            int i9 = i8 % 2;
            String str3 = verifyOtpActivity.asBinder;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str3 = null;
            }
            if (Intrinsics.areEqual(str3, "forgot-password")) {
                objectRef.element = "success_resend_otp_forgot_password_by_email";
            } else {
                objectRef.element = "success_resend_otp_forgot_account_by_email";
            }
            verifyOtpActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            verifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = String.valueOf(((ForgotPasswordItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum());
            getCameraCharacteristic getcameracharacteristic = verifyOtpActivity.TuitionPaymentFragmentbindingInflater1;
            if (getcameracharacteristic == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i10 = getInterfaceDescriptor + 119;
                RemoteActionCompatParcelizer = i10 % 128;
                int i11 = i10 % 2;
                getcameracharacteristic = null;
            }
            getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            verifyOtpActivity.f522a = String.valueOf(((ForgotPasswordItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getOtp());
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i12 = i2 + 77;
            RemoteActionCompatParcelizer = i12 % 128;
            int i13 = i12 % 2;
            String str4 = verifyOtpActivity.asBinder;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str4 = null;
            }
            if (!Intrinsics.areEqual(str4, "forgot-password")) {
                objectRef.element = "failure_resend_otp_forgot_account_by_email";
            } else {
                int i14 = getInterfaceDescriptor + 61;
                RemoteActionCompatParcelizer = i14 % 128;
                if (i14 % 2 == 0) {
                    objectRef.element = "failure_resend_otp_forgot_password_by_email";
                    throw null;
                }
                objectRef.element = "failure_resend_otp_forgot_password_by_email";
            }
            verifyOtpActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(verifyOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        String str5 = verifyOtpActivity.asBinder;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i15 = RemoteActionCompatParcelizer + 1;
            getInterfaceDescriptor = i15 % 128;
            int i16 = i15 % 2;
        } else {
            str = str5;
        }
        if (Intrinsics.areEqual(str, "forgot-password")) {
            String str6 = (String) objectRef.element;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_resend_otp_result_forgot_password", objectRef.element));
            Intrinsics.checkNotNullParameter(verifyOtpActivity, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str6, mapMutableMapOf);
            return;
        }
        String str7 = (String) objectRef.element;
        Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_resend_otp_result_forgot_account", objectRef.element));
        Intrinsics.checkNotNullParameter(verifyOtpActivity, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str7, mapMutableMapOf2);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        String str;
        ActivityVerifyOtpBinding activityVerifyOtpBinding = (ActivityVerifyOtpBinding) objArr[0];
        VerifyOtpActivity verifyOtpActivity = (VerifyOtpActivity) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                activityVerifyOtpBinding.otpVerify.getEditableText().clear();
                str = verifyOtpActivity.asBinder;
                int i4 = 8 / 0;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                }
            } else {
                activityVerifyOtpBinding.otpVerify.getEditableText().clear();
                str = verifyOtpActivity.asBinder;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                }
            }
            if (Intrinsics.areEqual(str, "forgot-password")) {
                cleanupAutoSizePresetSizes cleanupautosizepresetsizes = (cleanupAutoSizePresetSizes) verifyOtpActivity.g.getValue();
                String str2 = verifyOtpActivity.b;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str2 = null;
                }
                cleanupautosizepresetsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2);
            } else {
                cleanupAutoSizePresetSizes cleanupautosizepresetsizes2 = (cleanupAutoSizePresetSizes) verifyOtpActivity.g.getValue();
                String str3 = verifyOtpActivity.b;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str3 = null;
                }
                String str4 = verifyOtpActivity.onTransact;
                if (str4 == null) {
                    int i5 = RemoteActionCompatParcelizer + 27;
                    getInterfaceDescriptor = i5 % 128;
                    if (i5 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str4 = null;
                }
                cleanupautosizepresetsizes2.b(str3, str4);
            }
            ViewPortBuilder.b();
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if ((r4 instanceof VirtualCameraAdapter1.asBinder) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r3.IconCompatParcelizer();
        r3.cancelAll = ((com.bpjstku.data.lib.model.BaseItem) ((VirtualCameraAdapter1.asBinder) r4).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage().toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if ((r4 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r3.IconCompatParcelizer();
        defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3, java.lang.String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r4).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r3 = com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity.RemoteActionCompatParcelizer + 27;
        com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity.getInterfaceDescriptor = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r4 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!(r4 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r3.MediaBrowserCompat();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity r3, defpackage.VirtualCameraAdapter1 r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity.RemoteActionCompatParcelizer
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity.getInterfaceDescriptor = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            boolean r1 = r4 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r2 = 9
            int r2 = r2 / 0
            if (r1 == 0) goto L21
            goto L1d
        L17:
            boolean r1 = r4 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L21
        L1d:
            r3.MediaBrowserCompat()
            return
        L21:
            boolean r1 = r4 instanceof VirtualCameraAdapter1.asBinder
            if (r1 == 0) goto L39
            r3.IconCompatParcelizer()
            VirtualCameraAdapter1$asBinder r4 = (VirtualCameraAdapter1.asBinder) r4
            T r4 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            com.bpjstku.data.lib.model.BaseItem r4 = (com.bpjstku.data.lib.model.BaseItem) r4
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = r4.toString()
            r3.cancelAll = r4
            return
        L39:
            boolean r1 = r4 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            if (r1 == 0) goto L4e
            r3.IconCompatParcelizer()
            com.nbs.nucleosnucleo.presentation.BaseActivity r3 = (com.nbs.nucleosnucleo.presentation.BaseActivity) r3
            VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r4 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r4
            java.lang.String r4 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1 = 0
            defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3, r4, r1)
        L4e:
            int r3 = com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity.RemoteActionCompatParcelizer
            int r3 = r3 + 27
            int r4 = r3 % 128
            com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity.getInterfaceDescriptor = r4
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity.TuitionPaymentFragmentbindingInflater1(com.bpjstku.presentation.membership.forgotpassword.verifyotp.VerifyOtpActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(VerifyOtpActivity verifyOtpActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            verifyOtpActivity.d_();
            return Unit.INSTANCE;
        }
        verifyOtpActivity.d_();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static /* synthetic */ Unit b(final VerifyOtpActivity verifyOtpActivity, ActivityVerifyOtpBinding activityVerifyOtpBinding, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        int i2 = verifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i2 < 3) {
            int i3 = RemoteActionCompatParcelizer + 93;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            verifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 + 1;
            forLanguageTags forlanguagetags = (forLanguageTags) verifyOtpActivity.asInterface.getValue();
            String str = verifyOtpActivity.b;
            String str2 = null;
            if (str == null) {
                int i5 = getInterfaceDescriptor + 45;
                RemoteActionCompatParcelizer = i5 % 128;
                if (i5 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                str = null;
            }
            String strValueOf = String.valueOf(activityVerifyOtpBinding.otpVerify.getText());
            String str3 = verifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str3 == null) {
                int i6 = RemoteActionCompatParcelizer + 123;
                getInterfaceDescriptor = i6 % 128;
                if (i6 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str2 = str3;
            }
            forlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ValidationOtpRequest(str, strValueOf, str2));
        } else {
            Lazy lazy = LazyKt.lazy(new Function0() { // from class: getFixedHeightMinor
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
                }
            });
            getStringOrNull getstringornull = (getStringOrNull) lazy.getValue();
            FragmentManager supportFragmentManager = verifyOtpActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornull.show(supportFragmentManager, getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ((getStringOrNull) lazy.getValue()).INotificationSideChannel = verifyOtpActivity.new TuitionPaymentFragmentbindingInflater1();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerifyOtpActivity verifyOtpActivity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = verifyOtpActivity.getString(R.string.label_information);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = verifyOtpActivity.getString(R.string.label_exception_otp_verification);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = verifyOtpActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_failed, string, string2, string3, null, 112);
        int i4 = RemoteActionCompatParcelizer + 93;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return getstringornullB;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        String str;
        String str2;
        String str3;
        final VerifyOtpActivity verifyOtpActivity = (VerifyOtpActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            String str4 = verifyOtpActivity.asBinder;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str4 = null;
            }
            if (Intrinsics.areEqual(str4, "forgot-password")) {
                int i2 = RemoteActionCompatParcelizer + 57;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                str = "loading_validation_otp_forgot_password_by_email";
            } else {
                str = "loading_validation_otp_forgot_account_by_email";
            }
            verifyOtpActivity.MediaBrowserCompat();
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            String str5 = verifyOtpActivity.asBinder;
            if (str5 == null) {
                int i4 = RemoteActionCompatParcelizer + 95;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                str5 = null;
            }
            if (Intrinsics.areEqual(str5, "forgot-password")) {
                int i6 = RemoteActionCompatParcelizer + 41;
                getInterfaceDescriptor = i6 % 128;
                str3 = "success_validation_otp_forgot_password_by_email";
                if (i6 % 2 != 0) {
                    int i7 = 10 / 0;
                }
            } else {
                str3 = "success_validation_otp_forgot_account_by_email";
            }
            verifyOtpActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            List listSplit$default = StringsKt.split$default((CharSequence) String.valueOf(((ValidationOtp) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3), new String[]{"#"}, false, 0, 6, (Object) null);
            if (Intrinsics.areEqual(listSplit$default.get(0), Constants.STATUS_CODE_200)) {
                int i8 = RemoteActionCompatParcelizer + 9;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
                Object obj = listSplit$default.get(2);
                String str6 = verifyOtpActivity.cancelAll;
                if (str6 == null) {
                    int i10 = RemoteActionCompatParcelizer + 49;
                    getInterfaceDescriptor = i10 % 128;
                    int i11 = i10 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str6 = null;
                }
                if (!(!Intrinsics.areEqual(obj, str6.toString()))) {
                    ResetPasswordActivity.Companion companion = ResetPasswordActivity.INSTANCE;
                    VerifyOtpActivity verifyOtpActivity2 = verifyOtpActivity;
                    String str7 = verifyOtpActivity.b;
                    if (str7 == null) {
                        int i12 = RemoteActionCompatParcelizer + 15;
                        getInterfaceDescriptor = i12 % 128;
                        int i13 = i12 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str7 = null;
                    }
                    ResetPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(verifyOtpActivity2, str7, StringsKt.trim((CharSequence) String.valueOf(((ActivityVerifyOtpBinding) ((ViewBinding) verifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getText())).toString(), String.valueOf(((ValidationOtp) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1));
                    verifyOtpActivity.d_();
                } else {
                    String string = verifyOtpActivity.getString(R.string.error_signature_checking);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(verifyOtpActivity, string, "OK, Coba Kembali", new Function0() { // from class: AppCompatToggleButtonInspectionCompanion
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return VerifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                    });
                }
            } else {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Error", 0).show();
            }
            str = str3;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            String str8 = verifyOtpActivity.asBinder;
            if (str8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str8 = null;
            }
            if (Intrinsics.areEqual(str8, "forgot-password")) {
                int i14 = getInterfaceDescriptor + 29;
                RemoteActionCompatParcelizer = i14 % 128;
                str2 = "failure_validation_otp_forgot_password_by_email";
                if (i14 % 2 == 0) {
                    int i15 = 39 / 0;
                }
            } else {
                str2 = "failure_validation_otp_forgot_account_by_email";
            }
            verifyOtpActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) verifyOtpActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(verifyOtpActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            str = str2;
        } else {
            str = "";
        }
        String str9 = verifyOtpActivity.asBinder;
        if (str9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str9 = null;
        }
        if (Intrinsics.areEqual(str9, "forgot-password")) {
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_validation_otp_email_forgot_password", str));
            Intrinsics.checkNotNullParameter(verifyOtpActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
            return null;
        }
        Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_validation_otp_email_forgot_account", str));
        Intrinsics.checkNotNullParameter(verifyOtpActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf2);
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityVerifyOtpBinding activityVerifyOtpBinding, VerifyOtpActivity verifyOtpActivity, View view) {
        int iB = onBackCompletedFallback.b();
        int iB2 = onBackCompletedFallback.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(onBackCompletedFallback.b(), iB, -382912810, iB2, 382912813, new Object[]{activityVerifyOtpBinding, verifyOtpActivity, view}, onBackCompletedFallback.b());
    }

    public static /* synthetic */ void b(VerifyOtpActivity verifyOtpActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iB = onBackCompletedFallback.b();
        int iB2 = onBackCompletedFallback.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(onBackCompletedFallback.b(), iB, 2123636369, iB2, -2123636365, new Object[]{verifyOtpActivity, virtualCameraAdapter1}, onBackCompletedFallback.b());
    }

    static {
        INotificationSideChannelDefault = 0;
        g();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
        int i = IconCompatParcelizer + 89;
        INotificationSideChannelDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iB = onBackCompletedFallback.b();
        int length = (-1238718705) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unknown_error_while_fetching_store_key).substring(0, 38).length();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault1(hasCameraTransform.AnonymousClass3.TuitionPaymentFragmentbindingInflater1(), iB, -550643319, length, 550643321, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 968359356)).intValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int length = 1635795403 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
        int iTuitionPaymentFragmentbindingInflater1 = hasCameraTransform.AnonymousClass3.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(onBackCompletedFallback.b(), length, -1313002455, iTuitionPaymentFragmentbindingInflater1, 1313002455, new Object[]{this}, onBackCompletedFallback.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_epay_bri).substring(1, 3).length() - 1421492638, onBackCompletedFallback.b(), 1177633948, hasCameraTransform.AnonymousClass3.TuitionPaymentFragmentbindingInflater1(), -1177633947, new Object[]{this}, onBackCompletedFallback.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = RemoteActionCompatParcelizer + 41;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        INotificationSideChannelStub = new int[]{-840482314, 2129198255, 642393834, -1677898373, -1673565266, 1485526068, 2132286387, -1720097003, -715402898, 1753139441, -59021573, 1888650693, -441151961, 2006917340, -1438403113, 1677046967, -556050705, 1432441185};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.valueOf(R.layout.activity_verify_otp);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String $$i(int i, int i2, int i3) {
        int i4 = (i2 * 2) + 4;
        int i5 = 122 - (i3 * 56);
        byte[] bArr = $$c;
        int i6 = i * 2;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        int i8 = -1;
        if (bArr == null) {
            i4++;
            i5 = i4 + (-i7);
        }
        while (true) {
            int i9 = i5;
            int i10 = i4;
            i8++;
            bArr2[i8] = (byte) i9;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i4 = i10 + 1;
            i5 = i9 + (-bArr[i10]);
        }
    }
}
