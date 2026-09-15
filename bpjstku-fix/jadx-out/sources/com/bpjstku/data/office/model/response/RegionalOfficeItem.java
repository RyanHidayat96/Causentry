package com.bpjstku.data.office.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import defpackage.unsuspend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J^\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\"\u0010\u0010J\u001d\u0010%\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010*\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0010R\u001c\u0010,\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010/\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\u0013R\u001c\u00101\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010\u0010R\"\u00103\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0017"}, d2 = {"Lcom/bpjstku/data/office/model/response/RegionalOfficeItem;", "Landroid/os/Parcelable;", "Lunsuspend;", "", "p0", "p1", "", "p2", "p3", "p4", "", "Lcom/bpjstku/data/office/model/response/BranchOfficeItem;", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Double;", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)Lcom/bpjstku/data/office/model/response/RegionalOfficeItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PlaceTypes.ADDRESS, "Ljava/lang/String;", "getAddress", "code", "getCode", "latitude", "Ljava/lang/Double;", "getLatitude", "longitude", "getLongitude", "officeName", "getOfficeName", "branchOffices", "Ljava/util/List;", "getBranchOffices"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RegionalOfficeItem extends unsuspend implements Parcelable {

    @SerializedName(alternate = {"alamatKantorWilayah"}, value = "alamat")
    private final String address;

    @SerializedName("kantorCabang")
    private final List<BranchOfficeItem> branchOffices;

    @SerializedName(alternate = {"kodeKantorWilayah"}, value = "kode")
    private final String code;

    @SerializedName(alternate = {"latitudeKantorWilayah"}, value = "latitude")
    private final Double latitude;

    @SerializedName(alternate = {"longitudeKantorWilayah"}, value = "longitude")
    private final Double longitude;

    @SerializedName(alternate = {"namaKantorWilayah"}, value = "nama")
    private final String officeName;
    public static final Parcelable.Creator<RegionalOfficeItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RegionalOfficeItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegionalOfficeItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(BranchOfficeItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new RegionalOfficeItem(string, string2, dValueOf, dValueOf2, string3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegionalOfficeItem[] newArray(int i) {
            return new RegionalOfficeItem[i];
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

    public final List<BranchOfficeItem> getBranchOffices() {
        return this.branchOffices;
    }

    public /* synthetic */ RegionalOfficeItem(String str, String str2, Double d, Double d2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, d2, str3, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    public RegionalOfficeItem(String str, String str2, Double d, Double d2, String str3, List<BranchOfficeItem> list) {
        this.address = str;
        this.code = str2;
        this.latitude = d;
        this.longitude = d2;
        this.officeName = str3;
        this.branchOffices = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegionalOfficeItem copy$default(RegionalOfficeItem regionalOfficeItem, String str, String str2, Double d, Double d2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regionalOfficeItem.address;
        }
        if ((i & 2) != 0) {
            str2 = regionalOfficeItem.code;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            d = regionalOfficeItem.latitude;
        }
        Double d3 = d;
        if ((i & 8) != 0) {
            d2 = regionalOfficeItem.longitude;
        }
        Double d4 = d2;
        if ((i & 16) != 0) {
            str3 = regionalOfficeItem.officeName;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            list = regionalOfficeItem.branchOffices;
        }
        return regionalOfficeItem.copy(str, str4, d3, d4, str5, list);
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

    public final List<BranchOfficeItem> component6() {
        return this.branchOffices;
    }

    public final RegionalOfficeItem copy(String p0, String p1, Double p2, Double p3, String p4, List<BranchOfficeItem> p5) {
        return new RegionalOfficeItem(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RegionalOfficeItem)) {
            return false;
        }
        RegionalOfficeItem regionalOfficeItem = (RegionalOfficeItem) p0;
        return Intrinsics.areEqual(this.address, regionalOfficeItem.address) && Intrinsics.areEqual(this.code, regionalOfficeItem.code) && Intrinsics.areEqual((Object) this.latitude, (Object) regionalOfficeItem.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) regionalOfficeItem.longitude) && Intrinsics.areEqual(this.officeName, regionalOfficeItem.officeName) && Intrinsics.areEqual(this.branchOffices, regionalOfficeItem.branchOffices);
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
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        List<BranchOfficeItem> list = this.branchOffices;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.address;
        String str2 = this.code;
        Double d = this.latitude;
        Double d2 = this.longitude;
        String str3 = this.officeName;
        List<BranchOfficeItem> list = this.branchOffices;
        StringBuilder sb = new StringBuilder("RegionalOfficeItem(address=");
        sb.append(str);
        sb.append(", code=");
        sb.append(str2);
        sb.append(", latitude=");
        sb.append(d);
        sb.append(", longitude=");
        sb.append(d2);
        sb.append(", officeName=");
        sb.append(str3);
        sb.append(", branchOffices=");
        sb.append(list);
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
        List<BranchOfficeItem> list = this.branchOffices;
        if (list == null) {
            p0.writeInt(0);
            return;
        }
        p0.writeInt(1);
        p0.writeInt(list.size());
        Iterator<BranchOfficeItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
    }
}
