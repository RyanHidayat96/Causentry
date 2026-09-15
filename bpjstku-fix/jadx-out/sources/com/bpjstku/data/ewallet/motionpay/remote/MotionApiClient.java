package com.bpjstku.data.ewallet.motionpay.remote;

import com.bpjstku.data.ewallet.motionpay.model.request.MotionCheckConnectRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionLinkingRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionUnlinkRequest;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionCheckConnectResponse;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionLinkingResponse;
import com.bpjstku.domain.general.model.BaseModel;
import defpackage.deriveCodec;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/ewallet/motionpay/remote/MotionApiClient;", "", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionLinkingRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionLinkingResponse;", "linkAccount", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionLinkingRequest;)LderiveCodec;", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionCheckConnectRequest;", "Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionCheckConnectResponse;", "checkConnect", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionCheckConnectRequest;)LderiveCodec;", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionUnlinkRequest;", "Lcom/bpjstku/domain/general/model/BaseModel;", "unlinkMpay", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionUnlinkRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MotionApiClient {
    @POST("motionPay/is-connected")
    deriveCodec<Response<MotionCheckConnectResponse>> checkConnect(@Body MotionCheckConnectRequest p0);

    @POST("motionpay/linking")
    deriveCodec<Response<MotionLinkingResponse>> linkAccount(@Body MotionLinkingRequest p0);

    @POST("motionPay/unlink-mpay")
    deriveCodec<Response<BaseModel>> unlinkMpay(@Body MotionUnlinkRequest p0);
}
