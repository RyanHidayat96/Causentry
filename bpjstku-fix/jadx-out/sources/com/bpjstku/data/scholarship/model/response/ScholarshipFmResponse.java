package com.bpjstku.data.scholarship.model.response;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\fR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u001fR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001c\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u001fR$\u0010*\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u001f"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipFmResponse;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipFmResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "additionalHeader", "Ljava/lang/String;", "getAdditionalHeader", "setAdditionalHeader", "(Ljava/lang/String;)V", FirebaseAnalytics.Param.SCORE, "getScore", "setScore", "scoreLive", "getScoreLive", "setScoreLive", "isSuccessful", "setSuccessful", "isSuspend", "setSuspend", "message", "getMessage", "setMessage"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipFmResponse {
    public static final int $stable = 8;

    @SerializedName("additional-header")
    private String additionalHeader;

    @SerializedName("isSuccessful")
    private String isSuccessful;

    @SerializedName("isSuspend")
    private String isSuspend;

    @SerializedName("message")
    private String message;

    @SerializedName(FirebaseAnalytics.Param.SCORE)
    private String score;

    @SerializedName("scoreLiveness")
    private String scoreLive;

    public ScholarshipFmResponse(String str, String str2, String str3, String str4, String str5, String str6) {
        this.additionalHeader = str;
        this.score = str2;
        this.scoreLive = str3;
        this.isSuccessful = str4;
        this.isSuspend = str5;
        this.message = str6;
    }

    public /* synthetic */ ScholarshipFmResponse(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public final String getAdditionalHeader() {
        return this.additionalHeader;
    }

    public final void setAdditionalHeader(String str) {
        this.additionalHeader = str;
    }

    public final String getScore() {
        return this.score;
    }

    public final void setScore(String str) {
        this.score = str;
    }

    public final String getScoreLive() {
        return this.scoreLive;
    }

    public final void setScoreLive(String str) {
        this.scoreLive = str;
    }

    public final String isSuccessful() {
        return this.isSuccessful;
    }

    public final void setSuccessful(String str) {
        this.isSuccessful = str;
    }

    public final String isSuspend() {
        return this.isSuspend;
    }

    public final void setSuspend(String str) {
        this.isSuspend = str;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public ScholarshipFmResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ScholarshipFmResponse copy$default(ScholarshipFmResponse scholarshipFmResponse, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipFmResponse.additionalHeader;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipFmResponse.score;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = scholarshipFmResponse.scoreLive;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = scholarshipFmResponse.isSuccessful;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = scholarshipFmResponse.isSuspend;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = scholarshipFmResponse.message;
        }
        return scholarshipFmResponse.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdditionalHeader() {
        return this.additionalHeader;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScoreLive() {
        return this.scoreLive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIsSuspend() {
        return this.isSuspend;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ScholarshipFmResponse copy(String p0, String p1, String p2, String p3, String p4, String p5) {
        return new ScholarshipFmResponse(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipFmResponse)) {
            return false;
        }
        ScholarshipFmResponse scholarshipFmResponse = (ScholarshipFmResponse) p0;
        return Intrinsics.areEqual(this.additionalHeader, scholarshipFmResponse.additionalHeader) && Intrinsics.areEqual(this.score, scholarshipFmResponse.score) && Intrinsics.areEqual(this.scoreLive, scholarshipFmResponse.scoreLive) && Intrinsics.areEqual(this.isSuccessful, scholarshipFmResponse.isSuccessful) && Intrinsics.areEqual(this.isSuspend, scholarshipFmResponse.isSuspend) && Intrinsics.areEqual(this.message, scholarshipFmResponse.message);
    }

    public final int hashCode() {
        String str = this.additionalHeader;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.score;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.scoreLive;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.isSuccessful;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.isSuspend;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.message;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.additionalHeader;
        String str2 = this.score;
        String str3 = this.scoreLive;
        String str4 = this.isSuccessful;
        String str5 = this.isSuspend;
        String str6 = this.message;
        StringBuilder sb = new StringBuilder("ScholarshipFmResponse(additionalHeader=");
        sb.append(str);
        sb.append(", score=");
        sb.append(str2);
        sb.append(", scoreLive=");
        sb.append(str3);
        sb.append(", isSuccessful=");
        sb.append(str4);
        sb.append(", isSuspend=");
        sb.append(str5);
        sb.append(", message=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
