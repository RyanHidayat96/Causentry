package com.bpjstku.data.multibiller.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/multibiller/model/request/MultiBillerAuthTransactionRequest;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/multibiller/model/request/MultiBillerAuthTransactionRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "merchantId", "Ljava/lang/String;", "getMerchantId", "customerBillId", "getCustomerBillId", "accessToken", "getAccessToken", "tokenMotion", "getTokenMotion", "authMotion", "getAuthMotion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerAuthTransactionRequest {
    public static final int $stable = 0;

    @SerializedName("token")
    private final String accessToken;

    @SerializedName("auth_motion_pay")
    private final String authMotion;

    @SerializedName("customer_bill_id")
    private final String customerBillId;

    @SerializedName("merchant_id")
    private final String merchantId;

    @SerializedName("token_motion_pay")
    private final String tokenMotion;

    public MultiBillerAuthTransactionRequest(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.merchantId = str;
        this.customerBillId = str2;
        this.accessToken = str3;
        this.tokenMotion = str4;
        this.authMotion = str5;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getCustomerBillId() {
        return this.customerBillId;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getTokenMotion() {
        return this.tokenMotion;
    }

    public final String getAuthMotion() {
        return this.authMotion;
    }

    public static /* synthetic */ MultiBillerAuthTransactionRequest copy$default(MultiBillerAuthTransactionRequest multiBillerAuthTransactionRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiBillerAuthTransactionRequest.merchantId;
        }
        if ((i & 2) != 0) {
            str2 = multiBillerAuthTransactionRequest.customerBillId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = multiBillerAuthTransactionRequest.accessToken;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = multiBillerAuthTransactionRequest.tokenMotion;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = multiBillerAuthTransactionRequest.authMotion;
        }
        return multiBillerAuthTransactionRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCustomerBillId() {
        return this.customerBillId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTokenMotion() {
        return this.tokenMotion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAuthMotion() {
        return this.authMotion;
    }

    public final MultiBillerAuthTransactionRequest copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new MultiBillerAuthTransactionRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MultiBillerAuthTransactionRequest)) {
            return false;
        }
        MultiBillerAuthTransactionRequest multiBillerAuthTransactionRequest = (MultiBillerAuthTransactionRequest) p0;
        return Intrinsics.areEqual(this.merchantId, multiBillerAuthTransactionRequest.merchantId) && Intrinsics.areEqual(this.customerBillId, multiBillerAuthTransactionRequest.customerBillId) && Intrinsics.areEqual(this.accessToken, multiBillerAuthTransactionRequest.accessToken) && Intrinsics.areEqual(this.tokenMotion, multiBillerAuthTransactionRequest.tokenMotion) && Intrinsics.areEqual(this.authMotion, multiBillerAuthTransactionRequest.authMotion);
    }

    public final int hashCode() {
        return (((((((this.merchantId.hashCode() * 31) + this.customerBillId.hashCode()) * 31) + this.accessToken.hashCode()) * 31) + this.tokenMotion.hashCode()) * 31) + this.authMotion.hashCode();
    }

    public final String toString() {
        String str = this.merchantId;
        String str2 = this.customerBillId;
        String str3 = this.accessToken;
        String str4 = this.tokenMotion;
        String str5 = this.authMotion;
        StringBuilder sb = new StringBuilder("MultiBillerAuthTransactionRequest(merchantId=");
        sb.append(str);
        sb.append(", customerBillId=");
        sb.append(str2);
        sb.append(", accessToken=");
        sb.append(str3);
        sb.append(", tokenMotion=");
        sb.append(str4);
        sb.append(", authMotion=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
