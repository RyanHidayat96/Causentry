package androidx.view;

import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/activity/EdgeToEdgeBase;", "Landroidx/activity/EdgeToEdgeImpl;", "<init>", "()V", "Landroid/view/Window;", "p0", "", "adjustLayoutInDisplayCutoutMode", "(Landroid/view/Window;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
abstract class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override // androidx.view.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(Window p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }
}
