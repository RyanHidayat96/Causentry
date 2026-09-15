package a.a.a.a.a;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.models.CardRegistrationResponse;
import com.midtrans.sdk.corekit.models.TokenDetailsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    @GET(Constants.QUERY_STRING)
    Call<TokenDetailsResponse> a(@Query("card_cvv") String str, @Query("token_id") String str2, @Query("two_click") Boolean bool, @Query("gross_amount") Double d, @Query(PlaceTypes.BANK) String str3, @Query("client_key") String str4, @Query("installment") Boolean bool2, @Query("installment_term") String str5, @Query(AppsFlyerProperties.CHANNEL) String str6, @Query("type") String str7, @Query(FirebaseAnalytics.Param.CURRENCY) String str8, @Query("point") Boolean bool3);

    @GET(Constants.QUERY_STRING)
    Call<TokenDetailsResponse> a(@Query("card_cvv") String str, @Query("token_id") String str2, @Query("two_click") Boolean bool, @Query("gross_amount") Double d, @Query(PlaceTypes.BANK) String str3, @Query("client_key") String str4, @Query(AppsFlyerProperties.CHANNEL) String str5, @Query("type") String str6, @Query(FirebaseAnalytics.Param.CURRENCY) String str7, @Query("point") Boolean bool2);

    @Headers({"Content-Type: application/json", "x-auth: da53847171259b511488cf366e701050"})
    @GET("card/register")
    Call<CardRegistrationResponse> a(@Query("card_number") String str, @Query("card_cvv") String str2, @Query("card_exp_month") String str3, @Query("card_exp_year") String str4, @Query("client_key") String str5);

    @GET(Constants.QUERY_STRING)
    Call<TokenDetailsResponse> a(@Query("card_number") String str, @Query("card_cvv") String str2, @Query("card_exp_month") String str3, @Query("card_exp_year") String str4, @Query("client_key") String str5, @Query("gross_amount") Double d, @Query(AppsFlyerProperties.CHANNEL) String str6, @Query("type") String str7, @Query(FirebaseAnalytics.Param.CURRENCY) String str8, @Query("point") Boolean bool);

    @GET(Constants.QUERY_STRING)
    Call<TokenDetailsResponse> a(@Query("card_number") String str, @Query("card_cvv") String str2, @Query("card_exp_month") String str3, @Query("card_exp_year") String str4, @Query("client_key") String str5, @Query(PlaceTypes.BANK) String str6, @Query("two_click") Boolean bool, @Query("gross_amount") Double d, @Query("installment") Boolean bool2, @Query(AppsFlyerProperties.CHANNEL) String str7, @Query("installment_term") String str8, @Query("type") String str9, @Query(FirebaseAnalytics.Param.CURRENCY) String str10, @Query("point") Boolean bool3);

    @GET(Constants.QUERY_STRING)
    Call<TokenDetailsResponse> a(@Query("card_number") String str, @Query("card_cvv") String str2, @Query("card_exp_month") String str3, @Query("card_exp_year") String str4, @Query("client_key") String str5, @Query(PlaceTypes.BANK) String str6, @Query("two_click") Boolean bool, @Query("gross_amount") Double d, @Query(AppsFlyerProperties.CHANNEL) String str7, @Query("type") String str8, @Query(FirebaseAnalytics.Param.CURRENCY) String str9, @Query("point") Boolean bool2);
}
