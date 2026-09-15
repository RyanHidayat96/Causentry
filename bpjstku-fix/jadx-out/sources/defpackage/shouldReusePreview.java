package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class shouldReusePreview implements RotationProviderListener {
    public final RotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private SurfaceViewImplementationApi24Impl b;

    public shouldReusePreview(SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationApi24Impl, "");
        this.b = surfaceViewImplementationApi24Impl;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new RotationProviderListenerWrapper();
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListenerWrapper asInterface() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write(byteBuffer);
        b();
        return iWrite;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends OutputStream {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            if (shouldReusePreview.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                throw new IOException("closed");
            }
            shouldReusePreview.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) ((byte) i));
            shouldReusePreview.this.b();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(bArr, "");
            if (shouldReusePreview.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                throw new IOException("closed");
            }
            shouldReusePreview.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, i, i2);
            shouldReusePreview.this.b();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            if (shouldReusePreview.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            shouldReusePreview.this.flush();
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws Throwable {
            shouldReusePreview.this.close();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(shouldReusePreview.this);
            sb.append(".outputStream()");
            return sb.toString();
        }
    }

    @Override // defpackage.RotationProviderListener
    public final OutputStream asBinder() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write(rotationProviderListenerWrapper, j);
        b();
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(byteString, "");
        byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        return b();
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(str, "");
        rotationProviderListenerWrapper.b(str, 0, str.length());
        return b();
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener b(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(str, i, i2);
        return b();
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener b(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(bArr, "");
        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, 0, bArr.length);
        return b();
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, i, i2);
        return b();
    }

    @Override // defpackage.RotationProviderListener
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2(tryToComplete trytocomplete) throws IOException {
        Intrinsics.checkNotNullParameter(trytocomplete, "");
        long j = 0;
        while (true) {
            long j2 = trytocomplete.read(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            b();
        }
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        return b();
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener a(int i) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a(i);
        return b();
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
        return b();
    }

    public final RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i));
        return b();
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener a(long j) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a(j);
        return b();
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener notify(long j) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.notify(j);
        return b();
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener b() throws IOException {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        long jTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        if (jTuitionPaymentFragmentbindingInflater1 > 0) {
            this.b.write(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jTuitionPaymentFragmentbindingInflater1);
        }
        return this;
    }

    @Override // defpackage.RotationProviderListener
    public final RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IOException {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size;
        if (j > 0) {
            this.b.write(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, j);
        }
        return this;
    }

    @Override // defpackage.RotationProviderListener, defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    public final void flush() throws IOException {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size > 0) {
            SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl = this.b;
            RotationProviderListenerWrapper rotationProviderListenerWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            surfaceViewImplementationApi24Impl.write(rotationProviderListenerWrapper, rotationProviderListenerWrapper.size);
        }
        this.b.flush();
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size > 0) {
            SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl = this.b;
            RotationProviderListenerWrapper rotationProviderListenerWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            surfaceViewImplementationApi24Impl.write(rotationProviderListenerWrapper, rotationProviderListenerWrapper.size);
        }
        th = null;
        try {
            this.b.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final cancelPreviousRequest timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
