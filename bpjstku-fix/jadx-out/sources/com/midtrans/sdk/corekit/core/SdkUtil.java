package com.midtrans.sdk.corekit.core;

import a.a.a.a.a.b;
import a.a.a.a.a.d;
import a.a.a.a.a.g;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.gms.auth.api.identity.zby;
import com.google.android.gms.common.stats.StatsEvent;
import com.midtrans.sdk.analytics.MixpanelAnalyticsManager;
import com.midtrans.sdk.corekit.BuildConfig;
import com.midtrans.sdk.corekit.models.BankType;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.SnapTransactionDetails;
import com.midtrans.sdk.corekit.models.TokenRequestModel;
import com.midtrans.sdk.corekit.models.promo.Promo;
import com.midtrans.sdk.corekit.models.snap.CreditCardPaymentModel;
import com.midtrans.sdk.corekit.models.snap.Transaction;
import com.midtrans.sdk.corekit.models.snap.params.CreditCardPaymentParams;
import com.midtrans.sdk.corekit.models.snap.params.GCIPaymentParams;
import com.midtrans.sdk.corekit.models.snap.params.KlikBcaPaymentParams;
import com.midtrans.sdk.corekit.models.snap.params.PromoDetails;
import com.midtrans.sdk.corekit.models.snap.payment.BankTransferPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.CreditCardPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.CustomerDetailRequest;
import com.midtrans.sdk.corekit.models.snap.payment.DanamonOnlinePaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.GCIPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.GoPayPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.KlikBCAPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.QrisPaymentParameter;
import com.midtrans.sdk.corekit.models.snap.payment.ShopeePayPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.ShopeePayQrisPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.UobEzpayPaymentRequest;
import com.midtrans.sdk.corekit.utilities.Installation;
import defpackage.getExtras;
import defpackage.getItem;
import defpackage.getNotifyChildrenChangedOptions;
import defpackage.getRoot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
public class SdkUtil {
    private static final String UNIT_MINUTES = "minutes";

