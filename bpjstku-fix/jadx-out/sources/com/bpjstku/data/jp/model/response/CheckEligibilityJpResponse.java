package com.bpjstku.data.jp.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/bpjstku/data/jp/model/response/CheckEligibilityJpResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jp/model/response/CheckEligibilityJpResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "statusEligible", "Ljava/lang/String;", "getStatusEligible", "statusEksisKonfirmasi", "getStatusEksisKonfirmasi", "keterangan", "getKeterangan", "signature", "getSignature"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckEligibilityJpResponse extends BaseItem {
    public static final int $stable = 0;

    @SerializedName("keterangan")
    private final String keterangan;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("statusEksisKonfirmasi")
    private final String statusEksisKonfirmasi;

    @SerializedName("statusEligible")
    private final String statusEligible;

    public final String getStatusEligible() {
        return this.statusEligible;
    }

    public final String getStatusEksisKonfirmasi() {
        return this.statusEksisKonfirmasi;
    }

    public final String getKeterangan() {
        return this.keterangan;
    }

    public final String getSignature() {
        return this.signature;
    }

    public CheckEligibilityJpResponse(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.statusEligible = str;
        this.statusEksisKonfirmasi = str2;
        this.keterangan = str3;
        this.signature = str4;
    }

    public static /* synthetic */ CheckEligibilityJpResponse copy$default(CheckEligibilityJpResponse checkEligibilityJpResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkEligibilityJpResponse.statusEligible;
        }
        if ((i & 2) != 0) {
            str2 = checkEligibilityJpResponse.statusEksisKonfirmasi;
        }
        if ((i & 4) != 0) {
            str3 = checkEligibilityJpResponse.keterangan;
        }
        if ((i & 8) != 0) {
            str4 = checkEligibilityJpResponse.signature;
        }
        return checkEligibilityJpResponse.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusEligible() {
        return this.statusEligible;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusEksisKonfirmasi() {
        return this.statusEksisKonfirmasi;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKeterangan() {
        return this.keterangan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final CheckEligibilityJpResponse copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new CheckEligibilityJpResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckEligibilityJpResponse)) {
            return false;
        }
        CheckEligibilityJpResponse checkEligibilityJpResponse = (CheckEligibilityJpResponse) p0;
        return Intrinsics.areEqual(this.statusEligible, checkEligibilityJpResponse.statusEligible) && Intrinsics.areEqual(this.statusEksisKonfirmasi, checkEligibilityJpResponse.statusEksisKonfirmasi) && Intrinsics.areEqual(this.keterangan, checkEligibilityJpResponse.keterangan) && Intrinsics.areEqual(this.signature, checkEligibilityJpResponse.signature);
    }

    public final int hashCode() {
        return (((((this.statusEligible.hashCode() * 31) + this.statusEksisKonfirmasi.hashCode()) * 31) + this.keterangan.hashCode()) * 31) + this.signature.hashCode();
    }

    public final String toString() {
        String str = this.statusEligible;
        String str2 = this.statusEksisKonfirmasi;
        String str3 = this.keterangan;
        String str4 = this.signature;
        StringBuilder sb = new StringBuilder("CheckEligibilityJpResponse(statusEligible=");
        sb.append(str);
        sb.append(", statusEksisKonfirmasi=");
        sb.append(str2);
        sb.append(", keterangan=");
        sb.append(str3);
        sb.append(", signature=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
