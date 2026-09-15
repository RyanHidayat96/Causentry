package com.bpjstku.data.devicebinding.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/devicebinding/model/request/VerifyOtpRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "Lcom/bpjstku/data/devicebinding/model/request/OtpVerificationData;", "p0", "<init>", "(Lcom/bpjstku/data/devicebinding/model/request/OtpVerificationData;)V", "component1", "()Lcom/bpjstku/data/devicebinding/model/request/OtpVerificationData;", "copy", "(Lcom/bpjstku/data/devicebinding/model/request/OtpVerificationData;)Lcom/bpjstku/data/devicebinding/model/request/VerifyOtpRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/devicebinding/model/request/OtpVerificationData;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VerifyOtpRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final OtpVerificationData data;

    public final OtpVerificationData getData() {
        return this.data;
    }

    public VerifyOtpRequest(OtpVerificationData otpVerificationData) {
        Intrinsics.checkNotNullParameter(otpVerificationData, "");
        this.data = otpVerificationData;
    }

    public static /* synthetic */ VerifyOtpRequest copy$default(VerifyOtpRequest verifyOtpRequest, OtpVerificationData otpVerificationData, int i, Object obj) {
        if ((i & 1) != 0) {
            otpVerificationData = verifyOtpRequest.data;
        }
        return verifyOtpRequest.copy(otpVerificationData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OtpVerificationData getData() {
        return this.data;
    }

    public final VerifyOtpRequest copy(OtpVerificationData p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new VerifyOtpRequest(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof VerifyOtpRequest) && Intrinsics.areEqual(this.data, ((VerifyOtpRequest) p0).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        OtpVerificationData otpVerificationData = this.data;
        StringBuilder sb = new StringBuilder("VerifyOtpRequest(data=");
        sb.append(otpVerificationData);
        sb.append(")");
        return sb.toString();
    }
}
