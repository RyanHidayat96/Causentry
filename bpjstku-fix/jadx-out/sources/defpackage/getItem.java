package defpackage;

import android.text.TextUtils;
import com.midtrans.sdk.corekit.callback.BankBinsCallback;
import com.midtrans.sdk.corekit.callback.BanksPointCallback;
import com.midtrans.sdk.corekit.callback.DeleteCardCallback;
import com.midtrans.sdk.corekit.callback.GetTransactionStatusCallback;
import com.midtrans.sdk.corekit.callback.TransactionCallback;
import com.midtrans.sdk.corekit.callback.TransactionOptionsCallback;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.snap.BankBinsResponse;
import com.midtrans.sdk.corekit.models.snap.BanksPointResponse;
import com.midtrans.sdk.corekit.models.snap.Transaction;
import com.midtrans.sdk.corekit.models.snap.TransactionStatusResponse;
import com.midtrans.sdk.corekit.models.snap.payment.BankTransferPaymentRequest;
import com.midtrans.sdk.corekit.models.snap.payment.BasePaymentRequest;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class getItem extends disconnect {
    private static String b = "h";
    public a.a.a.a.a.g TuitionPaymentFragmentbindingInflater1;

    public class INotificationSideChannel implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public INotificationSideChannel(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    public class INotificationSideChannelDefault implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public INotificationSideChannelDefault(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    public class INotificationSideChannelStubProxy implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentbindingInflater1;

        public INotificationSideChannelStubProxy(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentbindingInflater1 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentbindingInflater1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentbindingInflater1);
        }
    }

    public class TuitionPaymentFragmentbindingInflater1 implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentbindingInflater1(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public class a implements Callback<List<BankBinsResponse>> {
        private /* synthetic */ BankBinsCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public a(BankBinsCallback bankBinsCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bankBinsCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<List<BankBinsResponse>> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<List<BankBinsResponse>> call, Response<List<BankBinsResponse>> response) {
            List<BankBinsResponse> listBody = response.body();
            if (listBody == null || listBody.isEmpty()) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_RESPONSE));
            } else if (response.code() == 200 || response.code() == 201) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSuccess(new ArrayList<>(listBody));
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onFailure(response.message());
            }
        }
    }

    public class asBinder implements Callback<Transaction> {
        private /* synthetic */ TransactionOptionsCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public asBinder(TransactionOptionsCallback transactionOptionsCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = transactionOptionsCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<Transaction> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<Transaction> call, Response<Transaction> response) {
            Transaction transactionBody = response.body();
            if (transactionBody != null) {
                if (response.code() != 200 || TextUtils.isEmpty(transactionBody.getToken())) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onFailure(transactionBody, response.message());
                    return;
                } else {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSuccess(transactionBody);
                    return;
                }
            }
            try {
                if (response.errorBody() != null) {
                    JSONObject jSONObject = new JSONObject(response.errorBody().string());
                    String strMessage = response.message();
                    if (jSONObject.getJSONArray("error_messages") != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray("error_messages");
                        if (jSONArray.get(0) != null) {
                            strMessage = jSONArray.get(0).toString();
                        }
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(new Throwable(strMessage));
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_RESPONSE));
                Logger.e(getItem.b, Constants.MESSAGE_ERROR_EMPTY_RESPONSE);
            } catch (Exception e2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_RESPONSE));
                String str = getItem.b;
                StringBuilder sb = new StringBuilder("e:");
                sb.append(e2.getMessage());
                Logger.e(str, sb.toString());
            }
        }
    }

    public class asInterface implements Callback<BanksPointResponse> {
        private /* synthetic */ BanksPointCallback TuitionPaymentFragmentbindingInflater1;

        public asInterface(BanksPointCallback banksPointCallback) {
            this.TuitionPaymentFragmentbindingInflater1 = banksPointCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<BanksPointResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentbindingInflater1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<BanksPointResponse> call, Response<BanksPointResponse> response) {
            BanksPointResponse banksPointResponseBody = response.body();
            if (banksPointResponseBody == null) {
                this.TuitionPaymentFragmentbindingInflater1.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_RESPONSE));
            } else if (banksPointResponseBody.getStatusCode() == null || !banksPointResponseBody.getStatusCode().equals(Constants.STATUS_CODE_200)) {
                this.TuitionPaymentFragmentbindingInflater1.onFailure(response.message());
            } else {
                this.TuitionPaymentFragmentbindingInflater1.onSuccess(banksPointResponseBody);
            }
        }
    }

    public class b implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public b(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public class cancel implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public cancel(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    public class cancelAll implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentbindingInflater1;

        public cancelAll(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentbindingInflater1 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentbindingInflater1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentbindingInflater1);
        }
    }

    public class d implements Callback<TransactionStatusResponse> {
        private /* synthetic */ GetTransactionStatusCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public d(GetTransactionStatusCallback getTransactionStatusCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getTransactionStatusCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionStatusResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionStatusResponse> call, Response<TransactionStatusResponse> response) {
            TransactionStatusResponse transactionStatusResponseBody = response.body();
            if (transactionStatusResponseBody == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_RESPONSE));
            } else if (transactionStatusResponseBody.getStatusCode() == null || !transactionStatusResponseBody.getStatusCode().equals(Constants.STATUS_CODE_200)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onFailure(transactionStatusResponseBody, response.message());
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onSuccess(transactionStatusResponseBody);
            }
        }
    }

    public class g implements Callback<Void> {
        private /* synthetic */ DeleteCardCallback TuitionPaymentFragmentbindingInflater1;

        public g(DeleteCardCallback deleteCardCallback) {
            this.TuitionPaymentFragmentbindingInflater1 = deleteCardCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<Void> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentbindingInflater1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<Void> call, Response<Void> response) {
            if (response.code() == 200 || response.code() == 201) {
                this.TuitionPaymentFragmentbindingInflater1.onSuccess(response.body());
            } else {
                this.TuitionPaymentFragmentbindingInflater1.onFailure(response.body());
            }
        }
    }

    public class getInterfaceDescriptor implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public getInterfaceDescriptor(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public class notify implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public notify(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public class onTransact implements Callback<TransactionResponse> {
        private /* synthetic */ TransactionCallback TuitionPaymentFragmentbindingInflater1;

        public onTransact(TransactionCallback transactionCallback) {
            this.TuitionPaymentFragmentbindingInflater1 = transactionCallback;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<TransactionResponse> call, Throwable th) {
            disconnect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th, this.TuitionPaymentFragmentbindingInflater1);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<TransactionResponse> call, Response<TransactionResponse> response) {
            getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem.this, response, this.TuitionPaymentFragmentbindingInflater1);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getItem getitem, Response response, TransactionCallback transactionCallback) {
        TransactionResponse transactionResponse = (TransactionResponse) response.body();
        if (transactionResponse == null) {
            transactionCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_RESPONSE));
            return;
        }
        String statusCode = transactionResponse.getStatusCode();
        if (!TextUtils.isEmpty(statusCode) && (statusCode.equals(Constants.STATUS_CODE_200) || statusCode.equals(Constants.STATUS_CODE_201))) {
            transactionCallback.onSuccess(transactionResponse);
        } else if (statusCode.equals(Constants.STATUS_CODE_400)) {
            transactionCallback.onFailure(transactionResponse, (transactionResponse.getValidationMessages() == null || transactionResponse.getValidationMessages().isEmpty()) ? transactionResponse.getStatusMessage() : transactionResponse.getValidationMessages().get(0));
        } else {
            transactionCallback.onFailure(transactionResponse, transactionResponse.getStatusMessage());
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str, BankTransferPaymentRequest bankTransferPaymentRequest, TransactionCallback transactionCallback) {
        a.a.a.a.a.g gVar = this.TuitionPaymentFragmentbindingInflater1;
        if (gVar == null) {
            transactionCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else {
            gVar.a(str, bankTransferPaymentRequest).enqueue(new cancelAll(transactionCallback));
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, BasePaymentRequest basePaymentRequest, TransactionCallback transactionCallback) {
        a.a.a.a.a.g gVar = this.TuitionPaymentFragmentbindingInflater1;
        if (gVar == null) {
            transactionCallback.onError(new Throwable(Constants.MESSAGE_ERROR_EMPTY_MERCHANT_URL));
        } else {
            gVar.a(str, basePaymentRequest).enqueue(new notify(transactionCallback));
        }
    }

    public getItem(a.a.a.a.a.g gVar) {
        this.TuitionPaymentFragmentbindingInflater1 = gVar;
    }
}
