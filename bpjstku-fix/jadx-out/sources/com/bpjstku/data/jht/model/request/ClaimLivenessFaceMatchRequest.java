package com.bpjstku.data.jht.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0015JÄ\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010\u0003\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b-\u0010\u0015R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010\u0015R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u0010\u0015R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010\u0015R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u0010\u0015R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010\u0015R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b<\u0010\u0015R\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u0010\u0015R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\b@\u0010\u0015R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010/\u001a\u0004\bB\u0010\u0015R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u0010\u0015R\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010/\u001a\u0004\bF\u0010\u0015R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bH\u0010\u0015R\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bJ\u0010\u0015R\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010/\u001a\u0004\bL\u0010\u0015"}, d2 = {"Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/request/ClaimLivenessFaceMatchRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "flData", "getFlData", "brand", "getBrand", "deviceId", "getDeviceId", "model", "getModel", "sdk", "getSdk", "manufacture", "getManufacture", "file", "getFile", "signature", "getSignature", "transactionIdSdk", "getTransactionIdSdk", "scoreLiveness", "getScoreLiveness", "scoreManipulation", "getScoreManipulation", "longitude", "getLongitude", "latitude", "getLatitude", PlaceTypes.LOCALITY, "getLocality"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClaimLivenessFaceMatchRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("brand")
    private final String brand;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("email")
    private final String email;

    @SerializedName("file")
    private final String file;

    @SerializedName("flData")
    private final String flData;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName(PlaceTypes.LOCALITY)
    private final String locality;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("manufacture")
    private final String manufacture;

    @SerializedName("model")
    private final String model;

    @SerializedName("scoreLiveness")
    private final String scoreLiveness;

    @SerializedName("scoreManipulation")
    private final String scoreManipulation;

    @SerializedName("sdk")
    private final String sdk;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("transactionIdSdk")
    private final String transactionIdSdk;

    public final String getEmail() {
        return this.email;
    }

    public final String getFlData() {
        return this.flData;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getManufacture() {
        return this.manufacture;
    }

    public final String getFile() {
        return this.file;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getTransactionIdSdk() {
        return this.transactionIdSdk;
    }

    public final String getScoreLiveness() {
        return this.scoreLiveness;
    }

    public final String getScoreManipulation() {
        return this.scoreManipulation;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLocality() {
        return this.locality;
    }

    public ClaimLivenessFaceMatchRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.email = str;
        this.flData = str2;
        this.brand = str3;
        this.deviceId = str4;
        this.model = str5;
        this.sdk = str6;
        this.manufacture = str7;
        this.file = str8;
        this.signature = str9;
        this.transactionIdSdk = str10;
        this.scoreLiveness = str11;
        this.scoreManipulation = str12;
        this.longitude = str13;
        this.latitude = str14;
        this.locality = str15;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTransactionIdSdk() {
        return this.transactionIdSdk;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getScoreLiveness() {
        return this.scoreLiveness;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getScoreManipulation() {
        return this.scoreManipulation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFlData() {
        return this.flData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSdk() {
        return this.sdk;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getManufacture() {
        return this.manufacture;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final ClaimLivenessFaceMatchRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14) {
        return new ClaimLivenessFaceMatchRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ClaimLivenessFaceMatchRequest)) {
            return false;
        }
        ClaimLivenessFaceMatchRequest claimLivenessFaceMatchRequest = (ClaimLivenessFaceMatchRequest) p0;
        return Intrinsics.areEqual(this.email, claimLivenessFaceMatchRequest.email) && Intrinsics.areEqual(this.flData, claimLivenessFaceMatchRequest.flData) && Intrinsics.areEqual(this.brand, claimLivenessFaceMatchRequest.brand) && Intrinsics.areEqual(this.deviceId, claimLivenessFaceMatchRequest.deviceId) && Intrinsics.areEqual(this.model, claimLivenessFaceMatchRequest.model) && Intrinsics.areEqual(this.sdk, claimLivenessFaceMatchRequest.sdk) && Intrinsics.areEqual(this.manufacture, claimLivenessFaceMatchRequest.manufacture) && Intrinsics.areEqual(this.file, claimLivenessFaceMatchRequest.file) && Intrinsics.areEqual(this.signature, claimLivenessFaceMatchRequest.signature) && Intrinsics.areEqual(this.transactionIdSdk, claimLivenessFaceMatchRequest.transactionIdSdk) && Intrinsics.areEqual(this.scoreLiveness, claimLivenessFaceMatchRequest.scoreLiveness) && Intrinsics.areEqual(this.scoreManipulation, claimLivenessFaceMatchRequest.scoreManipulation) && Intrinsics.areEqual(this.longitude, claimLivenessFaceMatchRequest.longitude) && Intrinsics.areEqual(this.latitude, claimLivenessFaceMatchRequest.latitude) && Intrinsics.areEqual(this.locality, claimLivenessFaceMatchRequest.locality);
    }

    public final int hashCode() {
        String str = this.email;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.flData;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.brand;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.deviceId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.model;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.sdk;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.manufacture;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.file;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.signature;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.transactionIdSdk;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.scoreLiveness;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.scoreManipulation;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.longitude;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.latitude;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.locality;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str15 != null ? str15.hashCode() : 0);
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.flData;
        String str3 = this.brand;
        String str4 = this.deviceId;
        String str5 = this.model;
        String str6 = this.sdk;
        String str7 = this.manufacture;
        String str8 = this.file;
        String str9 = this.signature;
        String str10 = this.transactionIdSdk;
        String str11 = this.scoreLiveness;
        String str12 = this.scoreManipulation;
        String str13 = this.longitude;
        String str14 = this.latitude;
        String str15 = this.locality;
        StringBuilder sb = new StringBuilder("ClaimLivenessFaceMatchRequest(email=");
        sb.append(str);
        sb.append(", flData=");
        sb.append(str2);
        sb.append(", brand=");
        sb.append(str3);
        sb.append(", deviceId=");
        sb.append(str4);
        sb.append(", model=");
        sb.append(str5);
        sb.append(", sdk=");
        sb.append(str6);
        sb.append(", manufacture=");
        sb.append(str7);
        sb.append(", file=");
        sb.append(str8);
        sb.append(", signature=");
        sb.append(str9);
        sb.append(", transactionIdSdk=");
        sb.append(str10);
        sb.append(", scoreLiveness=");
        sb.append(str11);
        sb.append(", scoreManipulation=");
        sb.append(str12);
        sb.append(", longitude=");
        sb.append(str13);
        sb.append(", latitude=");
        sb.append(str14);
        sb.append(", locality=");
        sb.append(str15);
        sb.append(")");
        return sb.toString();
    }
}
