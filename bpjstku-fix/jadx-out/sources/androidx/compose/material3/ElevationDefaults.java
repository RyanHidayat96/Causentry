package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t"}, d2 = {"Landroidx/compose/material3/ElevationDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/interaction/Interaction;", "p0", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/Dp;", "incomingAnimationSpecForInteraction", "(Landroidx/compose/foundation/interaction/Interaction;)Landroidx/compose/animation/core/AnimationSpec;", "outgoingAnimationSpecForInteraction"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ElevationDefaults {
    public static final ElevationDefaults INSTANCE = new ElevationDefaults();

    private ElevationDefaults() {
    }

    public final AnimationSpec<Dp> incomingAnimationSpecForInteraction(Interaction p0) {
        if ((p0 instanceof PressInteraction.Press) || (p0 instanceof DragInteraction.Start) || (p0 instanceof HoverInteraction.Enter) || (p0 instanceof FocusInteraction.Focus)) {
            return ElevationKt.DefaultIncomingSpec;
        }
        return null;
    }

    public final AnimationSpec<Dp> outgoingAnimationSpecForInteraction(Interaction p0) {
        if (!(p0 instanceof PressInteraction.Press) && !(p0 instanceof DragInteraction.Start)) {
            if (p0 instanceof HoverInteraction.Enter) {
                return ElevationKt.HoveredOutgoingSpec;
            }
            if (p0 instanceof FocusInteraction.Focus) {
                return ElevationKt.DefaultOutgoingSpec;
            }
            return null;
        }
        return ElevationKt.DefaultOutgoingSpec;
    }
}
