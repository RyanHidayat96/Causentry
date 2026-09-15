package com.bpjstku.data.tuition.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0019J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0019J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u0019J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0019Jè\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010\u0003\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b5\u0010\u0019R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0019R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010\u0019R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010\u0019R\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u0010\u0019R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010\u0019R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010\u0019R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bD\u0010\u0019R\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bF\u0010\u0019R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\bH\u0010\u0019R\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u00107\u001a\u0004\bJ\u0010\u0019R\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u00107\u001a\u0004\bL\u0010\u0019R\u001c\u0010M\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010%R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00107\u001a\u0004\bQ\u0010\u0019R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u00107\u001a\u0004\bS\u0010\u0019R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u00107\u001a\u0004\bU\u0010\u0019R\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\bW\u0010\u0019R\u001c\u0010X\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u00107\u001a\u0004\bY\u0010\u0019R\u001c\u0010Z\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u00107\u001a\u0004\b[\u0010\u0019"}, d2 = {"Lcom/bpjstku/data/tuition/model/response/BpuPaymentStatusItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "Lcom/bpjstku/data/tuition/model/response/PaymentFee;", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/tuition/model/response/PaymentFee;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/bpjstku/data/tuition/model/response/PaymentFee;", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/tuition/model/response/PaymentFee;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/tuition/model/response/BpuPaymentStatusItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodePembayaran", "Ljava/lang/String;", "getKodePembayaran", "jmlBulan", "getJmlBulan", "iuranJkk", "getIuranJkk", "iuranJkm", "getIuranJkm", "iuranJht", "getIuranJht", "totalIuran", "getTotalIuran", "hashData", "getHashData", "tanggalEfektif", "getTanggalEfektif", "tanggalExpired", "getTanggalExpired", "checkSum", "getCheckSum", "checkSumAutoDebit", "getCheckSumAutoDebit", "paymentFee", "Lcom/bpjstku/data/tuition/model/response/PaymentFee;", "getPaymentFee", "kodeIuranTrx", "getKodeIuranTrx", "namaLengkap", "getNamaLengkap", "salary", "getSalary", "nik", "getNik", "tglLahir", "getTglLahir", "program", "getProgram"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BpuPaymentStatusItem extends BaseItem {
    public static final int $stable = 0;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("checkSumAutoDebit")
    private final String checkSumAutoDebit;

    @SerializedName("hashData")
    private final String hashData;

    @SerializedName("iuranJht")
    private final String iuranJht;

    @SerializedName("iuranJkk")
    private final String iuranJkk;

    @SerializedName("iuranJkm")
    private final String iuranJkm;

    @SerializedName("jmlBulan")
    private final String jmlBulan;

    @SerializedName("kodeIuranTrx")
    private final String kodeIuranTrx;

    @SerializedName("kodePembayaran")
    private final String kodePembayaran;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("paymentFee")
    private final PaymentFee paymentFee;

    @SerializedName("program")
    private final String program;

    @SerializedName("salary")
    private final String salary;

    @SerializedName("tanggalEfektif")
    private final String tanggalEfektif;

    @SerializedName("tanggalExpired")
    private final String tanggalExpired;

    @SerializedName("tglLahir")
    private final String tglLahir;

    @SerializedName("totalIuran")
    private final String totalIuran;

    public final String getKodePembayaran() {
        return this.kodePembayaran;
    }

    public final String getJmlBulan() {
        return this.jmlBulan;
    }

    public final String getIuranJkk() {
        return this.iuranJkk;
    }

    public final String getIuranJkm() {
        return this.iuranJkm;
    }

    public final String getIuranJht() {
        return this.iuranJht;
    }

    public final String getTotalIuran() {
        return this.totalIuran;
    }

    public final String getHashData() {
        return this.hashData;
    }

    public final String getTanggalEfektif() {
        return this.tanggalEfektif;
    }

    public final String getTanggalExpired() {
        return this.tanggalExpired;
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public final String getCheckSumAutoDebit() {
        return this.checkSumAutoDebit;
    }

    public final PaymentFee getPaymentFee() {
        return this.paymentFee;
    }

    public final String getKodeIuranTrx() {
        return this.kodeIuranTrx;
    }

    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    public final String getSalary() {
        return this.salary;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public final String getProgram() {
        return this.program;
    }

    public BpuPaymentStatusItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, PaymentFee paymentFee, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.kodePembayaran = str;
        this.jmlBulan = str2;
        this.iuranJkk = str3;
        this.iuranJkm = str4;
        this.iuranJht = str5;
        this.totalIuran = str6;
        this.hashData = str7;
        this.tanggalEfektif = str8;
        this.tanggalExpired = str9;
        this.checkSum = str10;
        this.checkSumAutoDebit = str11;
        this.paymentFee = paymentFee;
        this.kodeIuranTrx = str12;
        this.namaLengkap = str13;
        this.salary = str14;
        this.nik = str15;
        this.tglLahir = str16;
        this.program = str17;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodePembayaran() {
        return this.kodePembayaran;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCheckSumAutoDebit() {
        return this.checkSumAutoDebit;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final PaymentFee getPaymentFee() {
        return this.paymentFee;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getKodeIuranTrx() {
        return this.kodeIuranTrx;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSalary() {
        return this.salary;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getProgram() {
        return this.program;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJmlBulan() {
        return this.jmlBulan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIuranJkk() {
        return this.iuranJkk;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIuranJkm() {
        return this.iuranJkm;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIuranJht() {
        return this.iuranJht;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTotalIuran() {
        return this.totalIuran;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHashData() {
        return this.hashData;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTanggalEfektif() {
        return this.tanggalEfektif;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTanggalExpired() {
        return this.tanggalExpired;
    }

    public final BpuPaymentStatusItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, PaymentFee p11, String p12, String p13, String p14, String p15, String p16, String p17) {
        return new BpuPaymentStatusItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BpuPaymentStatusItem)) {
            return false;
        }
        BpuPaymentStatusItem bpuPaymentStatusItem = (BpuPaymentStatusItem) p0;
        return Intrinsics.areEqual(this.kodePembayaran, bpuPaymentStatusItem.kodePembayaran) && Intrinsics.areEqual(this.jmlBulan, bpuPaymentStatusItem.jmlBulan) && Intrinsics.areEqual(this.iuranJkk, bpuPaymentStatusItem.iuranJkk) && Intrinsics.areEqual(this.iuranJkm, bpuPaymentStatusItem.iuranJkm) && Intrinsics.areEqual(this.iuranJht, bpuPaymentStatusItem.iuranJht) && Intrinsics.areEqual(this.totalIuran, bpuPaymentStatusItem.totalIuran) && Intrinsics.areEqual(this.hashData, bpuPaymentStatusItem.hashData) && Intrinsics.areEqual(this.tanggalEfektif, bpuPaymentStatusItem.tanggalEfektif) && Intrinsics.areEqual(this.tanggalExpired, bpuPaymentStatusItem.tanggalExpired) && Intrinsics.areEqual(this.checkSum, bpuPaymentStatusItem.checkSum) && Intrinsics.areEqual(this.checkSumAutoDebit, bpuPaymentStatusItem.checkSumAutoDebit) && Intrinsics.areEqual(this.paymentFee, bpuPaymentStatusItem.paymentFee) && Intrinsics.areEqual(this.kodeIuranTrx, bpuPaymentStatusItem.kodeIuranTrx) && Intrinsics.areEqual(this.namaLengkap, bpuPaymentStatusItem.namaLengkap) && Intrinsics.areEqual(this.salary, bpuPaymentStatusItem.salary) && Intrinsics.areEqual(this.nik, bpuPaymentStatusItem.nik) && Intrinsics.areEqual(this.tglLahir, bpuPaymentStatusItem.tglLahir) && Intrinsics.areEqual(this.program, bpuPaymentStatusItem.program);
    }

    public final int hashCode() {
        String str = this.kodePembayaran;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.jmlBulan;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iuranJkk;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.iuranJkm;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.iuranJht;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.totalIuran;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.hashData;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tanggalEfektif;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tanggalExpired;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.checkSum;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.checkSumAutoDebit;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        PaymentFee paymentFee = this.paymentFee;
        int iHashCode12 = paymentFee == null ? 0 : paymentFee.hashCode();
        String str12 = this.kodeIuranTrx;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.namaLengkap;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.salary;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.nik;
        int iHashCode16 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.tglLahir;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.program;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kodePembayaran;
        String str2 = this.jmlBulan;
        String str3 = this.iuranJkk;
        String str4 = this.iuranJkm;
        String str5 = this.iuranJht;
        String str6 = this.totalIuran;
        String str7 = this.hashData;
        String str8 = this.tanggalEfektif;
        String str9 = this.tanggalExpired;
        String str10 = this.checkSum;
        String str11 = this.checkSumAutoDebit;
        PaymentFee paymentFee = this.paymentFee;
        String str12 = this.kodeIuranTrx;
        String str13 = this.namaLengkap;
        String str14 = this.salary;
        String str15 = this.nik;
        String str16 = this.tglLahir;
        String str17 = this.program;
        StringBuilder sb = new StringBuilder("BpuPaymentStatusItem(kodePembayaran=");
        sb.append(str);
        sb.append(", jmlBulan=");
        sb.append(str2);
        sb.append(", iuranJkk=");
        sb.append(str3);
        sb.append(", iuranJkm=");
        sb.append(str4);
        sb.append(", iuranJht=");
        sb.append(str5);
        sb.append(", totalIuran=");
        sb.append(str6);
        sb.append(", hashData=");
        sb.append(str7);
        sb.append(", tanggalEfektif=");
        sb.append(str8);
        sb.append(", tanggalExpired=");
        sb.append(str9);
        sb.append(", checkSum=");
        sb.append(str10);
        sb.append(", checkSumAutoDebit=");
        sb.append(str11);
        sb.append(", paymentFee=");
        sb.append(paymentFee);
        sb.append(", kodeIuranTrx=");
        sb.append(str12);
        sb.append(", namaLengkap=");
        sb.append(str13);
        sb.append(", salary=");
        sb.append(str14);
        sb.append(", nik=");
        sb.append(str15);
        sb.append(", tglLahir=");
        sb.append(str16);
        sb.append(", program=");
        sb.append(str17);
        sb.append(")");
        return sb.toString();
    }
}
