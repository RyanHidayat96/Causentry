package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageAnalysisDefaults extends FilterInputStream {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final long b;

    public ImageAnalysisDefaults(InputStream inputStream, long j) {
        super(inputStream);
        this.b = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int iMax;
        synchronized (this) {
            iMax = (int) Math.max(this.b - ((long) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1), ((FilterInputStream) this).in.available());
        }
        return iMax;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        synchronized (this) {
            i = super.read();
            b(i >= 0 ? 1 : -1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iB;
        synchronized (this) {
            iB = b(super.read(bArr, i, i2));
        }
        return iB;
    }

    private int b(int i) throws IOException {
        if (i >= 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 += i;
            return i;
        }
        if (this.b - ((long) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) <= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder("Failed to read all expected data, expected: ");
        sb.append(this.b);
        sb.append(", but read: ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        throw new IOException(sb.toString());
    }
}
