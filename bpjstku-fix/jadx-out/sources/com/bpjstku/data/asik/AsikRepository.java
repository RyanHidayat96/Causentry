package com.bpjstku.data.asik;

import com.bpjstku.data.asik.model.request.AccountBankRequest;
import com.bpjstku.data.asik.model.request.AsikDocumentRequest;
import com.bpjstku.data.asik.model.request.AsikFirstStepRequest;
import com.bpjstku.data.asik.model.request.AsikListFamilyRequest;
import com.bpjstku.data.asik.model.request.AsikListKpjMobileRequest;
import com.bpjstku.data.asik.model.request.AsikListKpjRequest;
import com.bpjstku.data.asik.model.request.AsikRequest;
import com.bpjstku.data.asik.model.request.AsikVerificationEkyc;
import com.bpjstku.data.asik.model.request.AsikVerificationLivenessBegin;
import com.bpjstku.data.asik.model.request.AsikVerificationLivenessOnly;
import com.bpjstku.data.asik.model.request.AsikVerificationStepRequest;
import com.bpjstku.data.asik.model.request.CheckSubmissionRequest;
import com.bpjstku.data.asik.model.request.EmployeeDataRequest;
import com.bpjstku.data.asik.model.request.OtpByEmailRequest;
import com.bpjstku.data.asik.model.request.OtpByPhoneRequest;
import com.bpjstku.data.asik.model.request.VerifyOtpAsikRequest;
import com.bpjstku.data.asik.model.response.AccountBankItem;
import com.bpjstku.data.asik.model.response.AddressPostalCodeItem;
import com.bpjstku.data.asik.model.response.AsikItem;
import com.bpjstku.data.asik.model.response.AsikListFamilyItem;
import com.bpjstku.data.asik.model.response.AsikListKpjItem;
import com.bpjstku.data.asik.model.response.AsikListKpjMobileItem;
import com.bpjstku.data.asik.model.response.AsikVerifivationLivenessOnlyResponse;
import com.bpjstku.data.asik.model.response.EmployeeFamilyItem;
import com.bpjstku.data.asik.model.response.EmployeeItem;
import com.bpjstku.data.asik.model.response.EmployeeKpjItem;
import com.bpjstku.data.asik.model.response.MaritalStatusItem;
import com.bpjstku.data.asik.model.response.OtpRequestItem;
import com.bpjstku.data.asik.model.response.SubmissionRequestItem;
import com.bpjstku.data.lib.model.BaseItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\u0006\u0010\b\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u00022\u0006\u0010\b\u001a\u00020\u0013H'¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00030\u00022\u0006\u0010\b\u001a\u00020\u0013H'¢\u0006\u0004\b\u001a\u0010\u0016J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\u0006\u0010\b\u001a\u00020\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\u0006\u0010\b\u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u00020\"H'¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u00020\"H'¢\u0006\u0004\b%\u0010$J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00022\u0006\u0010\b\u001a\u00020&H'¢\u0006\u0004\b(\u0010)J#\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00030\u00022\u0006\u0010\b\u001a\u00020*H'¢\u0006\u0004\b,\u0010-J#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u00022\u0006\u0010\b\u001a\u00020.H'¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u000203H'¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u000206H'¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u000206H'¢\u0006\u0004\b9\u00108J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u000206H'¢\u0006\u0004\b:\u00108J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u000206H'¢\u0006\u0004\b;\u00108J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00022\u0006\u0010\b\u001a\u00020<H'¢\u0006\u0004\b>\u0010?J\u001b\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00030\u0002H'¢\u0006\u0004\bA\u0010\u0006J#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00030\u00022\u0006\u0010\b\u001a\u00020BH'¢\u0006\u0004\bD\u0010EJ\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00022\u0006\u0010\b\u001a\u00020FH'¢\u0006\u0004\bH\u0010IJ\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020G0\u00022\u0006\u0010\b\u001a\u00020JH'¢\u0006\u0004\bK\u0010Lø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/asik/AsikRepository;", "LgetChildrenOutConfigs;", "LderiveCodec;", "", "Lcom/bpjstku/data/asik/model/response/MaritalStatusItem;", "getMaritalStatus", "()LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikRequest;", "p0", "Lcom/bpjstku/data/asik/model/response/AsikItem;", "insertAsik", "(Lcom/bpjstku/data/asik/model/request/AsikRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikDocumentRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "documentAsik", "(Lcom/bpjstku/data/asik/model/request/AsikDocumentRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationEkyc;", "verifEkyc", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationEkyc;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/EmployeeDataRequest;", "Lcom/bpjstku/data/asik/model/response/EmployeeItem;", "employeeData", "(Lcom/bpjstku/data/asik/model/request/EmployeeDataRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/response/EmployeeKpjItem;", "employeeKpj", "Lcom/bpjstku/data/asik/model/response/EmployeeFamilyItem;", "employeeFamily", "Lcom/bpjstku/data/asik/model/request/OtpByEmailRequest;", "Lcom/bpjstku/data/asik/model/response/OtpRequestItem;", "postOtpByEmailRequest", "(Lcom/bpjstku/data/asik/model/request/OtpByEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/OtpByPhoneRequest;", "postOtpByPhoneRequest", "(Lcom/bpjstku/data/asik/model/request/OtpByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/VerifyOtpAsikRequest;", "verifyOtpAsikByEmailRequest", "(Lcom/bpjstku/data/asik/model/request/VerifyOtpAsikRequest;)LderiveCodec;", "verifyOtpAsikByPhoneRequest", "Lcom/bpjstku/data/asik/model/request/CheckSubmissionRequest;", "Lcom/bpjstku/data/asik/model/response/SubmissionRequestItem;", "checkSubmissionAsik", "(Lcom/bpjstku/data/asik/model/request/CheckSubmissionRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikListKpjRequest;", "Lcom/bpjstku/data/asik/model/response/AsikListKpjItem;", "getListKpj", "(Lcom/bpjstku/data/asik/model/request/AsikListKpjRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikListFamilyRequest;", "", "Lcom/bpjstku/data/asik/model/response/AsikListFamilyItem;", "getListFamily", "(Lcom/bpjstku/data/asik/model/request/AsikListFamilyRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikFirstStepRequest;", "verifyAsikFirstStep", "(Lcom/bpjstku/data/asik/model/request/AsikFirstStepRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationStepRequest;", "verifyAsikSecondStep", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationStepRequest;)LderiveCodec;", "verifyAsikFifthStep", "verifyAsikFourStep", "verifyAsikSixthStep", "Lcom/bpjstku/data/asik/model/request/AccountBankRequest;", "Lcom/bpjstku/data/asik/model/response/AccountBankItem;", "getAccountBank", "(Lcom/bpjstku/data/asik/model/request/AccountBankRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/response/AddressPostalCodeItem;", "addressPostalCode", "Lcom/bpjstku/data/asik/model/request/AsikListKpjMobileRequest;", "Lcom/bpjstku/data/asik/model/response/AsikListKpjMobileItem;", "getListKpjMobile", "(Lcom/bpjstku/data/asik/model/request/AsikListKpjMobileRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessOnly;", "Lcom/bpjstku/data/asik/model/response/AsikVerifivationLivenessOnlyResponse;", "verifyAsikLivenessOnly", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessOnly;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessBegin;", "verifyAsikLivenessBegin", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessBegin;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AsikRepository extends getChildrenOutConfigs {
    deriveCodec<List<AddressPostalCodeItem>> addressPostalCode();

    deriveCodec<SubmissionRequestItem> checkSubmissionAsik(CheckSubmissionRequest p0);

    deriveCodec<BaseItem> documentAsik(AsikDocumentRequest p0);

    deriveCodec<EmployeeItem> employeeData(EmployeeDataRequest p0);

    deriveCodec<List<EmployeeFamilyItem>> employeeFamily(EmployeeDataRequest p0);

    deriveCodec<List<EmployeeKpjItem>> employeeKpj(EmployeeDataRequest p0);

    deriveCodec<AccountBankItem> getAccountBank(AccountBankRequest p0);

    deriveCodec<List<AsikListFamilyItem>> getListFamily(AsikListFamilyRequest p0);

    deriveCodec<List<AsikListKpjItem>> getListKpj(AsikListKpjRequest p0);

    deriveCodec<List<AsikListKpjMobileItem>> getListKpjMobile(AsikListKpjMobileRequest p0);

    deriveCodec<List<MaritalStatusItem>> getMaritalStatus();

    deriveCodec<AsikItem> insertAsik(AsikRequest p0);

    deriveCodec<OtpRequestItem> postOtpByEmailRequest(OtpByEmailRequest p0);

    deriveCodec<OtpRequestItem> postOtpByPhoneRequest(OtpByPhoneRequest p0);

    deriveCodec<BaseItem> verifEkyc(AsikVerificationEkyc p0);

    deriveCodec<BaseItem> verifyAsikFifthStep(AsikVerificationStepRequest p0);

    deriveCodec<BaseItem> verifyAsikFirstStep(AsikFirstStepRequest p0);

    deriveCodec<BaseItem> verifyAsikFourStep(AsikVerificationStepRequest p0);

    deriveCodec<AsikVerifivationLivenessOnlyResponse> verifyAsikLivenessBegin(AsikVerificationLivenessBegin p0);

    deriveCodec<AsikVerifivationLivenessOnlyResponse> verifyAsikLivenessOnly(AsikVerificationLivenessOnly p0);

    deriveCodec<BaseItem> verifyAsikSecondStep(AsikVerificationStepRequest p0);

    deriveCodec<BaseItem> verifyAsikSixthStep(AsikVerificationStepRequest p0);

    deriveCodec<BaseItem> verifyOtpAsikByEmailRequest(VerifyOtpAsikRequest p0);

    deriveCodec<BaseItem> verifyOtpAsikByPhoneRequest(VerifyOtpAsikRequest p0);
}
