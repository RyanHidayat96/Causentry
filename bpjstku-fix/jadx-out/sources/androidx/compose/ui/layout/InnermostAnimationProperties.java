package androidx.compose.ui.layout;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001d"}, d2 = {"Landroidx/compose/ui/layout/InnermostAnimationProperties;", "Landroidx/compose/ui/layout/WindowInsetsAnimation;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "p0", "", "Landroidx/compose/ui/layout/WindowInsetsRulers;", "p1", "<init>", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;[Landroidx/compose/ui/layout/WindowInsetsRulers;)V", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "rulers", "[Landroidx/compose/ui/layout/WindowInsetsRulers;", "getRulers", "()[Landroidx/compose/ui/layout/WindowInsetsRulers;", "Landroidx/compose/ui/layout/RectRulers;", "getSource", "()Landroidx/compose/ui/layout/RectRulers;", "source", "getTarget", TypedValues.AttributesType.S_TARGET, "", "isVisible", "()Z", "isAnimating", "", "getFraction", "()F", "fraction", "", "getDurationMillis", "()J", "durationMillis", "getAlpha", "alpha"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class InnermostAnimationProperties implements WindowInsetsAnimation {
    private final WindowInsetsRulers[] rulers;
    private final Placeable.PlacementScope scope;

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final float getAlpha() {
        return 1.0f;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final long getDurationMillis() {
        return 0L;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final float getFraction() {
        return 0.0f;
    }

    public InnermostAnimationProperties(Placeable.PlacementScope placementScope, WindowInsetsRulers[] windowInsetsRulersArr) {
        this.scope = placementScope;
        this.rulers = windowInsetsRulersArr;
    }

    public final Placeable.PlacementScope getScope() {
        return this.scope;
    }

    public final WindowInsetsRulers[] getRulers() {
        return this.rulers;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final RectRulers getSource() {
        return WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final RectRulers getTarget() {
        return WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final boolean isVisible() {
        for (WindowInsetsRulers windowInsetsRulers : this.rulers) {
            if (windowInsetsRulers.getAnimation(this.scope).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final boolean isAnimating() {
        for (WindowInsetsRulers windowInsetsRulers : this.rulers) {
            if (windowInsetsRulers.getAnimation(this.scope).isAnimating()) {
                return true;
            }
        }
        return false;
    }
}
