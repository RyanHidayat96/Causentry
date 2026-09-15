package com.bpjstku.data.jht.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityItem;", "p0", "Lcom/bpjstku/data/jht/model/response/InfoPraClaimItem;", "p1", "<init>", "(Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityItem;Lcom/bpjstku/data/jht/model/response/InfoPraClaimItem;)V", "component1", "()Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityItem;", "component2", "()Lcom/bpjstku/data/jht/model/response/InfoPraClaimItem;", "copy", "(Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityItem;Lcom/bpjstku/data/jht/model/response/InfoPraClaimItem;)Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityItem;", "getData", "praNewData", "Lcom/bpjstku/data/jht/model/response/InfoPraClaimItem;", "getPraNewData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimEligibilityResponse extends BaseItem {
    public static final int $stable = 0;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final JhtClaimEligibilityItem data;

    @SerializedName("praNewData")
    private final InfoPraClaimItem praNewData;

    public final JhtClaimEligibilityItem getData() {
        return this.data;
    }

    public final InfoPraClaimItem getPraNewData() {
        return this.praNewData;
    }

    public JhtClaimEligibilityResponse(JhtClaimEligibilityItem jhtClaimEligibilityItem, InfoPraClaimItem infoPraClaimItem) {
        Intrinsics.checkNotNullParameter(jhtClaimEligibilityItem, "");
        Intrinsics.checkNotNullParameter(infoPraClaimItem, "");
        this.data = jhtClaimEligibilityItem;
        this.praNewData = infoPraClaimItem;
    }

    public static /* synthetic */ JhtClaimEligibilityResponse copy$default(JhtClaimEligibilityResponse jhtClaimEligibilityResponse, JhtClaimEligibilityItem jhtClaimEligibilityItem, InfoPraClaimItem infoPraClaimItem, int i, Object obj) {
        if ((i & 1) != 0) {
            jhtClaimEligibilityItem = jhtClaimEligibilityResponse.data;
        }
        if ((i & 2) != 0) {
            infoPraClaimItem = jhtClaimEligibilityResponse.praNewData;
        }
        return jhtClaimEligibilityResponse.copy(jhtClaimEligibilityItem, infoPraClaimItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JhtClaimEligibilityItem getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InfoPraClaimItem getPraNewData() {
        return this.praNewData;
    }

    public final JhtClaimEligibilityResponse copy(JhtClaimEligibilityItem p0, InfoPraClaimItem p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new JhtClaimEligibilityResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtClaimEligibilityResponse)) {
            return false;
        }
        JhtClaimEligibilityResponse jhtClaimEligibilityResponse = (JhtClaimEligibilityResponse) p0;
        return Intrinsics.areEqual(this.data, jhtClaimEligibilityResponse.data) && Intrinsics.areEqual(this.praNewData, jhtClaimEligibilityResponse.praNewData);
    }

    public final int hashCode() {
        return (this.data.hashCode() * 31) + this.praNewData.hashCode();
    }

    public final String toString() {
        JhtClaimEligibilityItem jhtClaimEligibilityItem = this.data;
        InfoPraClaimItem infoPraClaimItem = this.praNewData;
        StringBuilder sb = new StringBuilder("JhtClaimEligibilityResponse(data=");
        sb.append(jhtClaimEligibilityItem);
        sb.append(", praNewData=");
        sb.append(infoPraClaimItem);
        sb.append(")");
        return sb.toString();
    }
}
