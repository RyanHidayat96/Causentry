package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class lowerQualityOrHigherThan implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final WeakReference<ImageView> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public getSupportedQualities TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final FileOutputOptionsFileOutputOptionsInternal b;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        throw null;
    }
}
