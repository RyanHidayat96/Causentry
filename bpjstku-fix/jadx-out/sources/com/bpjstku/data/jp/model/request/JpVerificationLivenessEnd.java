package com.bpjstku.data.jp.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b*\u0010\u0016R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0014\u001a\u0004\b,\u0010\u0016R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0014\u001a\u0004\b.\u0010\u0016R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0014\u001a\u0004\b0\u0010\u0016"}, d2 = {"Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessEnd;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "email", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "flData", "getFlData", "brand", "getBrand", "deviceId", "getDeviceId", "model", "getModel", "sdk", "getSdk", "manufacture", "getManufacture", "file", "getFile", "kodeKlaim", "getKodeKlaim", "nikPekerja", "getNikPekerja", "signature", "getSignature", "transactionIdSdk", "getTransactionIdSdk", "scoreLiveness", "getScoreLiveness", "scoreManipulation", "getScoreManipulation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JpVerificationLivenessEnd extends BaseRequest {
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

    @SerializedName("kodeKlaim")
    private final String kodeKlaim;

    @SerializedName("manufacture")
    private final String manufacture;

    @SerializedName("model")
    private final String model;

    @SerializedName("nikPekerja")
    private final String nikPekerja;

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

    public final String getKodeKlaim() {
        return this.kodeKlaim;
    }

    public final String getNikPekerja() {
        return this.nikPekerja;
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

    public JpVerificationLivenessEnd(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.email = str;
        this.flData = str2;
        this.brand = str3;
        this.deviceId = str4;
        this.model = str5;
        this.sdk = str6;
        this.manufacture = str7;
        this.file = str8;
        this.kodeKlaim = str9;
        this.nikPekerja = str10;
        this.signature = str11;
        this.transactionIdSdk = str12;
        this.scoreLiveness = str13;
        this.scoreManipulation = str14;
    }
}
