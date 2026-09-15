package androidx.compose.foundation.text.handwriting;

import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003"}, d2 = {"", "isStylusHandwritingSupported", "Z", "()Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StylusHandwriting_androidKt {
    private static final boolean isStylusHandwritingSupported;

    public static final boolean isStylusHandwritingSupported() {
        return isStylusHandwritingSupported;
    }

    static {
        isStylusHandwritingSupported = Build.VERSION.SDK_INT >= 34;
    }
}
