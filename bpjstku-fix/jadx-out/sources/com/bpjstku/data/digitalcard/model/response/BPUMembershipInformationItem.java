package com.bpjstku.data.digitalcard.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.unsuspend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J|\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b#\u0010\u0010J\u001d\u0010&\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u001b¢\u0006\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010+\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0010R\u001c\u0010-\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\u0010R\u001c\u0010/\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010\u0010R\u001c\u00101\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\u0010R\u001c\u00103\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\u0010R\u001c\u00105\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010\u0010R\u001c\u00107\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u0010\u0010R\u001c\u00109\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010\u0010"}, d2 = {"Lcom/bpjstku/data/digitalcard/model/response/BPUMembershipInformationItem;", "Landroid/os/Parcelable;", "Lunsuspend;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/digitalcard/model/response/BPUMembershipInformationItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "dasarUpah", "Ljava/lang/String;", "getDasarUpah", "jenisPekerjaan", "getJenisPekerjaan", "kantorKepesertaan", "getKantorKepesertaan", "kodeTk", "getKodeTk", "kpj", "getKpj", "masaPerlindungan", "getMasaPerlindungan", "nomIuranItrf", "getNomIuranItrf", "program", "getProgram", "tglPniItrf", "getTglPniItrf"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BPUMembershipInformationItem extends unsuspend implements Parcelable {

    @SerializedName("dasarUpah")
    private final String dasarUpah;

    @SerializedName("jenisPekerjaan")
    private final String jenisPekerjaan;

    @SerializedName("kantorKepesertaan")
    private final String kantorKepesertaan;

    @SerializedName("kodeTk")
    private final String kodeTk;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("masaPerlindungan")
    private final String masaPerlindungan;

    @SerializedName("nomIuranItrf")
    private final String nomIuranItrf;

    @SerializedName("program")
    private final String program;

    @SerializedName("tglPniItrf")
    private final String tglPniItrf;
    public static final Parcelable.Creator<BPUMembershipInformationItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BPUMembershipInformationItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BPUMembershipInformationItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BPUMembershipInformationItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BPUMembershipInformationItem[] newArray(int i) {
            return new BPUMembershipInformationItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getDasarUpah() {
        return this.dasarUpah;
    }

    public final String getJenisPekerjaan() {
        return this.jenisPekerjaan;
    }

    public final String getKantorKepesertaan() {
        return this.kantorKepesertaan;
    }

    public final String getKodeTk() {
        return this.kodeTk;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getMasaPerlindungan() {
        return this.masaPerlindungan;
    }

    public final String getNomIuranItrf() {
        return this.nomIuranItrf;
    }

    public final String getProgram() {
        return this.program;
    }

    public final String getTglPniItrf() {
        return this.tglPniItrf;
    }

    public BPUMembershipInformationItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.dasarUpah = str;
        this.jenisPekerjaan = str2;
        this.kantorKepesertaan = str3;
        this.kodeTk = str4;
        this.kpj = str5;
        this.masaPerlindungan = str6;
        this.nomIuranItrf = str7;
        this.program = str8;
        this.tglPniItrf = str9;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDasarUpah() {
        return this.dasarUpah;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJenisPekerjaan() {
        return this.jenisPekerjaan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKantorKepesertaan() {
        return this.kantorKepesertaan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodeTk() {
        return this.kodeTk;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMasaPerlindungan() {
        return this.masaPerlindungan;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNomIuranItrf() {
        return this.nomIuranItrf;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProgram() {
        return this.program;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTglPniItrf() {
        return this.tglPniItrf;
    }

    public final BPUMembershipInformationItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        return new BPUMembershipInformationItem(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BPUMembershipInformationItem)) {
            return false;
        }
        BPUMembershipInformationItem bPUMembershipInformationItem = (BPUMembershipInformationItem) p0;
        return Intrinsics.areEqual(this.dasarUpah, bPUMembershipInformationItem.dasarUpah) && Intrinsics.areEqual(this.jenisPekerjaan, bPUMembershipInformationItem.jenisPekerjaan) && Intrinsics.areEqual(this.kantorKepesertaan, bPUMembershipInformationItem.kantorKepesertaan) && Intrinsics.areEqual(this.kodeTk, bPUMembershipInformationItem.kodeTk) && Intrinsics.areEqual(this.kpj, bPUMembershipInformationItem.kpj) && Intrinsics.areEqual(this.masaPerlindungan, bPUMembershipInformationItem.masaPerlindungan) && Intrinsics.areEqual(this.nomIuranItrf, bPUMembershipInformationItem.nomIuranItrf) && Intrinsics.areEqual(this.program, bPUMembershipInformationItem.program) && Intrinsics.areEqual(this.tglPniItrf, bPUMembershipInformationItem.tglPniItrf);
    }

    public final int hashCode() {
        String str = this.dasarUpah;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.jenisPekerjaan;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.kantorKepesertaan;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kodeTk;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.kpj;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.masaPerlindungan;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.nomIuranItrf;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.program;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tglPniItrf;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String str = this.dasarUpah;
        String str2 = this.jenisPekerjaan;
        String str3 = this.kantorKepesertaan;
        String str4 = this.kodeTk;
        String str5 = this.kpj;
        String str6 = this.masaPerlindungan;
        String str7 = this.nomIuranItrf;
        String str8 = this.program;
        String str9 = this.tglPniItrf;
        StringBuilder sb = new StringBuilder("BPUMembershipInformationItem(dasarUpah=");
        sb.append(str);
        sb.append(", jenisPekerjaan=");
        sb.append(str2);
        sb.append(", kantorKepesertaan=");
        sb.append(str3);
        sb.append(", kodeTk=");
        sb.append(str4);
        sb.append(", kpj=");
        sb.append(str5);
        sb.append(", masaPerlindungan=");
        sb.append(str6);
        sb.append(", nomIuranItrf=");
        sb.append(str7);
        sb.append(", program=");
        sb.append(str8);
        sb.append(", tglPniItrf=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.dasarUpah);
        p0.writeString(this.jenisPekerjaan);
        p0.writeString(this.kantorKepesertaan);
        p0.writeString(this.kodeTk);
        p0.writeString(this.kpj);
        p0.writeString(this.masaPerlindungan);
        p0.writeString(this.nomIuranItrf);
        p0.writeString(this.program);
        p0.writeString(this.tglPniItrf);
    }
}
