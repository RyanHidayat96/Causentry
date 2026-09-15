package com.bpjstku.data.tuition.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/bpjstku/data/tuition/model/response/PaymentFee;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/tuition/model/response/PaymentFee;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "shopeePay", "Ljava/lang/String;", "getShopeePay", "goPay", "getGoPay", "ovo", "getOvo"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PaymentFee {
    public static final int $stable = 0;

    @SerializedName("goPay")
    private final String goPay;

    @SerializedName("ovo")
    private final String ovo;

    @SerializedName("shopeePay")
    private final String shopeePay;

    public PaymentFee(String str, String str2, String str3) {
        this.shopeePay = str;
        this.goPay = str2;
        this.ovo = str3;
    }

    public final String getShopeePay() {
        return this.shopeePay;
    }

    public final String getGoPay() {
        return this.goPay;
    }

    public final String getOvo() {
        return this.ovo;
    }

    public static /* synthetic */ PaymentFee copy$default(PaymentFee paymentFee, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentFee.shopeePay;
        }
        if ((i & 2) != 0) {
            str2 = paymentFee.goPay;
        }
        if ((i & 4) != 0) {
            str3 = paymentFee.ovo;
        }
        return paymentFee.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShopeePay() {
        return this.shopeePay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGoPay() {
        return this.goPay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOvo() {
        return this.ovo;
    }

    public final PaymentFee copy(String p0, String p1, String p2) {
        return new PaymentFee(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PaymentFee)) {
            return false;
        }
        PaymentFee paymentFee = (PaymentFee) p0;
        return Intrinsics.areEqual(this.shopeePay, paymentFee.shopeePay) && Intrinsics.areEqual(this.goPay, paymentFee.goPay) && Intrinsics.areEqual(this.ovo, paymentFee.ovo);
    }

    public final int hashCode() {
        String str = this.shopeePay;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.goPay;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ovo;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.shopeePay;
        String str2 = this.goPay;
        String str3 = this.ovo;
        StringBuilder sb = new StringBuilder("PaymentFee(shopeePay=");
        sb.append(str);
        sb.append(", goPay=");
        sb.append(str2);
        sb.append(", ovo=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
