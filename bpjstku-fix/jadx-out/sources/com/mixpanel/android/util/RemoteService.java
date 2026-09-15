package com.mixpanel.android.util;

import android.content.Context;
import defpackage.bindChildren;
import java.io.IOException;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public interface RemoteService {
    void TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, Map<String, Object> map, SSLSocketFactory sSLSocketFactory) throws ServiceUnavailableException, IOException;

    boolean b(Context context, bindChildren bindchildren);

    public static class ServiceUnavailableException extends Exception {
        public final int mRetryAfter;

        public ServiceUnavailableException(String str, String str2) {
            int i;
            super(str);
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                i = 0;
            }
            this.mRetryAfter = i;
        }
    }
}
