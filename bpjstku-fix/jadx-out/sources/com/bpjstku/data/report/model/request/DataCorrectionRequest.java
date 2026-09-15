package com.bpjstku.data.report.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J\u0088\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b(\u0010\u0013R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0013R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0013R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u0013R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u0013R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010\u0013R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010\u0013R\u001a\u00108\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001bR\u001a\u0010;\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010\u001bR\u001a\u0010=\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010\u001bR\u001a\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010*\u001a\u0004\b@\u0010\u0013R\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\bB\u0010\u0013"}, d2 = {"Lcom/bpjstku/data/report/model/request/DataCorrectionRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "p8", "p9", "p10", "p11", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/report/model/request/DataCorrectionRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "actualTkkAmount", "getActualTkkAmount", "savedTkkAmount", "getSavedTkkAmount", "kpj", "getKpj", "msisdn", "getMsisdn", "fullName", "getFullName", "nik", "getNik", "TkAmountStatus", "Z", "getTkAmountStatus", "membershipStatus", "getMembershipStatus", "wageStatus", "getWageStatus", "actualWage", "getActualWage", "savedWage", "getSavedWage"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataCorrectionRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("statusJumlahTk")
    private final boolean TkAmountStatus;

    @SerializedName("jumlahTkAktual")
    private final String actualTkkAmount;

    @SerializedName("upahAktual")
    private final String actualWage;

    @SerializedName("email")
    private final String email;

    @SerializedName("namaLengkap")
    private final String fullName;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("statusKepesertaan")
    private final boolean membershipStatus;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("jumlahTkTercatat")
    private final String savedTkkAmount;

    @SerializedName("upahTercatat")
    private final String savedWage;

    @SerializedName("statusUpah")
    private final boolean wageStatus;

    public final String getEmail() {
        return this.email;
    }

    public final String getActualTkkAmount() {
        return this.actualTkkAmount;
    }

    public final String getSavedTkkAmount() {
        return this.savedTkkAmount;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getMsisdn() {
        return this.msisdn;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getNik() {
        return this.nik;
    }

    public final boolean getTkAmountStatus() {
        return this.TkAmountStatus;
    }

    public final boolean getMembershipStatus() {
        return this.membershipStatus;
    }

    public final boolean getWageStatus() {
        return this.wageStatus;
    }

    public final String getActualWage() {
        return this.actualWage;
    }

    public final String getSavedWage() {
        return this.savedWage;
    }

    public DataCorrectionRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.email = str;
        this.actualTkkAmount = str2;
        this.savedTkkAmount = str3;
        this.kpj = str4;
        this.msisdn = str5;
        this.fullName = str6;
        this.nik = str7;
        this.TkAmountStatus = z;
        this.membershipStatus = z2;
        this.wageStatus = z3;
        this.actualWage = str8;
        this.savedWage = str9;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getWageStatus() {
        return this.wageStatus;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getActualWage() {
        return this.actualWage;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSavedWage() {
        return this.savedWage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActualTkkAmount() {
        return this.actualTkkAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSavedTkkAmount() {
        return this.savedTkkAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMsisdn() {
        return this.msisdn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getTkAmountStatus() {
        return this.TkAmountStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getMembershipStatus() {
        return this.membershipStatus;
    }

    public final DataCorrectionRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, boolean p7, boolean p8, boolean p9, String p10, String p11) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        return new DataCorrectionRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DataCorrectionRequest)) {
            return false;
        }
        DataCorrectionRequest dataCorrectionRequest = (DataCorrectionRequest) p0;
        return Intrinsics.areEqual(this.email, dataCorrectionRequest.email) && Intrinsics.areEqual(this.actualTkkAmount, dataCorrectionRequest.actualTkkAmount) && Intrinsics.areEqual(this.savedTkkAmount, dataCorrectionRequest.savedTkkAmount) && Intrinsics.areEqual(this.kpj, dataCorrectionRequest.kpj) && Intrinsics.areEqual(this.msisdn, dataCorrectionRequest.msisdn) && Intrinsics.areEqual(this.fullName, dataCorrectionRequest.fullName) && Intrinsics.areEqual(this.nik, dataCorrectionRequest.nik) && this.TkAmountStatus == dataCorrectionRequest.TkAmountStatus && this.membershipStatus == dataCorrectionRequest.membershipStatus && this.wageStatus == dataCorrectionRequest.wageStatus && Intrinsics.areEqual(this.actualWage, dataCorrectionRequest.actualWage) && Intrinsics.areEqual(this.savedWage, dataCorrectionRequest.savedWage);
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.email.hashCode() * 31) + this.actualTkkAmount.hashCode()) * 31) + this.savedTkkAmount.hashCode()) * 31) + this.kpj.hashCode()) * 31) + this.msisdn.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.nik.hashCode()) * 31) + Boolean.hashCode(this.TkAmountStatus)) * 31) + Boolean.hashCode(this.membershipStatus)) * 31) + Boolean.hashCode(this.wageStatus)) * 31) + this.actualWage.hashCode()) * 31) + this.savedWage.hashCode();
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.actualTkkAmount;
        String str3 = this.savedTkkAmount;
        String str4 = this.kpj;
        String str5 = this.msisdn;
        String str6 = this.fullName;
        String str7 = this.nik;
        boolean z = this.TkAmountStatus;
        boolean z2 = this.membershipStatus;
        boolean z3 = this.wageStatus;
        String str8 = this.actualWage;
        String str9 = this.savedWage;
        StringBuilder sb = new StringBuilder("DataCorrectionRequest(email=");
        sb.append(str);
        sb.append(", actualTkkAmount=");
        sb.append(str2);
        sb.append(", savedTkkAmount=");
        sb.append(str3);
        sb.append(", kpj=");
        sb.append(str4);
        sb.append(", msisdn=");
        sb.append(str5);
        sb.append(", fullName=");
        sb.append(str6);
        sb.append(", nik=");
        sb.append(str7);
        sb.append(", TkAmountStatus=");
        sb.append(z);
        sb.append(", membershipStatus=");
        sb.append(z2);
        sb.append(", wageStatus=");
        sb.append(z3);
        sb.append(", actualWage=");
        sb.append(str8);
        sb.append(", savedWage=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }
}
