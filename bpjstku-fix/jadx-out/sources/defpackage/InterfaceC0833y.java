package defpackage;

import android.content.Context;
import com.bpjstku.data.asik.model.request.AccountBankRequest;
import com.bpjstku.data.asik.model.request.AsikDocumentRequest;
import com.bpjstku.data.asik.model.request.AsikFirstStepRequest;
import com.bpjstku.data.asik.model.request.AsikListFamilyRequest;
import com.bpjstku.data.asik.model.request.AsikListKpjMobileRequest;
import com.bpjstku.data.asik.model.request.AsikListKpjRequest;
import com.bpjstku.data.asik.model.request.AsikRequest;
import com.bpjstku.data.asik.model.request.AsikVerificationLivenessBegin;
import com.bpjstku.data.asik.model.request.AsikVerificationLivenessOnly;
import com.bpjstku.data.asik.model.request.AsikVerificationStepRequest;
import com.bpjstku.data.asik.model.request.CheckSubmissionRequest;
import com.bpjstku.data.asik.model.request.OtpByEmailRequest;
import com.bpjstku.data.asik.model.request.OtpByPhoneRequest;
import com.bpjstku.data.asik.model.request.VerifyOtpAsikRequest;
import com.bpjstku.data.asik.model.response.AccountBankItem;
import com.bpjstku.data.asik.model.response.AddressPostalCodeItem;
import com.bpjstku.data.asik.model.response.AsikListFamilyItem;
import com.bpjstku.data.asik.model.response.AsikVerifivationLivenessOnlyResponse;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.domain.asik.model.Asik;
import com.bpjstku.domain.asik.model.AsikListKpj;
import com.bpjstku.domain.asik.model.AsikListKpjMobile;
import com.bpjstku.domain.asik.model.OtpAsik;
import com.bpjstku.domain.asik.model.SubmissionCheckItem;
import com.bpjstku.domain.general.model.CodeNamePair;
import java.util.List;

/* JADX INFO: renamed from: y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0833y {
    SubmissionCheckItem TuitionPaymentFragmentbindingInflater1();

    deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentbindingInflater1(Context context);

    deriveCodec<List<AsikListFamilyItem>> TuitionPaymentFragmentbindingInflater1(AsikListFamilyRequest asikListFamilyRequest);

    deriveCodec<List<AsikListKpj>> TuitionPaymentFragmentbindingInflater1(AsikListKpjRequest asikListKpjRequest);

    deriveCodec<AsikVerifivationLivenessOnlyResponse> TuitionPaymentFragmentbindingInflater1(AsikVerificationLivenessOnly asikVerificationLivenessOnly);

    deriveCodec<BaseItem> TuitionPaymentFragmentbindingInflater1(AsikVerificationStepRequest asikVerificationStepRequest);

    deriveCodec<List<AddressPostalCodeItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context);

    deriveCodec<AccountBankItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(AccountBankRequest accountBankRequest);

    deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikFirstStepRequest asikFirstStepRequest);

    deriveCodec<List<AsikListKpjMobile>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(AsikListKpjMobileRequest asikListKpjMobileRequest);

    deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(AsikVerificationStepRequest asikVerificationStepRequest);

    deriveCodec<SubmissionCheckItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckSubmissionRequest checkSubmissionRequest);

    deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AsikVerificationStepRequest asikVerificationStepRequest);

    deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(VerifyOtpAsikRequest verifyOtpAsikRequest);

    deriveCodec<Asik> b(AsikRequest asikRequest, AsikDocumentRequest asikDocumentRequest);

    deriveCodec<AsikVerifivationLivenessOnlyResponse> b(AsikVerificationLivenessBegin asikVerificationLivenessBegin);

    deriveCodec<OtpAsik> b(OtpByEmailRequest otpByEmailRequest);

    deriveCodec<OtpAsik> b(OtpByPhoneRequest otpByPhoneRequest);

    deriveCodec<BaseItem> b(VerifyOtpAsikRequest verifyOtpAsikRequest);
}
