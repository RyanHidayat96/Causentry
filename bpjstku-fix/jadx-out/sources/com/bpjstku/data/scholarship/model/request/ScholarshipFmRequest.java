package com.bpjstku.data.scholarship.model.request;

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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001bJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001bJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001bJÀ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010\u0003\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b5\u0010\u001bR\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001bR\u001a\u00109\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010\u001bR\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010\u001bR\u001a\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u0010\u001bR\u001a\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010\u001bR\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010\u001bR\u001a\u0010C\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bD\u0010\u001bR\u001a\u0010E\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bF\u0010\u001bR\u001c\u0010G\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010$R\u001c\u0010J\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010H\u001a\u0004\bK\u0010$R\u001c\u0010L\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010$R\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u00107\u001a\u0004\bO\u0010\u001bR\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00107\u001a\u0004\bQ\u0010\u001bR\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u00107\u001a\u0004\bS\u0010\u001bR\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u00107\u001a\u0004\bU\u0010\u001bR\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\bW\u0010\u001b"}, d2 = {"Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "Ljava/io/File;", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/io/File;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/request/ScholarshipFmRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "signature", "Ljava/lang/String;", "getSignature", "email", "getEmail", "brand", "getBrand", "deviceId", "getDeviceId", "model", "getModel", "manufacture", "getManufacture", "sdk", "getSdk", "flData", "getFlData", "file", "Ljava/io/File;", "getFile", "file2", "getFile2", "file3", "getFile3", "kodeKlaim", "getKodeKlaim", "nikPekerja", "getNikPekerja", "transactionIdSdk", "getTransactionIdSdk", "scoreLiveness", "getScoreLiveness", "scoreManipulation", "getScoreManipulation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipFmRequest extends BaseRequest {
    public static final int $stable = 8;

    @SerializedName("brand")
    private final String brand;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("email")
    private final String email;

    @SerializedName("file")
    private final File file;

    @SerializedName("file2")
    private final File file2;

    @SerializedName("file3")
    private final File file3;

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

    public final String getSignature() {
        return this.signature;
    }

    public final String getEmail() {
        return this.email;
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

    public final String getManufacture() {
        return this.manufacture;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getFlData() {
        return this.flData;
    }

    public final File getFile() {
        return this.file;
    }

    public final File getFile2() {
        return this.file2;
    }

    public final File getFile3() {
        return this.file3;
    }

    public final String getKodeKlaim() {
        return this.kodeKlaim;
    }

    public final String getNikPekerja() {
        return this.nikPekerja;
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

    public ScholarshipFmRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, File file, File file2, File file3, String str9, String str10, String str11, String str12, String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.signature = str;
        this.email = str2;
        this.brand = str3;
        this.deviceId = str4;
        this.model = str5;
        this.manufacture = str6;
        this.sdk = str7;
        this.flData = str8;
        this.file = file;
        this.file2 = file2;
        this.file3 = file3;
        this.kodeKlaim = str9;
        this.nikPekerja = str10;
        this.transactionIdSdk = str11;
        this.scoreLiveness = str12;
        this.scoreManipulation = str13;
    }

    public final Map<String, RequestBody> getPartMap() {
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file2");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("file3");
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
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final File getFile2() {
        return this.file2;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final File getFile3() {
        return this.file3;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getKodeKlaim() {
        return this.kodeKlaim;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNikPekerja() {
        return this.nikPekerja;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTransactionIdSdk() {
        return this.transactionIdSdk;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getScoreLiveness() {
        return this.scoreLiveness;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getScoreManipulation() {
        return this.scoreManipulation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
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
    public final String getManufacture() {
        return this.manufacture;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSdk() {
        return this.sdk;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFlData() {
        return this.flData;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    public final ScholarshipFmRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, File p8, File p9, File p10, String p11, String p12, String p13, String p14, String p15) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        return new ScholarshipFmRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipFmRequest)) {
            return false;
        }
        ScholarshipFmRequest scholarshipFmRequest = (ScholarshipFmRequest) p0;
        return Intrinsics.areEqual(this.signature, scholarshipFmRequest.signature) && Intrinsics.areEqual(this.email, scholarshipFmRequest.email) && Intrinsics.areEqual(this.brand, scholarshipFmRequest.brand) && Intrinsics.areEqual(this.deviceId, scholarshipFmRequest.deviceId) && Intrinsics.areEqual(this.model, scholarshipFmRequest.model) && Intrinsics.areEqual(this.manufacture, scholarshipFmRequest.manufacture) && Intrinsics.areEqual(this.sdk, scholarshipFmRequest.sdk) && Intrinsics.areEqual(this.flData, scholarshipFmRequest.flData) && Intrinsics.areEqual(this.file, scholarshipFmRequest.file) && Intrinsics.areEqual(this.file2, scholarshipFmRequest.file2) && Intrinsics.areEqual(this.file3, scholarshipFmRequest.file3) && Intrinsics.areEqual(this.kodeKlaim, scholarshipFmRequest.kodeKlaim) && Intrinsics.areEqual(this.nikPekerja, scholarshipFmRequest.nikPekerja) && Intrinsics.areEqual(this.transactionIdSdk, scholarshipFmRequest.transactionIdSdk) && Intrinsics.areEqual(this.scoreLiveness, scholarshipFmRequest.scoreLiveness) && Intrinsics.areEqual(this.scoreManipulation, scholarshipFmRequest.scoreManipulation);
    }

    public final int hashCode() {
        int iHashCode = this.signature.hashCode();
        int iHashCode2 = this.email.hashCode();
        int iHashCode3 = this.brand.hashCode();
        int iHashCode4 = this.deviceId.hashCode();
        int iHashCode5 = this.model.hashCode();
        int iHashCode6 = this.manufacture.hashCode();
        int iHashCode7 = this.sdk.hashCode();
        int iHashCode8 = this.flData.hashCode();
        File file = this.file;
        int iHashCode9 = file == null ? 0 : file.hashCode();
        File file2 = this.file2;
        int iHashCode10 = file2 == null ? 0 : file2.hashCode();
        File file3 = this.file3;
        int iHashCode11 = file3 == null ? 0 : file3.hashCode();
        String str = this.kodeKlaim;
        int iHashCode12 = str == null ? 0 : str.hashCode();
        String str2 = this.nikPekerja;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.transactionIdSdk;
        int iHashCode14 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.scoreLiveness;
        int iHashCode15 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.scoreManipulation;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.signature;
        String str2 = this.email;
        String str3 = this.brand;
        String str4 = this.deviceId;
        String str5 = this.model;
        String str6 = this.manufacture;
        String str7 = this.sdk;
        String str8 = this.flData;
        File file = this.file;
        File file2 = this.file2;
        File file3 = this.file3;
        String str9 = this.kodeKlaim;
        String str10 = this.nikPekerja;
        String str11 = this.transactionIdSdk;
        String str12 = this.scoreLiveness;
        String str13 = this.scoreManipulation;
        StringBuilder sb = new StringBuilder("ScholarshipFmRequest(signature=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", brand=");
        sb.append(str3);
        sb.append(", deviceId=");
        sb.append(str4);
        sb.append(", model=");
        sb.append(str5);
        sb.append(", manufacture=");
        sb.append(str6);
        sb.append(", sdk=");
        sb.append(str7);
        sb.append(", flData=");
        sb.append(str8);
        sb.append(", file=");
        sb.append(file);
        sb.append(", file2=");
        sb.append(file2);
        sb.append(", file3=");
        sb.append(file3);
        sb.append(", kodeKlaim=");
        sb.append(str9);
        sb.append(", nikPekerja=");
        sb.append(str10);
        sb.append(", transactionIdSdk=");
        sb.append(str11);
        sb.append(", scoreLiveness=");
        sb.append(str12);
        sb.append(", scoreManipulation=");
        sb.append(str13);
        sb.append(")");
        return sb.toString();
    }
}
