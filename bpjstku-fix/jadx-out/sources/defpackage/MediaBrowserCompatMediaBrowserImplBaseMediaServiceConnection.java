package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection {
    public static MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection TuitionPaymentFragmentbindingInflater1;
    public static MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection b;
    public final MediaBrowserCompatMediaBrowserImplBase5 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection(MediaBrowserCompatMediaBrowserImplBase5 mediaBrowserCompatMediaBrowserImplBase5) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaBrowserCompatMediaBrowserImplBase5;
    }

    public final byte[] b(SecretKey secretKey, byte[] bArr, byte[] bArr2, int i) {
        b bVar = new b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        MediaBrowserCompatMediaBrowserImplBase5 mediaBrowserCompatMediaBrowserImplBase5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaBrowserCompatMediaBrowserImplBase5).TuitionPaymentFragmentspecialinlinedviewModeldefault2(secretKey, bArr)), bArr2, i);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private final MediaBrowserCompatMediaBrowserImplBase5 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaBrowserCompatMediaBrowserImplBase5 mediaBrowserCompatMediaBrowserImplBase5) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaBrowserCompatMediaBrowserImplBase5;
        }

        public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(SecretKey secretKey, byte[] bArr) {
            if (secretKey == null) {
                MediaBrowserCompatMediaBrowserImplBase5 mediaBrowserCompatMediaBrowserImplBase5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                secretKey = mediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new byte[mediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault3()]);
            }
            if (bArr == null || bArr.length <= 0) {
                throw new IllegalArgumentException("provided inputKeyingMaterial must be at least of size 1 and not null");
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(secretKey).doFinal(bArr);
        }
    }

    public static final class b {
        private final MediaBrowserCompatMediaBrowserImplBase5 b;

        public b(MediaBrowserCompatMediaBrowserImplBase5 mediaBrowserCompatMediaBrowserImplBase5) {
            this.b = mediaBrowserCompatMediaBrowserImplBase5;
        }

        public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(SecretKey secretKey, byte[] bArr, int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("out length bytes must be at least 1");
            }
            if (secretKey == null) {
                throw new IllegalArgumentException("provided pseudoRandomKey must not be null");
            }
            Mac macTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(secretKey);
            if (bArr == null) {
                bArr = new byte[0];
            }
            byte[] bArrDoFinal = new byte[0];
            int iCeil = (int) Math.ceil(((double) i) / ((double) macTuitionPaymentFragmentspecialinlinedviewModeldefault3.getMacLength()));
            if (iCeil > 255) {
                StringBuilder sb = new StringBuilder("out length must be maximal 255 * hash-length; requested: ");
                sb.append(i);
                sb.append(" bytes");
                throw new IllegalArgumentException(sb.toString());
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            int i2 = 0;
            while (i2 < iCeil) {
                macTuitionPaymentFragmentspecialinlinedviewModeldefault3.update(bArrDoFinal);
                macTuitionPaymentFragmentspecialinlinedviewModeldefault3.update(bArr);
                i2++;
                macTuitionPaymentFragmentspecialinlinedviewModeldefault3.update((byte) i2);
                bArrDoFinal = macTuitionPaymentFragmentspecialinlinedviewModeldefault3.doFinal();
                int iMin = Math.min(i, bArrDoFinal.length);
                byteBufferAllocate.put(bArrDoFinal, 0, iMin);
                i -= iMin;
            }
            return byteBufferAllocate.array();
        }
    }
}
