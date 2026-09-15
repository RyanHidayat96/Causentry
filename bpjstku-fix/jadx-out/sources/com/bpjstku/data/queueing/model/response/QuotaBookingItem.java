package com.bpjstku.data.queueing.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JR\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\u000eR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000eR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\u000eR\u001c\u0010'\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0014"}, d2 = {"Lcom/bpjstku/data/queueing/model/response/QuotaBookingItem;", "", "", "p0", "p1", "", "Lcom/bpjstku/data/queueing/model/response/DetailKuotaItem;", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bpjstku/data/queueing/model/response/QuotaBookingItem;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "tglBooking", "Ljava/lang/String;", "getTglBooking", "totalKuotaTerisi", "getTotalKuotaTerisi", "detailKuota", "Ljava/util/List;", "getDetailKuota", "totalKuotaSisa", "getTotalKuotaSisa", "flgPuasa", "Ljava/lang/Boolean;", "getFlgPuasa"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QuotaBookingItem {
    public static final int $stable = 8;

    @SerializedName("DETAIL_KUOTA")
    private final List<DetailKuotaItem> detailKuota;

    @SerializedName("FLG_PUASA")
    private final Boolean flgPuasa;

    @SerializedName("TGL_BOOKING")
    private final String tglBooking;

    @SerializedName("TOTAL_KUOTA_SISA")
    private final String totalKuotaSisa;

    @SerializedName("TOTAL_KUOTA_TERISI")
    private final String totalKuotaTerisi;

    public QuotaBookingItem(String str, String str2, List<DetailKuotaItem> list, String str3, Boolean bool) {
        this.tglBooking = str;
        this.totalKuotaTerisi = str2;
        this.detailKuota = list;
        this.totalKuotaSisa = str3;
        this.flgPuasa = bool;
    }

    public final String getTglBooking() {
        return this.tglBooking;
    }

    public final String getTotalKuotaTerisi() {
        return this.totalKuotaTerisi;
    }

    public final List<DetailKuotaItem> getDetailKuota() {
        return this.detailKuota;
    }

    public final String getTotalKuotaSisa() {
        return this.totalKuotaSisa;
    }

    public /* synthetic */ QuotaBookingItem(String str, String str2, List list, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? Boolean.FALSE : bool);
    }

    public final Boolean getFlgPuasa() {
        return this.flgPuasa;
    }

    public QuotaBookingItem() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuotaBookingItem copy$default(QuotaBookingItem quotaBookingItem, String str, String str2, List list, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quotaBookingItem.tglBooking;
        }
        if ((i & 2) != 0) {
            str2 = quotaBookingItem.totalKuotaTerisi;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = quotaBookingItem.detailKuota;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str3 = quotaBookingItem.totalKuotaSisa;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            bool = quotaBookingItem.flgPuasa;
        }
        return quotaBookingItem.copy(str, str4, list2, str5, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTglBooking() {
        return this.tglBooking;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTotalKuotaTerisi() {
        return this.totalKuotaTerisi;
    }

    public final List<DetailKuotaItem> component3() {
        return this.detailKuota;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTotalKuotaSisa() {
        return this.totalKuotaSisa;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getFlgPuasa() {
        return this.flgPuasa;
    }

    public final QuotaBookingItem copy(String p0, String p1, List<DetailKuotaItem> p2, String p3, Boolean p4) {
        return new QuotaBookingItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof QuotaBookingItem)) {
            return false;
        }
        QuotaBookingItem quotaBookingItem = (QuotaBookingItem) p0;
        return Intrinsics.areEqual(this.tglBooking, quotaBookingItem.tglBooking) && Intrinsics.areEqual(this.totalKuotaTerisi, quotaBookingItem.totalKuotaTerisi) && Intrinsics.areEqual(this.detailKuota, quotaBookingItem.detailKuota) && Intrinsics.areEqual(this.totalKuotaSisa, quotaBookingItem.totalKuotaSisa) && Intrinsics.areEqual(this.flgPuasa, quotaBookingItem.flgPuasa);
    }

    public final int hashCode() {
        String str = this.tglBooking;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.totalKuotaTerisi;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<DetailKuotaItem> list = this.detailKuota;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str3 = this.totalKuotaSisa;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.flgPuasa;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.tglBooking;
        String str2 = this.totalKuotaTerisi;
        List<DetailKuotaItem> list = this.detailKuota;
        String str3 = this.totalKuotaSisa;
        Boolean bool = this.flgPuasa;
        StringBuilder sb = new StringBuilder("QuotaBookingItem(tglBooking=");
        sb.append(str);
        sb.append(", totalKuotaTerisi=");
        sb.append(str2);
        sb.append(", detailKuota=");
        sb.append(list);
        sb.append(", totalKuotaSisa=");
        sb.append(str3);
        sb.append(", flgPuasa=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }
}
