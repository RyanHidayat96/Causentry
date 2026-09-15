package com.bpjstku.data.payment.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012J\u009a\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0012R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0012R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u0012R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u0012R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u0012R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u0012R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u0012R\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u0012R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010\u0012R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b=\u0010\u0012R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b?\u0010\u0012"}, d2 = {"Lcom/bpjstku/data/payment/model/request/PaymentProfileItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/PaymentProfileItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodeRef", "Ljava/lang/String;", "getKodeRef", "nik", "getNik", "namaLengkap", "getNamaLengkap", "tglLahir", "getTglLahir", "noHp", "getNoHp", "email", "getEmail", "tipeRekening", "getTipeRekening", "kodePaket", "getKodePaket", "nominal", "getNominal", "kodeIuran", "getKodeIuran", "kodePayment", "getKodePayment", "salary", "getSalary"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PaymentProfileItem {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("kodeIuran")
    private final String kodeIuran;

    @SerializedName("kodePaket")
    private final String kodePaket;

    @SerializedName("kodePayment")
    private final String kodePayment;

    @SerializedName("kodeRef")
    private final String kodeRef;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("noHp")
    private final String noHp;

    @SerializedName("nominal")
    private final String nominal;

    @SerializedName("salary")
    private final String salary;

    @SerializedName("tglLahir")
    private final String tglLahir;

    @SerializedName("tipeRekening")
    private final String tipeRekening;

    public PaymentProfileItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.kodeRef = str;
        this.nik = str2;
        this.namaLengkap = str3;
        this.tglLahir = str4;
        this.noHp = str5;
        this.email = str6;
        this.tipeRekening = str7;
        this.kodePaket = str8;
        this.nominal = str9;
        this.kodeIuran = str10;
        this.kodePayment = str11;
        this.salary = str12;
    }

    public final String getKodeRef() {
        return this.kodeRef;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getNamaLengkap() {
        return this.namaLengkap;
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

    public final String getTipeRekening() {
        return this.tipeRekening;
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

    public final String getKodePayment() {
        return this.kodePayment;
    }

    public final String getSalary() {
        return this.salary;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeRef() {
        return this.kodeRef;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getKodeIuran() {
        return this.kodeIuran;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getKodePayment() {
        return this.kodePayment;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSalary() {
        return this.salary;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNoHp() {
        return this.noHp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTipeRekening() {
        return this.tipeRekening;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getKodePaket() {
        return this.kodePaket;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNominal() {
        return this.nominal;
    }

    public final PaymentProfileItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p8, "");
        return new PaymentProfileItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PaymentProfileItem)) {
            return false;
        }
        PaymentProfileItem paymentProfileItem = (PaymentProfileItem) p0;
        return Intrinsics.areEqual(this.kodeRef, paymentProfileItem.kodeRef) && Intrinsics.areEqual(this.nik, paymentProfileItem.nik) && Intrinsics.areEqual(this.namaLengkap, paymentProfileItem.namaLengkap) && Intrinsics.areEqual(this.tglLahir, paymentProfileItem.tglLahir) && Intrinsics.areEqual(this.noHp, paymentProfileItem.noHp) && Intrinsics.areEqual(this.email, paymentProfileItem.email) && Intrinsics.areEqual(this.tipeRekening, paymentProfileItem.tipeRekening) && Intrinsics.areEqual(this.kodePaket, paymentProfileItem.kodePaket) && Intrinsics.areEqual(this.nominal, paymentProfileItem.nominal) && Intrinsics.areEqual(this.kodeIuran, paymentProfileItem.kodeIuran) && Intrinsics.areEqual(this.kodePayment, paymentProfileItem.kodePayment) && Intrinsics.areEqual(this.salary, paymentProfileItem.salary);
    }

    public final int hashCode() {
        int iHashCode = this.kodeRef.hashCode();
        int iHashCode2 = this.nik.hashCode();
        String str = this.namaLengkap;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.tglLahir;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.noHp;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.email;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tipeRekening;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.kodePaket;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        int iHashCode9 = this.nominal.hashCode();
        String str7 = this.kodeIuran;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.kodePayment;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.salary;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kodeRef;
        String str2 = this.nik;
        String str3 = this.namaLengkap;
        String str4 = this.tglLahir;
        String str5 = this.noHp;
        String str6 = this.email;
        String str7 = this.tipeRekening;
        String str8 = this.kodePaket;
        String str9 = this.nominal;
        String str10 = this.kodeIuran;
        String str11 = this.kodePayment;
        String str12 = this.salary;
        StringBuilder sb = new StringBuilder("PaymentProfileItem(kodeRef=");
        sb.append(str);
        sb.append(", nik=");
        sb.append(str2);
        sb.append(", namaLengkap=");
        sb.append(str3);
        sb.append(", tglLahir=");
        sb.append(str4);
        sb.append(", noHp=");
        sb.append(str5);
        sb.append(", email=");
        sb.append(str6);
        sb.append(", tipeRekening=");
        sb.append(str7);
        sb.append(", kodePaket=");
        sb.append(str8);
        sb.append(", nominal=");
        sb.append(str9);
        sb.append(", kodeIuran=");
        sb.append(str10);
        sb.append(", kodePayment=");
        sb.append(str11);
        sb.append(", salary=");
        sb.append(str12);
        sb.append(")");
        return sb.toString();
    }
}
