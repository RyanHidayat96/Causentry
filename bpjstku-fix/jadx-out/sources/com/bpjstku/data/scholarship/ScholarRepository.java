package com.bpjstku.data.scholarship;

import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEducationListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEligibleRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmBeginRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipHistoryRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipInfoRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipInsertRequest;
import com.bpjstku.data.scholarship.model.request.UpdateConfirmationRequest;
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
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\t\u0012\u00070\u001e¢\u0006\u0002\b\u001f0\u001c2\u0006\u0010!\u001a\u00020 H'¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\u0006\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0003\u001a\u00020)H'¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\u0006\u0010\u0003\u001a\u00020-H'¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u0002032\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020201H&¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020201H'¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u0002032\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b:\u0010;J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00042\u0006\u0010\u0003\u001a\u00020<H'¢\u0006\u0004\b>\u0010?ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/scholarship/ScholarRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipEducationListRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationResponse;", "getEducationList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipEducationListRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipHistoryRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipHistoryListResponse;", "getHistoryList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipHistoryRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitListRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitListResponse;", "getBenefitPersonList", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitListRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitResponse;", "getBenefitPerson", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;", "getEligible", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipInfoRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoResponse;", "getInfo", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipInfoRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p1", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipDocumentResponse;", "uploadProve", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipInsertRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertResponse;", "insertScholarship", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipInsertRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipVerificationResponse;", "facematchScholarship", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmRequest;)LderiveCodec;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmBeginRequest;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipFmResponse;", "facematchBeginScholarship", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmBeginRequest;)LderiveCodec;", "", "Lcom/bpjstku/domain/scholarship/model/ScholarPersonDetail;", "", "setScholarDetailList", "(Ljava/util/List;)V", "getScholarDetailList", "()Ljava/util/List;", "getEligibleResponse", "()Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;", "setEligibleResponse", "(Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;)V", "Lcom/bpjstku/data/scholarship/model/request/UpdateConfirmationRequest;", "Lcom/bpjstku/data/scholarship/model/response/ConfirmResponse;", "updateConfirmation", "(Lcom/bpjstku/data/scholarship/model/request/UpdateConfirmationRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ScholarRepository extends getChildrenOutConfigs {
    deriveCodec<ScholarshipFmResponse> facematchBeginScholarship(ScholarshipFmBeginRequest p0);

    deriveCodec<ScholarshipVerificationResponse> facematchScholarship(ScholarshipFmRequest p0);

    deriveCodec<ScholarshipBenefitResponse> getBenefitPerson(ScholarshipBenefitRequest p0);

    deriveCodec<ScholarshipBenefitListResponse> getBenefitPersonList(ScholarshipBenefitListRequest p0);

    deriveCodec<ScholarshipEducationResponse> getEducationList(ScholarshipEducationListRequest p0);

    deriveCodec<ScholarshipEligibleResponse> getEligible(ScholarshipEligibleRequest p0);

    ScholarshipEligibleResponse getEligibleResponse();

    deriveCodec<ScholarshipHistoryListResponse> getHistoryList(ScholarshipHistoryRequest p0);

    deriveCodec<ScholarshipInfoResponse> getInfo(ScholarshipInfoRequest p0);

    List<ScholarPersonDetail> getScholarDetailList();

    deriveCodec<ScholarshipInsertResponse> insertScholarship(ScholarshipInsertRequest p0);

    void setEligibleResponse(ScholarshipEligibleResponse p0);

    void setScholarDetailList(List<ScholarPersonDetail> p0);

    deriveCodec<ConfirmResponse> updateConfirmation(UpdateConfirmationRequest p0);

    deriveCodec<ScholarshipDocumentResponse> uploadProve(Map<String, RequestBody> p0, MultipartBody.Part p1);
}
