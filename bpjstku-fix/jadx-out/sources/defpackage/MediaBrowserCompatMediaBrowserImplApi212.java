package defpackage;

import android.util.LruCache;
import at.favre.lib.bytes.Bytes;
import at.favre.lib.bytes.BytesTransformer;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public interface MediaBrowserCompatMediaBrowserImplApi212 {
    void TuitionPaymentFragmentbindingInflater1(byte[] bArr, char[] cArr, byte[] bArr2);

    byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr, char[] cArr);

    public static final class b implements MediaBrowserCompatMediaBrowserImplApi212 {
        private long TuitionPaymentFragmentbindingInflater1;
        private final LruCache<Long, MediaBrowserCompatItemReceiver> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new LruCache<>(12);
        private final SecureRandom TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public b(boolean z, SecureRandom secureRandom) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = secureRandom;
        }

        @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi212
        public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr, char[] cArr) {
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return null;
            }
            if (this.TuitionPaymentFragmentbindingInflater1 == TuitionPaymentFragmentspecialinlinedviewModeldefault2(cArr)) {
                MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr)));
                if (mediaBrowserCompatItemReceiver != null) {
                    return mediaBrowserCompatItemReceiver.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
                return null;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return null;
        }

        @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi212
        public final void TuitionPaymentFragmentbindingInflater1(byte[] bArr, char[] cArr, byte[] bArr2) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(cArr);
                if (jTuitionPaymentFragmentspecialinlinedviewModeldefault2 != this.TuitionPaymentFragmentbindingInflater1) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
                this.TuitionPaymentFragmentbindingInflater1 = jTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr)), new MediaBrowserCompatItemReceiver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            }
        }

        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2(char[] cArr) {
            Bytes bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1(cArr);
            Bytes bytesB = bytesTuitionPaymentFragmentbindingInflater1.factory.b(new BytesTransformer.TuitionPaymentFragmentbindingInflater1("SHA-256").b(bytesTuitionPaymentFragmentbindingInflater1.byteArray, bytesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesTuitionPaymentFragmentbindingInflater1.byteOrder);
            MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytesB.byteArray.length, 0, 8, "long");
            return ((ByteBuffer) ByteBuffer.wrap(bytesB.byteArray).order(bytesB.byteOrder).position(0)).getLong();
        }

        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) {
            Bytes bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1(bArr);
            Bytes bytesB = bytesTuitionPaymentFragmentbindingInflater1.factory.b(new BytesTransformer.TuitionPaymentFragmentbindingInflater1("SHA-256").b(bytesTuitionPaymentFragmentbindingInflater1.byteArray, bytesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesTuitionPaymentFragmentbindingInflater1.byteOrder);
            MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytesB.byteArray.length, 0, 8, "long");
            return ((ByteBuffer) ByteBuffer.wrap(bytesB.byteArray).order(bytesB.byteOrder).position(0)).getLong();
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            this.TuitionPaymentFragmentbindingInflater1 = 0L;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.snapshot() != null) {
                Iterator<MediaBrowserCompatItemReceiver> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.snapshot().values().iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.evictAll();
        }
    }
}
