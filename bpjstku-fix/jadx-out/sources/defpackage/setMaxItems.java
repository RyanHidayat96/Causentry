package defpackage;

import com.bpjstku.data.lib.model.BaseRequest;
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
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.vocation.model.Bank;
import com.bpjstku.domain.vocation.model.Training;
import com.bpjstku.domain.vocation.model.TrainingField;
import com.bpjstku.domain.vocation.model.VocationProfile;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public interface setMaxItems {
    deriveCodec<List<Training>> TuitionPaymentFragmentbindingInflater1(VocationTrainingRequest vocationTrainingRequest);

    deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseRequest baseRequest);

    deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CityRequest cityRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault1(SaveSurveyRequest saveSurveyRequest);

    deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault1(VocationPhoneVerificationRequest vocationPhoneVerificationRequest);

    deriveCodec<List<ActivityResultContractSynchronousResult>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseRequest baseRequest);

    deriveCodec<VocationProfile> TuitionPaymentFragmentspecialinlinedviewModeldefault2(VocationProfileRequest vocationProfileRequest);

    deriveCodec<setMediaCapabilitiesForTranscoding> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AccountNameSimilarityRequest accountNameSimilarityRequest);

    deriveCodec<List<TrainingField>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(TrainingFieldRequest trainingFieldRequest);

    deriveCodec<List<Bank>> b(BaseRequest baseRequest);

    deriveCodec<Pair<List<PickVisualMediaRequestdefault>, List<getSynchronousResult>>> b(BlkProfileRequest blkProfileRequest);

    deriveCodec<BaseModel> b(VocationEligibilityRequest vocationEligibilityRequest);

    deriveCodec<BaseModel> b(VocationRegisterRequest vocationRegisterRequest);
}
