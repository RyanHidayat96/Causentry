package com.bpjstku.data.digitalcard.remote;

import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import com.bpjstku.data.digitalcard.model.request.DigitalCardRequest;
import com.bpjstku.data.digitalcard.model.request.MembershipInformationRequest;
import com.bpjstku.data.digitalcard.model.response.BPUMembershipInformationResponse;
import com.bpjstku.data.digitalcard.model.response.DigitalCardResponse;
import com.bpjstku.data.digitalcard.model.response.PMIMembershipInformationResponse;
import com.bpjstku.data.digitalcard.model.response.PUMembershipInformationResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/bpjstku/data/digitalcard/remote/DigitalCardApi;", "LunbindChildren;", "Lcom/bpjstku/data/digitalcard/remote/DigitalCardApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/digitalcard/remote/DigitalCardApiClient;)V", "Lcom/bpjstku/data/digitalcard/model/request/DigitalCardRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/digitalcard/model/response/DigitalCardResponse;", "getDigitalCards", "(Lcom/bpjstku/data/digitalcard/model/request/DigitalCardRequest;)LderiveCodec;", "Lcom/bpjstku/data/digitalcard/model/request/DigitalCardImageRequest;", "Lokhttp3/ResponseBody;", "getDigitalCardImage", "(Lcom/bpjstku/data/digitalcard/model/request/DigitalCardImageRequest;)LderiveCodec;", "Lcom/bpjstku/data/digitalcard/model/request/MembershipInformationRequest;", "Lcom/bpjstku/data/digitalcard/model/response/PUMembershipInformationResponse;", "getPUMembershipInformation", "(Lcom/bpjstku/data/digitalcard/model/request/MembershipInformationRequest;)LderiveCodec;", "Lcom/bpjstku/data/digitalcard/model/response/PMIMembershipInformationResponse;", "getPMIMembershipInformation", "Lcom/bpjstku/data/digitalcard/model/response/BPUMembershipInformationResponse;", "getBPUMembershipInformation", "apiClient", "Lcom/bpjstku/data/digitalcard/remote/DigitalCardApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DigitalCardApi implements unbindChildren, DigitalCardApiClient {
    public static final int $stable = 8;
    private final DigitalCardApiClient apiClient;

    public DigitalCardApi(DigitalCardApiClient digitalCardApiClient) {
        Intrinsics.checkNotNullParameter(digitalCardApiClient, "");
        this.apiClient = digitalCardApiClient;
    }

    @Override // com.bpjstku.data.digitalcard.remote.DigitalCardApiClient
    public final deriveCodec<Response<DigitalCardResponse>> getDigitalCards(DigitalCardRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getDigitalCards(p0);
    }

    @Override // com.bpjstku.data.digitalcard.remote.DigitalCardApiClient
    public final deriveCodec<Response<ResponseBody>> getDigitalCardImage(DigitalCardImageRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getDigitalCardImage(p0);
    }

    @Override // com.bpjstku.data.digitalcard.remote.DigitalCardApiClient
    public final deriveCodec<Response<PUMembershipInformationResponse>> getPUMembershipInformation(MembershipInformationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getPUMembershipInformation(p0);
    }

    @Override // com.bpjstku.data.digitalcard.remote.DigitalCardApiClient
    public final deriveCodec<Response<PMIMembershipInformationResponse>> getPMIMembershipInformation(MembershipInformationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getPMIMembershipInformation(p0);
    }

    @Override // com.bpjstku.data.digitalcard.remote.DigitalCardApiClient
    public final deriveCodec<Response<BPUMembershipInformationResponse>> getBPUMembershipInformation(MembershipInformationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBPUMembershipInformation(p0);
    }
}
