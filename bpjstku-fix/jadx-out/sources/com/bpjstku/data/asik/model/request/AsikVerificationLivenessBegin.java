package com.bpjstku.data.asik.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessBegin;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "email", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "transactionId", "getTransactionId", "signature", "getSignature"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikVerificationLivenessBegin extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("transactionId")
    private final String transactionId;

    public final String getEmail() {
        return this.email;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getSignature() {
        return this.signature;
    }

    public AsikVerificationLivenessBegin(String str, String str2, String str3) {
        this.email = str;
        this.transactionId = str2;
        this.signature = str3;
    }
}
