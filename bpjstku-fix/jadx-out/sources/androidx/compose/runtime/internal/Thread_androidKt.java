package androidx.compose.runtime.internal;

import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"", "MainThreadId", "J", "getMainThreadId", "()J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Thread_androidKt {
    private static final long MainThreadId;

    public static final long getMainThreadId() {
        return MainThreadId;
    }

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        MainThreadId = id2;
    }
}
