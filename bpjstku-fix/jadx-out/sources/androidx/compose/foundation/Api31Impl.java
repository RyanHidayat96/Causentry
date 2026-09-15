package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/Api31Impl;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "Landroid/widget/EdgeEffect;", "create", "(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;", "", "getDistance", "(Landroid/widget/EdgeEffect;)F", "p2", "onPullDistance", "(Landroid/widget/EdgeEffect;FF)F"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Api31Impl {
    public static final Api31Impl INSTANCE = new Api31Impl();

    private Api31Impl() {
    }

    public final EdgeEffect create(Context p0, AttributeSet p1) {
        try {
            return new EdgeEffect(p0, p1);
        } catch (Throwable unused) {
            return new EdgeEffect(p0);
        }
    }

    public final float onPullDistance(EdgeEffect p0, float p1, float p2) {
        try {
            return p0.onPullDistance(p1, p2);
        } catch (Throwable unused) {
            p0.onPull(p1, p2);
            return 0.0f;
        }
    }

    public final float getDistance(EdgeEffect p0) {
        try {
            return p0.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
