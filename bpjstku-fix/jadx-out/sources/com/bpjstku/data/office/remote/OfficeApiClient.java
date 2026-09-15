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
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\bJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/office/remote/OfficeApiClient;", "", "Lcom/bpjstku/data/lib/model/BaseRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/office/model/response/RegionalOfficeLocationResponse;", "getRegionalOffices", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/response/BranchOfficeLocationResponse;", "getBranchOffices", "Lcom/bpjstku/data/office/model/response/BranchPioneerOfficeResponse;", "getBranchPioneerOffices", "Lcom/bpjstku/data/office/model/request/BranchOfficeRequest;", "Lcom/bpjstku/data/office/model/response/BranchOfficeLocationByRegionResponse;", "getBranchOfficeByRegion", "(Lcom/bpjstku/data/office/model/request/BranchOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/request/NearestBranchOfficeRequest;", "Lcom/bpjstku/data/office/model/response/NearestBranchOfficeLocationResponse;", "getNearestBranchOffice", "(Lcom/bpjstku/data/office/model/request/NearestBranchOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/request/BranchOfficeDefaultSelectedRequest;", "Lcom/bpjstku/data/office/model/response/BranchOfficeDefaultSelectedResponse;", "getBranchDefaultSelected", "(Lcom/bpjstku/data/office/model/request/BranchOfficeDefaultSelectedRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface OfficeApiClient {
    @POST("kantor/cabang-sertakan")
    deriveCodec<Response<BranchOfficeDefaultSelectedResponse>> getBranchDefaultSelected(@Body BranchOfficeDefaultSelectedRequest p0);

    @POST("kantor/cabang-by-wilayah")
    deriveCodec<Response<BranchOfficeLocationByRegionResponse>> getBranchOfficeByRegion(@Body BranchOfficeRequest p0);

    @POST("kantor/cabang")
    deriveCodec<Response<BranchOfficeLocationResponse>> getBranchOffices(@Body BaseRequest p0);

    @POST("kantor/cabang-perintis")
    deriveCodec<Response<BranchPioneerOfficeResponse>> getBranchPioneerOffices(@Body BaseRequest p0);

    @POST("kantor/cabang-terdekat")
    deriveCodec<Response<NearestBranchOfficeLocationResponse>> getNearestBranchOffice(@Body NearestBranchOfficeRequest p0);

    @POST("kantor/wilayah")
    deriveCodec<Response<RegionalOfficeLocationResponse>> getRegionalOffices(@Body BaseRequest p0);
}
