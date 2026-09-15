package defpackage;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* JADX INFO: loaded from: classes6.dex */
public final class getDefaultResolution {
    private final ImageInputConfigBuilder b;

    public getDefaultResolution(ImageInputConfigBuilder imageInputConfigBuilder) {
        this.b = imageInputConfigBuilder;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int[] iArr, int i) throws ReedSolomonException {
        ImageOutputConfig imageOutputConfig = new ImageOutputConfig(this.b, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            ImageInputConfigBuilder imageInputConfigBuilder = this.b;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageOutputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageInputConfigBuilder.g[imageInputConfigBuilder.asInterface + i2]);
            iArr2[(i - 1) - i2] = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        ImageOutputConfig[] imageOutputConfigArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.TuitionPaymentFragmentbindingInflater1(i, 1), new ImageOutputConfig(this.b, iArr2), i);
        ImageOutputConfig imageOutputConfig2 = imageOutputConfigArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
        ImageOutputConfig imageOutputConfig3 = imageOutputConfigArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[1];
        int[] iArrB = b(imageOutputConfig2);
        int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageOutputConfig3, iArrB);
        for (int i3 = 0; i3 < iArrB.length; i3++) {
            int length = iArr.length - 1;
            ImageInputConfigBuilder imageInputConfigBuilder2 = this.b;
            int i4 = iArrB[i3];
            if (i4 == 0) {
                throw new IllegalArgumentException();
            }
            int i5 = length - imageInputConfigBuilder2.onTransact[i4];
            if (i5 < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[i5] = ImageInputConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr[i5], iArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i3]);
        }
    }

    private int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageOutputConfig imageOutputConfig, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            ImageInputConfigBuilder imageInputConfigBuilder = this.b;
            int i2 = iArr[i];
            if (i2 == 0) {
                throw new ArithmeticException();
            }
            int i3 = imageInputConfigBuilder.g[(imageInputConfigBuilder.INotificationSideChannel - imageInputConfigBuilder.onTransact[i2]) - 1];
            int iB = 1;
            for (int i4 = 0; i4 < length; i4++) {
                if (i != i4) {
                    int iB2 = this.b.b(iArr[i4], i3);
                    iB = this.b.b(iB, (iB2 & 1) == 0 ? iB2 | 1 : iB2 & (-2));
                }
            }
            ImageInputConfigBuilder imageInputConfigBuilder2 = this.b;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageOutputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i3);
            ImageInputConfigBuilder imageInputConfigBuilder3 = this.b;
            if (iB != 0) {
                iArr2[i] = imageInputConfigBuilder2.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, imageInputConfigBuilder3.g[(imageInputConfigBuilder3.INotificationSideChannel - imageInputConfigBuilder3.onTransact[iB]) - 1]);
                if (this.b.asInterface != 0) {
                    iArr2[i] = this.b.b(iArr2[i], i3);
                }
            } else {
                throw new ArithmeticException();
            }
        }
        return iArr2;
    }

    private int[] b(ImageOutputConfig imageOutputConfig) throws ReedSolomonException {
        int length = imageOutputConfig.b.length - 1;
        if (length != 1) {
            int[] iArr = new int[length];
            int i = 0;
            for (int i2 = 1; i2 < this.b.INotificationSideChannel && i < length; i2++) {
                if (imageOutputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2) == 0) {
                    ImageInputConfigBuilder imageInputConfigBuilder = this.b;
                    if (i2 != 0) {
                        iArr[i] = imageInputConfigBuilder.g[(imageInputConfigBuilder.INotificationSideChannel - imageInputConfigBuilder.onTransact[i2]) - 1];
                        i++;
                    } else {
                        throw new ArithmeticException();
                    }
                }
            }
            if (i == length) {
                return iArr;
            }
            throw new ReedSolomonException("Error locator degree does not match number of roots");
        }
        int[] iArr2 = imageOutputConfig.b;
        return new int[]{iArr2[iArr2.length - 2]};
    }

    private ImageOutputConfig[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageOutputConfig imageOutputConfig, ImageOutputConfig imageOutputConfig2, int i) throws ReedSolomonException {
        ImageOutputConfig imageOutputConfig3 = imageOutputConfig;
        ImageOutputConfig imageOutputConfigB = imageOutputConfig2;
        if (imageOutputConfig3.b.length - 1 >= imageOutputConfigB.b.length - 1) {
            imageOutputConfigB = imageOutputConfig3;
            imageOutputConfig3 = imageOutputConfigB;
        }
        ImageOutputConfig imageOutputConfig4 = this.b.cancelAll;
        ImageOutputConfig imageOutputConfig5 = this.b.notify;
        while (imageOutputConfig3.b.length - 1 >= i / 2) {
            if (imageOutputConfig3.b[0] == 0) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            ImageOutputConfig imageOutputConfigB2 = this.b.cancelAll;
            int length = imageOutputConfig3.b.length - 1;
            int[] iArr = imageOutputConfig3.b;
            int i2 = iArr[(iArr.length - 1) - length];
            ImageInputConfigBuilder imageInputConfigBuilder = this.b;
            if (i2 == 0) {
                throw new ArithmeticException();
            }
            int i3 = imageInputConfigBuilder.g[(imageInputConfigBuilder.INotificationSideChannel - imageInputConfigBuilder.onTransact[i2]) - 1];
            while (imageOutputConfigB.b.length - 1 >= imageOutputConfig3.b.length - 1 && imageOutputConfigB.b[0] != 0) {
                int length2 = (imageOutputConfigB.b.length - 1) - (imageOutputConfig3.b.length - 1);
                ImageInputConfigBuilder imageInputConfigBuilder2 = this.b;
                int length3 = imageOutputConfigB.b.length - 1;
                int[] iArr2 = imageOutputConfigB.b;
                int iB = imageInputConfigBuilder2.b(iArr2[(iArr2.length - 1) - length3], i3);
                imageOutputConfigB2 = imageOutputConfigB2.b(this.b.TuitionPaymentFragmentbindingInflater1(length2, iB));
                imageOutputConfigB = imageOutputConfigB.b(imageOutputConfig3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(length2, iB));
            }
            ImageOutputConfig imageOutputConfigB3 = imageOutputConfigB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageOutputConfig5).b(imageOutputConfig4);
            if (imageOutputConfigB.b.length - 1 >= imageOutputConfig3.b.length - 1) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            ImageOutputConfig imageOutputConfig6 = imageOutputConfigB;
            imageOutputConfigB = imageOutputConfig3;
            imageOutputConfig3 = imageOutputConfig6;
            ImageOutputConfig imageOutputConfig7 = imageOutputConfig5;
            imageOutputConfig5 = imageOutputConfigB3;
            imageOutputConfig4 = imageOutputConfig7;
        }
        int[] iArr3 = imageOutputConfig5.b;
        int i4 = iArr3[iArr3.length - 1];
        if (i4 == 0) {
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
        ImageInputConfigBuilder imageInputConfigBuilder3 = this.b;
        if (i4 == 0) {
            throw new ArithmeticException();
        }
        int i5 = imageInputConfigBuilder3.g[(imageInputConfigBuilder3.INotificationSideChannel - imageInputConfigBuilder3.onTransact[i4]) - 1];
        return new ImageOutputConfig[]{imageOutputConfig5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5), imageOutputConfig3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5)};
    }
}
