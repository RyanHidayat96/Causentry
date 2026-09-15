package com.bpjstku.data.scholarship.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JR\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\rR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010 R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010 R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010 R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010."}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationListResponse;", "", "", "p0", "p1", "p2", "p3", "", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducation;", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationListResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nikPenerima", "Ljava/lang/String;", "getNikPenerima", "setNikPenerima", "(Ljava/lang/String;)V", "namaPenerima", "getNamaPenerima", "setNamaPenerima", "tempatLahir", "getTempatLahir", "setTempatLahir", "tglLahir", "getTglLahir", "setTglLahir", "tingkatPendidikan", "Ljava/util/List;", "getTingkatPendidikan", "setTingkatPendidikan", "(Ljava/util/List;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipEducationListResponse {
    public static final int $stable = 8;

    @SerializedName("namaPenerima")
    private String namaPenerima;

    @SerializedName("nikPenerima")
    private String nikPenerima;

    @SerializedName("tempatLahir")
    private String tempatLahir;

    @SerializedName("tglLahir")
    private String tglLahir;

    @SerializedName("tingkatPendidikan")
    private List<ScholarshipEducation> tingkatPendidikan;

    public ScholarshipEducationListResponse(String str, String str2, String str3, String str4, List<ScholarshipEducation> list) {
        this.nikPenerima = str;
        this.namaPenerima = str2;
        this.tempatLahir = str3;
        this.tglLahir = str4;
        this.tingkatPendidikan = list;
    }

    public final String getNikPenerima() {
        return this.nikPenerima;
    }

    public final void setNikPenerima(String str) {
        this.nikPenerima = str;
    }

    public final String getNamaPenerima() {
        return this.namaPenerima;
    }

    public final void setNamaPenerima(String str) {
        this.namaPenerima = str;
    }

    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    public final void setTempatLahir(String str) {
        this.tempatLahir = str;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public final void setTglLahir(String str) {
        this.tglLahir = str;
    }

    public final List<ScholarshipEducation> getTingkatPendidikan() {
        return this.tingkatPendidikan;
    }

    public final void setTingkatPendidikan(List<ScholarshipEducation> list) {
        this.tingkatPendidikan = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScholarshipEducationListResponse copy$default(ScholarshipEducationListResponse scholarshipEducationListResponse, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipEducationListResponse.nikPenerima;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipEducationListResponse.namaPenerima;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = scholarshipEducationListResponse.tempatLahir;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = scholarshipEducationListResponse.tglLahir;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = scholarshipEducationListResponse.tingkatPendidikan;
        }
        return scholarshipEducationListResponse.copy(str, str5, str6, str7, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNikPenerima() {
        return this.nikPenerima;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaPenerima() {
        return this.namaPenerima;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    public final List<ScholarshipEducation> component5() {
        return this.tingkatPendidikan;
    }

    public final ScholarshipEducationListResponse copy(String p0, String p1, String p2, String p3, List<ScholarshipEducation> p4) {
        return new ScholarshipEducationListResponse(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipEducationListResponse)) {
            return false;
        }
        ScholarshipEducationListResponse scholarshipEducationListResponse = (ScholarshipEducationListResponse) p0;
        return Intrinsics.areEqual(this.nikPenerima, scholarshipEducationListResponse.nikPenerima) && Intrinsics.areEqual(this.namaPenerima, scholarshipEducationListResponse.namaPenerima) && Intrinsics.areEqual(this.tempatLahir, scholarshipEducationListResponse.tempatLahir) && Intrinsics.areEqual(this.tglLahir, scholarshipEducationListResponse.tglLahir) && Intrinsics.areEqual(this.tingkatPendidikan, scholarshipEducationListResponse.tingkatPendidikan);
    }

    public final int hashCode() {
        String str = this.nikPenerima;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.namaPenerima;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tempatLahir;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tglLahir;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        List<ScholarshipEducation> list = this.tingkatPendidikan;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.nikPenerima;
        String str2 = this.namaPenerima;
        String str3 = this.tempatLahir;
        String str4 = this.tglLahir;
        List<ScholarshipEducation> list = this.tingkatPendidikan;
        StringBuilder sb = new StringBuilder("ScholarshipEducationListResponse(nikPenerima=");
        sb.append(str);
        sb.append(", namaPenerima=");
        sb.append(str2);
        sb.append(", tempatLahir=");
        sb.append(str3);
        sb.append(", tglLahir=");
        sb.append(str4);
        sb.append(", tingkatPendidikan=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
