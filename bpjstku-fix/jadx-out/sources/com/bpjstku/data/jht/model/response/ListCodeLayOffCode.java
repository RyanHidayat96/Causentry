package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/jht/model/response/ListCodeLayOffCode;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/ListCodeLayOffCode;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "code", "Ljava/lang/String;", "getCode", "description", "getDescription"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ListCodeLayOffCode {
    public static final int $stable = 0;

    @SerializedName("code")
    private final String code;

    @SerializedName("description")
    private final String description;

    public ListCodeLayOffCode(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.code = str;
        this.description = str2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public static /* synthetic */ ListCodeLayOffCode copy$default(ListCodeLayOffCode listCodeLayOffCode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listCodeLayOffCode.code;
        }
        if ((i & 2) != 0) {
            str2 = listCodeLayOffCode.description;
        }
        return listCodeLayOffCode.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final ListCodeLayOffCode copy(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new ListCodeLayOffCode(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ListCodeLayOffCode)) {
            return false;
        }
        ListCodeLayOffCode listCodeLayOffCode = (ListCodeLayOffCode) p0;
        return Intrinsics.areEqual(this.code, listCodeLayOffCode.code) && Intrinsics.areEqual(this.description, listCodeLayOffCode.description);
    }

    public final int hashCode() {
        return (this.code.hashCode() * 31) + this.description.hashCode();
    }

    public final String toString() {
        String str = this.code;
        String str2 = this.description;
        StringBuilder sb = new StringBuilder("ListCodeLayOffCode(code=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
