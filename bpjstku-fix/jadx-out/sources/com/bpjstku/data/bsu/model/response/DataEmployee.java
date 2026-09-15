package com.bpjstku.data.bsu.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ|\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010\u000fJ\u001d\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u000fR\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u000fR\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u000fR\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u000fR\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u000fR\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u000fR\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u000fR\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/bsu/model/response/DataEmployee;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/bsu/model/response/DataEmployee;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "chId", "Ljava/lang/String;", "getChId", "namaIbu", "getNamaIbu", "email", "getEmail", "mssisdn", "getMssisdn", "name", "getName", "nomorPegawai", "getNomorPegawai", "nomorIdentitas", "getNomorIdentitas", "statusEligible", "getStatusEligible", "tglLahir", "getTglLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataEmployee implements Parcelable {

    @SerializedName("chId")
    private final String chId;

    @SerializedName("email")
    private final String email;

    @SerializedName("handphone")
    private final String mssisdn;

    @SerializedName("namaIbu")
    private final String namaIbu;

    @SerializedName("namaPekerja")
    private final String name;

    @SerializedName("nomorIdentitas")
    private final String nomorIdentitas;

    @SerializedName("nomorPegawai")
    private final String nomorPegawai;

    @SerializedName("statusEligible")
    private final String statusEligible;

    @SerializedName("tglLahir")
    private final String tglLahir;
    public static final Parcelable.Creator<DataEmployee> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataEmployee> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataEmployee createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DataEmployee(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataEmployee[] newArray(int i) {
            return new DataEmployee[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DataEmployee(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.chId = str;
        this.namaIbu = str2;
        this.email = str3;
        this.mssisdn = str4;
        this.name = str5;
        this.nomorPegawai = str6;
        this.nomorIdentitas = str7;
        this.statusEligible = str8;
        this.tglLahir = str9;
    }

    public final String getChId() {
        return this.chId;
    }

    public final String getNamaIbu() {
        return this.namaIbu;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMssisdn() {
        return this.mssisdn;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNomorPegawai() {
        return this.nomorPegawai;
    }

    public final String getNomorIdentitas() {
        return this.nomorIdentitas;
    }

    public final String getStatusEligible() {
        return this.statusEligible;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChId() {
        return this.chId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaIbu() {
        return this.namaIbu;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMssisdn() {
        return this.mssisdn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNomorPegawai() {
        return this.nomorPegawai;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNomorIdentitas() {
        return this.nomorIdentitas;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatusEligible() {
        return this.statusEligible;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    public final DataEmployee copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        return new DataEmployee(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DataEmployee)) {
            return false;
        }
        DataEmployee dataEmployee = (DataEmployee) p0;
        return Intrinsics.areEqual(this.chId, dataEmployee.chId) && Intrinsics.areEqual(this.namaIbu, dataEmployee.namaIbu) && Intrinsics.areEqual(this.email, dataEmployee.email) && Intrinsics.areEqual(this.mssisdn, dataEmployee.mssisdn) && Intrinsics.areEqual(this.name, dataEmployee.name) && Intrinsics.areEqual(this.nomorPegawai, dataEmployee.nomorPegawai) && Intrinsics.areEqual(this.nomorIdentitas, dataEmployee.nomorIdentitas) && Intrinsics.areEqual(this.statusEligible, dataEmployee.statusEligible) && Intrinsics.areEqual(this.tglLahir, dataEmployee.tglLahir);
    }

    public final int hashCode() {
        String str = this.chId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.namaIbu;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.email;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.mssisdn;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.name;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nomorPegawai;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.nomorIdentitas;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.statusEligible;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tglLahir;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String str = this.chId;
        String str2 = this.namaIbu;
        String str3 = this.email;
        String str4 = this.mssisdn;
        String str5 = this.name;
        String str6 = this.nomorPegawai;
        String str7 = this.nomorIdentitas;
        String str8 = this.statusEligible;
        String str9 = this.tglLahir;
        StringBuilder sb = new StringBuilder("DataEmployee(chId=");
        sb.append(str);
        sb.append(", namaIbu=");
        sb.append(str2);
        sb.append(", email=");
        sb.append(str3);
        sb.append(", mssisdn=");
        sb.append(str4);
        sb.append(", name=");
        sb.append(str5);
        sb.append(", nomorPegawai=");
        sb.append(str6);
        sb.append(", nomorIdentitas=");
        sb.append(str7);
        sb.append(", statusEligible=");
        sb.append(str8);
        sb.append(", tglLahir=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.chId);
        p0.writeString(this.namaIbu);
        p0.writeString(this.email);
        p0.writeString(this.mssisdn);
        p0.writeString(this.name);
        p0.writeString(this.nomorPegawai);
        p0.writeString(this.nomorIdentitas);
        p0.writeString(this.statusEligible);
        p0.writeString(this.tglLahir);
    }
}
