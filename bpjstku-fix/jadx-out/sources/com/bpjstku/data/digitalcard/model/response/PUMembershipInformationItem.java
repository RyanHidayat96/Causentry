package com.bpjstku.data.digitalcard.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.unsuspend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009d\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u0016JÄ\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010\u0004\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010)J\u0010\u0010/\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b/\u0010\u0016J\u001d\u00102\u001a\u0002012\u0006\u0010\u0004\u001a\u0002002\u0006\u0010\u0005\u001a\u00020'¢\u0006\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0016R\u001c\u00107\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u0016R\u001c\u00109\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u0016R\u001c\u0010;\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\u0016R\u001c\u0010=\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010\u0016R\u001c\u0010?\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010\u0016R\u001c\u0010A\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00105\u001a\u0004\bB\u0010\u0016R\u001c\u0010C\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u0010\u0016R\u001c\u0010E\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00105\u001a\u0004\bF\u0010\u0016R\u001c\u0010G\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u00105\u001a\u0004\bH\u0010\u0016R\u001c\u0010I\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bJ\u0010\u0016R\u001c\u0010K\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u00105\u001a\u0004\bL\u0010\u0016R\u001c\u0010M\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u00105\u001a\u0004\bN\u0010\u0016R\u001c\u0010O\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u00105\u001a\u0004\bP\u0010\u0016R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u00105\u001a\u0004\bR\u0010\u0016"}, d2 = {"Lcom/bpjstku/data/digitalcard/model/response/PUMembershipInformationItem;", "Landroid/os/Parcelable;", "Lunsuspend;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/digitalcard/model/response/PUMembershipInformationItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "blthItrf", "Ljava/lang/String;", "getBlthItrf", "jmlTkItrf", "getJmlTkItrf", "kodeTk", "getKodeTk", "kpj", "getKpj", "masaIurJp", "getMasaIurJp", "namaPerusahaan", "getNamaPerusahaan", "nomUpahItrf", "getNomUpahItrf", "npp", "getNpp", "program", "getProgram", "statusKeps", "getStatusKeps", "tglKepsJp", "getTglKepsJp", "tglPensiunJp", "getTglPensiunJp", "tglPniItrf", "getTglPniItrf", "tglKepsJkp", "getTglKepsJkp", "masaIurJkp", "getMasaIurJkp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PUMembershipInformationItem extends unsuspend implements Parcelable {

    @SerializedName("blthItrf")
    private final String blthItrf;

    @SerializedName("jmlTkItrf")
    private final String jmlTkItrf;

    @SerializedName("kodeTk")
    private final String kodeTk;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("masaIurJkp")
    private final String masaIurJkp;

    @SerializedName("masaIurJp")
    private final String masaIurJp;

    @SerializedName("namaPerusahaan")
    private final String namaPerusahaan;

    @SerializedName("nomUpahItrf")
    private final String nomUpahItrf;

    @SerializedName("npp")
    private final String npp;

    @SerializedName("program")
    private final String program;

    @SerializedName("statusKeps")
    private final String statusKeps;

    @SerializedName("tanggalKepsJkp")
    private final String tglKepsJkp;

    @SerializedName("tglKepsJp")
    private final String tglKepsJp;

    @SerializedName("tglPensiunJp")
    private final String tglPensiunJp;

    @SerializedName("tglPniItrf")
    private final String tglPniItrf;
    public static final Parcelable.Creator<PUMembershipInformationItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PUMembershipInformationItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PUMembershipInformationItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PUMembershipInformationItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PUMembershipInformationItem[] newArray(int i) {
            return new PUMembershipInformationItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getBlthItrf() {
        return this.blthItrf;
    }

    public final String getJmlTkItrf() {
        return this.jmlTkItrf;
    }

    public final String getKodeTk() {
        return this.kodeTk;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getMasaIurJp() {
        return this.masaIurJp;
    }

    public final String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    public final String getNomUpahItrf() {
        return this.nomUpahItrf;
    }

    public final String getNpp() {
        return this.npp;
    }

    public final String getProgram() {
        return this.program;
    }

    public final String getStatusKeps() {
        return this.statusKeps;
    }

    public final String getTglKepsJp() {
        return this.tglKepsJp;
    }

    public final String getTglPensiunJp() {
        return this.tglPensiunJp;
    }

    public final String getTglPniItrf() {
        return this.tglPniItrf;
    }

    public final String getTglKepsJkp() {
        return this.tglKepsJkp;
    }

    public final String getMasaIurJkp() {
        return this.masaIurJkp;
    }

    public PUMembershipInformationItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.blthItrf = str;
        this.jmlTkItrf = str2;
        this.kodeTk = str3;
        this.kpj = str4;
        this.masaIurJp = str5;
        this.namaPerusahaan = str6;
        this.nomUpahItrf = str7;
        this.npp = str8;
        this.program = str9;
        this.statusKeps = str10;
        this.tglKepsJp = str11;
        this.tglPensiunJp = str12;
        this.tglPniItrf = str13;
        this.tglKepsJkp = str14;
        this.masaIurJkp = str15;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBlthItrf() {
        return this.blthItrf;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStatusKeps() {
        return this.statusKeps;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTglKepsJp() {
        return this.tglKepsJp;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTglPensiunJp() {
        return this.tglPensiunJp;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTglPniItrf() {
        return this.tglPniItrf;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTglKepsJkp() {
        return this.tglKepsJkp;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMasaIurJkp() {
        return this.masaIurJkp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJmlTkItrf() {
        return this.jmlTkItrf;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKodeTk() {
        return this.kodeTk;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMasaIurJp() {
        return this.masaIurJp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNomUpahItrf() {
        return this.nomUpahItrf;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNpp() {
        return this.npp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProgram() {
        return this.program;
    }

    public final PUMembershipInformationItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14) {
        return new PUMembershipInformationItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PUMembershipInformationItem)) {
            return false;
        }
        PUMembershipInformationItem pUMembershipInformationItem = (PUMembershipInformationItem) p0;
        return Intrinsics.areEqual(this.blthItrf, pUMembershipInformationItem.blthItrf) && Intrinsics.areEqual(this.jmlTkItrf, pUMembershipInformationItem.jmlTkItrf) && Intrinsics.areEqual(this.kodeTk, pUMembershipInformationItem.kodeTk) && Intrinsics.areEqual(this.kpj, pUMembershipInformationItem.kpj) && Intrinsics.areEqual(this.masaIurJp, pUMembershipInformationItem.masaIurJp) && Intrinsics.areEqual(this.namaPerusahaan, pUMembershipInformationItem.namaPerusahaan) && Intrinsics.areEqual(this.nomUpahItrf, pUMembershipInformationItem.nomUpahItrf) && Intrinsics.areEqual(this.npp, pUMembershipInformationItem.npp) && Intrinsics.areEqual(this.program, pUMembershipInformationItem.program) && Intrinsics.areEqual(this.statusKeps, pUMembershipInformationItem.statusKeps) && Intrinsics.areEqual(this.tglKepsJp, pUMembershipInformationItem.tglKepsJp) && Intrinsics.areEqual(this.tglPensiunJp, pUMembershipInformationItem.tglPensiunJp) && Intrinsics.areEqual(this.tglPniItrf, pUMembershipInformationItem.tglPniItrf) && Intrinsics.areEqual(this.tglKepsJkp, pUMembershipInformationItem.tglKepsJkp) && Intrinsics.areEqual(this.masaIurJkp, pUMembershipInformationItem.masaIurJkp);
    }

    public final int hashCode() {
        String str = this.blthItrf;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.jmlTkItrf;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.kodeTk;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kpj;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.masaIurJp;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.namaPerusahaan;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.nomUpahItrf;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.npp;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.program;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.statusKeps;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.tglKepsJp;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.tglPensiunJp;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.tglPniItrf;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.tglKepsJkp;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.masaIurJkp;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str15 != null ? str15.hashCode() : 0);
    }

    public final String toString() {
        String str = this.blthItrf;
        String str2 = this.jmlTkItrf;
        String str3 = this.kodeTk;
        String str4 = this.kpj;
        String str5 = this.masaIurJp;
        String str6 = this.namaPerusahaan;
        String str7 = this.nomUpahItrf;
        String str8 = this.npp;
        String str9 = this.program;
        String str10 = this.statusKeps;
        String str11 = this.tglKepsJp;
        String str12 = this.tglPensiunJp;
        String str13 = this.tglPniItrf;
        String str14 = this.tglKepsJkp;
        String str15 = this.masaIurJkp;
        StringBuilder sb = new StringBuilder("PUMembershipInformationItem(blthItrf=");
        sb.append(str);
        sb.append(", jmlTkItrf=");
        sb.append(str2);
        sb.append(", kodeTk=");
        sb.append(str3);
        sb.append(", kpj=");
        sb.append(str4);
        sb.append(", masaIurJp=");
        sb.append(str5);
        sb.append(", namaPerusahaan=");
        sb.append(str6);
        sb.append(", nomUpahItrf=");
        sb.append(str7);
        sb.append(", npp=");
        sb.append(str8);
        sb.append(", program=");
        sb.append(str9);
        sb.append(", statusKeps=");
        sb.append(str10);
        sb.append(", tglKepsJp=");
        sb.append(str11);
        sb.append(", tglPensiunJp=");
        sb.append(str12);
        sb.append(", tglPniItrf=");
        sb.append(str13);
        sb.append(", tglKepsJkp=");
        sb.append(str14);
        sb.append(", masaIurJkp=");
        sb.append(str15);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.blthItrf);
        p0.writeString(this.jmlTkItrf);
        p0.writeString(this.kodeTk);
        p0.writeString(this.kpj);
        p0.writeString(this.masaIurJp);
        p0.writeString(this.namaPerusahaan);
        p0.writeString(this.nomUpahItrf);
        p0.writeString(this.npp);
        p0.writeString(this.program);
        p0.writeString(this.statusKeps);
        p0.writeString(this.tglKepsJp);
        p0.writeString(this.tglPensiunJp);
        p0.writeString(this.tglPniItrf);
        p0.writeString(this.tglKepsJkp);
        p0.writeString(this.masaIurJkp);
    }
}
