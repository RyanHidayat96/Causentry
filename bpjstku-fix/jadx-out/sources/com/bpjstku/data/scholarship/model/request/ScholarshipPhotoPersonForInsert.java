package com.bpjstku.data.scholarship.model.request;

import android.os.Process;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/bpjstku/data/scholarship/model/request/ScholarshipPhotoPersonForInsert;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/request/ScholarshipPhotoPersonForInsert;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "photoBase64", "Ljava/lang/String;", "getPhotoBase64", "pathCeph", "getPathCeph", "setPathCeph", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipPhotoPersonForInsert {
    public static final int $stable = 8;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int b;

    @SerializedName("pathCeph")
    private String pathCeph;

    @SerializedName("pathUrl")
    private final String photoBase64;

    public ScholarshipPhotoPersonForInsert(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.photoBase64 = str;
        this.pathCeph = str2;
    }

    public /* synthetic */ ScholarshipPhotoPersonForInsert(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public final String getPhotoBase64() {
        return this.photoBase64;
    }

    public final String getPathCeph() {
        return this.pathCeph;
    }

    public final void setPathCeph(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pathCeph = str;
    }

    public static /* synthetic */ ScholarshipPhotoPersonForInsert copy$default(ScholarshipPhotoPersonForInsert scholarshipPhotoPersonForInsert, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipPhotoPersonForInsert.photoBase64;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipPhotoPersonForInsert.pathCeph;
        }
        return scholarshipPhotoPersonForInsert.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhotoBase64() {
        return this.photoBase64;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPathCeph() {
        return this.pathCeph;
    }

    public final ScholarshipPhotoPersonForInsert copy(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new ScholarshipPhotoPersonForInsert(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipPhotoPersonForInsert)) {
            return false;
        }
        ScholarshipPhotoPersonForInsert scholarshipPhotoPersonForInsert = (ScholarshipPhotoPersonForInsert) p0;
        return Intrinsics.areEqual(this.photoBase64, scholarshipPhotoPersonForInsert.photoBase64) && Intrinsics.areEqual(this.pathCeph, scholarshipPhotoPersonForInsert.pathCeph);
    }

    public final int hashCode() {
        return (this.photoBase64.hashCode() * 31) + this.pathCeph.hashCode();
    }

    public final String toString() {
        String str = this.photoBase64;
        String str2 = this.pathCeph;
        StringBuilder sb = new StringBuilder("ScholarshipPhotoPersonForInsert(photoBase64=");
        sb.append(str);
        sb.append(", pathCeph=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 8689292;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        b = startUptimeMillis;
        return startUptimeMillis;
    }
}
