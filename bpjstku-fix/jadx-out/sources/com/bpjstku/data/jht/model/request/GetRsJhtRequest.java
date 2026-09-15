package com.bpjstku.data.jht.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000bR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/jht/model/request/GetRsJhtRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/request/GetRsJhtRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "companyCode", "getCompanyCode", "segmentCode", "getSegmentCode", "kpj", "getKpj", "divitionCode", "getDivitionCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetRsJhtRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("kodePerusahaan")
    private final String companyCode;

    @SerializedName("kodeDivisi")
    private final String divitionCode;

    @SerializedName("email")
    private final String email;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("kodeSegmen")
    private final String segmentCode;

    public final String getEmail() {
        return this.email;
    }

    public final String getCompanyCode() {
        return this.companyCode;
    }

    public final String getSegmentCode() {
        return this.segmentCode;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getDivitionCode() {
        return this.divitionCode;
    }

    public GetRsJhtRequest(String str, String str2, String str3, String str4, String str5) {
        this.email = str;
        this.companyCode = str2;
        this.segmentCode = str3;
        this.kpj = str4;
        this.divitionCode = str5;
    }

    public static /* synthetic */ GetRsJhtRequest copy$default(GetRsJhtRequest getRsJhtRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRsJhtRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = getRsJhtRequest.companyCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = getRsJhtRequest.segmentCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = getRsJhtRequest.kpj;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = getRsJhtRequest.divitionCode;
        }
        return getRsJhtRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCompanyCode() {
        return this.companyCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSegmentCode() {
        return this.segmentCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDivitionCode() {
        return this.divitionCode;
    }

    public final GetRsJhtRequest copy(String p0, String p1, String p2, String p3, String p4) {
        return new GetRsJhtRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GetRsJhtRequest)) {
            return false;
        }
        GetRsJhtRequest getRsJhtRequest = (GetRsJhtRequest) p0;
        return Intrinsics.areEqual(this.email, getRsJhtRequest.email) && Intrinsics.areEqual(this.companyCode, getRsJhtRequest.companyCode) && Intrinsics.areEqual(this.segmentCode, getRsJhtRequest.segmentCode) && Intrinsics.areEqual(this.kpj, getRsJhtRequest.kpj) && Intrinsics.areEqual(this.divitionCode, getRsJhtRequest.divitionCode);
    }

    public final int hashCode() {
        String str = this.email;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.companyCode;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.segmentCode;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kpj;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.divitionCode;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.companyCode;
        String str3 = this.segmentCode;
        String str4 = this.kpj;
        String str5 = this.divitionCode;
        StringBuilder sb = new StringBuilder("GetRsJhtRequest(email=");
        sb.append(str);
        sb.append(", companyCode=");
        sb.append(str2);
        sb.append(", segmentCode=");
        sb.append(str3);
        sb.append(", kpj=");
        sb.append(str4);
        sb.append(", divitionCode=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
