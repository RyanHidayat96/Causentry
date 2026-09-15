package com.squareup.okhttp.internal;

import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.getBrightness;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
class FaultHidingSink extends getBrightness {
    private boolean hasErrors;

    protected void onException(IOException iOException) {
    }

    public FaultHidingSink(SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl) {
        super(surfaceViewImplementationApi24Impl);
    }

    @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl
    public void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
        if (this.hasErrors) {
            rotationProviderListenerWrapper.g(j);
            return;
        }
        try {
            super.write(rotationProviderListenerWrapper, j);
        } catch (IOException e2) {
            this.hasErrors = true;
            onException(e2);
        }
    }

    @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    public void flush() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e2) {
            this.hasErrors = true;
            onException(e2);
        }
    }

    @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e2) {
            this.hasErrors = true;
            onException(e2);
        }
    }
}
