package com.bpjstku.data.payment.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JP\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\rR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\rR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\rR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012"}, d2 = {"Lcom/bpjstku/data/payment/model/response/RecurringPlanResponse;", "", "", "p0", "p1", "p2", "p3", "", "Lcom/bpjstku/data/payment/model/response/PaymentMethodDetail;", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/bpjstku/data/payment/model/response/RecurringPlanResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "referenceId", "Ljava/lang/String;", "getReferenceId", "customerId", "getCustomerId", "businessId", "getBusinessId", "recurringPlanId", "getRecurringPlanId", "paymentMethod", "Ljava/util/List;", "getPaymentMethod"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RecurringPlanResponse {
    public static final int $stable = 8;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;

    @SerializedName("business_id")
    private final String businessId;

    @SerializedName("customer_id")
    private final String customerId;

    @SerializedName("payment_methods")
    private final List<PaymentMethodDetail> paymentMethod;

    @SerializedName("id")
    private final String recurringPlanId;

    @SerializedName("reference_id")
    private final String referenceId;

    public RecurringPlanResponse(String str, String str2, String str3, String str4, List<PaymentMethodDetail> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.referenceId = str;
        this.customerId = str2;
        this.businessId = str3;
        this.recurringPlanId = str4;
        this.paymentMethod = list;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getRecurringPlanId() {
        return this.recurringPlanId;
    }

    public final List<PaymentMethodDetail> getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringPlanResponse copy$default(RecurringPlanResponse recurringPlanResponse, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringPlanResponse.referenceId;
        }
        if ((i & 2) != 0) {
            str2 = recurringPlanResponse.customerId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = recurringPlanResponse.businessId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = recurringPlanResponse.recurringPlanId;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = recurringPlanResponse.paymentMethod;
        }
        return recurringPlanResponse.copy(str, str5, str6, str7, list);
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
    public final String getBusinessId() {
        return this.businessId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecurringPlanId() {
        return this.recurringPlanId;
    }

    public final List<PaymentMethodDetail> component5() {
        return this.paymentMethod;
    }

    public final RecurringPlanResponse copy(String p0, String p1, String p2, String p3, List<PaymentMethodDetail> p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new RecurringPlanResponse(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RecurringPlanResponse)) {
            return false;
        }
        RecurringPlanResponse recurringPlanResponse = (RecurringPlanResponse) p0;
        return Intrinsics.areEqual(this.referenceId, recurringPlanResponse.referenceId) && Intrinsics.areEqual(this.customerId, recurringPlanResponse.customerId) && Intrinsics.areEqual(this.businessId, recurringPlanResponse.businessId) && Intrinsics.areEqual(this.recurringPlanId, recurringPlanResponse.recurringPlanId) && Intrinsics.areEqual(this.paymentMethod, recurringPlanResponse.paymentMethod);
    }

    public final int hashCode() {
        int iHashCode = this.referenceId.hashCode();
        String str = this.customerId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.businessId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.recurringPlanId;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        List<PaymentMethodDetail> list = this.paymentMethod;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.referenceId;
        String str2 = this.customerId;
        String str3 = this.businessId;
        String str4 = this.recurringPlanId;
        List<PaymentMethodDetail> list = this.paymentMethod;
        StringBuilder sb = new StringBuilder("RecurringPlanResponse(referenceId=");
        sb.append(str);
        sb.append(", customerId=");
        sb.append(str2);
        sb.append(", businessId=");
        sb.append(str3);
        sb.append(", recurringPlanId=");
        sb.append(str4);
        sb.append(", paymentMethod=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 6833298;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iNextInt = new Random().nextInt();
        b = iNextInt;
        return iNextInt;
    }
}
