package com.bpjstku.data.registration.bpu.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/bpu/model/request/CheckResidenceInfoRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "namaLengkap", "Ljava/lang/String;", "getNamaLengkap", "nik", "getNik", "tanggalLahir", "getTanggalLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckResidenceInfoRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("tanggalLahir")
    private final String tanggalLahir;

    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getTanggalLahir() {
        return this.tanggalLahir;
    }

    public CheckResidenceInfoRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.namaLengkap = str;
        this.nik = str2;
        this.tanggalLahir = str3;
    }

    public static /* synthetic */ CheckResidenceInfoRequest copy$default(CheckResidenceInfoRequest checkResidenceInfoRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkResidenceInfoRequest.namaLengkap;
        }
        if ((i & 2) != 0) {
            str2 = checkResidenceInfoRequest.nik;
        }
        if ((i & 4) != 0) {
            str3 = checkResidenceInfoRequest.tanggalLahir;
        }
        return checkResidenceInfoRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTanggalLahir() {
        return this.tanggalLahir;
    }

    public final CheckResidenceInfoRequest copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new CheckResidenceInfoRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckResidenceInfoRequest)) {
            return false;
        }
        CheckResidenceInfoRequest checkResidenceInfoRequest = (CheckResidenceInfoRequest) p0;
        return Intrinsics.areEqual(this.namaLengkap, checkResidenceInfoRequest.namaLengkap) && Intrinsics.areEqual(this.nik, checkResidenceInfoRequest.nik) && Intrinsics.areEqual(this.tanggalLahir, checkResidenceInfoRequest.tanggalLahir);
    }

    public final int hashCode() {
        return (((this.namaLengkap.hashCode() * 31) + this.nik.hashCode()) * 31) + this.tanggalLahir.hashCode();
    }

    public final String toString() {
        String str = this.namaLengkap;
        String str2 = this.nik;
        String str3 = this.tanggalLahir;
        StringBuilder sb = new StringBuilder("CheckResidenceInfoRequest(namaLengkap=");
        sb.append(str);
        sb.append(", nik=");
        sb.append(str2);
        sb.append(", tanggalLahir=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
