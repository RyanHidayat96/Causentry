package com.bpjstku.data.queueing.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J¸\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b*\u0010\u0014R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0014R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0014R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u0014R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010\u0014R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\u0014R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010\u0014R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010\u0014R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b=\u0010\u0014R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010,\u001a\u0004\b?\u0010\u0014R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010,\u001a\u0004\bA\u0010\u0014R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bC\u0010\u0014R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010,\u001a\u0004\bE\u0010\u0014R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\bG\u0010\u0014"}, d2 = {"Lcom/bpjstku/data/queueing/model/response/AntrianData;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/queueing/model/response/AntrianData;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodePengajuan", "Ljava/lang/String;", "getKodePengajuan", "nama", "getNama", "nomorIdentitas", "getNomorIdentitas", "kpj", "getKpj", "handphone", "getHandphone", "email", "getEmail", "layanan", "getLayanan", "kantorCabang", "getKantorCabang", "namaKantorCabang", "getNamaKantorCabang", "alamatKantor", "getAlamatKantor", "tanggalBooking", "getTanggalBooking", "kodeShift", "getKodeShift", "namaShift", "getNamaShift", "kodeProvinsi", "getKodeProvinsi"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AntrianData {
    public static final int $stable = 0;

    @SerializedName("alamatKantor")
    private final String alamatKantor;

    @SerializedName("email")
    private final String email;

    @SerializedName("handphone")
    private final String handphone;

    @SerializedName("kantorCabang")
    private final String kantorCabang;

    @SerializedName("kodePengajuan")
    private final String kodePengajuan;

    @SerializedName("kodeProvinsi")
    private final String kodeProvinsi;

    @SerializedName("kodeShift")
    private final String kodeShift;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("layanan")
    private final String layanan;

    @SerializedName("nama")
    private final String nama;

    @SerializedName("namaKantorCabang")
    private final String namaKantorCabang;

    @SerializedName("namaShift")
    private final String namaShift;

    @SerializedName("nomorIdentitas")
    private final String nomorIdentitas;

    @SerializedName("tanggalBooking")
    private final String tanggalBooking;

    public AntrianData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.kodePengajuan = str;
        this.nama = str2;
        this.nomorIdentitas = str3;
        this.kpj = str4;
        this.handphone = str5;
        this.email = str6;
        this.layanan = str7;
        this.kantorCabang = str8;
        this.namaKantorCabang = str9;
        this.alamatKantor = str10;
        this.tanggalBooking = str11;
        this.kodeShift = str12;
        this.namaShift = str13;
        this.kodeProvinsi = str14;
    }

    public final String getKodePengajuan() {
        return this.kodePengajuan;
    }

    public final String getNama() {
        return this.nama;
    }

    public final String getNomorIdentitas() {
        return this.nomorIdentitas;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getHandphone() {
        return this.handphone;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getLayanan() {
        return this.layanan;
    }

    public final String getKantorCabang() {
        return this.kantorCabang;
    }

    public final String getNamaKantorCabang() {
        return this.namaKantorCabang;
    }

    public final String getAlamatKantor() {
        return this.alamatKantor;
    }

    public final String getTanggalBooking() {
        return this.tanggalBooking;
    }

    public final String getKodeShift() {
        return this.kodeShift;
    }

    public final String getNamaShift() {
        return this.namaShift;
    }

    public final String getKodeProvinsi() {
        return this.kodeProvinsi;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodePengajuan() {
        return this.kodePengajuan;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAlamatKantor() {
        return this.alamatKantor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTanggalBooking() {
        return this.tanggalBooking;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getKodeShift() {
        return this.kodeShift;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNamaShift() {
        return this.namaShift;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getKodeProvinsi() {
        return this.kodeProvinsi;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNama() {
        return this.nama;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNomorIdentitas() {
        return this.nomorIdentitas;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHandphone() {
        return this.handphone;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLayanan() {
        return this.layanan;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getKantorCabang() {
        return this.kantorCabang;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNamaKantorCabang() {
        return this.namaKantorCabang;
    }

    public final AntrianData copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13) {
        return new AntrianData(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AntrianData)) {
            return false;
        }
        AntrianData antrianData = (AntrianData) p0;
        return Intrinsics.areEqual(this.kodePengajuan, antrianData.kodePengajuan) && Intrinsics.areEqual(this.nama, antrianData.nama) && Intrinsics.areEqual(this.nomorIdentitas, antrianData.nomorIdentitas) && Intrinsics.areEqual(this.kpj, antrianData.kpj) && Intrinsics.areEqual(this.handphone, antrianData.handphone) && Intrinsics.areEqual(this.email, antrianData.email) && Intrinsics.areEqual(this.layanan, antrianData.layanan) && Intrinsics.areEqual(this.kantorCabang, antrianData.kantorCabang) && Intrinsics.areEqual(this.namaKantorCabang, antrianData.namaKantorCabang) && Intrinsics.areEqual(this.alamatKantor, antrianData.alamatKantor) && Intrinsics.areEqual(this.tanggalBooking, antrianData.tanggalBooking) && Intrinsics.areEqual(this.kodeShift, antrianData.kodeShift) && Intrinsics.areEqual(this.namaShift, antrianData.namaShift) && Intrinsics.areEqual(this.kodeProvinsi, antrianData.kodeProvinsi);
    }

    public final int hashCode() {
        String str = this.kodePengajuan;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nama;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nomorIdentitas;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kpj;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.handphone;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.email;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.layanan;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.kantorCabang;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.namaKantorCabang;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.alamatKantor;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.tanggalBooking;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.kodeShift;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.namaShift;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.kodeProvinsi;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kodePengajuan;
        String str2 = this.nama;
        String str3 = this.nomorIdentitas;
        String str4 = this.kpj;
        String str5 = this.handphone;
        String str6 = this.email;
        String str7 = this.layanan;
        String str8 = this.kantorCabang;
        String str9 = this.namaKantorCabang;
        String str10 = this.alamatKantor;
        String str11 = this.tanggalBooking;
        String str12 = this.kodeShift;
        String str13 = this.namaShift;
        String str14 = this.kodeProvinsi;
        StringBuilder sb = new StringBuilder("AntrianData(kodePengajuan=");
        sb.append(str);
        sb.append(", nama=");
        sb.append(str2);
        sb.append(", nomorIdentitas=");
        sb.append(str3);
        sb.append(", kpj=");
        sb.append(str4);
        sb.append(", handphone=");
        sb.append(str5);
        sb.append(", email=");
        sb.append(str6);
        sb.append(", layanan=");
        sb.append(str7);
        sb.append(", kantorCabang=");
        sb.append(str8);
        sb.append(", namaKantorCabang=");
        sb.append(str9);
        sb.append(", alamatKantor=");
        sb.append(str10);
        sb.append(", tanggalBooking=");
        sb.append(str11);
        sb.append(", kodeShift=");
        sb.append(str12);
        sb.append(", namaShift=");
        sb.append(str13);
        sb.append(", kodeProvinsi=");
        sb.append(str14);
        sb.append(")");
        return sb.toString();
    }
}
