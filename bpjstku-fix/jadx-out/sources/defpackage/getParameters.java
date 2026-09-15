package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class getParameters {
    public static final getParameters TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getParameters();
    public final RestrictedCameraControl b;
    public final RestrictedCameraControl g;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 929;
    public final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[929];
    public final int[] TuitionPaymentFragmentbindingInflater1 = new int[929];

    private getParameters() {
        int i = 1;
        for (int i2 = 0; i2 < 929; i2++) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i2] = i;
            i = (i * 3) % 929;
        }
        for (int i3 = 0; i3 < 928; i3++) {
            this.TuitionPaymentFragmentbindingInflater1[this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3]] = i3;
        }
        this.g = new RestrictedCameraControl(this, new int[]{0});
        this.b = new RestrictedCameraControl(this, new int[]{1});
    }

    public final RestrictedCameraControl TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.g;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new RestrictedCameraControl(this, iArr);
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int[] iArr2 = this.TuitionPaymentFragmentbindingInflater1;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1)];
    }
}
