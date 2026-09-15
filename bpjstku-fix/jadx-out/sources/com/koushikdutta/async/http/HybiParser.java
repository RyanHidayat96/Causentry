package com.koushikdutta.async.http;

import java.io.IOException;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes6.dex */
abstract class HybiParser {
    private Inflater b;

    public static class ProtocolError extends IOException {
    }

    static {
        Arrays.asList(0, 1, 2, 8, 9, 10);
        Arrays.asList(0, 1, 2);
    }

    protected void finalize() throws Throwable {
        super.finalize();
    }
}
