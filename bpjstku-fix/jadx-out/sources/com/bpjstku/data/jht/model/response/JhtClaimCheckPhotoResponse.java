package com.bpjstku.data.jht.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/jht/model/response/JhtClaimCheckPhotoResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/bpjstku/data/jht/model/response/JhtClaimCheckPhotoResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "fotoExsist", "Z", "getFotoExsist"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimCheckPhotoResponse extends BaseItem {
    public static final int $stable = 0;

    @SerializedName("fotoExsist")
    private final boolean fotoExsist;

    public final boolean getFotoExsist() {
        return this.fotoExsist;
    }

    public JhtClaimCheckPhotoResponse(boolean z) {
        this.fotoExsist = z;
    }

    public static /* synthetic */ JhtClaimCheckPhotoResponse copy$default(JhtClaimCheckPhotoResponse jhtClaimCheckPhotoResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = jhtClaimCheckPhotoResponse.fotoExsist;
        }
        return jhtClaimCheckPhotoResponse.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getFotoExsist() {
        return this.fotoExsist;
    }

    public final JhtClaimCheckPhotoResponse copy(boolean p0) {
        return new JhtClaimCheckPhotoResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof JhtClaimCheckPhotoResponse) && this.fotoExsist == ((JhtClaimCheckPhotoResponse) p0).fotoExsist;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.fotoExsist);
    }

    public final String toString() {
        boolean z = this.fotoExsist;
        StringBuilder sb = new StringBuilder("JhtClaimCheckPhotoResponse(fotoExsist=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
