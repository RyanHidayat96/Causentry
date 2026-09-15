package defpackage;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class ProcessCameraProviderWrapperImpl implements SurfaceViewImplementationApi24Impl {
    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        rotationProviderListenerWrapper.g(j);
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final cancelPreviousRequest timeout() {
        return cancelPreviousRequest.NONE;
    }
}
