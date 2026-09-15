package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/text/android/style/BaselineShiftSpan;", "Landroid/text/style/MetricAffectingSpan;", "", "p0", "<init>", "(F)V", "Landroid/text/TextPaint;", "", "updateMeasureState", "(Landroid/text/TextPaint;)V", "updateDrawState", "multiplier", "F", "getMultiplier", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaselineShiftSpan extends MetricAffectingSpan {
    public static final int $stable = 8;
    private final float multiplier;

    public BaselineShiftSpan(float f) {
        this.multiplier = f;
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint p0) {
        p0.baselineShift += (int) Math.ceil(p0.ascent() * this.multiplier);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint p0) {
        p0.baselineShift += (int) Math.ceil(p0.ascent() * this.multiplier);
    }
}
