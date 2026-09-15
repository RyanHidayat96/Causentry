package com.bpjstku.data.scholarship.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000bR\"\u0010\u001b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\u001dR\"\u0010!\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\u001dR\"\u0010$\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010\u001d"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipVerificationResponse;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipVerificationResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isSuspend", "Ljava/lang/String;", "isSuccessful", "setSuccessful", "(Ljava/lang/String;)V", "message", "getMessage", "setMessage", "statusCode", "getStatusCode", "setStatusCode", "kodePengajuan", "getKodePengajuan", "setKodePengajuan"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipVerificationResponse {
    public static final int $stable = 8;

    @SerializedName("isSuccessful")
    private String isSuccessful;

    @SerializedName("isSuspend")
    private final String isSuspend;

    @SerializedName("kodePengajuan")
    private String kodePengajuan;

    @SerializedName("message")
    private String message;

    @SerializedName("statusCode")
    private String statusCode;

    public ScholarshipVerificationResponse(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.isSuspend = str;
        this.isSuccessful = str2;
        this.message = str3;
        this.statusCode = str4;
        this.kodePengajuan = str5;
    }

    public /* synthetic */ ScholarshipVerificationResponse(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public final String isSuspend() {
        return this.isSuspend;
    }

    public final String isSuccessful() {
        return this.isSuccessful;
    }

    public final void setSuccessful(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isSuccessful = str;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final void setStatusCode(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.statusCode = str;
    }

    public final String getKodePengajuan() {
        return this.kodePengajuan;
    }

    public final void setKodePengajuan(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.kodePengajuan = str;
    }

    public ScholarshipVerificationResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ScholarshipVerificationResponse copy$default(ScholarshipVerificationResponse scholarshipVerificationResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipVerificationResponse.isSuspend;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipVerificationResponse.isSuccessful;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = scholarshipVerificationResponse.message;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = scholarshipVerificationResponse.statusCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = scholarshipVerificationResponse.kodePengajuan;
        }
        return scholarshipVerificationResponse.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIsSuspend() {
        return this.isSuspend;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKodePengajuan() {
        return this.kodePengajuan;
    }

    public final ScholarshipVerificationResponse copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new ScholarshipVerificationResponse(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipVerificationResponse)) {
            return false;
        }
        ScholarshipVerificationResponse scholarshipVerificationResponse = (ScholarshipVerificationResponse) p0;
        return Intrinsics.areEqual(this.isSuspend, scholarshipVerificationResponse.isSuspend) && Intrinsics.areEqual(this.isSuccessful, scholarshipVerificationResponse.isSuccessful) && Intrinsics.areEqual(this.message, scholarshipVerificationResponse.message) && Intrinsics.areEqual(this.statusCode, scholarshipVerificationResponse.statusCode) && Intrinsics.areEqual(this.kodePengajuan, scholarshipVerificationResponse.kodePengajuan);
    }

    public final int hashCode() {
        return (((((((this.isSuspend.hashCode() * 31) + this.isSuccessful.hashCode()) * 31) + this.message.hashCode()) * 31) + this.statusCode.hashCode()) * 31) + this.kodePengajuan.hashCode();
    }

    public final String toString() {
        String str = this.isSuspend;
        String str2 = this.isSuccessful;
        String str3 = this.message;
        String str4 = this.statusCode;
        String str5 = this.kodePengajuan;
        StringBuilder sb = new StringBuilder("ScholarshipVerificationResponse(isSuspend=");
        sb.append(str);
        sb.append(", isSuccessful=");
        sb.append(str2);
        sb.append(", message=");
        sb.append(str3);
        sb.append(", statusCode=");
        sb.append(str4);
        sb.append(", kodePengajuan=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
