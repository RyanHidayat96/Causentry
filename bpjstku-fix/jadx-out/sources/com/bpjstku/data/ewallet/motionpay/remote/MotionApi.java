package com.bpjstku.data.ewallet.motionpay.remote;

import com.bpjstku.data.ewallet.motionpay.model.request.MotionCheckConnectRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionLinkingRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionUnlinkRequest;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionCheckConnectResponse;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionLinkingResponse;
import com.bpjstku.domain.general.model.BaseModel;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/bpjstku/data/ewallet/motionpay/remote/MotionApi;", "Lcom/bpjstku/data/ewallet/motionpay/remote/MotionApiClient;", "LunbindChildren;", "p0", "<init>", "(Lcom/bpjstku/data/ewallet/motionpay/remote/MotionApiClient;)V", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionLinkingRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionLinkingResponse;", "linkAccount", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionLinkingRequest;)LderiveCodec;", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionCheckConnectRequest;", "Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionCheckConnectResponse;", "checkConnect", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionCheckConnectRequest;)LderiveCodec;", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionUnlinkRequest;", "Lcom/bpjstku/domain/general/model/BaseModel;", "unlinkMpay", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionUnlinkRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/ewallet/motionpay/remote/MotionApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MotionApi implements MotionApiClient, unbindChildren {
    public static final int $stable = 8;
    private final MotionApiClient apiClient;

    public MotionApi(MotionApiClient motionApiClient) {
        Intrinsics.checkNotNullParameter(motionApiClient, "");
        this.apiClient = motionApiClient;
    }

    @Override // com.bpjstku.data.ewallet.motionpay.remote.MotionApiClient
    public final deriveCodec<Response<MotionLinkingResponse>> linkAccount(MotionLinkingRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.linkAccount(p0);
    }

    @Override // com.bpjstku.data.ewallet.motionpay.remote.MotionApiClient
    public final deriveCodec<Response<MotionCheckConnectResponse>> checkConnect(MotionCheckConnectRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkConnect(p0);
    }

    @Override // com.bpjstku.data.ewallet.motionpay.remote.MotionApiClient
    public final deriveCodec<Response<BaseModel>> unlinkMpay(MotionUnlinkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.unlinkMpay(p0);
    }
}
