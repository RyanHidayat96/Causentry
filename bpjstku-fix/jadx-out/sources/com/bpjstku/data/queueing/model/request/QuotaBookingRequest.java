package com.bpjstku.data.queueing.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/queueing/model/request/QuotaBookingRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/queueing/model/request/QuotaBookingRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "reqId", "Ljava/lang/String;", "getReqId", "kodeKantor", "getKodeKantor", "jenisAntrian", "getJenisAntrian"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QuotaBookingRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("jenisAntrian")
    private final String jenisAntrian;

    @SerializedName("kodeKantor")
    private final String kodeKantor;

    @SerializedName("reqId")
    private final String reqId;

    public /* synthetic */ QuotaBookingRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "JMOREG123" : str, str2, (i & 4) != 0 ? "IP" : str3);
    }

    public final String getReqId() {
        return this.reqId;
    }

    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    public final String getJenisAntrian() {
        return this.jenisAntrian;
    }

    public QuotaBookingRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.reqId = str;
        this.kodeKantor = str2;
        this.jenisAntrian = str3;
    }

    public static /* synthetic */ QuotaBookingRequest copy$default(QuotaBookingRequest quotaBookingRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quotaBookingRequest.reqId;
        }
        if ((i & 2) != 0) {
            str2 = quotaBookingRequest.kodeKantor;
        }
        if ((i & 4) != 0) {
            str3 = quotaBookingRequest.jenisAntrian;
        }
        return quotaBookingRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReqId() {
        return this.reqId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJenisAntrian() {
        return this.jenisAntrian;
    }

    public final QuotaBookingRequest copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new QuotaBookingRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof QuotaBookingRequest)) {
            return false;
        }
        QuotaBookingRequest quotaBookingRequest = (QuotaBookingRequest) p0;
        return Intrinsics.areEqual(this.reqId, quotaBookingRequest.reqId) && Intrinsics.areEqual(this.kodeKantor, quotaBookingRequest.kodeKantor) && Intrinsics.areEqual(this.jenisAntrian, quotaBookingRequest.jenisAntrian);
    }

    public final int hashCode() {
        return (((this.reqId.hashCode() * 31) + this.kodeKantor.hashCode()) * 31) + this.jenisAntrian.hashCode();
    }

    public final String toString() {
        String str = this.reqId;
        String str2 = this.kodeKantor;
        String str3 = this.jenisAntrian;
        StringBuilder sb = new StringBuilder("QuotaBookingRequest(reqId=");
        sb.append(str);
        sb.append(", kodeKantor=");
        sb.append(str2);
        sb.append(", jenisAntrian=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
