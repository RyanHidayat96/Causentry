package defpackage;

import a.a.a.a.a.b;
import android.text.TextUtils;
import com.midtrans.sdk.corekit.callback.CheckoutCallback;
import com.midtrans.sdk.corekit.callback.GetCardCallback;
import com.midtrans.sdk.corekit.callback.SaveCardCallback;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.models.SaveCardRequest;
import com.midtrans.sdk.corekit.models.SaveCardResponse;
import com.midtrans.sdk.corekit.models.TokenRequestModel;
import com.midtrans.sdk.corekit.models.snap.Token;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class getNotifyChildrenChangedOptions extends disconnect {
    public b TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public class TuitionPaymentFragmentbindingInflater1 implements Callback<Token> {
        private /* synthetic */ CheckoutCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentbindingInflater1(CheckoutCallback checkoutCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = checkoutCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<Token> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<Token> call, Response<Token> response) {
            Token tokenBody = response.body();
            if (tokenBody == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_RESPONSE));
            } else if (tokenBody.getTokenId() == null || TextUtils.isEmpty(tokenBody.getTokenId())) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onFailure(tokenBody, Constants.MESSAGE_ERROR_EMPTY_RESPONSE);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSuccess(tokenBody);
            }
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Callback<List<SaveCardRequest>> {
        private /* synthetic */ SaveCardResponse TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ SaveCardCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(SaveCardResponse saveCardResponse, SaveCardCallback saveCardCallback) {
            this.TuitionPaymentFragmentbindingInflater1 = saveCardResponse;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = saveCardCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<List<SaveCardRequest>> call, Throwable th) {
            if (th instanceof IllegalStateException) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSuccess(this.TuitionPaymentFragmentbindingInflater1);
            } else {
                disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<List<SaveCardRequest>> call, Response<List<SaveCardRequest>> response) {
            SaveCardRequest saveCardRequest;
            List<SaveCardRequest> listBody = response.body();
            if (!getNotifyChildrenChangedOptions.TuitionPaymentFragmentbindingInflater1(getNotifyChildrenChangedOptions.this, response.code(), (listBody == null || listBody.isEmpty() || (saveCardRequest = listBody.get(0)) == null) ? "" : saveCardRequest.getCode())) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onFailure(response.message());
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1.setCode(response.code());
            this.TuitionPaymentFragmentbindingInflater1.setMessage(response.message());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSuccess(this.TuitionPaymentFragmentbindingInflater1);
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Callback<List<SaveCardRequest>> {
        private /* synthetic */ GetCardCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(GetCardCallback getCardCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getCardCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<List<SaveCardRequest>> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<List<SaveCardRequest>> call, Response<List<SaveCardRequest>> response) {
            List<SaveCardRequest> listBody = response.body();
            if (listBody == null || listBody.size() <= 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_RESPONSE));
            } else if (response.code() == 200 || response.code() == 201) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onSuccess(new ArrayList<>(listBody));
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onFailure(response.message());
            }
        }
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(getNotifyChildrenChangedOptions getnotifychildrenchangedoptions, int i, String str) {
        if (i == 200 || i == 201) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(Constants.STATUS_CODE_200) || str.equals(Constants.STATUS_CODE_201);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TokenRequestModel tokenRequestModel, CheckoutCallback checkoutCallback) {
        b bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (bVar == null) {
            checkoutCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else {
            bVar.a(tokenRequestModel).enqueue(new TuitionPaymentFragmentbindingInflater1(checkoutCallback));
        }
    }

    public getNotifyChildrenChangedOptions(b bVar) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar;
    }
}
