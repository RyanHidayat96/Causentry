package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b1\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048!X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b"}, d2 = {"Landroidx/compose/animation/TransitionEffect;", "", "<init>", "()V", "Landroidx/compose/animation/TransitionEffectKey;", "getKey$animation_release", "()Landroidx/compose/animation/TransitionEffectKey;", "key", "Landroidx/compose/animation/ContentScaleTransitionEffect;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TransitionEffect {
    public static final int $stable = 0;

    public abstract TransitionEffectKey<?> getKey$animation_release();

    private TransitionEffect() {
    }

    public /* synthetic */ TransitionEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
