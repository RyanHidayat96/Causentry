package com.bpjstku.data.office.remote;

import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.office.model.request.BranchOfficeDefaultSelectedRequest;
import com.bpjstku.data.office.model.request.BranchOfficeRequest;
import com.bpjstku.data.office.model.request.NearestBranchOfficeRequest;
import com.bpjstku.data.office.model.response.BranchOfficeDefaultSelectedResponse;
import com.bpjstku.data.office.model.response.BranchOfficeLocationByRegionResponse;
import com.bpjstku.data.office.model.response.BranchOfficeLocationResponse;
import com.bpjstku.data.office.model.response.BranchPioneerOfficeResponse;
import com.bpjstku.data.office.model.response.NearestBranchOfficeLocationResponse;
import com.bpjstku.data.office.model.response.RegionalOfficeLocationResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u000bJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/bpjstku/data/office/remote/OfficeApi;", "LunbindChildren;", "Lcom/bpjstku/data/office/remote/OfficeApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/office/remote/OfficeApiClient;)V", "Lcom/bpjstku/data/lib/model/BaseRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/office/model/response/BranchOfficeLocationResponse;", "getBranchOffices", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/response/BranchPioneerOfficeResponse;", "getBranchPioneerOffices", "Lcom/bpjstku/data/office/model/response/RegionalOfficeLocationResponse;", "getRegionalOffices", "Lcom/bpjstku/data/office/model/request/BranchOfficeRequest;", "Lcom/bpjstku/data/office/model/response/BranchOfficeLocationByRegionResponse;", "getBranchOfficeByRegion", "(Lcom/bpjstku/data/office/model/request/BranchOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/request/NearestBranchOfficeRequest;", "Lcom/bpjstku/data/office/model/response/NearestBranchOfficeLocationResponse;", "getNearestBranchOffice", "(Lcom/bpjstku/data/office/model/request/NearestBranchOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/request/BranchOfficeDefaultSelectedRequest;", "Lcom/bpjstku/data/office/model/response/BranchOfficeDefaultSelectedResponse;", "getBranchDefaultSelected", "(Lcom/bpjstku/data/office/model/request/BranchOfficeDefaultSelectedRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/office/remote/OfficeApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OfficeApi implements unbindChildren, OfficeApiClient {
    public static final int $stable = 8;
    private final OfficeApiClient apiClient;

    public OfficeApi(OfficeApiClient officeApiClient) {
        Intrinsics.checkNotNullParameter(officeApiClient, "");
        this.apiClient = officeApiClient;
    }

    @Override // com.bpjstku.data.office.remote.OfficeApiClient
    public final deriveCodec<Response<BranchOfficeLocationResponse>> getBranchOffices(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBranchOffices(p0);
    }

    @Override // com.bpjstku.data.office.remote.OfficeApiClient
    public final deriveCodec<Response<BranchPioneerOfficeResponse>> getBranchPioneerOffices(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBranchPioneerOffices(p0);
    }

    @Override // com.bpjstku.data.office.remote.OfficeApiClient
    public final deriveCodec<Response<RegionalOfficeLocationResponse>> getRegionalOffices(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getRegionalOffices(p0);
    }

    @Override // com.bpjstku.data.office.remote.OfficeApiClient
    public final deriveCodec<Response<BranchOfficeLocationByRegionResponse>> getBranchOfficeByRegion(BranchOfficeRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBranchOfficeByRegion(p0);
    }

    @Override // com.bpjstku.data.office.remote.OfficeApiClient
    public final deriveCodec<Response<NearestBranchOfficeLocationResponse>> getNearestBranchOffice(NearestBranchOfficeRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getNearestBranchOffice(p0);
    }

    @Override // com.bpjstku.data.office.remote.OfficeApiClient
    public final deriveCodec<Response<BranchOfficeDefaultSelectedResponse>> getBranchDefaultSelected(BranchOfficeDefaultSelectedRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBranchDefaultSelected(p0);
    }
}
