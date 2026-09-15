package com.bpjstku.data.bsu.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010\u000fJ\u001d\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000fR\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u000fR\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u000fR\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u000fR\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u000fR\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u000fR\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u000fR\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u000fR\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/bsu/model/request/DataPekerja;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/bsu/model/request/DataPekerja;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "chId", "Ljava/lang/String;", "getChId", "email", "getEmail", "handphone", "getHandphone", "namaIbu", "getNamaIbu", "namaPekerja", "getNamaPekerja", "nomorPegawai", "getNomorPegawai", "nomorIdentitas", "getNomorIdentitas", "statusEligible", "getStatusEligible", "tglLahir", "getTglLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataPekerja implements Parcelable {

    @SerializedName("chId")
    private final String chId;

    @SerializedName("email")
    private final String email;

    @SerializedName("handphone")
    private final String handphone;

    @SerializedName("namaIbu")
    private final String namaIbu;

    @SerializedName("namaPekerja")
    private final String namaPekerja;

    @SerializedName("nomorIdentitas")
    private final String nomorIdentitas;

    @SerializedName("nomorPegawai")
    private final String nomorPegawai;

    @SerializedName("statusEligible")
    private final String statusEligible;

    @SerializedName("tglLahir")
    private final String tglLahir;
    public static final Parcelable.Creator<DataPekerja> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataPekerja> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataPekerja createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DataPekerja(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataPekerja[] newArray(int i) {
            return new DataPekerja[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DataPekerja(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.chId = str;
        this.email = str2;
        this.handphone = str3;
        this.namaIbu = str4;
        this.namaPekerja = str5;
        this.nomorPegawai = str6;
        this.nomorIdentitas = str7;
        this.statusEligible = str8;
        this.tglLahir = str9;
    }

    public final String getChId() {
        return this.chId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getHandphone() {
        return this.handphone;
    }

    public final String getNamaIbu() {
        return this.namaIbu;
    }

    public final String getNamaPekerja() {
        return this.namaPekerja;
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
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHandphone() {
        return this.handphone;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNamaIbu() {
        return this.namaIbu;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNamaPekerja() {
        return this.namaPekerja;
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

    public final DataPekerja copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        return new DataPekerja(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DataPekerja)) {
            return false;
        }
        DataPekerja dataPekerja = (DataPekerja) p0;
        return Intrinsics.areEqual(this.chId, dataPekerja.chId) && Intrinsics.areEqual(this.email, dataPekerja.email) && Intrinsics.areEqual(this.handphone, dataPekerja.handphone) && Intrinsics.areEqual(this.namaIbu, dataPekerja.namaIbu) && Intrinsics.areEqual(this.namaPekerja, dataPekerja.namaPekerja) && Intrinsics.areEqual(this.nomorPegawai, dataPekerja.nomorPegawai) && Intrinsics.areEqual(this.nomorIdentitas, dataPekerja.nomorIdentitas) && Intrinsics.areEqual(this.statusEligible, dataPekerja.statusEligible) && Intrinsics.areEqual(this.tglLahir, dataPekerja.tglLahir);
    }

    public final int hashCode() {
        return (((((((((((((((this.chId.hashCode() * 31) + this.email.hashCode()) * 31) + this.handphone.hashCode()) * 31) + this.namaIbu.hashCode()) * 31) + this.namaPekerja.hashCode()) * 31) + this.nomorPegawai.hashCode()) * 31) + this.nomorIdentitas.hashCode()) * 31) + this.statusEligible.hashCode()) * 31) + this.tglLahir.hashCode();
    }

    public final String toString() {
        String str = this.chId;
        String str2 = this.email;
        String str3 = this.handphone;
        String str4 = this.namaIbu;
        String str5 = this.namaPekerja;
        String str6 = this.nomorPegawai;
        String str7 = this.nomorIdentitas;
        String str8 = this.statusEligible;
        String str9 = this.tglLahir;
        StringBuilder sb = new StringBuilder("DataPekerja(chId=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", handphone=");
        sb.append(str3);
        sb.append(", namaIbu=");
        sb.append(str4);
        sb.append(", namaPekerja=");
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
        p0.writeString(this.email);
        p0.writeString(this.handphone);
        p0.writeString(this.namaIbu);
        p0.writeString(this.namaPekerja);
        p0.writeString(this.nomorPegawai);
        p0.writeString(this.nomorIdentitas);
        p0.writeString(this.statusEligible);
        p0.writeString(this.tglLahir);
    }
}
