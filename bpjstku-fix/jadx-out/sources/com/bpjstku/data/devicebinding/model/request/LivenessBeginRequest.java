package com.bpjstku.data.devicebinding.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/devicebinding/model/request/LivenessBeginRequest;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/bpjstku/data/devicebinding/model/request/LivenessBeginRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "chId", "Ljava/lang/String;", "getChId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LivenessBeginRequest {
    public static final int $stable = 0;

    @SerializedName("chId")
    private final String chId;

    public LivenessBeginRequest(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chId = str;
    }

    public final String getChId() {
        return this.chId;
    }

    public /* synthetic */ LivenessBeginRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "ANDROID" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LivenessBeginRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LivenessBeginRequest copy$default(LivenessBeginRequest livenessBeginRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = livenessBeginRequest.chId;
        }
        return livenessBeginRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChId() {
        return this.chId;
    }

    public final LivenessBeginRequest copy(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new LivenessBeginRequest(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof LivenessBeginRequest) && Intrinsics.areEqual(this.chId, ((LivenessBeginRequest) p0).chId);
    }

    public final int hashCode() {
        return this.chId.hashCode();
    }

    public final String toString() {
        String str = this.chId;
        StringBuilder sb = new StringBuilder("LivenessBeginRequest(chId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
