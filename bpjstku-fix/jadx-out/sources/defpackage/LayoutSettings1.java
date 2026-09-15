package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class LayoutSettings1<T> implements ImageReaderFormatRecommender<T> {
    private final getOffsetY<T> TuitionPaymentFragmentbindingInflater1;
    private final ImageReaderFormatRecommender<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public LayoutSettings1(getOffsetY<T> getoffsety, ImageReaderFormatRecommender<T> imageReaderFormatRecommender) {
        Intrinsics.checkNotNullParameter(getoffsety, "");
        Intrinsics.checkNotNullParameter(imageReaderFormatRecommender, "");
        this.TuitionPaymentFragmentbindingInflater1 = getoffsety;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageReaderFormatRecommender;
    }

    @Override // defpackage.ImageReaderFormatRecommender
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t) {
        Intrinsics.checkNotNullParameter(t, "");
        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(t);
        if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return null;
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }
}
