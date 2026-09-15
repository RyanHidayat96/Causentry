package defpackage;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public final class SessionConfigOutputConfigBuilder extends FilterInputStream {
    private static final short b = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private final int INotificationSideChannel;
    private int INotificationSideChannelStubProxy;
    private byte[] TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f212a;
    private int asBinder;
    private int asInterface;
    private int cancel;
    private int cancelAll;
    private int d;
    private int g;
    private final int notify;
    private int onTransact;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public SessionConfigOutputConfigBuilder(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        this(inputStream, iArr, i, bArr, i2, i3, (byte) 0);
    }

    private SessionConfigOutputConfigBuilder(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, byte b2) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.asBinder = Integer.MAX_VALUE;
        this.INotificationSideChannelStubProxy = 1;
        this.TuitionPaymentFragmentbindingInflater1 = new byte[8];
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[8];
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new byte[8];
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 8;
        this.d = 8;
        this.f212a = Math.min(Math.max(i2, 5), 16);
        this.asInterface = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0, 8);
        }
        long j = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i != 0) {
            int i4 = (int) j;
            this.g = i4;
            this.cancelAll = i4 * i;
            this.cancel = i ^ i4;
            this.onTransact = (int) (j >> 32);
        } else {
            this.g = (int) j;
            long j2 = j >> 3;
            short s = b;
            this.cancelAll = (int) ((((long) s) * j2) >> 32);
            this.cancel = (int) (j >> 32);
            this.onTransact = (int) (j2 + ((long) s));
        }
        this.INotificationSideChannel = 100;
        this.notify = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        TuitionPaymentFragmentbindingInflater1();
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i >= this.d) {
            return -1;
        }
        byte[] bArr = this.TuitionPaymentFragmentbindingInflater1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            TuitionPaymentFragmentbindingInflater1();
            int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i5 >= this.d) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 + 1;
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
        TuitionPaymentFragmentbindingInflater1();
        return this.d - this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (this.asInterface == 3) {
            byte[] bArr = this.TuitionPaymentFragmentbindingInflater1;
            System.arraycopy(bArr, 0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, 0, bArr.length);
        }
        byte[] bArr2 = this.TuitionPaymentFragmentbindingInflater1;
        int i = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & UByte.MAX_VALUE);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & UByte.MAX_VALUE);
        int i3 = 0;
        while (true) {
            int i4 = this.f212a;
            if (i3 >= i4) {
                break;
            }
            short s = b;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.cancel)) ^ ((i >>> 5) + this.onTransact);
            i -= (((i2 << 4) + this.g) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.cancelAll);
            i3++;
        }
        byte[] bArr3 = this.TuitionPaymentFragmentbindingInflater1;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.asInterface == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.TuitionPaymentFragmentbindingInflater1;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i5]);
            }
            byte[] bArr5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            System.arraycopy(bArr5, 0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0, bArr5.length);
        }
    }

    private int TuitionPaymentFragmentbindingInflater1() throws IOException {
        if (this.asBinder == Integer.MAX_VALUE) {
            this.asBinder = ((FilterInputStream) this).in.read();
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 8) {
            byte[] bArr = this.TuitionPaymentFragmentbindingInflater1;
            int i = this.asBinder;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.TuitionPaymentFragmentbindingInflater1, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.INotificationSideChannel;
            if (i4 == this.notify) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } else {
                if (this.INotificationSideChannelStubProxy <= i4) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
                int i5 = this.INotificationSideChannelStubProxy;
                if (i5 < this.notify) {
                    this.INotificationSideChannelStubProxy = i5 + 1;
                } else {
                    this.INotificationSideChannelStubProxy = 1;
                }
            }
            int i6 = ((FilterInputStream) this).in.read();
            this.asBinder = i6;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            this.d = i6 < 0 ? 8 - (this.TuitionPaymentFragmentbindingInflater1[7] & UByte.MAX_VALUE) : 8;
        }
        return this.d;
    }
}
