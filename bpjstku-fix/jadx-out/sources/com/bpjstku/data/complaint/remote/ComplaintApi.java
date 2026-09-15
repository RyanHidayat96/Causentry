package com.bpjstku.data.complaint.remote;

import com.bpjstku.data.complaint.model.request.ComplaintDetailRequest;
import com.bpjstku.data.complaint.model.request.ComplaintHistoryRequest;
import com.bpjstku.data.complaint.model.response.ComplaintDetailResponse;
import com.bpjstku.data.complaint.model.response.ComplaintHistoryResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/complaint/remote/ComplaintApi;", "LunbindChildren;", "Lcom/bpjstku/data/complaint/remote/ComplaintApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/complaint/remote/ComplaintApiClient;)V", "Lcom/bpjstku/data/complaint/model/request/ComplaintHistoryRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/complaint/model/response/ComplaintHistoryResponse;", "getHistoryComplaint", "(Lcom/bpjstku/data/complaint/model/request/ComplaintHistoryRequest;)LderiveCodec;", "Lcom/bpjstku/data/complaint/model/request/ComplaintDetailRequest;", "Lcom/bpjstku/data/complaint/model/response/ComplaintDetailResponse;", "getComplaintDetail", "(Lcom/bpjstku/data/complaint/model/request/ComplaintDetailRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/complaint/remote/ComplaintApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComplaintApi implements unbindChildren, ComplaintApiClient {
    public static final int $stable = 8;
    private final ComplaintApiClient apiClient;

    public ComplaintApi(ComplaintApiClient complaintApiClient) {
        Intrinsics.checkNotNullParameter(complaintApiClient, "");
        this.apiClient = complaintApiClient;
    }

    @Override // com.bpjstku.data.complaint.remote.ComplaintApiClient
    public final deriveCodec<Response<ComplaintHistoryResponse>> getHistoryComplaint(ComplaintHistoryRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getHistoryComplaint(p0);
    }

    @Override // com.bpjstku.data.complaint.remote.ComplaintApiClient
    public final deriveCodec<Response<ComplaintDetailResponse>> getComplaintDetail(ComplaintDetailRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getComplaintDetail(p0);
    }
}
