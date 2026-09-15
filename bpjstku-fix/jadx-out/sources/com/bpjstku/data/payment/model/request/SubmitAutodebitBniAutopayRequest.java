package com.bpjstku.data.payment.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b#\u0010\u0010R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0010R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0010R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u0010R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u0010R\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u0010R\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010\u0010R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010\u0010R\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010\u0010R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010\u0010"}, d2 = {"Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nik", "Ljava/lang/String;", "getNik", "namaLengkap", "getNamaLengkap", "kodePaket", "getKodePaket", "nominal", "getNominal", "kodeIuran", "getKodeIuran", "nomorRekening", "getNomorRekening", "nomorKartu", "getNomorKartu", "tglLahir", "getTglLahir", "noHp", "getNoHp", "email", "getEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SubmitAutodebitBniAutopayRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("kodeIuran")
    private final String kodeIuran;

    @SerializedName("kodePaket")
    private final String kodePaket;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("noHp")
    private final String noHp;

    @SerializedName("nominal")
    private final String nominal;

    @SerializedName("nomorKartu")
    private final String nomorKartu;

    @SerializedName("nomorRekening")
    private final String nomorRekening;

    @SerializedName("tglLahir")
    private final String tglLahir;

    public final String getNik() {
        return this.nik;
    }

    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    public final String getKodePaket() {
        return this.kodePaket;
    }

    public final String getNominal() {
        return this.nominal;
    }

    public final String getKodeIuran() {
        return this.kodeIuran;
    }

    public final String getNomorRekening() {
        return this.nomorRekening;
    }

    public final String getNomorKartu() {
        return this.nomorKartu;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public final String getNoHp() {
        return this.noHp;
    }

    public final String getEmail() {
        return this.email;
    }

    public SubmitAutodebitBniAutopayRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
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
        this.nik = str;
        this.namaLengkap = str2;
        this.kodePaket = str3;
        this.nominal = str4;
        this.kodeIuran = str5;
        this.nomorRekening = str6;
        this.nomorKartu = str7;
        this.tglLahir = str8;
        this.noHp = str9;
        this.email = str10;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKodePaket() {
        return this.kodePaket;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNominal() {
        return this.nominal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKodeIuran() {
        return this.kodeIuran;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNomorRekening() {
        return this.nomorRekening;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNomorKartu() {
        return this.nomorKartu;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNoHp() {
        return this.noHp;
    }

    public final SubmitAutodebitBniAutopayRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9) {
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
        return new SubmitAutodebitBniAutopayRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SubmitAutodebitBniAutopayRequest)) {
            return false;
        }
        SubmitAutodebitBniAutopayRequest submitAutodebitBniAutopayRequest = (SubmitAutodebitBniAutopayRequest) p0;
        return Intrinsics.areEqual(this.nik, submitAutodebitBniAutopayRequest.nik) && Intrinsics.areEqual(this.namaLengkap, submitAutodebitBniAutopayRequest.namaLengkap) && Intrinsics.areEqual(this.kodePaket, submitAutodebitBniAutopayRequest.kodePaket) && Intrinsics.areEqual(this.nominal, submitAutodebitBniAutopayRequest.nominal) && Intrinsics.areEqual(this.kodeIuran, submitAutodebitBniAutopayRequest.kodeIuran) && Intrinsics.areEqual(this.nomorRekening, submitAutodebitBniAutopayRequest.nomorRekening) && Intrinsics.areEqual(this.nomorKartu, submitAutodebitBniAutopayRequest.nomorKartu) && Intrinsics.areEqual(this.tglLahir, submitAutodebitBniAutopayRequest.tglLahir) && Intrinsics.areEqual(this.noHp, submitAutodebitBniAutopayRequest.noHp) && Intrinsics.areEqual(this.email, submitAutodebitBniAutopayRequest.email);
    }

    public final int hashCode() {
        return (((((((((((((((((this.nik.hashCode() * 31) + this.namaLengkap.hashCode()) * 31) + this.kodePaket.hashCode()) * 31) + this.nominal.hashCode()) * 31) + this.kodeIuran.hashCode()) * 31) + this.nomorRekening.hashCode()) * 31) + this.nomorKartu.hashCode()) * 31) + this.tglLahir.hashCode()) * 31) + this.noHp.hashCode()) * 31) + this.email.hashCode();
    }

    public final String toString() {
        String str = this.nik;
        String str2 = this.namaLengkap;
        String str3 = this.kodePaket;
        String str4 = this.nominal;
        String str5 = this.kodeIuran;
        String str6 = this.nomorRekening;
        String str7 = this.nomorKartu;
        String str8 = this.tglLahir;
        String str9 = this.noHp;
        String str10 = this.email;
        StringBuilder sb = new StringBuilder("SubmitAutodebitBniAutopayRequest(nik=");
        sb.append(str);
        sb.append(", namaLengkap=");
        sb.append(str2);
        sb.append(", kodePaket=");
        sb.append(str3);
        sb.append(", nominal=");
        sb.append(str4);
        sb.append(", kodeIuran=");
        sb.append(str5);
        sb.append(", nomorRekening=");
        sb.append(str6);
        sb.append(", nomorKartu=");
        sb.append(str7);
        sb.append(", tglLahir=");
        sb.append(str8);
        sb.append(", noHp=");
        sb.append(str9);
        sb.append(", email=");
        sb.append(str10);
        sb.append(")");
        return sb.toString();
    }
}
