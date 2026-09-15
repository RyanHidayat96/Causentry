package androidx.FastestIyy;

import android.os.Looper;
import androidx.FastestIyy;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FastestIyy f292a = new FastestIyy();

    public static void a() {
        while (!FastestIyy.f.get()) {
            if (Looper.getMainLooper().isCurrentThread()) {
                throw new RuntimeException("Cannot be called on main thread");
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
        }
    }
}
