package com.bpjstku.data.complaint.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b!\u0010\"J²\u0001\u0010#\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÇ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020%2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b+\u0010\u0017R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015R\u001c\u0010/\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0017R\u001c\u00102\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u0017R\u001c\u00104\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u0010\u0017R\u001c\u00106\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u0010\u0017R\u001c\u00108\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u0010\u0017R\"\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010\u0015R\u001c\u0010<\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b=\u0010\u0017R\"\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010\u0015R\u001c\u0010@\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\bA\u0010\u0017R\u001c\u0010B\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\bC\u0010\u0017R\u001c\u0010D\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010\""}, d2 = {"Lcom/bpjstku/data/complaint/model/response/ComplaintDetailItem;", "", "", "Lcom/bpjstku/data/complaint/model/response/TrackingComplaintItem;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "Lcom/bpjstku/data/complaint/model/response/DetailPbtItem;", "p11", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/complaint/model/response/DetailPbtItem;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/bpjstku/data/complaint/model/response/DetailPbtItem;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/complaint/model/response/DetailPbtItem;)Lcom/bpjstku/data/complaint/model/response/ComplaintDetailItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "trackingJumlahKaryawan", "Ljava/util/List;", "getTrackingJumlahKaryawan", "kpj", "Ljava/lang/String;", "getKpj", "tipePengaduan", "getTipePengaduan", "kodeJenisPengaduan", "getKodeJenisPengaduan", "alamatPerusahaan", "getAlamatPerusahaan", "namaPerusahaan", "getNamaPerusahaan", "trackingJumlahUpah", "getTrackingJumlahUpah", "idPengaduan", "getIdPengaduan", "trackingPerusahaan", "getTrackingPerusahaan", "detailDataTidakSesuai", "getDetailDataTidakSesuai", "checksum", "getChecksum", "detailPerusahaanBelumTerdaftar", "Lcom/bpjstku/data/complaint/model/response/DetailPbtItem;", "getDetailPerusahaanBelumTerdaftar"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ComplaintDetailItem {
    public static final int $stable = 8;

    @SerializedName("alamatPerusahaan")
    private final String alamatPerusahaan;

    @SerializedName("checksum")
    private final String checksum;

    @SerializedName("detailDataTidakSesuai")
    private final String detailDataTidakSesuai;

    @SerializedName("detailPerusahaanBelumTerdaftar")
    private final DetailPbtItem detailPerusahaanBelumTerdaftar;

    @SerializedName("idPengaduan")
    private final String idPengaduan;

    @SerializedName("jenisPengaduan")
    private final String kodeJenisPengaduan;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("namaPerusahaan")
    private final String namaPerusahaan;

    @SerializedName("tipePengaduan")
    private final String tipePengaduan;

    @SerializedName("trackingJumlahKaryawan")
    private final List<TrackingComplaintItem> trackingJumlahKaryawan;

    @SerializedName("trackingJumlahUpah")
    private final List<TrackingComplaintItem> trackingJumlahUpah;

    @SerializedName("trackingPerusahaan")
    private final List<TrackingComplaintItem> trackingPerusahaan;

    public ComplaintDetailItem(List<TrackingComplaintItem> list, String str, String str2, String str3, String str4, String str5, List<TrackingComplaintItem> list2, String str6, List<TrackingComplaintItem> list3, String str7, String str8, DetailPbtItem detailPbtItem) {
        this.trackingJumlahKaryawan = list;
        this.kpj = str;
        this.tipePengaduan = str2;
        this.kodeJenisPengaduan = str3;
        this.alamatPerusahaan = str4;
        this.namaPerusahaan = str5;
        this.trackingJumlahUpah = list2;
        this.idPengaduan = str6;
        this.trackingPerusahaan = list3;
        this.detailDataTidakSesuai = str7;
        this.checksum = str8;
        this.detailPerusahaanBelumTerdaftar = detailPbtItem;
    }

    public final List<TrackingComplaintItem> getTrackingJumlahKaryawan() {
        return this.trackingJumlahKaryawan;
    }

    public /* synthetic */ ComplaintDetailItem(List list, String str, String str2, String str3, String str4, String str5, List list2, String str6, List list3, String str7, String str8, DetailPbtItem detailPbtItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) == 0 ? str6 : "", (i & 256) != 0 ? CollectionsKt.emptyList() : list3, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) == 0 ? detailPbtItem : null);
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getTipePengaduan() {
        return this.tipePengaduan;
    }

    public final String getKodeJenisPengaduan() {
        return this.kodeJenisPengaduan;
    }

    public final String getAlamatPerusahaan() {
        return this.alamatPerusahaan;
    }

    public final String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    public final List<TrackingComplaintItem> getTrackingJumlahUpah() {
        return this.trackingJumlahUpah;
    }

    public final String getIdPengaduan() {
        return this.idPengaduan;
    }

    public final List<TrackingComplaintItem> getTrackingPerusahaan() {
        return this.trackingPerusahaan;
    }

    public final String getDetailDataTidakSesuai() {
        return this.detailDataTidakSesuai;
    }

    public final String getChecksum() {
        return this.checksum;
    }

    public final DetailPbtItem getDetailPerusahaanBelumTerdaftar() {
        return this.detailPerusahaanBelumTerdaftar;
    }

    public ComplaintDetailItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final List<TrackingComplaintItem> component1() {
        return this.trackingJumlahKaryawan;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDetailDataTidakSesuai() {
        return this.detailDataTidakSesuai;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final DetailPbtItem getDetailPerusahaanBelumTerdaftar() {
        return this.detailPerusahaanBelumTerdaftar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTipePengaduan() {
        return this.tipePengaduan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodeJenisPengaduan() {
        return this.kodeJenisPengaduan;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAlamatPerusahaan() {
        return this.alamatPerusahaan;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    public final List<TrackingComplaintItem> component7() {
        return this.trackingJumlahUpah;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIdPengaduan() {
        return this.idPengaduan;
    }

    public final List<TrackingComplaintItem> component9() {
        return this.trackingPerusahaan;
    }

    public final ComplaintDetailItem copy(List<TrackingComplaintItem> p0, String p1, String p2, String p3, String p4, String p5, List<TrackingComplaintItem> p6, String p7, List<TrackingComplaintItem> p8, String p9, String p10, DetailPbtItem p11) {
        return new ComplaintDetailItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ComplaintDetailItem)) {
            return false;
        }
        ComplaintDetailItem complaintDetailItem = (ComplaintDetailItem) p0;
        return Intrinsics.areEqual(this.trackingJumlahKaryawan, complaintDetailItem.trackingJumlahKaryawan) && Intrinsics.areEqual(this.kpj, complaintDetailItem.kpj) && Intrinsics.areEqual(this.tipePengaduan, complaintDetailItem.tipePengaduan) && Intrinsics.areEqual(this.kodeJenisPengaduan, complaintDetailItem.kodeJenisPengaduan) && Intrinsics.areEqual(this.alamatPerusahaan, complaintDetailItem.alamatPerusahaan) && Intrinsics.areEqual(this.namaPerusahaan, complaintDetailItem.namaPerusahaan) && Intrinsics.areEqual(this.trackingJumlahUpah, complaintDetailItem.trackingJumlahUpah) && Intrinsics.areEqual(this.idPengaduan, complaintDetailItem.idPengaduan) && Intrinsics.areEqual(this.trackingPerusahaan, complaintDetailItem.trackingPerusahaan) && Intrinsics.areEqual(this.detailDataTidakSesuai, complaintDetailItem.detailDataTidakSesuai) && Intrinsics.areEqual(this.checksum, complaintDetailItem.checksum) && Intrinsics.areEqual(this.detailPerusahaanBelumTerdaftar, complaintDetailItem.detailPerusahaanBelumTerdaftar);
    }

    public final int hashCode() {
        List<TrackingComplaintItem> list = this.trackingJumlahKaryawan;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.kpj;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.tipePengaduan;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.kodeJenisPengaduan;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.alamatPerusahaan;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.namaPerusahaan;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        List<TrackingComplaintItem> list2 = this.trackingJumlahUpah;
        int iHashCode7 = list2 == null ? 0 : list2.hashCode();
        String str6 = this.idPengaduan;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        List<TrackingComplaintItem> list3 = this.trackingPerusahaan;
        int iHashCode9 = list3 == null ? 0 : list3.hashCode();
        String str7 = this.detailDataTidakSesuai;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.checksum;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        DetailPbtItem detailPbtItem = this.detailPerusahaanBelumTerdaftar;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (detailPbtItem != null ? detailPbtItem.hashCode() : 0);
    }

    public final String toString() {
        List<TrackingComplaintItem> list = this.trackingJumlahKaryawan;
        String str = this.kpj;
        String str2 = this.tipePengaduan;
        String str3 = this.kodeJenisPengaduan;
        String str4 = this.alamatPerusahaan;
        String str5 = this.namaPerusahaan;
        List<TrackingComplaintItem> list2 = this.trackingJumlahUpah;
        String str6 = this.idPengaduan;
        List<TrackingComplaintItem> list3 = this.trackingPerusahaan;
        String str7 = this.detailDataTidakSesuai;
        String str8 = this.checksum;
        DetailPbtItem detailPbtItem = this.detailPerusahaanBelumTerdaftar;
        StringBuilder sb = new StringBuilder("ComplaintDetailItem(trackingJumlahKaryawan=");
        sb.append(list);
        sb.append(", kpj=");
        sb.append(str);
        sb.append(", tipePengaduan=");
        sb.append(str2);
        sb.append(", kodeJenisPengaduan=");
        sb.append(str3);
        sb.append(", alamatPerusahaan=");
        sb.append(str4);
        sb.append(", namaPerusahaan=");
        sb.append(str5);
        sb.append(", trackingJumlahUpah=");
        sb.append(list2);
        sb.append(", idPengaduan=");
        sb.append(str6);
        sb.append(", trackingPerusahaan=");
        sb.append(list3);
        sb.append(", detailDataTidakSesuai=");
        sb.append(str7);
        sb.append(", checksum=");
        sb.append(str8);
        sb.append(", detailPerusahaanBelumTerdaftar=");
        sb.append(detailPbtItem);
        sb.append(")");
        return sb.toString();
    }
}
