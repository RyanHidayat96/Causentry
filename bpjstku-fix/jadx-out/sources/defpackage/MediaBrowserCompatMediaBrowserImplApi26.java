package defpackage;

import android.os.StrictMode;
import java.security.Provider;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaBrowserCompatMediaBrowserImplApi26 implements MediaBrowserCompatMediaBrowserImplBase {
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Provider TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public MediaBrowserCompatMediaBrowserImplApi26() {
        this((byte) 0);
    }

    private MediaBrowserCompatMediaBrowserImplApi26(byte b) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Math.max(1000, 10000);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
    }

    @Override // defpackage.MediaBrowserCompatMediaBrowserImplBase
    public final byte[] b(byte[] bArr, char[] cArr) {
        try {
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StrictMode.noteSlowCall("pbkdf2 is a very expensive call and should not be done on the main thread");
            return SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(cArr, bArr, i, 256)).getEncoded();
        } catch (Exception e2) {
            throw new IllegalStateException("could not stretch with pbkdf2", e2);
        }
    }
}
