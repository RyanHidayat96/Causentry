package com.bpjstku.data.payment.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\rR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\rR\u001a\u0010(\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013"}, d2 = {"Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;", "", "", "p0", "p1", "p2", "p3", "p4", "Lcom/bpjstku/data/payment/model/request/PaymentProfileItem;", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/payment/model/request/PaymentProfileItem;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/bpjstku/data/payment/model/request/PaymentProfileItem;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/payment/model/request/PaymentProfileItem;)Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "referenceId", "Ljava/lang/String;", "getReferenceId", "customerId", "getCustomerId", "amount", "getAmount", "paymentMethodId", "getPaymentMethodId", "customField", "getCustomField", "paymentProfile", "Lcom/bpjstku/data/payment/model/request/PaymentProfileItem;", "getPaymentProfile"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateRecurringPlanRequest {
    public static final int $stable = 0;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("custom_field")
    private final String customField;

    @SerializedName("customer_id")
    private final String customerId;

    @SerializedName("payment_method_id")
    private final String paymentMethodId;

    @SerializedName("payment_profile")
    private final PaymentProfileItem paymentProfile;

    @SerializedName("reference_id")
    private final String referenceId;

    public CreateRecurringPlanRequest(String str, String str2, String str3, String str4, String str5, PaymentProfileItem paymentProfileItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(paymentProfileItem, "");
        this.referenceId = str;
        this.customerId = str2;
        this.amount = str3;
        this.paymentMethodId = str4;
        this.customField = str5;
        this.paymentProfile = paymentProfileItem;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getCustomField() {
        return this.customField;
    }

    public final PaymentProfileItem getPaymentProfile() {
        return this.paymentProfile;
    }

    public static /* synthetic */ CreateRecurringPlanRequest copy$default(CreateRecurringPlanRequest createRecurringPlanRequest, String str, String str2, String str3, String str4, String str5, PaymentProfileItem paymentProfileItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createRecurringPlanRequest.referenceId;
        }
        if ((i & 2) != 0) {
            str2 = createRecurringPlanRequest.customerId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = createRecurringPlanRequest.amount;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = createRecurringPlanRequest.paymentMethodId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = createRecurringPlanRequest.customField;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            paymentProfileItem = createRecurringPlanRequest.paymentProfile;
        }
        return createRecurringPlanRequest.copy(str, str6, str7, str8, str9, paymentProfileItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCustomField() {
        return this.customField;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PaymentProfileItem getPaymentProfile() {
        return this.paymentProfile;
    }

    public final CreateRecurringPlanRequest copy(String p0, String p1, String p2, String p3, String p4, PaymentProfileItem p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        return new CreateRecurringPlanRequest(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CreateRecurringPlanRequest)) {
            return false;
        }
        CreateRecurringPlanRequest createRecurringPlanRequest = (CreateRecurringPlanRequest) p0;
        return Intrinsics.areEqual(this.referenceId, createRecurringPlanRequest.referenceId) && Intrinsics.areEqual(this.customerId, createRecurringPlanRequest.customerId) && Intrinsics.areEqual(this.amount, createRecurringPlanRequest.amount) && Intrinsics.areEqual(this.paymentMethodId, createRecurringPlanRequest.paymentMethodId) && Intrinsics.areEqual(this.customField, createRecurringPlanRequest.customField) && Intrinsics.areEqual(this.paymentProfile, createRecurringPlanRequest.paymentProfile);
    }

    public final int hashCode() {
        return (((((((((this.referenceId.hashCode() * 31) + this.customerId.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.paymentMethodId.hashCode()) * 31) + this.customField.hashCode()) * 31) + this.paymentProfile.hashCode();
    }

    public final String toString() {
        String str = this.referenceId;
        String str2 = this.customerId;
        String str3 = this.amount;
        String str4 = this.paymentMethodId;
        String str5 = this.customField;
        PaymentProfileItem paymentProfileItem = this.paymentProfile;
        StringBuilder sb = new StringBuilder("CreateRecurringPlanRequest(referenceId=");
        sb.append(str);
        sb.append(", customerId=");
        sb.append(str2);
        sb.append(", amount=");
        sb.append(str3);
        sb.append(", paymentMethodId=");
        sb.append(str4);
        sb.append(", customField=");
        sb.append(str5);
        sb.append(", paymentProfile=");
        sb.append(paymentProfileItem);
        sb.append(")");
        return sb.toString();
    }
}
