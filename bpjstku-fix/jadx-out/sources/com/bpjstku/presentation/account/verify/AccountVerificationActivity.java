package com.bpjstku.presentation.account.verify;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
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
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.registration.general.model.response.VerificationSignatureItem;
import com.bpjstku.data.setting.model.request.ChangeDataFirstVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeEmailRequest;
import com.bpjstku.data.setting.model.request.ChangeEmailVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangePhoneNumberRequest;
import com.bpjstku.data.setting.model.request.PhoneVerificationRequest;
import com.bpjstku.data.setting.model.request.VerificationOtpRequest;
import com.bpjstku.data.user.model.request.LogoutRequest;
import com.bpjstku.data.user.model.request.ValidationOtpRequest;
import com.bpjstku.databinding.ActivityVerifyOtpBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.setting.EditEmailActivity;
import com.bpjstku.presentation.account.setting.EditPhoneNumberActivity;
import com.bpjstku.presentation.account.setting.EditProfileActivity;
import com.bpjstku.presentation.account.verify.AccountVerificationActivity;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.connector.internal.zzg;
import com.mukesh.OtpView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda4;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.ExperimentalCamera2Interop;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.IntegerRes;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.VirtualCameraControlExternalSyntheticLambda1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.deriveCodec;
import defpackage.forLanguageTags;
import defpackage.getCameraCharacteristic;
import defpackage.getCameraState;
import defpackage.getContentPaddingRight;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getSelectedTab;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.notifyStateAttached;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setDisplayShowTitleEnabled;
import defpackage.share;
import defpackage.suspendUseCases;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001^B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010D\u001a\u00020EH\u0014J\b\u0010F\u001a\u00020EH\u0014J\b\u0010G\u001a\u00020EH\u0014J\b\u0010H\u001a\u00020EH\u0014J\b\u0010I\u001a\u00020EH\u0002J\b\u0010J\u001a\u00020EH\u0002J\b\u0010K\u001a\u00020EH\u0002J\b\u0010L\u001a\u00020EH\u0014J\b\u0010M\u001a\u00020EH\u0014J\u0010\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0002J\u0010\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SH\u0016J\b\u0010T\u001a\u00020EH\u0014J\b\u0010U\u001a\u00020EH\u0014J\b\u0010V\u001a\u00020EH\u0014J\b\u0010W\u001a\u00020EH\u0002J\u000e\u0010X\u001a\u00020E2\u0006\u0010Y\u001a\u00020\bJ\u0006\u0010Z\u001a\u00020EJ\b\u0010[\u001a\u00020EH\u0002J\b\u0010\\\u001a\u00020EH\u0002J\b\u0010]\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0013\u001a\u0004\b.\u0010/R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u00109\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0013\u001a\u0004\b:\u0010;R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00020>8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010;¨\u0006_²\u0006\n\u0010`\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"Lcom/bpjstku/presentation/account/verify/AccountVerificationActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVerifyOtpBinding;", "<init>", "()V", "countVerificationOtp", "", "currentLatitude", "", "currentLongitude", "currentCity", "currentProvince", "currentCountry", "currentFullAddress", "user", "Lcom/bpjstku/domain/user/model/User;", "getUser", "()Lcom/bpjstku/domain/user/model/User;", "user$delegate", "Lkotlin/Lazy;", "serverSignature", "successDialog", "Lcom/bpjstku/presentation/membership/registration/ProcessResultDialogFragment;", "getSuccessDialog", "()Lcom/bpjstku/presentation/membership/registration/ProcessResultDialogFragment;", "successDialog$delegate", "failedDialog", "getFailedDialog", "failedDialog$delegate", "settingViewModel", "Lcom/bpjstku/presentation/account/setting/SettingViewModel;", "getSettingViewModel", "()Lcom/bpjstku/presentation/account/setting/SettingViewModel;", "settingViewModel$delegate", "preferenceManager", "Lcom/bpjstku/data/lib/PreferenceManager;", "getPreferenceManager", "()Lcom/bpjstku/data/lib/PreferenceManager;", "preferenceManager$delegate", "accountViewModel", "Lcom/bpjstku/presentation/account/AccountViewModel;", "getAccountViewModel", "()Lcom/bpjstku/presentation/account/AccountViewModel;", "accountViewModel$delegate", "forgotPasswordByPhoneViewModel", "Lcom/bpjstku/presentation/membership/forgotaccount/inputnik/ForgotPasswordByPhoneViewModel;", "getForgotPasswordByPhoneViewModel", "()Lcom/bpjstku/presentation/membership/forgotaccount/inputnik/ForgotPasswordByPhoneViewModel;", "forgotPasswordByPhoneViewModel$delegate", "resultDialog", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/ProcessResultSmallDialogFragment;", "countDownTimerUtil", "Lcom/bpjstku/util/utils/CountDownTimerUtil;", "email", "checkSum", "checkSum2", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "verificationType", "getVerificationType", "()I", "verificationType$delegate", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "getBindingInflater", "()Lkotlin/jvm/functions/Function1;", "layoutResource", "getLayoutResource", "initLib", "", "initIntent", "initUI", "initAction", "initChangeEmailOrPhone", "changePhone", "changeEmail", "initProcess", "initObservers", "generateChecksum", "key", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onStop", "onResume", "onDestroy", "redirectToLoginPage", "doLogout", "newEmail", "getTimeServer", "fetchUserLocation", "fetchLocationFromIP", "buildLocality", "Companion", "app_release", "exceptionDialog"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AccountVerificationActivity extends BindingBaseActivity<ActivityVerifyOtpBinding> {
    public static final b TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] connect;
    private static int getExtras;
    private static long getRoot;
    private String INotificationSideChannel;
    private final Lazy INotificationSideChannelDefault;
    private String INotificationSideChannelStub;
    private String IconCompatParcelizer;
    private final Lazy RemoteActionCompatParcelizer;
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f459a;
    private getCameraCharacteristic asBinder;
    private String asInterface;
    private String b;
    private String cancel;
    private String cancelAll;
    private String d;
    private int g;
    private String notify;
    private String onTransact;
    private getCameraState write;
    private static final byte[] $$c = {117, 57, 101, -72};
    private static final int $$f = 115;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, -15, -81, 1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 198;
    private static int getItem = 0;
    private static int getNotifyChildrenChangedOptions = 0;
    private static int disconnect = 1;
    final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: setHomeAsUpIndicator
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (User) AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 429837410, new Object[]{this.b}, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -429837400, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
    });
    private final Lazy read = LazyKt.lazy(new Function0() { // from class: setHideOffset
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccountVerificationActivity.g(this.TuitionPaymentFragmentbindingInflater1);
        }
    });
    private final Lazy getInterfaceDescriptor = LazyKt.lazy(new Function0() { // from class: setHomeActionContentDescription
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccountVerificationActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });
    private final Lazy MediaBrowserCompat = LazyKt.lazy(new Function0() { // from class: setHomeButtonEnabled
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        }
    });

    static final /* synthetic */ class asBinder implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        asBinder(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.b.invoke(obj);
        }
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = i2 | i9;
        int i11 = ~i2;
        int i12 = i9 | (~(i11 | i4));
        int i13 = (~(i3 | i7 | i2)) | (~(i8 | i11 | i7));
        int i14 = i4 + i2 + i6 + ((-619979367) * i) + (68302741 * i5);
        int i15 = i14 * i14;
        int i16 = (i4 * 561304900) + 382271488 + (561304900 * i2) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i6) + (1615200256 * i) + ((-1821507584) * i5) + (428933120 * i15);
        int i17 = ((i4 * (-96142684)) - 56799437) + (i2 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i6 * (-96141863)) + (i * (-1380774991)) + (i5 * (-1175232947)) + (i15 * (-118947840));
        switch (i16 + (i17 * i17 * (-1369505792))) {
            case 1:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 5:
                AccountVerificationActivity accountVerificationActivity = (AccountVerificationActivity) objArr[0];
                int i18 = 2 % 2;
                int i19 = getNotifyChildrenChangedOptions + 103;
                disconnect = i19 % 128;
                int i20 = i19 % 2;
                ((IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b();
                ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.setCursorVisible(true);
                getCameraCharacteristic getcameracharacteristic = accountVerificationActivity.asBinder;
                if (getcameracharacteristic == null) {
                    int i21 = getNotifyChildrenChangedOptions + 105;
                    disconnect = i21 % 128;
                    int i22 = i21 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    getcameracharacteristic = null;
                }
                getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i23 = getNotifyChildrenChangedOptions + 77;
                disconnect = i23 % 128;
                int i24 = i23 % 2;
                return null;
            case 6:
                return d(objArr);
            case 7:
                return a(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return g(objArr);
            case 10:
                return asBinder(objArr);
            default:
                return b(objArr);
        }
    }

    private static void c(int i, byte b2, byte b3, Object[] objArr) {
        int i2 = (b3 * 14) + 84;
        int i3 = 145 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - b2];
        int i4 = 52 - b2;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i3 + i2) - 11;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2;
            i2 = (i6 + bArr[i3]) - 11;
            i3++;
        }
    }

    public AccountVerificationActivity() {
        final AccountVerificationActivity accountVerificationActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.account.verify.AccountVerificationActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = accountVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.RemoteActionCompatParcelizer = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.account.verify.AccountVerificationActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = accountVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.account.verify.AccountVerificationActivity$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = accountVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.INotificationSideChannelDefault = LazyKt.lazy(new Function0<forLanguageTags>() { // from class: com.bpjstku.presentation.account.verify.AccountVerificationActivity$special$$inlined$inject$default$4
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [forLanguageTags, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final forLanguageTags invoke() {
                ComponentCallbacks componentCallbacks = accountVerificationActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(forLanguageTags.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ getStringOrNull INotificationSideChannel(AccountVerificationActivity accountVerificationActivity) {
        int i = 2 % 2;
        int i2 = disconnect + 21;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull getstringornull = (getStringOrNull) accountVerificationActivity.getInterfaceDescriptor.getValue();
        int i4 = getNotifyChildrenChangedOptions + 73;
        disconnect = i4 % 128;
        if (i4 % 2 != 0) {
            return getstringornull;
        }
        throw null;
    }

    public static final /* synthetic */ void cancel(AccountVerificationActivity accountVerificationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 23;
        disconnect = i2 % 128;
        if (i2 % 2 == 0) {
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(accountVerificationActivity, null, true, 39);
            accountVerificationActivity.d_();
        } else {
            LoginActivity.Companion companion2 = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(accountVerificationActivity, null, false, 6);
            accountVerificationActivity.d_();
        }
        int i3 = getNotifyChildrenChangedOptions + 27;
        disconnect = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final /* synthetic */ String cancelAll(AccountVerificationActivity accountVerificationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 69;
        int i3 = i2 % 128;
        disconnect = i3;
        int i4 = i2 % 2;
        String str = accountVerificationActivity.notify;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 71;
        getNotifyChildrenChangedOptions = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities notify(AccountVerificationActivity accountVerificationActivity) {
        int i = 2 % 2;
        int i2 = disconnect + 23;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = (ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        int i3 = disconnect + 53;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        return activityResultContractsPickVisualMediaMediaCapabilities;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bpjstku/presentation/account/verify/AccountVerificationActivity$Companion;", "", "<init>", "()V", "VERIFICATION_PHONE", "", "VERIFICATION_EMAIL", "VERIFICATION_PHONE_CHANGE_EMAIL", "VERIFICATION_EMAIL_CHANGE_EMAIL", "VERIFICATION_PHONE_CHANGE_PHONE", "VERIFICATION_EMAIL_CHANGE_PHONE", "start", "", "context", "Landroid/content/Context;", "email", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "verificationType", "checkSum", "checkSum2", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        private b() {
        }

        public static /* synthetic */ void b(Context context, String str, String str2, int i, String str3, String str4, int i2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(context, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, i, str3, (i2 & 32) != 0 ? "" : str4);
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, String str, String str2, int i, String str3, String str4) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str3, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context, AccountVerificationActivity.class, new Pair[]{TuplesKt.to("email", str), TuplesKt.to("verification_type", Integer.valueOf(i)), TuplesKt.to("phone_number", str2), TuplesKt.to("check_sum", str3), TuplesKt.to("check_sum2", str4)});
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 39;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(connect[i % i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getTrimmedLength("") + 2187, 39 - TextUtils.lastIndexOf("", '0', 0, 0), 841711447, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(getRoot), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - TextUtils.getTrimmedLength("")), 3011 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 27, 321985076, false, $$i(b4, b5, (byte) (b5 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36506 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3375, 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -968507904, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } else {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(connect[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0) + 2187, 39 - MotionEvent.axisFromString(""), 841711447, false, $$i(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(getRoot), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 33017), TextUtils.getCapsMode("", 0, 0) + 3011, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, 321985076, false, $$i(b10, b11, (byte) (b11 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 36505), Color.red(0) + 3376, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, -968507904, false, $$i(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $10 + 9;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - TextUtils.indexOf("", "", 0, 0)), 3376 - TextUtils.indexOf("", "", 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, -968507904, false, $$i(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                byte b16 = (byte) 0;
                byte b17 = (byte) (b16 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (36504 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 3376, 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -968507904, false, $$i(b16, b17, (byte) (b17 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        int i = 2 % 2;
        int i2 = disconnect + 45;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        AccountVerificationActivity$bindingInflater$1 accountVerificationActivity$bindingInflater$1 = AccountVerificationActivity$bindingInflater$1.b;
        int i4 = disconnect + 47;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return accountVerificationActivity$bindingInflater$1;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        this.asBinder = new getCameraCharacteristic(((ActivityVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvResendCode, null, 2, 0 == true ? 1 : 0);
        int i2 = disconnect + 67;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        AccountVerificationActivity accountVerificationActivity = (AccountVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = disconnect + 105;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = accountVerificationActivity.getIntent().getStringExtra("check_sum");
        String str = "";
        if (stringExtra == null) {
            int i4 = disconnect + 117;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            stringExtra = "";
        }
        accountVerificationActivity.b = stringExtra;
        String stringExtra2 = accountVerificationActivity.getIntent().getStringExtra("check_sum2");
        if (stringExtra2 == null) {
            int i6 = disconnect + 121;
            getNotifyChildrenChangedOptions = i6 % 128;
            int i7 = i6 % 2;
            stringExtra2 = "";
        }
        accountVerificationActivity.d = stringExtra2;
        String stringExtra3 = accountVerificationActivity.getIntent().getStringExtra("email");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        accountVerificationActivity.notify = stringExtra3;
        String stringExtra4 = accountVerificationActivity.getIntent().getStringExtra("phone_number");
        Object obj = null;
        if (stringExtra4 == null) {
            int i8 = disconnect + 123;
            getNotifyChildrenChangedOptions = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str = stringExtra4;
        }
        accountVerificationActivity.INotificationSideChannelStub = str;
        int i9 = disconnect + 107;
        getNotifyChildrenChangedOptions = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:23:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:38:0x0154  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0087  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        String string;
        String str;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String string2;
        String string3;
        int i = 2 % 2;
        AccountVerificationActivity accountVerificationActivity = this;
        Intrinsics.checkNotNullParameter(accountVerificationActivity, "");
        accountVerificationActivity.getWindow().addFlags(8192);
        ExperimentalCamera2Interop.INSTANCE.b(this, new Function1() { // from class: setListNavigationCallbacks
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: setSplitBackgroundDrawable
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (Unit) AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1803864747, new Object[]{this.b}, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1803864751, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        TextView textView = ((ActivityVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle;
        if (((Number) this.MediaBrowserCompat.getValue()).intValue() == 2 || ((Number) this.MediaBrowserCompat.getValue()).intValue() == 4) {
            string = getString(R.string.title_email_verification);
        } else {
            int i2 = disconnect + 123;
            getNotifyChildrenChangedOptions = i2 % 128;
            int i3 = i2 % 2;
            if (((Number) this.MediaBrowserCompat.getValue()).intValue() != 6) {
                string = getString(R.string.title_phone_number_verification);
            } else {
                string = getString(R.string.title_email_verification);
            }
        }
        textView.setText(string);
        ActivityVerifyOtpBinding activityVerifyOtpBinding = (ActivityVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextView textView2 = activityVerifyOtpBinding.tvEmail;
        String str2 = null;
        if (((Number) this.MediaBrowserCompat.getValue()).intValue() == 2 || ((Number) this.MediaBrowserCompat.getValue()).intValue() == 4) {
            str = this.notify;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str2 = str;
            }
            strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        } else {
            int i4 = getNotifyChildrenChangedOptions + 99;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            if (((Number) this.MediaBrowserCompat.getValue()).intValue() != 6) {
                int i6 = disconnect + 107;
                getNotifyChildrenChangedOptions = i6 % 128;
                int i7 = i6 % 2;
                String str3 = this.INotificationSideChannelStub;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str2 = str3;
                }
                strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2);
            } else {
                str = this.notify;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str2 = str;
                }
                strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
            }
        }
        textView2.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        MaterialButton materialButton = activityVerifyOtpBinding.btnChangeEmail;
        if (((Number) this.MediaBrowserCompat.getValue()).intValue() != 2) {
            int i8 = disconnect + 25;
            getNotifyChildrenChangedOptions = i8 % 128;
            if (i8 % 2 == 0 ? ((Number) this.MediaBrowserCompat.getValue()).intValue() == 4 : ((Number) this.MediaBrowserCompat.getValue()).intValue() == 2) {
                string2 = getString(R.string.label_change_email);
            } else if (((Number) this.MediaBrowserCompat.getValue()).intValue() != 6) {
                int i9 = getNotifyChildrenChangedOptions + 69;
                disconnect = i9 % 128;
                int i10 = i9 % 2;
                string2 = getString(R.string.label_change_phone_number);
            } else {
                string2 = getString(R.string.label_change_email);
            }
        } else {
            string2 = getString(R.string.label_change_email);
        }
        materialButton.setText(string2);
        TextView textView3 = activityVerifyOtpBinding.tvVerificationInstruction;
        if (((Number) this.MediaBrowserCompat.getValue()).intValue() == 2 || ((Number) this.MediaBrowserCompat.getValue()).intValue() == 4) {
            String string4 = getString(R.string.label_verification_description);
            int i11 = getNotifyChildrenChangedOptions + 37;
            disconnect = i11 % 128;
            int i12 = i11 % 2;
            string3 = string4;
        } else {
            int i13 = getNotifyChildrenChangedOptions + 61;
            disconnect = i13 % 128;
            if (i13 % 2 != 0 ? ((Number) this.MediaBrowserCompat.getValue()).intValue() == 6 : ((Number) this.MediaBrowserCompat.getValue()).intValue() == 23) {
                String string5 = getString(R.string.label_verification_description);
                int i14 = getNotifyChildrenChangedOptions + 37;
                disconnect = i14 % 128;
                int i15 = i14 % 2;
                string3 = string5;
            } else {
                string3 = getString(R.string.label_verification_description_phonenumber);
            }
        }
        textView3.setText(string3);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AccountVerificationActivity.this.d_();
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getStringOrNull.b {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AccountVerificationActivity.notify(AccountVerificationActivity.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(AccountVerificationActivity.this, null, false, 6);
            AccountVerificationActivity.this.d_();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getStringOrNull.b {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AccountVerificationActivity.INotificationSideChannel(AccountVerificationActivity.this).dismiss();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityVerifyOtpBinding activityVerifyOtpBinding = (ActivityVerifyOtpBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityVerifyOtpBinding.otpVerify.setOtpCompletionListener(new notifyStateAttached() { // from class: ActionBarTab
            @Override // defpackage.notifyStateAttached
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                AccountVerificationActivity.TuitionPaymentFragmentbindingInflater1(activityVerifyOtpBinding, this);
            }
        });
        OtpView otpView = activityVerifyOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        otpView.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: setDisplayHomeAsUpEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activityVerifyOtpBinding, (String) obj);
            }
        }));
        MaterialButton materialButton = activityVerifyOtpBinding.btnVerification;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new setDisplayShowTitleEnabled(this, activityVerifyOtpBinding)));
        MaterialButton materialButton2 = activityVerifyOtpBinding.btnChangeEmail;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setElevation
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        activityVerifyOtpBinding.tvResendCode.setOnClickListener(new View.OnClickListener() { // from class: setDisplayUseLogoEnabled
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1905072398, new Object[]{activityVerifyOtpBinding, this, view}, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1905072397, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        });
        ((getStringOrNull) this.read.getValue()).INotificationSideChannel = new TuitionPaymentFragmentbindingInflater1();
        ((getStringOrNull) this.getInterfaceDescriptor.getValue()).INotificationSideChannel = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i2 = getNotifyChildrenChangedOptions + 25;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class a implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        a() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AccountVerificationActivity.notify(AccountVerificationActivity.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            AccountVerificationActivity.cancel(AccountVerificationActivity.this);
        }
    }

    public static final class d implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        d() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            Intent intent = new Intent(AccountVerificationActivity.this, (Class<?>) EditProfileActivity.class);
            intent.setFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            AccountVerificationActivity.this.startActivity(intent);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AccountVerificationActivity.notify(AccountVerificationActivity.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            AccountVerificationActivity.cancel(AccountVerificationActivity.this);
        }
    }

    public static final class asInterface implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        private static final byte[] $$d = {6, -86, -9, -124, -17, 6, -18, -1, 2, 1, 50, -73, -6, 1, -4, -3, -7, -6, 66, -76, 62, 2, -67, 4, -3, -9, 4, 47, -73, 10, -18, -4, 6, -10, -3, 60, -35, -28, -3, -9, 4, 26, -48, -3, -10, -2, -1, -1, -4, 3, -17, 43, -48, -2, -7, 11, -23, 76, -35, -34, -15, -4, 6, -3, -6, -12, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
        private static final int $$e = 240;
        private static final byte[] $$a = {49, 84, -120, 101, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 111;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 + 4
                byte[] r0 = com.bpjstku.presentation.account.verify.AccountVerificationActivity.asInterface.$$a
                int r8 = r8 * 15
                int r8 = r8 + 38
                int r9 = r9 * 2
                int r9 = 84 - r9
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r9 = r7
                r3 = r8
                r5 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                int r7 = r7 + 1
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r6
            L2c:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                r3 = r5
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.verify.AccountVerificationActivity.asInterface.a(byte, byte, short, java.lang.Object[]):void");
        }

        private static void c(byte b, short s, byte b2, Object[] objArr) {
            int i = b * 10;
            byte[] bArr = $$d;
            int i2 = 97 - (b2 * 13);
            int i3 = (s * 62) + 4;
            byte[] bArr2 = new byte[63 - i];
            int i4 = 62 - i;
            int i5 = -1;
            if (bArr == null) {
                i2 = (i3 + (-i4)) - 4;
                i3++;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i6 = i2;
                i2 = (i6 + (-bArr[i3])) - 4;
                i3++;
            }
        }

        asInterface() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
            Object[] objArr;
            AccountVerificationActivity accountVerificationActivity = AccountVerificationActivity.this;
            String strCancelAll = AccountVerificationActivity.cancelAll(accountVerificationActivity);
            if (strCancelAll == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                strCancelAll = null;
            }
            Intrinsics.checkNotNullParameter(strCancelAll, "");
            User user = (User) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            Intrinsics.checkNotNull(user);
            String str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNull(str);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            sb.append(strCancelAll);
            String string = sb.toString();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cArgb = (char) (43042 - Color.argb(0, 0, 0, 0));
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 3111;
                int jumpTapTimeout = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[132], bArr[5], bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, offsetBefore, jumpTapTimeout, -1272852037, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 43043);
                int iGreen = Color.green(0) + 3111;
                int windowTouchSlop = 22 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                a((byte) 51, bArr2[5], bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, iGreen, windowTouchSlop, -1269618118, false, (String) objArr3[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 43043);
                    int iGreen2 = 3111 - Color.green(0);
                    int i = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b = (byte) ($$b & TypedValues.PositionType.TYPE_PERCENT_WIDTH);
                    byte b2 = $$a[7];
                    Object[] objArr4 = new Object[1];
                    a(b, b2, b2, objArr4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iGreen2, i, 154975793, false, (String) objArr4[0], null);
                }
                Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i2 = ((int[]) objArr5[2])[0];
                int i3 = ((int[]) objArr5[1])[0];
                String[] strArr = (String[]) objArr5[3];
                int[] iArr = {i2};
                int iMyPid = Process.myPid();
                int i4 = 1271398010 + (((~((-723748148) | iMyPid)) | (-998225408)) * (-502)) + ((~((~iMyPid) | (-16942097))) * (-502)) + (((~(iMyPid | (-981283312))) | (-723748148)) * TypedValues.PositionType.TYPE_DRAWPATH) + 1972766724;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
                objArr = new Object[]{new int[1], new int[]{i3}, iArr, strArr};
            } else {
                try {
                    Object[] objArr6 = {null, Integer.valueOf(strCancelAll != null ? strCancelAll.length() : 0), 0, 1972766724};
                    byte[] bArr3 = $$d;
                    byte b3 = bArr3[103];
                    byte b4 = b3;
                    Object[] objArr7 = new Object[1];
                    c(b3, b4, b4, objArr7);
                    Class<?> cls = Class.forName((String) objArr7[0]);
                    byte b5 = bArr3[9];
                    byte b6 = b5;
                    Object[] objArr8 = new Object[1];
                    c(b5, b6, b6, objArr8);
                    Object[] objArr9 = (Object[]) cls.getMethod((String) objArr8[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf2 = (char) (43042 - TextUtils.indexOf("", ""));
                        int windowTouchSlop2 = 3111 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int defaultSize = 22 - View.getDefaultSize(0, 0);
                        byte b7 = (byte) ($$b & TypedValues.PositionType.TYPE_PERCENT_WIDTH);
                        byte b8 = $$a[7];
                        Object[] objArr10 = new Object[1];
                        a(b7, b8, b8, objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, windowTouchSlop2, defaultSize, 154975793, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr9);
                    try {
                        long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char minimumFlingVelocity = (char) (43042 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            int i7 = 3111 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i8 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte[] bArr4 = $$a;
                            Object[] objArr11 = new Object[1];
                            a((byte) 51, bArr4[5], bArr4[7], objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, i7, i8, -1269618118, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43042);
                            int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3110;
                            int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                            byte[] bArr5 = $$a;
                            Object[] objArr12 = new Object[1];
                            a(bArr5[132], bArr5[5], bArr5[7], objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, i9, i10, -1272852037, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr9;
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
            int i11 = ((int[]) objArr[1])[0];
            int i12 = ((int[]) objArr[2])[0];
            if (i12 == i11) {
                int i13 = ((int[]) objArr[0])[0];
                int i14 = ((int[]) objArr[2])[0];
                int i15 = ((int[]) objArr[1])[0];
                String[] strArr2 = (String[]) objArr[3];
                int iIdentityHashCode = System.identityHashCode(this);
                int i16 = i13 + 1470212582 + (((~((~iIdentityHashCode) | (-1684305182))) | 2375685) * 446) + (((~(iIdentityHashCode | (-1681929497))) | 18350592) * 446) + 1059555510;
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                Object[] objArr13 = {new int[1], new int[]{i15}, new int[]{i14}, strArr2};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[3];
                if (strArr3 != null) {
                    for (String str2 : strArr3) {
                        arrayList.add(str2);
                    }
                }
                int[] iArr2 = new int[i12];
                int i19 = i12 - 1;
                iArr2[i19] = 1;
                Toast.makeText((Context) null, iArr2[((i12 * i19) % 2) - 1], 1).show();
                int i20 = ((int[]) objArr[0])[0];
                int i21 = ((int[]) objArr[2])[0];
                int i22 = ((int[]) objArr[1])[0];
                String[] strArr4 = (String[]) objArr[3];
                int[] iArr3 = {i21};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i23 = i20 + 118193812 + (((~((-675432485) | iIdentityHashCode2)) | (~(1029598974 | iIdentityHashCode2))) * 69) + (((~(iIdentityHashCode2 | 677276844)) | (~((-1027754615) | iIdentityHashCode2)) | 352322130) * (-69)) + 127260840;
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr[0])[0] = i25 ^ (i25 << 5);
                Object[] objArr14 = {new int[1], new int[]{i22}, iArr3, strArr4};
            }
            ((IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new LogoutRequest(string));
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        AccountVerificationActivity accountVerificationActivity = this;
        ((forLanguageTags) this.INotificationSideChannelDefault.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: setBackgroundDrawable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.INotificationSideChannelStubProxy(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: ActionBarDisplayOptions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1600973248, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj}, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1600973248, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).a.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: setDefaultDisplayHomeAsUpEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.onTransact(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: setHideOnContentScrollEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.cancel(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).asBinder.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: setStackedBackgroundDrawable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).cancelAll.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: ActionBarNavigationMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).onTransact.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: getContentDescription
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannel.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: onNavigationItemSelected
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannelDefault.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: onMenuVisibilityChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.notify(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getInterfaceDescriptor.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: ActionBarOnNavigationListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.INotificationSideChannel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).asInterface.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: setDisplayOptions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.RemoteActionCompatParcelizer(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).a.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: setLogo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannelStubProxy.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: setWindowTitle
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.INotificationSideChannelStub(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).INotificationSideChannelStub.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: show
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.g(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).RemoteActionCompatParcelizer.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: setShowHideAnimationEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).connect.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: ActionBarOnMenuVisibilityListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).write.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: startActionMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return (Unit) AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1318693657, new Object[]{this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj}, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1318693650, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        }));
        ((IntegerRes) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).IconCompatParcelizer.observe(accountVerificationActivity, new asBinder(new Function1() { // from class: ActionBarLayoutParams
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountVerificationActivity.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = getNotifyChildrenChangedOptions + 119;
        disconnect = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class g implements getCameraState.TuitionPaymentFragmentbindingInflater1 {
        g() {
        }

        @Override // getCameraState.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AccountVerificationActivity.notify(AccountVerificationActivity.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            AccountVerificationActivity.cancel(AccountVerificationActivity.this);
        }
    }

    private static String b(String str) throws NoSuchAlgorithmException {
        int i = 2 % 2;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String string = new BigInteger(1, messageDigest.digest(bytes)).toString(16);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strPadStart = StringsKt.padStart(string, 32, '0');
        int i2 = disconnect + 41;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 == 0) {
            return strPadStart;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 23;
        disconnect = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(item);
                Intrinsics.checkNotNullParameter(item, "");
                item.getItemId();
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(item);
            Intrinsics.checkNotNullParameter(item, "");
            if (item.getItemId() == 16908332) {
                onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = getNotifyChildrenChangedOptions + 45;
            disconnect = i3 % 128;
            if (i3 % 2 != 0) {
                return zOnOptionsItemSelected;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 27;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        getCameraCharacteristic getcameracharacteristic = this.asBinder;
        Object obj = null;
        if (getcameracharacteristic == null) {
            int i4 = disconnect + 125;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i6 = disconnect + 15;
            getNotifyChildrenChangedOptions = i6 % 128;
            if (i6 % 2 != 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                obj.hashCode();
                throw null;
            }
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = null;
        int i2 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        if (i2 != 550387624 + (((~((-656338877) | i3)) | 654861612) * 1504) + ((~(i3 | (-1477265))) * (-1504)) + 1550238464) {
            int i4 = 1293870534 % 2;
            throw new ArithmeticException();
        }
        int i5 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        if (i5 != (-1205616388) + (((~((-1522177527) | i6)) | 448431462) * 336) + (((~(i6 | 1056878438)) | (-2130624503)) * (-168)) + (((~((~i6) | 1056878438)) | (-1522177527)) * 168)) {
            int i7 = 929290952 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        getCameraCharacteristic getcameracharacteristic2 = this.asBinder;
        if (getcameracharacteristic2 == null) {
            int i8 = disconnect + 19;
            getNotifyChildrenChangedOptions = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i9 != 0) {
                getcameracharacteristic.hashCode();
                throw null;
            }
        } else {
            getcameracharacteristic = getcameracharacteristic2;
        }
        getcameracharacteristic.b();
        int i10 = getNotifyChildrenChangedOptions + 5;
        disconnect = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        getCameraCharacteristic getcameracharacteristic = this.asBinder;
        if (getcameracharacteristic == null) {
            int i2 = disconnect + 49;
            getNotifyChildrenChangedOptions = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            getcameracharacteristic = null;
        }
        getCameraCharacteristic.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getcameracharacteristic.b;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            int i3 = getNotifyChildrenChangedOptions + 31;
            disconnect = i3 % 128;
            if (i3 % 2 == 0) {
                tuitionPaymentFragmentbindingInflater1.cancel();
                throw null;
            }
            tuitionPaymentFragmentbindingInflater1.cancel();
        }
        getcameracharacteristic.b = null;
        super.onDestroy();
        int i4 = disconnect + 27;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
    }

    private final String cancelAll() {
        int i = 2 % 2;
        String str = this.asInterface;
        if (str == null) {
            int i2 = getNotifyChildrenChangedOptions + 65;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        String str2 = this.f459a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str;
        Object obj = null;
        if (!StringsKt.isBlank(str3) && !StringsKt.isBlank(str2) && !StringsKt.equals(str2, "Indonesia", true)) {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{str, str2});
            ArrayList arrayList = new ArrayList();
            Iterator it = listListOf.iterator();
            while (!(!it.hasNext())) {
                Object next = it.next();
                if (!StringsKt.isBlank((String) next)) {
                    int i4 = disconnect + 3;
                    getNotifyChildrenChangedOptions = i4 % 128;
                    if (i4 % 2 != 0) {
                        arrayList.add(next);
                        throw null;
                    }
                    arrayList.add(next);
                }
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        }
        if (StringsKt.isBlank(str3)) {
            if (!(!StringsKt.isBlank(str2))) {
                return "";
            }
            int i5 = disconnect + 79;
            getNotifyChildrenChangedOptions = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 79 / 0;
            }
            return str2;
        }
        int i7 = getNotifyChildrenChangedOptions + 125;
        int i8 = i7 % 128;
        disconnect = i8;
        if (i7 % 2 == 0) {
            int i9 = 90 / 0;
        }
        int i10 = i8 + 35;
        getNotifyChildrenChangedOptions = i10 % 128;
        if (i10 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        int i2 = disconnect + 81;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
            int touchSlop = 15 - (ViewConfiguration.getTouchSlop() >> 8);
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c((short) 141, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, minimumFlingVelocity, touchSlop, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_card_prima).substring(46, 51).codePointAt(2) - 62, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bni_mobile).substring(0, 14).codePointAt(0) - 55, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1031;
            int modifierMetaStateMask = 14 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte b3 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 89, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, pressedStateDuration, modifierMetaStateMask, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = getNotifyChildrenChangedOptions + 95;
            disconnect = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                int i7 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr6 = new Object[1];
                c((short) 37, (byte) 52, $$a[3], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, jumpTapTimeout, i7, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i8 = ((int[]) objArr7[3])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i10 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i11 = ~((-287310849) | i10);
            int i12 = ~i10;
            int i13 = (-1155175919) + ((i11 | (~(935329750 | i12))) * 920) + (((~((-892299073) | i12)) | 287310848) * 920) + (((~(i10 | 935329750)) | (~((-287310849) | i12)) | (~((-604988225) | i10))) * 920) + 1439563766;
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr[2])[0] = i15 ^ (i15 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_via_xl_tunai).substring(19, 20).length() + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 25911), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(54 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_mbanking_instruction_step4).substring(39, 42).length() + 13, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 38984), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1677620746};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46038), 1133 - ((byte) KeyEvent.getModifierMetaStateMask()), Drawable.resolveOpacity(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1439563766, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cBlue = (char) Color.blue(0);
                    int i16 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int mirror = '?' - AndroidCharacter.getMirror('0');
                    byte b4 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    c((short) 141, b4, b4, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, i16, mirror, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1117, 17 - Color.argb(0, 0, 0, 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
                    int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                    Object[] objArr13 = new Object[1];
                    c((short) 37, (byte) 52, $$a[3], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, i17, packedPositionType, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(View.MeasureSpec.getSize(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 22, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_kioson).substring(0, 6).codePointAt(1) - 105), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(21 - MotionEvent.axisFromString(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_unknown_error_while_generating_key_hash).substring(0, 35).codePointAt(26) - 116), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i18 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i19 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                        byte b5 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 89, b5, b5, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(minimumFlingVelocity2, i18, i19, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i20 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
                        byte b6 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        c((short) 141, b6, b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i20, deadChar, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i21 = getNotifyChildrenChangedOptions + 81;
                    disconnect = i21 % 128;
                    int i22 = i21 % 2;
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
        int i23 = ((int[]) objArr[1])[0];
        int i24 = ((int[]) objArr[3])[0];
        if (i24 == i23) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[3])[0];
            int i27 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = i25 + 921184090 + (((-608850433) | iIdentityHashCode) * (-381)) + (((~((~iIdentityHashCode) | (-643527433))) | 313634170) * 381) + 43780608;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr18[2])[0] = i30 ^ (i30 << 5);
            int i31 = getNotifyChildrenChangedOptions + 107;
            disconnect = i31 % 128;
            int i32 = i31 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    int i33 = disconnect + 17;
                    getNotifyChildrenChangedOptions = i33 % 128;
                    int i34 = i33 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i24 / (((i24 - 1) * i24) % 2), 0).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i35 = ((int[]) objArr[2])[0];
            int i36 = ((int[]) objArr[3])[0];
            int i37 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i38 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1924618567;
            int i39 = ~i38;
            int i40 = i35 + (-1306613671) + ((~(909657218 | i39)) * (-560)) + ((~(i38 | 934862234)) * (-560)) + (((~((-665377049) | i39)) | 640172032) * 560);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr19[2])[0] = i42 ^ (i42 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf = (char) (29944 - TextUtils.indexOf("", ""));
            int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 23;
            byte[] bArr = $$a;
            Object[] objArr20 = new Object[1];
            c((short) 37, (byte) (-bArr[1]), bArr[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf, minimumFlingVelocity3, iIndexOf, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char minimumFlingVelocity4 = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1755;
                int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 23;
                byte b7 = $$a[7];
                Object[] objArr21 = new Object[1];
                c((short) 89, b7, b7, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(minimumFlingVelocity4, scrollBarSize, windowTouchSlop2, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step4).substring(7, 8).length() - 95985636;
            int i43 = ~length;
            int i44 = (((1541093546 + (((~((-672703476) | i43)) | (-460101050)) * 519)) + (((~(i43 | (-134775218))) | (~((-325325833) | length))) * (-519))) + (((~(length | (-460101050))) | 672703475) * 519)) - 1837940460;
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i46 ^ (i46 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_city).substring(0, 1).codePointAt(0) - 38, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_prima).substring(1, 3).length() + 14, (char) (View.MeasureSpec.getMode(0) + 26026), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_bank_transfer).substring(1, 3).codePointAt(1) - 68, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 39046), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1677620746};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 42049), 1726 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1837940460);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                int i47 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte b8 = $$a[7];
                Object[] objArr26 = new Object[1];
                c((short) 89, b8, b8, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, packedPositionGroup, i47, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart_instruction_done_step3).substring(1, 7).codePointAt(3) - 90, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.akulaku_instruction_step1).substring(5, 7).length() - 2), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 29945);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1755;
                    int i48 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    short s = $$a[7];
                    byte b9 = (byte) s;
                    Object[] objArr29 = new Object[1];
                    c(s, b9, b9, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(gidForName, iMakeMeasureSpec, i48, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int packedPositionChild = 1754 - ExpandableListView.getPackedPositionChild(0L);
                    int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                    byte[] bArr2 = $$a;
                    Object[] objArr30 = new Object[1];
                    c((short) 37, (byte) (-bArr2[1]), bArr2[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(keyRepeatTimeout, packedPositionChild, offsetBefore, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr5 != null) {
                int i49 = getNotifyChildrenChangedOptions + 91;
                disconnect = i49 % 128;
                int i50 = i49 % 2;
                while (i4 < strArr5.length) {
                    int i51 = disconnect + 41;
                    getNotifyChildrenChangedOptions = i51 % 128;
                    if (i51 % 2 != 0) {
                        arrayList2.add(strArr5[i4]);
                        i4 += 116;
                    } else {
                        arrayList2.add(strArr5[i4]);
                        i4++;
                    }
                }
            }
            throw null;
        }
        int i52 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int iMyPid = Process.myPid();
        int i53 = i52 + (-1144866607) + (((~(170423671 | iMyPid)) | 349471360) * 336) + (((~(iMyPid | 383026097)) | 136868934) * (-168)) + (((~((~iMyPid) | 383026097)) | 170423671) * 168);
        int i54 = (i53 << 13) ^ i53;
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr31[3])[0] = i55 ^ (i55 << 5);
        int i56 = getNotifyChildrenChangedOptions + 1;
        disconnect = i56 % 128;
        int i57 = i56 % 2;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws IllegalAccessException {
        AccountVerificationActivity accountVerificationActivity = (AccountVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 79;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        if (i4 != (-1806733070) + (((~((~startElapsedRealtime) | 728564185)) | 1417714720) * 529) + (((~(startElapsedRealtime | 728564185)) | 1558551728) * 529)) {
            int i5 = (-1089941208) % 2;
            throw new ArithmeticException();
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i7 = ~iMaxMemory;
        if (i6 != 251776308 + (((~((-409328155) | i7)) | 2125239485) * (-865)) + ((~(iMaxMemory | 409328154)) * 865) + (((~(2125239485 | i7)) | (~(i7 | 409328154))) * 865)) {
            int i8 = 477764794 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i9 = getNotifyChildrenChangedOptions + 97;
        disconnect = i9 % 128;
        if (i9 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -462856589
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.verify.AccountVerificationActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = getNotifyChildrenChangedOptions + 53;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
            accountVerificationActivity.MediaBrowserCompat();
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            accountVerificationActivity.IconCompatParcelizer();
            getCameraState.Companion bVar = getCameraState.INSTANCE;
            String string = accountVerificationActivity.getString(R.string.label_data_changed_successfully);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = accountVerificationActivity.getString(R.string.label_phone_changed_success_message);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = accountVerificationActivity.getString(R.string.action_ok_back);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string, string2, string3);
            accountVerificationActivity.write = getcamerastateB;
            FragmentManager supportFragmentManager = accountVerificationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i4 = getNotifyChildrenChangedOptions + 121;
                disconnect = i4 % 128;
                if (i4 % 2 == 0) {
                    getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    throw null;
                }
                getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            getCameraState getcamerastate = accountVerificationActivity.write;
            if (getcamerastate != null) {
                getcamerastate.g = accountVerificationActivity.new g();
            }
        } else if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            accountVerificationActivity.IconCompatParcelizer();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityVerifyOtpBinding activityVerifyOtpBinding, String str) {
        int i = 2 % 2;
        int i2 = disconnect + 123;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 == 0 ? str.length() >= 6 : str.length() >= 60) {
            MaterialButton materialButton = activityVerifyOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            MaterialButton materialButton2 = materialButton;
            Intrinsics.checkNotNullParameter(materialButton2, "");
            materialButton2.setEnabled(true);
        } else {
            int i4 = disconnect + 95;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            MaterialButton materialButton3 = activityVerifyOtpBinding.btnVerification;
            Intrinsics.checkNotNullExpressionValue(materialButton3, "");
            MaterialButton materialButton4 = materialButton3;
            Intrinsics.checkNotNullParameter(materialButton4, "");
            materialButton4.setEnabled(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    private static /* synthetic */ Object b(Object[] objArr) {
        int i;
        AccountVerificationActivity accountVerificationActivity = (AccountVerificationActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i2 = 2 % 2;
        int i3 = disconnect + 57;
        int i4 = i3 % 128;
        getNotifyChildrenChangedOptions = i4;
        if (i3 % 2 != 0) {
            int i5 = 79 / 0;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                accountVerificationActivity.MediaBrowserCompat();
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                accountVerificationActivity.IconCompatParcelizer();
                accountVerificationActivity.IconCompatParcelizer = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                i = i4 + 39;
                disconnect = i % 128;
                if (i % 2 == 0) {
                    accountVerificationActivity.IconCompatParcelizer();
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(accountVerificationActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                    int i6 = 18 / 0;
                } else {
                    accountVerificationActivity.IconCompatParcelizer();
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(accountVerificationActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                }
            } else {
                accountVerificationActivity.IconCompatParcelizer();
                int i7 = getNotifyChildrenChangedOptions + 13;
                disconnect = i7 % 128;
                int i8 = i7 % 2;
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            accountVerificationActivity.IconCompatParcelizer();
            accountVerificationActivity.IconCompatParcelizer = ((BaseItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            i = i4 + 39;
            disconnect = i % 128;
            if (i % 2 == 0) {
                accountVerificationActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(accountVerificationActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                int i9 = 18 / 0;
            } else {
                accountVerificationActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(accountVerificationActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        } else {
            accountVerificationActivity.IconCompatParcelizer();
            int i10 = getNotifyChildrenChangedOptions + 13;
            disconnect = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i;
        int i2 = 2 % 2;
        int i3 = getNotifyChildrenChangedOptions;
        int i4 = i3 + 53;
        disconnect = i4 % 128;
        getCameraCharacteristic getcameracharacteristic = null;
        if (i4 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getcameracharacteristic.hashCode();
            throw null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                accountVerificationActivity.IconCompatParcelizer();
                getCameraCharacteristic getcameracharacteristic2 = accountVerificationActivity.asBinder;
                if (getcameracharacteristic2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    getcameracharacteristic = getcameracharacteristic2;
                }
                getcameracharacteristic.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i5 = i3 + 11;
                disconnect = i5 % 128;
                int i6 = i5 % 2;
                accountVerificationActivity.IconCompatParcelizer();
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string = accountVerificationActivity.getString(R.string.label_information);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string2 = accountVerificationActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getStringOrNull.Companion.b(R.drawable.ic_warning_blue, string, strValueOf, string2, null, 112);
                i = disconnect + 75;
                getNotifyChildrenChangedOptions = i % 128;
            } else {
                accountVerificationActivity.IconCompatParcelizer();
            }
            return Unit.INSTANCE;
        }
        accountVerificationActivity.MediaBrowserCompat();
        i = getNotifyChildrenChangedOptions + 19;
        disconnect = i % 128;
        int i7 = i % 2;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        AccountVerificationActivity accountVerificationActivity = (AccountVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = disconnect + 27;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 == 0) {
            accountVerificationActivity.d_();
            return Unit.INSTANCE;
        }
        accountVerificationActivity.d_();
        int i3 = 29 / 0;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = getNotifyChildrenChangedOptions + 77;
            disconnect = i2 % 128;
            if (i2 % 2 == 0) {
                accountVerificationActivity.MediaBrowserCompat();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i3 = getNotifyChildrenChangedOptions + 85;
            disconnect = i3 % 128;
            int i4 = i3 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            getCameraState.Companion bVar = getCameraState.INSTANCE;
            String string = accountVerificationActivity.getString(R.string.label_data_changed_successfully);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = accountVerificationActivity.getString(R.string.label_phone_changed_success_message);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = accountVerificationActivity.getString(R.string.action_ok_back);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string, string2, string3);
            accountVerificationActivity.write = getcamerastateB;
            FragmentManager supportFragmentManager = accountVerificationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i5 = disconnect + 45;
                getNotifyChildrenChangedOptions = i5 % 128;
                int i6 = i5 % 2;
            }
            getCameraState getcamerastate = accountVerificationActivity.write;
            if (getcamerastate != null) {
                getcamerastate.g = accountVerificationActivity.new d();
            }
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            int i7 = getNotifyChildrenChangedOptions + 63;
            disconnect = i7 % 128;
            int i8 = i7 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            getStringOrNull getstringornull = (getStringOrNull) accountVerificationActivity.getInterfaceDescriptor.getValue();
            FragmentManager supportFragmentManager2 = accountVerificationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
            if (supportFragmentManager2.findFragmentByTag(getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getstringornull.show(supportFragmentManager2, getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(AccountVerificationActivity accountVerificationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 37;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        int intExtra = accountVerificationActivity.getIntent().getIntExtra("verification_type", 0);
        int i4 = disconnect + 53;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
        return intExtra;
    }

    public static /* synthetic */ Unit b(final AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = disconnect + 71;
            getNotifyChildrenChangedOptions = i2 % 128;
            int i3 = i2 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            String signature = ((VerificationSignatureItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature();
            Intrinsics.checkNotNull(signature);
            Object obj = StringsKt.split$default((CharSequence) signature, new String[]{"#"}, false, 0, 6, (Object) null).get(2);
            String str = accountVerificationActivity.IconCompatParcelizer;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str = null;
            }
            if (Intrinsics.areEqual(obj, str)) {
                accountVerificationActivity.d_();
                EditPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = EditPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                AccountVerificationActivity accountVerificationActivity2 = accountVerificationActivity;
                String str2 = accountVerificationActivity.b;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str2 = null;
                }
                EditPhoneNumberActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(accountVerificationActivity2, str2);
                int i4 = disconnect + 101;
                getNotifyChildrenChangedOptions = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 5;
                }
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(accountVerificationActivity, "Unauthorized Change Phone", "Coba Kembali", new Function0() { // from class: setSelectedNavigationItem
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountVerificationActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                });
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = disconnect + 59;
        getNotifyChildrenChangedOptions = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit b(AccountVerificationActivity accountVerificationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 93;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        accountVerificationActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = disconnect + 39;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit a(final AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            accountVerificationActivity.MediaBrowserCompat();
            int i2 = disconnect + 57;
            getNotifyChildrenChangedOptions = i2 % 128;
            int i3 = i2 % 2;
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder))) {
            accountVerificationActivity.IconCompatParcelizer();
            String signature = ((VerificationSignatureItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature();
            Intrinsics.checkNotNull(signature);
            Object obj = StringsKt.split$default((CharSequence) signature, new String[]{"#"}, false, 0, 6, (Object) null).get(2);
            String str = accountVerificationActivity.IconCompatParcelizer;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str = null;
            }
            if (Intrinsics.areEqual(obj, str)) {
                accountVerificationActivity.d_();
                EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                AccountVerificationActivity accountVerificationActivity2 = accountVerificationActivity;
                String str3 = accountVerificationActivity.b;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str2 = str3;
                }
                EditEmailActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(accountVerificationActivity2, str2);
            } else {
                String string = accountVerificationActivity.getString(R.string.error_signature_checking);
                Intrinsics.checkNotNullExpressionValue(string, "");
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(accountVerificationActivity, string, "Ok, Coba Kembali", new Function0() { // from class: setNavigationMode
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountVerificationActivity.asBinder(this.b);
                    }
                });
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = getNotifyChildrenChangedOptions + 57;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = getNotifyChildrenChangedOptions + 125;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
            accountVerificationActivity.MediaBrowserCompat();
            int i4 = disconnect + 53;
            getNotifyChildrenChangedOptions = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 5;
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            accountVerificationActivity.IconCompatParcelizer();
            accountVerificationActivity.d_();
            AccountVerificationActivity accountVerificationActivity2 = accountVerificationActivity;
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str3 = null;
            if (userAsBinder != null) {
                int i6 = getNotifyChildrenChangedOptions + 39;
                disconnect = i6 % 128;
                int i7 = i6 % 2;
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str4 = accountVerificationActivity.INotificationSideChannelStub;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str4 = null;
            }
            String str5 = accountVerificationActivity.b;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            } else {
                str2 = str5;
            }
            String str6 = accountVerificationActivity.notify;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str6 = null;
            }
            String str7 = accountVerificationActivity.INotificationSideChannelStub;
            if (str7 == null) {
                int i8 = getNotifyChildrenChangedOptions + 27;
                disconnect = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str3 = str7;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str6);
            sb.append(str3);
            b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(accountVerificationActivity2, str, str4, 5, str2, b(sb.toString()));
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i10 = getNotifyChildrenChangedOptions + 49;
            disconnect = i10 % 128;
            int i11 = i10 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0054 A[PHI: r1
  0x0054: PHI (r1v12 java.lang.String) = (r1v5 java.lang.String), (r1v14 java.lang.String) binds: [B:8:0x0041, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0043 A[PHI: r1
  0x0043: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v14 java.lang.String) binds: [B:8:0x0041, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ getStringOrNull TuitionPaymentFragmentbindingInflater1(AccountVerificationActivity accountVerificationActivity) {
        String string;
        String string2;
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 31;
        disconnect = i2 % 128;
        if (i2 % 2 == 0) {
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            string = accountVerificationActivity.getString(R.string.label_data_changed_failed);
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 5) {
                string2 = accountVerificationActivity.getString(R.string.label_code_doesnt_match_message);
                int i3 = disconnect + 9;
                getNotifyChildrenChangedOptions = i3 % 128;
                int i4 = i3 % 2;
            } else {
                string2 = accountVerificationActivity.getString(R.string.label_code_phone_doesnt_match_message);
            }
        } else {
            getStringOrNull.Companion companion2 = getStringOrNull.INSTANCE;
            string = accountVerificationActivity.getString(R.string.label_data_changed_failed);
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 2) {
                string2 = accountVerificationActivity.getString(R.string.label_code_doesnt_match_message);
                int i5 = disconnect + 9;
                getNotifyChildrenChangedOptions = i5 % 128;
                int i6 = i5 % 2;
            } else {
                string2 = accountVerificationActivity.getString(R.string.label_code_phone_doesnt_match_message);
            }
        }
        String str = string2;
        Intrinsics.checkNotNull(str);
        String string3 = accountVerificationActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_warning_blue, string, str, string3, null, 112);
        int i7 = disconnect + 89;
        getNotifyChildrenChangedOptions = i7 % 128;
        if (i7 % 2 == 0) {
            return getstringornullB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit g(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        int i2 = disconnect + 45;
        int i3 = i2 % 128;
        getNotifyChildrenChangedOptions = i3;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i4 = i3 + 9;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            accountVerificationActivity.IconCompatParcelizer();
            accountVerificationActivity.d_();
            AccountVerificationActivity accountVerificationActivity2 = accountVerificationActivity;
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder != null) {
                int i6 = disconnect + 119;
                getNotifyChildrenChangedOptions = i6 % 128;
                if (i6 % 2 != 0) {
                    String str4 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    throw null;
                }
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else {
                str = null;
            }
            String str5 = str == null ? "" : str;
            String str6 = accountVerificationActivity.INotificationSideChannelStub;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            } else {
                str2 = str6;
            }
            String str7 = accountVerificationActivity.b;
            if (str7 == null) {
                int i7 = disconnect + 3;
                getNotifyChildrenChangedOptions = i7 % 128;
                if (i7 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i8 = 55 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                str3 = null;
            } else {
                str3 = str7;
            }
            b.b(accountVerificationActivity2, str5, str2, 6, str3, null, 32);
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            int i9 = getNotifyChildrenChangedOptions + 29;
            disconnect = i9 % 128;
            int i10 = i9 % 2;
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b1 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02bf A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02d8 A[Catch: all -> 0x0344, TRY_LEAVE, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:111:0x0309  */
    /* JADX WARN: Code duplicated, block: B:113:0x0314 A[Catch: all -> 0x0344, TRY_ENTER, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0318 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x031b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0330 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0333  */
    /* JADX WARN: Code duplicated, block: B:11:0x005d A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0065  */
    /* JADX WARN: Code duplicated, block: B:16:0x0070 A[Catch: all -> 0x0344, TRY_ENTER, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0075 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0083 A[Catch: all -> 0x0344, TRY_LEAVE, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0094 A[Catch: all -> 0x0344, TRY_ENTER, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0103 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0111 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0129 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x012c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0141 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0144  */
    /* JADX WARN: Code duplicated, block: B:38:0x0153 A[Catch: all -> 0x0344, TRY_LEAVE, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0164 A[Catch: all -> 0x0344, TRY_ENTER, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0168 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x017c A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x017f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0186 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01a0 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01a4 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b4 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01d1 A[Catch: all -> 0x0344, TRY_LEAVE, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8 A[Catch: all -> 0x0344, TRY_ENTER, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01ef A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0203 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0206  */
    /* JADX WARN: Code duplicated, block: B:74:0x0209  */
    /* JADX WARN: Code duplicated, block: B:76:0x0221 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x023b A[Catch: all -> 0x0344, TRY_LEAVE, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x024a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0257  */
    /* JADX WARN: Code duplicated, block: B:85:0x0260 A[Catch: all -> 0x0344, TRY_ENTER, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0267 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x026f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0280 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x029d A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02a9 A[Catch: all -> 0x0344, TryCatch #0 {all -> 0x0344, blocks: (B:4:0x0022, B:9:0x0051, B:11:0x005d, B:12:0x0061, B:16:0x0070, B:17:0x0075, B:18:0x0078, B:19:0x0079, B:121:0x0340, B:20:0x0083, B:23:0x0094, B:25:0x00ae, B:26:0x00b2, B:27:0x0103, B:29:0x0111, B:31:0x0129, B:33:0x012d, B:35:0x0141, B:37:0x0145, B:38:0x0153, B:41:0x0164, B:43:0x0168, B:44:0x016c, B:46:0x017c, B:48:0x0180, B:50:0x0186, B:51:0x01a0, B:53:0x01a4, B:54:0x01a8, B:56:0x01ac, B:57:0x01b0, B:59:0x01b4, B:60:0x01b8, B:62:0x01d1, B:66:0x01e8, B:67:0x01ef, B:69:0x01f3, B:71:0x0203, B:75:0x020a, B:76:0x0221, B:77:0x023b, B:81:0x0253, B:85:0x0260, B:86:0x0267, B:88:0x026b, B:91:0x0278, B:92:0x027c, B:94:0x0280, B:95:0x0284, B:97:0x029d, B:99:0x02a9, B:100:0x02ad, B:102:0x02b1, B:103:0x02b5, B:104:0x02bf, B:105:0x02d8, B:109:0x02f1, B:113:0x0314, B:116:0x031c, B:118:0x0330, B:120:0x0334, B:114:0x0318, B:7:0x003a), top: B:126:0x0020 }] */
    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        User userAsBinder;
        String str;
        User userAsBinder2;
        String str2;
        int i;
        int i2;
        String str3;
        String str4;
        String str5;
        StringBuilder sb;
        String str6;
        String str7;
        int i3;
        String str8;
        User userAsBinder3;
        String str9;
        String str10;
        String str11;
        String str12;
        StringBuilder sb2;
        String str13;
        User userAsBinder4;
        String str14;
        int i4;
        User userAsBinder5;
        String str15;
        User userAsBinder6;
        String str16;
        String str17;
        String str18;
        String str19;
        int i5;
        ActivityVerifyOtpBinding activityVerifyOtpBinding = (ActivityVerifyOtpBinding) objArr[0];
        AccountVerificationActivity accountVerificationActivity = (AccountVerificationActivity) objArr[1];
        View view = (View) objArr[2];
        int i6 = 2 % 2;
        int i7 = getNotifyChildrenChangedOptions + 95;
        disconnect = i7 % 128;
        int i8 = i7 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i8 == 0) {
                activityVerifyOtpBinding.otpVerify.getEditableText().clear();
                if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 0) {
                    IntegerRes integerRes = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    str18 = accountVerificationActivity.INotificationSideChannelStub;
                    if (str18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str18 = null;
                    }
                    str19 = accountVerificationActivity.notify;
                    if (str19 == null) {
                        i5 = getNotifyChildrenChangedOptions + 111;
                        disconnect = i5 % 128;
                        if (i5 % 2 != 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str19 = null;
                    }
                    integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new PhoneVerificationRequest(str19, str18));
                } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 2) {
                    final IntegerRes integerRes2 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    String string = Settings.Secure.getString(accountVerificationActivity.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string, "");
                    str17 = accountVerificationActivity.notify;
                    if (str17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str17 = null;
                    }
                    ChangeEmailVerificationRequest changeEmailVerificationRequest = new ChangeEmailVerificationRequest(str17, "", string);
                    Intrinsics.checkNotNullParameter(changeEmailVerificationRequest, "");
                    MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = integerRes2.d;
                    VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(changeEmailVerificationRequest)));
                    final Function1 function1 = new Function1() { // from class: Ranim
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(integerRes2, (Verification) obj);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: XmlRes
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function1.invoke(obj);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: ExperimentalLevel
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntegerRes.TuitionPaymentFragmentbindingInflater1(integerRes2, (Throwable) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: UseExperimental
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function2.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    integerRes2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 3) {
                    IntegerRes integerRes3 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    userAsBinder5 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder5 != null) {
                        str15 = userAsBinder5.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        str15 = null;
                    }
                    String strValueOf = String.valueOf(str15);
                    userAsBinder6 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder6 != null) {
                        str16 = userAsBinder6.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        str16 = null;
                    }
                    integerRes3.TuitionPaymentFragmentbindingInflater1(new ChangeDataFirstVerificationRequest(strValueOf, String.valueOf(str16)));
                } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 4) {
                    str8 = accountVerificationActivity.INotificationSideChannelStub;
                    if (str8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str8 = null;
                    }
                    userAsBinder3 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder3 != null) {
                        str9 = userAsBinder3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        str9 = null;
                    }
                    if (Intrinsics.areEqual(str8, str9)) {
                        str10 = accountVerificationActivity.d;
                        if (str10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str10 = null;
                        }
                        str11 = accountVerificationActivity.notify;
                        if (str11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str11 = null;
                        }
                        str12 = accountVerificationActivity.INotificationSideChannelStub;
                        if (str12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str12 = null;
                        }
                        sb2 = new StringBuilder();
                        sb2.append(str11);
                        sb2.append(str12);
                        if (Intrinsics.areEqual(str10, b(sb2.toString()))) {
                            IntegerRes integerRes4 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                            str13 = accountVerificationActivity.notify;
                            if (str13 == null) {
                                i4 = disconnect + 45;
                                getNotifyChildrenChangedOptions = i4 % 128;
                                if (i4 % 2 != 0) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    int i9 = 76 / 0;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                str13 = null;
                            }
                            userAsBinder4 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                            if (userAsBinder4 != null) {
                                str14 = userAsBinder4.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            } else {
                                str14 = null;
                            }
                            if (str14 == null) {
                                str14 = "";
                            }
                            String string2 = Settings.Secure.getString(accountVerificationActivity.getContentResolver(), "android_id");
                            Intrinsics.checkExpressionValueIsNotNull(string2, "");
                            integerRes4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ChangeEmailVerificationRequest(str13, str14, string2));
                        } else {
                            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Maaf terjadi perbedaan integritas data", 0).show();
                            ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        }
                    } else {
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Maaf terjadi perbedaan integritas data", 0).show();
                        ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 5) {
                    int i10 = disconnect + 79;
                    i2 = i10 % 128;
                    getNotifyChildrenChangedOptions = i2;
                    int i11 = i10 % 2;
                    str3 = accountVerificationActivity.d;
                    if (str3 == null) {
                        i3 = i2 + 7;
                        disconnect = i3 % 128;
                        if (i3 % 2 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            int i12 = 59 / 0;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        str3 = null;
                    }
                    str4 = accountVerificationActivity.notify;
                    if (str4 == null) {
                        int i13 = getNotifyChildrenChangedOptions + 121;
                        disconnect = i13 % 128;
                        int i14 = i13 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str4 = null;
                    }
                    str5 = accountVerificationActivity.INotificationSideChannelStub;
                    if (str5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str5 = null;
                    }
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(str5);
                    if (Intrinsics.areEqual(str3, b(sb.toString()))) {
                        IntegerRes integerRes5 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                        str6 = accountVerificationActivity.notify;
                        if (str6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str6 = null;
                        }
                        str7 = accountVerificationActivity.INotificationSideChannelStub;
                        if (str7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str7 = null;
                        }
                        integerRes5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ChangeHandphoneVerificationRequest(str6, str7));
                    } else {
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Maaf terjadi perbedaan integritas data", 0).show();
                        ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 6) {
                    int i15 = getNotifyChildrenChangedOptions + 35;
                    disconnect = i15 % 128;
                    int i16 = i15 % 2;
                    IntegerRes integerRes6 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder != null) {
                        i = getNotifyChildrenChangedOptions + 43;
                        disconnect = i % 128;
                        if (i % 2 == 0) {
                            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i17 = 35 / 0;
                        } else {
                            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        }
                    } else {
                        str = null;
                    }
                    String strValueOf2 = String.valueOf(str);
                    userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder2 != null) {
                        str2 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        str2 = null;
                    }
                    integerRes6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ChangeDataFirstVerificationRequest(strValueOf2, String.valueOf(str2)));
                }
            } else {
                activityVerifyOtpBinding.otpVerify.getEditableText().clear();
                if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 1) {
                    IntegerRes integerRes7 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    str18 = accountVerificationActivity.INotificationSideChannelStub;
                    if (str18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str18 = null;
                    }
                    str19 = accountVerificationActivity.notify;
                    if (str19 == null) {
                        i5 = getNotifyChildrenChangedOptions + 111;
                        disconnect = i5 % 128;
                        if (i5 % 2 != 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str19 = null;
                    }
                    integerRes7.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new PhoneVerificationRequest(str19, str18));
                } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 2) {
                    final IntegerRes integerRes8 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    String string3 = Settings.Secure.getString(accountVerificationActivity.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string3, "");
                    str17 = accountVerificationActivity.notify;
                    if (str17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str17 = null;
                    }
                    ChangeEmailVerificationRequest changeEmailVerificationRequest2 = new ChangeEmailVerificationRequest(str17, "", string3);
                    Intrinsics.checkNotNullParameter(changeEmailVerificationRequest2, "");
                    MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData2 = integerRes8.d;
                    VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes8.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(changeEmailVerificationRequest2)));
                    final Function1 function3 = new Function1() { // from class: Ranim
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(integerRes8, (Verification) obj);
                        }
                    };
                    logToString logtostring2 = new logToString() { // from class: XmlRes
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function3.invoke(obj);
                        }
                    };
                    final Function1 function4 = new Function1() { // from class: ExperimentalLevel
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntegerRes.TuitionPaymentFragmentbindingInflater1(integerRes8, (Throwable) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: UseExperimental
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function4.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                    integerRes8.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 3) {
                    IntegerRes integerRes9 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    userAsBinder5 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder5 != null) {
                        str15 = userAsBinder5.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        str15 = null;
                    }
                    String strValueOf3 = String.valueOf(str15);
                    userAsBinder6 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder6 != null) {
                        str16 = userAsBinder6.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        str16 = null;
                    }
                    integerRes9.TuitionPaymentFragmentbindingInflater1(new ChangeDataFirstVerificationRequest(strValueOf3, String.valueOf(str16)));
                } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 4) {
                    str8 = accountVerificationActivity.INotificationSideChannelStub;
                    if (str8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str8 = null;
                    }
                    userAsBinder3 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder3 != null) {
                        str9 = userAsBinder3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        str9 = null;
                    }
                    if (Intrinsics.areEqual(str8, str9)) {
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Maaf terjadi perbedaan integritas data", 0).show();
                        ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    } else {
                        str10 = accountVerificationActivity.d;
                        if (str10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str10 = null;
                        }
                        str11 = accountVerificationActivity.notify;
                        if (str11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str11 = null;
                        }
                        str12 = accountVerificationActivity.INotificationSideChannelStub;
                        if (str12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str12 = null;
                        }
                        sb2 = new StringBuilder();
                        sb2.append(str11);
                        sb2.append(str12);
                        if (Intrinsics.areEqual(str10, b(sb2.toString()))) {
                            IntegerRes integerRes10 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                            str13 = accountVerificationActivity.notify;
                            if (str13 == null) {
                                i4 = disconnect + 45;
                                getNotifyChildrenChangedOptions = i4 % 128;
                                if (i4 % 2 != 0) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    int i18 = 76 / 0;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                str13 = null;
                            }
                            userAsBinder4 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                            if (userAsBinder4 != null) {
                                str14 = userAsBinder4.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            } else {
                                str14 = null;
                            }
                            if (str14 == null) {
                                str14 = "";
                            }
                            String string4 = Settings.Secure.getString(accountVerificationActivity.getContentResolver(), "android_id");
                            Intrinsics.checkExpressionValueIsNotNull(string4, "");
                            integerRes10.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ChangeEmailVerificationRequest(str13, str14, string4));
                        } else {
                            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Maaf terjadi perbedaan integritas data", 0).show();
                            ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        }
                    }
                } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 5) {
                    int i19 = disconnect + 79;
                    i2 = i19 % 128;
                    getNotifyChildrenChangedOptions = i2;
                    int i110 = i19 % 2;
                    str3 = accountVerificationActivity.d;
                    if (str3 == null) {
                        i3 = i2 + 7;
                        disconnect = i3 % 128;
                        if (i3 % 2 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            int i111 = 59 / 0;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        str3 = null;
                    }
                    str4 = accountVerificationActivity.notify;
                    if (str4 == null) {
                        int i112 = getNotifyChildrenChangedOptions + 121;
                        disconnect = i112 % 128;
                        int i113 = i112 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str4 = null;
                    }
                    str5 = accountVerificationActivity.INotificationSideChannelStub;
                    if (str5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str5 = null;
                    }
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(str5);
                    if (Intrinsics.areEqual(str3, b(sb.toString()))) {
                        IntegerRes integerRes11 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                        str6 = accountVerificationActivity.notify;
                        if (str6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str6 = null;
                        }
                        str7 = accountVerificationActivity.INotificationSideChannelStub;
                        if (str7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str7 = null;
                        }
                        integerRes11.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ChangeHandphoneVerificationRequest(str6, str7));
                    } else {
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Maaf terjadi perbedaan integritas data", 0).show();
                        ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 6) {
                    int i114 = getNotifyChildrenChangedOptions + 35;
                    disconnect = i114 % 128;
                    int i115 = i114 % 2;
                    IntegerRes integerRes12 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder != null) {
                        i = getNotifyChildrenChangedOptions + 43;
                        disconnect = i % 128;
                        if (i % 2 == 0) {
                            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i116 = 35 / 0;
                        } else {
                            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        }
                    } else {
                        str = null;
                    }
                    String strValueOf4 = String.valueOf(str);
                    userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder2 != null) {
                        str2 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } else {
                        str2 = null;
                    }
                    integerRes12.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ChangeDataFirstVerificationRequest(strValueOf4, String.valueOf(str2)));
                }
            }
            ViewPortBuilder.b();
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ getStringOrNull g(AccountVerificationActivity accountVerificationActivity) {
        String string;
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 45;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string2 = accountVerificationActivity.getString(R.string.label_data_changed_successfully);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 2) {
            int i4 = getNotifyChildrenChangedOptions + 21;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            string = accountVerificationActivity.getString(R.string.label_email_changed_success_message);
        } else {
            string = accountVerificationActivity.getString(R.string.label_phone_changed_success_message);
        }
        String str = string;
        Intrinsics.checkNotNull(str);
        String string3 = accountVerificationActivity.getString(R.string.action_relogin);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_success, string2, str, string3, null, 112);
        int i6 = disconnect + 91;
        getNotifyChildrenChangedOptions = i6 % 128;
        int i7 = i6 % 2;
        return getstringornullB;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final AccountVerificationActivity accountVerificationActivity, ActivityVerifyOtpBinding activityVerifyOtpBinding, View view) {
        int i;
        String str;
        String str2;
        int i2 = 2 % 2;
        int i3 = disconnect + 103;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i4 == 0 ? (i = accountVerificationActivity.g) >= 3 : (i = accountVerificationActivity.g) >= 2) {
            Lazy lazy = LazyKt.lazy(new Function0() { // from class: setDisplayShowCustomEnabled
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            });
            getStringOrNull getstringornull = (getStringOrNull) lazy.getValue();
            FragmentManager supportFragmentManager = accountVerificationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                int i5 = disconnect + 5;
                getNotifyChildrenChangedOptions = i5 % 128;
                int i6 = i5 % 2;
                getstringornull.show(supportFragmentManager, getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ((getStringOrNull) lazy.getValue()).INotificationSideChannel = accountVerificationActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } else {
            accountVerificationActivity.g = i + 1;
            String str3 = null;
            if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 2) {
                forLanguageTags forlanguagetags = (forLanguageTags) accountVerificationActivity.INotificationSideChannelDefault.getValue();
                String str4 = accountVerificationActivity.notify;
                if (str4 == null) {
                    int i7 = getNotifyChildrenChangedOptions + 113;
                    disconnect = i7 % 128;
                    if (i7 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i8 = 96 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    str4 = null;
                }
                String strValueOf = String.valueOf(activityVerifyOtpBinding.otpVerify.getText());
                String str5 = accountVerificationActivity.b;
                if (str5 == null) {
                    int i9 = disconnect + 89;
                    getNotifyChildrenChangedOptions = i9 % 128;
                    int i10 = i9 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str3 = str5;
                }
                forlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ValidationOtpRequest(str4, strValueOf, str3));
            } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 1) {
                forLanguageTags forlanguagetags2 = (forLanguageTags) accountVerificationActivity.INotificationSideChannelDefault.getValue();
                String str6 = accountVerificationActivity.INotificationSideChannelStub;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str6 = null;
                }
                String strValueOf2 = String.valueOf(activityVerifyOtpBinding.otpVerify.getText());
                String str7 = accountVerificationActivity.b;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str3 = str7;
                }
                forlanguagetags2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ValidationOtpRequest(str6, strValueOf2, str3));
            } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 3) {
                final IntegerRes integerRes = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                String str8 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                String str9 = accountVerificationActivity.INotificationSideChannelStub;
                if (str9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str9 = null;
                }
                String strValueOf3 = String.valueOf(activityVerifyOtpBinding.otpVerify.getText());
                String str10 = accountVerificationActivity.b;
                if (str10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str10 = null;
                }
                VerificationOtpRequest verificationOtpRequest = new VerificationOtpRequest(str8, str9, strValueOf3, str10);
                Intrinsics.checkNotNullParameter(verificationOtpRequest, "");
                MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData = integerRes.INotificationSideChannel;
                VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(verificationOtpRequest)));
                final Function1 function1 = new Function1() { // from class: TransitionRes
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IntegerRes.TuitionPaymentFragmentbindingInflater1(integerRes, (VerificationSignatureItem) obj);
                    }
                };
                logToString logtostring = new logToString() { // from class: StyleRes
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function1.invoke(obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: StringRes
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault1(integerRes, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: UiContext
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 4) {
                final IntegerRes integerRes2 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder2 != null) {
                    int i11 = getNotifyChildrenChangedOptions + 57;
                    disconnect = i11 % 128;
                    int i12 = i11 % 2;
                    str2 = userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    str2 = null;
                }
                String str11 = accountVerificationActivity.notify;
                if (str11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str11 = null;
                }
                String strValueOf4 = String.valueOf(activityVerifyOtpBinding.otpVerify.getText());
                String str12 = accountVerificationActivity.b;
                if (str12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str12 = null;
                }
                VerificationOtpRequest verificationOtpRequest2 = new VerificationOtpRequest(str2, str11, strValueOf4, str12);
                Intrinsics.checkNotNullParameter(verificationOtpRequest2, "");
                MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData2 = integerRes2.getInterfaceDescriptor;
                VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(verificationOtpRequest2)));
                final Function1 function3 = new Function1() { // from class: NavigationRes
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(integerRes2, (VerificationSignatureItem) obj);
                    }
                };
                logToString logtostring2 = new logToString() { // from class: OpenForTesting
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function3.invoke(obj);
                    }
                };
                final Function1 function4 = new Function1() { // from class: NonUiContext
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IntegerRes.INotificationSideChannel(integerRes2, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: OptIn
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function4.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                integerRes2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 6) {
                final IntegerRes integerRes3 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                User userAsBinder3 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder3 != null) {
                    str = userAsBinder3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i13 = getNotifyChildrenChangedOptions + 5;
                    disconnect = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    str = null;
                }
                String str13 = accountVerificationActivity.notify;
                if (str13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str13 = null;
                }
                String strValueOf5 = String.valueOf(activityVerifyOtpBinding.otpVerify.getText());
                String str14 = accountVerificationActivity.b;
                if (str14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str14 = null;
                }
                VerificationOtpRequest verificationOtpRequest3 = new VerificationOtpRequest(str, str13, strValueOf5, str14);
                Intrinsics.checkNotNullParameter(verificationOtpRequest3, "");
                MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData3 = integerRes3.RemoteActionCompatParcelizer;
                VirtualCameraAdapter1.Companion bVar3 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB3 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(verificationOtpRequest3)));
                final Function1 function5 = new Function1() { // from class: getNavigationMode
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(integerRes3, (VerificationSignatureItem) obj);
                    }
                };
                logToString logtostring3 = new logToString() { // from class: isTitleTruncated
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function5.invoke(obj);
                    }
                };
                final Function1 function6 = new Function1() { // from class: LongDef
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IntegerRes.b(integerRes3, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5 = derivecodecB3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring3, new logToString() { // from class: MenuRes
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function6.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5, "");
                integerRes3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault5);
            } else if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 5) {
                String str15 = accountVerificationActivity.notify;
                if (str15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str15 = null;
                }
                User userAsBinder4 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (Intrinsics.areEqual(str15, userAsBinder4 != null ? userAsBinder4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null)) {
                    final IntegerRes integerRes4 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    User userAsBinder5 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    String str16 = userAsBinder5 != null ? userAsBinder5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    String str17 = accountVerificationActivity.INotificationSideChannelStub;
                    if (str17 == null) {
                        int i15 = getNotifyChildrenChangedOptions + 77;
                        disconnect = i15 % 128;
                        if (i15 % 2 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            str3.hashCode();
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str17 = null;
                    }
                    String strValueOf6 = String.valueOf(activityVerifyOtpBinding.otpVerify.getText());
                    String str18 = accountVerificationActivity.b;
                    if (str18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i16 = disconnect + 25;
                        getNotifyChildrenChangedOptions = i16 % 128;
                        int i17 = i16 % 2;
                        str18 = null;
                    }
                    VerificationOtpRequest verificationOtpRequest4 = new VerificationOtpRequest(str16, str17, strValueOf6, str18);
                    Intrinsics.checkNotNullParameter(verificationOtpRequest4, "");
                    MutableLiveData<VirtualCameraAdapter1<VerificationSignatureItem>> mutableLiveData4 = integerRes4.write;
                    VirtualCameraAdapter1.Companion bVar4 = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB4 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes4.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(verificationOtpRequest4)));
                    final Function1 function7 = new Function1() { // from class: Rstyleable
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault1(integerRes4, (VerificationSignatureItem) obj);
                        }
                    };
                    logToString logtostring4 = new logToString() { // from class: addTab
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function7.invoke(obj);
                        }
                    };
                    final Function1 function8 = new Function1() { // from class: ActionBar
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntegerRes.d(integerRes4, (Throwable) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault6 = derivecodecB4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring4, new logToString() { // from class: closeOptionsMenu
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function8.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault6, "");
                    integerRes4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                } else {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Maaf terjadi perbedaan integritas data", 0).show();
                    ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault1(AccountVerificationActivity accountVerificationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 83;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = accountVerificationActivity.getString(R.string.label_information);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = accountVerificationActivity.getString(R.string.label_exception_otp_verification);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = accountVerificationActivity.getString(R.string.action_ok_back);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_warning_blue, string, string2, string3, null, 112);
        int i4 = getNotifyChildrenChangedOptions + 35;
        disconnect = i4 % 128;
        int i5 = i4 % 2;
        return getstringornullB;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ActivityVerifyOtpBinding activityVerifyOtpBinding, AccountVerificationActivity accountVerificationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 121;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        OtpView otpView = activityVerifyOtpBinding.otpVerify;
        Intrinsics.checkNotNullExpressionValue(otpView, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(otpView, accountVerificationActivity);
        int i4 = disconnect + 119;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AccountVerificationActivity accountVerificationActivity = (AccountVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = disconnect + 43;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = getNotifyChildrenChangedOptions + 121;
        disconnect = i4 % 128;
        if (i4 % 2 != 0) {
            return userAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit b(AccountVerificationActivity accountVerificationActivity, View view) {
        int i = 2 % 2;
        int i2 = disconnect + 45;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        accountVerificationActivity.d_();
        Unit unit = Unit.INSTANCE;
        int i4 = getNotifyChildrenChangedOptions + 55;
        disconnect = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x0103  */
    /* JADX WARN: Code duplicated, block: B:33:0x0113  */
    /* JADX WARN: Code duplicated, block: B:36:0x011b  */
    /* JADX WARN: Code duplicated, block: B:39:0x014a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0155  */
    /* JADX WARN: Code duplicated, block: B:42:0x015a  */
    public static /* synthetic */ Unit INotificationSideChannelStubProxy(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        User userAsBinder;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        int i2 = 2 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i3 = getNotifyChildrenChangedOptions + 91;
            disconnect = i3 % 128;
            if (i3 % 2 == 0) {
                accountVerificationActivity.MediaBrowserCompat();
                throw null;
            }
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = disconnect + 67;
            getNotifyChildrenChangedOptions = i4 % 128;
            if (i4 % 2 != 0) {
                accountVerificationActivity.IconCompatParcelizer();
                if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 5) {
                    String strCancelAll = accountVerificationActivity.cancelAll();
                    final IntegerRes integerRes = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder != null) {
                        str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        str = null;
                    }
                    str2 = accountVerificationActivity.notify;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    String string = StringsKt.trim((CharSequence) String.valueOf(((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getText())).toString();
                    str4 = accountVerificationActivity.b;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    ChangeEmailRequest changeEmailRequest = new ChangeEmailRequest(str3, str, string, str5, String.valueOf(accountVerificationActivity.INotificationSideChannel), String.valueOf(accountVerificationActivity.cancelAll), strCancelAll);
                    Intrinsics.checkNotNullParameter(changeEmailRequest, "");
                    MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = integerRes.a;
                    VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(changeEmailRequest)));
                    final Function1 function1 = new Function1() { // from class: Rcolor
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(integerRes, (BaseModel) obj2);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: Rinterpolator
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function1.invoke(obj2);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: Rstring
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return IntegerRes.getInterfaceDescriptor(integerRes, (Throwable) obj2);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: Rstyle
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function2.invoke(obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    String strCancelAll2 = accountVerificationActivity.cancelAll();
                    IntegerRes integerRes2 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    str6 = accountVerificationActivity.INotificationSideChannelStub;
                    if (str6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str6 = null;
                    }
                    str7 = accountVerificationActivity.notify;
                    if (str7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i5 = getNotifyChildrenChangedOptions + 53;
                        disconnect = i5 % 128;
                        int i6 = i5 % 2;
                        str7 = null;
                    }
                    String string2 = StringsKt.trim((CharSequence) String.valueOf(((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getText())).toString();
                    str8 = accountVerificationActivity.b;
                    if (str8 == null) {
                        i = getNotifyChildrenChangedOptions + 113;
                        disconnect = i % 128;
                        if (i % 2 != 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            obj.hashCode();
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str8 = null;
                    }
                    integerRes2.TuitionPaymentFragmentbindingInflater1(new ChangePhoneNumberRequest(str6, str7, string2, str8, String.valueOf(accountVerificationActivity.INotificationSideChannel), String.valueOf(accountVerificationActivity.cancelAll), strCancelAll2));
                }
            } else {
                accountVerificationActivity.IconCompatParcelizer();
                if (((Number) accountVerificationActivity.MediaBrowserCompat.getValue()).intValue() == 2) {
                    String strCancelAll3 = accountVerificationActivity.cancelAll();
                    final IntegerRes integerRes3 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder != null) {
                        str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        str = null;
                    }
                    str2 = accountVerificationActivity.notify;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    String string3 = StringsKt.trim((CharSequence) String.valueOf(((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getText())).toString();
                    str4 = accountVerificationActivity.b;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str5 = null;
                    } else {
                        str5 = str4;
                    }
                    ChangeEmailRequest changeEmailRequest2 = new ChangeEmailRequest(str3, str, string3, str5, String.valueOf(accountVerificationActivity.INotificationSideChannel), String.valueOf(accountVerificationActivity.cancelAll), strCancelAll3);
                    Intrinsics.checkNotNullParameter(changeEmailRequest2, "");
                    MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData2 = integerRes3.a;
                    VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(changeEmailRequest2)));
                    final Function1 function3 = new Function1() { // from class: Rcolor
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(integerRes3, (BaseModel) obj2);
                        }
                    };
                    logToString logtostring2 = new logToString() { // from class: Rinterpolator
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function3.invoke(obj2);
                        }
                    };
                    final Function1 function4 = new Function1() { // from class: Rstring
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return IntegerRes.getInterfaceDescriptor(integerRes3, (Throwable) obj2);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: Rstyle
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            function4.invoke(obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                    integerRes3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                } else {
                    String strCancelAll4 = accountVerificationActivity.cancelAll();
                    IntegerRes integerRes4 = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    str6 = accountVerificationActivity.INotificationSideChannelStub;
                    if (str6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str6 = null;
                    }
                    str7 = accountVerificationActivity.notify;
                    if (str7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i7 = getNotifyChildrenChangedOptions + 53;
                        disconnect = i7 % 128;
                        int i8 = i7 % 2;
                        str7 = null;
                    }
                    String string4 = StringsKt.trim((CharSequence) String.valueOf(((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getText())).toString();
                    str8 = accountVerificationActivity.b;
                    if (str8 == null) {
                        i = getNotifyChildrenChangedOptions + 113;
                        disconnect = i % 128;
                        if (i % 2 != 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            obj.hashCode();
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        str8 = null;
                    }
                    integerRes4.TuitionPaymentFragmentbindingInflater1(new ChangePhoneNumberRequest(str6, str7, string4, str8, String.valueOf(accountVerificationActivity.INotificationSideChannel), String.valueOf(accountVerificationActivity.cancelAll), strCancelAll4));
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            accountVerificationActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(accountVerificationActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onTransact(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i;
        int i2 = 2 % 2;
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                accountVerificationActivity.IconCompatParcelizer();
                getCameraState.Companion bVar = getCameraState.INSTANCE;
                String string = accountVerificationActivity.getString(R.string.label_data_changed_successfully);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = accountVerificationActivity.getString(R.string.label_email_changed_success_message);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = accountVerificationActivity.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string, string2, string3);
                accountVerificationActivity.write = getcamerastateB;
                FragmentManager supportFragmentManager = accountVerificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i3 = disconnect + 83;
                    getNotifyChildrenChangedOptions = i3 % 128;
                    int i4 = i3 % 2;
                    getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                getCameraState getcamerastate = accountVerificationActivity.write;
                if (getcamerastate != null) {
                    getcamerastate.g = accountVerificationActivity.new a();
                    i = disconnect + 33;
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i5 = getNotifyChildrenChangedOptions + 63;
                disconnect = i5 % 128;
                int i6 = i5 % 2;
                accountVerificationActivity.IconCompatParcelizer();
                getStringOrNull getstringornull = (getStringOrNull) accountVerificationActivity.getInterfaceDescriptor.getValue();
                FragmentManager supportFragmentManager2 = accountVerificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                if (supportFragmentManager2.findFragmentByTag(getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i7 = getNotifyChildrenChangedOptions + 11;
                    disconnect = i7 % 128;
                    if (i7 % 2 == 0) {
                        getstringornull.show(supportFragmentManager2, getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        int i8 = 71 / 0;
                    } else {
                        getstringornull.show(supportFragmentManager2, getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                i = disconnect + 33;
            } else {
                accountVerificationActivity.IconCompatParcelizer();
            }
            return Unit.INSTANCE;
        }
        accountVerificationActivity.MediaBrowserCompat();
        i = disconnect + 123;
        getNotifyChildrenChangedOptions = i % 128;
        int i9 = i % 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r4.findFragmentByTag(r5.g) == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r4.findFragmentByTag(r5.g) == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r5.show(r4, r5.g);
        r4 = com.bpjstku.presentation.account.verify.AccountVerificationActivity.disconnect + 55;
        com.bpjstku.presentation.account.verify.AccountVerificationActivity.getNotifyChildrenChangedOptions = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ kotlin.Unit cancel(com.bpjstku.presentation.account.verify.AccountVerificationActivity r4, defpackage.VirtualCameraAdapter1 r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.account.verify.AccountVerificationActivity.getNotifyChildrenChangedOptions
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.bpjstku.presentation.account.verify.AccountVerificationActivity.disconnect = r2
            int r1 = r1 % r0
            boolean r1 = r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            if (r1 == 0) goto L1e
            r4.MediaBrowserCompat()
            int r4 = com.bpjstku.presentation.account.verify.AccountVerificationActivity.getNotifyChildrenChangedOptions
            int r4 = r4 + 37
            int r5 = r4 % 128
            com.bpjstku.presentation.account.verify.AccountVerificationActivity.disconnect = r5
        L1b:
            int r4 = r4 % r0
            goto L99
        L1e:
            boolean r1 = r5 instanceof VirtualCameraAdapter1.asBinder
            java.lang.String r3 = ""
            if (r1 == 0) goto L3c
            r4.IconCompatParcelizer()
            getCameraCharacteristic r4 = r4.asBinder
            if (r4 != 0) goto L38
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            int r4 = com.bpjstku.presentation.account.verify.AccountVerificationActivity.disconnect
            int r4 = r4 + 63
            int r5 = r4 % 128
            com.bpjstku.presentation.account.verify.AccountVerificationActivity.getNotifyChildrenChangedOptions = r5
            int r4 = r4 % r0
            r4 = 0
        L38:
            r4.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
            goto L99
        L3c:
            boolean r5 = r5 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            if (r5 == 0) goto L96
            int r2 = r2 + 65
            int r5 = r2 % 128
            com.bpjstku.presentation.account.verify.AccountVerificationActivity.getNotifyChildrenChangedOptions = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L6b
            r4.IconCompatParcelizer()
            kotlin.Lazy r5 = r4.getInterfaceDescriptor
            java.lang.Object r5 = r5.getValue()
            getStringOrNull r5 = (defpackage.getStringOrNull) r5
            androidx.fragment.app.FragmentManager r4 = r4.getSupportFragmentManager()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            androidx.fragment.app.Fragment r1 = r4.findFragmentByTag(r1)
            r2 = 99
            int r2 = r2 / 0
            if (r1 != 0) goto L99
            goto L88
        L6b:
            r4.IconCompatParcelizer()
            kotlin.Lazy r5 = r4.getInterfaceDescriptor
            java.lang.Object r5 = r5.getValue()
            getStringOrNull r5 = (defpackage.getStringOrNull) r5
            androidx.fragment.app.FragmentManager r4 = r4.getSupportFragmentManager()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            androidx.fragment.app.Fragment r1 = r4.findFragmentByTag(r1)
            if (r1 != 0) goto L99
        L88:
            java.lang.String r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r5.show(r4, r1)
            int r4 = com.bpjstku.presentation.account.verify.AccountVerificationActivity.disconnect
            int r4 = r4 + 55
            int r5 = r4 % 128
            com.bpjstku.presentation.account.verify.AccountVerificationActivity.getNotifyChildrenChangedOptions = r5
            goto L1b
        L96:
            r4.IconCompatParcelizer()
        L99:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.verify.AccountVerificationActivity.cancel(com.bpjstku.presentation.account.verify.AccountVerificationActivity, VirtualCameraAdapter1):kotlin.Unit");
    }

    public static /* synthetic */ Unit asInterface(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            accountVerificationActivity.IconCompatParcelizer();
            accountVerificationActivity.d_();
            AccountVerificationActivity accountVerificationActivity2 = accountVerificationActivity;
            String str3 = accountVerificationActivity.notify;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str3 = null;
            }
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder != null) {
                int i2 = getNotifyChildrenChangedOptions + 101;
                disconnect = i2 % 128;
                int i3 = i2 % 2;
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str4 = accountVerificationActivity.b;
            if (str4 == null) {
                int i4 = disconnect + 81;
                getNotifyChildrenChangedOptions = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = getNotifyChildrenChangedOptions + 85;
                disconnect = i6 % 128;
                int i7 = i6 % 2;
                str2 = null;
            } else {
                str2 = str4;
            }
            b.b(accountVerificationActivity2, str3, str, 3, str2, null, 32);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(AccountVerificationActivity accountVerificationActivity, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        accountVerificationActivity.INotificationSideChannel = String.valueOf(userLocationComplete.b);
        accountVerificationActivity.cancelAll = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo != null) {
            int i2 = getNotifyChildrenChangedOptions + 17;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
            str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str != null) {
                int i4 = getNotifyChildrenChangedOptions + 93;
                disconnect = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        accountVerificationActivity.asInterface = str;
        accountVerificationActivity.cancel = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i6 = disconnect + 117;
            getNotifyChildrenChangedOptions = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 / 2;
            }
            str2 = "";
        }
        accountVerificationActivity.f459a = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        accountVerificationActivity.onTransact = str4;
        String str5 = accountVerificationActivity.INotificationSideChannel;
        String str6 = accountVerificationActivity.cancelAll;
        String str7 = accountVerificationActivity.asInterface;
        String str8 = accountVerificationActivity.cancel;
        String str9 = accountVerificationActivity.f459a;
        StringBuilder sb = new StringBuilder("Location from GPS: ");
        sb.append(str5);
        sb.append(", ");
        sb.append(str6);
        sb.append(", City: ");
        sb.append(str7);
        sb.append(", Province: ");
        sb.append(str8);
        sb.append(", Country: ");
        sb.append(str9);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(AccountVerificationActivity accountVerificationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 115;
        disconnect = i2 % 128;
        if (i2 % 2 != 0) {
            accountVerificationActivity.d_();
            return Unit.INSTANCE;
        }
        accountVerificationActivity.d_();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit notify(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            accountVerificationActivity.IconCompatParcelizer();
            accountVerificationActivity.d_();
            AccountVerificationActivity accountVerificationActivity2 = accountVerificationActivity;
            String str2 = accountVerificationActivity.notify;
            String str3 = null;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            }
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder != null) {
                int i2 = getNotifyChildrenChangedOptions + 123;
                disconnect = i2 % 128;
                int i3 = i2 % 2;
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String string = ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1.toString();
            String str4 = accountVerificationActivity.notify;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = getNotifyChildrenChangedOptions + 5;
                disconnect = i4 % 128;
                int i5 = i4 % 2;
                str4 = null;
            }
            String str5 = accountVerificationActivity.INotificationSideChannelStub;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = disconnect + 109;
                getNotifyChildrenChangedOptions = i6 % 128;
                int i7 = i6 % 2;
            } else {
                str3 = str5;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(str3);
            b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(accountVerificationActivity2, str2, str, 4, string, b(sb.toString()));
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = disconnect + 3;
        int i3 = i2 % 128;
        getNotifyChildrenChangedOptions = i3;
        if (i2 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            throw null;
        }
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = i3 + 63;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            getCameraState.Companion bVar = getCameraState.INSTANCE;
            String string = accountVerificationActivity.getString(R.string.label_data_changed_successfully);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = accountVerificationActivity.getString(R.string.label_email_changed_success_message);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = accountVerificationActivity.getString(R.string.action_ok_back);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string, string2, string3);
            accountVerificationActivity.write = getcamerastateB;
            FragmentManager supportFragmentManager = accountVerificationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            getCameraState getcamerastate = accountVerificationActivity.write;
            if (getcamerastate != null) {
                getcamerastate.g = accountVerificationActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = i3 + 47;
            disconnect = i6 % 128;
            int i7 = i6 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannel(final AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions;
        int i3 = i2 + 57;
        disconnect = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = i2 + 73;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            String signature = ((VerificationSignatureItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature();
            Intrinsics.checkNotNull(signature);
            List listSplit$default = StringsKt.split$default((CharSequence) signature, new String[]{"#"}, false, 0, 6, (Object) null);
            String strCancelAll = accountVerificationActivity.cancelAll();
            Object obj2 = listSplit$default.get(2);
            String str3 = accountVerificationActivity.IconCompatParcelizer;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = disconnect + 37;
                getNotifyChildrenChangedOptions = i6 % 128;
                int i7 = i6 % 2;
                str3 = null;
            }
            if (Intrinsics.areEqual(obj2, str3)) {
                final IntegerRes integerRes = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                String str4 = accountVerificationActivity.notify;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                } else {
                    str = str4;
                }
                User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                String str5 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                String string = StringsKt.trim((CharSequence) String.valueOf(((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getText())).toString();
                String str6 = accountVerificationActivity.b;
                if (str6 == null) {
                    int i8 = disconnect + 21;
                    getNotifyChildrenChangedOptions = i8 % 128;
                    if (i8 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i9 = getNotifyChildrenChangedOptions + 71;
                    disconnect = i9 % 128;
                    int i10 = i9 % 2;
                    str2 = null;
                } else {
                    str2 = str6;
                }
                ChangeEmailRequest changeEmailRequest = new ChangeEmailRequest(str, str5, string, str2, String.valueOf(accountVerificationActivity.INotificationSideChannel), String.valueOf(accountVerificationActivity.cancelAll), strCancelAll);
                Intrinsics.checkNotNullParameter(changeEmailRequest, "");
                MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = integerRes.INotificationSideChannelStubProxy;
                VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(changeEmailRequest)));
                final Function1 function1 = new Function1() { // from class: getHideOffset
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return IntegerRes.TuitionPaymentFragmentbindingInflater1(integerRes, (BaseItem) obj3);
                    }
                };
                logToString logtostring = new logToString() { // from class: getHeight
                    @Override // defpackage.logToString
                    public final void accept(Object obj3) {
                        function1.invoke(obj3);
                    }
                };
                final Function1 function2 = new Function1() { // from class: getSelectedNavigationIndex
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return IntegerRes.asBinder(integerRes, (Throwable) obj3);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getNavigationItemCount
                    @Override // defpackage.logToString
                    public final void accept(Object obj3) {
                        function2.invoke(obj3);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                String string2 = accountVerificationActivity.getString(R.string.error_signature_checking);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(accountVerificationActivity, string2, "Coba Kembali", new Function0() { // from class: setDisplayShowHomeEnabled
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return (Unit) AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1697898838, new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault1}, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1697898835, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    }
                });
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit RemoteActionCompatParcelizer(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = disconnect + 89;
        int i3 = i2 % 128;
        getNotifyChildrenChangedOptions = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i3 + 79;
            disconnect = i5 % 128;
            int i6 = i5 % 2;
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i7 = i3 + 51;
            disconnect = i7 % 128;
            int i8 = i7 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(accountVerificationActivity, null, false, 6);
            accountVerificationActivity.d_();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            accountVerificationActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
            int i9 = disconnect + 93;
            getNotifyChildrenChangedOptions = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Code duplicated, block: B:14:0x006a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0073  */
    /* JADX WARN: Code duplicated, block: B:18:0x007d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0083  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public static /* synthetic */ Unit INotificationSideChannelStub(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        getCameraState getcamerastateB;
        FragmentManager supportFragmentManager;
        getCameraState getcamerastate;
        int i = 2 % 2;
        int i2 = disconnect;
        int i3 = i2 + 107;
        int i4 = i3 % 128;
        getNotifyChildrenChangedOptions = i4;
        if (i3 % 2 != 0) {
            int i5 = 6 / 0;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                accountVerificationActivity.MediaBrowserCompat();
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i6 = i2 + 101;
                getNotifyChildrenChangedOptions = i6 % 128;
                int i7 = i6 % 2;
                accountVerificationActivity.IconCompatParcelizer();
                getCameraState.Companion bVar = getCameraState.INSTANCE;
                String string = accountVerificationActivity.getString(R.string.label_data_changed_successfully);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = accountVerificationActivity.getString(R.string.label_email_changed_success_message);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String string3 = accountVerificationActivity.getString(R.string.action_ok_back);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string, string2, string3);
                accountVerificationActivity.write = getcamerastateB;
                supportFragmentManager = accountVerificationActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                getcamerastate = accountVerificationActivity.write;
                if (getcamerastate != null) {
                    getcamerastate.g = accountVerificationActivity.new asInterface();
                }
            } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
                int i8 = i4 + 7;
                disconnect = i8 % 128;
                int i9 = i8 % 2;
                accountVerificationActivity.IconCompatParcelizer();
                ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
            } else {
                accountVerificationActivity.IconCompatParcelizer();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i10 = i2 + 101;
            getNotifyChildrenChangedOptions = i10 % 128;
            int i11 = i10 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            getCameraState.Companion bVar2 = getCameraState.INSTANCE;
            String string4 = accountVerificationActivity.getString(R.string.label_data_changed_successfully);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            String string5 = accountVerificationActivity.getString(R.string.label_email_changed_success_message);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            String string6 = accountVerificationActivity.getString(R.string.action_ok_back);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            getcamerastateB = getCameraState.Companion.b(R.drawable.ic_success, string4, string5, string6);
            accountVerificationActivity.write = getcamerastateB;
            supportFragmentManager = accountVerificationActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(supportFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            getcamerastate = accountVerificationActivity.write;
            if (getcamerastate != null) {
                getcamerastate.g = accountVerificationActivity.new asInterface();
            }
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            int i12 = i4 + 7;
            disconnect = i12 % 128;
            int i13 = i12 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        String str;
        String str2;
        String str3;
        String str4;
        final AccountVerificationActivity accountVerificationActivity = (AccountVerificationActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 15;
        int i3 = i2 % 128;
        disconnect = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            accountVerificationActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i5 = i3 + 51;
            getNotifyChildrenChangedOptions = i5 % 128;
            int i6 = i5 % 2;
            accountVerificationActivity.IconCompatParcelizer();
            String signature = ((VerificationSignatureItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature();
            Intrinsics.checkNotNull(signature);
            List listSplit$default = StringsKt.split$default((CharSequence) signature, new String[]{"#"}, false, 0, 6, (Object) null);
            String strCancelAll = accountVerificationActivity.cancelAll();
            Object obj = listSplit$default.get(2);
            String str5 = accountVerificationActivity.IconCompatParcelizer;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str5 = null;
            }
            if (Intrinsics.areEqual(obj, str5)) {
                int i7 = disconnect + 61;
                getNotifyChildrenChangedOptions = i7 % 128;
                int i8 = i7 % 2;
                final IntegerRes integerRes = (IntegerRes) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) accountVerificationActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder != null) {
                    int i9 = disconnect + 81;
                    getNotifyChildrenChangedOptions = i9 % 128;
                    if (i9 % 2 != 0) {
                        String str6 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        throw null;
                    }
                    str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else {
                    str = null;
                }
                if (str == null) {
                    int i10 = getNotifyChildrenChangedOptions + 119;
                    disconnect = i10 % 128;
                    int i11 = i10 % 2;
                    str2 = "";
                } else {
                    str2 = str;
                }
                String str7 = accountVerificationActivity.INotificationSideChannelStub;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str3 = null;
                } else {
                    str3 = str7;
                }
                String string = StringsKt.trim((CharSequence) String.valueOf(((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getText())).toString();
                String str8 = accountVerificationActivity.b;
                if (str8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str4 = null;
                } else {
                    str4 = str8;
                }
                ChangePhoneNumberRequest changePhoneNumberRequest = new ChangePhoneNumberRequest(str3, str2, string, str4, String.valueOf(accountVerificationActivity.INotificationSideChannel), String.valueOf(accountVerificationActivity.cancelAll), strCancelAll);
                Intrinsics.checkNotNullParameter(changePhoneNumberRequest, "");
                MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = integerRes.IconCompatParcelizer;
                VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(changePhoneNumberRequest)));
                getSelectedTab getselectedtab = new getSelectedTab(new Function1() { // from class: getThemedContext
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return IntegerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(integerRes, (BaseItem) obj2);
                    }
                });
                final Function1 function1 = new Function1() { // from class: getTabAt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return IntegerRes.g(integerRes, (Throwable) obj2);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getselectedtab, new logToString() { // from class: getTabCount
                    @Override // defpackage.logToString
                    public final void accept(Object obj2) {
                        function1.invoke(obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(accountVerificationActivity, "Unauthorized Change Phone Number", "Coba Kembali", new Function0() { // from class: setIcon
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountVerificationActivity.asInterface(this.TuitionPaymentFragmentbindingInflater1);
                    }
                });
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            accountVerificationActivity.IconCompatParcelizer();
            ((ActivityVerifyOtpBinding) ((ViewBinding) accountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).otpVerify.getEditableText().clear();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        } else {
            accountVerificationActivity.IconCompatParcelizer();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(AccountVerificationActivity accountVerificationActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 77;
        disconnect = i2 % 128;
        if (i2 % 2 != 0) {
            accountVerificationActivity.d_();
            return Unit.INSTANCE;
        }
        accountVerificationActivity.d_();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x006b  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IOException {
        AccountVerificationActivity accountVerificationActivity = (AccountVerificationActivity) objArr[0];
        int i = 2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) accountVerificationActivity.RemoteActionCompatParcelizer.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null) {
            int i2 = disconnect + 107;
            getNotifyChildrenChangedOptions = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 73 / 0;
                if (camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                    accountVerificationActivity.INotificationSideChannel = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
                    accountVerificationActivity.cancelAll = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    accountVerificationActivity.asInterface = camera2CameraControlExternalSyntheticLambda4B.b;
                    accountVerificationActivity.cancel = camera2CameraControlExternalSyntheticLambda4B.g;
                    accountVerificationActivity.f459a = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    accountVerificationActivity.onTransact = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String str = accountVerificationActivity.INotificationSideChannel;
                    String str2 = accountVerificationActivity.cancelAll;
                    StringBuilder sb = new StringBuilder("Location from cache: ");
                    sb.append(str);
                    sb.append(", ");
                    sb.append(str2);
                    getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
                } else {
                    accountVerificationActivity.INotificationSideChannel = "0.0";
                    accountVerificationActivity.cancelAll = "0.0";
                    ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
                    getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
                    int i4 = getNotifyChildrenChangedOptions + 21;
                    disconnect = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else if (camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                accountVerificationActivity.INotificationSideChannel = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
                accountVerificationActivity.cancelAll = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                accountVerificationActivity.asInterface = camera2CameraControlExternalSyntheticLambda4B.b;
                accountVerificationActivity.cancel = camera2CameraControlExternalSyntheticLambda4B.g;
                accountVerificationActivity.f459a = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                accountVerificationActivity.onTransact = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str3 = accountVerificationActivity.INotificationSideChannel;
                String str4 = accountVerificationActivity.cancelAll;
                StringBuilder sb2 = new StringBuilder("Location from cache: ");
                sb2.append(str3);
                sb2.append(", ");
                sb2.append(str4);
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb2.toString(), new Object[0]);
            } else {
                accountVerificationActivity.INotificationSideChannel = "0.0";
                accountVerificationActivity.cancelAll = "0.0";
                ExperimentalCamera2Interop experimentalCamera2Interop3 = ExperimentalCamera2Interop.INSTANCE;
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
                int i6 = getNotifyChildrenChangedOptions + 21;
                disconnect = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            accountVerificationActivity.INotificationSideChannel = "0.0";
            accountVerificationActivity.cancelAll = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop4 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
            int i8 = getNotifyChildrenChangedOptions + 21;
            disconnect = i8 % 128;
            int i9 = i8 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i10 = getNotifyChildrenChangedOptions + 27;
        disconnect = i10 % 128;
        if (i10 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1600973248, new Object[]{accountVerificationActivity, virtualCameraAdapter1}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1600973248, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(AccountVerificationActivity accountVerificationActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1697898838, new Object[]{accountVerificationActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1697898835, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ void b(ActivityVerifyOtpBinding activityVerifyOtpBinding, AccountVerificationActivity accountVerificationActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1905072398, new Object[]{activityVerifyOtpBinding, accountVerificationActivity, view}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1905072397, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit cancelAll(AccountVerificationActivity accountVerificationActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1318693657, new Object[]{accountVerificationActivity, virtualCameraAdapter1}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1318693650, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit a(AccountVerificationActivity accountVerificationActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1803864747, new Object[]{accountVerificationActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1803864751, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ User d(AccountVerificationActivity accountVerificationActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (User) TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 429837410, new Object[]{accountVerificationActivity}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -429837400, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static {
        getExtras = 1;
        g();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new b(null);
        int i = getItem + 37;
        getExtras = i % 128;
        if (i % 2 == 0) {
            int i2 = 60 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVerifyOtpBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentbindingInflater1 = zzg.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto4).substring(12, 13).codePointAt(0) + 1939480273, -207226068, new Object[]{this}, iTuitionPaymentFragmentbindingInflater1, 207226077, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 113;
        int i3 = i2 % 128;
        disconnect = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        getNotifyChildrenChangedOptions = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_verify_otp;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzg.TuitionPaymentFragmentbindingInflater1(), -1952467984, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step6).substring(49, 56).codePointAt(5) - 1535601391, 1952467992, zzg.TuitionPaymentFragmentbindingInflater1(), zzg.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzg.TuitionPaymentFragmentbindingInflater1(), 1689879661, new Object[]{this}, zzg.TuitionPaymentFragmentbindingInflater1(), -1689879656, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.shipping_address).substring(12, 13).codePointAt(0) - 775800964);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step5).substring(37, 38).codePointAt(0) - 1694044625, 151315552, new Object[]{this}, (-953721830) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_mobile_instruction_1).substring(14, 15).codePointAt(0), -151315546, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_right_eye_closed).substring(0, 15).length() + 1695285809;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 1717108254, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -1717108252, NewActivationPasswordActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), length);
    }

    static void g() {
        connect = new char[]{45565, 21257, 29710, 6431, 14879, 57106, 57370, 34159, 42539, 19260, 27772, 28934, 4641, 14160, 55378, 64844, 40513, 41844, 17494, 26962, 2659, 12128, 45561, 21259, 29707, 6429, 14851, 57118, 57370, 34067, 42529, 19246, 27710, 28961, 4657, 14158, 55363, 54364, 13996, 4534, 31910, 24564, 47805, 34229, 57477, 50057, 11979, 2475, 5254, 30593, 21245, 48617, 39150, 10591, 52137, 60581, 33193, 41646, 18360, 30880, 7570, 16038, 54148, 62603, 59799, 35505, 45030, 16616, 26086};
        getRoot = -8317478351969299609L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        AccountVerificationActivity accountVerificationActivity = (AccountVerificationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 125;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, int r7, short r8) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r7 = r7 * 3
            int r7 = r7 + 109
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r1 = com.bpjstku.presentation.account.verify.AccountVerificationActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.account.verify.AccountVerificationActivity.$$i(byte, int, short):java.lang.String");
    }
}
