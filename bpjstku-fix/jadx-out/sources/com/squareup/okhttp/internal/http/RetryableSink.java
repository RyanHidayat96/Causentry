package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.cancelPreviousRequest;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes7.dex */
public final class RetryableSink implements SurfaceViewImplementationApi24Impl {
    private boolean closed;
    private final RotationProviderListenerWrapper content;
    private final int limit;

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    public final void flush() throws IOException {
    }

    public RetryableSink(int i) {
        this.content = new RotationProviderListenerWrapper();
        this.limit = i;
    }

    public RetryableSink() {
        this(-1);
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        if (this.content.size >= this.limit) {
            return;
        }
        StringBuilder sb = new StringBuilder("content-length promised ");
        sb.append(this.limit);
        sb.append(" bytes, but received ");
        sb.append(this.content.size);
        throw new ProtocolException(sb.toString());
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        Util.checkOffsetAndCount(rotationProviderListenerWrapper.size, 0L, j);
        if (this.limit != -1 && this.content.size > ((long) this.limit) - j) {
            StringBuilder sb = new StringBuilder("exceeded content-length limit of ");
            sb.append(this.limit);
            sb.append(" bytes");
            throw new ProtocolException(sb.toString());
        }
        this.content.write(rotationProviderListenerWrapper, j);
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final cancelPreviousRequest timeout() {
        return cancelPreviousRequest.NONE;
    }

    public final long contentLength() throws IOException {
        return this.content.size;
    }

    public final void writeToSocket(SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl) throws IOException {
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        RotationProviderListenerWrapper rotationProviderListenerWrapper2 = this.content;
        rotationProviderListenerWrapper2.b(rotationProviderListenerWrapper, 0L, rotationProviderListenerWrapper2.size);
        surfaceViewImplementationApi24Impl.write(rotationProviderListenerWrapper, rotationProviderListenerWrapper.size);
    }
}
