package com.bpjstku.data.multibiller.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0007R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\u0005"}, d2 = {"Lcom/bpjstku/data/multibiller/model/response/MultiBillerCheckRegisterResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bpjstku/data/multibiller/model/response/MultiBillerCheckRegisterResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "customerBillId", "Ljava/lang/String;", "getCustomerBillId", "setCustomerBillId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerCheckRegisterResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("customer_bill_id")
    private String customerBillId;

    public final String getCustomerBillId() {
        return this.customerBillId;
    }

    public final void setCustomerBillId(String str) {
        this.customerBillId = str;
    }

    public MultiBillerCheckRegisterResponse(String str) {
        this.customerBillId = str;
    }

    public static /* synthetic */ MultiBillerCheckRegisterResponse copy$default(MultiBillerCheckRegisterResponse multiBillerCheckRegisterResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiBillerCheckRegisterResponse.customerBillId;
        }
        return multiBillerCheckRegisterResponse.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCustomerBillId() {
        return this.customerBillId;
    }

    public final MultiBillerCheckRegisterResponse copy(String p0) {
        return new MultiBillerCheckRegisterResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof MultiBillerCheckRegisterResponse) && Intrinsics.areEqual(this.customerBillId, ((MultiBillerCheckRegisterResponse) p0).customerBillId);
    }

    public final int hashCode() {
        String str = this.customerBillId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String str = this.customerBillId;
        StringBuilder sb = new StringBuilder("MultiBillerCheckRegisterResponse(customerBillId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
