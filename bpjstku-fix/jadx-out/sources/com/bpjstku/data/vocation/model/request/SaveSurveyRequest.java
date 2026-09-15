package com.bpjstku.data.vocation.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJH\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u001c\u0010\u000fR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000fR\u001a\u0010'\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/vocation/model/request/SaveSurveyRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "Lcom/bpjstku/data/vocation/model/request/DataSurveyRequest;", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/vocation/model/request/SaveSurveyRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "dataSurvey", "Ljava/util/List;", "getDataSurvey", "email", "Ljava/lang/String;", "getEmail", "scheduleCode", "getScheduleCode", "trainingCode", "getTrainingCode", "registrationCode", "getRegistrationCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SaveSurveyRequest extends BaseRequest {
    public static final int $stable = 8;

    @SerializedName("dataSurvey")
    private final List<DataSurveyRequest> dataSurvey;

    @SerializedName("email")
    private final String email;

    @SerializedName("kodePendaftaran")
    private final String registrationCode;

    @SerializedName("kodeJadwal")
    private final String scheduleCode;

    @SerializedName("kodePelatihan")
    private final String trainingCode;

    public final List<DataSurveyRequest> getDataSurvey() {
        return this.dataSurvey;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getScheduleCode() {
        return this.scheduleCode;
    }

    public final String getTrainingCode() {
        return this.trainingCode;
    }

    public final String getRegistrationCode() {
        return this.registrationCode;
    }

    public SaveSurveyRequest(List<DataSurveyRequest> list, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.dataSurvey = list;
        this.email = str;
        this.scheduleCode = str2;
        this.trainingCode = str3;
        this.registrationCode = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SaveSurveyRequest copy$default(SaveSurveyRequest saveSurveyRequest, List list, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = saveSurveyRequest.dataSurvey;
        }
        if ((i & 2) != 0) {
            str = saveSurveyRequest.email;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = saveSurveyRequest.scheduleCode;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = saveSurveyRequest.trainingCode;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = saveSurveyRequest.registrationCode;
        }
        return saveSurveyRequest.copy(list, str5, str6, str7, str4);
    }

    public final List<DataSurveyRequest> component1() {
        return this.dataSurvey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScheduleCode() {
        return this.scheduleCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrainingCode() {
        return this.trainingCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRegistrationCode() {
        return this.registrationCode;
    }

    public final SaveSurveyRequest copy(List<DataSurveyRequest> p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new SaveSurveyRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SaveSurveyRequest)) {
            return false;
        }
        SaveSurveyRequest saveSurveyRequest = (SaveSurveyRequest) p0;
        return Intrinsics.areEqual(this.dataSurvey, saveSurveyRequest.dataSurvey) && Intrinsics.areEqual(this.email, saveSurveyRequest.email) && Intrinsics.areEqual(this.scheduleCode, saveSurveyRequest.scheduleCode) && Intrinsics.areEqual(this.trainingCode, saveSurveyRequest.trainingCode) && Intrinsics.areEqual(this.registrationCode, saveSurveyRequest.registrationCode);
    }

    public final int hashCode() {
        return (((((((this.dataSurvey.hashCode() * 31) + this.email.hashCode()) * 31) + this.scheduleCode.hashCode()) * 31) + this.trainingCode.hashCode()) * 31) + this.registrationCode.hashCode();
    }

    public final String toString() {
        List<DataSurveyRequest> list = this.dataSurvey;
        String str = this.email;
        String str2 = this.scheduleCode;
        String str3 = this.trainingCode;
        String str4 = this.registrationCode;
        StringBuilder sb = new StringBuilder("SaveSurveyRequest(dataSurvey=");
        sb.append(list);
        sb.append(", email=");
        sb.append(str);
        sb.append(", scheduleCode=");
        sb.append(str2);
        sb.append(", trainingCode=");
        sb.append(str3);
        sb.append(", registrationCode=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
