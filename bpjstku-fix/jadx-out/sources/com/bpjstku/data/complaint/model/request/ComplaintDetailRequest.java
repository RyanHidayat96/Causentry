package com.bpjstku.data.complaint.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/complaint/model/request/ComplaintDetailRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/complaint/model/request/ComplaintDetailRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "idPengaduan", "getIdPengaduan", "kodeJenisPengaduan", "getKodeJenisPengaduan"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ComplaintDetailRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("idPengaduan")
    private final String idPengaduan;

    @SerializedName("kodeJenisPengaduan")
    private final String kodeJenisPengaduan;

    public final String getEmail() {
        return this.email;
    }

    public final String getIdPengaduan() {
        return this.idPengaduan;
    }

    public final String getKodeJenisPengaduan() {
        return this.kodeJenisPengaduan;
    }

    public ComplaintDetailRequest(String str, String str2, String str3) {
        this.email = str;
        this.idPengaduan = str2;
        this.kodeJenisPengaduan = str3;
    }

    public static /* synthetic */ ComplaintDetailRequest copy$default(ComplaintDetailRequest complaintDetailRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = complaintDetailRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = complaintDetailRequest.idPengaduan;
        }
        if ((i & 4) != 0) {
            str3 = complaintDetailRequest.kodeJenisPengaduan;
        }
        return complaintDetailRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIdPengaduan() {
        return this.idPengaduan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKodeJenisPengaduan() {
        return this.kodeJenisPengaduan;
    }

    public final ComplaintDetailRequest copy(String p0, String p1, String p2) {
        return new ComplaintDetailRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ComplaintDetailRequest)) {
            return false;
        }
        ComplaintDetailRequest complaintDetailRequest = (ComplaintDetailRequest) p0;
        return Intrinsics.areEqual(this.email, complaintDetailRequest.email) && Intrinsics.areEqual(this.idPengaduan, complaintDetailRequest.idPengaduan) && Intrinsics.areEqual(this.kodeJenisPengaduan, complaintDetailRequest.kodeJenisPengaduan);
    }

    public final int hashCode() {
        String str = this.email;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.idPengaduan;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.kodeJenisPengaduan;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.idPengaduan;
        String str3 = this.kodeJenisPengaduan;
        StringBuilder sb = new StringBuilder("ComplaintDetailRequest(email=");
        sb.append(str);
        sb.append(", idPengaduan=");
        sb.append(str2);
        sb.append(", kodeJenisPengaduan=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
