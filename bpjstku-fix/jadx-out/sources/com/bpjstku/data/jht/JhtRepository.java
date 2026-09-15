package com.bpjstku.data.jht;

import com.bpjstku.data.jht.model.request.CheckAdminDukRequest;
import com.bpjstku.data.jht.model.request.CheckBankAccountRequest;
import com.bpjstku.data.jht.model.request.CheckEligibilityRequest;
import com.bpjstku.data.jht.model.request.CheckFaceLivenessRequest;
import com.bpjstku.data.jht.model.request.CheckIdFacelivenessRequest;
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
import com.bpjstku.data.jht.model.request.InfoPraClaimRequest;
import com.bpjstku.data.jht.model.request.JhtBalanceRequest;
import com.bpjstku.data.jht.model.request.JhtBenefitDetailRequest;
import com.bpjstku.data.jht.model.request.JhtClaimContributionRequest;
import com.bpjstku.data.jht.model.request.JhtClaimRequest;
import com.bpjstku.data.jht.model.request.JhtClaimTrackRequest;
import com.bpjstku.data.jht.model.request.JhtContributionDetailRequest;
import com.bpjstku.data.jht.model.request.JhtInstantClaimRequest;
import com.bpjstku.data.jht.model.request.JhtSubscriptionRequest;
import com.bpjstku.data.jht.model.request.SendRsJhtRequest;
import com.bpjstku.data.jht.model.response.ClaimCheckBankBpuReactivationResponse;
import com.bpjstku.data.jht.model.response.ClaimEvidenceJhtResponse;
import com.bpjstku.data.jht.model.response.ClaimLivenessResponse;
import com.bpjstku.data.jht.model.response.ClaimReactivationBpuTuitionResponse;
import com.bpjstku.data.jht.model.response.GenerateClaimCodeResponse;
import com.bpjstku.data.jht.model.response.InfoPraClaimItems;
import com.bpjstku.data.jht.model.response.JhtBalanceItem;
import com.bpjstku.data.jht.model.response.JhtBenefitDetailItem;
import com.bpjstku.data.jht.model.response.JhtClaimCheckPhotoResponse;
import com.bpjstku.data.jht.model.response.JhtClaimContributionResponse;
import com.bpjstku.data.jht.model.response.JhtClaimEligibilityResponse;
import com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataItem;
import com.bpjstku.data.jht.model.response.JhtClaimReasonResponse;
import com.bpjstku.data.jht.model.response.JhtClaimSignaturedItem;
import com.bpjstku.data.jht.model.response.JhtClaimTrackItem;
import com.bpjstku.data.jht.model.response.JhtContributionDetailItem;
import com.bpjstku.data.jht.model.response.JhtEligibilityClaimItem;
import com.bpjstku.data.jht.model.response.JhtSubscriptionItem;
import com.bpjstku.data.jht.model.response.ListClaimSegmenItem;
import com.bpjstku.data.jht.model.response.ListCodeLayOffCode;
import com.bpjstku.data.jht.model.response.ReasonNotReactive;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import defpackage.VideoRecordEvent;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ú\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0003\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u0003\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\u0006\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0003\u001a\u00020)H'¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0003\u001a\u00020-H'¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u0012002\u0006\u0010\u0003\u001a\u00020-H'¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0003\u001a\u000203H'¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0006\u0010\u0003\u001a\u000206H'¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0003\u001a\u000209H'¢\u0006\u0004\b:\u0010;J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00042\u0006\u0010\u0003\u001a\u00020<H'¢\u0006\u0004\b>\u0010?J\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00042\u0006\u0010\u0003\u001a\u00020@H'¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0003\u001a\u00020DH'¢\u0006\u0004\bE\u0010FJ\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0003\u001a\u00020-H'¢\u0006\u0004\bG\u0010/J\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00042\u0006\u0010\u0003\u001a\u00020HH'¢\u0006\u0004\bJ\u0010KJ\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00042\u0006\u0010\u0003\u001a\u00020LH'¢\u0006\u0004\bN\u0010OJ\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u00042\u0006\u0010\u0003\u001a\u00020PH'¢\u0006\u0004\bR\u0010SJ#\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\u00050\u00042\u0006\u0010\u0003\u001a\u00020TH'¢\u0006\u0004\bV\u0010WJ\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u00042\u0006\u0010\u0003\u001a\u00020XH'¢\u0006\u0004\bZ\u0010[J\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\u00042\u0006\u0010\u0003\u001a\u00020\\H'¢\u0006\u0004\b^\u0010_J\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020]0\u00042\u0006\u0010\u0003\u001a\u00020`H'¢\u0006\u0004\ba\u0010bJ#\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u00050\u00042\u0006\u0010\u0003\u001a\u00020cH'¢\u0006\u0004\be\u0010fJ#\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0\u00050\u00042\u0006\u0010\u0003\u001a\u00020gH'¢\u0006\u0004\bi\u0010jJ\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020l0\u00042\u0006\u0010\u0003\u001a\u00020kH'¢\u0006\u0004\bm\u0010nJ\u001d\u0010q\u001a\b\u0012\u0004\u0012\u00020p0\u00042\u0006\u0010\u0003\u001a\u00020oH'¢\u0006\u0004\bq\u0010rJ\u001b\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0\u00050\u0004H'¢\u0006\u0004\bt\u0010uø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/jht/JhtRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/jht/model/request/JhtBalanceRequest;", "p0", "LderiveCodec;", "", "Lcom/bpjstku/data/jht/model/response/JhtBalanceItem;", "getJhtBalance", "(Lcom/bpjstku/data/jht/model/request/JhtBalanceRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtSubscriptionRequest;", "Lcom/bpjstku/data/jht/model/response/JhtSubscriptionItem;", "getJhtSubscriptions", "(Lcom/bpjstku/data/jht/model/request/JhtSubscriptionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/GetRsJhtRequest;", "Lokhttp3/ResponseBody;", "getRsJht", "(Lcom/bpjstku/data/jht/model/request/GetRsJhtRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/SendRsJhtRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "sendRsJht", "(Lcom/bpjstku/data/jht/model/request/SendRsJhtRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/GenerateClaimCodeRequest;", "Lcom/bpjstku/data/jht/model/response/GenerateClaimCodeResponse;", "getGenerateClaimCode", "(Lcom/bpjstku/data/jht/model/request/GenerateClaimCodeRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckEligibilityRequest;", "Lcom/bpjstku/data/jht/model/response/JhtEligibilityClaimItem;", "checkEligibilityRequest", "(Lcom/bpjstku/data/jht/model/request/CheckEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimReasonRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimReasonResponse;", "getClaimReason", "(Lcom/bpjstku/data/jht/model/request/ClaimReasonRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckAdminDukRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimSignaturedItem;", "checkAdminDuk", "(Lcom/bpjstku/data/jht/model/request/CheckAdminDukRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckPhotoAdminDukRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimCheckPhotoResponse;", "checkPhotoAdminDuk", "(Lcom/bpjstku/data/jht/model/request/CheckPhotoAdminDukRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimEvidenceJhtRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtResponse;", "checkClaimEvidenceJht", "(Lcom/bpjstku/data/jht/model/request/ClaimEvidenceJhtRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckFaceLivenessRequest;", "checkDukcapilFaceLiveness", "(Lcom/bpjstku/data/jht/model/request/CheckFaceLivenessRequest;)LderiveCodec;", "LVideoRecordEvent;", "checkNodefluxFaceLiveness", "(Lcom/bpjstku/data/jht/model/request/CheckFaceLivenessRequest;)LVideoRecordEvent;", "Lcom/bpjstku/data/jht/model/request/CheckIdFacelivenessRequest;", "checkIdFaceLiveness", "(Lcom/bpjstku/data/jht/model/request/CheckIdFacelivenessRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckBankAccountRequest;", "checkBankAccount", "(Lcom/bpjstku/data/jht/model/request/CheckBankAccountRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtClaimRequest;", "postJhtKlaim", "(Lcom/bpjstku/data/jht/model/request/JhtClaimRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtClaimTrackRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimTrackItem;", "postTrackClaim", "(Lcom/bpjstku/data/jht/model/request/JhtClaimTrackRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtBenefitDetailRequest;", "Lcom/bpjstku/data/jht/model/response/JhtBenefitDetailItem;", "getBenefitDetail", "(Lcom/bpjstku/data/jht/model/request/JhtBenefitDetailRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtInstantClaimRequest;", "postJhtInstantClaim", "(Lcom/bpjstku/data/jht/model/request/JhtInstantClaimRequest;)LderiveCodec;", "checkFaceLivenessBiometric", "Lcom/bpjstku/data/jht/model/request/ClaimCheckEligibilityRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityResponse;", "checkEligibilityClaim", "(Lcom/bpjstku/data/jht/model/request/ClaimCheckEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimEmployeeDataRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimEmployeeDataItem;", "getEmployeeDataClaim", "(Lcom/bpjstku/data/jht/model/request/ClaimEmployeeDataRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/InfoPraClaimRequest;", "Lcom/bpjstku/data/jht/model/response/InfoPraClaimItems;", "getInfoPraClaim", "(Lcom/bpjstku/data/jht/model/request/InfoPraClaimRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtContributionDetailRequest;", "Lcom/bpjstku/data/jht/model/response/JhtContributionDetailItem;", "getJhtContributionDetail", "(Lcom/bpjstku/data/jht/model/request/JhtContributionDetailRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtClaimContributionRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimContributionResponse;", "getJhtClaimContributionDetail", "(Lcom/bpjstku/data/jht/model/request/JhtClaimContributionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchCheckRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimLivenessResponse;", "claimLivenessFaceMatchCheck", "(Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchCheckRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchRequest;", "claimLivenessFaceMatch", "(Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimSegmenRequest;", "Lcom/bpjstku/data/jht/model/response/ListClaimSegmenItem;", "getClaimSegment", "(Lcom/bpjstku/data/jht/model/request/ClaimSegmenRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/jht/model/response/ListCodeLayOffCode;", "getClaimLayoffDocCode", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimReactivationBpuTuitionRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimReactivationBpuTuitionResponse;", "getClaimReactivationBpuTuition", "(Lcom/bpjstku/data/jht/model/request/ClaimReactivationBpuTuitionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimCheckBankBpuReactivationRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimCheckBankBpuReactivationResponse;", "claimCheckBankBpuReactivation", "(Lcom/bpjstku/data/jht/model/request/ClaimCheckBankBpuReactivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/response/ReasonNotReactive;", "claimGetListReasonBpu", "()LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface JhtRepository extends getChildrenOutConfigs {
    deriveCodec<JhtClaimSignaturedItem> checkAdminDuk(CheckAdminDukRequest p0);

    deriveCodec<JhtClaimSignaturedItem> checkBankAccount(CheckBankAccountRequest p0);

    deriveCodec<ClaimEvidenceJhtResponse> checkClaimEvidenceJht(ClaimEvidenceJhtRequest p0);

    deriveCodec<BaseItem> checkDukcapilFaceLiveness(CheckFaceLivenessRequest p0);

    deriveCodec<JhtClaimEligibilityResponse> checkEligibilityClaim(ClaimCheckEligibilityRequest p0);

    deriveCodec<JhtEligibilityClaimItem> checkEligibilityRequest(CheckEligibilityRequest p0);

    deriveCodec<BaseItem> checkFaceLivenessBiometric(CheckFaceLivenessRequest p0);

    deriveCodec<BaseItem> checkIdFaceLiveness(CheckIdFacelivenessRequest p0);

    VideoRecordEvent<BaseItem> checkNodefluxFaceLiveness(CheckFaceLivenessRequest p0);

    deriveCodec<JhtClaimCheckPhotoResponse> checkPhotoAdminDuk(CheckPhotoAdminDukRequest p0);

    deriveCodec<ClaimCheckBankBpuReactivationResponse> claimCheckBankBpuReactivation(ClaimCheckBankBpuReactivationRequest p0);

    deriveCodec<List<ReasonNotReactive>> claimGetListReasonBpu();

    deriveCodec<ClaimLivenessResponse> claimLivenessFaceMatch(ClaimLivenessFaceMatchRequest p0);

    deriveCodec<ClaimLivenessResponse> claimLivenessFaceMatchCheck(ClaimLivenessFaceMatchCheckRequest p0);

    deriveCodec<JhtBenefitDetailItem> getBenefitDetail(JhtBenefitDetailRequest p0);

    deriveCodec<List<ListCodeLayOffCode>> getClaimLayoffDocCode(BaseRequest p0);

    deriveCodec<ClaimReactivationBpuTuitionResponse> getClaimReactivationBpuTuition(ClaimReactivationBpuTuitionRequest p0);

    deriveCodec<JhtClaimReasonResponse> getClaimReason(ClaimReasonRequest p0);

    deriveCodec<List<ListClaimSegmenItem>> getClaimSegment(ClaimSegmenRequest p0);

    deriveCodec<JhtClaimEmployeeDataItem> getEmployeeDataClaim(ClaimEmployeeDataRequest p0);

    deriveCodec<GenerateClaimCodeResponse> getGenerateClaimCode(GenerateClaimCodeRequest p0);

    deriveCodec<InfoPraClaimItems> getInfoPraClaim(InfoPraClaimRequest p0);

    deriveCodec<List<JhtBalanceItem>> getJhtBalance(JhtBalanceRequest p0);

    deriveCodec<JhtClaimContributionResponse> getJhtClaimContributionDetail(JhtClaimContributionRequest p0);

    deriveCodec<List<JhtContributionDetailItem>> getJhtContributionDetail(JhtContributionDetailRequest p0);

    deriveCodec<List<JhtSubscriptionItem>> getJhtSubscriptions(JhtSubscriptionRequest p0);

    deriveCodec<ResponseBody> getRsJht(GetRsJhtRequest p0);

    deriveCodec<BaseItem> postJhtInstantClaim(JhtInstantClaimRequest p0);

    deriveCodec<BaseItem> postJhtKlaim(JhtClaimRequest p0);

    deriveCodec<JhtClaimTrackItem> postTrackClaim(JhtClaimTrackRequest p0);

    deriveCodec<BaseItem> sendRsJht(SendRsJhtRequest p0);
}
