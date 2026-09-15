package com.bpjstku.data.scholarship.model.request;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0011HÇ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÇ\u0003¢\u0006\u0004\b)\u0010*J¶\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÇ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020-2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b3\u0010\u0019R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0019R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u0019R\u001a\u00109\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u0019R\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\u0019R\u001a\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010\u0019R\u001a\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010\u0019R\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00105\u001a\u0004\bB\u0010\u0019R\u001a\u0010C\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u0010\u0019R\u001a\u0010E\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00105\u001a\u0004\bF\u0010\u0019R\u001a\u0010G\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u00105\u001a\u0004\bH\u0010\u0019R\u001a\u0010I\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bJ\u0010\u0019R\u001a\u0010K\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u00105\u001a\u0004\bL\u0010\u0019R\u001a\u0010M\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u00105\u001a\u0004\bN\u0010\u0019R\u001a\u0010O\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u00105\u001a\u0004\bP\u0010\u0019R\u001a\u0010Q\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010(R \u0010T\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010*"}, d2 = {"Lcom/bpjstku/data/scholarship/model/request/ScholarshipPersonForInsert;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipPhotoPersonForInsert;", "p14", "", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipDataDocumentForInsert;", "p15", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/scholarship/model/request/ScholarshipPhotoPersonForInsert;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "()Lcom/bpjstku/data/scholarship/model/request/ScholarshipPhotoPersonForInsert;", "component16", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/scholarship/model/request/ScholarshipPhotoPersonForInsert;Ljava/util/List;)Lcom/bpjstku/data/scholarship/model/request/ScholarshipPersonForInsert;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nikPenerima", "Ljava/lang/String;", "getNikPenerima", "namaPenerima", "getNamaPenerima", "noUrutPenerima", "getNoUrutPenerima", "tglLahirPenerima", "getTglLahirPenerima", "masihSekolah", "getMasihSekolah", "tahunBeasiswa", "getTahunBeasiswa", "statusNaik", "getStatusNaik", "kodeJenisBeasiswa", "getKodeJenisBeasiswa", "tingkatPendidikan", "getTingkatPendidikan", "oldTingkatPendidikan", "getOldTingkatPendidikan", "jenjangPendidikan", "getJenjangPendidikan", "lembagaPendidikan", "getLembagaPendidikan", "amount", "getAmount", "dokumenLengkap", "getDokumenLengkap", "photoPenerima", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipPhotoPersonForInsert;", "getPhotoPenerima", "documentBeasiswa", "Ljava/util/List;", "getDocumentBeasiswa"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipPersonForInsert {
    public static final int $stable = 8;

    @SerializedName("besarManfaat")
    private final String amount;

    @SerializedName("dataDokumenBeasiswa")
    private final List<ScholarshipDataDocumentForInsert> documentBeasiswa;

    @SerializedName("flagDokLengkap")
    private final String dokumenLengkap;

    @SerializedName("jenjangPendidikan")
    private final String jenjangPendidikan;

    @SerializedName("kodeJenisBeasiswa")
    private final String kodeJenisBeasiswa;

    @SerializedName("lembagaPendidikan")
    private final String lembagaPendidikan;

    @SerializedName("flagMasihSekolah")
    private final String masihSekolah;

    @SerializedName("namaPenerimaBeasiswa")
    private final String namaPenerima;

    @SerializedName("nikPenerimaBeasiswa")
    private final String nikPenerima;

    @SerializedName("noUrutPenerima")
    private final String noUrutPenerima;

    @SerializedName("oldTingkatPendidikan")
    private final String oldTingkatPendidikan;

    @SerializedName("photoPenerima")
    private final ScholarshipPhotoPersonForInsert photoPenerima;

    @SerializedName("statusNaik")
    private final String statusNaik;

    @SerializedName("tahunBeasiswa")
    private final String tahunBeasiswa;

    @SerializedName("tglLahirPenerimaBeasiswa")
    private final String tglLahirPenerima;

    @SerializedName("tingkatPendidikan")
    private final String tingkatPendidikan;

    public ScholarshipPersonForInsert(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, ScholarshipPhotoPersonForInsert scholarshipPhotoPersonForInsert, List<ScholarshipDataDocumentForInsert> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(scholarshipPhotoPersonForInsert, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.nikPenerima = str;
        this.namaPenerima = str2;
        this.noUrutPenerima = str3;
        this.tglLahirPenerima = str4;
        this.masihSekolah = str5;
        this.tahunBeasiswa = str6;
        this.statusNaik = str7;
        this.kodeJenisBeasiswa = str8;
        this.tingkatPendidikan = str9;
        this.oldTingkatPendidikan = str10;
        this.jenjangPendidikan = str11;
        this.lembagaPendidikan = str12;
        this.amount = str13;
        this.dokumenLengkap = str14;
        this.photoPenerima = scholarshipPhotoPersonForInsert;
        this.documentBeasiswa = list;
    }

    public final String getNikPenerima() {
        return this.nikPenerima;
    }

    public final String getNamaPenerima() {
        return this.namaPenerima;
    }

    public final String getNoUrutPenerima() {
        return this.noUrutPenerima;
    }

    public final String getTglLahirPenerima() {
        return this.tglLahirPenerima;
    }

    public final String getMasihSekolah() {
        return this.masihSekolah;
    }

    public final String getTahunBeasiswa() {
        return this.tahunBeasiswa;
    }

    public final String getStatusNaik() {
        return this.statusNaik;
    }

    public final String getKodeJenisBeasiswa() {
        return this.kodeJenisBeasiswa;
    }

    public final String getTingkatPendidikan() {
        return this.tingkatPendidikan;
    }

    public final String getOldTingkatPendidikan() {
        return this.oldTingkatPendidikan;
    }

    public final String getJenjangPendidikan() {
        return this.jenjangPendidikan;
    }

    public final String getLembagaPendidikan() {
        return this.lembagaPendidikan;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getDokumenLengkap() {
        return this.dokumenLengkap;
    }

    public final ScholarshipPhotoPersonForInsert getPhotoPenerima() {
        return this.photoPenerima;
    }

    public final List<ScholarshipDataDocumentForInsert> getDocumentBeasiswa() {
        return this.documentBeasiswa;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNikPenerima() {
        return this.nikPenerima;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOldTingkatPendidikan() {
        return this.oldTingkatPendidikan;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getJenjangPendidikan() {
        return this.jenjangPendidikan;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLembagaPendidikan() {
        return this.lembagaPendidikan;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDokumenLengkap() {
        return this.dokumenLengkap;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final ScholarshipPhotoPersonForInsert getPhotoPenerima() {
        return this.photoPenerima;
    }

    public final List<ScholarshipDataDocumentForInsert> component16() {
        return this.documentBeasiswa;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaPenerima() {
        return this.namaPenerima;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNoUrutPenerima() {
        return this.noUrutPenerima;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTglLahirPenerima() {
        return this.tglLahirPenerima;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMasihSekolah() {
        return this.masihSekolah;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTahunBeasiswa() {
        return this.tahunBeasiswa;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatusNaik() {
        return this.statusNaik;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getKodeJenisBeasiswa() {
        return this.kodeJenisBeasiswa;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTingkatPendidikan() {
        return this.tingkatPendidikan;
    }

    public final ScholarshipPersonForInsert copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, ScholarshipPhotoPersonForInsert p14, List<ScholarshipDataDocumentForInsert> p15) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p13, "");
        Intrinsics.checkNotNullParameter(p14, "");
        Intrinsics.checkNotNullParameter(p15, "");
        return new ScholarshipPersonForInsert(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipPersonForInsert)) {
            return false;
        }
        ScholarshipPersonForInsert scholarshipPersonForInsert = (ScholarshipPersonForInsert) p0;
        return Intrinsics.areEqual(this.nikPenerima, scholarshipPersonForInsert.nikPenerima) && Intrinsics.areEqual(this.namaPenerima, scholarshipPersonForInsert.namaPenerima) && Intrinsics.areEqual(this.noUrutPenerima, scholarshipPersonForInsert.noUrutPenerima) && Intrinsics.areEqual(this.tglLahirPenerima, scholarshipPersonForInsert.tglLahirPenerima) && Intrinsics.areEqual(this.masihSekolah, scholarshipPersonForInsert.masihSekolah) && Intrinsics.areEqual(this.tahunBeasiswa, scholarshipPersonForInsert.tahunBeasiswa) && Intrinsics.areEqual(this.statusNaik, scholarshipPersonForInsert.statusNaik) && Intrinsics.areEqual(this.kodeJenisBeasiswa, scholarshipPersonForInsert.kodeJenisBeasiswa) && Intrinsics.areEqual(this.tingkatPendidikan, scholarshipPersonForInsert.tingkatPendidikan) && Intrinsics.areEqual(this.oldTingkatPendidikan, scholarshipPersonForInsert.oldTingkatPendidikan) && Intrinsics.areEqual(this.jenjangPendidikan, scholarshipPersonForInsert.jenjangPendidikan) && Intrinsics.areEqual(this.lembagaPendidikan, scholarshipPersonForInsert.lembagaPendidikan) && Intrinsics.areEqual(this.amount, scholarshipPersonForInsert.amount) && Intrinsics.areEqual(this.dokumenLengkap, scholarshipPersonForInsert.dokumenLengkap) && Intrinsics.areEqual(this.photoPenerima, scholarshipPersonForInsert.photoPenerima) && Intrinsics.areEqual(this.documentBeasiswa, scholarshipPersonForInsert.documentBeasiswa);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((this.nikPenerima.hashCode() * 31) + this.namaPenerima.hashCode()) * 31) + this.noUrutPenerima.hashCode()) * 31) + this.tglLahirPenerima.hashCode()) * 31) + this.masihSekolah.hashCode()) * 31) + this.tahunBeasiswa.hashCode()) * 31) + this.statusNaik.hashCode()) * 31) + this.kodeJenisBeasiswa.hashCode()) * 31) + this.tingkatPendidikan.hashCode()) * 31) + this.oldTingkatPendidikan.hashCode()) * 31) + this.jenjangPendidikan.hashCode()) * 31) + this.lembagaPendidikan.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.dokumenLengkap.hashCode()) * 31) + this.photoPenerima.hashCode()) * 31) + this.documentBeasiswa.hashCode();
    }

    public final String toString() {
        String str = this.nikPenerima;
        String str2 = this.namaPenerima;
        String str3 = this.noUrutPenerima;
        String str4 = this.tglLahirPenerima;
        String str5 = this.masihSekolah;
        String str6 = this.tahunBeasiswa;
        String str7 = this.statusNaik;
        String str8 = this.kodeJenisBeasiswa;
        String str9 = this.tingkatPendidikan;
        String str10 = this.oldTingkatPendidikan;
        String str11 = this.jenjangPendidikan;
        String str12 = this.lembagaPendidikan;
        String str13 = this.amount;
        String str14 = this.dokumenLengkap;
        ScholarshipPhotoPersonForInsert scholarshipPhotoPersonForInsert = this.photoPenerima;
        List<ScholarshipDataDocumentForInsert> list = this.documentBeasiswa;
        StringBuilder sb = new StringBuilder("ScholarshipPersonForInsert(nikPenerima=");
        sb.append(str);
        sb.append(", namaPenerima=");
        sb.append(str2);
        sb.append(", noUrutPenerima=");
        sb.append(str3);
        sb.append(", tglLahirPenerima=");
        sb.append(str4);
        sb.append(", masihSekolah=");
        sb.append(str5);
        sb.append(", tahunBeasiswa=");
        sb.append(str6);
        sb.append(", statusNaik=");
        sb.append(str7);
        sb.append(", kodeJenisBeasiswa=");
        sb.append(str8);
        sb.append(", tingkatPendidikan=");
        sb.append(str9);
        sb.append(", oldTingkatPendidikan=");
        sb.append(str10);
        sb.append(", jenjangPendidikan=");
        sb.append(str11);
        sb.append(", lembagaPendidikan=");
        sb.append(str12);
        sb.append(", amount=");
        sb.append(str13);
        sb.append(", dokumenLengkap=");
        sb.append(str14);
        sb.append(", photoPenerima=");
        sb.append(scholarshipPhotoPersonForInsert);
        sb.append(", documentBeasiswa=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
