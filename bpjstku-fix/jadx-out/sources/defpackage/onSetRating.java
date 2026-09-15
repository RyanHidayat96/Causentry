package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class onSetRating {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(float f, int i, int i2) {
        float f2;
        float fPow;
        if (i == i2) {
            return i;
        }
        float f3 = ((i >> 24) & 255) / 255.0f;
        float f4 = ((i >> 16) & 255) / 255.0f;
        float f5 = ((i >> 8) & 255) / 255.0f;
        float f6 = (i & 255) / 255.0f;
        float f7 = ((i2 >> 24) & 255) / 255.0f;
        float f8 = ((i2 >> 16) & 255) / 255.0f;
        float f9 = ((i2 >> 8) & 255) / 255.0f;
        float f10 = (i2 & 255) / 255.0f;
        float fPow2 = f4 <= 0.04045f ? f4 / 12.92f : (float) Math.pow((f4 + 0.055f) / 1.055f, 2.4000000953674316d);
        float fPow3 = f5 <= 0.04045f ? f5 / 12.92f : (float) Math.pow((f5 + 0.055f) / 1.055f, 2.4000000953674316d);
        if (f6 <= 0.04045f) {
            fPow = f6 / 12.92f;
            f2 = 0.055f;
        } else {
            f2 = 0.055f;
            fPow = (float) Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        float fPow4 = f8 <= 0.04045f ? f8 / 12.92f : (float) Math.pow((f8 + f2) / 1.055f, 2.4000000953674316d);
        float fPow5 = f9 <= 0.04045f ? f9 / 12.92f : (float) Math.pow((f9 + f2) / 1.055f, 2.4000000953674316d);
        float fPow6 = f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + f2) / 1.055f, 2.4000000953674316d);
        float f11 = fPow2 + ((fPow4 - fPow2) * f);
        float f12 = fPow3 + ((fPow5 - fPow3) * f);
        float f13 = fPow + ((fPow6 - fPow) * f);
        return Math.round((f13 <= 0.0031308f ? f13 * 12.92f : (float) ((Math.pow(f13, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d)) * 255.0f) | (Math.round((f3 + ((f7 - f3) * f)) * 255.0f) << 24) | (Math.round((f11 <= 0.0031308f ? f11 * 12.92f : (float) ((Math.pow(f11, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d)) * 255.0f) << 16) | (Math.round((f12 <= 0.0031308f ? f12 * 12.92f : (float) ((Math.pow(f12, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d)) * 255.0f) << 8);
    }
}
