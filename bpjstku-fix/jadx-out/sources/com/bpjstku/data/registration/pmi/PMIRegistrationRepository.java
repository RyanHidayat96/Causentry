package com.bpjstku.data.registration.pmi;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.response.RegistrationItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.pmi.model.request.CheckPassportRequest;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.data.registration.pmi.model.request.PmiRegistrationRequest;
import com.bpjstku.data.registration.pmi.model.response.BranchOfficeItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0018\u0010\u0017J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u001c\u0010\u0017J%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u001e\u0010\u0017J%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u001f\u0010\u0017J\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0004H'¢\u0006\u0004\b \u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/registration/pmi/PMIRegistrationRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/registration/pmi/model/request/PmiRegistrationRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/response/RegistrationItem;", "postPMIRegistration", "(Lcom/bpjstku/data/registration/pmi/model/request/PmiRegistrationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postCheckResidenceInfo", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/request/CheckPassportRequest;", "postCheckPassport", "(Lcom/bpjstku/data/registration/pmi/model/request/CheckPassportRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "Lcom/bpjstku/data/lib/model/CodeAndNamePairItem;", "getJhtPayments", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "getProvinces", "Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;", "getCities", "(Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;)LderiveCodec;", "getJobTitles", "Lcom/bpjstku/data/registration/pmi/model/response/BranchOfficeItem;", "getBranchOfficeLocations", "getPlacementCountries", "checkSourceApi", "()LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PMIRegistrationRepository extends getChildrenOutConfigs {
    deriveCodec<BaseItem> checkSourceApi();

    deriveCodec<List<BranchOfficeItem>> getBranchOfficeLocations(@Body BaseRequest p0);

    deriveCodec<List<CodeAndNamePairItem>> getCities(@Body CityRequest p0);

    deriveCodec<List<CodeAndNamePairItem>> getJhtPayments(@Body BaseRequest p0);

    deriveCodec<List<CodeAndNamePairItem>> getJobTitles(@Body BaseRequest p0);

    deriveCodec<List<CodeAndNamePairItem>> getPlacementCountries(@Body BaseRequest p0);

    deriveCodec<List<CodeAndNamePairItem>> getProvinces(@Body BaseRequest p0);

    deriveCodec<BaseItem> postCheckPassport(@Body CheckPassportRequest p0);

    deriveCodec<BaseItem> postCheckResidenceInfo(@Body CheckResidenceInfoRequest p0);

    deriveCodec<VerificationItem> postEmailVerification(@Body EmailVerificationRequest p0);

    deriveCodec<RegistrationItem> postPMIRegistration(PmiRegistrationRequest p0);
}
