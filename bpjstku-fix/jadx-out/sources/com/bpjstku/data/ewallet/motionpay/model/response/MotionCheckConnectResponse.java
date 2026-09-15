package com.bpjstku.data.ewallet.motionpay.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\"\u0010\u001a\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\u001dR\"\u0010!\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\u001dR$\u0010$\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010("}, d2 = {"Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionCheckConnectResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "p2", "Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionUser;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionUser;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionUser;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionUser;)Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionCheckConnectResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isExists", "Ljava/lang/String;", "setExists", "(Ljava/lang/String;)V", "cash", "getCash", "setCash", "point", "getPoint", "setPoint", "user", "Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionUser;", "getUser", "setUser", "(Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionUser;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MotionCheckConnectResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("cash_balance")
    private String cash;

    @SerializedName("isExsist")
    private String isExists;

    @SerializedName("points_balance")
    private String point;

    @SerializedName("user_info")
    private MotionUser user;

    public /* synthetic */ MotionCheckConnectResponse(String str, String str2, String str3, MotionUser motionUser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "0" : str3, (i & 8) != 0 ? null : motionUser);
    }

    public final String isExists() {
        return this.isExists;
    }

    public final void setExists(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isExists = str;
    }

    public final String getCash() {
        return this.cash;
    }

    public final void setCash(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cash = str;
    }

    public final String getPoint() {
        return this.point;
    }

    public final void setPoint(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.point = str;
    }

    public final MotionUser getUser() {
        return this.user;
    }

    public final void setUser(MotionUser motionUser) {
        this.user = motionUser;
    }

    public MotionCheckConnectResponse(String str, String str2, String str3, MotionUser motionUser) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.isExists = str;
        this.cash = str2;
        this.point = str3;
        this.user = motionUser;
    }

    public MotionCheckConnectResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ MotionCheckConnectResponse copy$default(MotionCheckConnectResponse motionCheckConnectResponse, String str, String str2, String str3, MotionUser motionUser, int i, Object obj) {
        if ((i & 1) != 0) {
            str = motionCheckConnectResponse.isExists;
        }
        if ((i & 2) != 0) {
            str2 = motionCheckConnectResponse.cash;
        }
        if ((i & 4) != 0) {
            str3 = motionCheckConnectResponse.point;
        }
        if ((i & 8) != 0) {
            motionUser = motionCheckConnectResponse.user;
        }
        return motionCheckConnectResponse.copy(str, str2, str3, motionUser);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIsExists() {
        return this.isExists;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCash() {
        return this.cash;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPoint() {
        return this.point;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MotionUser getUser() {
        return this.user;
    }

    public final MotionCheckConnectResponse copy(String p0, String p1, String p2, MotionUser p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new MotionCheckConnectResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MotionCheckConnectResponse)) {
            return false;
        }
        MotionCheckConnectResponse motionCheckConnectResponse = (MotionCheckConnectResponse) p0;
        return Intrinsics.areEqual(this.isExists, motionCheckConnectResponse.isExists) && Intrinsics.areEqual(this.cash, motionCheckConnectResponse.cash) && Intrinsics.areEqual(this.point, motionCheckConnectResponse.point) && Intrinsics.areEqual(this.user, motionCheckConnectResponse.user);
    }

    public final int hashCode() {
        int iHashCode = this.isExists.hashCode();
        int iHashCode2 = this.cash.hashCode();
        int iHashCode3 = this.point.hashCode();
        MotionUser motionUser = this.user;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (motionUser == null ? 0 : motionUser.hashCode());
    }

    public final String toString() {
        String str = this.isExists;
        String str2 = this.cash;
        String str3 = this.point;
        MotionUser motionUser = this.user;
        StringBuilder sb = new StringBuilder("MotionCheckConnectResponse(isExists=");
        sb.append(str);
        sb.append(", cash=");
        sb.append(str2);
        sb.append(", point=");
        sb.append(str3);
        sb.append(", user=");
        sb.append(motionUser);
        sb.append(")");
        return sb.toString();
    }
}
