package androidx.compose.animation;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/animation/ExitTransitionImpl;", "Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/TransitionData;", "p0", "<init>", "(Landroidx/compose/animation/TransitionData;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/compose/animation/TransitionData;", "getData$animation_release", "()Landroidx/compose/animation/TransitionData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ExitTransitionImpl extends ExitTransition {
    private final TransitionData data;

    public ExitTransitionImpl(TransitionData transitionData) {
        super(null);
        this.data = transitionData;
    }

    @Override // androidx.compose.animation.ExitTransition
    /* JADX INFO: renamed from: getData$animation_release, reason: from getter */
    public final TransitionData getData() {
        return this.data;
    }
}
