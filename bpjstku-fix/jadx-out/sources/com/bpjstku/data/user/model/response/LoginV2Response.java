package com.bpjstku.data.user.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\rR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\rR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\rR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\rR\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\rR\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\rR\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\r"}, d2 = {"Lcom/bpjstku/data/user/model/response/LoginV2Response;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/user/model/response/LoginV2Response;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "titleMessage", "Ljava/lang/String;", "getTitleMessage", "accessToken", "getAccessToken", "refreshToken", "getRefreshToken", "jenisForm", "getJenisForm", "transactionId", "getTransactionId", "ret", "getRet", "deviceId", "getDeviceId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoginV2Response extends BaseItem {
    public static final int $stable = 0;

    @SerializedName("accessToken")
    private final String accessToken;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("jenisForm")
    private final String jenisForm;

    @SerializedName("refreshToken")
    private final String refreshToken;

    @SerializedName("ret")
    private final String ret;

    @SerializedName("titleMessage")
    private final String titleMessage;

    @SerializedName("transactionId")
    private final String transactionId;

    public final String getTitleMessage() {
        return this.titleMessage;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getJenisForm() {
        return this.jenisForm;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getRet() {
        return this.ret;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public LoginV2Response(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.titleMessage = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.jenisForm = str4;
        this.transactionId = str5;
        this.ret = str6;
        this.deviceId = str7;
    }

    public static /* synthetic */ LoginV2Response copy$default(LoginV2Response loginV2Response, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginV2Response.titleMessage;
        }
        if ((i & 2) != 0) {
            str2 = loginV2Response.accessToken;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = loginV2Response.refreshToken;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = loginV2Response.jenisForm;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = loginV2Response.transactionId;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = loginV2Response.ret;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = loginV2Response.deviceId;
        }
        return loginV2Response.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleMessage() {
        return this.titleMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJenisForm() {
        return this.jenisForm;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRet() {
        return this.ret;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final LoginV2Response copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6) {
        return new LoginV2Response(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LoginV2Response)) {
            return false;
        }
        LoginV2Response loginV2Response = (LoginV2Response) p0;
        return Intrinsics.areEqual(this.titleMessage, loginV2Response.titleMessage) && Intrinsics.areEqual(this.accessToken, loginV2Response.accessToken) && Intrinsics.areEqual(this.refreshToken, loginV2Response.refreshToken) && Intrinsics.areEqual(this.jenisForm, loginV2Response.jenisForm) && Intrinsics.areEqual(this.transactionId, loginV2Response.transactionId) && Intrinsics.areEqual(this.ret, loginV2Response.ret) && Intrinsics.areEqual(this.deviceId, loginV2Response.deviceId);
    }

    public final int hashCode() {
        String str = this.titleMessage;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.accessToken;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.refreshToken;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.jenisForm;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.transactionId;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.ret;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.deviceId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.titleMessage;
        String str2 = this.accessToken;
        String str3 = this.refreshToken;
        String str4 = this.jenisForm;
        String str5 = this.transactionId;
        String str6 = this.ret;
        String str7 = this.deviceId;
        StringBuilder sb = new StringBuilder("LoginV2Response(titleMessage=");
        sb.append(str);
        sb.append(", accessToken=");
        sb.append(str2);
        sb.append(", refreshToken=");
        sb.append(str3);
        sb.append(", jenisForm=");
        sb.append(str4);
        sb.append(", transactionId=");
        sb.append(str5);
        sb.append(", ret=");
        sb.append(str6);
        sb.append(", deviceId=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }
}
