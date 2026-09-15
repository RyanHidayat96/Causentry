package defpackage;

import at.favre.lib.bytes.Bytes;
import java.text.Normalizer;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaBrowserCompatMediaBrowserImplApi217 implements MediaBrowserCompatMediaBrowserImplBase3 {
    private final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 20;

    public MediaBrowserCompatMediaBrowserImplApi217(byte[] bArr) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (byte[]) Objects.requireNonNull(bArr);
    }

    @Override // defpackage.MediaBrowserCompatMediaBrowserImplBase3
    public final String b(String str, String str2) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(str2);
        if (MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b == null) {
            MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection(new MediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault1("HmacSHA512"));
        }
        MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection = MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b;
        byte[] bArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Bytes bytesB = Bytes.b(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr), Bytes.b(str, Normalizer.Form.NFKD).byteArray, Bytes.b(str2, Normalizer.Form.NFKD).byteArray, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        return new MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false).b(bytesB.byteArray, bytesB.byteOrder);
    }
}
