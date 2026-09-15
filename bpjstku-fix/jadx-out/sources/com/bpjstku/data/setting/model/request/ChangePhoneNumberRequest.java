package com.bpjstku.data.setting.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ`\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\rR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\rR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\rR\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\rR\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\rR\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\r"}, d2 = {"Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/setting/model/request/ChangePhoneNumberRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "noHp", "Ljava/lang/String;", "getNoHp", "email", "getEmail", "otp", "getOtp", "checkSum", "getCheckSum", "latitude", "getLatitude", "longitude", "getLongitude", PlaceTypes.LOCALITY, "getLocality"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChangePhoneNumberRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("email")
    private final String email;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("noHp")
    private final String noHp;

    @SerializedName("otp")
    private final String otp;

    public final String getNoHp() {
        return this.noHp;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getLocality() {
        return this.locality;
    }

    public ChangePhoneNumberRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.noHp = str;
        this.email = str2;
        this.otp = str3;
        this.checkSum = str4;
        this.latitude = str5;
        this.longitude = str6;
        this.locality = str7;
    }

    public static /* synthetic */ ChangePhoneNumberRequest copy$default(ChangePhoneNumberRequest changePhoneNumberRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changePhoneNumberRequest.noHp;
        }
        if ((i & 2) != 0) {
            str2 = changePhoneNumberRequest.email;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = changePhoneNumberRequest.otp;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = changePhoneNumberRequest.checkSum;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = changePhoneNumberRequest.latitude;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = changePhoneNumberRequest.longitude;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = changePhoneNumberRequest.locality;
        }
        return changePhoneNumberRequest.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNoHp() {
        return this.noHp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    public final ChangePhoneNumberRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new ChangePhoneNumberRequest(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ChangePhoneNumberRequest)) {
            return false;
        }
        ChangePhoneNumberRequest changePhoneNumberRequest = (ChangePhoneNumberRequest) p0;
        return Intrinsics.areEqual(this.noHp, changePhoneNumberRequest.noHp) && Intrinsics.areEqual(this.email, changePhoneNumberRequest.email) && Intrinsics.areEqual(this.otp, changePhoneNumberRequest.otp) && Intrinsics.areEqual(this.checkSum, changePhoneNumberRequest.checkSum) && Intrinsics.areEqual(this.latitude, changePhoneNumberRequest.latitude) && Intrinsics.areEqual(this.longitude, changePhoneNumberRequest.longitude) && Intrinsics.areEqual(this.locality, changePhoneNumberRequest.locality);
    }

    public final int hashCode() {
        int iHashCode = this.noHp.hashCode();
        int iHashCode2 = this.email.hashCode();
        String str = this.otp;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.checkSum;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.latitude;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.longitude;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.locality;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.noHp;
        String str2 = this.email;
        String str3 = this.otp;
        String str4 = this.checkSum;
        String str5 = this.latitude;
        String str6 = this.longitude;
        String str7 = this.locality;
        StringBuilder sb = new StringBuilder("ChangePhoneNumberRequest(noHp=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", otp=");
        sb.append(str3);
        sb.append(", checkSum=");
        sb.append(str4);
        sb.append(", latitude=");
        sb.append(str5);
        sb.append(", longitude=");
        sb.append(str6);
        sb.append(", locality=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }
}
