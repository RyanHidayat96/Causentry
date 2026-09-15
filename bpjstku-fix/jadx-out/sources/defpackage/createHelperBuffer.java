package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class createHelperBuffer extends FilterInputStream {
    private int TuitionPaymentFragmentbindingInflater1;

    public createHelperBuffer(InputStream inputStream) {
        super(inputStream);
        this.TuitionPaymentFragmentbindingInflater1 = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            super.mark(i);
            this.TuitionPaymentFragmentbindingInflater1 = i;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(1L) == -1) {
            return -1;
        }
        int i = super.read();
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        if (i2 != Integer.MIN_VALUE) {
            this.TuitionPaymentFragmentbindingInflater1 = (int) (((long) i2) - 1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = (int) TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        long j = i3;
        int i4 = this.TuitionPaymentFragmentbindingInflater1;
        if (i4 != Integer.MIN_VALUE && j != -1) {
            this.TuitionPaymentFragmentbindingInflater1 = (int) (((long) i4) - j);
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        synchronized (this) {
            super.reset();
            this.TuitionPaymentFragmentbindingInflater1 = Integer.MIN_VALUE;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(j);
        if (jTuitionPaymentFragmentspecialinlinedviewModeldefault1 == -1) {
            return 0L;
        }
        long jSkip = super.skip(jTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i = this.TuitionPaymentFragmentbindingInflater1;
        if (i != Integer.MIN_VALUE && jSkip != -1) {
            this.TuitionPaymentFragmentbindingInflater1 = (int) (((long) i) - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.TuitionPaymentFragmentbindingInflater1;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    private long TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j) {
        int i = this.TuitionPaymentFragmentbindingInflater1;
        if (i == 0) {
            return -1L;
        }
        if (i == Integer.MIN_VALUE) {
            return j;
        }
        long j2 = i;
        return j > j2 ? j2 : j;
    }
}
