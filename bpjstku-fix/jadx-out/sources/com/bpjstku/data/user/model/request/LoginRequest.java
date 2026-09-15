package com.bpjstku.data.user.model.request;

import androidx.autofill.HintConstants;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ|\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b!\u0010\u000fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u000fR\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u000fR\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u000fR\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000fR\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/user/model/request/LoginRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/user/model/request/LoginRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", HintConstants.AUTOFILL_HINT_PASSWORD, "getPassword", "registerId", "getRegisterId", "deviceId", "getDeviceId", "latitude", "getLatitude", "longitude", "getLongitude", PlaceTypes.LOCALITY, "getLocality", "deviceBrand", "getDeviceBrand", "deviceModel", "getDeviceModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoginRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("deviceBrand")
    private final String deviceBrand;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("deviceModel")
    private final String deviceModel;

    @SerializedName("email")
    private final String email;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    private final String password;

    @SerializedName("registerId")
    private final String registerId;

    public /* synthetic */ LoginRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getRegisterId() {
        return this.registerId;
    }

    public final String getDeviceId() {
        return this.deviceId;
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

    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public LoginRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.email = str;
        this.password = str2;
        this.registerId = str3;
        this.deviceId = str4;
        this.latitude = str5;
        this.longitude = str6;
        this.locality = str7;
        this.deviceBrand = str8;
        this.deviceModel = str9;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegisterId() {
        return this.registerId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
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

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final LoginRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        return new LoginRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LoginRequest)) {
            return false;
        }
        LoginRequest loginRequest = (LoginRequest) p0;
        return Intrinsics.areEqual(this.email, loginRequest.email) && Intrinsics.areEqual(this.password, loginRequest.password) && Intrinsics.areEqual(this.registerId, loginRequest.registerId) && Intrinsics.areEqual(this.deviceId, loginRequest.deviceId) && Intrinsics.areEqual(this.latitude, loginRequest.latitude) && Intrinsics.areEqual(this.longitude, loginRequest.longitude) && Intrinsics.areEqual(this.locality, loginRequest.locality) && Intrinsics.areEqual(this.deviceBrand, loginRequest.deviceBrand) && Intrinsics.areEqual(this.deviceModel, loginRequest.deviceModel);
    }

    public final int hashCode() {
        String str = this.email;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.password;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.registerId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.deviceId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.latitude;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.longitude;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.locality;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.deviceBrand;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.deviceModel;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.password;
        String str3 = this.registerId;
        String str4 = this.deviceId;
        String str5 = this.latitude;
        String str6 = this.longitude;
        String str7 = this.locality;
        String str8 = this.deviceBrand;
        String str9 = this.deviceModel;
        StringBuilder sb = new StringBuilder("LoginRequest(email=");
        sb.append(str);
        sb.append(", password=");
        sb.append(str2);
        sb.append(", registerId=");
        sb.append(str3);
        sb.append(", deviceId=");
        sb.append(str4);
        sb.append(", latitude=");
        sb.append(str5);
        sb.append(", longitude=");
        sb.append(str6);
        sb.append(", locality=");
        sb.append(str7);
        sb.append(", deviceBrand=");
        sb.append(str8);
        sb.append(", deviceModel=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }
}
