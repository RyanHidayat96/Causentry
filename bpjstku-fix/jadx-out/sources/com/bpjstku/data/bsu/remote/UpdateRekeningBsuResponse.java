package com.bpjstku.data.bsu.remote;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/bpjstku/data/bsu/remote/UpdateRekeningBsuResponse;", "", "", "p0", "", "p1", "p2", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/bsu/remote/UpdateRekeningBsuResponse;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "statusCode", "I", "getStatusCode", "message", "Ljava/lang/String;", "getMessage", "messageCode", "getMessageCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UpdateRekeningBsuResponse {
    public static final int $stable = 0;

    @SerializedName("message")
    private final String message;

    @SerializedName("messageCode")
    private final String messageCode;

    @SerializedName("statusCode")
    private final int statusCode;

    public UpdateRekeningBsuResponse(int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.statusCode = i;
        this.message = str;
        this.messageCode = str2;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageCode() {
        return this.messageCode;
    }

    public static /* synthetic */ UpdateRekeningBsuResponse copy$default(UpdateRekeningBsuResponse updateRekeningBsuResponse, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = updateRekeningBsuResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            str = updateRekeningBsuResponse.message;
        }
        if ((i2 & 4) != 0) {
            str2 = updateRekeningBsuResponse.messageCode;
        }
        return updateRekeningBsuResponse.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessageCode() {
        return this.messageCode;
    }

    public final UpdateRekeningBsuResponse copy(int p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new UpdateRekeningBsuResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UpdateRekeningBsuResponse)) {
            return false;
        }
        UpdateRekeningBsuResponse updateRekeningBsuResponse = (UpdateRekeningBsuResponse) p0;
        return this.statusCode == updateRekeningBsuResponse.statusCode && Intrinsics.areEqual(this.message, updateRekeningBsuResponse.message) && Intrinsics.areEqual(this.messageCode, updateRekeningBsuResponse.messageCode);
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.statusCode) * 31) + this.message.hashCode()) * 31) + this.messageCode.hashCode();
    }

    public final String toString() {
        int i = this.statusCode;
        String str = this.message;
        String str2 = this.messageCode;
        StringBuilder sb = new StringBuilder("UpdateRekeningBsuResponse(statusCode=");
        sb.append(i);
        sb.append(", message=");
        sb.append(str);
        sb.append(", messageCode=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
