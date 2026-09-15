package com.bpjstku.data.otpverification.remote;

import com.bpjstku.data.otpverification.model.request.OtpVerificationActivationRequest;
import com.bpjstku.data.otpverification.model.request.OtpVerificationRequest;
import com.bpjstku.data.otpverification.model.request.OtpVerificationRequestAuth;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import com.bpjstku.data.otpverification.model.response.RequestOtpTokenItem;
import defpackage.deriveCodec;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000eJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000f\u0010\u000bJ/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u000f\u0010\u000eJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0013J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/otpverification/remote/OtpVerificationApiClient;", "", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/otpverification/model/response/RequestOtpTokenItem;", "getAccessToken", "()LderiveCodec;", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;", "p0", "Lcom/bpjstku/data/otpverification/model/response/OtpVerificationResponse;", "verifyOtpOld", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;)LderiveCodec;", "verifyOtp", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;", "verifyActivationOtp", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequestAuth;", "verifyOtpAuth", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequestAuth;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface OtpVerificationApiClient {
    @GET("access-token")
    deriveCodec<Response<RequestOtpTokenItem>> getAccessToken();

    @POST("akun/reset/verifikasi-otp")
    deriveCodec<Response<OtpVerificationResponse>> verifyActivationOtp(@Body OtpVerificationActivationRequest p0);

    @POST("akun/reset/verifikasi-otp")
    deriveCodec<Response<OtpVerificationResponse>> verifyActivationOtp(@Header("x-transaction-id") String p0, @Body OtpVerificationActivationRequest p1);

    @POST("v1/registrasi/verif-otp")
    deriveCodec<Response<OtpVerificationResponse>> verifyOtp(@Body OtpVerificationRequest p0);

    @POST("v1/registrasi/verif-otp")
    deriveCodec<Response<OtpVerificationResponse>> verifyOtp(@Header("x-transaction-id") String p0, @Body OtpVerificationRequest p1);

    @POST("auth/verifikasi-otp")
    deriveCodec<Response<OtpVerificationResponse>> verifyOtpAuth(@Body OtpVerificationRequestAuth p0);

    @POST("verifikasi-otp")
    deriveCodec<Response<OtpVerificationResponse>> verifyOtpOld(@Body OtpVerificationRequest p0);

    @POST("verifikasi-otp")
    deriveCodec<Response<OtpVerificationResponse>> verifyOtpOld(@Header("x-transaction-id") String p0, @Body OtpVerificationRequest p1);
}
