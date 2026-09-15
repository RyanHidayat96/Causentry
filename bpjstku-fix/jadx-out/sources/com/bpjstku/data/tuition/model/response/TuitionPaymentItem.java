package com.bpjstku.data.tuition.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000bR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/tuition/model/response/TuitionPaymentItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/tuition/model/response/TuitionPaymentItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "jhtTuition", "Ljava/lang/String;", "getJhtTuition", "jkkTuition", "getJkkTuition", "jkmTuition", "getJkmTuition", "paymentCode", "getPaymentCode", "totalTuitionPayment", "getTotalTuitionPayment"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TuitionPaymentItem extends BaseItem {
    public static final int $stable = 0;

    @SerializedName("iuranJht")
    private final String jhtTuition;

    @SerializedName("iuranJkk")
    private final String jkkTuition;

    @SerializedName("iuranJkm")
    private final String jkmTuition;

    @SerializedName("kodePembayaran")
    private final String paymentCode;

    @SerializedName("totalIuran")
    private final String totalTuitionPayment;

    public final String getJhtTuition() {
        return this.jhtTuition;
    }

    public final String getJkkTuition() {
        return this.jkkTuition;
    }

    public final String getJkmTuition() {
        return this.jkmTuition;
    }

    public final String getPaymentCode() {
        return this.paymentCode;
    }

    public final String getTotalTuitionPayment() {
        return this.totalTuitionPayment;
    }

    public TuitionPaymentItem(String str, String str2, String str3, String str4, String str5) {
        this.jhtTuition = str;
        this.jkkTuition = str2;
        this.jkmTuition = str3;
        this.paymentCode = str4;
        this.totalTuitionPayment = str5;
    }

    public static /* synthetic */ TuitionPaymentItem copy$default(TuitionPaymentItem tuitionPaymentItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tuitionPaymentItem.jhtTuition;
        }
        if ((i & 2) != 0) {
            str2 = tuitionPaymentItem.jkkTuition;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = tuitionPaymentItem.jkmTuition;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = tuitionPaymentItem.paymentCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = tuitionPaymentItem.totalTuitionPayment;
        }
        return tuitionPaymentItem.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJhtTuition() {
        return this.jhtTuition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJkkTuition() {
        return this.jkkTuition;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJkmTuition() {
        return this.jkmTuition;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentCode() {
        return this.paymentCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTotalTuitionPayment() {
        return this.totalTuitionPayment;
    }

    public final TuitionPaymentItem copy(String p0, String p1, String p2, String p3, String p4) {
        return new TuitionPaymentItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TuitionPaymentItem)) {
            return false;
        }
        TuitionPaymentItem tuitionPaymentItem = (TuitionPaymentItem) p0;
        return Intrinsics.areEqual(this.jhtTuition, tuitionPaymentItem.jhtTuition) && Intrinsics.areEqual(this.jkkTuition, tuitionPaymentItem.jkkTuition) && Intrinsics.areEqual(this.jkmTuition, tuitionPaymentItem.jkmTuition) && Intrinsics.areEqual(this.paymentCode, tuitionPaymentItem.paymentCode) && Intrinsics.areEqual(this.totalTuitionPayment, tuitionPaymentItem.totalTuitionPayment);
    }

    public final int hashCode() {
        String str = this.jhtTuition;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.jkkTuition;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.jkmTuition;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.paymentCode;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.totalTuitionPayment;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.jhtTuition;
        String str2 = this.jkkTuition;
        String str3 = this.jkmTuition;
        String str4 = this.paymentCode;
        String str5 = this.totalTuitionPayment;
        StringBuilder sb = new StringBuilder("TuitionPaymentItem(jhtTuition=");
        sb.append(str);
        sb.append(", jkkTuition=");
        sb.append(str2);
        sb.append(", jkmTuition=");
        sb.append(str3);
        sb.append(", paymentCode=");
        sb.append(str4);
        sb.append(", totalTuitionPayment=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
