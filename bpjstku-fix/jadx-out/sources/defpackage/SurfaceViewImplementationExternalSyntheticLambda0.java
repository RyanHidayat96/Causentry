package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class SurfaceViewImplementationExternalSyntheticLambda0 implements SurfaceViewImplementationApi24Impl {
    private final cancelPreviousRequest TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final OutputStream TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public SurfaceViewImplementationExternalSyntheticLambda0(OutputStream outputStream, cancelPreviousRequest cancelpreviousrequest) {
        Intrinsics.checkNotNullParameter(outputStream, "");
        Intrinsics.checkNotNullParameter(cancelpreviousrequest, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = outputStream;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cancelpreviousrequest;
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    public final void flush() throws IOException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.flush();
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final cancelPreviousRequest timeout() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("sink(");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper.size, 0L, j);
        while (j > 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.throwIfReached();
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = rotationProviderListenerWrapper.head;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            int iMin = (int) Math.min(j, surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.write(surfaceViewImplementationSurfaceRequestCallback.data, surfaceViewImplementationSurfaceRequestCallback.pos, iMin);
            surfaceViewImplementationSurfaceRequestCallback.pos += iMin;
            long j2 = iMin;
            j -= j2;
            rotationProviderListenerWrapper.size -= j2;
            if (surfaceViewImplementationSurfaceRequestCallback.pos == surfaceViewImplementationSurfaceRequestCallback.limit) {
                rotationProviderListenerWrapper.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
            }
        }
    }
}
