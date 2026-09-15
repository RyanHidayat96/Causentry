package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory33;", "", "<init>", "()V", "Landroid/text/StaticLayout;", "p0", "", "isFallbackLineSpacingEnabled", "(Landroid/text/StaticLayout;)Z", "Landroid/text/StaticLayout$Builder;", "", "p1", "p2", "", "setLineBreakConfig", "(Landroid/text/StaticLayout$Builder;II)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StaticLayoutFactory33 {
    public static final StaticLayoutFactory33 INSTANCE = new StaticLayoutFactory33();

    private StaticLayoutFactory33() {
    }

    @JvmStatic
    public static final boolean isFallbackLineSpacingEnabled(StaticLayout p0) {
        return p0.isFallbackLineSpacingEnabled();
    }

    @JvmStatic
    public static final void setLineBreakConfig(StaticLayout.Builder p0, int p1, int p2) {
        p0.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(p1).setLineBreakWordStyle(p2).build());
    }
}
