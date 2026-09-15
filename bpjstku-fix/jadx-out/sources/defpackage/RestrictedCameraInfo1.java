package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public final class RestrictedCameraInfo1 {
    private final int TuitionPaymentFragmentbindingInflater1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final getCameraConfig[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final int b;

    public RestrictedCameraInfo1(int i, int i2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getCameraConfig[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3] = new getCameraConfig(((i2 + 4) * 17) + 1);
        }
        this.TuitionPaymentFragmentbindingInflater1 = i2 * 17;
        this.b = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;
    }

    public final byte[][] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.b * i2, this.TuitionPaymentFragmentbindingInflater1 * i);
        int i3 = this.b * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i4 / i2].TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
        }
        return bArr;
    }
}
