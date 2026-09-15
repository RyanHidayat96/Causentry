package com.bpjstku.data.asik.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\rJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\rR\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\rR\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\rR\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\rR\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010\rR\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010\r"}, d2 = {"Lcom/bpjstku/data/asik/model/response/EmployeeKpjItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/response/EmployeeKpjItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "nik", "Ljava/lang/String;", "getNik", "statusAktif", "getStatusAktif", "noKpj", "getNoKpj", "lokasi", "getLokasi", "namaPerusahaan", "getNamaPerusahaan", "kodeTkKpj", "getKodeTkKpj", "kodeSegmen", "getKodeSegmen"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmployeeKpjItem implements Parcelable {

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kodeTkKpj")
    private final String kodeTkKpj;

    @SerializedName("lokasi")
    private final String lokasi;

    @SerializedName("namaPerusahaan")
    private final String namaPerusahaan;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("noKpj")
    private final String noKpj;

    @SerializedName("statusAktif")
    private final String statusAktif;
    public static final Parcelable.Creator<EmployeeKpjItem> CREATOR = new Creator();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmployeeKpjItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmployeeKpjItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EmployeeKpjItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmployeeKpjItem[] newArray(int i) {
            return new EmployeeKpjItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EmployeeKpjItem(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.nik = str;
        this.statusAktif = str2;
        this.noKpj = str3;
        this.lokasi = str4;
        this.namaPerusahaan = str5;
        this.kodeTkKpj = str6;
        this.kodeSegmen = str7;
    }

    public /* synthetic */ EmployeeKpjItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getStatusAktif() {
        return this.statusAktif;
    }

    public final String getNoKpj() {
        return this.noKpj;
    }

    public final String getLokasi() {
        return this.lokasi;
    }

    public final String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    public final String getKodeTkKpj() {
        return this.kodeTkKpj;
    }

    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    public EmployeeKpjItem() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ EmployeeKpjItem copy$default(EmployeeKpjItem employeeKpjItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = employeeKpjItem.nik;
        }
        if ((i & 2) != 0) {
            str2 = employeeKpjItem.statusAktif;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = employeeKpjItem.noKpj;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = employeeKpjItem.lokasi;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = employeeKpjItem.namaPerusahaan;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = employeeKpjItem.kodeTkKpj;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = employeeKpjItem.kodeSegmen;
        }
        return employeeKpjItem.copy(str, str8, str9, str10, str11, str12, str7);
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
    public final String getNoKpj() {
        return this.noKpj;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLokasi() {
        return this.lokasi;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getKodeTkKpj() {
        return this.kodeTkKpj;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    public final EmployeeKpjItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6) {
        return new EmployeeKpjItem(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EmployeeKpjItem)) {
            return false;
        }
        EmployeeKpjItem employeeKpjItem = (EmployeeKpjItem) p0;
        return Intrinsics.areEqual(this.nik, employeeKpjItem.nik) && Intrinsics.areEqual(this.statusAktif, employeeKpjItem.statusAktif) && Intrinsics.areEqual(this.noKpj, employeeKpjItem.noKpj) && Intrinsics.areEqual(this.lokasi, employeeKpjItem.lokasi) && Intrinsics.areEqual(this.namaPerusahaan, employeeKpjItem.namaPerusahaan) && Intrinsics.areEqual(this.kodeTkKpj, employeeKpjItem.kodeTkKpj) && Intrinsics.areEqual(this.kodeSegmen, employeeKpjItem.kodeSegmen);
    }

    public final int hashCode() {
        String str = this.nik;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.statusAktif;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.noKpj;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lokasi;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.namaPerusahaan;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.kodeTkKpj;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.kodeSegmen;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.nik;
        String str2 = this.statusAktif;
        String str3 = this.noKpj;
        String str4 = this.lokasi;
        String str5 = this.namaPerusahaan;
        String str6 = this.kodeTkKpj;
        String str7 = this.kodeSegmen;
        StringBuilder sb = new StringBuilder("EmployeeKpjItem(nik=");
        sb.append(str);
        sb.append(", statusAktif=");
        sb.append(str2);
        sb.append(", noKpj=");
        sb.append(str3);
        sb.append(", lokasi=");
        sb.append(str4);
        sb.append(", namaPerusahaan=");
        sb.append(str5);
        sb.append(", kodeTkKpj=");
        sb.append(str6);
        sb.append(", kodeSegmen=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.nik);
        p0.writeString(this.statusAktif);
        p0.writeString(this.noKpj);
        p0.writeString(this.lokasi);
        p0.writeString(this.namaPerusahaan);
        p0.writeString(this.kodeTkKpj);
        p0.writeString(this.kodeSegmen);
    }
}
