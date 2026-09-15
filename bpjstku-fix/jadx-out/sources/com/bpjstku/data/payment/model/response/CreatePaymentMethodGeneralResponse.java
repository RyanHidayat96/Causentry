package com.bpjstku.data.payment.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/payment/model/response/CreatePaymentMethodGeneralResponse;", "", "Lcom/bpjstku/data/payment/model/response/PaymentMethodResult;", "p0", "", "p1", "", "p2", "<init>", "(Lcom/bpjstku/data/payment/model/response/PaymentMethodResult;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Lcom/bpjstku/data/payment/model/response/PaymentMethodResult;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/bpjstku/data/payment/model/response/PaymentMethodResult;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/CreatePaymentMethodGeneralResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/payment/model/response/PaymentMethodResult;", "getData", "isSuccessful", "Ljava/lang/Boolean;", "message", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreatePaymentMethodGeneralResponse {
    public static final int $stable = 8;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final PaymentMethodResult data;

    @SerializedName("isSuccessful")
    private final Boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    public CreatePaymentMethodGeneralResponse(PaymentMethodResult paymentMethodResult, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(paymentMethodResult, "");
        this.data = paymentMethodResult;
        this.isSuccessful = bool;
        this.message = str;
    }

    public final PaymentMethodResult getData() {
        return this.data;
    }

    public final Boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        return this.message;
    }

    public static /* synthetic */ CreatePaymentMethodGeneralResponse copy$default(CreatePaymentMethodGeneralResponse createPaymentMethodGeneralResponse, PaymentMethodResult paymentMethodResult, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentMethodResult = createPaymentMethodGeneralResponse.data;
        }
        if ((i & 2) != 0) {
            bool = createPaymentMethodGeneralResponse.isSuccessful;
        }
        if ((i & 4) != 0) {
            str = createPaymentMethodGeneralResponse.message;
        }
        return createPaymentMethodGeneralResponse.copy(paymentMethodResult, bool, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaymentMethodResult getData() {
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

    public final CreatePaymentMethodGeneralResponse copy(PaymentMethodResult p0, Boolean p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new CreatePaymentMethodGeneralResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CreatePaymentMethodGeneralResponse)) {
            return false;
        }
        CreatePaymentMethodGeneralResponse createPaymentMethodGeneralResponse = (CreatePaymentMethodGeneralResponse) p0;
        return Intrinsics.areEqual(this.data, createPaymentMethodGeneralResponse.data) && Intrinsics.areEqual(this.isSuccessful, createPaymentMethodGeneralResponse.isSuccessful) && Intrinsics.areEqual(this.message, createPaymentMethodGeneralResponse.message);
    }

    public final int hashCode() {
        int iHashCode = this.data.hashCode();
        Boolean bool = this.isSuccessful;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str = this.message;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        PaymentMethodResult paymentMethodResult = this.data;
        Boolean bool = this.isSuccessful;
        String str = this.message;
        StringBuilder sb = new StringBuilder("CreatePaymentMethodGeneralResponse(data=");
        sb.append(paymentMethodResult);
        sb.append(", isSuccessful=");
        sb.append(bool);
        sb.append(", message=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
