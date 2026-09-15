package com.bpjstku.data.vocation.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.data.registration.pmi.model.response.CityItem;
import com.bpjstku.data.registration.pmi.model.response.ProvinceItem;
import com.bpjstku.data.vocation.model.request.AccountNameSimilarityRequest;
import com.bpjstku.data.vocation.model.request.BlkProfileRequest;
import com.bpjstku.data.vocation.model.request.SaveSurveyRequest;
import com.bpjstku.data.vocation.model.request.TrainingFieldRequest;
import com.bpjstku.data.vocation.model.request.VocationEligibilityRequest;
import com.bpjstku.data.vocation.model.request.VocationPhoneVerificationRequest;
import com.bpjstku.data.vocation.model.request.VocationProfileRequest;
import com.bpjstku.data.vocation.model.request.VocationRegisterRequest;
import com.bpjstku.data.vocation.model.request.VocationTrainingRequest;
import com.bpjstku.data.vocation.model.response.AccountSimilarityItem;
import com.bpjstku.data.vocation.model.response.BankResponse;
import com.bpjstku.data.vocation.model.response.BlkProfileResponse;
import com.bpjstku.data.vocation.model.response.ExpertiseFieldResponse;
import com.bpjstku.data.vocation.model.response.SurveyResponse;
import com.bpjstku.data.vocation.model.response.VocationProfileResponse;
import com.bpjstku.data.vocation.model.response.VocationTrainingResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b!\u0010\u000fJ#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\b0\u00072\u0006\u0010\u0003\u001a\u00020\"H\u0017¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\b0\u00072\u0006\u0010\u0003\u001a\u00020&H\u0017¢\u0006\u0004\b(\u0010)J#\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020*H\u0017¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\b0\u00072\u0006\u0010\u0003\u001a\u00020-H\u0017¢\u0006\u0004\b/\u00100J#\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b2\u0010\u000fJ#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u000203H\u0017¢\u0006\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107"}, d2 = {"Lcom/bpjstku/data/vocation/remote/VocationApi;", "LunbindChildren;", "Lcom/bpjstku/data/vocation/remote/VocationApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/vocation/remote/VocationApiClient;)V", "Lcom/bpjstku/data/vocation/model/request/VocationEligibilityRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/lib/model/BaseItem;", "checkEligibility", "(Lcom/bpjstku/data/vocation/model/request/VocationEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/registration/pmi/model/response/ProvinceItem;", "getProvinces", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;", "Lcom/bpjstku/data/registration/pmi/model/response/CityItem;", "getCities", "(Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationProfileRequest;", "Lcom/bpjstku/data/vocation/model/response/VocationProfileResponse;", "getProfile", "(Lcom/bpjstku/data/vocation/model/request/VocationProfileRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationTrainingRequest;", "Lcom/bpjstku/data/vocation/model/response/VocationTrainingResponse;", "getVocationTrainings", "(Lcom/bpjstku/data/vocation/model/request/VocationTrainingRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/AccountNameSimilarityRequest;", "Lcom/bpjstku/data/vocation/model/response/AccountSimilarityItem;", "checkAccountNameSimilarity", "(Lcom/bpjstku/data/vocation/model/request/AccountNameSimilarityRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/response/BankResponse;", "getBankList", "Lcom/bpjstku/data/vocation/model/request/TrainingFieldRequest;", "Lcom/bpjstku/data/vocation/model/response/ExpertiseFieldResponse;", "getExpertiseField", "(Lcom/bpjstku/data/vocation/model/request/TrainingFieldRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/BlkProfileRequest;", "Lcom/bpjstku/data/vocation/model/response/BlkProfileResponse;", "getBlkProfile", "(Lcom/bpjstku/data/vocation/model/request/BlkProfileRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationRegisterRequest;", "register", "(Lcom/bpjstku/data/vocation/model/request/VocationRegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationPhoneVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "verifyPhoneNumber", "(Lcom/bpjstku/data/vocation/model/request/VocationPhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/response/SurveyResponse;", "getSurveys", "Lcom/bpjstku/data/vocation/model/request/SaveSurveyRequest;", "saveSurvey", "(Lcom/bpjstku/data/vocation/model/request/SaveSurveyRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/vocation/remote/VocationApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VocationApi implements unbindChildren, VocationApiClient {
    public static final int $stable = 8;
    private final VocationApiClient apiClient;

    public VocationApi(VocationApiClient vocationApiClient) {
        Intrinsics.checkNotNullParameter(vocationApiClient, "");
        this.apiClient = vocationApiClient;
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<BaseItem>> checkEligibility(VocationEligibilityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkEligibility(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<ProvinceItem>> getProvinces(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getProvinces(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<CityItem>> getCities(CityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getCities(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<VocationProfileResponse>> getProfile(VocationProfileRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getProfile(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<VocationTrainingResponse>> getVocationTrainings(VocationTrainingRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getVocationTrainings(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<AccountSimilarityItem>> checkAccountNameSimilarity(AccountNameSimilarityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkAccountNameSimilarity(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<BankResponse>> getBankList(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBankList(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<ExpertiseFieldResponse>> getExpertiseField(TrainingFieldRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getExpertiseField(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<BlkProfileResponse>> getBlkProfile(BlkProfileRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBlkProfile(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<BaseItem>> register(VocationRegisterRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.register(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<VerificationItem>> verifyPhoneNumber(VocationPhoneVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyPhoneNumber(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<SurveyResponse>> getSurveys(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getSurveys(p0);
    }

    @Override // com.bpjstku.data.vocation.remote.VocationApiClient
    public final deriveCodec<Response<BaseItem>> saveSurvey(SaveSurveyRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.saveSurvey(p0);
    }
}
