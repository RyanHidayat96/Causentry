package com.bpjstku.data.multibiller.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0005"}, d2 = {"Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionItem;", "p0", "<init>", "(Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionItem;)V", "component1", "()Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionItem;", "copy", "(Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionItem;)Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionItem;", "getData", "setData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerAuthTransactionResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private MultiBillerAuthTransactionItem data;

    public final MultiBillerAuthTransactionItem getData() {
        return this.data;
    }

    public final void setData(MultiBillerAuthTransactionItem multiBillerAuthTransactionItem) {
        this.data = multiBillerAuthTransactionItem;
    }

    public MultiBillerAuthTransactionResponse(MultiBillerAuthTransactionItem multiBillerAuthTransactionItem) {
        this.data = multiBillerAuthTransactionItem;
    }

    public static /* synthetic */ MultiBillerAuthTransactionResponse copy$default(MultiBillerAuthTransactionResponse multiBillerAuthTransactionResponse, MultiBillerAuthTransactionItem multiBillerAuthTransactionItem, int i, Object obj) {
        if ((i & 1) != 0) {
            multiBillerAuthTransactionItem = multiBillerAuthTransactionResponse.data;
        }
        return multiBillerAuthTransactionResponse.copy(multiBillerAuthTransactionItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MultiBillerAuthTransactionItem getData() {
        return this.data;
    }

    public final MultiBillerAuthTransactionResponse copy(MultiBillerAuthTransactionItem p0) {
        return new MultiBillerAuthTransactionResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof MultiBillerAuthTransactionResponse) && Intrinsics.areEqual(this.data, ((MultiBillerAuthTransactionResponse) p0).data);
    }

    public final int hashCode() {
        MultiBillerAuthTransactionItem multiBillerAuthTransactionItem = this.data;
        if (multiBillerAuthTransactionItem == null) {
            return 0;
        }
        return multiBillerAuthTransactionItem.hashCode();
    }

    public final String toString() {
        MultiBillerAuthTransactionItem multiBillerAuthTransactionItem = this.data;
        StringBuilder sb = new StringBuilder("MultiBillerAuthTransactionResponse(data=");
        sb.append(multiBillerAuthTransactionItem);
        sb.append(")");
        return sb.toString();
    }
}
