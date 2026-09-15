package com.bpjstku.data.user;

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
import com.bpjstku.data.user.model.response.ForgotAccountItem;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.data.user.model.response.KpjItem;
import com.bpjstku.data.user.model.response.LoginItem;
import com.bpjstku.data.user.model.response.LoginV2Response;
import com.bpjstku.data.user.model.response.RefreshTokenResponse;
import com.bpjstku.data.user.model.response.ResetPasswordItem;
import com.bpjstku.data.user.model.response.UserProfileItem;
import com.bpjstku.data.user.model.response.ValidationOtpItem;
import defpackage.ActivityResultRegistryExternalSyntheticLambda1;
import defpackage.VideoEncoderSession1;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import defpackage.setOnImageAvailableListener;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u0003\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\u0006\u0010\u0003\u001a\u00020,H'¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\u0006\u0010\u0003\u001a\u000200H'¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00042\u0006\u0010\u0003\u001a\u00020,H'¢\u0006\u0004\b5\u0010/J\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00042\u0006\u0010\u0003\u001a\u000206H'¢\u0006\u0004\b8\u00109J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00042\u0006\u0010\u0003\u001a\u00020:H'¢\u0006\u0004\b<\u0010=J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u0003\u001a\u00020>H'¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020;0\u00042\u0006\u0010\u0003\u001a\u00020\u001aH'¢\u0006\u0004\bA\u0010\u001dJ\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\bB\u0010$J\u001d\u0010C\u001a\b\u0012\u0004\u0012\u0002010\u00042\u0006\u0010\u0003\u001a\u000200H'¢\u0006\u0004\bC\u00103J\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020;0\u00042\u0006\u0010\u0003\u001a\u00020:H'¢\u0006\u0004\bD\u0010=J\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F2\u0006\u0010\u0003\u001a\u00020EH¦@¢\u0006\u0004\bH\u0010Iø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/user/UserRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/user/model/request/LoginRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/user/model/response/LoginItem;", "postLogin", "(Lcom/bpjstku/data/user/model/request/LoginRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/LoginV2Request;", "Lcom/bpjstku/data/user/model/response/LoginV2Response;", "postLoginV2", "(Lcom/bpjstku/data/user/model/request/LoginV2Request;)LderiveCodec;", "", "isLoggedIn", "()Z", "Lcom/bpjstku/data/user/model/request/RefreshTokenRequest;", "Lcom/bpjstku/data/user/model/response/RefreshTokenResponse;", "postRefreshToken", "(Lcom/bpjstku/data/user/model/request/RefreshTokenRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/UpdateFCMRequest;", "LVideoEncoderSession1;", "updateRegistrationId", "(Lcom/bpjstku/data/user/model/request/UpdateFCMRequest;)LVideoEncoderSession1;", "Lcom/bpjstku/data/user/model/request/UpdateDeviceToken;", "updateDeviceToken", "(Lcom/bpjstku/data/user/model/request/UpdateDeviceToken;)LVideoEncoderSession1;", "Lcom/bpjstku/data/user/model/request/ForgotPasswordByEmailRequest;", "Lcom/bpjstku/data/user/model/response/ForgotPasswordItem;", "postForgotPasswordByEmail", "(Lcom/bpjstku/data/user/model/request/ForgotPasswordByEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswordByPhoneRequest;", "postForgotPasswordByPhone", "(Lcom/bpjstku/data/user/model/request/ForgotPasswordByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ResetPasswordRequest;", "Lcom/bpjstku/data/user/model/response/ResetPasswordItem;", "postResetPassword", "(Lcom/bpjstku/data/user/model/request/ResetPasswordRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ResetPasswordByPhoneRequest;", "postResetPasswordByPhone", "(Lcom/bpjstku/data/user/model/request/ResetPasswordByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;", "Lokhttp3/ResponseBody;", "getProfilePicture", "(Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/UserRequest;", "Lcom/bpjstku/data/user/model/response/UserProfileItem;", "getProfile", "(Lcom/bpjstku/data/user/model/request/UserRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/LogoutRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postLogout", "(Lcom/bpjstku/data/user/model/request/LogoutRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/response/KpjItem;", "getKpj", "Lcom/bpjstku/data/user/model/request/ForgotAccountRequest;", "Lcom/bpjstku/data/user/model/response/ForgotAccountItem;", "postForgotAccount", "(Lcom/bpjstku/data/user/model/request/ForgotAccountRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ValidationOtpRequest;", "Lcom/bpjstku/data/user/model/response/ValidationOtpItem;", "postValidationOtpRequest", "(Lcom/bpjstku/data/user/model/request/ValidationOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswd;", "postForgotPasswdByEmail", "(Lcom/bpjstku/data/user/model/request/ForgotPasswd;)LderiveCodec;", "postValidationOtpByEmail", "postResetPasswdByEmail", "postCustomLogout", "postValidationOtpRequestAuth", "Lcom/bpjstku/data/user/model/request/NotificationBadgeRequest;", "LsetOnImageAvailableListener;", "LActivityResultRegistryExternalSyntheticLambda1;", "notificationBadge", "(Lcom/bpjstku/data/user/model/request/NotificationBadgeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UserRepository extends getChildrenOutConfigs {
    deriveCodec<KpjItem> getKpj(UserRequest p0);

    deriveCodec<UserProfileItem> getProfile(UserRequest p0);

    deriveCodec<ResponseBody> getProfilePicture(ProfilePictureRequest p0);

    boolean isLoggedIn();

    Object notificationBadge(NotificationBadgeRequest notificationBadgeRequest, Continuation<? super setOnImageAvailableListener<ActivityResultRegistryExternalSyntheticLambda1>> continuation);

    deriveCodec<BaseItem> postCustomLogout(LogoutRequest p0);

    deriveCodec<ForgotAccountItem> postForgotAccount(ForgotAccountRequest p0);

    deriveCodec<ForgotPasswordItem> postForgotPasswdByEmail(ForgotPasswd p0);

    deriveCodec<ForgotPasswordItem> postForgotPasswordByEmail(ForgotPasswordByEmailRequest p0);

    deriveCodec<ForgotPasswordItem> postForgotPasswordByPhone(ForgotPasswordByPhoneRequest p0);

    deriveCodec<LoginItem> postLogin(LoginRequest p0);

    deriveCodec<LoginV2Response> postLoginV2(LoginV2Request p0);

    deriveCodec<BaseItem> postLogout(LogoutRequest p0);

    deriveCodec<RefreshTokenResponse> postRefreshToken(RefreshTokenRequest p0);

    deriveCodec<ResetPasswordItem> postResetPasswdByEmail(ResetPasswordRequest p0);

    deriveCodec<ResetPasswordItem> postResetPassword(ResetPasswordRequest p0);

    deriveCodec<ResetPasswordItem> postResetPasswordByPhone(ResetPasswordByPhoneRequest p0);

    deriveCodec<ValidationOtpItem> postValidationOtpByEmail(ForgotPasswordByEmailRequest p0);

    deriveCodec<ValidationOtpItem> postValidationOtpRequest(ValidationOtpRequest p0);

    deriveCodec<ValidationOtpItem> postValidationOtpRequestAuth(ValidationOtpRequest p0);

    VideoEncoderSession1 updateDeviceToken(UpdateDeviceToken p0);

    VideoEncoderSession1 updateRegistrationId(UpdateFCMRequest p0);
}
