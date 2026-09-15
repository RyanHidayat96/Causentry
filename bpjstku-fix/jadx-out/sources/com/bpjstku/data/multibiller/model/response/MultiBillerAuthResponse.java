package com.bpjstku.data.multibiller.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u001aR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u001a"}, d2 = {"Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "accessToken", "Ljava/lang/String;", "getAccessToken", "setAccessToken", "(Ljava/lang/String;)V", "refreshToken", "getRefreshToken", "setRefreshToken", "merchantId", "getMerchantId", "setMerchantId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerAuthResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("merchant_code")
    private String merchantId;

    @SerializedName("refresh_token")
    private String refreshToken;

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(String str) {
        this.merchantId = str;
    }

    public MultiBillerAuthResponse(String str, String str2, String str3) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.merchantId = str3;
    }

    public static /* synthetic */ MultiBillerAuthResponse copy$default(MultiBillerAuthResponse multiBillerAuthResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiBillerAuthResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = multiBillerAuthResponse.refreshToken;
        }
        if ((i & 4) != 0) {
            str3 = multiBillerAuthResponse.merchantId;
        }
        return multiBillerAuthResponse.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final MultiBillerAuthResponse copy(String p0, String p1, String p2) {
        return new MultiBillerAuthResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MultiBillerAuthResponse)) {
            return false;
        }
        MultiBillerAuthResponse multiBillerAuthResponse = (MultiBillerAuthResponse) p0;
        return Intrinsics.areEqual(this.accessToken, multiBillerAuthResponse.accessToken) && Intrinsics.areEqual(this.refreshToken, multiBillerAuthResponse.refreshToken) && Intrinsics.areEqual(this.merchantId, multiBillerAuthResponse.merchantId);
    }

    public final int hashCode() {
        String str = this.accessToken;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.refreshToken;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.merchantId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.merchantId;
        StringBuilder sb = new StringBuilder("MultiBillerAuthResponse(accessToken=");
        sb.append(str);
        sb.append(", refreshToken=");
        sb.append(str2);
        sb.append(", merchantId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
