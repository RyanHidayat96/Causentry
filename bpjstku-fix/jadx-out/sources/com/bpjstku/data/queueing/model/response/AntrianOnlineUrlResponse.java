package com.bpjstku.data.queueing.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0017\u0010\rR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/bpjstku/data/queueing/model/response/AntrianOnlineUrlResponse;", "", "", "p0", "", "p1", "p2", "p3", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/queueing/model/response/AntrianOnlineUrlResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isSuccessful", "Ljava/lang/Boolean;", "message", "Ljava/lang/String;", "getMessage", "urlAntrianOnline", "getUrlAntrianOnline", "ret", "getRet"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AntrianOnlineUrlResponse {
    public static final int $stable = 0;

    @SerializedName("isSuccesfull")
    private final Boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    @SerializedName("ret")
    private final String ret;

    @SerializedName("urlAntrianOnline")
    private final String urlAntrianOnline;

    public AntrianOnlineUrlResponse(Boolean bool, String str, String str2, String str3) {
        this.isSuccessful = bool;
        this.message = str;
        this.urlAntrianOnline = str2;
        this.ret = str3;
    }

    public final Boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getUrlAntrianOnline() {
        return this.urlAntrianOnline;
    }

    public final String getRet() {
        return this.ret;
    }

    public static /* synthetic */ AntrianOnlineUrlResponse copy$default(AntrianOnlineUrlResponse antrianOnlineUrlResponse, Boolean bool, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = antrianOnlineUrlResponse.isSuccessful;
        }
        if ((i & 2) != 0) {
            str = antrianOnlineUrlResponse.message;
        }
        if ((i & 4) != 0) {
            str2 = antrianOnlineUrlResponse.urlAntrianOnline;
        }
        if ((i & 8) != 0) {
            str3 = antrianOnlineUrlResponse.ret;
        }
        return antrianOnlineUrlResponse.copy(bool, str, str2, str3);
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
    public final String getUrlAntrianOnline() {
        return this.urlAntrianOnline;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRet() {
        return this.ret;
    }

    public final AntrianOnlineUrlResponse copy(Boolean p0, String p1, String p2, String p3) {
        return new AntrianOnlineUrlResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AntrianOnlineUrlResponse)) {
            return false;
        }
        AntrianOnlineUrlResponse antrianOnlineUrlResponse = (AntrianOnlineUrlResponse) p0;
        return Intrinsics.areEqual(this.isSuccessful, antrianOnlineUrlResponse.isSuccessful) && Intrinsics.areEqual(this.message, antrianOnlineUrlResponse.message) && Intrinsics.areEqual(this.urlAntrianOnline, antrianOnlineUrlResponse.urlAntrianOnline) && Intrinsics.areEqual(this.ret, antrianOnlineUrlResponse.ret);
    }

    public final int hashCode() {
        Boolean bool = this.isSuccessful;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.message;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.urlAntrianOnline;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ret;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.isSuccessful;
        String str = this.message;
        String str2 = this.urlAntrianOnline;
        String str3 = this.ret;
        StringBuilder sb = new StringBuilder("AntrianOnlineUrlResponse(isSuccessful=");
        sb.append(bool);
        sb.append(", message=");
        sb.append(str);
        sb.append(", urlAntrianOnline=");
        sb.append(str2);
        sb.append(", ret=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
