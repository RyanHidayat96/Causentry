package com.bpjstku.data.scholarship.model.response;

import androidx.core.app.NotificationCompat;
import com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0017J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0017JÊ\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b/\u0010\u0017R$\u00100\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00101\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u00104R$\u00108\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00101\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u00104R$\u0010;\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u0010\u0017\"\u0004\b=\u00104R$\u0010>\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u00101\u001a\u0004\b?\u0010\u0017\"\u0004\b@\u00104R$\u0010A\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u00101\u001a\u0004\bB\u0010\u0017\"\u0004\bC\u00104R$\u0010D\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u00101\u001a\u0004\bE\u0010\u0017\"\u0004\bF\u00104R$\u0010G\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u00101\u001a\u0004\bH\u0010\u0017\"\u0004\bI\u00104R$\u0010J\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u00101\u001a\u0004\bK\u0010\u0017\"\u0004\bL\u00104R$\u0010M\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u00101\u001a\u0004\bN\u0010\u0017\"\u0004\bO\u00104R$\u0010P\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u00101\u001a\u0004\bQ\u0010\u0017\"\u0004\bR\u00104R$\u0010S\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u00101\u001a\u0004\bT\u0010\u0017\"\u0004\bU\u00104R*\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010$\"\u0004\bY\u0010ZR$\u0010[\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u00101\u001a\u0004\b\\\u0010\u0017\"\u0004\b]\u00104R$\u0010^\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b^\u00101\u001a\u0004\b_\u0010\u0017\"\u0004\b`\u00104"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipDataDocumentForInsert;", "p12", "p13", "p14", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/util/List;", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipInfoItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "namaPenerima", "Ljava/lang/String;", "getNamaPenerima", "setNamaPenerima", "(Ljava/lang/String;)V", NotificationCompat.CATEGORY_STATUS, "getStatus", "setStatus", "nikPeserta", "getNikPeserta", "setNikPeserta", "namaPeserta", "getNamaPeserta", "setNamaPeserta", "kpjPeserta", "getKpjPeserta", "setKpjPeserta", "jenisBeasiswa", "getJenisBeasiswa", "setJenisBeasiswa", "jenjangPendidikan", "getJenjangPendidikan", "setJenjangPendidikan", "tahun", "getTahun", "setTahun", "tingkatKelas", "getTingkatKelas", "setTingkatKelas", "lembaga", "getLembaga", "setLembaga", "manfaat", "getManfaat", "setManfaat", "tanggal", "getTanggal", "setTanggal", "document", "Ljava/util/List;", "getDocument", "setDocument", "(Ljava/util/List;)V", "umur", "getUmur", "setUmur", "namaHubungan", "getNamaHubungan", "setNamaHubungan"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipInfoItem {
    public static final int $stable = 8;

    @SerializedName("document")
    private List<ScholarshipDataDocumentForInsert> document;

    @SerializedName("jenisBeasiswa")
    private String jenisBeasiswa;

    @SerializedName("jenjangPendidikan")
    private String jenjangPendidikan;

    @SerializedName("kpjPeserta")
    private String kpjPeserta;

    @SerializedName("lembaga")
    private String lembaga;

    @SerializedName("manfaat")
    private String manfaat;

    @SerializedName("namaHubungan")
    private String namaHubungan;

    @SerializedName("namaPenerima")
    private String namaPenerima;

    @SerializedName("namaPeserta")
    private String namaPeserta;

    @SerializedName("nikPeserta")
    private String nikPeserta;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;

    @SerializedName("tahun")
    private String tahun;

    @SerializedName("tanggal")
    private String tanggal;

    @SerializedName("tingkatKelas")
    private String tingkatKelas;

    @SerializedName("umur")
    private String umur;

    public ScholarshipInfoItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<ScholarshipDataDocumentForInsert> list, String str13, String str14) {
        this.namaPenerima = str;
        this.status = str2;
        this.nikPeserta = str3;
        this.namaPeserta = str4;
        this.kpjPeserta = str5;
        this.jenisBeasiswa = str6;
        this.jenjangPendidikan = str7;
        this.tahun = str8;
        this.tingkatKelas = str9;
        this.lembaga = str10;
        this.manfaat = str11;
        this.tanggal = str12;
        this.document = list;
        this.umur = str13;
        this.namaHubungan = str14;
    }

    public /* synthetic */ ScholarshipInfoItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? "" : str13, (i & 16384) == 0 ? str14 : "");
    }

    public final String getNamaPenerima() {
        return this.namaPenerima;
    }

    public final void setNamaPenerima(String str) {
        this.namaPenerima = str;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final String getNikPeserta() {
        return this.nikPeserta;
    }

    public final void setNikPeserta(String str) {
        this.nikPeserta = str;
    }

    public final String getNamaPeserta() {
        return this.namaPeserta;
    }

    public final void setNamaPeserta(String str) {
        this.namaPeserta = str;
    }

    public final String getKpjPeserta() {
        return this.kpjPeserta;
    }

    public final void setKpjPeserta(String str) {
        this.kpjPeserta = str;
    }

    public final String getJenisBeasiswa() {
        return this.jenisBeasiswa;
    }

    public final void setJenisBeasiswa(String str) {
        this.jenisBeasiswa = str;
    }

    public final String getJenjangPendidikan() {
        return this.jenjangPendidikan;
    }

    public final void setJenjangPendidikan(String str) {
        this.jenjangPendidikan = str;
    }

    public final String getTahun() {
        return this.tahun;
    }

    public final void setTahun(String str) {
        this.tahun = str;
    }

    public final String getTingkatKelas() {
        return this.tingkatKelas;
    }

    public final void setTingkatKelas(String str) {
        this.tingkatKelas = str;
    }

    public final String getLembaga() {
        return this.lembaga;
    }

    public final void setLembaga(String str) {
        this.lembaga = str;
    }

    public final String getManfaat() {
        return this.manfaat;
    }

    public final void setManfaat(String str) {
        this.manfaat = str;
    }

    public final String getTanggal() {
        return this.tanggal;
    }

    public final void setTanggal(String str) {
        this.tanggal = str;
    }

    public final List<ScholarshipDataDocumentForInsert> getDocument() {
        return this.document;
    }

    public final void setDocument(List<ScholarshipDataDocumentForInsert> list) {
        this.document = list;
    }

    public final String getUmur() {
        return this.umur;
    }

    public final void setUmur(String str) {
        this.umur = str;
    }

    public final String getNamaHubungan() {
        return this.namaHubungan;
    }

    public final void setNamaHubungan(String str) {
        this.namaHubungan = str;
    }

    public ScholarshipInfoItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNamaPenerima() {
        return this.namaPenerima;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLembaga() {
        return this.lembaga;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getManfaat() {
        return this.manfaat;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTanggal() {
        return this.tanggal;
    }

    public final List<ScholarshipDataDocumentForInsert> component13() {
        return this.document;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getUmur() {
        return this.umur;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getNamaHubungan() {
        return this.namaHubungan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNikPeserta() {
        return this.nikPeserta;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNamaPeserta() {
        return this.namaPeserta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKpjPeserta() {
        return this.kpjPeserta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJenisBeasiswa() {
        return this.jenisBeasiswa;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getJenjangPendidikan() {
        return this.jenjangPendidikan;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTahun() {
        return this.tahun;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTingkatKelas() {
        return this.tingkatKelas;
    }

    public final ScholarshipInfoItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, List<ScholarshipDataDocumentForInsert> p12, String p13, String p14) {
        return new ScholarshipInfoItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipInfoItem)) {
            return false;
        }
        ScholarshipInfoItem scholarshipInfoItem = (ScholarshipInfoItem) p0;
        return Intrinsics.areEqual(this.namaPenerima, scholarshipInfoItem.namaPenerima) && Intrinsics.areEqual(this.status, scholarshipInfoItem.status) && Intrinsics.areEqual(this.nikPeserta, scholarshipInfoItem.nikPeserta) && Intrinsics.areEqual(this.namaPeserta, scholarshipInfoItem.namaPeserta) && Intrinsics.areEqual(this.kpjPeserta, scholarshipInfoItem.kpjPeserta) && Intrinsics.areEqual(this.jenisBeasiswa, scholarshipInfoItem.jenisBeasiswa) && Intrinsics.areEqual(this.jenjangPendidikan, scholarshipInfoItem.jenjangPendidikan) && Intrinsics.areEqual(this.tahun, scholarshipInfoItem.tahun) && Intrinsics.areEqual(this.tingkatKelas, scholarshipInfoItem.tingkatKelas) && Intrinsics.areEqual(this.lembaga, scholarshipInfoItem.lembaga) && Intrinsics.areEqual(this.manfaat, scholarshipInfoItem.manfaat) && Intrinsics.areEqual(this.tanggal, scholarshipInfoItem.tanggal) && Intrinsics.areEqual(this.document, scholarshipInfoItem.document) && Intrinsics.areEqual(this.umur, scholarshipInfoItem.umur) && Intrinsics.areEqual(this.namaHubungan, scholarshipInfoItem.namaHubungan);
    }

    public final int hashCode() {
        String str = this.namaPenerima;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.status;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nikPeserta;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.namaPeserta;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.kpjPeserta;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.jenisBeasiswa;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.jenjangPendidikan;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tahun;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tingkatKelas;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.lembaga;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.manfaat;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tanggal;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        List<ScholarshipDataDocumentForInsert> list = this.document;
        int iHashCode13 = list == null ? 0 : list.hashCode();
        String str13 = this.umur;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.namaHubungan;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.namaPenerima;
        String str2 = this.status;
        String str3 = this.nikPeserta;
        String str4 = this.namaPeserta;
        String str5 = this.kpjPeserta;
        String str6 = this.jenisBeasiswa;
        String str7 = this.jenjangPendidikan;
        String str8 = this.tahun;
        String str9 = this.tingkatKelas;
        String str10 = this.lembaga;
        String str11 = this.manfaat;
        String str12 = this.tanggal;
        List<ScholarshipDataDocumentForInsert> list = this.document;
        String str13 = this.umur;
        String str14 = this.namaHubungan;
        StringBuilder sb = new StringBuilder("ScholarshipInfoItem(namaPenerima=");
        sb.append(str);
        sb.append(", status=");
        sb.append(str2);
        sb.append(", nikPeserta=");
        sb.append(str3);
        sb.append(", namaPeserta=");
        sb.append(str4);
        sb.append(", kpjPeserta=");
        sb.append(str5);
        sb.append(", jenisBeasiswa=");
        sb.append(str6);
        sb.append(", jenjangPendidikan=");
        sb.append(str7);
        sb.append(", tahun=");
        sb.append(str8);
        sb.append(", tingkatKelas=");
        sb.append(str9);
        sb.append(", lembaga=");
        sb.append(str10);
        sb.append(", manfaat=");
        sb.append(str11);
        sb.append(", tanggal=");
        sb.append(str12);
        sb.append(", document=");
        sb.append(list);
        sb.append(", umur=");
        sb.append(str13);
        sb.append(", namaHubungan=");
        sb.append(str14);
        sb.append(")");
        return sb.toString();
    }
}
