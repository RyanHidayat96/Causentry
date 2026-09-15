package defpackage;

import com.bpjstku.data.jp.model.request.CheckEligibilityJpRequest;
import com.bpjstku.data.jp.model.request.GetCountClaimJpRequest;
import com.bpjstku.data.jp.model.request.GetJpBenefitRequest;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessBegin;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessEnd;
import com.bpjstku.data.jp.model.response.JpVerificationResponse;
import com.bpjstku.domain.jp.model.CheckEligibleJp;
import com.bpjstku.domain.jp.model.GetCountClaimJp;

/* JADX INFO: loaded from: classes3.dex */
public interface ComponentActivityReportFullyDrawnExecutorImpl {
    deriveCodec<activityDestroyed> TuitionPaymentFragmentbindingInflater1(GetJpBenefitRequest getJpBenefitRequest);

    deriveCodec<JpVerificationResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault2(JpVerificationLivenessBegin jpVerificationLivenessBegin);

    deriveCodec<GetCountClaimJp> TuitionPaymentFragmentspecialinlinedviewModeldefault3(GetCountClaimJpRequest getCountClaimJpRequest);

    CheckEligibleJp b();

    deriveCodec<CheckEligibleJp> b(CheckEligibilityJpRequest checkEligibilityJpRequest);

    deriveCodec<JpVerificationResponse> b(JpVerificationLivenessEnd jpVerificationLivenessEnd);
}
