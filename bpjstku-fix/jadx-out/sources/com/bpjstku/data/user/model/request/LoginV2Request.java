package com.bpjstku.data.user.model.request;

import androidx.autofill.HintConstants;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJn\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b!\u0010\u000fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u000fR\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u000fR\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u000fR\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000fR\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/user/model/request/LoginV2Request;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/user/model/request/LoginV2Request;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", HintConstants.AUTOFILL_HINT_PASSWORD, "getPassword", "deviceId", "getDeviceId", "lastInstalledVersion", "getLastInstalledVersion", "deviceBrand", "getDeviceBrand", "deviceModel", "getDeviceModel", "latitude", "getLatitude", "longitude", "getLongitude", PlaceTypes.LOCALITY, "getLocality"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoginV2Request extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("deviceBrand")
    private final String deviceBrand;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("deviceModel")
    private final String deviceModel;

    @SerializedName("email")
    private final String email;

    @SerializedName("lastInstalledVersion")
    private final String lastInstalledVersion;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    private final String password;

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getLastInstalledVersion() {
        return this.lastInstalledVersion;
    }

    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
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

    public LoginV2Request(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.email = str;
        this.password = str2;
        this.deviceId = str3;
        this.lastInstalledVersion = str4;
        this.deviceBrand = str5;
        this.deviceModel = str6;
        this.latitude = str7;
        this.longitude = str8;
        this.locality = str9;
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
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastInstalledVersion() {
        return this.lastInstalledVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    public final LoginV2Request copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        return new LoginV2Request(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LoginV2Request)) {
            return false;
        }
        LoginV2Request loginV2Request = (LoginV2Request) p0;
        return Intrinsics.areEqual(this.email, loginV2Request.email) && Intrinsics.areEqual(this.password, loginV2Request.password) && Intrinsics.areEqual(this.deviceId, loginV2Request.deviceId) && Intrinsics.areEqual(this.lastInstalledVersion, loginV2Request.lastInstalledVersion) && Intrinsics.areEqual(this.deviceBrand, loginV2Request.deviceBrand) && Intrinsics.areEqual(this.deviceModel, loginV2Request.deviceModel) && Intrinsics.areEqual(this.latitude, loginV2Request.latitude) && Intrinsics.areEqual(this.longitude, loginV2Request.longitude) && Intrinsics.areEqual(this.locality, loginV2Request.locality);
    }

    public final int hashCode() {
        String str = this.email;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.password;
        return (((((((((((((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.deviceId.hashCode()) * 31) + this.lastInstalledVersion.hashCode()) * 31) + this.deviceBrand.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.latitude.hashCode()) * 31) + this.longitude.hashCode()) * 31) + this.locality.hashCode();
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.password;
        String str3 = this.deviceId;
        String str4 = this.lastInstalledVersion;
        String str5 = this.deviceBrand;
        String str6 = this.deviceModel;
        String str7 = this.latitude;
        String str8 = this.longitude;
        String str9 = this.locality;
        StringBuilder sb = new StringBuilder("LoginV2Request(email=");
        sb.append(str);
        sb.append(", password=");
        sb.append(str2);
        sb.append(", deviceId=");
        sb.append(str3);
        sb.append(", lastInstalledVersion=");
        sb.append(str4);
        sb.append(", deviceBrand=");
        sb.append(str5);
        sb.append(", deviceModel=");
        sb.append(str6);
        sb.append(", latitude=");
        sb.append(str7);
        sb.append(", longitude=");
        sb.append(str8);
        sb.append(", locality=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }
}
