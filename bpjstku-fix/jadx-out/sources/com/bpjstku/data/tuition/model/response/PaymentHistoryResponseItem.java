package com.bpjstku.data.tuition.model.response;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b+\b\u0007\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010\u0015R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0015R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0013\u001a\u0004\b+\u0010\u0015R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b-\u0010\u0015"}, d2 = {"Lcom/bpjstku/data/tuition/model/response/PaymentHistoryResponseItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "transactionId", "Ljava/lang/String;", "getTransactionId", "()Ljava/lang/String;", "amountJkk", "getAmountJkk", "amountJkm", "getAmountJkm", "amountJht", "getAmountJht", "amountTotal", "getAmountTotal", NotificationCompat.CATEGORY_STATUS, "getStatus", FirebaseAnalytics.Param.QUANTITY, "getQuantity", "fullname", "getFullname", "transactionDate", "getTransactionDate", "settlementDate", "getSettlementDate", "customerIdentifier", "getCustomerIdentifier", "paymentMethod", "getPaymentMethod", "customField", "getCustomField"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentHistoryResponseItem {
    public static final int $stable = 0;

    @SerializedName("amountJht")
    private final String amountJht;

    @SerializedName("amountJkk")
    private final String amountJkk;

    @SerializedName("amountJkm")
    private final String amountJkm;

    @SerializedName("amountTotal")
    private final String amountTotal;

    @SerializedName("customField")
    private final String customField;

    @SerializedName("customerIdentifier")
    private final String customerIdentifier;

    @SerializedName("fullname")
    private final String fullname;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    private final String quantity;

    @SerializedName("settlementDate")
    private final String settlementDate;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("transactionDate")
    private final String transactionDate;

    @SerializedName("transactionId")
    private final String transactionId;

    public PaymentHistoryResponseItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.transactionId = str;
        this.amountJkk = str2;
        this.amountJkm = str3;
        this.amountJht = str4;
        this.amountTotal = str5;
        this.status = str6;
        this.quantity = str7;
        this.fullname = str8;
        this.transactionDate = str9;
        this.settlementDate = str10;
        this.customerIdentifier = str11;
        this.paymentMethod = str12;
        this.customField = str13;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getAmountJkk() {
        return this.amountJkk;
    }

    public final String getAmountJkm() {
        return this.amountJkm;
    }

    public final String getAmountJht() {
        return this.amountJht;
    }

    public final String getAmountTotal() {
        return this.amountTotal;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getFullname() {
        return this.fullname;
    }

    public final String getTransactionDate() {
        return this.transactionDate;
    }

    public final String getSettlementDate() {
        return this.settlementDate;
    }

    public final String getCustomerIdentifier() {
        return this.customerIdentifier;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getCustomField() {
        return this.customField;
    }
}
