package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
final class getCameraInternal implements Closeable {
    private byte[] TuitionPaymentFragmentbindingInflater1;
    final Charset TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final InputStream b;

    public getCameraInternal(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private getCameraInternal(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (!charset.equals(getInputCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.b = inputStream;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = charset;
        this.TuitionPaymentFragmentbindingInflater1 = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.b) {
            if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                this.TuitionPaymentFragmentbindingInflater1 = null;
                this.b.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public final String TuitionPaymentFragmentbindingInflater1() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.b) {
            if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                b();
            }
            for (int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3; i3 != this.TuitionPaymentFragmentspecialinlinedviewModeldefault2; i3++) {
                byte[] bArr2 = this.TuitionPaymentFragmentbindingInflater1;
                if (bArr2[i3] == 10) {
                    int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    String str = new String(bArr2, i4, i2 - i4, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.name());
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 + 1;
                    return str;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) + 80) { // from class: getCameraInternal.3
                @Override // java.io.ByteArrayOutputStream
                public final String toString() {
                    try {
                        return new String(((ByteArrayOutputStream) this).buf, 0, (((ByteArrayOutputStream) this).count <= 0 || ((ByteArrayOutputStream) this).buf[((ByteArrayOutputStream) this).count + (-1)] != 13) ? ((ByteArrayOutputStream) this).count : ((ByteArrayOutputStream) this).count - 1, getCameraInternal.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.name());
                    } catch (UnsupportedEncodingException e2) {
                        throw new AssertionError(e2);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr3 = this.TuitionPaymentFragmentbindingInflater1;
                int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                byteArrayOutputStream.write(bArr3, i5, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - i5);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;
                b();
                i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                while (i != this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    bArr = this.TuitionPaymentFragmentbindingInflater1;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (i != i6) {
                byteArrayOutputStream.write(bArr, i6, i - i6);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    private void b() throws IOException {
        InputStream inputStream = this.b;
        byte[] bArr = this.TuitionPaymentFragmentbindingInflater1;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
    }
}
