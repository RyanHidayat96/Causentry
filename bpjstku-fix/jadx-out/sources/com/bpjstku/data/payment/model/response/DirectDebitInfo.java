package com.bpjstku.data.payment.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/payment/model/response/DirectDebitInfo;", "", "", "p0", "Lcom/bpjstku/data/payment/model/response/DirectDebitChannelProperties;", "p1", "<init>", "(Ljava/lang/String;Lcom/bpjstku/data/payment/model/response/DirectDebitChannelProperties;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/bpjstku/data/payment/model/response/DirectDebitChannelProperties;", "copy", "(Ljava/lang/String;Lcom/bpjstku/data/payment/model/response/DirectDebitChannelProperties;)Lcom/bpjstku/data/payment/model/response/DirectDebitInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "channelCode", "Ljava/lang/String;", "getChannelCode", "directDebitChannelProperties", "Lcom/bpjstku/data/payment/model/response/DirectDebitChannelProperties;", "getDirectDebitChannelProperties"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DirectDebitInfo {
    public static final int $stable = 0;

    @SerializedName("channel_code")
    private final String channelCode;

    @SerializedName("channel_properties")
    private final DirectDebitChannelProperties directDebitChannelProperties;

    public DirectDebitInfo(String str, DirectDebitChannelProperties directDebitChannelProperties) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(directDebitChannelProperties, "");
        this.channelCode = str;
        this.directDebitChannelProperties = directDebitChannelProperties;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final DirectDebitChannelProperties getDirectDebitChannelProperties() {
        return this.directDebitChannelProperties;
    }

    public static /* synthetic */ DirectDebitInfo copy$default(DirectDebitInfo directDebitInfo, String str, DirectDebitChannelProperties directDebitChannelProperties, int i, Object obj) {
        if ((i & 1) != 0) {
            str = directDebitInfo.channelCode;
        }
        if ((i & 2) != 0) {
            directDebitChannelProperties = directDebitInfo.directDebitChannelProperties;
        }
        return directDebitInfo.copy(str, directDebitChannelProperties);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelCode() {
        return this.channelCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DirectDebitChannelProperties getDirectDebitChannelProperties() {
        return this.directDebitChannelProperties;
    }

    public final DirectDebitInfo copy(String p0, DirectDebitChannelProperties p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new DirectDebitInfo(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DirectDebitInfo)) {
            return false;
        }
        DirectDebitInfo directDebitInfo = (DirectDebitInfo) p0;
        return Intrinsics.areEqual(this.channelCode, directDebitInfo.channelCode) && Intrinsics.areEqual(this.directDebitChannelProperties, directDebitInfo.directDebitChannelProperties);
    }

    public final int hashCode() {
        return (this.channelCode.hashCode() * 31) + this.directDebitChannelProperties.hashCode();
    }

    public final String toString() {
        String str = this.channelCode;
        DirectDebitChannelProperties directDebitChannelProperties = this.directDebitChannelProperties;
        StringBuilder sb = new StringBuilder("DirectDebitInfo(channelCode=");
        sb.append(str);
        sb.append(", directDebitChannelProperties=");
        sb.append(directDebitChannelProperties);
        sb.append(")");
        return sb.toString();
    }
}
