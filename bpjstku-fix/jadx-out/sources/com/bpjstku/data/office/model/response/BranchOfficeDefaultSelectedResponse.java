package com.bpjstku.data.office.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0016\u0010\fR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/bpjstku/data/office/model/response/BranchOfficeDefaultSelectedResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "Lcom/bpjstku/data/office/model/response/BranchPioneerOfficeItem;", "p0", "", "p1", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/bpjstku/data/office/model/response/BranchOfficeDefaultSelectedResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData", "statusDefault", "Ljava/lang/String;", "getStatusDefault"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BranchOfficeDefaultSelectedResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("kantor")
    private final List<BranchPioneerOfficeItem> data;

    @SerializedName("statusDefault")
    private final String statusDefault;

    public final List<BranchPioneerOfficeItem> getData() {
        return this.data;
    }

    public final String getStatusDefault() {
        return this.statusDefault;
    }

    public BranchOfficeDefaultSelectedResponse(List<BranchPioneerOfficeItem> list, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.data = list;
        this.statusDefault = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BranchOfficeDefaultSelectedResponse copy$default(BranchOfficeDefaultSelectedResponse branchOfficeDefaultSelectedResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = branchOfficeDefaultSelectedResponse.data;
        }
        if ((i & 2) != 0) {
            str = branchOfficeDefaultSelectedResponse.statusDefault;
        }
        return branchOfficeDefaultSelectedResponse.copy(list, str);
    }

    public final List<BranchPioneerOfficeItem> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDefault() {
        return this.statusDefault;
    }

    public final BranchOfficeDefaultSelectedResponse copy(List<BranchPioneerOfficeItem> p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new BranchOfficeDefaultSelectedResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BranchOfficeDefaultSelectedResponse)) {
            return false;
        }
        BranchOfficeDefaultSelectedResponse branchOfficeDefaultSelectedResponse = (BranchOfficeDefaultSelectedResponse) p0;
        return Intrinsics.areEqual(this.data, branchOfficeDefaultSelectedResponse.data) && Intrinsics.areEqual(this.statusDefault, branchOfficeDefaultSelectedResponse.statusDefault);
    }

    public final int hashCode() {
        return (this.data.hashCode() * 31) + this.statusDefault.hashCode();
    }

    public final String toString() {
        List<BranchPioneerOfficeItem> list = this.data;
        String str = this.statusDefault;
        StringBuilder sb = new StringBuilder("BranchOfficeDefaultSelectedResponse(data=");
        sb.append(list);
        sb.append(", statusDefault=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
