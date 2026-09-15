package com.bpjstku.data.devicebinding.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJD\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000bR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/devicebinding/model/request/CheckMembershipRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/devicebinding/model/request/CheckMembershipRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nik", "Ljava/lang/String;", "getNik", "nama", "getNama", "kpj", "getKpj", "tanggalLahir", "getTanggalLahir", "tempatLahir", "getTempatLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckMembershipRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("nama")
    private final String nama;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("tanggalLahir")
    private final String tanggalLahir;

    @SerializedName("tempatLahir")
    private final String tempatLahir;

    public /* synthetic */ CheckMembershipRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, str4, str5);
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getNama() {
        return this.nama;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getTanggalLahir() {
        return this.tanggalLahir;
    }

    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    public CheckMembershipRequest(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.nik = str;
        this.nama = str2;
        this.kpj = str3;
        this.tanggalLahir = str4;
        this.tempatLahir = str5;
    }

    public static /* synthetic */ CheckMembershipRequest copy$default(CheckMembershipRequest checkMembershipRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkMembershipRequest.nik;
        }
        if ((i & 2) != 0) {
            str2 = checkMembershipRequest.nama;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = checkMembershipRequest.kpj;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = checkMembershipRequest.tanggalLahir;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = checkMembershipRequest.tempatLahir;
        }
        return checkMembershipRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNama() {
        return this.nama;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTanggalLahir() {
        return this.tanggalLahir;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    public final CheckMembershipRequest copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new CheckMembershipRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckMembershipRequest)) {
            return false;
        }
        CheckMembershipRequest checkMembershipRequest = (CheckMembershipRequest) p0;
        return Intrinsics.areEqual(this.nik, checkMembershipRequest.nik) && Intrinsics.areEqual(this.nama, checkMembershipRequest.nama) && Intrinsics.areEqual(this.kpj, checkMembershipRequest.kpj) && Intrinsics.areEqual(this.tanggalLahir, checkMembershipRequest.tanggalLahir) && Intrinsics.areEqual(this.tempatLahir, checkMembershipRequest.tempatLahir);
    }

    public final int hashCode() {
        int iHashCode = this.nik.hashCode();
        int iHashCode2 = this.nama.hashCode();
        String str = this.kpj;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.tanggalLahir.hashCode()) * 31) + this.tempatLahir.hashCode();
    }

    public final String toString() {
        String str = this.nik;
        String str2 = this.nama;
        String str3 = this.kpj;
        String str4 = this.tanggalLahir;
        String str5 = this.tempatLahir;
        StringBuilder sb = new StringBuilder("CheckMembershipRequest(nik=");
        sb.append(str);
        sb.append(", nama=");
        sb.append(str2);
        sb.append(", kpj=");
        sb.append(str3);
        sb.append(", tanggalLahir=");
        sb.append(str4);
        sb.append(", tempatLahir=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
