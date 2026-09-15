package com.google.mlkit.common.sdkinternal.model;

import defpackage.ViewPortBuilder;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes6.dex */
public class URLWrapper {
    private final URL zza;

    public URLWrapper(String str) throws MalformedURLException {
        this.zza = new URL(str);
    }

    public URLConnection openConnection() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.zza.openConnection();
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(uRLConnectionOpenConnection);
        return uRLConnectionOpenConnection;
    }
}
