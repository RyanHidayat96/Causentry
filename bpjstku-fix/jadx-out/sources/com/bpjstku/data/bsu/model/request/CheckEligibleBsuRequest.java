package com.bpjstku.data.bsu.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\fR\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\fR\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\f"}, d2 = {"Lcom/bpjstku/data/bsu/model/request/CheckEligibleBsuRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/bsu/model/request/CheckEligibleBsuRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nomorIdentitas", "Ljava/lang/String;", "getNomorIdentitas", "tglLahir", "getTglLahir", "namaPekerja", "getNamaPekerja", "handphone", "getHandphone", "namaIbu", "getNamaIbu", "email", "getEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckEligibleBsuRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("handphone")
    private final String handphone;

    @SerializedName("namaIbu")
    private final String namaIbu;

    @SerializedName("namaPekerja")
    private final String namaPekerja;

    @SerializedName("nomorIdentitas")
    private final String nomorIdentitas;

    @SerializedName("tglLahir")
    private final String tglLahir;

    public final String getNomorIdentitas() {
        return this.nomorIdentitas;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public final String getNamaPekerja() {
        return this.namaPekerja;
    }

    public final String getHandphone() {
        return this.handphone;
    }

    public final String getNamaIbu() {
        return this.namaIbu;
    }

    public final String getEmail() {
        return this.email;
    }

    public CheckEligibleBsuRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.nomorIdentitas = str;
        this.tglLahir = str2;
        this.namaPekerja = str3;
        this.handphone = str4;
        this.namaIbu = str5;
        this.email = str6;
    }

    public static /* synthetic */ CheckEligibleBsuRequest copy$default(CheckEligibleBsuRequest checkEligibleBsuRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkEligibleBsuRequest.nomorIdentitas;
        }
        if ((i & 2) != 0) {
            str2 = checkEligibleBsuRequest.tglLahir;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = checkEligibleBsuRequest.namaPekerja;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = checkEligibleBsuRequest.handphone;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = checkEligibleBsuRequest.namaIbu;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = checkEligibleBsuRequest.email;
        }
        return checkEligibleBsuRequest.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNomorIdentitas() {
        return this.nomorIdentitas;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNamaPekerja() {
        return this.namaPekerja;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHandphone() {
        return this.handphone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNamaIbu() {
        return this.namaIbu;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final CheckEligibleBsuRequest copy(String p0, String p1, String p2, String p3, String p4, String p5) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        return new CheckEligibleBsuRequest(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckEligibleBsuRequest)) {
            return false;
        }
        CheckEligibleBsuRequest checkEligibleBsuRequest = (CheckEligibleBsuRequest) p0;
        return Intrinsics.areEqual(this.nomorIdentitas, checkEligibleBsuRequest.nomorIdentitas) && Intrinsics.areEqual(this.tglLahir, checkEligibleBsuRequest.tglLahir) && Intrinsics.areEqual(this.namaPekerja, checkEligibleBsuRequest.namaPekerja) && Intrinsics.areEqual(this.handphone, checkEligibleBsuRequest.handphone) && Intrinsics.areEqual(this.namaIbu, checkEligibleBsuRequest.namaIbu) && Intrinsics.areEqual(this.email, checkEligibleBsuRequest.email);
    }

    public final int hashCode() {
        return (((((((((this.nomorIdentitas.hashCode() * 31) + this.tglLahir.hashCode()) * 31) + this.namaPekerja.hashCode()) * 31) + this.handphone.hashCode()) * 31) + this.namaIbu.hashCode()) * 31) + this.email.hashCode();
    }

    public final String toString() {
        String str = this.nomorIdentitas;
        String str2 = this.tglLahir;
        String str3 = this.namaPekerja;
        String str4 = this.handphone;
        String str5 = this.namaIbu;
        String str6 = this.email;
        StringBuilder sb = new StringBuilder("CheckEligibleBsuRequest(nomorIdentitas=");
        sb.append(str);
        sb.append(", tglLahir=");
        sb.append(str2);
        sb.append(", namaPekerja=");
        sb.append(str3);
        sb.append(", handphone=");
        sb.append(str4);
        sb.append(", namaIbu=");
        sb.append(str5);
        sb.append(", email=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
