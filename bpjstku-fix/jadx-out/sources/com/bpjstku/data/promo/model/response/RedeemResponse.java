package com.bpjstku.data.promo.model.response;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\fR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\f"}, d2 = {"Lcom/bpjstku/data/promo/model/response/RedeemResponse;", "", "", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/promo/model/response/RedeemResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "ret", "Ljava/lang/String;", "getRet", "isSuccessful", "Z", "kodeVoucher", "getKodeVoucher", "linkVoucher", "getLinkVoucher", NotificationCompat.CATEGORY_MESSAGE, "getMsg"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RedeemResponse {
    public static final int $stable = 0;

    @SerializedName("isSuccessful")
    private final boolean isSuccessful;

    @SerializedName("kodeVoucher")
    private final String kodeVoucher;

    @SerializedName("linkVoucher")
    private final String linkVoucher;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    private final String msg;

    @SerializedName("ret")
    private final String ret;

    public RedeemResponse(String str, boolean z, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.ret = str;
        this.isSuccessful = z;
        this.kodeVoucher = str2;
        this.linkVoucher = str3;
        this.msg = str4;
    }

    public final String getRet() {
        return this.ret;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getKodeVoucher() {
        return this.kodeVoucher;
    }

    public final String getLinkVoucher() {
        return this.linkVoucher;
    }

    public final String getMsg() {
        return this.msg;
    }

    public static /* synthetic */ RedeemResponse copy$default(RedeemResponse redeemResponse, String str, boolean z, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redeemResponse.ret;
        }
        if ((i & 2) != 0) {
            z = redeemResponse.isSuccessful;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = redeemResponse.kodeVoucher;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = redeemResponse.linkVoucher;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = redeemResponse.msg;
        }
        return redeemResponse.copy(str, z2, str5, str6, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRet() {
        return this.ret;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKodeVoucher() {
        return this.kodeVoucher;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLinkVoucher() {
        return this.linkVoucher;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final RedeemResponse copy(String p0, boolean p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new RedeemResponse(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RedeemResponse)) {
            return false;
        }
        RedeemResponse redeemResponse = (RedeemResponse) p0;
        return Intrinsics.areEqual(this.ret, redeemResponse.ret) && this.isSuccessful == redeemResponse.isSuccessful && Intrinsics.areEqual(this.kodeVoucher, redeemResponse.kodeVoucher) && Intrinsics.areEqual(this.linkVoucher, redeemResponse.linkVoucher) && Intrinsics.areEqual(this.msg, redeemResponse.msg);
    }

    public final int hashCode() {
        return (((((((this.ret.hashCode() * 31) + Boolean.hashCode(this.isSuccessful)) * 31) + this.kodeVoucher.hashCode()) * 31) + this.linkVoucher.hashCode()) * 31) + this.msg.hashCode();
    }

    public final String toString() {
        String str = this.ret;
        boolean z = this.isSuccessful;
        String str2 = this.kodeVoucher;
        String str3 = this.linkVoucher;
        String str4 = this.msg;
        StringBuilder sb = new StringBuilder("RedeemResponse(ret=");
        sb.append(str);
        sb.append(", isSuccessful=");
        sb.append(z);
        sb.append(", kodeVoucher=");
        sb.append(str2);
        sb.append(", linkVoucher=");
        sb.append(str3);
        sb.append(", msg=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
