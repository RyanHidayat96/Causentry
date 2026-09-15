package com.bpjstku.data.scholarship.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJv\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b#\u0010\u0011R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010(R$\u0010,\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010%\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010(R$\u0010/\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u0011\"\u0004\b1\u0010(R$\u00102\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010%\u001a\u0004\b3\u0010\u0011\"\u0004\b4\u0010(R$\u00105\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010%\u001a\u0004\b6\u0010\u0011\"\u0004\b7\u0010(R$\u00108\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010<R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010A"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipDataEligible;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "Lcom/bpjstku/data/scholarship/model/response/BenefitInfo;", "p6", "", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipDataDocument;", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/scholarship/model/response/BenefitInfo;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/bpjstku/data/scholarship/model/response/BenefitInfo;", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/scholarship/model/response/BenefitInfo;Ljava/util/List;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipDataEligible;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "statusPencarian", "Ljava/lang/String;", "getStatusPencarian", "setStatusPencarian", "(Ljava/lang/String;)V", "statusKonfirmasi", "getStatusKonfirmasi", "setStatusKonfirmasi", "descPencarian", "getDescPencarian", "setDescPencarian", "minFaceMatch", "getMinFaceMatch", "setMinFaceMatch", "name", "getName", "setName", "nik", "getNik", "setNik", "benefitInfo", "Lcom/bpjstku/data/scholarship/model/response/BenefitInfo;", "getBenefitInfo", "setBenefitInfo", "(Lcom/bpjstku/data/scholarship/model/response/BenefitInfo;)V", "documents", "Ljava/util/List;", "getDocuments", "setDocuments", "(Ljava/util/List;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipDataEligible {
    public static final int $stable = 8;

    @SerializedName("infoManfaat")
    private BenefitInfo benefitInfo;

    @SerializedName("keteranganPencarian")
    private String descPencarian;

    @SerializedName("dataDokumenBeasiswa")
    private List<ScholarshipDataDocument> documents;

    @SerializedName("minSkorFaceMatch")
    private String minFaceMatch;

    @SerializedName("namaPenerima")
    private String name;

    @SerializedName("nikPenerima")
    private String nik;

    @SerializedName("statusEksisKonfirmasi")
    private String statusKonfirmasi;

    @SerializedName("statusPencarian")
    private String statusPencarian;

    public ScholarshipDataEligible(String str, String str2, String str3, String str4, String str5, String str6, BenefitInfo benefitInfo, List<ScholarshipDataDocument> list) {
        this.statusPencarian = str;
        this.statusKonfirmasi = str2;
        this.descPencarian = str3;
        this.minFaceMatch = str4;
        this.name = str5;
        this.nik = str6;
        this.benefitInfo = benefitInfo;
        this.documents = list;
    }

    public /* synthetic */ ScholarshipDataEligible(String str, String str2, String str3, String str4, String str5, String str6, BenefitInfo benefitInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, benefitInfo, (i & 128) != 0 ? null : list);
    }

    public final String getStatusPencarian() {
        return this.statusPencarian;
    }

    public final void setStatusPencarian(String str) {
        this.statusPencarian = str;
    }

    public final String getStatusKonfirmasi() {
        return this.statusKonfirmasi;
    }

    public final void setStatusKonfirmasi(String str) {
        this.statusKonfirmasi = str;
    }

    public final String getDescPencarian() {
        return this.descPencarian;
    }

    public final void setDescPencarian(String str) {
        this.descPencarian = str;
    }

    public final String getMinFaceMatch() {
        return this.minFaceMatch;
    }

    public final void setMinFaceMatch(String str) {
        this.minFaceMatch = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getNik() {
        return this.nik;
    }

    public final void setNik(String str) {
        this.nik = str;
    }

    public final BenefitInfo getBenefitInfo() {
        return this.benefitInfo;
    }

    public final void setBenefitInfo(BenefitInfo benefitInfo) {
        this.benefitInfo = benefitInfo;
    }

    public final List<ScholarshipDataDocument> getDocuments() {
        return this.documents;
    }

    public final void setDocuments(List<ScholarshipDataDocument> list) {
        this.documents = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusPencarian() {
        return this.statusPencarian;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusKonfirmasi() {
        return this.statusKonfirmasi;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescPencarian() {
        return this.descPencarian;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMinFaceMatch() {
        return this.minFaceMatch;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BenefitInfo getBenefitInfo() {
        return this.benefitInfo;
    }

    public final List<ScholarshipDataDocument> component8() {
        return this.documents;
    }

    public final ScholarshipDataEligible copy(String p0, String p1, String p2, String p3, String p4, String p5, BenefitInfo p6, List<ScholarshipDataDocument> p7) {
        return new ScholarshipDataEligible(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipDataEligible)) {
            return false;
        }
        ScholarshipDataEligible scholarshipDataEligible = (ScholarshipDataEligible) p0;
        return Intrinsics.areEqual(this.statusPencarian, scholarshipDataEligible.statusPencarian) && Intrinsics.areEqual(this.statusKonfirmasi, scholarshipDataEligible.statusKonfirmasi) && Intrinsics.areEqual(this.descPencarian, scholarshipDataEligible.descPencarian) && Intrinsics.areEqual(this.minFaceMatch, scholarshipDataEligible.minFaceMatch) && Intrinsics.areEqual(this.name, scholarshipDataEligible.name) && Intrinsics.areEqual(this.nik, scholarshipDataEligible.nik) && Intrinsics.areEqual(this.benefitInfo, scholarshipDataEligible.benefitInfo) && Intrinsics.areEqual(this.documents, scholarshipDataEligible.documents);
    }

    public final int hashCode() {
        String str = this.statusPencarian;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.statusKonfirmasi;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.descPencarian;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.minFaceMatch;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.name;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nik;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        BenefitInfo benefitInfo = this.benefitInfo;
        int iHashCode7 = benefitInfo == null ? 0 : benefitInfo.hashCode();
        List<ScholarshipDataDocument> list = this.documents;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.statusPencarian;
        String str2 = this.statusKonfirmasi;
        String str3 = this.descPencarian;
        String str4 = this.minFaceMatch;
        String str5 = this.name;
        String str6 = this.nik;
        BenefitInfo benefitInfo = this.benefitInfo;
        List<ScholarshipDataDocument> list = this.documents;
        StringBuilder sb = new StringBuilder("ScholarshipDataEligible(statusPencarian=");
        sb.append(str);
        sb.append(", statusKonfirmasi=");
        sb.append(str2);
        sb.append(", descPencarian=");
        sb.append(str3);
        sb.append(", minFaceMatch=");
        sb.append(str4);
        sb.append(", name=");
        sb.append(str5);
        sb.append(", nik=");
        sb.append(str6);
        sb.append(", benefitInfo=");
        sb.append(benefitInfo);
        sb.append(", documents=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
