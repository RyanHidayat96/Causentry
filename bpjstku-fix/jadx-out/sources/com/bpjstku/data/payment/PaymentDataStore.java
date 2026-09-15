package com.bpjstku.data.payment;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
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
import com.bpjstku.data.payment.model.response.CustomerObjectItem;
import com.bpjstku.data.payment.model.response.CustomerObjectResponse;
import com.bpjstku.data.payment.model.response.CustomerObjectUpdated;
import com.bpjstku.data.payment.model.response.EditCustomerObjectResponse;
import com.bpjstku.data.payment.model.response.ForceExpirePaymentMethodResponse;
import com.bpjstku.data.payment.model.response.GetCustomerObjectResponse;
import com.bpjstku.data.payment.model.response.GetListKodenonaktifAutodebitResponse;
import com.bpjstku.data.payment.model.response.GetListPaymentMethodResponse;
import com.bpjstku.data.payment.model.response.GetListSertakanAutodebetResponse;
import com.bpjstku.data.payment.model.response.GetStatusRecurringPlanResponse;
import com.bpjstku.data.payment.model.response.PaymentMethodItem;
import com.bpjstku.data.payment.model.response.PaymentMethodResult;
import com.bpjstku.data.payment.model.response.RecurringPlanResponse;
import com.bpjstku.data.payment.model.response.SubmitAutodebitBniAutopayResponse;
import com.bpjstku.data.payment.model.response.SubmitNonactiveAutodebetBniResponse;
import com.bpjstku.data.payment.remote.PaymentApi;
import defpackage.Api23Impl;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.deriveCodec;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.share;
import defpackage.unbind;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0003\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00072\u0006\u0010\u0003\u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00072\u0006\u0010\u0003\u001a\u00020#H\u0017¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100(0\u00072\u0006\u0010\u0003\u001a\u00020'H\u0017¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00072\u0006\u0010\u0003\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00072\u0006\u0010\u0003\u001a\u00020/H\u0017¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00072\u0006\u0010\u0003\u001a\u000203H\u0017¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00072\u0006\u0010\u0003\u001a\u000207H\u0017¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u00072\u0006\u0010\u0003\u001a\u000207H\u0017¢\u0006\u0004\b;\u0010:J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00072\u0006\u0010\u0003\u001a\u00020<H\u0017¢\u0006\u0004\b>\u0010?J\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020=0\u00072\u0006\u0010\u0003\u001a\u00020@H\u0017¢\u0006\u0004\bA\u0010BJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00072\u0006\u0010\u0003\u001a\u00020CH\u0017¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020=0\u00072\u0006\u0010\u0003\u001a\u00020GH\u0017¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u0007H\u0017¢\u0006\u0004\bK\u0010LJ\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00072\u0006\u0010\u0003\u001a\u00020MH\u0017¢\u0006\u0004\bO\u0010PJ\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020=0\u00072\u0006\u0010\u0003\u001a\u00020QH\u0017¢\u0006\u0004\bR\u0010SJ\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u00072\u0006\u0010\u0003\u001a\u00020TH\u0017¢\u0006\u0004\bV\u0010WJ\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020=0\u00072\u0006\u0010\u0003\u001a\u00020QH\u0017¢\u0006\u0004\bX\u0010SR\u001a\u0010Y\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001c\u0010^\u001a\u0004\u0018\u00010]8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a"}, d2 = {"Lcom/bpjstku/data/payment/PaymentDataStore;", "Lcom/bpjstku/data/payment/PaymentRepository;", "Lcom/bpjstku/data/payment/remote/PaymentApi;", "p0", "<init>", "(Lcom/bpjstku/data/payment/remote/PaymentApi;)V", "Lcom/bpjstku/data/payment/model/request/GetCustomerObjectRequest;", "LderiveCodec;", "Lcom/bpjstku/data/payment/model/response/CustomerObjectResponse;", "getCustomerObject", "(Lcom/bpjstku/data/payment/model/request/GetCustomerObjectRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;", "Lcom/bpjstku/data/payment/model/response/CustomerObjectItem;", "createCustomerObject", "(Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/PaymentMethodItem;", "createEwalletPaymentMethod", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;", "Lcom/bpjstku/data/payment/model/response/RecurringPlanResponse;", "createRecurringPlan", "(Lcom/bpjstku/data/payment/model/request/CreateRecurringPlanRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;", "Lcom/bpjstku/data/payment/model/response/CreateOneTimePaymentResponse;", "createOneTimePayment", "(Lcom/bpjstku/data/payment/model/request/CreateOneTimePaymentRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CheckOneTimePaymentStatusRequest;", "Lcom/bpjstku/data/payment/model/response/CheckOneTimePaymentResponse;", "checkOneTimePayment", "(Lcom/bpjstku/data/payment/model/request/CheckOneTimePaymentStatusRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;", "Lcom/bpjstku/data/payment/model/response/GetStatusRecurringPlanResponse;", "checkStatusRecurringPlan", "(Lcom/bpjstku/data/payment/model/request/CheckRecurringStatusRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodGeneralRequest;", "Lcom/bpjstku/data/payment/model/response/PaymentMethodResult;", "createMandiriDDRecurring", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodGeneralRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/GetListPaymentMethodRequest;", "", "getListPaymentMethod", "(Lcom/bpjstku/data/payment/model/request/GetListPaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;", "Lcom/bpjstku/data/payment/model/response/CreatePaymentMethodGeneralResponse;", "createBriDDRecurring", "(Lcom/bpjstku/data/payment/model/request/CreatePaymentMethodWithDebitCard;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;", "Lcom/bpjstku/data/payment/model/response/AuthOtpBriDirectDebitResponse;", "authOtpBriRecurring", "(Lcom/bpjstku/data/payment/model/request/AuthOtpBriDirectDebitRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;", "Lcom/bpjstku/data/payment/model/response/ForceExpirePaymentMethodResponse;", "forceExpirePaymentMethod", "(Lcom/bpjstku/data/payment/model/request/ForceExpirePaymentMethodRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/EditCustomerObjectRequest;", "Lcom/bpjstku/data/payment/model/response/CustomerObjectUpdated;", "editCustomerObject", "(Lcom/bpjstku/data/payment/model/request/EditCustomerObjectRequest;)LderiveCodec;", "modifyCustomerObject", "Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "insertVasTxPayment", "(Lcom/bpjstku/data/payment/model/request/InsertVasTxPaymentRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/FlaggingRecurringRequest;", "flaggingRecurring", "(Lcom/bpjstku/data/payment/model/request/FlaggingRecurringRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;", "Lcom/bpjstku/data/payment/model/response/GetListSertakanAutodebetResponse;", "getListSertakanAutodebet", "(Lcom/bpjstku/data/payment/model/request/GetListSertakanAutodebetRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;", "nonactiveAutodebit", "(Lcom/bpjstku/data/payment/model/request/NonactiveAutodebetRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/response/GetListKodenonaktifAutodebitResponse;", "kodeNonactiveAutodebit", "()LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;", "Lcom/bpjstku/data/payment/model/response/SubmitAutodebitBniAutopayResponse;", "insertProfilAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/SubmitAutodebitBniAutopayRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;", "verifyOtpInsertAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/VerifyOtpSubmitAutodebitBniRequest;)LderiveCodec;", "Lcom/bpjstku/data/payment/model/request/SubmitNonactiveAutodebitBniRequest;", "Lcom/bpjstku/data/payment/model/response/SubmitNonactiveAutodebetBniResponse;", "submitNonaktifAutodebetBni", "(Lcom/bpjstku/data/payment/model/request/SubmitNonactiveAutodebitBniRequest;)LderiveCodec;", "verifyOtpNonactiveAutodebetBni", "webService", "Lcom/bpjstku/data/payment/remote/PaymentApi;", "getWebService", "()Lcom/bpjstku/data/payment/remote/PaymentApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentDataStore implements PaymentRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final PaymentApi webService;

    public PaymentDataStore(PaymentApi paymentApi) {
        Intrinsics.checkNotNullParameter(paymentApi, "");
        this.webService = paymentApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7685getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final PaymentApi m7686getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<CustomerObjectResponse> getCustomerObject(GetCustomerObjectRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<GetCustomerObjectResponse>> infoCustomerObject = m7686getWebService().getInfoCustomerObject(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(infoCustomerObject, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.getCustomerObject$lambda$0((GetCustomerObjectResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda17
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.getCustomerObject$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerObjectResponse getCustomerObject$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CustomerObjectResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerObjectResponse getCustomerObject$lambda$0(GetCustomerObjectResponse getCustomerObjectResponse) {
        Intrinsics.checkNotNullParameter(getCustomerObjectResponse, "");
        return getCustomerObjectResponse.getData();
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<CustomerObjectItem> createCustomerObject(CreateCustomerObjectRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CreateCustomerObjectResponse>> derivecodecCreateCustomerObject = m7686getWebService().createCustomerObject(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCreateCustomerObject, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.createCustomerObject$lambda$2((CreateCustomerObjectResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda45
            private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private static final byte[] $$c = {43, 23, 22, -14};
            private static final int $$f = 195;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {106, -66, 28, 119, -3, -4, 9, 4, -4, 65, -68, -5, 7, 0, 16, -7, 64, -33, -33, 4, 13, -1, -13, 1, 41, -40, -32, 13, -10, 12, -5, 2, 31, -16, -23, 13, 9, -8, -5, 47, -43, 18, -5, -5, 9, -8, -5, 2, 4, 12, 3, -5, 9, -10, 4, -4, 3, 4, -4, 10, 2, -17, 14, 5, -17, 43, -33, 12, 0, -6, 9, 0, 0, 6, -19, 10, -7, 67};
            private static final int $$e = 87;
            private static final byte[] $$a = {2, -84, 82, -15, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
            private static final int $$b = 115;
            private static int asBinder = 0;
            private static int d = 1;
            private static int TuitionPaymentFragmentbindingInflater1 = -304312640;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795555;
            private static int b = -1804500950;
            private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {25, -59, 16, 6, -89, 25, -50, 30, -53, 55, 50, -120, 21, 94, -37, -56, -53, -54, 31, -57, 26, -121, 3, -80, 23, 18, -69, 26, -87, -122, -67, 10, 22, -80, 14, -60, 115, 116, -51, -53, -100, -6, -52, 116, -62, 106, -42, -91, -44, 49, -57, -64, -76, -115, 124, 125, 114, -63, 105, -62, -125, 26, -115, -17, -126, -122, -123, -124, 16, -13, -43, 26, 9, -113, 16, -123, -18, 0, 27, 11, 30, 50, 55, -43, 19, 15, -25, 90, -49, -31, 7, -27, 64, -68, 117, -102, -68, 83, 88, -106, 76, 74, -68, 79, 72, 64, -70, -115, 65, -71, -67, 111, 81, 92, 116, -115, 83, -71, 104, 98, -123, 76, 97, -69, 79, 92, 111, -71, 92, 76, -122, 98, -124, -67, 85, -124, 106, 101, -67, -122, 109, -118, -69, 76, 96, 107, -72, 96, -67, -69, 109, 108, -122, 83, -69, 105, 81, -67, -115, 76, -67, 110, -72, 109, -71, -70, -67, 80, -70, -120, 22, -60, 13, -21, -8, 10, -7, 23, 93, 93, 40, -17, -58, 52, -32, -60, -58, 93, 91, -57, 54, -57, 9, -58, 55, 90, 23, -7, 90, 41, -17, -57, 93, -58, -60, 80, 53, -20, 40, -22, 54, -19, -8, -8, 91, -7, -57, 92, 12, 18, 11, -7, 8, 0, -57, -20, 51, -21, -61, 80, 40, -7, 92, -26, -26, -26, -26, -26, -26, -26, -26};

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r5, short r6, int r7, java.lang.Object[] r8) {
                /*
                    int r5 = r5 * 14
                    int r5 = 98 - r5
                    int r7 = r7 * 52
                    int r7 = r7 + 1
                    int r6 = r6 * 52
                    int r6 = r6 + 4
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda45.$$a
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r4 = r7
                    r3 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L26:
                    r4 = r0[r6]
                L28:
                    int r6 = r6 + 1
                    int r4 = -r4
                    int r5 = r5 + r4
                    int r5 = r5 + (-11)
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda45.a(byte, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(byte r5, short r6, int r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda45.$$d
                    int r5 = r5 * 22
                    int r5 = r5 + 4
                    int r6 = r6 * 30
                    int r1 = 53 - r6
                    int r7 = r7 * 23
                    int r7 = 107 - r7
                    byte[] r1 = new byte[r1]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r0 != 0) goto L18
                    r4 = r5
                    r3 = r2
                    goto L2a
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r6) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r0[r5]
                L2a:
                    int r5 = r5 + 1
                    int r4 = -r4
                    int r7 = r7 + r4
                    int r7 = r7 + 1
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda45.e(byte, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:59:0x024d  */
            private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
                long j;
                boolean z;
                int i4 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.normalizeMetaState(0), Color.blue(0) + 2267, KeyEvent.keyCodeFromString("") + 33, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    int i5 = iIntValue == -1 ? 1 : 0;
                    char c = '0';
                    if (i5 == 0) {
                        j = 3046761265686732006L;
                    } else {
                        byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i6 = 0;
                            while (i6 < length) {
                                try {
                                    Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cAlpha = (char) Color.alpha(0);
                                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 3358;
                                        int iLastIndexOf = TextUtils.lastIndexOf("", c, 0, 0) + 19;
                                        byte length2 = (byte) $$c.length;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, iMakeMeasureSpec, iLastIndexOf, -1054011043, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                    i6++;
                                    int i7 = $10 + 41;
                                    $11 = i7 % 128;
                                    int i8 = i7 % 2;
                                    c = '0';
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2267 - ExpandableListView.getPackedPositionType(0L), Color.green(0) + 33, 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                            j = 3046761265686732006L;
                        } else {
                            j = 3046761265686732006L;
                            iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ j)) + i5;
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55905 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 2856, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, -1529949196, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (bArr4 != null) {
                            int length3 = bArr4.length;
                            byte[] bArr5 = new byte[length3];
                            int i9 = 0;
                            while (i9 < length3) {
                                int i10 = $11 + 3;
                                $10 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    bArr5[i9] = (byte) (((long) bArr4[i9]) - 3046761265686732006L);
                                    i9 >>>= 1;
                                } else {
                                    bArr5[i9] = (byte) (((long) bArr4[i9]) ^ 3046761265686732006L);
                                    i9++;
                                }
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            int i11 = $10 + 107;
                            $11 = i11 % 128;
                            if (i11 % 2 == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            if (z) {
                                byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i12 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i12]) ^ 3046761265686732006L)) + s)) ^ b2));
                            } else {
                                short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i13 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i13]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0293  */
            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char gidForName = (char) (37566 - Process.getGidForName(""));
                    int i2 = 625 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int bitsPerPixel = 13 - ImageFormat.getBitsPerPixel(0);
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, i2, bitsPerPixel, -477065106, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c((-417127531) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) - 36, (short) ((-17) - Color.alpha(0)), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 26), TextUtils.getCapsMode("", 0, 0) - 1634849318, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(ExpandableListView.getPackedPositionChild(0L) - 417127526, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 44, (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 92), (byte) ((Process.myTid() >> 22) + 68), (Process.myTid() >> 22) - 1634849297, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 37567);
                    int scrollBarSize = 625 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int i3 = 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte[] bArr = $$a;
                    byte b4 = bArr[5];
                    Object[] objArr5 = new Object[1];
                    a(b4, bArr[7], b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, scrollBarSize, i3, -976899241, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i4 = asBinder + 15;
                    d = i4 % 128;
                    int i5 = i4 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 37568);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 625;
                        int capsMode = 14 - TextUtils.getCapsMode("", 0, 0);
                        byte b5 = $$a[5];
                        byte b6 = b5;
                        Object[] objArr6 = new Object[1];
                        a(b5, b6, b6, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, maximumDrawingCacheSize, capsMode, -973632554, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i6 = ((int[]) objArr7[2])[0];
                    int i7 = ((int[]) objArr7[0])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int[] iArr = {i6};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i8 = ~iIdentityHashCode;
                    int i9 = ~(269677723 | i8);
                    int i10 = (((1476167960 + ((1285619812 | i9) * (-712))) + (((~(iIdentityHashCode | 1555297535)) | (~(i8 | (-1285619813)))) * (-712))) + (((-1554060398) | i9) * 712)) - 127388977;
                    int i11 = (i10 << 13) ^ i10;
                    int i12 = i11 ^ (i11 >>> 17);
                    ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
                    objArr = new Object[]{new int[]{i7}, new int[1], iArr, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    c(MotionEvent.axisFromString("") - 417127530, (-32) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) ((ViewConfiguration.getScrollBarSize() >> 8) - 92), (byte) ((-59) - (Process.myTid() >> 22)), (-1634849282) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(Color.argb(0, 0, 0, 0) - 417127529, ((Process.getThreadPriority(0) + 20) >> 6) - 41, (short) ((-16777262) - Color.rgb(0, 0, 0)), (byte) ((-56) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (-1651626474) - Color.rgb(0, 0, 0), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i13 = asBinder + 41;
                            d = i13 % 128;
                            int i14 = i13 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c((-417127523) - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getWindowTouchSlop() >> 8) - 43, (short) (11 - View.combineMeasuredStates(0, 0)), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 7), (-1634849241) - View.MeasureSpec.makeMeasureSpec(0, 0), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c((-417127523) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-43) - ExpandableListView.getPackedPositionGroup(0L), (short) (124 - Color.argb(0, 0, 0, 0)), (byte) (35 - (Process.myTid() >> 22)), Process.getGidForName("") - 1634849225, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    Object[] objArr12 = new Object[1];
                    c((-417127579) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, (short) ((-16777099) - Color.rgb(0, 0, 0)), (byte) (Color.argb(0, 0, 0, 0) - 48), (-1634849212) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr12);
                    String str = (String) objArr12[0];
                    Object[] objArr13 = new Object[1];
                    c((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 417127529, TextUtils.lastIndexOf("", '0') + 6, (short) (18 - Color.red(0)), (byte) (49 - Process.getGidForName("")), (-1634849148) - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr13);
                    String[] strArr2 = {str, (String) objArr13[0]};
                    int i15 = d + 103;
                    asBinder = i15 % 128;
                    int i16 = i15 % 2;
                    try {
                        Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -127388977};
                        byte[] bArr2 = $$d;
                        byte b7 = bArr2[13];
                        Object[] objArr15 = new Object[1];
                        e(b7, bArr2[23], b7, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        byte b8 = bArr2[23];
                        Object[] objArr16 = new Object[1];
                        e(b8, bArr2[13], b8, objArr16);
                        objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                        int i17 = ((int[]) objArr[0])[0];
                        int i18 = ((int[]) objArr[2])[0];
                        if (applicationContext != null) {
                            int i19 = asBinder + 125;
                            d = i19 % 128;
                            int i20 = i19 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char minimumFlingVelocity = (char) (37567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 625;
                                int iAxisFromString = 13 - MotionEvent.axisFromString("");
                                byte b9 = $$a[5];
                                byte b10 = b9;
                                Object[] objArr17 = new Object[1];
                                a(b9, b10, b10, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, edgeSlop, iAxisFromString, -973632554, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr18 = new Object[1];
                                c((-417127531) - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 37, (short) (View.MeasureSpec.getSize(0) - 17), (byte) ((-26) - TextUtils.getTrimmedLength("")), (-1634849319) - TextUtils.lastIndexOf("", '0', 0), objArr18);
                                Class<?> cls5 = Class.forName((String) objArr18[0]);
                                Object[] objArr19 = new Object[1];
                                c((-417127527) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0') - 43, (short) (91 - (ViewConfiguration.getTouchSlop() >> 8)), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 68), ((Process.getThreadPriority(0) + 20) >> 6) - 1634849297, objArr19);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char gidForName2 = (char) (37566 - Process.getGidForName(""));
                                    int i21 = 626 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int iResolveSizeAndState = 14 - View.resolveSizeAndState(0, 0, 0);
                                    byte[] bArr3 = $$a;
                                    byte b11 = bArr3[5];
                                    Object[] objArr20 = new Object[1];
                                    a(b11, bArr3[7], b11, objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName2, i21, iResolveSizeAndState, -976899241, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37567);
                                    int scrollBarSize2 = 625 - (ViewConfiguration.getScrollBarSize() >> 8);
                                    int minimumFlingVelocity2 = 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    byte b12 = $$a[7];
                                    byte b13 = b12;
                                    Object[] objArr21 = new Object[1];
                                    a(b12, b13, b13, objArr21);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize2, scrollBarSize2, minimumFlingVelocity2, -477065106, false, (String) objArr21[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i22 = ((int[]) objArr[0])[0];
                int i23 = ((int[]) objArr[2])[0];
                if (i23 == i22) {
                    int i24 = asBinder + 125;
                    d = i24 % 128;
                    int i25 = i24 % 2;
                    int i26 = ((int[]) objArr[1])[0];
                    int i27 = ((int[]) objArr[2])[0];
                    int i28 = ((int[]) objArr[0])[0];
                    String[] strArr3 = (String[]) objArr[3];
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i29 = i26 + 263437344 + (((~((~startUptimeMillis) | (-17514661))) | (~(1543502078 | startUptimeMillis))) * (-302)) + ((~((-17514661) | startUptimeMillis)) * (-604)) + (((~(startUptimeMillis | 1525987418)) | 1245751376) * 302);
                    int i30 = (i29 << 13) ^ i29;
                    int i31 = i30 ^ (i30 >>> 17);
                    ((int[]) objArr[1])[0] = i31 ^ (i31 << 5);
                    Object[] objArr22 = {new int[]{i28}, new int[1], new int[]{i27}, strArr3};
                    int i32 = d + 69;
                    asBinder = i32 % 128;
                    int i33 = i32 % 2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr4 = (String[]) objArr[3];
                    if (strArr4 != null) {
                        for (String str2 : strArr4) {
                            arrayList.add(str2);
                        }
                    }
                    Toast.makeText((Context) null, i23 / (((i23 - 1) * i23) % 2), 0).show();
                    int i34 = ((int[]) objArr[1])[0];
                    int i35 = ((int[]) objArr[2])[0];
                    int i36 = ((int[]) objArr[0])[0];
                    String[] strArr5 = (String[]) objArr[3];
                    int[] iArr2 = {i35};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i37 = i34 + (-1001994936) + (((-137094897) | iIdentityHashCode2) * 376) + (((~((~iIdentityHashCode2) | 977622012)) | (-980416509)) * (-376)) + (((~(iIdentityHashCode2 | (-977622013))) | 846116108) * 376);
                    int i38 = (i37 << 13) ^ i37;
                    int i39 = i38 ^ (i38 >>> 17);
                    ((int[]) objArr[1])[0] = i39 ^ (i39 << 5);
                    Object[] objArr23 = {new int[]{i36}, new int[1], iArr2, strArr5};
                }
                return PaymentDataStore.createCustomerObject$lambda$3(function1, obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0020  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(short r6, short r7, short r8) {
                /*
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda45.$$c
                    int r7 = r7 + 117
                    int r8 = r8 * 2
                    int r8 = 4 - r8
                    int r6 = r6 * 3
                    int r1 = r6 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r8
                    r4 = r2
                    goto L28
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r6) goto L20
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L20:
                    int r3 = r3 + 1
                    r4 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L28:
                    int r8 = -r8
                    int r3 = r3 + 1
                    int r7 = r7 + r8
                    r8 = r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda45.$$g(short, short, short):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerObjectItem createCustomerObject$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CustomerObjectItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerObjectItem createCustomerObject$lambda$2(CreateCustomerObjectResponse createCustomerObjectResponse) {
        Intrinsics.checkNotNullParameter(createCustomerObjectResponse, "");
        return createCustomerObjectResponse.getData();
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<PaymentMethodItem> createEwalletPaymentMethod(CreatePaymentMethodRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CreatePaymentMethodResponse>> derivecodecCreateEwalletPaymentMethod = m7686getWebService().createEwalletPaymentMethod(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCreateEwalletPaymentMethod, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.createEwalletPaymentMethod$lambda$4((CreatePaymentMethodResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda33
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.createEwalletPaymentMethod$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentMethodItem createEwalletPaymentMethod$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PaymentMethodItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentMethodItem createEwalletPaymentMethod$lambda$4(CreatePaymentMethodResponse createPaymentMethodResponse) {
        Intrinsics.checkNotNullParameter(createPaymentMethodResponse, "");
        return createPaymentMethodResponse.getData();
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<RecurringPlanResponse> createRecurringPlan(CreateRecurringPlanRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CreateRecurringPlanResponse>> derivecodecCreateRecurringPlan = m7686getWebService().createRecurringPlan(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCreateRecurringPlan, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.createRecurringPlan$lambda$6((CreateRecurringPlanResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda37
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.createRecurringPlan$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringPlanResponse createRecurringPlan$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (RecurringPlanResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringPlanResponse createRecurringPlan$lambda$6(CreateRecurringPlanResponse createRecurringPlanResponse) {
        Intrinsics.checkNotNullParameter(createRecurringPlanResponse, "");
        return createRecurringPlanResponse.getData();
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<CreateOneTimePaymentResponse> createOneTimePayment(CreateOneTimePaymentRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CreateOneTimePaymentResponse>> derivecodecCreateOneTimePayment = m7686getWebService().createOneTimePayment(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCreateOneTimePayment, unbindVar);
        PaymentDataStore$$ExternalSyntheticLambda43 paymentDataStore$$ExternalSyntheticLambda43 = new PaymentDataStore$$ExternalSyntheticLambda43(new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.createOneTimePayment$lambda$8((CreateOneTimePaymentResponse) obj);
            }
        });
        share.b(paymentDataStore$$ExternalSyntheticLambda43, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, paymentDataStore$$ExternalSyntheticLambda43);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateOneTimePaymentResponse createOneTimePayment$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CreateOneTimePaymentResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<CheckOneTimePaymentResponse> checkOneTimePayment(CheckOneTimePaymentStatusRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CheckOneTimePaymentResponse>> derivecodecCheckOneTimePayment = m7686getWebService().checkOneTimePayment(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckOneTimePayment, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.checkOneTimePayment$lambda$10((CheckOneTimePaymentResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda19
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.checkOneTimePayment$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckOneTimePaymentResponse checkOneTimePayment$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CheckOneTimePaymentResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<GetStatusRecurringPlanResponse> checkStatusRecurringPlan(CheckRecurringStatusRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<GetStatusRecurringPlanResponse>> derivecodecCheckRecurringStatus = m7686getWebService().checkRecurringStatus(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckRecurringStatus, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda27
            private static final byte[] $$c = {123, -2, -101, -104};
            private static final int $$f = 7;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {14, 116, 92, -78, 6, -23, 41, -38, -20, 0, -21, 9, 19, -35, -10, -25, -3, -11, -15, 33, -42, -5, -15, 5, -3, -9, -21, 70, -70, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 57};
            private static final int $$e = 80;
            private static final byte[] $$a = {14, 116, 92, -78, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
            private static final int $$b = 78;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int asInterface = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47350, 47337, 47347, 47333, 47336, 47342, 47273, 47332, 47300, 47390, 47331, 47346, 47338, 47316, 47339, 47348, 47340, 47335, 47301, 47318, 47329, 47299, 47343, 47330, 47341, 47344, 47311};
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2047719575;
            private static boolean b = true;
            private static boolean TuitionPaymentFragmentbindingInflater1 = true;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 52
                    int r7 = 55 - r7
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda27.$$a
                    int r6 = r6 * 14
                    int r6 = 98 - r6
                    int r1 = r8 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    int r7 = r7 + 1
                    r3 = r0[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r5
                L2c:
                    int r6 = r6 + r7
                    int r6 = r6 + (-10)
                    r7 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda27.a(short, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r5, short r6, short r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 31
                    int r7 = 115 - r7
                    int r6 = r6 * 25
                    int r6 = r6 + 4
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda27.$$d
                    int r5 = r5 * 27
                    int r1 = r5 + 26
                    byte[] r1 = new byte[r1]
                    int r5 = r5 + 25
                    r2 = 0
                    if (r0 != 0) goto L18
                    r4 = r5
                    r3 = r2
                    goto L2a
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r5) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                L2a:
                    int r4 = -r4
                    int r6 = r6 + 1
                    int r7 = r7 + r4
                    int r7 = r7 + (-8)
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda27.d(short, short, short, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                long j = 0;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i3 = $11 + 99;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 0;
                    while (i5 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - View.MeasureSpec.getSize(0)), 2994 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (-16777199) - Color.rgb(0, 0, 0), 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i5++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43325), 253 - View.MeasureSpec.getMode(0), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    int i6 = 1687675375;
                    if (TuitionPaymentFragmentbindingInflater1) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                        char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            int i7 = $11 + 9;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                            Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33601);
                                int iResolveOpacity = 3085 - Drawable.resolveOpacity(0, 0);
                                int i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25;
                                byte b4 = (byte) ($$f >>> 2);
                                byte b5 = (byte) (b4 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iResolveOpacity, i9, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            i6 = 1687675375;
                        }
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    if (!b) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                        char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                        }
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i10 = $11 + 71;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char doubleTapTimeout = (char) (33602 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int maxKeyCode = 3085 - (KeyEvent.getMaxKeyCode() >> 16);
                            int iKeyCodeFromString = 26 - KeyEvent.keyCodeFromString("");
                            byte b6 = (byte) ($$f >>> 2);
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout, maxKeyCode, iKeyCodeFromString, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char offsetBefore = (char) (31533 - TextUtils.getOffsetBefore("", 0));
                    int iNormalizeMetaState = 921 - KeyEvent.normalizeMetaState(0);
                    int i4 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27;
                    byte[] bArr = $$a;
                    byte b2 = bArr[80];
                    Object[] objArr2 = new Object[1];
                    a(b2, bArr[37], b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iNormalizeMetaState, i4, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(null, null, 127 - TextUtils.getOffsetBefore("", 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(null, null, 127 - Color.argb(0, 0, 0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cGreen = (char) (Color.green(0) + 31533);
                    int packedPositionChild = 920 - ExpandableListView.getPackedPositionChild(0L);
                    int iIndexOf = 28 - TextUtils.indexOf("", "");
                    byte b3 = $$a[37];
                    Object[] objArr5 = new Object[1];
                    a(b3, b3, (byte) 52, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, packedPositionChild, iIndexOf, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char mode = (char) (31533 - View.MeasureSpec.getMode(0));
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 921;
                        int mode2 = View.MeasureSpec.getMode(0) + 28;
                        byte[] bArr2 = $$a;
                        byte b4 = bArr2[37];
                        byte b5 = bArr2[80];
                        Object[] objArr6 = new Object[1];
                        a(b4, b5, (byte) (b5 | 37), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, iNormalizeMetaState2, mode2, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iNextInt = new Random().nextInt(1026165490);
                    int i5 = (((1953390499 + (((~((-1116605020) | iNextInt)) | 33554496) * 104)) + ((~((~iNextInt) | 1740525147)) * (-104))) + ((iNextInt | 657474624) * 104)) - 938854771;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(null, null, (Process.myPid() >> 22) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(null, null, ExpandableListView.getPackedPositionGroup(0L) + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(null, null, 175 - AndroidCharacter.getMirror('0'), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(null, null, 127 - TextUtils.indexOf("", "", 0, 0), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i8 = asInterface + 97;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                    int i9 = i8 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -938854771};
                        byte[] bArr3 = $$d;
                        byte b6 = bArr3[9];
                        byte b7 = b6;
                        Object[] objArr13 = new Object[1];
                        d(b6, b7, b7, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b8 = bArr3[62];
                        byte b9 = b8;
                        Object[] objArr14 = new Object[1];
                        d(b8, b9, b9, objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 31533);
                            int i10 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                            int iRed = 28 - Color.red(0);
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[37];
                            byte b11 = bArr4[80];
                            Object[] objArr16 = new Object[1];
                            a(b10, b11, (byte) (b11 | 37), objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, i10, iRed, -1142834547, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(null, null, 127 - TextUtils.indexOf("", "", 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(null, null, Process.getGidForName("") + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 921;
                                int i11 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
                                byte b12 = $$a[37];
                                Object[] objArr19 = new Object[1];
                                a(b12, b12, (byte) 52, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, scrollBarFadeDuration, i11, -778300370, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char threadPriority = (char) (31533 - ((Process.getThreadPriority(0) + 20) >> 6));
                                int iBlue = Color.blue(0) + 921;
                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 28;
                                byte[] bArr5 = $$a;
                                byte b13 = bArr5[80];
                                Object[] objArr20 = new Object[1];
                                a(b13, bArr5[37], b13, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority, iBlue, absoluteGravity, -1048449946, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr = objArr15;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i12 = ((int[]) objArr[1])[0];
                int i13 = ((int[]) objArr[3])[0];
                if (i13 == i12) {
                    int i14 = asInterface + 85;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = ((int[]) objArr[0])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i17 = ~iElapsedRealtime;
                    int i18 = i16 + (-1128424400) + (((~((-1339550353) | i17)) | 434529291) * 226) + (((~(i17 | (-1175554705))) | (~((-434529292) | iElapsedRealtime)) | 270533643) * (-113)) + ((~(iElapsedRealtime | (-1339550353))) * 113);
                    int i19 = (i18 << 13) ^ i18;
                    int i20 = i19 ^ (i19 >>> 17);
                    ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i21 = 0;
                        while (i21 < strArr.length) {
                            arrayList.add(strArr[i21]);
                            i21++;
                            int i22 = asInterface + 23;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                            int i23 = i22 % 2;
                        }
                    }
                    int[] iArr = new int[i13];
                    int i24 = i13 - 1;
                    iArr[i24] = 1;
                    Toast.makeText((Context) null, iArr[((i13 * i24) % 2) - 1], 1).show();
                    int i25 = ((int[]) objArr[0])[0];
                    Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iNextInt2 = new Random().nextInt();
                    int i26 = i25 + 1752876888 + (((~((~iNextInt2) | (-532634176))) | 1241445468) * (-235)) + (((~((-532634176) | iNextInt2)) | 1241445468) * (-470)) + (((~(iNextInt2 | (-369166884))) | 1077978176) * 235);
                    int i27 = (i26 << 13) ^ i26;
                    int i28 = i27 ^ (i27 >>> 17);
                    ((int[]) objArr22[0])[0] = i28 ^ (i28 << 5);
                }
                return PaymentDataStore.checkStatusRecurringPlan$lambda$12((GetStatusRecurringPlanResponse) obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(short r5, byte r6, short r7) {
                /*
                    int r5 = 68 - r5
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda27.$$c
                    int r6 = r6 * 3
                    int r1 = 1 - r6
                    int r7 = r7 * 3
                    int r7 = r7 + 4
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r0 != 0) goto L16
                    r4 = r6
                    r3 = r2
                    goto L26
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    if (r3 != r6) goto L22
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L22:
                    r4 = r0[r7]
                    int r3 = r3 + 1
                L26:
                    int r7 = r7 + 1
                    int r4 = -r4
                    int r5 = r5 + r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda27.$$g(short, byte, short):java.lang.String");
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda28
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.checkStatusRecurringPlan$lambda$13(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetStatusRecurringPlanResponse checkStatusRecurringPlan$lambda$13(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetStatusRecurringPlanResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<PaymentMethodResult> createMandiriDDRecurring(CreatePaymentMethodGeneralRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CreatePaymentMethodGeneralResponse>> derivecodecCreateMandiriDDRecurring = m7686getWebService().createMandiriDDRecurring(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCreateMandiriDDRecurring, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.createMandiriDDRecurring$lambda$14((CreatePaymentMethodGeneralResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda21
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.createMandiriDDRecurring$lambda$15(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentMethodResult createMandiriDDRecurring$lambda$15(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PaymentMethodResult) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentMethodResult createMandiriDDRecurring$lambda$14(CreatePaymentMethodGeneralResponse createPaymentMethodGeneralResponse) {
        Intrinsics.checkNotNullParameter(createPaymentMethodGeneralResponse, "");
        return createPaymentMethodGeneralResponse.getData();
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<List<PaymentMethodItem>> getListPaymentMethod(GetListPaymentMethodRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<GetListPaymentMethodResponse>> listPaymentMethod = m7686getWebService().getListPaymentMethod(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(listPaymentMethod, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.getListPaymentMethod$lambda$16((GetListPaymentMethodResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda30
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.getListPaymentMethod$lambda$17(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListPaymentMethod$lambda$17(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListPaymentMethod$lambda$16(GetListPaymentMethodResponse getListPaymentMethodResponse) {
        Intrinsics.checkNotNullParameter(getListPaymentMethodResponse, "");
        return getListPaymentMethodResponse.getData();
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<CreatePaymentMethodGeneralResponse> createBriDDRecurring(CreatePaymentMethodWithDebitCard p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<CreatePaymentMethodGeneralResponse>> derivecodecCreateBriDDRecurring = m7686getWebService().createBriDDRecurring(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCreateBriDDRecurring, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.createBriDDRecurring$lambda$18((CreatePaymentMethodGeneralResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda8
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.createBriDDRecurring$lambda$19(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreatePaymentMethodGeneralResponse createBriDDRecurring$lambda$19(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CreatePaymentMethodGeneralResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<AuthOtpBriDirectDebitResponse> authOtpBriRecurring(AuthOtpBriDirectDebitRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<AuthOtpBriDirectDebitResponse>> derivecodecAuthOtpBriRecurring = m7686getWebService().authOtpBriRecurring(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecAuthOtpBriRecurring, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.authOtpBriRecurring$lambda$20((AuthOtpBriDirectDebitResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.authOtpBriRecurring$lambda$21(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthOtpBriDirectDebitResponse authOtpBriRecurring$lambda$21(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AuthOtpBriDirectDebitResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<ForceExpirePaymentMethodResponse> forceExpirePaymentMethod(ForceExpirePaymentMethodRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<ForceExpirePaymentMethodResponse>> derivecodecForceExpirePaymentMethod = m7686getWebService().forceExpirePaymentMethod(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecForceExpirePaymentMethod, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.forceExpirePaymentMethod$lambda$22((ForceExpirePaymentMethodResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda35
            private static short[] TuitionPaymentFragmentbindingInflater1;
            private static final byte[] $$c = {48, -119, -71, 110};
            private static final int $$f = 70;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {48, -110, 22, 55, 16, 2, -59, Base64.padSymbol, 12, 4, -4, 9, -3, -51, 55, 17, -6, 18, 1, -2, -1, -50, 67, -8, 23, -11, 17, -5, -4, 15, -58, 57, 16, 1, 7, 7, -64, 75, 3, -7, 7, 1, 15, -7, 0, 18, -65, 35, 24, 23, -11, 17, -5, -4, 15, -36, 57, -7, -9, 16, 0, -2, -28, 48, 1, 7, 7, 5, -75, 4, 37, 55, 0, -11, 17, 0, -9, 15, -21, 42, -7, 10, -8, 1, 19, -7, -2, -19, 25, 16, -7, 6, 1, -44, 9, -1, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -62};
            private static final int $$e = 43;
            private static final byte[] $$a = {68, 104, -93, -37, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
            private static final int $$b = 72;
            private static int asInterface = 0;
            private static int d = 1;
            private static int b = -777081344;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795559;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1138034220;
            private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-109, 111, -104, -78, 77, -109, 106, -102, 97, -67, -66, 32, -97, -38, 81, 96, 97, 102, -107, 109, -106, 97, -99, 108, -111, -110, 101, -118, 119, 102, 107, -102, -106, 108, -98, -47, 46, 33, -40, -58, 9, -41, -39, 33, -33, 39, -61, -16, -63, 108, -46, -35, -31, 24, 41, 40, 47, -36, 36, -33, -94, 91, -88, 78, -93, -89, -96, -95, 93, 114, -112, 91, 84, -82, 93, -96, 79, 65, -72, 72, -77, 111, 108, -114, -80, 68, -68, 119, -124, -94, 92, -66, 44, -40, 1, -10, -40, 63, 52, -30, 40, 38, -40, 43, 36, 44, -42, -26, -26, -26, -26, -26, -26};

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r7, byte r8, int r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 14
                    int r8 = 98 - r8
                    int r7 = 53 - r7
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda35.$$a
                    int r9 = r9 * 52
                    int r9 = r9 + 4
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r9
                    r4 = r2
                    r9 = r7
                    goto L2b
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L25:
                    r3 = r0[r9]
                    r6 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r6
                L2b:
                    int r8 = -r8
                    int r9 = r9 + r8
                    int r8 = r9 + (-10)
                    int r9 = r3 + 1
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda35.a(short, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(byte r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 15
                    int r8 = 99 - r8
                    int r6 = r6 + 4
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda35.$$d
                    int r7 = r7 * 40
                    int r1 = 93 - r7
                    byte[] r1 = new byte[r1]
                    int r7 = 92 - r7
                    r2 = 0
                    if (r0 != 0) goto L17
                    r8 = r6
                    r4 = r7
                    r3 = r2
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    int r3 = r3 + 1
                    int r6 = r6 + 1
                    r4 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L2e:
                    int r6 = r6 + r4
                    int r6 = r6 + (-4)
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda35.e(byte, int, byte, java.lang.Object[]):void");
            }

            private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
                long j;
                int length;
                byte[] bArr;
                int i4 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.blue(0), 2267 - TextUtils.getCapsMode("", 0, 0), 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    int i5 = iIntValue == -1 ? 1 : 0;
                    if (i5 == 0) {
                        j = 3046761265686732006L;
                    } else {
                        byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (bArr2 != null) {
                            int length2 = bArr2.length;
                            byte[] bArr3 = new byte[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i6])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 3358;
                                    int i7 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18;
                                    byte length3 = (byte) $$c.length;
                                    byte b5 = (byte) (length3 - 4);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, edgeSlop, i7, -1054011043, false, $$g(length3, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr3[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            }
                            bArr2 = bArr3;
                        }
                        if (bArr2 != null) {
                            byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getTouchSlop() >> 8) + 2267, View.MeasureSpec.getMode(0) + 33, 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                            j = 3046761265686732006L;
                        } else {
                            j = 3046761265686732006L;
                            iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ j)) + i5;
                        try {
                            Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 1;
                                byte b9 = (byte) (b8 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 55903), View.MeasureSpec.getSize(0) + 2855, (ViewConfiguration.getLongPressTimeout() >> 16) + 13, -1529949196, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                            }
                            ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (bArr5 != null) {
                                int i8 = $11 + 125;
                                $10 = i8 % 128;
                                if (i8 % 2 != 0) {
                                    length = bArr5.length;
                                    bArr = new byte[length];
                                } else {
                                    length = bArr5.length;
                                    bArr = new byte[length];
                                }
                                for (int i9 = 0; i9 < length; i9++) {
                                    bArr[i9] = (byte) (((long) bArr5[i9]) ^ 3046761265686732006L);
                                }
                                bArr5 = bArr;
                            }
                            boolean z = bArr5 != null;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                            while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                                if (z) {
                                    byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i10 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i10 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i10]) ^ 3046761265686732006L)) + s)) ^ b2));
                                    int i11 = $11 + 43;
                                    $10 = i11 % 128;
                                    int i12 = i11 % 2;
                                } else {
                                    short[] sArr = TuitionPaymentFragmentbindingInflater1;
                                    int i13 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i13]) ^ 3046761265686732006L)) + s)) ^ b2));
                                }
                                sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = d + 91;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31533);
                    int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int i4 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b2 = $$a[80];
                    Object[] objArr2 = new Object[1];
                    a((byte) 52, b2, b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, iIndexOf, i4, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c((-814195922) - ((byte) KeyEvent.getModifierMetaStateMask()), Color.green(0) - 41, (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) (Color.green(0) + 125), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1560539878, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c((-814195917) - KeyEvent.getDeadChar(0, 0), (Process.myTid() >> 22) - 48, (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (Color.rgb(0, 0, 0) + 16777343), (-1560539857) - (ViewConfiguration.getEdgeSlop() >> 16), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
                    int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iRed = 28 - Color.red(0);
                    byte[] bArr = $$a;
                    byte b3 = bArr[80];
                    Object[] objArr5 = new Object[1];
                    a(b3, bArr[7], b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, maximumFlingVelocity, iRed, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (31533 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        int bitsPerPixel = 920 - ImageFormat.getBitsPerPixel(0);
                        int mirror = AndroidCharacter.getMirror('0') - 20;
                        byte[] bArr2 = $$a;
                        byte b4 = (byte) (-bArr2[33]);
                        byte b5 = bArr2[7];
                        Object[] objArr6 = new Object[1];
                        a(b4, b5, b5, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, bitsPerPixel, mirror, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iMyPid = Process.myPid();
                    int i5 = ~iMyPid;
                    int i6 = ((((-1293844818) + ((910544961 | i5) * (-757))) + ((~((-20459035) | iMyPid)) * 1514)) + (((~(iMyPid | 931003995)) | ((~(i5 | (-863534683))) | 843075648)) * 757)) - 1294312195;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c((-830973137) - Color.rgb(0, 0, 0), View.MeasureSpec.getMode(0) - 37, (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (byte) (TextUtils.indexOf("", "", 0, 0) + 52), (-1560539843) - Color.red(0), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c((-814195919) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") - 44, (short) (TextUtils.lastIndexOf("", '0') + 1), (byte) ((-69) - Gravity.getAbsoluteGravity(0, 0)), Color.red(0) - 1560539818, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c((-814195912) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-47) - View.MeasureSpec.getSize(0), (short) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) ((-81) - (ViewConfiguration.getPressedStateDuration() >> 16)), Process.getGidForName("") - 1560539800, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c((ViewConfiguration.getEdgeSlop() >> 16) - 814195913, (-47) - View.MeasureSpec.getSize(0), (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (byte) ((-52) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-1577317002) - Color.rgb(0, 0, 0), objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i9 = d + 31;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1294312195};
                        byte[] bArr3 = $$d;
                        byte b6 = bArr3[20];
                        byte b7 = bArr3[44];
                        Object[] objArr13 = new Object[1];
                        e(b6, b7, b7, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b8 = bArr3[18];
                        Object[] objArr14 = new Object[1];
                        e((byte) 91, b8, b8, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31533);
                            int packedPositionType = 921 - ExpandableListView.getPackedPositionType(0L);
                            int iResolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
                            byte[] bArr4 = $$a;
                            byte b9 = (byte) (-bArr4[33]);
                            byte b10 = bArr4[7];
                            Object[] objArr15 = new Object[1];
                            a(b9, b10, b10, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, packedPositionType, iResolveSizeAndState, -1142834547, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            c((-814195921) - Color.argb(0, 0, 0, 0), TextUtils.getOffsetBefore("", 0) - 41, (short) ((Process.getThreadPriority(0) + 20) >> 6), (byte) (ExpandableListView.getPackedPositionChild(0L) + 126), (-1560539877) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c((-814195917) - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getTouchSlop() >> 8) - 48, (short) (TextUtils.lastIndexOf("", '0', 0) + 1), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126), TextUtils.indexOf("", "", 0, 0) - 1560539857, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                                int bitsPerPixel2 = 920 - ImageFormat.getBitsPerPixel(0);
                                int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
                                byte[] bArr5 = $$a;
                                byte b11 = bArr5[80];
                                Object[] objArr18 = new Object[1];
                                a(b11, bArr5[7], b11, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, bitsPerPixel2, iCombineMeasuredStates, -778300370, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
                                int i11 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i12 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27;
                                byte b12 = $$a[80];
                                Object[] objArr19 = new Object[1];
                                a((byte) 52, b12, b12, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, i11, i12, -1048449946, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr == null) {
                        throw null;
                    }
                    int i13 = asInterface + 27;
                    d = i13 % 128;
                    int i14 = i13 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                    throw null;
                }
                int i15 = ((int[]) objArr[0])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i16 = ~elapsedCpuTime;
                int i17 = i15 + (((((~((-1088947799) | i16)) | (~((-685131846) | elapsedCpuTime))) | (~(i16 | 685131845))) * 959) - 1703062626) + (((~(elapsedCpuTime | 685131845)) | (~(i16 | (-685131846))) | (~((-1088947799) | elapsedCpuTime))) * 959);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr20[0])[0] = i19 ^ (i19 << 5);
                return PaymentDataStore.forceExpirePaymentMethod$lambda$23(function1, obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r7, int r8, byte r9) {
                /*
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda35.$$c
                    int r7 = r7 + 117
                    int r8 = r8 * 2
                    int r8 = r8 + 1
                    int r9 = r9 * 3
                    int r9 = 4 - r9
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r9
                    r5 = r2
                    goto L28
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r7
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L22
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L22:
                    r3 = r0[r9]
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r3 = r6
                L28:
                    int r7 = -r7
                    int r7 = r7 + r9
                    int r9 = r3 + 1
                    r3 = r5
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda35.$$g(int, int, byte):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForceExpirePaymentMethodResponse forceExpirePaymentMethod$lambda$23(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ForceExpirePaymentMethodResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<CustomerObjectUpdated> editCustomerObject(EditCustomerObjectRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<EditCustomerObjectResponse>> derivecodecEditCustomerObject = m7686getWebService().editCustomerObject(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecEditCustomerObject, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.editCustomerObject$lambda$24((EditCustomerObjectResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda26
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.editCustomerObject$lambda$25(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerObjectUpdated editCustomerObject$lambda$25(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CustomerObjectUpdated) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerObjectUpdated editCustomerObject$lambda$24(EditCustomerObjectResponse editCustomerObjectResponse) {
        Intrinsics.checkNotNullParameter(editCustomerObjectResponse, "");
        return editCustomerObjectResponse.getDataCustomerObjectUpdated();
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<CustomerObjectUpdated> modifyCustomerObject(EditCustomerObjectRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<EditCustomerObjectResponse>> derivecodecModifyCustomerObject = m7686getWebService().modifyCustomerObject(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecModifyCustomerObject, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.modifyCustomerObject$lambda$26((EditCustomerObjectResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda39
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.modifyCustomerObject$lambda$27(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerObjectUpdated modifyCustomerObject$lambda$27(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CustomerObjectUpdated) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerObjectUpdated modifyCustomerObject$lambda$26(EditCustomerObjectResponse editCustomerObjectResponse) {
        Intrinsics.checkNotNullParameter(editCustomerObjectResponse, "");
        return editCustomerObjectResponse.getDataCustomerObjectUpdated();
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<BaseItem> insertVasTxPayment(InsertVasTxPaymentRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecInsertVasTxPayment = m7686getWebService().InsertVasTxPayment(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecInsertVasTxPayment, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.insertVasTxPayment$lambda$28((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda41
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.insertVasTxPayment$lambda$29(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem insertVasTxPayment$lambda$29(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<BaseItem> flaggingRecurring(FlaggingRecurringRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecFlaggingRecurring = m7686getWebService().flaggingRecurring(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecFlaggingRecurring, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.flaggingRecurring$lambda$30((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.flaggingRecurring$lambda$31(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem flaggingRecurring$lambda$31(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<GetListSertakanAutodebetResponse> getListSertakanAutodebet(GetListSertakanAutodebetRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<GetListSertakanAutodebetResponse>> listSertakanAutodebet = m7686getWebService().getListSertakanAutodebet(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(listSertakanAutodebet, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.getListSertakanAutodebet$lambda$32((GetListSertakanAutodebetResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.getListSertakanAutodebet$lambda$33(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetListSertakanAutodebetResponse getListSertakanAutodebet$lambda$33(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetListSertakanAutodebetResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<BaseItem> nonactiveAutodebit(NonactiveAutodebetRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecNonactiveAutodebit = m7686getWebService().nonactiveAutodebit(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecNonactiveAutodebit, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.nonactiveAutodebit$lambda$34((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.nonactiveAutodebit$lambda$35(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem nonactiveAutodebit$lambda$35(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<GetListKodenonaktifAutodebitResponse> kodeNonactiveAutodebit() {
        deriveCodec<Response<GetListKodenonaktifAutodebitResponse>> derivecodecKodeNonactiveAutodebit = m7686getWebService().kodeNonactiveAutodebit();
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecKodeNonactiveAutodebit, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.kodeNonactiveAutodebit$lambda$36((GetListKodenonaktifAutodebitResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda10
            private static final byte[] $$c = {83, -4, -55, -17};
            private static final int $$f = 198;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {7, 15, 25, 25, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -1, -9, 5, 3, 1, 4, 67, -73, 3, 27, 0, 17, -12, 39, -31, 16, -14, 16, 7, -15, 40, -16, -11, 7, 6, -6, 4, 14, -3, 4, 30, -15, -4, 10, 5, -14, 8, 0, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
            private static final int $$e = 243;
            private static final byte[] $$a = {6, 51, 46, 31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
            private static final int $$b = 178;
            private static int b = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722430;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r7, int r8, int r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 + 4
                    int r9 = 103 - r9
                    int r8 = r8 * 52
                    int r8 = 53 - r8
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda10.$$a
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r9 = r7
                    r3 = r8
                    r5 = r2
                    goto L2b
                L13:
                    r3 = r2
                L14:
                    int r7 = r7 + 1
                    byte r4 = (byte) r9
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L25:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r3 = r6
                L2b:
                    int r7 = -r7
                    int r3 = r3 + r7
                    int r7 = r3 + (-11)
                    r3 = r5
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda10.a(byte, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x0019  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda10.$$d
                    int r1 = r6 + 1
                    int r7 = 115 - r7
                    int r8 = r8 + 4
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L11
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L28
                L11:
                    r3 = r2
                L12:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L21
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L21:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L28:
                    int r8 = -r8
                    int r7 = r7 + r8
                    int r7 = r7 + 3
                    r8 = r3
                    r3 = r4
                    goto L12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda10.d(short, byte, short, java.lang.Object[]):void");
            }

            private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                int i4 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.blue(0), 3291 - TextUtils.indexOf("", ""), 31 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        try {
                            Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.lastIndexOf("", '0') + 652, 44 - KeyEvent.normalizeMetaState(0), -450685997, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                if (i3 > 0) {
                    int i6 = $10 + 3;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (!(!z)) {
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    int i8 = $11 + 27;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        try {
                            Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.alpha(0), 651 - TextUtils.getOffsetBefore("", 0), TextUtils.getOffsetAfter("", 0) + 44, -450685997, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            @Override // defpackage.readableMs
            public final Object apply(Object obj) throws Throwable {
                Object[] objArr;
                Object[] objArr2;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                b = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
                    int iMyTid = (Process.myTid() >> 22) + 10;
                    byte b2 = $$a[5];
                    byte b3 = (byte) (-b2);
                    byte b4 = b2;
                    Object[] objArr3 = new Object[1];
                    a(b3, b4, (byte) (b4 + 4), objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, packedPositionGroup, iMyTid, 252381699, false, (String) objArr3[0], null);
                }
                Object obj2 = null;
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr4 = new Object[1];
                c(true, 131 - Color.green(0), Color.red(0) + 22, 17 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t'}, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                c(true, Color.argb(0, 0, 0, 0) + 135, View.combineMeasuredStates(0, 0) + 15, 6 - ImageFormat.getBitsPerPixel(0), new char[]{65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515}, objArr5);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    int jumpTapTimeout = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
                    byte[] bArr = $$a;
                    Object[] objArr6 = new Object[1];
                    a((byte) (-bArr[5]), bArr[7], bArr[10], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, jumpTapTimeout, longPressTimeout, 2009631821, false, (String) objArr6[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i4 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int iRed = 10 - Color.red(0);
                        byte[] bArr2 = $$a;
                        Object[] objArr7 = new Object[1];
                        a(bArr2[1], bArr2[5], bArr2[7], objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i4, iRed, 256017550, false, (String) objArr7[0], null);
                    }
                    Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i5 = (-1037099744) + (((~(918257043 | startUptimeMillis)) | (-958567273)) * (-964)) + (((~((~startUptimeMillis) | 918257043)) | (-1069285372)) * (-964)) + 816571991;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                } else {
                    Object[] objArr9 = new Object[1];
                    c(false, 131 - TextUtils.indexOf("", "", 0), 26 - View.resolveSizeAndState(0, 0, 0), 11 - View.resolveSize(0, 0), new char[]{6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(false, 138 - TextUtils.getOffsetBefore("", 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, new char[]{65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4}, objArr10);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                        b = i8 % 128;
                        if (i8 % 2 != 0) {
                            boolean z = applicationContext instanceof ContextWrapper;
                            obj2.hashCode();
                            throw null;
                        }
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr11 = new Object[1];
                    c(false, 130 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, View.resolveSizeAndState(0, 0, 0) + 6, new char[]{65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(false, (Process.myTid() >> 22) + 134, 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 17, new char[]{3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535}, objArr12);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
                    b = i9 % 128;
                    int i10 = i9 % 2;
                    try {
                        Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 816571991};
                        byte[] bArr3 = $$d;
                        Object[] objArr14 = new Object[1];
                        d((byte) (-bArr3[14]), bArr3[32], bArr3[41], objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        d(bArr3[51], bArr3[52], (byte) 47, objArr15);
                        objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                        if (applicationContext != null) {
                            int i11 = b + 101;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                            int i12 = i11 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                                int iBlue = Color.blue(0) + 876;
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                                byte[] bArr4 = $$a;
                                Object[] objArr16 = new Object[1];
                                a(bArr4[1], bArr4[5], bArr4[7], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, iBlue, scrollBarFadeDuration, 256017550, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(true, 131 - (Process.myTid() >> 22), Drawable.resolveOpacity(0, 0) + 22, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, new char[]{65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t'}, objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(true, 135 - (Process.myPid() >> 22), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, 7 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515}, objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                    int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 11;
                                    byte[] bArr5 = $$a;
                                    byte b5 = (byte) (-bArr5[5]);
                                    byte b6 = bArr5[7];
                                    byte b7 = bArr5[10];
                                    Object[] objArr19 = new Object[1];
                                    a(b5, b6, b7, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, iResolveSizeAndState, iLastIndexOf, 2009631821, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                                    int iIndexOf = 876 - TextUtils.indexOf("", "", 0);
                                    int mode = 10 - View.MeasureSpec.getMode(0);
                                    byte b8 = $$a[5];
                                    byte b9 = (byte) (-b8);
                                    byte b10 = b8;
                                    Object[] objArr20 = new Object[1];
                                    a(b9, b10, (byte) (b10 + 4), objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, iIndexOf, mode, 252381699, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
                    throw null;
                }
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                b = i13 % 128;
                int i14 = i13 % 2;
                int i15 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i16 = ~iIdentityHashCode;
                int i17 = (~(954383146 | i16)) | 50938069;
                int i18 = ~(iIdentityHashCode | (-10627841));
                int i19 = i15 + (((i17 | i18) * (-252)) - 8198272) + ((i18 | (~(i16 | 1005321215))) * 252);
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr21[1])[0] = i21 ^ (i21 << 5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char deadChar = (char) (37567 - KeyEvent.getDeadChar(0, 0));
                    int i22 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 624;
                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 14;
                    byte b11 = $$a[5];
                    byte b12 = (byte) (-b11);
                    byte b13 = b11;
                    Object[] objArr22 = new Object[1];
                    a(b12, b13, (byte) (b13 + 4), objArr22);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, i22, jumpTapTimeout2, -477065106, false, (String) objArr22[0], null);
                }
                long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
                Object[] objArr23 = new Object[1];
                c(true, 131 - Color.green(0), AndroidCharacter.getMirror('0') - 26, Color.rgb(0, 0, 0) + 16777234, new char[]{65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t'}, objArr23);
                Class<?> cls6 = Class.forName((String) objArr23[0]);
                Object[] objArr24 = new Object[1];
                c(true, (ViewConfiguration.getTouchSlop() >> 8) + 135, 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 7, new char[]{65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515}, objArr24);
                long jLongValue3 = ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char jumpTapTimeout3 = (char) (37567 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int edgeSlop = 625 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int i23 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                    byte[] bArr6 = $$a;
                    Object[] objArr25 = new Object[1];
                    a(bArr6[1], bArr6[7], bArr6[10], objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(jumpTapTimeout3, edgeSlop, i23, -976899241, false, (String) objArr25[0], null);
                }
                if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37567);
                        int i24 = 626 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int i25 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13;
                        byte[] bArr7 = $$a;
                        Object[] objArr26 = new Object[1];
                        a((byte) 103, bArr7[7], bArr7[10], objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c2, i24, i25, -973632554, false, (String) objArr26[0], null);
                    }
                    Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
                    int i26 = ((int[]) objArr27[2])[0];
                    int i27 = ((int[]) objArr27[0])[0];
                    String[] strArr = (String[]) objArr27[3];
                    int[] iArr = {i26};
                    int[] iArr2 = {i27};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i28 = ~iIdentityHashCode2;
                    int i29 = (~((-435190342) | i28)) | 281020993;
                    int i30 = ~(iIdentityHashCode2 | 1542717127);
                    int i31 = ((1162355838 + ((i29 | i30) * (-502))) + ((i30 | (~(i28 | (-154169349)))) * TypedValues.PositionType.TYPE_DRAWPATH)) - 1674538064;
                    int i32 = (i31 << 13) ^ i31;
                    int i33 = i32 ^ (i32 >>> 17);
                    ((int[]) objArr2[1])[0] = i33 ^ (i33 << 5);
                    objArr2 = new Object[]{iArr2, new int[1], iArr, strArr};
                } else {
                    Object[] objArr28 = new Object[1];
                    c(false, (-16777085) - Color.rgb(0, 0, 0), 26 - TextUtils.getCapsMode("", 0, 0), 10 - TextUtils.lastIndexOf("", '0', 0), new char[]{6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17}, objArr28);
                    Class<?> cls7 = Class.forName((String) objArr28[0]);
                    Object[] objArr29 = new Object[1];
                    c(false, 137 - Process.getGidForName(""), Color.rgb(0, 0, 0) + 16777234, 17 - ExpandableListView.getPackedPositionChild(0L), new char[]{65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4}, objArr29);
                    Context applicationContext2 = (Context) cls7.getMethod((String) objArr29[0], new Class[0]).invoke(null, null);
                    if (applicationContext2 != null) {
                        int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
                        b = i34 % 128;
                        if (i34 % 2 != 0) {
                            boolean z2 = applicationContext2 instanceof ContextWrapper;
                            throw null;
                        }
                        if ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) {
                            applicationContext2 = null;
                        } else {
                            applicationContext2 = applicationContext2.getApplicationContext();
                            int i35 = b + 27;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i35 % 128;
                            if (i35 % 2 == 0) {
                                int i36 = 5 % 4;
                            }
                        }
                    }
                    Object[] objArr30 = new Object[1];
                    c(false, ExpandableListView.getPackedPositionChild(0L) + 131, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, 6 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484}, objArr30);
                    Class<?> cls8 = Class.forName((String) objArr30[0]);
                    Object[] objArr31 = new Object[1];
                    c(false, 134 - ExpandableListView.getPackedPositionGroup(0L), 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 15 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535}, objArr31);
                    int iIntValue2 = ((Integer) cls8.getMethod((String) objArr31[0], Object.class).invoke(null, this)).intValue();
                    Object[] objArr32 = new Object[1];
                    c(true, 105 - (ViewConfiguration.getWindowTouchSlop() >> 8), Color.alpha(0) + 64, 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{28, 28, 65516, 29, 29, 65520, 65517, 29, 25, 24, 24, 29, 28, 65513, 25, 65513, 29, 25, 25, 65515, 65519, 65520, 25, 65513, 65519, 65515, 24, 65519, 65511, 24, 65516, 65514, 28, 29, 65519, 65515, 65516, 29, 24, 65519, 65512, 65512, 65520, 65513, 24, 65520, 65520, 65515, 27, 65514, 65512, 25, 65518, 28, 25, 65518, 65518, 65516, 28, 65517, 65512, 65518, 65516, 24}, objArr32);
                    String str = (String) objArr32[0];
                    Object[] objArr33 = new Object[1];
                    c(true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 100, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 64, 58 - TextUtils.lastIndexOf("", '0'), new char[]{65517, '!', 30, 65517, 65518, 65519, 29, 65524, 65524, 30, 65524, 65518, 65518, 65519, 65522, 65521, '!', ' ', 65517, 65517, 28, ' ', 65519, 65516, 65520, 29, 65524, 65523, 65524, 65524, 65518, 65524, 29, 65519, 29, 65521, '!', 65522, 65520, 65518, 65521, 65518, 65517, 65519, '!', 65517, ' ', 29, 65515, '!', ' ', 65522, 29, 65520, 65515, 65521, 31, 28, 30, '!', 65521, 65515, 28, 65519}, objArr33);
                    Object[] objArr34 = {applicationContext2, new String[]{str, (String) objArr33[0]}, Integer.valueOf(iIntValue2), 17, -1674538064};
                    byte[] bArr8 = $$d;
                    byte b14 = bArr8[50];
                    byte b15 = bArr8[51];
                    Object[] objArr35 = new Object[1];
                    d(b14, b15, (byte) (b15 | 47), objArr35);
                    Class<?> cls9 = Class.forName((String) objArr35[0]);
                    Object[] objArr36 = new Object[1];
                    d((byte) 52, (byte) (-bArr8[55]), (byte) 74, objArr36);
                    objArr2 = (Object[]) cls9.getMethod((String) objArr36[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr34);
                    int i37 = ((int[]) objArr2[0])[0];
                    int i38 = ((int[]) objArr2[2])[0];
                    if (applicationContext2 != null) {
                        int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
                        b = i39 % 128;
                        int i40 = i39 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            char pressedStateDuration = (char) (37567 - (ViewConfiguration.getPressedStateDuration() >> 16));
                            int modifierMetaStateMask = 624 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int iBlue2 = Color.blue(0) + 14;
                            byte[] bArr9 = $$a;
                            Object[] objArr37 = new Object[1];
                            a((byte) 103, bArr9[7], bArr9[10], objArr37);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(pressedStateDuration, modifierMetaStateMask, iBlue2, -973632554, false, (String) objArr37[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr2);
                        try {
                            Object[] objArr38 = new Object[1];
                            c(true, 131 - Color.argb(0, 0, 0, 0), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 18, new char[]{65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t'}, objArr38);
                            Class<?> cls10 = Class.forName((String) objArr38[0]);
                            Object[] objArr39 = new Object[1];
                            c(true, 135 - Gravity.getAbsoluteGravity(0, 0), 15 - (Process.myTid() >> 22), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6, new char[]{65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515}, objArr39);
                            long jLongValue4 = ((Long) cls10.getDeclaredMethod((String) objArr39[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue4);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                char c3 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37567);
                                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 626;
                                int iLastIndexOf2 = 13 - TextUtils.lastIndexOf("", '0', 0, 0);
                                byte[] bArr10 = $$a;
                                Object[] objArr40 = new Object[1];
                                a(bArr10[1], bArr10[7], bArr10[10], objArr40);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c3, modifierMetaStateMask2, iLastIndexOf2, -976899241, false, (String) objArr40[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0));
                                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 625;
                                int windowTouchSlop = 14 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                byte b16 = $$a[5];
                                byte b17 = (byte) (-b16);
                                byte b18 = b16;
                                Object[] objArr41 = new Object[1];
                                a(b17, b18, (byte) (b18 + 4), objArr41);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cLastIndexOf, iResolveSizeAndState2, windowTouchSlop, -477065106, false, (String) objArr41[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                        } catch (Exception unused2) {
                            throw new RuntimeException();
                        }
                    }
                }
                int i41 = ((int[]) objArr2[0])[0];
                int i42 = ((int[]) objArr2[2])[0];
                if (i42 == i41) {
                    int i43 = ((int[]) objArr2[1])[0];
                    int i44 = ((int[]) objArr2[2])[0];
                    int i45 = ((int[]) objArr2[0])[0];
                    String[] strArr2 = (String[]) objArr2[3];
                    int[] iArr3 = {i44};
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i46 = ~iMaxMemory;
                    int i47 = i43 + (-1480729712) + (((~((-418396233) | i46)) | (-1405341889)) * (-865)) + ((~(iMaxMemory | 418396232)) * 865) + (((~((-1405341889) | i46)) | (~(i46 | 418396232))) * 865);
                    int i48 = (i47 << 13) ^ i47;
                    int i49 = i48 ^ (i48 >>> 17);
                    ((int[]) objArr[1])[0] = i49 ^ (i49 << 5);
                    Object[] objArr42 = {new int[]{i45}, new int[1], iArr3, strArr2};
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr2[3];
                    if (strArr3 != null) {
                        int i50 = b + 113;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i50 % 128;
                        for (int i51 = i50 % 2 == 0 ? 1 : 0; i51 < strArr3.length; i51++) {
                            arrayList.add(strArr3[i51]);
                        }
                    }
                    int[] iArr4 = new int[i42];
                    int i52 = i42 - 1;
                    iArr4[i52] = 1;
                    Toast.makeText((Context) null, iArr4[((i42 * i52) % 2) - 1], 1).show();
                    int i53 = ((int[]) objArr2[1])[0];
                    int i54 = ((int[]) objArr2[2])[0];
                    int i55 = ((int[]) objArr2[0])[0];
                    String[] strArr4 = (String[]) objArr2[3];
                    int iIdentityHashCode3 = System.identityHashCode(this);
                    int i56 = i53 + ((((-452056616) + (((~((-1069238215) | iIdentityHashCode3)) | (-754499907)) * (-948))) + ((~((~iIdentityHashCode3) | (-750272835))) * (-948))) - 1731470468);
                    int i57 = (i56 << 13) ^ i56;
                    int i58 = i57 ^ (i57 >>> 17);
                    ((int[]) objArr[1])[0] = i58 ^ (i58 << 5);
                    Object[] objArr43 = {new int[]{i55}, new int[1], new int[]{i54}, strArr4};
                }
                return PaymentDataStore.kodeNonactiveAutodebit$lambda$37(function1, obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r5, short r6, byte r7) {
                /*
                    int r5 = r5 * 2
                    int r5 = 3 - r5
                    byte[] r0 = com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda10.$$c
                    int r6 = r6 * 2
                    int r1 = r6 + 1
                    int r7 = 120 - r7
                    byte[] r1 = new byte[r1]
                    r2 = -1
                    if (r0 != 0) goto L14
                    r3 = r2
                    r2 = r5
                    goto L2d
                L14:
                    r4 = r7
                    r7 = r5
                    r5 = r4
                L17:
                    int r2 = r2 + 1
                    byte r3 = (byte) r5
                    r1[r2] = r3
                    int r7 = r7 + 1
                    if (r2 != r6) goto L27
                    java.lang.String r5 = new java.lang.String
                    r6 = 0
                    r5.<init>(r1, r6)
                    return r5
                L27:
                    r3 = r0[r7]
                    r4 = r2
                    r2 = r7
                    r7 = r3
                    r3 = r4
                L2d:
                    int r5 = r5 + r7
                    r7 = r2
                    r2 = r3
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda10.$$g(byte, short, byte):java.lang.String");
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetListKodenonaktifAutodebitResponse kodeNonactiveAutodebit$lambda$37(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetListKodenonaktifAutodebitResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<SubmitAutodebitBniAutopayResponse> insertProfilAutodebetBni(SubmitAutodebitBniAutopayRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<SubmitAutodebitBniAutopayResponse>> derivecodecInsertProfilAutodebetBni = m7686getWebService().insertProfilAutodebetBni(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecInsertProfilAutodebetBni, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.insertProfilAutodebetBni$lambda$38((SubmitAutodebitBniAutopayResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.insertProfilAutodebetBni$lambda$39(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubmitAutodebitBniAutopayResponse insertProfilAutodebetBni$lambda$39(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SubmitAutodebitBniAutopayResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<BaseItem> verifyOtpInsertAutodebetBni(VerifyOtpSubmitAutodebitBniRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecVerifyOtpInsertAutodebetBni = m7686getWebService().verifyOtpInsertAutodebetBni(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyOtpInsertAutodebetBni, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.verifyOtpInsertAutodebetBni$lambda$40((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda24
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.verifyOtpInsertAutodebetBni$lambda$41(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyOtpInsertAutodebetBni$lambda$41(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<SubmitNonactiveAutodebetBniResponse> submitNonaktifAutodebetBni(SubmitNonactiveAutodebitBniRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<SubmitNonactiveAutodebetBniResponse>> derivecodecSubmitNonaktifAutodebetBni = m7686getWebService().submitNonaktifAutodebetBni(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecSubmitNonaktifAutodebetBni, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.submitNonaktifAutodebetBni$lambda$42((SubmitNonactiveAutodebetBniResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda32
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.submitNonaktifAutodebetBni$lambda$43(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubmitNonactiveAutodebetBniResponse submitNonaktifAutodebetBni$lambda$43(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SubmitNonactiveAutodebetBniResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.payment.PaymentRepository
    public final deriveCodec<BaseItem> verifyOtpNonactiveAutodebetBni(VerifyOtpSubmitAutodebitBniRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecVerifyOtpNonactiveAutodebetBni = m7686getWebService().verifyOtpNonactiveAutodebetBni(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyOtpNonactiveAutodebetBni, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentDataStore.verifyOtpNonactiveAutodebetBni$lambda$44((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.payment.PaymentDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PaymentDataStore.verifyOtpNonactiveAutodebetBni$lambda$45(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyOtpNonactiveAutodebetBni$lambda$45(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthOtpBriDirectDebitResponse authOtpBriRecurring$lambda$20(AuthOtpBriDirectDebitResponse authOtpBriDirectDebitResponse) {
        Intrinsics.checkNotNullParameter(authOtpBriDirectDebitResponse, "");
        return authOtpBriDirectDebitResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckOneTimePaymentResponse checkOneTimePayment$lambda$10(CheckOneTimePaymentResponse checkOneTimePaymentResponse) {
        Intrinsics.checkNotNullParameter(checkOneTimePaymentResponse, "");
        return checkOneTimePaymentResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetStatusRecurringPlanResponse checkStatusRecurringPlan$lambda$12(GetStatusRecurringPlanResponse getStatusRecurringPlanResponse) {
        Intrinsics.checkNotNullParameter(getStatusRecurringPlanResponse, "");
        return getStatusRecurringPlanResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreatePaymentMethodGeneralResponse createBriDDRecurring$lambda$18(CreatePaymentMethodGeneralResponse createPaymentMethodGeneralResponse) {
        Intrinsics.checkNotNullParameter(createPaymentMethodGeneralResponse, "");
        return createPaymentMethodGeneralResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateOneTimePaymentResponse createOneTimePayment$lambda$8(CreateOneTimePaymentResponse createOneTimePaymentResponse) {
        Intrinsics.checkNotNullParameter(createOneTimePaymentResponse, "");
        return createOneTimePaymentResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem flaggingRecurring$lambda$30(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForceExpirePaymentMethodResponse forceExpirePaymentMethod$lambda$22(ForceExpirePaymentMethodResponse forceExpirePaymentMethodResponse) {
        Intrinsics.checkNotNullParameter(forceExpirePaymentMethodResponse, "");
        return forceExpirePaymentMethodResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetListSertakanAutodebetResponse getListSertakanAutodebet$lambda$32(GetListSertakanAutodebetResponse getListSertakanAutodebetResponse) {
        Intrinsics.checkNotNullParameter(getListSertakanAutodebetResponse, "");
        return getListSertakanAutodebetResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubmitAutodebitBniAutopayResponse insertProfilAutodebetBni$lambda$38(SubmitAutodebitBniAutopayResponse submitAutodebitBniAutopayResponse) {
        Intrinsics.checkNotNullParameter(submitAutodebitBniAutopayResponse, "");
        return submitAutodebitBniAutopayResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem insertVasTxPayment$lambda$28(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetListKodenonaktifAutodebitResponse kodeNonactiveAutodebit$lambda$36(GetListKodenonaktifAutodebitResponse getListKodenonaktifAutodebitResponse) {
        Intrinsics.checkNotNullParameter(getListKodenonaktifAutodebitResponse, "");
        return getListKodenonaktifAutodebitResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem nonactiveAutodebit$lambda$34(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubmitNonactiveAutodebetBniResponse submitNonaktifAutodebetBni$lambda$42(SubmitNonactiveAutodebetBniResponse submitNonactiveAutodebetBniResponse) {
        Intrinsics.checkNotNullParameter(submitNonactiveAutodebetBniResponse, "");
        return submitNonactiveAutodebetBniResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyOtpInsertAutodebetBni$lambda$40(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem verifyOtpNonactiveAutodebetBni$lambda$44(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }
}
