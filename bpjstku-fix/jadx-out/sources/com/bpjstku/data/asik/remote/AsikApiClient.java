package com.bpjstku.data.asik.remote;

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
import com.bpjstku.data.asik.model.request.EmployeeDataRequest;
import com.bpjstku.data.asik.model.request.OtpByEmailRequest;
import com.bpjstku.data.asik.model.request.OtpByPhoneRequest;
import com.bpjstku.data.asik.model.request.VerifyOtpAsikRequest;
import com.bpjstku.data.asik.model.response.AccountBankResponse;
import com.bpjstku.data.asik.model.response.AddressPostalCodeResponse;
import com.bpjstku.data.asik.model.response.AsikItem;
import com.bpjstku.data.asik.model.response.AsikListFamilyResponse;
import com.bpjstku.data.asik.model.response.AsikListKpjMobileResponse;
import com.bpjstku.data.asik.model.response.AsikListKpjResponse;
import com.bpjstku.data.asik.model.response.AsikVerifivationLivenessOnlyResponse;
import com.bpjstku.data.asik.model.response.EmployeeFamilyResponse;
import com.bpjstku.data.asik.model.response.EmployeeItem;
import com.bpjstku.data.asik.model.response.EmployeeKpjResponse;
import com.bpjstku.data.asik.model.response.MaritalStatusResponse;
import com.bpjstku.data.asik.model.response.OtpRequestItem;
import com.bpjstku.data.asik.model.response.SubmissionRequestResponse;
import com.bpjstku.data.lib.model.BaseItem;
import defpackage.deriveCodec;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0010H'¢\u0006\u0004\b\u0015\u0010\u0013J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0010H'¢\u0006\u0004\b\u0017\u0010\u0013J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u001cH'¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u001fH'¢\u0006\u0004\b\"\u0010!J%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J%\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020'H'¢\u0006\u0004\b)\u0010*J%\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020+H'¢\u0006\u0004\b-\u0010.JD\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00022\u001b\b\u0001\u0010\b\u001a\u0015\u0012\u0004\u0012\u000200\u0012\t\u0012\u000701¢\u0006\u0002\b2\u0018\u00010/2\n\b\u0001\u00104\u001a\u0004\u0018\u000103H'¢\u0006\u0004\b5\u00106J%\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00022\b\b\u0001\u0010\b\u001a\u000207H'¢\u0006\u0004\b8\u00109J%\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020:H'¢\u0006\u0004\b;\u0010<J%\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020:H'¢\u0006\u0004\b=\u0010<J%\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020>H'¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020:H'¢\u0006\u0004\bB\u0010<J%\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020:H'¢\u0006\u0004\bC\u0010<J\u001b\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u00030\u0002H'¢\u0006\u0004\bE\u0010\u0006J%\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020FH'¢\u0006\u0004\bH\u0010IJ%\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020JH'¢\u0006\u0004\bL\u0010MJ%\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020NH'¢\u0006\u0004\bO\u0010Pø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/asik/remote/AsikApiClient;", "", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/asik/model/response/MaritalStatusResponse;", "getMaritalStatus", "()LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikRequest;", "p0", "Lcom/bpjstku/data/asik/model/response/AsikItem;", "insertAsik", "(Lcom/bpjstku/data/asik/model/request/AsikRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikDocumentRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "documentAsik", "(Lcom/bpjstku/data/asik/model/request/AsikDocumentRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/EmployeeDataRequest;", "Lcom/bpjstku/data/asik/model/response/EmployeeItem;", "employeeData", "(Lcom/bpjstku/data/asik/model/request/EmployeeDataRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/response/EmployeeKpjResponse;", "employeeKpj", "Lcom/bpjstku/data/asik/model/response/EmployeeFamilyResponse;", "employeeFamily", "Lcom/bpjstku/data/asik/model/request/OtpByEmailRequest;", "Lcom/bpjstku/data/asik/model/response/OtpRequestItem;", "postGetOtpByEmail", "(Lcom/bpjstku/data/asik/model/request/OtpByEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/OtpByPhoneRequest;", "postGetOtpByHandphone", "(Lcom/bpjstku/data/asik/model/request/OtpByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/VerifyOtpAsikRequest;", "verifyPhoneOtpAsikRequest", "(Lcom/bpjstku/data/asik/model/request/VerifyOtpAsikRequest;)LderiveCodec;", "verifyEmailOtpAsikRequest", "Lcom/bpjstku/data/asik/model/request/CheckSubmissionRequest;", "Lcom/bpjstku/data/asik/model/response/SubmissionRequestResponse;", "checkSubmissionAsik", "(Lcom/bpjstku/data/asik/model/request/CheckSubmissionRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikListKpjRequest;", "Lcom/bpjstku/data/asik/model/response/AsikListKpjResponse;", "getListKpj", "(Lcom/bpjstku/data/asik/model/request/AsikListKpjRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikListFamilyRequest;", "Lcom/bpjstku/data/asik/model/response/AsikListFamilyResponse;", "getListFamily", "(Lcom/bpjstku/data/asik/model/request/AsikListFamilyRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p1", "verifEkyc", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikFirstStepRequest;", "verifyAsikFirstStep", "(Lcom/bpjstku/data/asik/model/request/AsikFirstStepRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationStepRequest;", "verifyAsikSecondStep", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationStepRequest;)LderiveCodec;", "verifyAsikFifthStep", "Lcom/bpjstku/data/asik/model/request/AccountBankRequest;", "Lcom/bpjstku/data/asik/model/response/AccountBankResponse;", "getAccountBank", "(Lcom/bpjstku/data/asik/model/request/AccountBankRequest;)LderiveCodec;", "verifyAsikFourStep", "verifyAsikSixthStep", "Lcom/bpjstku/data/asik/model/response/AddressPostalCodeResponse;", "addressPostalCode", "Lcom/bpjstku/data/asik/model/request/AsikListKpjMobileRequest;", "Lcom/bpjstku/data/asik/model/response/AsikListKpjMobileResponse;", "getListKpjMobile", "(Lcom/bpjstku/data/asik/model/request/AsikListKpjMobileRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessOnly;", "Lcom/bpjstku/data/asik/model/response/AsikVerifivationLivenessOnlyResponse;", "verifyAsikLivenessOnly", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessOnly;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessBegin;", "verifyAsikLivenessBegin", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessBegin;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AsikApiClient {
    @GET("asik/get-address")
    deriveCodec<Response<AddressPostalCodeResponse>> addressPostalCode();

    @POST("asik/check-submission")
    deriveCodec<Response<SubmissionRequestResponse>> checkSubmissionAsik(@Body CheckSubmissionRequest p0);

    @POST("asik/update-document")
    deriveCodec<Response<BaseItem>> documentAsik(@Body AsikDocumentRequest p0);

    @POST("asik/employee")
    deriveCodec<Response<EmployeeItem>> employeeData(@Body EmployeeDataRequest p0);

    @POST("asik/employee/family")
    deriveCodec<Response<EmployeeFamilyResponse>> employeeFamily(@Body EmployeeDataRequest p0);

    @POST("asik/employee/kpj")
    deriveCodec<Response<EmployeeKpjResponse>> employeeKpj(@Body EmployeeDataRequest p0);

    @POST("asik/get-account-bank")
    deriveCodec<Response<AccountBankResponse>> getAccountBank(@Body AccountBankRequest p0);

    @POST("asik/get-family")
    deriveCodec<Response<AsikListFamilyResponse>> getListFamily(@Body AsikListFamilyRequest p0);

    @POST("asik/list-kpj")
    deriveCodec<Response<AsikListKpjResponse>> getListKpj(@Body AsikListKpjRequest p0);

    @POST("asik/list-kpj-mobile")
    deriveCodec<Response<AsikListKpjMobileResponse>> getListKpjMobile(@Body AsikListKpjMobileRequest p0);

    @GET("asik/marital-status")
    deriveCodec<Response<MaritalStatusResponse>> getMaritalStatus();

    @POST("asik/insert")
    deriveCodec<Response<AsikItem>> insertAsik(@Body AsikRequest p0);

    @POST("asik/otp/email")
    deriveCodec<Response<OtpRequestItem>> postGetOtpByEmail(@Body OtpByEmailRequest p0);

    @POST("asik/otp/handphone")
    deriveCodec<Response<OtpRequestItem>> postGetOtpByHandphone(@Body OtpByPhoneRequest p0);

    @POST("asik/verification-ekyc-with-liveness")
    @Multipart
    deriveCodec<Response<BaseItem>> verifEkyc(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1);

    @POST("asik/verification-step-five")
    deriveCodec<Response<BaseItem>> verifyAsikFifthStep(@Body AsikVerificationStepRequest p0);

    @POST("asik/verification-step-one")
    deriveCodec<Response<BaseItem>> verifyAsikFirstStep(@Body AsikFirstStepRequest p0);

    @POST("asik/verification-step-four")
    deriveCodec<Response<BaseItem>> verifyAsikFourStep(@Body AsikVerificationStepRequest p0);

    @POST("asik/verification-ekyc-liveness-begin")
    deriveCodec<Response<AsikVerifivationLivenessOnlyResponse>> verifyAsikLivenessBegin(@Body AsikVerificationLivenessBegin p0);

    @POST("asik/verification-ekyc-liveness-end")
    deriveCodec<Response<AsikVerifivationLivenessOnlyResponse>> verifyAsikLivenessOnly(@Body AsikVerificationLivenessOnly p0);

    @POST("asik/verification-step-two")
    deriveCodec<Response<BaseItem>> verifyAsikSecondStep(@Body AsikVerificationStepRequest p0);

    @POST("asik/verification-step-six")
    deriveCodec<Response<BaseItem>> verifyAsikSixthStep(@Body AsikVerificationStepRequest p0);

    @POST("asik/otp/email/verification")
    deriveCodec<Response<BaseItem>> verifyEmailOtpAsikRequest(@Body VerifyOtpAsikRequest p0);

    @POST("asik/otp/handphone/verification")
    deriveCodec<Response<BaseItem>> verifyPhoneOtpAsikRequest(@Body VerifyOtpAsikRequest p0);
}
