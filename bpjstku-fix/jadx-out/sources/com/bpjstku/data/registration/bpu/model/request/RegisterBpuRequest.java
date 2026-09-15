package com.bpjstku.data.registration.bpu.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b \u0010\u0015J\u0010\u0010!\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0010\u0010#\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b#\u0010\u0015J¦\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010\u0003\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b-\u0010\u0015R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010\u0015R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u0010\u0015R\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010\u0015R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u0010\u0015R\u001a\u00109\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010\u0015R\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b<\u0010\u0015R\u001a\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u0010\u0015R\u001a\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\b@\u0010\u0015R\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010/\u001a\u0004\bB\u0010\u0015R\u001a\u0010C\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u0010\u0015R\u001a\u0010E\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010/\u001a\u0004\bF\u0010\u0015R\u001a\u0010G\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bH\u0010\u0015R\u001a\u0010I\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bJ\u0010\u0015R\u001a\u0010K\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010/\u001a\u0004\bL\u0010\u0015"}, d2 = {"Lcom/bpjstku/data/registration/bpu/model/request/RegisterBpuRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/bpu/model/request/RegisterBpuRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "alamat", "Ljava/lang/String;", "getAlamat", "email", "getEmail", "jamAkhir", "getJamAkhir", "jamAwal", "getJamAwal", "jmlBulan", "getJmlBulan", "kodeKantor", "getKodeKantor", "kodeLokasiPekerjaan", "getKodeLokasiPekerjaan", "kodePekerjaan", "getKodePekerjaan", "kodePos", "getKodePos", "kodeProgram", "getKodeProgram", "namaLengkap", "getNamaLengkap", "nik", "getNik", "noHp", "getNoHp", "penghasilan", "getPenghasilan", "tglLahir", "getTglLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RegisterBpuRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("alamat")
    private final String alamat;

    @SerializedName("email")
    private final String email;

    @SerializedName("jamAkhir")
    private final String jamAkhir;

    @SerializedName("jamAwal")
    private final String jamAwal;

    @SerializedName("jmlBulan")
    private final String jmlBulan;

    @SerializedName("kodeKantor")
    private final String kodeKantor;

    @SerializedName("kodeLokasiPekerjaan")
    private final String kodeLokasiPekerjaan;

    @SerializedName("kodePekerjaan")
    private final String kodePekerjaan;

    @SerializedName("kodePos")
    private final String kodePos;

    @SerializedName("kodeProgram")
    private final String kodeProgram;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("noHp")
    private final String noHp;

    @SerializedName("penghasilan")
    private final String penghasilan;

    @SerializedName("tglLahir")
    private final String tglLahir;

    public final String getAlamat() {
        return this.alamat;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getJamAkhir() {
        return this.jamAkhir;
    }

    public final String getJamAwal() {
        return this.jamAwal;
    }

    public final String getJmlBulan() {
        return this.jmlBulan;
    }

    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    public final String getKodeLokasiPekerjaan() {
        return this.kodeLokasiPekerjaan;
    }

    public final String getKodePekerjaan() {
        return this.kodePekerjaan;
    }

    public final String getKodePos() {
        return this.kodePos;
    }

    public final String getKodeProgram() {
        return this.kodeProgram;
    }

    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getNoHp() {
        return this.noHp;
    }

    public final String getPenghasilan() {
        return this.penghasilan;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public RegisterBpuRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.alamat = str;
        this.email = str2;
        this.jamAkhir = str3;
        this.jamAwal = str4;
        this.jmlBulan = str5;
        this.kodeKantor = str6;
        this.kodeLokasiPekerjaan = str7;
        this.kodePekerjaan = str8;
        this.kodePos = str9;
        this.kodeProgram = str10;
        this.namaLengkap = str11;
        this.nik = str12;
        this.noHp = str13;
        this.penghasilan = str14;
        this.tglLahir = str15;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlamat() {
        return this.alamat;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getKodeProgram() {
        return this.kodeProgram;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNoHp() {
        return this.noHp;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPenghasilan() {
        return this.penghasilan;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJamAkhir() {
        return this.jamAkhir;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJamAwal() {
        return this.jamAwal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getJmlBulan() {
        return this.jmlBulan;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getKodeLokasiPekerjaan() {
        return this.kodeLokasiPekerjaan;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getKodePekerjaan() {
        return this.kodePekerjaan;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getKodePos() {
        return this.kodePos;
    }

    public final RegisterBpuRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p13, "");
        Intrinsics.checkNotNullParameter(p14, "");
        return new RegisterBpuRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RegisterBpuRequest)) {
            return false;
        }
        RegisterBpuRequest registerBpuRequest = (RegisterBpuRequest) p0;
        return Intrinsics.areEqual(this.alamat, registerBpuRequest.alamat) && Intrinsics.areEqual(this.email, registerBpuRequest.email) && Intrinsics.areEqual(this.jamAkhir, registerBpuRequest.jamAkhir) && Intrinsics.areEqual(this.jamAwal, registerBpuRequest.jamAwal) && Intrinsics.areEqual(this.jmlBulan, registerBpuRequest.jmlBulan) && Intrinsics.areEqual(this.kodeKantor, registerBpuRequest.kodeKantor) && Intrinsics.areEqual(this.kodeLokasiPekerjaan, registerBpuRequest.kodeLokasiPekerjaan) && Intrinsics.areEqual(this.kodePekerjaan, registerBpuRequest.kodePekerjaan) && Intrinsics.areEqual(this.kodePos, registerBpuRequest.kodePos) && Intrinsics.areEqual(this.kodeProgram, registerBpuRequest.kodeProgram) && Intrinsics.areEqual(this.namaLengkap, registerBpuRequest.namaLengkap) && Intrinsics.areEqual(this.nik, registerBpuRequest.nik) && Intrinsics.areEqual(this.noHp, registerBpuRequest.noHp) && Intrinsics.areEqual(this.penghasilan, registerBpuRequest.penghasilan) && Intrinsics.areEqual(this.tglLahir, registerBpuRequest.tglLahir);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((this.alamat.hashCode() * 31) + this.email.hashCode()) * 31) + this.jamAkhir.hashCode()) * 31) + this.jamAwal.hashCode()) * 31) + this.jmlBulan.hashCode()) * 31) + this.kodeKantor.hashCode()) * 31) + this.kodeLokasiPekerjaan.hashCode()) * 31) + this.kodePekerjaan.hashCode()) * 31) + this.kodePos.hashCode()) * 31) + this.kodeProgram.hashCode()) * 31) + this.namaLengkap.hashCode()) * 31) + this.nik.hashCode()) * 31) + this.noHp.hashCode()) * 31) + this.penghasilan.hashCode()) * 31) + this.tglLahir.hashCode();
    }

    public final String toString() {
        String str = this.alamat;
        String str2 = this.email;
        String str3 = this.jamAkhir;
        String str4 = this.jamAwal;
        String str5 = this.jmlBulan;
        String str6 = this.kodeKantor;
        String str7 = this.kodeLokasiPekerjaan;
        String str8 = this.kodePekerjaan;
        String str9 = this.kodePos;
        String str10 = this.kodeProgram;
        String str11 = this.namaLengkap;
        String str12 = this.nik;
        String str13 = this.noHp;
        String str14 = this.penghasilan;
        String str15 = this.tglLahir;
        StringBuilder sb = new StringBuilder("RegisterBpuRequest(alamat=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", jamAkhir=");
        sb.append(str3);
        sb.append(", jamAwal=");
        sb.append(str4);
        sb.append(", jmlBulan=");
        sb.append(str5);
        sb.append(", kodeKantor=");
        sb.append(str6);
        sb.append(", kodeLokasiPekerjaan=");
        sb.append(str7);
        sb.append(", kodePekerjaan=");
        sb.append(str8);
        sb.append(", kodePos=");
        sb.append(str9);
        sb.append(", kodeProgram=");
        sb.append(str10);
        sb.append(", namaLengkap=");
        sb.append(str11);
        sb.append(", nik=");
        sb.append(str12);
        sb.append(", noHp=");
        sb.append(str13);
        sb.append(", penghasilan=");
        sb.append(str14);
        sb.append(", tglLahir=");
        sb.append(str15);
        sb.append(")");
        return sb.toString();
    }
}
