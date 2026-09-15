package defpackage;

import com.bpjstku.data.jht.model.request.CheckBankAccountRequest;
import com.bpjstku.data.jht.model.request.CheckPhotoAdminDukRequest;
import com.bpjstku.data.jht.model.request.ClaimCheckBankBpuReactivationRequest;
import com.bpjstku.data.jht.model.request.ClaimCheckEligibilityRequest;
import com.bpjstku.data.jht.model.request.ClaimEmployeeDataRequest;
import com.bpjstku.data.jht.model.request.ClaimEvidenceJhtRequest;
import com.bpjstku.data.jht.model.request.ClaimLivenessFaceMatchCheckRequest;
import com.bpjstku.data.jht.model.request.ClaimLivenessFaceMatchRequest;
import com.bpjstku.data.jht.model.request.ClaimReactivationBpuTuitionRequest;
import com.bpjstku.data.jht.model.request.ClaimReasonRequest;
import com.bpjstku.data.jht.model.request.ClaimSegmenRequest;
import com.bpjstku.data.jht.model.request.GenerateClaimCodeRequest;
import com.bpjstku.data.jht.model.request.GetRsJhtRequest;
import com.bpjstku.data.jht.model.request.JhtBalanceRequest;
import com.bpjstku.data.jht.model.request.JhtBenefitDetailRequest;
import com.bpjstku.data.jht.model.request.JhtClaimContributionRequest;
import com.bpjstku.data.jht.model.request.JhtClaimTrackRequest;
import com.bpjstku.data.jht.model.request.JhtInstantClaimRequest;
import com.bpjstku.data.jht.model.request.SendRsJhtRequest;
import com.bpjstku.data.jht.model.response.ClaimCheckBankBpuReactivationResponse;
import com.bpjstku.data.jht.model.response.ClaimEvidenceJhtResponse;
import com.bpjstku.data.jht.model.response.ClaimLivenessResponse;
import com.bpjstku.data.jht.model.response.ClaimReactivationBpuTuitionResponse;
import com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataItem;
import com.bpjstku.data.jht.model.response.ReasonNotReactive;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.jht.model.BenefitDetail;
import com.bpjstku.domain.jht.model.ClaimSegmenItem;
import com.bpjstku.domain.jht.model.JhtBalance;
import com.bpjstku.domain.jht.model.JhtClaimEligibility;
import com.bpjstku.domain.jht.model.JhtClaimTrack;
import com.bpjstku.domain.jht.model.JhtEligibility;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface removeOnPictureInPictureUiStateChangedListener {
    JhtClaimEligibility TuitionPaymentFragmentbindingInflater1();

    deriveCodec<JhtClaimEligibility> TuitionPaymentFragmentbindingInflater1(ClaimCheckEligibilityRequest claimCheckEligibilityRequest);

    deriveCodec<List<ReasonNotReactive>> TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    deriveCodec<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CheckPhotoAdminDukRequest checkPhotoAdminDukRequest);

    deriveCodec<ClaimCheckBankBpuReactivationResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimCheckBankBpuReactivationRequest claimCheckBankBpuReactivationRequest);

    deriveCodec<ClaimLivenessResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimLivenessFaceMatchRequest claimLivenessFaceMatchRequest);

    deriveCodec<ClaimReactivationBpuTuitionResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimReactivationBpuTuitionRequest claimReactivationBpuTuitionRequest);

    deriveCodec<List<ClaimSegmenItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClaimSegmenRequest claimSegmenRequest);

    deriveCodec<ComponentActivityExternalSyntheticLambda10> TuitionPaymentFragmentspecialinlinedviewModeldefault1(GenerateClaimCodeRequest generateClaimCodeRequest);

    deriveCodec<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault1(GetRsJhtRequest getRsJhtRequest);

    deriveCodec<List<startActivityForResult>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(JhtClaimContributionRequest jhtClaimContributionRequest);

    deriveCodec<ClaimLivenessResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimLivenessFaceMatchCheckRequest claimLivenessFaceMatchCheckRequest);

    deriveCodec<List<setPictureInPictureParams>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimReasonRequest claimReasonRequest);

    deriveCodec<List<JhtBalance>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(JhtBalanceRequest jhtBalanceRequest);

    deriveCodec<BenefitDetail> TuitionPaymentFragmentspecialinlinedviewModeldefault2(JhtBenefitDetailRequest jhtBenefitDetailRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(JhtInstantClaimRequest jhtInstantClaimRequest);

    setContentView TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    deriveCodec<List<JhtBalance>> TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    deriveCodec<JhtEligibility> TuitionPaymentFragmentspecialinlinedviewModeldefault3(CheckBankAccountRequest checkBankAccountRequest);

    deriveCodec<ClaimEvidenceJhtResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClaimEvidenceJhtRequest claimEvidenceJhtRequest);

    deriveCodec<JhtClaimTrack> TuitionPaymentFragmentspecialinlinedviewModeldefault3(JhtClaimTrackRequest jhtClaimTrackRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(SendRsJhtRequest sendRsJhtRequest);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault3(setContentView setcontentview);

    JhtClaimEmployeeDataItem b();

    deriveCodec<JhtClaimEmployeeDataItem> b(ClaimEmployeeDataRequest claimEmployeeDataRequest);
}
