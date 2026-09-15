package com.bpjstku.data.multibiller;

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
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u001c\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/multibiller/MultiBillerRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerTransactionRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerTransactionResponse;", "transaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerRegistrationRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerRegistrationResponse;", "register", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerRegistrationRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckRegisterRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerTokenResponse;", "generateToken", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckRegisterRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthResponse;", "authenticate", "()LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerAuthTransactionRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerAuthTransactionResponse;", "authenticateTransaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerAuthTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckTransactionRequest;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerCheckTransactionResponse;", "checkTransaction", "(Lcom/bpjstku/data/multibiller/model/request/MultiBillerCheckTransactionRequest;)LderiveCodec;", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerCheckRegisterResponse;", "checkRegister"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MultiBillerRepository extends getChildrenOutConfigs {
    deriveCodec<MultiBillerAuthResponse> authenticate();

    deriveCodec<MultiBillerAuthTransactionResponse> authenticateTransaction(MultiBillerAuthTransactionRequest p0);

    deriveCodec<MultiBillerCheckRegisterResponse> checkRegister(MultiBillerCheckRegisterRequest p0);

    deriveCodec<MultiBillerCheckTransactionResponse> checkTransaction(MultiBillerCheckTransactionRequest p0);

    deriveCodec<MultiBillerTokenResponse> generateToken(MultiBillerCheckRegisterRequest p0);

    deriveCodec<MultiBillerRegistrationResponse> register(MultiBillerRegistrationRequest p0);

    deriveCodec<MultiBillerTransactionResponse> transaction(MultiBillerTransactionRequest p0);
}
