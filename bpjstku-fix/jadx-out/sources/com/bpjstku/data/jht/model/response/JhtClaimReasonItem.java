package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\rR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\rR \u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012"}, d2 = {"Lcom/bpjstku/data/jht/model/response/JhtClaimReasonItem;", "", "", "p0", "p1", "p2", "p3", "", "Lcom/bpjstku/data/jht/model/response/JhtClaimReasonItemContribution;", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/bpjstku/data/jht/model/response/JhtClaimReasonItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodeTipeKlaim", "Ljava/lang/String;", "getKodeTipeKlaim", "kode", "getKode", "nama", "getNama", "companyName", "getCompanyName", "contributions", "Ljava/util/List;", "getContributions"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimReasonItem {
    public static final int $stable = 8;

    @SerializedName("companyName")
    private final String companyName;

    @SerializedName("contributions")
    private final List<JhtClaimReasonItemContribution> contributions;

    @SerializedName("kode")
    private final String kode;

    @SerializedName("kodeTipeKlaim")
    private final String kodeTipeKlaim;

    @SerializedName("nama")
    private final String nama;

    public JhtClaimReasonItem(String str, String str2, String str3, String str4, List<JhtClaimReasonItemContribution> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.kodeTipeKlaim = str;
        this.kode = str2;
        this.nama = str3;
        this.companyName = str4;
        this.contributions = list;
    }

    public final String getKodeTipeKlaim() {
        return this.kodeTipeKlaim;
    }

    public final String getKode() {
        return this.kode;
    }

    public final String getNama() {
        return this.nama;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final List<JhtClaimReasonItemContribution> getContributions() {
        return this.contributions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JhtClaimReasonItem copy$default(JhtClaimReasonItem jhtClaimReasonItem, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jhtClaimReasonItem.kodeTipeKlaim;
        }
        if ((i & 2) != 0) {
            str2 = jhtClaimReasonItem.kode;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = jhtClaimReasonItem.nama;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = jhtClaimReasonItem.companyName;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = jhtClaimReasonItem.contributions;
        }
        return jhtClaimReasonItem.copy(str, str5, str6, str7, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeTipeKlaim() {
        return this.kodeTipeKlaim;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKode() {
        return this.kode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNama() {
        return this.nama;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    public final List<JhtClaimReasonItemContribution> component5() {
        return this.contributions;
    }

    public final JhtClaimReasonItem copy(String p0, String p1, String p2, String p3, List<JhtClaimReasonItemContribution> p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new JhtClaimReasonItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtClaimReasonItem)) {
            return false;
        }
        JhtClaimReasonItem jhtClaimReasonItem = (JhtClaimReasonItem) p0;
        return Intrinsics.areEqual(this.kodeTipeKlaim, jhtClaimReasonItem.kodeTipeKlaim) && Intrinsics.areEqual(this.kode, jhtClaimReasonItem.kode) && Intrinsics.areEqual(this.nama, jhtClaimReasonItem.nama) && Intrinsics.areEqual(this.companyName, jhtClaimReasonItem.companyName) && Intrinsics.areEqual(this.contributions, jhtClaimReasonItem.contributions);
    }

    public final int hashCode() {
        return (((((((this.kodeTipeKlaim.hashCode() * 31) + this.kode.hashCode()) * 31) + this.nama.hashCode()) * 31) + this.companyName.hashCode()) * 31) + this.contributions.hashCode();
    }

    public final String toString() {
        String str = this.kodeTipeKlaim;
        String str2 = this.kode;
        String str3 = this.nama;
        String str4 = this.companyName;
        List<JhtClaimReasonItemContribution> list = this.contributions;
        StringBuilder sb = new StringBuilder("JhtClaimReasonItem(kodeTipeKlaim=");
        sb.append(str);
        sb.append(", kode=");
        sb.append(str2);
        sb.append(", nama=");
        sb.append(str3);
        sb.append(", companyName=");
        sb.append(str4);
        sb.append(", contributions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
