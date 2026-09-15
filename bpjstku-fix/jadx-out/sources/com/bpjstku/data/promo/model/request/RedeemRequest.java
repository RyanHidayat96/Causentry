package com.bpjstku.data.promo.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/bpjstku/data/promo/model/request/RedeemRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/promo/model/request/RedeemRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodePks", "Ljava/lang/String;", "getKodePks", "kodePromo", "getKodePromo", "akunRedeem", "getAkunRedeem", "linkVoucher", "getLinkVoucher"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RedeemRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("akunRedeem")
    private final String akunRedeem;

    @SerializedName("kodePks")
    private final String kodePks;

    @SerializedName("kodePromo")
    private final String kodePromo;

    @SerializedName("linkVoucher")
    private final String linkVoucher;

    public final String getKodePks() {
        return this.kodePks;
    }

    public final String getKodePromo() {
        return this.kodePromo;
    }

    public final String getAkunRedeem() {
        return this.akunRedeem;
    }

    public final String getLinkVoucher() {
        return this.linkVoucher;
    }

    public RedeemRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.kodePks = str;
        this.kodePromo = str2;
        this.akunRedeem = str3;
        this.linkVoucher = str4;
    }

    public static /* synthetic */ RedeemRequest copy$default(RedeemRequest redeemRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redeemRequest.kodePks;
        }
        if ((i & 2) != 0) {
            str2 = redeemRequest.kodePromo;
        }
        if ((i & 4) != 0) {
            str3 = redeemRequest.akunRedeem;
        }
        if ((i & 8) != 0) {
            str4 = redeemRequest.linkVoucher;
        }
        return redeemRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodePks() {
        return this.kodePks;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKodePromo() {
        return this.kodePromo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAkunRedeem() {
        return this.akunRedeem;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLinkVoucher() {
        return this.linkVoucher;
    }

    public final RedeemRequest copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new RedeemRequest(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RedeemRequest)) {
            return false;
        }
        RedeemRequest redeemRequest = (RedeemRequest) p0;
        return Intrinsics.areEqual(this.kodePks, redeemRequest.kodePks) && Intrinsics.areEqual(this.kodePromo, redeemRequest.kodePromo) && Intrinsics.areEqual(this.akunRedeem, redeemRequest.akunRedeem) && Intrinsics.areEqual(this.linkVoucher, redeemRequest.linkVoucher);
    }

    public final int hashCode() {
        int iHashCode = this.kodePks.hashCode();
        int iHashCode2 = this.kodePromo.hashCode();
        int iHashCode3 = this.akunRedeem.hashCode();
        String str = this.linkVoucher;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.kodePks;
        String str2 = this.kodePromo;
        String str3 = this.akunRedeem;
        String str4 = this.linkVoucher;
        StringBuilder sb = new StringBuilder("RedeemRequest(kodePks=");
        sb.append(str);
        sb.append(", kodePromo=");
        sb.append(str2);
        sb.append(", akunRedeem=");
        sb.append(str3);
        sb.append(", linkVoucher=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
