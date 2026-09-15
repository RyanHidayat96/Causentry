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
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\b'\u0010(J%\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020)H'¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020,H'¢\u0006\u0004\b.\u0010/J%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000200H'¢\u0006\u0004\b2\u00103J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000204H'¢\u0006\u0004\b6\u00107J%\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000204H'¢\u0006\u0004\b8\u00107J%\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000209H'¢\u0006\u0004\b;\u0010<J%\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020=H'¢\u0006\u0004\b>\u0010?J%\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020@H'¢\u0006\u0004\bB\u0010CJ%\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020DH'¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\u00050\u0004H'¢\u0006\u0004\bH\u0010IJ%\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020JH'¢\u0006\u0004\bL\u0010MJ%\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020NH'¢\u0006\u0004\bO\u0010PJ%\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020QH'¢\u0006\u0004\bS\u0010TJ%\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020NH'¢\u0006\u0004\bU\u0010Pø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/payment/remote/PaymentApiClient;", "", "Lcom/bpjstku/data/payment/model/request/GetCustomerObjectRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/payment/model/response/GetCustomerObjectResponse;", "getInfoCustomerObject", "(Lcom/bpjstku/data/payment/model/request/GetCustomerObjectRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;", "Lcom/bpjstku/data/payment/model/response/CreateCustomerObjectResponse;", "createCustomerObject", "(Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/CreatePaymentMethodResponse;", "createEwalletPaymentMethod", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;", "Lcom/bpjstku/data/payment/model/response/CreateRecurringPlanResponse;", "createRecurringPlan", "(Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;", "Lcom/bpjstku/data/payment/model/response/CreateOneTimePaymentResponse;", "createOneTimePayment", "(Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CheckOneTimePaymentStatusRequest;", "Lcom/bpjstku/data/payment/model/response/CheckOneTimePaymentResponse;", "checkOneTimePayment", "(Lcom/bpjstku/data/payment/model/request/CheckOneTimePaymentStatusRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;", "Lcom/bpjstku/data/payment/model/response/GetStatusRecurringPlanResponse;", "checkRecurringStatus", "(Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodGeneralRequest;", "Lcom/bpjstku/data/payment/model/response/CreatePaymentMethodGeneralResponse;", "createMandiriDDRecurring", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodGeneralRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/GetListPaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/GetListPaymentMethodResponse;", "getListPaymentMethod", "(Lcom/bpjstku/data/payment/model/request/GetListPaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;", "createBriDDRecurring", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;", "Lcom/bpjstku/data/payment/model/response/AuthOtpBriDirectDebitResponse;", "authOtpBriRecurring", "(Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/ForceExpirePaymentMethodResponse;", "forceExpirePaymentMethod", "(Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/EditCustomerObjectRequest;", "Lcom/bpjstku/data/payment/model/response/EditCustomerObjectResponse;", "editCustomerObject", "(Lcom/bpjstku/data/payment/model/request/EditCustomerObjectRequest;)LderiveCodec;", "modifyCustomerObject", "Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "InsertVasTxPayment", "(Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/FlaggingRecurringRequest;", "flaggingRecurring", "(Lcom/bpjstku/data/payment/model/request/FlaggingRecurringRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;", "Lcom/bpjstku/data/payment/model/response/GetListSertakanAutodebetResponse;", "getListSertakanAutodebet", "(Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;", "nonactiveAutodebit", "(Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/response/GetListKodenonaktifAutodebitResponse;", "kodeNonactiveAutodebit", "()LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;", "Lcom/bpjstku/data/payment/model/response/SubmitAutodebitBniAutopayResponse;", "insertProfilAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;", "verifyOtpInsertAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/SubmitNonactiveAutodebitBniRequest;", "Lcom/bpjstku/data/payment/model/response/SubmitNonactiveAutodebetBniResponse;", "submitNonaktifAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/SubmitNonactiveAutodebitBniRequest;)LderiveCodec;", "verifyOtpNonactiveAutodebetBni"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PaymentApiClient {
    @POST("recurring/insert_vas_tx_payment")
    deriveCodec<Response<BaseItem>> InsertVasTxPayment(@Body InsertVasTxPaymentRequest p0);

    @POST("recurring/briDD/authentication")
    deriveCodec<Response<AuthOtpBriDirectDebitResponse>> authOtpBriRecurring(@Body AuthOtpBriDirectDebitRequest p0);

    @POST("recurring/check_one_time_payment_status")
    deriveCodec<Response<CheckOneTimePaymentResponse>> checkOneTimePayment(@Body CheckOneTimePaymentStatusRequest p0);

    @POST("recurring/status")
    deriveCodec<Response<GetStatusRecurringPlanResponse>> checkRecurringStatus(@Body CheckRecurringStatusRequest p0);

    @POST("recurring/briDD/payment_method")
    deriveCodec<Response<CreatePaymentMethodGeneralResponse>> createBriDDRecurring(@Body CreatePaymentMethodWithDebitCard p0);

    @POST("recurring/customer_object")
    deriveCodec<Response<CreateCustomerObjectResponse>> createCustomerObject(@Body CreateCustomerObjectRequest p0);

    @POST("recurring/ewallet/payment_method")
    deriveCodec<Response<CreatePaymentMethodResponse>> createEwalletPaymentMethod(@Body CreatePaymentMethodRequest p0);

    @POST("recurring/mandiriDD/payment_method")
    deriveCodec<Response<CreatePaymentMethodGeneralResponse>> createMandiriDDRecurring(@Body CreatePaymentMethodGeneralRequest p0);

    @POST("recurring/one_time_payment")
    deriveCodec<Response<CreateOneTimePaymentResponse>> createOneTimePayment(@Body CreateOneTimePaymentRequest p0);

    @POST("recurring/recurring_plan")
    deriveCodec<Response<CreateRecurringPlanResponse>> createRecurringPlan(@Body CreateRecurringPlanRequest p0);

    @POST("recurring/edit_customer_object")
    deriveCodec<Response<EditCustomerObjectResponse>> editCustomerObject(@Body EditCustomerObjectRequest p0);

    @POST("recurring/flagging_recurring")
    deriveCodec<Response<BaseItem>> flaggingRecurring(@Body FlaggingRecurringRequest p0);

    @POST("recurring/expire_payment_method")
    deriveCodec<Response<ForceExpirePaymentMethodResponse>> forceExpirePaymentMethod(@Body ForceExpirePaymentMethodRequest p0);

    @POST("recurring/get_customer_object")
    deriveCodec<Response<GetCustomerObjectResponse>> getInfoCustomerObject(@Body GetCustomerObjectRequest p0);

    @POST("recurring/get_list_payment_method")
    deriveCodec<Response<GetListPaymentMethodResponse>> getListPaymentMethod(@Body GetListPaymentMethodRequest p0);

    @POST("payment/list-sertakan-autodebet")
    deriveCodec<Response<GetListSertakanAutodebetResponse>> getListSertakanAutodebet(@Body GetListSertakanAutodebetRequest p0);

    @POST("bni-autopay/insert-profil")
    deriveCodec<Response<SubmitAutodebitBniAutopayResponse>> insertProfilAutodebetBni(@Body SubmitAutodebitBniAutopayRequest p0);

    @POST("payment/kode-nonactive-autodebet")
    deriveCodec<Response<GetListKodenonaktifAutodebitResponse>> kodeNonactiveAutodebit();

    @POST("recurring/modify_customer_object")
    deriveCodec<Response<EditCustomerObjectResponse>> modifyCustomerObject(@Body EditCustomerObjectRequest p0);

    @POST("payment/nonactive-autodebet")
    deriveCodec<Response<BaseItem>> nonactiveAutodebit(@Body NonactiveAutodebetRequest p0);

    @POST("bni-autopay/nonakti")
    deriveCodec<Response<SubmitNonactiveAutodebetBniResponse>> submitNonaktifAutodebetBni(@Body SubmitNonactiveAutodebitBniRequest p0);

    @POST("bni-autopay/verify-otp-insert-profil")
    deriveCodec<Response<BaseItem>> verifyOtpInsertAutodebetBni(@Body VerifyOtpSubmitAutodebitBniRequest p0);

    @POST("/bni-autopay/verify-otp-nonaktif")
    deriveCodec<Response<BaseItem>> verifyOtpNonactiveAutodebetBni(@Body VerifyOtpSubmitAutodebitBniRequest p0);
}
