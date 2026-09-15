package com.bpjstku.data.danasiaga.remote;

import com.bpjstku.data.danasiaga.model.request.CheckEligiblePinangRequest;
import com.bpjstku.data.danasiaga.model.request.EligibleIctMenuRequest;
import com.bpjstku.data.danasiaga.model.response.CheckEligiblePinangResponse;
import com.bpjstku.data.danasiaga.model.response.EligibleIctMenuResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/danasiaga/remote/DanaSiagaApi;", "LunbindChildren;", "Lcom/bpjstku/data/danasiaga/remote/DanaSiagaApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/danasiaga/remote/DanaSiagaApiClient;)V", "Lcom/bpjstku/data/danasiaga/model/request/CheckEligiblePinangRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/danasiaga/model/response/CheckEligiblePinangResponse;", "checkEligiblePinang", "(Lcom/bpjstku/data/danasiaga/model/request/CheckEligiblePinangRequest;)LderiveCodec;", "Lcom/bpjstku/data/danasiaga/model/request/EligibleIctMenuRequest;", "Lcom/bpjstku/data/danasiaga/model/response/EligibleIctMenuResponse;", "ictEligibleMenu", "(Lcom/bpjstku/data/danasiaga/model/request/EligibleIctMenuRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/danasiaga/remote/DanaSiagaApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DanaSiagaApi implements unbindChildren, DanaSiagaApiClient {
    public static final int $stable = 8;
    private final DanaSiagaApiClient apiClient;

    public DanaSiagaApi(DanaSiagaApiClient danaSiagaApiClient) {
        Intrinsics.checkNotNullParameter(danaSiagaApiClient, "");
        this.apiClient = danaSiagaApiClient;
    }

    @Override // com.bpjstku.data.danasiaga.remote.DanaSiagaApiClient
    public final deriveCodec<Response<CheckEligiblePinangResponse>> checkEligiblePinang(CheckEligiblePinangRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkEligiblePinang(p0);
    }

    @Override // com.bpjstku.data.danasiaga.remote.DanaSiagaApiClient
    public final deriveCodec<Response<EligibleIctMenuResponse>> ictEligibleMenu(EligibleIctMenuRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.ictEligibleMenu(p0);
    }
}
