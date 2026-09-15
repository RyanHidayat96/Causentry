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
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\u0006\u0010\u0003\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/bpjstku/data/tuition/remote/TuitionPaymentApi;", "LunbindChildren;", "Lcom/bpjstku/data/tuition/remote/TuitionPaymentApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/tuition/remote/TuitionPaymentApiClient;)V", "Lcom/bpjstku/data/tuition/model/request/TuitionPaymentRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/tuition/model/response/BpuPaymentStatusItem;", "getTuitionPayment", "(Lcom/bpjstku/data/tuition/model/request/TuitionPaymentRequest;)LderiveCodec;", "checkBpuPaymentStatus", "Lcom/bpjstku/data/tuition/model/request/BpuOneMonthTuitionRequest;", "Lcom/bpjstku/data/tuition/model/response/BpuOneMonthTuitionResponse;", "checkBpuOneMonth", "(Lcom/bpjstku/data/tuition/model/request/BpuOneMonthTuitionRequest;)LderiveCodec;", "Lcom/bpjstku/data/tuition/model/request/PaymentHistoryRequest;", "Lcom/bpjstku/data/tuition/model/response/PaymentHistoryResponse;", "getPaymentHistory", "(Lcom/bpjstku/data/tuition/model/request/PaymentHistoryRequest;)LderiveCodec;", "Lcom/bpjstku/data/tuition/model/request/CallbackPaymentTuitionMidtransRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "callbackPaymentTuitionMidtrans", "(Lcom/bpjstku/data/tuition/model/request/CallbackPaymentTuitionMidtransRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/tuition/remote/TuitionPaymentApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TuitionPaymentApi implements unbindChildren, TuitionPaymentApiClient {
    public static final int $stable = 8;
    private final TuitionPaymentApiClient apiClient;

    public TuitionPaymentApi(TuitionPaymentApiClient tuitionPaymentApiClient) {
        Intrinsics.checkNotNullParameter(tuitionPaymentApiClient, "");
        this.apiClient = tuitionPaymentApiClient;
    }

    @Override // com.bpjstku.data.tuition.remote.TuitionPaymentApiClient
    public final deriveCodec<Response<BpuPaymentStatusItem>> getTuitionPayment(TuitionPaymentRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getTuitionPayment(p0);
    }

    @Override // com.bpjstku.data.tuition.remote.TuitionPaymentApiClient
    public final deriveCodec<Response<BpuPaymentStatusItem>> checkBpuPaymentStatus(TuitionPaymentRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkBpuPaymentStatus(p0);
    }

    @Override // com.bpjstku.data.tuition.remote.TuitionPaymentApiClient
    public final deriveCodec<Response<BpuOneMonthTuitionResponse>> checkBpuOneMonth(BpuOneMonthTuitionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkBpuOneMonth(p0);
    }

    @Override // com.bpjstku.data.tuition.remote.TuitionPaymentApiClient
    public final deriveCodec<Response<PaymentHistoryResponse>> getPaymentHistory(PaymentHistoryRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getPaymentHistory(p0);
    }

    @Override // com.bpjstku.data.tuition.remote.TuitionPaymentApiClient
    public final deriveCodec<Response<BaseItem>> callbackPaymentTuitionMidtrans(CallbackPaymentTuitionMidtransRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.callbackPaymentTuitionMidtrans(p0);
    }
}
