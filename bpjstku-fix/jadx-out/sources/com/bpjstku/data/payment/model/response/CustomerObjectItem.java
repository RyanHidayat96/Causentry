package com.bpjstku.data.payment.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ>\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\u001b"}, d2 = {"Lcom/bpjstku/data/payment/model/response/CustomerObjectItem;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/CustomerObjectItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "customerId", "Ljava/lang/String;", "getCustomerId", "setCustomerId", "(Ljava/lang/String;)V", "ReferenceId", "getReferenceId", "setReferenceId", "Email", "getEmail", "setEmail", "MobileNumber", "getMobileNumber", "setMobileNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CustomerObjectItem {
    public static final int $stable = 8;

    @SerializedName("email")
    private String Email;

    @SerializedName("mobile_number")
    private String MobileNumber;

    @SerializedName("reference_id")
    private String ReferenceId;

    @SerializedName("id")
    private String customerId;

    public CustomerObjectItem(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.customerId = str;
        this.ReferenceId = str2;
        this.Email = str3;
        this.MobileNumber = str4;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final void setCustomerId(String str) {
        this.customerId = str;
    }

    public final String getReferenceId() {
        return this.ReferenceId;
    }

    public final void setReferenceId(String str) {
        this.ReferenceId = str;
    }

    public final String getEmail() {
        return this.Email;
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Email = str;
    }

    public final String getMobileNumber() {
        return this.MobileNumber;
    }

    public final void setMobileNumber(String str) {
        this.MobileNumber = str;
    }

    public static /* synthetic */ CustomerObjectItem copy$default(CustomerObjectItem customerObjectItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerObjectItem.customerId;
        }
        if ((i & 2) != 0) {
            str2 = customerObjectItem.ReferenceId;
        }
        if ((i & 4) != 0) {
            str3 = customerObjectItem.Email;
        }
        if ((i & 8) != 0) {
            str4 = customerObjectItem.MobileNumber;
        }
        return customerObjectItem.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReferenceId() {
        return this.ReferenceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.Email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMobileNumber() {
        return this.MobileNumber;
    }

    public final CustomerObjectItem copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p2, "");
        return new CustomerObjectItem(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CustomerObjectItem)) {
            return false;
        }
        CustomerObjectItem customerObjectItem = (CustomerObjectItem) p0;
        return Intrinsics.areEqual(this.customerId, customerObjectItem.customerId) && Intrinsics.areEqual(this.ReferenceId, customerObjectItem.ReferenceId) && Intrinsics.areEqual(this.Email, customerObjectItem.Email) && Intrinsics.areEqual(this.MobileNumber, customerObjectItem.MobileNumber);
    }

    public final int hashCode() {
        String str = this.customerId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ReferenceId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.Email.hashCode();
        String str3 = this.MobileNumber;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.customerId;
        String str2 = this.ReferenceId;
        String str3 = this.Email;
        String str4 = this.MobileNumber;
        StringBuilder sb = new StringBuilder("CustomerObjectItem(customerId=");
        sb.append(str);
        sb.append(", ReferenceId=");
        sb.append(str2);
        sb.append(", Email=");
        sb.append(str3);
        sb.append(", MobileNumber=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
