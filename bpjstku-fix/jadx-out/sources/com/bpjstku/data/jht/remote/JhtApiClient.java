package com.bpjstku.data.jht.remote;

import com.bpjstku.data.jht.model.request.CheckAdminDukRequest;
import com.bpjstku.data.jht.model.request.CheckBankAccountRequest;
import com.bpjstku.data.jht.model.request.CheckEligibilityRequest;
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
import com.bpjstku.data.jht.model.request.JhtClaimTrackRequest;
import com.bpjstku.data.jht.model.request.JhtContributionDetailRequest;
import com.bpjstku.data.jht.model.request.JhtInstantClaimRequest;
import com.bpjstku.data.jht.model.request.JhtSubscriptionRequest;
import com.bpjstku.data.jht.model.request.SendRsJhtRequest;
import com.bpjstku.data.jht.model.response.ClaimCheckBankBpuReactivationResponse;
import com.bpjstku.data.jht.model.response.ClaimEvidenceJhtResponse;
import com.bpjstku.data.jht.model.response.ClaimLayoffDocCodeResponse;
import com.bpjstku.data.jht.model.response.ClaimLivenessResponse;
import com.bpjstku.data.jht.model.response.ClaimNotReactivationReason;
import com.bpjstku.data.jht.model.response.ClaimReactivationBpuTuitionResponse;
import com.bpjstku.data.jht.model.response.ClaimSegmenResponse;
import com.bpjstku.data.jht.model.response.GenerateClaimCodeResponse;
import com.bpjstku.data.jht.model.response.InfoPraClaimResponse;
import com.bpjstku.data.jht.model.response.JhtBalanceResponse;
import com.bpjstku.data.jht.model.response.JhtBenefitDetailResponse;
import com.bpjstku.data.jht.model.response.JhtClaimCheckPhotoResponse;
import com.bpjstku.data.jht.model.response.JhtClaimContributionResponse;
import com.bpjstku.data.jht.model.response.JhtClaimEligibilityResponse;
import com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataResponse;
import com.bpjstku.data.jht.model.response.JhtClaimReasonResponse;
import com.bpjstku.data.jht.model.response.JhtClaimSignaturedItem;
import com.bpjstku.data.jht.model.response.JhtClaimTrackItem;
import com.bpjstku.data.jht.model.response.JhtContributionDetailResponse;
import com.bpjstku.data.jht.model.response.JhtEligibilityClaimItem;
import com.bpjstku.data.jht.model.response.JhtSubscriptionResponse;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.BaseRequest;
import defpackage.VideoRecordEvent;
import defpackage.deriveCodec;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ú\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\b#\u0010$JB\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\t\u0012\u00070'¢\u0006\u0002\b(\u0018\u00010%2\b\b\u0001\u0010*\u001a\u00020)H'¢\u0006\u0004\b+\u0010,JB\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050-2\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\t\u0012\u00070'¢\u0006\u0002\b(\u0018\u00010%2\b\b\u0001\u0010*\u001a\u00020)H'¢\u0006\u0004\b.\u0010/JL\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\t\u0012\u00070'¢\u0006\u0002\b(\u0018\u00010%2\b\b\u0001\u0010*\u001a\u00020)2\b\b\u0001\u00100\u001a\u00020)H'¢\u0006\u0004\b1\u00102Jh\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\t\u0012\u00070'¢\u0006\u0002\b(\u0018\u00010%2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0001\u00100\u001a\u0004\u0018\u00010)2\n\b\u0001\u00103\u001a\u0004\u0018\u00010)2\n\b\u0001\u00104\u001a\u0004\u0018\u00010)H'¢\u0006\u0004\b5\u00106J%\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000207H'¢\u0006\u0004\b8\u00109J%\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020:H'¢\u0006\u0004\b<\u0010=J%\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020>H'¢\u0006\u0004\b@\u0010AJB\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\t\u0012\u00070'¢\u0006\u0002\b(\u0018\u00010%2\b\b\u0001\u0010*\u001a\u00020)H'¢\u0006\u0004\bB\u0010,J%\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020CH'¢\u0006\u0004\bD\u0010EJ%\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020FH'¢\u0006\u0004\bH\u0010IJ%\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020JH'¢\u0006\u0004\bL\u0010MJ%\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020NH'¢\u0006\u0004\bP\u0010QJ%\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020RH'¢\u0006\u0004\bT\u0010UJ%\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020VH'¢\u0006\u0004\bX\u0010YJ%\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020ZH'¢\u0006\u0004\b\\\u0010]J%\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020^H'¢\u0006\u0004\b`\u0010aJ%\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020bH'¢\u0006\u0004\bc\u0010dJ%\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020eH'¢\u0006\u0004\bg\u0010hJ%\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020iH'¢\u0006\u0004\bk\u0010lJ%\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020mH'¢\u0006\u0004\bo\u0010pJ%\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020qH'¢\u0006\u0004\bs\u0010tJ\u001b\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0\u00050\u0004H'¢\u0006\u0004\bv\u0010wJ%\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020xH'¢\u0006\u0004\bz\u0010{ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/jht/remote/JhtApiClient;", "", "Lcom/bpjstku/data/jht/model/request/JhtBalanceRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/jht/model/response/JhtBalanceResponse;", "getJhtBalance", "(Lcom/bpjstku/data/jht/model/request/JhtBalanceRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtSubscriptionRequest;", "Lcom/bpjstku/data/jht/model/response/JhtSubscriptionResponse;", "getJhtSubscriptions", "(Lcom/bpjstku/data/jht/model/request/JhtSubscriptionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/GetRsJhtRequest;", "Lokhttp3/ResponseBody;", "getRsJht", "(Lcom/bpjstku/data/jht/model/request/GetRsJhtRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/SendRsJhtRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "sendRsJht", "(Lcom/bpjstku/data/jht/model/request/SendRsJhtRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckEligibilityRequest;", "Lcom/bpjstku/data/jht/model/response/JhtEligibilityClaimItem;", "checkEligibility", "(Lcom/bpjstku/data/jht/model/request/CheckEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckAdminDukRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimSignaturedItem;", "checkAdminDuk", "(Lcom/bpjstku/data/jht/model/request/CheckAdminDukRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckPhotoAdminDukRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimCheckPhotoResponse;", "checkPhotoAdminDuk", "(Lcom/bpjstku/data/jht/model/request/CheckPhotoAdminDukRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimEvidenceJhtRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtResponse;", "checkClaimEvidenceJht", "(Lcom/bpjstku/data/jht/model/request/ClaimEvidenceJhtRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p1", "postDukcapilLivenessCheck", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "LVideoRecordEvent;", "postNodefluxLivenessCheck", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LVideoRecordEvent;", "p2", "postIdlLivenessCheck", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "p3", "p4", "postJhtClaim", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtInstantClaimRequest;", "postJhtInstantClaim", "(Lcom/bpjstku/data/jht/model/request/JhtInstantClaimRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtClaimTrackRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimTrackItem;", "postTrackClaim", "(Lcom/bpjstku/data/jht/model/request/JhtClaimTrackRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtBenefitDetailRequest;", "Lcom/bpjstku/data/jht/model/response/JhtBenefitDetailResponse;", "postBenefitDetail", "(Lcom/bpjstku/data/jht/model/request/JhtBenefitDetailRequest;)LderiveCodec;", "postCheckLivenessBiometric", "Lcom/bpjstku/data/jht/model/request/CheckBankAccountRequest;", "checkBankAccountValidity", "(Lcom/bpjstku/data/jht/model/request/CheckBankAccountRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimCheckEligibilityRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityResponse;", "checkEligibilityClaim", "(Lcom/bpjstku/data/jht/model/request/ClaimCheckEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimEmployeeDataRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimEmployeeDataResponse;", "getDataEmployeeData", "(Lcom/bpjstku/data/jht/model/request/ClaimEmployeeDataRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimReasonRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimReasonResponse;", "getClaimReason", "(Lcom/bpjstku/data/jht/model/request/ClaimReasonRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/InfoPraClaimRequest;", "Lcom/bpjstku/data/jht/model/response/InfoPraClaimResponse;", "getInfoPraClaim", "(Lcom/bpjstku/data/jht/model/request/InfoPraClaimRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtContributionDetailRequest;", "Lcom/bpjstku/data/jht/model/response/JhtContributionDetailResponse;", "getJhtContributionDetail", "(Lcom/bpjstku/data/jht/model/request/JhtContributionDetailRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtClaimContributionRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimContributionResponse;", "getJhtClaimContributionDetail", "(Lcom/bpjstku/data/jht/model/request/JhtClaimContributionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchCheckRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimLivenessResponse;", "claimLivenessFaceMatchCheck", "(Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchCheckRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchRequest;", "claimLivenessFaceMatch", "(Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimSegmenRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimSegmenResponse;", "getClaimSegment", "(Lcom/bpjstku/data/jht/model/request/ClaimSegmenRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimLayoffDocCodeResponse;", "getClaimLayoffDocCode", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimReactivationBpuTuitionRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimReactivationBpuTuitionResponse;", "getClaimBpuReactivationTuition", "(Lcom/bpjstku/data/jht/model/request/ClaimReactivationBpuTuitionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimCheckBankBpuReactivationRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimCheckBankBpuReactivationResponse;", "claimCheckBankBpuReactivation", "(Lcom/bpjstku/data/jht/model/request/ClaimCheckBankBpuReactivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/response/ClaimNotReactivationReason;", "claimGetListReasonBpu", "()LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/GenerateClaimCodeRequest;", "Lcom/bpjstku/data/jht/model/response/GenerateClaimCodeResponse;", "getGenerateClaimCode", "(Lcom/bpjstku/data/jht/model/request/GenerateClaimCodeRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface JhtApiClient {
    @POST("klaim/cek-data-ktp")
    deriveCodec<Response<JhtClaimSignaturedItem>> checkAdminDuk(@Body CheckAdminDukRequest p0);

    @POST("claim/account-bank-check")
    deriveCodec<Response<JhtClaimSignaturedItem>> checkBankAccountValidity(@Body CheckBankAccountRequest p0);

    @POST("informasi/bukti-bayar-claim")
    deriveCodec<Response<ClaimEvidenceJhtResponse>> checkClaimEvidenceJht(@Body ClaimEvidenceJhtRequest p0);

    @POST("klaim/cek-eligible")
    deriveCodec<Response<JhtEligibilityClaimItem>> checkEligibility(@Body CheckEligibilityRequest p0);

    @POST("claim/check-eligible")
    deriveCodec<Response<JhtClaimEligibilityResponse>> checkEligibilityClaim(@Body ClaimCheckEligibilityRequest p0);

    @POST("klaim/cek-foto")
    deriveCodec<Response<JhtClaimCheckPhotoResponse>> checkPhotoAdminDuk(@Body CheckPhotoAdminDukRequest p0);

    @POST("claim/check-bank-bpu-reactivation")
    deriveCodec<Response<ClaimCheckBankBpuReactivationResponse>> claimCheckBankBpuReactivation(@Body ClaimCheckBankBpuReactivationRequest p0);

    @POST("claim/get-list-not-reactivation")
    deriveCodec<Response<ClaimNotReactivationReason>> claimGetListReasonBpu();

    @POST("claim/claim-ekyc-liveness-end")
    deriveCodec<Response<ClaimLivenessResponse>> claimLivenessFaceMatch(@Body ClaimLivenessFaceMatchRequest p0);

    @POST("claim/claim-ekyc-liveness-begin")
    deriveCodec<Response<ClaimLivenessResponse>> claimLivenessFaceMatchCheck(@Body ClaimLivenessFaceMatchCheckRequest p0);

    @POST("claim/iuran-bpu-reactivation")
    deriveCodec<Response<ClaimReactivationBpuTuitionResponse>> getClaimBpuReactivationTuition(@Body ClaimReactivationBpuTuitionRequest p0);

    @POST("claim/layoff-doc-code")
    deriveCodec<Response<ClaimLayoffDocCodeResponse>> getClaimLayoffDocCode(@Body BaseRequest p0);

    @POST("claim/cause-of-claim")
    deriveCodec<Response<JhtClaimReasonResponse>> getClaimReason(@Body ClaimReasonRequest p0);

    @POST("claim/claim-segmen")
    deriveCodec<Response<ClaimSegmenResponse>> getClaimSegment(@Body ClaimSegmenRequest p0);

    @POST("claim/data-employee")
    deriveCodec<Response<JhtClaimEmployeeDataResponse>> getDataEmployeeData(@Body ClaimEmployeeDataRequest p0);

    @POST("claim/generate-kode-pengajuan")
    deriveCodec<Response<GenerateClaimCodeResponse>> getGenerateClaimCode(@Body GenerateClaimCodeRequest p0);

    @POST("claim/pra-new")
    deriveCodec<Response<InfoPraClaimResponse>> getInfoPraClaim(@Body InfoPraClaimRequest p0);

    @POST("program/jht/saldo")
    deriveCodec<Response<JhtBalanceResponse>> getJhtBalance(@Body JhtBalanceRequest p0);

    @POST("claim/contribution")
    deriveCodec<Response<JhtClaimContributionResponse>> getJhtClaimContributionDetail(@Body JhtClaimContributionRequest p0);

    @POST("program/jht/contribution")
    deriveCodec<Response<JhtContributionDetailResponse>> getJhtContributionDetail(@Body JhtContributionDetailRequest p0);

    @POST("program/jht/iuran")
    deriveCodec<Response<JhtSubscriptionResponse>> getJhtSubscriptions(@Body JhtSubscriptionRequest p0);

    @POST("program/jht/rsjht")
    deriveCodec<Response<ResponseBody>> getRsJht(@Body GetRsJhtRequest p0);

    @POST("claim/benefit-detail")
    deriveCodec<Response<JhtBenefitDetailResponse>> postBenefitDetail(@Body JhtBenefitDetailRequest p0);

    @POST("claim/face-match-liveness")
    @Multipart
    deriveCodec<Response<BaseItem>> postCheckLivenessBiometric(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1);

    @POST("klaim/face-liveness-verification-dukcapil")
    @Multipart
    deriveCodec<Response<BaseItem>> postDukcapilLivenessCheck(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1);

    @POST("klaim/face-liveness-verification-ktp")
    @Multipart
    deriveCodec<Response<BaseItem>> postIdlLivenessCheck(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2);

    @POST("klaim/simpan-klaim-jht")
    @Multipart
    deriveCodec<Response<BaseItem>> postJhtClaim(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4);

    @POST("claim/insert-claim-jht")
    deriveCodec<Response<BaseItem>> postJhtInstantClaim(@Body JhtInstantClaimRequest p0);

    @POST("klaim/face-liveness-verification-nodeflux")
    @Multipart
    VideoRecordEvent<Response<BaseItem>> postNodefluxLivenessCheck(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1);

    @POST("program/tracking-klaim")
    deriveCodec<Response<JhtClaimTrackItem>> postTrackClaim(@Body JhtClaimTrackRequest p0);

    @POST("program/kirim-rsjhtjp")
    deriveCodec<Response<BaseItem>> sendRsJht(@Body SendRsJhtRequest p0);
}
