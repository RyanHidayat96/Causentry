package com.bpjstku.data.setting.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0011J~\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b%\u0010\u0011R\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0011R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u0011R\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010\u0011R\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010\u0011R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010\u0011R\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b6\u0010\u0011R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010'\u001a\u0004\b8\u0010\u0011R\u001a\u00109\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010\u0011R\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010'\u001a\u0004\b<\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/setting/model/request/AddKpjRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/setting/model/request/AddKpjRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "deviceId", "Ljava/lang/String;", "getDeviceId", "email", "getEmail", "kewarganegaraan", "getKewarganegaraan", "kodeSegmen", "getKodeSegmen", "kpj", "getKpj", "namaLengkap", "getNamaLengkap", "nik", "getNik", "noHp", "getNoHp", "passpor", "getPasspor", "registerId", "getRegisterId", "tglLahir", "getTglLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AddKpjRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("email")
    private final String email;

    @SerializedName("kewarganegaraan")
    private final String kewarganegaraan;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("noHp")
    private final String noHp;

    @SerializedName("passpor")
    private final String passpor;

    @SerializedName("registerId")
    private final String registerId;

    @SerializedName("tglLahir")
    private final String tglLahir;

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEmail() {
        return this.email;
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

    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getNoHp() {
        return this.noHp;
    }

    public final String getPasspor() {
        return this.passpor;
    }

    public final String getRegisterId() {
        return this.registerId;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public AddKpjRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.deviceId = str;
        this.email = str2;
        this.kewarganegaraan = str3;
        this.kodeSegmen = str4;
        this.kpj = str5;
        this.namaLengkap = str6;
        this.nik = str7;
        this.noHp = str8;
        this.passpor = str9;
        this.registerId = str10;
        this.tglLahir = str11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRegisterId() {
        return this.registerId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKewarganegaraan() {
        return this.kewarganegaraan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNoHp() {
        return this.noHp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPasspor() {
        return this.passpor;
    }

    public final AddKpjRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p10, "");
        return new AddKpjRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AddKpjRequest)) {
            return false;
        }
        AddKpjRequest addKpjRequest = (AddKpjRequest) p0;
        return Intrinsics.areEqual(this.deviceId, addKpjRequest.deviceId) && Intrinsics.areEqual(this.email, addKpjRequest.email) && Intrinsics.areEqual(this.kewarganegaraan, addKpjRequest.kewarganegaraan) && Intrinsics.areEqual(this.kodeSegmen, addKpjRequest.kodeSegmen) && Intrinsics.areEqual(this.kpj, addKpjRequest.kpj) && Intrinsics.areEqual(this.namaLengkap, addKpjRequest.namaLengkap) && Intrinsics.areEqual(this.nik, addKpjRequest.nik) && Intrinsics.areEqual(this.noHp, addKpjRequest.noHp) && Intrinsics.areEqual(this.passpor, addKpjRequest.passpor) && Intrinsics.areEqual(this.registerId, addKpjRequest.registerId) && Intrinsics.areEqual(this.tglLahir, addKpjRequest.tglLahir);
    }

    public final int hashCode() {
        return (((((((((((((((((((this.deviceId.hashCode() * 31) + this.email.hashCode()) * 31) + this.kewarganegaraan.hashCode()) * 31) + this.kodeSegmen.hashCode()) * 31) + this.kpj.hashCode()) * 31) + this.namaLengkap.hashCode()) * 31) + this.nik.hashCode()) * 31) + this.noHp.hashCode()) * 31) + this.passpor.hashCode()) * 31) + this.registerId.hashCode()) * 31) + this.tglLahir.hashCode();
    }

    public final String toString() {
        String str = this.deviceId;
        String str2 = this.email;
        String str3 = this.kewarganegaraan;
        String str4 = this.kodeSegmen;
        String str5 = this.kpj;
        String str6 = this.namaLengkap;
        String str7 = this.nik;
        String str8 = this.noHp;
        String str9 = this.passpor;
        String str10 = this.registerId;
        String str11 = this.tglLahir;
        StringBuilder sb = new StringBuilder("AddKpjRequest(deviceId=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", kewarganegaraan=");
        sb.append(str3);
        sb.append(", kodeSegmen=");
        sb.append(str4);
        sb.append(", kpj=");
        sb.append(str5);
        sb.append(", namaLengkap=");
        sb.append(str6);
        sb.append(", nik=");
        sb.append(str7);
        sb.append(", noHp=");
        sb.append(str8);
        sb.append(", passpor=");
        sb.append(str9);
        sb.append(", registerId=");
        sb.append(str10);
        sb.append(", tglLahir=");
        sb.append(str11);
        sb.append(")");
        return sb.toString();
    }
}
