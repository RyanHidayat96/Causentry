package com.bpjstku.data.jht.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/jht/model/response/ClaimCheckBankBpuReactivationResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "", "p1", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/bpjstku/data/jht/model/response/ClaimCheckBankBpuReactivationResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "eligibleReaktivasi", "Z", "getEligibleReaktivasi", "listBankEligible", "Ljava/lang/String;", "getListBankEligible"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClaimCheckBankBpuReactivationResponse extends BaseItem {
    public static final int $stable = 0;

    @SerializedName("eligibleReaktivasi")
    private final boolean eligibleReaktivasi;

    @SerializedName("listBankEligible")
    private final String listBankEligible;

    public final boolean getEligibleReaktivasi() {
        return this.eligibleReaktivasi;
    }

    public final String getListBankEligible() {
        return this.listBankEligible;
    }

    public ClaimCheckBankBpuReactivationResponse(boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eligibleReaktivasi = z;
        this.listBankEligible = str;
    }

    public static /* synthetic */ ClaimCheckBankBpuReactivationResponse copy$default(ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivationResponse, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = claimCheckBankBpuReactivationResponse.eligibleReaktivasi;
        }
        if ((i & 2) != 0) {
            str = claimCheckBankBpuReactivationResponse.listBankEligible;
        }
        return claimCheckBankBpuReactivationResponse.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEligibleReaktivasi() {
        return this.eligibleReaktivasi;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getListBankEligible() {
        return this.listBankEligible;
    }

    public final ClaimCheckBankBpuReactivationResponse copy(boolean p0, String p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        return new ClaimCheckBankBpuReactivationResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ClaimCheckBankBpuReactivationResponse)) {
            return false;
        }
        ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivationResponse = (ClaimCheckBankBpuReactivationResponse) p0;
        return this.eligibleReaktivasi == claimCheckBankBpuReactivationResponse.eligibleReaktivasi && Intrinsics.areEqual(this.listBankEligible, claimCheckBankBpuReactivationResponse.listBankEligible);
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.eligibleReaktivasi) * 31) + this.listBankEligible.hashCode();
    }

    public final String toString() {
        boolean z = this.eligibleReaktivasi;
        String str = this.listBankEligible;
        StringBuilder sb = new StringBuilder("ClaimCheckBankBpuReactivationResponse(eligibleReaktivasi=");
        sb.append(z);
        sb.append(", listBankEligible=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
