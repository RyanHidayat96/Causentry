package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public final class addOutputConfig {
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final byte[][] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public addOutputConfig(int i, int i2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * 2 * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + 2);
        for (int i = 0; i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault2; i++) {
            for (int i2 = 0; i2 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1; i2++) {
                byte b = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i][i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b == 1) {
                    sb.append(" 1");
                } else {
                    sb.append("  ");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
