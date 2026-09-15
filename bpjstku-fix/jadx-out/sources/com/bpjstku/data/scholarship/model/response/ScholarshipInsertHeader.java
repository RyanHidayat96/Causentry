package com.bpjstku.data.scholarship.model.response;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\fR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u001fR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u001fR$\u0010)\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u001fR$\u0010,\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u001f"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertHeader;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertHeader;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "namaPenerima", "Ljava/lang/String;", "getNamaPenerima", "setNamaPenerima", "(Ljava/lang/String;)V", "fotoPenerima", "getFotoPenerima", "setFotoPenerima", NotificationCompat.CATEGORY_STATUS, "getStatus", "setStatus", "nikPeserta", "getNikPeserta", "setNikPeserta", "namaPeserta", "getNamaPeserta", "setNamaPeserta", "kpjPeserta", "getKpjPeserta", "setKpjPeserta"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipInsertHeader {
    public static final int $stable = 8;

    @SerializedName("fotoPenerima")
    private String fotoPenerima;

    @SerializedName("kpjPeserta")
    private String kpjPeserta;

    @SerializedName("namaPenerima")
    private String namaPenerima;

    @SerializedName("namaPeserta")
    private String namaPeserta;

    @SerializedName("nikPeserta")
    private String nikPeserta;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;

    public ScholarshipInsertHeader(String str, String str2, String str3, String str4, String str5, String str6) {
        this.namaPenerima = str;
        this.fotoPenerima = str2;
        this.status = str3;
        this.nikPeserta = str4;
        this.namaPeserta = str5;
        this.kpjPeserta = str6;
    }

    public /* synthetic */ ScholarshipInsertHeader(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public final String getNamaPenerima() {
        return this.namaPenerima;
    }

    public final void setNamaPenerima(String str) {
        this.namaPenerima = str;
    }

    public final String getFotoPenerima() {
        return this.fotoPenerima;
    }

    public final void setFotoPenerima(String str) {
        this.fotoPenerima = str;
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

    public ScholarshipInsertHeader() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ScholarshipInsertHeader copy$default(ScholarshipInsertHeader scholarshipInsertHeader, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipInsertHeader.namaPenerima;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipInsertHeader.fotoPenerima;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = scholarshipInsertHeader.status;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = scholarshipInsertHeader.nikPeserta;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = scholarshipInsertHeader.namaPeserta;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = scholarshipInsertHeader.kpjPeserta;
        }
        return scholarshipInsertHeader.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNamaPenerima() {
        return this.namaPenerima;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFotoPenerima() {
        return this.fotoPenerima;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNikPeserta() {
        return this.nikPeserta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNamaPeserta() {
        return this.namaPeserta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getKpjPeserta() {
        return this.kpjPeserta;
    }

    public final ScholarshipInsertHeader copy(String p0, String p1, String p2, String p3, String p4, String p5) {
        return new ScholarshipInsertHeader(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipInsertHeader)) {
            return false;
        }
        ScholarshipInsertHeader scholarshipInsertHeader = (ScholarshipInsertHeader) p0;
        return Intrinsics.areEqual(this.namaPenerima, scholarshipInsertHeader.namaPenerima) && Intrinsics.areEqual(this.fotoPenerima, scholarshipInsertHeader.fotoPenerima) && Intrinsics.areEqual(this.status, scholarshipInsertHeader.status) && Intrinsics.areEqual(this.nikPeserta, scholarshipInsertHeader.nikPeserta) && Intrinsics.areEqual(this.namaPeserta, scholarshipInsertHeader.namaPeserta) && Intrinsics.areEqual(this.kpjPeserta, scholarshipInsertHeader.kpjPeserta);
    }

    public final int hashCode() {
        String str = this.namaPenerima;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fotoPenerima;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.status;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.nikPeserta;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.namaPeserta;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.kpjPeserta;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.namaPenerima;
        String str2 = this.fotoPenerima;
        String str3 = this.status;
        String str4 = this.nikPeserta;
        String str5 = this.namaPeserta;
        String str6 = this.kpjPeserta;
        StringBuilder sb = new StringBuilder("ScholarshipInsertHeader(namaPenerima=");
        sb.append(str);
        sb.append(", fotoPenerima=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(str3);
        sb.append(", nikPeserta=");
        sb.append(str4);
        sb.append(", namaPeserta=");
        sb.append(str5);
        sb.append(", kpjPeserta=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
