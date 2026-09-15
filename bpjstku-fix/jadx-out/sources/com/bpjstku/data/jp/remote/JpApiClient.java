package com.bpjstku.data.jp.remote;

import com.bpjstku.data.jp.model.request.CheckEligibilityJpRequest;
import com.bpjstku.data.jp.model.request.GetCountClaimJpRequest;
import com.bpjstku.data.jp.model.request.GetJpBenefitRequest;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessBegin;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessEnd;
import com.bpjstku.data.jp.model.response.CheckEligibilityJpResponse;
import com.bpjstku.data.jp.model.response.GetCountClaimJpResponse;
import com.bpjstku.data.jp.model.response.GetJpBenefitResponse;
import com.bpjstku.data.jp.model.response.JpVerificationResponse;
import com.bpjstku.data.lib.model.BaseItem;
import defpackage.deriveCodec;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020\u0012\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u0014\u0018\u00010\u00112\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/jp/remote/JpApiClient;", "", "Lcom/bpjstku/data/jp/model/request/GetCountClaimJpRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/jp/model/response/GetCountClaimJpResponse;", "getCountClaimJp", "(Lcom/bpjstku/data/jp/model/request/GetCountClaimJpRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/CheckEligibilityJpRequest;", "Lcom/bpjstku/data/jp/model/response/CheckEligibilityJpResponse;", "checkEligibility", "(Lcom/bpjstku/data/jp/model/request/CheckEligibilityJpRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/GetJpBenefitRequest;", "Lcom/bpjstku/data/jp/model/response/GetJpBenefitResponse;", "getJpBenefitInformation", "(Lcom/bpjstku/data/jp/model/request/GetJpBenefitRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p1", "Lcom/bpjstku/data/lib/model/BaseItem;", "insertConfirmationJp", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessBegin;", "Lcom/bpjstku/data/jp/model/response/JpVerificationResponse;", "verificationJpLivenessBegin", "(Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessBegin;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessEnd;", "verificationJpLivenessEnd", "(Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessEnd;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface JpApiClient {
    @POST("claimjp-pelapor/check-eligible")
    deriveCodec<Response<CheckEligibilityJpResponse>> checkEligibility(@Body CheckEligibilityJpRequest p0);

    @POST("claimjp-pelapor/list-tk")
    deriveCodec<Response<GetCountClaimJpResponse>> getCountClaimJp(@Body GetCountClaimJpRequest p0);

    @POST("claimjp-pelapor/info-manfaat")
    deriveCodec<Response<GetJpBenefitResponse>> getJpBenefitInformation(@Body GetJpBenefitRequest p0);

    @POST("claimjp-pelapor/insert-konfirmasi")
    @Multipart
    deriveCodec<Response<BaseItem>> insertConfirmationJp(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1);

    @POST("claimjp-pelapor/ekyc-liveness-begin")
    deriveCodec<Response<JpVerificationResponse>> verificationJpLivenessBegin(@Body JpVerificationLivenessBegin p0);

    @POST("claimjp-pelapor/ekyc-liveness-end")
    deriveCodec<Response<JpVerificationResponse>> verificationJpLivenessEnd(@Body JpVerificationLivenessEnd p0);
}
