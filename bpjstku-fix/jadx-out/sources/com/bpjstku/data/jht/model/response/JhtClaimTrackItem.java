package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0011JH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001e\u0010\u0011R\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010'\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0015R\u001a\u0010*\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b*\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/jht/model/response/JhtClaimTrackItem;", "", "", "p0", "", "p1", "", "Lcom/bpjstku/data/jht/model/response/TahapKlaim;", "p2", "Lcom/bpjstku/data/jht/model/response/TitleKlaim;", "p3", "p4", "<init>", "(ZLjava/lang/String;Ljava/util/List;Lcom/bpjstku/data/jht/model/response/TitleKlaim;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/bpjstku/data/jht/model/response/TitleKlaim;", "component5", "copy", "(ZLjava/lang/String;Ljava/util/List;Lcom/bpjstku/data/jht/model/response/TitleKlaim;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/JhtClaimTrackItem;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isSuccessful", "Z", "message", "Ljava/lang/String;", "getMessage", "tahapKlaim", "Ljava/util/List;", "getTahapKlaim", "titleKlaim", "Lcom/bpjstku/data/jht/model/response/TitleKlaim;", "getTitleKlaim", "isPaid"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimTrackItem {
    public static final int $stable = 8;

    @SerializedName("isPaid")
    private final String isPaid;

    @SerializedName("isSuccessful")
    private final boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    @SerializedName("tahapKlaim")
    private final List<TahapKlaim> tahapKlaim;

    @SerializedName("titleKlaim")
    private final TitleKlaim titleKlaim;

    public JhtClaimTrackItem(boolean z, String str, List<TahapKlaim> list, TitleKlaim titleKlaim, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(titleKlaim, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.isSuccessful = z;
        this.message = str;
        this.tahapKlaim = list;
        this.titleKlaim = titleKlaim;
        this.isPaid = str2;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<TahapKlaim> getTahapKlaim() {
        return this.tahapKlaim;
    }

    public final TitleKlaim getTitleKlaim() {
        return this.titleKlaim;
    }

    public final String isPaid() {
        return this.isPaid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JhtClaimTrackItem copy$default(JhtClaimTrackItem jhtClaimTrackItem, boolean z, String str, List list, TitleKlaim titleKlaim, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = jhtClaimTrackItem.isSuccessful;
        }
        if ((i & 2) != 0) {
            str = jhtClaimTrackItem.message;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            list = jhtClaimTrackItem.tahapKlaim;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            titleKlaim = jhtClaimTrackItem.titleKlaim;
        }
        TitleKlaim titleKlaim2 = titleKlaim;
        if ((i & 16) != 0) {
            str2 = jhtClaimTrackItem.isPaid;
        }
        return jhtClaimTrackItem.copy(z, str3, list2, titleKlaim2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<TahapKlaim> component3() {
        return this.tahapKlaim;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TitleKlaim getTitleKlaim() {
        return this.titleKlaim;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIsPaid() {
        return this.isPaid;
    }

    public final JhtClaimTrackItem copy(boolean p0, String p1, List<TahapKlaim> p2, TitleKlaim p3, String p4) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new JhtClaimTrackItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtClaimTrackItem)) {
            return false;
        }
        JhtClaimTrackItem jhtClaimTrackItem = (JhtClaimTrackItem) p0;
        return this.isSuccessful == jhtClaimTrackItem.isSuccessful && Intrinsics.areEqual(this.message, jhtClaimTrackItem.message) && Intrinsics.areEqual(this.tahapKlaim, jhtClaimTrackItem.tahapKlaim) && Intrinsics.areEqual(this.titleKlaim, jhtClaimTrackItem.titleKlaim) && Intrinsics.areEqual(this.isPaid, jhtClaimTrackItem.isPaid);
    }

    public final int hashCode() {
        return (((((((Boolean.hashCode(this.isSuccessful) * 31) + this.message.hashCode()) * 31) + this.tahapKlaim.hashCode()) * 31) + this.titleKlaim.hashCode()) * 31) + this.isPaid.hashCode();
    }

    public final String toString() {
        boolean z = this.isSuccessful;
        String str = this.message;
        List<TahapKlaim> list = this.tahapKlaim;
        TitleKlaim titleKlaim = this.titleKlaim;
        String str2 = this.isPaid;
        StringBuilder sb = new StringBuilder("JhtClaimTrackItem(isSuccessful=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str);
        sb.append(", tahapKlaim=");
        sb.append(list);
        sb.append(", titleKlaim=");
        sb.append(titleKlaim);
        sb.append(", isPaid=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
