package com.midtrans.raygun;

import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class RaygunSettings {
    static {
        new IgnoredURLs("api.raygun.io");
        new HashSet();
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return "https://api.raygun.io/entries";
    }

    public static String b() {
        return "https://api.raygun.io/events";
    }

    public static class IgnoredURLs extends HashSet<String> {
        public IgnoredURLs(String... strArr) {
            int length = strArr.length;
            for (int i = 0; i <= 0; i++) {
                add(strArr[0]);
            }
        }
    }
}
