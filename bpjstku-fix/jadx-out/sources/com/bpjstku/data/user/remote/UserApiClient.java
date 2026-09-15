package com.bpjstku.data.user.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.user.model.request.ForgotAccountRequest;
import com.bpjstku.data.user.model.request.ForgotPasswd;
import com.bpjstku.data.user.model.request.ForgotPasswordByEmailRequest;
import com.bpjstku.data.user.model.request.ForgotPasswordByPhoneRequest;
import com.bpjstku.data.user.model.request.LoginRequest;
import com.bpjstku.data.user.model.request.LoginV2Request;
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
import com.bpjstku.data.user.model.response.ForgotAccountResponse;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.data.user.model.response.KpjItem;
import com.bpjstku.data.user.model.response.LoginItem;
import com.bpjstku.data.user.model.response.LoginV2Response;
import com.bpjstku.data.user.model.response.NotificationBadgeResponse;
import com.bpjstku.data.user.model.response.RefreshTokenResponse;
import com.bpjstku.data.user.model.response.ResetPasswordItem;
import com.bpjstku.data.user.model.response.UserProfileItem;
import com.bpjstku.data.user.model.response.ValidationOtpItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.deriveCodec;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH'¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001fH'¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J%\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020'H'¢\u0006\u0004\b(\u0010)J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020*H'¢\u0006\u0004\b,\u0010-J%\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020.H'¢\u0006\u0004\b/\u00100J%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020.H'¢\u0006\u0004\b1\u00100J%\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020*H'¢\u0006\u0004\b3\u0010-J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000204H'¢\u0006\u0004\b6\u00107J%\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000208H'¢\u0006\u0004\b:\u0010;J%\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020<H'¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b?\u0010\u0010J%\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b@\u0010\u001bJ%\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000208H'¢\u0006\u0004\bA\u0010;J \u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00052\b\b\u0001\u0010\u0003\u001a\u00020BH§@¢\u0006\u0004\bD\u0010Eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/user/remote/UserApiClient;", "", "Lcom/bpjstku/data/user/model/request/LoginRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/user/model/response/LoginItem;", "postLogin", "(Lcom/bpjstku/data/user/model/request/LoginRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/LoginV2Request;", "Lcom/bpjstku/data/user/model/response/LoginV2Response;", "postLoginV2", "(Lcom/bpjstku/data/user/model/request/LoginV2Request;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswordByEmailRequest;", "Lcom/bpjstku/data/user/model/response/ForgotPasswordItem;", "postForgotPasswordByEmail", "(Lcom/bpjstku/data/user/model/request/ForgotPasswordByEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswordByPhoneRequest;", "postForgotPasswordByPhone", "(Lcom/bpjstku/data/user/model/request/ForgotPasswordByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotAccountRequest;", "Lcom/bpjstku/data/user/model/response/ForgotAccountResponse;", "postForgotAccount", "(Lcom/bpjstku/data/user/model/request/ForgotAccountRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ResetPasswordRequest;", "Lcom/bpjstku/data/user/model/response/ResetPasswordItem;", "postResetPassword", "(Lcom/bpjstku/data/user/model/request/ResetPasswordRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ResetPasswordByPhoneRequest;", "postResetPasswordByPhone", "(Lcom/bpjstku/data/user/model/request/ResetPasswordByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;", "Lokhttp3/ResponseBody;", "getProfilePicture", "(Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/UpdateFCMRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "updateFCM", "(Lcom/bpjstku/data/user/model/request/UpdateFCMRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/UpdateDeviceToken;", "updateDeviceToken", "(Lcom/bpjstku/data/user/model/request/UpdateDeviceToken;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/UserRequest;", "Lcom/bpjstku/data/user/model/response/UserProfileItem;", "getProfile", "(Lcom/bpjstku/data/user/model/request/UserRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/LogoutRequest;", "postLogout", "(Lcom/bpjstku/data/user/model/request/LogoutRequest;)LderiveCodec;", "postCustomLogout", "Lcom/bpjstku/data/user/model/response/KpjItem;", "getKpj", "Lcom/bpjstku/data/user/model/request/RefreshTokenRequest;", "Lcom/bpjstku/data/user/model/response/RefreshTokenResponse;", "postRefreshToken", "(Lcom/bpjstku/data/user/model/request/RefreshTokenRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ValidationOtpRequest;", "Lcom/bpjstku/data/user/model/response/ValidationOtpItem;", "postValidationOtpRequest", "(Lcom/bpjstku/data/user/model/request/ValidationOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswd;", "postForgotPasswdByEmail", "(Lcom/bpjstku/data/user/model/request/ForgotPasswd;)LderiveCodec;", "postValidationByEmail", "postResetPasswdByEmail", "postValidationOtpRequestAuth", "Lcom/bpjstku/data/user/model/request/NotificationBadgeRequest;", "Lcom/bpjstku/data/user/model/response/NotificationBadgeResponse;", "notificationBadge", "(Lcom/bpjstku/data/user/model/request/NotificationBadgeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UserApiClient {
    @POST("user/kpj")
    deriveCodec<Response<KpjItem>> getKpj(@Body UserRequest p0);

    @POST("user/profile")
    deriveCodec<Response<UserProfileItem>> getProfile(@Body UserRequest p0);

    @POST("profile-picture")
    deriveCodec<Response<ResponseBody>> getProfilePicture(@Body ProfilePictureRequest p0);

    @POST("notifikasi/badge")
    Object notificationBadge(@Body NotificationBadgeRequest notificationBadgeRequest, Continuation<? super Response<NotificationBadgeResponse>> continuation);

    @POST("user/logout")
    deriveCodec<Response<BaseItem>> postCustomLogout(@Body LogoutRequest p0);

    @POST("user/forgot-account")
    deriveCodec<Response<ForgotAccountResponse>> postForgotAccount(@Body ForgotAccountRequest p0);

    @POST("user/lupa-password/email/verifikasi")
    deriveCodec<Response<ForgotPasswordItem>> postForgotPasswdByEmail(@Body ForgotPasswd p0);

    @POST("akun/lupa-password/email/verifikasi")
    deriveCodec<Response<ForgotPasswordItem>> postForgotPasswordByEmail(@Body ForgotPasswordByEmailRequest p0);

    @POST("akun/lupa-password/handphone/verifikasi")
    deriveCodec<Response<ForgotPasswordItem>> postForgotPasswordByPhone(@Body ForgotPasswordByPhoneRequest p0);

    @POST(FirebaseAnalytics.Event.LOGIN)
    deriveCodec<Response<LoginItem>> postLogin(@Body LoginRequest p0);

    @POST("v2/login")
    deriveCodec<Response<LoginV2Response>> postLoginV2(@Body LoginV2Request p0);

    @POST("user/logout")
    deriveCodec<Response<BaseItem>> postLogout(@Body LogoutRequest p0);

    @POST("refresh-token")
    deriveCodec<Response<RefreshTokenResponse>> postRefreshToken(@Body RefreshTokenRequest p0);

    @POST("user/lupa-password/reset")
    deriveCodec<Response<ResetPasswordItem>> postResetPasswdByEmail(@Body ResetPasswordRequest p0);

    @POST("akun/lupa-password/reset")
    deriveCodec<Response<ResetPasswordItem>> postResetPassword(@Body ResetPasswordRequest p0);

    @POST("akun/lupa-password/reset-by-phone")
    deriveCodec<Response<ResetPasswordItem>> postResetPasswordByPhone(@Body ResetPasswordByPhoneRequest p0);

    @POST("user/lupa-password/email/verifikasi-otp")
    deriveCodec<Response<ValidationOtpItem>> postValidationByEmail(@Body ForgotPasswordByEmailRequest p0);

    @POST("verifikasi-otp")
    deriveCodec<Response<ValidationOtpItem>> postValidationOtpRequest(@Body ValidationOtpRequest p0);

    @POST("auth/verifikasi-otp")
    deriveCodec<Response<ValidationOtpItem>> postValidationOtpRequestAuth(@Body ValidationOtpRequest p0);

    @POST("notifikasi/update-device-token")
    deriveCodec<Response<BaseItem>> updateDeviceToken(@Body UpdateDeviceToken p0);

    @POST("notifikasi/updatefcm")
    deriveCodec<Response<BaseItem>> updateFCM(@Body UpdateFCMRequest p0);
}
