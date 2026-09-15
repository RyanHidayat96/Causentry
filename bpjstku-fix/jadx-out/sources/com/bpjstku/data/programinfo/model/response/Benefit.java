package com.bpjstku.data.programinfo.model.response;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0015\u0010\fR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/bpjstku/data/programinfo/model/response/Benefit;", "", "", "Lcom/bpjstku/data/programinfo/model/response/Item;", "p0", "", "p1", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/bpjstku/data/programinfo/model/response/Benefit;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", FirebaseAnalytics.Param.ITEMS, "Ljava/util/List;", "getItems", "title", "Ljava/lang/String;", "getTitle"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Benefit {
    public static final int $stable = 8;

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<Item> items;

    @SerializedName("title")
    private final String title;

    public Benefit(List<Item> list, String str) {
        this.items = list;
        this.title = str;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Benefit copy$default(Benefit benefit, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = benefit.items;
        }
        if ((i & 2) != 0) {
            str = benefit.title;
        }
        return benefit.copy(list, str);
    }

    public final List<Item> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Benefit copy(List<Item> p0, String p1) {
        return new Benefit(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Benefit)) {
            return false;
        }
        Benefit benefit = (Benefit) p0;
        return Intrinsics.areEqual(this.items, benefit.items) && Intrinsics.areEqual(this.title, benefit.title);
    }

    public final int hashCode() {
        List<Item> list = this.items;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.title;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        List<Item> list = this.items;
        String str = this.title;
        StringBuilder sb = new StringBuilder("Benefit(items=");
        sb.append(list);
        sb.append(", title=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
