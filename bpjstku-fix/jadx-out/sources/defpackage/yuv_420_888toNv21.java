package defpackage;

import android.graphics.Rect;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class yuv_420_888toNv21 extends getArea {
    @Override // defpackage.getArea
    protected final float TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldCropImage shouldcropimage, shouldCropImage shouldcropimage2) {
        if (shouldcropimage.TuitionPaymentFragmentbindingInflater1 <= 0 || shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 0) {
            return 0.0f;
        }
        shouldCropImage shouldcropimageTuitionPaymentFragmentbindingInflater1 = shouldcropimage.TuitionPaymentFragmentbindingInflater1(shouldcropimage2);
        float fPow = (shouldcropimageTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 * 1.0f) / shouldcropimage.TuitionPaymentFragmentbindingInflater1;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f = ((shouldcropimageTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 * 1.0f) / shouldcropimage2.TuitionPaymentFragmentbindingInflater1) + ((shouldcropimageTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 1.0f) / shouldcropimage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return fPow * ((1.0f / f) / f);
    }

    @Override // defpackage.getArea
    public final Rect TuitionPaymentFragmentspecialinlinedviewModeldefault1(shouldCropImage shouldcropimage, shouldCropImage shouldcropimage2) {
        shouldCropImage shouldcropimageTuitionPaymentFragmentbindingInflater1 = shouldcropimage.TuitionPaymentFragmentbindingInflater1(shouldcropimage2);
        Objects.toString(shouldcropimage);
        Objects.toString(shouldcropimageTuitionPaymentFragmentbindingInflater1);
        Objects.toString(shouldcropimage2);
        int i = (shouldcropimageTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 - shouldcropimage2.TuitionPaymentFragmentbindingInflater1) / 2;
        int i2 = (shouldcropimageTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - shouldcropimage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) / 2;
        return new Rect(-i, -i2, shouldcropimageTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 - i, shouldcropimageTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - i2);
    }
}
