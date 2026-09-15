package com.bpjstku.data.jp.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/bpjstku/data/jp/model/response/GetCountClaimJpResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "", "p1", "", "Lcom/bpjstku/data/jp/model/response/JpDataTkItem;", "p2", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ILjava/util/List;)Lcom/bpjstku/data/jp/model/response/GetCountClaimJpResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "isMoreThanOneClaimJp", "Ljava/lang/String;", "countClaimJp", "I", "getCountClaimJp", "dataTk", "Ljava/util/List;", "getDataTk"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetCountClaimJpResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("countClaimJp")
    private final int countClaimJp;

    @SerializedName("dataTk")
    private final List<JpDataTkItem> dataTk;

    @SerializedName("isMoreThanOneClaimJp")
    private final String isMoreThanOneClaimJp;

    public final String isMoreThanOneClaimJp() {
        return this.isMoreThanOneClaimJp;
    }

    public final int getCountClaimJp() {
        return this.countClaimJp;
    }

    public final List<JpDataTkItem> getDataTk() {
        return this.dataTk;
    }

    public GetCountClaimJpResponse(String str, int i, List<JpDataTkItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.isMoreThanOneClaimJp = str;
        this.countClaimJp = i;
        this.dataTk = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCountClaimJpResponse copy$default(GetCountClaimJpResponse getCountClaimJpResponse, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getCountClaimJpResponse.isMoreThanOneClaimJp;
        }
        if ((i2 & 2) != 0) {
            i = getCountClaimJpResponse.countClaimJp;
        }
        if ((i2 & 4) != 0) {
            list = getCountClaimJpResponse.dataTk;
        }
        return getCountClaimJpResponse.copy(str, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIsMoreThanOneClaimJp() {
        return this.isMoreThanOneClaimJp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCountClaimJp() {
        return this.countClaimJp;
    }

    public final List<JpDataTkItem> component3() {
        return this.dataTk;
    }

    public final GetCountClaimJpResponse copy(String p0, int p1, List<JpDataTkItem> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new GetCountClaimJpResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GetCountClaimJpResponse)) {
            return false;
        }
        GetCountClaimJpResponse getCountClaimJpResponse = (GetCountClaimJpResponse) p0;
        return Intrinsics.areEqual(this.isMoreThanOneClaimJp, getCountClaimJpResponse.isMoreThanOneClaimJp) && this.countClaimJp == getCountClaimJpResponse.countClaimJp && Intrinsics.areEqual(this.dataTk, getCountClaimJpResponse.dataTk);
    }

    public final int hashCode() {
        return (((this.isMoreThanOneClaimJp.hashCode() * 31) + Integer.hashCode(this.countClaimJp)) * 31) + this.dataTk.hashCode();
    }

    public final String toString() {
        String str = this.isMoreThanOneClaimJp;
        int i = this.countClaimJp;
        List<JpDataTkItem> list = this.dataTk;
        StringBuilder sb = new StringBuilder("GetCountClaimJpResponse(isMoreThanOneClaimJp=");
        sb.append(str);
        sb.append(", countClaimJp=");
        sb.append(i);
        sb.append(", dataTk=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
