package com.bpjstku.data.otpverification;

import com.bpjstku.data.otpverification.model.request.OtpVerificationActivationRequest;
import com.bpjstku.data.otpverification.model.request.OtpVerificationRequest;
import com.bpjstku.data.otpverification.model.request.OtpVerificationRequestAuth;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import com.bpjstku.data.otpverification.model.response.RequestOtpTokenItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\nJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u000fH'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000fH'¢\u0006\u0004\b\u0010\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/otpverification/OtpVerificationRepository;", "LgetChildrenOutConfigs;", "LderiveCodec;", "Lcom/bpjstku/data/otpverification/model/response/RequestOtpTokenItem;", "getAccessToken", "()LderiveCodec;", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;", "p0", "Lcom/bpjstku/data/otpverification/model/response/OtpVerificationResponse;", "verifyOtpOld", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;)LderiveCodec;", "verifyOtp", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;", "verifyActivationOtp", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequestAuth;", "verifyOtpAuth", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequestAuth;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface OtpVerificationRepository extends getChildrenOutConfigs {
    deriveCodec<RequestOtpTokenItem> getAccessToken();

    deriveCodec<OtpVerificationResponse> verifyActivationOtp(OtpVerificationActivationRequest p0);

    deriveCodec<OtpVerificationResponse> verifyActivationOtp(String p0, OtpVerificationActivationRequest p1);

    deriveCodec<OtpVerificationResponse> verifyOtp(OtpVerificationRequest p0);

    deriveCodec<OtpVerificationResponse> verifyOtp(String p0, OtpVerificationRequest p1);

    deriveCodec<OtpVerificationResponse> verifyOtpAuth(OtpVerificationRequestAuth p0);

    deriveCodec<OtpVerificationResponse> verifyOtpOld(OtpVerificationRequest p0);

    deriveCodec<OtpVerificationResponse> verifyOtpOld(String p0, OtpVerificationRequest p1);
}
