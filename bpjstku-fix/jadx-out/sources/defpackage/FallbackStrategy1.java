package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class FallbackStrategy1 extends InputStream {
    private int TuitionPaymentFragmentbindingInflater1;
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private long asBinder;
    private long b;
    private long d;

    FallbackStrategy1(InputStream inputStream) {
        this(inputStream, (byte) 0);
    }

    private FallbackStrategy1(InputStream inputStream, byte b) {
        this(inputStream, 4096);
    }

    private FallbackStrategy1(InputStream inputStream, int i) {
        this.b = -1L;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        this.TuitionPaymentFragmentbindingInflater1 = -1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, 4096);
        this.TuitionPaymentFragmentbindingInflater1 = 1024;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.b = TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
    }

    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        long j = this.asBinder + ((long) i);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < j) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(j);
        }
        return this.asBinder;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j) {
        try {
            long j2 = this.d;
            long j3 = this.asBinder;
            if (j2 < j3 && j3 <= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.reset();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.mark((int) (j - this.d));
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.d, this.asBinder);
            } else {
                this.d = j3;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.mark((int) (j - j3));
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: ".concat(String.valueOf(e2)));
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) throws IOException {
        if (this.asBinder > this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 || j < this.d) {
            throw new IOException("Cannot reset");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.reset();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.d, j);
        this.asBinder = j;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, long j2) throws IOException {
        while (j < j2) {
            long jSkip = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.skip(j2 - j);
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
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            long j = this.asBinder;
            long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (j + 1 > j2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(j2 + ((long) this.TuitionPaymentFragmentbindingInflater1));
            }
        }
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.read();
        if (i != -1) {
            this.asBinder++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            long j = this.asBinder;
            if (((long) bArr.length) + j > this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(j + ((long) bArr.length) + ((long) this.TuitionPaymentFragmentbindingInflater1));
            }
        }
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.read(bArr);
        if (i != -1) {
            this.asBinder += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            long j = this.asBinder + ((long) i2);
            if (j > this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(j + ((long) this.TuitionPaymentFragmentbindingInflater1));
            }
        }
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.read(bArr, i, i2);
        if (i3 != -1) {
            this.asBinder += (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            long j2 = this.asBinder + j;
            if (j2 > this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(j2 + ((long) this.TuitionPaymentFragmentbindingInflater1));
            }
        }
        long jSkip = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.skip(j);
        this.asBinder += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.markSupported();
    }
}
