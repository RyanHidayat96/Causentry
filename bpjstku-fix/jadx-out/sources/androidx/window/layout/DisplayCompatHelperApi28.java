package androidx.window.layout;

import android.view.DisplayCutout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\b"}, d2 = {"Landroidx/window/layout/DisplayCompatHelperApi28;", "", "<init>", "()V", "Landroid/view/DisplayCutout;", "p0", "", "safeInsetBottom", "(Landroid/view/DisplayCutout;)I", "safeInsetLeft", "safeInsetRight", "safeInsetTop"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DisplayCompatHelperApi28 {
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetLeft(DisplayCutout p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.getSafeInsetLeft();
    }

    public final int safeInsetTop(DisplayCutout p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.getSafeInsetTop();
    }

    public final int safeInsetRight(DisplayCutout p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.getSafeInsetRight();
    }

    public final int safeInsetBottom(DisplayCutout p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.getSafeInsetBottom();
    }
}
