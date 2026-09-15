package com.bpjstku.data.payment.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u0018\u0010\u0010R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/bpjstku/data/payment/model/response/GetListPaymentMethodResponse;", "", "", "Lcom/bpjstku/data/payment/model/response/PaymentMethodItem;", "p0", "", "p1", "", "p2", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/GetListPaymentMethodResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData", "isSuccessful", "Ljava/lang/Boolean;", "message", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetListPaymentMethodResponse {
    public static final int $stable = 8;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final List<PaymentMethodItem> data;

    @SerializedName("isSuccessful")
    private final Boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    public GetListPaymentMethodResponse(List<PaymentMethodItem> list, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.data = list;
        this.isSuccessful = bool;
        this.message = str;
    }

    public final List<PaymentMethodItem> getData() {
        return this.data;
    }

    public final Boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetListPaymentMethodResponse copy$default(GetListPaymentMethodResponse getListPaymentMethodResponse, List list, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getListPaymentMethodResponse.data;
        }
        if ((i & 2) != 0) {
            bool = getListPaymentMethodResponse.isSuccessful;
        }
        if ((i & 4) != 0) {
            str = getListPaymentMethodResponse.message;
        }
        return getListPaymentMethodResponse.copy(list, bool, str);
    }

    public final List<PaymentMethodItem> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final GetListPaymentMethodResponse copy(List<PaymentMethodItem> p0, Boolean p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new GetListPaymentMethodResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GetListPaymentMethodResponse)) {
            return false;
        }
        GetListPaymentMethodResponse getListPaymentMethodResponse = (GetListPaymentMethodResponse) p0;
        return Intrinsics.areEqual(this.data, getListPaymentMethodResponse.data) && Intrinsics.areEqual(this.isSuccessful, getListPaymentMethodResponse.isSuccessful) && Intrinsics.areEqual(this.message, getListPaymentMethodResponse.message);
    }

    public final int hashCode() {
        int iHashCode = this.data.hashCode();
        Boolean bool = this.isSuccessful;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str = this.message;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        List<PaymentMethodItem> list = this.data;
        Boolean bool = this.isSuccessful;
        String str = this.message;
        StringBuilder sb = new StringBuilder("GetListPaymentMethodResponse(data=");
        sb.append(list);
        sb.append(", isSuccessful=");
        sb.append(bool);
        sb.append(", message=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
