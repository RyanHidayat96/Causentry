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
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u001e\u0010\fJ%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001fH'¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J%\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020'H'¢\u0006\u0004\b(\u0010)J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020*H'¢\u0006\u0004\b,\u0010-J%\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b/\u0010\fJ%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000200H'¢\u0006\u0004\b1\u00102ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/vocation/remote/VocationApiClient;", "", "Lcom/bpjstku/data/vocation/model/request/VocationEligibilityRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/lib/model/BaseItem;", "checkEligibility", "(Lcom/bpjstku/data/vocation/model/request/VocationEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/registration/pmi/model/response/ProvinceItem;", "getProvinces", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;", "Lcom/bpjstku/data/registration/pmi/model/response/CityItem;", "getCities", "(Lcom/bpjstku/data/registration/pmi/model/request/CityRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationProfileRequest;", "Lcom/bpjstku/data/vocation/model/response/VocationProfileResponse;", "getProfile", "(Lcom/bpjstku/data/vocation/model/request/VocationProfileRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationTrainingRequest;", "Lcom/bpjstku/data/vocation/model/response/VocationTrainingResponse;", "getVocationTrainings", "(Lcom/bpjstku/data/vocation/model/request/VocationTrainingRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/AccountNameSimilarityRequest;", "Lcom/bpjstku/data/vocation/model/response/AccountSimilarityItem;", "checkAccountNameSimilarity", "(Lcom/bpjstku/data/vocation/model/request/AccountNameSimilarityRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/response/BankResponse;", "getBankList", "Lcom/bpjstku/data/vocation/model/request/TrainingFieldRequest;", "Lcom/bpjstku/data/vocation/model/response/ExpertiseFieldResponse;", "getExpertiseField", "(Lcom/bpjstku/data/vocation/model/request/TrainingFieldRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/BlkProfileRequest;", "Lcom/bpjstku/data/vocation/model/response/BlkProfileResponse;", "getBlkProfile", "(Lcom/bpjstku/data/vocation/model/request/BlkProfileRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationRegisterRequest;", "register", "(Lcom/bpjstku/data/vocation/model/request/VocationRegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/request/VocationPhoneVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "verifyPhoneNumber", "(Lcom/bpjstku/data/vocation/model/request/VocationPhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/vocation/model/response/SurveyResponse;", "getSurveys", "Lcom/bpjstku/data/vocation/model/request/SaveSurveyRequest;", "saveSurvey", "(Lcom/bpjstku/data/vocation/model/request/SaveSurveyRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface VocationApiClient {
    @POST("vokasi/cek-similarity-rekening")
    deriveCodec<Response<AccountSimilarityItem>> checkAccountNameSimilarity(@Body AccountNameSimilarityRequest p0);

    @POST("vokasi/cek-eligible")
    deriveCodec<Response<BaseItem>> checkEligibility(@Body VocationEligibilityRequest p0);

    @POST("vokasi/list-bank")
    deriveCodec<Response<BankResponse>> getBankList(@Body BaseRequest p0);

    @POST("vokasi/profile-blk")
    deriveCodec<Response<BlkProfileResponse>> getBlkProfile(@Body BlkProfileRequest p0);

    @POST("pendaftaran/pmi/kabupaten")
    deriveCodec<Response<CityItem>> getCities(@Body CityRequest p0);

    @POST("vokasi/list-bidang")
    deriveCodec<Response<ExpertiseFieldResponse>> getExpertiseField(@Body TrainingFieldRequest p0);

    @POST("vokasi/profile-peserta-vokasi")
    deriveCodec<Response<VocationProfileResponse>> getProfile(@Body VocationProfileRequest p0);

    @POST("pendaftaran/pmi/propinsi")
    deriveCodec<Response<ProvinceItem>> getProvinces(@Body BaseRequest p0);

    @POST("vokasi/list-survey")
    deriveCodec<Response<SurveyResponse>> getSurveys(@Body BaseRequest p0);

    @POST("vokasi/list-pelatihan")
    deriveCodec<Response<VocationTrainingResponse>> getVocationTrainings(@Body VocationTrainingRequest p0);

    @POST("vokasi/daftar-vokasi")
    deriveCodec<Response<BaseItem>> register(@Body VocationRegisterRequest p0);

    @POST("vokasi/survey")
    deriveCodec<Response<BaseItem>> saveSurvey(@Body SaveSurveyRequest p0);

    @POST("vokasi/verifikasi-pendaftaran")
    deriveCodec<Response<VerificationItem>> verifyPhoneNumber(@Body VocationPhoneVerificationRequest p0);
}
