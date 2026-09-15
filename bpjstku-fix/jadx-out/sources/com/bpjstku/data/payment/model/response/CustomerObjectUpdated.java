package com.bpjstku.data.payment.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/bpjstku/data/payment/model/response/CustomerObjectUpdated;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/CustomerObjectUpdated;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "customerId", "Ljava/lang/String;", "getCustomerId", "email", "getEmail", "mobileNumber", "getMobileNumber", "referenceId", "getReferenceId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CustomerObjectUpdated {
    public static final int $stable = 0;

    @SerializedName("customer_id")
    private final String customerId;

    @SerializedName("email")
    private final String email;

    @SerializedName("mobile_number")
    private final String mobileNumber;

    @SerializedName("reference_id")
    private final String referenceId;

    public CustomerObjectUpdated(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.customerId = str;
        this.email = str2;
        this.mobileNumber = str3;
        this.referenceId = str4;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public static /* synthetic */ CustomerObjectUpdated copy$default(CustomerObjectUpdated customerObjectUpdated, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerObjectUpdated.customerId;
        }
        if ((i & 2) != 0) {
            str2 = customerObjectUpdated.email;
        }
        if ((i & 4) != 0) {
            str3 = customerObjectUpdated.mobileNumber;
        }
        if ((i & 8) != 0) {
            str4 = customerObjectUpdated.referenceId;
        }
        return customerObjectUpdated.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    public final CustomerObjectUpdated copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new CustomerObjectUpdated(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CustomerObjectUpdated)) {
            return false;
        }
        CustomerObjectUpdated customerObjectUpdated = (CustomerObjectUpdated) p0;
        return Intrinsics.areEqual(this.customerId, customerObjectUpdated.customerId) && Intrinsics.areEqual(this.email, customerObjectUpdated.email) && Intrinsics.areEqual(this.mobileNumber, customerObjectUpdated.mobileNumber) && Intrinsics.areEqual(this.referenceId, customerObjectUpdated.referenceId);
    }

    public final int hashCode() {
        return (((((this.customerId.hashCode() * 31) + this.email.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.referenceId.hashCode();
    }

    public final String toString() {
        String str = this.customerId;
        String str2 = this.email;
        String str3 = this.mobileNumber;
        String str4 = this.referenceId;
        StringBuilder sb = new StringBuilder("CustomerObjectUpdated(customerId=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", mobileNumber=");
        sb.append(str3);
        sb.append(", referenceId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
