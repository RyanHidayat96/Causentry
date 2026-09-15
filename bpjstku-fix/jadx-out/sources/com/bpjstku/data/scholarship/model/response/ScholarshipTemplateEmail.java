package com.bpjstku.data.scholarship.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\fR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u001fR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u001fR$\u0010)\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u001fR$\u0010,\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u001f"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipTemplateEmail;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipTemplateEmail;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kpj", "Ljava/lang/String;", "getKpj", "setKpj", "(Ljava/lang/String;)V", "namaPelapor", "getNamaPelapor", "setNamaPelapor", "kodeKantor", "getKodeKantor", "setKodeKantor", "kodePengajuan", "getKodePengajuan", "setKodePengajuan", "tglRekam", "getTglRekam", "setTglRekam", "email", "getEmail", "setEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipTemplateEmail {
    public static final int $stable = 8;

    @SerializedName("email")
    private String email;

    @SerializedName("kodeKantor")
    private String kodeKantor;

    @SerializedName("kodePengajuan")
    private String kodePengajuan;

    @SerializedName("kpj")
    private String kpj;

    @SerializedName("namaPelapor")
    private String namaPelapor;

    @SerializedName("tglRekam")
    private String tglRekam;

    public ScholarshipTemplateEmail(String str, String str2, String str3, String str4, String str5, String str6) {
        this.kpj = str;
        this.namaPelapor = str2;
        this.kodeKantor = str3;
        this.kodePengajuan = str4;
        this.tglRekam = str5;
        this.email = str6;
    }

    public /* synthetic */ ScholarshipTemplateEmail(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final void setKpj(String str) {
        this.kpj = str;
    }

    public final String getNamaPelapor() {
        return this.namaPelapor;
    }

    public final void setNamaPelapor(String str) {
        this.namaPelapor = str;
    }

    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    public final void setKodeKantor(String str) {
        this.kodeKantor = str;
    }

    public final String getKodePengajuan() {
        return this.kodePengajuan;
    }

    public final void setKodePengajuan(String str) {
        this.kodePengajuan = str;
    }

    public final String getTglRekam() {
        return this.tglRekam;
    }

    public final void setTglRekam(String str) {
        this.tglRekam = str;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public ScholarshipTemplateEmail() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ScholarshipTemplateEmail copy$default(ScholarshipTemplateEmail scholarshipTemplateEmail, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipTemplateEmail.kpj;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipTemplateEmail.namaPelapor;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = scholarshipTemplateEmail.kodeKantor;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = scholarshipTemplateEmail.kodePengajuan;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = scholarshipTemplateEmail.tglRekam;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = scholarshipTemplateEmail.email;
        }
        return scholarshipTemplateEmail.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaPelapor() {
        return this.namaPelapor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodePengajuan() {
        return this.kodePengajuan;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTglRekam() {
        return this.tglRekam;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final ScholarshipTemplateEmail copy(String p0, String p1, String p2, String p3, String p4, String p5) {
        return new ScholarshipTemplateEmail(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipTemplateEmail)) {
            return false;
        }
        ScholarshipTemplateEmail scholarshipTemplateEmail = (ScholarshipTemplateEmail) p0;
        return Intrinsics.areEqual(this.kpj, scholarshipTemplateEmail.kpj) && Intrinsics.areEqual(this.namaPelapor, scholarshipTemplateEmail.namaPelapor) && Intrinsics.areEqual(this.kodeKantor, scholarshipTemplateEmail.kodeKantor) && Intrinsics.areEqual(this.kodePengajuan, scholarshipTemplateEmail.kodePengajuan) && Intrinsics.areEqual(this.tglRekam, scholarshipTemplateEmail.tglRekam) && Intrinsics.areEqual(this.email, scholarshipTemplateEmail.email);
    }

    public final int hashCode() {
        String str = this.kpj;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.namaPelapor;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.kodeKantor;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kodePengajuan;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tglRekam;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.email;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kpj;
        String str2 = this.namaPelapor;
        String str3 = this.kodeKantor;
        String str4 = this.kodePengajuan;
        String str5 = this.tglRekam;
        String str6 = this.email;
        StringBuilder sb = new StringBuilder("ScholarshipTemplateEmail(kpj=");
        sb.append(str);
        sb.append(", namaPelapor=");
        sb.append(str2);
        sb.append(", kodeKantor=");
        sb.append(str3);
        sb.append(", kodePengajuan=");
        sb.append(str4);
        sb.append(", tglRekam=");
        sb.append(str5);
        sb.append(", email=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
