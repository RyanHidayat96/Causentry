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
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u0007H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/bpjstku/data/multibiller/remote/MultiBillerApi;", "LunbindChildren;", "Lcom/bpjstku/data/multibiller/remote/MultiBillerApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/multibiller/remote/MultiBillerApiClient;)V", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerTransactionRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerTransactionResponse;", "transaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerRegistrationRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationResponse;", "register", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerRegistrationRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckRegisterRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerTokenResponse;", "generateToken", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckRegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthResponse;", "authenticate", "()LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerAuthTransactionRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionResponse;", "authenticateTransaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerAuthTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckTransactionRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerCheckTransactionResponse;", "checkTransaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerCheckRegisterResponse;", "checkRegister", "api", "Lcom/bpjstku/data/multibiller/remote/MultiBillerApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiBillerApi implements unbindChildren, MultiBillerApiClient {
    public static final int $stable = 8;
    private final MultiBillerApiClient api;

    public MultiBillerApi(MultiBillerApiClient multiBillerApiClient) {
        Intrinsics.checkNotNullParameter(multiBillerApiClient, "");
        this.api = multiBillerApiClient;
    }

    @Override // com.bpjstku.data.multibiller.remote.MultiBillerApiClient
    public final deriveCodec<Response<MultiBillerTransactionResponse>> transaction(MultiBillerTransactionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.api.transaction(p0);
    }

    @Override // com.bpjstku.data.multibiller.remote.MultiBillerApiClient
    public final deriveCodec<Response<MultiBillerRegistrationResponse>> register(MultiBillerRegistrationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.api.register(p0);
    }

    @Override // com.bpjstku.data.multibiller.remote.MultiBillerApiClient
    public final deriveCodec<Response<MultiBillerTokenResponse>> generateToken(MultiBillerCheckRegisterRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.api.generateToken(p0);
    }

    @Override // com.bpjstku.data.multibiller.remote.MultiBillerApiClient
    public final deriveCodec<Response<MultiBillerAuthResponse>> authenticate() {
        return this.api.authenticate();
    }

    @Override // com.bpjstku.data.multibiller.remote.MultiBillerApiClient
    public final deriveCodec<Response<MultiBillerAuthTransactionResponse>> authenticateTransaction(MultiBillerAuthTransactionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.api.authenticateTransaction(p0);
    }

    @Override // com.bpjstku.data.multibiller.remote.MultiBillerApiClient
    public final deriveCodec<Response<MultiBillerCheckTransactionResponse>> checkTransaction(MultiBillerCheckTransactionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.api.checkTransaction(p0);
    }

    @Override // com.bpjstku.data.multibiller.remote.MultiBillerApiClient
    public final deriveCodec<Response<MultiBillerCheckRegisterResponse>> checkRegister(MultiBillerCheckRegisterRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.api.checkRegister(p0);
    }
}
