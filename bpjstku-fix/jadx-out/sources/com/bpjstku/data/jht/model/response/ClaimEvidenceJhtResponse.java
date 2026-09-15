package com.bpjstku.data.jht.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;)Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isEvidence", "Ljava/lang/String;", "messageCode", "getMessageCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClaimEvidenceJhtResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final ClaimEvidenceJhtItem data;

    @SerializedName("isEvidence")
    private final String isEvidence;

    @SerializedName("messageCode")
    private final String messageCode;

    public final String isEvidence() {
        return this.isEvidence;
    }

    public final String getMessageCode() {
        return this.messageCode;
    }

    public final ClaimEvidenceJhtItem getData() {
        return this.data;
    }

    public ClaimEvidenceJhtResponse(String str, String str2, ClaimEvidenceJhtItem claimEvidenceJhtItem) {
        this.isEvidence = str;
        this.messageCode = str2;
        this.data = claimEvidenceJhtItem;
    }

    public static /* synthetic */ ClaimEvidenceJhtResponse copy$default(ClaimEvidenceJhtResponse claimEvidenceJhtResponse, String str, String str2, ClaimEvidenceJhtItem claimEvidenceJhtItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = claimEvidenceJhtResponse.isEvidence;
        }
        if ((i & 2) != 0) {
            str2 = claimEvidenceJhtResponse.messageCode;
        }
        if ((i & 4) != 0) {
            claimEvidenceJhtItem = claimEvidenceJhtResponse.data;
        }
        return claimEvidenceJhtResponse.copy(str, str2, claimEvidenceJhtItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIsEvidence() {
        return this.isEvidence;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageCode() {
        return this.messageCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ClaimEvidenceJhtItem getData() {
        return this.data;
    }

    public final ClaimEvidenceJhtResponse copy(String p0, String p1, ClaimEvidenceJhtItem p2) {
        return new ClaimEvidenceJhtResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ClaimEvidenceJhtResponse)) {
            return false;
        }
        ClaimEvidenceJhtResponse claimEvidenceJhtResponse = (ClaimEvidenceJhtResponse) p0;
        return Intrinsics.areEqual(this.isEvidence, claimEvidenceJhtResponse.isEvidence) && Intrinsics.areEqual(this.messageCode, claimEvidenceJhtResponse.messageCode) && Intrinsics.areEqual(this.data, claimEvidenceJhtResponse.data);
    }

    public final int hashCode() {
        String str = this.isEvidence;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.messageCode;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        ClaimEvidenceJhtItem claimEvidenceJhtItem = this.data;
        return (((iHashCode * 31) + iHashCode2) * 31) + (claimEvidenceJhtItem != null ? claimEvidenceJhtItem.hashCode() : 0);
    }

    public final String toString() {
        String str = this.isEvidence;
        String str2 = this.messageCode;
        ClaimEvidenceJhtItem claimEvidenceJhtItem = this.data;
        StringBuilder sb = new StringBuilder("ClaimEvidenceJhtResponse(isEvidence=");
        sb.append(str);
        sb.append(", messageCode=");
        sb.append(str2);
        sb.append(", data=");
        sb.append(claimEvidenceJhtItem);
        sb.append(")");
        return sb.toString();
    }
}
