package defpackage;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes4.dex */
public final class setSessionType extends FilterInputStream {
    private int INotificationSideChannel;
    private SessionConfigOptionUnpacker TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f1386a;
    private byte[] asBinder;
    private int asInterface;
    private final int b;
    private int cancel;
    private int cancelAll;
    private byte[] d;
    private int[] g;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public setSessionType(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        this(inputStream, iArr, bArr, i, z, i2, (byte) 0);
    }

    private setSessionType(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2, byte b) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        this.cancelAll = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i, 3), 16);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iMin;
        this.asBinder = new byte[8];
        byte[] bArr2 = new byte[8];
        this.f1386a = bArr2;
        this.d = new byte[8];
        this.g = new int[2];
        this.asInterface = 8;
        this.cancel = 8;
        this.INotificationSideChannel = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.TuitionPaymentFragmentbindingInflater1 = new SessionConfigOptionUnpacker(iArr, iMin, true, z);
        this.b = 100;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = this.asInterface;
        if (i >= this.cancel) {
            return -1;
        }
        byte[] bArr = this.asBinder;
        this.asInterface = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i5 = this.asInterface;
            if (i5 >= this.cancel) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.asBinder;
            this.asInterface = i5 + 1;
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
        return this.cancel - this.asInterface;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.INotificationSideChannel == 2) {
            byte[] bArr = this.asBinder;
            System.arraycopy(bArr, 0, this.d, 0, bArr.length);
        }
        byte[] bArr2 = this.asBinder;
        SessionConfigOutputConfig.TuitionPaymentFragmentbindingInflater1(((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & UByte.MAX_VALUE), ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & UByte.MAX_VALUE), false, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.g);
        int[] iArr = this.g;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.asBinder;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.INotificationSideChannel == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.asBinder;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.f1386a[i3]);
            }
            byte[] bArr5 = this.d;
            System.arraycopy(bArr5, 0, this.f1386a, 0, bArr5.length);
        }
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
        if (this.cancelAll == Integer.MAX_VALUE) {
            this.cancelAll = ((FilterInputStream) this).in.read();
        }
        if (this.asInterface == 8) {
            byte[] bArr = this.asBinder;
            int i = this.cancelAll;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.asBinder, i2, 8 - i2);
                if (i3 <= 0) {
                    break;
                }
                i2 += i3;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.b;
            if (i4 == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= i4) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (i5 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 + 1;
                } else {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
                }
            }
            int i6 = ((FilterInputStream) this).in.read();
            this.cancelAll = i6;
            this.asInterface = 0;
            this.cancel = i6 < 0 ? 8 - (this.asBinder[7] & UByte.MAX_VALUE) : 8;
        }
        return this.cancel;
    }
}
