package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class RestrictedCameraControl {
    public final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final getParameters b;

    public RestrictedCameraControl(getParameters getparameters, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.b = getparameters;
        int length = iArr.length;
        int i = 1;
        if (length > 1 && iArr[0] == 0) {
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr;
    }

    public final RestrictedCameraControl TuitionPaymentFragmentbindingInflater1(RestrictedCameraControl restrictedCameraControl) {
        if (!this.b.equals(restrictedCameraControl.b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (iArr[0] == 0) {
            return restrictedCameraControl;
        }
        int[] iArr2 = restrictedCameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (iArr2[0] == 0) {
            return this;
        }
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = (iArr2[i - length] + iArr[i]) % this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        return new RestrictedCameraControl(this.b, iArr3);
    }

    public final RestrictedCameraControl TuitionPaymentFragmentspecialinlinedviewModeldefault1(RestrictedCameraControl restrictedCameraControl) {
        if (this.b.equals(restrictedCameraControl.b)) {
            return restrictedCameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] == 0 ? this : TuitionPaymentFragmentbindingInflater1(restrictedCameraControl.b());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public final RestrictedCameraControl TuitionPaymentFragmentspecialinlinedviewModeldefault3(RestrictedCameraControl restrictedCameraControl) {
        if (!this.b.equals(restrictedCameraControl.b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (iArr[0] != 0) {
            int[] iArr2 = restrictedCameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (iArr2[0] != 0) {
                int length = iArr.length;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        getParameters getparameters = this.b;
                        iArr3[i4] = (iArr3[i4] + getparameters.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, iArr2[i3])) % getparameters.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                }
                return new RestrictedCameraControl(this.b, iArr3);
            }
        }
        return this.b.g;
    }

    public final RestrictedCameraControl b() {
        int length = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            getParameters getparameters = this.b;
            int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i];
            int i3 = getparameters.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            iArr[i] = (i3 - i2) % i3;
        }
        return new RestrictedCameraControl(this.b, iArr);
    }

    public final RestrictedCameraControl b(int i) {
        if (i == 0) {
            return this.b.g;
        }
        if (i == 1) {
            return this;
        }
        int length = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i2], i);
        }
        return new RestrictedCameraControl(this.b, iArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - 1) * 8);
        for (int length = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - 1; length >= 0; length--) {
            int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i = iArr[(iArr.length - 1) - length];
            if (i != 0) {
                if (i < 0) {
                    sb.append(" - ");
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || i != 1) {
                    sb.append(i);
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
        return sb.toString();
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        if (i == 0) {
            int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return iArr[iArr.length - 1];
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                i2 = (i2 + i3) % this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            return i2;
        }
        int[] iArr2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr2[0];
        int length = iArr2.length;
        for (int i4 = 1; i4 < length; i4++) {
            getParameters getparameters = this.b;
            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = (getparameters.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, iTuitionPaymentFragmentspecialinlinedviewModeldefault1) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i4]) % getparameters.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
