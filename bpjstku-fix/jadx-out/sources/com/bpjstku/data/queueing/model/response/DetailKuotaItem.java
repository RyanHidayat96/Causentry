package com.bpjstku.data.queueing.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/bpjstku/data/queueing/model/response/DetailKuotaItem;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/queueing/model/response/DetailKuotaItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "shift", "Ljava/lang/String;", "getShift", "ketWaktu", "getKetWaktu", "kuota", "getKuota"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DetailKuotaItem {
    public static final int $stable = 0;

    @SerializedName("KET_WAKTU")
    private final String ketWaktu;

    @SerializedName("KUOTA")
    private final String kuota;

    @SerializedName("SHIFT")
    private final String shift;

    public DetailKuotaItem(String str, String str2, String str3) {
        this.shift = str;
        this.ketWaktu = str2;
        this.kuota = str3;
    }

    public /* synthetic */ DetailKuotaItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final String getShift() {
        return this.shift;
    }

    public final String getKetWaktu() {
        return this.ketWaktu;
    }

    public final String getKuota() {
        return this.kuota;
    }

    public DetailKuotaItem() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DetailKuotaItem copy$default(DetailKuotaItem detailKuotaItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailKuotaItem.shift;
        }
        if ((i & 2) != 0) {
            str2 = detailKuotaItem.ketWaktu;
        }
        if ((i & 4) != 0) {
            str3 = detailKuotaItem.kuota;
        }
        return detailKuotaItem.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShift() {
        return this.shift;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKetWaktu() {
        return this.ketWaktu;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKuota() {
        return this.kuota;
    }

    public final DetailKuotaItem copy(String p0, String p1, String p2) {
        return new DetailKuotaItem(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DetailKuotaItem)) {
            return false;
        }
        DetailKuotaItem detailKuotaItem = (DetailKuotaItem) p0;
        return Intrinsics.areEqual(this.shift, detailKuotaItem.shift) && Intrinsics.areEqual(this.ketWaktu, detailKuotaItem.ketWaktu) && Intrinsics.areEqual(this.kuota, detailKuotaItem.kuota);
    }

    public final int hashCode() {
        String str = this.shift;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ketWaktu;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.kuota;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.shift;
        String str2 = this.ketWaktu;
        String str3 = this.kuota;
        StringBuilder sb = new StringBuilder("DetailKuotaItem(shift=");
        sb.append(str);
        sb.append(", ketWaktu=");
        sb.append(str2);
        sb.append(", kuota=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
