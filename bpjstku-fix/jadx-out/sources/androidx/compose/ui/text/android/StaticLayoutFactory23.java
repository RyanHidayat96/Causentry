package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory23;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "<init>", "()V", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "p0", "Landroid/text/StaticLayout;", "create", "(Landroidx/compose/ui/text/android/StaticLayoutParams;)Landroid/text/StaticLayout;", "", "p1", "isFallbackLineSpacingEnabled", "(Landroid/text/StaticLayout;Z)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public final StaticLayout create(StaticLayoutParams p0) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(p0.getText(), p0.getStart(), p0.getEnd(), p0.getPaint(), p0.getWidth());
        builderObtain.setTextDirection(p0.getTextDir());
        builderObtain.setAlignment(p0.getAlignment());
        builderObtain.setMaxLines(p0.getMaxLines());
        builderObtain.setEllipsize(p0.getEllipsize());
        builderObtain.setEllipsizedWidth(p0.getEllipsizedWidth());
        builderObtain.setLineSpacing(p0.getLineSpacingExtra(), p0.getLineSpacingMultiplier());
        builderObtain.setIncludePad(p0.getIncludePadding());
        builderObtain.setBreakStrategy(p0.getBreakStrategy());
        builderObtain.setHyphenationFrequency(p0.getHyphenationFrequency());
        builderObtain.setIndents(p0.getLeftIndents(), p0.getRightIndents());
        if (Build.VERSION.SDK_INT >= 26) {
            StaticLayoutFactory26.setJustificationMode(builderObtain, p0.getJustificationMode());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            StaticLayoutFactory28.setUseLineSpacingFromFallbacks(builderObtain, p0.getUseFallbackLineSpacing());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            StaticLayoutFactory33.setLineBreakConfig(builderObtain, p0.getLineBreakStyle(), p0.getLineBreakWordStyle());
        }
        if (Build.VERSION.SDK_INT >= 35) {
            StaticLayoutFactory35.disableUseBoundsForWidth(builderObtain);
        }
        return builderObtain.build();
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public final boolean isFallbackLineSpacingEnabled(StaticLayout p0, boolean p1) {
        if (Build.VERSION.SDK_INT >= 33) {
            return StaticLayoutFactory33.isFallbackLineSpacingEnabled(p0);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return p1;
        }
        return false;
    }
}
