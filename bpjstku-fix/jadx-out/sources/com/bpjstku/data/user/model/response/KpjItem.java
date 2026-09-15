package com.bpjstku.data.user.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/user/model/response/KpjItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "Lcom/bpjstku/data/user/model/response/Kpj;", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/bpjstku/data/user/model/response/KpjItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kpj", "Ljava/util/List;", "getKpj"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KpjItem extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("kpj")
    private final List<Kpj> kpj;

    public final List<Kpj> getKpj() {
        return this.kpj;
    }

    public KpjItem(List<Kpj> list) {
        this.kpj = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KpjItem copy$default(KpjItem kpjItem, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kpjItem.kpj;
        }
        return kpjItem.copy(list);
    }

    public final List<Kpj> component1() {
        return this.kpj;
    }

    public final KpjItem copy(List<Kpj> p0) {
        return new KpjItem(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof KpjItem) && Intrinsics.areEqual(this.kpj, ((KpjItem) p0).kpj);
    }

    public final int hashCode() {
        List<Kpj> list = this.kpj;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        List<Kpj> list = this.kpj;
        StringBuilder sb = new StringBuilder("KpjItem(kpj=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
