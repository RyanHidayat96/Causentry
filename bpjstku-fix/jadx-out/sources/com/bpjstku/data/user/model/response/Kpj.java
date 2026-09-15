package com.bpjstku.data.user.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000eR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u000eR\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u000eR\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\u000eR\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\u000e"}, d2 = {"Lcom/bpjstku/data/user/model/response/Kpj;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/user/model/response/Kpj;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodeSegmen", "Ljava/lang/String;", "getKodeSegmen", "kodeTk", "getKodeTk", "kpj", "getKpj", "namaTk", "getNamaTk", "nomorIdentitas", "getNomorIdentitas", "program", "getProgram", "tglKepesertaan", "getTglKepesertaan", "statusKepesertaan", "getStatusKepesertaan"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Kpj {
    public static final int $stable = 0;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kodeTk")
    private final String kodeTk;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("namaTk")
    private final String namaTk;

    @SerializedName("nomorIdentitas")
    private final String nomorIdentitas;

    @SerializedName("program")
    private final String program;

    @SerializedName("statusKepesertaan")
    private final String statusKepesertaan;

    @SerializedName("tglKepesertaan")
    private final String tglKepesertaan;

    public Kpj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.kodeSegmen = str;
        this.kodeTk = str2;
        this.kpj = str3;
        this.namaTk = str4;
        this.nomorIdentitas = str5;
        this.program = str6;
        this.tglKepesertaan = str7;
        this.statusKepesertaan = str8;
    }

    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    public final String getKodeTk() {
        return this.kodeTk;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getNamaTk() {
        return this.namaTk;
    }

    public final String getNomorIdentitas() {
        return this.nomorIdentitas;
    }

    public final String getProgram() {
        return this.program;
    }

    public final String getTglKepesertaan() {
        return this.tglKepesertaan;
    }

    public final String getStatusKepesertaan() {
        return this.statusKepesertaan;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKodeTk() {
        return this.kodeTk;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNamaTk() {
        return this.namaTk;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNomorIdentitas() {
        return this.nomorIdentitas;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProgram() {
        return this.program;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTglKepesertaan() {
        return this.tglKepesertaan;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatusKepesertaan() {
        return this.statusKepesertaan;
    }

    public final Kpj copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7) {
        return new Kpj(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Kpj)) {
            return false;
        }
        Kpj kpj = (Kpj) p0;
        return Intrinsics.areEqual(this.kodeSegmen, kpj.kodeSegmen) && Intrinsics.areEqual(this.kodeTk, kpj.kodeTk) && Intrinsics.areEqual(this.kpj, kpj.kpj) && Intrinsics.areEqual(this.namaTk, kpj.namaTk) && Intrinsics.areEqual(this.nomorIdentitas, kpj.nomorIdentitas) && Intrinsics.areEqual(this.program, kpj.program) && Intrinsics.areEqual(this.tglKepesertaan, kpj.tglKepesertaan) && Intrinsics.areEqual(this.statusKepesertaan, kpj.statusKepesertaan);
    }

    public final int hashCode() {
        String str = this.kodeSegmen;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.kodeTk;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.kpj;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.namaTk;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.nomorIdentitas;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.program;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tglKepesertaan;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.statusKepesertaan;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kodeSegmen;
        String str2 = this.kodeTk;
        String str3 = this.kpj;
        String str4 = this.namaTk;
        String str5 = this.nomorIdentitas;
        String str6 = this.program;
        String str7 = this.tglKepesertaan;
        String str8 = this.statusKepesertaan;
        StringBuilder sb = new StringBuilder("Kpj(kodeSegmen=");
        sb.append(str);
        sb.append(", kodeTk=");
        sb.append(str2);
        sb.append(", kpj=");
        sb.append(str3);
        sb.append(", namaTk=");
        sb.append(str4);
        sb.append(", nomorIdentitas=");
        sb.append(str5);
        sb.append(", program=");
        sb.append(str6);
        sb.append(", tglKepesertaan=");
        sb.append(str7);
        sb.append(", statusKepesertaan=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }
}
