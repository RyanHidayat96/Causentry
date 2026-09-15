package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes6.dex */
public final class SizeUtil extends getArea {
    @Override // defpackage.getArea
    protected final float TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldCropImage shouldcropimage, shouldCropImage shouldcropimage2) {
        if (shouldcropimage.TuitionPaymentFragmentbindingInflater1 <= 0 || shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 0) {
            return 0.0f;
        }
        float f = (shouldcropimage.TuitionPaymentFragmentbindingInflater1 * 1.0f) / shouldcropimage2.TuitionPaymentFragmentbindingInflater1;
        if (f < 1.0f) {
            f = 1.0f / f;
        }
        float f2 = (shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 1.0f) / shouldcropimage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (f2 < 1.0f) {
            f2 = 1.0f / f2;
        }
        float f3 = (1.0f / f) / f2;
        float f4 = ((shouldcropimage.TuitionPaymentFragmentbindingInflater1 * 1.0f) / shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2) / ((shouldcropimage2.TuitionPaymentFragmentbindingInflater1 * 1.0f) / shouldcropimage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (f4 < 1.0f) {
            f4 = 1.0f / f4;
        }
        return f3 * (((1.0f / f4) / f4) / f4);
    }

    @Override // defpackage.getArea
    public final Rect TuitionPaymentFragmentspecialinlinedviewModeldefault1(shouldCropImage shouldcropimage, shouldCropImage shouldcropimage2) {
        return new Rect(0, 0, shouldcropimage2.TuitionPaymentFragmentbindingInflater1, shouldcropimage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }
}
