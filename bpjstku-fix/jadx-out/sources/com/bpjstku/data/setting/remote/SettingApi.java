package com.bpjstku.data.setting.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.general.model.response.VerificationSignatureItem;
import com.bpjstku.data.setting.model.request.AddKpjRequest;
import com.bpjstku.data.setting.model.request.ChangeDataFirstVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeEmailRequest;
import com.bpjstku.data.setting.model.request.ChangeEmailVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangePasswordRequest;
import com.bpjstku.data.setting.model.request.ChangePhoneNumberRequest;
import com.bpjstku.data.setting.model.request.KeyRequest;
import com.bpjstku.data.setting.model.request.PhoneVerificationRequest;
import com.bpjstku.data.setting.model.request.VerificationOtpRequest;
import com.bpjstku.data.setting.model.response.ApitoClientResponse;
import com.bpjstku.data.setting.model.response.ChangeEmailItem;
import com.bpjstku.data.setting.model.response.ChangePasswordItem;
import com.bpjstku.data.setting.model.response.ChangePhoneItem;
import com.bpjstku.data.setting.model.response.ClientToApiResponse;
import com.bpjstku.data.setting.model.response.ExpResponse;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.data.setting.model.response.KpjItemAdded;
import com.bpjstku.data.setting.model.response.ProfilePictureItem;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00072\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\t\u0012\u00070\u0019¢\u0006\u0002\b\u001a0\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\b0\u00072\u0006\u0010\u0003\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b0\u00072\u0006\u0010\u0003\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020(H\u0017¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\b0\u00072\u0006\u0010\u0003\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b/\u0010\u0013J#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\b0\u00072\u0006\u0010\u0003\u001a\u00020+H\u0017¢\u0006\u0004\b0\u0010.J#\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b2\u0010\u000bJ#\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020(H\u0017¢\u0006\u0004\b3\u0010*J#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\b0\u00072\u0006\u0010\u0003\u001a\u00020+H\u0017¢\u0006\u0004\b4\u0010.J#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u000205H\u0017¢\u0006\u0004\b6\u00107J#\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\b0\u00072\u0006\u0010\u0003\u001a\u00020+H\u0017¢\u0006\u0004\b8\u0010.J#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\b0\u00072\u0006\u0010\u0003\u001a\u00020 H\u0017¢\u0006\u0004\b9\u0010#J\u001b\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\b0\u0007H\u0017¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\b0\u0007H\u0017¢\u0006\u0004\b<\u0010;J#\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\b0\u00072\u0006\u0010\u0003\u001a\u00020=H\u0017¢\u0006\u0004\b?\u0010@J\u001b\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\b0\u0007H\u0017¢\u0006\u0004\bB\u0010;J3\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010D\u001a\u00020CH\u0017¢\u0006\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010I"}, d2 = {"Lcom/bpjstku/data/setting/remote/SettingApi;", "LunbindChildren;", "Lcom/bpjstku/data/setting/remote/SettingApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/setting/remote/SettingApiClient;)V", "Lcom/bpjstku/data/setting/model/request/ChangeEmailRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/setting/model/response/ChangeEmailItem;", "postChangeEmail", "(Lcom/bpjstku/data/setting/model/request/ChangeEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/AddKpjRequest;", "Lcom/bpjstku/data/setting/model/response/KpjItemAdded;", "postAddKpj", "(Lcom/bpjstku/data/setting/model/request/AddKpjRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangeEmailVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/setting/model/request/ChangeEmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/setting/model/request/PhoneVerificationRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p1", "Lcom/bpjstku/data/setting/model/response/ProfilePictureItem;", "postChangeProfilePicture", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;", "Lcom/bpjstku/data/setting/model/response/ChangePhoneItem;", "postChangePhoneNumber", "(Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangePasswordRequest;", "Lcom/bpjstku/data/setting/model/response/ChangePasswordItem;", "postChangePassword", "(Lcom/bpjstku/data/setting/model/request/ChangePasswordRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;", "changeEmailVerificationHandphone", "(Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/VerificationOtpRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationSignatureItem;", "changeEmailVerificationHandphoneOtp", "(Lcom/bpjstku/data/setting/model/request/VerificationOtpRequest;)LderiveCodec;", "changeEmailVerification", "changeEmailVerificationOtp", "Lcom/bpjstku/data/lib/model/BaseItem;", "changeEmail", "changeHandphoneVerificationEmail", "changeHandphoneVerificationEmailOtp", "Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;", "changeHandphoneVerification", "(Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;)LderiveCodec;", "changeHandphoneVerificationOtp", "changeHandphone", "getTimeServer", "()LderiveCodec;", "getTimeDetailServer", "Lcom/bpjstku/data/setting/model/request/KeyRequest;", "Lcom/bpjstku/data/setting/model/response/KeyResponse;", "getGenerateKey", "(Lcom/bpjstku/data/setting/model/request/KeyRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/response/ApitoClientResponse;", "getApitoClient", "Lcom/bpjstku/data/setting/model/response/ExpResponse;", "p2", "Lcom/bpjstku/data/setting/model/response/ClientToApiResponse;", "getClienttoApi", "(Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/setting/model/response/ExpResponse;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/setting/remote/SettingApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SettingApi implements unbindChildren, SettingApiClient {
    public static final int $stable = 8;
    private final SettingApiClient apiClient;

    public SettingApi(SettingApiClient settingApiClient) {
        Intrinsics.checkNotNullParameter(settingApiClient, "");
        this.apiClient = settingApiClient;
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<ChangeEmailItem>> postChangeEmail(ChangeEmailRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postChangeEmail(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<KpjItemAdded>> postAddKpj(AddKpjRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postAddKpj(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<VerificationItem>> postEmailVerification(ChangeEmailVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postEmailVerification(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<VerificationItem>> postPhoneVerification(PhoneVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postPhoneVerification(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<ProfilePictureItem>> postChangeProfilePicture(Map<String, RequestBody> p0, MultipartBody.Part p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postChangeProfilePicture(p0, p1);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<ChangePhoneItem>> postChangePhoneNumber(ChangePhoneNumberRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postChangePhoneNumber(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<ChangePasswordItem>> postChangePassword(ChangePasswordRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postChangePassword(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<VerificationItem>> changeEmailVerificationHandphone(ChangeDataFirstVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.changeEmailVerificationHandphone(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<VerificationSignatureItem>> changeEmailVerificationHandphoneOtp(VerificationOtpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.changeEmailVerificationHandphoneOtp(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<VerificationItem>> changeEmailVerification(ChangeEmailVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.changeEmailVerification(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<VerificationSignatureItem>> changeEmailVerificationOtp(VerificationOtpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.changeEmailVerificationOtp(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<BaseItem>> changeEmail(ChangeEmailRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.changeEmail(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<VerificationItem>> changeHandphoneVerificationEmail(ChangeDataFirstVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.changeHandphoneVerificationEmail(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<VerificationSignatureItem>> changeHandphoneVerificationEmailOtp(VerificationOtpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.changeHandphoneVerificationEmailOtp(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<VerificationItem>> changeHandphoneVerification(ChangeHandphoneVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.changeHandphoneVerification(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<VerificationSignatureItem>> changeHandphoneVerificationOtp(VerificationOtpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.changeHandphoneVerificationOtp(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<BaseItem>> changeHandphone(ChangePhoneNumberRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.changeHandphone(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<BaseItem>> getTimeServer() {
        return this.apiClient.getTimeServer();
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<BaseItem>> getTimeDetailServer() {
        return this.apiClient.getTimeDetailServer();
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<KeyResponse>> getGenerateKey(KeyRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getGenerateKey(p0);
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<ApitoClientResponse>> getApitoClient() {
        return this.apiClient.getApitoClient();
    }

    @Override // com.bpjstku.data.setting.remote.SettingApiClient
    public final deriveCodec<Response<ClientToApiResponse>> getClienttoApi(String p0, String p1, ExpResponse p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return this.apiClient.getClienttoApi(p0, p1, p2);
    }
}
