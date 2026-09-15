package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
final class addOnInvalidatedListener implements Closeable {
    private int TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private byte[] b;

    public addOnInvalidatedListener(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private addOnInvalidatedListener(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null) {
            throw new NullPointerException("in == null");
        }
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        if (!charset.equals(SurfaceEdgeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && !charset.equals(SurfaceEdgeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = inputStream;
        this.b = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (this.b != null) {
                this.b = null;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (this.b == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >= this.TuitionPaymentFragmentbindingInflater1) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            for (int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2; i3 != this.TuitionPaymentFragmentbindingInflater1; i3++) {
                byte[] bArr2 = this.b;
                if (bArr2[i3] == 10) {
                    int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    String str = new String(bArr2, i4, i2 - i4);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 + 1;
                    return str;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.TuitionPaymentFragmentbindingInflater1 - this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + 80) { // from class: addOnInvalidatedListener.1
                @Override // java.io.ByteArrayOutputStream
                public final String toString() {
                    return new String(((ByteArrayOutputStream) this).buf, 0, (((ByteArrayOutputStream) this).count <= 0 || ((ByteArrayOutputStream) this).buf[((ByteArrayOutputStream) this).count + (-1)] != 13) ? ((ByteArrayOutputStream) this).count : ((ByteArrayOutputStream) this).count - 1);
                }
            };
            loop1: while (true) {
                byte[] bArr3 = this.b;
                int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                byteArrayOutputStream.write(bArr3, i5, this.TuitionPaymentFragmentbindingInflater1 - i5);
                this.TuitionPaymentFragmentbindingInflater1 = -1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                while (i != this.TuitionPaymentFragmentbindingInflater1) {
                    bArr = this.b;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i != i6) {
                byteArrayOutputStream.write(bArr, i6, i - i6);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    public final int TuitionPaymentFragmentbindingInflater1() throws IOException {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        try {
            return Integer.parseInt(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder("expected an int but was \"");
            sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append("\"");
            throw new IOException(sb.toString());
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IOException {
        InputStream inputStream = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        byte[] bArr = this.b;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        this.TuitionPaymentFragmentbindingInflater1 = i;
    }
}
