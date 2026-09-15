package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public final class attachPreviewSurface<T> {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final videoProfileHdrFormatsToDynamicRangeEncoding<T> TuitionPaymentFragmentbindingInflater1;

    public attachPreviewSurface(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding) {
        this.TuitionPaymentFragmentbindingInflater1 = videoprofilehdrformatstodynamicrangeencoding;
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 7206835;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = startUptimeMillis;
        return startUptimeMillis;
    }
}
