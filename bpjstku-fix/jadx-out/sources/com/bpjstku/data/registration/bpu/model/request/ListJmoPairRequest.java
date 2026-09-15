package com.bpjstku.data.registration.bpu.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/registration/bpu/model/request/ListJmoPairRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/bpu/model/request/ListJmoPairRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "pageSize", "Ljava/lang/String;", "getPageSize", "nikBayar", "getNikBayar", "email", "getEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ListJmoPairRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("pageNumber")
    private final String nikBayar;

    @SerializedName("pageSize")
    private final String pageSize;

    public final String getPageSize() {
        return this.pageSize;
    }

    public final String getNikBayar() {
        return this.nikBayar;
    }

    public final String getEmail() {
        return this.email;
    }

    public ListJmoPairRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.pageSize = str;
        this.nikBayar = str2;
        this.email = str3;
    }

    public static /* synthetic */ ListJmoPairRequest copy$default(ListJmoPairRequest listJmoPairRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listJmoPairRequest.pageSize;
        }
        if ((i & 2) != 0) {
            str2 = listJmoPairRequest.nikBayar;
        }
        if ((i & 4) != 0) {
            str3 = listJmoPairRequest.email;
        }
        return listJmoPairRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNikBayar() {
        return this.nikBayar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final ListJmoPairRequest copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new ListJmoPairRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ListJmoPairRequest)) {
            return false;
        }
        ListJmoPairRequest listJmoPairRequest = (ListJmoPairRequest) p0;
        return Intrinsics.areEqual(this.pageSize, listJmoPairRequest.pageSize) && Intrinsics.areEqual(this.nikBayar, listJmoPairRequest.nikBayar) && Intrinsics.areEqual(this.email, listJmoPairRequest.email);
    }

    public final int hashCode() {
        return (((this.pageSize.hashCode() * 31) + this.nikBayar.hashCode()) * 31) + this.email.hashCode();
    }

    public final String toString() {
        String str = this.pageSize;
        String str2 = this.nikBayar;
        String str3 = this.email;
        StringBuilder sb = new StringBuilder("ListJmoPairRequest(pageSize=");
        sb.append(str);
        sb.append(", nikBayar=");
        sb.append(str2);
        sb.append(", email=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
