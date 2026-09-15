package com.bpjstku.data.asik.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002H×\u0001¢\u0006\u0004\b \u0010\u000eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u000eR\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u000eR\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u000eR\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u000eR\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010\u000eR\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010\u000e"}, d2 = {"Lcom/bpjstku/data/asik/model/response/EmployeeFamilyItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/response/EmployeeFamilyItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "nik", "Ljava/lang/String;", "getNik", "statusAktif", "getStatusAktif", "nama", "getNama", "statusHubungan", "getStatusHubungan", "kodeTkKeluarga", "getKodeTkKeluarga", "jenisKelamin", "getJenisKelamin", "tanggalLahir", "getTanggalLahir", "tempatLahir", "getTempatLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmployeeFamilyItem implements Parcelable {

    @SerializedName("jenisKelamin")
    private final String jenisKelamin;

    @SerializedName("kodeTkKeluarga")
    private final String kodeTkKeluarga;

    @SerializedName("nama")
    private final String nama;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("statusAktif")
    private final String statusAktif;

    @SerializedName("statusHubungan")
    private final String statusHubungan;

    @SerializedName("tanggalLahir")
    private final String tanggalLahir;

    @SerializedName("tempatLahir")
    private final String tempatLahir;
    public static final Parcelable.Creator<EmployeeFamilyItem> CREATOR = new Creator();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmployeeFamilyItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmployeeFamilyItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EmployeeFamilyItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmployeeFamilyItem[] newArray(int i) {
            return new EmployeeFamilyItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EmployeeFamilyItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.nik = str;
        this.statusAktif = str2;
        this.nama = str3;
        this.statusHubungan = str4;
        this.kodeTkKeluarga = str5;
        this.jenisKelamin = str6;
        this.tanggalLahir = str7;
        this.tempatLahir = str8;
    }

    public /* synthetic */ EmployeeFamilyItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getStatusAktif() {
        return this.statusAktif;
    }

    public final String getNama() {
        return this.nama;
    }

    public final String getStatusHubungan() {
        return this.statusHubungan;
    }

    public final String getKodeTkKeluarga() {
        return this.kodeTkKeluarga;
    }

    public final String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public final String getTanggalLahir() {
        return this.tanggalLahir;
    }

    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    public EmployeeFamilyItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusAktif() {
        return this.statusAktif;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNama() {
        return this.nama;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusHubungan() {
        return this.statusHubungan;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKodeTkKeluarga() {
        return this.kodeTkKeluarga;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJenisKelamin() {
        return this.jenisKelamin;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTanggalLahir() {
        return this.tanggalLahir;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    public final EmployeeFamilyItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7) {
        return new EmployeeFamilyItem(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EmployeeFamilyItem)) {
            return false;
        }
        EmployeeFamilyItem employeeFamilyItem = (EmployeeFamilyItem) p0;
        return Intrinsics.areEqual(this.nik, employeeFamilyItem.nik) && Intrinsics.areEqual(this.statusAktif, employeeFamilyItem.statusAktif) && Intrinsics.areEqual(this.nama, employeeFamilyItem.nama) && Intrinsics.areEqual(this.statusHubungan, employeeFamilyItem.statusHubungan) && Intrinsics.areEqual(this.kodeTkKeluarga, employeeFamilyItem.kodeTkKeluarga) && Intrinsics.areEqual(this.jenisKelamin, employeeFamilyItem.jenisKelamin) && Intrinsics.areEqual(this.tanggalLahir, employeeFamilyItem.tanggalLahir) && Intrinsics.areEqual(this.tempatLahir, employeeFamilyItem.tempatLahir);
    }

    public final int hashCode() {
        String str = this.nik;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.statusAktif;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nama;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.statusHubungan;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.kodeTkKeluarga;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.jenisKelamin;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tanggalLahir;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tempatLahir;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.nik;
        String str2 = this.statusAktif;
        String str3 = this.nama;
        String str4 = this.statusHubungan;
        String str5 = this.kodeTkKeluarga;
        String str6 = this.jenisKelamin;
        String str7 = this.tanggalLahir;
        String str8 = this.tempatLahir;
        StringBuilder sb = new StringBuilder("EmployeeFamilyItem(nik=");
        sb.append(str);
        sb.append(", statusAktif=");
        sb.append(str2);
        sb.append(", nama=");
        sb.append(str3);
        sb.append(", statusHubungan=");
        sb.append(str4);
        sb.append(", kodeTkKeluarga=");
        sb.append(str5);
        sb.append(", jenisKelamin=");
        sb.append(str6);
        sb.append(", tanggalLahir=");
        sb.append(str7);
        sb.append(", tempatLahir=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.nik);
        p0.writeString(this.statusAktif);
        p0.writeString(this.nama);
        p0.writeString(this.statusHubungan);
        p0.writeString(this.kodeTkKeluarga);
        p0.writeString(this.jenisKelamin);
        p0.writeString(this.tanggalLahir);
        p0.writeString(this.tempatLahir);
    }
}
