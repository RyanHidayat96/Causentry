package com.bpjstku.data.jht.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/jht/model/request/JhtBalanceRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/bpjstku/data/jht/model/request/JhtBalanceRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "isRecordPoin", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtBalanceRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("isRecordPoin")
    private final boolean isRecordPoin;

    public /* synthetic */ JhtBalanceRequest(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean isRecordPoin() {
        return this.isRecordPoin;
    }

    public JhtBalanceRequest(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.email = str;
        this.isRecordPoin = z;
    }

    public static /* synthetic */ JhtBalanceRequest copy$default(JhtBalanceRequest jhtBalanceRequest, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jhtBalanceRequest.email;
        }
        if ((i & 2) != 0) {
            z = jhtBalanceRequest.isRecordPoin;
        }
        return jhtBalanceRequest.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRecordPoin() {
        return this.isRecordPoin;
    }

    public final JhtBalanceRequest copy(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new JhtBalanceRequest(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtBalanceRequest)) {
            return false;
        }
        JhtBalanceRequest jhtBalanceRequest = (JhtBalanceRequest) p0;
        return Intrinsics.areEqual(this.email, jhtBalanceRequest.email) && this.isRecordPoin == jhtBalanceRequest.isRecordPoin;
    }

    public final int hashCode() {
        return (this.email.hashCode() * 31) + Boolean.hashCode(this.isRecordPoin);
    }

    public final String toString() {
        String str = this.email;
        boolean z = this.isRecordPoin;
        StringBuilder sb = new StringBuilder("JhtBalanceRequest(email=");
        sb.append(str);
        sb.append(", isRecordPoin=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
