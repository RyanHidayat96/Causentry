package com.bpjstku.data.payment.model.response;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/bpjstku/data/payment/model/response/ActionLinkingStatus;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/ActionLinkingStatus;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "action", "Ljava/lang/String;", "getAction", ImagesContract.URL, "getUrl", "url_type", "getUrl_type", FirebaseAnalytics.Param.METHOD, "getMethod"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ActionLinkingStatus {
    public static final int $stable = 0;

    @SerializedName("action")
    private final String action;

    @SerializedName(FirebaseAnalytics.Param.METHOD)
    private final String method;

    @SerializedName(ImagesContract.URL)
    private final String url;

    @SerializedName("url_type")
    private final String url_type;

    public ActionLinkingStatus(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.action = str;
        this.url = str2;
        this.url_type = str3;
        this.method = str4;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrl_type() {
        return this.url_type;
    }

    public final String getMethod() {
        return this.method;
    }

    public static /* synthetic */ ActionLinkingStatus copy$default(ActionLinkingStatus actionLinkingStatus, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionLinkingStatus.action;
        }
        if ((i & 2) != 0) {
            str2 = actionLinkingStatus.url;
        }
        if ((i & 4) != 0) {
            str3 = actionLinkingStatus.url_type;
        }
        if ((i & 8) != 0) {
            str4 = actionLinkingStatus.method;
        }
        return actionLinkingStatus.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl_type() {
        return this.url_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final ActionLinkingStatus copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new ActionLinkingStatus(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ActionLinkingStatus)) {
            return false;
        }
        ActionLinkingStatus actionLinkingStatus = (ActionLinkingStatus) p0;
        return Intrinsics.areEqual(this.action, actionLinkingStatus.action) && Intrinsics.areEqual(this.url, actionLinkingStatus.url) && Intrinsics.areEqual(this.url_type, actionLinkingStatus.url_type) && Intrinsics.areEqual(this.method, actionLinkingStatus.method);
    }

    public final int hashCode() {
        return (((((this.action.hashCode() * 31) + this.url.hashCode()) * 31) + this.url_type.hashCode()) * 31) + this.method.hashCode();
    }

    public final String toString() {
        String str = this.action;
        String str2 = this.url;
        String str3 = this.url_type;
        String str4 = this.method;
        StringBuilder sb = new StringBuilder("ActionLinkingStatus(action=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", url_type=");
        sb.append(str3);
        sb.append(", method=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
