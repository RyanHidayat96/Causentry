package com.bpjstku.data.scholarship.remote;

import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEducationListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEligibleRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmBeginRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipHistoryRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipInfoRequest;
import com.bpjstku.data.scholarship.model.response.ConfirmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipDocumentResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducationResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEligibleResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipFmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipHistoryListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipInfoResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipInsertResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipVerificationResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\b0\u00072\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\t\u0012\u00070\"¢\u0006\u0002\b#0 2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b'\u0010(J\u0080\u0001\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\b0\u00072\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020!\u0012\t\u0012\u00070\"¢\u0006\u0002\b#\u0018\u00010 2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010,\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010-\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b/\u00100J\\\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\b0\u00072\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u00020!\u0012\t\u0012\u00070\"¢\u0006\u0002\b#\u0018\u00010 2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b2\u00103J#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\b0\u00072\u0006\u0010\u0003\u001a\u000204H\u0017¢\u0006\u0004\b6\u00107J\u0083\u0001\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\b0\u00072\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\"2\u0006\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$H\u0017¢\u0006\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010B"}, d2 = {"Lcom/bpjstku/data/scholarship/remote/ScholarApi;", "LunbindChildren;", "Lcom/bpjstku/data/scholarship/remote/ScholarApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/scholarship/remote/ScholarApiClient;)V", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipEducationListRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationResponse;", "getEducationList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipEducationListRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipHistoryRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipHistoryListResponse;", "getHistoryList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipHistoryRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitListRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitListResponse;", "getBenefitPersonList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitListRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitResponse;", "getBenefitPerson", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;", "getEligible", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipInfoRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoResponse;", "getInfo", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipInfoRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p1", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipDocumentResponse;", "uploadProve", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "p2", "p3", "p4", "p5", "p6", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertResponse;", "insertScholarship", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipVerificationResponse;", "facematchScholarship", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmBeginRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipFmResponse;", "facematchBeginScholarship", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmBeginRequest;)LderiveCodec;", "p7", "p8", "p9", "p10", "p11", "p12", "Lcom/bpjstku/data/scholarship/model/response/ConfirmResponse;", "updateKonfirmasi", "(Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/scholarship/remote/ScholarApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScholarApi implements unbindChildren, ScholarApiClient {
    public static final int $stable = 8;
    private final ScholarApiClient apiClient;

    public ScholarApi(ScholarApiClient scholarApiClient) {
        Intrinsics.checkNotNullParameter(scholarApiClient, "");
        this.apiClient = scholarApiClient;
    }

    @Override // com.bpjstku.data.scholarship.remote.ScholarApiClient
    public final deriveCodec<Response<ScholarshipEducationResponse>> getEducationList(ScholarshipEducationListRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getEducationList(p0);
    }

    @Override // com.bpjstku.data.scholarship.remote.ScholarApiClient
    public final deriveCodec<Response<ScholarshipHistoryListResponse>> getHistoryList(ScholarshipHistoryRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getHistoryList(p0);
    }

    @Override // com.bpjstku.data.scholarship.remote.ScholarApiClient
    public final deriveCodec<Response<ScholarshipBenefitListResponse>> getBenefitPersonList(ScholarshipBenefitListRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBenefitPersonList(p0);
    }

    @Override // com.bpjstku.data.scholarship.remote.ScholarApiClient
    public final deriveCodec<Response<ScholarshipBenefitResponse>> getBenefitPerson(ScholarshipBenefitRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBenefitPerson(p0);
    }

    @Override // com.bpjstku.data.scholarship.remote.ScholarApiClient
    public final deriveCodec<Response<ScholarshipEligibleResponse>> getEligible(ScholarshipEligibleRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getEligible(p0);
    }

    @Override // com.bpjstku.data.scholarship.remote.ScholarApiClient
    public final deriveCodec<Response<ScholarshipInfoResponse>> getInfo(ScholarshipInfoRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getInfo(p0);
    }

    @Override // com.bpjstku.data.scholarship.remote.ScholarApiClient
    public final deriveCodec<Response<ScholarshipDocumentResponse>> uploadProve(Map<String, RequestBody> p0, MultipartBody.Part p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.uploadProve(p0, p1);
    }

    @Override // com.bpjstku.data.scholarship.remote.ScholarApiClient
    public final deriveCodec<Response<ScholarshipInsertResponse>> insertScholarship(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3, @Part MultipartBody.Part p4, @Part MultipartBody.Part p5, @Part MultipartBody.Part p6) {
        return this.apiClient.insertScholarship(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // com.bpjstku.data.scholarship.remote.ScholarApiClient
    public final deriveCodec<Response<ScholarshipVerificationResponse>> facematchScholarship(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1, @Part MultipartBody.Part p2, @Part MultipartBody.Part p3) {
        return this.apiClient.facematchScholarship(p0, p1, p2, p3);
    }

    @Override // com.bpjstku.data.scholarship.remote.ScholarApiClient
    public final deriveCodec<Response<ScholarshipFmResponse>> facematchBeginScholarship(ScholarshipFmBeginRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.facematchBeginScholarship(p0);
    }

    @Override // com.bpjstku.data.scholarship.remote.ScholarApiClient
    public final deriveCodec<Response<ConfirmResponse>> updateKonfirmasi(RequestBody p0, RequestBody p1, RequestBody p2, RequestBody p3, RequestBody p4, RequestBody p5, RequestBody p6, RequestBody p7, RequestBody p8, RequestBody p9, MultipartBody.Part p10, MultipartBody.Part p11, MultipartBody.Part p12) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        return this.apiClient.updateKonfirmasi(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
    }
}
