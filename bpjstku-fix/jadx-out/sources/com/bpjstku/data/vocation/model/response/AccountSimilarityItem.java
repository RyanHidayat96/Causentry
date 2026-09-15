package com.bpjstku.data.vocation.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/vocation/model/response/AccountSimilarityItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "<init>", "(Ljava/lang/Float;)V", "component1", "()Ljava/lang/Float;", "copy", "(Ljava/lang/Float;)Lcom/bpjstku/data/vocation/model/response/AccountSimilarityItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", FirebaseAnalytics.Param.SCORE, "Ljava/lang/Float;", "getScore"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AccountSimilarityItem extends BaseItem {
    public static final int $stable = 0;

    @SerializedName(FirebaseAnalytics.Param.SCORE)
    private final Float score;

    public final Float getScore() {
        return this.score;
    }

    public AccountSimilarityItem(Float f) {
        this.score = f;
    }

    public static /* synthetic */ AccountSimilarityItem copy$default(AccountSimilarityItem accountSimilarityItem, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = accountSimilarityItem.score;
        }
        return accountSimilarityItem.copy(f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getScore() {
        return this.score;
    }

    public final AccountSimilarityItem copy(Float p0) {
        return new AccountSimilarityItem(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof AccountSimilarityItem) && Intrinsics.areEqual((Object) this.score, (Object) ((AccountSimilarityItem) p0).score);
    }

    public final int hashCode() {
        Float f = this.score;
        if (f == null) {
            return 0;
        }
        return f.hashCode();
    }

    public final String toString() {
        Float f = this.score;
        StringBuilder sb = new StringBuilder("AccountSimilarityItem(score=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
}
