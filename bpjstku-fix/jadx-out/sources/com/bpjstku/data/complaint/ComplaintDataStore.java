package com.bpjstku.data.complaint;

import com.bpjstku.data.complaint.model.request.ComplaintDetailRequest;
import com.bpjstku.data.complaint.model.request.ComplaintHistoryRequest;
import com.bpjstku.data.complaint.model.response.ComplaintDetailItem;
import com.bpjstku.data.complaint.model.response.ComplaintDetailResponse;
import com.bpjstku.data.complaint.model.response.ComplaintHistoryItem;
import com.bpjstku.data.complaint.model.response.ComplaintHistoryResponse;
import com.bpjstku.data.complaint.remote.ComplaintApi;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/bpjstku/data/complaint/ComplaintDataStore;", "Lcom/bpjstku/data/complaint/ComplaintRepository;", "Lcom/bpjstku/data/complaint/remote/ComplaintApi;", "p0", "<init>", "(Lcom/bpjstku/data/complaint/remote/ComplaintApi;)V", "Lcom/bpjstku/data/complaint/model/request/ComplaintHistoryRequest;", "LderiveCodec;", "", "Lcom/bpjstku/data/complaint/model/response/ComplaintHistoryItem;", "getHistoryComplaint", "(Lcom/bpjstku/data/complaint/model/request/ComplaintHistoryRequest;)LderiveCodec;", "Lcom/bpjstku/data/complaint/model/request/ComplaintDetailRequest;", "Lcom/bpjstku/data/complaint/model/response/ComplaintDetailItem;", "getComplaintDetail", "(Lcom/bpjstku/data/complaint/model/request/ComplaintDetailRequest;)LderiveCodec;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;", "webService", "Lcom/bpjstku/data/complaint/remote/ComplaintApi;", "getWebService", "()Lcom/bpjstku/data/complaint/remote/ComplaintApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComplaintDataStore implements ComplaintRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final ComplaintApi webService;

    public ComplaintDataStore(ComplaintApi complaintApi) {
        Intrinsics.checkNotNullParameter(complaintApi, "");
        this.webService = complaintApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7586getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    public final Void getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final ComplaintApi m7587getWebService() {
        return this.webService;
    }

    @Override // com.bpjstku.data.complaint.ComplaintRepository
    public final deriveCodec<List<ComplaintHistoryItem>> getHistoryComplaint(ComplaintHistoryRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ComplaintHistoryResponse>> historyComplaint = m7587getWebService().getHistoryComplaint(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(historyComplaint, unbindVar);
        final ComplaintDataStore$$ExternalSyntheticLambda2 complaintDataStore$$ExternalSyntheticLambda2 = new ComplaintDataStore$$ExternalSyntheticLambda2();
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.complaint.ComplaintDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ComplaintDataStore.getHistoryComplaint$lambda$1(complaintDataStore$$ExternalSyntheticLambda2, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getHistoryComplaint$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getHistoryComplaint$lambda$0(ComplaintHistoryResponse complaintHistoryResponse) {
        Intrinsics.checkNotNullParameter(complaintHistoryResponse, "");
        return complaintHistoryResponse.getData();
    }

    @Override // com.bpjstku.data.complaint.ComplaintRepository
    public final deriveCodec<ComplaintDetailItem> getComplaintDetail(ComplaintDetailRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ComplaintDetailResponse>> complaintDetail = m7587getWebService().getComplaintDetail(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(complaintDetail, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.complaint.ComplaintDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComplaintDataStore.getComplaintDetail$lambda$2((ComplaintDetailResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.complaint.ComplaintDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ComplaintDataStore.getComplaintDetail$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComplaintDetailItem getComplaintDetail$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ComplaintDetailItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComplaintDetailItem getComplaintDetail$lambda$2(ComplaintDetailResponse complaintDetailResponse) {
        Intrinsics.checkNotNullParameter(complaintDetailResponse, "");
        return complaintDetailResponse.getData();
    }
}
