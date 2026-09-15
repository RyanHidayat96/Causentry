package com.bpjstku.data.registration.general;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.registration.general.model.request.ActivationRequest;
import com.bpjstku.data.registration.general.model.request.EmailActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.data.registration.general.model.request.GenerateKeyRequest;
import com.bpjstku.data.registration.general.model.request.MembershipCheckRequest;
import com.bpjstku.data.registration.general.model.request.NewActivationRequest;
import com.bpjstku.data.registration.general.model.request.NewRegisterRequest;
import com.bpjstku.data.registration.general.model.request.OcrKtpRequest;
import com.bpjstku.data.registration.general.model.request.PhoneActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.data.registration.general.model.request.RegisterRequest;
import com.bpjstku.data.registration.general.model.request.UpdateActivationRequest;
import com.bpjstku.data.registration.general.model.request.VerifyBiometricRequest;
import com.bpjstku.data.registration.general.model.request.VerifyCountBiometricRequest;
import com.bpjstku.data.registration.general.model.response.ActivationItem;
import com.bpjstku.data.registration.general.model.response.MembershipCheckItem;
import com.bpjstku.data.registration.general.model.response.OcrKtpResponse;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.general.model.response.VerifyBiometricResponse;
import com.bpjstku.data.setting.model.response.KeyResponse;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000eJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000fH'¢\u0006\u0004\b\u0010\u0010\u0012J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0017J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001cJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH'¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u001dH'¢\u0006\u0004\b\u001e\u0010 J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\b\"\u0010#J%\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020!H'¢\u0006\u0004\b\"\u0010$J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J%\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020(H'¢\u0006\u0004\b*\u0010,J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010\u0003\u001a\u00020-H'¢\u0006\u0004\b.\u0010/J%\u0010.\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020-H'¢\u0006\u0004\b.\u00100J\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00042\u0006\u0010\u0003\u001a\u000201H'¢\u0006\u0004\b3\u00104J%\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u000201H'¢\u0006\u0004\b3\u00105J'\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u000206H'¢\u0006\u0004\b7\u00108J'\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u000209H'¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010\u0003\u001a\u00020(H'¢\u0006\u0004\b<\u0010+J%\u0010<\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020(H'¢\u0006\u0004\b<\u0010,J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010\u0003\u001a\u00020-H'¢\u0006\u0004\b=\u0010/J%\u0010=\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020-H'¢\u0006\u0004\b=\u00100J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\u0006\u0010\u0003\u001a\u00020>H'¢\u0006\u0004\b@\u0010AJ%\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020>H'¢\u0006\u0004\b@\u0010Bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/registration/general/RegistrationRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/registration/general/model/request/RegisterRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postRegistration", "(Lcom/bpjstku/data/registration/general/model/request/RegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerificationItem;", "postEmailVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/EmailVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;", "postPhoneVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/PhoneVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;", "Lcom/bpjstku/data/registration/general/model/response/MembershipCheckItem;", "postMembershipCheckInfo", "(Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/MembershipCheckRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;", "Lcom/bpjstku/data/registration/general/model/response/ActivationItem;", "postMembershipCheckEligibleResetAccount", "(Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/ActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;", "postEmailActivationVerification", "(Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/EmailActivationVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;", "postPhoneActivationVerification", "(Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/PhoneActivationVerificationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/UpdateActivationRequest;", "postActivation", "(Lcom/bpjstku/data/registration/general/model/request/UpdateActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;", "Lcom/bpjstku/data/registration/general/model/response/VerifyBiometricResponse;", "verifyCountBiometric", "(Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/VerifyCountBiometricRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/VerifyBiometricRequest;", "verifyBiometric", "(Lcom/bpjstku/data/registration/general/model/request/VerifyBiometricRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/VerifyBiometricRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;", "Lcom/bpjstku/data/setting/model/response/KeyResponse;", "generateKey", "(Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/GenerateKeyRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/NewRegisterRequest;", "postNewRegistration", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/NewRegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/registration/general/model/request/NewActivationRequest;", "postNewActivation", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/NewActivationRequest;)LderiveCodec;", "verifyCountActivationBiometric", "verifyActivationBiometric", "Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;", "Lcom/bpjstku/data/registration/general/model/response/OcrKtpResponse;", "ocrKtp", "(Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/registration/general/model/request/OcrKtpRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RegistrationRepository extends getChildrenOutConfigs {
    deriveCodec<KeyResponse> generateKey(GenerateKeyRequest p0);

    deriveCodec<KeyResponse> generateKey(String p0, GenerateKeyRequest p1);

    deriveCodec<OcrKtpResponse> ocrKtp(OcrKtpRequest p0);

    deriveCodec<OcrKtpResponse> ocrKtp(String p0, OcrKtpRequest p1);

    deriveCodec<BaseItem> postActivation(@Body UpdateActivationRequest p0);

    deriveCodec<VerificationItem> postEmailActivationVerification(@Body EmailActivationVerificationRequest p0);

    deriveCodec<VerificationItem> postEmailActivationVerification(String p0, EmailActivationVerificationRequest p1);

    deriveCodec<VerificationItem> postEmailVerification(@Body EmailVerificationRequest p0);

    deriveCodec<VerificationItem> postEmailVerification(String p0, EmailVerificationRequest p1);

    deriveCodec<ActivationItem> postMembershipCheckEligibleResetAccount(@Body ActivationRequest p0);

    deriveCodec<ActivationItem> postMembershipCheckEligibleResetAccount(String p0, @Body ActivationRequest p1);

    deriveCodec<MembershipCheckItem> postMembershipCheckInfo(@Body MembershipCheckRequest p0);

    deriveCodec<MembershipCheckItem> postMembershipCheckInfo(String p0, MembershipCheckRequest p1);

    deriveCodec<BaseItem> postNewActivation(String p0, @Body NewActivationRequest p1);

    deriveCodec<BaseItem> postNewRegistration(String p0, @Body NewRegisterRequest p1);

    deriveCodec<VerificationItem> postPhoneActivationVerification(@Body PhoneActivationVerificationRequest p0);

    deriveCodec<VerificationItem> postPhoneActivationVerification(String p0, PhoneActivationVerificationRequest p1);

    deriveCodec<VerificationItem> postPhoneVerification(@Body PhoneVerificationRequest p0);

    deriveCodec<VerificationItem> postPhoneVerification(String p0, PhoneVerificationRequest p1);

    deriveCodec<BaseItem> postRegistration(@Body RegisterRequest p0);

    deriveCodec<VerifyBiometricResponse> verifyActivationBiometric(VerifyBiometricRequest p0);

    deriveCodec<VerifyBiometricResponse> verifyActivationBiometric(String p0, VerifyBiometricRequest p1);

    deriveCodec<VerifyBiometricResponse> verifyBiometric(VerifyBiometricRequest p0);

    deriveCodec<VerifyBiometricResponse> verifyBiometric(String p0, VerifyBiometricRequest p1);

    deriveCodec<VerifyBiometricResponse> verifyCountActivationBiometric(VerifyCountBiometricRequest p0);

    deriveCodec<VerifyBiometricResponse> verifyCountActivationBiometric(String p0, VerifyCountBiometricRequest p1);

    deriveCodec<VerifyBiometricResponse> verifyCountBiometric(VerifyCountBiometricRequest p0);

    deriveCodec<VerifyBiometricResponse> verifyCountBiometric(String p0, VerifyCountBiometricRequest p1);
}
