package com.bpjstku.data.registration.general.model.request;

import androidx.autofill.HintConstants;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011J\u0094\u0001\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b%\u0010\u0011R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0011R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0011R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u0011R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010\u0011R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010\u0011R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010\u0011R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b6\u0010\u0011R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010'\u001a\u0004\b8\u0010\u0011R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010\u0011R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010'\u001a\u0004\b<\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/registration/general/model/request/UpdateActivationRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/request/UpdateActivationRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "identityNumber", "Ljava/lang/String;", "getIdentityNumber", "kpj", "getKpj", "name", "getName", "dateOfBirth", "getDateOfBirth", "email", "getEmail", "handphone", "getHandphone", HintConstants.AUTOFILL_HINT_PASSWORD, "getPassword", "checkSum", "getCheckSum", "identityType", "getIdentityType", "segmenCode", "getSegmenCode", "registerId", "getRegisterId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UpdateActivationRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("dateOfBirth")
    private final String dateOfBirth;

    @SerializedName("email")
    private final String email;

    @SerializedName("handphone")
    private final String handphone;

    @SerializedName("identityNumber")
    private final String identityNumber;

    @SerializedName("identityType")
    private final String identityType;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("name")
    private final String name;

    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    private final String password;

    @SerializedName("registerId")
    private final String registerId;

    @SerializedName("segmenCOde")
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

    public final String getEmail() {
        return this.email;
    }

    public final String getHandphone() {
        return this.handphone;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public final String getIdentityType() {
        return this.identityType;
    }

    public final String getSegmenCode() {
        return this.segmenCode;
    }

    public final String getRegisterId() {
        return this.registerId;
    }

    public UpdateActivationRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.identityNumber = str;
        this.kpj = str2;
        this.name = str3;
        this.dateOfBirth = str4;
        this.email = str5;
        this.handphone = str6;
        this.password = str7;
        this.checkSum = str8;
        this.identityType = str9;
        this.segmenCode = str10;
        this.registerId = str11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSegmenCode() {
        return this.segmenCode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRegisterId() {
        return this.registerId;
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
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHandphone() {
        return this.handphone;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIdentityType() {
        return this.identityType;
    }

    public final UpdateActivationRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10) {
        return new UpdateActivationRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UpdateActivationRequest)) {
            return false;
        }
        UpdateActivationRequest updateActivationRequest = (UpdateActivationRequest) p0;
        return Intrinsics.areEqual(this.identityNumber, updateActivationRequest.identityNumber) && Intrinsics.areEqual(this.kpj, updateActivationRequest.kpj) && Intrinsics.areEqual(this.name, updateActivationRequest.name) && Intrinsics.areEqual(this.dateOfBirth, updateActivationRequest.dateOfBirth) && Intrinsics.areEqual(this.email, updateActivationRequest.email) && Intrinsics.areEqual(this.handphone, updateActivationRequest.handphone) && Intrinsics.areEqual(this.password, updateActivationRequest.password) && Intrinsics.areEqual(this.checkSum, updateActivationRequest.checkSum) && Intrinsics.areEqual(this.identityType, updateActivationRequest.identityType) && Intrinsics.areEqual(this.segmenCode, updateActivationRequest.segmenCode) && Intrinsics.areEqual(this.registerId, updateActivationRequest.registerId);
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
        String str5 = this.email;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.handphone;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.password;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.checkSum;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.identityType;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.segmenCode;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.registerId;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        String str = this.identityNumber;
        String str2 = this.kpj;
        String str3 = this.name;
        String str4 = this.dateOfBirth;
        String str5 = this.email;
        String str6 = this.handphone;
        String str7 = this.password;
        String str8 = this.checkSum;
        String str9 = this.identityType;
        String str10 = this.segmenCode;
        String str11 = this.registerId;
        StringBuilder sb = new StringBuilder("UpdateActivationRequest(identityNumber=");
        sb.append(str);
        sb.append(", kpj=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", dateOfBirth=");
        sb.append(str4);
        sb.append(", email=");
        sb.append(str5);
        sb.append(", handphone=");
        sb.append(str6);
        sb.append(", password=");
        sb.append(str7);
        sb.append(", checkSum=");
        sb.append(str8);
        sb.append(", identityType=");
        sb.append(str9);
        sb.append(", segmenCode=");
        sb.append(str10);
        sb.append(", registerId=");
        sb.append(str11);
        sb.append(")");
        return sb.toString();
    }
}
