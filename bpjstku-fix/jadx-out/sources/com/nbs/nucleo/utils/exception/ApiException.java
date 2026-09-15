package com.nbs.nucleo.utils.exception;

import defpackage.lambdasubmitStillCaptureRequests0;
import kotlin.Metadata;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00048\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/nbs/nucleo/utils/exception/ApiException;", "Lcom/nbs/nucleo/utils/exception/ResponseException;", "LlambdasubmitStillCaptureRequests0;", "p0", "Lretrofit2/Response;", "p1", "<init>", "(LlambdasubmitStillCaptureRequests0;Lretrofit2/Response;)V", "apiError", "LlambdasubmitStillCaptureRequests0;", "getApiError", "()LlambdasubmitStillCaptureRequests0;", "response", "Lretrofit2/Response;", "getResponse", "()Lretrofit2/Response;", "setResponse", "(Lretrofit2/Response;)V"}, k = 1, mv = {2, 3, 0})
public final class ApiException extends ResponseException {
    private final lambdasubmitStillCaptureRequests0 apiError;
    private Response<?> response;

    public ApiException(lambdasubmitStillCaptureRequests0 lambdasubmitstillcapturerequests0, Response<?> response) {
        super(response);
        this.apiError = lambdasubmitstillcapturerequests0;
        this.response = response;
    }

    public final lambdasubmitStillCaptureRequests0 getApiError() {
        return this.apiError;
    }

    @Override // com.nbs.nucleo.utils.exception.ResponseException
    public final Response<?> getResponse() {
        return this.response;
    }

    @Override // com.nbs.nucleo.utils.exception.ResponseException
    public final void setResponse(Response<?> response) {
        this.response = response;
    }
}
