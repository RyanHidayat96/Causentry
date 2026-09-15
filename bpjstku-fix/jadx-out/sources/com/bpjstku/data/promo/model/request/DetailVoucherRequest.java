package com.bpjstku.data.promo.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/promo/model/request/DetailVoucherRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/promo/model/request/DetailVoucherRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodePengajuanPromo", "Ljava/lang/String;", "getKodePengajuanPromo", "reqId", "getReqId", "akunRedeem", "getAkunRedeem"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DetailVoucherRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("akunRedeem")
    private final String akunRedeem;

    @SerializedName("kodePengajuanPromo")
    private final String kodePengajuanPromo;

    @SerializedName("reqId")
    private final String reqId;

    public final String getKodePengajuanPromo() {
        return this.kodePengajuanPromo;
    }

    public final String getReqId() {
        return this.reqId;
    }

    public final String getAkunRedeem() {
        return this.akunRedeem;
    }

    public DetailVoucherRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.kodePengajuanPromo = str;
        this.reqId = str2;
        this.akunRedeem = str3;
    }

    public static /* synthetic */ DetailVoucherRequest copy$default(DetailVoucherRequest detailVoucherRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailVoucherRequest.kodePengajuanPromo;
        }
        if ((i & 2) != 0) {
            str2 = detailVoucherRequest.reqId;
        }
        if ((i & 4) != 0) {
            str3 = detailVoucherRequest.akunRedeem;
        }
        return detailVoucherRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodePengajuanPromo() {
        return this.kodePengajuanPromo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReqId() {
        return this.reqId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAkunRedeem() {
        return this.akunRedeem;
    }

    public final DetailVoucherRequest copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new DetailVoucherRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DetailVoucherRequest)) {
            return false;
        }
        DetailVoucherRequest detailVoucherRequest = (DetailVoucherRequest) p0;
        return Intrinsics.areEqual(this.kodePengajuanPromo, detailVoucherRequest.kodePengajuanPromo) && Intrinsics.areEqual(this.reqId, detailVoucherRequest.reqId) && Intrinsics.areEqual(this.akunRedeem, detailVoucherRequest.akunRedeem);
    }

    public final int hashCode() {
        return (((this.kodePengajuanPromo.hashCode() * 31) + this.reqId.hashCode()) * 31) + this.akunRedeem.hashCode();
    }

    public final String toString() {
        String str = this.kodePengajuanPromo;
        String str2 = this.reqId;
        String str3 = this.akunRedeem;
        StringBuilder sb = new StringBuilder("DetailVoucherRequest(kodePengajuanPromo=");
        sb.append(str);
        sb.append(", reqId=");
        sb.append(str2);
        sb.append(", akunRedeem=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
