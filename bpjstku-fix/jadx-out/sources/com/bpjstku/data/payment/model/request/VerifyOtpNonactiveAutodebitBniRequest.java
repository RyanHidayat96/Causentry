package com.bpjstku.data.payment.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000bR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/payment/model/request/VerifyOtpNonactiveAutodebitBniRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/VerifyOtpNonactiveAutodebitBniRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodePlanRecurring", "Ljava/lang/String;", "getKodePlanRecurring", "keterangan", "getKeterangan", "petugasUbah", "getPetugasUbah", "otp", "getOtp", "chargeToken", "getChargeToken"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VerifyOtpNonactiveAutodebitBniRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("chargeToken")
    private final String chargeToken;

    @SerializedName("keterangan")
    private final String keterangan;

    @SerializedName("kodePlanRecurring")
    private final String kodePlanRecurring;

    @SerializedName("otp")
    private final String otp;

    @SerializedName("petugasUbah")
    private final String petugasUbah;

    public final String getKodePlanRecurring() {
        return this.kodePlanRecurring;
    }

    public final String getKeterangan() {
        return this.keterangan;
    }

    public final String getPetugasUbah() {
        return this.petugasUbah;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getChargeToken() {
        return this.chargeToken;
    }

    public VerifyOtpNonactiveAutodebitBniRequest(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.kodePlanRecurring = str;
        this.keterangan = str2;
        this.petugasUbah = str3;
        this.otp = str4;
        this.chargeToken = str5;
    }

    public static /* synthetic */ VerifyOtpNonactiveAutodebitBniRequest copy$default(VerifyOtpNonactiveAutodebitBniRequest verifyOtpNonactiveAutodebitBniRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyOtpNonactiveAutodebitBniRequest.kodePlanRecurring;
        }
        if ((i & 2) != 0) {
            str2 = verifyOtpNonactiveAutodebitBniRequest.keterangan;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = verifyOtpNonactiveAutodebitBniRequest.petugasUbah;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = verifyOtpNonactiveAutodebitBniRequest.otp;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = verifyOtpNonactiveAutodebitBniRequest.chargeToken;
        }
        return verifyOtpNonactiveAutodebitBniRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodePlanRecurring() {
        return this.kodePlanRecurring;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKeterangan() {
        return this.keterangan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPetugasUbah() {
        return this.petugasUbah;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChargeToken() {
        return this.chargeToken;
    }

    public final VerifyOtpNonactiveAutodebitBniRequest copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new VerifyOtpNonactiveAutodebitBniRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VerifyOtpNonactiveAutodebitBniRequest)) {
            return false;
        }
        VerifyOtpNonactiveAutodebitBniRequest verifyOtpNonactiveAutodebitBniRequest = (VerifyOtpNonactiveAutodebitBniRequest) p0;
        return Intrinsics.areEqual(this.kodePlanRecurring, verifyOtpNonactiveAutodebitBniRequest.kodePlanRecurring) && Intrinsics.areEqual(this.keterangan, verifyOtpNonactiveAutodebitBniRequest.keterangan) && Intrinsics.areEqual(this.petugasUbah, verifyOtpNonactiveAutodebitBniRequest.petugasUbah) && Intrinsics.areEqual(this.otp, verifyOtpNonactiveAutodebitBniRequest.otp) && Intrinsics.areEqual(this.chargeToken, verifyOtpNonactiveAutodebitBniRequest.chargeToken);
    }

    public final int hashCode() {
        return (((((((this.kodePlanRecurring.hashCode() * 31) + this.keterangan.hashCode()) * 31) + this.petugasUbah.hashCode()) * 31) + this.otp.hashCode()) * 31) + this.chargeToken.hashCode();
    }

    public final String toString() {
        String str = this.kodePlanRecurring;
        String str2 = this.keterangan;
        String str3 = this.petugasUbah;
        String str4 = this.otp;
        String str5 = this.chargeToken;
        StringBuilder sb = new StringBuilder("VerifyOtpNonactiveAutodebitBniRequest(kodePlanRecurring=");
        sb.append(str);
        sb.append(", keterangan=");
        sb.append(str2);
        sb.append(", petugasUbah=");
        sb.append(str3);
        sb.append(", otp=");
        sb.append(str4);
        sb.append(", chargeToken=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
