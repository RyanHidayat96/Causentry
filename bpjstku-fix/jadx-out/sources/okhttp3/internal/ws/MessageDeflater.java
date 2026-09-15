package okhttp3.internal.ws;

import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.SurfaceViewImplementationSurfaceRequestCallback;
import defpackage.onOrientationChanged;
import defpackage.pixelCopyRequest;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "p0", "<init>", "(Z)V", "", "close", "()V", "LRotationProviderListenerWrapper;", "deflate", "(LRotationProviderListenerWrapper;)V", "Lokio/ByteString;", "endsWith", "(LRotationProviderListenerWrapper;Lokio/ByteString;)Z", "deflatedBytes", "LRotationProviderListenerWrapper;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "LonOrientationChanged;", "deflaterSink", "LonOrientationChanged;", "noContextTakeover", "Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MessageDeflater implements Closeable {
    private final RotationProviderListenerWrapper deflatedBytes;
    private final Deflater deflater;
    private final onOrientationChanged deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        this.deflatedBytes = rotationProviderListenerWrapper;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new onOrientationChanged((SurfaceViewImplementationApi24Impl) rotationProviderListenerWrapper, deflater);
    }

    public final void deflate(RotationProviderListenerWrapper p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        long j = 0;
        if (this.deflatedBytes.size != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(p0, p0.size);
        this.deflaterSink.flush();
        if (!endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            this.deflatedBytes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
        } else {
            long j2 = this.deflatedBytes.size;
            RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B = RotationProviderListenerWrapper.b(this.deflatedBytes);
            try {
                RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater1B;
                long j3 = j2 - 4;
                RotationProviderListenerWrapper rotationProviderListenerWrapper = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (rotationProviderListenerWrapper == null) {
                    throw new IllegalStateException("not attached to a buffer".toString());
                }
                if (!tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
                }
                long j4 = rotationProviderListenerWrapper.size;
                if (j3 <= j4) {
                    if (j3 < 0) {
                        throw new IllegalArgumentException("newSize < 0: ".concat(String.valueOf(j3)).toString());
                    }
                    long j5 = j4 - j3;
                    while (j5 > 0) {
                        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = rotationProviderListenerWrapper.head;
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = surfaceViewImplementationSurfaceRequestCallback.prev;
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
                        long j6 = surfaceViewImplementationSurfaceRequestCallback2.limit - surfaceViewImplementationSurfaceRequestCallback2.pos;
                        if (j6 <= j5) {
                            rotationProviderListenerWrapper.head = surfaceViewImplementationSurfaceRequestCallback2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback2);
                            j5 -= j6;
                        } else {
                            surfaceViewImplementationSurfaceRequestCallback2.limit -= (int) j5;
                            break;
                        }
                    }
                    tuitionPaymentFragmentbindingInflater1.g = null;
                    tuitionPaymentFragmentbindingInflater1.b = j3;
                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = null;
                    tuitionPaymentFragmentbindingInflater1.asBinder = -1;
                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
                } else if (j3 > j4) {
                    long j7 = j3 - j4;
                    int i = 1;
                    boolean z = true;
                    while (j7 > j) {
                        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
                        int iMin = (int) Math.min(j7, 8192 - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit);
                        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit += iMin;
                        j7 -= (long) iMin;
                        if (z) {
                            tuitionPaymentFragmentbindingInflater1.g = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            tuitionPaymentFragmentbindingInflater1.b = j4;
                            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data;
                            tuitionPaymentFragmentbindingInflater1.asBinder = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit - iMin;
                            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit;
                            z = false;
                        }
                        j = 0;
                        i = 1;
                    }
                }
                rotationProviderListenerWrapper.size = j3;
                CloseableKt.closeFinally(tuitionPaymentFragmentbindingInflater1B, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(tuitionPaymentFragmentbindingInflater1B, th);
                    throw th2;
                }
            }
        }
        RotationProviderListenerWrapper rotationProviderListenerWrapper2 = this.deflatedBytes;
        p0.write(rotationProviderListenerWrapper2, rotationProviderListenerWrapper2.size);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.deflaterSink.close();
    }

    private final boolean endsWith(RotationProviderListenerWrapper rotationProviderListenerWrapper, ByteString byteString) {
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = rotationProviderListenerWrapper.size - ((long) byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        Intrinsics.checkNotNullParameter(byteString, "");
        return rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jTuitionPaymentFragmentspecialinlinedviewModeldefault3, byteString, byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }
}
