package com.bumptech.glide.load.resource.bitmap;

import defpackage.CameraUnavailableException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class RecyclableBufferedInputStream extends FilterInputStream {
    public volatile byte[] TuitionPaymentFragmentbindingInflater1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int b;
    private int d;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public RecyclableBufferedInputStream(InputStream inputStream, CameraUnavailableException cameraUnavailableException) {
        this(inputStream, cameraUnavailableException, (byte) 0);
    }

    private RecyclableBufferedInputStream(InputStream inputStream, CameraUnavailableException cameraUnavailableException, byte b) {
        super(inputStream);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraUnavailableException;
        this.TuitionPaymentFragmentbindingInflater1 = (byte[]) cameraUnavailableException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(65536, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i;
        int i2;
        int iAvailable;
        synchronized (this) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (this.TuitionPaymentFragmentbindingInflater1 != null && inputStream != null) {
                i = this.b;
                i2 = this.d;
                iAvailable = inputStream.available();
            } else {
                throw new IOException("BufferedInputStream is closed");
            }
        }
        return (i - i2) + iAvailable;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        synchronized (this) {
            if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
                this.TuitionPaymentFragmentbindingInflater1 = null;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.TuitionPaymentFragmentbindingInflater1 != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
            this.TuitionPaymentFragmentbindingInflater1 = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    private int TuitionPaymentFragmentbindingInflater1(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i != -1) {
            int i2 = this.d;
            int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i2 - i < i3) {
                if (i == 0 && i3 > bArr.length && this.b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.TuitionPaymentFragmentbindingInflater1 = bArr2;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.d - this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                this.d = i4;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                this.b = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.d;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.b = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
            this.d = 0;
            this.b = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Math.max(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.d;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        synchronized (this) {
            byte[] bArr = this.TuitionPaymentFragmentbindingInflater1;
            InputStream inputStream = ((FilterInputStream) this).in;
            if (bArr != null && inputStream != null) {
                if (this.d >= this.b && TuitionPaymentFragmentbindingInflater1(inputStream, bArr) == -1) {
                    return -1;
                }
                if (bArr != this.TuitionPaymentFragmentbindingInflater1 && (bArr = this.TuitionPaymentFragmentbindingInflater1) == null) {
                    throw new IOException("BufferedInputStream is closed");
                }
                int i = this.b;
                int i2 = this.d;
                if (i - i2 <= 0) {
                    return -1;
                }
                this.d = i2 + 1;
                return bArr[i2] & UByte.MAX_VALUE;
            }
            throw new IOException("BufferedInputStream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        synchronized (this) {
            byte[] bArr2 = this.TuitionPaymentFragmentbindingInflater1;
            if (bArr2 == null) {
                throw new IOException("BufferedInputStream is closed");
            }
            if (i2 == 0) {
                return 0;
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i5 = this.d;
                int i6 = this.b;
                if (i5 < i6) {
                    int i7 = i6 - i5;
                    if (i7 >= i2) {
                        i7 = i2;
                    }
                    System.arraycopy(bArr2, i5, bArr, i, i7);
                    this.d += i7;
                    if (i7 == i2 || inputStream.available() == 0) {
                        return i7;
                    }
                    i += i7;
                    i3 = i2 - i7;
                } else {
                    i3 = i2;
                }
                while (true) {
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            return i3 != i2 ? i2 - i3 : -1;
                        }
                    } else {
                        if (TuitionPaymentFragmentbindingInflater1(inputStream, bArr2) == -1) {
                            return i3 != i2 ? i2 - i3 : -1;
                        }
                        if (bArr2 != this.TuitionPaymentFragmentbindingInflater1 && (bArr2 = this.TuitionPaymentFragmentbindingInflater1) == null) {
                            throw new IOException("BufferedInputStream is closed");
                        }
                        int i8 = this.b;
                        int i9 = this.d;
                        i4 = i8 - i9;
                        if (i4 >= i3) {
                            i4 = i3;
                        }
                        System.arraycopy(bArr2, i9, bArr, i, i4);
                        this.d += i4;
                    }
                    i3 -= i4;
                    if (i3 == 0) {
                        return i2;
                    }
                    if (inputStream.available() == 0) {
                        return i2 - i3;
                    }
                    i += i4;
                }
            } else {
                throw new IOException("BufferedInputStream is closed");
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        synchronized (this) {
            if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                throw new IOException("Stream is closed");
            }
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (-1 == i) {
                StringBuilder sb = new StringBuilder("Mark has been invalidated, pos: ");
                sb.append(this.d);
                sb.append(" markLimit: ");
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                throw new InvalidMarkException(sb.toString());
            }
            this.d = i;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        synchronized (this) {
            if (j < 1) {
                return 0L;
            }
            byte[] bArr = this.TuitionPaymentFragmentbindingInflater1;
            if (bArr != null) {
                InputStream inputStream = ((FilterInputStream) this).in;
                if (inputStream != null) {
                    int i = this.b;
                    int i2 = this.d;
                    if (i - i2 >= j) {
                        this.d = (int) (((long) i2) + j);
                        return j;
                    }
                    long j2 = ((long) i) - ((long) i2);
                    this.d = i;
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != -1 && j <= this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        if (TuitionPaymentFragmentbindingInflater1(inputStream, bArr) == -1) {
                            return j2;
                        }
                        int i3 = this.b;
                        int i4 = this.d;
                        if (i3 - i4 >= j - j2) {
                            this.d = (int) ((((long) i4) + j) - j2);
                            return j;
                        }
                        long j3 = i3;
                        long j4 = i4;
                        this.d = i3;
                        return (j2 + j3) - j4;
                    }
                    long jSkip = inputStream.skip(j - j2);
                    if (jSkip > 0) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
                    }
                    return j2 + jSkip;
                }
                throw new IOException("BufferedInputStream is closed");
            }
            throw new IOException("BufferedInputStream is closed");
        }
    }

    static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }
}
