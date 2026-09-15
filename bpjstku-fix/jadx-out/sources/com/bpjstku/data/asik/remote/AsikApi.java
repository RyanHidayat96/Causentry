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
import defpackage.unbindChildren;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001a\u0010\u0016J#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u001fH\u0017¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\u0006\u0010\u0003\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\u0006\u0010\u0003\u001a\u00020\"H\u0017¢\u0006\u0004\b%\u0010$J#\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00070\u00062\u0006\u0010\u0003\u001a\u00020&H\u0017¢\u0006\u0004\b(\u0010)J#\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00070\u00062\u0006\u0010\u0003\u001a\u00020*H\u0017¢\u0006\u0004\b,\u0010-J#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00070\u00062\u0006\u0010\u0003\u001a\u00020.H\u0017¢\u0006\u0004\b0\u00101JD\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\u001b\b\u0001\u0010\u0003\u001a\u0015\u0012\u0004\u0012\u000203\u0012\t\u0012\u000704¢\u0006\u0002\b5\u0018\u0001022\n\b\u0001\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b8\u00109J#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\u0006\u0010\u0003\u001a\u00020:H\u0017¢\u0006\u0004\b;\u0010<J#\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\u0006\u0010\u0003\u001a\u00020=H\u0017¢\u0006\u0004\b>\u0010?J#\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\u0006\u0010\u0003\u001a\u00020=H\u0017¢\u0006\u0004\b@\u0010?J#\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\u0006\u0010\u0003\u001a\u00020=H\u0017¢\u0006\u0004\bA\u0010?J\u001b\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00070\u0006H\u0017¢\u0006\u0004\bC\u0010\nJ#\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\u00070\u00062\u0006\u0010\u0003\u001a\u00020DH\u0017¢\u0006\u0004\bF\u0010GJ#\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u00070\u00062\u0006\u0010\u0003\u001a\u00020HH\u0017¢\u0006\u0004\bJ\u0010KJ#\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u00070\u00062\u0006\u0010\u0003\u001a\u00020LH\u0017¢\u0006\u0004\bM\u0010NJ#\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00062\u0006\u0010\u0003\u001a\u00020=H\u0017¢\u0006\u0004\bO\u0010?J#\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u00070\u00062\u0006\u0010\u0003\u001a\u00020PH\u0017¢\u0006\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010U"}, d2 = {"Lcom/bpjstku/data/asik/remote/AsikApi;", "LunbindChildren;", "Lcom/bpjstku/data/asik/remote/AsikApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/asik/remote/AsikApiClient;)V", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/asik/model/response/MaritalStatusResponse;", "getMaritalStatus", "()LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikRequest;", "Lcom/bpjstku/data/asik/model/response/AsikItem;", "insertAsik", "(Lcom/bpjstku/data/asik/model/request/AsikRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikDocumentRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "documentAsik", "(Lcom/bpjstku/data/asik/model/request/AsikDocumentRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/EmployeeDataRequest;", "Lcom/bpjstku/data/asik/model/response/EmployeeItem;", "employeeData", "(Lcom/bpjstku/data/asik/model/request/EmployeeDataRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/response/EmployeeKpjResponse;", "employeeKpj", "Lcom/bpjstku/data/asik/model/response/EmployeeFamilyResponse;", "employeeFamily", "Lcom/bpjstku/data/asik/model/request/OtpByEmailRequest;", "Lcom/bpjstku/data/asik/model/response/OtpRequestItem;", "postGetOtpByEmail", "(Lcom/bpjstku/data/asik/model/request/OtpByEmailRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/OtpByPhoneRequest;", "postGetOtpByHandphone", "(Lcom/bpjstku/data/asik/model/request/OtpByPhoneRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/VerifyOtpAsikRequest;", "verifyPhoneOtpAsikRequest", "(Lcom/bpjstku/data/asik/model/request/VerifyOtpAsikRequest;)LderiveCodec;", "verifyEmailOtpAsikRequest", "Lcom/bpjstku/data/asik/model/request/CheckSubmissionRequest;", "Lcom/bpjstku/data/asik/model/response/SubmissionRequestResponse;", "checkSubmissionAsik", "(Lcom/bpjstku/data/asik/model/request/CheckSubmissionRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikListKpjRequest;", "Lcom/bpjstku/data/asik/model/response/AsikListKpjResponse;", "getListKpj", "(Lcom/bpjstku/data/asik/model/request/AsikListKpjRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikListFamilyRequest;", "Lcom/bpjstku/data/asik/model/response/AsikListFamilyResponse;", "getListFamily", "(Lcom/bpjstku/data/asik/model/request/AsikListFamilyRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lokhttp3/MultipartBody$Part;", "p1", "verifEkyc", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikFirstStepRequest;", "verifyAsikFirstStep", "(Lcom/bpjstku/data/asik/model/request/AsikFirstStepRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationStepRequest;", "verifyAsikSecondStep", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationStepRequest;)LderiveCodec;", "verifyAsikFifthStep", "verifyAsikSixthStep", "Lcom/bpjstku/data/asik/model/response/AddressPostalCodeResponse;", "addressPostalCode", "Lcom/bpjstku/data/asik/model/request/AsikListKpjMobileRequest;", "Lcom/bpjstku/data/asik/model/response/AsikListKpjMobileResponse;", "getListKpjMobile", "(Lcom/bpjstku/data/asik/model/request/AsikListKpjMobileRequest;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessOnly;", "Lcom/bpjstku/data/asik/model/response/AsikVerifivationLivenessOnlyResponse;", "verifyAsikLivenessOnly", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessOnly;)LderiveCodec;", "Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessBegin;", "verifyAsikLivenessBegin", "(Lcom/bpjstku/data/asik/model/request/AsikVerificationLivenessBegin;)LderiveCodec;", "verifyAsikFourStep", "Lcom/bpjstku/data/asik/model/request/AccountBankRequest;", "Lcom/bpjstku/data/asik/model/response/AccountBankResponse;", "getAccountBank", "(Lcom/bpjstku/data/asik/model/request/AccountBankRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/asik/remote/AsikApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AsikApi implements unbindChildren, AsikApiClient {
    public static final int $stable = 8;
    private final AsikApiClient apiClient;

    public AsikApi(AsikApiClient asikApiClient) {
        Intrinsics.checkNotNullParameter(asikApiClient, "");
        this.apiClient = asikApiClient;
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<MaritalStatusResponse>> getMaritalStatus() {
        return this.apiClient.getMaritalStatus();
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<AsikItem>> insertAsik(AsikRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.insertAsik(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<BaseItem>> documentAsik(AsikDocumentRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.documentAsik(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<EmployeeItem>> employeeData(EmployeeDataRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.employeeData(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<EmployeeKpjResponse>> employeeKpj(EmployeeDataRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.employeeKpj(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<EmployeeFamilyResponse>> employeeFamily(EmployeeDataRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.employeeFamily(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<OtpRequestItem>> postGetOtpByEmail(OtpByEmailRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postGetOtpByEmail(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<OtpRequestItem>> postGetOtpByHandphone(OtpByPhoneRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postGetOtpByHandphone(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<BaseItem>> verifyPhoneOtpAsikRequest(VerifyOtpAsikRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyPhoneOtpAsikRequest(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<BaseItem>> verifyEmailOtpAsikRequest(VerifyOtpAsikRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyEmailOtpAsikRequest(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<SubmissionRequestResponse>> checkSubmissionAsik(CheckSubmissionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkSubmissionAsik(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<AsikListKpjResponse>> getListKpj(AsikListKpjRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getListKpj(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<AsikListFamilyResponse>> getListFamily(AsikListFamilyRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getListFamily(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<BaseItem>> verifEkyc(@PartMap Map<String, RequestBody> p0, @Part MultipartBody.Part p1) {
        return this.apiClient.verifEkyc(p0, p1);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<BaseItem>> verifyAsikFirstStep(AsikFirstStepRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyAsikFirstStep(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<BaseItem>> verifyAsikSecondStep(AsikVerificationStepRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyAsikSecondStep(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<BaseItem>> verifyAsikFifthStep(AsikVerificationStepRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyAsikFifthStep(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<BaseItem>> verifyAsikSixthStep(AsikVerificationStepRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyAsikSixthStep(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<AddressPostalCodeResponse>> addressPostalCode() {
        return this.apiClient.addressPostalCode();
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<AsikListKpjMobileResponse>> getListKpjMobile(AsikListKpjMobileRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getListKpjMobile(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<AsikVerifivationLivenessOnlyResponse>> verifyAsikLivenessOnly(AsikVerificationLivenessOnly p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyAsikLivenessOnly(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<AsikVerifivationLivenessOnlyResponse>> verifyAsikLivenessBegin(AsikVerificationLivenessBegin p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyAsikLivenessBegin(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<BaseItem>> verifyAsikFourStep(AsikVerificationStepRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyAsikFourStep(p0);
    }

    @Override // com.bpjstku.data.asik.remote.AsikApiClient
    public final deriveCodec<Response<AccountBankResponse>> getAccountBank(AccountBankRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getAccountBank(p0);
    }
}
