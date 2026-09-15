package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class updateScreenFlash implements SurfaceViewImplementationApi24Impl {
    private final onOrientationChanged TuitionPaymentFragmentbindingInflater1;
    private final shouldReusePreview TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final CRC32 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Deflater TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;

    public updateScreenFlash(SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationApi24Impl, "");
        shouldReusePreview shouldreusepreview = new shouldReusePreview(surfaceViewImplementationApi24Impl);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = shouldreusepreview;
        Deflater deflater = new Deflater(-1, true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = deflater;
        this.TuitionPaymentFragmentbindingInflater1 = new onOrientationChanged((RotationProviderListener) shouldreusepreview, deflater);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CRC32();
        RotationProviderListenerWrapper rotationProviderListenerWrapper = shouldreusepreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        rotationProviderListenerWrapper.a(8075);
        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(8);
        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0);
        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    public final void flush() throws IOException {
        this.TuitionPaymentFragmentbindingInflater1.flush();
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final cancelPreviousRequest timeout() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.timeout();
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.b) {
            return;
        }
        onOrientationChanged onorientationchanged = this.TuitionPaymentFragmentbindingInflater1;
        onorientationchanged.b.finish();
        onorientationchanged.TuitionPaymentFragmentbindingInflater1(false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getBytesRead());
        th = null;
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        }
        if (j == 0) {
            return;
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = rotationProviderListenerWrapper.head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.update(surfaceViewImplementationSurfaceRequestCallback.data, surfaceViewImplementationSurfaceRequestCallback.pos, iMin);
            j2 -= (long) iMin;
            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        }
        this.TuitionPaymentFragmentbindingInflater1.write(rotationProviderListenerWrapper, j);
    }
}
