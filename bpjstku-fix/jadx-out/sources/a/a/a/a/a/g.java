package a.a.a.a.a;

import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.snap.BankBinsResponse;
import com.midtrans.sdk.corekit.models.snap.BanksPointResponse;
import com.midtrans.sdk.corekit.models.snap.Transaction;
import com.midtrans.sdk.corekit.models.snap.TransactionStatusResponse;
import com.midtrans.sdk.corekit.models.snap.payment.BankTransferPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.BasePaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.CreditCardPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.DanamonOnlinePaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.GCIPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.GoPayPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.IndosatDompetkuPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.KlikBCAPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.NewMandiriClickPayPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.ShopeePayPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.ShopeePayQrisPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.TelkomselEcashPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.UobEzpayPaymentRequest;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
public interface g {
    @GET("v1/bank_bins")
    Call<List<BankBinsResponse>> a();

    @GET("v1/transactions/{snap_token}/status")
    Call<TransactionStatusResponse> a(@Path("snap_token") String str);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body BankTransferPaymentRequest bankTransferPaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body BasePaymentRequest basePaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body CreditCardPaymentRequest creditCardPaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body DanamonOnlinePaymentRequest danamonOnlinePaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body GCIPaymentRequest gCIPaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body GoPayPaymentRequest goPayPaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body IndosatDompetkuPaymentRequest indosatDompetkuPaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body KlikBCAPaymentRequest klikBCAPaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body NewMandiriClickPayPaymentRequest newMandiriClickPayPaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body ShopeePayPaymentRequest shopeePayPaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body ShopeePayQrisPaymentRequest shopeePayQrisPaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body TelkomselEcashPaymentRequest telkomselEcashPaymentRequest);

    @POST("v1/transactions/{snap_token}/pay")
    Call<TransactionResponse> a(@Path("snap_token") String str, @Body UobEzpayPaymentRequest uobEzpayPaymentRequest);

    @DELETE("v1/transactions/{snap_token}/saved_tokens/{masked_card}")
    Call<Void> a(@Path("snap_token") String str, @Path("masked_card") String str2);

    @GET("v1/transactions/{snap_token}/point_inquiry/{card_token}")
    Call<BanksPointResponse> a(@Path("snap_token") String str, @Path("card_token") String str2, @Query("gross_amount") Double d);

    @GET("v1/transactions/{snap_token}")
    Call<Transaction> b(@Path("snap_token") String str);
}
