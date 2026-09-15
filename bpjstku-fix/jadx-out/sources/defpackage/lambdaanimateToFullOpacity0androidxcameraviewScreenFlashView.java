package defpackage;

import com.google.android.gms.internal.mlkit_vision_face.zzee;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class lambdaanimateToFullOpacity0androidxcameraviewScreenFlashView implements tryToComplete {
    private final InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final cancelPreviousRequest TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public lambdaanimateToFullOpacity0androidxcameraviewScreenFlashView(InputStream inputStream, cancelPreviousRequest cancelpreviousrequest) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        Intrinsics.checkNotNullParameter(cancelpreviousrequest, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = inputStream;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cancelpreviousrequest;
    }

    @Override // defpackage.tryToComplete
    public final long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        }
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.throwIfReached();
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(1);
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data, surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit, (int) Math.min(j, 8192 - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit));
            if (i == -1) {
                if (surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.pos != surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit) {
                    return -1L;
                }
                rotationProviderListenerWrapper.head = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                return -1L;
            }
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit += i;
            long j2 = i;
            rotationProviderListenerWrapper.size += j2;
            return j2;
        } catch (AssertionError e2) {
            int iB = zzee.b();
            if (((Boolean) SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzee.b(), -989713985, zzee.b(), zzee.b(), 989713986, iB, new Object[]{e2})).booleanValue()) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.close();
    }

    @Override // defpackage.tryToComplete
    public final cancelPreviousRequest timeout() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source(");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(')');
        return sb.toString();
    }
}
