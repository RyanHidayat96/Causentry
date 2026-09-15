package com.bpjstku.data.scholarship.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipHistoryListResponse;", "", "<init>", "()V", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipHistoryItem;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/scholarship/model/response/ScholarshipHistoryItem;", "getData", "()Lcom/bpjstku/data/scholarship/model/response/ScholarshipHistoryItem;", "setData", "(Lcom/bpjstku/data/scholarship/model/response/ScholarshipHistoryItem;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScholarshipHistoryListResponse {
    public static final int $stable = 8;

    @SerializedName("dataPenerima")
    private ScholarshipHistoryItem data;

    public final ScholarshipHistoryItem getData() {
        return this.data;
    }

    public final void setData(ScholarshipHistoryItem scholarshipHistoryItem) {
        this.data = scholarshipHistoryItem;
    }
}
