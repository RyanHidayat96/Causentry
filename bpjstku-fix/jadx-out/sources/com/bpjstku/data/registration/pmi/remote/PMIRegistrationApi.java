package com.bpjstku.data.registration.pmi.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.bpu.model.response.JobTitlesItem;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.response.RegistrationItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.pmi.model.request.CheckPassportRequest;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.data.registration.pmi.model.response.BranchOfficeLocationsItem;
import com.bpjstku.data.registration.pmi.model.response.CityItem;
import com.bpjstku.data.registration.pmi.model.response.JhtPaymentItem;
import com.bpjstku.data.registration.pmi.model.response.PlacementCountryItem;
import com.bpjstku.data.registration.pmi.model.response.ProvinceItem;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u000bJ#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u000bJ#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0017\u0010\u000bJ#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"J?\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\b0\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0017¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u0007H\u0017¢\u0006\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Lcom/bpjstku/data/registration/pmi/remote/PMIRegistrationApi;", "LunbindChildren;", "Lcom/bpjstku/data/registration/pmi/remote/PMIRegistrationApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/registration/pmi/remote/PMIRegistrationApiClient;)V", "Lcom/bpjstku/data/lib/model/BaseRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/registration/pmi/model/response/PlacementCountryItem;", "getPlacementCountries", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/bpu/model/response/JobTitlesItem;", "getJobTitles", "Lcom/bpjstku/data/registration/pmi/model/response/BranchOfficeLocationsItem;", "getBranchOfficeLocations", "Lcom/bpjstku/data/registration/pmi/model/response/ProvinceItem;", "getProvinces", "Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;", "Lcom/bpjstku/data/registration/pmi/model/response/CityItem;", "getCities", "(Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/response/JhtPaymentItem;", "getJhtPayments", "Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postCheckResidenceInfo", "(Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/request/CheckPassportRequest;", "postCheckPassport", "(Lcom/bpjstku/data/registration/pmi/model/request/CheckPassportRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lokhttp3/MultipartBody$Part;", "p1", "p2", "Lcom/bpjstku/data/registration/general/model/response/RegistrationItem;", "postPmiRegistration", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "checkSourceIp", "()LderiveCodec;", "apiClient", "Lcom/bpjstku/data/registration/pmi/remote/PMIRegistrationApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PMIRegistrationApi implements unbindChildren, PMIRegistrationApiClient {
    public static final int $stable = 8;
    private final PMIRegistrationApiClient apiClient;

    public PMIRegistrationApi(PMIRegistrationApiClient pMIRegistrationApiClient) {
        Intrinsics.checkNotNullParameter(pMIRegistrationApiClient, "");
        this.apiClient = pMIRegistrationApiClient;
    }

    @Override // com.bpjstku.data.registration.pmi.remote.PMIRegistrationApiClient
    public final deriveCodec<Response<PlacementCountryItem>> getPlacementCountries(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getPlacementCountries(p0);
    }

    @Override // com.bpjstku.data.registration.pmi.remote.PMIRegistrationApiClient
    public final deriveCodec<Response<JobTitlesItem>> getJobTitles(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getJobTitles(p0);
    }

    @Override // com.bpjstku.data.registration.pmi.remote.PMIRegistrationApiClient
    public final deriveCodec<Response<BranchOfficeLocationsItem>> getBranchOfficeLocations(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBranchOfficeLocations(p0);
    }

    @Override // com.bpjstku.data.registration.pmi.remote.PMIRegistrationApiClient
    public final deriveCodec<Response<ProvinceItem>> getProvinces(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getProvinces(p0);
    }

    @Override // com.bpjstku.data.registration.pmi.remote.PMIRegistrationApiClient
    public final deriveCodec<Response<CityItem>> getCities(CityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getCities(p0);
    }

    @Override // com.bpjstku.data.registration.pmi.remote.PMIRegistrationApiClient
    public final deriveCodec<Response<JhtPaymentItem>> getJhtPayments(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getJhtPayments(p0);
    }

    @Override // com.bpjstku.data.registration.pmi.remote.PMIRegistrationApiClient
    public final deriveCodec<Response<BaseItem>> postCheckResidenceInfo(CheckResidenceInfoRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postCheckResidenceInfo(p0);
    }

    @Override // com.bpjstku.data.registration.pmi.remote.PMIRegistrationApiClient
    public final deriveCodec<Response<BaseItem>> postCheckPassport(CheckPassportRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postCheckPassport(p0);
    }

    @Override // com.bpjstku.data.registration.pmi.remote.PMIRegistrationApiClient
    public final deriveCodec<Response<VerificationItem>> postEmailVerification(EmailVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postEmailVerification(p0);
    }

    @Override // com.bpjstku.data.registration.pmi.remote.PMIRegistrationApiClient
    public final deriveCodec<Response<RegistrationItem>> postPmiRegistration(Map<String, ? extends RequestBody> p0, MultipartBody.Part p1, MultipartBody.Part p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return this.apiClient.postPmiRegistration(p0, p1, p2);
    }

    @Override // com.bpjstku.data.registration.pmi.remote.PMIRegistrationApiClient
    public final deriveCodec<Response<BaseItem>> checkSourceIp() {
        return this.apiClient.checkSourceIp();
    }
}
