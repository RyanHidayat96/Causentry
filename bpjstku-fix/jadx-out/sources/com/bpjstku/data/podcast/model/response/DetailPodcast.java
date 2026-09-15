package com.bpjstku.data.podcast.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J¸\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b*\u0010\u0014R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0014R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0014R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u0014R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010\u0014R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\u0014R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010\u0014R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010\u0014R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b=\u0010\u0014R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010,\u001a\u0004\b>\u0010\u0014R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b@\u0010\u0014R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\bB\u0010\u0014R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\bD\u0010\u0014R\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\bE\u0010\u0014"}, d2 = {"Lcom/bpjstku/data/podcast/model/response/DetailPodcast;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/podcast/model/response/DetailPodcast;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodePengajuan", "Ljava/lang/String;", "getKodePengajuan", "kontenId", "getKontenId", "judul", "getJudul", "keterangan", "getKeterangan", "namaKategori", "getNamaKategori", "kodeKategori", "getKodeKategori", "thumbnailUrl", "getThumbnailUrl", "primaryContentUrl", "getPrimaryContentUrl", "secondaryContentUrl", "getSecondaryContentUrl", "isVisible", "tglRekam", "getTglRekam", "petugasRekam", "getPetugasRekam", "tipeDokumen", "getTipeDokumen", "isVideo"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DetailPodcast {
    public static final int $stable = 0;

    @SerializedName("isVideo")
    private final String isVideo;

    @SerializedName("isVisible")
    private final String isVisible;

    @SerializedName("judul")
    private final String judul;

    @SerializedName("keterangan")
    private final String keterangan;

    @SerializedName("kodeKategori")
    private final String kodeKategori;

    @SerializedName("kodePengajuan")
    private final String kodePengajuan;

    @SerializedName("kontenId")
    private final String kontenId;

    @SerializedName("namaKategori")
    private final String namaKategori;

    @SerializedName("petugasRekam")
    private final String petugasRekam;

    @SerializedName("primaryContentUrl")
    private final String primaryContentUrl;

    @SerializedName("secondaryContentUrl")
    private final String secondaryContentUrl;

    @SerializedName("tglRekam")
    private final String tglRekam;

    @SerializedName("thumbnailUrl")
    private final String thumbnailUrl;

    @SerializedName("tipeDokumen")
    private final String tipeDokumen;

    public DetailPodcast(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.kodePengajuan = str;
        this.kontenId = str2;
        this.judul = str3;
        this.keterangan = str4;
        this.namaKategori = str5;
        this.kodeKategori = str6;
        this.thumbnailUrl = str7;
        this.primaryContentUrl = str8;
        this.secondaryContentUrl = str9;
        this.isVisible = str10;
        this.tglRekam = str11;
        this.petugasRekam = str12;
        this.tipeDokumen = str13;
        this.isVideo = str14;
    }

    public final String getKodePengajuan() {
        return this.kodePengajuan;
    }

    public final String getKontenId() {
        return this.kontenId;
    }

    public final String getJudul() {
        return this.judul;
    }

    public final String getKeterangan() {
        return this.keterangan;
    }

    public final String getNamaKategori() {
        return this.namaKategori;
    }

    public final String getKodeKategori() {
        return this.kodeKategori;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getPrimaryContentUrl() {
        return this.primaryContentUrl;
    }

    public final String getSecondaryContentUrl() {
        return this.secondaryContentUrl;
    }

    public final String isVisible() {
        return this.isVisible;
    }

    public final String getTglRekam() {
        return this.tglRekam;
    }

    public final String getPetugasRekam() {
        return this.petugasRekam;
    }

    public final String getTipeDokumen() {
        return this.tipeDokumen;
    }

    public final String isVideo() {
        return this.isVideo;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodePengajuan() {
        return this.kodePengajuan;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIsVisible() {
        return this.isVisible;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTglRekam() {
        return this.tglRekam;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPetugasRekam() {
        return this.petugasRekam;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTipeDokumen() {
        return this.tipeDokumen;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getIsVideo() {
        return this.isVideo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKontenId() {
        return this.kontenId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJudul() {
        return this.judul;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKeterangan() {
        return this.keterangan;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNamaKategori() {
        return this.namaKategori;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getKodeKategori() {
        return this.kodeKategori;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPrimaryContentUrl() {
        return this.primaryContentUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSecondaryContentUrl() {
        return this.secondaryContentUrl;
    }

    public final DetailPodcast copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13) {
        return new DetailPodcast(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DetailPodcast)) {
            return false;
        }
        DetailPodcast detailPodcast = (DetailPodcast) p0;
        return Intrinsics.areEqual(this.kodePengajuan, detailPodcast.kodePengajuan) && Intrinsics.areEqual(this.kontenId, detailPodcast.kontenId) && Intrinsics.areEqual(this.judul, detailPodcast.judul) && Intrinsics.areEqual(this.keterangan, detailPodcast.keterangan) && Intrinsics.areEqual(this.namaKategori, detailPodcast.namaKategori) && Intrinsics.areEqual(this.kodeKategori, detailPodcast.kodeKategori) && Intrinsics.areEqual(this.thumbnailUrl, detailPodcast.thumbnailUrl) && Intrinsics.areEqual(this.primaryContentUrl, detailPodcast.primaryContentUrl) && Intrinsics.areEqual(this.secondaryContentUrl, detailPodcast.secondaryContentUrl) && Intrinsics.areEqual(this.isVisible, detailPodcast.isVisible) && Intrinsics.areEqual(this.tglRekam, detailPodcast.tglRekam) && Intrinsics.areEqual(this.petugasRekam, detailPodcast.petugasRekam) && Intrinsics.areEqual(this.tipeDokumen, detailPodcast.tipeDokumen) && Intrinsics.areEqual(this.isVideo, detailPodcast.isVideo);
    }

    public final int hashCode() {
        String str = this.kodePengajuan;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.kontenId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.judul;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.keterangan;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.namaKategori;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.kodeKategori;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.thumbnailUrl;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.primaryContentUrl;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.secondaryContentUrl;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.isVisible;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.tglRekam;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.petugasRekam;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.tipeDokumen;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.isVideo;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kodePengajuan;
        String str2 = this.kontenId;
        String str3 = this.judul;
        String str4 = this.keterangan;
        String str5 = this.namaKategori;
        String str6 = this.kodeKategori;
        String str7 = this.thumbnailUrl;
        String str8 = this.primaryContentUrl;
        String str9 = this.secondaryContentUrl;
        String str10 = this.isVisible;
        String str11 = this.tglRekam;
        String str12 = this.petugasRekam;
        String str13 = this.tipeDokumen;
        String str14 = this.isVideo;
        StringBuilder sb = new StringBuilder("DetailPodcast(kodePengajuan=");
        sb.append(str);
        sb.append(", kontenId=");
        sb.append(str2);
        sb.append(", judul=");
        sb.append(str3);
        sb.append(", keterangan=");
        sb.append(str4);
        sb.append(", namaKategori=");
        sb.append(str5);
        sb.append(", kodeKategori=");
        sb.append(str6);
        sb.append(", thumbnailUrl=");
        sb.append(str7);
        sb.append(", primaryContentUrl=");
        sb.append(str8);
        sb.append(", secondaryContentUrl=");
        sb.append(str9);
        sb.append(", isVisible=");
        sb.append(str10);
        sb.append(", tglRekam=");
        sb.append(str11);
        sb.append(", petugasRekam=");
        sb.append(str12);
        sb.append(", tipeDokumen=");
        sb.append(str13);
        sb.append(", isVideo=");
        sb.append(str14);
        sb.append(")");
        return sb.toString();
    }
}
