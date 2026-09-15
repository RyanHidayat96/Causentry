package com.bpjstku.data.queueing.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/queueing/model/response/NearestOfficeItem;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/queueing/model/response/NearestOfficeItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "jarakKilometer", "Ljava/lang/String;", "getJarakKilometer", "namaKantor", "getNamaKantor", "maxTglBookingJht", "getMaxTglBookingJht", "kodeKantor", "getKodeKantor", "alamat", "getAlamat"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NearestOfficeItem {
    public static final int $stable = 0;

    @SerializedName("alamat")
    private final String alamat;

    @SerializedName("jarakKilometer")
    private final String jarakKilometer;

    @SerializedName("kodeKantor")
    private final String kodeKantor;

    @SerializedName("maxTglBookingJht")
    private final String maxTglBookingJht;

    @SerializedName("namaKantor")
    private final String namaKantor;

    public NearestOfficeItem(String str, String str2, String str3, String str4, String str5) {
        this.jarakKilometer = str;
        this.namaKantor = str2;
        this.maxTglBookingJht = str3;
        this.kodeKantor = str4;
        this.alamat = str5;
    }

    public /* synthetic */ NearestOfficeItem(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public final String getJarakKilometer() {
        return this.jarakKilometer;
    }

    public final String getNamaKantor() {
        return this.namaKantor;
    }

    public final String getMaxTglBookingJht() {
        return this.maxTglBookingJht;
    }

    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    public final String getAlamat() {
        return this.alamat;
    }

    public NearestOfficeItem() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ NearestOfficeItem copy$default(NearestOfficeItem nearestOfficeItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nearestOfficeItem.jarakKilometer;
        }
        if ((i & 2) != 0) {
            str2 = nearestOfficeItem.namaKantor;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = nearestOfficeItem.maxTglBookingJht;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = nearestOfficeItem.kodeKantor;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = nearestOfficeItem.alamat;
        }
        return nearestOfficeItem.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJarakKilometer() {
        return this.jarakKilometer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaKantor() {
        return this.namaKantor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMaxTglBookingJht() {
        return this.maxTglBookingJht;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAlamat() {
        return this.alamat;
    }

    public final NearestOfficeItem copy(String p0, String p1, String p2, String p3, String p4) {
        return new NearestOfficeItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof NearestOfficeItem)) {
            return false;
        }
        NearestOfficeItem nearestOfficeItem = (NearestOfficeItem) p0;
        return Intrinsics.areEqual(this.jarakKilometer, nearestOfficeItem.jarakKilometer) && Intrinsics.areEqual(this.namaKantor, nearestOfficeItem.namaKantor) && Intrinsics.areEqual(this.maxTglBookingJht, nearestOfficeItem.maxTglBookingJht) && Intrinsics.areEqual(this.kodeKantor, nearestOfficeItem.kodeKantor) && Intrinsics.areEqual(this.alamat, nearestOfficeItem.alamat);
    }

    public final int hashCode() {
        String str = this.jarakKilometer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.namaKantor;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxTglBookingJht;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kodeKantor;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.alamat;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.jarakKilometer;
        String str2 = this.namaKantor;
        String str3 = this.maxTglBookingJht;
        String str4 = this.kodeKantor;
        String str5 = this.alamat;
        StringBuilder sb = new StringBuilder("NearestOfficeItem(jarakKilometer=");
        sb.append(str);
        sb.append(", namaKantor=");
        sb.append(str2);
        sb.append(", maxTglBookingJht=");
        sb.append(str3);
        sb.append(", kodeKantor=");
        sb.append(str4);
        sb.append(", alamat=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
