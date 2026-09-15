package defpackage;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes6.dex */
final class QuirkSettingsHolder extends setEnabledWhenDeviceHasQuirk {
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final int b;

    QuirkSettingsHolder(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
        this.b = i3;
    }
}
