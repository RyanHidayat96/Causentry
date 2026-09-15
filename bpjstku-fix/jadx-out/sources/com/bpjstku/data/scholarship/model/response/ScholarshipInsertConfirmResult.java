package com.bpjstku.data.scholarship.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u0019R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u0019"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertConfirmResult;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertConfirmResult;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kode", "Ljava/lang/String;", "getKode", "setKode", "(Ljava/lang/String;)V", "statusKirim", "getStatusKirim", "setStatusKirim", "keterangan", "getKeterangan", "setKeterangan"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipInsertConfirmResult {
    public static final int $stable = 8;

    @SerializedName("keteranganSukses")
    private String keterangan;

    @SerializedName("kodePengajuanKonfirmasi")
    private String kode;

    @SerializedName("statusKirim")
    private String statusKirim;

    public ScholarshipInsertConfirmResult(String str, String str2, String str3) {
        this.kode = str;
        this.statusKirim = str2;
        this.keterangan = str3;
    }

    public /* synthetic */ ScholarshipInsertConfirmResult(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getKode() {
        return this.kode;
    }

    public final void setKode(String str) {
        this.kode = str;
    }

    public final String getStatusKirim() {
        return this.statusKirim;
    }

    public final void setStatusKirim(String str) {
        this.statusKirim = str;
    }

    public final String getKeterangan() {
        return this.keterangan;
    }

    public final void setKeterangan(String str) {
        this.keterangan = str;
    }

    public ScholarshipInsertConfirmResult() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ScholarshipInsertConfirmResult copy$default(ScholarshipInsertConfirmResult scholarshipInsertConfirmResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipInsertConfirmResult.kode;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipInsertConfirmResult.statusKirim;
        }
        if ((i & 4) != 0) {
            str3 = scholarshipInsertConfirmResult.keterangan;
        }
        return scholarshipInsertConfirmResult.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKode() {
        return this.kode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusKirim() {
        return this.statusKirim;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKeterangan() {
        return this.keterangan;
    }

    public final ScholarshipInsertConfirmResult copy(String p0, String p1, String p2) {
        return new ScholarshipInsertConfirmResult(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipInsertConfirmResult)) {
            return false;
        }
        ScholarshipInsertConfirmResult scholarshipInsertConfirmResult = (ScholarshipInsertConfirmResult) p0;
        return Intrinsics.areEqual(this.kode, scholarshipInsertConfirmResult.kode) && Intrinsics.areEqual(this.statusKirim, scholarshipInsertConfirmResult.statusKirim) && Intrinsics.areEqual(this.keterangan, scholarshipInsertConfirmResult.keterangan);
    }

    public final int hashCode() {
        String str = this.kode;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.statusKirim;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.keterangan;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kode;
        String str2 = this.statusKirim;
        String str3 = this.keterangan;
        StringBuilder sb = new StringBuilder("ScholarshipInsertConfirmResult(kode=");
        sb.append(str);
        sb.append(", statusKirim=");
        sb.append(str2);
        sb.append(", keterangan=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
