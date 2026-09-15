package com.bpjstku.util.utils;

import defpackage.lambdasetCaptureRequestOptions0androidxcameracamera2interopCamera2CameraControl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.util.utils.ApiResultHandlerKt", f = "ApiResultHandler.kt", i = {}, l = {10}, m = "safeApiCall", n = {}, s = {})
public final class ApiResultHandlerKt$safeApiCall$1<T> extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public ApiResultHandlerKt$safeApiCall$1(Continuation<? super ApiResultHandlerKt$safeApiCall$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return lambdasetCaptureRequestOptions0androidxcameracamera2interopCamera2CameraControl.b(null, this);
    }
}
