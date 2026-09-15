package com.bpjstku.data.partners;

import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.data.partners.model.request.GetPartnerRequest;
import com.bpjstku.data.partners.model.response.PartnerItem;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.domain.general.model.CodeNamePair;
import defpackage.VideoEncoderSession1;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0017\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/partners/PartnersRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/partners/model/request/GetPartnerRequest;", "p0", "LderiveCodec;", "", "Lcom/bpjstku/data/partners/model/response/PartnerItem;", "getPartners", "(Lcom/bpjstku/data/partners/model/request/GetPartnerRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/lib/model/CodeAndNamePairItem;", "getProvinces", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;", "getCities", "(Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;)LderiveCodec;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "getSavedCityFilter", "()Lcom/bpjstku/domain/general/model/CodeNamePair;", "getSavedProvinceFilter", "LVideoEncoderSession1;", "saveCityFilter", "(Lcom/bpjstku/domain/general/model/CodeNamePair;)LVideoEncoderSession1;", "saveProvinceFilter"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PartnersRepository extends getChildrenOutConfigs {
    deriveCodec<List<CodeAndNamePairItem>> getCities(@Body CityRequest p0);

    deriveCodec<List<PartnerItem>> getPartners(GetPartnerRequest p0);

    deriveCodec<List<CodeAndNamePairItem>> getProvinces(@Body BaseRequest p0);

    CodeNamePair getSavedCityFilter();

    CodeNamePair getSavedProvinceFilter();

    VideoEncoderSession1 saveCityFilter(CodeNamePair p0);

    VideoEncoderSession1 saveProvinceFilter(CodeNamePair p0);
}
