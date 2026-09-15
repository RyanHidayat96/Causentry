package com.bpjstku.data.payment.model.request;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "authCode", "Ljava/lang/String;", "getAuthCode", ImagesContract.URL, "getUrl", FirebaseAnalytics.Param.METHOD, "getMethod"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AuthOtpBriDirectDebitRequest {
    public static final int $stable = 0;

    @SerializedName(SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE)
    private final String authCode;

    @SerializedName(FirebaseAnalytics.Param.METHOD)
    private final String method;

    @SerializedName(ImagesContract.URL)
    private final String url;

    public AuthOtpBriDirectDebitRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.authCode = str;
        this.url = str2;
        this.method = str3;
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getMethod() {
        return this.method;
    }

    public static /* synthetic */ AuthOtpBriDirectDebitRequest copy$default(AuthOtpBriDirectDebitRequest authOtpBriDirectDebitRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authOtpBriDirectDebitRequest.authCode;
        }
        if ((i & 2) != 0) {
            str2 = authOtpBriDirectDebitRequest.url;
        }
        if ((i & 4) != 0) {
            str3 = authOtpBriDirectDebitRequest.method;
        }
        return authOtpBriDirectDebitRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final AuthOtpBriDirectDebitRequest copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new AuthOtpBriDirectDebitRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AuthOtpBriDirectDebitRequest)) {
            return false;
        }
        AuthOtpBriDirectDebitRequest authOtpBriDirectDebitRequest = (AuthOtpBriDirectDebitRequest) p0;
        return Intrinsics.areEqual(this.authCode, authOtpBriDirectDebitRequest.authCode) && Intrinsics.areEqual(this.url, authOtpBriDirectDebitRequest.url) && Intrinsics.areEqual(this.method, authOtpBriDirectDebitRequest.method);
    }

    public final int hashCode() {
        return (((this.authCode.hashCode() * 31) + this.url.hashCode()) * 31) + this.method.hashCode();
    }

    public final String toString() {
        String str = this.authCode;
        String str2 = this.url;
        String str3 = this.method;
        StringBuilder sb = new StringBuilder("AuthOtpBriDirectDebitRequest(authCode=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", method=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
