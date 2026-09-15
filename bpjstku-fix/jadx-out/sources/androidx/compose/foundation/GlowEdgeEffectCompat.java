package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fR\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/GlowEdgeEffectCompat;", "Landroid/widget/EdgeEffect;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "", "onAbsorb", "(I)V", "", "onPull", "(F)V", "p1", "(FF)V", "onRelease", "()V", "releaseWithOppositeDelta", "oppositeReleaseDelta", "F", "oppositeReleaseDeltaThreshold"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class GlowEdgeEffectCompat extends EdgeEffect {
    private float oppositeReleaseDelta;
    private final float oppositeReleaseDeltaThreshold;

    public GlowEdgeEffectCompat(Context context) {
        super(context);
        this.oppositeReleaseDeltaThreshold = AndroidDensity_androidKt.Density(context).mo694toPx0680j_4(Dp.m6935constructorimpl(1.0f));
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float p0, float p1) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(p0, p1);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float p0) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(p0);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.oppositeReleaseDelta = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int p0) {
        this.oppositeReleaseDelta = 0.0f;
        super.onAbsorb(p0);
    }

    public final void releaseWithOppositeDelta(float p0) {
        float f = this.oppositeReleaseDelta + p0;
        this.oppositeReleaseDelta = f;
        if (Math.abs(f) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }
}
