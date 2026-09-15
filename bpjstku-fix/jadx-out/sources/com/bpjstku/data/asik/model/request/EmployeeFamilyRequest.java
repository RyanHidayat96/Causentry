package com.bpjstku.data.asik.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\fR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\fR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\fR\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\f"}, d2 = {"Lcom/bpjstku/data/asik/model/request/EmployeeFamilyRequest;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/request/EmployeeFamilyRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nik", "Ljava/lang/String;", "getNik", "nama", "getNama", "statusHubungan", "getStatusHubungan", "tanggalLahir", "getTanggalLahir", "jenisKelamin", "getJenisKelamin", "tempatLahir", "getTempatLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmployeeFamilyRequest {
    public static final int $stable = 0;

    @SerializedName("jenisKelamin")
    private final String jenisKelamin;

    @SerializedName("nama")
    private final String nama;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("statusHubungan")
    private final String statusHubungan;

    @SerializedName("tanggalLahir")
    private final String tanggalLahir;

    @SerializedName("tempatLahir")
    private final String tempatLahir;

    public EmployeeFamilyRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.nik = str;
        this.nama = str2;
        this.statusHubungan = str3;
        this.tanggalLahir = str4;
        this.jenisKelamin = str5;
        this.tempatLahir = str6;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getNama() {
        return this.nama;
    }

    public final String getStatusHubungan() {
        return this.statusHubungan;
    }

    public final String getTanggalLahir() {
        return this.tanggalLahir;
    }

    public final String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    public static /* synthetic */ EmployeeFamilyRequest copy$default(EmployeeFamilyRequest employeeFamilyRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = employeeFamilyRequest.nik;
        }
        if ((i & 2) != 0) {
            str2 = employeeFamilyRequest.nama;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = employeeFamilyRequest.statusHubungan;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = employeeFamilyRequest.tanggalLahir;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = employeeFamilyRequest.jenisKelamin;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = employeeFamilyRequest.tempatLahir;
        }
        return employeeFamilyRequest.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNama() {
        return this.nama;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusHubungan() {
        return this.statusHubungan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTanggalLahir() {
        return this.tanggalLahir;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getJenisKelamin() {
        return this.jenisKelamin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    public final EmployeeFamilyRequest copy(String p0, String p1, String p2, String p3, String p4, String p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        return new EmployeeFamilyRequest(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EmployeeFamilyRequest)) {
            return false;
        }
        EmployeeFamilyRequest employeeFamilyRequest = (EmployeeFamilyRequest) p0;
        return Intrinsics.areEqual(this.nik, employeeFamilyRequest.nik) && Intrinsics.areEqual(this.nama, employeeFamilyRequest.nama) && Intrinsics.areEqual(this.statusHubungan, employeeFamilyRequest.statusHubungan) && Intrinsics.areEqual(this.tanggalLahir, employeeFamilyRequest.tanggalLahir) && Intrinsics.areEqual(this.jenisKelamin, employeeFamilyRequest.jenisKelamin) && Intrinsics.areEqual(this.tempatLahir, employeeFamilyRequest.tempatLahir);
    }

    public final int hashCode() {
        return (((((((((this.nik.hashCode() * 31) + this.nama.hashCode()) * 31) + this.statusHubungan.hashCode()) * 31) + this.tanggalLahir.hashCode()) * 31) + this.jenisKelamin.hashCode()) * 31) + this.tempatLahir.hashCode();
    }

    public final String toString() {
        String str = this.nik;
        String str2 = this.nama;
        String str3 = this.statusHubungan;
        String str4 = this.tanggalLahir;
        String str5 = this.jenisKelamin;
        String str6 = this.tempatLahir;
        StringBuilder sb = new StringBuilder("EmployeeFamilyRequest(nik=");
        sb.append(str);
        sb.append(", nama=");
        sb.append(str2);
        sb.append(", statusHubungan=");
        sb.append(str3);
        sb.append(", tanggalLahir=");
        sb.append(str4);
        sb.append(", jenisKelamin=");
        sb.append(str5);
        sb.append(", tempatLahir=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
