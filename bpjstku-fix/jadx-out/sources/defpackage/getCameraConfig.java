package defpackage;

/* JADX INFO: loaded from: classes5.dex */
final class getCameraConfig {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    getCameraConfig(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new byte[i];
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 + 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3] = z ? (byte) 1 : (byte) 0;
        }
    }

    final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        int length = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2 / i];
        }
        return bArr;
    }
}
