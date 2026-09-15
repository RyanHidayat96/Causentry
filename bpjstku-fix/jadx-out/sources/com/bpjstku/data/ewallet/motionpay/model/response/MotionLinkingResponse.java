package com.bpjstku.data.ewallet.motionpay.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\"\u0010\u0014\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\u0018"}, d2 = {"Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionLinkingResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionLinkingResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "msgCode", "Ljava/lang/String;", "getMsgCode", "setMsgCode", "(Ljava/lang/String;)V", ImagesContract.URL, "getUrl", "setUrl"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MotionLinkingResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("messageCode")
    private String msgCode;

    @SerializedName(ImagesContract.URL)
    private String url;

    public /* synthetic */ MotionLinkingResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getMsgCode() {
        return this.msgCode;
    }

    public final void setMsgCode(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msgCode = str;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    public MotionLinkingResponse(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.msgCode = str;
        this.url = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MotionLinkingResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MotionLinkingResponse copy$default(MotionLinkingResponse motionLinkingResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = motionLinkingResponse.msgCode;
        }
        if ((i & 2) != 0) {
            str2 = motionLinkingResponse.url;
        }
        return motionLinkingResponse.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMsgCode() {
        return this.msgCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final MotionLinkingResponse copy(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new MotionLinkingResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MotionLinkingResponse)) {
            return false;
        }
        MotionLinkingResponse motionLinkingResponse = (MotionLinkingResponse) p0;
        return Intrinsics.areEqual(this.msgCode, motionLinkingResponse.msgCode) && Intrinsics.areEqual(this.url, motionLinkingResponse.url);
    }

    public final int hashCode() {
        return (this.msgCode.hashCode() * 31) + this.url.hashCode();
    }

    public final String toString() {
        String str = this.msgCode;
        String str2 = this.url;
        StringBuilder sb = new StringBuilder("MotionLinkingResponse(msgCode=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
