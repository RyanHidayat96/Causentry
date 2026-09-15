package com.bpjstku.data.devicebinding.remote;

import com.bpjstku.data.devicebinding.model.request.CheckMembershipRequest;
import com.bpjstku.data.devicebinding.model.request.LivenessBeginRequest;
import com.bpjstku.data.devicebinding.model.request.SendEmailOtpRequest;
import com.bpjstku.data.devicebinding.model.request.SubmitDeviceBindingRequest;
import com.bpjstku.data.devicebinding.model.request.VerifyOtpRequest;
import com.bpjstku.data.devicebinding.model.response.CheckMembershipResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessEndResponse;
import com.bpjstku.data.devicebinding.model.response.SendEmailOtpResponse;
import com.bpjstku.data.devicebinding.model.response.SubmitDeviceBindingResponse;
import com.bpjstku.data.lib.model.BaseItem;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJf\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u001b\b\u0001\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u001c¢\u0006\u0002\b\u001d\u0018\u00010\u001b2\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001e2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u001eH'¢\u0006\u0004\b#\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/devicebinding/remote/DeviceBindingApiClient;", "", "", "p0", "Lcom/bpjstku/data/devicebinding/model/request/CheckMembershipRequest;", "p1", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/devicebinding/model/response/CheckMembershipResponse;", "checkMembership", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/CheckMembershipRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/SendEmailOtpRequest;", "Lcom/bpjstku/data/devicebinding/model/response/SendEmailOtpResponse;", "sendEmailOtp", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/SendEmailOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/VerifyOtpRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "verifyOtp", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/VerifyOtpRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/SubmitDeviceBindingRequest;", "Lcom/bpjstku/data/devicebinding/model/response/SubmitDeviceBindingResponse;", "submitDeviceBinding", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/SubmitDeviceBindingRequest;)LderiveCodec;", "Lcom/bpjstku/data/devicebinding/model/request/LivenessBeginRequest;", "Lcom/bpjstku/data/devicebinding/model/response/LivenessBeginResponse;", "livenessBegin", "(Ljava/lang/String;Lcom/bpjstku/data/devicebinding/model/request/LivenessBeginRequest;)LderiveCodec;", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p2", "p3", "p4", "Lcom/bpjstku/data/devicebinding/model/response/LivenessEndResponse;", "livenessEnd", "(Ljava/lang/String;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DeviceBindingApiClient {
    @POST("v1/device-binding/cek-kepesertaan")
    deriveCodec<Response<CheckMembershipResponse>> checkMembership(@Header("x-transaction-id") String p0, @Body CheckMembershipRequest p1);

    @POST("v1/device-binding/liveness-begin")
    deriveCodec<Response<LivenessBeginResponse>> livenessBegin(@Header("x-transaction-id") String p0, @Body LivenessBeginRequest p1);

    @POST("v1/device-binding/liveness-end")
    @Multipart
    deriveCodec<Response<LivenessEndResponse>> livenessEnd(@Header("x-transaction-id") String p0, @PartMap Map<String, RequestBody> p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4);

    @POST("v1/device-binding/send-email-otp")
    deriveCodec<Response<SendEmailOtpResponse>> sendEmailOtp(@Header("x-transaction-id") String p0, @Body SendEmailOtpRequest p1);

    @POST("v1/device-binding/submit")
    deriveCodec<Response<SubmitDeviceBindingResponse>> submitDeviceBinding(@Header("x-transaction-id") String p0, @Body SubmitDeviceBindingRequest p1);

    @POST("v1/device-binding/otp-verification")
    deriveCodec<Response<BaseItem>> verifyOtp(@Header("x-transaction-id") String p0, @Body VerifyOtpRequest p1);
}
