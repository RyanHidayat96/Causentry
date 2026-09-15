package com.bpjstku.data.payment.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.payment.model.request.AuthOtpBriDirectDebitRequest;
import com.bpjstku.data.payment.model.request.CheckOneTimePaymentStatusRequest;
import com.bpjstku.data.payment.model.request.CheckRecurringStatusRequest;
import com.bpjstku.data.payment.model.request.CreateCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.CreateOneTimePaymentRequest;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodGeneralRequest;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodRequest;
import com.bpjstku.data.payment.model.request.CreatePaymentMethodWithDebitCard;
import com.bpjstku.data.payment.model.request.CreateRecurringPlanRequest;
import com.bpjstku.data.payment.model.request.EditCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.FlaggingRecurringRequest;
import com.bpjstku.data.payment.model.request.ForceExpirePaymentMethodRequest;
import com.bpjstku.data.payment.model.request.GetCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.GetListPaymentMethodRequest;
import com.bpjstku.data.payment.model.request.GetListSertakanAutodebetRequest;
import com.bpjstku.data.payment.model.request.InsertVasTxPaymentRequest;
import com.bpjstku.data.payment.model.request.NonactiveAutodebetRequest;
import com.bpjstku.data.payment.model.request.SubmitAutodebitBniAutopayRequest;
import com.bpjstku.data.payment.model.request.SubmitNonactiveAutodebitBniRequest;
import com.bpjstku.data.payment.model.request.VerifyOtpSubmitAutodebitBniRequest;
import com.bpjstku.data.payment.model.response.AuthOtpBriDirectDebitResponse;
import com.bpjstku.data.payment.model.response.CheckOneTimePaymentResponse;
import com.bpjstku.data.payment.model.response.CreateCustomerObjectResponse;
import com.bpjstku.data.payment.model.response.CreateOneTimePaymentResponse;
import com.bpjstku.data.payment.model.response.CreatePaymentMethodGeneralResponse;
import com.bpjstku.data.payment.model.response.CreatePaymentMethodResponse;
import com.bpjstku.data.payment.model.response.CreateRecurringPlanResponse;
import com.bpjstku.data.payment.model.response.EditCustomerObjectResponse;
import com.bpjstku.data.payment.model.response.ForceExpirePaymentMethodResponse;
import com.bpjstku.data.payment.model.response.GetCustomerObjectResponse;
import com.bpjstku.data.payment.model.response.GetListKodenonaktifAutodebitResponse;
import com.bpjstku.data.payment.model.response.GetListPaymentMethodResponse;
import com.bpjstku.data.payment.model.response.GetListSertakanAutodebetResponse;
import com.bpjstku.data.payment.model.response.GetStatusRecurringPlanResponse;
import com.bpjstku.data.payment.model.response.SubmitAutodebitBniAutopayResponse;
import com.bpjstku.data.payment.model.response.SubmitNonactiveAutodebetBniResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\b0\u00072\u0006\u0010\u0003\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b0\u00072\u0006\u0010\u0003\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\b0\u00072\u0006\u0010\u0003\u001a\u00020(H\u0017¢\u0006\u0004\b*\u0010+J#\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\b0\u00072\u0006\u0010\u0003\u001a\u00020,H\u0017¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0\u00072\u0006\u0010\u0003\u001a\u00020/H\u0017¢\u0006\u0004\b1\u00102J#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\b0\u00072\u0006\u0010\u0003\u001a\u000203H\u0017¢\u0006\u0004\b5\u00106J#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\b0\u00072\u0006\u0010\u0003\u001a\u000207H\u0017¢\u0006\u0004\b9\u0010:J#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\b0\u00072\u0006\u0010\u0003\u001a\u000207H\u0017¢\u0006\u0004\b;\u0010:J#\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\b0\u00072\u0006\u0010\u0003\u001a\u00020<H\u0017¢\u0006\u0004\b>\u0010?J#\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\b0\u00072\u0006\u0010\u0003\u001a\u00020@H\u0017¢\u0006\u0004\bA\u0010BJ#\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\b0\u00072\u0006\u0010\u0003\u001a\u00020CH\u0017¢\u0006\u0004\bE\u0010FJ#\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\b0\u00072\u0006\u0010\u0003\u001a\u00020GH\u0017¢\u0006\u0004\bH\u0010IJ\u001b\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\b0\u0007H\u0017¢\u0006\u0004\bK\u0010LJ#\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0\b0\u00072\u0006\u0010\u0003\u001a\u00020MH\u0017¢\u0006\u0004\bO\u0010PJ#\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\b0\u00072\u0006\u0010\u0003\u001a\u00020QH\u0017¢\u0006\u0004\bR\u0010SJ#\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\b0\u00072\u0006\u0010\u0003\u001a\u00020TH\u0017¢\u0006\u0004\bV\u0010WJ#\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\b0\u00072\u0006\u0010\u0003\u001a\u00020QH\u0017¢\u0006\u0004\bX\u0010SR\u0014\u0010Y\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bY\u0010Z"}, d2 = {"Lcom/bpjstku/data/payment/remote/PaymentApi;", "LunbindChildren;", "Lcom/bpjstku/data/payment/remote/PaymentApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/payment/remote/PaymentApiClient;)V", "Lcom/bpjstku/data/payment/model/request/GetCustomerObjectRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/payment/model/response/GetCustomerObjectResponse;", "getInfoCustomerObject", "(Lcom/bpjstku/data/payment/model/request/GetCustomerObjectRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;", "Lcom/bpjstku/data/payment/model/response/CreateCustomerObjectResponse;", "createCustomerObject", "(Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/CreatePaymentMethodResponse;", "createEwalletPaymentMethod", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;", "Lcom/bpjstku/data/payment/model/response/CreateRecurringPlanResponse;", "createRecurringPlan", "(Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;", "Lcom/bpjstku/data/payment/model/response/CreateOneTimePaymentResponse;", "createOneTimePayment", "(Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CheckOneTimePaymentStatusRequest;", "Lcom/bpjstku/data/payment/model/response/CheckOneTimePaymentResponse;", "checkOneTimePayment", "(Lcom/bpjstku/data/payment/model/request/CheckOneTimePaymentStatusRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;", "Lcom/bpjstku/data/payment/model/response/GetStatusRecurringPlanResponse;", "checkRecurringStatus", "(Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodGeneralRequest;", "Lcom/bpjstku/data/payment/model/response/CreatePaymentMethodGeneralResponse;", "createMandiriDDRecurring", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodGeneralRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/GetListPaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/GetListPaymentMethodResponse;", "getListPaymentMethod", "(Lcom/bpjstku/data/payment/model/request/GetListPaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;", "createBriDDRecurring", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;", "Lcom/bpjstku/data/payment/model/response/AuthOtpBriDirectDebitResponse;", "authOtpBriRecurring", "(Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/ForceExpirePaymentMethodResponse;", "forceExpirePaymentMethod", "(Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/EditCustomerObjectRequest;", "Lcom/bpjstku/data/payment/model/response/EditCustomerObjectResponse;", "editCustomerObject", "(Lcom/bpjstku/data/payment/model/request/EditCustomerObjectRequest;)LderiveCodec;", "modifyCustomerObject", "Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "InsertVasTxPayment", "(Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/FlaggingRecurringRequest;", "flaggingRecurring", "(Lcom/bpjstku/data/payment/model/request/FlaggingRecurringRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;", "Lcom/bpjstku/data/payment/model/response/GetListSertakanAutodebetResponse;", "getListSertakanAutodebet", "(Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;", "nonactiveAutodebit", "(Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/response/GetListKodenonaktifAutodebitResponse;", "kodeNonactiveAutodebit", "()LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;", "Lcom/bpjstku/data/payment/model/response/SubmitAutodebitBniAutopayResponse;", "insertProfilAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;", "verifyOtpInsertAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/SubmitNonactiveAutodebitBniRequest;", "Lcom/bpjstku/data/payment/model/response/SubmitNonactiveAutodebetBniResponse;", "submitNonaktifAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/SubmitNonactiveAutodebitBniRequest;)LderiveCodec;", "verifyOtpNonactiveAutodebetBni", "apiClient", "Lcom/bpjstku/data/payment/remote/PaymentApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentApi implements unbindChildren, PaymentApiClient {
    public static final int $stable = 8;
    private final PaymentApiClient apiClient;

    public PaymentApi(PaymentApiClient paymentApiClient) {
        Intrinsics.checkNotNullParameter(paymentApiClient, "");
        this.apiClient = paymentApiClient;
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<GetCustomerObjectResponse>> getInfoCustomerObject(GetCustomerObjectRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getInfoCustomerObject(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<CreateCustomerObjectResponse>> createCustomerObject(CreateCustomerObjectRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.createCustomerObject(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<CreatePaymentMethodResponse>> createEwalletPaymentMethod(CreatePaymentMethodRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.createEwalletPaymentMethod(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<CreateRecurringPlanResponse>> createRecurringPlan(CreateRecurringPlanRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.createRecurringPlan(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<CreateOneTimePaymentResponse>> createOneTimePayment(CreateOneTimePaymentRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.createOneTimePayment(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<CheckOneTimePaymentResponse>> checkOneTimePayment(CheckOneTimePaymentStatusRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkOneTimePayment(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<GetStatusRecurringPlanResponse>> checkRecurringStatus(CheckRecurringStatusRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkRecurringStatus(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<CreatePaymentMethodGeneralResponse>> createMandiriDDRecurring(CreatePaymentMethodGeneralRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.createMandiriDDRecurring(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<GetListPaymentMethodResponse>> getListPaymentMethod(GetListPaymentMethodRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getListPaymentMethod(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<CreatePaymentMethodGeneralResponse>> createBriDDRecurring(CreatePaymentMethodWithDebitCard p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.createBriDDRecurring(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<AuthOtpBriDirectDebitResponse>> authOtpBriRecurring(AuthOtpBriDirectDebitRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.authOtpBriRecurring(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<ForceExpirePaymentMethodResponse>> forceExpirePaymentMethod(ForceExpirePaymentMethodRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.forceExpirePaymentMethod(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<EditCustomerObjectResponse>> editCustomerObject(EditCustomerObjectRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.editCustomerObject(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<EditCustomerObjectResponse>> modifyCustomerObject(EditCustomerObjectRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.modifyCustomerObject(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<BaseItem>> InsertVasTxPayment(InsertVasTxPaymentRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.InsertVasTxPayment(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<BaseItem>> flaggingRecurring(FlaggingRecurringRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.flaggingRecurring(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<GetListSertakanAutodebetResponse>> getListSertakanAutodebet(GetListSertakanAutodebetRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getListSertakanAutodebet(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<BaseItem>> nonactiveAutodebit(NonactiveAutodebetRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.nonactiveAutodebit(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<GetListKodenonaktifAutodebitResponse>> kodeNonactiveAutodebit() {
        return this.apiClient.kodeNonactiveAutodebit();
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<SubmitAutodebitBniAutopayResponse>> insertProfilAutodebetBni(SubmitAutodebitBniAutopayRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.insertProfilAutodebetBni(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<BaseItem>> verifyOtpInsertAutodebetBni(VerifyOtpSubmitAutodebitBniRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyOtpInsertAutodebetBni(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<SubmitNonactiveAutodebetBniResponse>> submitNonaktifAutodebetBni(SubmitNonactiveAutodebitBniRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.submitNonaktifAutodebetBni(p0);
    }

    @Override // com.bpjstku.data.payment.remote.PaymentApiClient
    public final deriveCodec<Response<BaseItem>> verifyOtpNonactiveAutodebetBni(VerifyOtpSubmitAutodebitBniRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verifyOtpNonactiveAutodebetBni(p0);
    }
}
