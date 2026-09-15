package com.bpjstku.data.multibiller.model.response;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010!R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010!R$\u0010(\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010!R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010!R$\u0010.\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010!R$\u00101\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010!"}, d2 = {"Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "createdAt", "Ljava/lang/String;", "getCreatedAt", "setCreatedAt", "(Ljava/lang/String;)V", "customerBillId", "getCustomerBillId", "setCustomerBillId", "externalCustomerId", "getExternalCustomerId", "setExternalCustomerId", "name", "getName", "setName", "email", "getEmail", "setEmail", HintConstants.AUTOFILL_HINT_PHONE, "getPhone", "setPhone", "accessToken", "getAccessToken", "setAccessToken"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerRegistrationItem {
    public static final int $stable = 8;

    @SerializedName("token")
    private String accessToken;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("customer_bill_id")
    private String customerBillId;

    @SerializedName("email")
    private String email;

    @SerializedName("external_customer_id")
    private String externalCustomerId;

    @SerializedName("name")
    private String name;

    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE)
    private String phone;

    public MultiBillerRegistrationItem(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.createdAt = str;
        this.customerBillId = str2;
        this.externalCustomerId = str3;
        this.name = str4;
        this.email = str5;
        this.phone = str6;
        this.accessToken = str7;
    }

    public /* synthetic */ MultiBillerRegistrationItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final String getCustomerBillId() {
        return this.customerBillId;
    }

    public final void setCustomerBillId(String str) {
        this.customerBillId = str;
    }

    public final String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public final void setExternalCustomerId(String str) {
        this.externalCustomerId = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public MultiBillerRegistrationItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ MultiBillerRegistrationItem copy$default(MultiBillerRegistrationItem multiBillerRegistrationItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiBillerRegistrationItem.createdAt;
        }
        if ((i & 2) != 0) {
            str2 = multiBillerRegistrationItem.customerBillId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = multiBillerRegistrationItem.externalCustomerId;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = multiBillerRegistrationItem.name;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = multiBillerRegistrationItem.email;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = multiBillerRegistrationItem.phone;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = multiBillerRegistrationItem.accessToken;
        }
        return multiBillerRegistrationItem.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCustomerBillId() {
        return this.customerBillId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final MultiBillerRegistrationItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6) {
        return new MultiBillerRegistrationItem(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MultiBillerRegistrationItem)) {
            return false;
        }
        MultiBillerRegistrationItem multiBillerRegistrationItem = (MultiBillerRegistrationItem) p0;
        return Intrinsics.areEqual(this.createdAt, multiBillerRegistrationItem.createdAt) && Intrinsics.areEqual(this.customerBillId, multiBillerRegistrationItem.customerBillId) && Intrinsics.areEqual(this.externalCustomerId, multiBillerRegistrationItem.externalCustomerId) && Intrinsics.areEqual(this.name, multiBillerRegistrationItem.name) && Intrinsics.areEqual(this.email, multiBillerRegistrationItem.email) && Intrinsics.areEqual(this.phone, multiBillerRegistrationItem.phone) && Intrinsics.areEqual(this.accessToken, multiBillerRegistrationItem.accessToken);
    }

    public final int hashCode() {
        String str = this.createdAt;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.customerBillId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.externalCustomerId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.name;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.email;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.phone;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.accessToken;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.createdAt;
        String str2 = this.customerBillId;
        String str3 = this.externalCustomerId;
        String str4 = this.name;
        String str5 = this.email;
        String str6 = this.phone;
        String str7 = this.accessToken;
        StringBuilder sb = new StringBuilder("MultiBillerRegistrationItem(createdAt=");
        sb.append(str);
        sb.append(", customerBillId=");
        sb.append(str2);
        sb.append(", externalCustomerId=");
        sb.append(str3);
        sb.append(", name=");
        sb.append(str4);
        sb.append(", email=");
        sb.append(str5);
        sb.append(", phone=");
        sb.append(str6);
        sb.append(", accessToken=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }
}
