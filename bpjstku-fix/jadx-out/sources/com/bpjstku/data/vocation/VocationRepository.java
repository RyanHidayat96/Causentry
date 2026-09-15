package com.bpjstku.data.vocation;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
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
import com.bpjstku.data.vocation.model.response.BankItem;
import com.bpjstku.data.vocation.model.response.BlkProfileResponse;
import com.bpjstku.data.vocation.model.response.ExpertiseFieldItem;
import com.bpjstku.data.vocation.model.response.SurveyItem;
import com.bpjstku.data.vocation.model.response.TrainingItem;
import com.bpjstku.data.vocation.model.response.VocationProfileItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\u001d\u0010\fJ#\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\t0\u00042\u0006\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\u0006\u0010\u0003\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020&H'¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0003\u001a\u00020)H'¢\u0006\u0004\b+\u0010,J#\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b.\u0010\fJ\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020/H'¢\u0006\u0004\b0\u00101ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/vocation/VocationRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/vocation/model/request/VocationEligibilityRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseItem;", "checkEligibility", "(Lcom/bpjstku/data/vocation/model/request/VocationEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "Lcom/bpjstku/data/lib/model/CodeAndNamePairItem;", "getProvinces", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;", "getCities", "(Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationProfileRequest;", "Lcom/bpjstku/data/vocation/model/response/VocationProfileItem;", "getProfile", "(Lcom/bpjstku/data/vocation/model/request/VocationProfileRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationTrainingRequest;", "Lcom/bpjstku/data/vocation/model/response/TrainingItem;", "getVocationTrainings", "(Lcom/bpjstku/data/vocation/model/request/VocationTrainingRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/AccountNameSimilarityRequest;", "Lcom/bpjstku/data/vocation/model/response/AccountSimilarityItem;", "checkAccountNameSimilarity", "(Lcom/bpjstku/data/vocation/model/request/AccountNameSimilarityRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/response/BankItem;", "getBankList", "Lcom/bpjstku/data/vocation/model/request/TrainingFieldRequest;", "Lcom/bpjstku/data/vocation/model/response/ExpertiseFieldItem;", "getExpertiseField", "(Lcom/bpjstku/data/vocation/model/request/TrainingFieldRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/BlkProfileRequest;", "Lcom/bpjstku/data/vocation/model/response/BlkProfileResponse;", "getBlkProfile", "(Lcom/bpjstku/data/vocation/model/request/BlkProfileRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationRegisterRequest;", "register", "(Lcom/bpjstku/data/vocation/model/request/VocationRegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationPhoneVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "verifyPhoneNumber", "(Lcom/bpjstku/data/vocation/model/request/VocationPhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/response/SurveyItem;", "getSurveys", "Lcom/bpjstku/data/vocation/model/request/SaveSurveyRequest;", "saveSurvey", "(Lcom/bpjstku/data/vocation/model/request/SaveSurveyRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface VocationRepository extends getChildrenOutConfigs {
    deriveCodec<AccountSimilarityItem> checkAccountNameSimilarity(AccountNameSimilarityRequest p0);

    deriveCodec<BaseItem> checkEligibility(VocationEligibilityRequest p0);

    deriveCodec<List<BankItem>> getBankList(BaseRequest p0);

    deriveCodec<BlkProfileResponse> getBlkProfile(BlkProfileRequest p0);

    deriveCodec<List<CodeAndNamePairItem>> getCities(CityRequest p0);

    deriveCodec<List<ExpertiseFieldItem>> getExpertiseField(TrainingFieldRequest p0);

    deriveCodec<VocationProfileItem> getProfile(VocationProfileRequest p0);

    deriveCodec<List<CodeAndNamePairItem>> getProvinces(BaseRequest p0);

    deriveCodec<List<SurveyItem>> getSurveys(BaseRequest p0);

    deriveCodec<List<TrainingItem>> getVocationTrainings(VocationTrainingRequest p0);

    deriveCodec<BaseItem> register(VocationRegisterRequest p0);

    deriveCodec<BaseItem> saveSurvey(SaveSurveyRequest p0);

    deriveCodec<VerificationItem> verifyPhoneNumber(VocationPhoneVerificationRequest p0);
}
