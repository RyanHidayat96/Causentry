package defpackage;

import com.bpjstku.util.utils.ApiResultHandlerKt$safeApiCall$1;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdasetCaptureRequestOptions0androidxcameracamera2interopCamera2CameraControl {
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> Object b(Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Continuation<? super setOnImageAvailableListener<? extends T>> continuation) {
        ApiResultHandlerKt$safeApiCall$1 apiResultHandlerKt$safeApiCall$1;
        String strMessage;
        if (continuation instanceof ApiResultHandlerKt$safeApiCall$1) {
            apiResultHandlerKt$safeApiCall$1 = (ApiResultHandlerKt$safeApiCall$1) continuation;
            if ((apiResultHandlerKt$safeApiCall$1.label & Integer.MIN_VALUE) != 0) {
                apiResultHandlerKt$safeApiCall$1.label -= Integer.MIN_VALUE;
            } else {
                apiResultHandlerKt$safeApiCall$1 = new ApiResultHandlerKt$safeApiCall$1(continuation);
            }
        } else {
            apiResultHandlerKt$safeApiCall$1 = new ApiResultHandlerKt$safeApiCall$1(continuation);
        }
        Object objInvoke = apiResultHandlerKt$safeApiCall$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = apiResultHandlerKt$safeApiCall$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objInvoke);
                apiResultHandlerKt$safeApiCall$1.label = 1;
                objInvoke = function1.invoke(apiResultHandlerKt$safeApiCall$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            Response response = (Response) objInvoke;
            if (response.isSuccessful()) {
                Object objBody = response.body();
                if (objBody != null) {
                    return new setOnImageAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objBody);
                }
                return new setOnImageAvailableListener.b("Empty response body");
            }
            ResponseBody responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody == null || (strMessage = responseBodyErrorBody.string()) == null) {
                strMessage = response.message();
            }
            int iCode = response.code();
            StringBuilder sb = new StringBuilder("HTTP ");
            sb.append(iCode);
            sb.append(": ");
            sb.append(strMessage);
            return new setOnImageAvailableListener.b(sb.toString());
        } catch (IOException e2) {
            return new setOnImageAvailableListener.b("Network error: ".concat(String.valueOf(e2.getMessage())));
        } catch (Exception e3) {
            return new setOnImageAvailableListener.b("Unexpected error: ".concat(String.valueOf(e3.getMessage())));
        }
    }
}
