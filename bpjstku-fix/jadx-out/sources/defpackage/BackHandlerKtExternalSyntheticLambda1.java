package defpackage;

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
import com.bpjstku.data.registration.general.model.response.VerifyBiometricResponse;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.registration.general.model.MembershipCheckNew;
import com.bpjstku.domain.registration.general.model.Verification;

/* JADX INFO: loaded from: classes3.dex */
public interface BackHandlerKtExternalSyntheticLambda1 {
    deriveCodec<Verification> TuitionPaymentFragmentbindingInflater1(PhoneActivationVerificationRequest phoneActivationVerificationRequest);

    deriveCodec<Verification> TuitionPaymentFragmentbindingInflater1(String str, PhoneActivationVerificationRequest phoneActivationVerificationRequest);

    deriveCodec<ActivationItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivationRequest activationRequest);

    deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault1(PhoneVerificationRequest phoneVerificationRequest);

    deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, EmailVerificationRequest emailVerificationRequest);

    deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, PhoneVerificationRequest phoneVerificationRequest);

    deriveCodec<VerifyBiometricResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, VerifyCountBiometricRequest verifyCountBiometricRequest);

    deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault2(EmailVerificationRequest emailVerificationRequest);

    deriveCodec<ActivationItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, ActivationRequest activationRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, NewRegisterRequest newRegisterRequest);

    deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault3(EmailActivationVerificationRequest emailActivationVerificationRequest);

    deriveCodec<MembershipCheckItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(MembershipCheckRequest membershipCheckRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(UpdateActivationRequest updateActivationRequest);

    deriveCodec<MembershipCheckNew> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, MembershipCheckRequest membershipCheckRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, NewActivationRequest newActivationRequest);

    deriveCodec<VerifyBiometricResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, VerifyBiometricRequest verifyBiometricRequest);

    deriveCodec<VerifyBiometricResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, VerifyCountBiometricRequest verifyCountBiometricRequest);

    deriveCodec<KeyResponse> b(GenerateKeyRequest generateKeyRequest);

    deriveCodec<OcrKtpResponse> b(OcrKtpRequest ocrKtpRequest);

    deriveCodec<BaseModel> b(RegisterRequest registerRequest);

    deriveCodec<VerifyBiometricResponse> b(VerifyBiometricRequest verifyBiometricRequest);

    deriveCodec<Verification> b(String str, EmailActivationVerificationRequest emailActivationVerificationRequest);

    deriveCodec<OcrKtpResponse> b(String str, OcrKtpRequest ocrKtpRequest);

    deriveCodec<VerifyBiometricResponse> b(String str, VerifyBiometricRequest verifyBiometricRequest);
}
