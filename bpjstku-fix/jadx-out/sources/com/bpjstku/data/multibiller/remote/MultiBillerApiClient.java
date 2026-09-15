package com.bpjstku.data.multibiller.remote;

import com.bpjstku.data.multibiller.model.request.MultiBillerAuthTransactionRequest;
import com.bpjstku.data.multibiller.model.request.MultiBillerCheckRegisterRequest;
import com.bpjstku.data.multibiller.model.request.MultiBillerCheckTransactionRequest;
import com.bpjstku.data.multibiller.model.request.MultiBillerRegistrationRequest;
import com.bpjstku.data.multibiller.model.request.MultiBillerTransactionRequest;
import com.bpjstku.data.multibiller.model.response.MultiBillerAuthResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerAuthTransactionResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerCheckRegisterResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerCheckTransactionResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerRegistrationResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerTokenResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerTransactionResponse;
import defpackage.deriveCodec;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050\u0004H'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u001d\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/multibiller/remote/MultiBillerApiClient;", "", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerTransactionRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerTransactionResponse;", "transaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerRegistrationRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationResponse;", "register", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerRegistrationRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckRegisterRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerTokenResponse;", "generateToken", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckRegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthResponse;", "authenticate", "()LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerAuthTransactionRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionResponse;", "authenticateTransaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerAuthTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckTransactionRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerCheckTransactionResponse;", "checkTransaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerCheckRegisterResponse;", "checkRegister"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MultiBillerApiClient {
    @POST("biller/auth")
    deriveCodec<Response<MultiBillerAuthResponse>> authenticate();

    @POST("biller/auth_transaction")
    deriveCodec<Response<MultiBillerAuthTransactionResponse>> authenticateTransaction(@Body MultiBillerAuthTransactionRequest p0);

    @POST("biller/registration_check")
    deriveCodec<Response<MultiBillerCheckRegisterResponse>> checkRegister(@Body MultiBillerCheckRegisterRequest p0);

    @POST("biller/transaction_check")
    deriveCodec<Response<MultiBillerCheckTransactionResponse>> checkTransaction(@Body MultiBillerCheckTransactionRequest p0);

    @POST("biller/token")
    deriveCodec<Response<MultiBillerTokenResponse>> generateToken(@Body MultiBillerCheckRegisterRequest p0);

    @POST("biller/registration")
    deriveCodec<Response<MultiBillerRegistrationResponse>> register(@Body MultiBillerRegistrationRequest p0);

    @POST("biller/transaction")
    deriveCodec<Response<MultiBillerTransactionResponse>> transaction(@Body MultiBillerTransactionRequest p0);
}
