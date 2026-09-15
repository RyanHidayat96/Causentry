package com.bpjstku.data.queueing.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0019\u0010\u000eR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/queueing/model/response/GetDataAntrianResponse;", "", "", "p0", "", "p1", "p2", "Lcom/bpjstku/data/queueing/model/response/AntrianData;", "p3", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/queueing/model/response/AntrianData;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/bpjstku/data/queueing/model/response/AntrianData;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/queueing/model/response/AntrianData;)Lcom/bpjstku/data/queueing/model/response/GetDataAntrianResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isSuccessful", "Ljava/lang/Boolean;", "message", "Ljava/lang/String;", "getMessage", "qrCode", "getQrCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/queueing/model/response/AntrianData;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetDataAntrianResponse {
    public static final int $stable = 0;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final AntrianData data;

    @SerializedName("isSuccessful")
    private final Boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    @SerializedName("qrCode")
    private final String qrCode;

    public GetDataAntrianResponse(Boolean bool, String str, String str2, AntrianData antrianData) {
        this.isSuccessful = bool;
        this.message = str;
        this.qrCode = str2;
        this.data = antrianData;
    }

    public final Boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getQrCode() {
        return this.qrCode;
    }

    public final AntrianData getData() {
        return this.data;
    }

    public static /* synthetic */ GetDataAntrianResponse copy$default(GetDataAntrianResponse getDataAntrianResponse, Boolean bool, String str, String str2, AntrianData antrianData, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = getDataAntrianResponse.isSuccessful;
        }
        if ((i & 2) != 0) {
            str = getDataAntrianResponse.message;
        }
        if ((i & 4) != 0) {
            str2 = getDataAntrianResponse.qrCode;
        }
        if ((i & 8) != 0) {
            antrianData = getDataAntrianResponse.data;
        }
        return getDataAntrianResponse.copy(bool, str, str2, antrianData);
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
    public final String getQrCode() {
        return this.qrCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AntrianData getData() {
        return this.data;
    }

    public final GetDataAntrianResponse copy(Boolean p0, String p1, String p2, AntrianData p3) {
        return new GetDataAntrianResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GetDataAntrianResponse)) {
            return false;
        }
        GetDataAntrianResponse getDataAntrianResponse = (GetDataAntrianResponse) p0;
        return Intrinsics.areEqual(this.isSuccessful, getDataAntrianResponse.isSuccessful) && Intrinsics.areEqual(this.message, getDataAntrianResponse.message) && Intrinsics.areEqual(this.qrCode, getDataAntrianResponse.qrCode) && Intrinsics.areEqual(this.data, getDataAntrianResponse.data);
    }

    public final int hashCode() {
        Boolean bool = this.isSuccessful;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.message;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.qrCode;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        AntrianData antrianData = this.data;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (antrianData != null ? antrianData.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.isSuccessful;
        String str = this.message;
        String str2 = this.qrCode;
        AntrianData antrianData = this.data;
        StringBuilder sb = new StringBuilder("GetDataAntrianResponse(isSuccessful=");
        sb.append(bool);
        sb.append(", message=");
        sb.append(str);
        sb.append(", qrCode=");
        sb.append(str2);
        sb.append(", data=");
        sb.append(antrianData);
        sb.append(")");
        return sb.toString();
    }
}
