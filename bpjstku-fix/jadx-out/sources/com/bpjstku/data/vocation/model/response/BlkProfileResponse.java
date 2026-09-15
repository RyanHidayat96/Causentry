package com.bpjstku.data.vocation.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/bpjstku/data/vocation/model/response/BlkProfileResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "Lcom/bpjstku/data/vocation/model/response/IksBlkItem;", "p0", "Lcom/bpjstku/data/vocation/model/response/BlkProfileItem;", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/bpjstku/data/vocation/model/response/BlkProfileResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "iksBlkList", "Ljava/util/List;", "getIksBlkList", "blkProfileItem", "getBlkProfileItem"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BlkProfileResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("profileBlk")
    private final List<BlkProfileItem> blkProfileItem;

    @SerializedName("iksBlk")
    private final List<IksBlkItem> iksBlkList;

    public final List<IksBlkItem> getIksBlkList() {
        return this.iksBlkList;
    }

    public final List<BlkProfileItem> getBlkProfileItem() {
        return this.blkProfileItem;
    }

    public BlkProfileResponse(List<IksBlkItem> list, List<BlkProfileItem> list2) {
        this.iksBlkList = list;
        this.blkProfileItem = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlkProfileResponse copy$default(BlkProfileResponse blkProfileResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = blkProfileResponse.iksBlkList;
        }
        if ((i & 2) != 0) {
            list2 = blkProfileResponse.blkProfileItem;
        }
        return blkProfileResponse.copy(list, list2);
    }

    public final List<IksBlkItem> component1() {
        return this.iksBlkList;
    }

    public final List<BlkProfileItem> component2() {
        return this.blkProfileItem;
    }

    public final BlkProfileResponse copy(List<IksBlkItem> p0, List<BlkProfileItem> p1) {
        return new BlkProfileResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BlkProfileResponse)) {
            return false;
        }
        BlkProfileResponse blkProfileResponse = (BlkProfileResponse) p0;
        return Intrinsics.areEqual(this.iksBlkList, blkProfileResponse.iksBlkList) && Intrinsics.areEqual(this.blkProfileItem, blkProfileResponse.blkProfileItem);
    }

    public final int hashCode() {
        List<IksBlkItem> list = this.iksBlkList;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<BlkProfileItem> list2 = this.blkProfileItem;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        List<IksBlkItem> list = this.iksBlkList;
        List<BlkProfileItem> list2 = this.blkProfileItem;
        StringBuilder sb = new StringBuilder("BlkProfileResponse(iksBlkList=");
        sb.append(list);
        sb.append(", blkProfileItem=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
