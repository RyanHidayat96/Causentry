package com.bpjstku.data.otpverification.remote;

import com.bpjstku.data.otpverification.model.request.OtpVerificationActivationRequest;
import com.bpjstku.data.otpverification.model.request.OtpVerificationRequest;
import com.bpjstku.data.otpverification.model.request.OtpVerificationRequestAuth;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import com.bpjstku.data.otpverification.model.response.RequestOtpTokenItem;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u0011J#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0012\u0010\u000eJ+\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0016J#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/bpjstku/data/otpverification/remote/OtpVerificationApi;", "Lcom/bpjstku/data/otpverification/remote/OtpVerificationApiClient;", "LunbindChildren;", "p0", "<init>", "(Lcom/bpjstku/data/otpverification/remote/OtpVerificationApiClient;)V", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/otpverification/model/response/RequestOtpTokenItem;", "getAccessToken", "()LderiveCodec;", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;", "Lcom/bpjstku/data/otpverification/model/response/OtpVerificationResponse;", "verifyOtpOld", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;)LderiveCodec;", "verifyOtp", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;", "verifyActivationOtp", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequestAuth;", "verifyOtpAuth", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequestAuth;)LderiveCodec;", "otpVerificationApiClient", "Lcom/bpjstku/data/otpverification/remote/OtpVerificationApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OtpVerificationApi implements OtpVerificationApiClient, unbindChildren {
    public static final int $stable = 8;
    private final OtpVerificationApiClient otpVerificationApiClient;

    public OtpVerificationApi(OtpVerificationApiClient otpVerificationApiClient) {
        Intrinsics.checkNotNullParameter(otpVerificationApiClient, "");
        this.otpVerificationApiClient = otpVerificationApiClient;
    }

    @Override // com.bpjstku.data.otpverification.remote.OtpVerificationApiClient
    public final deriveCodec<Response<RequestOtpTokenItem>> getAccessToken() {
        return this.otpVerificationApiClient.getAccessToken();
    }

    @Override // com.bpjstku.data.otpverification.remote.OtpVerificationApiClient
    public final deriveCodec<Response<OtpVerificationResponse>> verifyOtpOld(OtpVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.otpVerificationApiClient.verifyOtpOld(p0);
    }

    @Override // com.bpjstku.data.otpverification.remote.OtpVerificationApiClient
    public final deriveCodec<Response<OtpVerificationResponse>> verifyOtpOld(String p0, OtpVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.otpVerificationApiClient.verifyOtpOld(p0, p1);
    }

    @Override // com.bpjstku.data.otpverification.remote.OtpVerificationApiClient
    public final deriveCodec<Response<OtpVerificationResponse>> verifyOtp(OtpVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.otpVerificationApiClient.verifyOtp(p0);
    }

    @Override // com.bpjstku.data.otpverification.remote.OtpVerificationApiClient
    public final deriveCodec<Response<OtpVerificationResponse>> verifyOtp(String p0, OtpVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.otpVerificationApiClient.verifyOtp(p0, p1);
    }

    @Override // com.bpjstku.data.otpverification.remote.OtpVerificationApiClient
    public final deriveCodec<Response<OtpVerificationResponse>> verifyActivationOtp(OtpVerificationActivationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.otpVerificationApiClient.verifyActivationOtp(p0);
    }

    @Override // com.bpjstku.data.otpverification.remote.OtpVerificationApiClient
    public final deriveCodec<Response<OtpVerificationResponse>> verifyActivationOtp(String p0, OtpVerificationActivationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.otpVerificationApiClient.verifyActivationOtp(p0, p1);
    }

    @Override // com.bpjstku.data.otpverification.remote.OtpVerificationApiClient
    public final deriveCodec<Response<OtpVerificationResponse>> verifyOtpAuth(OtpVerificationRequestAuth p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.otpVerificationApiClient.verifyOtpAuth(p0);
    }
}
