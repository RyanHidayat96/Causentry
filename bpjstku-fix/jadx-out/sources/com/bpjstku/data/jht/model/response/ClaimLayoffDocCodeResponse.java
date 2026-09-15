package com.bpjstku.data.jht.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/bpjstku/data/jht/model/response/ClaimLayoffDocCodeResponse;", "", "", "p0", "", "p1", "", "Lcom/bpjstku/data/jht/model/response/ListCodeLayOffCode;", "p2", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(ZLjava/lang/String;Ljava/util/List;)Lcom/bpjstku/data/jht/model/response/ClaimLayoffDocCodeResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isSuccessful", "Z", "message", "Ljava/lang/String;", "getMessage", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClaimLayoffDocCodeResponse {
    public static final int $stable = 8;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final List<ListCodeLayOffCode> data;

    @SerializedName("isSuccessful")
    private final boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    public ClaimLayoffDocCodeResponse(boolean z, String str, List<ListCodeLayOffCode> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.isSuccessful = z;
        this.message = str;
        this.data = list;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<ListCodeLayOffCode> getData() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClaimLayoffDocCodeResponse copy$default(ClaimLayoffDocCodeResponse claimLayoffDocCodeResponse, boolean z, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = claimLayoffDocCodeResponse.isSuccessful;
        }
        if ((i & 2) != 0) {
            str = claimLayoffDocCodeResponse.message;
        }
        if ((i & 4) != 0) {
            list = claimLayoffDocCodeResponse.data;
        }
        return claimLayoffDocCodeResponse.copy(z, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<ListCodeLayOffCode> component3() {
        return this.data;
    }

    public final ClaimLayoffDocCodeResponse copy(boolean p0, String p1, List<ListCodeLayOffCode> p2) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new ClaimLayoffDocCodeResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ClaimLayoffDocCodeResponse)) {
            return false;
        }
        ClaimLayoffDocCodeResponse claimLayoffDocCodeResponse = (ClaimLayoffDocCodeResponse) p0;
        return this.isSuccessful == claimLayoffDocCodeResponse.isSuccessful && Intrinsics.areEqual(this.message, claimLayoffDocCodeResponse.message) && Intrinsics.areEqual(this.data, claimLayoffDocCodeResponse.data);
    }

    public final int hashCode() {
        return (((Boolean.hashCode(this.isSuccessful) * 31) + this.message.hashCode()) * 31) + this.data.hashCode();
    }

    public final String toString() {
        boolean z = this.isSuccessful;
        String str = this.message;
        List<ListCodeLayOffCode> list = this.data;
        StringBuilder sb = new StringBuilder("ClaimLayoffDocCodeResponse(isSuccessful=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str);
        sb.append(", data=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
