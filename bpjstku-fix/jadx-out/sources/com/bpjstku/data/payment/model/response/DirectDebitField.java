package com.bpjstku.data.payment.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/payment/model/response/DirectDebitField;", "", "", "p0", "Lcom/bpjstku/data/payment/model/response/DirectDebitFieldProperties;", "p1", "<init>", "(Ljava/lang/String;Lcom/bpjstku/data/payment/model/response/DirectDebitFieldProperties;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/bpjstku/data/payment/model/response/DirectDebitFieldProperties;", "copy", "(Ljava/lang/String;Lcom/bpjstku/data/payment/model/response/DirectDebitFieldProperties;)Lcom/bpjstku/data/payment/model/response/DirectDebitField;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "channelCode", "Ljava/lang/String;", "getChannelCode", "directDebitInfo", "Lcom/bpjstku/data/payment/model/response/DirectDebitFieldProperties;", "getDirectDebitInfo"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DirectDebitField {
    public static final int $stable = 0;

    @SerializedName("channel_code")
    private final String channelCode;

    @SerializedName("channel_properties")
    private final DirectDebitFieldProperties directDebitInfo;

    public DirectDebitField(String str, DirectDebitFieldProperties directDebitFieldProperties) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(directDebitFieldProperties, "");
        this.channelCode = str;
        this.directDebitInfo = directDebitFieldProperties;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final DirectDebitFieldProperties getDirectDebitInfo() {
        return this.directDebitInfo;
    }

    public static /* synthetic */ DirectDebitField copy$default(DirectDebitField directDebitField, String str, DirectDebitFieldProperties directDebitFieldProperties, int i, Object obj) {
        if ((i & 1) != 0) {
            str = directDebitField.channelCode;
        }
        if ((i & 2) != 0) {
            directDebitFieldProperties = directDebitField.directDebitInfo;
        }
        return directDebitField.copy(str, directDebitFieldProperties);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelCode() {
        return this.channelCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DirectDebitFieldProperties getDirectDebitInfo() {
        return this.directDebitInfo;
    }

    public final DirectDebitField copy(String p0, DirectDebitFieldProperties p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new DirectDebitField(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DirectDebitField)) {
            return false;
        }
        DirectDebitField directDebitField = (DirectDebitField) p0;
        return Intrinsics.areEqual(this.channelCode, directDebitField.channelCode) && Intrinsics.areEqual(this.directDebitInfo, directDebitField.directDebitInfo);
    }

    public final int hashCode() {
        return (this.channelCode.hashCode() * 31) + this.directDebitInfo.hashCode();
    }

    public final String toString() {
        String str = this.channelCode;
        DirectDebitFieldProperties directDebitFieldProperties = this.directDebitInfo;
        StringBuilder sb = new StringBuilder("DirectDebitField(channelCode=");
        sb.append(str);
        sb.append(", directDebitInfo=");
        sb.append(directDebitFieldProperties);
        sb.append(")");
        return sb.toString();
    }
}
