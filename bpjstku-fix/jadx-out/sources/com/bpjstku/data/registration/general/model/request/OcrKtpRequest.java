package com.bpjstku.data.registration.general.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "reqId", "Ljava/lang/String;", "getReqId", "baseRequest", "getBaseRequest"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OcrKtpRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("base64File")
    private final String baseRequest;

    @SerializedName("reqId")
    private final String reqId;

    public final String getReqId() {
        return this.reqId;
    }

    public final String getBaseRequest() {
        return this.baseRequest;
    }

    public OcrKtpRequest(String str, String str2) {
        this.reqId = str;
        this.baseRequest = str2;
    }

    public static /* synthetic */ OcrKtpRequest copy$default(OcrKtpRequest ocrKtpRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ocrKtpRequest.reqId;
        }
        if ((i & 2) != 0) {
            str2 = ocrKtpRequest.baseRequest;
        }
        return ocrKtpRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReqId() {
        return this.reqId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseRequest() {
        return this.baseRequest;
    }

    public final OcrKtpRequest copy(String p0, String p1) {
        return new OcrKtpRequest(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof OcrKtpRequest)) {
            return false;
        }
        OcrKtpRequest ocrKtpRequest = (OcrKtpRequest) p0;
        return Intrinsics.areEqual(this.reqId, ocrKtpRequest.reqId) && Intrinsics.areEqual(this.baseRequest, ocrKtpRequest.baseRequest);
    }

    public final int hashCode() {
        String str = this.reqId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.baseRequest;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.reqId;
        String str2 = this.baseRequest;
        StringBuilder sb = new StringBuilder("OcrKtpRequest(reqId=");
        sb.append(str);
        sb.append(", baseRequest=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
