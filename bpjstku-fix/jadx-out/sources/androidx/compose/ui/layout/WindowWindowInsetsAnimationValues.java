package androidx.compose.ui.layout;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00188W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010%\u001a\u00020$8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020$8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\"\u0010,\u001a\u00020+8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\"\u00100\u001a\u00020+8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010-\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\"\u00103\u001a\u00020+8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u001eR\"\u00106\u001a\u00020+8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010-\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001e"}, d2 = {"Landroidx/compose/ui/layout/WindowWindowInsetsAnimationValues;", "Landroidx/compose/ui/layout/PlatformWindowInsetsAnimation;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "isVisible$delegate", "Landroidx/compose/runtime/MutableState;", "isVisible", "()Z", "setVisible", "(Z)V", "isAnimating$delegate", "isAnimating", "setAnimating", "", "fraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getFraction", "()F", "setFraction", "(F)V", "fraction", "", "durationMillis$delegate", "Landroidx/compose/runtime/MutableLongState;", "getDurationMillis", "()J", "setDurationMillis", "(J)V", "durationMillis", "alpha$delegate", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/layout/RectRulers;", "source", "Landroidx/compose/ui/layout/RectRulers;", "getSource", "()Landroidx/compose/ui/layout/RectRulers;", TypedValues.AttributesType.S_TARGET, "getTarget", "Landroidx/compose/ui/layout/ValueInsets;", "current", "J", "getCurrent-hdzbrEE", "setCurrent-Ynlvx88", "maximum", "getMaximum-hdzbrEE", "setMaximum-Ynlvx88", "sourceValueInsets", "getSourceValueInsets-hdzbrEE", "setSourceValueInsets-Ynlvx88", "targetValueInsets", "getTargetValueInsets-hdzbrEE", "setTargetValueInsets-Ynlvx88"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WindowWindowInsetsAnimationValues implements PlatformWindowInsetsAnimation {
    public static final int $stable = 8;
    private long current;
    private long maximum;
    private final RectRulers source;
    private long sourceValueInsets;
    private final RectRulers target;
    private long targetValueInsets;

    /* JADX INFO: renamed from: isVisible$delegate, reason: from kotlin metadata */
    private final MutableState isVisible = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: isAnimating$delegate, reason: from kotlin metadata */
    private final MutableState isAnimating = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: fraction$delegate, reason: from kotlin metadata */
    private final MutableFloatState fraction = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* JADX INFO: renamed from: durationMillis$delegate, reason: from kotlin metadata */
    private final MutableLongState durationMillis = SnapshotLongStateKt.mutableLongStateOf(0);

    /* JADX INFO: renamed from: alpha$delegate, reason: from kotlin metadata */
    private final MutableFloatState alpha = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    public WindowWindowInsetsAnimationValues(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" source");
        this.source = RectRulersKt.RectRulers(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" target");
        this.target = RectRulersKt.RectRulers(sb2.toString());
        this.current = ValueInsets_androidKt.getUnsetValueInsets();
        this.maximum = ValueInsets_androidKt.getUnsetValueInsets();
        this.sourceValueInsets = ValueInsets_androidKt.getUnsetValueInsets();
        this.targetValueInsets = ValueInsets_androidKt.getUnsetValueInsets();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final boolean isVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    public final void setVisible(boolean z) {
        this.isVisible.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final boolean isAnimating() {
        return ((Boolean) this.isAnimating.getValue()).booleanValue();
    }

    public final void setAnimating(boolean z) {
        this.isAnimating.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final float getFraction() {
        return this.fraction.getFloatValue();
    }

    public final void setFraction(float f) {
        this.fraction.setFloatValue(f);
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final long getDurationMillis() {
        return this.durationMillis.getLongValue();
    }

    public final void setDurationMillis(long j) {
        this.durationMillis.setLongValue(j);
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final float getAlpha() {
        return this.alpha.getFloatValue();
    }

    public final void setAlpha(float f) {
        this.alpha.setFloatValue(f);
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final RectRulers getSource() {
        return this.source;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final RectRulers getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: getCurrent-hdzbrEE, reason: not valid java name and from getter */
    public final long getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: setCurrent-Ynlvx88, reason: not valid java name */
    public final void m5761setCurrentYnlvx88(long j) {
        this.current = j;
    }

    /* JADX INFO: renamed from: getMaximum-hdzbrEE, reason: not valid java name and from getter */
    public final long getMaximum() {
        return this.maximum;
    }

    /* JADX INFO: renamed from: setMaximum-Ynlvx88, reason: not valid java name */
    public final void m5762setMaximumYnlvx88(long j) {
        this.maximum = j;
    }

    /* JADX INFO: renamed from: getSourceValueInsets-hdzbrEE, reason: not valid java name and from getter */
    public final long getSourceValueInsets() {
        return this.sourceValueInsets;
    }

    /* JADX INFO: renamed from: setSourceValueInsets-Ynlvx88, reason: not valid java name */
    public final void m5763setSourceValueInsetsYnlvx88(long j) {
        this.sourceValueInsets = j;
    }

    /* JADX INFO: renamed from: getTargetValueInsets-hdzbrEE, reason: not valid java name and from getter */
    public final long getTargetValueInsets() {
        return this.targetValueInsets;
    }

    /* JADX INFO: renamed from: setTargetValueInsets-Ynlvx88, reason: not valid java name */
    public final void m5764setTargetValueInsetsYnlvx88(long j) {
        this.targetValueInsets = j;
    }
}
