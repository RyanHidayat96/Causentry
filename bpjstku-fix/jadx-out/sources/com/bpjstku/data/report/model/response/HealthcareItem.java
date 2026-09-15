package com.bpjstku.data.report.model.response;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/report/model/response/HealthcareItem;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/report/model/response/HealthcareItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", PlaceTypes.ADDRESS, "Ljava/lang/String;", "getAddress", "code", "getCode", "latitude", "getLatitude", "longitude", "getLongitude", "name", "getName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class HealthcareItem {
    public static final int $stable = 0;

    @SerializedName("alamat")
    private final String address;

    @SerializedName("kode")
    private final String code;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("nama")
    private final String name;

    public HealthcareItem(String str, String str2, String str3, String str4, String str5) {
        this.address = str;
        this.code = str2;
        this.latitude = str3;
        this.longitude = str4;
        this.name = str5;
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

    public final String getName() {
        return this.name;
    }

    public static /* synthetic */ HealthcareItem copy$default(HealthcareItem healthcareItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthcareItem.address;
        }
        if ((i & 2) != 0) {
            str2 = healthcareItem.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = healthcareItem.latitude;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = healthcareItem.longitude;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = healthcareItem.name;
        }
        return healthcareItem.copy(str, str6, str7, str8, str5);
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
    public final String getName() {
        return this.name;
    }

    public final HealthcareItem copy(String p0, String p1, String p2, String p3, String p4) {
        return new HealthcareItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof HealthcareItem)) {
            return false;
        }
        HealthcareItem healthcareItem = (HealthcareItem) p0;
        return Intrinsics.areEqual(this.address, healthcareItem.address) && Intrinsics.areEqual(this.code, healthcareItem.code) && Intrinsics.areEqual(this.latitude, healthcareItem.latitude) && Intrinsics.areEqual(this.longitude, healthcareItem.longitude) && Intrinsics.areEqual(this.name, healthcareItem.name);
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
        String str5 = this.name;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.address;
        String str2 = this.code;
        String str3 = this.latitude;
        String str4 = this.longitude;
        String str5 = this.name;
        StringBuilder sb = new StringBuilder("HealthcareItem(address=");
        sb.append(str);
        sb.append(", code=");
        sb.append(str2);
        sb.append(", latitude=");
        sb.append(str3);
        sb.append(", longitude=");
        sb.append(str4);
        sb.append(", name=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
