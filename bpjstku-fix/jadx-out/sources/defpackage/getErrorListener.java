package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class getErrorListener extends FilterInputStream {
    private static final byte[] TuitionPaymentFragmentbindingInflater1 = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 31;
    private final byte TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int b;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public getErrorListener(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: ".concat(String.valueOf(i)));
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.b;
        if (i3 < 2 || i3 > (i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } else {
            i = TuitionPaymentFragmentbindingInflater1[i3 - 2] & UByte.MAX_VALUE;
        }
        if (i != -1) {
            this.b++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.b;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(TuitionPaymentFragmentbindingInflater1, this.b - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.b += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.b = (int) (((long) this.b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }
}
