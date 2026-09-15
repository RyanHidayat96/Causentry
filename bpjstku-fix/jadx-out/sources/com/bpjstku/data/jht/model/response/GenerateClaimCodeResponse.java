package com.bpjstku.data.jht.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0017\u0010\rR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/jht/model/response/GenerateClaimCodeResponse;", "", "", "p0", "", "p1", "Lcom/bpjstku/data/jht/model/response/DataPengajuanItem;", "p2", "<init>", "(ZLjava/lang/String;Lcom/bpjstku/data/jht/model/response/DataPengajuanItem;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/bpjstku/data/jht/model/response/DataPengajuanItem;", "copy", "(ZLjava/lang/String;Lcom/bpjstku/data/jht/model/response/DataPengajuanItem;)Lcom/bpjstku/data/jht/model/response/GenerateClaimCodeResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isSuccessful", "Z", "message", "Ljava/lang/String;", "getMessage", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/jht/model/response/DataPengajuanItem;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GenerateClaimCodeResponse {
    public static final int $stable = 0;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final DataPengajuanItem data;

    @SerializedName("isSuccessful")
    private final boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    public GenerateClaimCodeResponse(boolean z, String str, DataPengajuanItem dataPengajuanItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dataPengajuanItem, "");
        this.isSuccessful = z;
        this.message = str;
        this.data = dataPengajuanItem;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        return this.message;
    }

    public final DataPengajuanItem getData() {
        return this.data;
    }

    public static /* synthetic */ GenerateClaimCodeResponse copy$default(GenerateClaimCodeResponse generateClaimCodeResponse, boolean z, String str, DataPengajuanItem dataPengajuanItem, int i, Object obj) {
        if ((i & 1) != 0) {
            z = generateClaimCodeResponse.isSuccessful;
        }
        if ((i & 2) != 0) {
            str = generateClaimCodeResponse.message;
        }
        if ((i & 4) != 0) {
            dataPengajuanItem = generateClaimCodeResponse.data;
        }
        return generateClaimCodeResponse.copy(z, str, dataPengajuanItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DataPengajuanItem getData() {
        return this.data;
    }

    public final GenerateClaimCodeResponse copy(boolean p0, String p1, DataPengajuanItem p2) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new GenerateClaimCodeResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GenerateClaimCodeResponse)) {
            return false;
        }
        GenerateClaimCodeResponse generateClaimCodeResponse = (GenerateClaimCodeResponse) p0;
        return this.isSuccessful == generateClaimCodeResponse.isSuccessful && Intrinsics.areEqual(this.message, generateClaimCodeResponse.message) && Intrinsics.areEqual(this.data, generateClaimCodeResponse.data);
    }

    public final int hashCode() {
        return (((Boolean.hashCode(this.isSuccessful) * 31) + this.message.hashCode()) * 31) + this.data.hashCode();
    }

    public final String toString() {
        boolean z = this.isSuccessful;
        String str = this.message;
        DataPengajuanItem dataPengajuanItem = this.data;
        StringBuilder sb = new StringBuilder("GenerateClaimCodeResponse(isSuccessful=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str);
        sb.append(", data=");
        sb.append(dataPengajuanItem);
        sb.append(")");
        return sb.toString();
    }
}
