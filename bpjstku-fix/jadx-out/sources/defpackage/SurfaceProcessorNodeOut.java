package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class SurfaceProcessorNodeOut extends InputStream {
    private long TuitionPaymentFragmentbindingInflater1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private long b = -1;

    public SurfaceProcessorNodeOut(InputStream inputStream) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
        try {
            long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (j2 < j3 && j3 <= this.TuitionPaymentFragmentbindingInflater1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.reset();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.mark((int) (j - this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j3;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.mark((int) (j - j3));
            }
            this.TuitionPaymentFragmentbindingInflater1 = j;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: ".concat(String.valueOf(e2)));
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        long j = this.b;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > this.TuitionPaymentFragmentbindingInflater1 || j < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            throw new IOException("Cannot reset");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.reset();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, j);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j, long j2) throws IOException {
        while (j < j2) {
            long jSkip = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.skip(j2 - j);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j += jSkip;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.read();
        if (i != -1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.read(bArr);
        if (i != -1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.read(bArr, i, i2);
        if (i3 != -1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.skip(j);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.markSupported();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + ((long) i);
        if (this.TuitionPaymentFragmentbindingInflater1 < j) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        }
        this.b = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
