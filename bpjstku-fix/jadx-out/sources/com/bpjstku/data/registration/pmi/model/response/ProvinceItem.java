package com.bpjstku.data.registration.pmi.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.lib.model.CodeAndNamePairItem;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/registration/pmi/model/response/ProvinceItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "Lcom/bpjstku/data/lib/model/CodeAndNamePairItem;", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/bpjstku/data/registration/pmi/model/response/ProvinceItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProvinceItem extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("propinsi")
    private final List<CodeAndNamePairItem> data;

    public ProvinceItem(List<CodeAndNamePairItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.data = list;
    }

    public final List<CodeAndNamePairItem> getData() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProvinceItem copy$default(ProvinceItem provinceItem, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = provinceItem.data;
        }
        return provinceItem.copy(list);
    }

    public final List<CodeAndNamePairItem> component1() {
        return this.data;
    }

    public final ProvinceItem copy(List<CodeAndNamePairItem> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new ProvinceItem(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof ProvinceItem) && Intrinsics.areEqual(this.data, ((ProvinceItem) p0).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        List<CodeAndNamePairItem> list = this.data;
        StringBuilder sb = new StringBuilder("ProvinceItem(data=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
