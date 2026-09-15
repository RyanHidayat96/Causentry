package com.bpjstku.data.promo.model.request;

import android.os.Process;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JR\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u000eR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0012"}, d2 = {"Lcom/bpjstku/data/promo/model/request/VoucherRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "", "Lcom/bpjstku/data/promo/model/request/SearchMerchant;", "p3", "Lcom/bpjstku/data/promo/model/request/OrderMerchant;", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/bpjstku/data/promo/model/request/VoucherRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "pageNumber", "Ljava/lang/String;", "getPageNumber", "pageSize", "getPageSize", "reqId", "getReqId", FirebaseAnalytics.Event.SEARCH, "Ljava/util/List;", "getSearch", "order", "getOrder"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VoucherRequest extends BaseRequest {
    public static final int $stable = 8;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static int b;

    @SerializedName("order")
    private final List<OrderMerchant> order;

    @SerializedName("pageNumber")
    private final String pageNumber;

    @SerializedName("pageSize")
    private final String pageSize;

    @SerializedName("reqId")
    private final String reqId;

    @SerializedName(FirebaseAnalytics.Event.SEARCH)
    private final List<SearchMerchant> search;

    public final String getPageNumber() {
        return this.pageNumber;
    }

    public final String getPageSize() {
        return this.pageSize;
    }

    public final String getReqId() {
        return this.reqId;
    }

    public final List<SearchMerchant> getSearch() {
        return this.search;
    }

    public /* synthetic */ VoucherRequest(String str, String str2, String str3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final List<OrderMerchant> getOrder() {
        return this.order;
    }

    public VoucherRequest(String str, String str2, String str3, List<SearchMerchant> list, List<OrderMerchant> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.pageNumber = str;
        this.pageSize = str2;
        this.reqId = str3;
        this.search = list;
        this.order = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoucherRequest copy$default(VoucherRequest voucherRequest, String str, String str2, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voucherRequest.pageNumber;
        }
        if ((i & 2) != 0) {
            str2 = voucherRequest.pageSize;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = voucherRequest.reqId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            list = voucherRequest.search;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = voucherRequest.order;
        }
        return voucherRequest.copy(str, str4, str5, list3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageNumber() {
        return this.pageNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReqId() {
        return this.reqId;
    }

    public final List<SearchMerchant> component4() {
        return this.search;
    }

    public final List<OrderMerchant> component5() {
        return this.order;
    }

    public final VoucherRequest copy(String p0, String p1, String p2, List<SearchMerchant> p3, List<OrderMerchant> p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new VoucherRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VoucherRequest)) {
            return false;
        }
        VoucherRequest voucherRequest = (VoucherRequest) p0;
        return Intrinsics.areEqual(this.pageNumber, voucherRequest.pageNumber) && Intrinsics.areEqual(this.pageSize, voucherRequest.pageSize) && Intrinsics.areEqual(this.reqId, voucherRequest.reqId) && Intrinsics.areEqual(this.search, voucherRequest.search) && Intrinsics.areEqual(this.order, voucherRequest.order);
    }

    public final int hashCode() {
        int iHashCode = this.pageNumber.hashCode();
        int iHashCode2 = this.pageSize.hashCode();
        int iHashCode3 = this.reqId.hashCode();
        List<SearchMerchant> list = this.search;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<OrderMerchant> list2 = this.order;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.pageNumber;
        String str2 = this.pageSize;
        String str3 = this.reqId;
        List<SearchMerchant> list = this.search;
        List<OrderMerchant> list2 = this.order;
        StringBuilder sb = new StringBuilder("VoucherRequest(pageNumber=");
        sb.append(str);
        sb.append(", pageSize=");
        sb.append(str2);
        sb.append(", reqId=");
        sb.append(str3);
        sb.append(", search=");
        sb.append(list);
        sb.append(", order=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public static int b() {
        int i = b;
        int i2 = i % 7311919;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int iMyTid = Process.myTid();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iMyTid;
        return iMyTid;
    }
}
