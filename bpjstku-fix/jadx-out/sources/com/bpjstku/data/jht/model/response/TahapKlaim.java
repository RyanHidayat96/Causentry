package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/bpjstku/data/jht/model/response/TahapKlaim;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/TahapKlaim;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "keterangan", "Ljava/lang/String;", "getKeterangan", "tahap", "getTahap", "tglRekam", "getTglRekam"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TahapKlaim {
    public static final int $stable = 0;

    @SerializedName("keterangan")
    private final String keterangan;

    @SerializedName("tahap")
    private final String tahap;

    @SerializedName("tglRekam")
    private final String tglRekam;

    public TahapKlaim(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.keterangan = str;
        this.tahap = str2;
        this.tglRekam = str3;
    }

    public final String getKeterangan() {
        return this.keterangan;
    }

    public final String getTahap() {
        return this.tahap;
    }

    public final String getTglRekam() {
        return this.tglRekam;
    }

    public static /* synthetic */ TahapKlaim copy$default(TahapKlaim tahapKlaim, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tahapKlaim.keterangan;
        }
        if ((i & 2) != 0) {
            str2 = tahapKlaim.tahap;
        }
        if ((i & 4) != 0) {
            str3 = tahapKlaim.tglRekam;
        }
        return tahapKlaim.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeterangan() {
        return this.keterangan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTahap() {
        return this.tahap;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTglRekam() {
        return this.tglRekam;
    }

    public final TahapKlaim copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new TahapKlaim(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TahapKlaim)) {
            return false;
        }
        TahapKlaim tahapKlaim = (TahapKlaim) p0;
        return Intrinsics.areEqual(this.keterangan, tahapKlaim.keterangan) && Intrinsics.areEqual(this.tahap, tahapKlaim.tahap) && Intrinsics.areEqual(this.tglRekam, tahapKlaim.tglRekam);
    }

    public final int hashCode() {
        return (((this.keterangan.hashCode() * 31) + this.tahap.hashCode()) * 31) + this.tglRekam.hashCode();
    }

    public final String toString() {
        String str = this.keterangan;
        String str2 = this.tahap;
        String str3 = this.tglRekam;
        StringBuilder sb = new StringBuilder("TahapKlaim(keterangan=");
        sb.append(str);
        sb.append(", tahap=");
        sb.append(str2);
        sb.append(", tglRekam=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
