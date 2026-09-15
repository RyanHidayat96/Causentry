package defpackage;

import at.favre.lib.bytes.Bytes;
import at.favre.lib.bytes.MutableBytes;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaBrowserCompatMediaBrowserImplApi216 implements MediaBrowserCompatItemCallbackStubApi23 {
    private final byte[] b;

    MediaBrowserCompatMediaBrowserImplApi216(byte[] bArr) {
        this.b = (byte[]) Objects.requireNonNull(bArr);
    }

    @Override // defpackage.MediaBrowserCompatItemCallbackStubApi23
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) {
        MutableBytes mutableBytes;
        MutableBytes mutableBytes2;
        MutableBytes mutableBytes3;
        Objects.requireNonNull(bArr);
        if (MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b == null) {
            MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection(new MediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault1("HmacSHA512"));
        }
        MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection = MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b;
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new byte[64]), this.b);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int i = 0;
        int i2 = 0;
        while (byteBufferWrap.hasRemaining()) {
            int iMin = Math.min(128, byteBufferWrap.remaining());
            byte[] bArr2 = new byte[iMin];
            if (MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b == null) {
                MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection(new MediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault1("HmacSHA512"));
            }
            MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2 = MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b;
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2), Bytes.b(i).byteArray, iMin);
            byteBufferWrap.get(bArr2);
            int i3 = 0;
            while (i3 < iMin) {
                bArr[i2] = (byte) (bArr2[i3] ^ bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[i3]);
                i3++;
                i2++;
            }
            Bytes bytesB = Bytes.b(bArr2);
            if (bytesB instanceof MutableBytes) {
                mutableBytes2 = (MutableBytes) bytesB;
            } else {
                mutableBytes2 = new MutableBytes(bytesB.byteArray, bytesB.byteOrder);
            }
            Arrays.fill(mutableBytes2.byteArray, (byte) 0);
            Bytes bytesB2 = Bytes.b(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (bytesB2 instanceof MutableBytes) {
                mutableBytes3 = (MutableBytes) bytesB2;
            } else {
                mutableBytes3 = new MutableBytes(bytesB2.byteArray, bytesB2.byteOrder);
            }
            Arrays.fill(mutableBytes3.byteArray, (byte) 0);
            i++;
        }
        Bytes bytesB3 = Bytes.b(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (bytesB3 instanceof MutableBytes) {
            mutableBytes = (MutableBytes) bytesB3;
        } else {
            mutableBytes = new MutableBytes(bytesB3.byteArray, bytesB3.byteOrder);
        }
        Arrays.fill(mutableBytes.byteArray, (byte) 0);
    }

    @Override // defpackage.MediaBrowserCompatItemCallbackStubApi23
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr);
    }

    @Override // defpackage.MediaBrowserCompatItemCallbackStubApi23
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        MutableBytes mutableBytes;
        Bytes bytesB = Bytes.b(this.b);
        if (bytesB instanceof MutableBytes) {
            mutableBytes = (MutableBytes) bytesB;
        } else {
            mutableBytes = new MutableBytes(bytesB.byteArray, bytesB.byteOrder);
        }
        SecureRandom secureRandom = new SecureRandom();
        if (mutableBytes.byteArray.length > 0) {
            secureRandom.nextBytes(mutableBytes.byteArray);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements MediaBrowserCompatItemCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        @Override // MediaBrowserCompatItemCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final MediaBrowserCompatItemCallbackStubApi23 TuitionPaymentFragmentbindingInflater1(byte[] bArr) {
            return new MediaBrowserCompatMediaBrowserImplApi216(bArr);
        }
    }
}
