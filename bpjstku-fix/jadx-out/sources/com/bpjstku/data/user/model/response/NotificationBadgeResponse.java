package com.bpjstku.data.user.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/user/model/response/NotificationBadgeResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/bpjstku/data/user/model/response/NotificationBadgeResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isBadge", "Ljava/lang/Boolean;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NotificationBadgeResponse extends BaseItem {
    public static final int $stable = 0;

    @SerializedName("isRead")
    private final Boolean isBadge;

    public final Boolean isBadge() {
        return this.isBadge;
    }

    public /* synthetic */ NotificationBadgeResponse(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }

    public NotificationBadgeResponse(Boolean bool) {
        this.isBadge = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationBadgeResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NotificationBadgeResponse copy$default(NotificationBadgeResponse notificationBadgeResponse, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = notificationBadgeResponse.isBadge;
        }
        return notificationBadgeResponse.copy(bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsBadge() {
        return this.isBadge;
    }

    public final NotificationBadgeResponse copy(Boolean p0) {
        return new NotificationBadgeResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof NotificationBadgeResponse) && Intrinsics.areEqual(this.isBadge, ((NotificationBadgeResponse) p0).isBadge);
    }

    public final int hashCode() {
        Boolean bool = this.isBadge;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        Boolean bool = this.isBadge;
        StringBuilder sb = new StringBuilder("NotificationBadgeResponse(isBadge=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }
}
