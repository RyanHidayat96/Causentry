package defpackage;

import com.bpjstku.data.tuition.model.request.BpuOneMonthTuitionRequest;
import com.bpjstku.data.tuition.model.request.PaymentHistoryRequest;
import com.bpjstku.data.tuition.model.request.TuitionPaymentRequest;
import com.bpjstku.data.tuition.model.response.PaymentHistoryResponse;
import com.bpjstku.domain.tuition.model.BpuCheckPaymentItem;
import com.bpjstku.domain.tuition.model.BpuTuitionOneMonth;

/* JADX INFO: loaded from: classes3.dex */
public interface ActivityResult {
    deriveCodec<BpuTuitionOneMonth> TuitionPaymentFragmentbindingInflater1(BpuOneMonthTuitionRequest bpuOneMonthTuitionRequest);

    deriveCodec<PaymentHistoryResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentHistoryRequest paymentHistoryRequest);

    deriveCodec<BpuCheckPaymentItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentRequest tuitionPaymentRequest);

    deriveCodec<BpuCheckPaymentItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentRequest tuitionPaymentRequest);

    deriveCodec<BpuCheckPaymentItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentRequest tuitionPaymentRequest);
}
