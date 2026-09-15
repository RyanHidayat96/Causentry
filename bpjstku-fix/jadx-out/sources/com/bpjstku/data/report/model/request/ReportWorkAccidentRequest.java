package com.bpjstku.data.report.model.request;

import androidx.autofill.HintConstants;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u000bHÇ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJj\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b'\u0010\u0014R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0014R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\u0014R\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010\u0014R\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\u0014R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\u0014R\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010\u0014R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u0010\u0014R\u001a\u00109\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001d"}, d2 = {"Lcom/bpjstku/data/report/model/request/ReportWorkAccidentRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "Ljava/io/File;", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/io/File;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lcom/bpjstku/data/report/model/request/ReportWorkAccidentRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "identityNumber", "Ljava/lang/String;", "getIdentityNumber", "fullName", "getFullName", "latitude", "getLatitude", "longitude", "getLongitude", "hour", "getHour", "healthcareCode", "getHealthcareCode", "accidentOutcomeCode", "getAccidentOutcomeCode", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber", "imageFile", "Ljava/io/File;", "getImageFile"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ReportWorkAccidentRequest extends BaseRequest {
    public static final int $stable = 8;

    @SerializedName("kodeAkibatDiderita")
    private final String accidentOutcomeCode;

    @SerializedName("namaLengkap")
    private final String fullName;

    @SerializedName("kodeFaskes")
    private final String healthcareCode;

    @SerializedName("jam")
    private final String hour;

    @SerializedName("nomorIdentitas")
    private final String identityNumber;
    private final transient File imageFile;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("noHp")
    private final String phoneNumber;

    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getHour() {
        return this.hour;
    }

    public final String getHealthcareCode() {
        return this.healthcareCode;
    }

    public final String getAccidentOutcomeCode() {
        return this.accidentOutcomeCode;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final File getImageFile() {
        return this.imageFile;
    }

    public ReportWorkAccidentRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, File file) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(file, "");
        this.identityNumber = str;
        this.fullName = str2;
        this.latitude = str3;
        this.longitude = str4;
        this.hour = str5;
        this.healthcareCode = str6;
        this.accidentOutcomeCode = str7;
        this.phoneNumber = str8;
        this.imageFile = file;
    }

    public final Map<String, RequestBody> getPartMap() {
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
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
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
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
    public final String getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHealthcareCode() {
        return this.healthcareCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAccidentOutcomeCode() {
        return this.accidentOutcomeCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final File getImageFile() {
        return this.imageFile;
    }

    public final ReportWorkAccidentRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, File p8) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        return new ReportWorkAccidentRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ReportWorkAccidentRequest)) {
            return false;
        }
        ReportWorkAccidentRequest reportWorkAccidentRequest = (ReportWorkAccidentRequest) p0;
        return Intrinsics.areEqual(this.identityNumber, reportWorkAccidentRequest.identityNumber) && Intrinsics.areEqual(this.fullName, reportWorkAccidentRequest.fullName) && Intrinsics.areEqual(this.latitude, reportWorkAccidentRequest.latitude) && Intrinsics.areEqual(this.longitude, reportWorkAccidentRequest.longitude) && Intrinsics.areEqual(this.hour, reportWorkAccidentRequest.hour) && Intrinsics.areEqual(this.healthcareCode, reportWorkAccidentRequest.healthcareCode) && Intrinsics.areEqual(this.accidentOutcomeCode, reportWorkAccidentRequest.accidentOutcomeCode) && Intrinsics.areEqual(this.phoneNumber, reportWorkAccidentRequest.phoneNumber) && Intrinsics.areEqual(this.imageFile, reportWorkAccidentRequest.imageFile);
    }

    public final int hashCode() {
        return (((((((((((((((this.identityNumber.hashCode() * 31) + this.fullName.hashCode()) * 31) + this.latitude.hashCode()) * 31) + this.longitude.hashCode()) * 31) + this.hour.hashCode()) * 31) + this.healthcareCode.hashCode()) * 31) + this.accidentOutcomeCode.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.imageFile.hashCode();
    }

    public final String toString() {
        String str = this.identityNumber;
        String str2 = this.fullName;
        String str3 = this.latitude;
        String str4 = this.longitude;
        String str5 = this.hour;
        String str6 = this.healthcareCode;
        String str7 = this.accidentOutcomeCode;
        String str8 = this.phoneNumber;
        File file = this.imageFile;
        StringBuilder sb = new StringBuilder("ReportWorkAccidentRequest(identityNumber=");
        sb.append(str);
        sb.append(", fullName=");
        sb.append(str2);
        sb.append(", latitude=");
        sb.append(str3);
        sb.append(", longitude=");
        sb.append(str4);
        sb.append(", hour=");
        sb.append(str5);
        sb.append(", healthcareCode=");
        sb.append(str6);
        sb.append(", accidentOutcomeCode=");
        sb.append(str7);
        sb.append(", phoneNumber=");
        sb.append(str8);
        sb.append(", imageFile=");
        sb.append(file);
        sb.append(")");
        return sb.toString();
    }
}
