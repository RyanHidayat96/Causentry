package com.dynatrace.android.callback;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class CbConstants {

    public enum WrMethod {
        getInputStream,
        getOutputStream,
        getResponseCode,
        execute,
        enqueue
    }

    public enum WrStates {
        PRE_EXEC,
        POST_EXEC_OK,
        POST_EXEC_ERR,
        POST_EXEC_FINALIZE
    }

    CbConstants() {
    }
}
