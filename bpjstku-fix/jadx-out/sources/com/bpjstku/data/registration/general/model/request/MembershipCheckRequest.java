package com.bpjstku.data.registration.general.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJn\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000eR\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u000eR\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u000eR\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010\u000eR\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u000eR\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010\u000e"}, d2 = {"Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "deviceId", "Ljava/lang/String;", "getDeviceId", "kewarganegaraan", "getKewarganegaraan", "kodeSegmen", "getKodeSegmen", "kpj", "getKpj", "nama", "getNama", "nik", "getNik", "passpor", "getPasspor", "tglLahir", "getTglLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MembershipCheckRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("kewarganegaraan")
    private final String kewarganegaraan;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("nama")
    private final String nama;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("passpor")
    private final String passpor;

    @SerializedName("tglLahir")
    private final String tglLahir;

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getKewarganegaraan() {
        return this.kewarganegaraan;
    }

    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getNama() {
        return this.nama;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getPasspor() {
        return this.passpor;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public MembershipCheckRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deviceId = str;
        this.kewarganegaraan = str2;
        this.kodeSegmen = str3;
        this.kpj = str4;
        this.nama = str5;
        this.nik = str6;
        this.passpor = str7;
        this.tglLahir = str8;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKewarganegaraan() {
        return this.kewarganegaraan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNama() {
        return this.nama;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPasspor() {
        return this.passpor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    public final MembershipCheckRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new MembershipCheckRequest(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MembershipCheckRequest)) {
            return false;
        }
        MembershipCheckRequest membershipCheckRequest = (MembershipCheckRequest) p0;
        return Intrinsics.areEqual(this.deviceId, membershipCheckRequest.deviceId) && Intrinsics.areEqual(this.kewarganegaraan, membershipCheckRequest.kewarganegaraan) && Intrinsics.areEqual(this.kodeSegmen, membershipCheckRequest.kodeSegmen) && Intrinsics.areEqual(this.kpj, membershipCheckRequest.kpj) && Intrinsics.areEqual(this.nama, membershipCheckRequest.nama) && Intrinsics.areEqual(this.nik, membershipCheckRequest.nik) && Intrinsics.areEqual(this.passpor, membershipCheckRequest.passpor) && Intrinsics.areEqual(this.tglLahir, membershipCheckRequest.tglLahir);
    }

    public final int hashCode() {
        int iHashCode = this.deviceId.hashCode();
        String str = this.kewarganegaraan;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.kodeSegmen;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.kpj;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.nama;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.nik;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.passpor;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tglLahir;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.deviceId;
        String str2 = this.kewarganegaraan;
        String str3 = this.kodeSegmen;
        String str4 = this.kpj;
        String str5 = this.nama;
        String str6 = this.nik;
        String str7 = this.passpor;
        String str8 = this.tglLahir;
        StringBuilder sb = new StringBuilder("MembershipCheckRequest(deviceId=");
        sb.append(str);
        sb.append(", kewarganegaraan=");
        sb.append(str2);
        sb.append(", kodeSegmen=");
        sb.append(str3);
        sb.append(", kpj=");
        sb.append(str4);
        sb.append(", nama=");
        sb.append(str5);
        sb.append(", nik=");
        sb.append(str6);
        sb.append(", passpor=");
        sb.append(str7);
        sb.append(", tglLahir=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }
}
