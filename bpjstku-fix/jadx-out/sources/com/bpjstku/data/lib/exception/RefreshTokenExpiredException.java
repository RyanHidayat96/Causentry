package com.bpjstku.data.lib.exception;

import defpackage.lambdasubmitStillCaptureRequests0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/data/lib/exception/RefreshTokenExpiredException;", "Ljava/lang/Exception;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LlambdasubmitStillCaptureRequests0;", "p0", "<init>", "(LlambdasubmitStillCaptureRequests0;)V", "apiError", "LlambdasubmitStillCaptureRequests0;", "getApiError", "()LlambdasubmitStillCaptureRequests0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RefreshTokenExpiredException extends Exception {
    public static final int $stable = 8;
    private final lambdasubmitStillCaptureRequests0 apiError;

    public RefreshTokenExpiredException(lambdasubmitStillCaptureRequests0 lambdasubmitstillcapturerequests0) {
        this.apiError = lambdasubmitstillcapturerequests0;
    }

    public /* synthetic */ RefreshTokenExpiredException(lambdasubmitStillCaptureRequests0 lambdasubmitstillcapturerequests0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lambdasubmitstillcapturerequests0);
    }

    public final lambdasubmitStillCaptureRequests0 getApiError() {
        return this.apiError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshTokenExpiredException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
