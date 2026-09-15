package androidx.compose.ui.layout;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010"}, d2 = {"Landroidx/compose/ui/layout/NoWindowInsetsAnimation;", "Landroidx/compose/ui/layout/WindowInsetsAnimation;", "<init>", "()V", "Landroidx/compose/ui/layout/RectRulers;", "getSource", "()Landroidx/compose/ui/layout/RectRulers;", "source", "getTarget", TypedValues.AttributesType.S_TARGET, "", "isVisible", "()Z", "isAnimating", "", "getFraction", "()F", "fraction", "", "getDurationMillis", "()J", "durationMillis", "getAlpha", "alpha"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoWindowInsetsAnimation implements WindowInsetsAnimation {
    public static final int $stable = 0;
    public static final NoWindowInsetsAnimation INSTANCE = new NoWindowInsetsAnimation();

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

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final boolean isAnimating() {
        return false;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final boolean isVisible() {
        return true;
    }

    private NoWindowInsetsAnimation() {
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final RectRulers getSource() {
        return WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public final RectRulers getTarget() {
        return WindowInsetsRulersKt.getNeverProvidedRectRulers();
    }
}
