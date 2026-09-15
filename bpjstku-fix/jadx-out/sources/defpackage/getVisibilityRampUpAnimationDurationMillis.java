package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getVisibilityRampUpAnimationDurationMillis implements tryToComplete {
    private final onPixelCopyFinished TuitionPaymentFragmentbindingInflater1;
    private final Inflater TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final setBrightness TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private byte TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final CRC32 b;

    public getVisibilityRampUpAnimationDurationMillis(tryToComplete trytocomplete) {
        Intrinsics.checkNotNullParameter(trytocomplete, "");
        onPixelCopyFinished onpixelcopyfinished = new onPixelCopyFinished(trytocomplete);
        this.TuitionPaymentFragmentbindingInflater1 = onpixelcopyfinished;
        Inflater inflater = new Inflater(true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = inflater;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new setBrightness((RotationProvider1) onpixelcopyfinished, inflater);
        this.b = new CRC32();
    }

    @Override // defpackage.tryToComplete
    public final long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IllegalAccessException, IOException {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 0) {
            this.TuitionPaymentFragmentbindingInflater1.asInterface(10L);
            byte bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(3L);
            boolean z = ((bTuitionPaymentFragmentspecialinlinedviewModeldefault3 >> 1) & 1) == 1;
            if (z) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1.b, 0L, 10L);
            }
            onPixelCopyFinished onpixelcopyfinished = this.TuitionPaymentFragmentbindingInflater1;
            onpixelcopyfinished.asInterface(2L);
            b("ID1ID2", 8075, onpixelcopyfinished.b.MediaBrowserCompat());
            this.TuitionPaymentFragmentbindingInflater1.g(8L);
            if (((bTuitionPaymentFragmentspecialinlinedviewModeldefault3 >> 2) & 1) == 1) {
                this.TuitionPaymentFragmentbindingInflater1.asInterface(2L);
                if (z) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1.b, 0L, 2L);
                }
                long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1.b.MediaBrowserCompat()) & UShort.MAX_VALUE;
                this.TuitionPaymentFragmentbindingInflater1.asInterface(jTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                if (z) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1.b, 0L, jTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                this.TuitionPaymentFragmentbindingInflater1.g(jTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            if (((bTuitionPaymentFragmentspecialinlinedviewModeldefault3 >> 3) & 1) == 1) {
                long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((byte) 0, 0L, Long.MAX_VALUE);
                if (jTuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1.b, 0L, jTuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1);
                }
                this.TuitionPaymentFragmentbindingInflater1.g(jTuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1);
            }
            if (((bTuitionPaymentFragmentspecialinlinedviewModeldefault3 >> 4) & 1) == 1) {
                long jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((byte) 0, 0L, Long.MAX_VALUE);
                if (jTuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1.b, 0L, jTuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1);
                }
                this.TuitionPaymentFragmentbindingInflater1.g(jTuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1);
            }
            if (z) {
                onPixelCopyFinished onpixelcopyfinished2 = this.TuitionPaymentFragmentbindingInflater1;
                onpixelcopyfinished2.asInterface(2L);
                b("FHCRC", recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onpixelcopyfinished2.b.MediaBrowserCompat()), (short) this.b.getValue());
                this.b.reset();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (byte) 1;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 1) {
            long j2 = rotationProviderListenerWrapper.size;
            long j3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.read(rotationProviderListenerWrapper, j);
            if (j3 != -1) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(rotationProviderListenerWrapper, j2, j3);
                return j3;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (byte) 2;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 2) {
            onPixelCopyFinished onpixelcopyfinished3 = this.TuitionPaymentFragmentbindingInflater1;
            onpixelcopyfinished3.asInterface(4L);
            b("CRC", recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onpixelcopyfinished3.b.INotificationSideChannelStubProxy()), (int) this.b.getValue());
            onPixelCopyFinished onpixelcopyfinished4 = this.TuitionPaymentFragmentbindingInflater1;
            onpixelcopyfinished4.asInterface(4L);
            b("ISIZE", recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onpixelcopyfinished4.b.INotificationSideChannelStubProxy()), (int) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getBytesWritten());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (byte) 3;
            if (!this.TuitionPaymentFragmentbindingInflater1.d()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // defpackage.tryToComplete
    public final cancelPreviousRequest timeout() {
        return this.TuitionPaymentFragmentbindingInflater1.timeout();
    }

    @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.close();
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j, long j2) {
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = rotationProviderListenerWrapper.head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        while (j >= surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos) {
            j -= (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        }
        while (j2 > 0) {
            int i = (int) (((long) surfaceViewImplementationSurfaceRequestCallback.pos) + j);
            int iMin = (int) Math.min(surfaceViewImplementationSurfaceRequestCallback.limit - i, j2);
            this.b.update(surfaceViewImplementationSurfaceRequestCallback.data, i, iMin);
            j2 -= (long) iMin;
            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            j = 0;
        }
    }

    private static void b(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": actual 0x");
        sb.append(StringsKt.padStart(recalculate.b(i2), 8, '0'));
        sb.append(" != expected 0x");
        sb.append(StringsKt.padStart(recalculate.b(i), 8, '0'));
        throw new IOException(sb.toString());
    }
}
