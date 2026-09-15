package com.bpjstku.data.payment.model.response;

import androidx.core.app.NotificationCompat;
import com.bpjstku.data.payment.model.request.EwalletField;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\tHÇ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÇ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ|\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÇ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b'\u0010\u0013R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0013R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\u0013R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010\u0013R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\u0013R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\u0013R\u001a\u00105\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001aR\u001a\u00108\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001cR\"\u0010;\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001e"}, d2 = {"Lcom/bpjstku/data/payment/model/response/PaymentMethodItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "Lcom/bpjstku/data/payment/model/request/EwalletField;", "p6", "Lcom/bpjstku/data/payment/model/response/DirectDebitField;", "p7", "", "Lcom/bpjstku/data/payment/model/response/ActionLinkingStatus;", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/payment/model/request/EwalletField;Lcom/bpjstku/data/payment/model/response/DirectDebitField;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/bpjstku/data/payment/model/request/EwalletField;", "component8", "()Lcom/bpjstku/data/payment/model/response/DirectDebitField;", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/payment/model/request/EwalletField;Lcom/bpjstku/data/payment/model/response/DirectDebitField;Ljava/util/List;)Lcom/bpjstku/data/payment/model/response/PaymentMethodItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "paymentMethodId", "Ljava/lang/String;", "getPaymentMethodId", "customerId", "getCustomerId", "referenceId", "getReferenceId", NotificationCompat.CATEGORY_STATUS, "getStatus", "type", "getType", "channelCode", "getChannelCode", "ewallet", "Lcom/bpjstku/data/payment/model/request/EwalletField;", "getEwallet", "directDebit", "Lcom/bpjstku/data/payment/model/response/DirectDebitField;", "getDirectDebit", "actionLinkingStatus", "Ljava/util/List;", "getActionLinkingStatus"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PaymentMethodItem {
    public static final int $stable = 8;

    @SerializedName("actions")
    private final List<ActionLinkingStatus> actionLinkingStatus;

    @SerializedName("channel_code")
    private final String channelCode;

    @SerializedName("customer_id")
    private final String customerId;

    @SerializedName("direct_debit")
    private final DirectDebitField directDebit;

    @SerializedName("ewallet")
    private final EwalletField ewallet;

    @SerializedName("id")
    private final String paymentMethodId;

    @SerializedName("reference_id")
    private final String referenceId;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("type")
    private final String type;

    public PaymentMethodItem(String str, String str2, String str3, String str4, String str5, String str6, EwalletField ewalletField, DirectDebitField directDebitField, List<ActionLinkingStatus> list) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(ewalletField, "");
        Intrinsics.checkNotNullParameter(directDebitField, "");
        this.paymentMethodId = str;
        this.customerId = str2;
        this.referenceId = str3;
        this.status = str4;
        this.type = str5;
        this.channelCode = str6;
        this.ewallet = ewalletField;
        this.directDebit = directDebitField;
        this.actionLinkingStatus = list;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final EwalletField getEwallet() {
        return this.ewallet;
    }

    public final DirectDebitField getDirectDebit() {
        return this.directDebit;
    }

    public final List<ActionLinkingStatus> getActionLinkingStatus() {
        return this.actionLinkingStatus;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
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
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelCode() {
        return this.channelCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EwalletField getEwallet() {
        return this.ewallet;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DirectDebitField getDirectDebit() {
        return this.directDebit;
    }

    public final List<ActionLinkingStatus> component9() {
        return this.actionLinkingStatus;
    }

    public final PaymentMethodItem copy(String p0, String p1, String p2, String p3, String p4, String p5, EwalletField p6, DirectDebitField p7, List<ActionLinkingStatus> p8) {
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        return new PaymentMethodItem(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PaymentMethodItem)) {
            return false;
        }
        PaymentMethodItem paymentMethodItem = (PaymentMethodItem) p0;
        return Intrinsics.areEqual(this.paymentMethodId, paymentMethodItem.paymentMethodId) && Intrinsics.areEqual(this.customerId, paymentMethodItem.customerId) && Intrinsics.areEqual(this.referenceId, paymentMethodItem.referenceId) && Intrinsics.areEqual(this.status, paymentMethodItem.status) && Intrinsics.areEqual(this.type, paymentMethodItem.type) && Intrinsics.areEqual(this.channelCode, paymentMethodItem.channelCode) && Intrinsics.areEqual(this.ewallet, paymentMethodItem.ewallet) && Intrinsics.areEqual(this.directDebit, paymentMethodItem.directDebit) && Intrinsics.areEqual(this.actionLinkingStatus, paymentMethodItem.actionLinkingStatus);
    }

    public final int hashCode() {
        String str = this.paymentMethodId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.customerId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.referenceId.hashCode();
        String str3 = this.status;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.type;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.channelCode;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        int iHashCode7 = this.ewallet.hashCode();
        int iHashCode8 = this.directDebit.hashCode();
        List<ActionLinkingStatus> list = this.actionLinkingStatus;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.paymentMethodId;
        String str2 = this.customerId;
        String str3 = this.referenceId;
        String str4 = this.status;
        String str5 = this.type;
        String str6 = this.channelCode;
        EwalletField ewalletField = this.ewallet;
        DirectDebitField directDebitField = this.directDebit;
        List<ActionLinkingStatus> list = this.actionLinkingStatus;
        StringBuilder sb = new StringBuilder("PaymentMethodItem(paymentMethodId=");
        sb.append(str);
        sb.append(", customerId=");
        sb.append(str2);
        sb.append(", referenceId=");
        sb.append(str3);
        sb.append(", status=");
        sb.append(str4);
        sb.append(", type=");
        sb.append(str5);
        sb.append(", channelCode=");
        sb.append(str6);
        sb.append(", ewallet=");
        sb.append(ewalletField);
        sb.append(", directDebit=");
        sb.append(directDebitField);
        sb.append(", actionLinkingStatus=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
