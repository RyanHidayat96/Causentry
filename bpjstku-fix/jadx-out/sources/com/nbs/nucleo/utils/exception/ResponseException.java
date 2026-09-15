package com.nbs.nucleo.utils.exception;

import kotlin.Metadata;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00038\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/nbs/nucleo/utils/exception/ResponseException;", "Ljava/lang/RuntimeException;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Lretrofit2/Response;", "p0", "<init>", "(Lretrofit2/Response;)V", "response", "Lretrofit2/Response;", "getResponse", "()Lretrofit2/Response;", "setResponse"}, k = 1, mv = {2, 3, 0})
public class ResponseException extends RuntimeException {
    private Response<?> response;

    public ResponseException(Response<?> response) {
        this.response = response;
    }

    public Response<?> getResponse() {
        return this.response;
    }

    public void setResponse(Response<?> response) {
        this.response = response;
    }
}
