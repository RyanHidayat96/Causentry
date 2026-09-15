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
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J@\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00050\u00042\u0019\b\u0001\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u001b0\u00182\b\b\u0001\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\b&\u0010'J%\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b,\u0010\bJ%\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b-\u0010+J%\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b/\u0010\fJ%\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\b0\u0010'J%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b1\u0010+J%\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000202H'¢\u0006\u0004\b3\u00104J%\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b5\u0010+J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b6\u0010\u0013J\u001b\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00050\u0004H'¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00050\u0004H'¢\u0006\u0004\b9\u00108J%\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020:H'¢\u0006\u0004\b<\u0010=J\u001b\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00050\u0004H'¢\u0006\u0004\b?\u00108J9\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00192\b\b\u0001\u0010\u001d\u001a\u00020\u00192\b\b\u0001\u0010A\u001a\u00020@H'¢\u0006\u0004\bC\u0010Dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/setting/remote/SettingApiClient;", "", "Lcom/bpjstku/data/setting/model/request/ChangeEmailVerificationRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/setting/model/request/ChangeEmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangeEmailRequest;", "Lcom/bpjstku/data/setting/model/response/ChangeEmailItem;", "postChangeEmail", "(Lcom/bpjstku/data/setting/model/request/ChangeEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/setting/model/request/PhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;", "Lcom/bpjstku/data/setting/model/response/ChangePhoneItem;", "postChangePhoneNumber", "(Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/AddKpjRequest;", "Lcom/bpjstku/data/setting/model/response/KpjItemAdded;", "postAddKpj", "(Lcom/bpjstku/data/setting/model/request/AddKpjRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p1", "Lcom/bpjstku/data/setting/model/response/ProfilePictureItem;", "postChangeProfilePicture", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangePasswordRequest;", "Lcom/bpjstku/data/setting/model/response/ChangePasswordItem;", "postChangePassword", "(Lcom/bpjstku/data/setting/model/request/ChangePasswordRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;", "changeEmailVerificationHandphone", "(Lcom/bpjstku/data/setting/model/request/ChangeDataFirstVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/request/VerificationOtpRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationSignatureItem;", "changeEmailVerificationHandphoneOtp", "(Lcom/bpjstku/data/setting/model/request/VerificationOtpRequest;)LderiveCodec;", "changeEmailVerification", "changeEmailVerificationOtp", "Lcom/bpjstku/data/lib/model/BaseItem;", "changeEmail", "changeHandphoneVerificationEmail", "changeHandphoneVerificationEmailOtp", "Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;", "changeHandphoneVerification", "(Lcom/bpjstku/data/setting/model/request/ChangeHandphoneVerificationRequest;)LderiveCodec;", "changeHandphoneVerificationOtp", "changeHandphone", "getTimeServer", "()LderiveCodec;", "getTimeDetailServer", "Lcom/bpjstku/data/setting/model/request/KeyRequest;", "Lcom/bpjstku/data/setting/model/response/KeyResponse;", "getGenerateKey", "(Lcom/bpjstku/data/setting/model/request/KeyRequest;)LderiveCodec;", "Lcom/bpjstku/data/setting/model/response/ApitoClientResponse;", "getApitoClient", "Lcom/bpjstku/data/setting/model/response/ExpResponse;", "p2", "Lcom/bpjstku/data/setting/model/response/ClientToApiResponse;", "getClienttoApi", "(Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/setting/model/response/ExpResponse;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SettingApiClient {
    @POST("settings/email/change")
    deriveCodec<Response<BaseItem>> changeEmail(@Body ChangeEmailRequest p0);

    @POST("settings/email/verification")
    deriveCodec<Response<VerificationItem>> changeEmailVerification(@Body ChangeEmailVerificationRequest p0);

    @POST("settings/email/verification-handphone")
    deriveCodec<Response<VerificationItem>> changeEmailVerificationHandphone(@Body ChangeDataFirstVerificationRequest p0);

    @POST("settings/email/verification-handphone-otp")
    deriveCodec<Response<VerificationSignatureItem>> changeEmailVerificationHandphoneOtp(@Body VerificationOtpRequest p0);

    @POST("settings/email/verification-otp")
    deriveCodec<Response<VerificationSignatureItem>> changeEmailVerificationOtp(@Body VerificationOtpRequest p0);

    @POST("settings/handphone/change")
    deriveCodec<Response<BaseItem>> changeHandphone(@Body ChangePhoneNumberRequest p0);

    @POST("settings/handphone/verification")
    deriveCodec<Response<VerificationItem>> changeHandphoneVerification(@Body ChangeHandphoneVerificationRequest p0);

    @POST("settings/handphone/verification-email")
    deriveCodec<Response<VerificationItem>> changeHandphoneVerificationEmail(@Body ChangeDataFirstVerificationRequest p0);

    @POST("settings/handphone/verification-email-otp")
    deriveCodec<Response<VerificationSignatureItem>> changeHandphoneVerificationEmailOtp(@Body VerificationOtpRequest p0);

    @POST("settings/handphone/verification-otp")
    deriveCodec<Response<VerificationSignatureItem>> changeHandphoneVerificationOtp(@Body VerificationOtpRequest p0);

    @POST("settings/api-to-client")
    deriveCodec<Response<ApitoClientResponse>> getApitoClient();

    @POST("settings/client-to-api")
    deriveCodec<Response<ClientToApiResponse>> getClienttoApi(@Header("X-Request-Signature") String p0, @Header("X-Client-Id") String p1, @Body ExpResponse p2);

    @POST("settings/generate-key")
    deriveCodec<Response<KeyResponse>> getGenerateKey(@Body KeyRequest p0);

    @GET("settings/time-detail")
    deriveCodec<Response<BaseItem>> getTimeDetailServer();

    @GET("settings/time")
    deriveCodec<Response<BaseItem>> getTimeServer();

    @POST("pengaturan/tambahkpj")
    deriveCodec<Response<KpjItemAdded>> postAddKpj(@Body AddKpjRequest p0);

    @POST("pengaturan/ganti-email")
    deriveCodec<Response<ChangeEmailItem>> postChangeEmail(@Body ChangeEmailRequest p0);

    @POST("pengaturan/ganti-katasandi")
    deriveCodec<Response<ChangePasswordItem>> postChangePassword(@Body ChangePasswordRequest p0);

    @POST("pengaturan/ganti-handphone")
    deriveCodec<Response<ChangePhoneItem>> postChangePhoneNumber(@Body ChangePhoneNumberRequest p0);

    @POST("pengaturan/ganti-foto")
    @Multipart
    deriveCodec<Response<ProfilePictureItem>> postChangeProfilePicture(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1);

    @POST("pengaturan/verifikasi-email")
    deriveCodec<Response<VerificationItem>> postEmailVerification(@Body ChangeEmailVerificationRequest p0);

    @POST("pengaturan/verifikasi-handphone")
    deriveCodec<Response<VerificationItem>> postPhoneVerification(@Body PhoneVerificationRequest p0);
}
