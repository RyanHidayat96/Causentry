package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"LinAnchoredZoomMode;", "", "<init>", "()V", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "()Landroid/os/Handler;"}, k = 1, mv = {2, 3, 0})
final class inAnchoredZoomMode {
    public static final inAnchoredZoomMode INSTANCE = new inAnchoredZoomMode();
    private static final Handler b = new Handler(Looper.getMainLooper());

    private inAnchoredZoomMode() {
    }

    public static Handler b() {
        return b;
    }
}
