package com.bpjstku.data.danasiaga.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0015\u0010\fR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/bpjstku/data/danasiaga/model/response/CheckEligiblePinangResponse;", "", "", "Lcom/bpjstku/data/danasiaga/model/response/CheckEligiblePersonDataPinang;", "p0", "", "p1", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/bpjstku/data/danasiaga/model/response/CheckEligiblePinangResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData", "setData", "(Ljava/util/List;)V", "isEligible", "Ljava/lang/String;", "setEligible", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckEligiblePinangResponse {
    public static final int $stable = 8;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private List<CheckEligiblePersonDataPinang> data;

    @SerializedName("isEligible")
    private String isEligible;

    public CheckEligiblePinangResponse(List<CheckEligiblePersonDataPinang> list, String str) {
        this.data = list;
        this.isEligible = str;
    }

    public /* synthetic */ CheckEligiblePinangResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "" : str);
    }

    public final List<CheckEligiblePersonDataPinang> getData() {
        return this.data;
    }

    public final void setData(List<CheckEligiblePersonDataPinang> list) {
        this.data = list;
    }

    public final String isEligible() {
        return this.isEligible;
    }

    public final void setEligible(String str) {
        this.isEligible = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckEligiblePinangResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckEligiblePinangResponse copy$default(CheckEligiblePinangResponse checkEligiblePinangResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = checkEligiblePinangResponse.data;
        }
        if ((i & 2) != 0) {
            str = checkEligiblePinangResponse.isEligible;
        }
        return checkEligiblePinangResponse.copy(list, str);
    }

    public final List<CheckEligiblePersonDataPinang> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIsEligible() {
        return this.isEligible;
    }

    public final CheckEligiblePinangResponse copy(List<CheckEligiblePersonDataPinang> p0, String p1) {
        return new CheckEligiblePinangResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckEligiblePinangResponse)) {
            return false;
        }
        CheckEligiblePinangResponse checkEligiblePinangResponse = (CheckEligiblePinangResponse) p0;
        return Intrinsics.areEqual(this.data, checkEligiblePinangResponse.data) && Intrinsics.areEqual(this.isEligible, checkEligiblePinangResponse.isEligible);
    }

    public final int hashCode() {
        List<CheckEligiblePersonDataPinang> list = this.data;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.isEligible;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        List<CheckEligiblePersonDataPinang> list = this.data;
        String str = this.isEligible;
        StringBuilder sb = new StringBuilder("CheckEligiblePinangResponse(data=");
        sb.append(list);
        sb.append(", isEligible=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
