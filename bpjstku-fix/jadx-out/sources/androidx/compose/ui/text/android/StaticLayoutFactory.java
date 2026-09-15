package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Já\u0001\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "<init>", "()V", "", "p0", "Landroid/text/TextPaint;", "p1", "", "p2", "p3", "p4", "Landroid/text/TextDirectionHeuristic;", "p5", "Landroid/text/Layout$Alignment;", "p6", "p7", "Landroid/text/TextUtils$TruncateAt;", "p8", "p9", "", "p10", "p11", "p12", "", "p13", "p14", "p15", "p16", "p17", "p18", "", "p19", "p20", "Landroid/text/StaticLayout;", "create", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;IIILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)Landroid/text/StaticLayout;", "isFallbackLineSpacingEnabled", "(Landroid/text/StaticLayout;Z)Z", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "delegate", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StaticLayoutFactory {
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();
    private static final StaticLayoutFactoryImpl delegate = new StaticLayoutFactory23();
    public static final int $stable = 8;

    private StaticLayoutFactory() {
    }

    public final StaticLayout create(CharSequence p0, TextPaint p1, int p2, int p3, int p4, TextDirectionHeuristic p5, Layout.Alignment p6, int p7, TextUtils.TruncateAt p8, int p9, float p10, float p11, int p12, boolean p13, boolean p14, int p15, int p16, int p17, int p18, int[] p19, int[] p20) {
        return delegate.create(new StaticLayoutParams(p0, p3, p4, p1, p2, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20));
    }

    public final boolean isFallbackLineSpacingEnabled(StaticLayout p0, boolean p1) {
        return delegate.isFallbackLineSpacingEnabled(p0, p1);
    }
}
