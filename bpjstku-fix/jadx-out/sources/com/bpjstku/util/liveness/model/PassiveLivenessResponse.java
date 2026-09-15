package com.bpjstku.util.liveness.model;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/bpjstku/util/liveness/model/PassiveLivenessResponse;", "", "Lcom/bpjstku/util/liveness/model/DataPassive;", "p0", "", "p1", "p2", "<init>", "(Lcom/bpjstku/util/liveness/model/DataPassive;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/bpjstku/util/liveness/model/DataPassive;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/bpjstku/util/liveness/model/DataPassive;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/util/liveness/model/PassiveLivenessResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/util/liveness/model/DataPassive;", "getData", "message", "Ljava/lang/String;", "getMessage", NotificationCompat.CATEGORY_STATUS, "getStatus"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PassiveLivenessResponse {
    public static final int $stable = 0;
    private final DataPassive data;
    private final String message;
    private final String status;

    public PassiveLivenessResponse(DataPassive dataPassive, String str, String str2) {
        Intrinsics.checkNotNullParameter(dataPassive, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.data = dataPassive;
        this.message = str;
        this.status = str2;
    }

    public final DataPassive getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public static /* synthetic */ PassiveLivenessResponse copy$default(PassiveLivenessResponse passiveLivenessResponse, DataPassive dataPassive, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            dataPassive = passiveLivenessResponse.data;
        }
        if ((i & 2) != 0) {
            str = passiveLivenessResponse.message;
        }
        if ((i & 4) != 0) {
            str2 = passiveLivenessResponse.status;
        }
        return passiveLivenessResponse.copy(dataPassive, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataPassive getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final PassiveLivenessResponse copy(DataPassive p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new PassiveLivenessResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PassiveLivenessResponse)) {
            return false;
        }
        PassiveLivenessResponse passiveLivenessResponse = (PassiveLivenessResponse) p0;
        return Intrinsics.areEqual(this.data, passiveLivenessResponse.data) && Intrinsics.areEqual(this.message, passiveLivenessResponse.message) && Intrinsics.areEqual(this.status, passiveLivenessResponse.status);
    }

    public final int hashCode() {
        return (((this.data.hashCode() * 31) + this.message.hashCode()) * 31) + this.status.hashCode();
    }

    public final String toString() {
        DataPassive dataPassive = this.data;
        String str = this.message;
        String str2 = this.status;
        StringBuilder sb = new StringBuilder("PassiveLivenessResponse(data=");
        sb.append(dataPassive);
        sb.append(", message=");
        sb.append(str);
        sb.append(", status=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
