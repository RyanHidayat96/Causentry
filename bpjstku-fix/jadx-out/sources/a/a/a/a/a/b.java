package a.a.a.a.a;

import com.midtrans.sdk.corekit.models.SaveCardRequest;
import com.midtrans.sdk.corekit.models.TokenRequestModel;
import com.midtrans.sdk.corekit.models.snap.Token;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("charge")
    Call<Token> a(@Body TokenRequestModel tokenRequestModel);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("users/{user_id}/tokens")
    Call<List<SaveCardRequest>> a(@Path("user_id") String str);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("users/{user_id}/tokens")
    Call<List<SaveCardRequest>> a(@Path("user_id") String str, @Body List<SaveCardRequest> list);
}
