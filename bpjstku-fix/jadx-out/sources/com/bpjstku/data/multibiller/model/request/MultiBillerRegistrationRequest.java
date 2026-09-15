package com.bpjstku.data.multibiller.model.request;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\fR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\fR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\fR\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\f"}, d2 = {"Lcom/bpjstku/data/multibiller/model/request/MultiBillerRegistrationRequest;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/multibiller/model/request/MultiBillerRegistrationRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "name", "Ljava/lang/String;", "getName", "email", "getEmail", HintConstants.AUTOFILL_HINT_PHONE, "getPhone", "accessToken", "getAccessToken", "merchantId", "getMerchantId", "externalCustomerId", "getExternalCustomerId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerRegistrationRequest {
    public static final int $stable = 0;

    @SerializedName("token")
    private final String accessToken;

    @SerializedName("email")
    private final String email;

    @SerializedName("external_customer_id")
    private final String externalCustomerId;

    @SerializedName("merchant_id")
    private final String merchantId;

    @SerializedName("name")
    private final String name;

    @SerializedName("phone_number")
    private final String phone;

    public MultiBillerRegistrationRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.name = str;
        this.email = str2;
        this.phone = str3;
        this.accessToken = str4;
        this.merchantId = str5;
        this.externalCustomerId = str6;
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public static /* synthetic */ MultiBillerRegistrationRequest copy$default(MultiBillerRegistrationRequest multiBillerRegistrationRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiBillerRegistrationRequest.name;
        }
        if ((i & 2) != 0) {
            str2 = multiBillerRegistrationRequest.email;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = multiBillerRegistrationRequest.phone;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = multiBillerRegistrationRequest.accessToken;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = multiBillerRegistrationRequest.merchantId;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = multiBillerRegistrationRequest.externalCustomerId;
        }
        return multiBillerRegistrationRequest.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public final MultiBillerRegistrationRequest copy(String p0, String p1, String p2, String p3, String p4, String p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        return new MultiBillerRegistrationRequest(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MultiBillerRegistrationRequest)) {
            return false;
        }
        MultiBillerRegistrationRequest multiBillerRegistrationRequest = (MultiBillerRegistrationRequest) p0;
        return Intrinsics.areEqual(this.name, multiBillerRegistrationRequest.name) && Intrinsics.areEqual(this.email, multiBillerRegistrationRequest.email) && Intrinsics.areEqual(this.phone, multiBillerRegistrationRequest.phone) && Intrinsics.areEqual(this.accessToken, multiBillerRegistrationRequest.accessToken) && Intrinsics.areEqual(this.merchantId, multiBillerRegistrationRequest.merchantId) && Intrinsics.areEqual(this.externalCustomerId, multiBillerRegistrationRequest.externalCustomerId);
    }

    public final int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.email.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.accessToken.hashCode()) * 31) + this.merchantId.hashCode()) * 31) + this.externalCustomerId.hashCode();
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.email;
        String str3 = this.phone;
        String str4 = this.accessToken;
        String str5 = this.merchantId;
        String str6 = this.externalCustomerId;
        StringBuilder sb = new StringBuilder("MultiBillerRegistrationRequest(name=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", phone=");
        sb.append(str3);
        sb.append(", accessToken=");
        sb.append(str4);
        sb.append(", merchantId=");
        sb.append(str5);
        sb.append(", externalCustomerId=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
