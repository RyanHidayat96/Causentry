package com.bpjstku.data.mlt.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/mlt/model/response/MltResponse;", "", "Lcom/bpjstku/data/mlt/model/response/MltData;", "p0", "<init>", "(Lcom/bpjstku/data/mlt/model/response/MltData;)V", "component1", "()Lcom/bpjstku/data/mlt/model/response/MltData;", "copy", "(Lcom/bpjstku/data/mlt/model/response/MltData;)Lcom/bpjstku/data/mlt/model/response/MltResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/mlt/model/response/MltData;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MltResponse {
    public static final int $stable = 0;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final MltData data;

    public MltResponse(MltData mltData) {
        Intrinsics.checkNotNullParameter(mltData, "");
        this.data = mltData;
    }

    public final MltData getData() {
        return this.data;
    }

    public static /* synthetic */ MltResponse copy$default(MltResponse mltResponse, MltData mltData, int i, Object obj) {
        if ((i & 1) != 0) {
            mltData = mltResponse.data;
        }
        return mltResponse.copy(mltData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MltData getData() {
        return this.data;
    }

    public final MltResponse copy(MltData p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new MltResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof MltResponse) && Intrinsics.areEqual(this.data, ((MltResponse) p0).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        MltData mltData = this.data;
        StringBuilder sb = new StringBuilder("MltResponse(data=");
        sb.append(mltData);
        sb.append(")");
        return sb.toString();
    }
}
