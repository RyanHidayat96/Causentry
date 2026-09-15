package com.bpjstku.data.payment.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/bpjstku/data/payment/model/response/CustomerObjectResponse;", "", "", "Lcom/bpjstku/data/payment/model/response/CustomerObjectItem;", "p0", "", "p1", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/bpjstku/data/payment/model/response/CustomerObjectResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "info", "Ljava/util/List;", "getInfo", "HasMore", "Ljava/lang/Boolean;", "getHasMore"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CustomerObjectResponse {
    public static final int $stable = 8;

    @SerializedName("has_more")
    private final Boolean HasMore;

    @SerializedName("info")
    private final List<CustomerObjectItem> info;

    public CustomerObjectResponse(List<CustomerObjectItem> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        this.info = list;
        this.HasMore = bool;
    }

    public final List<CustomerObjectItem> getInfo() {
        return this.info;
    }

    public final Boolean getHasMore() {
        return this.HasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerObjectResponse copy$default(CustomerObjectResponse customerObjectResponse, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = customerObjectResponse.info;
        }
        if ((i & 2) != 0) {
            bool = customerObjectResponse.HasMore;
        }
        return customerObjectResponse.copy(list, bool);
    }

    public final List<CustomerObjectItem> component1() {
        return this.info;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHasMore() {
        return this.HasMore;
    }

    public final CustomerObjectResponse copy(List<CustomerObjectItem> p0, Boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new CustomerObjectResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CustomerObjectResponse)) {
            return false;
        }
        CustomerObjectResponse customerObjectResponse = (CustomerObjectResponse) p0;
        return Intrinsics.areEqual(this.info, customerObjectResponse.info) && Intrinsics.areEqual(this.HasMore, customerObjectResponse.HasMore);
    }

    public final int hashCode() {
        int iHashCode = this.info.hashCode();
        Boolean bool = this.HasMore;
        return (iHashCode * 31) + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        List<CustomerObjectItem> list = this.info;
        Boolean bool = this.HasMore;
        StringBuilder sb = new StringBuilder("CustomerObjectResponse(info=");
        sb.append(list);
        sb.append(", HasMore=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }
}
