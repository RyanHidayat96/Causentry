package com.bpjstku.data.registration.general.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001dJ\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001dJ\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001dJ\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001dJ\u0098\u0002\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u0010\u0003\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b=\u0010\u001dR\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001dR\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010?\u001a\u0004\bB\u0010\u001dR\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010\u001dR\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010?\u001a\u0004\bF\u0010\u001dR\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010\u001dR\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010?\u001a\u0004\bJ\u0010\u001dR\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bL\u0010\u001dR\u001c\u0010M\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010?\u001a\u0004\bN\u0010\u001dR\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010?\u001a\u0004\bP\u0010\u001dR\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010\u001dR\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010?\u001a\u0004\bT\u0010\u001dR\u001c\u0010U\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010?\u001a\u0004\bV\u0010\u001dR\u001c\u0010W\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010?\u001a\u0004\bX\u0010\u001dR\u001c\u0010Y\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010\u001dR\u001c\u0010[\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010?\u001a\u0004\b\\\u0010\u001dR\u001c\u0010]\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010?\u001a\u0004\b^\u0010\u001dR\u001c\u0010_\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010?\u001a\u0004\b`\u0010\u001dR\u001c\u0010a\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010/R\u001c\u0010d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010?\u001a\u0004\be\u0010\u001dR\u001c\u0010f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010?\u001a\u0004\bg\u0010\u001dR\u001c\u0010h\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010?\u001a\u0004\bi\u0010\u001dR\u001c\u0010j\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010?\u001a\u0004\bk\u0010\u001d"}, d2 = {"Lcom/bpjstku/data/registration/general/model/response/RegistrationItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "Lcom/bpjstku/data/tuition/model/response/PaymentFee;", "p17", "p18", "p19", "p20", "p21", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/tuition/model/response/PaymentFee;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "()Lcom/bpjstku/data/tuition/model/response/PaymentFee;", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/tuition/model/response/PaymentFee;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/response/RegistrationItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "iuranJht", "Ljava/lang/String;", "getIuranJht", "iuranJkk", "getIuranJkk", "iuranJkm", "getIuranJkm", "kodePembayaran", "getKodePembayaran", "totalIuran", "getTotalIuran", "namaLengkap", "getNamaLengkap", "email", "getEmail", "noHp", "getNoHp", PlaceTypes.ADDRESS, "getAddress", "kodePos", "getKodePos", "jmlBulan", "getJmlBulan", "context", "getContext", "nik", "getNik", "hashData", "getHashData", "tanggalEfektif", "getTanggalEfektif", "tanggalExpired", "getTanggalExpired", "checkSum", "getCheckSum", "paymentFee", "Lcom/bpjstku/data/tuition/model/response/PaymentFee;", "getPaymentFee", "tglLahir", "getTglLahir", "salary", "getSalary", "kodeIuranTrx", "getKodeIuranTrx", "transactionDate", "getTransactionDate"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RegistrationItem extends BaseItem {
    public static final int $stable = 0;

    @SerializedName(PlaceTypes.ADDRESS)
    private final String address;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("context")
    private final String context;

    @SerializedName("email")
    private final String email;

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

    @SerializedName("kodePos")
    private final String kodePos;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("noHp")
    private final String noHp;

    @SerializedName("paymentFee")
    private final com.bpjstku.data.tuition.model.response.PaymentFee paymentFee;

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

    @SerializedName("transactionDate")
    private final String transactionDate;

    public final String getIuranJht() {
        return this.iuranJht;
    }

    public final String getIuranJkk() {
        return this.iuranJkk;
    }

    public final String getIuranJkm() {
        return this.iuranJkm;
    }

    public final String getKodePembayaran() {
        return this.kodePembayaran;
    }

    public final String getTotalIuran() {
        return this.totalIuran;
    }

    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getNoHp() {
        return this.noHp;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getKodePos() {
        return this.kodePos;
    }

    public final String getJmlBulan() {
        return this.jmlBulan;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getNik() {
        return this.nik;
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

    public final com.bpjstku.data.tuition.model.response.PaymentFee getPaymentFee() {
        return this.paymentFee;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public final String getSalary() {
        return this.salary;
    }

    public final String getKodeIuranTrx() {
        return this.kodeIuranTrx;
    }

    public final String getTransactionDate() {
        return this.transactionDate;
    }

    public RegistrationItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, com.bpjstku.data.tuition.model.response.PaymentFee paymentFee, String str18, String str19, String str20, String str21) {
        this.iuranJht = str;
        this.iuranJkk = str2;
        this.iuranJkm = str3;
        this.kodePembayaran = str4;
        this.totalIuran = str5;
        this.namaLengkap = str6;
        this.email = str7;
        this.noHp = str8;
        this.address = str9;
        this.kodePos = str10;
        this.jmlBulan = str11;
        this.context = str12;
        this.nik = str13;
        this.hashData = str14;
        this.tanggalEfektif = str15;
        this.tanggalExpired = str16;
        this.checkSum = str17;
        this.paymentFee = paymentFee;
        this.tglLahir = str18;
        this.salary = str19;
        this.kodeIuranTrx = str20;
        this.transactionDate = str21;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIuranJht() {
        return this.iuranJht;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getKodePos() {
        return this.kodePos;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getJmlBulan() {
        return this.jmlBulan;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getHashData() {
        return this.hashData;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTanggalEfektif() {
        return this.tanggalEfektif;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTanggalExpired() {
        return this.tanggalExpired;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final com.bpjstku.data.tuition.model.response.PaymentFee getPaymentFee() {
        return this.paymentFee;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIuranJkk() {
        return this.iuranJkk;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSalary() {
        return this.salary;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getKodeIuranTrx() {
        return this.kodeIuranTrx;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIuranJkm() {
        return this.iuranJkm;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodePembayaran() {
        return this.kodePembayaran;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTotalIuran() {
        return this.totalIuran;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNoHp() {
        return this.noHp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final RegistrationItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, com.bpjstku.data.tuition.model.response.PaymentFee p17, String p18, String p19, String p20, String p21) {
        return new RegistrationItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RegistrationItem)) {
            return false;
        }
        RegistrationItem registrationItem = (RegistrationItem) p0;
        return Intrinsics.areEqual(this.iuranJht, registrationItem.iuranJht) && Intrinsics.areEqual(this.iuranJkk, registrationItem.iuranJkk) && Intrinsics.areEqual(this.iuranJkm, registrationItem.iuranJkm) && Intrinsics.areEqual(this.kodePembayaran, registrationItem.kodePembayaran) && Intrinsics.areEqual(this.totalIuran, registrationItem.totalIuran) && Intrinsics.areEqual(this.namaLengkap, registrationItem.namaLengkap) && Intrinsics.areEqual(this.email, registrationItem.email) && Intrinsics.areEqual(this.noHp, registrationItem.noHp) && Intrinsics.areEqual(this.address, registrationItem.address) && Intrinsics.areEqual(this.kodePos, registrationItem.kodePos) && Intrinsics.areEqual(this.jmlBulan, registrationItem.jmlBulan) && Intrinsics.areEqual(this.context, registrationItem.context) && Intrinsics.areEqual(this.nik, registrationItem.nik) && Intrinsics.areEqual(this.hashData, registrationItem.hashData) && Intrinsics.areEqual(this.tanggalEfektif, registrationItem.tanggalEfektif) && Intrinsics.areEqual(this.tanggalExpired, registrationItem.tanggalExpired) && Intrinsics.areEqual(this.checkSum, registrationItem.checkSum) && Intrinsics.areEqual(this.paymentFee, registrationItem.paymentFee) && Intrinsics.areEqual(this.tglLahir, registrationItem.tglLahir) && Intrinsics.areEqual(this.salary, registrationItem.salary) && Intrinsics.areEqual(this.kodeIuranTrx, registrationItem.kodeIuranTrx) && Intrinsics.areEqual(this.transactionDate, registrationItem.transactionDate);
    }

    public final int hashCode() {
        String str = this.iuranJht;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.iuranJkk;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iuranJkm;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kodePembayaran;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.totalIuran;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.namaLengkap;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.email;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.noHp;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.address;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.kodePos;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.jmlBulan;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.context;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.nik;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.hashData;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.tanggalEfektif;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.tanggalExpired;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.checkSum;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        com.bpjstku.data.tuition.model.response.PaymentFee paymentFee = this.paymentFee;
        int iHashCode18 = paymentFee == null ? 0 : paymentFee.hashCode();
        String str18 = this.tglLahir;
        int iHashCode19 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.salary;
        int iHashCode20 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.kodeIuranTrx;
        int iHashCode21 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.transactionDate;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (str21 != null ? str21.hashCode() : 0);
    }

    public final String toString() {
        String str = this.iuranJht;
        String str2 = this.iuranJkk;
        String str3 = this.iuranJkm;
        String str4 = this.kodePembayaran;
        String str5 = this.totalIuran;
        String str6 = this.namaLengkap;
        String str7 = this.email;
        String str8 = this.noHp;
        String str9 = this.address;
        String str10 = this.kodePos;
        String str11 = this.jmlBulan;
        String str12 = this.context;
        String str13 = this.nik;
        String str14 = this.hashData;
        String str15 = this.tanggalEfektif;
        String str16 = this.tanggalExpired;
        String str17 = this.checkSum;
        com.bpjstku.data.tuition.model.response.PaymentFee paymentFee = this.paymentFee;
        String str18 = this.tglLahir;
        String str19 = this.salary;
        String str20 = this.kodeIuranTrx;
        String str21 = this.transactionDate;
        StringBuilder sb = new StringBuilder("RegistrationItem(iuranJht=");
        sb.append(str);
        sb.append(", iuranJkk=");
        sb.append(str2);
        sb.append(", iuranJkm=");
        sb.append(str3);
        sb.append(", kodePembayaran=");
        sb.append(str4);
        sb.append(", totalIuran=");
        sb.append(str5);
        sb.append(", namaLengkap=");
        sb.append(str6);
        sb.append(", email=");
        sb.append(str7);
        sb.append(", noHp=");
        sb.append(str8);
        sb.append(", address=");
        sb.append(str9);
        sb.append(", kodePos=");
        sb.append(str10);
        sb.append(", jmlBulan=");
        sb.append(str11);
        sb.append(", context=");
        sb.append(str12);
        sb.append(", nik=");
        sb.append(str13);
        sb.append(", hashData=");
        sb.append(str14);
        sb.append(", tanggalEfektif=");
        sb.append(str15);
        sb.append(", tanggalExpired=");
        sb.append(str16);
        sb.append(", checkSum=");
        sb.append(str17);
        sb.append(", paymentFee=");
        sb.append(paymentFee);
        sb.append(", tglLahir=");
        sb.append(str18);
        sb.append(", salary=");
        sb.append(str19);
        sb.append(", kodeIuranTrx=");
        sb.append(str20);
        sb.append(", transactionDate=");
        sb.append(str21);
        sb.append(")");
        return sb.toString();
    }
}
