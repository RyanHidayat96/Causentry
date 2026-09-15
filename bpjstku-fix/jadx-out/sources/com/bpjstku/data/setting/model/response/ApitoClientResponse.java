package com.bpjstku.data.setting.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/setting/model/response/ApitoClientResponse;", "", "Lcom/bpjstku/data/setting/model/response/ExpResponse;", "p0", "", "p1", "<init>", "(Lcom/bpjstku/data/setting/model/response/ExpResponse;Z)V", "component1", "()Lcom/bpjstku/data/setting/model/response/ExpResponse;", "component2", "()Z", "copy", "(Lcom/bpjstku/data/setting/model/response/ExpResponse;Z)Lcom/bpjstku/data/setting/model/response/ApitoClientResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/setting/model/response/ExpResponse;", "getData", "isSuccessful", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApitoClientResponse {
    public static final int $stable = 0;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final ExpResponse data;

    @SerializedName("isSuccessful")
    private final boolean isSuccessful;

    public ApitoClientResponse(ExpResponse expResponse, boolean z) {
        Intrinsics.checkNotNullParameter(expResponse, "");
        this.data = expResponse;
        this.isSuccessful = z;
    }

    public final ExpResponse getData() {
        return this.data;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public static /* synthetic */ ApitoClientResponse copy$default(ApitoClientResponse apitoClientResponse, ExpResponse expResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            expResponse = apitoClientResponse.data;
        }
        if ((i & 2) != 0) {
            z = apitoClientResponse.isSuccessful;
        }
        return apitoClientResponse.copy(expResponse, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ExpResponse getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    public final ApitoClientResponse copy(ExpResponse p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new ApitoClientResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ApitoClientResponse)) {
            return false;
        }
        ApitoClientResponse apitoClientResponse = (ApitoClientResponse) p0;
        return Intrinsics.areEqual(this.data, apitoClientResponse.data) && this.isSuccessful == apitoClientResponse.isSuccessful;
    }

    public final int hashCode() {
        return (this.data.hashCode() * 31) + Boolean.hashCode(this.isSuccessful);
    }

    public final String toString() {
        ExpResponse expResponse = this.data;
        boolean z = this.isSuccessful;
        StringBuilder sb = new StringBuilder("ApitoClientResponse(data=");
        sb.append(expResponse);
        sb.append(", isSuccessful=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
