package com.bpjstku.data.promo.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\rJD\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u001b\u0010\u000fR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000fR \u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/bpjstku/data/promo/model/request/MerchantRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "Lcom/bpjstku/data/promo/model/request/SearchMerchant;", "p0", "", "p1", "p2", "Lcom/bpjstku/data/promo/model/request/OrderMerchant;", "p3", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/bpjstku/data/promo/model/request/MerchantRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", FirebaseAnalytics.Event.SEARCH, "Ljava/util/List;", "getSearch", "pageNumber", "Ljava/lang/String;", "getPageNumber", "pageSize", "getPageSize", "order", "getOrder"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MerchantRequest extends BaseRequest {
    public static final int $stable = 8;

    @SerializedName("order")
    private final List<OrderMerchant> order;

    @SerializedName("pageNumber")
    private final String pageNumber;

    @SerializedName("pageSize")
    private final String pageSize;

    @SerializedName(FirebaseAnalytics.Event.SEARCH)
    private final List<SearchMerchant> search;

    public final List<SearchMerchant> getSearch() {
        return this.search;
    }

    public final String getPageNumber() {
        return this.pageNumber;
    }

    public final String getPageSize() {
        return this.pageSize;
    }

    public final List<OrderMerchant> getOrder() {
        return this.order;
    }

    public MerchantRequest(List<SearchMerchant> list, String str, String str2, List<OrderMerchant> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.search = list;
        this.pageNumber = str;
        this.pageSize = str2;
        this.order = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MerchantRequest copy$default(MerchantRequest merchantRequest, List list, String str, String str2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = merchantRequest.search;
        }
        if ((i & 2) != 0) {
            str = merchantRequest.pageNumber;
        }
        if ((i & 4) != 0) {
            str2 = merchantRequest.pageSize;
        }
        if ((i & 8) != 0) {
            list2 = merchantRequest.order;
        }
        return merchantRequest.copy(list, str, str2, list2);
    }

    public final List<SearchMerchant> component1() {
        return this.search;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageNumber() {
        return this.pageNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPageSize() {
        return this.pageSize;
    }

    public final List<OrderMerchant> component4() {
        return this.order;
    }

    public final MerchantRequest copy(List<SearchMerchant> p0, String p1, String p2, List<OrderMerchant> p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new MerchantRequest(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MerchantRequest)) {
            return false;
        }
        MerchantRequest merchantRequest = (MerchantRequest) p0;
        return Intrinsics.areEqual(this.search, merchantRequest.search) && Intrinsics.areEqual(this.pageNumber, merchantRequest.pageNumber) && Intrinsics.areEqual(this.pageSize, merchantRequest.pageSize) && Intrinsics.areEqual(this.order, merchantRequest.order);
    }

    public final int hashCode() {
        return (((((this.search.hashCode() * 31) + this.pageNumber.hashCode()) * 31) + this.pageSize.hashCode()) * 31) + this.order.hashCode();
    }

    public final String toString() {
        List<SearchMerchant> list = this.search;
        String str = this.pageNumber;
        String str2 = this.pageSize;
        List<OrderMerchant> list2 = this.order;
        StringBuilder sb = new StringBuilder("MerchantRequest(search=");
        sb.append(list);
        sb.append(", pageNumber=");
        sb.append(str);
        sb.append(", pageSize=");
        sb.append(str2);
        sb.append(", order=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
