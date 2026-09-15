package com.bpjstku.data.promo.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010 J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010 J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010 J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010 J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b4\u0010&J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010 J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010 J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010 J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010 J¼\u0002\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020;2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002H×\u0001¢\u0006\u0004\bA\u0010 R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010 R\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010 R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010 R\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010 R\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bL\u0010 R\"\u0010M\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010&R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010 R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bS\u0010 R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010C\u001a\u0004\bU\u0010 R\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bW\u0010 R\u001c\u0010X\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010C\u001a\u0004\bY\u0010 R\u001c\u0010Z\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010C\u001a\u0004\b[\u0010 R\u001c\u0010\\\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\b]\u0010 R\u001c\u0010^\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010C\u001a\u0004\b_\u0010 R\u001c\u0010`\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010C\u001a\u0004\ba\u0010 R\u001c\u0010b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bc\u0010 R\u001c\u0010d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010C\u001a\u0004\be\u0010 R\u001c\u0010f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010C\u001a\u0004\bg\u0010 R\u001c\u0010h\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\bi\u0010 R\"\u0010j\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010N\u001a\u0004\bk\u0010&R\u001c\u0010l\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010C\u001a\u0004\bm\u0010 R\u001c\u0010n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010C\u001a\u0004\bo\u0010 R\u001c\u0010p\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010C\u001a\u0004\bq\u0010 R\u001c\u0010r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\br\u0010C\u001a\u0004\bs\u0010 "}, d2 = {"Lcom/bpjstku/data/promo/model/response/DetailMerchantItem;", "", "", "p0", "p1", "p2", "p3", "p4", "", "Lcom/bpjstku/data/promo/model/response/SyaratItem;", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/promo/model/response/DetailMerchantItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodePks", "Ljava/lang/String;", "getKodePks", "tglAwalPromo", "getTglAwalPromo", "namaProduk", "getNamaProduk", "shortDesc", "getShortDesc", "fileBanner", "getFileBanner", "syaratInput", "Ljava/util/List;", "getSyaratInput", "tglPromo", "getTglPromo", "lokasiComar", "getLokasiComar", "kodeProgram", "getKodeProgram", "statusPromo", "getStatusPromo", "judulPks", "getJudulPks", "tglBerakhirPromo", "getTglBerakhirPromo", "kodeJenisProduk", "getKodeJenisProduk", "namaJenisKategori", "getNamaJenisKategori", "kodePengajuanPromo", "getKodePengajuanPromo", "keteranganPks", "getKeteranganPks", "keterangan", "getKeterangan", "tglApproval", "getTglApproval", "fileThumbnail", "getFileThumbnail", "syaratDefault", "getSyaratDefault", "namaProgram", "getNamaProgram", "namaPropinsi", "getNamaPropinsi", "kodeVoucherRedeem", "getKodeVoucherRedeem", "linkVoucherRedeem", "getLinkVoucherRedeem"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DetailMerchantItem {
    public static final int $stable = 8;

    @SerializedName("fileBanner")
    private final String fileBanner;

    @SerializedName("fileThumbnail")
    private final String fileThumbnail;

    @SerializedName("judulPks")
    private final String judulPks;

    @SerializedName("keterangan")
    private final String keterangan;

    @SerializedName("keteranganPks")
    private final String keteranganPks;

    @SerializedName("kodeJenisProduk")
    private final String kodeJenisProduk;

    @SerializedName("kodePengajuanPromo")
    private final String kodePengajuanPromo;

    @SerializedName("kodePks")
    private final String kodePks;

    @SerializedName("kodeProgram")
    private final String kodeProgram;

    @SerializedName("kodeVoucherRedeem")
    private final String kodeVoucherRedeem;

    @SerializedName("linkVoucherRedeem")
    private final String linkVoucherRedeem;

    @SerializedName("lokasiComar")
    private final String lokasiComar;

    @SerializedName("namaJenisKategori")
    private final String namaJenisKategori;

    @SerializedName("namaProduk")
    private final String namaProduk;

    @SerializedName("namaProgram")
    private final String namaProgram;

    @SerializedName("namaPropinsi")
    private final String namaPropinsi;

    @SerializedName("shortDesc")
    private final String shortDesc;

    @SerializedName("statusPromo")
    private final String statusPromo;

    @SerializedName("syaratDefault")
    private final List<SyaratItem> syaratDefault;

    @SerializedName("syaratInput")
    private final List<SyaratItem> syaratInput;

    @SerializedName("tglApproval")
    private final String tglApproval;

    @SerializedName("tglAwalPromo")
    private final String tglAwalPromo;

    @SerializedName("tglBerakhirPromo")
    private final String tglBerakhirPromo;

    @SerializedName("tglPromo")
    private final String tglPromo;

    public DetailMerchantItem(String str, String str2, String str3, String str4, String str5, List<SyaratItem> list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List<SyaratItem> list2, String str19, String str20, String str21, String str22) {
        this.kodePks = str;
        this.tglAwalPromo = str2;
        this.namaProduk = str3;
        this.shortDesc = str4;
        this.fileBanner = str5;
        this.syaratInput = list;
        this.tglPromo = str6;
        this.lokasiComar = str7;
        this.kodeProgram = str8;
        this.statusPromo = str9;
        this.judulPks = str10;
        this.tglBerakhirPromo = str11;
        this.kodeJenisProduk = str12;
        this.namaJenisKategori = str13;
        this.kodePengajuanPromo = str14;
        this.keteranganPks = str15;
        this.keterangan = str16;
        this.tglApproval = str17;
        this.fileThumbnail = str18;
        this.syaratDefault = list2;
        this.namaProgram = str19;
        this.namaPropinsi = str20;
        this.kodeVoucherRedeem = str21;
        this.linkVoucherRedeem = str22;
    }

    public final String getKodePks() {
        return this.kodePks;
    }

    public final String getTglAwalPromo() {
        return this.tglAwalPromo;
    }

    public final String getNamaProduk() {
        return this.namaProduk;
    }

    public final String getShortDesc() {
        return this.shortDesc;
    }

    public final String getFileBanner() {
        return this.fileBanner;
    }

    public final List<SyaratItem> getSyaratInput() {
        return this.syaratInput;
    }

    public final String getTglPromo() {
        return this.tglPromo;
    }

    public final String getLokasiComar() {
        return this.lokasiComar;
    }

    public final String getKodeProgram() {
        return this.kodeProgram;
    }

    public final String getStatusPromo() {
        return this.statusPromo;
    }

    public final String getJudulPks() {
        return this.judulPks;
    }

    public final String getTglBerakhirPromo() {
        return this.tglBerakhirPromo;
    }

    public final String getKodeJenisProduk() {
        return this.kodeJenisProduk;
    }

    public final String getNamaJenisKategori() {
        return this.namaJenisKategori;
    }

    public final String getKodePengajuanPromo() {
        return this.kodePengajuanPromo;
    }

    public final String getKeteranganPks() {
        return this.keteranganPks;
    }

    public final String getKeterangan() {
        return this.keterangan;
    }

    public final String getTglApproval() {
        return this.tglApproval;
    }

    public final String getFileThumbnail() {
        return this.fileThumbnail;
    }

    public final List<SyaratItem> getSyaratDefault() {
        return this.syaratDefault;
    }

    public final String getNamaProgram() {
        return this.namaProgram;
    }

    public final String getNamaPropinsi() {
        return this.namaPropinsi;
    }

    public final String getKodeVoucherRedeem() {
        return this.kodeVoucherRedeem;
    }

    public final String getLinkVoucherRedeem() {
        return this.linkVoucherRedeem;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodePks() {
        return this.kodePks;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStatusPromo() {
        return this.statusPromo;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getJudulPks() {
        return this.judulPks;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTglBerakhirPromo() {
        return this.tglBerakhirPromo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getKodeJenisProduk() {
        return this.kodeJenisProduk;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getNamaJenisKategori() {
        return this.namaJenisKategori;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getKodePengajuanPromo() {
        return this.kodePengajuanPromo;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getKeteranganPks() {
        return this.keteranganPks;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getKeterangan() {
        return this.keterangan;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTglApproval() {
        return this.tglApproval;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getFileThumbnail() {
        return this.fileThumbnail;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTglAwalPromo() {
        return this.tglAwalPromo;
    }

    public final List<SyaratItem> component20() {
        return this.syaratDefault;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getNamaProgram() {
        return this.namaProgram;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getNamaPropinsi() {
        return this.namaPropinsi;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getKodeVoucherRedeem() {
        return this.kodeVoucherRedeem;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getLinkVoucherRedeem() {
        return this.linkVoucherRedeem;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNamaProduk() {
        return this.namaProduk;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShortDesc() {
        return this.shortDesc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFileBanner() {
        return this.fileBanner;
    }

    public final List<SyaratItem> component6() {
        return this.syaratInput;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTglPromo() {
        return this.tglPromo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLokasiComar() {
        return this.lokasiComar;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getKodeProgram() {
        return this.kodeProgram;
    }

    public final DetailMerchantItem copy(String p0, String p1, String p2, String p3, String p4, List<SyaratItem> p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18, List<SyaratItem> p19, String p20, String p21, String p22, String p23) {
        return new DetailMerchantItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DetailMerchantItem)) {
            return false;
        }
        DetailMerchantItem detailMerchantItem = (DetailMerchantItem) p0;
        return Intrinsics.areEqual(this.kodePks, detailMerchantItem.kodePks) && Intrinsics.areEqual(this.tglAwalPromo, detailMerchantItem.tglAwalPromo) && Intrinsics.areEqual(this.namaProduk, detailMerchantItem.namaProduk) && Intrinsics.areEqual(this.shortDesc, detailMerchantItem.shortDesc) && Intrinsics.areEqual(this.fileBanner, detailMerchantItem.fileBanner) && Intrinsics.areEqual(this.syaratInput, detailMerchantItem.syaratInput) && Intrinsics.areEqual(this.tglPromo, detailMerchantItem.tglPromo) && Intrinsics.areEqual(this.lokasiComar, detailMerchantItem.lokasiComar) && Intrinsics.areEqual(this.kodeProgram, detailMerchantItem.kodeProgram) && Intrinsics.areEqual(this.statusPromo, detailMerchantItem.statusPromo) && Intrinsics.areEqual(this.judulPks, detailMerchantItem.judulPks) && Intrinsics.areEqual(this.tglBerakhirPromo, detailMerchantItem.tglBerakhirPromo) && Intrinsics.areEqual(this.kodeJenisProduk, detailMerchantItem.kodeJenisProduk) && Intrinsics.areEqual(this.namaJenisKategori, detailMerchantItem.namaJenisKategori) && Intrinsics.areEqual(this.kodePengajuanPromo, detailMerchantItem.kodePengajuanPromo) && Intrinsics.areEqual(this.keteranganPks, detailMerchantItem.keteranganPks) && Intrinsics.areEqual(this.keterangan, detailMerchantItem.keterangan) && Intrinsics.areEqual(this.tglApproval, detailMerchantItem.tglApproval) && Intrinsics.areEqual(this.fileThumbnail, detailMerchantItem.fileThumbnail) && Intrinsics.areEqual(this.syaratDefault, detailMerchantItem.syaratDefault) && Intrinsics.areEqual(this.namaProgram, detailMerchantItem.namaProgram) && Intrinsics.areEqual(this.namaPropinsi, detailMerchantItem.namaPropinsi) && Intrinsics.areEqual(this.kodeVoucherRedeem, detailMerchantItem.kodeVoucherRedeem) && Intrinsics.areEqual(this.linkVoucherRedeem, detailMerchantItem.linkVoucherRedeem);
    }

    public final int hashCode() {
        String str = this.kodePks;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tglAwalPromo;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.namaProduk;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.shortDesc;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.fileBanner;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        List<SyaratItem> list = this.syaratInput;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str6 = this.tglPromo;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.lokasiComar;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.kodeProgram;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.statusPromo;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.judulPks;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.tglBerakhirPromo;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.kodeJenisProduk;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.namaJenisKategori;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.kodePengajuanPromo;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.keteranganPks;
        int iHashCode16 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.keterangan;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.tglApproval;
        int iHashCode18 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.fileThumbnail;
        int iHashCode19 = str18 == null ? 0 : str18.hashCode();
        List<SyaratItem> list2 = this.syaratDefault;
        int iHashCode20 = list2 == null ? 0 : list2.hashCode();
        String str19 = this.namaProgram;
        int iHashCode21 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.namaPropinsi;
        int iHashCode22 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.kodeVoucherRedeem;
        int iHashCode23 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.linkVoucherRedeem;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + (str22 != null ? str22.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kodePks;
        String str2 = this.tglAwalPromo;
        String str3 = this.namaProduk;
        String str4 = this.shortDesc;
        String str5 = this.fileBanner;
        List<SyaratItem> list = this.syaratInput;
        String str6 = this.tglPromo;
        String str7 = this.lokasiComar;
        String str8 = this.kodeProgram;
        String str9 = this.statusPromo;
        String str10 = this.judulPks;
        String str11 = this.tglBerakhirPromo;
        String str12 = this.kodeJenisProduk;
        String str13 = this.namaJenisKategori;
        String str14 = this.kodePengajuanPromo;
        String str15 = this.keteranganPks;
        String str16 = this.keterangan;
        String str17 = this.tglApproval;
        String str18 = this.fileThumbnail;
        List<SyaratItem> list2 = this.syaratDefault;
        String str19 = this.namaProgram;
        String str20 = this.namaPropinsi;
        String str21 = this.kodeVoucherRedeem;
        String str22 = this.linkVoucherRedeem;
        StringBuilder sb = new StringBuilder("DetailMerchantItem(kodePks=");
        sb.append(str);
        sb.append(", tglAwalPromo=");
        sb.append(str2);
        sb.append(", namaProduk=");
        sb.append(str3);
        sb.append(", shortDesc=");
        sb.append(str4);
        sb.append(", fileBanner=");
        sb.append(str5);
        sb.append(", syaratInput=");
        sb.append(list);
        sb.append(", tglPromo=");
        sb.append(str6);
        sb.append(", lokasiComar=");
        sb.append(str7);
        sb.append(", kodeProgram=");
        sb.append(str8);
        sb.append(", statusPromo=");
        sb.append(str9);
        sb.append(", judulPks=");
        sb.append(str10);
        sb.append(", tglBerakhirPromo=");
        sb.append(str11);
        sb.append(", kodeJenisProduk=");
        sb.append(str12);
        sb.append(", namaJenisKategori=");
        sb.append(str13);
        sb.append(", kodePengajuanPromo=");
        sb.append(str14);
        sb.append(", keteranganPks=");
        sb.append(str15);
        sb.append(", keterangan=");
        sb.append(str16);
        sb.append(", tglApproval=");
        sb.append(str17);
        sb.append(", fileThumbnail=");
        sb.append(str18);
        sb.append(", syaratDefault=");
        sb.append(list2);
        sb.append(", namaProgram=");
        sb.append(str19);
        sb.append(", namaPropinsi=");
        sb.append(str20);
        sb.append(", kodeVoucherRedeem=");
        sb.append(str21);
        sb.append(", linkVoucherRedeem=");
        sb.append(str22);
        sb.append(")");
        return sb.toString();
    }
}
