package com.bpjstku.data.digitalcard.remote;

import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import com.bpjstku.data.digitalcard.model.request.DigitalCardRequest;
import com.bpjstku.data.digitalcard.model.request.MembershipInformationRequest;
import com.bpjstku.data.digitalcard.model.response.BPUMembershipInformationResponse;
import com.bpjstku.data.digitalcard.model.response.DigitalCardResponse;
import com.bpjstku.data.digitalcard.model.response.PMIMembershipInformationResponse;
import com.bpjstku.data.digitalcard.model.response.PUMembershipInformationResponse;
import defpackage.deriveCodec;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u0012\u0010\u0010J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u0014\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/digitalcard/remote/DigitalCardApiClient;", "", "Lcom/bpjstku/data/digitalcard/model/request/DigitalCardRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/digitalcard/model/response/DigitalCardResponse;", "getDigitalCards", "(Lcom/bpjstku/data/digitalcard/model/request/DigitalCardRequest;)LderiveCodec;", "Lcom/bpjstku/data/digitalcard/model/request/DigitalCardImageRequest;", "Lokhttp3/ResponseBody;", "getDigitalCardImage", "(Lcom/bpjstku/data/digitalcard/model/request/DigitalCardImageRequest;)LderiveCodec;", "Lcom/bpjstku/data/digitalcard/model/request/MembershipInformationRequest;", "Lcom/bpjstku/data/digitalcard/model/response/BPUMembershipInformationResponse;", "getBPUMembershipInformation", "(Lcom/bpjstku/data/digitalcard/model/request/MembershipInformationRequest;)LderiveCodec;", "Lcom/bpjstku/data/digitalcard/model/response/PMIMembershipInformationResponse;", "getPMIMembershipInformation", "Lcom/bpjstku/data/digitalcard/model/response/PUMembershipInformationResponse;", "getPUMembershipInformation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DigitalCardApiClient {
    @POST("kartudigital/informasi-kepesertaan")
    deriveCodec<Response<BPUMembershipInformationResponse>> getBPUMembershipInformation(@Body MembershipInformationRequest p0);

    @POST("kartudigital/image")
    deriveCodec<Response<ResponseBody>> getDigitalCardImage(@Body DigitalCardImageRequest p0);

    @POST("kartudigital")
    deriveCodec<Response<DigitalCardResponse>> getDigitalCards(@Body DigitalCardRequest p0);

    @POST("kartudigital/informasi-kepesertaan")
    deriveCodec<Response<PMIMembershipInformationResponse>> getPMIMembershipInformation(@Body MembershipInformationRequest p0);

    @POST("kartudigital/informasi-kepesertaan")
    deriveCodec<Response<PUMembershipInformationResponse>> getPUMembershipInformation(@Body MembershipInformationRequest p0);
}
