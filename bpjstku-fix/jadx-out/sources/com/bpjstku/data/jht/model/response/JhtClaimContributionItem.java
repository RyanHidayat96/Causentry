package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/bpjstku/data/jht/model/response/JhtClaimContributionItem;", "", "", "p0", "", "Lcom/bpjstku/data/jht/model/response/JhtClaimContributionList;", "p1", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/bpjstku/data/jht/model/response/JhtClaimContributionItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "companyName", "Ljava/lang/String;", "getCompanyName", "contributions", "Ljava/util/List;", "getContributions"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimContributionItem {
    public static final int $stable = 8;

    @SerializedName("companyName")
    private final String companyName;

    @SerializedName("contributions")
    private final List<JhtClaimContributionList> contributions;

    public JhtClaimContributionItem(String str, List<JhtClaimContributionList> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.companyName = str;
        this.contributions = list;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final List<JhtClaimContributionList> getContributions() {
        return this.contributions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JhtClaimContributionItem copy$default(JhtClaimContributionItem jhtClaimContributionItem, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jhtClaimContributionItem.companyName;
        }
        if ((i & 2) != 0) {
            list = jhtClaimContributionItem.contributions;
        }
        return jhtClaimContributionItem.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    public final List<JhtClaimContributionList> component2() {
        return this.contributions;
    }

    public final JhtClaimContributionItem copy(String p0, List<JhtClaimContributionList> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new JhtClaimContributionItem(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtClaimContributionItem)) {
            return false;
        }
        JhtClaimContributionItem jhtClaimContributionItem = (JhtClaimContributionItem) p0;
        return Intrinsics.areEqual(this.companyName, jhtClaimContributionItem.companyName) && Intrinsics.areEqual(this.contributions, jhtClaimContributionItem.contributions);
    }

    public final int hashCode() {
        return (this.companyName.hashCode() * 31) + this.contributions.hashCode();
    }

    public final String toString() {
        String str = this.companyName;
        List<JhtClaimContributionList> list = this.contributions;
        StringBuilder sb = new StringBuilder("JhtClaimContributionItem(companyName=");
        sb.append(str);
        sb.append(", contributions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
