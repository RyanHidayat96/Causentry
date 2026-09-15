package com.koushikdutta.async;

/* JADX INFO: loaded from: classes4.dex */
public class AsyncSSLException extends Exception {
    public boolean mIgnore;

    public AsyncSSLException(Throwable th) {
        super("Peer not trusted by any of the system trust managers.", th);
        this.mIgnore = false;
    }
}
