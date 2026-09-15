package defpackage;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public final class builder extends FilterInputStream {
    private final byte[] INotificationSideChannel;
    private int INotificationSideChannelDefault;
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f348a;
    private final int asBinder;
    private final int[] asInterface;
    private int cancel;
    private final int cancelAll;
    private final int[] d;
    private final byte[][] g;
    private final int notify;
    private int onTransact;
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = SessionConfigSessionError.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = SessionConfigSessionError.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final int[] b = SessionConfigSessionError.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final int[] TuitionPaymentFragmentbindingInflater1 = SessionConfigSessionError.TuitionPaymentFragmentbindingInflater1;
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SessionConfigSessionError.b;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public builder(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, (byte) 0);
    }

    private builder(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, byte b2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.d = new int[4];
        this.f348a = new byte[16];
        this.INotificationSideChannel = new byte[16];
        this.cancel = 1;
        this.onTransact = Integer.MAX_VALUE;
        this.INotificationSideChannelDefault = 16;
        this.RemoteActionCompatParcelizer = 16;
        this.asBinder = i;
        this.asInterface = SessionConfigSessionError.b(bArr, i);
        byte[][] bArr3 = new byte[bArr2.length][];
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr3[i2] = new byte[bArr2[i2].length];
            int i3 = 0;
            while (true) {
                byte[] bArr4 = bArr2[i2];
                if (i3 < bArr4.length) {
                    bArr3[i2][bArr4[i3]] = (byte) i3;
                    i3++;
                }
            }
        }
        this.g = bArr3;
        this.notify = 100;
        this.cancelAll = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = this.INotificationSideChannelDefault;
        if (i >= this.RemoteActionCompatParcelizer) {
            return -1;
        }
        byte[] bArr = this.INotificationSideChannel;
        this.INotificationSideChannelDefault = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i5 = this.INotificationSideChannelDefault;
            if (i5 >= this.RemoteActionCompatParcelizer) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.INotificationSideChannel;
            this.INotificationSideChannelDefault = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return this.RemoteActionCompatParcelizer - this.INotificationSideChannelDefault;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
        if (this.onTransact == Integer.MAX_VALUE) {
            this.onTransact = ((FilterInputStream) this).in.read();
        }
        if (this.INotificationSideChannelDefault == 16) {
            byte[] bArr = this.f348a;
            int i = this.onTransact;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.f348a, i2, 16 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 16);
            if (i2 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.notify;
            if (i4 == this.cancelAll) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.f348a, this.INotificationSideChannel);
            } else {
                if (this.cancel <= i4) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.f348a, this.INotificationSideChannel);
                } else {
                    byte[] bArr2 = this.f348a;
                    System.arraycopy(bArr2, 0, this.INotificationSideChannel, 0, bArr2.length);
                }
                int i5 = this.cancel;
                if (i5 < this.cancelAll) {
                    this.cancel = i5 + 1;
                } else {
                    this.cancel = 1;
                }
            }
            int i6 = ((FilterInputStream) this).in.read();
            this.onTransact = i6;
            this.INotificationSideChannelDefault = 0;
            this.RemoteActionCompatParcelizer = i6 < 0 ? 16 - (this.INotificationSideChannel[15] & UByte.MAX_VALUE) : 16;
        }
        return this.RemoteActionCompatParcelizer;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.d;
        char c = 1;
        int i = (bArr[0] << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
        int[] iArr2 = this.asInterface;
        iArr[0] = i ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & UByte.MAX_VALUE) << 16)) | ((bArr[6] & UByte.MAX_VALUE) << 8)) | (bArr[7] & UByte.MAX_VALUE)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & UByte.MAX_VALUE) << 16)) | ((bArr[10] & UByte.MAX_VALUE) << 8)) | (bArr[11] & UByte.MAX_VALUE)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & UByte.MAX_VALUE) << 16) | (bArr[12] << 24)) | ((bArr[14] & UByte.MAX_VALUE) << 8)) | (bArr[15] & UByte.MAX_VALUE));
        int i2 = 4;
        int i3 = 1;
        while (i3 < this.asBinder) {
            int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int[] iArr4 = this.d;
            byte[][] bArr3 = this.g;
            byte[] bArr4 = bArr3[0];
            int i4 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = b;
            byte[] bArr5 = bArr3[c];
            int i5 = i4 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = TuitionPaymentFragmentbindingInflater1;
            byte[] bArr6 = bArr3[2];
            int i6 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i5;
            int[] iArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            byte[] bArr7 = bArr3[3];
            int i7 = iArr7[iArr4[bArr7[0]] & 255] ^ i6;
            int[] iArr8 = this.asInterface;
            int i8 = i7 ^ iArr8[i2];
            int i9 = ((iArr6[(iArr4[bArr6[c]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c]] >>> 24] ^ iArr5[(iArr4[bArr5[c]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c]] & 255]) ^ iArr8[i2 + 1];
            int i10 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i2 + 2];
            int i11 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i2 + 3];
            iArr4[0] = i8;
            iArr4[1] = i9;
            iArr4[2] = i10;
            iArr4[3] = i11;
            i3++;
            i2 += 4;
            c = 1;
        }
        int[] iArr9 = this.asInterface;
        int i12 = iArr9[i2];
        byte[] bArr8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int[] iArr10 = this.d;
        byte[][] bArr9 = this.g;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i12 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i12 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i12 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i12);
        int i13 = iArr9[i2 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i13 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[7] = (byte) (i13 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i14 = iArr9[i2 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i14 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[11] = (byte) (i14 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i15 = iArr9[i2 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i15 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[15] = (byte) (i15 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }
}
