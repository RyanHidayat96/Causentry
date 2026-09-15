package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface zzcbz extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long zza(zzcbj zzcbjVar, long j) throws IOException;
}
