package com.bpjstku.data.multibiller.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJH\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\fR$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010#R$\u0010&\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u001eR$\u0010)\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u001e"}, d2 = {"Lcom/bpjstku/data/multibiller/model/response/MultiBillerTokenResponse;", "", "", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/multibiller/model/response/MultiBillerTokenResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "authId", "Ljava/lang/String;", "getAuthId", "setAuthId", "(Ljava/lang/String;)V", "found", "Z", "getFound", "setFound", "(Z)V", "isSuccessful", "setSuccessful", "token", "getToken", "setToken", "userToken", "getUserToken", "setUserToken"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerTokenResponse {
    public static final int $stable = 8;

    @SerializedName("auth_id")
    private String authId;

    @SerializedName("found")
    private boolean found;

    @SerializedName("isSuccessful")
    private boolean isSuccessful;

    @SerializedName("token")
    private String token;

    @SerializedName("user_token")
    private String userToken;

    public MultiBillerTokenResponse(String str, boolean z, boolean z2, String str2, String str3) {
        this.authId = str;
        this.found = z;
        this.isSuccessful = z2;
        this.token = str2;
        this.userToken = str3;
    }

    public /* synthetic */ MultiBillerTokenResponse(String str, boolean z, boolean z2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }

    public final String getAuthId() {
        return this.authId;
    }

    public final void setAuthId(String str) {
        this.authId = str;
    }

    public final boolean getFound() {
        return this.found;
    }

    public final void setFound(boolean z) {
        this.found = z;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final void setSuccessful(boolean z) {
        this.isSuccessful = z;
    }

    public final String getToken() {
        return this.token;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public final void setUserToken(String str) {
        this.userToken = str;
    }

    public MultiBillerTokenResponse() {
        this(null, false, false, null, null, 31, null);
    }

    public static /* synthetic */ MultiBillerTokenResponse copy$default(MultiBillerTokenResponse multiBillerTokenResponse, String str, boolean z, boolean z2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiBillerTokenResponse.authId;
        }
        if ((i & 2) != 0) {
            z = multiBillerTokenResponse.found;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = multiBillerTokenResponse.isSuccessful;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            str2 = multiBillerTokenResponse.token;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = multiBillerTokenResponse.userToken;
        }
        return multiBillerTokenResponse.copy(str, z3, z4, str4, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthId() {
        return this.authId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFound() {
        return this.found;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserToken() {
        return this.userToken;
    }

    public final MultiBillerTokenResponse copy(String p0, boolean p1, boolean p2, String p3, String p4) {
        return new MultiBillerTokenResponse(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MultiBillerTokenResponse)) {
            return false;
        }
        MultiBillerTokenResponse multiBillerTokenResponse = (MultiBillerTokenResponse) p0;
        return Intrinsics.areEqual(this.authId, multiBillerTokenResponse.authId) && this.found == multiBillerTokenResponse.found && this.isSuccessful == multiBillerTokenResponse.isSuccessful && Intrinsics.areEqual(this.token, multiBillerTokenResponse.token) && Intrinsics.areEqual(this.userToken, multiBillerTokenResponse.userToken);
    }

    public final int hashCode() {
        String str = this.authId;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Boolean.hashCode(this.found);
        int iHashCode3 = Boolean.hashCode(this.isSuccessful);
        String str2 = this.token;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.userToken;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.authId;
        boolean z = this.found;
        boolean z2 = this.isSuccessful;
        String str2 = this.token;
        String str3 = this.userToken;
        StringBuilder sb = new StringBuilder("MultiBillerTokenResponse(authId=");
        sb.append(str);
        sb.append(", found=");
        sb.append(z);
        sb.append(", isSuccessful=");
        sb.append(z2);
        sb.append(", token=");
        sb.append(str2);
        sb.append(", userToken=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
