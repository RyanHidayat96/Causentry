package com.bpjstku.data.setting.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0019\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010 "}, d2 = {"Lcom/bpjstku/data/setting/model/response/KeyResponse;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/bpjstku/data/setting/model/response/KeyResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "checkSum", "Ljava/lang/String;", "getCheckSum", "isSuccessful", "Z", "setSuccessful", "(Z)V", "message", "getMessage", "setMessage", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KeyResponse {
    public static final int $stable = 8;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("isSuccessful")
    private boolean isSuccessful;

    @SerializedName("message")
    private String message;

    public KeyResponse(String str, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.checkSum = str;
        this.isSuccessful = z;
        this.message = str2;
    }

    public /* synthetic */ KeyResponse(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2);
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final void setSuccessful(boolean z) {
        this.isSuccessful = z;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }

    public static /* synthetic */ KeyResponse copy$default(KeyResponse keyResponse, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keyResponse.checkSum;
        }
        if ((i & 2) != 0) {
            z = keyResponse.isSuccessful;
        }
        if ((i & 4) != 0) {
            str2 = keyResponse.message;
        }
        return keyResponse.copy(str, z, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final KeyResponse copy(String p0, boolean p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new KeyResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof KeyResponse)) {
            return false;
        }
        KeyResponse keyResponse = (KeyResponse) p0;
        return Intrinsics.areEqual(this.checkSum, keyResponse.checkSum) && this.isSuccessful == keyResponse.isSuccessful && Intrinsics.areEqual(this.message, keyResponse.message);
    }

    public final int hashCode() {
        return (((this.checkSum.hashCode() * 31) + Boolean.hashCode(this.isSuccessful)) * 31) + this.message.hashCode();
    }

    public final String toString() {
        String str = this.checkSum;
        boolean z = this.isSuccessful;
        String str2 = this.message;
        StringBuilder sb = new StringBuilder("KeyResponse(checkSum=");
        sb.append(str);
        sb.append(", isSuccessful=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
