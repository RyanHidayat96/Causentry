package com.bpjstku.data.office.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.unsuspend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJL\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u001b\u0010\fJ\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\fR\u001c\u0010%\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\fR\u001c\u0010'\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\fR\u001c\u0010)\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\f"}, d2 = {"Lcom/bpjstku/data/office/model/response/BranchPioneerOfficeItem;", "Landroid/os/Parcelable;", "Lunsuspend;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/office/model/response/BranchPioneerOfficeItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PlaceTypes.ADDRESS, "Ljava/lang/String;", "getAddress", "code", "getCode", "latitude", "getLatitude", "longitude", "getLongitude", "officeName", "getOfficeName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BranchPioneerOfficeItem extends unsuspend implements Parcelable {

    @SerializedName("alamatKantorCabang")
    private final String address;

    @SerializedName("kodeKantorCabang")
    private final String code;

    @SerializedName("latitudeKantorCabang")
    private final String latitude;

    @SerializedName("longitudeKantorCabang")
    private final String longitude;

    @SerializedName("namaKantorCabang")
    private final String officeName;
    public static final Parcelable.Creator<BranchPioneerOfficeItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BranchPioneerOfficeItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BranchPioneerOfficeItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BranchPioneerOfficeItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BranchPioneerOfficeItem[] newArray(int i) {
            return new BranchPioneerOfficeItem[i];
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

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getOfficeName() {
        return this.officeName;
    }

    public BranchPioneerOfficeItem(String str, String str2, String str3, String str4, String str5) {
        this.address = str;
        this.code = str2;
        this.latitude = str3;
        this.longitude = str4;
        this.officeName = str5;
    }

    public static /* synthetic */ BranchPioneerOfficeItem copy$default(BranchPioneerOfficeItem branchPioneerOfficeItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = branchPioneerOfficeItem.address;
        }
        if ((i & 2) != 0) {
            str2 = branchPioneerOfficeItem.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = branchPioneerOfficeItem.latitude;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = branchPioneerOfficeItem.longitude;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = branchPioneerOfficeItem.officeName;
        }
        return branchPioneerOfficeItem.copy(str, str6, str7, str8, str5);
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
    public final String getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOfficeName() {
        return this.officeName;
    }

    public final BranchPioneerOfficeItem copy(String p0, String p1, String p2, String p3, String p4) {
        return new BranchPioneerOfficeItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BranchPioneerOfficeItem)) {
            return false;
        }
        BranchPioneerOfficeItem branchPioneerOfficeItem = (BranchPioneerOfficeItem) p0;
        return Intrinsics.areEqual(this.address, branchPioneerOfficeItem.address) && Intrinsics.areEqual(this.code, branchPioneerOfficeItem.code) && Intrinsics.areEqual(this.latitude, branchPioneerOfficeItem.latitude) && Intrinsics.areEqual(this.longitude, branchPioneerOfficeItem.longitude) && Intrinsics.areEqual(this.officeName, branchPioneerOfficeItem.officeName);
    }

    public final int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.code;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.latitude;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.longitude;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.officeName;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.address;
        String str2 = this.code;
        String str3 = this.latitude;
        String str4 = this.longitude;
        String str5 = this.officeName;
        StringBuilder sb = new StringBuilder("BranchPioneerOfficeItem(address=");
        sb.append(str);
        sb.append(", code=");
        sb.append(str2);
        sb.append(", latitude=");
        sb.append(str3);
        sb.append(", longitude=");
        sb.append(str4);
        sb.append(", officeName=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.address);
        p0.writeString(this.code);
        p0.writeString(this.latitude);
        p0.writeString(this.longitude);
        p0.writeString(this.officeName);
    }
}
