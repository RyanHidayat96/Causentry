package com.bpjstku.data.jkp.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/bpjstku/data/jkp/model/request/CheckSubmissionJkpRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jkp/model/request/CheckSubmissionJkpRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "nik", "getNik", "namaTk", "getNamaTk", "tanggalLahir", "getTanggalLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckSubmissionJkpRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("namaTk")
    private final String namaTk;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("tanggalLahir")
    private final String tanggalLahir;

    public final String getEmail() {
        return this.email;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getNamaTk() {
        return this.namaTk;
    }

    public final String getTanggalLahir() {
        return this.tanggalLahir;
    }

    public CheckSubmissionJkpRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.email = str;
        this.nik = str2;
        this.namaTk = str3;
        this.tanggalLahir = str4;
    }

    public static /* synthetic */ CheckSubmissionJkpRequest copy$default(CheckSubmissionJkpRequest checkSubmissionJkpRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkSubmissionJkpRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = checkSubmissionJkpRequest.nik;
        }
        if ((i & 4) != 0) {
            str3 = checkSubmissionJkpRequest.namaTk;
        }
        if ((i & 8) != 0) {
            str4 = checkSubmissionJkpRequest.tanggalLahir;
        }
        return checkSubmissionJkpRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNamaTk() {
        return this.namaTk;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTanggalLahir() {
        return this.tanggalLahir;
    }

    public final CheckSubmissionJkpRequest copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new CheckSubmissionJkpRequest(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckSubmissionJkpRequest)) {
            return false;
        }
        CheckSubmissionJkpRequest checkSubmissionJkpRequest = (CheckSubmissionJkpRequest) p0;
        return Intrinsics.areEqual(this.email, checkSubmissionJkpRequest.email) && Intrinsics.areEqual(this.nik, checkSubmissionJkpRequest.nik) && Intrinsics.areEqual(this.namaTk, checkSubmissionJkpRequest.namaTk) && Intrinsics.areEqual(this.tanggalLahir, checkSubmissionJkpRequest.tanggalLahir);
    }

    public final int hashCode() {
        return (((((this.email.hashCode() * 31) + this.nik.hashCode()) * 31) + this.namaTk.hashCode()) * 31) + this.tanggalLahir.hashCode();
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.nik;
        String str3 = this.namaTk;
        String str4 = this.tanggalLahir;
        StringBuilder sb = new StringBuilder("CheckSubmissionJkpRequest(email=");
        sb.append(str);
        sb.append(", nik=");
        sb.append(str2);
        sb.append(", namaTk=");
        sb.append(str3);
        sb.append(", tanggalLahir=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
