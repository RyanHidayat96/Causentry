package com.squareup.okhttp;

import java.io.UnsupportedEncodingException;
import okio.ByteString;

/* JADX INFO: loaded from: classes6.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            String strB = ByteString.TuitionPaymentFragmentbindingInflater1(sb.toString().getBytes("ISO-8859-1")).b();
            StringBuilder sb2 = new StringBuilder("Basic ");
            sb2.append(strB);
            return sb2.toString();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
