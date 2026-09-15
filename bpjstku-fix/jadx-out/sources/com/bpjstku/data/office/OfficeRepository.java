package com.bpjstku.data.office;

import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.office.model.request.BranchOfficeDefaultSelectedRequest;
import com.bpjstku.data.office.model.request.BranchOfficeRequest;
import com.bpjstku.data.office.model.request.NearestBranchOfficeRequest;
import com.bpjstku.data.office.model.response.BranchOfficeDefaultSelectedResponse;
import com.bpjstku.data.office.model.response.BranchOfficeItem;
import com.bpjstku.data.office.model.response.BranchPioneerOfficeItem;
import com.bpjstku.data.office.model.response.RegionalOfficeItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/office/OfficeRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "p0", "LderiveCodec;", "", "Lcom/bpjstku/data/office/model/response/RegionalOfficeItem;", "getBranchOffice", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/response/BranchPioneerOfficeItem;", "getBranchPioneerOffices", "getRegionalOffice", "Lcom/bpjstku/data/office/model/request/BranchOfficeRequest;", "Lcom/bpjstku/data/office/model/response/BranchOfficeItem;", "getBranchOfficeByRegion", "(Lcom/bpjstku/data/office/model/request/BranchOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/request/NearestBranchOfficeRequest;", "getNearestBranchOffice", "(Lcom/bpjstku/data/office/model/request/NearestBranchOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/office/model/request/BranchOfficeDefaultSelectedRequest;", "Lcom/bpjstku/data/office/model/response/BranchOfficeDefaultSelectedResponse;", "getBranchDefaultSelected", "(Lcom/bpjstku/data/office/model/request/BranchOfficeDefaultSelectedRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface OfficeRepository extends getChildrenOutConfigs {
    deriveCodec<BranchOfficeDefaultSelectedResponse> getBranchDefaultSelected(@Body BranchOfficeDefaultSelectedRequest p0);

    deriveCodec<List<RegionalOfficeItem>> getBranchOffice(@Body BaseRequest p0);

    deriveCodec<List<BranchOfficeItem>> getBranchOfficeByRegion(@Body BranchOfficeRequest p0);

    deriveCodec<List<BranchPioneerOfficeItem>> getBranchPioneerOffices(@Body BaseRequest p0);

    deriveCodec<BranchOfficeItem> getNearestBranchOffice(@Body NearestBranchOfficeRequest p0);

    deriveCodec<List<RegionalOfficeItem>> getRegionalOffice(@Body BaseRequest p0);
}
