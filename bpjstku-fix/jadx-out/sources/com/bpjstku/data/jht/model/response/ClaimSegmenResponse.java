package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u0018\u0010\u0010R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/bpjstku/data/jht/model/response/ClaimSegmenResponse;", "", "", "Lcom/bpjstku/data/jht/model/response/ListClaimSegmenItem;", "p0", "", "p1", "", "p2", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;ZLjava/lang/String;)Lcom/bpjstku/data/jht/model/response/ClaimSegmenResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "listClaimSegmen", "Ljava/util/List;", "getListClaimSegmen", "isSuccessful", "Z", "message", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClaimSegmenResponse {
    public static final int $stable = 8;

    @SerializedName("isSuccessful")
    private final boolean isSuccessful;

    @SerializedName("listClaimSegmen")
    private final List<ListClaimSegmenItem> listClaimSegmen;

    @SerializedName("message")
    private final String message;

    public ClaimSegmenResponse(List<ListClaimSegmenItem> list, boolean z, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.listClaimSegmen = list;
        this.isSuccessful = z;
        this.message = str;
    }

    public final List<ListClaimSegmenItem> getListClaimSegmen() {
        return this.listClaimSegmen;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClaimSegmenResponse copy$default(ClaimSegmenResponse claimSegmenResponse, List list, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = claimSegmenResponse.listClaimSegmen;
        }
        if ((i & 2) != 0) {
            z = claimSegmenResponse.isSuccessful;
        }
        if ((i & 4) != 0) {
            str = claimSegmenResponse.message;
        }
        return claimSegmenResponse.copy(list, z, str);
    }

    public final List<ListClaimSegmenItem> component1() {
        return this.listClaimSegmen;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ClaimSegmenResponse copy(List<ListClaimSegmenItem> p0, boolean p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new ClaimSegmenResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ClaimSegmenResponse)) {
            return false;
        }
        ClaimSegmenResponse claimSegmenResponse = (ClaimSegmenResponse) p0;
        return Intrinsics.areEqual(this.listClaimSegmen, claimSegmenResponse.listClaimSegmen) && this.isSuccessful == claimSegmenResponse.isSuccessful && Intrinsics.areEqual(this.message, claimSegmenResponse.message);
    }

    public final int hashCode() {
        return (((this.listClaimSegmen.hashCode() * 31) + Boolean.hashCode(this.isSuccessful)) * 31) + this.message.hashCode();
    }

    public final String toString() {
        List<ListClaimSegmenItem> list = this.listClaimSegmen;
        boolean z = this.isSuccessful;
        String str = this.message;
        StringBuilder sb = new StringBuilder("ClaimSegmenResponse(listClaimSegmen=");
        sb.append(list);
        sb.append(", isSuccessful=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
