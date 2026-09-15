package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class getCustomOrderedResolutions {
    private final List<ImageOutputConfig> TuitionPaymentFragmentbindingInflater1;
    private final ImageInputConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public getCustomOrderedResolutions(ImageInputConfigBuilder imageInputConfigBuilder) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageInputConfigBuilder;
        ArrayList arrayList = new ArrayList();
        this.TuitionPaymentFragmentbindingInflater1 = arrayList;
        arrayList.add(new ImageOutputConfig(imageInputConfigBuilder, new int[]{1}));
    }

    private ImageOutputConfig TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        if (i >= this.TuitionPaymentFragmentbindingInflater1.size()) {
            List<ImageOutputConfig> list = this.TuitionPaymentFragmentbindingInflater1;
            ImageOutputConfig imageOutputConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = list.get(list.size() - 1);
            for (int size = this.TuitionPaymentFragmentbindingInflater1.size(); size <= i; size++) {
                ImageInputConfigBuilder imageInputConfigBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                imageOutputConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageOutputConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ImageOutputConfig(imageInputConfigBuilder, new int[]{1, imageInputConfigBuilder.g[(size - 1) + imageInputConfigBuilder.asInterface]}));
                this.TuitionPaymentFragmentbindingInflater1.add(imageOutputConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return this.TuitionPaymentFragmentbindingInflater1.get(i);
    }

    public final void b(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ImageOutputConfig imageOutputConfigTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArr3 = new ImageOutputConfig(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, iArr2).TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 1).TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageOutputConfigTuitionPaymentFragmentspecialinlinedviewModeldefault1)[1].b;
        int length2 = i - iArr3.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArr3, 0, iArr, length + length2, iArr3.length);
    }
}
