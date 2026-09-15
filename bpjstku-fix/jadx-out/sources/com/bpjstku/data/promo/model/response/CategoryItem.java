package com.bpjstku.data.promo.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/promo/model/response/CategoryItem;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/promo/model/response/CategoryItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodeJenisProduk", "Ljava/lang/String;", "getKodeJenisProduk", "namaProduk", "getNamaProduk"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CategoryItem {
    public static final int $stable = 0;

    @SerializedName("kodeJenisProduk")
    private final String kodeJenisProduk;

    @SerializedName("namaProduk")
    private final String namaProduk;

    public CategoryItem(String str, String str2) {
        this.kodeJenisProduk = str;
        this.namaProduk = str2;
    }

    public final String getKodeJenisProduk() {
        return this.kodeJenisProduk;
    }

    public final String getNamaProduk() {
        return this.namaProduk;
    }

    public static /* synthetic */ CategoryItem copy$default(CategoryItem categoryItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoryItem.kodeJenisProduk;
        }
        if ((i & 2) != 0) {
            str2 = categoryItem.namaProduk;
        }
        return categoryItem.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeJenisProduk() {
        return this.kodeJenisProduk;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaProduk() {
        return this.namaProduk;
    }

    public final CategoryItem copy(String p0, String p1) {
        return new CategoryItem(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CategoryItem)) {
            return false;
        }
        CategoryItem categoryItem = (CategoryItem) p0;
        return Intrinsics.areEqual(this.kodeJenisProduk, categoryItem.kodeJenisProduk) && Intrinsics.areEqual(this.namaProduk, categoryItem.namaProduk);
    }

    public final int hashCode() {
        String str = this.kodeJenisProduk;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.namaProduk;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kodeJenisProduk;
        String str2 = this.namaProduk;
        StringBuilder sb = new StringBuilder("CategoryItem(kodeJenisProduk=");
        sb.append(str);
        sb.append(", namaProduk=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
