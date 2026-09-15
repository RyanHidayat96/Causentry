package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExperimentalGetImage<T extends Drawable> implements Resource<T>, requireLensFacing {
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ExperimentalGetImage(T t) {
        if (t == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = t;
    }

    @Override // defpackage.requireLensFacing
    public void b() {
        T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof isAutoCancelEnabled) {
            ((isAutoCancelEnabled) t).TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1() {
        Drawable.ConstantState constantState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getConstantState();
        if (constantState == null) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return constantState.newDrawable();
    }
}
