package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraClosedException extends OutputStream {
    private final OutputStream TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private byte[] b;

    public CameraClosedException(OutputStream outputStream, CameraUnavailableException cameraUnavailableException) {
        this(outputStream, cameraUnavailableException, (byte) 0);
    }

    private CameraClosedException(OutputStream outputStream, CameraUnavailableException cameraUnavailableException, byte b) {
        this.TuitionPaymentFragmentbindingInflater1 = outputStream;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraUnavailableException;
        this.b = (byte[]) cameraUnavailableException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(65536, byte[].class);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.b;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i6 == 0 && i4 >= this.b.length) {
                this.TuitionPaymentFragmentbindingInflater1.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.b.length - i6);
            System.arraycopy(bArr, i5, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iMin);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 += iMin;
            i3 += iMin;
            b();
        } while (i3 < i2);
    }

    private void b() throws IOException {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        byte[] bArr = this.b;
        if (i != bArr.length || i <= 0) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.write(bArr, 0, i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
            this.TuitionPaymentFragmentbindingInflater1.close();
            byte[] bArr = this.b;
            if (bArr != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr);
                this.b = null;
            }
        } catch (Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i > 0) {
            this.TuitionPaymentFragmentbindingInflater1.write(this.b, 0, i);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        }
        this.TuitionPaymentFragmentbindingInflater1.flush();
    }
}
