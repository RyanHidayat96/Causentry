package com.bpjstku.data.payment.model.response;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0018Jf\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b!\u0010\u0010R\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0010R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u0010R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u0010R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u0010R\"\u0010-\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0016R\u001a\u00100\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0018"}, d2 = {"Lcom/bpjstku/data/payment/model/response/PaymentMethodResult;", "", "", "p0", "p1", "p2", "p3", "p4", "", "Lcom/bpjstku/data/payment/model/response/ActionLinkingStatus;", "p5", "Lcom/bpjstku/data/payment/model/response/DirectDebitInfo;", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/bpjstku/data/payment/model/response/DirectDebitInfo;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/bpjstku/data/payment/model/response/DirectDebitInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/bpjstku/data/payment/model/response/DirectDebitInfo;)Lcom/bpjstku/data/payment/model/response/PaymentMethodResult;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "pmId", "Ljava/lang/String;", "getPmId", "customerId", "getCustomerId", "referenceId", "getReferenceId", "businessId", "getBusinessId", NotificationCompat.CATEGORY_STATUS, "getStatus", "actionsPmLinking", "Ljava/util/List;", "getActionsPmLinking", "directDebitInfo", "Lcom/bpjstku/data/payment/model/response/DirectDebitInfo;", "getDirectDebitInfo"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PaymentMethodResult {
    public static final int $stable = 8;

    @SerializedName("actions")
    private final List<ActionLinkingStatus> actionsPmLinking;

    @SerializedName("business_id")
    private final String businessId;

    @SerializedName("customer_id")
    private final String customerId;

    @SerializedName("direct_debit")
    private final DirectDebitInfo directDebitInfo;

    @SerializedName("id")
    private final String pmId;

    @SerializedName("reference_id")
    private final String referenceId;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    public PaymentMethodResult(String str, String str2, String str3, String str4, String str5, List<ActionLinkingStatus> list, DirectDebitInfo directDebitInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(directDebitInfo, "");
        this.pmId = str;
        this.customerId = str2;
        this.referenceId = str3;
        this.businessId = str4;
        this.status = str5;
        this.actionsPmLinking = list;
        this.directDebitInfo = directDebitInfo;
    }

    public final String getPmId() {
        return this.pmId;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final List<ActionLinkingStatus> getActionsPmLinking() {
        return this.actionsPmLinking;
    }

    public final DirectDebitInfo getDirectDebitInfo() {
        return this.directDebitInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodResult copy$default(PaymentMethodResult paymentMethodResult, String str, String str2, String str3, String str4, String str5, List list, DirectDebitInfo directDebitInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodResult.pmId;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethodResult.customerId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = paymentMethodResult.referenceId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = paymentMethodResult.businessId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = paymentMethodResult.status;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            list = paymentMethodResult.actionsPmLinking;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            directDebitInfo = paymentMethodResult.directDebitInfo;
        }
        return paymentMethodResult.copy(str, str6, str7, str8, str9, list2, directDebitInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPmId() {
        return this.pmId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBusinessId() {
        return this.businessId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final List<ActionLinkingStatus> component6() {
        return this.actionsPmLinking;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DirectDebitInfo getDirectDebitInfo() {
        return this.directDebitInfo;
    }

    public final PaymentMethodResult copy(String p0, String p1, String p2, String p3, String p4, List<ActionLinkingStatus> p5, DirectDebitInfo p6) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p6, "");
        return new PaymentMethodResult(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PaymentMethodResult)) {
            return false;
        }
        PaymentMethodResult paymentMethodResult = (PaymentMethodResult) p0;
        return Intrinsics.areEqual(this.pmId, paymentMethodResult.pmId) && Intrinsics.areEqual(this.customerId, paymentMethodResult.customerId) && Intrinsics.areEqual(this.referenceId, paymentMethodResult.referenceId) && Intrinsics.areEqual(this.businessId, paymentMethodResult.businessId) && Intrinsics.areEqual(this.status, paymentMethodResult.status) && Intrinsics.areEqual(this.actionsPmLinking, paymentMethodResult.actionsPmLinking) && Intrinsics.areEqual(this.directDebitInfo, paymentMethodResult.directDebitInfo);
    }

    public final int hashCode() {
        int iHashCode = this.pmId.hashCode();
        String str = this.customerId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.referenceId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.businessId;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.status;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        List<ActionLinkingStatus> list = this.actionsPmLinking;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.directDebitInfo.hashCode();
    }

    public final String toString() {
        String str = this.pmId;
        String str2 = this.customerId;
        String str3 = this.referenceId;
        String str4 = this.businessId;
        String str5 = this.status;
        List<ActionLinkingStatus> list = this.actionsPmLinking;
        DirectDebitInfo directDebitInfo = this.directDebitInfo;
        StringBuilder sb = new StringBuilder("PaymentMethodResult(pmId=");
        sb.append(str);
        sb.append(", customerId=");
        sb.append(str2);
        sb.append(", referenceId=");
        sb.append(str3);
        sb.append(", businessId=");
        sb.append(str4);
        sb.append(", status=");
        sb.append(str5);
        sb.append(", actionsPmLinking=");
        sb.append(list);
        sb.append(", directDebitInfo=");
        sb.append(directDebitInfo);
        sb.append(")");
        return sb.toString();
    }
}
