package com.bpjstku.data.complaint.model.response;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010 \u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/complaint/model/response/TrackingComplaintItem;", "", "", "p0", "p1", "p2", "Lcom/bpjstku/data/complaint/model/response/TindakLanjutItem;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/complaint/model/response/TindakLanjutItem;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/bpjstku/data/complaint/model/response/TindakLanjutItem;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/complaint/model/response/TindakLanjutItem;)Lcom/bpjstku/data/complaint/model/response/TrackingComplaintItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "tahapan", "Ljava/lang/String;", "getTahapan", "tanggal", "getTanggal", NotificationCompat.CATEGORY_STATUS, "getStatus", "tindakLanjut", "Lcom/bpjstku/data/complaint/model/response/TindakLanjutItem;", "getTindakLanjut"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TrackingComplaintItem {
    public static final int $stable = 0;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("tahapan")
    private final String tahapan;

    @SerializedName("tanggal")
    private final String tanggal;

    @SerializedName("tindakLanjut")
    private final TindakLanjutItem tindakLanjut;

    public TrackingComplaintItem(String str, String str2, String str3, TindakLanjutItem tindakLanjutItem) {
        this.tahapan = str;
        this.tanggal = str2;
        this.status = str3;
        this.tindakLanjut = tindakLanjutItem;
    }

    public /* synthetic */ TrackingComplaintItem(String str, String str2, String str3, TindakLanjutItem tindakLanjutItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : tindakLanjutItem);
    }

    public final String getTahapan() {
        return this.tahapan;
    }

    public final String getTanggal() {
        return this.tanggal;
    }

    public final String getStatus() {
        return this.status;
    }

    public final TindakLanjutItem getTindakLanjut() {
        return this.tindakLanjut;
    }

    public TrackingComplaintItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TrackingComplaintItem copy$default(TrackingComplaintItem trackingComplaintItem, String str, String str2, String str3, TindakLanjutItem tindakLanjutItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackingComplaintItem.tahapan;
        }
        if ((i & 2) != 0) {
            str2 = trackingComplaintItem.tanggal;
        }
        if ((i & 4) != 0) {
            str3 = trackingComplaintItem.status;
        }
        if ((i & 8) != 0) {
            tindakLanjutItem = trackingComplaintItem.tindakLanjut;
        }
        return trackingComplaintItem.copy(str, str2, str3, tindakLanjutItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTahapan() {
        return this.tahapan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTanggal() {
        return this.tanggal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TindakLanjutItem getTindakLanjut() {
        return this.tindakLanjut;
    }

    public final TrackingComplaintItem copy(String p0, String p1, String p2, TindakLanjutItem p3) {
        return new TrackingComplaintItem(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TrackingComplaintItem)) {
            return false;
        }
        TrackingComplaintItem trackingComplaintItem = (TrackingComplaintItem) p0;
        return Intrinsics.areEqual(this.tahapan, trackingComplaintItem.tahapan) && Intrinsics.areEqual(this.tanggal, trackingComplaintItem.tanggal) && Intrinsics.areEqual(this.status, trackingComplaintItem.status) && Intrinsics.areEqual(this.tindakLanjut, trackingComplaintItem.tindakLanjut);
    }

    public final int hashCode() {
        String str = this.tahapan;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tanggal;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.status;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        TindakLanjutItem tindakLanjutItem = this.tindakLanjut;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (tindakLanjutItem != null ? tindakLanjutItem.hashCode() : 0);
    }

    public final String toString() {
        String str = this.tahapan;
        String str2 = this.tanggal;
        String str3 = this.status;
        TindakLanjutItem tindakLanjutItem = this.tindakLanjut;
        StringBuilder sb = new StringBuilder("TrackingComplaintItem(tahapan=");
        sb.append(str);
        sb.append(", tanggal=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(str3);
        sb.append(", tindakLanjut=");
        sb.append(tindakLanjutItem);
        sb.append(")");
        return sb.toString();
    }
}
