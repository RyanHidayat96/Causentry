package defpackage;

/* JADX INFO: loaded from: classes5.dex */
final class ImageOutputConfig {
    private final ImageInputConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final int[] b;

    ImageOutputConfig(ImageInputConfigBuilder imageInputConfigBuilder, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageInputConfigBuilder;
        int length = iArr.length;
        int i = 1;
        if (length > 1 && iArr[0] == 0) {
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.b = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        this.b = iArr;
    }

    final ImageOutputConfig b(ImageOutputConfig imageOutputConfig) {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(imageOutputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        int[] iArr = this.b;
        if (iArr[0] == 0) {
            return imageOutputConfig;
        }
        int[] iArr2 = imageOutputConfig.b;
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
            iArr3[i] = ImageInputConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr2[i - length], iArr[i]);
        }
        return new ImageOutputConfig(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iArr3);
    }

    final ImageOutputConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageOutputConfig imageOutputConfig) {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(imageOutputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        int[] iArr = this.b;
        if (iArr[0] != 0) {
            int[] iArr2 = imageOutputConfig.b;
            if (iArr2[0] != 0) {
                int length = iArr.length;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        iArr3[i4] = ImageInputConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr3[i4], this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(i2, iArr2[i3]));
                    }
                }
                return new ImageOutputConfig(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iArr3);
            }
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll;
    }

    final ImageOutputConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        if (i == 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll;
        }
        if (i == 1) {
            return this;
        }
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(this.b[i2], i);
        }
        return new ImageOutputConfig(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iArr);
    }

    final ImageOutputConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 != 0) {
            int length = this.b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(this.b[i3], i2);
            }
            return new ImageOutputConfig(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iArr);
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll;
    }

    final ImageOutputConfig[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageOutputConfig imageOutputConfig) {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(imageOutputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (imageOutputConfig.b[0] == 0) {
            throw new IllegalArgumentException("Divide by 0");
        }
        ImageOutputConfig imageOutputConfigB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll;
        int[] iArr = imageOutputConfig.b;
        int i = iArr[(iArr.length - 1) - (iArr.length - 1)];
        ImageInputConfigBuilder imageInputConfigBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i == 0) {
            throw new ArithmeticException();
        }
        int i2 = imageInputConfigBuilder.g[(imageInputConfigBuilder.INotificationSideChannel - imageInputConfigBuilder.onTransact[i]) - 1];
        ImageOutputConfig imageOutputConfigB2 = this;
        while (true) {
            int[] iArr2 = imageOutputConfigB2.b;
            int length = iArr2.length - 1;
            int[] iArr3 = imageOutputConfig.b;
            if (length < iArr3.length - 1 || iArr2[0] == 0) {
                break;
            }
            int length2 = (iArr2.length - 1) - (iArr3.length - 1);
            int iB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(iArr2[(iArr2.length - 1) - (iArr2.length - 1)], i2);
            ImageOutputConfig imageOutputConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageOutputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(length2, iB);
            imageOutputConfigB = imageOutputConfigB.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(length2, iB));
            imageOutputConfigB2 = imageOutputConfigB2.b(imageOutputConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return new ImageOutputConfig[]{imageOutputConfigB, imageOutputConfigB2};
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.b.length - 1) * 8);
        for (int length = this.b.length - 1; length >= 0; length--) {
            int[] iArr = this.b;
            int i = iArr[(iArr.length - 1) - length];
            if (i != 0) {
                if (i < 0) {
                    sb.append(" - ");
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || i != 1) {
                    ImageInputConfigBuilder imageInputConfigBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (i == 0) {
                        throw new IllegalArgumentException();
                    }
                    int i2 = imageInputConfigBuilder.onTransact[i];
                    if (i2 == 0) {
                        sb.append('1');
                    } else if (i2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i2);
                    }
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

    final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        if (i == 0) {
            int[] iArr = this.b;
            return iArr[iArr.length - 1];
        }
        if (i == 1) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            for (int i2 : this.b) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ImageInputConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, i2);
            }
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int[] iArr2 = this.b;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr2[0];
        int length = iArr2.length;
        for (int i3 = 1; i3 < length; i3++) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ImageInputConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(i, iTuitionPaymentFragmentspecialinlinedviewModeldefault2), this.b[i3]);
        }
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
