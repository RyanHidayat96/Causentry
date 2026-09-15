package com.bpjstku.data.partners.model.response;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/bpjstku/data/partners/model/response/PartnerItem;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/partners/model/response/PartnerItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", PlaceTypes.ADDRESS, "Ljava/lang/String;", "getAddress", "ppkName", "getPpkName", "ppkNumber", "getPpkNumber", "partnerCode", "getPartnerCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PartnerItem {
    public static final int $stable = 0;

    @SerializedName("alamat")
    private final String address;

    @SerializedName("nomor")
    private final String partnerCode;

    @SerializedName("namaPpk")
    private final String ppkName;

    @SerializedName("noPpk")
    private final String ppkNumber;

    public PartnerItem(String str, String str2, String str3, String str4) {
        this.address = str;
        this.ppkName = str2;
        this.ppkNumber = str3;
        this.partnerCode = str4;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getPpkName() {
        return this.ppkName;
    }

    public final String getPpkNumber() {
        return this.ppkNumber;
    }

    public final String getPartnerCode() {
        return this.partnerCode;
    }

    public static /* synthetic */ PartnerItem copy$default(PartnerItem partnerItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerItem.address;
        }
        if ((i & 2) != 0) {
            str2 = partnerItem.ppkName;
        }
        if ((i & 4) != 0) {
            str3 = partnerItem.ppkNumber;
        }
        if ((i & 8) != 0) {
            str4 = partnerItem.partnerCode;
        }
        return partnerItem.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPpkName() {
        return this.ppkName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPpkNumber() {
        return this.ppkNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    public final PartnerItem copy(String p0, String p1, String p2, String p3) {
        return new PartnerItem(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PartnerItem)) {
            return false;
        }
        PartnerItem partnerItem = (PartnerItem) p0;
        return Intrinsics.areEqual(this.address, partnerItem.address) && Intrinsics.areEqual(this.ppkName, partnerItem.ppkName) && Intrinsics.areEqual(this.ppkNumber, partnerItem.ppkNumber) && Intrinsics.areEqual(this.partnerCode, partnerItem.partnerCode);
    }

    public final int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ppkName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ppkNumber;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.partnerCode;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.address;
        String str2 = this.ppkName;
        String str3 = this.ppkNumber;
        String str4 = this.partnerCode;
        StringBuilder sb = new StringBuilder("PartnerItem(address=");
        sb.append(str);
        sb.append(", ppkName=");
        sb.append(str2);
        sb.append(", ppkNumber=");
        sb.append(str3);
        sb.append(", partnerCode=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
