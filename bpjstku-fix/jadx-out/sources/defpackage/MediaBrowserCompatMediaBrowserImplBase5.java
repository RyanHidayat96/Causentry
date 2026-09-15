package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.gms.internal.measurement.zznq;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public interface MediaBrowserCompatMediaBrowserImplBase5 {
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    Mac TuitionPaymentFragmentspecialinlinedviewModeldefault3(SecretKey secretKey);

    SecretKey TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr);

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements MediaBrowserCompatMediaBrowserImplBase5 {
        private final Provider TuitionPaymentFragmentbindingInflater1 = null;
        private final String b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            this.b = str;
        }

        @Override // defpackage.MediaBrowserCompatMediaBrowserImplBase5
        public final Mac TuitionPaymentFragmentspecialinlinedviewModeldefault3(SecretKey secretKey) {
            try {
                Mac macTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                macTuitionPaymentFragmentspecialinlinedviewModeldefault1.init(secretKey);
                return macTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } catch (Exception e2) {
                throw new IllegalStateException("could not make hmac hasher in hkdf", e2);
            }
        }

        private Mac TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            try {
                return Mac.getInstance(this.b);
            } catch (NoSuchAlgorithmException e2) {
                throw new IllegalStateException("defined mac algorithm was not found", e2);
            } catch (Exception e3) {
                throw new IllegalStateException("could not create mac instance in hkdf", e3);
            }
        }

        @Override // defpackage.MediaBrowserCompatMediaBrowserImplBase5
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1().getMacLength();
        }

        @Override // defpackage.MediaBrowserCompatMediaBrowserImplBase5
        public final SecretKey TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) {
            if (bArr == null || bArr.length <= 0) {
                return null;
            }
            int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            if (zznq.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
                Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
            }
            return new SecretKeySpec(bArr, this.b);
        }
    }
}
