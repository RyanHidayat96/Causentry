package com.bpjstku.data.asik.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.createCameraSelectorById;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013Jp\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b%\u0010\u0013R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0013R\u001c\u0010)\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0015R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010\u0013R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010\u0013R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010\u0013R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010\u0013R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010\u0013R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u0010\u0013"}, d2 = {"Lcom/bpjstku/data/asik/model/request/AsikVerificationEkyc;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "Ljava/io/File;", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/io/File;", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/request/AsikVerificationEkyc;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nik", "Ljava/lang/String;", "getNik", "file", "Ljava/io/File;", "getFile", "transactionId", "getTransactionId", "brand", "getBrand", "deviceId", "getDeviceId", "model", "getModel", "sdk", "getSdk", "manufacture", "getManufacture"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AsikVerificationEkyc extends BaseRequest {
    public static final int $stable = 8;

    @SerializedName("brand")
    private final String brand;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("file")
    private final File file;

    @SerializedName("manufacture")
    private final String manufacture;

    @SerializedName("model")
    private final String model;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("sdk")
    private final String sdk;

    @SerializedName("transactionId")
    private final String transactionId;

    public final String getNik() {
        return this.nik;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getTransactionId() {
        return this.transactionId;
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

    public AsikVerificationEkyc(String str, File file, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.nik = str;
        this.file = file;
        this.transactionId = str2;
        this.brand = str3;
        this.deviceId = str4;
        this.model = str5;
        this.sdk = str6;
        this.manufacture = str7;
    }

    public final Map<String, RequestBody> getPartMap() {
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.size()));
        Iterator<T> it = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullParameter(value, "");
            linkedHashMap.put(key, RequestBody.INSTANCE.create((String) value, MediaType.INSTANCE.parse("text/plain")));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSdk() {
        return this.sdk;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getManufacture() {
        return this.manufacture;
    }

    public final AsikVerificationEkyc copy(String p0, File p1, String p2, String p3, String p4, String p5, String p6, String p7) {
        return new AsikVerificationEkyc(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AsikVerificationEkyc)) {
            return false;
        }
        AsikVerificationEkyc asikVerificationEkyc = (AsikVerificationEkyc) p0;
        return Intrinsics.areEqual(this.nik, asikVerificationEkyc.nik) && Intrinsics.areEqual(this.file, asikVerificationEkyc.file) && Intrinsics.areEqual(this.transactionId, asikVerificationEkyc.transactionId) && Intrinsics.areEqual(this.brand, asikVerificationEkyc.brand) && Intrinsics.areEqual(this.deviceId, asikVerificationEkyc.deviceId) && Intrinsics.areEqual(this.model, asikVerificationEkyc.model) && Intrinsics.areEqual(this.sdk, asikVerificationEkyc.sdk) && Intrinsics.areEqual(this.manufacture, asikVerificationEkyc.manufacture);
    }

    public final int hashCode() {
        String str = this.nik;
        int iHashCode = str == null ? 0 : str.hashCode();
        File file = this.file;
        int iHashCode2 = file == null ? 0 : file.hashCode();
        String str2 = this.transactionId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.brand;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.deviceId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.model;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.sdk;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.manufacture;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.nik;
        File file = this.file;
        String str2 = this.transactionId;
        String str3 = this.brand;
        String str4 = this.deviceId;
        String str5 = this.model;
        String str6 = this.sdk;
        String str7 = this.manufacture;
        StringBuilder sb = new StringBuilder("AsikVerificationEkyc(nik=");
        sb.append(str);
        sb.append(", file=");
        sb.append(file);
        sb.append(", transactionId=");
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
        sb.append(")");
        return sb.toString();
    }
}
