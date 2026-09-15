package com.bpjstku.data.jht.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/jht/model/request/JhtClaimContributionRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bpjstku/data/jht/model/request/JhtClaimContributionRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimContributionRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    public final String getEmail() {
        return this.email;
    }

    public JhtClaimContributionRequest(String str) {
        this.email = str;
    }

    public static /* synthetic */ JhtClaimContributionRequest copy$default(JhtClaimContributionRequest jhtClaimContributionRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jhtClaimContributionRequest.email;
        }
        return jhtClaimContributionRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final JhtClaimContributionRequest copy(String p0) {
        return new JhtClaimContributionRequest(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof JhtClaimContributionRequest) && Intrinsics.areEqual(this.email, ((JhtClaimContributionRequest) p0).email);
    }

    public final int hashCode() {
        String str = this.email;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String str = this.email;
        StringBuilder sb = new StringBuilder("JhtClaimContributionRequest(email=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
