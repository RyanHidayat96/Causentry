package com.bpjstku.data.multibiller.model.request;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckTransactionRequest;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckTransactionRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "transactionId", "Ljava/lang/String;", "getTransactionId", "accessToken", "getAccessToken"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerCheckTransactionRequest {
    public static final int $stable = 0;

    @SerializedName("token")
    private final String accessToken;

    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    private final String transactionId;

    public MultiBillerCheckTransactionRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.transactionId = str;
        this.accessToken = str2;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public static /* synthetic */ MultiBillerCheckTransactionRequest copy$default(MultiBillerCheckTransactionRequest multiBillerCheckTransactionRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiBillerCheckTransactionRequest.transactionId;
        }
        if ((i & 2) != 0) {
            str2 = multiBillerCheckTransactionRequest.accessToken;
        }
        return multiBillerCheckTransactionRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final MultiBillerCheckTransactionRequest copy(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new MultiBillerCheckTransactionRequest(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MultiBillerCheckTransactionRequest)) {
            return false;
        }
        MultiBillerCheckTransactionRequest multiBillerCheckTransactionRequest = (MultiBillerCheckTransactionRequest) p0;
        return Intrinsics.areEqual(this.transactionId, multiBillerCheckTransactionRequest.transactionId) && Intrinsics.areEqual(this.accessToken, multiBillerCheckTransactionRequest.accessToken);
    }

    public final int hashCode() {
        return (this.transactionId.hashCode() * 31) + this.accessToken.hashCode();
    }

    public final String toString() {
        String str = this.transactionId;
        String str2 = this.accessToken;
        StringBuilder sb = new StringBuilder("MultiBillerCheckTransactionRequest(transactionId=");
        sb.append(str);
        sb.append(", accessToken=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
