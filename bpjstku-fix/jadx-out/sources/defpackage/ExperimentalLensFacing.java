package defpackage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes3.dex */
final class ExperimentalLensFacing extends ExperimentalGetImage<Drawable> {
    @Override // com.bumptech.glide.load.engine.Resource
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    static Resource<Drawable> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Drawable drawable) {
        if (drawable != null) {
            return new ExperimentalLensFacing(drawable);
        }
        return null;
    }

    private ExperimentalLensFacing(Drawable drawable) {
        super(drawable);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class<Drawable> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return Math.max(1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getIntrinsicWidth() * this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getIntrinsicHeight() * 4);
    }
}
