package com.bpjstku.data.ict.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/ict/model/request/IctTokenRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/ict/model/request/IctTokenRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "userId", "Ljava/lang/String;", "getUserId", "menu", "getMenu"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IctTokenRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("menu")
    private final String menu;

    @SerializedName("userId")
    private final String userId;

    public final String getUserId() {
        return this.userId;
    }

    public final String getMenu() {
        return this.menu;
    }

    public IctTokenRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.userId = str;
        this.menu = str2;
    }

    public static /* synthetic */ IctTokenRequest copy$default(IctTokenRequest ictTokenRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ictTokenRequest.userId;
        }
        if ((i & 2) != 0) {
            str2 = ictTokenRequest.menu;
        }
        return ictTokenRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMenu() {
        return this.menu;
    }

    public final IctTokenRequest copy(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new IctTokenRequest(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof IctTokenRequest)) {
            return false;
        }
        IctTokenRequest ictTokenRequest = (IctTokenRequest) p0;
        return Intrinsics.areEqual(this.userId, ictTokenRequest.userId) && Intrinsics.areEqual(this.menu, ictTokenRequest.menu);
    }

    public final int hashCode() {
        return (this.userId.hashCode() * 31) + this.menu.hashCode();
    }

    public final String toString() {
        String str = this.userId;
        String str2 = this.menu;
        StringBuilder sb = new StringBuilder("IctTokenRequest(userId=");
        sb.append(str);
        sb.append(", menu=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
