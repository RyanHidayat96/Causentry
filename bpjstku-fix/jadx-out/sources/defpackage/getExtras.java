package defpackage;

import a.a.a.a.a.d;
import android.text.TextUtils;
import com.midtrans.sdk.corekit.callback.CardRegistrationCallback;
import com.midtrans.sdk.corekit.callback.CardTokenCallback;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.CardRegistrationResponse;
import com.midtrans.sdk.corekit.models.TokenDetailsResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class getExtras extends disconnect {
    private static String b = "c";
    public d TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public class TuitionPaymentFragmentbindingInflater1 implements Callback<CardRegistrationResponse> {
        private /* synthetic */ CardRegistrationCallback b;

        public TuitionPaymentFragmentbindingInflater1(CardRegistrationCallback cardRegistrationCallback) {
            this.b = cardRegistrationCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<CardRegistrationResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.b);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<CardRegistrationResponse> call, Response<CardRegistrationResponse> response) {
            CardRegistrationResponse cardRegistrationResponseBody = response.body();
            if (cardRegistrationResponseBody == null) {
                this.b.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_RESPONSE));
                return;
            }
            String statusCode = cardRegistrationResponseBody.getStatusCode();
            if (TextUtils.isEmpty(statusCode) || !statusCode.equals(Constants.STATUS_CODE_200)) {
                this.b.onFailure(cardRegistrationResponseBody, cardRegistrationResponseBody.getStatusMessage());
            } else {
                this.b.onSuccess(cardRegistrationResponseBody);
            }
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Callback<TokenDetailsResponse> {
        private /* synthetic */ CardTokenCallback b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(CardTokenCallback cardTokenCallback) {
            this.b = cardTokenCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TokenDetailsResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.b);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TokenDetailsResponse> call, Response<TokenDetailsResponse> response) {
            getExtras.TuitionPaymentFragmentbindingInflater1(getExtras.this, response, this.b);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(getExtras getextras, Response response, CardTokenCallback cardTokenCallback) {
        TokenDetailsResponse tokenDetailsResponse = (TokenDetailsResponse) response.body();
        if (tokenDetailsResponse == null) {
            cardTokenCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_RESPONSE));
            Logger.e(b, Constants.MESSAGE_ERROR_EMPTY_RESPONSE);
        } else if (tokenDetailsResponse.getStatusCode().trim().equalsIgnoreCase(Constants.STATUS_CODE_200)) {
            cardTokenCallback.onSuccess(tokenDetailsResponse);
        } else if (TextUtils.isEmpty(tokenDetailsResponse.getStatusMessage())) {
            cardTokenCallback.onFailure(tokenDetailsResponse, Constants.MESSAGE_ERROR_EMPTY_RESPONSE);
        } else {
            cardTokenCallback.onFailure(tokenDetailsResponse, tokenDetailsResponse.getStatusMessage());
        }
    }

    public getExtras(d dVar) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = dVar;
    }
}
