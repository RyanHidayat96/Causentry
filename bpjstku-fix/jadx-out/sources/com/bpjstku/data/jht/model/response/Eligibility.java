package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/jht/model/response/Eligibility;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/Eligibility;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "signature", "Ljava/lang/String;", "getSignature", "areaCode", "getAreaCode", "areaName", "getAreaName", "officeCode", "getOfficeCode", "officeName", "getOfficeName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Eligibility {
    public static final int $stable = 0;

    @SerializedName("areaCode")
    private final String areaCode;

    @SerializedName("areaName")
    private final String areaName;

    @SerializedName("officeCode")
    private final String officeCode;

    @SerializedName("officeName")
    private final String officeName;

    @SerializedName("signature")
    private final String signature;

    public Eligibility(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.signature = str;
        this.areaCode = str2;
        this.areaName = str3;
        this.officeCode = str4;
        this.officeName = str5;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getAreaCode() {
        return this.areaCode;
    }

    public final String getAreaName() {
        return this.areaName;
    }

    public final String getOfficeCode() {
        return this.officeCode;
    }

    public final String getOfficeName() {
        return this.officeName;
    }

    public static /* synthetic */ Eligibility copy$default(Eligibility eligibility, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eligibility.signature;
        }
        if ((i & 2) != 0) {
            str2 = eligibility.areaCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = eligibility.areaName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = eligibility.officeCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = eligibility.officeName;
        }
        return eligibility.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAreaName() {
        return this.areaName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOfficeCode() {
        return this.officeCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOfficeName() {
        return this.officeName;
    }

    public final Eligibility copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new Eligibility(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Eligibility)) {
            return false;
        }
        Eligibility eligibility = (Eligibility) p0;
        return Intrinsics.areEqual(this.signature, eligibility.signature) && Intrinsics.areEqual(this.areaCode, eligibility.areaCode) && Intrinsics.areEqual(this.areaName, eligibility.areaName) && Intrinsics.areEqual(this.officeCode, eligibility.officeCode) && Intrinsics.areEqual(this.officeName, eligibility.officeName);
    }

    public final int hashCode() {
        return (((((((this.signature.hashCode() * 31) + this.areaCode.hashCode()) * 31) + this.areaName.hashCode()) * 31) + this.officeCode.hashCode()) * 31) + this.officeName.hashCode();
    }

    public final String toString() {
        String str = this.signature;
        String str2 = this.areaCode;
        String str3 = this.areaName;
        String str4 = this.officeCode;
        String str5 = this.officeName;
        StringBuilder sb = new StringBuilder("Eligibility(signature=");
        sb.append(str);
        sb.append(", areaCode=");
        sb.append(str2);
        sb.append(", areaName=");
        sb.append(str3);
        sb.append(", officeCode=");
        sb.append(str4);
        sb.append(", officeName=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
