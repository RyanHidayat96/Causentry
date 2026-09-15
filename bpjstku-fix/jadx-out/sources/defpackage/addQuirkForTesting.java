package defpackage;

import java.util.Formatter;

/* JADX INFO: loaded from: classes6.dex */
class addQuirkForTesting {
    final ReadableConfig[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final Quirks b;

    addQuirkForTesting(Quirks quirks) {
        this.b = new Quirks(quirks);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ReadableConfig[(quirks.b - quirks.d) + 1];
    }

    public String toString() {
        Formatter formatter = new Formatter();
        int i = 0;
        for (ReadableConfig readableConfig : this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            if (readableConfig == null) {
                formatter.format("%3d:    |   %n", Integer.valueOf(i));
            } else {
                formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(readableConfig.b), Integer.valueOf(readableConfig.TuitionPaymentFragmentbindingInflater1));
            }
            i++;
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    final ReadableConfig TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        ReadableConfig readableConfig;
        ReadableConfig readableConfig2;
        ReadableConfig readableConfig3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i - this.b.d];
        if (readableConfig3 != null) {
            return readableConfig3;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int i3 = (i - this.b.d) - i2;
            if (i3 >= 0 && (readableConfig2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3]) != null) {
                return readableConfig2;
            }
            int i4 = (i - this.b.d) + i2;
            ReadableConfig[] readableConfigArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i4 < readableConfigArr.length && (readableConfig = readableConfigArr[i4]) != null) {
                return readableConfig;
            }
        }
        return null;
    }
}
