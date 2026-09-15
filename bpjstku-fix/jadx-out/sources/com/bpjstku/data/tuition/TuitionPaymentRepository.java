package com.bpjstku.data.tuition;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.tuition.model.request.BpuOneMonthTuitionRequest;
import com.bpjstku.data.tuition.model.request.CallbackPaymentTuitionMidtransRequest;
import com.bpjstku.data.tuition.model.request.PaymentHistoryRequest;
import com.bpjstku.data.tuition.model.request.TuitionPaymentRequest;
import com.bpjstku.data.tuition.model.response.BpuOneMonthTuitionResponse;
import com.bpjstku.data.tuition.model.response.BpuPaymentStatusItem;
import com.bpjstku.data.tuition.model.response.PaymentHistoryResponse;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0003\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/tuition/TuitionPaymentRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/tuition/model/request/TuitionPaymentRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/tuition/model/response/BpuPaymentStatusItem;", "getTuitionPayment", "(Lcom/bpjstku/data/tuition/model/request/TuitionPaymentRequest;)LderiveCodec;", "checkBpuPaymentStatus", "Lcom/bpjstku/data/tuition/model/request/PaymentHistoryRequest;", "Lcom/bpjstku/data/tuition/model/response/PaymentHistoryResponse;", "getPaymentHistory", "(Lcom/bpjstku/data/tuition/model/request/PaymentHistoryRequest;)LderiveCodec;", "Lcom/bpjstku/data/tuition/model/request/CallbackPaymentTuitionMidtransRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "callbackPaymentTuitionMidtransRequest", "(Lcom/bpjstku/data/tuition/model/request/CallbackPaymentTuitionMidtransRequest;)LderiveCodec;", "Lcom/bpjstku/data/tuition/model/request/BpuOneMonthTuitionRequest;", "Lcom/bpjstku/data/tuition/model/response/BpuOneMonthTuitionResponse;", "checkBpuOneMonth", "(Lcom/bpjstku/data/tuition/model/request/BpuOneMonthTuitionRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface TuitionPaymentRepository extends getChildrenOutConfigs {
    deriveCodec<BaseItem> callbackPaymentTuitionMidtransRequest(CallbackPaymentTuitionMidtransRequest p0);

    deriveCodec<BpuOneMonthTuitionResponse> checkBpuOneMonth(BpuOneMonthTuitionRequest p0);

    deriveCodec<BpuPaymentStatusItem> checkBpuPaymentStatus(TuitionPaymentRequest p0);

    deriveCodec<PaymentHistoryResponse> getPaymentHistory(PaymentHistoryRequest p0);

    deriveCodec<BpuPaymentStatusItem> getTuitionPayment(TuitionPaymentRequest p0);
}
