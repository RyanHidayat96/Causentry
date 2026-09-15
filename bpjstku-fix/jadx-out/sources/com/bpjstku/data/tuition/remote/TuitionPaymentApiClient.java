package com.bpjstku.data.tuition.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.tuition.model.request.BpuOneMonthTuitionRequest;
import com.bpjstku.data.tuition.model.request.CallbackPaymentTuitionMidtransRequest;
import com.bpjstku.data.tuition.model.request.PaymentHistoryRequest;
import com.bpjstku.data.tuition.model.request.TuitionPaymentRequest;
import com.bpjstku.data.tuition.model.response.BpuOneMonthTuitionResponse;
import com.bpjstku.data.tuition.model.response.BpuPaymentStatusItem;
import com.bpjstku.data.tuition.model.response.PaymentHistoryResponse;
import defpackage.deriveCodec;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\bJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/tuition/remote/TuitionPaymentApiClient;", "", "Lcom/bpjstku/data/tuition/model/request/TuitionPaymentRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/tuition/model/response/BpuPaymentStatusItem;", "getTuitionPayment", "(Lcom/bpjstku/data/tuition/model/request/TuitionPaymentRequest;)LderiveCodec;", "checkBpuPaymentStatus", "Lcom/bpjstku/data/tuition/model/request/BpuOneMonthTuitionRequest;", "Lcom/bpjstku/data/tuition/model/response/BpuOneMonthTuitionResponse;", "checkBpuOneMonth", "(Lcom/bpjstku/data/tuition/model/request/BpuOneMonthTuitionRequest;)LderiveCodec;", "Lcom/bpjstku/data/tuition/model/request/PaymentHistoryRequest;", "Lcom/bpjstku/data/tuition/model/response/PaymentHistoryResponse;", "getPaymentHistory", "(Lcom/bpjstku/data/tuition/model/request/PaymentHistoryRequest;)LderiveCodec;", "Lcom/bpjstku/data/tuition/model/request/CallbackPaymentTuitionMidtransRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "callbackPaymentTuitionMidtrans", "(Lcom/bpjstku/data/tuition/model/request/CallbackPaymentTuitionMidtransRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface TuitionPaymentApiClient {
    @POST("payment/transactions/callback")
    deriveCodec<Response<BaseItem>> callbackPaymentTuitionMidtrans(@Body CallbackPaymentTuitionMidtransRequest p0);

    @POST("iuran/bpu/hitung-iuran")
    deriveCodec<Response<BpuOneMonthTuitionResponse>> checkBpuOneMonth(@Body BpuOneMonthTuitionRequest p0);

    @POST("iuran/bpu/check")
    deriveCodec<Response<BpuPaymentStatusItem>> checkBpuPaymentStatus(@Body TuitionPaymentRequest p0);

    @POST("payment/transactions/history")
    deriveCodec<Response<PaymentHistoryResponse>> getPaymentHistory(@Body PaymentHistoryRequest p0);

    @POST("iuran/bpu/generate-iuran")
    deriveCodec<Response<BpuPaymentStatusItem>> getTuitionPayment(@Body TuitionPaymentRequest p0);
}
