package com.bpjstku.data.setting.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/bpjstku/data/setting/model/request/VerificationOtpRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/setting/model/request/VerificationOtpRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "verificationId", "getVerificationId", "otp", "getOtp", "checkSum", "getCheckSum"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VerificationOtpRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("email")
    private final String email;

    @SerializedName("Otp")
    private final String otp;

    @SerializedName("verificationId")
    private final String verificationId;

    public final String getEmail() {
        return this.email;
    }

    public final String getVerificationId() {
        return this.verificationId;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public VerificationOtpRequest(String str, String str2, String str3, String str4) {
        this.email = str;
        this.verificationId = str2;
        this.otp = str3;
        this.checkSum = str4;
    }

    public static /* synthetic */ VerificationOtpRequest copy$default(VerificationOtpRequest verificationOtpRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verificationOtpRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = verificationOtpRequest.verificationId;
        }
        if ((i & 4) != 0) {
            str3 = verificationOtpRequest.otp;
        }
        if ((i & 8) != 0) {
            str4 = verificationOtpRequest.checkSum;
        }
        return verificationOtpRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVerificationId() {
        return this.verificationId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    public final VerificationOtpRequest copy(String p0, String p1, String p2, String p3) {
        return new VerificationOtpRequest(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VerificationOtpRequest)) {
            return false;
        }
        VerificationOtpRequest verificationOtpRequest = (VerificationOtpRequest) p0;
        return Intrinsics.areEqual(this.email, verificationOtpRequest.email) && Intrinsics.areEqual(this.verificationId, verificationOtpRequest.verificationId) && Intrinsics.areEqual(this.otp, verificationOtpRequest.otp) && Intrinsics.areEqual(this.checkSum, verificationOtpRequest.checkSum);
    }

    public final int hashCode() {
        String str = this.email;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.verificationId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.otp;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.checkSum;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.verificationId;
        String str3 = this.otp;
        String str4 = this.checkSum;
        StringBuilder sb = new StringBuilder("VerificationOtpRequest(email=");
        sb.append(str);
        sb.append(", verificationId=");
        sb.append(str2);
        sb.append(", otp=");
        sb.append(str3);
        sb.append(", checkSum=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
