package com.bpjstku.data.payment.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/payment/model/request/EwalletField;", "", "", "p0", "Lcom/bpjstku/data/payment/model/request/EwalletChannelProperties;", "p1", "Lcom/bpjstku/data/payment/model/request/EwalletAccount;", "p2", "<init>", "(Ljava/lang/String;Lcom/bpjstku/data/payment/model/request/EwalletChannelProperties;Lcom/bpjstku/data/payment/model/request/EwalletAccount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/bpjstku/data/payment/model/request/EwalletChannelProperties;", "component3", "()Lcom/bpjstku/data/payment/model/request/EwalletAccount;", "copy", "(Ljava/lang/String;Lcom/bpjstku/data/payment/model/request/EwalletChannelProperties;Lcom/bpjstku/data/payment/model/request/EwalletAccount;)Lcom/bpjstku/data/payment/model/request/EwalletField;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "channelCode", "Ljava/lang/String;", "getChannelCode", "ewalletChannelProperties", "Lcom/bpjstku/data/payment/model/request/EwalletChannelProperties;", "getEwalletChannelProperties", "ewalletAccount", "Lcom/bpjstku/data/payment/model/request/EwalletAccount;", "getEwalletAccount"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EwalletField {
    public static final int $stable = 0;

    @SerializedName("channel_code")
    private final String channelCode;

    @SerializedName("account")
    private final EwalletAccount ewalletAccount;

    @SerializedName("channel_properties")
    private final EwalletChannelProperties ewalletChannelProperties;

    public EwalletField(String str, EwalletChannelProperties ewalletChannelProperties, EwalletAccount ewalletAccount) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ewalletChannelProperties, "");
        Intrinsics.checkNotNullParameter(ewalletAccount, "");
        this.channelCode = str;
        this.ewalletChannelProperties = ewalletChannelProperties;
        this.ewalletAccount = ewalletAccount;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final EwalletChannelProperties getEwalletChannelProperties() {
        return this.ewalletChannelProperties;
    }

    public final EwalletAccount getEwalletAccount() {
        return this.ewalletAccount;
    }

    public static /* synthetic */ EwalletField copy$default(EwalletField ewalletField, String str, EwalletChannelProperties ewalletChannelProperties, EwalletAccount ewalletAccount, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ewalletField.channelCode;
        }
        if ((i & 2) != 0) {
            ewalletChannelProperties = ewalletField.ewalletChannelProperties;
        }
        if ((i & 4) != 0) {
            ewalletAccount = ewalletField.ewalletAccount;
        }
        return ewalletField.copy(str, ewalletChannelProperties, ewalletAccount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelCode() {
        return this.channelCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EwalletChannelProperties getEwalletChannelProperties() {
        return this.ewalletChannelProperties;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EwalletAccount getEwalletAccount() {
        return this.ewalletAccount;
    }

    public final EwalletField copy(String p0, EwalletChannelProperties p1, EwalletAccount p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new EwalletField(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EwalletField)) {
            return false;
        }
        EwalletField ewalletField = (EwalletField) p0;
        return Intrinsics.areEqual(this.channelCode, ewalletField.channelCode) && Intrinsics.areEqual(this.ewalletChannelProperties, ewalletField.ewalletChannelProperties) && Intrinsics.areEqual(this.ewalletAccount, ewalletField.ewalletAccount);
    }

    public final int hashCode() {
        return (((this.channelCode.hashCode() * 31) + this.ewalletChannelProperties.hashCode()) * 31) + this.ewalletAccount.hashCode();
    }

    public final String toString() {
        String str = this.channelCode;
        EwalletChannelProperties ewalletChannelProperties = this.ewalletChannelProperties;
        EwalletAccount ewalletAccount = this.ewalletAccount;
        StringBuilder sb = new StringBuilder("EwalletField(channelCode=");
        sb.append(str);
        sb.append(", ewalletChannelProperties=");
        sb.append(ewalletChannelProperties);
        sb.append(", ewalletAccount=");
        sb.append(ewalletAccount);
        sb.append(")");
        return sb.toString();
    }
}
