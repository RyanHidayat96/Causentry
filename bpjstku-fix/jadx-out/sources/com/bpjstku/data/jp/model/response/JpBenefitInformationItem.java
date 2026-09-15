package com.bpjstku.data.jp.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u0012J\u0088\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0012R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0012R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u0012R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u0012R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u0012R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u0012R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u0012R\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u0012R\u001a\u0010:\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010\u0012R\u001a\u0010<\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b=\u0010\u0012R\u001a\u0010>\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b?\u0010\u0012"}, d2 = {"Lcom/bpjstku/data/jp/model/response/JpBenefitInformationItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jp/model/response/JpBenefitInformationItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "dataFound", "Ljava/lang/String;", "getDataFound", "kodeKlaim", "getKodeKlaim", "noProses", "getNoProses", "nomRapel", "getNomRapel", "nomKompensasi", "getNomKompensasi", "nomBerjalan", "getNomBerjalan", "nomManfaatNetto", "getNomManfaatNetto", "blthProses", "getBlthProses", "countRapel", "getCountRapel", "statusLunas", "getStatusLunas", "countRapelAll", "getCountRapelAll", "tglKonfirmasiBaru", "getTglKonfirmasiBaru"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JpBenefitInformationItem {
    public static final int $stable = 0;

    @SerializedName("blthProses")
    private final String blthProses;

    @SerializedName("countRapel")
    private final String countRapel;

    @SerializedName("countRapelAll")
    private final String countRapelAll;

    @SerializedName("dataFound")
    private final String dataFound;

    @SerializedName("kodeKlaim")
    private final String kodeKlaim;

    @SerializedName("noProses")
    private final String noProses;

    @SerializedName("nomBerjalan")
    private final String nomBerjalan;

    @SerializedName("nomKompensasi")
    private final String nomKompensasi;

    @SerializedName("nomManfaatNetto")
    private final String nomManfaatNetto;

    @SerializedName("nomRapel")
    private final String nomRapel;

    @SerializedName("statusLunas")
    private final String statusLunas;

    @SerializedName("tglKonfirmasiBaru")
    private final String tglKonfirmasiBaru;

    public JpBenefitInformationItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
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
        this.dataFound = str;
        this.kodeKlaim = str2;
        this.noProses = str3;
        this.nomRapel = str4;
        this.nomKompensasi = str5;
        this.nomBerjalan = str6;
        this.nomManfaatNetto = str7;
        this.blthProses = str8;
        this.countRapel = str9;
        this.statusLunas = str10;
        this.countRapelAll = str11;
        this.tglKonfirmasiBaru = str12;
    }

    public final String getDataFound() {
        return this.dataFound;
    }

    public final String getKodeKlaim() {
        return this.kodeKlaim;
    }

    public final String getNoProses() {
        return this.noProses;
    }

    public final String getNomRapel() {
        return this.nomRapel;
    }

    public final String getNomKompensasi() {
        return this.nomKompensasi;
    }

    public final String getNomBerjalan() {
        return this.nomBerjalan;
    }

    public final String getNomManfaatNetto() {
        return this.nomManfaatNetto;
    }

    public final String getBlthProses() {
        return this.blthProses;
    }

    public final String getCountRapel() {
        return this.countRapel;
    }

    public final String getStatusLunas() {
        return this.statusLunas;
    }

    public final String getCountRapelAll() {
        return this.countRapelAll;
    }

    public final String getTglKonfirmasiBaru() {
        return this.tglKonfirmasiBaru;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDataFound() {
        return this.dataFound;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStatusLunas() {
        return this.statusLunas;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCountRapelAll() {
        return this.countRapelAll;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTglKonfirmasiBaru() {
        return this.tglKonfirmasiBaru;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKodeKlaim() {
        return this.kodeKlaim;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNoProses() {
        return this.noProses;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNomRapel() {
        return this.nomRapel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNomKompensasi() {
        return this.nomKompensasi;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNomBerjalan() {
        return this.nomBerjalan;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNomManfaatNetto() {
        return this.nomManfaatNetto;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBlthProses() {
        return this.blthProses;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCountRapel() {
        return this.countRapel;
    }

    public final JpBenefitInformationItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11) {
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
        return new JpBenefitInformationItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JpBenefitInformationItem)) {
            return false;
        }
        JpBenefitInformationItem jpBenefitInformationItem = (JpBenefitInformationItem) p0;
        return Intrinsics.areEqual(this.dataFound, jpBenefitInformationItem.dataFound) && Intrinsics.areEqual(this.kodeKlaim, jpBenefitInformationItem.kodeKlaim) && Intrinsics.areEqual(this.noProses, jpBenefitInformationItem.noProses) && Intrinsics.areEqual(this.nomRapel, jpBenefitInformationItem.nomRapel) && Intrinsics.areEqual(this.nomKompensasi, jpBenefitInformationItem.nomKompensasi) && Intrinsics.areEqual(this.nomBerjalan, jpBenefitInformationItem.nomBerjalan) && Intrinsics.areEqual(this.nomManfaatNetto, jpBenefitInformationItem.nomManfaatNetto) && Intrinsics.areEqual(this.blthProses, jpBenefitInformationItem.blthProses) && Intrinsics.areEqual(this.countRapel, jpBenefitInformationItem.countRapel) && Intrinsics.areEqual(this.statusLunas, jpBenefitInformationItem.statusLunas) && Intrinsics.areEqual(this.countRapelAll, jpBenefitInformationItem.countRapelAll) && Intrinsics.areEqual(this.tglKonfirmasiBaru, jpBenefitInformationItem.tglKonfirmasiBaru);
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.dataFound.hashCode() * 31) + this.kodeKlaim.hashCode()) * 31) + this.noProses.hashCode()) * 31) + this.nomRapel.hashCode()) * 31) + this.nomKompensasi.hashCode()) * 31) + this.nomBerjalan.hashCode()) * 31) + this.nomManfaatNetto.hashCode()) * 31) + this.blthProses.hashCode()) * 31) + this.countRapel.hashCode()) * 31) + this.statusLunas.hashCode()) * 31) + this.countRapelAll.hashCode()) * 31) + this.tglKonfirmasiBaru.hashCode();
    }

    public final String toString() {
        String str = this.dataFound;
        String str2 = this.kodeKlaim;
        String str3 = this.noProses;
        String str4 = this.nomRapel;
        String str5 = this.nomKompensasi;
        String str6 = this.nomBerjalan;
        String str7 = this.nomManfaatNetto;
        String str8 = this.blthProses;
        String str9 = this.countRapel;
        String str10 = this.statusLunas;
        String str11 = this.countRapelAll;
        String str12 = this.tglKonfirmasiBaru;
        StringBuilder sb = new StringBuilder("JpBenefitInformationItem(dataFound=");
        sb.append(str);
        sb.append(", kodeKlaim=");
        sb.append(str2);
        sb.append(", noProses=");
        sb.append(str3);
        sb.append(", nomRapel=");
        sb.append(str4);
        sb.append(", nomKompensasi=");
        sb.append(str5);
        sb.append(", nomBerjalan=");
        sb.append(str6);
        sb.append(", nomManfaatNetto=");
        sb.append(str7);
        sb.append(", blthProses=");
        sb.append(str8);
        sb.append(", countRapel=");
        sb.append(str9);
        sb.append(", statusLunas=");
        sb.append(str10);
        sb.append(", countRapelAll=");
        sb.append(str11);
        sb.append(", tglKonfirmasiBaru=");
        sb.append(str12);
        sb.append(")");
        return sb.toString();
    }
}
