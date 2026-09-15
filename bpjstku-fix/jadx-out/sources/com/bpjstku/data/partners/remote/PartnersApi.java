package com.bpjstku.data.partners.remote;

import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.partners.model.request.GetPartnerRequest;
import com.bpjstku.data.partners.model.response.PartnersResponse;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.data.registration.pmi.model.response.CityItem;
import com.bpjstku.data.registration.pmi.model.response.ProvinceItem;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/bpjstku/data/partners/remote/PartnersApi;", "LunbindChildren;", "Lcom/bpjstku/data/partners/remote/PartnersApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/partners/remote/PartnersApiClient;)V", "Lcom/bpjstku/data/partners/model/request/GetPartnerRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/partners/model/response/PartnersResponse;", "getPartners", "(Lcom/bpjstku/data/partners/model/request/GetPartnerRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/registration/pmi/model/response/ProvinceItem;", "getProvinces", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;", "Lcom/bpjstku/data/registration/pmi/model/response/CityItem;", "getCities", "(Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/partners/remote/PartnersApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PartnersApi implements unbindChildren, PartnersApiClient {
    public static final int $stable = 8;
    private final PartnersApiClient apiClient;

    public PartnersApi(PartnersApiClient partnersApiClient) {
        Intrinsics.checkNotNullParameter(partnersApiClient, "");
        this.apiClient = partnersApiClient;
    }

    @Override // com.bpjstku.data.partners.remote.PartnersApiClient
    public final deriveCodec<Response<PartnersResponse>> getPartners(GetPartnerRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getPartners(p0);
    }

    @Override // com.bpjstku.data.partners.remote.PartnersApiClient
    public final deriveCodec<Response<ProvinceItem>> getProvinces(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getProvinces(p0);
    }

    @Override // com.bpjstku.data.partners.remote.PartnersApiClient
    public final deriveCodec<Response<CityItem>> getCities(CityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getCities(p0);
    }
}