    public static getNotifyChildrenChangedOptions newMerchantServiceManager(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new getNotifyChildrenChangedOptions((b) new Retrofit.Builder().baseUrl(str).client(getRoot.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i)).addConverterFactory(GsonConverterFactory.create(getRoot.TuitionPaymentFragmentbindingInflater1())).build().create(b.class));
    }

    public static getExtras newMidtransServiceManager(int i) {
        return new getExtras((d) new Retrofit.Builder().baseUrl(BuildConfig.BASE_URL).client(getRoot.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i)).addConverterFactory(GsonConverterFactory.create(getRoot.TuitionPaymentFragmentbindingInflater1())).build().create(d.class));
    }

    public static getItem newSnapServiceManager(int i) {
        Retrofit.Builder builderBaseUrl = new Retrofit.Builder().baseUrl(BuildConfig.SNAP_BASE_URL);
        if (StatsEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
            Toast.makeText((Context) null, i / (((i - 1) * i) % 2), 0).show();
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpClient.Builder builderAddInterceptor = builder.addInterceptor(getRoot.TuitionPaymentFragmentspecialinlinedviewModeldefault1()).addInterceptor(new getRoot.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        if (zby.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ArrayList()) != 0) {
            throw new RuntimeException(String.valueOf(i));
        }
        long j = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builderAddInterceptor.connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit);
        return new getItem((g) builderBaseUrl.client(builder.build()).addConverterFactory(GsonConverterFactory.create(getRoot.TuitionPaymentFragmentbindingInflater1())).build().create(g.class));
    }

    public static BankTransferPaymentRequest getBankTransferPaymentRequest(String str, String str2) {
        CustomerDetailRequest customerDetailRequest = new CustomerDetailRequest();
        customerDetailRequest.setEmail(str);
        return new BankTransferPaymentRequest(str2, customerDetailRequest);
    }

    public static CreditCardPaymentRequest getCreditCardPaymentRequest(CreditCardPaymentModel creditCardPaymentModel, Transaction transaction) {
        CustomerDetailRequest customerDetailRequestInitializePaymentDetails = initializePaymentDetails(transaction);
        CreditCardPaymentParams creditCardPaymentParams = new CreditCardPaymentParams(creditCardPaymentModel.getCardToken(), Boolean.valueOf(creditCardPaymentModel.isSavecard()), creditCardPaymentModel.getMaskedCardNumber(), creditCardPaymentModel.getInstallment());
        creditCardPaymentParams.setPointRedeemed(creditCardPaymentModel.getPointRedeemed());
        if (creditCardPaymentModel.getBank() != null && creditCardPaymentModel.getBank().equalsIgnoreCase(BankType.MANDIRI)) {
            creditCardPaymentParams.setBank(creditCardPaymentModel.getBank());
        }
        creditCardPaymentParams.setFromBankPoint(creditCardPaymentModel.isFromBankPoint());
        CreditCardPaymentRequest creditCardPaymentRequest = new CreditCardPaymentRequest("credit_card", creditCardPaymentParams, customerDetailRequestInitializePaymentDetails);
        Promo promoSelected = creditCardPaymentModel.getPromoSelected();
        if (promoSelected != null) {
            creditCardPaymentRequest.setPromoDetails(new PromoDetails(Long.valueOf(promoSelected.getId()), Double.valueOf(promoSelected.getDiscountedGrossAmount())));
        }
        return creditCardPaymentRequest;
    }

    public static DanamonOnlinePaymentRequest getDanamonOnlinePaymentRequest() {
        return new DanamonOnlinePaymentRequest(PaymentType.DANAMON_ONLINE);
    }

    public static String getDeviceId(Context context) {
        try {
            return Installation.id(context);
        } catch (Exception e2) {
            Logger.e(e2.toString());
            return "UNKNOWN";
        }
    }

    public static GCIPaymentRequest getGCIPaymentRequest(String str, String str2) {
        return new GCIPaymentRequest(new GCIPaymentParams(str, str2), PaymentType.GCI);
    }

    public static GoPayPaymentRequest getGoPayPaymentRequest() {
        return new GoPayPaymentRequest(PaymentType.GOPAY);
    }

    public static KlikBCAPaymentRequest getKlikBCAPaymentRequest(String str, String str2) {
        return new KlikBCAPaymentRequest(str2, new KlikBcaPaymentParams(str));
    }

    public static ShopeePayPaymentRequest getShopeePayPaymentRequest() {
        return new ShopeePayPaymentRequest(PaymentType.SHOPEEPAY);
    }

    public static ShopeePayQrisPaymentRequest getShopeePayQrisPaymentRequest() {
        return new ShopeePayQrisPaymentRequest(PaymentType.QRIS, new QrisPaymentParameter(Collections.singletonList(PaymentType.SHOPEEPAY)));
    }

    public static TokenRequestModel getSnapTokenRequestModel(TransactionRequest transactionRequest) {
        SnapTransactionDetails snapTransactionDetails = new SnapTransactionDetails(transactionRequest.getOrderId(), Double.valueOf(transactionRequest.getAmount()));
        snapTransactionDetails.setCurrency(transactionRequest.getCurrency());
        TokenRequestModel tokenRequestModel = new TokenRequestModel(snapTransactionDetails, transactionRequest.getItemDetails(), transactionRequest.getCustomerDetails(), transactionRequest.getCreditCard());
        tokenRequestModel.setExpiry(transactionRequest.getExpiry());
        if (transactionRequest.getExpiry() != null) {
            tokenRequestModel.setExpiry(transactionRequest.getExpiry());
        }
        if (transactionRequest.getCustomField1() != null && !TextUtils.isEmpty(transactionRequest.getCustomField1())) {
            tokenRequestModel.setCustomField1(transactionRequest.getCustomField1());
        }
        if (transactionRequest.getCustomField2() != null && !TextUtils.isEmpty(transactionRequest.getCustomField2())) {
            tokenRequestModel.setCustomField2(transactionRequest.getCustomField2());
        }
        if (transactionRequest.getCustomField3() != null && !TextUtils.isEmpty(transactionRequest.getCustomField3())) {
            tokenRequestModel.setCustomField3(transactionRequest.getCustomField3());
        }
        if (transactionRequest.getPermataVa() != null) {
            tokenRequestModel.setPermataVa(transactionRequest.getPermataVa());
        }
        if (transactionRequest.getBcaVa() != null) {
            tokenRequestModel.setBcaVa(transactionRequest.getBcaVa());
        }
        if (transactionRequest.getBniVa() != null) {
            tokenRequestModel.setBniVa(transactionRequest.getBniVa());
        }
        if (transactionRequest.getBriVa() != null) {
            tokenRequestModel.setBriVa(transactionRequest.getBriVa());
        }
        if (transactionRequest.getEnabledPayments() != null && !transactionRequest.getEnabledPayments().isEmpty()) {
            tokenRequestModel.setEnabledPayments(transactionRequest.getEnabledPayments());
        }
        if (transactionRequest.getGopay() != null) {
            tokenRequestModel.setGopay(transactionRequest.getGopay());
        }
        if (transactionRequest.getShopeepay() != null) {
            tokenRequestModel.setShopeepay(transactionRequest.getShopeepay());
        }
        if (transactionRequest.getUobEzpay() != null) {
            tokenRequestModel.setUobEzpay(transactionRequest.getUobEzpay());
        }
        return tokenRequestModel;
    }

    public static UobEzpayPaymentRequest getUobEzpayPaymentRequest() {
        return new UobEzpayPaymentRequest(PaymentType.UOB_EZPAY);
    }

    public static CustomerDetailRequest initializePaymentDetails(Transaction transaction) {
        CustomerDetails customerDetails;
        if (transaction == null || (customerDetails = transaction.getCustomerDetails()) == null) {
            return null;
        }
        CustomerDetailRequest customerDetailRequest = new CustomerDetailRequest();
        customerDetailRequest.setFullName(customerDetails.getFirstName());
        customerDetailRequest.setPhone(customerDetails.getPhone());
        customerDetailRequest.setEmail(customerDetails.getEmail());
        return customerDetailRequest;
    }

    public static MixpanelAnalyticsManager newMixpanelAnalyticsManager(String str, String str2, String str3, String str4, String str5, boolean z, Context context) {
        return new MixpanelAnalyticsManager(str, str2, str3, str4, str5, z, context);
    }
}
