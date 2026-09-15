package com.bpjstku.data.podcast.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\fR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\fR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\fR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\f"}, d2 = {"Lcom/bpjstku/data/podcast/model/response/CategoryList;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/podcast/model/response/CategoryList;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodeKategori", "Ljava/lang/String;", "getKodeKategori", "namaKategori", "getNamaKategori", "statusKategori", "getStatusKategori", "keterangan", "getKeterangan", "tglRekam", "getTglRekam", "petugasRekam", "getPetugasRekam"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CategoryList {
    public static final int $stable = 0;

    @SerializedName("keterangan")
    private final String keterangan;

    @SerializedName("kodeKategori")
    private final String kodeKategori;

    @SerializedName("namaKategori")
    private final String namaKategori;

    @SerializedName("petugasRekam")
    private final String petugasRekam;

    @SerializedName("statusKategori")
    private final String statusKategori;

    @SerializedName("tglRekam")
    private final String tglRekam;

    public CategoryList(String str, String str2, String str3, String str4, String str5, String str6) {
        this.kodeKategori = str;
        this.namaKategori = str2;
        this.statusKategori = str3;
        this.keterangan = str4;
        this.tglRekam = str5;
        this.petugasRekam = str6;
    }

    public final String getKodeKategori() {
        return this.kodeKategori;
    }

    public final String getNamaKategori() {
        return this.namaKategori;
    }

    public final String getStatusKategori() {
        return this.statusKategori;
    }

    public final String getKeterangan() {
        return this.keterangan;
    }

    public final String getTglRekam() {
        return this.tglRekam;
    }

    public final String getPetugasRekam() {
        return this.petugasRekam;
    }

    public static /* synthetic */ CategoryList copy$default(CategoryList categoryList, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoryList.kodeKategori;
        }
        if ((i & 2) != 0) {
            str2 = categoryList.namaKategori;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = categoryList.statusKategori;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = categoryList.keterangan;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = categoryList.tglRekam;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = categoryList.petugasRekam;
        }
        return categoryList.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeKategori() {
        return this.kodeKategori;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaKategori() {
        return this.namaKategori;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusKategori() {
        return this.statusKategori;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKeterangan() {
        return this.keterangan;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTglRekam() {
        return this.tglRekam;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPetugasRekam() {
        return this.petugasRekam;
    }

    public final CategoryList copy(String p0, String p1, String p2, String p3, String p4, String p5) {
        return new CategoryList(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CategoryList)) {
            return false;
        }
        CategoryList categoryList = (CategoryList) p0;
        return Intrinsics.areEqual(this.kodeKategori, categoryList.kodeKategori) && Intrinsics.areEqual(this.namaKategori, categoryList.namaKategori) && Intrinsics.areEqual(this.statusKategori, categoryList.statusKategori) && Intrinsics.areEqual(this.keterangan, categoryList.keterangan) && Intrinsics.areEqual(this.tglRekam, categoryList.tglRekam) && Intrinsics.areEqual(this.petugasRekam, categoryList.petugasRekam);
    }

    public final int hashCode() {
        String str = this.kodeKategori;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.namaKategori;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.statusKategori;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.keterangan;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tglRekam;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.petugasRekam;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kodeKategori;
        String str2 = this.namaKategori;
        String str3 = this.statusKategori;
        String str4 = this.keterangan;
        String str5 = this.tglRekam;
        String str6 = this.petugasRekam;
        StringBuilder sb = new StringBuilder("CategoryList(kodeKategori=");
        sb.append(str);
        sb.append(", namaKategori=");
        sb.append(str2);
        sb.append(", statusKategori=");
        sb.append(str3);
        sb.append(", keterangan=");
        sb.append(str4);
        sb.append(", tglRekam=");
        sb.append(str5);
        sb.append(", petugasRekam=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
