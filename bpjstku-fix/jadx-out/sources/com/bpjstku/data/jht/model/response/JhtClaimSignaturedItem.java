package com.bpjstku.data.jht.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/jht/model/response/JhtClaimSignaturedItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/JhtClaimSignaturedItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "signature", "Ljava/lang/String;", "getSignature"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimSignaturedItem extends BaseItem {
    public static final int $stable = 0;

    @SerializedName("signature")
    private final String signature;

    public final String getSignature() {
        return this.signature;
    }

    public JhtClaimSignaturedItem(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signature = str;
    }

    public static /* synthetic */ JhtClaimSignaturedItem copy$default(JhtClaimSignaturedItem jhtClaimSignaturedItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jhtClaimSignaturedItem.signature;
        }
        return jhtClaimSignaturedItem.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final JhtClaimSignaturedItem copy(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new JhtClaimSignaturedItem(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof JhtClaimSignaturedItem) && Intrinsics.areEqual(this.signature, ((JhtClaimSignaturedItem) p0).signature);
    }

    public final int hashCode() {
        return this.signature.hashCode();
    }

    public final String toString() {
        String str = this.signature;
        StringBuilder sb = new StringBuilder("JhtClaimSignaturedItem(signature=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
