package com.bpjstku.data.complaint;

import com.bpjstku.data.complaint.model.request.ComplaintDetailRequest;
import com.bpjstku.data.complaint.model.request.ComplaintHistoryRequest;
import com.bpjstku.data.complaint.model.response.ComplaintDetailItem;
import com.bpjstku.data.complaint.model.response.ComplaintHistoryItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/complaint/ComplaintRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/complaint/model/request/ComplaintHistoryRequest;", "p0", "LderiveCodec;", "", "Lcom/bpjstku/data/complaint/model/response/ComplaintHistoryItem;", "getHistoryComplaint", "(Lcom/bpjstku/data/complaint/model/request/ComplaintHistoryRequest;)LderiveCodec;", "Lcom/bpjstku/data/complaint/model/request/ComplaintDetailRequest;", "Lcom/bpjstku/data/complaint/model/response/ComplaintDetailItem;", "getComplaintDetail", "(Lcom/bpjstku/data/complaint/model/request/ComplaintDetailRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ComplaintRepository extends getChildrenOutConfigs {
    deriveCodec<ComplaintDetailItem> getComplaintDetail(ComplaintDetailRequest p0);

    deriveCodec<List<ComplaintHistoryItem>> getHistoryComplaint(ComplaintHistoryRequest p0);
}
