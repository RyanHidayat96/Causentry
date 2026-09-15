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
import defpackage.unbindChildren;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\b0\u00072\u0006\u0010\u0003\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b0\u00072\u0006\u0010\u0003\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\b0\u00072\u0006\u0010\u0003\u001a\u00020(H\u0017¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\b0\u00072\u0006\u0010\u0003\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\b0\u00072\u0006\u0010\u0003\u001a\u000200H\u0017¢\u0006\u0004\b1\u00102J#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\b0\u00072\u0006\u0010\u0003\u001a\u000203H\u0017¢\u0006\u0004\b5\u00106J#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\b0\u00072\u0006\u0010\u0003\u001a\u000207H\u0017¢\u0006\u0004\b9\u0010:J#\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\b0\u00072\u0006\u0010\u0003\u001a\u00020;H\u0017¢\u0006\u0004\b=\u0010>J#\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\b0\u00072\u0006\u0010\u0003\u001a\u00020?H\u0017¢\u0006\u0004\bA\u0010BJ\u001b\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\b0\u0007H\u0017¢\u0006\u0004\bD\u0010EJ#\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\b0\u00072\u0006\u0010\u0003\u001a\u00020FH\u0017¢\u0006\u0004\bH\u0010IJ#\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\b0\u00072\u0006\u0010\u0003\u001a\u00020JH\u0017¢\u0006\u0004\bL\u0010MJ#\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\b0\u00072\u0006\u0010\u0003\u001a\u00020NH\u0017¢\u0006\u0004\bP\u0010QJ#\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\b0\u00072\u0006\u0010\u0003\u001a\u00020RH\u0017¢\u0006\u0004\bT\u0010UJ9\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020X\u0018\u00010V2\u0006\u0010Z\u001a\u00020YH\u0017¢\u0006\u0004\b[\u0010\\J9\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0]2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020X\u0018\u00010V2\u0006\u0010Z\u001a\u00020YH\u0017¢\u0006\u0004\b^\u0010_JL\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020W\u0012\t\u0012\u00070X¢\u0006\u0002\b`\u0018\u00010V2\b\b\u0001\u0010Z\u001a\u00020Y2\b\b\u0001\u0010a\u001a\u00020YH\u0017¢\u0006\u0004\bb\u0010cJ#\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\b0\u00072\u0006\u0010\u0003\u001a\u00020dH\u0017¢\u0006\u0004\be\u0010fJh\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020W\u0012\t\u0012\u00070X¢\u0006\u0002\b`\u0018\u00010V2\n\b\u0001\u0010Z\u001a\u0004\u0018\u00010Y2\n\b\u0001\u0010a\u001a\u0004\u0018\u00010Y2\n\b\u0001\u0010g\u001a\u0004\u0018\u00010Y2\n\b\u0001\u0010h\u001a\u0004\u0018\u00010YH\u0017¢\u0006\u0004\bi\u0010jJ#\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\u0006\u0010\u0003\u001a\u00020kH\u0017¢\u0006\u0004\bl\u0010mJ#\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\b0\u00072\u0006\u0010\u0003\u001a\u00020nH\u0017¢\u0006\u0004\bp\u0010qJ#\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0\b0\u00072\u0006\u0010\u0003\u001a\u00020rH\u0017¢\u0006\u0004\bt\u0010uJ9\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020X\u0018\u00010V2\u0006\u0010Z\u001a\u00020YH\u0017¢\u0006\u0004\bv\u0010\\J#\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020x0\b0\u00072\u0006\u0010\u0003\u001a\u00020wH\u0017¢\u0006\u0004\by\u0010zJ#\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020|0\b0\u00072\u0006\u0010\u0003\u001a\u00020{H\u0017¢\u0006\u0004\b}\u0010~R\u0015\u0010\u007f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001"}, d2 = {"Lcom/bpjstku/data/jht/remote/JhtApi;", "LunbindChildren;", "Lcom/bpjstku/data/jht/remote/JhtApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/jht/remote/JhtApiClient;)V", "Lcom/bpjstku/data/jht/model/request/JhtBalanceRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/jht/model/response/JhtBalanceResponse;", "getJhtBalance", "(Lcom/bpjstku/data/jht/model/request/JhtBalanceRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtSubscriptionRequest;", "Lcom/bpjstku/data/jht/model/response/JhtSubscriptionResponse;", "getJhtSubscriptions", "(Lcom/bpjstku/data/jht/model/request/JhtSubscriptionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/GetRsJhtRequest;", "Lokhttp3/ResponseBody;", "getRsJht", "(Lcom/bpjstku/data/jht/model/request/GetRsJhtRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/SendRsJhtRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "sendRsJht", "(Lcom/bpjstku/data/jht/model/request/SendRsJhtRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckEligibilityRequest;", "Lcom/bpjstku/data/jht/model/response/JhtEligibilityClaimItem;", "checkEligibility", "(Lcom/bpjstku/data/jht/model/request/CheckEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimReasonRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimReasonResponse;", "getClaimReason", "(Lcom/bpjstku/data/jht/model/request/ClaimReasonRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/InfoPraClaimRequest;", "Lcom/bpjstku/data/jht/model/response/InfoPraClaimResponse;", "getInfoPraClaim", "(Lcom/bpjstku/data/jht/model/request/InfoPraClaimRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtContributionDetailRequest;", "Lcom/bpjstku/data/jht/model/response/JhtContributionDetailResponse;", "getJhtContributionDetail", "(Lcom/bpjstku/data/jht/model/request/JhtContributionDetailRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtClaimContributionRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimContributionResponse;", "getJhtClaimContributionDetail", "(Lcom/bpjstku/data/jht/model/request/JhtClaimContributionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchCheckRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimLivenessResponse;", "claimLivenessFaceMatchCheck", "(Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchCheckRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchRequest;", "claimLivenessFaceMatch", "(Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimSegmenRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimSegmenResponse;", "getClaimSegment", "(Lcom/bpjstku/data/jht/model/request/ClaimSegmenRequest;)LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimLayoffDocCodeResponse;", "getClaimLayoffDocCode", "(Lcom/bpjstku/data/lib/model/BaseRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimReactivationBpuTuitionRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimReactivationBpuTuitionResponse;", "getClaimBpuReactivationTuition", "(Lcom/bpjstku/data/jht/model/request/ClaimReactivationBpuTuitionRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimCheckBankBpuReactivationRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimCheckBankBpuReactivationResponse;", "claimCheckBankBpuReactivation", "(Lcom/bpjstku/data/jht/model/request/ClaimCheckBankBpuReactivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/response/ClaimNotReactivationReason;", "claimGetListReasonBpu", "()LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/GenerateClaimCodeRequest;", "Lcom/bpjstku/data/jht/model/response/GenerateClaimCodeResponse;", "getGenerateClaimCode", "(Lcom/bpjstku/data/jht/model/request/GenerateClaimCodeRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckAdminDukRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimSignaturedItem;", "checkAdminDuk", "(Lcom/bpjstku/data/jht/model/request/CheckAdminDukRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckPhotoAdminDukRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimCheckPhotoResponse;", "checkPhotoAdminDuk", "(Lcom/bpjstku/data/jht/model/request/CheckPhotoAdminDukRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimEvidenceJhtRequest;", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtResponse;", "checkClaimEvidenceJht", "(Lcom/bpjstku/data/jht/model/request/ClaimEvidenceJhtRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lokhttp3/MultipartBody$Part;", "p1", "postDukcapilLivenessCheck", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "LVideoRecordEvent;", "postNodefluxLivenessCheck", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LVideoRecordEvent;", "Lkotlin/jvm/JvmSuppressWildcards;", "p2", "postIdlLivenessCheck", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/CheckBankAccountRequest;", "checkBankAccountValidity", "(Lcom/bpjstku/data/jht/model/request/CheckBankAccountRequest;)LderiveCodec;", "p3", "p4", "postJhtClaim", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtInstantClaimRequest;", "postJhtInstantClaim", "(Lcom/bpjstku/data/jht/model/request/JhtInstantClaimRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtClaimTrackRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimTrackItem;", "postTrackClaim", "(Lcom/bpjstku/data/jht/model/request/JhtClaimTrackRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/JhtBenefitDetailRequest;", "Lcom/bpjstku/data/jht/model/response/JhtBenefitDetailResponse;", "postBenefitDetail", "(Lcom/bpjstku/data/jht/model/request/JhtBenefitDetailRequest;)LderiveCodec;", "postCheckLivenessBiometric", "Lcom/bpjstku/data/jht/model/request/ClaimCheckEligibilityRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityResponse;", "checkEligibilityClaim", "(Lcom/bpjstku/data/jht/model/request/ClaimCheckEligibilityRequest;)LderiveCodec;", "Lcom/bpjstku/data/jht/model/request/ClaimEmployeeDataRequest;", "Lcom/bpjstku/data/jht/model/response/JhtClaimEmployeeDataResponse;", "getDataEmployeeData", "(Lcom/bpjstku/data/jht/model/request/ClaimEmployeeDataRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/jht/remote/JhtApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JhtApi implements unbindChildren, JhtApiClient {
    public static final int $stable = 8;
    private final JhtApiClient apiClient;

    public JhtApi(JhtApiClient jhtApiClient) {
        Intrinsics.checkNotNullParameter(jhtApiClient, "");
        this.apiClient = jhtApiClient;
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtBalanceResponse>> getJhtBalance(JhtBalanceRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getJhtBalance(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtSubscriptionResponse>> getJhtSubscriptions(JhtSubscriptionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getJhtSubscriptions(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<ResponseBody>> getRsJht(GetRsJhtRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getRsJht(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<BaseItem>> sendRsJht(SendRsJhtRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.sendRsJht(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtEligibilityClaimItem>> checkEligibility(CheckEligibilityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkEligibility(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtClaimReasonResponse>> getClaimReason(ClaimReasonRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getClaimReason(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<InfoPraClaimResponse>> getInfoPraClaim(InfoPraClaimRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getInfoPraClaim(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtContributionDetailResponse>> getJhtContributionDetail(JhtContributionDetailRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getJhtContributionDetail(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtClaimContributionResponse>> getJhtClaimContributionDetail(JhtClaimContributionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getJhtClaimContributionDetail(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<ClaimLivenessResponse>> claimLivenessFaceMatchCheck(ClaimLivenessFaceMatchCheckRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.claimLivenessFaceMatchCheck(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<ClaimLivenessResponse>> claimLivenessFaceMatch(ClaimLivenessFaceMatchRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.claimLivenessFaceMatch(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<ClaimSegmenResponse>> getClaimSegment(ClaimSegmenRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getClaimSegment(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<ClaimLayoffDocCodeResponse>> getClaimLayoffDocCode(BaseRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getClaimLayoffDocCode(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<ClaimReactivationBpuTuitionResponse>> getClaimBpuReactivationTuition(ClaimReactivationBpuTuitionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getClaimBpuReactivationTuition(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<ClaimCheckBankBpuReactivationResponse>> claimCheckBankBpuReactivation(ClaimCheckBankBpuReactivationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.claimCheckBankBpuReactivation(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<ClaimNotReactivationReason>> claimGetListReasonBpu() {
        return this.apiClient.claimGetListReasonBpu();
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<GenerateClaimCodeResponse>> getGenerateClaimCode(GenerateClaimCodeRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getGenerateClaimCode(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtClaimSignaturedItem>> checkAdminDuk(CheckAdminDukRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkAdminDuk(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtClaimCheckPhotoResponse>> checkPhotoAdminDuk(CheckPhotoAdminDukRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkPhotoAdminDuk(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<ClaimEvidenceJhtResponse>> checkClaimEvidenceJht(ClaimEvidenceJhtRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkClaimEvidenceJht(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<BaseItem>> postDukcapilLivenessCheck(Map<String, ? extends RequestBody> p0, MultipartBody.Part p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postDukcapilLivenessCheck(p0, p1);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final VideoRecordEvent<Response<BaseItem>> postNodefluxLivenessCheck(Map<String, ? extends RequestBody> p0, MultipartBody.Part p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postNodefluxLivenessCheck(p0, p1);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<BaseItem>> postIdlLivenessCheck(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return this.apiClient.postIdlLivenessCheck(p0, p1, p2);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtClaimSignaturedItem>> checkBankAccountValidity(CheckBankAccountRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkBankAccountValidity(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<BaseItem>> postJhtClaim(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4) {
        return this.apiClient.postJhtClaim(p0, p1, p2, p3, p4);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<BaseItem>> postJhtInstantClaim(JhtInstantClaimRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postJhtInstantClaim(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtClaimTrackItem>> postTrackClaim(JhtClaimTrackRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postTrackClaim(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtBenefitDetailResponse>> postBenefitDetail(JhtBenefitDetailRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postBenefitDetail(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<BaseItem>> postCheckLivenessBiometric(Map<String, ? extends RequestBody> p0, MultipartBody.Part p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postCheckLivenessBiometric(p0, p1);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtClaimEligibilityResponse>> checkEligibilityClaim(ClaimCheckEligibilityRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkEligibilityClaim(p0);
    }

    @Override // com.bpjstku.data.jht.remote.JhtApiClient
    public final deriveCodec<Response<JhtClaimEmployeeDataResponse>> getDataEmployeeData(ClaimEmployeeDataRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getDataEmployeeData(p0);
    }
}
