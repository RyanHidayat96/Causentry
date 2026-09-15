package com.bpjstku.data.registration.general.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.registration.general.model.request.ActivationRequest;
import com.bpjstku.data.registration.general.model.request.EmailActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.request.GenerateKeyRequest;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.request.OcrKtpRequest;
import com.bpjstku.data.registration.general.model.request.PhoneActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.registration.general.model.request.RegisterRequest;
import com.bpjstku.data.registration.general.model.request.UpdateActivationRequest;
import com.bpjstku.data.registration.general.model.request.VerifyCountBiometricRequest;
import com.bpjstku.data.registration.general.model.response.ActivationItem;
import com.bpjstku.data.registration.general.model.response.MembershipCheckItem;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.general.model.response.VerifyBiometricResponse;
import com.bpjstku.data.setting.model.response.KeyResponse;
import defpackage.deriveCodec;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\u000fJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0013J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0018J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b\u001f\u0010 J/\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u001eH'¢\u0006\u0004\b\u001f\u0010!J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\"H'¢\u0006\u0004\b#\u0010$J/\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\"H'¢\u0006\u0004\b#\u0010%J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020&H'¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020)H'¢\u0006\u0004\b+\u0010,J/\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020)H'¢\u0006\u0004\b+\u0010-J\\\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00042\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\t\u0012\u00070/¢\u0006\u0002\b0\u0018\u00010.2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u0001012\n\b\u0001\u00102\u001a\u0004\u0018\u0001012\n\b\u0001\u00103\u001a\u0004\u0018\u000101H'¢\u0006\u0004\b4\u00105Jf\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\u001b\b\u0001\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\t\u0012\u00070/¢\u0006\u0002\b0\u0018\u00010.2\n\b\u0001\u00102\u001a\u0004\u0018\u0001012\n\b\u0001\u00103\u001a\u0004\u0018\u0001012\n\b\u0001\u00106\u001a\u0004\u0018\u000101H'¢\u0006\u0004\b4\u00107J%\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000208H'¢\u0006\u0004\b:\u0010;J/\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u000208H'¢\u0006\u0004\b:\u0010<Jr\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\u001b\b\u0001\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\t\u0012\u00070/¢\u0006\u0002\b0\u0018\u00010.2\n\b\u0001\u00102\u001a\u0004\u0018\u0001012\n\b\u0001\u00103\u001a\u0004\u0018\u0001012\n\b\u0001\u00106\u001a\u0004\u0018\u0001012\n\b\u0001\u0010=\u001a\u0004\u0018\u000101H'¢\u0006\u0004\b>\u0010?Jr\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\u001b\b\u0001\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\t\u0012\u00070/¢\u0006\u0002\b0\u0018\u00010.2\n\b\u0001\u00102\u001a\u0004\u0018\u0001012\n\b\u0001\u00103\u001a\u0004\u0018\u0001012\n\b\u0001\u00106\u001a\u0004\u0018\u0001012\n\b\u0001\u0010=\u001a\u0004\u0018\u000101H'¢\u0006\u0004\b@\u0010?J%\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020)H'¢\u0006\u0004\bA\u0010,J/\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020)H'¢\u0006\u0004\bA\u0010-J\\\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00042\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\t\u0012\u00070/¢\u0006\u0002\b0\u0018\u00010.2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u0001012\n\b\u0001\u00102\u001a\u0004\u0018\u0001012\n\b\u0001\u00103\u001a\u0004\u0018\u000101H'¢\u0006\u0004\bB\u00105Jf\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\u001b\b\u0001\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\t\u0012\u00070/¢\u0006\u0002\b0\u0018\u00010.2\n\b\u0001\u00102\u001a\u0004\u0018\u0001012\n\b\u0001\u00103\u001a\u0004\u0018\u0001012\n\b\u0001\u00106\u001a\u0004\u0018\u000101H'¢\u0006\u0004\bB\u00107J%\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020CH'¢\u0006\u0004\bE\u0010FJ/\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020CH'¢\u0006\u0004\bE\u0010Gø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/registration/general/remote/RegistrationApiClient;", "", "Lcom/bpjstku/data/registration/general/model/request/RegisterRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postRegistration", "(Lcom/bpjstku/data/registration/general/model/request/RegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;", "Lcom/bpjstku/data/registration/general/model/response/MembershipCheckItem;", "postMembershipCheckInfo", "(Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;", "Lcom/bpjstku/data/registration/general/model/response/ActivationItem;", "postMembershipCheckEligibleResetAccount", "(Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;", "postEmailActivationVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;", "postPhoneActivationVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/UpdateActivationRequest;", "postActivation", "(Lcom/bpjstku/data/registration/general/model/request/UpdateActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerifyBiometricResponse;", "verifyCountBiometric", "(Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;)LderiveCodec;", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p2", "p3", "verifyBiometric", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "p4", "(Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;", "Lcom/bpjstku/data/setting/model/response/KeyResponse;", "generateKey", "(Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;)LderiveCodec;", "p5", "postNewRegistration", "(Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "postNewActivation", "verifyCountActivationBiometric", "verifyActivationBiometric", "Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;", "Lcom/bpjstku/data/registration/general/model/response/OcrKtpResponse;", "ocrKtp", "(Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RegistrationApiClient {
    @POST("v1/registrasi/generate-key")
    deriveCodec<Response<KeyResponse>> generateKey(@Body GenerateKeyRequest p0);

    @POST("v1/registrasi/generate-key")
    deriveCodec<Response<KeyResponse>> generateKey(@Header("x-transaction-id") String p0, @Body GenerateKeyRequest p1);

    @POST("v1/registrasi/ocr-ktp")
    deriveCodec<Response<OcrKtpResponse>> ocrKtp(@Body OcrKtpRequest p0);

    @POST("v1/device-binding/upload-ktp")
    deriveCodec<Response<OcrKtpResponse>> ocrKtp(@Header("x-transaction-id") String p0, @Body OcrKtpRequest p1);

    @POST("akun/reset/update-data")
    deriveCodec<Response<BaseItem>> postActivation(@Body UpdateActivationRequest p0);

    @POST("akun/reset/email-verifikasi")
    deriveCodec<Response<VerificationItem>> postEmailActivationVerification(@Body EmailActivationVerificationRequest p0);

    @POST("akun/reset/email-verifikasi")
    deriveCodec<Response<VerificationItem>> postEmailActivationVerification(@Header("x-transaction-id") String p0, @Body EmailActivationVerificationRequest p1);

    @POST("registrasi/email/verifikasi")
    deriveCodec<Response<VerificationItem>> postEmailVerification(@Body EmailVerificationRequest p0);

    @POST("registrasi/email/verifikasi")
    deriveCodec<Response<VerificationItem>> postEmailVerification(@Header("x-transaction-id") String p0, @Body EmailVerificationRequest p1);

    @POST("akun/reset/check-eligible")
    deriveCodec<Response<ActivationItem>> postMembershipCheckEligibleResetAccount(@Body ActivationRequest p0);

    @POST("akun/reset/check-eligible")
    deriveCodec<Response<ActivationItem>> postMembershipCheckEligibleResetAccount(@Header("x-transaction-id") String p0, @Body ActivationRequest p1);

    @POST("kepesertaan/cekinfo")
    deriveCodec<Response<MembershipCheckItem>> postMembershipCheckInfo(@Body MembershipCheckRequest p0);

    @POST("v1/kepesertaan/cekinfo")
    deriveCodec<Response<MembershipCheckItem>> postMembershipCheckInfo(@Header("x-transaction-id") String p0, @Body MembershipCheckRequest p1);

    @POST("v1/akun/reset/update-data")
    @Multipart
    deriveCodec<Response<BaseItem>> postNewActivation(@Header("x-transaction-id") String p0, @PartMap Map<String, RequestBody> p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4, @Part MultipartBody.Part p5);

    @POST("v1/registrasi")
    @Multipart
    deriveCodec<Response<BaseItem>> postNewRegistration(@Header("x-transaction-id") String p0, @PartMap Map<String, RequestBody> p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4, @Part MultipartBody.Part p5);

    @POST("akun/reset/handphone-verifikasi")
    deriveCodec<Response<VerificationItem>> postPhoneActivationVerification(@Body PhoneActivationVerificationRequest p0);

    @POST("akun/reset/handphone-verifikasi")
    deriveCodec<Response<VerificationItem>> postPhoneActivationVerification(@Header("x-transaction-id") String p0, @Body PhoneActivationVerificationRequest p1);

    @POST("registrasi/handphone/verifikasi")
    deriveCodec<Response<VerificationItem>> postPhoneVerification(@Body PhoneVerificationRequest p0);

    @POST("registrasi/handphone/verifikasi")
    deriveCodec<Response<VerificationItem>> postPhoneVerification(@Header("x-transaction-id") String p0, @Body PhoneVerificationRequest p1);

    @POST("registrasi")
    deriveCodec<Response<BaseItem>> postRegistration(@Body RegisterRequest p0);

    @POST("akun/reset/verif-biometrik")
    @Multipart
    deriveCodec<Response<VerifyBiometricResponse>> verifyActivationBiometric(@Header("x-transaction-id") String p0, @PartMap Map<String, RequestBody> p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4);

    @POST("akun/reset/verif-biometrik")
    @Multipart
    deriveCodec<Response<VerifyBiometricResponse>> verifyActivationBiometric(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3);

    @POST("v1/registrasi/verif-biometrik")
    @Multipart
    deriveCodec<Response<VerifyBiometricResponse>> verifyBiometric(@Header("x-transaction-id") String p0, @PartMap Map<String, RequestBody> p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4);

    @POST("v1/registrasi/verif-biometrik")
    @Multipart
    deriveCodec<Response<VerifyBiometricResponse>> verifyBiometric(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3);

    @POST("akun/reset/check-jumlah-percobaan-biometrik")
    deriveCodec<Response<VerifyBiometricResponse>> verifyCountActivationBiometric(@Body VerifyCountBiometricRequest p0);

    @POST("akun/reset/check-jumlah-percobaan-biometrik")
    deriveCodec<Response<VerifyBiometricResponse>> verifyCountActivationBiometric(@Header("x-transaction-id") String p0, @Body VerifyCountBiometricRequest p1);

    @POST("v1/registrasi/check-jumlah-percobaan-biometrik")
    deriveCodec<Response<VerifyBiometricResponse>> verifyCountBiometric(@Body VerifyCountBiometricRequest p0);

    @POST("v1/registrasi/check-jumlah-percobaan-biometrik")
    deriveCodec<Response<VerifyBiometricResponse>> verifyCountBiometric(@Header("x-transaction-id") String p0, @Body VerifyCountBiometricRequest p1);
}
