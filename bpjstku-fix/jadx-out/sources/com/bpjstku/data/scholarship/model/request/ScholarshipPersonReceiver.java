package com.bpjstku.data.scholarship.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/bpjstku/data/scholarship/model/request/ScholarshipPersonReceiver;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/request/ScholarshipPersonReceiver;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nik", "Ljava/lang/String;", "getNik", "nama", "getNama", "kpj", "getKpj"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipPersonReceiver {
    public static final int $stable = 0;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("namaPeserta")
    private final String nama;

    @SerializedName("nikPeserta")
    private final String nik;

    public ScholarshipPersonReceiver(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.nik = str;
        this.nama = str2;
        this.kpj = str3;
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

    public static /* synthetic */ ScholarshipPersonReceiver copy$default(ScholarshipPersonReceiver scholarshipPersonReceiver, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipPersonReceiver.nik;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipPersonReceiver.nama;
        }
        if ((i & 4) != 0) {
            str3 = scholarshipPersonReceiver.kpj;
        }
        return scholarshipPersonReceiver.copy(str, str2, str3);
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

    public final ScholarshipPersonReceiver copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new ScholarshipPersonReceiver(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipPersonReceiver)) {
            return false;
        }
        ScholarshipPersonReceiver scholarshipPersonReceiver = (ScholarshipPersonReceiver) p0;
        return Intrinsics.areEqual(this.nik, scholarshipPersonReceiver.nik) && Intrinsics.areEqual(this.nama, scholarshipPersonReceiver.nama) && Intrinsics.areEqual(this.kpj, scholarshipPersonReceiver.kpj);
    }

    public final int hashCode() {
        return (((this.nik.hashCode() * 31) + this.nama.hashCode()) * 31) + this.kpj.hashCode();
    }

    public final String toString() {
        String str = this.nik;
        String str2 = this.nama;
        String str3 = this.kpj;
        StringBuilder sb = new StringBuilder("ScholarshipPersonReceiver(nik=");
        sb.append(str);
        sb.append(", nama=");
        sb.append(str2);
        sb.append(", kpj=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
