package defpackage;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.registration.general.model.response.VerificationSignatureItem;
import com.bpjstku.data.setting.model.request.AddKpjRequest;
import com.bpjstku.data.setting.model.request.ChangeDataFirstVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeEmailRequest;
import com.bpjstku.data.setting.model.request.ChangeEmailVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangeHandphoneVerificationRequest;
import com.bpjstku.data.setting.model.request.ChangePasswordRequest;
import com.bpjstku.data.setting.model.request.ChangePhoneNumberRequest;
import com.bpjstku.data.setting.model.request.ChangeProfilePictureRequest;
import com.bpjstku.data.setting.model.request.KeyRequest;
import com.bpjstku.data.setting.model.request.PhoneVerificationRequest;
import com.bpjstku.data.setting.model.request.VerificationOtpRequest;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.registration.general.model.Verification;

/* JADX INFO: loaded from: classes3.dex */
public interface ReportDrawnAfterlambda0 {
    deriveCodec<Verification> TuitionPaymentFragmentbindingInflater1(ChangeEmailVerificationRequest changeEmailVerificationRequest);

    deriveCodec<Verification> TuitionPaymentFragmentbindingInflater1(PhoneVerificationRequest phoneVerificationRequest);

    deriveCodec<VerificationSignatureItem> TuitionPaymentFragmentbindingInflater1(VerificationOtpRequest verificationOtpRequest);

    deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    deriveCodec<Verification> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChangeDataFirstVerificationRequest changeDataFirstVerificationRequest);

    deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ChangePhoneNumberRequest changePhoneNumberRequest);

    deriveCodec<KeyResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(KeyRequest keyRequest);

    deriveCodec<VerificationSignatureItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(VerificationOtpRequest verificationOtpRequest);

    deriveCodec<VerificationSignatureItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(VerificationOtpRequest verificationOtpRequest);

    deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AddKpjRequest addKpjRequest);

    deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChangeEmailRequest changeEmailRequest);

    deriveCodec<String> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ChangeProfilePictureRequest changeProfilePictureRequest);

    deriveCodec<Verification> b(ChangeDataFirstVerificationRequest changeDataFirstVerificationRequest);

    deriveCodec<BaseItem> b(ChangeEmailRequest changeEmailRequest);

    deriveCodec<Verification> b(ChangeEmailVerificationRequest changeEmailVerificationRequest);

    deriveCodec<Verification> b(ChangeHandphoneVerificationRequest changeHandphoneVerificationRequest);

    deriveCodec<BaseModel> b(ChangePasswordRequest changePasswordRequest);

    deriveCodec<BaseModel> b(ChangePhoneNumberRequest changePhoneNumberRequest);

    deriveCodec<VerificationSignatureItem> b(VerificationOtpRequest verificationOtpRequest);
}
