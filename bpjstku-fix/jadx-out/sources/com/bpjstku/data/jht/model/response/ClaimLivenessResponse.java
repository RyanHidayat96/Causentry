package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\nR\"\u0010\u0019\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u001b"}, d2 = {"Lcom/bpjstku/data/jht/model/response/ClaimLivenessResponse;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/ClaimLivenessResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isSuspend", "Ljava/lang/String;", "isSuccessful", "setSuccessful", "(Ljava/lang/String;)V", "message", "getMessage", "setMessage", "statusCode", "getStatusCode", "setStatusCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClaimLivenessResponse {
    public static final int $stable = 8;

    @SerializedName("isSuccessful")
    private String isSuccessful;

    @SerializedName("isSuspend")
    private final String isSuspend;

    @SerializedName("message")
    private String message;

    @SerializedName("statusCode")
    private String statusCode;

    public ClaimLivenessResponse(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.isSuspend = str;
        this.isSuccessful = str2;
        this.message = str3;
        this.statusCode = str4;
    }

    public /* synthetic */ ClaimLivenessResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public final String isSuspend() {
        return this.isSuspend;
    }

    public final String isSuccessful() {
        return this.isSuccessful;
    }

    public final void setSuccessful(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isSuccessful = str;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final void setStatusCode(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.statusCode = str;
    }

    public ClaimLivenessResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ClaimLivenessResponse copy$default(ClaimLivenessResponse claimLivenessResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = claimLivenessResponse.isSuspend;
        }
        if ((i & 2) != 0) {
            str2 = claimLivenessResponse.isSuccessful;
        }
        if ((i & 4) != 0) {
            str3 = claimLivenessResponse.message;
        }
        if ((i & 8) != 0) {
            str4 = claimLivenessResponse.statusCode;
        }
        return claimLivenessResponse.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIsSuspend() {
        return this.isSuspend;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    public final ClaimLivenessResponse copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new ClaimLivenessResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ClaimLivenessResponse)) {
            return false;
        }
        ClaimLivenessResponse claimLivenessResponse = (ClaimLivenessResponse) p0;
        return Intrinsics.areEqual(this.isSuspend, claimLivenessResponse.isSuspend) && Intrinsics.areEqual(this.isSuccessful, claimLivenessResponse.isSuccessful) && Intrinsics.areEqual(this.message, claimLivenessResponse.message) && Intrinsics.areEqual(this.statusCode, claimLivenessResponse.statusCode);
    }

    public final int hashCode() {
        return (((((this.isSuspend.hashCode() * 31) + this.isSuccessful.hashCode()) * 31) + this.message.hashCode()) * 31) + this.statusCode.hashCode();
    }

    public final String toString() {
        String str = this.isSuspend;
        String str2 = this.isSuccessful;
        String str3 = this.message;
        String str4 = this.statusCode;
        StringBuilder sb = new StringBuilder("ClaimLivenessResponse(isSuspend=");
        sb.append(str);
        sb.append(", isSuccessful=");
        sb.append(str2);
        sb.append(", message=");
        sb.append(str3);
        sb.append(", statusCode=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
