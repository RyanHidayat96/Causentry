package defpackage;

import android.graphics.Rect;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class RingBufferOnRemoveCallback extends getArea {
    @Override // defpackage.getArea
    protected final float TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldCropImage shouldcropimage, shouldCropImage shouldcropimage2) {
        if (shouldcropimage.TuitionPaymentFragmentbindingInflater1 <= 0 || shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 0) {
            return 0.0f;
        }
        shouldCropImage shouldcropimageTuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldcropimage2);
        float fPow = (shouldcropimageTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 * 1.0f) / shouldcropimage.TuitionPaymentFragmentbindingInflater1;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f = ((shouldcropimage2.TuitionPaymentFragmentbindingInflater1 * 1.0f) / shouldcropimageTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1) * ((shouldcropimage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 1.0f) / shouldcropimageTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return fPow * (((1.0f / f) / f) / f);
    }

    @Override // defpackage.getArea
    public final Rect TuitionPaymentFragmentspecialinlinedviewModeldefault1(shouldCropImage shouldcropimage, shouldCropImage shouldcropimage2) {
        shouldCropImage shouldcropimageTuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldcropimage2);
        Objects.toString(shouldcropimage);
        Objects.toString(shouldcropimageTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Objects.toString(shouldcropimage2);
        int i = (shouldcropimageTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 - shouldcropimage2.TuitionPaymentFragmentbindingInflater1) / 2;
        int i2 = (shouldcropimageTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - shouldcropimage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) / 2;
        return new Rect(-i, -i2, shouldcropimageTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 - i, shouldcropimageTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - i2);
    }
}
