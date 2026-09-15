package defpackage;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public interface MediaBrowserCompatMediaBrowserImplApi213 {
    byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public static final class b implements MediaBrowserCompatMediaBrowserImplApi213 {
        private final MediaBrowserCompatItemReceiver TuitionPaymentFragmentbindingInflater1;

        public b(byte[] bArr) {
            this.TuitionPaymentFragmentbindingInflater1 = new MediaBrowserCompatItemReceiver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr, new SecureRandom());
        }

        @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi213
        public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }
}
