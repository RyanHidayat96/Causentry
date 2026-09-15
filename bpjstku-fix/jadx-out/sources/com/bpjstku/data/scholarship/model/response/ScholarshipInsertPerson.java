package com.bpjstku.data.scholarship.model.response;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ`\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\nHÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b!\u0010\u0014R\"\u0010\"\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010-\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u00100R$\u00104\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010-\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u00100R$\u00107\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010@"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertPerson;", "", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertHeader;", "p0", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationForInsert;", "p1", "", "p2", "p3", "p4", "", "p5", "p6", "<init>", "(Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertHeader;Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationForInsert;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)V", "component1", "()Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertHeader;", "component2", "()Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationForInsert;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "()I", "copy", "(Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertHeader;Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationForInsert;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertPerson;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "header", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertHeader;", "getHeader", "setHeader", "(Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertHeader;)V", "pendidikan", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationForInsert;", "getPendidikan", "setPendidikan", "(Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationForInsert;)V", NotificationCompat.CATEGORY_STATUS, "Ljava/lang/String;", "getStatus", "setStatus", "(Ljava/lang/String;)V", "tanggalKonfirmasi", "getTanggalKonfirmasi", "setTanggalKonfirmasi", "namaHubungan", "getNamaHubungan", "setNamaHubungan", "umur", "Ljava/lang/Integer;", "getUmur", "setUmur", "(Ljava/lang/Integer;)V", "manfaat", "I", "getManfaat", "setManfaat", "(I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipInsertPerson {
    public static final int $stable = 8;

    @SerializedName("dataHeaderInsert")
    private ScholarshipInsertHeader header;

    @SerializedName("manfaat")
    private int manfaat;

    @SerializedName("namaHubungan")
    private String namaHubungan;

    @SerializedName("tingkatPendidikan")
    private ScholarshipEducationForInsert pendidikan;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;

    @SerializedName("tanggalKonfirmasi")
    private String tanggalKonfirmasi;

    @SerializedName("age")
    private Integer umur;

    public ScholarshipInsertPerson(ScholarshipInsertHeader scholarshipInsertHeader, ScholarshipEducationForInsert scholarshipEducationForInsert, String str, String str2, String str3, Integer num, int i) {
        Intrinsics.checkNotNullParameter(scholarshipInsertHeader, "");
        this.header = scholarshipInsertHeader;
        this.pendidikan = scholarshipEducationForInsert;
        this.status = str;
        this.tanggalKonfirmasi = str2;
        this.namaHubungan = str3;
        this.umur = num;
        this.manfaat = i;
    }

    public /* synthetic */ ScholarshipInsertPerson(ScholarshipInsertHeader scholarshipInsertHeader, ScholarshipEducationForInsert scholarshipEducationForInsert, String str, String str2, String str3, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(scholarshipInsertHeader, (i2 & 2) != 0 ? null : scholarshipEducationForInsert, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? null : num, i);
    }

    public final ScholarshipInsertHeader getHeader() {
        return this.header;
    }

    public final void setHeader(ScholarshipInsertHeader scholarshipInsertHeader) {
        Intrinsics.checkNotNullParameter(scholarshipInsertHeader, "");
        this.header = scholarshipInsertHeader;
    }

    public final ScholarshipEducationForInsert getPendidikan() {
        return this.pendidikan;
    }

    public final void setPendidikan(ScholarshipEducationForInsert scholarshipEducationForInsert) {
        this.pendidikan = scholarshipEducationForInsert;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final String getTanggalKonfirmasi() {
        return this.tanggalKonfirmasi;
    }

    public final void setTanggalKonfirmasi(String str) {
        this.tanggalKonfirmasi = str;
    }

    public final String getNamaHubungan() {
        return this.namaHubungan;
    }

    public final void setNamaHubungan(String str) {
        this.namaHubungan = str;
    }

    public final Integer getUmur() {
        return this.umur;
    }

    public final void setUmur(Integer num) {
        this.umur = num;
    }

    public final int getManfaat() {
        return this.manfaat;
    }

    public final void setManfaat(int i) {
        this.manfaat = i;
    }

    public static /* synthetic */ ScholarshipInsertPerson copy$default(ScholarshipInsertPerson scholarshipInsertPerson, ScholarshipInsertHeader scholarshipInsertHeader, ScholarshipEducationForInsert scholarshipEducationForInsert, String str, String str2, String str3, Integer num, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            scholarshipInsertHeader = scholarshipInsertPerson.header;
        }
        if ((i2 & 2) != 0) {
            scholarshipEducationForInsert = scholarshipInsertPerson.pendidikan;
        }
        ScholarshipEducationForInsert scholarshipEducationForInsert2 = scholarshipEducationForInsert;
        if ((i2 & 4) != 0) {
            str = scholarshipInsertPerson.status;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = scholarshipInsertPerson.tanggalKonfirmasi;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = scholarshipInsertPerson.namaHubungan;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            num = scholarshipInsertPerson.umur;
        }
        Integer num2 = num;
        if ((i2 & 64) != 0) {
            i = scholarshipInsertPerson.manfaat;
        }
        return scholarshipInsertPerson.copy(scholarshipInsertHeader, scholarshipEducationForInsert2, str4, str5, str6, num2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScholarshipInsertHeader getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScholarshipEducationForInsert getPendidikan() {
        return this.pendidikan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTanggalKonfirmasi() {
        return this.tanggalKonfirmasi;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNamaHubungan() {
        return this.namaHubungan;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getUmur() {
        return this.umur;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getManfaat() {
        return this.manfaat;
    }

    public final ScholarshipInsertPerson copy(ScholarshipInsertHeader p0, ScholarshipEducationForInsert p1, String p2, String p3, String p4, Integer p5, int p6) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new ScholarshipInsertPerson(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipInsertPerson)) {
            return false;
        }
        ScholarshipInsertPerson scholarshipInsertPerson = (ScholarshipInsertPerson) p0;
        return Intrinsics.areEqual(this.header, scholarshipInsertPerson.header) && Intrinsics.areEqual(this.pendidikan, scholarshipInsertPerson.pendidikan) && Intrinsics.areEqual(this.status, scholarshipInsertPerson.status) && Intrinsics.areEqual(this.tanggalKonfirmasi, scholarshipInsertPerson.tanggalKonfirmasi) && Intrinsics.areEqual(this.namaHubungan, scholarshipInsertPerson.namaHubungan) && Intrinsics.areEqual(this.umur, scholarshipInsertPerson.umur) && this.manfaat == scholarshipInsertPerson.manfaat;
    }

    public final int hashCode() {
        int iHashCode = this.header.hashCode();
        ScholarshipEducationForInsert scholarshipEducationForInsert = this.pendidikan;
        int iHashCode2 = scholarshipEducationForInsert == null ? 0 : scholarshipEducationForInsert.hashCode();
        String str = this.status;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.tanggalKonfirmasi;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.namaHubungan;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.umur;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.manfaat);
    }

    public final String toString() {
        ScholarshipInsertHeader scholarshipInsertHeader = this.header;
        ScholarshipEducationForInsert scholarshipEducationForInsert = this.pendidikan;
        String str = this.status;
        String str2 = this.tanggalKonfirmasi;
        String str3 = this.namaHubungan;
        Integer num = this.umur;
        int i = this.manfaat;
        StringBuilder sb = new StringBuilder("ScholarshipInsertPerson(header=");
        sb.append(scholarshipInsertHeader);
        sb.append(", pendidikan=");
        sb.append(scholarshipEducationForInsert);
        sb.append(", status=");
        sb.append(str);
        sb.append(", tanggalKonfirmasi=");
        sb.append(str2);
        sb.append(", namaHubungan=");
        sb.append(str3);
        sb.append(", umur=");
        sb.append(num);
        sb.append(", manfaat=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
