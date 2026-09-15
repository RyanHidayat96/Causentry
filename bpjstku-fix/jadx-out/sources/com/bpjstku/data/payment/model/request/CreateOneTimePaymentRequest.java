package com.bpjstku.data.payment.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJN\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\fR\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\fR\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\f"}, d2 = {"Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "externalId", "Ljava/lang/String;", "getExternalId", "amount", "getAmount", "description", "getDescription", "customField", "getCustomField", "paymentMethod", "getPaymentMethod", "checkSum", "getCheckSum"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateOneTimePaymentRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("checksum")
    private final String checkSum;

    @SerializedName("custom_field")
    private final String customField;

    @SerializedName("description")
    private final String description;

    @SerializedName("external_id")
    private final String externalId;

    @SerializedName("payment_method")
    private final String paymentMethod;

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getCustomField() {
        return this.customField;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public CreateOneTimePaymentRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.externalId = str;
        this.amount = str2;
        this.description = str3;
        this.customField = str4;
        this.paymentMethod = str5;
        this.checkSum = str6;
    }

    public static /* synthetic */ CreateOneTimePaymentRequest copy$default(CreateOneTimePaymentRequest createOneTimePaymentRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createOneTimePaymentRequest.externalId;
        }
        if ((i & 2) != 0) {
            str2 = createOneTimePaymentRequest.amount;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = createOneTimePaymentRequest.description;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = createOneTimePaymentRequest.customField;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = createOneTimePaymentRequest.paymentMethod;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = createOneTimePaymentRequest.checkSum;
        }
        return createOneTimePaymentRequest.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomField() {
        return this.customField;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    public final CreateOneTimePaymentRequest copy(String p0, String p1, String p2, String p3, String p4, String p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new CreateOneTimePaymentRequest(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CreateOneTimePaymentRequest)) {
            return false;
        }
        CreateOneTimePaymentRequest createOneTimePaymentRequest = (CreateOneTimePaymentRequest) p0;
        return Intrinsics.areEqual(this.externalId, createOneTimePaymentRequest.externalId) && Intrinsics.areEqual(this.amount, createOneTimePaymentRequest.amount) && Intrinsics.areEqual(this.description, createOneTimePaymentRequest.description) && Intrinsics.areEqual(this.customField, createOneTimePaymentRequest.customField) && Intrinsics.areEqual(this.paymentMethod, createOneTimePaymentRequest.paymentMethod) && Intrinsics.areEqual(this.checkSum, createOneTimePaymentRequest.checkSum);
    }

    public final int hashCode() {
        int iHashCode = this.externalId.hashCode();
        int iHashCode2 = this.amount.hashCode();
        int iHashCode3 = this.description.hashCode();
        int iHashCode4 = this.customField.hashCode();
        int iHashCode5 = this.paymentMethod.hashCode();
        String str = this.checkSum;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.externalId;
        String str2 = this.amount;
        String str3 = this.description;
        String str4 = this.customField;
        String str5 = this.paymentMethod;
        String str6 = this.checkSum;
        StringBuilder sb = new StringBuilder("CreateOneTimePaymentRequest(externalId=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", customField=");
        sb.append(str4);
        sb.append(", paymentMethod=");
        sb.append(str5);
        sb.append(", checkSum=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
