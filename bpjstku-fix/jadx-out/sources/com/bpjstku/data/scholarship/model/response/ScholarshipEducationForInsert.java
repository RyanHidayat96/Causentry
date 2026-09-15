package com.bpjstku.data.scholarship.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001bR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\u001b"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationForInsert;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationForInsert;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "jenjang", "Ljava/lang/String;", "getJenjang", "setJenjang", "(Ljava/lang/String;)V", "tingkat", "getTingkat", "setTingkat", "jenisBeasiswa", "getJenisBeasiswa", "setJenisBeasiswa", "lembaga", "getLembaga", "setLembaga"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipEducationForInsert {
    public static final int $stable = 8;

    @SerializedName("jenisBeasiswa")
    private String jenisBeasiswa;

    @SerializedName("jenjang")
    private String jenjang;

    @SerializedName("LembagaPendidikan")
    private String lembaga;

    @SerializedName("tingkat")
    private String tingkat;

    public ScholarshipEducationForInsert(String str, String str2, String str3, String str4) {
        this.jenjang = str;
        this.tingkat = str2;
        this.jenisBeasiswa = str3;
        this.lembaga = str4;
    }

    public final String getJenjang() {
        return this.jenjang;
    }

    public final void setJenjang(String str) {
        this.jenjang = str;
    }

    public final String getTingkat() {
        return this.tingkat;
    }

    public final void setTingkat(String str) {
        this.tingkat = str;
    }

    public final String getJenisBeasiswa() {
        return this.jenisBeasiswa;
    }

    public final void setJenisBeasiswa(String str) {
        this.jenisBeasiswa = str;
    }

    public final String getLembaga() {
        return this.lembaga;
    }

    public final void setLembaga(String str) {
        this.lembaga = str;
    }

    public static /* synthetic */ ScholarshipEducationForInsert copy$default(ScholarshipEducationForInsert scholarshipEducationForInsert, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipEducationForInsert.jenjang;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipEducationForInsert.tingkat;
        }
        if ((i & 4) != 0) {
            str3 = scholarshipEducationForInsert.jenisBeasiswa;
        }
        if ((i & 8) != 0) {
            str4 = scholarshipEducationForInsert.lembaga;
        }
        return scholarshipEducationForInsert.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJenjang() {
        return this.jenjang;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTingkat() {
        return this.tingkat;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJenisBeasiswa() {
        return this.jenisBeasiswa;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLembaga() {
        return this.lembaga;
    }

    public final ScholarshipEducationForInsert copy(String p0, String p1, String p2, String p3) {
        return new ScholarshipEducationForInsert(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipEducationForInsert)) {
            return false;
        }
        ScholarshipEducationForInsert scholarshipEducationForInsert = (ScholarshipEducationForInsert) p0;
        return Intrinsics.areEqual(this.jenjang, scholarshipEducationForInsert.jenjang) && Intrinsics.areEqual(this.tingkat, scholarshipEducationForInsert.tingkat) && Intrinsics.areEqual(this.jenisBeasiswa, scholarshipEducationForInsert.jenisBeasiswa) && Intrinsics.areEqual(this.lembaga, scholarshipEducationForInsert.lembaga);
    }

    public final int hashCode() {
        String str = this.jenjang;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tingkat;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.jenisBeasiswa;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lembaga;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.jenjang;
        String str2 = this.tingkat;
        String str3 = this.jenisBeasiswa;
        String str4 = this.lembaga;
        StringBuilder sb = new StringBuilder("ScholarshipEducationForInsert(jenjang=");
        sb.append(str);
        sb.append(", tingkat=");
        sb.append(str2);
        sb.append(", jenisBeasiswa=");
        sb.append(str3);
        sb.append(", lembaga=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
