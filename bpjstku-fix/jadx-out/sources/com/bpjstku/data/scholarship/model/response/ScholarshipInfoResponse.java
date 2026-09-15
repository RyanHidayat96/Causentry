package com.bpjstku.data.scholarship.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0005"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoResponse;", "", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoItem;", "p0", "<init>", "(Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoItem;)V", "component1", "()Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoItem;", "copy", "(Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoItem;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "info", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoItem;", "getInfo", "setInfo"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipInfoResponse {
    public static final int $stable = 8;

    @SerializedName("dataInfoManfaatBeasiswa")
    private ScholarshipInfoItem info;

    public ScholarshipInfoResponse(ScholarshipInfoItem scholarshipInfoItem) {
        this.info = scholarshipInfoItem;
    }

    public /* synthetic */ ScholarshipInfoResponse(ScholarshipInfoItem scholarshipInfoItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : scholarshipInfoItem);
    }

    public final ScholarshipInfoItem getInfo() {
        return this.info;
    }

    public final void setInfo(ScholarshipInfoItem scholarshipInfoItem) {
        this.info = scholarshipInfoItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScholarshipInfoResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ScholarshipInfoResponse copy$default(ScholarshipInfoResponse scholarshipInfoResponse, ScholarshipInfoItem scholarshipInfoItem, int i, Object obj) {
        if ((i & 1) != 0) {
            scholarshipInfoItem = scholarshipInfoResponse.info;
        }
        return scholarshipInfoResponse.copy(scholarshipInfoItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScholarshipInfoItem getInfo() {
        return this.info;
    }

    public final ScholarshipInfoResponse copy(ScholarshipInfoItem p0) {
        return new ScholarshipInfoResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof ScholarshipInfoResponse) && Intrinsics.areEqual(this.info, ((ScholarshipInfoResponse) p0).info);
    }

    public final int hashCode() {
        ScholarshipInfoItem scholarshipInfoItem = this.info;
        if (scholarshipInfoItem == null) {
            return 0;
        }
        return scholarshipInfoItem.hashCode();
    }

    public final String toString() {
        ScholarshipInfoItem scholarshipInfoItem = this.info;
        StringBuilder sb = new StringBuilder("ScholarshipInfoResponse(info=");
        sb.append(scholarshipInfoItem);
        sb.append(")");
        return sb.toString();
    }
}
