package com.bpjstku.data.lib;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\nR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/bpjstku/data/lib/ErrorResponse;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/lib/ErrorResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isSuccessful", "Ljava/lang/Boolean;", "message", "Ljava/lang/String;", "getMessage", "statusCode", "getStatusCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ErrorResponse {
    public static final int $stable = 0;

    @SerializedName("isSuccessful")
    public Boolean isSuccessful;

    @SerializedName("message")
    public String message;

    @SerializedName("statusCode")
    public String statusCode;

    public ErrorResponse(Boolean bool, String str, String str2) {
        this.isSuccessful = bool;
        this.message = str;
        this.statusCode = str2;
    }

    public final Boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = errorResponse.isSuccessful;
        }
        if ((i & 2) != 0) {
            str = errorResponse.message;
        }
        if ((i & 4) != 0) {
            str2 = errorResponse.statusCode;
        }
        return errorResponse.copy(bool, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    public final ErrorResponse copy(Boolean p0, String p1, String p2) {
        return new ErrorResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) p0;
        return Intrinsics.areEqual(this.isSuccessful, errorResponse.isSuccessful) && Intrinsics.areEqual(this.message, errorResponse.message) && Intrinsics.areEqual(this.statusCode, errorResponse.statusCode);
    }

    public final int hashCode() {
        Boolean bool = this.isSuccessful;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.message;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.statusCode;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.isSuccessful;
        String str = this.message;
        String str2 = this.statusCode;
        StringBuilder sb = new StringBuilder("ErrorResponse(isSuccessful=");
        sb.append(bool);
        sb.append(", message=");
        sb.append(str);
        sb.append(", statusCode=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ErrorResponse() {
    }
}
