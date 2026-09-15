package com.bpjstku.data.complaint.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\fR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\fR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\fR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\f"}, d2 = {"Lcom/bpjstku/data/complaint/model/response/ComplaintHistoryItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/complaint/model/response/ComplaintHistoryItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "tipePengaduan", "Ljava/lang/String;", "getTipePengaduan", "tanggalPengaduan", "getTanggalPengaduan", "idPengaduan", "getIdPengaduan", "kodeJenisPengaduan", "getKodeJenisPengaduan", "deskripsiPengaduan", "getDeskripsiPengaduan", "checksum", "getChecksum"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ComplaintHistoryItem {
    public static final int $stable = 0;

    @SerializedName("checksum")
    private final String checksum;

    @SerializedName("deskripsiPengaduan")
    private final String deskripsiPengaduan;

    @SerializedName("idPengaduan")
    private final String idPengaduan;

    @SerializedName("kodeJenisPengaduan")
    private final String kodeJenisPengaduan;

    @SerializedName("tanggalPengaduan")
    private final String tanggalPengaduan;

    @SerializedName("tipePengaduan")
    private final String tipePengaduan;

    public ComplaintHistoryItem(String str, String str2, String str3, String str4, String str5, String str6) {
        this.tipePengaduan = str;
        this.tanggalPengaduan = str2;
        this.idPengaduan = str3;
        this.kodeJenisPengaduan = str4;
        this.deskripsiPengaduan = str5;
        this.checksum = str6;
    }

    public /* synthetic */ ComplaintHistoryItem(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public final String getTipePengaduan() {
        return this.tipePengaduan;
    }

    public final String getTanggalPengaduan() {
        return this.tanggalPengaduan;
    }

    public final String getIdPengaduan() {
        return this.idPengaduan;
    }

    public final String getKodeJenisPengaduan() {
        return this.kodeJenisPengaduan;
    }

    public final String getDeskripsiPengaduan() {
        return this.deskripsiPengaduan;
    }

    public final String getChecksum() {
        return this.checksum;
    }

    public ComplaintHistoryItem() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ComplaintHistoryItem copy$default(ComplaintHistoryItem complaintHistoryItem, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = complaintHistoryItem.tipePengaduan;
        }
        if ((i & 2) != 0) {
            str2 = complaintHistoryItem.tanggalPengaduan;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = complaintHistoryItem.idPengaduan;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = complaintHistoryItem.kodeJenisPengaduan;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = complaintHistoryItem.deskripsiPengaduan;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = complaintHistoryItem.checksum;
        }
        return complaintHistoryItem.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTipePengaduan() {
        return this.tipePengaduan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTanggalPengaduan() {
        return this.tanggalPengaduan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIdPengaduan() {
        return this.idPengaduan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodeJenisPengaduan() {
        return this.kodeJenisPengaduan;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeskripsiPengaduan() {
        return this.deskripsiPengaduan;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    public final ComplaintHistoryItem copy(String p0, String p1, String p2, String p3, String p4, String p5) {
        return new ComplaintHistoryItem(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ComplaintHistoryItem)) {
            return false;
        }
        ComplaintHistoryItem complaintHistoryItem = (ComplaintHistoryItem) p0;
        return Intrinsics.areEqual(this.tipePengaduan, complaintHistoryItem.tipePengaduan) && Intrinsics.areEqual(this.tanggalPengaduan, complaintHistoryItem.tanggalPengaduan) && Intrinsics.areEqual(this.idPengaduan, complaintHistoryItem.idPengaduan) && Intrinsics.areEqual(this.kodeJenisPengaduan, complaintHistoryItem.kodeJenisPengaduan) && Intrinsics.areEqual(this.deskripsiPengaduan, complaintHistoryItem.deskripsiPengaduan) && Intrinsics.areEqual(this.checksum, complaintHistoryItem.checksum);
    }

    public final int hashCode() {
        String str = this.tipePengaduan;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tanggalPengaduan;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.idPengaduan;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kodeJenisPengaduan;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.deskripsiPengaduan;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.checksum;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.tipePengaduan;
        String str2 = this.tanggalPengaduan;
        String str3 = this.idPengaduan;
        String str4 = this.kodeJenisPengaduan;
        String str5 = this.deskripsiPengaduan;
        String str6 = this.checksum;
        StringBuilder sb = new StringBuilder("ComplaintHistoryItem(tipePengaduan=");
        sb.append(str);
        sb.append(", tanggalPengaduan=");
        sb.append(str2);
        sb.append(", idPengaduan=");
        sb.append(str3);
        sb.append(", kodeJenisPengaduan=");
        sb.append(str4);
        sb.append(", deskripsiPengaduan=");
        sb.append(str5);
        sb.append(", checksum=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
