package androidx.compose.ui.layout;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0082\u0001\u0003\u0016\u0017\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/WindowInsetsAnimation;", "", "Landroidx/compose/ui/layout/RectRulers;", "getSource", "()Landroidx/compose/ui/layout/RectRulers;", "source", "getTarget", TypedValues.AttributesType.S_TARGET, "", "isVisible", "()Z", "isAnimating", "", "getFraction", "()F", "fraction", "", "getDurationMillis", "()J", "durationMillis", "getAlpha", "alpha", "Landroidx/compose/ui/layout/InnermostAnimationProperties;", "Landroidx/compose/ui/layout/NoWindowInsetsAnimation;", "Landroidx/compose/ui/layout/PlatformWindowInsetsAnimation;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WindowInsetsAnimation {
    float getAlpha();

    long getDurationMillis();

    float getFraction();

    RectRulers getSource();

    RectRulers getTarget();

    boolean isAnimating();

    boolean isVisible();
}
