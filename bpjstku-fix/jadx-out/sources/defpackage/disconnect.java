package defpackage;

import com.midtrans.sdk.corekit.callback.HttpRequestCallback;
import com.midtrans.sdk.corekit.callback.SaveCardCallback;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.SaveCardResponse;

/* JADX INFO: loaded from: classes.dex */
public abstract class disconnect {
    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "a";

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th, HttpRequestCallback httpRequestCallback) {
        try {
            String str = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("Error > cause:");
            sb.append(th.getCause());
            sb.append("| message:");
            sb.append(th.getMessage());
            Logger.e(str, sb.toString());
            if (!(httpRequestCallback instanceof SaveCardCallback)) {
                httpRequestCallback.onError(th);
                return;
            }
            SaveCardResponse saveCardResponse = new SaveCardResponse();
            saveCardResponse.setCode(200);
            saveCardResponse.setMessage(th.getMessage());
            ((SaveCardCallback) httpRequestCallback).onSuccess(saveCardResponse);
        } catch (Exception e2) {
            httpRequestCallback.onError(new Throwable(e2.getMessage(), e2.getCause()));
        }
    }
}
