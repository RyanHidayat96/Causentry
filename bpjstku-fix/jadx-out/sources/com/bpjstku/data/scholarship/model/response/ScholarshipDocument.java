package com.bpjstku.data.scholarship.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\u0017"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipDocument;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipDocument;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kode", "Ljava/lang/String;", "getKode", "setKode", "(Ljava/lang/String;)V", "path", "getPath", "setPath"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipDocument {
    public static final int $stable = 8;

    @SerializedName("kodeDocument")
    private String kode;

    @SerializedName("filePath")
    private String path;

    public ScholarshipDocument(String str, String str2) {
        this.kode = str;
        this.path = str2;
    }

    public /* synthetic */ ScholarshipDocument(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getKode() {
        return this.kode;
    }

    public final void setKode(String str) {
        this.kode = str;
    }

    public final String getPath() {
        return this.path;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScholarshipDocument() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ScholarshipDocument copy$default(ScholarshipDocument scholarshipDocument, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipDocument.kode;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipDocument.path;
        }
        return scholarshipDocument.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKode() {
        return this.kode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final ScholarshipDocument copy(String p0, String p1) {
        return new ScholarshipDocument(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipDocument)) {
            return false;
        }
        ScholarshipDocument scholarshipDocument = (ScholarshipDocument) p0;
        return Intrinsics.areEqual(this.kode, scholarshipDocument.kode) && Intrinsics.areEqual(this.path, scholarshipDocument.path);
    }

    public final int hashCode() {
        String str = this.kode;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.path;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kode;
        String str2 = this.path;
        StringBuilder sb = new StringBuilder("ScholarshipDocument(kode=");
        sb.append(str);
        sb.append(", path=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
