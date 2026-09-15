package com.bpjstku.data.jkp.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/jkp/model/response/CheckSubmissionJkpItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "Lcom/bpjstku/data/jht/model/response/Eligibility;", "p0", "<init>", "(Lcom/bpjstku/data/jht/model/response/Eligibility;)V", "component1", "()Lcom/bpjstku/data/jht/model/response/Eligibility;", "copy", "(Lcom/bpjstku/data/jht/model/response/Eligibility;)Lcom/bpjstku/data/jkp/model/response/CheckSubmissionJkpItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "eligibility", "Lcom/bpjstku/data/jht/model/response/Eligibility;", "getEligibility"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckSubmissionJkpItem extends BaseItem {
    public static final int $stable = 0;

    @SerializedName("eligible")
    private final com.bpjstku.data.jht.model.response.Eligibility eligibility;

    public final com.bpjstku.data.jht.model.response.Eligibility getEligibility() {
        return this.eligibility;
    }

    public CheckSubmissionJkpItem(com.bpjstku.data.jht.model.response.Eligibility eligibility) {
        Intrinsics.checkNotNullParameter(eligibility, "");
        this.eligibility = eligibility;
    }

    public static /* synthetic */ CheckSubmissionJkpItem copy$default(CheckSubmissionJkpItem checkSubmissionJkpItem, com.bpjstku.data.jht.model.response.Eligibility eligibility, int i, Object obj) {
        if ((i & 1) != 0) {
            eligibility = checkSubmissionJkpItem.eligibility;
        }
        return checkSubmissionJkpItem.copy(eligibility);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.bpjstku.data.jht.model.response.Eligibility getEligibility() {
        return this.eligibility;
    }

    public final CheckSubmissionJkpItem copy(com.bpjstku.data.jht.model.response.Eligibility p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new CheckSubmissionJkpItem(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof CheckSubmissionJkpItem) && Intrinsics.areEqual(this.eligibility, ((CheckSubmissionJkpItem) p0).eligibility);
    }

    public final int hashCode() {
        return this.eligibility.hashCode();
    }

    public final String toString() {
        com.bpjstku.data.jht.model.response.Eligibility eligibility = this.eligibility;
        StringBuilder sb = new StringBuilder("CheckSubmissionJkpItem(eligibility=");
        sb.append(eligibility);
        sb.append(")");
        return sb.toString();
    }
}
