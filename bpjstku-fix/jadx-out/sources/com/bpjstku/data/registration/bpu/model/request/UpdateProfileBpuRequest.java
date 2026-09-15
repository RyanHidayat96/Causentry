package com.bpjstku.data.registration.bpu.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000bR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/registration/bpu/model/request/UpdateProfileBpuRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/bpu/model/request/UpdateProfileBpuRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "namaLengkap", "Ljava/lang/String;", "getNamaLengkap", "nik", "getNik", "tanggalLahir", "getTanggalLahir", "upah", "getUpah", "kodePaket", "getKodePaket"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UpdateProfileBpuRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("kodePaket")
    private final String kodePaket;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("tanggalLahir")
    private final String tanggalLahir;

    @SerializedName("upah")
    private final String upah;

    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getTanggalLahir() {
        return this.tanggalLahir;
    }

    public final String getUpah() {
        return this.upah;
    }

    public final String getKodePaket() {
        return this.kodePaket;
    }

    public UpdateProfileBpuRequest(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.namaLengkap = str;
        this.nik = str2;
        this.tanggalLahir = str3;
        this.upah = str4;
        this.kodePaket = str5;
    }

    public static /* synthetic */ UpdateProfileBpuRequest copy$default(UpdateProfileBpuRequest updateProfileBpuRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateProfileBpuRequest.namaLengkap;
        }
        if ((i & 2) != 0) {
            str2 = updateProfileBpuRequest.nik;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = updateProfileBpuRequest.tanggalLahir;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = updateProfileBpuRequest.upah;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = updateProfileBpuRequest.kodePaket;
        }
        return updateProfileBpuRequest.copy(str, str6, str7, str8, str5);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUpah() {
        return this.upah;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKodePaket() {
        return this.kodePaket;
    }

    public final UpdateProfileBpuRequest copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new UpdateProfileBpuRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UpdateProfileBpuRequest)) {
            return false;
        }
        UpdateProfileBpuRequest updateProfileBpuRequest = (UpdateProfileBpuRequest) p0;
        return Intrinsics.areEqual(this.namaLengkap, updateProfileBpuRequest.namaLengkap) && Intrinsics.areEqual(this.nik, updateProfileBpuRequest.nik) && Intrinsics.areEqual(this.tanggalLahir, updateProfileBpuRequest.tanggalLahir) && Intrinsics.areEqual(this.upah, updateProfileBpuRequest.upah) && Intrinsics.areEqual(this.kodePaket, updateProfileBpuRequest.kodePaket);
    }

    public final int hashCode() {
        return (((((((this.namaLengkap.hashCode() * 31) + this.nik.hashCode()) * 31) + this.tanggalLahir.hashCode()) * 31) + this.upah.hashCode()) * 31) + this.kodePaket.hashCode();
    }

    public final String toString() {
        String str = this.namaLengkap;
        String str2 = this.nik;
        String str3 = this.tanggalLahir;
        String str4 = this.upah;
        String str5 = this.kodePaket;
        StringBuilder sb = new StringBuilder("UpdateProfileBpuRequest(namaLengkap=");
        sb.append(str);
        sb.append(", nik=");
        sb.append(str2);
        sb.append(", tanggalLahir=");
        sb.append(str3);
        sb.append(", upah=");
        sb.append(str4);
        sb.append(", kodePaket=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
