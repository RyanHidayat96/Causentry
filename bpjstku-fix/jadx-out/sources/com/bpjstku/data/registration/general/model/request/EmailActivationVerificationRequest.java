package com.bpjstku.data.registration.general.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ<\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "deviceId", "Ljava/lang/String;", "getDeviceId", "email", "getEmail", "checkSum", "getCheckSum", "identityNumber", "getIdentityNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EmailActivationVerificationRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("email")
    private final String email;

    @SerializedName("identityNumber")
    private final String identityNumber;

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    public EmailActivationVerificationRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.deviceId = str;
        this.email = str2;
        this.checkSum = str3;
        this.identityNumber = str4;
    }

    public static /* synthetic */ EmailActivationVerificationRequest copy$default(EmailActivationVerificationRequest emailActivationVerificationRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailActivationVerificationRequest.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = emailActivationVerificationRequest.email;
        }
        if ((i & 4) != 0) {
            str3 = emailActivationVerificationRequest.checkSum;
        }
        if ((i & 8) != 0) {
            str4 = emailActivationVerificationRequest.identityNumber;
        }
        return emailActivationVerificationRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    public final EmailActivationVerificationRequest copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new EmailActivationVerificationRequest(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EmailActivationVerificationRequest)) {
            return false;
        }
        EmailActivationVerificationRequest emailActivationVerificationRequest = (EmailActivationVerificationRequest) p0;
        return Intrinsics.areEqual(this.deviceId, emailActivationVerificationRequest.deviceId) && Intrinsics.areEqual(this.email, emailActivationVerificationRequest.email) && Intrinsics.areEqual(this.checkSum, emailActivationVerificationRequest.checkSum) && Intrinsics.areEqual(this.identityNumber, emailActivationVerificationRequest.identityNumber);
    }

    public final int hashCode() {
        int iHashCode = this.deviceId.hashCode();
        int iHashCode2 = this.email.hashCode();
        String str = this.checkSum;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.identityNumber;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.deviceId;
        String str2 = this.email;
        String str3 = this.checkSum;
        String str4 = this.identityNumber;
        StringBuilder sb = new StringBuilder("EmailActivationVerificationRequest(deviceId=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", checkSum=");
        sb.append(str3);
        sb.append(", identityNumber=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
