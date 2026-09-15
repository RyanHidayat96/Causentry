package defpackage;

import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEducationListRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEligibleRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmBeginRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipHistoryRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipInsertRequest;
import com.bpjstku.data.scholarship.model.request.UpdateConfirmationRequest;
import com.bpjstku.data.scholarship.model.response.ConfirmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipDocumentResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducationListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEligibleResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipFmResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipInsertResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipVerificationResponse;
import com.bpjstku.domain.scholarship.model.ScholarBenefit;
import com.bpjstku.domain.scholarship.model.ScholarPerson;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ManagedActivityResultLauncher {
    deriveCodec<ScholarPersonDetail> TuitionPaymentFragmentbindingInflater1(ScholarshipBenefitRequest scholarshipBenefitRequest);

    deriveCodec<ScholarshipFmResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarshipFmBeginRequest scholarshipFmBeginRequest);

    deriveCodec<List<ScholarBenefit>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarshipHistoryRequest scholarshipHistoryRequest);

    ScholarshipEligibleResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    deriveCodec<ScholarshipInsertResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarshipInsertRequest scholarshipInsertRequest);

    List<ScholarPersonDetail> TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarshipEligibleResponse scholarshipEligibleResponse);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<ScholarPersonDetail> list);

    deriveCodec<List<ScholarPerson>> b(ScholarshipBenefitListRequest scholarshipBenefitListRequest);

    deriveCodec<List<ScholarshipEducationListResponse>> b(ScholarshipEducationListRequest scholarshipEducationListRequest);

    deriveCodec<ScholarshipEligibleResponse> b(ScholarshipEligibleRequest scholarshipEligibleRequest);

    deriveCodec<ConfirmResponse> b(UpdateConfirmationRequest updateConfirmationRequest);

    deriveCodec<ScholarshipDocumentResponse> b(File file, String str, PredictiveBackHandlerKt predictiveBackHandlerKt);

    deriveCodec<ScholarshipVerificationResponse> b(String str, ScholarshipFmRequest scholarshipFmRequest);
}
