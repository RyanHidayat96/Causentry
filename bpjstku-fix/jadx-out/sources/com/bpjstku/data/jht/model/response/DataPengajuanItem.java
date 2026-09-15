package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/jht/model/response/DataPengajuanItem;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/DataPengajuanItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodePengajuan", "Ljava/lang/String;", "getKodePengajuan"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataPengajuanItem {
    public static final int $stable = 0;

    @SerializedName("kodePengajuan")
    private final String kodePengajuan;

    public DataPengajuanItem(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.kodePengajuan = str;
    }

    public final String getKodePengajuan() {
        return this.kodePengajuan;
    }

    public static /* synthetic */ DataPengajuanItem copy$default(DataPengajuanItem dataPengajuanItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataPengajuanItem.kodePengajuan;
        }
        return dataPengajuanItem.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodePengajuan() {
        return this.kodePengajuan;
    }

    public final DataPengajuanItem copy(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new DataPengajuanItem(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof DataPengajuanItem) && Intrinsics.areEqual(this.kodePengajuan, ((DataPengajuanItem) p0).kodePengajuan);
    }

    public final int hashCode() {
        return this.kodePengajuan.hashCode();
    }

    public final String toString() {
        String str = this.kodePengajuan;
        StringBuilder sb = new StringBuilder("DataPengajuanItem(kodePengajuan=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
