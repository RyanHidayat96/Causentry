package androidx.compose.ui.window;

import android.view.WindowManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Landroidx/compose/ui/window/Api30Impl;", "", "<init>", "()V", "Landroid/view/WindowManager$LayoutParams;", "p0", "", "p1", "", "setFitInsetsSides", "(Landroid/view/WindowManager$LayoutParams;I)V", "setFitInsetsTypes"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Api30Impl {
    public static final Api30Impl INSTANCE = new Api30Impl();

    private Api30Impl() {
    }

    public final void setFitInsetsSides(WindowManager.LayoutParams p0, int p1) {
        p0.setFitInsetsSides(p1);
    }

    public final void setFitInsetsTypes(WindowManager.LayoutParams p0, int p1) {
        p0.setFitInsetsTypes(p1);
    }
}
