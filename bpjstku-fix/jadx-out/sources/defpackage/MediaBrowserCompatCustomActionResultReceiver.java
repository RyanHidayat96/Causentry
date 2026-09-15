package defpackage;

import android.os.StrictMode;
import at.favre.lib.bytes.Bytes;
import at.favre.lib.bytes.MutableBytes;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class MediaBrowserCompatCustomActionResultReceiver implements MediaBrowserCompatMediaBrowserImplBase {
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public MediaBrowserCompatCustomActionResultReceiver() {
        this((byte) 0);
    }

    private MediaBrowserCompatCustomActionResultReceiver(byte b) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Math.max(8, 12);
    }

    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, char[] cArr, int i) {
        MutableBytes mutableBytes;
        StrictMode.noteSlowCall("bcrypt is a very expensive call and should not be done on the main thread");
        Bytes bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1();
        try {
            bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1(cArr);
            postOrRun.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = postOrRun.TuitionPaymentFragmentspecialinlinedviewModeldefault2(postOrRun.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1 == null) {
                MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1 = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection(new MediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault1("HmacSHA256"));
            }
            MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection = MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1;
            byte[] bytes = "bcrypt-salt".getBytes();
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr), bytes, 16);
            if (MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1 == null) {
                MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1 = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection(new MediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault1("HmacSHA256"));
            }
            MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2 = MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1;
            byte[] bArr2 = bytesTuitionPaymentFragmentbindingInflater1.byteArray;
            byte[] bytes2 = "bcrypt-pw".getBytes();
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3, new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr2), bytes2, 71)).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        } finally {
            if (bytesTuitionPaymentFragmentbindingInflater1 instanceof MutableBytes) {
                mutableBytes = (MutableBytes) bytesTuitionPaymentFragmentbindingInflater1;
            } else {
                mutableBytes = new MutableBytes(bytesTuitionPaymentFragmentbindingInflater1.byteArray, bytesTuitionPaymentFragmentbindingInflater1.byteOrder);
            }
            SecureRandom secureRandom = new SecureRandom();
            if (mutableBytes.byteArray.length > 0) {
                secureRandom.nextBytes(mutableBytes.byteArray);
            }
        }
    }

    @Override // defpackage.MediaBrowserCompatMediaBrowserImplBase
    public final byte[] b(byte[] bArr, char[] cArr) {
        try {
            if (MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1 == null) {
                MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1 = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection(new MediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault1("HmacSHA256"));
            }
            MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection = MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentbindingInflater1;
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr, cArr, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            byte[] bytes = "bcrypt".getBytes();
            return new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3), bytes, 32);
        } catch (Exception e2) {
            throw new IllegalStateException("could not stretch with bcrypt", e2);
        }
    }
}
