package com.bpjstku.data.registration.general.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\rJb\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\rR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\rR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\rR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\rR\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\rR\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\rR\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\r"}, d2 = {"Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "identityNumber", "Ljava/lang/String;", "getIdentityNumber", "kpj", "getKpj", "name", "getName", "dateOfBirth", "getDateOfBirth", "identityType", "getIdentityType", "segmenCode", "getSegmenCode", "deviceId", "getDeviceId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ActivationRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("dateOfBirth")
    private final String dateOfBirth;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("identityNumber")
    private final String identityNumber;

    @SerializedName("identityType")
    private final String identityType;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("name")
    private final String name;

    @SerializedName("segmenCode")
    private final String segmenCode;

    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getIdentityType() {
        return this.identityType;
    }

    public final String getSegmenCode() {
        return this.segmenCode;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public ActivationRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str7, "");
        this.identityNumber = str;
        this.kpj = str2;
        this.name = str3;
        this.dateOfBirth = str4;
        this.identityType = str5;
        this.segmenCode = str6;
        this.deviceId = str7;
    }

    public static /* synthetic */ ActivationRequest copy$default(ActivationRequest activationRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activationRequest.identityNumber;
        }
        if ((i & 2) != 0) {
            str2 = activationRequest.kpj;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = activationRequest.name;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = activationRequest.dateOfBirth;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = activationRequest.identityType;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = activationRequest.segmenCode;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = activationRequest.deviceId;
        }
        return activationRequest.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIdentityType() {
        return this.identityType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSegmenCode() {
        return this.segmenCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final ActivationRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6) {
        Intrinsics.checkNotNullParameter(p6, "");
        return new ActivationRequest(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ActivationRequest)) {
            return false;
        }
        ActivationRequest activationRequest = (ActivationRequest) p0;
        return Intrinsics.areEqual(this.identityNumber, activationRequest.identityNumber) && Intrinsics.areEqual(this.kpj, activationRequest.kpj) && Intrinsics.areEqual(this.name, activationRequest.name) && Intrinsics.areEqual(this.dateOfBirth, activationRequest.dateOfBirth) && Intrinsics.areEqual(this.identityType, activationRequest.identityType) && Intrinsics.areEqual(this.segmenCode, activationRequest.segmenCode) && Intrinsics.areEqual(this.deviceId, activationRequest.deviceId);
    }

    public final int hashCode() {
        String str = this.identityNumber;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.kpj;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.dateOfBirth;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.identityType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.segmenCode;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.deviceId.hashCode();
    }

    public final String toString() {
        String str = this.identityNumber;
        String str2 = this.kpj;
        String str3 = this.name;
        String str4 = this.dateOfBirth;
        String str5 = this.identityType;
        String str6 = this.segmenCode;
        String str7 = this.deviceId;
        StringBuilder sb = new StringBuilder("ActivationRequest(identityNumber=");
        sb.append(str);
        sb.append(", kpj=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", dateOfBirth=");
        sb.append(str4);
        sb.append(", identityType=");
        sb.append(str5);
        sb.append(", segmenCode=");
        sb.append(str6);
        sb.append(", deviceId=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }
}
