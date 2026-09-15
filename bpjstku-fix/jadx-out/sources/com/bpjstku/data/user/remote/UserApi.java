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
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001fH\u0017¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\b0\u00072\u0006\u0010\u0003\u001a\u00020\"H\u0017¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\b0\u00072\u0006\u0010\u0003\u001a\u00020&H\u0017¢\u0006\u0004\b(\u0010)J#\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\b0\u00072\u0006\u0010\u0003\u001a\u00020*H\u0017¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\b0\u00072\u0006\u0010\u0003\u001a\u00020-H\u0017¢\u0006\u0004\b/\u00100J#\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\b0\u00072\u0006\u0010\u0003\u001a\u000201H\u0017¢\u0006\u0004\b2\u00103J#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\b0\u00072\u0006\u0010\u0003\u001a\u000201H\u0017¢\u0006\u0004\b4\u00103J#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\b0\u00072\u0006\u0010\u0003\u001a\u00020-H\u0017¢\u0006\u0004\b6\u00100J#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\b0\u00072\u0006\u0010\u0003\u001a\u000207H\u0017¢\u0006\u0004\b9\u0010:J#\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b0\u00072\u0006\u0010\u0003\u001a\u00020;H\u0017¢\u0006\u0004\b=\u0010>J#\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020?H\u0017¢\u0006\u0004\b@\u0010AJ#\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\bB\u0010\u0013J#\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001bH\u0017¢\u0006\u0004\bC\u0010\u001eJ#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b0\u00072\u0006\u0010\u0003\u001a\u00020;H\u0017¢\u0006\u0004\bD\u0010>J\u001e\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\b2\u0006\u0010\u0003\u001a\u00020EH\u0096@¢\u0006\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010J"}, d2 = {"Lcom/bpjstku/data/user/remote/UserApi;", "LunbindChildren;", "Lcom/bpjstku/data/user/remote/UserApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/user/remote/UserApiClient;)V", "Lcom/bpjstku/data/user/model/request/LoginRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/user/model/response/LoginItem;", "postLogin", "(Lcom/bpjstku/data/user/model/request/LoginRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/LoginV2Request;", "Lcom/bpjstku/data/user/model/response/LoginV2Response;", "postLoginV2", "(Lcom/bpjstku/data/user/model/request/LoginV2Request;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswordByEmailRequest;", "Lcom/bpjstku/data/user/model/response/ForgotPasswordItem;", "postForgotPasswordByEmail", "(Lcom/bpjstku/data/user/model/request/ForgotPasswordByEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswordByPhoneRequest;", "postForgotPasswordByPhone", "(Lcom/bpjstku/data/user/model/request/ForgotPasswordByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotAccountRequest;", "Lcom/bpjstku/data/user/model/response/ForgotAccountResponse;", "postForgotAccount", "(Lcom/bpjstku/data/user/model/request/ForgotAccountRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ResetPasswordRequest;", "Lcom/bpjstku/data/user/model/response/ResetPasswordItem;", "postResetPassword", "(Lcom/bpjstku/data/user/model/request/ResetPasswordRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ResetPasswordByPhoneRequest;", "postResetPasswordByPhone", "(Lcom/bpjstku/data/user/model/request/ResetPasswordByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;", "Lokhttp3/ResponseBody;", "getProfilePicture", "(Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/UpdateFCMRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "updateFCM", "(Lcom/bpjstku/data/user/model/request/UpdateFCMRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/UpdateDeviceToken;", "updateDeviceToken", "(Lcom/bpjstku/data/user/model/request/UpdateDeviceToken;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/UserRequest;", "Lcom/bpjstku/data/user/model/response/UserProfileItem;", "getProfile", "(Lcom/bpjstku/data/user/model/request/UserRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/LogoutRequest;", "postLogout", "(Lcom/bpjstku/data/user/model/request/LogoutRequest;)LderiveCodec;", "postCustomLogout", "Lcom/bpjstku/data/user/model/response/KpjItem;", "getKpj", "Lcom/bpjstku/data/user/model/request/RefreshTokenRequest;", "Lcom/bpjstku/data/user/model/response/RefreshTokenResponse;", "postRefreshToken", "(Lcom/bpjstku/data/user/model/request/RefreshTokenRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ValidationOtpRequest;", "Lcom/bpjstku/data/user/model/response/ValidationOtpItem;", "postValidationOtpRequest", "(Lcom/bpjstku/data/user/model/request/ValidationOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/user/model/request/ForgotPasswd;", "postForgotPasswdByEmail", "(Lcom/bpjstku/data/user/model/request/ForgotPasswd;)LderiveCodec;", "postValidationByEmail", "postResetPasswdByEmail", "postValidationOtpRequestAuth", "Lcom/bpjstku/data/user/model/request/NotificationBadgeRequest;", "Lcom/bpjstku/data/user/model/response/NotificationBadgeResponse;", "notificationBadge", "(Lcom/bpjstku/data/user/model/request/NotificationBadgeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userApiClient", "Lcom/bpjstku/data/user/remote/UserApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserApi implements unbindChildren, UserApiClient {
    public static final int $stable = 8;
    private final UserApiClient userApiClient;

    public UserApi(UserApiClient userApiClient) {
        Intrinsics.checkNotNullParameter(userApiClient, "");
        this.userApiClient = userApiClient;
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<LoginItem>> postLogin(LoginRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postLogin(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<LoginV2Response>> postLoginV2(LoginV2Request p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postLoginV2(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<ForgotPasswordItem>> postForgotPasswordByEmail(ForgotPasswordByEmailRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postForgotPasswordByEmail(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<ForgotPasswordItem>> postForgotPasswordByPhone(ForgotPasswordByPhoneRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postForgotPasswordByPhone(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<ForgotAccountResponse>> postForgotAccount(ForgotAccountRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postForgotAccount(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<ResetPasswordItem>> postResetPassword(ResetPasswordRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postResetPassword(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<ResetPasswordItem>> postResetPasswordByPhone(ResetPasswordByPhoneRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postResetPasswordByPhone(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<ResponseBody>> getProfilePicture(ProfilePictureRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.getProfilePicture(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<BaseItem>> updateFCM(UpdateFCMRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.updateFCM(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<BaseItem>> updateDeviceToken(UpdateDeviceToken p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.updateDeviceToken(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<UserProfileItem>> getProfile(UserRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.getProfile(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<BaseItem>> postLogout(LogoutRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postLogout(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<BaseItem>> postCustomLogout(LogoutRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postCustomLogout(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<KpjItem>> getKpj(UserRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.getKpj(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<RefreshTokenResponse>> postRefreshToken(RefreshTokenRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postRefreshToken(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<ValidationOtpItem>> postValidationOtpRequest(ValidationOtpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postValidationOtpRequest(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<ForgotPasswordItem>> postForgotPasswdByEmail(ForgotPasswd p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postForgotPasswdByEmail(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<ValidationOtpItem>> postValidationByEmail(ForgotPasswordByEmailRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postValidationByEmail(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<ResetPasswordItem>> postResetPasswdByEmail(ResetPasswordRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postResetPasswdByEmail(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final deriveCodec<Response<ValidationOtpItem>> postValidationOtpRequestAuth(ValidationOtpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.userApiClient.postValidationOtpRequestAuth(p0);
    }

    @Override // com.bpjstku.data.user.remote.UserApiClient
    public final Object notificationBadge(NotificationBadgeRequest notificationBadgeRequest, Continuation<? super Response<NotificationBadgeResponse>> continuation) {
        return this.userApiClient.notificationBadge(notificationBadgeRequest, continuation);
    }
}
