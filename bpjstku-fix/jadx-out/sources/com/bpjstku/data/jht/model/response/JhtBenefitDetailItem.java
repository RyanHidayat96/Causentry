package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0017J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0017J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0017J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0017JÜ\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020*2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b0\u0010\u0017R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010\u0017R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u0010\u0017R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b9\u0010\u0017R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010\u0017R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u0010\u0017R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u0010\u0017R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\bA\u0010\u0017R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00102\u001a\u0004\bC\u0010\u0017R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\bE\u0010\u0017R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bG\u0010\u0017R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\bI\u0010\u0017R\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00102\u001a\u0004\bK\u0010\u0017R\u001c\u0010L\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bM\u0010\u0017R\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u00102\u001a\u0004\bO\u0010\u0017R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00102\u001a\u0004\bQ\u0010\u0017R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u00102\u001a\u0004\bS\u0010\u0017"}, d2 = {"Lcom/bpjstku/data/jht/model/response/JhtBenefitDetailItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/JhtBenefitDetailItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "tanggalPengembangan", "Ljava/lang/String;", "getTanggalPengembangan", "ratePengembangan", "getRatePengembangan", "tanggalSaldoAwalTahun", "getTanggalSaldoAwalTahun", "nominalSaldoAwalTahun", "getNominalSaldoAwalTahun", "nominalSaldoPengembangan", "getNominalSaldoPengembangan", "nominalSaldoTotal", "getNominalSaldoTotal", "nominalIuranTahunBerjalan", "getNominalIuranTahunBerjalan", "nominalIuranPengembangan", "getNominalIuranPengembangan", "nominalIuranTotal", "getNominalIuranTotal", "nominalSaldoIuranTotal", "getNominalSaldoIuranTotal", "persentasePengambilan", "getPersentasePengambilan", "nominalManfaatMaxBisaDiAmbil", "getNominalManfaatMaxBisaDiAmbil", "nominalManfaatDiAmbil", "getNominalManfaatDiAmbil", "nominalManfaatGross", "getNominalManfaatGross", "nominalPPH", "getNominalPPH", "nominalPembulatan", "getNominalPembulatan", "nominalManfaatNetto", "getNominalManfaatNetto"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtBenefitDetailItem {
    public static final int $stable = 0;

    @SerializedName("nominalIuranPengembangan")
    private final String nominalIuranPengembangan;

    @SerializedName("nominalIuranTahunBerjalan")
    private final String nominalIuranTahunBerjalan;

    @SerializedName("nominalIuranTotal")
    private final String nominalIuranTotal;

    @SerializedName("nominalManfaatDiAmbil")
    private final String nominalManfaatDiAmbil;

    @SerializedName("nominalManfaatGross")
    private final String nominalManfaatGross;

    @SerializedName("nominalManfaatMaxBisaDiAmbil")
    private final String nominalManfaatMaxBisaDiAmbil;

    @SerializedName("nominalManfaatNetto")
    private final String nominalManfaatNetto;

    @SerializedName("nominalPPH")
    private final String nominalPPH;

    @SerializedName("nominalPembulatan")
    private final String nominalPembulatan;

    @SerializedName("nominalSaldoAwalTahun")
    private final String nominalSaldoAwalTahun;

    @SerializedName("nominalSaldoIuranTotal")
    private final String nominalSaldoIuranTotal;

    @SerializedName("nominalSaldoPengembangan")
    private final String nominalSaldoPengembangan;

    @SerializedName("nominalSaldoTotal")
    private final String nominalSaldoTotal;

    @SerializedName("persentasePengambilan")
    private final String persentasePengambilan;

    @SerializedName("ratePengembangan")
    private final String ratePengembangan;

    @SerializedName("tanggalPengembangan")
    private final String tanggalPengembangan;

    @SerializedName("tanggalSaldoAwalTahun")
    private final String tanggalSaldoAwalTahun;

    public JhtBenefitDetailItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.tanggalPengembangan = str;
        this.ratePengembangan = str2;
        this.tanggalSaldoAwalTahun = str3;
        this.nominalSaldoAwalTahun = str4;
        this.nominalSaldoPengembangan = str5;
        this.nominalSaldoTotal = str6;
        this.nominalIuranTahunBerjalan = str7;
        this.nominalIuranPengembangan = str8;
        this.nominalIuranTotal = str9;
        this.nominalSaldoIuranTotal = str10;
        this.persentasePengambilan = str11;
        this.nominalManfaatMaxBisaDiAmbil = str12;
        this.nominalManfaatDiAmbil = str13;
        this.nominalManfaatGross = str14;
        this.nominalPPH = str15;
        this.nominalPembulatan = str16;
        this.nominalManfaatNetto = str17;
    }

    public final String getTanggalPengembangan() {
        return this.tanggalPengembangan;
    }

    public final String getRatePengembangan() {
        return this.ratePengembangan;
    }

    public final String getTanggalSaldoAwalTahun() {
        return this.tanggalSaldoAwalTahun;
    }

    public final String getNominalSaldoAwalTahun() {
        return this.nominalSaldoAwalTahun;
    }

    public final String getNominalSaldoPengembangan() {
        return this.nominalSaldoPengembangan;
    }

    public final String getNominalSaldoTotal() {
        return this.nominalSaldoTotal;
    }

    public final String getNominalIuranTahunBerjalan() {
        return this.nominalIuranTahunBerjalan;
    }

    public final String getNominalIuranPengembangan() {
        return this.nominalIuranPengembangan;
    }

    public final String getNominalIuranTotal() {
        return this.nominalIuranTotal;
    }

    public final String getNominalSaldoIuranTotal() {
        return this.nominalSaldoIuranTotal;
    }

    public final String getPersentasePengambilan() {
        return this.persentasePengambilan;
    }

    public final String getNominalManfaatMaxBisaDiAmbil() {
        return this.nominalManfaatMaxBisaDiAmbil;
    }

    public final String getNominalManfaatDiAmbil() {
        return this.nominalManfaatDiAmbil;
    }

    public final String getNominalManfaatGross() {
        return this.nominalManfaatGross;
    }

    public final String getNominalPPH() {
        return this.nominalPPH;
    }

    public final String getNominalPembulatan() {
        return this.nominalPembulatan;
    }

    public final String getNominalManfaatNetto() {
        return this.nominalManfaatNetto;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTanggalPengembangan() {
        return this.tanggalPengembangan;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNominalSaldoIuranTotal() {
        return this.nominalSaldoIuranTotal;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPersentasePengambilan() {
        return this.persentasePengambilan;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getNominalManfaatMaxBisaDiAmbil() {
        return this.nominalManfaatMaxBisaDiAmbil;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNominalManfaatDiAmbil() {
        return this.nominalManfaatDiAmbil;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getNominalManfaatGross() {
        return this.nominalManfaatGross;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getNominalPPH() {
        return this.nominalPPH;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getNominalPembulatan() {
        return this.nominalPembulatan;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getNominalManfaatNetto() {
        return this.nominalManfaatNetto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRatePengembangan() {
        return this.ratePengembangan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTanggalSaldoAwalTahun() {
        return this.tanggalSaldoAwalTahun;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNominalSaldoAwalTahun() {
        return this.nominalSaldoAwalTahun;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNominalSaldoPengembangan() {
        return this.nominalSaldoPengembangan;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNominalSaldoTotal() {
        return this.nominalSaldoTotal;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNominalIuranTahunBerjalan() {
        return this.nominalIuranTahunBerjalan;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNominalIuranPengembangan() {
        return this.nominalIuranPengembangan;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNominalIuranTotal() {
        return this.nominalIuranTotal;
    }

    public final JhtBenefitDetailItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16) {
        return new JhtBenefitDetailItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtBenefitDetailItem)) {
            return false;
        }
        JhtBenefitDetailItem jhtBenefitDetailItem = (JhtBenefitDetailItem) p0;
        return Intrinsics.areEqual(this.tanggalPengembangan, jhtBenefitDetailItem.tanggalPengembangan) && Intrinsics.areEqual(this.ratePengembangan, jhtBenefitDetailItem.ratePengembangan) && Intrinsics.areEqual(this.tanggalSaldoAwalTahun, jhtBenefitDetailItem.tanggalSaldoAwalTahun) && Intrinsics.areEqual(this.nominalSaldoAwalTahun, jhtBenefitDetailItem.nominalSaldoAwalTahun) && Intrinsics.areEqual(this.nominalSaldoPengembangan, jhtBenefitDetailItem.nominalSaldoPengembangan) && Intrinsics.areEqual(this.nominalSaldoTotal, jhtBenefitDetailItem.nominalSaldoTotal) && Intrinsics.areEqual(this.nominalIuranTahunBerjalan, jhtBenefitDetailItem.nominalIuranTahunBerjalan) && Intrinsics.areEqual(this.nominalIuranPengembangan, jhtBenefitDetailItem.nominalIuranPengembangan) && Intrinsics.areEqual(this.nominalIuranTotal, jhtBenefitDetailItem.nominalIuranTotal) && Intrinsics.areEqual(this.nominalSaldoIuranTotal, jhtBenefitDetailItem.nominalSaldoIuranTotal) && Intrinsics.areEqual(this.persentasePengambilan, jhtBenefitDetailItem.persentasePengambilan) && Intrinsics.areEqual(this.nominalManfaatMaxBisaDiAmbil, jhtBenefitDetailItem.nominalManfaatMaxBisaDiAmbil) && Intrinsics.areEqual(this.nominalManfaatDiAmbil, jhtBenefitDetailItem.nominalManfaatDiAmbil) && Intrinsics.areEqual(this.nominalManfaatGross, jhtBenefitDetailItem.nominalManfaatGross) && Intrinsics.areEqual(this.nominalPPH, jhtBenefitDetailItem.nominalPPH) && Intrinsics.areEqual(this.nominalPembulatan, jhtBenefitDetailItem.nominalPembulatan) && Intrinsics.areEqual(this.nominalManfaatNetto, jhtBenefitDetailItem.nominalManfaatNetto);
    }

    public final int hashCode() {
        String str = this.tanggalPengembangan;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ratePengembangan;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tanggalSaldoAwalTahun;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.nominalSaldoAwalTahun;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.nominalSaldoPengembangan;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nominalSaldoTotal;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.nominalIuranTahunBerjalan;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.nominalIuranPengembangan;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.nominalIuranTotal;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.nominalSaldoIuranTotal;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.persentasePengambilan;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.nominalManfaatMaxBisaDiAmbil;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.nominalManfaatDiAmbil;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.nominalManfaatGross;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.nominalPPH;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.nominalPembulatan;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.nominalManfaatNetto;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        String str = this.tanggalPengembangan;
        String str2 = this.ratePengembangan;
        String str3 = this.tanggalSaldoAwalTahun;
        String str4 = this.nominalSaldoAwalTahun;
        String str5 = this.nominalSaldoPengembangan;
        String str6 = this.nominalSaldoTotal;
        String str7 = this.nominalIuranTahunBerjalan;
        String str8 = this.nominalIuranPengembangan;
        String str9 = this.nominalIuranTotal;
        String str10 = this.nominalSaldoIuranTotal;
        String str11 = this.persentasePengambilan;
        String str12 = this.nominalManfaatMaxBisaDiAmbil;
        String str13 = this.nominalManfaatDiAmbil;
        String str14 = this.nominalManfaatGross;
        String str15 = this.nominalPPH;
        String str16 = this.nominalPembulatan;
        String str17 = this.nominalManfaatNetto;
        StringBuilder sb = new StringBuilder("JhtBenefitDetailItem(tanggalPengembangan=");
        sb.append(str);
        sb.append(", ratePengembangan=");
        sb.append(str2);
        sb.append(", tanggalSaldoAwalTahun=");
        sb.append(str3);
        sb.append(", nominalSaldoAwalTahun=");
        sb.append(str4);
        sb.append(", nominalSaldoPengembangan=");
        sb.append(str5);
        sb.append(", nominalSaldoTotal=");
        sb.append(str6);
        sb.append(", nominalIuranTahunBerjalan=");
        sb.append(str7);
        sb.append(", nominalIuranPengembangan=");
        sb.append(str8);
        sb.append(", nominalIuranTotal=");
        sb.append(str9);
        sb.append(", nominalSaldoIuranTotal=");
        sb.append(str10);
        sb.append(", persentasePengambilan=");
        sb.append(str11);
        sb.append(", nominalManfaatMaxBisaDiAmbil=");
        sb.append(str12);
        sb.append(", nominalManfaatDiAmbil=");
        sb.append(str13);
        sb.append(", nominalManfaatGross=");
        sb.append(str14);
        sb.append(", nominalPPH=");
        sb.append(str15);
        sb.append(", nominalPembulatan=");
        sb.append(str16);
        sb.append(", nominalManfaatNetto=");
        sb.append(str17);
        sb.append(")");
        return sb.toString();
    }
}
