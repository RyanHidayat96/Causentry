package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001f"}, d2 = {"LonOrientationChanged;", "LSurfaceViewImplementationApi24Impl;", "p0", "Ljava/util/zip/Deflater;", "p1", "<init>", "(LSurfaceViewImplementationApi24Impl;Ljava/util/zip/Deflater;)V", "LRotationProviderListener;", "(LRotationProviderListener;Ljava/util/zip/Deflater;)V", "", "close", "()V", "", "TuitionPaymentFragmentbindingInflater1", "(Z)V", "flush", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "", "toString", "()Ljava/lang/String;", "LRotationProviderListenerWrapper;", "", "write", "(LRotationProviderListenerWrapper;J)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/zip/Deflater;", "b", "LRotationProviderListener;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class onOrientationChanged implements SurfaceViewImplementationApi24Impl {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    final Deflater b;

    public onOrientationChanged(RotationProviderListener rotationProviderListener, Deflater deflater) {
        Intrinsics.checkNotNullParameter(rotationProviderListener, "");
        Intrinsics.checkNotNullParameter(deflater, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = rotationProviderListener;
        this.b = deflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public onOrientationChanged(SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl, Deflater deflater) {
        this(SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(surfaceViewImplementationApi24Impl), deflater);
        Intrinsics.checkNotNullParameter(surfaceViewImplementationApi24Impl, "");
        Intrinsics.checkNotNullParameter(deflater, "");
    }

    final void TuitionPaymentFragmentbindingInflater1(boolean p0) throws IOException {
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iDeflate;
        RotationProviderListenerWrapper rotationProviderListenerWrapperAsInterface = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface();
        while (true) {
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = rotationProviderListenerWrapperAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(1);
            if (p0) {
                try {
                    iDeflate = this.b.deflate(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data, surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit, 8192 - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit, 2);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                iDeflate = this.b.deflate(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data, surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit, 8192 - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit);
            }
            if (iDeflate > 0) {
                surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit += iDeflate;
                rotationProviderListenerWrapperAsInterface.size += (long) iDeflate;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.pos == surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit) {
            rotationProviderListenerWrapperAsInterface.head = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    public final void flush() throws IOException {
        TuitionPaymentFragmentbindingInflater1(true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.flush();
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return;
        }
        this.b.finish();
        TuitionPaymentFragmentbindingInflater1(false);
        th = null;
        try {
            this.b.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final cancelPreviousRequest timeout() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeflaterSink(");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final void write(RotationProviderListenerWrapper p0, long p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.size, 0L, p1);
        while (p1 > 0) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = p0.head;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            int iMin = (int) Math.min(p1, surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
            this.b.setInput(surfaceViewImplementationSurfaceRequestCallback.data, surfaceViewImplementationSurfaceRequestCallback.pos, iMin);
            TuitionPaymentFragmentbindingInflater1(false);
            long j = iMin;
            p0.size -= j;
            surfaceViewImplementationSurfaceRequestCallback.pos += iMin;
            if (surfaceViewImplementationSurfaceRequestCallback.pos == surfaceViewImplementationSurfaceRequestCallback.limit) {
                p0.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
            }
            p1 -= j;
        }
    }
}
