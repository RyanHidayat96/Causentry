package com.bpjstku.data.office.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.unsuspend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJL\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0004\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u001d\u0010\rJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010%\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\rR\u001c\u0010'\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010*\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0010R\u001c\u0010,\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010\r"}, d2 = {"Lcom/bpjstku/data/office/model/response/BranchOfficeItem;", "Landroid/os/Parcelable;", "Lunsuspend;", "", "p0", "p1", "", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Double;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/bpjstku/data/office/model/response/BranchOfficeItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PlaceTypes.ADDRESS, "Ljava/lang/String;", "getAddress", "code", "getCode", "latitude", "Ljava/lang/Double;", "getLatitude", "longitude", "getLongitude", "officeName", "getOfficeName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BranchOfficeItem extends unsuspend implements Parcelable {

    @SerializedName(alternate = {"alamatKantorCabang"}, value = "alamat")
    private final String address;

    @SerializedName(alternate = {"kodeKantorCabang"}, value = "kode")
    private final String code;

    @SerializedName(alternate = {"DestinationLatitude", "latitudeKantorCabang"}, value = "latitude")
    private final Double latitude;

    @SerializedName(alternate = {"DestinationLongitude", "longitudeKantorCabang"}, value = "longitude")
    private final Double longitude;

    @SerializedName(alternate = {"namaKantorCabang"}, value = "nama")
    private final String officeName;
    public static final Parcelable.Creator<BranchOfficeItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BranchOfficeItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BranchOfficeItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BranchOfficeItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BranchOfficeItem[] newArray(int i) {
            return new BranchOfficeItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCode() {
        return this.code;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getOfficeName() {
        return this.officeName;
    }

    public BranchOfficeItem(String str, String str2, Double d, Double d2, String str3) {
        this.address = str;
        this.code = str2;
        this.latitude = d;
        this.longitude = d2;
        this.officeName = str3;
    }

    public static /* synthetic */ BranchOfficeItem copy$default(BranchOfficeItem branchOfficeItem, String str, String str2, Double d, Double d2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = branchOfficeItem.address;
        }
        if ((i & 2) != 0) {
            str2 = branchOfficeItem.code;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            d = branchOfficeItem.latitude;
        }
        Double d3 = d;
        if ((i & 8) != 0) {
            d2 = branchOfficeItem.longitude;
        }
        Double d4 = d2;
        if ((i & 16) != 0) {
            str3 = branchOfficeItem.officeName;
        }
        return branchOfficeItem.copy(str, str4, d3, d4, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOfficeName() {
        return this.officeName;
    }

    public final BranchOfficeItem copy(String p0, String p1, Double p2, Double p3, String p4) {
        return new BranchOfficeItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BranchOfficeItem)) {
            return false;
        }
        BranchOfficeItem branchOfficeItem = (BranchOfficeItem) p0;
        return Intrinsics.areEqual(this.address, branchOfficeItem.address) && Intrinsics.areEqual(this.code, branchOfficeItem.code) && Intrinsics.areEqual((Object) this.latitude, (Object) branchOfficeItem.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) branchOfficeItem.longitude) && Intrinsics.areEqual(this.officeName, branchOfficeItem.officeName);
    }

    public final int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.code;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Double d = this.latitude;
        int iHashCode3 = d == null ? 0 : d.hashCode();
        Double d2 = this.longitude;
        int iHashCode4 = d2 == null ? 0 : d2.hashCode();
        String str3 = this.officeName;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.address;
        String str2 = this.code;
        Double d = this.latitude;
        Double d2 = this.longitude;
        String str3 = this.officeName;
        StringBuilder sb = new StringBuilder("BranchOfficeItem(address=");
        sb.append(str);
        sb.append(", code=");
        sb.append(str2);
        sb.append(", latitude=");
        sb.append(d);
        sb.append(", longitude=");
        sb.append(d2);
        sb.append(", officeName=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.address);
        p0.writeString(this.code);
        Double d = this.latitude;
        if (d == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d.doubleValue());
        }
        Double d2 = this.longitude;
        if (d2 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d2.doubleValue());
        }
        p0.writeString(this.officeName);
    }
}
