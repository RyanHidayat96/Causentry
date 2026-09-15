package com.bpjstku.data.registration.general.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/registration/general/model/response/OcrKtpResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "Lcom/bpjstku/data/registration/general/model/response/ResultOcr;", "p0", "", "p1", "<init>", "(Lcom/bpjstku/data/registration/general/model/response/ResultOcr;Ljava/lang/String;)V", "component1", "()Lcom/bpjstku/data/registration/general/model/response/ResultOcr;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/bpjstku/data/registration/general/model/response/ResultOcr;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/response/OcrKtpResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/registration/general/model/response/ResultOcr;", "getData", "transactionId", "Ljava/lang/String;", "getTransactionId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OcrKtpResponse extends BaseItem {
    public static final int $stable = 0;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final ResultOcr data;

    @SerializedName("transactionId")
    private final String transactionId;

    public final ResultOcr getData() {
        return this.data;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public OcrKtpResponse(ResultOcr resultOcr, String str) {
        this.data = resultOcr;
        this.transactionId = str;
    }

    public static /* synthetic */ OcrKtpResponse copy$default(OcrKtpResponse ocrKtpResponse, ResultOcr resultOcr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            resultOcr = ocrKtpResponse.data;
        }
        if ((i & 2) != 0) {
            str = ocrKtpResponse.transactionId;
        }
        return ocrKtpResponse.copy(resultOcr, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResultOcr getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final OcrKtpResponse copy(ResultOcr p0, String p1) {
        return new OcrKtpResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof OcrKtpResponse)) {
            return false;
        }
        OcrKtpResponse ocrKtpResponse = (OcrKtpResponse) p0;
        return Intrinsics.areEqual(this.data, ocrKtpResponse.data) && Intrinsics.areEqual(this.transactionId, ocrKtpResponse.transactionId);
    }

    public final int hashCode() {
        ResultOcr resultOcr = this.data;
        int iHashCode = resultOcr == null ? 0 : resultOcr.hashCode();
        String str = this.transactionId;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        ResultOcr resultOcr = this.data;
        String str = this.transactionId;
        StringBuilder sb = new StringBuilder("OcrKtpResponse(data=");
        sb.append(resultOcr);
        sb.append(", transactionId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
