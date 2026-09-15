package com.bpjstku.data.jht.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/bpjstku/data/jht/model/request/CheckEligibilityRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/request/CheckEligibilityRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodeSegmen", "Ljava/lang/String;", "getKodeSegmen", "kpj", "getKpj", "namaTk", "getNamaTk", "nik", "getNik"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckEligibilityRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("namaTk")
    private final String namaTk;

    @SerializedName("nik")
    private final String nik;

    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getNamaTk() {
        return this.namaTk;
    }

    public final String getNik() {
        return this.nik;
    }

    public CheckEligibilityRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.kodeSegmen = str;
        this.kpj = str2;
        this.namaTk = str3;
        this.nik = str4;
    }

    public static /* synthetic */ CheckEligibilityRequest copy$default(CheckEligibilityRequest checkEligibilityRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkEligibilityRequest.kodeSegmen;
        }
        if ((i & 2) != 0) {
            str2 = checkEligibilityRequest.kpj;
        }
        if ((i & 4) != 0) {
            str3 = checkEligibilityRequest.namaTk;
        }
        if ((i & 8) != 0) {
            str4 = checkEligibilityRequest.nik;
        }
        return checkEligibilityRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNamaTk() {
        return this.namaTk;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    public final CheckEligibilityRequest copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new CheckEligibilityRequest(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckEligibilityRequest)) {
            return false;
        }
        CheckEligibilityRequest checkEligibilityRequest = (CheckEligibilityRequest) p0;
        return Intrinsics.areEqual(this.kodeSegmen, checkEligibilityRequest.kodeSegmen) && Intrinsics.areEqual(this.kpj, checkEligibilityRequest.kpj) && Intrinsics.areEqual(this.namaTk, checkEligibilityRequest.namaTk) && Intrinsics.areEqual(this.nik, checkEligibilityRequest.nik);
    }

    public final int hashCode() {
        return (((((this.kodeSegmen.hashCode() * 31) + this.kpj.hashCode()) * 31) + this.namaTk.hashCode()) * 31) + this.nik.hashCode();
    }

    public final String toString() {
        String str = this.kodeSegmen;
        String str2 = this.kpj;
        String str3 = this.namaTk;
        String str4 = this.nik;
        StringBuilder sb = new StringBuilder("CheckEligibilityRequest(kodeSegmen=");
        sb.append(str);
        sb.append(", kpj=");
        sb.append(str2);
        sb.append(", namaTk=");
        sb.append(str3);
        sb.append(", nik=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
