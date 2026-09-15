package com.bpjstku.data.scholarship.model.response;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J¸\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b*\u0010\u0014R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010/R$\u00100\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010/R$\u00103\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010,\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010/R$\u00106\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010/R$\u00109\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010,\u001a\u0004\b:\u0010\u0014\"\u0004\b;\u0010/R$\u0010<\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010,\u001a\u0004\b=\u0010\u0014\"\u0004\b>\u0010/R$\u0010?\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010,\u001a\u0004\b@\u0010\u0014\"\u0004\bA\u0010/R$\u0010B\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010,\u001a\u0004\bC\u0010\u0014\"\u0004\bD\u0010/R$\u0010E\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010,\u001a\u0004\bF\u0010\u0014\"\u0004\bG\u0010/R$\u0010H\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010,\u001a\u0004\bI\u0010\u0014\"\u0004\bJ\u0010/R$\u0010K\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010,\u001a\u0004\bL\u0010\u0014\"\u0004\bM\u0010/R$\u0010N\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010,\u001a\u0004\bO\u0010\u0014\"\u0004\bP\u0010/R$\u0010Q\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010,\u001a\u0004\bR\u0010\u0014\"\u0004\bS\u0010/R$\u0010T\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010,\u001a\u0004\bU\u0010\u0014\"\u0004\bV\u0010/"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/BenefitInfo;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/BenefitInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "recipientName", "Ljava/lang/String;", "getRecipientName", "setRecipientName", "(Ljava/lang/String;)V", NotificationCompat.CATEGORY_STATUS, "getStatus", "setStatus", "participantNik", "getParticipantNik", "setParticipantNik", "participantName", "getParticipantName", "setParticipantName", "participantKpj", "getParticipantKpj", "setParticipantKpj", "scholarshipType", "getScholarshipType", "setScholarshipType", "educationLevel", "getEducationLevel", "setEducationLevel", "year", "getYear", "setYear", "gradeLevel", "getGradeLevel", "setGradeLevel", "institution", "getInstitution", "setInstitution", "benefit", "getBenefit", "setBenefit", "date", "getDate", "setDate", "age", "getAge", "setAge", "relationName", "getRelationName", "setRelationName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BenefitInfo {
    public static final int $stable = 8;

    @SerializedName("umur")
    private String age;

    @SerializedName("manfaat")
    private String benefit;

    @SerializedName("tanggal")
    private String date;

    @SerializedName("jenjangPendidikan")
    private String educationLevel;

    @SerializedName("tingkatKelas")
    private String gradeLevel;

    @SerializedName("lembaga")
    private String institution;

    @SerializedName("kpjPeserta")
    private String participantKpj;

    @SerializedName("namaPeserta")
    private String participantName;

    @SerializedName("nikPeserta")
    private String participantNik;

    @SerializedName("namaPenerima")
    private String recipientName;

    @SerializedName("namaHubungan")
    private String relationName;

    @SerializedName("jenisBeasiswa")
    private String scholarshipType;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;

    @SerializedName("tahun")
    private String year;

    public BenefitInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.recipientName = str;
        this.status = str2;
        this.participantNik = str3;
        this.participantName = str4;
        this.participantKpj = str5;
        this.scholarshipType = str6;
        this.educationLevel = str7;
        this.year = str8;
        this.gradeLevel = str9;
        this.institution = str10;
        this.benefit = str11;
        this.date = str12;
        this.age = str13;
        this.relationName = str14;
    }

    public /* synthetic */ BenefitInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) == 0 ? str14 : "");
    }

    public final String getRecipientName() {
        return this.recipientName;
    }

    public final void setRecipientName(String str) {
        this.recipientName = str;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final String getParticipantNik() {
        return this.participantNik;
    }

    public final void setParticipantNik(String str) {
        this.participantNik = str;
    }

    public final String getParticipantName() {
        return this.participantName;
    }

    public final void setParticipantName(String str) {
        this.participantName = str;
    }

    public final String getParticipantKpj() {
        return this.participantKpj;
    }

    public final void setParticipantKpj(String str) {
        this.participantKpj = str;
    }

    public final String getScholarshipType() {
        return this.scholarshipType;
    }

    public final void setScholarshipType(String str) {
        this.scholarshipType = str;
    }

    public final String getEducationLevel() {
        return this.educationLevel;
    }

    public final void setEducationLevel(String str) {
        this.educationLevel = str;
    }

    public final String getYear() {
        return this.year;
    }

    public final void setYear(String str) {
        this.year = str;
    }

    public final String getGradeLevel() {
        return this.gradeLevel;
    }

    public final void setGradeLevel(String str) {
        this.gradeLevel = str;
    }

    public final String getInstitution() {
        return this.institution;
    }

    public final void setInstitution(String str) {
        this.institution = str;
    }

    public final String getBenefit() {
        return this.benefit;
    }

    public final void setBenefit(String str) {
        this.benefit = str;
    }

    public final String getDate() {
        return this.date;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final String getAge() {
        return this.age;
    }

    public final void setAge(String str) {
        this.age = str;
    }

    public final String getRelationName() {
        return this.relationName;
    }

    public final void setRelationName(String str) {
        this.relationName = str;
    }

    public BenefitInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRecipientName() {
        return this.recipientName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getInstitution() {
        return this.institution;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBenefit() {
        return this.benefit;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRelationName() {
        return this.relationName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParticipantNik() {
        return this.participantNik;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getParticipantName() {
        return this.participantName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getParticipantKpj() {
        return this.participantKpj;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getScholarshipType() {
        return this.scholarshipType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEducationLevel() {
        return this.educationLevel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGradeLevel() {
        return this.gradeLevel;
    }

    public final BenefitInfo copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13) {
        return new BenefitInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BenefitInfo)) {
            return false;
        }
        BenefitInfo benefitInfo = (BenefitInfo) p0;
        return Intrinsics.areEqual(this.recipientName, benefitInfo.recipientName) && Intrinsics.areEqual(this.status, benefitInfo.status) && Intrinsics.areEqual(this.participantNik, benefitInfo.participantNik) && Intrinsics.areEqual(this.participantName, benefitInfo.participantName) && Intrinsics.areEqual(this.participantKpj, benefitInfo.participantKpj) && Intrinsics.areEqual(this.scholarshipType, benefitInfo.scholarshipType) && Intrinsics.areEqual(this.educationLevel, benefitInfo.educationLevel) && Intrinsics.areEqual(this.year, benefitInfo.year) && Intrinsics.areEqual(this.gradeLevel, benefitInfo.gradeLevel) && Intrinsics.areEqual(this.institution, benefitInfo.institution) && Intrinsics.areEqual(this.benefit, benefitInfo.benefit) && Intrinsics.areEqual(this.date, benefitInfo.date) && Intrinsics.areEqual(this.age, benefitInfo.age) && Intrinsics.areEqual(this.relationName, benefitInfo.relationName);
    }

    public final int hashCode() {
        String str = this.recipientName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.status;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.participantNik;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.participantName;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.participantKpj;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.scholarshipType;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.educationLevel;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.year;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.gradeLevel;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.institution;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.benefit;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.date;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.age;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.relationName;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.recipientName;
        String str2 = this.status;
        String str3 = this.participantNik;
        String str4 = this.participantName;
        String str5 = this.participantKpj;
        String str6 = this.scholarshipType;
        String str7 = this.educationLevel;
        String str8 = this.year;
        String str9 = this.gradeLevel;
        String str10 = this.institution;
        String str11 = this.benefit;
        String str12 = this.date;
        String str13 = this.age;
        String str14 = this.relationName;
        StringBuilder sb = new StringBuilder("BenefitInfo(recipientName=");
        sb.append(str);
        sb.append(", status=");
        sb.append(str2);
        sb.append(", participantNik=");
        sb.append(str3);
        sb.append(", participantName=");
        sb.append(str4);
        sb.append(", participantKpj=");
        sb.append(str5);
        sb.append(", scholarshipType=");
        sb.append(str6);
        sb.append(", educationLevel=");
        sb.append(str7);
        sb.append(", year=");
        sb.append(str8);
        sb.append(", gradeLevel=");
        sb.append(str9);
        sb.append(", institution=");
        sb.append(str10);
        sb.append(", benefit=");
        sb.append(str11);
        sb.append(", date=");
        sb.append(str12);
        sb.append(", age=");
        sb.append(str13);
        sb.append(", relationName=");
        sb.append(str14);
        sb.append(")");
        return sb.toString();
    }
}
