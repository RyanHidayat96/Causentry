package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.Settings;
import com.bpjstku.data.devicebinding.model.response.SubmitDeviceBindingResponse;
import com.bpjstku.data.lib.EncryptedSharedPreference;
import com.bpjstku.data.lib.OtherPreferences;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.otpverification.OtpVerificationRepository;
import com.bpjstku.data.user.UserRepository;
import com.bpjstku.data.user.model.request.ForgotAccountRequest;
import com.bpjstku.data.user.model.request.ForgotPasswd;
import com.bpjstku.data.user.model.request.ForgotPasswordByEmailRequest;
import com.bpjstku.data.user.model.request.ForgotPasswordByPhoneRequest;
import com.bpjstku.data.user.model.request.LoginRequest;
import com.bpjstku.data.user.model.request.LogoutRequest;
import com.bpjstku.data.user.model.request.NotificationBadgeRequest;
import com.bpjstku.data.user.model.request.ProfilePictureRequest;
import com.bpjstku.data.user.model.request.RefreshTokenRequest;
import com.bpjstku.data.user.model.request.ResetPasswordByPhoneRequest;
import com.bpjstku.data.user.model.request.ResetPasswordRequest;
import com.bpjstku.data.user.model.request.UpdateDeviceToken;
import com.bpjstku.data.user.model.request.UpdateFCMRequest;
import com.bpjstku.data.user.model.request.UserRequest;
import com.bpjstku.data.user.model.request.ValidationOtpRequest;
import com.bpjstku.data.user.model.response.ForgotAccountItem;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.data.user.model.response.KpjItem;
import com.bpjstku.data.user.model.response.LoginItem;
import com.bpjstku.data.user.model.response.RefreshTokenResponse;
import com.bpjstku.data.user.model.response.ResetPasswordItem;
import com.bpjstku.data.user.model.response.UserItem;
import com.bpjstku.data.user.model.response.UserProfileItem;
import com.bpjstku.data.user.model.response.ValidationOtpItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.user.model.ForgotAccount;
import com.bpjstku.domain.user.model.Login;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.domain.user.model.UserAccessToken;
import com.bpjstku.domain.user.model.ValidationOtp;
import com.midtrans.sdk.corekit.core.Constants;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class getData implements registerlambda1 {
    private final PreferenceManager TuitionPaymentFragmentbindingInflater1;
    private final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final OtpVerificationRepository TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final OtherPreferences b;
    private final UserRepository d;

    public getData(UserRepository userRepository, OtpVerificationRepository otpVerificationRepository, PreferenceManager preferenceManager, OtherPreferences otherPreferences, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        Intrinsics.checkNotNullParameter(userRepository, "");
        Intrinsics.checkNotNullParameter(otpVerificationRepository, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        Intrinsics.checkNotNullParameter(otherPreferences, "");
        Intrinsics.checkNotNullParameter(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, "");
        this.d = userRepository;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = otpVerificationRepository;
        this.TuitionPaymentFragmentbindingInflater1 = preferenceManager;
        this.b = otherPreferences;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // defpackage.registerlambda1
    public final boolean g() {
        return this.d.isLoggedIn();
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<BaseModel> a() {
        User user = (User) this.TuitionPaymentFragmentbindingInflater1.getObject("USER_OBJECT", User.class);
        String str = user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str == null) {
            str = "";
        }
        String str2 = user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        deriveCodec<BaseItem> derivecodecPostLogout = this.d.postLogout(new LogoutRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, sb.toString(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
        final Function1 function1 = new Function1() { // from class: r8lambdaf_tNvtP3uEenATo3uzHmjDoXwg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        };
        logToString logtostring = new logToString() { // from class: accessgetLaunchedKeysp
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(derivecodecPostLogout, logtostring);
        final Function1 function2 = new Function1() { // from class: bindRcKey
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.b((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.onTransact(function2, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(currentsystemtimens, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.registerlambda1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        PreferenceManager preferenceManager = this.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNull(preferenceManager, "");
        ((EncryptedSharedPreference) preferenceManager).clean();
    }

    @Override // defpackage.registerlambda1
    public final String d() {
        return this.TuitionPaymentFragmentbindingInflater1.getString("USER_ACCESS_TOKEN", "");
    }

    @Override // defpackage.registerlambda1
    public final String b() {
        return this.b.getString("KEY_EMAIL", "");
    }

    @Override // defpackage.registerlambda1
    public final void TuitionPaymentFragmentbindingInflater1() {
        PreferenceManager preferenceManager = this.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNull(preferenceManager, "");
        ((EncryptedSharedPreference) preferenceManager).clean();
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<BaseModel> b(LogoutRequest logoutRequest) {
        Intrinsics.checkNotNullParameter(logoutRequest, "");
        deriveCodec<BaseItem> derivecodecPostCustomLogout = this.d.postCustomLogout(new LogoutRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, logoutRequest.getEmail(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)));
        final Function1 function1 = new Function1() { // from class: ActivityResultCallerLauncherresultContract21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentbindingInflater1((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: launchUnitdefault
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.asBinder(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostCustomLogout, readablems);
        generateRandomNumber generaterandomnumber = new generateRandomNumber(new Function1() { // from class: generateRandomNumberlambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        share.b(generaterandomnumber, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(api23Impl, generaterandomnumber);
        Intrinsics.checkNotNullExpressionValue(currentsystemtimens, "");
        return currentsystemtimens;
    }

    @Override // defpackage.registerlambda1
    public final User asBinder() {
        return (User) this.TuitionPaymentFragmentbindingInflater1.getObject("USER_OBJECT", User.class);
    }

    @Override // defpackage.registerlambda1
    public final Login TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return (Login) this.TuitionPaymentFragmentbindingInflater1.getObject("LOGIN_STATUS", Login.class);
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<User> TuitionPaymentFragmentspecialinlinedviewModeldefault1(LoginRequest loginRequest) {
        Intrinsics.checkNotNullParameter(loginRequest, "");
        final String email = loginRequest.getEmail();
        if (email == null) {
            email = "";
        }
        String password = loginRequest.getPassword();
        if (password == null) {
            password = "";
        }
        final String deviceId = loginRequest.getDeviceId();
        if (deviceId == null) {
            deviceId = "";
        }
        deriveCodec<LoginItem> derivecodecPostLogin = this.d.postLogin(new LoginRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, email, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, password, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), loginRequest.getRegisterId(), loginRequest.getDeviceId(), loginRequest.getLatitude(), loginRequest.getLongitude(), loginRequest.getLocality(), loginRequest.getDeviceBrand(), loginRequest.getDeviceModel()));
        final Function1 function1 = new Function1() { // from class: ActivityResultCallerKtExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, email, deviceId, (LoginItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getResultContract
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.getInterfaceDescriptor(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        SingleFlatMap singleFlatMap = new SingleFlatMap(derivecodecPostLogin, readablems);
        final Function1 function2 = new Function1() { // from class: ActivityResultCallerLauncherExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (User) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getCallerContract
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(singleFlatMap, logtostring);
        final Function1 function3 = new Function1() { // from class: getCallerInput
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault3((User) obj);
            }
        };
        readableMs readablems2 = new readableMs() { // from class: resultContract_delegatelambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.INotificationSideChannelStubProxy(function3, obj);
            }
        };
        share.b(readablems2, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(currentsystemtimens, readablems2);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<UserAccessToken> asInterface() {
        String string = this.TuitionPaymentFragmentbindingInflater1.getString("LOGIN_DEVICE_ID", "");
        if (string.length() == 0) {
            string = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string, "");
        }
        deriveCodec<RefreshTokenResponse> derivecodecPostRefreshToken = this.d.postRefreshToken(new RefreshTokenRequest(PreferenceManager.getString$default(this.TuitionPaymentFragmentbindingInflater1, "USER_REFRESH_TOKEN", null, 2, null), string));
        final Function1 function1 = new Function1() { // from class: ActivityResultLauncherKt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (RefreshTokenResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ActivityResultKt
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(derivecodecPostRefreshToken, logtostring);
        final Function1 function2 = new Function1() { // from class: parseResult
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault3((RefreshTokenResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: createIntent
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.INotificationSideChannel(function2, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(currentsystemtimens, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    private final deriveCodec<User> TuitionPaymentFragmentbindingInflater1(UserRequest userRequest) {
        deriveCodec<UserProfileItem> profile = this.d.getProfile(userRequest);
        appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b();
        share.b(appendbackupvideoprofileB, "scheduler is null");
        SingleSubscribeOn singleSubscribeOn = new SingleSubscribeOn(profile, appendbackupvideoprofileB);
        deriveCodec<KpjItem> kpj = this.d.getKpj(userRequest);
        appendBackupVideoProfile appendbackupvideoprofileB2 = isSamsungJ2.b();
        share.b(appendbackupvideoprofileB2, "scheduler is null");
        deriveCodec<User> derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2 = deriveCodec.TuitionPaymentFragmentspecialinlinedviewModeldefault2(singleSubscribeOn, new SingleSubscribeOn(kpj, appendbackupvideoprofileB2), new dumpCodecCapabilities() { // from class: ActivityResultCallerLauncher
            @Override // defpackage.dumpCodecCapabilities
            public final Object b(Object obj, Object obj2) {
                return getData.TuitionPaymentFragmentbindingInflater1((UserProfileItem) obj, (KpjItem) obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        return derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<ForgotPasswordItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ForgotPasswordByEmailRequest forgotPasswordByEmailRequest) {
        Intrinsics.checkNotNullParameter(forgotPasswordByEmailRequest, "");
        deriveCodec<ForgotPasswordItem> derivecodecPostForgotPasswordByEmail = this.d.postForgotPasswordByEmail(forgotPasswordByEmailRequest);
        final Function1 function1 = new Function1() { // from class: ActivityResultCallerKt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.b((ForgotPasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaENwgic5h6novaYdTi_z5SNX1ZBE
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostForgotPasswordByEmail, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<ForgotPasswordItem> b(ForgotPasswordByPhoneRequest forgotPasswordByPhoneRequest) {
        Intrinsics.checkNotNullParameter(forgotPasswordByPhoneRequest, "");
        deriveCodec<ForgotPasswordItem> derivecodecPostForgotPasswordByPhone = this.d.postForgotPasswordByPhone(forgotPasswordByPhoneRequest);
        final Function1 function1 = new Function1() { // from class: ActivityResultCompanion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault1((ForgotPasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getCREATORannotations
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.asInterface(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostForgotPasswordByPhone, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<ForgotAccount> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ForgotAccountRequest forgotAccountRequest) {
        Intrinsics.checkNotNullParameter(forgotAccountRequest, "");
        deriveCodec<ForgotAccountItem> derivecodecPostForgotAccount = this.d.postForgotAccount(forgotAccountRequest);
        final Function1 function1 = new Function1() { // from class: registerForActivityResultlambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault2((ForgotAccountItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdap6fMCAr3kK9mRhAhUUFoxiKf_xU
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.a(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostForgotAccount, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<ActivityResultRegistryExternalSyntheticLambda0> b(ResetPasswordRequest resetPasswordRequest) {
        Intrinsics.checkNotNullParameter(resetPasswordRequest, "");
        String email = resetPasswordRequest.getEmail();
        if (email == null) {
            email = "";
        }
        String password = resetPasswordRequest.getPassword();
        if (password == null) {
            password = "";
        }
        String confirmationPassword = resetPasswordRequest.getConfirmationPassword();
        if (confirmationPassword == null) {
            confirmationPassword = "";
        }
        String checkSum = resetPasswordRequest.getCheckSum();
        deriveCodec<ResetPasswordItem> derivecodecPostResetPassword = this.d.postResetPassword(new ResetPasswordRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, email, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, password, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, confirmationPassword, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, resetPasswordRequest.getOtp(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), checkSum != null ? checkSum : ""));
        final Function1 function1 = new Function1() { // from class: doDispatch
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault1((ResetPasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: accessgetKeyToRcp
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.cancelAll(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostResetPassword, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<ActivityResultRegistryExternalSyntheticLambda0> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ResetPasswordByPhoneRequest resetPasswordByPhoneRequest) {
        Intrinsics.checkNotNullParameter(resetPasswordByPhoneRequest, "");
        String nohp = resetPasswordByPhoneRequest.getNohp();
        if (nohp == null) {
            nohp = "";
        }
        String password = resetPasswordByPhoneRequest.getPassword();
        if (password == null) {
            password = "";
        }
        String confirmationPassword = resetPasswordByPhoneRequest.getConfirmationPassword();
        if (confirmationPassword == null) {
            confirmationPassword = "";
        }
        String checkSum = resetPasswordByPhoneRequest.getCheckSum();
        deriveCodec<ResetPasswordItem> derivecodecPostResetPasswordByPhone = this.d.postResetPasswordByPhone(new ResetPasswordByPhoneRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, nohp, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, password, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, confirmationPassword, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, resetPasswordByPhoneRequest.getOtp(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), checkSum != null ? checkSum : ""));
        final Function1 function1 = new Function1() { // from class: ActivityResultLauncher
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.b((ResetPasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ActivityResultRegistry
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.d(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostResetPasswordByPhone, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<Bitmap> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ProfilePictureRequest profilePictureRequest) {
        Intrinsics.checkNotNullParameter(profilePictureRequest, "");
        deriveCodec<ResponseBody> profilePicture = this.d.getProfilePicture(profilePictureRequest);
        final Function1 function1 = new Function1() { // from class: ActivityResultCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault2((ResponseBody) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ActivityResultCompanionCREATOR1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.notify(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(profilePicture, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<ValidationOtp> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ValidationOtpRequest validationOtpRequest) {
        Intrinsics.checkNotNullParameter(validationOtpRequest, "");
        deriveCodec<ValidationOtpItem> derivecodecPostValidationOtpRequest = this.d.postValidationOtpRequest(validationOtpRequest);
        final Function1 function1 = new Function1() { // from class: launchUnit
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ValidationOtpItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: launchdefault
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostValidationOtpRequest, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<User> b(UserRequest userRequest) {
        Intrinsics.checkNotNullParameter(userRequest, "");
        deriveCodec<User> derivecodecTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(userRequest);
        final Function1 function1 = new Function1() { // from class: ActivityResultCaller
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (User) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: registerForActivityResultlambda1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(derivecodecTuitionPaymentFragmentbindingInflater1, logtostring);
        Intrinsics.checkNotNullExpressionValue(currentsystemtimens, "");
        return currentsystemtimens;
    }

    @Override // defpackage.registerlambda1
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentbindingInflater1.getString("registration_id", "");
    }

    @Override // defpackage.registerlambda1
    public final void TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentbindingInflater1.saveString("registration_id", str);
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<ForgotPasswordItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ForgotPasswd forgotPasswd) {
        Intrinsics.checkNotNullParameter(forgotPasswd, "");
        deriveCodec<ForgotPasswordItem> derivecodecPostForgotPasswdByEmail = this.d.postForgotPasswdByEmail(forgotPasswd);
        final Function1 function1 = new Function1() { // from class: ActivityResultCallerKtExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ForgotPasswordItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaCh0gowsUD3RY0ZHQNvP1kLq24A
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.RemoteActionCompatParcelizer(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPostForgotPasswdByEmail, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.registerlambda1
    public final Object TuitionPaymentFragmentbindingInflater1(NotificationBadgeRequest notificationBadgeRequest, Continuation<? super setOnImageAvailableListener<ActivityResultRegistryExternalSyntheticLambda1>> continuation) {
        return this.d.notificationBadge(notificationBadgeRequest, continuation);
    }

    @Override // defpackage.registerlambda1
    public final deriveCodec<onRestoreInstanceState> b(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        deriveCodec<SubmitDeviceBindingResponse> derivecodecTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(str);
        final Function1 function1 = new Function1() { // from class: registerKey
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getData.TuitionPaymentFragmentbindingInflater1(this.b, (SubmitDeviceBindingResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: dispatchResult
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getData.g(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecTuitionPaymentFragmentbindingInflater1, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ ForgotPasswordItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(ForgotPasswordItem forgotPasswordItem) {
        Intrinsics.checkNotNullParameter(forgotPasswordItem, "");
        return forgotPasswordItem;
    }

    public static /* synthetic */ onRestoreInstanceState TuitionPaymentFragmentbindingInflater1(getData getdata, SubmitDeviceBindingResponse submitDeviceBindingResponse) {
        Intrinsics.checkNotNullParameter(submitDeviceBindingResponse, "");
        if (submitDeviceBindingResponse.getIsSuccessful()) {
            getdata.TuitionPaymentFragmentbindingInflater1.saveString("USER_ACCESS_TOKEN", "");
            getdata.TuitionPaymentFragmentbindingInflater1.saveString("USER_REFRESH_TOKEN", "");
            return new onRestoreInstanceState(true, submitDeviceBindingResponse.getMessage(), "Ganti perangkat berhasil", "", "", null, null, null, null, null, 512, null);
        }
        String message = submitDeviceBindingResponse.getMessage();
        String message2 = submitDeviceBindingResponse.getMessage();
        if (message2 == null) {
            message2 = "Device binding gagal, silakan login kembali";
        }
        return new onRestoreInstanceState(false, message, message2, "", "", null, null, null, null, null, 512, null);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getData getdata) {
        PreferenceManager preferenceManager = getdata.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNull(preferenceManager, "");
        ((EncryptedSharedPreference) preferenceManager).clean();
        Context applicationContext = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        AndroidImageReaderProxyExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1(applicationContext);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault3(User user) {
        Intrinsics.checkNotNullParameter(user, "");
        return user;
    }

    public static /* synthetic */ ValidationOtp TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ValidationOtp) function1.invoke(obj);
    }

    public static /* synthetic */ ForgotPasswordItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ForgotPasswordItem) function1.invoke(obj);
    }

    public static /* synthetic */ ActivityResultRegistryExternalSyntheticLambda0 d(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ActivityResultRegistryExternalSyntheticLambda0) function1.invoke(obj);
    }

    public static /* synthetic */ ActivityResultRegistryExternalSyntheticLambda0 b(ResetPasswordItem resetPasswordItem) {
        Intrinsics.checkNotNullParameter(resetPasswordItem, "");
        unregisteractivity unregisteractivityVar = unregisteractivity.INSTANCE;
        return unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1().invoke(resetPasswordItem);
    }

    public static /* synthetic */ ForgotAccount TuitionPaymentFragmentspecialinlinedviewModeldefault2(ForgotAccountItem forgotAccountItem) {
        Intrinsics.checkNotNullParameter(forgotAccountItem, "");
        unregisteractivity unregisteractivityVar = unregisteractivity.INSTANCE;
        return unregisteractivity.TuitionPaymentFragmentbindingInflater1().invoke(forgotAccountItem);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getData getdata, User user) {
        PreferenceManager preferenceManager = getdata.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNull(user);
        preferenceManager.saveObject("USER_OBJECT", user);
        OtherPreferences otherPreferences = getdata.b;
        String str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str == null) {
            str = "";
        }
        otherPreferences.saveString("KEY_EMAIL", str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ generateBackupProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2(getData getdata, String str, String str2, LoginItem loginItem) {
        Intrinsics.checkNotNullParameter(loginItem, "");
        String accessToken = loginItem.getAccessToken();
        if (accessToken != null) {
            getdata.TuitionPaymentFragmentbindingInflater1.saveString("USER_ACCESS_TOKEN", accessToken);
        }
        String refreshToken = loginItem.getRefreshToken();
        if (refreshToken != null) {
            getdata.TuitionPaymentFragmentbindingInflater1.saveString("USER_REFRESH_TOKEN", refreshToken);
        }
        PreferenceManager preferenceManager = getdata.TuitionPaymentFragmentbindingInflater1;
        String statusCode = loginItem.getStatusCode();
        preferenceManager.saveString("LOGIN_STATUS", (statusCode == null || statusCode.length() == 0) ? Constants.STATUS_CODE_200 : loginItem.getStatusCode());
        return getdata.TuitionPaymentFragmentbindingInflater1(new UserRequest(str, str2));
    }

    public static /* synthetic */ ForgotPasswordItem asInterface(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ForgotPasswordItem) function1.invoke(obj);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getData getdata, RefreshTokenResponse refreshTokenResponse) {
        getdata.TuitionPaymentFragmentbindingInflater1.saveString("USER_ACCESS_TOKEN", String.valueOf(refreshTokenResponse.getAccessToken()));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ onRestoreInstanceState g(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (onRestoreInstanceState) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentbindingInflater1(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ ForgotPasswordItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(ForgotPasswordItem forgotPasswordItem) {
        Intrinsics.checkNotNullParameter(forgotPasswordItem, "");
        unregisteractivity unregisteractivityVar = unregisteractivity.INSTANCE;
        return unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2().invoke(forgotPasswordItem);
    }

    public static /* synthetic */ ForgotAccount a(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ForgotAccount) function1.invoke(obj);
    }

    public static /* synthetic */ UserAccessToken INotificationSideChannel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (UserAccessToken) function1.invoke(obj);
    }

    public static /* synthetic */ ForgotPasswordItem b(ForgotPasswordItem forgotPasswordItem) {
        Intrinsics.checkNotNullParameter(forgotPasswordItem, "");
        unregisteractivity unregisteractivityVar = unregisteractivity.INSTANCE;
        return unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2().invoke(forgotPasswordItem);
    }

    public static /* synthetic */ BaseModel onTransact(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    public static /* synthetic */ Bitmap notify(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Bitmap) function1.invoke(obj);
    }

    public static /* synthetic */ ActivityResultRegistryExternalSyntheticLambda0 cancelAll(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ActivityResultRegistryExternalSyntheticLambda0) function1.invoke(obj);
    }

    public static /* synthetic */ User INotificationSideChannelStubProxy(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (User) function1.invoke(obj);
    }

    public static /* synthetic */ User TuitionPaymentFragmentbindingInflater1(UserProfileItem userProfileItem, KpjItem kpjItem) {
        Intrinsics.checkNotNullParameter(userProfileItem, "");
        Intrinsics.checkNotNullParameter(kpjItem, "");
        UserItem userItemCopy$default = UserItem.copy$default(userProfileItem.getUser(), null, null, null, null, null, null, null, kpjItem.getKpj(), null, null, null, null, null, null, null, null, null, null, null, 524159, null);
        unregisteractivity unregisteractivityVar = unregisteractivity.INSTANCE;
        User userInvoke = unregisteractivity.b().invoke(userItemCopy$default);
        Intrinsics.checkNotNull(userInvoke);
        return userInvoke;
    }

    public static /* synthetic */ Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "");
        return BitmapFactory.decodeStream(responseBody.byteStream());
    }

    public static /* synthetic */ ForgotPasswordItem RemoteActionCompatParcelizer(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ForgotPasswordItem) function1.invoke(obj);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getData getdata) {
        PreferenceManager preferenceManager = getdata.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNull(preferenceManager, "");
        ((EncryptedSharedPreference) preferenceManager).clean();
        Context applicationContext = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        AndroidImageReaderProxyExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1(applicationContext);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ValidationOtp TuitionPaymentFragmentspecialinlinedviewModeldefault3(ValidationOtpItem validationOtpItem) {
        Intrinsics.checkNotNullParameter(validationOtpItem, "");
        unregisteractivity unregisteractivityVar = unregisteractivity.INSTANCE;
        return unregisteractivity.d().invoke(validationOtpItem);
    }

    public static /* synthetic */ UserAccessToken TuitionPaymentFragmentspecialinlinedviewModeldefault3(RefreshTokenResponse refreshTokenResponse) {
        Intrinsics.checkNotNullParameter(refreshTokenResponse, "");
        unregisteractivity unregisteractivityVar = unregisteractivity.INSTANCE;
        return unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3().invoke(refreshTokenResponse);
    }

    public static /* synthetic */ generateBackupProfile getInterfaceDescriptor(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (generateBackupProfile) function1.invoke(obj);
    }

    public static /* synthetic */ ActivityResultRegistryExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault1(ResetPasswordItem resetPasswordItem) {
        Intrinsics.checkNotNullParameter(resetPasswordItem, "");
        unregisteractivity unregisteractivityVar = unregisteractivity.INSTANCE;
        return unregisteractivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1().invoke(resetPasswordItem);
    }

    public static /* synthetic */ BaseModel b(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new BaseModel(baseItem.getIsSuccessful(), baseItem.getMessage());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getData getdata, User user) {
        PreferenceManager preferenceManager = getdata.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNull(user);
        preferenceManager.saveObject("USER_OBJECT", user);
        OtherPreferences otherPreferences = getdata.b;
        String str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str == null) {
            str = "";
        }
        otherPreferences.saveString("KEY_EMAIL", str);
        return Unit.INSTANCE;
    }

    @Override // defpackage.registerlambda1
    public final VideoEncoderSession1 b(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        User user = (User) this.TuitionPaymentFragmentbindingInflater1.getObject("USER_OBJECT", User.class);
        if ((user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null) != null) {
            UserRepository userRepository = this.d;
            String str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return userRepository.updateDeviceToken(new UpdateDeviceToken(str2 != null ? str2 : "", str, "com.bpjstku"));
        }
        VideoEncoderSession1 videoEncoderSession1TuitionPaymentFragmentbindingInflater1 = VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1();
        Intrinsics.checkNotNull(videoEncoderSession1TuitionPaymentFragmentbindingInflater1);
        return videoEncoderSession1TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.registerlambda1
    public final VideoEncoderSession1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        User user = (User) this.TuitionPaymentFragmentbindingInflater1.getObject("USER_OBJECT", User.class);
        if ((user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null) != null) {
            UserRepository userRepository = this.d;
            String str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return userRepository.updateRegistrationId(new UpdateFCMRequest(str2 != null ? str2 : "", str));
        }
        VideoEncoderSession1 videoEncoderSession1TuitionPaymentFragmentbindingInflater1 = VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1();
        Intrinsics.checkNotNull(videoEncoderSession1TuitionPaymentFragmentbindingInflater1);
        return videoEncoderSession1TuitionPaymentFragmentbindingInflater1;
    }
}
